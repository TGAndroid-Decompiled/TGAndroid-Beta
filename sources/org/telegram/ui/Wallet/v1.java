package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;
import org.telegram.ui.t60;
public final class v1 implements w10 {
    public final int f45278a = 1;
    public final hi.e f45279b;
    public final hi.e f45280c;
    public final e3 d;
    public final org.telegram.ui.ActionBar.i6 f45281e;
    public final i2 f45282f;
    public final Object f45283g;
    public final Object h;

    public v1(hi.e eVar, hi.e eVar2, m2 m2Var, i2 i2Var, e3 e3Var, org.telegram.ui.ActionBar.i6 i6Var, p pVar) {
        this.f45279b = eVar;
        this.f45280c = eVar2;
        this.f45283g = m2Var;
        this.f45282f = i2Var;
        this.d = e3Var;
        this.f45281e = i6Var;
        this.h = pVar;
    }

    @Override
    public final void a(Object obj) {
        hi.e eVar;
        boolean z10;
        switch (this.f45278a) {
            case 0:
                m2 m2Var = (m2) this.f45283g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.e eVar2 = this.f45279b;
                eVar2.setEnabled(false);
                hi.e eVar3 = this.f45280c;
                eVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    eVar = eVar3;
                } else {
                    eVar = eVar2;
                }
                eVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                e3 e3Var = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.f45281e;
                i2 i2Var = this.f45282f;
                m2Var.f(i2Var, booleanValue, new t60(eVar2, eVar3, e3Var, i6Var, pVar, i2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f45283g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.e eVar4 = this.f45279b;
                boolean z11 = false;
                eVar4.setLoading(false);
                hi.e eVar5 = this.f45280c;
                eVar5.setLoading(false);
                e3 e3Var2 = this.d;
                if (str == null) {
                    e3Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    kc.c0(str);
                    return;
                } else {
                    kc.d0(str, e3Var2.F, this.f45281e);
                    i2 i2Var2 = this.f45282f;
                    if (!i2Var2.f44472n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eVar4.setEnabled(z10);
                    if (!i2Var2.f44472n && !i2Var2.f44473o) {
                        z11 = true;
                    }
                    eVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public v1(hi.e eVar, hi.e eVar2, e3 e3Var, boolean[] zArr, org.telegram.ui.ActionBar.i6 i6Var, i2 i2Var, boolean[] zArr2) {
        this.f45279b = eVar;
        this.f45280c = eVar2;
        this.d = e3Var;
        this.f45283g = zArr;
        this.f45281e = i6Var;
        this.f45282f = i2Var;
        this.h = zArr2;
    }
}
