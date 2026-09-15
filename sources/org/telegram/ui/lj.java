package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.IntCallback {
    public final int f35519a;
    public final boolean f35520b;
    public final Object f35521c;

    public lj(int i10, Object obj, boolean z10) {
        this.f35519a = i10;
        this.f35521c = obj;
        this.f35520b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.uc ucVar;
        switch (this.f35519a) {
            case 0:
                bo boVar = ((nj) this.f35521c).f35993b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                    if (this.f35520b) {
                        ucVar = org.telegram.ui.Components.uc.G;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.I;
                    }
                    a02.m(ucVar, i10, 0, 0, boVar.f32297ea).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f35521c;
                bo boVar2 = mjVar.f35760b.f35993b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f32299f;
                    boolean z10 = this.f35520b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    return;
                }
                boVar2.qa(boVar2.f32279d4, true);
                return;
        }
    }
}
