package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k1 implements Utilities.Callback {
    public final b2 f34956a;
    public final boolean[] f34957b;
    public final ci.d f34958c;
    public final ci.d d;
    public final f2 f34959e;
    public final j2 f34960f;
    public final boolean[] f34961g;
    public final org.telegram.ui.ActionBar.c6 h;

    public k1(b2 b2Var, boolean[] zArr, ci.d dVar, ci.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34956a = b2Var;
        this.f34957b = zArr;
        this.f34958c = dVar;
        this.d = dVar2;
        this.f34959e = f2Var;
        this.f34960f = j2Var;
        this.f34961g = zArr2;
        this.h = c6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f34956a;
        if (!b2Var.f34495m && !b2Var.f34496n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34957b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f34958c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f34959e.e(b2Var, bool.booleanValue(), new q1(dVar2, dVar3, this.f34960f, this.f34961g, this.h, b2Var, zArr));
            }
        }
    }
}
