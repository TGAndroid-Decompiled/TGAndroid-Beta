package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cj0 extends nq0 {
    public final bk0 f44843a;

    public cj0(bk0 bk0Var) {
        this.f44843a = bk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.ew ewVar;
        bk0 bk0Var = this.f44843a;
        int i10 = bk0Var.S0;
        if (i10 == 1) {
            ewVar = bk0Var.f44383j1;
        } else if (i10 == 4) {
            ewVar = (org.telegram.messenger.ew) bk0Var.f44385k1.get(i7);
        } else if (i10 == 2) {
            ewVar = bk0Var.l1;
        } else if (i10 == 3) {
            ewVar = bk0Var.f44387m1;
        } else {
            ewVar = (org.telegram.messenger.ew) bk0Var.f44381i1.get(i7);
        }
        zj0 zj0Var = (zj0) bk0Var.n1.remove(ewVar);
        if (zj0Var == null) {
            return;
        }
        String r12 = bk0.r1(ewVar);
        int i11 = bk0Var.S0;
        String str = null;
        if (i11 == 1) {
            bk0Var.f44383j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            bk0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            bk0Var.f44387m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = bk0Var.f44413x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = bk0Var.f44416y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        bk0Var.X1(bk0Var.S0);
        bk0Var.f44380i0.removeView(zj0Var);
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            bk0 bk0Var = this.f44843a;
            if (i7 < bk0Var.f44380i0.getChildCount()) {
                zj0 zj0Var = (zj0) bk0Var.f44380i0.getChildAt(i7);
                int[] iArr = new int[2];
                zj0Var.f52599c.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f51477b = iArr[0];
                wq0Var.f51478c = iArr[1];
                wq0Var.d = bk0Var.f44380i0;
                ImageReceiver imageReceiver = zj0Var.f52599c.getImageReceiver();
                wq0Var.f51476a = imageReceiver;
                wq0Var.f51479e = imageReceiver.p();
                return wq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f44843a.S0 == 1) {
            return org.telegram.messenger.hd.a0("PassportDeleteSelfieAlert", null, 2131747580, new Object[0]);
        }
        return org.telegram.messenger.hd.a0("PassportDeleteScanAlert", null, 2131747582, new Object[0]);
    }
}
