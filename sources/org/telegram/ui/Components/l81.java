package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l81 implements ToDoubleFunction {
    public final int f26976a;

    public l81(int i10) {
        this.f26976a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f26976a) {
            case 0:
                return ((o81) obj).f27908a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return zh.r0.Q((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return zh.r0.Q((TL_stars.starGiftAttributePattern) obj);
            default:
                return zh.r0.Q((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
