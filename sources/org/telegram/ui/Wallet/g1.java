package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
public final class g1 implements q20 {
    public final a2 f34537a;
    public final boolean[] f34538b;
    public final vh.d f34539c;
    public final vh.d d;
    public final e2 e;
    public final y2 f34540f;
    public final boolean[] f34541g;
    public final org.telegram.ui.ActionBar.p6 h;

    public g1(a2 a2Var, boolean[] zArr, vh.d dVar, vh.d dVar2, e2 e2Var, y2 y2Var, boolean[] zArr2, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f34537a = a2Var;
        this.f34538b = zArr;
        this.f34539c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f34540f = y2Var;
        this.f34541g = zArr2;
        this.h = p6Var;
    }

    @Override
    public final void a(Object obj) {
        vh.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f34537a;
        if (!a2Var.f34171m && !a2Var.f34172n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34538b;
            if (booleanValue || zArr[0]) {
                vh.d dVar2 = this.f34539c;
                dVar2.setEnabled(false);
                vh.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.f(a2Var, bool.booleanValue(), new m1(dVar2, dVar3, this.f34540f, this.f34541g, this.h, a2Var, zArr));
            }
        }
    }
}
