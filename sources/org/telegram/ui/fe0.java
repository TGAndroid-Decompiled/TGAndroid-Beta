package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fe0 implements Runnable {
    public final int f39342a;
    public final ie0 f39343b;

    public fe0(ie0 ie0Var, int i10) {
        this.f39342a = i10;
        this.f39343b = ie0Var;
    }

    @Override
    public final void run() {
        switch (this.f39342a) {
            case 0:
                ie0 ie0Var = this.f39343b;
                fi.c2 c2Var = ie0Var.f40123c;
                c2Var.requestFocus();
                String str = ie0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = c2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ie0Var.K.length() + i11;
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
                this.f39343b.p(true);
                return;
            case 2:
                this.f39343b.n(false);
                return;
            default:
                fi.c2 c2Var2 = this.f39343b.f40123c;
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
