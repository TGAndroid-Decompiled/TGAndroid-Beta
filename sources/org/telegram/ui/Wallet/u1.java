package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.u60;
public final class u1 implements y10 {
    public final int f45150a = 1;
    public final hi.e f45151b;
    public final hi.e f45152c;
    public final d3 d;
    public final org.telegram.ui.ActionBar.h6 f45153e;
    public final h2 f45154f;
    public final Object f45155g;
    public final Object h;

    public u1(hi.e eVar, hi.e eVar2, l2 l2Var, h2 h2Var, d3 d3Var, org.telegram.ui.ActionBar.h6 h6Var, p pVar) {
        this.f45151b = eVar;
        this.f45152c = eVar2;
        this.f45155g = l2Var;
        this.f45154f = h2Var;
        this.d = d3Var;
        this.f45153e = h6Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        boolean z10;
        switch (this.f45150a) {
            case 0:
                l2 l2Var = (l2) this.f45155g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.e eVar2 = this.f45151b;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.f45152c;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                d3 d3Var = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f45153e;
                h2 h2Var = this.f45154f;
                l2Var.f(h2Var, booleanValue, new u60(eVar2, eVar3, d3Var, h6Var, pVar, h2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f45155g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.e eVar4 = this.f45151b;
                boolean z11 = false;
                eVar4.setLoading(false);
                hi.e eVar5 = this.f45152c;
                eVar5.setLoading(false);
                d3 d3Var2 = this.d;
                if (str == null) {
                    d3Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    lc.c0(str);
                    return;
                } else {
                    lc.d0(str, d3Var2.F, this.f45153e);
                    h2 h2Var2 = this.f45154f;
                    if (!h2Var2.f44344n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eVar4.setEnabled(z10);
                    if (!h2Var2.f44344n && !h2Var2.f44345o) {
                        z11 = true;
                    }
                    eVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public u1(hi.e eVar, hi.e eVar2, d3 d3Var, boolean[] zArr, org.telegram.ui.ActionBar.h6 h6Var, h2 h2Var, boolean[] zArr2) {
        this.f45151b = eVar;
        this.f45152c = eVar2;
        this.d = d3Var;
        this.f45155g = zArr;
        this.f45153e = h6Var;
        this.f45154f = h2Var;
        this.h = zArr2;
    }
}
