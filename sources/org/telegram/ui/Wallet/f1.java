package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
public final class f1 implements z10 {
    public final z1 f43818a;
    public final boolean[] f43819b;
    public final hi.d f43820c;
    public final hi.d d;
    public final d2 f43821e;
    public final w2 f43822f;
    public final boolean[] f43823g;
    public final org.telegram.ui.ActionBar.e6 h;

    public f1(z1 z1Var, boolean[] zArr, hi.d dVar, hi.d dVar2, d2 d2Var, w2 w2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f43818a = z1Var;
        this.f43819b = zArr;
        this.f43820c = dVar;
        this.d = dVar2;
        this.f43821e = d2Var;
        this.f43822f = w2Var;
        this.f43823g = zArr2;
        this.h = e6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f43818a;
        if (!z1Var.f44786m && !z1Var.f44787n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f43819b;
            if (booleanValue || zArr[0]) {
                hi.d dVar2 = this.f43820c;
                dVar2.setEnabled(false);
                hi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f43821e.f(z1Var, bool.booleanValue(), new l1(dVar2, dVar3, this.f43822f, this.f43823g, this.h, z1Var, zArr));
            }
        }
    }
}
