package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;

public final class qo implements mc1 {

    public final int f31948a;

    public final ro f31949b;

    public qo(ro roVar, int i10) {
        this.f31948a = i10;
        this.f31949b = roVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31948a) {
            case 0:
                ap apVar = this.f31949b.f32243a;
                apVar.U.dismissInternal();
                apVar.dismiss();
                break;
            default:
                ap apVar2 = this.f31949b.f32243a;
                apVar2.U.dismissInternal();
                apVar2.dismiss();
                break;
        }
    }
}
