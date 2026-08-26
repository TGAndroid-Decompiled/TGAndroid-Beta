package org.telegram.ui.iv;

import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

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
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 7:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 8:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 9:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 10:
                return ((TL_stars.StarGift) obj).birthday ? -1 : 0;
            case 11:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 12:
                return -((TL_stories.StoryView) obj).date;
            case 13:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) zzin.m(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
