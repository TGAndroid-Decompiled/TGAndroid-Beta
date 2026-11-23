package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class o1 implements y10 {
    public final h2 f44726a;
    public final boolean[] f44727b;
    public final hi.e f44728c;
    public final hi.e d;
    public final l2 f44729e;
    public final d3 f44730f;
    public final boolean[] f44731g;
    public final org.telegram.ui.ActionBar.h6 h;

    public o1(h2 h2Var, boolean[] zArr, hi.e eVar, hi.e eVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f44726a = h2Var;
        this.f44727b = zArr;
        this.f44728c = eVar;
        this.d = eVar2;
        this.f44729e = l2Var;
        this.f44730f = d3Var;
        this.f44731g = zArr2;
        this.h = h6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        Boolean bool = (Boolean) obj;
        h2 h2Var = this.f44726a;
        if (!h2Var.f44343m && !h2Var.f44344n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f44727b;
            if (booleanValue || zArr[0]) {
                hi.e eVar2 = this.f44728c;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.d;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                this.f44729e.f(h2Var, bool.booleanValue(), new u1(eVar2, eVar3, this.f44730f, this.f44731g, this.h, h2Var, zArr));
            }
        }
    }
}
