package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class o1 implements y10 {
    public final h2 f44692a;
    public final boolean[] f44693b;
    public final hi.d f44694c;
    public final hi.d d;
    public final l2 f44695e;
    public final d3 f44696f;
    public final boolean[] f44697g;
    public final org.telegram.ui.ActionBar.h6 h;

    public o1(h2 h2Var, boolean[] zArr, hi.d dVar, hi.d dVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f44692a = h2Var;
        this.f44693b = zArr;
        this.f44694c = dVar;
        this.d = dVar2;
        this.f44695e = l2Var;
        this.f44696f = d3Var;
        this.f44697g = zArr2;
        this.h = h6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.d dVar;
        Boolean bool = (Boolean) obj;
        h2 h2Var = this.f44692a;
        if (!h2Var.f44309m && !h2Var.f44310n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f44693b;
            if (booleanValue || zArr[0]) {
                hi.d dVar2 = this.f44694c;
                dVar2.setEnabled(false);
                hi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f44695e.f(h2Var, bool.booleanValue(), new u1(dVar2, dVar3, this.f44696f, this.f44697g, this.h, h2Var, zArr));
            }
        }
    }
}
