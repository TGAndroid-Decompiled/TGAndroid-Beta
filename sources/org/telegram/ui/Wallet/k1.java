package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k1 implements Utilities.Callback {
    public final b2 f35182a;
    public final boolean[] f35183b;
    public final ci.d f35184c;
    public final ci.d d;
    public final f2 f35185e;
    public final j2 f35186f;
    public final boolean[] f35187g;
    public final org.telegram.ui.ActionBar.d6 h;

    public k1(b2 b2Var, boolean[] zArr, ci.d dVar, ci.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f35182a = b2Var;
        this.f35183b = zArr;
        this.f35184c = dVar;
        this.d = dVar2;
        this.f35185e = f2Var;
        this.f35186f = j2Var;
        this.f35187g = zArr2;
        this.h = d6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f35182a;
        if (!b2Var.f34720m && !b2Var.f34721n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f35183b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f35184c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f35185e.e(b2Var, bool.booleanValue(), new q1(dVar2, dVar3, this.f35186f, this.f35187g, this.h, b2Var, zArr));
            }
        }
    }
}
