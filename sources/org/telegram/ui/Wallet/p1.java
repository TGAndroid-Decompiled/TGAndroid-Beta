package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
public final class p1 implements w10 {
    public final i2 f44854a;
    public final boolean[] f44855b;
    public final hi.e f44856c;
    public final hi.e d;
    public final m2 f44857e;
    public final e3 f44858f;
    public final boolean[] f44859g;
    public final org.telegram.ui.ActionBar.i6 h;

    public p1(i2 i2Var, boolean[] zArr, hi.e eVar, hi.e eVar2, m2 m2Var, e3 e3Var, boolean[] zArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f44854a = i2Var;
        this.f44855b = zArr;
        this.f44856c = eVar;
        this.d = eVar2;
        this.f44857e = m2Var;
        this.f44858f = e3Var;
        this.f44859g = zArr2;
        this.h = i6Var;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        Boolean bool = (Boolean) obj;
        i2 i2Var = this.f44854a;
        if (!i2Var.f44471m && !i2Var.f44472n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f44855b;
            if (booleanValue || zArr[0]) {
                hi.e eVar2 = this.f44856c;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.d;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                this.f44857e.f(i2Var, bool.booleanValue(), new v1(eVar2, eVar3, this.f44858f, this.f44859g, this.h, i2Var, zArr));
            }
        }
    }
}
