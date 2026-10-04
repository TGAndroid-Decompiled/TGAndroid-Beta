package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h81 implements ToDoubleFunction {
    public final int f27042a;

    public h81(int i10) {
        this.f27042a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f27042a) {
            case 0:
                return ((j81) obj).f27657a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.s0.N((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.s0.N((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.s0.N((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
