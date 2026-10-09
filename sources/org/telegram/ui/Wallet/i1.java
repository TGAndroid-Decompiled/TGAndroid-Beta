package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i1 implements Utilities.Callback {
    public final z1 f35000a;
    public final boolean[] f35001b;
    public final ci.d f35002c;
    public final ci.d d;
    public final d2 f35003e;
    public final h2 f35004f;
    public final boolean[] f35005g;
    public final org.telegram.ui.ActionBar.e6 h;

    public i1(z1 z1Var, boolean[] zArr, ci.d dVar, ci.d dVar2, d2 d2Var, h2 h2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35000a = z1Var;
        this.f35001b = zArr;
        this.f35002c = dVar;
        this.d = dVar2;
        this.f35003e = d2Var;
        this.f35004f = h2Var;
        this.f35005g = zArr2;
        this.h = e6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.f35000a;
        if (!z1Var.f35703m && !z1Var.f35704n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f35001b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f35002c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f35003e.e(z1Var, bool.booleanValue(), new o1(dVar2, dVar3, this.f35004f, this.f35005g, this.h, z1Var, zArr));
            }
        }
    }
}
