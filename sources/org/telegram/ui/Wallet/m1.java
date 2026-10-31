package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.r70;
public final class m1 implements q20 {
    public final int f34884a = 0;
    public final vh.d f34885b;
    public final vh.d f34886c;
    public final y2 d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final a2 f34887f;
    public final Object f34888g;
    public final Object h;

    public m1(vh.d dVar, vh.d dVar2, e2 e2Var, a2 a2Var, y2 y2Var, org.telegram.ui.ActionBar.p6 p6Var, g gVar) {
        this.f34885b = dVar;
        this.f34886c = dVar2;
        this.f34888g = e2Var;
        this.f34887f = a2Var;
        this.d = y2Var;
        this.e = p6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        vh.d dVar;
        boolean z10;
        switch (this.f34884a) {
            case 0:
                e2 e2Var = (e2) this.f34888g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                vh.d dVar2 = this.f34885b;
                dVar2.setEnabled(false);
                vh.d dVar3 = this.f34886c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                y2 y2Var = this.d;
                org.telegram.ui.ActionBar.p6 p6Var = this.e;
                a2 a2Var = this.f34887f;
                e2Var.f(a2Var, booleanValue, new r70(dVar2, dVar3, y2Var, p6Var, gVar, a2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f34888g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                vh.d dVar4 = this.f34885b;
                boolean z11 = false;
                dVar4.setLoading(false);
                vh.d dVar5 = this.f34886c;
                dVar5.setLoading(false);
                y2 y2Var2 = this.d;
                if (str == null) {
                    y2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    cc.b0(str);
                    return;
                } else {
                    cc.c0(str, y2Var2.E, this.e);
                    a2 a2Var2 = this.f34887f;
                    if (!a2Var2.f34172n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f34172n && !a2Var2.f34173o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public m1(vh.d dVar, vh.d dVar2, y2 y2Var, boolean[] zArr, org.telegram.ui.ActionBar.p6 p6Var, a2 a2Var, boolean[] zArr2) {
        this.f34885b = dVar;
        this.f34886c = dVar2;
        this.d = y2Var;
        this.f34888g = zArr;
        this.e = p6Var;
        this.f34887f = a2Var;
        this.h = zArr2;
    }
}
