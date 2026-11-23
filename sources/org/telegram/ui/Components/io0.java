package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
public final class io0 implements org.telegram.messenger.fs {
    public final TLRPC.Dialog f36066a;
    public final AtomicReference f36067b;
    public final View f36068c;
    public final zo0 d;

    public io0(zo0 zo0Var, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = zo0Var;
        this.f36066a = dialog;
        this.f36067b = atomicReference;
        this.f36068c = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        float f10;
        zo0 zo0Var = this.d;
        ek0 ek0Var = zo0Var.A1;
        xo0 xo0Var = zo0Var.H1;
        org.telegram.ui.ActionBar.k kVar = zo0Var.f42999v2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.f36066a;
        if (longValue == (-dialog.f28496id)) {
            ArrayList arrayList = xo0Var.f42132f;
            AtomicReference atomicReference = this.f36067b;
            if ((arrayList == null && org.telegram.messenger.mp.u1(zo0Var.f30223a).f25864t7.l(-dialog.f28496id) != null) || atomicReference.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            xo0Var.f42132f = org.telegram.messenger.mp.u1(zo0Var.f30223a).f25864t7.l(-dialog.f28496id);
            xo0Var.d = org.telegram.messenger.n10.v(org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(dialog.f28496id)));
            xo0Var.f42131e = org.telegram.messenger.n10.w(org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(dialog.f28496id)));
            if (z10) {
                xo0Var.f();
            }
            if (xo0Var.f42132f != null) {
                org.telegram.messenger.ks.f(zo0Var.f30223a).n(this, org.telegram.messenger.ks.f25295t5);
            }
            if (z10) {
                ek0Var.setVisibility(0);
                ek0Var.setAlpha(0.0f);
                kVar.setVisibility(0);
                kVar.setAlpha(0.0f);
                if (org.telegram.messenger.n10.v(org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(dialog.f28496id)))) {
                    kVar.setTitle(org.telegram.messenger.n5.u(org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(dialog.f28496id))));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else if (org.telegram.messenger.v3.o0(zo0Var.f30223a, dialog.f28496id)) {
                    int i11 = zo0Var.f30223a;
                    kVar.setTitle(qg.c.j(i11, org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialog.f28496id)), false));
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745473, null));
                } else {
                    kVar.setTitle(org.telegram.messenger.mp.u1(zo0Var.f30223a).O0(Long.valueOf(-dialog.f28496id)).title);
                    kVar.setSubtitle(org.telegram.messenger.gd.N0(2131745453, null));
                }
                zo0Var.I2 = zo0Var.H2;
                r1.g gVar = zo0Var.f43003x2;
                if (gVar != null) {
                    gVar.d();
                }
                int[] iArr = new int[2];
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                r1.h hVar = new r1.h(1000.0f);
                org.telegram.ui.bn bnVar = zo0Var.f42971b2;
                if (bnVar != null && bnVar.f46132b) {
                    f10 = 10.0f;
                } else {
                    f10 = 800.0f;
                }
                hVar.b(f10);
                hVar.a(1.0f);
                gVar2.f56446m = hVar;
                zo0Var.f43003x2 = gVar2;
                gVar2.b(new tn0(this, this.f36068c, iArr, 1));
                zo0Var.f43003x2.a(new xa(this, 6));
                zo0Var.f43003x2.h();
                if (atomicReference.get() != null) {
                    org.telegram.messenger.g0.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
