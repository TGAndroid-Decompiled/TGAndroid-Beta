package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class h1 implements c20 {
    public final b2 f42549a;
    public final boolean[] f42550b;
    public final fi.d f42551c;
    public final fi.d d;
    public final f2 f42552e;
    public final z2 f42553f;
    public final boolean[] f42554g;
    public final org.telegram.ui.ActionBar.f6 h;

    public h1(b2 b2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, f2 f2Var, z2 z2Var, boolean[] zArr2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42549a = b2Var;
        this.f42550b = zArr;
        this.f42551c = dVar;
        this.d = dVar2;
        this.f42552e = f2Var;
        this.f42553f = z2Var;
        this.f42554g = zArr2;
        this.h = f6Var;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f42549a;
        if (!b2Var.f42131m && !b2Var.f42132n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42550b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f42551c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42552e.f(b2Var, bool.booleanValue(), new n1(dVar2, dVar3, this.f42553f, this.f42554g, this.h, b2Var, zArr));
            }
        }
    }
}
