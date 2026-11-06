package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements org.telegram.messenger.ls {
    public final TLRPC.Dialog f39011a;
    public final AtomicReference f39012b;
    public final View f39013c;
    public final mo0 d;

    public vn0(mo0 mo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mo0Var;
        this.f39011a = dialog;
        this.f39012b = atomicReference;
        this.f39013c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        float f10;
        mo0 mo0Var = this.d;
        pj0 pj0Var = mo0Var.f36041w1;
        ko0 ko0Var = mo0Var.D1;
        org.telegram.ui.ActionBar.k kVar = mo0Var.f36032r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f39011a;
        if (longValue == (-dialog.f26957id)) {
            ArrayList arrayList = ko0Var.f35379f;
            AtomicReference atomicReference = this.f39012b;
            if ((arrayList == null && org.telegram.messenger.qp.s1(mo0Var.f28613a).f24870q7.l(-dialog.f26957id) != null) || atomicReference.get() == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ko0Var.f35379f = org.telegram.messenger.qp.s1(mo0Var.f28613a).f24870q7.l(-dialog.f26957id);
            ko0Var.d = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.f28613a).a2(Long.valueOf(dialog.f26957id)));
            ko0Var.f35378e = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(mo0Var.f28613a).a2(Long.valueOf(dialog.f26957id)));
            if (z9) {
                ko0Var.f();
            }
            if (ko0Var.f35379f != null) {
                org.telegram.messenger.qs.f(mo0Var.f28613a).n(this, org.telegram.messenger.qs.f25053q5);
            }
            if (z9) {
                pj0Var.setVisibility(0);
                pj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.f28613a).a2(Long.valueOf(dialog.f26957id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.qp.s1(mo0Var.f28613a).a2(Long.valueOf(dialog.f26957id))));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745670, null));
                } else if (org.telegram.messenger.t3.o0(mo0Var.f28613a, dialog.f26957id)) {
                    int i11 = mo0Var.f28613a;
                    kVar.setTitle(qg.d.i(i11, org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-dialog.f26957id)), false));
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745670, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.qp.s1(mo0Var.f28613a).M0(Long.valueOf(-dialog.f26957id)).title);
                    kVar.setSubtitle(org.telegram.messenger.hd.M0(2131745650, null));
                }
                mo0Var.E2 = mo0Var.D2;
                r1.g gVar = mo0Var.f36036t2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.an anVar = mo0Var.X1;
                if (anVar != null && anVar.f43730b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f54174m = hVar;
                mo0Var.f36036t2 = gVar2;
                gVar2.b(new fn0(this, this.f39013c, iArr, 1));
                mo0Var.f36036t2.a(new ta(this, 6));
                mo0Var.f36036t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
