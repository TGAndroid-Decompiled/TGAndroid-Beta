package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class yn0 implements org.telegram.messenger.is {
    public final TLRPC.Dialog f42050a;
    public final AtomicReference f42051b;
    public final View f42052c;
    public final po0 d;

    public yn0(po0 po0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = po0Var;
        this.f42050a = dialog;
        this.f42051b = atomicReference;
        this.f42052c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        float f10;
        po0 po0Var = this.d;
        uj0 uj0Var = po0Var.A1;
        no0 no0Var = po0Var.H1;
        org.telegram.ui.ActionBar.k kVar = po0Var.f38369v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f42050a;
        if (longValue == (-dialog.f28055id)) {
            ArrayList arrayList = no0Var.f37657f;
            AtomicReference atomicReference = this.f42051b;
            if ((arrayList == null && org.telegram.messenger.np.s1(po0Var.f29679a).f25386r7.l(-dialog.f28055id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            no0Var.f37657f = org.telegram.messenger.np.s1(po0Var.f29679a).f25386r7.l(-dialog.f28055id);
            no0Var.d = org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(dialog.f28055id)));
            no0Var.f37656e = org.telegram.messenger.q10.v(org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(dialog.f28055id)));
            if (z10) {
                no0Var.f();
            }
            if (no0Var.f37657f != null) {
                org.telegram.messenger.ns.f(po0Var.f29679a).n(this, org.telegram.messenger.ns.f25559q5);
            }
            if (z10) {
                uj0Var.setVisibility(0);
                uj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(dialog.f28055id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(dialog.f28055id))));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745669, null));
                } else if (org.telegram.messenger.t3.o0(po0Var.f29679a, dialog.f28055id)) {
                    int i11 = po0Var.f29679a;
                    kVar.setTitle(qg.c.i(i11, org.telegram.messenger.np.s1(i11).M0(Long.valueOf(-dialog.f28055id)), false));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745669, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.np.s1(po0Var.f29679a).M0(Long.valueOf(-dialog.f28055id)).title);
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745649, null));
                }
                po0Var.I2 = po0Var.H2;
                r1.g gVar = po0Var.f38373x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.an anVar = po0Var.f38341b2;
                if (anVar != null && anVar.f45131b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f55748m = hVar;
                po0Var.f38373x2 = gVar2;
                gVar2.b(new jn0(this, this.f42052c, iArr, 1));
                po0Var.f38373x2.a(new pa(this, 6));
                po0Var.f38373x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
