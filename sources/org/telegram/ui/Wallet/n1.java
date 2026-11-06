package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.t60;
public final class n1 implements c20 {
    public final int f42816a = 0;
    public final fi.d f42817b;
    public final fi.d f42818c;
    public final z2 d;
    public final org.telegram.ui.ActionBar.f6 f42819e;
    public final b2 f42820f;
    public final Object f42821g;
    public final Object h;

    public n1(fi.d dVar, fi.d dVar2, f2 f2Var, b2 b2Var, z2 z2Var, org.telegram.ui.ActionBar.f6 f6Var, g gVar) {
        this.f42817b = dVar;
        this.f42818c = dVar2;
        this.f42821g = f2Var;
        this.f42820f = b2Var;
        this.d = z2Var;
        this.f42819e = f6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        boolean z9;
        switch (this.f42816a) {
            case 0:
                f2 f2Var = (f2) this.f42821g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar2 = this.f42817b;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.f42818c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                z2 z2Var = this.d;
                org.telegram.ui.ActionBar.f6 f6Var = this.f42819e;
                b2 b2Var = this.f42820f;
                f2Var.f(b2Var, booleanValue, new t60(dVar2, dVar3, z2Var, f6Var, gVar, b2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f42821g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar4 = this.f42817b;
                boolean z10 = false;
                dVar4.setLoading(false);
                fi.d dVar5 = this.f42818c;
                dVar5.setLoading(false);
                z2 z2Var2 = this.d;
                if (str == null) {
                    z2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    hc.b0(str);
                    return;
                } else {
                    hc.c0(str, z2Var2.E, this.f42819e);
                    b2 b2Var2 = this.f42820f;
                    if (!b2Var2.f42133n && zArr2[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar4.setEnabled(z9);
                    if (!b2Var2.f42133n && !b2Var2.f42134o) {
                        z10 = true;
                    }
                    dVar5.setEnabled(z10);
                    return;
                }
        }
    }

    public n1(fi.d dVar, fi.d dVar2, z2 z2Var, boolean[] zArr, org.telegram.ui.ActionBar.f6 f6Var, b2 b2Var, boolean[] zArr2) {
        this.f42817b = dVar;
        this.f42818c = dVar2;
        this.d = z2Var;
        this.f42821g = zArr;
        this.f42819e = f6Var;
        this.f42820f = b2Var;
        this.h = zArr2;
    }
}
