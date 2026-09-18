package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class cp implements wd1 {
    public final int f23115a;
    public final dp f23116b;

    public cp(dp dpVar, int i10) {
        this.f23115a = i10;
        this.f23116b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23115a) {
            case 0:
                mp mpVar = this.f23116b.f23375a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23116b.f23375a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
