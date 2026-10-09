package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o81 implements ToDoubleFunction {
    public final int f29409a;

    public o81(int i10) {
        this.f29409a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f29409a) {
            case 0:
                return ((r81) obj).f30387a;
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
