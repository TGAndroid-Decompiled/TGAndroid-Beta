package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k1 implements Utilities.Callback {
    public final b2 f34419a;
    public final boolean[] f34420b;
    public final ei.d f34421c;
    public final ei.d d;
    public final f2 e;
    public final j2 f34422f;
    public final boolean[] f34423g;
    public final org.telegram.ui.ActionBar.d6 h;

    public k1(b2 b2Var, boolean[] zArr, ei.d dVar, ei.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f34419a = b2Var;
        this.f34420b = zArr;
        this.f34421c = dVar;
        this.d = dVar2;
        this.e = f2Var;
        this.f34422f = j2Var;
        this.f34423g = zArr2;
        this.h = d6Var;
    }

    @Override
    public final void run(Object obj) {
        ei.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f34419a;
        if (!b2Var.f34029m && !b2Var.f34030n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34420b;
            if (booleanValue || zArr[0]) {
                ei.d dVar2 = this.f34421c;
                dVar2.setEnabled(false);
                ei.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.e(b2Var, bool.booleanValue(), new q1(dVar2, dVar3, this.f34422f, this.f34423g, this.h, b2Var, zArr));
            }
        }
    }
}
