package org.telegram.ui.iv;

import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import io.noties.markwon.html.HtmlTagImpl;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedLinearLayout;

public final class TableModel$$ExternalSyntheticLambda1 implements ToIntFunction {
    public final int $r8$classId;

    public TableModel$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 1:
                return ((BitmapsCache.FrameOffset) obj).index;
            case 2:
                return ((MessageObject) obj).getId();
            case 3:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 4:
                return ((TLRPC.Message) obj).id;
            case 5:
                return ((TLRPC.Message) obj).id;
            case 6:
                return ((AnimatedLinearLayout.Holder) obj).priority;
            case 7:
                return ((AnimatedLinearLayout.Holder) obj).order;
            case 8:
                HtmlTagImpl htmlTagImpl = (HtmlTagImpl) obj;
                return htmlTagImpl.end - htmlTagImpl.start;
            case 9:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i = messagePeerReaction.date;
                if (i <= 0 || messagePeerReaction.reaction != null) {
                    return Integer.MIN_VALUE;
                }
                return -i;
            case 10:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i2 = messagePeerReaction2.date;
                if (i2 <= 0 || messagePeerReaction2.reaction != null) {
                    return Integer.MIN_VALUE;
                }
                return -i2;
            case 11:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 12:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 13:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 14:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 15:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 16:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 17:
                return -((TL_stories.StoryView) obj).date;
            case 18:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) zziq.m(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
