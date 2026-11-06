package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class h1 implements c20 {
    public final b2 f42550a;
    public final boolean[] f42551b;
    public final fi.d f42552c;
    public final fi.d d;
    public final f2 f42553e;
    public final z2 f42554f;
    public final boolean[] f42555g;
    public final org.telegram.ui.ActionBar.f6 h;

    public h1(b2 b2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, f2 f2Var, z2 z2Var, boolean[] zArr2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42550a = b2Var;
        this.f42551b = zArr;
        this.f42552c = dVar;
        this.d = dVar2;
        this.f42553e = f2Var;
        this.f42554f = z2Var;
        this.f42555g = zArr2;
        this.h = f6Var;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f42550a;
        if (!b2Var.f42132m && !b2Var.f42133n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42551b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f42552c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42553e.f(b2Var, bool.booleanValue(), new n1(dVar2, dVar3, this.f42554f, this.f42555g, this.h, b2Var, zArr));
            }
        }
    }
}
