package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.gc;
import org.telegram.ui.w60;
public final class l1 implements c20 {
    public final int f42772a = 0;
    public final fi.d f42773b;
    public final fi.d f42774c;
    public final x2 d;
    public final org.telegram.ui.ActionBar.h6 f42775e;
    public final z1 f42776f;
    public final Object f42777g;
    public final Object h;

    public l1(fi.d dVar, fi.d dVar2, d2 d2Var, z1 z1Var, x2 x2Var, org.telegram.ui.ActionBar.h6 h6Var, g gVar) {
        this.f42773b = dVar;
        this.f42774c = dVar2;
        this.f42777g = d2Var;
        this.f42776f = z1Var;
        this.d = x2Var;
        this.f42775e = h6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        boolean z9;
        switch (this.f42772a) {
            case 0:
                d2 d2Var = (d2) this.f42777g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar2 = this.f42773b;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.f42774c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                x2 x2Var = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.f42775e;
                z1 z1Var = this.f42776f;
                d2Var.f(z1Var, booleanValue, new w60(dVar2, dVar3, x2Var, h6Var, gVar, z1Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f42777g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar4 = this.f42773b;
                boolean z10 = false;
                dVar4.setLoading(false);
                fi.d dVar5 = this.f42774c;
                dVar5.setLoading(false);
                x2 x2Var2 = this.d;
                if (str == null) {
                    x2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    gc.b0(str);
                    return;
                } else {
                    gc.c0(str, x2Var2.E, this.f42775e);
                    z1 z1Var2 = this.f42776f;
                    if (!z1Var2.f43423n && zArr2[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar4.setEnabled(z9);
                    if (!z1Var2.f43423n && !z1Var2.f43424o) {
                        z10 = true;
                    }
                    dVar5.setEnabled(z10);
                    return;
                }
        }
    }

    public l1(fi.d dVar, fi.d dVar2, x2 x2Var, boolean[] zArr, org.telegram.ui.ActionBar.h6 h6Var, z1 z1Var, boolean[] zArr2) {
        this.f42773b = dVar;
        this.f42774c = dVar2;
        this.d = x2Var;
        this.f42777g = zArr;
        this.f42775e = h6Var;
        this.f42776f = z1Var;
        this.h = zArr2;
    }
}
