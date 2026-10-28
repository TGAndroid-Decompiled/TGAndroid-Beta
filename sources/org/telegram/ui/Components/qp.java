package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;
public final class qp implements uc1 {
    public final int f31978a;
    public final rp f31979b;

    public qp(rp rpVar, int i10) {
        this.f31978a = i10;
        this.f31979b = rpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31978a) {
            case 0:
                zp zpVar = this.f31979b.f32297a;
                zpVar.X.dismissInternal();
                zpVar.dismiss();
                return;
            default:
                zp zpVar2 = this.f31979b.f32297a;
                zpVar2.X.dismissInternal();
                zpVar2.dismiss();
                return;
        }
    }
}
