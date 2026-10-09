package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i1 implements Utilities.Callback {
    public final z1 f35022a;
    public final boolean[] f35023b;
    public final ci.d f35024c;
    public final ci.d d;
    public final d2 f35025e;
    public final h2 f35026f;
    public final boolean[] f35027g;
    public final org.telegram.ui.ActionBar.e6 h;

    public i1(z1 z1Var, boolean[] zArr, ci.d dVar, ci.d dVar2, d2 d2Var, h2 h2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35022a = z1Var;
        this.f35023b = zArr;
        this.f35024c = dVar;
        this.d = dVar2;
        this.f35025e = d2Var;
        this.f35026f = h2Var;
        this.f35027g = zArr2;
        this.h = e6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f35022a;
        if (!z1Var.f35730m && !z1Var.f35731n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f35023b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f35024c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f35025e.e(z1Var, bool.booleanValue(), new o1(dVar2, dVar3, this.f35026f, this.f35027g, this.h, z1Var, zArr));
            }
        }
    }
}
