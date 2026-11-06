package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class pa1 implements Runnable {
    public final int f48765a;
    public final ya1 f48766b;

    public pa1(ya1 ya1Var, int i7) {
        this.f48765a = i7;
        this.f48766b = ya1Var;
    }

    @Override
    public final void run() {
        switch (this.f48765a) {
            case 0:
                int i7 = 0;
                while (true) {
                    br[] brVarArr = this.f48766b.f52201x.f52311f;
                    if (i7 < brVarArr.length) {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                ya1 ya1Var = this.f48766b;
                EditTextBoldCursor editTextBoldCursor = ya1Var.f52197n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        ya1Var.f52192f0[2].P(49);
                        ya1Var.f52192f0[2].T(false, 0.0f);
                        ya1Var.f52182a.d();
                        return;
                    }
                    ya1Var.K0(true);
                    return;
                }
                return;
            case 2:
                ya1 ya1Var2 = this.f48766b;
                EditTextBoldCursor editTextBoldCursor2 = ya1Var2.f52197n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    ya1Var2.f52197n.requestFocus();
                    org.telegram.messenger.g0.K3(ya1Var2.f52197n);
                    return;
                }
                return;
            case 3:
                ya1 ya1Var3 = this.f48766b;
                lb0 lb0Var = ya1Var3.f52201x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    ya1Var3.f52201x.f52311f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                ya1 ya1Var4 = this.f48766b;
                if (ya1Var4.f52193g0 != null) {
                    ya1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                ya1.k0(this.f48766b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new pa1(this.f48766b, 7), 150L);
                return;
            default:
                for (br brVar : this.f48766b.f52201x.f52311f) {
                    brVar.z(0.0f);
                }
                return;
        }
    }
}
