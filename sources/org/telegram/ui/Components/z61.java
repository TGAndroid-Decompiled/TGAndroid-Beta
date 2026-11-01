package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z61 implements ToDoubleFunction {
    public final int f33051a;

    public z61(int i10) {
        this.f33051a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f33051a) {
            case 0:
                return ((b71) obj).f24676a;
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
