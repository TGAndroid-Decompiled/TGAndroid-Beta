package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class jo0 implements org.telegram.messenger.gs {
    public final TLRPC.Dialog f36531a;
    public final AtomicReference f36532b;
    public final View f36533c;
    public final ap0 d;

    public jo0(ap0 ap0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ap0Var;
        this.f36531a = dialog;
        this.f36532b = atomicReference;
        this.f36533c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        float f10;
        ap0 ap0Var = this.d;
        ek0 ek0Var = ap0Var.A1;
        yo0 yo0Var = ap0Var.H1;
        org.telegram.ui.ActionBar.k kVar = ap0Var.f33575v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f36531a;
        if (longValue == (-dialog.f28402id)) {
            ArrayList arrayList = yo0Var.f42446f;
            AtomicReference atomicReference = this.f36532b;
            if ((arrayList == null && org.telegram.messenger.np.u1(ap0Var.f30139a).f25932t7.l(-dialog.f28402id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yo0Var.f42446f = org.telegram.messenger.np.u1(ap0Var.f30139a).f25932t7.l(-dialog.f28402id);
            yo0Var.d = org.telegram.messenger.p10.v(org.telegram.messenger.np.u1(ap0Var.f30139a).c2(Long.valueOf(dialog.f28402id)));
            yo0Var.f42445e = org.telegram.messenger.p10.w(org.telegram.messenger.np.u1(ap0Var.f30139a).c2(Long.valueOf(dialog.f28402id)));
            if (z10) {
                yo0Var.f();
            }
            if (yo0Var.f42446f != null) {
                org.telegram.messenger.ls.f(ap0Var.f30139a).n(this, org.telegram.messenger.ls.f25354t5);
            }
            if (z10) {
                ek0Var.setVisibility(0);
                ek0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.p10.v(org.telegram.messenger.np.u1(ap0Var.f30139a).c2(Long.valueOf(dialog.f28402id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.np.u1(ap0Var.f30139a).c2(Long.valueOf(dialog.f28402id))));
                    kVar.setSubtitle(org.telegram.messenger.hd.N0(2131745473, null));
                } else if (org.telegram.messenger.v3.o0(ap0Var.f30139a, dialog.f28402id)) {
                    int i11 = ap0Var.f30139a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.np.u1(i11).O0(Long.valueOf(-dialog.f28402id)), false));
                    kVar.setSubtitle(org.telegram.messenger.hd.N0(2131745473, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.np.u1(ap0Var.f30139a).O0(Long.valueOf(-dialog.f28402id)).title);
                    kVar.setSubtitle(org.telegram.messenger.hd.N0(2131745453, null));
                }
                ap0Var.I2 = ap0Var.H2;
                r1.g gVar = ap0Var.f33579x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = ap0Var.f33547b2;
                if (bnVar != null && bnVar.f45917b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f56333m = hVar;
                ap0Var.f33579x2 = gVar2;
                gVar2.b(new un0(this, this.f36533c, iArr, 1));
                ap0Var.f33579x2.a(new ya(this, 6));
                ap0Var.f33579x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
