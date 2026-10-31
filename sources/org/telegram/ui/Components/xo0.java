package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements org.telegram.messenger.us {
    public final TLRPC.Dialog f32524a;
    public final AtomicReference f32525b;
    public final View f32526c;
    public final op0 d;

    public xo0(op0 op0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = op0Var;
        this.f32524a = dialog;
        this.f32525b = atomicReference;
        this.f32526c = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        float f7;
        op0 op0Var = this.d;
        tk0 tk0Var = op0Var.f29147w1;
        mp0 mp0Var = op0Var.D1;
        org.telegram.ui.ActionBar.l lVar = op0Var.f29138r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f32524a;
        if (longValue == (-dialog.f19797id)) {
            ArrayList arrayList = mp0Var.f28569f;
            AtomicReference atomicReference = this.f32525b;
            if ((arrayList == null && org.telegram.messenger.vp.r1(op0Var.f21583a).f18891r7.l(-dialog.f19797id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            mp0Var.f28569f = org.telegram.messenger.vp.r1(op0Var.f21583a).f18891r7.l(-dialog.f19797id);
            mp0Var.d = org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(op0Var.f21583a).Z1(Long.valueOf(dialog.f19797id)));
            mp0Var.e = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(op0Var.f21583a).Z1(Long.valueOf(dialog.f19797id)));
            if (z10) {
                mp0Var.f();
            }
            if (mp0Var.f28569f != null) {
                org.telegram.messenger.zs.f(op0Var.f21583a).n(this, org.telegram.messenger.zs.f19675q5);
            }
            if (z10) {
                tk0Var.setVisibility(0);
                tk0Var.setAlpha(0.0f);
                lVar.setVisibility(0);
                lVar.setAlpha(0.0f);
                if (org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(op0Var.f21583a).Z1(Long.valueOf(dialog.f19797id)))) {
                    lVar.setTitle(org.telegram.messenger.o5.u(org.telegram.messenger.vp.r1(op0Var.f21583a).Z1(Long.valueOf(dialog.f19797id))));
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745686, null));
                } else if (org.telegram.messenger.w3.o0(op0Var.f21583a, dialog.f19797id)) {
                    int i12 = op0Var.f21583a;
                    lVar.setTitle(gg.e.i(i12, org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-dialog.f19797id)), false));
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745686, null));
                } else {
                    lVar.setTitle(org.telegram.messenger.vp.r1(op0Var.f21583a).L0(Long.valueOf(-dialog.f19797id)).title);
                    lVar.setSubtitle(org.telegram.messenger.cd.L0(2131745666, null));
                }
                op0Var.E2 = op0Var.D2;
                o1.j jVar = op0Var.f29142t2;
                if (jVar != null) {
                    jVar.d();
                }
                int[] iArr = new int[2];
                o1.j jVar2 = new o1.j(new o1.i(0.0f));
                o1.k kVar = new o1.k(1000.0f);
                org.telegram.ui.un unVar = op0Var.X1;
                if (unVar != null && unVar.f42191b) {
                    f7 = 10.0f;
                } else {
                    f7 = 800.0f;
                }
                kVar.b(f7);
                kVar.a(1.0f);
                jVar2.f13957m = kVar;
                op0Var.f29142t2 = jVar2;
                jVar2.b(new go0(this, this.f32526c, iArr, 1));
                op0Var.f29142t2.a(new na(this, 6));
                op0Var.f29142t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.i0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
