package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fj0 extends mq0 {
    public final ek0 f47134a;

    public fj0(ek0 ek0Var) {
        this.f47134a = ek0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.cw cwVar;
        ek0 ek0Var = this.f47134a;
        int i10 = ek0Var.T0;
        if (i10 == 1) {
            cwVar = ek0Var.f46818k1;
        } else if (i10 == 4) {
            cwVar = (org.telegram.messenger.cw) ek0Var.l1.get(i7);
        } else if (i10 == 2) {
            cwVar = ek0Var.f46820m1;
        } else if (i10 == 3) {
            cwVar = ek0Var.n1;
        } else {
            cwVar = (org.telegram.messenger.cw) ek0Var.f46816j1.get(i7);
        }
        ck0 ck0Var = (ck0) ek0Var.f46824o1.remove(cwVar);
        if (ck0Var == null) {
            return;
        }
        String r12 = ek0.r1(cwVar);
        int i11 = ek0Var.T0;
        String str = null;
        if (i11 == 1) {
            ek0Var.f46818k1 = null;
            str = r.b.k("selfie", r12);
        } else if (i11 == 4) {
            str = r.b.k("translation", r12);
        } else if (i11 == 2) {
            ek0Var.f46820m1 = null;
            str = r.b.k("front", r12);
        } else if (i11 == 3) {
            ek0Var.n1 = null;
            str = r.b.k("reverse", r12);
        } else if (i11 == 0) {
            str = r.b.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = ek0Var.f46849y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ek0Var.f46851z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ek0Var.X1(ek0Var.T0);
        ek0Var.f46815j0.removeView(ck0Var);
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            ek0 ek0Var = this.f47134a;
            if (i7 < ek0Var.f46815j0.getChildCount()) {
                ck0 ck0Var = (ck0) ek0Var.f46815j0.getChildAt(i7);
                int[] iArr = new int[2];
                ck0Var.f46170c.getLocationInWindow(iArr);
                uq0 uq0Var = new uq0();
                uq0Var.f51998b = iArr[0];
                uq0Var.f51999c = iArr[1];
                uq0Var.d = ek0Var.f46815j0;
                ImageReceiver imageReceiver = ck0Var.f46170c.getImageReceiver();
                uq0Var.f51997a = imageReceiver;
                uq0Var.f52000e = imageReceiver.p();
                return uq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f47134a.T0 == 1) {
            return org.telegram.messenger.hd.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]);
        }
        return org.telegram.messenger.hd.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
