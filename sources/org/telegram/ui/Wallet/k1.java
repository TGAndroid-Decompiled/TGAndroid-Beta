package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.n60;
public final class k1 implements u10 {
    public final int f42741a = 0;
    public final gi.d f42742b;
    public final gi.d f42743c;
    public final x2 d;
    public final org.telegram.ui.ActionBar.e6 f42744e;
    public final y1 f42745f;
    public final Object f42746g;
    public final Object h;

    public k1(gi.d dVar, gi.d dVar2, c2 c2Var, y1 y1Var, x2 x2Var, org.telegram.ui.ActionBar.e6 e6Var, g gVar) {
        this.f42742b = dVar;
        this.f42743c = dVar2;
        this.f42746g = c2Var;
        this.f42745f = y1Var;
        this.d = x2Var;
        this.f42744e = e6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        gi.d dVar;
        boolean z10;
        switch (this.f42741a) {
            case 0:
                c2 c2Var = (c2) this.f42746g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                gi.d dVar2 = this.f42742b;
                dVar2.setEnabled(false);
                gi.d dVar3 = this.f42743c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                x2 x2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.f42744e;
                y1 y1Var = this.f42745f;
                c2Var.f(y1Var, booleanValue, new n60(dVar2, dVar3, x2Var, e6Var, gVar, y1Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f42746g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                gi.d dVar4 = this.f42742b;
                boolean z11 = false;
                dVar4.setLoading(false);
                gi.d dVar5 = this.f42743c;
                dVar5.setLoading(false);
                x2 x2Var2 = this.d;
                if (str == null) {
                    x2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    fc.b0(str);
                    return;
                } else {
                    fc.c0(str, x2Var2.F, this.f42744e);
                    y1 y1Var2 = this.f42745f;
                    if (!y1Var2.f43467n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!y1Var2.f43467n && !y1Var2.f43468o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public k1(gi.d dVar, gi.d dVar2, x2 x2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, y1 y1Var, boolean[] zArr2) {
        this.f42742b = dVar;
        this.f42743c = dVar2;
        this.d = x2Var;
        this.f42746g = zArr;
        this.f42744e = e6Var;
        this.f42745f = y1Var;
        this.h = zArr2;
    }
}
