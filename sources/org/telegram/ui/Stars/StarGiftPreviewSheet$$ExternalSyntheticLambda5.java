package org.telegram.ui.Stars;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.VideoSeekPreviewImage;

public final class StarGiftPreviewSheet$$ExternalSyntheticLambda5 implements ToDoubleFunction {
    public final int $r8$classId;

    public StarGiftPreviewSheet$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeBackdrop) obj);
            case 1:
                return ((VideoSeekPreviewImage.StoryBoardFrame) obj).pts;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 5:
                return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributePattern) obj);
            default:
                return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
