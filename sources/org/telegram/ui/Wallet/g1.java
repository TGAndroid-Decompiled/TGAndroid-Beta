package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
public final class g1 implements r20 {
    public final a2 f34535a;
    public final boolean[] f34536b;
    public final vh.d f34537c;
    public final vh.d d;
    public final e2 e;
    public final z2 f34538f;
    public final boolean[] f34539g;
    public final org.telegram.ui.ActionBar.p6 h;

    public g1(a2 a2Var, boolean[] zArr, vh.d dVar, vh.d dVar2, e2 e2Var, z2 z2Var, boolean[] zArr2, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f34535a = a2Var;
        this.f34536b = zArr;
        this.f34537c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f34538f = z2Var;
        this.f34539g = zArr2;
        this.h = p6Var;
    }

    @Override
    public final void a(Object obj) {
        vh.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f34535a;
        if (!a2Var.f34178m && !a2Var.f34179n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34536b;
            if (booleanValue || zArr[0]) {
                vh.d dVar2 = this.f34537c;
                dVar2.setEnabled(false);
                vh.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.f(a2Var, bool.booleanValue(), new m1(dVar2, dVar3, this.f34538f, this.f34539g, this.h, a2Var, zArr));
            }
        }
    }
}
