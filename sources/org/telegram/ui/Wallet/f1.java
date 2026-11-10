package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class f1 implements c20 {
    public final z1 f42486a;
    public final boolean[] f42487b;
    public final fi.d f42488c;
    public final fi.d d;
    public final d2 f42489e;
    public final x2 f42490f;
    public final boolean[] f42491g;
    public final org.telegram.ui.ActionBar.h6 h;

    public f1(z1 z1Var, boolean[] zArr, fi.d dVar, fi.d dVar2, d2 d2Var, x2 x2Var, boolean[] zArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f42486a = z1Var;
        this.f42487b = zArr;
        this.f42488c = dVar;
        this.d = dVar2;
        this.f42489e = d2Var;
        this.f42490f = x2Var;
        this.f42491g = zArr2;
        this.h = h6Var;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f42486a;
        if (!z1Var.f43422m && !z1Var.f43423n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42487b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f42488c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42489e.f(z1Var, bool.booleanValue(), new l1(dVar2, dVar3, this.f42490f, this.f42491g, this.h, z1Var, zArr));
            }
        }
    }
}
