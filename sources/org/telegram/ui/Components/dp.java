package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class dp implements org.telegram.ui.w71 {
    public final int f34473a;
    public final ep f34474b;

    public dp(ep epVar, int i7) {
        this.f34473a = i7;
        this.f34474b = epVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f34473a) {
            case 0:
                lp lpVar = this.f34474b.f34780a;
                lpVar.S1.L();
                lpVar.dismiss();
                return;
            default:
                lp lpVar2 = this.f34474b.f34780a;
                lpVar2.S1.L();
                lpVar2.dismiss();
                return;
        }
    }
}
