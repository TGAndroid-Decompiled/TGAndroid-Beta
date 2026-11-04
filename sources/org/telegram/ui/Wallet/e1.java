package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
public final class e1 implements u10 {
    public final y1 f42451a;
    public final boolean[] f42452b;
    public final gi.d f42453c;
    public final gi.d d;
    public final c2 f42454e;
    public final x2 f42455f;
    public final boolean[] f42456g;
    public final org.telegram.ui.ActionBar.e6 h;

    public e1(y1 y1Var, boolean[] zArr, gi.d dVar, gi.d dVar2, c2 c2Var, x2 x2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f42451a = y1Var;
        this.f42452b = zArr;
        this.f42453c = dVar;
        this.d = dVar2;
        this.f42454e = c2Var;
        this.f42455f = x2Var;
        this.f42456g = zArr2;
        this.h = e6Var;
    }

    @Override
    public final void a(Object obj) {
        gi.d dVar;
        Boolean bool = (Boolean) obj;
        y1 y1Var = this.f42451a;
        if (!y1Var.f43466m && !y1Var.f43467n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f42452b;
            if (booleanValue || zArr[0]) {
                gi.d dVar2 = this.f42453c;
                dVar2.setEnabled(false);
                gi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f42454e.f(y1Var, bool.booleanValue(), new k1(dVar2, dVar3, this.f42455f, this.f42456g, this.h, y1Var, zArr));
            }
        }
    }
}
