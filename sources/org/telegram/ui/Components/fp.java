package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fp implements org.telegram.ui.w71 {
    public final int f35291a;
    public final gp f35292b;

    public fp(gp gpVar, int i7) {
        this.f35291a = i7;
        this.f35292b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35291a) {
            case 0:
                np npVar = this.f35292b.f35630a;
                npVar.S1.L();
                npVar.dismiss();
                return;
            default:
                np npVar2 = this.f35292b.f35630a;
                npVar2.S1.L();
                npVar2.dismiss();
                return;
        }
    }
}
