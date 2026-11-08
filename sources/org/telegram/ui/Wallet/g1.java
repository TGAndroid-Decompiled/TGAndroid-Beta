package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class g1 implements c20 {
    public final a2 f42520a;
    public final boolean[] f42521b;
    public final fi.d f42522c;
    public final fi.d d;
    public final e2 f42523e;
    public final y2 f42524f;
    public final boolean[] f42525g;
    public final org.telegram.ui.ActionBar.f6 h;

    public g1(a2 a2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, e2 e2Var, y2 y2Var, boolean[] zArr2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42520a = a2Var;
        this.f42521b = zArr;
        this.f42522c = dVar;
        this.d = dVar2;
        this.f42523e = e2Var;
        this.f42524f = y2Var;
        this.f42525g = zArr2;
        this.h = f6Var;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f42520a;
        if (!a2Var.f42103m && !a2Var.f42104n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42521b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f42522c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42523e.f(a2Var, bool.booleanValue(), new m1(dVar2, dVar3, this.f42524f, this.f42525g, this.h, a2Var, zArr));
            }
        }
    }
}
