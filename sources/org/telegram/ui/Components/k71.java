package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k71 implements ToDoubleFunction {
    public final int f27712a;

    public k71(int i10) {
        this.f27712a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f27712a) {
            case 0:
                return ((m71) obj).f28400a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return zh.s0.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return zh.s0.P((TL_stars.starGiftAttributePattern) obj);
            default:
                return zh.s0.P((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
