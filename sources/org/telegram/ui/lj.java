package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lj implements MessagesStorage.IntCallback {
    public final int f35502a;
    public final boolean f35503b;
    public final Object f35504c;

    public lj(int i10, Object obj, boolean z10) {
        this.f35502a = i10;
        this.f35504c = obj;
        this.f35503b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.uc ucVar;
        switch (this.f35502a) {
            case 0:
                bo boVar = ((nj) this.f35504c).f35998b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                    if (this.f35503b) {
                        ucVar = org.telegram.ui.Components.uc.G;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.I;
                    }
                    a02.m(ucVar, i10, 0, 0, boVar.f32293ea).j();
                    return;
                }
                return;
            default:
                mj mjVar = (mj) this.f35504c;
                bo boVar2 = mjVar.f35760b.f35998b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f32295f;
                    boolean z10 = this.f35503b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(mjVar, z10));
                    return;
                }
                boVar2.qa(boVar2.f32275d4, true);
                return;
        }
    }
}
