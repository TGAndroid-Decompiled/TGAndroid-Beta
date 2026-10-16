package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.j90;
public final class p1 implements Utilities.Callback {
    public final int f33309a = 0;
    public final di.d f33310b;
    public final di.d f33311c;
    public final i2 d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final a2 f33312f;
    public final Object f33313g;
    public final Object h;

    public p1(di.d dVar, di.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.c6 c6Var, l lVar) {
        this.f33310b = dVar;
        this.f33311c = dVar2;
        this.f33313g = e2Var;
        this.f33312f = a2Var;
        this.d = i2Var;
        this.e = c6Var;
        this.h = lVar;
    }

    @Override
    public final void run(Object obj) {
        di.d dVar;
        boolean z10;
        switch (this.f33309a) {
            case 0:
                e2 e2Var = (e2) this.f33313g;
                l lVar = (l) this.h;
                Boolean bool = (Boolean) obj;
                di.d dVar2 = this.f33310b;
                dVar2.setEnabled(false);
                di.d dVar3 = this.f33311c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.c6 c6Var = this.e;
                a2 a2Var = this.f33312f;
                e2Var.e(a2Var, booleanValue, new j90(dVar2, dVar3, i2Var, c6Var, lVar, a2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f33313g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                di.d dVar4 = this.f33310b;
                boolean z11 = false;
                dVar4.setLoading(false);
                di.d dVar5 = this.f33311c;
                dVar5.setLoading(false);
                i2 i2Var2 = this.d;
                if (str == null) {
                    i2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    zc.b0(str);
                    return;
                } else {
                    zc.c0(str, i2Var2.topBulletinContainer, this.e);
                    a2 a2Var2 = this.f33312f;
                    if (!a2Var2.f32627n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f32627n && !a2Var2.f32628o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public p1(di.d dVar, di.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var, a2 a2Var, boolean[] zArr2) {
        this.f33310b = dVar;
        this.f33311c = dVar2;
        this.d = i2Var;
        this.f33313g = zArr;
        this.e = c6Var;
        this.f33312f = a2Var;
        this.h = zArr2;
    }
}
