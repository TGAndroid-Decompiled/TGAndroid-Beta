package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class yo0 implements org.telegram.messenger.vs {
    public final TLRPC.Dialog f32883a;
    public final AtomicReference f32884b;
    public final View f32885c;
    public final pp0 d;

    public yo0(pp0 pp0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = pp0Var;
        this.f32883a = dialog;
        this.f32884b = atomicReference;
        this.f32885c = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        float f7;
        pp0 pp0Var = this.d;
        uk0 uk0Var = pp0Var.f29502w1;
        np0 np0Var = pp0Var.D1;
        org.telegram.ui.ActionBar.l lVar = pp0Var.f29493r2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f32883a;
        if (longValue == (-dialog.f19798id)) {
            ArrayList arrayList = np0Var.f28933f;
            AtomicReference atomicReference = this.f32884b;
            if ((arrayList == null && org.telegram.messenger.wp.r1(pp0Var.f21584a).f19234r7.l(-dialog.f19798id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            np0Var.f28933f = org.telegram.messenger.wp.r1(pp0Var.f21584a).f19234r7.l(-dialog.f19798id);
            np0Var.d = org.telegram.messenger.i20.u(org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(dialog.f19798id)));
            np0Var.e = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(dialog.f19798id)));
            if (z10) {
                np0Var.f();
            }
            if (np0Var.f28933f != null) {
                org.telegram.messenger.at.f(pp0Var.f21584a).n(this, org.telegram.messenger.at.f14771q5);
            }
            if (z10) {
                uk0Var.setVisibility(0);
                uk0Var.setAlpha(0.0f);
                lVar.setVisibility(0);
                lVar.setAlpha(0.0f);
                if (org.telegram.messenger.i20.u(org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(dialog.f19798id)))) {
                    lVar.setTitle(org.telegram.messenger.o5.u(org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(dialog.f19798id))));
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745686, null));
                } else if (org.telegram.messenger.w3.o0(pp0Var.f21584a, dialog.f19798id)) {
                    int i12 = pp0Var.f21584a;
                    lVar.setTitle(gg.e.i(i12, org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(-dialog.f19798id)), false));
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745686, null));
                } else {
                    lVar.setTitle(org.telegram.messenger.wp.r1(pp0Var.f21584a).L0(Long.valueOf(-dialog.f19798id)).title);
                    lVar.setSubtitle(org.telegram.messenger.dd.L0(2131745666, null));
                }
                pp0Var.E2 = pp0Var.D2;
                o1.j jVar = pp0Var.f29497t2;
                if (jVar != null) {
                    jVar.d();
                }
                int[] iArr = new int[2];
                o1.j jVar2 = new o1.j(new o1.i(0.0f));
                o1.k kVar = new o1.k(1000.0f);
                org.telegram.ui.un unVar = pp0Var.X1;
                if (unVar != null && unVar.f42002b) {
                    f7 = 10.0f;
                } else {
                    f7 = 800.0f;
                }
                kVar.b(f7);
                kVar.a(1.0f);
                jVar2.f13958m = kVar;
                pp0Var.f29497t2 = jVar2;
                jVar2.b(new ho0(this, this.f32885c, iArr, 1));
                pp0Var.f29497t2.a(new na(this, 6));
                pp0Var.f29497t2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.i0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
