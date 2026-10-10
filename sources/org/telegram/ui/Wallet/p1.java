package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.e90;
public final class p1 implements Utilities.Callback {
    public final int f35413a = 0;
    public final ci.d f35414b;
    public final ci.d f35415c;
    public final i2 d;
    public final org.telegram.ui.ActionBar.e6 f35416e;
    public final a2 f35417f;
    public final Object f35418g;
    public final Object h;

    public p1(ci.d dVar, ci.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.e6 e6Var, l lVar) {
        this.f35414b = dVar;
        this.f35415c = dVar2;
        this.f35418g = e2Var;
        this.f35417f = a2Var;
        this.d = i2Var;
        this.f35416e = e6Var;
        this.h = lVar;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        boolean z10;
        switch (this.f35413a) {
            case 0:
                e2 e2Var = (e2) this.f35418g;
                l lVar = (l) this.h;
                Boolean bool = (Boolean) obj;
                ci.d dVar2 = this.f35414b;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.f35415c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.f35416e;
                a2 a2Var = this.f35417f;
                e2Var.e(a2Var, booleanValue, new e90(dVar2, dVar3, i2Var, e6Var, lVar, a2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f35418g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ci.d dVar4 = this.f35414b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ci.d dVar5 = this.f35415c;
                dVar5.setLoading(false);
                i2 i2Var2 = this.d;
                if (str == null) {
                    i2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    ad.b0(str);
                    return;
                } else {
                    ad.c0(str, i2Var2.topBulletinContainer, this.f35416e);
                    a2 a2Var2 = this.f35417f;
                    if (!a2Var2.f34659n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f34659n && !a2Var2.f34660o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public p1(ci.d dVar, ci.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, a2 a2Var, boolean[] zArr2) {
        this.f35414b = dVar;
        this.f35415c = dVar2;
        this.d = i2Var;
        this.f35418g = zArr;
        this.f35416e = e6Var;
        this.f35417f = a2Var;
        this.h = zArr2;
    }
}
