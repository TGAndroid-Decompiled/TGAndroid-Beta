package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y61 implements ToDoubleFunction {
    public final int f32645a;

    public y61(int i10) {
        this.f32645a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f32645a) {
            case 0:
                return ((a71) obj).f24324a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return rh.t0.e1((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return rh.t0.e1((TL_stars.starGiftAttributePattern) obj);
            default:
                return rh.t0.e1((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
