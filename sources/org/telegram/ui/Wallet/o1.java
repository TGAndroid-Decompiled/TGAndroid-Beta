package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.j90;
public final class o1 implements Utilities.Callback {
    public final int f33535a = 0;
    public final di.d f33536b;
    public final di.d f33537c;
    public final h2 d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final z1 f33538f;
    public final Object f33539g;
    public final Object h;

    public o1(di.d dVar, di.d dVar2, d2 d2Var, z1 z1Var, h2 h2Var, org.telegram.ui.ActionBar.c6 c6Var, k kVar) {
        this.f33536b = dVar;
        this.f33537c = dVar2;
        this.f33539g = d2Var;
        this.f33538f = z1Var;
        this.d = h2Var;
        this.e = c6Var;
        this.h = kVar;
    }

    @Override
    public final void run(Object obj) {
        di.d dVar;
        boolean z10;
        switch (this.f33535a) {
            case 0:
                d2 d2Var = (d2) this.f33539g;
                k kVar = (k) this.h;
                Boolean bool = (Boolean) obj;
                di.d dVar2 = this.f33536b;
                dVar2.setEnabled(false);
                di.d dVar3 = this.f33537c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                h2 h2Var = this.d;
                org.telegram.ui.ActionBar.c6 c6Var = this.e;
                z1 z1Var = this.f33538f;
                d2Var.e(z1Var, booleanValue, new j90(dVar2, dVar3, h2Var, c6Var, kVar, z1Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f33539g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                di.d dVar4 = this.f33536b;
                boolean z11 = false;
                dVar4.setLoading(false);
                di.d dVar5 = this.f33537c;
                dVar5.setLoading(false);
                h2 h2Var2 = this.d;
                if (str == null) {
                    h2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    zc.b0(str);
                    return;
                } else {
                    zc.c0(str, h2Var2.topBulletinContainer, this.e);
                    z1 z1Var2 = this.f33538f;
                    if (!z1Var2.f33910n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!z1Var2.f33910n && !z1Var2.f33911o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public o1(di.d dVar, di.d dVar2, h2 h2Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var, z1 z1Var, boolean[] zArr2) {
        this.f33536b = dVar;
        this.f33537c = dVar2;
        this.d = h2Var;
        this.f33539g = zArr;
        this.e = c6Var;
        this.f33538f = z1Var;
        this.h = zArr2;
    }
}
