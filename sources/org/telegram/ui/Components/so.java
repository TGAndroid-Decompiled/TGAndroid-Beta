package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc1;
public final class so implements nc1 {
    public final int f32531a;
    public final to f32532b;

    public so(to toVar, int i9) {
        this.f32531a = i9;
        this.f32532b = toVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f32531a) {
            case 0:
                cp cpVar = this.f32532b.f32772a;
                cpVar.U.dismissInternal();
                cpVar.dismiss();
                return;
            default:
                cp cpVar2 = this.f32532b.f32772a;
                cpVar2.U.dismissInternal();
                cpVar2.dismiss();
                return;
        }
    }
}
