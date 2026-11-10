package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements org.telegram.messenger.ls {
    public final TLRPC.Dialog f39056a;
    public final AtomicReference f39057b;
    public final View f39058c;
    public final mo0 d;

    public vn0(mo0 mo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = mo0Var;
        this.f39056a = dialog;
        this.f39057b = atomicReference;
        this.f39058c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        float f10;
        mo0 mo0Var = this.d;
        pj0 pj0Var = mo0Var.f36063z1;
        ko0 ko0Var = mo0Var.G1;
        org.telegram.ui.ActionBar.l lVar = mo0Var.f36054u2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f39056a;
        if (longValue == (-dialog.f26964id)) {
            ArrayList arrayList = ko0Var.f35382f;
            AtomicReference atomicReference = this.f39057b;
            if ((arrayList == null && org.telegram.messenger.qp.s1(mo0Var.f28669a).f24881q7.l(-dialog.f26964id) != null) || atomicReference.get() == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ko0Var.f35382f = org.telegram.messenger.qp.s1(mo0Var.f28669a).f24881q7.l(-dialog.f26964id);
            ko0Var.d = org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.f28669a).a2(Long.valueOf(dialog.f26964id)));
            ko0Var.f35381e = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(mo0Var.f28669a).a2(Long.valueOf(dialog.f26964id)));
            if (z9) {
                ko0Var.f();
            }
            if (ko0Var.f35382f != null) {
                org.telegram.messenger.qs.f(mo0Var.f28669a).n(this, org.telegram.messenger.qs.f25066q5);
            }
            if (z9) {
                pj0Var.setVisibility(0);
                pj0Var.setAlpha(0.0f);
                lVar.setVisibility(0);
                lVar.setAlpha(0.0f);
                if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(mo0Var.f28669a).a2(Long.valueOf(dialog.f26964id)))) {
                    lVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.qp.s1(mo0Var.f28669a).a2(Long.valueOf(dialog.f26964id))));
                    lVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else if (org.telegram.messenger.t3.o0(mo0Var.f28669a, dialog.f26964id)) {
                    int i11 = mo0Var.f28669a;
                    lVar.setTitle(qg.d.i(i11, org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-dialog.f26964id)), false));
                    lVar.setSubtitle(org.telegram.messenger.id.M0(2131745669, null));
                } else {
                    lVar.setTitle(org.telegram.messenger.qp.s1(mo0Var.f28669a).M0(Long.valueOf(-dialog.f26964id)).title);
                    lVar.setSubtitle(org.telegram.messenger.id.M0(2131745649, null));
                }
                mo0Var.H2 = mo0Var.G2;
                r1.g gVar = mo0Var.f36058w2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.cn cnVar = mo0Var.f36027a2;
                if (cnVar != null && cnVar.f44432b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f54279m = hVar;
                mo0Var.f36058w2 = gVar2;
                gVar2.b(new fn0(this, this.f39058c, iArr, 1));
                mo0Var.f36058w2.a(new sa(this, 6));
                mo0Var.f36058w2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
