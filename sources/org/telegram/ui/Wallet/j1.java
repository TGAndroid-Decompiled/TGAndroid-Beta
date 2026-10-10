package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j1 implements Utilities.Callback {
    public final a2 f35118a;
    public final boolean[] f35119b;
    public final ci.d f35120c;
    public final ci.d d;
    public final e2 f35121e;
    public final i2 f35122f;
    public final boolean[] f35123g;
    public final org.telegram.ui.ActionBar.e6 h;

    public j1(a2 a2Var, boolean[] zArr, ci.d dVar, ci.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35118a = a2Var;
        this.f35119b = zArr;
        this.f35120c = dVar;
        this.d = dVar2;
        this.f35121e = e2Var;
        this.f35122f = i2Var;
        this.f35123g = zArr2;
        this.h = e6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f35118a;
        if (!a2Var.f34658m && !a2Var.f34659n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f35119b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f35120c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f35121e.e(a2Var, bool.booleanValue(), new p1(dVar2, dVar3, this.f35122f, this.f35123g, this.h, a2Var, zArr));
            }
        }
    }
}
