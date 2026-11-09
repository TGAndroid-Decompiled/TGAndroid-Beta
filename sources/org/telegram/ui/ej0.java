package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ej0 extends pq0 {
    public final dk0 f45457a;

    public ej0(dk0 dk0Var) {
        this.f45457a = dk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.ew ewVar;
        dk0 dk0Var = this.f45457a;
        int i10 = dk0Var.S0;
        if (i10 == 1) {
            ewVar = dk0Var.f45015j1;
        } else if (i10 == 4) {
            ewVar = (org.telegram.messenger.ew) dk0Var.f45017k1.get(i7);
        } else if (i10 == 2) {
            ewVar = dk0Var.l1;
        } else if (i10 == 3) {
            ewVar = dk0Var.f45019m1;
        } else {
            ewVar = (org.telegram.messenger.ew) dk0Var.f45013i1.get(i7);
        }
        bk0 bk0Var = (bk0) dk0Var.n1.remove(ewVar);
        if (bk0Var == null) {
            return;
        }
        String r12 = dk0.r1(ewVar);
        int i11 = dk0Var.S0;
        String str = null;
        if (i11 == 1) {
            dk0Var.f45015j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            dk0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            dk0Var.f45019m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = dk0Var.f45045x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = dk0Var.f45048y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        dk0Var.X1(dk0Var.S0);
        dk0Var.f45012i0.removeView(bk0Var);
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            dk0 dk0Var = this.f45457a;
            if (i7 < dk0Var.f45012i0.getChildCount()) {
                bk0 bk0Var = (bk0) dk0Var.f45012i0.getChildAt(i7);
                int[] iArr = new int[2];
                bk0Var.f44062c.getLocationInWindow(iArr);
                yq0 yq0Var = new yq0();
                yq0Var.f52160b = iArr[0];
                yq0Var.f52161c = iArr[1];
                yq0Var.d = dk0Var.f45012i0;
                ImageReceiver imageReceiver = bk0Var.f44062c.getImageReceiver();
                yq0Var.f52159a = imageReceiver;
                yq0Var.f52162e = imageReceiver.p();
                return yq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f45457a.S0 == 1) {
            return org.telegram.messenger.id.a0("PassportDeleteSelfieAlert", null, 2131747581, new Object[0]);
        }
        return org.telegram.messenger.id.a0("PassportDeleteScanAlert", null, 2131747583, new Object[0]);
    }
}
