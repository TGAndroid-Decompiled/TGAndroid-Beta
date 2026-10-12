package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i1 implements Utilities.Callback {
    public final z1 f33280a;
    public final boolean[] f33281b;
    public final di.d f33282c;
    public final di.d d;
    public final d2 e;
    public final h2 f33283f;
    public final boolean[] f33284g;
    public final org.telegram.ui.ActionBar.c6 h;

    public i1(z1 z1Var, boolean[] zArr, di.d dVar, di.d dVar2, d2 d2Var, h2 h2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f33280a = z1Var;
        this.f33281b = zArr;
        this.f33282c = dVar;
        this.d = dVar2;
        this.e = d2Var;
        this.f33283f = h2Var;
        this.f33284g = zArr2;
        this.h = c6Var;
    }

    @Override
    public final void run(Object obj) {
        di.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f33280a;
        if (!z1Var.f33909m && !z1Var.f33910n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f33281b;
            if (booleanValue || zArr[0]) {
                di.d dVar2 = this.f33282c;
                dVar2.setEnabled(false);
                di.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.e(z1Var, bool.booleanValue(), new o1(dVar2, dVar3, this.f33283f, this.f33284g, this.h, z1Var, zArr));
            }
        }
    }
}
