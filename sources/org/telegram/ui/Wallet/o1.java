package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class o1 implements x10 {
    public final h2 f44682a;
    public final boolean[] f44683b;
    public final hi.d f44684c;
    public final hi.d d;
    public final l2 f44685e;
    public final d3 f44686f;
    public final boolean[] f44687g;
    public final org.telegram.ui.ActionBar.i6 h;

    public o1(h2 h2Var, boolean[] zArr, hi.d dVar, hi.d dVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f44682a = h2Var;
        this.f44683b = zArr;
        this.f44684c = dVar;
        this.d = dVar2;
        this.f44685e = l2Var;
        this.f44686f = d3Var;
        this.f44687g = zArr2;
        this.h = i6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.d dVar;
        Boolean bool = (Boolean) obj;
        h2 h2Var = this.f44682a;
        if (!h2Var.f44299m && !h2Var.f44300n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f44683b;
            if (booleanValue || zArr[0]) {
                hi.d dVar2 = this.f44684c;
                dVar2.setEnabled(false);
                hi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f44685e.f(h2Var, bool.booleanValue(), new u1(dVar2, dVar3, this.f44686f, this.f44687g, this.h, h2Var, zArr));
            }
        }
    }
}
