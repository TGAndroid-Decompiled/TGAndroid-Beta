package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wc;
import org.telegram.ui.q80;
public final class p1 implements Utilities.Callback {
    public final int f37080a = 0;
    public final fi.d f37081b;
    public final fi.d f37082c;
    public final i2 d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final a2 f37083f;
    public final Object f37084g;
    public final Object h;

    public p1(fi.d dVar, fi.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.u6 u6Var, h hVar) {
        this.f37081b = dVar;
        this.f37082c = dVar2;
        this.f37084g = e2Var;
        this.f37083f = a2Var;
        this.d = i2Var;
        this.e = u6Var;
        this.h = hVar;
    }

    @Override
    public final void run(Object obj) {
        fi.d dVar;
        boolean z10;
        switch (this.f37080a) {
            case 0:
                e2 e2Var = (e2) this.f37084g;
                h hVar = (h) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar2 = this.f37081b;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.f37082c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.u6 u6Var = this.e;
                a2 a2Var = this.f37083f;
                e2Var.e(a2Var, booleanValue, new q80(dVar2, dVar3, i2Var, u6Var, hVar, a2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f37084g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar4 = this.f37081b;
                boolean z11 = false;
                dVar4.setLoading(false);
                fi.d dVar5 = this.f37082c;
                dVar5.setLoading(false);
                i2 i2Var2 = this.d;
                if (str == null) {
                    i2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    wc.c0(str);
                    return;
                } else {
                    wc.d0(str, i2Var2.topBulletinContainer, this.e);
                    a2 a2Var2 = this.f37083f;
                    if (!a2Var2.f36347n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f36347n && !a2Var2.f36348o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public p1(fi.d dVar, fi.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.u6 u6Var, a2 a2Var, boolean[] zArr2) {
        this.f37081b = dVar;
        this.f37082c = dVar2;
        this.d = i2Var;
        this.f37084g = zArr;
        this.e = u6Var;
        this.f37083f = a2Var;
        this.h = zArr2;
    }
}
