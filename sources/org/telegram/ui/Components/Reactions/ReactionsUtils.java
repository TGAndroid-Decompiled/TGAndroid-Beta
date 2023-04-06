package org.telegram.ui.Components.Reactions;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
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
}
