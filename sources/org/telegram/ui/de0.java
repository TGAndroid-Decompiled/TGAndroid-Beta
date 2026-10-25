package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class de0 implements Runnable {
    public final int f38845a;
    public final ge0 f38846b;

    public de0(ge0 ge0Var, int i10) {
        this.f38845a = i10;
        this.f38846b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f38845a) {
            case 0:
                ge0 ge0Var = this.f38846b;
                fi.c2 c2Var = ge0Var.f39627c;
                c2Var.requestFocus();
                String str = ge0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = c2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ge0Var.K.length() + i11;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i10 = 0;
                        }
                        c2Var.setSelection(Utilities.clamp(length2 + i10, obj.length(), 0), c2Var.getText().length());
                        return;
                    }
                }
                c2Var.setSelection(0, c2Var.getText().length());
                return;
            case 1:
                this.f38846b.p(true);
                return;
            case 2:
                this.f38846b.n(false);
                return;
            default:
                fi.c2 c2Var2 = this.f38846b.f39627c;
                if (c2Var2 != null) {
                    c2Var2.requestFocus();
                    c2Var2.setSelection(c2Var2.length());
                    AndroidUtilities.showKeyboard(c2Var2);
                    return;
                }
                return;
        }
    }
}
