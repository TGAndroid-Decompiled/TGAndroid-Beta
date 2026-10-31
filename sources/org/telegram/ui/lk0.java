package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lk0 extends yr0 {
    public final ll0 f39256a;

    public lk0(ll0 ll0Var) {
        this.f39256a = ll0Var;
    }

    @Override
    public final void B(int i10) {
        org.telegram.messenger.pw pwVar;
        ll0 ll0Var = this.f39256a;
        int i11 = ll0Var.S0;
        if (i11 == 1) {
            pwVar = ll0Var.f39280j1;
        } else if (i11 == 4) {
            pwVar = (org.telegram.messenger.pw) ll0Var.f39282k1.get(i10);
        } else if (i11 == 2) {
            pwVar = ll0Var.l1;
        } else if (i11 == 3) {
            pwVar = ll0Var.f39284m1;
        } else {
            pwVar = (org.telegram.messenger.pw) ll0Var.f39278i1.get(i10);
        }
        jl0 jl0Var = (jl0) ll0Var.f39287n1.remove(pwVar);
        if (jl0Var == null) {
            return;
        }
        String q12 = ll0.q1(pwVar);
        int i12 = ll0Var.S0;
        String str = null;
        if (i12 == 1) {
            ll0Var.f39280j1 = null;
            str = sc.e.h("selfie", q12);
        } else if (i12 == 4) {
            str = sc.e.h("translation", q12);
        } else if (i12 == 2) {
            ll0Var.l1 = null;
            str = sc.e.h("front", q12);
        } else if (i12 == 3) {
            ll0Var.f39284m1 = null;
            str = sc.e.h("reverse", q12);
        } else if (i12 == 0) {
            str = sc.e.h("files", q12);
        }
        if (str != null) {
            HashMap hashMap = ll0Var.f39311x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = ll0Var.f39314y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        ll0Var.W1(ll0Var.S0);
        ll0Var.f39277i0.removeView(jl0Var);
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            ll0 ll0Var = this.f39256a;
            if (i10 < ll0Var.f39277i0.getChildCount()) {
                jl0 jl0Var = (jl0) ll0Var.f39277i0.getChildAt(i10);
                int[] iArr = new int[2];
                jl0Var.f38546c.getLocationInWindow(iArr);
                gs0 gs0Var = new gs0();
                gs0Var.f37628b = iArr[0];
                gs0Var.f37629c = iArr[1];
                gs0Var.d = ll0Var.f39277i0;
                ImageReceiver imageReceiver = jl0Var.f38546c.getImageReceiver();
                gs0Var.f37627a = imageReceiver;
                gs0Var.e = imageReceiver.p();
                return gs0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f39256a.S0 == 1) {
            return org.telegram.messenger.cd.a0("PassportDeleteSelfieAlert", null, 2131747597, new Object[0]);
        }
        return org.telegram.messenger.cd.a0("PassportDeleteScanAlert", null, 2131747599, new Object[0]);
    }
}
