package org.telegram.ui.Components.Reactions;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_chatReactionsAll;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.StatisticActivity;
public class ReactionsUtils {
    public static boolean compare(TLRPC$Reaction tLRPC$Reaction, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && visibleReaction.documentId == 0 && TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, visibleReaction.emojicon)) {
            return true;
        }
        if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
            long j = visibleReaction.documentId;
            return j != 0 && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == j;
        }
        return false;
    }

    public static boolean compare(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2) {
        if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji) && TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon)) {
            return true;
        }
        return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id;
    }

    public static TLRPC$Reaction toTLReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (visibleReaction.emojicon != null) {
            TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
            tLRPC$TL_reactionEmoji.emoticon = visibleReaction.emojicon;
            return tLRPC$TL_reactionEmoji;
        }
        TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
        tLRPC$TL_reactionCustomEmoji.document_id = visibleReaction.documentId;
        return tLRPC$TL_reactionCustomEmoji;
    }

    public static CharSequence reactionToCharSequence(TLRPC$Reaction tLRPC$Reaction) {
        if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
            return ((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon;
        }
        if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
            return spannableStringBuilder;
        }
        return BuildConfig.APP_CENTER_HASH;
    }

    public static void applyForStoryViews(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2, TL_stories$StoryViews tL_stories$StoryViews) {
        if (tL_stories$StoryViews == null) {
            return;
        }
        int i = 0;
        boolean z = false;
        while (i < tL_stories$StoryViews.reactions.size()) {
            TLRPC$ReactionCount tLRPC$ReactionCount = tL_stories$StoryViews.reactions.get(i);
            if (tLRPC$Reaction != null && compare(tLRPC$ReactionCount.reaction, tLRPC$Reaction)) {
                int i2 = tLRPC$ReactionCount.count - 1;
                tLRPC$ReactionCount.count = i2;
                if (i2 <= 0) {
                    tL_stories$StoryViews.reactions.remove(i);
                    i--;
                    i++;
                }
            }
            if (tLRPC$Reaction2 != null && compare(tLRPC$ReactionCount.reaction, tLRPC$Reaction2)) {
                tLRPC$ReactionCount.count++;
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        TLRPC$TL_reactionCount tLRPC$TL_reactionCount = new TLRPC$TL_reactionCount();
        tLRPC$TL_reactionCount.count = 1;
        tLRPC$TL_reactionCount.reaction = tLRPC$Reaction2;
        tL_stories$StoryViews.reactions.add(tLRPC$TL_reactionCount);
    }

    public static void showLimitReachedDialogForReactions(final long j, int i, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        final BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || tL_stories$TL_premium_boostsStatus == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getContext(), 21, UserConfig.selectedAccount, lastFragment.getResourceProvider());
        limitReachedBottomSheet.setRequiredLvl(i);
        limitReachedBottomSheet.setBoostsStats(tL_stories$TL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
            @Override
            public final void run() {
                ReactionsUtils.lambda$showLimitReachedDialogForReactions$0(BaseFragment.this, j);
            }
        });
        limitReachedBottomSheet.show();
    }

    public static void lambda$showLimitReachedDialogForReactions$0(BaseFragment baseFragment, long j) {
        long j2 = -j;
        TLRPC$Chat chat = baseFragment.getMessagesController().getChat(Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j2);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", true);
        TLRPC$ChatFull chatFull = baseFragment.getMessagesController().getChatFull(j2);
        if (chatFull == null || !chatFull.can_view_stats) {
            bundle.putBoolean("only_boosts", true);
        }
        baseFragment.presentFragment(new StatisticActivity(bundle));
    }

    public static SpannableString createSpannableText(AnimatedEmojiSpan animatedEmojiSpan, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        return spannableString;
    }

    public static AnimatedEmojiSpan createAnimatedEmojiSpan(TLRPC$Document tLRPC$Document, Long l, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan;
        if (tLRPC$Document != null) {
            animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$Document, 1.0f, fontMetricsInt);
        } else {
            animatedEmojiSpan = new AnimatedEmojiSpan(l.longValue(), 1.0f, fontMetricsInt);
        }
        animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
        return animatedEmojiSpan;
    }

    public static void addReactionToEditText(TLRPC$TL_availableReaction tLRPC$TL_availableReaction, HashMap<Long, AnimatedEmojiSpan> hashMap, List<Long> list, Editable editable, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC$Document tLRPC$Document = tLRPC$TL_availableReaction.activate_animation;
        long j = tLRPC$Document.id;
        AnimatedEmojiSpan createAnimatedEmojiSpan = createAnimatedEmojiSpan(tLRPC$Document, Long.valueOf(j), fontMetricsInt);
        hashMap.put(Long.valueOf(j), createAnimatedEmojiSpan);
        list.add(Long.valueOf(j));
        editable.append((CharSequence) createSpannableText(createAnimatedEmojiSpan, "e"));
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setMultiSelected(Long.valueOf(j), false);
        }
    }

    public static void addReactionToEditText(TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji, HashMap<Long, AnimatedEmojiSpan> hashMap, List<Long> list, Editable editable, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan createAnimatedEmojiSpan = createAnimatedEmojiSpan(null, Long.valueOf(tLRPC$TL_reactionCustomEmoji.document_id), fontMetricsInt);
        hashMap.put(Long.valueOf(tLRPC$TL_reactionCustomEmoji.document_id), createAnimatedEmojiSpan);
        list.add(Long.valueOf(tLRPC$TL_reactionCustomEmoji.document_id));
        editable.append((CharSequence) createSpannableText(createAnimatedEmojiSpan, "e"));
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setMultiSelected(Long.valueOf(tLRPC$TL_reactionCustomEmoji.document_id), false);
        }
    }

    public static List<AnimatedEmojiDrawable> startPreloadReactions(TLRPC$Chat tLRPC$Chat, TLRPC$ChatFull tLRPC$ChatFull) {
        AnimatedEmojiDrawable make;
        ArrayList arrayList = new ArrayList();
        if (tLRPC$ChatFull != null && ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
            TLRPC$ChatReactions tLRPC$ChatReactions = tLRPC$ChatFull.available_reactions;
            if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
                Iterator<TLRPC$Reaction> it = ((TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions).reactions.iterator();
                while (it.hasNext()) {
                    TLRPC$Reaction next = it.next();
                    if (next instanceof TLRPC$TL_reactionEmoji) {
                        TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC$TL_reactionEmoji) next).emoticon);
                        if (tLRPC$TL_availableReaction != null) {
                            make = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tLRPC$TL_availableReaction.activate_animation);
                        }
                    } else {
                        make = next instanceof TLRPC$TL_reactionCustomEmoji ? AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), ((TLRPC$TL_reactionCustomEmoji) next).document_id) : null;
                    }
                    if (make != null) {
                        arrayList.add(make);
                        make.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                    }
                }
            } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsAll) {
                for (TLRPC$TL_availableReaction tLRPC$TL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                    if (tLRPC$TL_availableReaction2 != null) {
                        AnimatedEmojiDrawable make2 = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, AnimatedEmojiDrawable.getCacheTypeForEnterView(), tLRPC$TL_availableReaction2.activate_animation);
                        arrayList.add(make2);
                        make2.addView((AnimatedEmojiSpan.InvalidateHolder) null);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void stopPreloadReactions(List<AnimatedEmojiDrawable> list) {
        for (AnimatedEmojiDrawable animatedEmojiDrawable : list) {
            animatedEmojiDrawable.removeView((AnimatedEmojiSpan.InvalidateHolder) null);
        }
    }
}
