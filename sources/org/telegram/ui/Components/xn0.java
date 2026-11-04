package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements org.telegram.messenger.cs {
    public final TLRPC.Dialog f40432a;
    public final AtomicReference f40433b;
    public final View f40434c;
    public final oo0 d;

    public xn0(oo0 oo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = oo0Var;
        this.f40432a = dialog;
        this.f40433b = atomicReference;
        this.f40434c = view;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        float f10;
        oo0 oo0Var = this.d;
        tj0 tj0Var = oo0Var.f36909x1;
        mo0 mo0Var = oo0Var.E1;
        org.telegram.ui.ActionBar.k kVar = oo0Var.f36900s2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f40432a;
        if (longValue == (-dialog.f27005id)) {
            ArrayList arrayList = mo0Var.f36223f;
            AtomicReference atomicReference = this.f40433b;
            if ((arrayList == null && org.telegram.messenger.hp.s1(oo0Var.f28583a).f23102q7.l(-dialog.f27005id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            mo0Var.f36223f = org.telegram.messenger.hp.s1(oo0Var.f28583a).f23102q7.l(-dialog.f27005id);
            mo0Var.d = org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(dialog.f27005id)));
            mo0Var.f36222e = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(dialog.f27005id)));
            if (z10) {
                mo0Var.f();
            }
            if (mo0Var.f36223f != null) {
                org.telegram.messenger.hs.f(oo0Var.f28583a).n(this, org.telegram.messenger.hs.f23291q5);
            }
            if (z10) {
                tj0Var.setVisibility(0);
                tj0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(dialog.f27005id)))) {
                    kVar.setTitle(org.telegram.messenger.m5.u(org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(dialog.f27005id))));
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745679, null));
                } else if (org.telegram.messenger.t3.o0(oo0Var.f28583a, dialog.f27005id)) {
                    int i11 = oo0Var.f28583a;
                    kVar.setTitle(rg.c.i(i11, org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-dialog.f27005id)), false));
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745679, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.hp.s1(oo0Var.f28583a).M0(Long.valueOf(-dialog.f27005id)).title);
                    kVar.setSubtitle(org.telegram.messenger.bd.M0(2131745659, null));
                }
                oo0Var.F2 = oo0Var.E2;
                q1.g gVar = oo0Var.f36904u2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                q1.g gVar2 = new q1.g(new q1.f(0.0f));
                q1.h hVar = new q1.h(1000.0f);
                org.telegram.ui.wm wmVar = oo0Var.Y1;
                if (wmVar != null && wmVar.f51250b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f53653m = hVar;
                oo0Var.f36904u2 = gVar2;
                gVar2.b(new in0(this, this.f40434c, iArr, 1));
                oo0Var.f36904u2.a(new sa(this, 6));
                oo0Var.f36904u2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
