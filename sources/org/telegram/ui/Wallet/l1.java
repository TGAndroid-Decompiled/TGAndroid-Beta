package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;
import org.telegram.ui.r60;
public final class l1 implements z10 {
    public final int f44101a = 0;
    public final hi.d f44102b;
    public final hi.d f44103c;
    public final w2 d;
    public final org.telegram.ui.ActionBar.e6 f44104e;
    public final z1 f44105f;
    public final Object f44106g;
    public final Object h;

    public l1(hi.d dVar, hi.d dVar2, d2 d2Var, z1 z1Var, w2 w2Var, org.telegram.ui.ActionBar.e6 e6Var, g gVar) {
        this.f44102b = dVar;
        this.f44103c = dVar2;
        this.f44106g = d2Var;
        this.f44105f = z1Var;
        this.d = w2Var;
        this.f44104e = e6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        hi.d dVar;
        boolean z10;
        switch (this.f44101a) {
            case 0:
                d2 d2Var = (d2) this.f44106g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                hi.d dVar2 = this.f44102b;
                dVar2.setEnabled(false);
                hi.d dVar3 = this.f44103c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                w2 w2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.f44104e;
                z1 z1Var = this.f44105f;
                d2Var.f(z1Var, booleanValue, new r60(dVar2, dVar3, w2Var, e6Var, gVar, z1Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f44106g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.d dVar4 = this.f44102b;
                boolean z11 = false;
                dVar4.setLoading(false);
                hi.d dVar5 = this.f44103c;
                dVar5.setLoading(false);
                w2 w2Var2 = this.d;
                if (str == null) {
                    w2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    cc.b0(str);
                    return;
                } else {
                    cc.c0(str, w2Var2.F, this.f44104e);
                    z1 z1Var2 = this.f44105f;
                    if (!z1Var2.f44787n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!z1Var2.f44787n && !z1Var2.f44788o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public l1(hi.d dVar, hi.d dVar2, w2 w2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, z1 z1Var, boolean[] zArr2) {
        this.f44102b = dVar;
        this.f44103c = dVar2;
        this.d = w2Var;
        this.f44106g = zArr;
        this.f44104e = e6Var;
        this.f44105f = z1Var;
        this.h = zArr2;
    }
}
