package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j1 implements Utilities.Callback {
    public final a2 f34635a;
    public final boolean[] f34636b;
    public final ei.d f34637c;
    public final ei.d d;
    public final e2 e;
    public final i2 f34638f;
    public final boolean[] f34639g;
    public final org.telegram.ui.ActionBar.g6 h;

    public j1(a2 a2Var, boolean[] zArr, ei.d dVar, ei.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f34635a = a2Var;
        this.f34636b = zArr;
        this.f34637c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f34638f = i2Var;
        this.f34639g = zArr2;
        this.h = g6Var;
    }

    @Override
    public final void run(Object obj) {
        ei.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f34635a;
        if (!a2Var.f34281m && !a2Var.f34282n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34636b;
            if (booleanValue || zArr[0]) {
                ei.d dVar2 = this.f34637c;
                dVar2.setEnabled(false);
                ei.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.e(a2Var, bool.booleanValue(), new p1(dVar2, dVar3, this.f34638f, this.f34639g, this.h, a2Var, zArr));
            }
        }
    }
}
