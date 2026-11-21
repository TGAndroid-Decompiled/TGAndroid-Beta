package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ij0 extends oq0 {
    public final hk0 f48763a;

    public ij0(hk0 hk0Var) {
        this.f48763a = hk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.yv yvVar;
        hk0 hk0Var = this.f48763a;
        int i10 = hk0Var.T0;
        if (i10 == 1) {
            yvVar = hk0Var.f48438k1;
        } else if (i10 == 4) {
            yvVar = (org.telegram.messenger.yv) hk0Var.l1.get(i7);
        } else if (i10 == 2) {
            yvVar = hk0Var.f48440m1;
        } else if (i10 == 3) {
            yvVar = hk0Var.n1;
        } else {
            yvVar = (org.telegram.messenger.yv) hk0Var.f48436j1.get(i7);
        }
        fk0 fk0Var = (fk0) hk0Var.f48444o1.remove(yvVar);
        if (fk0Var == null) {
            return;
        }
        String r12 = hk0.r1(yvVar);
        int i11 = hk0Var.T0;
        String str = null;
        if (i11 == 1) {
            hk0Var.f48438k1 = null;
            str = p5.c.k("selfie", r12);
        } else if (i11 == 4) {
            str = p5.c.k("translation", r12);
        } else if (i11 == 2) {
            hk0Var.f48440m1 = null;
            str = p5.c.k("front", r12);
        } else if (i11 == 3) {
            hk0Var.n1 = null;
            str = p5.c.k("reverse", r12);
        } else if (i11 == 0) {
            str = p5.c.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = hk0Var.f48469y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = hk0Var.f48471z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        hk0Var.X1(hk0Var.T0);
        hk0Var.f48435j0.removeView(fk0Var);
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            hk0 hk0Var = this.f48763a;
            if (i7 < hk0Var.f48435j0.getChildCount()) {
                fk0 fk0Var = (fk0) hk0Var.f48435j0.getChildAt(i7);
                int[] iArr = new int[2];
                fk0Var.f47750c.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53494b = iArr[0];
                wq0Var.f53495c = iArr[1];
                wq0Var.d = hk0Var.f48435j0;
                ImageReceiver imageReceiver = fk0Var.f47750c.getImageReceiver();
                wq0Var.f53493a = imageReceiver;
                wq0Var.f53496e = imageReceiver.p();
                return wq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f48763a.T0 == 1) {
            return org.telegram.messenger.gd.a0("PassportDeleteSelfieAlert", null, 2131747387, new Object[0]);
        }
        return org.telegram.messenger.gd.a0("PassportDeleteScanAlert", null, 2131747389, new Object[0]);
    }
}
