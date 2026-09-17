package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.IntCallback {
    public final int f35824a;
    public final boolean f35825b;
    public final Object f35826c;

    public mj(int i10, Object obj, boolean z10) {
        this.f35824a = i10;
        this.f35826c = obj;
        this.f35825b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.uc ucVar;
        switch (this.f35824a) {
            case 0:
                bo boVar = ((oj) this.f35826c).f36362b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                    if (this.f35825b) {
                        ucVar = org.telegram.ui.Components.uc.G;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.I;
                    }
                    a02.m(ucVar, i10, 0, 0, boVar.f32275ea).j();
                    return;
                }
                return;
            default:
                nj njVar = (nj) this.f35826c;
                bo boVar2 = njVar.f36116b.f36362b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f32277f;
                    boolean z10 = this.f35825b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(njVar, z10));
                    return;
                }
                boVar2.qa(boVar2.f32257d4, true);
                return;
        }
    }
}
