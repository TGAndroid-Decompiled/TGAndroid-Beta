package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;
public final class fp implements od1 {
    public final int f26554a;
    public final gp f26555b;

    public fp(gp gpVar, int i10) {
        this.f26554a = i10;
        this.f26555b = gpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f26554a) {
            case 0:
                pp ppVar = this.f26555b.f26957a;
                ppVar.Y.dismissInternal();
                ppVar.dismiss();
                return;
            default:
                pp ppVar2 = this.f26555b.f26957a;
                ppVar2.Y.dismissInternal();
                ppVar2.dismiss();
                return;
        }
    }
}
