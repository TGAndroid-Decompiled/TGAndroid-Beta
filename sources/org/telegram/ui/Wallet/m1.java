package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.t60;
public final class m1 implements c20 {
    public final int f42785a = 0;
    public final fi.d f42786b;
    public final fi.d f42787c;
    public final y2 d;
    public final org.telegram.ui.ActionBar.f6 f42788e;
    public final a2 f42789f;
    public final Object f42790g;
    public final Object h;

    public m1(fi.d dVar, fi.d dVar2, e2 e2Var, a2 a2Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var, g gVar) {
        this.f42786b = dVar;
        this.f42787c = dVar2;
        this.f42790g = e2Var;
        this.f42789f = a2Var;
        this.d = y2Var;
        this.f42788e = f6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        fi.d dVar;
        boolean z9;
        switch (this.f42785a) {
            case 0:
                e2 e2Var = (e2) this.f42790g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar2 = this.f42786b;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.f42787c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                y2 y2Var = this.d;
                org.telegram.ui.ActionBar.f6 f6Var = this.f42788e;
                a2 a2Var = this.f42789f;
                e2Var.f(a2Var, booleanValue, new t60(dVar2, dVar3, y2Var, f6Var, gVar, a2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f42790g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar4 = this.f42786b;
                boolean z10 = false;
                dVar4.setLoading(false);
                fi.d dVar5 = this.f42787c;
                dVar5.setLoading(false);
                y2 y2Var2 = this.d;
                if (str == null) {
                    y2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    hc.b0(str);
                    return;
                } else {
                    hc.c0(str, y2Var2.E, this.f42788e);
                    a2 a2Var2 = this.f42789f;
                    if (!a2Var2.f42104n && zArr2[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar4.setEnabled(z9);
                    if (!a2Var2.f42104n && !a2Var2.f42105o) {
                        z10 = true;
                    }
                    dVar5.setEnabled(z10);
                    return;
                }
        }
    }

    public m1(fi.d dVar, fi.d dVar2, y2 y2Var, boolean[] zArr, org.telegram.ui.ActionBar.f6 f6Var, a2 a2Var, boolean[] zArr2) {
        this.f42786b = dVar;
        this.f42787c = dVar2;
        this.d = y2Var;
        this.f42790g = zArr;
        this.f42788e = f6Var;
        this.f42789f = a2Var;
        this.h = zArr2;
    }
}
