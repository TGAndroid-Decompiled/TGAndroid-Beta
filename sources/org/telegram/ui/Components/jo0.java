package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class jo0 implements org.telegram.messenger.fs {
    public final TLRPC.Dialog f36582a;
    public final AtomicReference f36583b;
    public final View f36584c;
    public final ap0 d;

    public jo0(ap0 ap0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = ap0Var;
        this.f36582a = dialog;
        this.f36583b = atomicReference;
        this.f36584c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        float f10;
        ap0 ap0Var = this.d;
        ek0 ek0Var = ap0Var.A1;
        yo0 yo0Var = ap0Var.H1;
        org.telegram.ui.ActionBar.k kVar = ap0Var.f33578v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f36582a;
        if (longValue == (-dialog.f28435id)) {
            ArrayList arrayList = yo0Var.f42493f;
            AtomicReference atomicReference = this.f36583b;
            if ((arrayList == null && org.telegram.messenger.mp.u1(ap0Var.f30170a).f25797t7.l(-dialog.f28435id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yo0Var.f42493f = org.telegram.messenger.mp.u1(ap0Var.f30170a).f25797t7.l(-dialog.f28435id);
            yo0Var.d = org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(ap0Var.f30170a).c2(Long.valueOf(dialog.f28435id)));
            yo0Var.f42492e = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(ap0Var.f30170a).c2(Long.valueOf(dialog.f28435id)));
            if (z10) {
                yo0Var.f();
            }
            if (yo0Var.f42493f != null) {
                org.telegram.messenger.ks.f(ap0Var.f30170a).n(this, org.telegram.messenger.ks.f25224t5);
            }
            if (z10) {
                ek0Var.setVisibility(0);
                ek0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(ap0Var.f30170a).c2(Long.valueOf(dialog.f28435id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.mp.u1(ap0Var.f30170a).c2(Long.valueOf(dialog.f28435id))));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else if (org.telegram.messenger.v3.o0(ap0Var.f30170a, dialog.f28435id)) {
                    int i11 = ap0Var.f30170a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialog.f28435id)), false));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.mp.u1(ap0Var.f30170a).O0(Long.valueOf(-dialog.f28435id)).title);
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745453, null));
                }
                ap0Var.I2 = ap0Var.H2;
                r1.g gVar = ap0Var.f33582x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = ap0Var.f33550b2;
                if (bnVar != null && bnVar.f45960b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f56364m = hVar;
                ap0Var.f33582x2 = gVar2;
                gVar2.b(new un0(this, this.f36584c, iArr, 1));
                ap0Var.f33582x2.a(new ya(this, 6));
                ap0Var.f33582x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
