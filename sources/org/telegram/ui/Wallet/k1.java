package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k1 implements Utilities.Callback {
    public final b2 f35148a;
    public final boolean[] f35149b;
    public final ci.d f35150c;
    public final ci.d d;
    public final f2 f35151e;
    public final j2 f35152f;
    public final boolean[] f35153g;
    public final org.telegram.ui.ActionBar.d6 h;

    public k1(b2 b2Var, boolean[] zArr, ci.d dVar, ci.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f35148a = b2Var;
        this.f35149b = zArr;
        this.f35150c = dVar;
        this.d = dVar2;
        this.f35151e = f2Var;
        this.f35152f = j2Var;
        this.f35153g = zArr2;
        this.h = d6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f35148a;
        if (!b2Var.f34686m && !b2Var.f34687n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f35149b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f35150c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f35151e.e(b2Var, bool.booleanValue(), new q1(dVar2, dVar3, this.f35152f, this.f35153g, this.h, b2Var, zArr));
            }
        }
    }
}
