package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mj implements MessagesStorage.IntCallback {
    public final int f35829a;
    public final boolean f35830b;
    public final Object f35831c;

    public mj(int i10, Object obj, boolean z10) {
        this.f35829a = i10;
        this.f35831c = obj;
        this.f35830b = z10;
    }

    @Override
    public final void run(int i10) {
        org.telegram.ui.Components.uc ucVar;
        switch (this.f35829a) {
            case 0:
                bo boVar = ((oj) this.f35831c).f36367b;
                if (i10 > 0 && boVar.getParentActivity() != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                    if (this.f35830b) {
                        ucVar = org.telegram.ui.Components.uc.G;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.I;
                    }
                    a02.m(ucVar, i10, 0, 0, boVar.f32279ea).j();
                    return;
                }
                return;
            default:
                nj njVar = (nj) this.f35831c;
                bo boVar2 = njVar.f36121b.f36367b;
                if (i10 >= 50) {
                    TLRPC.Chat chat = boVar2.e;
                    TLRPC.User user = boVar2.f32281f;
                    boolean z10 = this.f35830b;
                    org.telegram.ui.Components.c5.s(boVar2, true, chat, user, false, false, false, z10, new y0(njVar, z10));
                    return;
                }
                boVar2.qa(boVar2.f32261d4, true);
                return;
        }
    }
}
