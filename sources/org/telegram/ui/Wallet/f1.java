package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class f1 implements c20 {
    public final z1 f42438a;
    public final boolean[] f42439b;
    public final fi.d f42440c;
    public final fi.d d;
    public final d2 f42441e;
    public final x2 f42442f;
    public final boolean[] f42443g;
    public final org.telegram.ui.ActionBar.g6 h;

    public f1(z1 z1Var, boolean[] zArr, fi.d dVar, fi.d dVar2, d2 d2Var, x2 x2Var, boolean[] zArr2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42438a = z1Var;
        this.f42439b = zArr;
        this.f42440c = dVar;
        this.d = dVar2;
        this.f42441e = d2Var;
        this.f42442f = x2Var;
        this.f42443g = zArr2;
        this.h = g6Var;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f42438a;
        if (!z1Var.f43415m && !z1Var.f43416n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42439b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f42440c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42441e.f(z1Var, bool.booleanValue(), new l1(dVar2, dVar3, this.f42442f, this.f42443g, this.h, z1Var, zArr));
            }
        }
    }
}
