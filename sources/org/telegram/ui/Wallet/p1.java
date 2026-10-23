package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
import org.telegram.ui.r80;
public final class p1 implements Utilities.Callback {
    public final int f34989a = 0;
    public final ei.d f34990b;
    public final ei.d f34991c;
    public final i2 d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final a2 f34992f;
    public final Object f34993g;
    public final Object h;

    public p1(ei.d dVar, ei.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.g6 g6Var, h hVar) {
        this.f34990b = dVar;
        this.f34991c = dVar2;
        this.f34993g = e2Var;
        this.f34992f = a2Var;
        this.d = i2Var;
        this.e = g6Var;
        this.h = hVar;
    }

    @Override
    public final void run(Object obj) {
        ei.d dVar;
        boolean z10;
        switch (this.f34989a) {
            case 0:
                e2 e2Var = (e2) this.f34993g;
                h hVar = (h) this.h;
                Boolean bool = (Boolean) obj;
                ei.d dVar2 = this.f34990b;
                dVar2.setEnabled(false);
                ei.d dVar3 = this.f34991c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.g6 g6Var = this.e;
                a2 a2Var = this.f34992f;
                e2Var.e(a2Var, booleanValue, new r80(dVar2, dVar3, i2Var, g6Var, hVar, a2Var, 4));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f34993g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ei.d dVar4 = this.f34990b;
                boolean z11 = false;
                dVar4.setLoading(false);
                ei.d dVar5 = this.f34991c;
                dVar5.setLoading(false);
                i2 i2Var2 = this.d;
                if (str == null) {
                    i2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    xc.b0(str);
                    return;
                } else {
                    xc.c0(str, i2Var2.topBulletinContainer, this.e);
                    a2 a2Var2 = this.f34992f;
                    if (!a2Var2.f34282n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f34282n && !a2Var2.f34283o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public p1(ei.d dVar, ei.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.g6 g6Var, a2 a2Var, boolean[] zArr2) {
        this.f34990b = dVar;
        this.f34991c = dVar2;
        this.d = i2Var;
        this.f34993g = zArr;
        this.e = g6Var;
        this.f34992f = a2Var;
        this.h = zArr2;
    }
}
