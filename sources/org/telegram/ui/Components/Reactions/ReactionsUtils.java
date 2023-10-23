package org.telegram.ui.Components.Reactions;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
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
        return "";
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
}
