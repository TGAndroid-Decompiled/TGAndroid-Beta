package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class pa1 implements Runnable {
    public final int f48764a;
    public final ya1 f48765b;

    public pa1(ya1 ya1Var, int i7) {
        this.f48764a = i7;
        this.f48765b = ya1Var;
    }

    @Override
    public final void run() {
        switch (this.f48764a) {
            case 0:
                int i7 = 0;
                while (true) {
                    br[] brVarArr = this.f48765b.f52199x.f52309f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                ya1 ya1Var = this.f48765b;
                EditTextBoldCursor editTextBoldCursor = ya1Var.f52195n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        ya1Var.f52190f0[2].P(49);
                        ya1Var.f52190f0[2].T(false, 0.0f);
                        ya1Var.f52180a.d();
                        return;
                    }
                    ya1Var.K0(true);
                    return;
                }
                return;
            case 2:
                ya1 ya1Var2 = this.f48765b;
                EditTextBoldCursor editTextBoldCursor2 = ya1Var2.f52195n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    ya1Var2.f52195n.requestFocus();
                    org.telegram.messenger.g0.K3(ya1Var2.f52195n);
                    return;
                }
                return;
            case 3:
                ya1 ya1Var3 = this.f48765b;
                lb0 lb0Var = ya1Var3.f52199x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    ya1Var3.f52199x.f52309f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                ya1 ya1Var4 = this.f48765b;
                if (ya1Var4.f52191g0 != null) {
                    ya1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                ya1.k0(this.f48765b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new pa1(this.f48765b, 7), 150L);
                return;
            default:
                for (br brVar : this.f48765b.f52199x.f52309f) {
                    brVar.z(0.0f);
                }
                return;
        }
    }
}
