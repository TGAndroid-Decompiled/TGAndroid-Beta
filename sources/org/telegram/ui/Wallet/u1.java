package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.u60;
public final class u1 implements x10 {
    public final int f45146a = 1;
    public final hi.e f45147b;
    public final hi.e f45148c;
    public final d3 d;
    public final org.telegram.ui.ActionBar.h6 f45149e;
    public final h2 f45150f;
    public final Object f45151g;
    public final Object h;

    public u1(hi.e eVar, hi.e eVar2, l2 l2Var, h2 h2Var, d3 d3Var, org.telegram.ui.ActionBar.h6 h6Var, p pVar) {
        this.f45147b = eVar;
        this.f45148c = eVar2;
        this.f45151g = l2Var;
        this.f45150f = h2Var;
        this.d = d3Var;
        this.f45149e = h6Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        boolean z10;
        switch (this.f45146a) {
            case 0:
                l2 l2Var = (l2) this.f45151g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.e eVar2 = this.f45147b;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.f45148c;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                d3 d3Var = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f45149e;
                h2 h2Var = this.f45150f;
                l2Var.f(h2Var, booleanValue, new u60(eVar2, eVar3, d3Var, h6Var, pVar, h2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f45151g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.e eVar4 = this.f45147b;
                boolean z11 = false;
                eVar4.setLoading(false);
                hi.e eVar5 = this.f45148c;
                eVar5.setLoading(false);
                d3 d3Var2 = this.d;
                if (str == null) {
                    d3Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    lc.c0(str);
                    return;
                } else {
                    lc.d0(str, d3Var2.F, this.f45149e);
                    h2 h2Var2 = this.f45150f;
                    if (!h2Var2.f44340n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eVar4.setEnabled(z10);
                    if (!h2Var2.f44340n && !h2Var2.f44341o) {
                        z11 = true;
                    }
                    eVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public u1(hi.e eVar, hi.e eVar2, d3 d3Var, boolean[] zArr, org.telegram.ui.ActionBar.h6 h6Var, h2 h2Var, boolean[] zArr2) {
        this.f45147b = eVar;
        this.f45148c = eVar2;
        this.d = d3Var;
        this.f45151g = zArr;
        this.f45149e = h6Var;
        this.f45150f = h2Var;
        this.h = zArr2;
    }
}
