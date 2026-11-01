package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.q70;
public final class m1 implements r20 {
    public final int f34888a = 0;
    public final vh.d f34889b;
    public final vh.d f34890c;
    public final z2 d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final a2 f34891f;
    public final Object f34892g;
    public final Object h;

    public m1(vh.d dVar, vh.d dVar2, e2 e2Var, a2 a2Var, z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, g gVar) {
        this.f34889b = dVar;
        this.f34890c = dVar2;
        this.f34892g = e2Var;
        this.f34891f = a2Var;
        this.d = z2Var;
        this.e = p6Var;
        this.h = gVar;
    }

    @Override
    public final void a(Object obj) {
        vh.d dVar;
        boolean z10;
        switch (this.f34888a) {
            case 0:
                e2 e2Var = (e2) this.f34892g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                vh.d dVar2 = this.f34889b;
                dVar2.setEnabled(false);
                vh.d dVar3 = this.f34890c;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                boolean booleanValue = bool.booleanValue();
                z2 z2Var = this.d;
                org.telegram.ui.ActionBar.p6 p6Var = this.e;
                a2 a2Var = this.f34891f;
                e2Var.f(a2Var, booleanValue, new q70(dVar2, dVar3, z2Var, p6Var, gVar, a2Var, 3));
                return;
            default:
                boolean[] zArr = (boolean[]) this.f34892g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                vh.d dVar4 = this.f34889b;
                boolean z11 = false;
                dVar4.setLoading(false);
                vh.d dVar5 = this.f34890c;
                dVar5.setLoading(false);
                z2 z2Var2 = this.d;
                if (str == null) {
                    z2Var2.dismiss();
                    return;
                } else if (zArr[0]) {
                    cc.b0(str);
                    return;
                } else {
                    cc.c0(str, z2Var2.E, this.e);
                    a2 a2Var2 = this.f34891f;
                    if (!a2Var2.f34179n && zArr2[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar4.setEnabled(z10);
                    if (!a2Var2.f34179n && !a2Var2.f34180o) {
                        z11 = true;
                    }
                    dVar5.setEnabled(z11);
                    return;
                }
        }
    }

    public m1(vh.d dVar, vh.d dVar2, z2 z2Var, boolean[] zArr, org.telegram.ui.ActionBar.p6 p6Var, a2 a2Var, boolean[] zArr2) {
        this.f34889b = dVar;
        this.f34890c = dVar2;
        this.d = z2Var;
        this.f34892g = zArr;
        this.e = p6Var;
        this.f34891f = a2Var;
        this.h = zArr2;
    }
}
