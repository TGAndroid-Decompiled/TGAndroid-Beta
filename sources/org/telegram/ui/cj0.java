package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cj0 extends mq0 {
    public final bk0 f44823a;

    public cj0(bk0 bk0Var) {
        this.f44823a = bk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.ew ewVar;
        bk0 bk0Var = this.f44823a;
        int i10 = bk0Var.S0;
        if (i10 == 1) {
            ewVar = bk0Var.f44368j1;
        } else if (i10 == 4) {
            ewVar = (org.telegram.messenger.ew) bk0Var.f44370k1.get(i7);
        } else if (i10 == 2) {
            ewVar = bk0Var.l1;
        } else if (i10 == 3) {
            ewVar = bk0Var.f44372m1;
        } else {
            ewVar = (org.telegram.messenger.ew) bk0Var.f44366i1.get(i7);
        }
        zj0 zj0Var = (zj0) bk0Var.n1.remove(ewVar);
        if (zj0Var == null) {
            return;
        }
        String r12 = bk0.r1(ewVar);
        int i11 = bk0Var.S0;
        String str = null;
        if (i11 == 1) {
            bk0Var.f44368j1 = null;
            str = rf.b.i("selfie", r12);
        } else if (i11 == 4) {
            str = rf.b.i("translation", r12);
        } else if (i11 == 2) {
            bk0Var.l1 = null;
            str = rf.b.i("front", r12);
        } else if (i11 == 3) {
            bk0Var.f44372m1 = null;
            str = rf.b.i("reverse", r12);
        } else if (i11 == 0) {
            str = rf.b.i("files", r12);
        }
        if (str != null) {
            HashMap hashMap = bk0Var.f44398x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = bk0Var.f44401y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        bk0Var.X1(bk0Var.S0);
        bk0Var.f44365i0.removeView(zj0Var);
    }

    @Override
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            bk0 bk0Var = this.f44823a;
            if (i7 < bk0Var.f44365i0.getChildCount()) {
                zj0 zj0Var = (zj0) bk0Var.f44365i0.getChildAt(i7);
                int[] iArr = new int[2];
                zj0Var.f52594c.getLocationInWindow(iArr);
                vq0 vq0Var = new vq0();
                vq0Var.f50791b = iArr[0];
                vq0Var.f50792c = iArr[1];
                vq0Var.d = bk0Var.f44365i0;
                ImageReceiver imageReceiver = zj0Var.f52594c.getImageReceiver();
                vq0Var.f50790a = imageReceiver;
                vq0Var.f50793e = imageReceiver.p();
                return vq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f44823a.S0 == 1) {
            return org.telegram.messenger.hd.a0("PassportDeleteSelfieAlert", null, 2131747580, new Object[0]);
        }
        return org.telegram.messenger.hd.a0("PassportDeleteScanAlert", null, 2131747582, new Object[0]);
    }
}
