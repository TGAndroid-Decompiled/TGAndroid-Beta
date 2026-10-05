package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i81 implements ToDoubleFunction {
    public final int f27422a;

    public i81(int i10) {
        this.f27422a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f27422a) {
            case 0:
                return ((k81) obj).f28109a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.t0.O((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.t0.O((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.t0.O((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
