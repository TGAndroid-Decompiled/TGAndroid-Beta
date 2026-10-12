package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.g90;
public final class q1 implements Utilities.Callback {
    public final int f35261a = 0;
    public final ci.d f35262b;
    public final ci.d f35263c;
    public final j2 d;
    public final org.telegram.ui.ActionBar.c6 f35264e;
    public final b2 f35265f;
    public final Object f35266g;
    public final Object h;

    public q1(ci.d dVar, ci.d dVar2, f2 f2Var, b2 b2Var, j2 j2Var, org.telegram.ui.ActionBar.c6 c6Var, l lVar) {
        this.f35262b = dVar;
        this.f35263c = dVar2;
        this.f35266g = f2Var;
        this.f35265f = b2Var;
        this.d = j2Var;
        this.f35264e = c6Var;
        this.h = lVar;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        boolean z10;
        switch (this.f35261a) {
            case 0:
                f2 f2Var = (f2) this.f35266g;
                l lVar = (l) this.h;
                Boolean bool = (Boolean) obj;
                ci.d dVar2 = this.f35262b;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.f35263c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                j2 j2Var = this.d;
                org.telegram.ui.ActionBar.c6 c6Var = this.f35264e;
                b2 b2Var = this.f35265f;
                f2Var.e(b2Var, booleanValue, new g90(dVar2, dVar3, j2Var, c6Var, lVar, b2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f35266g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ci.d dVar4 = this.f35262b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ci.d dVar5 = this.f35263c;
                dVar5.setLoading(false);
                j2 j2Var2 = this.d;
                if (str == null) {
                    j2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    zc.b0(str);
                    return;
                } else {
                    zc.c0(str, j2Var2.topBulletinContainer, this.f35264e);
                    b2 b2Var2 = this.f35265f;
                    if (!b2Var2.f34498n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!b2Var2.f34498n && !b2Var2.f34499o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public q1(ci.d dVar, ci.d dVar2, j2 j2Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var, b2 b2Var, boolean[] zArr2) {
        this.f35262b = dVar;
        this.f35263c = dVar2;
        this.d = j2Var;
        this.f35266g = zArr;
        this.f35264e = c6Var;
        this.f35265f = b2Var;
        this.h = zArr2;
    }
}
