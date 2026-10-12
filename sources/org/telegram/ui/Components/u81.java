package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u81 implements ToDoubleFunction {
    public final int f31106a;

    public u81(int i10) {
        this.f31106a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f31106a) {
            case 0:
                return ((x81) obj).f32678a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.r0.Q((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.r0.Q((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.r0.Q((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
