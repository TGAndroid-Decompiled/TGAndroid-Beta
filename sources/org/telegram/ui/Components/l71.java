package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l71 implements ToDoubleFunction {
    public final int f25848a;

    public l71(int i10) {
        this.f25848a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f25848a) {
            case 0:
                return ((n71) obj).f26391a;
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
