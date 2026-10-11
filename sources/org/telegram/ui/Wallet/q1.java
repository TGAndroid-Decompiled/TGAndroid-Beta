package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.d90;
public final class q1 implements Utilities.Callback {
    public final int f35443a = 0;
    public final ci.d f35444b;
    public final ci.d f35445c;
    public final j2 d;
    public final org.telegram.ui.ActionBar.d6 f35446e;
    public final b2 f35447f;
    public final Object f35448g;
    public final Object h;

    public q1(ci.d dVar, ci.d dVar2, f2 f2Var, b2 b2Var, j2 j2Var, org.telegram.ui.ActionBar.d6 d6Var, m mVar) {
        this.f35444b = dVar;
        this.f35445c = dVar2;
        this.f35448g = f2Var;
        this.f35447f = b2Var;
        this.d = j2Var;
        this.f35446e = d6Var;
        this.h = mVar;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        boolean z10;
        switch (this.f35443a) {
            case 0:
                f2 f2Var = (f2) this.f35448g;
                m mVar = (m) this.h;
                Boolean bool = (Boolean) obj;
                ci.d dVar2 = this.f35444b;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.f35445c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                j2 j2Var = this.d;
                org.telegram.ui.ActionBar.d6 d6Var = this.f35446e;
                b2 b2Var = this.f35447f;
                f2Var.e(b2Var, booleanValue, new d90(dVar2, dVar3, j2Var, d6Var, mVar, b2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f35448g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ci.d dVar4 = this.f35444b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ci.d dVar5 = this.f35445c;
                dVar5.setLoading(false);
                j2 j2Var2 = this.d;
                if (str == null) {
                    j2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    ad.b0(str);
                    return;
                } else {
                    ad.c0(str, j2Var2.topBulletinContainer, this.f35446e);
                    b2 b2Var2 = this.f35447f;
                    if (!b2Var2.f34687n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!b2Var2.f34687n && !b2Var2.f34688o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public q1(ci.d dVar, ci.d dVar2, j2 j2Var, boolean[] zArr, org.telegram.ui.ActionBar.d6 d6Var, b2 b2Var, boolean[] zArr2) {
        this.f35444b = dVar;
        this.f35445c = dVar2;
        this.d = j2Var;
        this.f35448g = zArr;
        this.f35446e = d6Var;
        this.f35447f = b2Var;
        this.h = zArr2;
    }
}
