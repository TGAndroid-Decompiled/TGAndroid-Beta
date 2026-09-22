package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z71 implements ToDoubleFunction {
    public final int f30841a;

    public z71(int i10) {
        this.f30841a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f30841a) {
            case 0:
                return ((c81) obj).f23301a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.s0.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.s0.P((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.s0.P((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
