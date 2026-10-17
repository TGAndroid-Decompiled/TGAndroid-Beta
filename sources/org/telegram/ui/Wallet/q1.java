package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
import org.telegram.ui.n80;
public final class q1 implements Utilities.Callback {
    public final int f34761a = 0;
    public final ei.d f34762b;
    public final ei.d f34763c;
    public final j2 d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final b2 f34764f;
    public final Object f34765g;
    public final Object h;

    public q1(ei.d dVar, ei.d dVar2, f2 f2Var, b2 b2Var, j2 j2Var, org.telegram.ui.ActionBar.d6 d6Var, h hVar) {
        this.f34762b = dVar;
        this.f34763c = dVar2;
        this.f34765g = f2Var;
        this.f34764f = b2Var;
        this.d = j2Var;
        this.e = d6Var;
        this.h = hVar;
    }

    @Override
    public final void run(Object obj) {
        ei.d dVar;
        boolean z10;
        switch (this.f34761a) {
            case 0:
                f2 f2Var = (f2) this.f34765g;
                h hVar = (h) this.h;
                Boolean bool = (Boolean) obj;
                ei.d dVar2 = this.f34762b;
                dVar2.setEnabled(false);
                ei.d dVar3 = this.f34763c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                j2 j2Var = this.d;
                org.telegram.ui.ActionBar.d6 d6Var = this.e;
                b2 b2Var = this.f34764f;
                f2Var.e(b2Var, booleanValue, new n80(dVar2, dVar3, j2Var, d6Var, hVar, b2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f34765g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ei.d dVar4 = this.f34762b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ei.d dVar5 = this.f34763c;
                dVar5.setLoading(false);
                j2 j2Var2 = this.d;
                if (str == null) {
                    j2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    xc.b0(str);
                    return;
                } else {
                    xc.c0(str, j2Var2.topBulletinContainer, this.e);
                    b2 b2Var2 = this.f34764f;
                    if (!b2Var2.f34029n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!b2Var2.f34029n && !b2Var2.f34030o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public q1(ei.d dVar, ei.d dVar2, j2 j2Var, boolean[] zArr, org.telegram.ui.ActionBar.d6 d6Var, b2 b2Var, boolean[] zArr2) {
        this.f34762b = dVar;
        this.f34763c = dVar2;
        this.d = j2Var;
        this.f34765g = zArr;
        this.e = d6Var;
        this.f34764f = b2Var;
        this.h = zArr2;
    }
}
