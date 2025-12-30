package org.telegram.ui.Components.Reactions;

import android.graphics.Paint;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.StatisticActivity;

public abstract class ReactionsUtils {
    public static boolean compare(TLRPC.Reaction reaction, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && visibleReaction.documentId == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, visibleReaction.emojicon)) {
            return true;
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
            return false;
        }
        long j = visibleReaction.documentId;
        return j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j;
    }

    public static boolean compare(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static TLRPC.Reaction toTLReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (visibleReaction.emojicon != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = visibleReaction.emojicon;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = visibleReaction.documentId;
        return tL_reactionCustomEmoji;
    }

    public static CharSequence reactionToCharSequence(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
            return spannableStringBuilder;
        }
        return "";
    }

    public static void applyForStoryViews(org.telegram.tgnet.TLRPC.Reaction r5, org.telegram.tgnet.TLRPC.Reaction r6, org.telegram.tgnet.tl.TL_stories.StoryViews r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsUtils.applyForStoryViews(org.telegram.tgnet.TLRPC$Reaction, org.telegram.tgnet.TLRPC$Reaction, org.telegram.tgnet.tl.TL_stories$StoryViews):void");
    }

    public static void showLimitReachedDialogForReactions(final long j, int i, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        final BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || tL_premium_boostsStatus == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getContext(), 21, UserConfig.selectedAccount, lastFragment.getResourceProvider());
        limitReachedBottomSheet.setRequiredLvl(i);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
            @Override
            public final void run() {
                ReactionsUtils.lambda$showLimitReachedDialogForReactions$0(lastFragment, j);
            }
        });
        limitReachedBottomSheet.show();
    }

    public static void lambda$showLimitReachedDialogForReactions$0(BaseFragment baseFragment, long j) {
        baseFragment.presentFragment(StatisticActivity.create(baseFragment.getMessagesController().getChat(Long.valueOf(-j))));
    }

    public static SpannableString createSpannableText(AnimatedEmojiSpan animatedEmojiSpan, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        return spannableString;
    }

    public static AnimatedEmojiSpan createAnimatedEmojiSpan(TLRPC.Document document, Long l, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan;
        if (document != null) {
            animatedEmojiSpan = new AnimatedEmojiSpan(document, 1.0f, fontMetricsInt);
        } else {
            animatedEmojiSpan = new AnimatedEmojiSpan(l.longValue(), 1.0f, fontMetricsInt);
        }
        animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
        return animatedEmojiSpan;
    }

    public static void addReactionToEditText(TLRPC.TL_availableReaction tL_availableReaction, HashMap map, List list, Editable editable, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j = document.id;
        AnimatedEmojiSpan animatedEmojiSpanCreateAnimatedEmojiSpan = createAnimatedEmojiSpan(document, Long.valueOf(j), fontMetricsInt);
        map.put(Long.valueOf(j), animatedEmojiSpanCreateAnimatedEmojiSpan);
        list.add(Long.valueOf(j));
        editable.append((CharSequence) createSpannableText(animatedEmojiSpanCreateAnimatedEmojiSpan, "e"));
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setMultiSelected(Long.valueOf(j), false);
        }
    }

    public static void addReactionToEditText(TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji, HashMap map, List list, Editable editable, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpanCreateAnimatedEmojiSpan = createAnimatedEmojiSpan(null, Long.valueOf(tL_reactionCustomEmoji.document_id), fontMetricsInt);
        map.put(Long.valueOf(tL_reactionCustomEmoji.document_id), animatedEmojiSpanCreateAnimatedEmojiSpan);
        list.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
        editable.append((CharSequence) createSpannableText(animatedEmojiSpanCreateAnimatedEmojiSpan, "e"));
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setMultiSelected(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
        }
    }

    public static List startPreloadReactions(TLRPC.Chat chat, TLRPC.ChatFull chatFull) {
        AnimatedEmojiDrawable animatedEmojiDrawableMake;
        ArrayList arrayList = new ArrayList();
        if (chatFull != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                Iterator<TLRPC.Reaction> it = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions.iterator();
                while (it.hasNext()) {
                    TLRPC.Reaction next = it.next();
                    if (next instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) next).emoticon);
                        if (tL_availableReaction != null) {
                            animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction.activate_animation);
                        }
                    } else {
                        animatedEmojiDrawableMake = next instanceof TLRPC.TL_reactionCustomEmoji ? AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), ((TLRPC.TL_reactionCustomEmoji) next).document_id) : null;
                    }
                    if (animatedEmojiDrawableMake != null) {
                        arrayList.add(animatedEmojiDrawableMake);
                        animatedEmojiDrawableMake.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                    }
                }
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                    if (tL_availableReaction2 != null) {
                        AnimatedEmojiDrawable animatedEmojiDrawableMake2 = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tL_availableReaction2.activate_animation);
                        arrayList.add(animatedEmojiDrawableMake2);
                        animatedEmojiDrawableMake2.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void stopPreloadReactions(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AnimatedEmojiDrawable) it.next()).removeView((AnimatedEmojiSpan.InvalidateHolder) null);
        }
    }
}
