package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fj0 extends qq0 {
    public final ek0 f45786a;

    public fj0(ek0 ek0Var) {
        this.f45786a = ek0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.ew ewVar;
        ek0 ek0Var = this.f45786a;
        int i10 = ek0Var.S0;
        if (i10 == 1) {
            ewVar = ek0Var.f45339j1;
        } else if (i10 == 4) {
            ewVar = (org.telegram.messenger.ew) ek0Var.f45341k1.get(i7);
        } else if (i10 == 2) {
            ewVar = ek0Var.l1;
        } else if (i10 == 3) {
            ewVar = ek0Var.f45343m1;
        } else {
            ewVar = (org.telegram.messenger.ew) ek0Var.f45337i1.get(i7);
        }
        ck0 ck0Var = (ck0) ek0Var.n1.remove(ewVar);
        if (ck0Var == null) {
            return;
        }
        String r12 = ek0.r1(ewVar);
        int i11 = ek0Var.S0;
        String str = null;
        if (i11 == 1) {
            ek0Var.f45339j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            ek0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            ek0Var.f45343m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = ek0Var.f45369x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ek0Var.f45372y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ek0Var.X1(ek0Var.S0);
        ek0Var.f45336i0.removeView(ck0Var);
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            ek0 ek0Var = this.f45786a;
            if (i7 < ek0Var.f45336i0.getChildCount()) {
                ck0 ck0Var = (ck0) ek0Var.f45336i0.getChildAt(i7);
                int[] iArr = new int[2];
                ck0Var.f44393c.getLocationInWindow(iArr);
                zq0 zq0Var = new zq0();
                zq0Var.f52504b = iArr[0];
                zq0Var.f52505c = iArr[1];
                zq0Var.d = ek0Var.f45336i0;
                ImageReceiver imageReceiver = ck0Var.f44393c.getImageReceiver();
                zq0Var.f52503a = imageReceiver;
                zq0Var.f52506e = imageReceiver.p();
                return zq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f45786a.S0 == 1) {
            return org.telegram.messenger.id.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]);
        }
        return org.telegram.messenger.id.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
