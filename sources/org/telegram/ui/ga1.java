package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ga1 implements Runnable {
    public final int f45613a;
    public final ra1 f45614b;

    public ga1(ra1 ra1Var, int i3) {
        this.f45613a = i3;
        this.f45614b = ra1Var;
    }

    @Override
    public final void run() {
        switch (this.f45613a) {
            case 0:
                int i3 = 0;
                while (true) {
                    zq[] zqVarArr = this.f45614b.f49173x.f52078f;
                    if (i3 < zqVarArr.length) {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    } else {
                        return;
                    }
                }
            case 1:
                ra1 ra1Var = this.f45614b;
                EditTextBoldCursor editTextBoldCursor = ra1Var.f49169n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        ra1Var.f49164g0[2].P(49);
                        ra1Var.f49164g0[2].T(false, 0.0f);
                        ra1Var.f49153a.d();
                        return;
                    }
                    ra1Var.K0(true);
                    return;
                }
                return;
            case 2:
                ra1 ra1Var2 = this.f45614b;
                EditTextBoldCursor editTextBoldCursor2 = ra1Var2.f49169n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    ra1Var2.f49169n.requestFocus();
                    org.telegram.messenger.g0.K3(ra1Var2.f49169n);
                    return;
                }
                return;
            case 3:
                ra1 ra1Var3 = this.f45614b;
                ib0 ib0Var = ra1Var3.f49173x;
                if (ib0Var != null && ib0Var.getVisibility() == 0) {
                    ra1Var3.f49173x.f52078f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                ra1 ra1Var4 = this.f45614b;
                if (ra1Var4.f49165h0 != null) {
                    ra1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                ra1.k0(this.f45614b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new ga1(this.f45614b, 7), 150L);
                return;
            default:
                for (zq zqVar : this.f45614b.f49173x.f52078f) {
                    zqVar.z(0.0f);
                }
                return;
        }
    }
}
