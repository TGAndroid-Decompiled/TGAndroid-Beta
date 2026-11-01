package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class id0 implements Runnable {
    public final int f38005a;
    public final kd0 f38006b;

    public id0(kd0 kd0Var, int i10) {
        this.f38005a = i10;
        this.f38006b = kd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38005a) {
            case 0:
                kd0 kd0Var = this.f38006b;
                org.telegram.ui.ActionBar.n0 n0Var = kd0Var.f38843c;
                n0Var.requestFocus();
                String str = kd0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = n0Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = kd0Var.K.length() + i11;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i10 = 0;
                        }
                        n0Var.setSelection(Utilities.j(length2 + i10, obj.length(), 0), n0Var.getText().length());
                        return;
                    }
                }
                n0Var.setSelection(0, n0Var.getText().length());
                return;
            case 1:
                this.f38006b.p(true);
                return;
            case 2:
                this.f38006b.n(false);
                return;
            default:
                org.telegram.ui.ActionBar.n0 n0Var2 = this.f38006b.f38843c;
                if (n0Var2 != null) {
                    n0Var2.requestFocus();
                    n0Var2.setSelection(n0Var2.length());
                    org.telegram.messenger.i0.J3(n0Var2);
                    return;
                }
                return;
        }
    }
}
