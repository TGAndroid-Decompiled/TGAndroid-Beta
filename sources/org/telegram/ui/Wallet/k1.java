package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k1 implements Utilities.Callback {
    public final b2 f34958a;
    public final boolean[] f34959b;
    public final ci.d f34960c;
    public final ci.d d;
    public final f2 f34961e;
    public final j2 f34962f;
    public final boolean[] f34963g;
    public final org.telegram.ui.ActionBar.c6 h;

    public k1(b2 b2Var, boolean[] zArr, ci.d dVar, ci.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34958a = b2Var;
        this.f34959b = zArr;
        this.f34960c = dVar;
        this.d = dVar2;
        this.f34961e = f2Var;
        this.f34962f = j2Var;
        this.f34963g = zArr2;
        this.h = c6Var;
    }

    @Override
    public final void run(Object obj) {
        ci.d dVar;
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.f34958a;
        if (!b2Var.f34497m && !b2Var.f34498n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f34959b;
            if (booleanValue || zArr[0]) {
                ci.d dVar2 = this.f34960c;
                dVar2.setEnabled(false);
                ci.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.f34961e.e(b2Var, bool.booleanValue(), new q1(dVar2, dVar3, this.f34962f, this.f34963g, this.h, b2Var, zArr));
            }
        }
    }
}
