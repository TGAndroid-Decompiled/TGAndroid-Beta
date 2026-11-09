package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class wn0 implements org.telegram.messenger.ls {
    public final TLRPC.Dialog f40105a;
    public final AtomicReference f40106b;
    public final View f40107c;
    public final no0 d;

    public wn0(no0 no0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = no0Var;
        this.f40105a = dialog;
        this.f40106b = atomicReference;
        this.f40107c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        float f10;
        no0 no0Var = this.d;
        qj0 qj0Var = no0Var.f36463w1;
        lo0 lo0Var = no0Var.D1;
        org.telegram.ui.ActionBar.k kVar = no0Var.f36454r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f40105a;
        if (longValue == (-dialog.f26960id)) {
            ArrayList arrayList = lo0Var.f35780f;
            AtomicReference atomicReference = this.f40106b;
            if ((arrayList == null && org.telegram.messenger.qp.s1(no0Var.f28621a).f24877q7.l(-dialog.f26960id) != null) || atomicReference.get() == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            lo0Var.f35780f = org.telegram.messenger.qp.s1(no0Var.f28621a).f24877q7.l(-dialog.f26960id);
            lo0Var.d = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(no0Var.f28621a).a2(Long.valueOf(dialog.f26960id)));
            lo0Var.f35779e = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(no0Var.f28621a).a2(Long.valueOf(dialog.f26960id)));
            if (z9) {
                lo0Var.f();
            }
            if (lo0Var.f35780f != null) {
                org.telegram.messenger.qs.f(no0Var.f28621a).n(this, org.telegram.messenger.qs.f25062q5);
            }
            if (z9) {
                qj0Var.setVisibility(0);
                qj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(no0Var.f28621a).a2(Long.valueOf(dialog.f26960id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.qp.s1(no0Var.f28621a).a2(Long.valueOf(dialog.f26960id))));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else if (org.telegram.messenger.t3.o0(no0Var.f28621a, dialog.f26960id)) {
                    int i11 = no0Var.f28621a;
                    kVar.setTitle(qg.d.i(i11, org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-dialog.f26960id)), false));
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.qp.s1(no0Var.f28621a).M0(Long.valueOf(-dialog.f26960id)).title);
                    kVar.setSubtitle(org.telegram.messenger.id.M0(2131745649, null));
                }
                no0Var.E2 = no0Var.D2;
                r1.g gVar = no0Var.f36458t2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.cn cnVar = no0Var.X1;
                if (cnVar != null && cnVar.f44391b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f54280m = hVar;
                no0Var.f36458t2 = gVar2;
                gVar2.b(new gn0(this, this.f40107c, iArr, 1));
                no0Var.f36458t2.a(new ta(this, 6));
                no0Var.f36458t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
