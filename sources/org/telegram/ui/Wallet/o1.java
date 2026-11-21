package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class o1 implements x10 {
    public final h2 f44722a;
    public final boolean[] f44723b;
    public final hi.e f44724c;
    public final hi.e d;
    public final l2 f44725e;
    public final d3 f44726f;
    public final boolean[] f44727g;
    public final org.telegram.ui.ActionBar.h6 h;

    public o1(h2 h2Var, boolean[] zArr, hi.e eVar, hi.e eVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f44722a = h2Var;
        this.f44723b = zArr;
        this.f44724c = eVar;
        this.d = eVar2;
        this.f44725e = l2Var;
        this.f44726f = d3Var;
        this.f44727g = zArr2;
        this.h = h6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        Boolean bool = (Boolean) obj;
        h2 h2Var = this.f44722a;
        if (!h2Var.f44339m && !h2Var.f44340n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f44723b;
            if (booleanValue || zArr[0]) {
                hi.e eVar2 = this.f44724c;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.d;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                this.f44725e.f(h2Var, bool.booleanValue(), new u1(eVar2, eVar3, this.f44726f, this.f44727g, this.h, h2Var, zArr));
            }
        }
    }
}
