package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class ho0 implements org.telegram.messenger.fs {
    public final TLRPC.Dialog f35942a;
    public final AtomicReference f35943b;
    public final View f35944c;
    public final yo0 d;

    public ho0(yo0 yo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = yo0Var;
        this.f35942a = dialog;
        this.f35943b = atomicReference;
        this.f35944c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        float f10;
        yo0 yo0Var = this.d;
        ck0 ck0Var = yo0Var.A1;
        wo0 wo0Var = yo0Var.H1;
        org.telegram.ui.ActionBar.k kVar = yo0Var.f42582v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f35942a;
        if (longValue == (-dialog.f28409id)) {
            ArrayList arrayList = wo0Var.f41747f;
            AtomicReference atomicReference = this.f35943b;
            if ((arrayList == null && org.telegram.messenger.mp.u1(yo0Var.f30189a).f25771t7.l(-dialog.f28409id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            wo0Var.f41747f = org.telegram.messenger.mp.u1(yo0Var.f30189a).f25771t7.l(-dialog.f28409id);
            wo0Var.d = org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(yo0Var.f30189a).c2(Long.valueOf(dialog.f28409id)));
            wo0Var.f41746e = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(yo0Var.f30189a).c2(Long.valueOf(dialog.f28409id)));
            if (z10) {
                wo0Var.f();
            }
            if (wo0Var.f41747f != null) {
                org.telegram.messenger.ks.f(yo0Var.f30189a).n(this, org.telegram.messenger.ks.s5);
            }
            if (z10) {
                ck0Var.setVisibility(0);
                ck0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(yo0Var.f30189a).c2(Long.valueOf(dialog.f28409id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.mp.u1(yo0Var.f30189a).c2(Long.valueOf(dialog.f28409id))));
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745474, null));
                } else if (org.telegram.messenger.v3.o0(yo0Var.f30189a, dialog.f28409id)) {
                    int i11 = yo0Var.f30189a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialog.f28409id)), false));
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745474, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.mp.u1(yo0Var.f30189a).O0(Long.valueOf(-dialog.f28409id)).title);
                    kVar.setSubtitle(org.telegram.messenger.gd.M0(2131745454, null));
                }
                yo0Var.I2 = yo0Var.H2;
                r1.g gVar = yo0Var.f42586x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = yo0Var.f42554b2;
                if (bnVar != null && bnVar.f45946b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f56323m = hVar;
                yo0Var.f42586x2 = gVar2;
                gVar2.b(new sn0(this, this.f35944c, iArr, 1));
                yo0Var.f42586x2.a(new ya(this, 6));
                yo0Var.f42586x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
