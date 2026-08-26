package org.telegram.ui.Components.Reactions;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda131;

public abstract class ReactionsUtils {
    public static void addReactionToEditText(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, ChatCustomReactionsEditActivity.AnonymousClass5 anonymousClass5, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j = document.id;
        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document, 1.0f, fontMetricsInt);
        animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
        linkedHashMap.put(Long.valueOf(j), animatedEmojiSpan);
        arrayList.add(Long.valueOf(j));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (anonymousClass5 != null) {
            anonymousClass5.setMultiSelected(Long.valueOf(j), false);
        }
    }

    public static void applyForStoryViews(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews == null) {
            return;
        }
        int i = 0;
        boolean z = false;
        while (i < storyViews.reactions.size()) {
            TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i);
            if (reaction != null && compare(reactionCount.reaction, reaction)) {
                int i2 = reactionCount.count - 1;
                reactionCount.count = i2;
                if (i2 <= 0) {
                    storyViews.reactions.remove(i);
                    i--;
                } else if (reaction2 == null) {
                }
            } else if (reaction2 == null && compare(reactionCount.reaction, reaction2)) {
                reactionCount.count++;
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
        tL_reactionCount.count = 1;
        tL_reactionCount.reaction = reaction2;
        storyViews.reactions.add(tL_reactionCount);
    }

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

    public static void showLimitReachedDialogForReactions(long j, int i, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || tL_premium_boostsStatus == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(21, lastFragment, lastFragment.getContext(), UserConfig.selectedAccount, lastFragment.getResourceProvider());
        limitReachedBottomSheet.setRequiredLvl(i);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(new StarGiftSheet$$ExternalSyntheticLambda131(lastFragment, j));
        limitReachedBottomSheet.show();
    }

    public static boolean compare(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }
}
