package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.t60;
public final class n1 implements c20 {
    public final int f42791a = 0;
    public final fi.d f42792b;
    public final fi.d f42793c;
    public final z2 d;
    public final org.telegram.ui.ActionBar.f6 f42794e;
    public final b2 f42795f;
    public final Object f42796g;
    public final Object h;

    public n1(fi.d dVar, fi.d dVar2, f2 f2Var, b2 b2Var, z2 z2Var, org.telegram.ui.ActionBar.f6 f6Var, g gVar) {
        this.f42792b = dVar;
        this.f42793c = dVar2;
        this.f42796g = f2Var;
        this.f42795f = b2Var;
        this.d = z2Var;
        this.f42794e = f6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        boolean z9;
        switch (this.f42791a) {
            case 0:
                f2 f2Var = (f2) this.f42796g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar2 = this.f42792b;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.f42793c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                z2 z2Var = this.d;
                org.telegram.ui.ActionBar.f6 f6Var = this.f42794e;
                b2 b2Var = this.f42795f;
                f2Var.f(b2Var, booleanValue, new t60(dVar2, dVar3, z2Var, f6Var, gVar, b2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f42796g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar4 = this.f42792b;
                boolean z10 = false;
                dVar4.setLoading(false);
                fi.d dVar5 = this.f42793c;
                dVar5.setLoading(false);
                z2 z2Var2 = this.d;
                if (str == null) {
                    z2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    hc.b0(str);
                    return;
                } else {
                    hc.c0(str, z2Var2.E, this.f42794e);
                    b2 b2Var2 = this.f42795f;
                    if (!b2Var2.f42108n && zArr2[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar4.setEnabled(z9);
                    if (!b2Var2.f42108n && !b2Var2.f42109o) {
                        z10 = true;
                    }
                    dVar5.setEnabled(z10);
                    return;
                }
        }
    }

    public n1(fi.d dVar, fi.d dVar2, z2 z2Var, boolean[] zArr, org.telegram.ui.ActionBar.f6 f6Var, b2 b2Var, boolean[] zArr2) {
        this.f42792b = dVar;
        this.f42793c = dVar2;
        this.d = z2Var;
        this.f42796g = zArr;
        this.f42794e = f6Var;
        this.f42795f = b2Var;
        this.h = zArr2;
    }
}
