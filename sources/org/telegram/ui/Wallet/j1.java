package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j1 implements Utilities.Callback {
    public final a2 f36751a;
    public final boolean[] f36752b;
    public final fi.d f36753c;
    public final fi.d d;
    public final e2 e;
    public final i2 f36754f;
    public final boolean[] f36755g;
    public final org.telegram.ui.ActionBar.u6 h;

    public j1(a2 a2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f36751a = a2Var;
        this.f36752b = zArr;
        this.f36753c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f36754f = i2Var;
        this.f36755g = zArr2;
        this.h = u6Var;
    }

    @Override
    public final void run(Object obj) {
        fi.d dVar;
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.f36751a;
        if (!a2Var.f36370m && !a2Var.f36371n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.f36752b;
            if (booleanValue || zArr[0]) {
                fi.d dVar2 = this.f36753c;
                dVar2.setEnabled(false);
                fi.d dVar3 = this.d;
                dVar3.setEnabled(false);
                if (bool.booleanValue()) {
                    dVar = dVar3;
                } else {
                    dVar = dVar2;
                }
                dVar.setLoading(true);
                this.e.e(a2Var, bool.booleanValue(), new p1(dVar2, dVar3, this.f36754f, this.f36755g, this.h, a2Var, zArr));
            }
        }
    }
}
