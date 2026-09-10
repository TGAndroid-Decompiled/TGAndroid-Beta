package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x71 implements ToDoubleFunction {
    public final int f28972a;

    public x71(int i10) {
        this.f28972a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f28972a) {
            case 0:
                return ((z71) obj).f29610a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return xh.s0.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return xh.s0.P((TL_stars.starGiftAttributePattern) obj);
            default:
                return xh.s0.P((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
