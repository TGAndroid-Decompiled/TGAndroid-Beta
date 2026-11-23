package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gj0 extends oq0 {
    public final fk0 f48311a;

    public gj0(fk0 fk0Var) {
        this.f48311a = fk0Var;
    }

    @Override
    public final void B(int i7) {
        org.telegram.messenger.yv yvVar;
        fk0 fk0Var = this.f48311a;
        int i10 = fk0Var.T0;
        if (i10 == 1) {
            yvVar = fk0Var.f47877k1;
        } else if (i10 == 4) {
            yvVar = (org.telegram.messenger.yv) fk0Var.l1.get(i7);
        } else if (i10 == 2) {
            yvVar = fk0Var.f47879m1;
        } else if (i10 == 3) {
            yvVar = fk0Var.n1;
        } else {
            yvVar = (org.telegram.messenger.yv) fk0Var.f47875j1.get(i7);
        }
        dk0 dk0Var = (dk0) fk0Var.f47883o1.remove(yvVar);
        if (dk0Var == null) {
            return;
        }
        String r12 = fk0.r1(yvVar);
        int i11 = fk0Var.T0;
        String str = null;
        if (i11 == 1) {
            fk0Var.f47877k1 = null;
            str = p5.c.k("selfie", r12);
        } else if (i11 == 4) {
            str = p5.c.k("translation", r12);
        } else if (i11 == 2) {
            fk0Var.f47879m1 = null;
            str = p5.c.k("front", r12);
        } else if (i11 == 3) {
            fk0Var.n1 = null;
            str = p5.c.k("reverse", r12);
        } else if (i11 == 0) {
            str = p5.c.k("files", r12);
        }
        if (str != null) {
            HashMap hashMap = fk0Var.f47908y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = fk0Var.f47910z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        fk0Var.X1(fk0Var.T0);
        fk0Var.f47874j0.removeView(dk0Var);
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            fk0 fk0Var = this.f48311a;
            if (i7 < fk0Var.f47874j0.getChildCount()) {
                dk0 dk0Var = (dk0) fk0Var.f47874j0.getChildAt(i7);
                int[] iArr = new int[2];
                dk0Var.f47156c.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53727b = iArr[0];
                wq0Var.f53728c = iArr[1];
                wq0Var.d = fk0Var.f47874j0;
                ImageReceiver imageReceiver = dk0Var.f47156c.getImageReceiver();
                wq0Var.f53726a = imageReceiver;
                wq0Var.f53729e = imageReceiver.p();
                return wq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f48311a.T0 == 1) {
            return org.telegram.messenger.gd.a0("PassportDeleteSelfieAlert", null, 2131747387, new Object[0]);
        }
        return org.telegram.messenger.gd.a0("PassportDeleteScanAlert", null, 2131747389, new Object[0]);
    }
}
