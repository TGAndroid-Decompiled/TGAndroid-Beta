package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.u60;
public final class u1 implements y10 {
    public final int f45116a = 1;
    public final hi.d f45117b;
    public final hi.d f45118c;
    public final d3 d;
    public final org.telegram.ui.ActionBar.h6 f45119e;
    public final h2 f45120f;
    public final Object f45121g;
    public final Object h;

    public u1(hi.d dVar, hi.d dVar2, l2 l2Var, h2 h2Var, d3 d3Var, org.telegram.ui.ActionBar.h6 h6Var, p pVar) {
        this.f45117b = dVar;
        this.f45118c = dVar2;
        this.f45121g = l2Var;
        this.f45120f = h2Var;
        this.d = d3Var;
        this.f45119e = h6Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        hi.d dVar;
        boolean z10;
        switch (this.f45116a) {
            case 0:
                l2 l2Var = (l2) this.f45121g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.d dVar2 = this.f45117b;
                dVar2.setEnabled(false);
                hi.d dVar3 = this.f45118c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                d3 d3Var = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f45119e;
                h2 h2Var = this.f45120f;
                l2Var.f(h2Var, booleanValue, new u60(dVar2, dVar3, d3Var, h6Var, pVar, h2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f45121g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.d dVar4 = this.f45117b;
                boolean z11 = false;
                dVar4.setLoading(false);
                hi.d dVar5 = this.f45118c;
                dVar5.setLoading(false);
                d3 d3Var2 = this.d;
                if (str == null) {
                    d3Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    lc.c0(str);
                    return;
                } else {
                    lc.d0(str, d3Var2.F, this.f45119e);
                    h2 h2Var2 = this.f45120f;
                    if (!h2Var2.f44310n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!h2Var2.f44310n && !h2Var2.f44311o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public u1(hi.d dVar, hi.d dVar2, d3 d3Var, boolean[] zArr, org.telegram.ui.ActionBar.h6 h6Var, h2 h2Var, boolean[] zArr2) {
        this.f45117b = dVar;
        this.f45118c = dVar2;
        this.d = d3Var;
        this.f45121g = zArr;
        this.f45119e = h6Var;
        this.f45120f = h2Var;
        this.h = zArr2;
    }
}
