package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jd0 implements Runnable {
    public final int f38495a;
    public final ld0 f38496b;

    public jd0(ld0 ld0Var, int i10) {
        this.f38495a = i10;
        this.f38496b = ld0Var;
    }

    @Override
    public final void run() {
        switch (this.f38495a) {
            case 0:
                ld0 ld0Var = this.f38496b;
                org.telegram.ui.ActionBar.n0 n0Var = ld0Var.f39179c;
                n0Var.requestFocus();
                String str = ld0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = n0Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ld0Var.K.length() + i11;
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
                this.f38496b.p(true);
                return;
            case 2:
                this.f38496b.n(false);
                return;
            default:
                org.telegram.ui.ActionBar.n0 n0Var2 = this.f38496b.f39179c;
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
