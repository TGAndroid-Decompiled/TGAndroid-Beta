package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w71 implements ToDoubleFunction {
    public final int f29902a;

    public w71(int i10) {
        this.f29902a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f29902a) {
            case 0:
                return ((z71) obj).f30798a;
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
