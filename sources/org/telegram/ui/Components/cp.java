package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;
public final class cp implements wd1 {
    public final int f23375a;
    public final dp f23376b;

    public cp(dp dpVar, int i10) {
        this.f23375a = i10;
        this.f23376b = dpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f23375a) {
            case 0:
                mp mpVar = this.f23376b.f23623a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                return;
            default:
                mp mpVar2 = this.f23376b.f23623a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                return;
        }
    }
}
