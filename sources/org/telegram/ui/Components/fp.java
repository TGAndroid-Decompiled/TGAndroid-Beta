package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fp implements org.telegram.ui.w71 {
    public final int f35249a;
    public final gp f35250b;

    public fp(gp gpVar, int i7) {
        this.f35249a = i7;
        this.f35250b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35249a) {
            case 0:
                np npVar = this.f35250b.f35609a;
                npVar.S1.L();
                npVar.dismiss();
                return;
            default:
                np npVar2 = this.f35250b.f35609a;
                npVar2.S1.L();
                npVar2.dismiss();
                return;
        }
    }
}
