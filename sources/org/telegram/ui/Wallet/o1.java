package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.e90;
public final class o1 implements Utilities.Callback {
    public final int f35318a = 0;
    public final ci.d f35319b;
    public final ci.d f35320c;
    public final h2 d;
    public final org.telegram.ui.ActionBar.e6 f35321e;
    public final z1 f35322f;
    public final Object f35323g;
    public final Object h;

    public o1(ci.d dVar, ci.d dVar2, d2 d2Var, z1 z1Var, h2 h2Var, org.telegram.ui.ActionBar.e6 e6Var, k kVar) {
        this.f35319b = dVar;
        this.f35320c = dVar2;
        this.f35323g = d2Var;
        this.f35322f = z1Var;
        this.d = h2Var;
        this.f35321e = e6Var;
        this.h = kVar;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        boolean z10;
        switch (this.f35318a) {
            case 0:
                d2 d2Var = (d2) this.f35323g;
                k kVar = (k) this.h;
                Boolean bool = (Boolean) obj;
                ci.d dVar2 = this.f35319b;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.f35320c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                h2 h2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.f35321e;
                z1 z1Var = this.f35322f;
                d2Var.e(z1Var, booleanValue, new e90(dVar2, dVar3, h2Var, e6Var, kVar, z1Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f35323g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ci.d dVar4 = this.f35319b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ci.d dVar5 = this.f35320c;
                dVar5.setLoading(false);
                h2 h2Var2 = this.d;
                if (str == null) {
                    h2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    ad.b0(str);
                    return;
                } else {
                    ad.c0(str, h2Var2.topBulletinContainer, this.f35321e);
                    z1 z1Var2 = this.f35322f;
                    if (!z1Var2.f35731n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!z1Var2.f35731n && !z1Var2.f35732o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public o1(ci.d dVar, ci.d dVar2, h2 h2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, z1 z1Var, boolean[] zArr2) {
        this.f35319b = dVar;
        this.f35320c = dVar2;
        this.d = h2Var;
        this.f35323g = zArr;
        this.f35321e = e6Var;
        this.f35322f = z1Var;
        this.h = zArr2;
    }
}
