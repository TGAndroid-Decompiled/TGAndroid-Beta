package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qa1 implements Runnable {
    public final int f49179a;
    public final za1 f49180b;

    public qa1(za1 za1Var, int i7) {
        this.f49179a = i7;
        this.f49180b = za1Var;
    }

    @Override
    public final void run() {
        switch (this.f49179a) {
            case 0:
                int i7 = 0;
                while (true) {
                    br[] brVarArr = this.f49180b.f52515x.f52289f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                za1 za1Var = this.f49180b;
                EditTextBoldCursor editTextBoldCursor = za1Var.f52511n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        za1Var.f52506f0[2].P(49);
                        za1Var.f52506f0[2].T(false, 0.0f);
                        za1Var.f52496a.d();
                        return;
                    }
                    za1Var.K0(true);
                    return;
                }
                return;
            case 2:
                za1 za1Var2 = this.f49180b;
                EditTextBoldCursor editTextBoldCursor2 = za1Var2.f52511n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    za1Var2.f52511n.requestFocus();
                    org.telegram.messenger.g0.K3(za1Var2.f52511n);
                    return;
                }
                return;
            case 3:
                za1 za1Var3 = this.f49180b;
                lb0 lb0Var = za1Var3.f52515x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    za1Var3.f52515x.f52289f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                za1 za1Var4 = this.f49180b;
                if (za1Var4.f52507g0 != null) {
                    za1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                za1.k0(this.f49180b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new qa1(this.f49180b, 7), 150L);
                return;
            default:
                for (br brVar : this.f49180b.f52515x.f52289f) {
                    brVar.z(0.0f);
                }
                return;
        }
    }
}
