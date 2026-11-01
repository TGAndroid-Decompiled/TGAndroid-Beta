package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jk0 extends xr0 {
    public final jl0 f38405a;

    public jk0(jl0 jl0Var) {
        this.f38405a = jl0Var;
    }

    @Override
    public final void B(int i10) {
        org.telegram.messenger.qw qwVar;
        jl0 jl0Var = this.f38405a;
        int i11 = jl0Var.S0;
        if (i11 == 1) {
            qwVar = jl0Var.f38432j1;
        } else if (i11 == 4) {
            qwVar = (org.telegram.messenger.qw) jl0Var.f38434k1.get(i10);
        } else if (i11 == 2) {
            qwVar = jl0Var.l1;
        } else if (i11 == 3) {
            qwVar = jl0Var.f38436m1;
        } else {
            qwVar = (org.telegram.messenger.qw) jl0Var.f38430i1.get(i10);
        }
        hl0 hl0Var = (hl0) jl0Var.f38439n1.remove(qwVar);
        if (hl0Var == null) {
            return;
        }
        String r12 = jl0.r1(qwVar);
        int i12 = jl0Var.S0;
        String str = null;
        if (i12 == 1) {
            jl0Var.f38432j1 = null;
            str = sc.e.h("selfie", r12);
        } else if (i12 == 4) {
            str = sc.e.h("translation", r12);
        } else if (i12 == 2) {
            jl0Var.l1 = null;
            str = sc.e.h("front", r12);
        } else if (i12 == 3) {
            jl0Var.f38436m1 = null;
            str = sc.e.h("reverse", r12);
        } else if (i12 == 0) {
            str = sc.e.h("files", r12);
        }
        if (str != null) {
            HashMap hashMap = jl0Var.f38463x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = jl0Var.f38466y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        jl0Var.X1(jl0Var.S0);
        jl0Var.f38429i0.removeView(hl0Var);
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            jl0 jl0Var = this.f38405a;
            if (i10 < jl0Var.f38429i0.getChildCount()) {
                hl0 hl0Var = (hl0) jl0Var.f38429i0.getChildAt(i10);
                int[] iArr = new int[2];
                hl0Var.f37831c.getLocationInWindow(iArr);
                fs0 fs0Var = new fs0();
                fs0Var.f37216b = iArr[0];
                fs0Var.f37217c = iArr[1];
                fs0Var.d = jl0Var.f38429i0;
                ImageReceiver imageReceiver = hl0Var.f37831c.getImageReceiver();
                fs0Var.f37215a = imageReceiver;
                fs0Var.e = imageReceiver.p();
                return fs0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f38405a.S0 == 1) {
            return org.telegram.messenger.dd.a0("PassportDeleteSelfieAlert", null, 2131747597, new Object[0]);
        }
        return org.telegram.messenger.dd.a0("PassportDeleteScanAlert", null, 2131747599, new Object[0]);
    }
}
