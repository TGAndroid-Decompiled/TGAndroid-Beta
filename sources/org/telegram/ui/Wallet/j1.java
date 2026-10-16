package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j1 implements Utilities.Callback {
    public final a2 f33053a;
    public final boolean[] f33054b;
    public final di.d f33055c;
    public final di.d d;
    public final e2 e;
    public final i2 f33056f;
    public final boolean[] f33057g;
    public final org.telegram.ui.ActionBar.c6 h;

    public j1(a2 a2Var, boolean[] zArr, di.d dVar, di.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f33053a = a2Var;
        this.f33054b = zArr;
        this.f33055c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f33056f = i2Var;
        this.f33057g = zArr2;
        this.h = c6Var;
    }

    @Override
    public final void run(Object obj) {
        di.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f33053a;
        if (!a2Var.f32626m && !a2Var.f32627n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f33054b;
            if (booleanValue || zArr[0]) {
                di.d dVar2 = this.f33055c;
                dVar2.setEnabled(false);
                di.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.e(a2Var, bool.booleanValue(), new p1(dVar2, dVar3, this.f33056f, this.f33057g, this.h, a2Var, zArr));
            }
        }
    }
}
