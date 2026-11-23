package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ij0 extends pq0 {
    public final hk0 f48749a;

    public ij0(hk0 hk0Var) {
        this.f48749a = hk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.zv zvVar;
        hk0 hk0Var = this.f48749a;
        int i10 = hk0Var.T0;
        if (i10 == 1) {
            zvVar = hk0Var.f48406k1;
        } else if (i10 == 4) {
            zvVar = (org.telegram.messenger.zv) hk0Var.l1.get(i7);
        } else if (i10 == 2) {
            zvVar = hk0Var.f48408m1;
        } else if (i10 == 3) {
            zvVar = hk0Var.n1;
        } else {
            zvVar = (org.telegram.messenger.zv) hk0Var.f48404j1.get(i7);
        }
        fk0 fk0Var = (fk0) hk0Var.f48412o1.remove(zvVar);
        if (fk0Var == null) {
            return;
        }
        String r12 = hk0.r1(zvVar);
        int i11 = hk0Var.T0;
        String str = null;
        if (i11 == 1) {
            hk0Var.f48406k1 = null;
            str = p5.c.k("selfie", r12);
        } else if (i11 == 4) {
            str = p5.c.k("translation", r12);
        } else if (i11 == 2) {
            hk0Var.f48408m1 = null;
            str = p5.c.k("front", r12);
        } else if (i11 == 3) {
            hk0Var.n1 = null;
            str = p5.c.k("reverse", r12);
        } else if (i11 == 0) {
            str = p5.c.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = hk0Var.f48437y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = hk0Var.f48439z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        hk0Var.X1(hk0Var.T0);
        hk0Var.f48403j0.removeView(fk0Var);
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            hk0 hk0Var = this.f48749a;
            if (i7 < hk0Var.f48403j0.getChildCount()) {
                fk0 fk0Var = (fk0) hk0Var.f48403j0.getChildAt(i7);
                int[] iArr = new int[2];
                fk0Var.f47722c.getLocationInWindow(iArr);
                xq0 xq0Var = new xq0();
                xq0Var.f53899b = iArr[0];
                xq0Var.f53900c = iArr[1];
                xq0Var.d = hk0Var.f48403j0;
                ImageReceiver imageReceiver = fk0Var.f47722c.getImageReceiver();
                xq0Var.f53898a = imageReceiver;
                xq0Var.f53901e = imageReceiver.p();
                return xq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f48749a.T0 == 1) {
            return org.telegram.messenger.hd.a0("PassportDeleteSelfieAlert", null, 2131747387, new Object[0]);
        }
        return org.telegram.messenger.hd.a0("PassportDeleteScanAlert", null, 2131747389, new Object[0]);
    }
}
