package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m81 implements ToDoubleFunction {
    public final int f27007a;

    public m81(int i10) {
        this.f27007a = i10;
    }

    @Override
    public final double applyAsDouble(Object obj) {
        switch (this.f27007a) {
            case 0:
                return ((p81) obj).f27926a;
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
