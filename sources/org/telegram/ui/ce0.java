package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ce0 implements Runnable {
    public final int f35892a;
    public final fe0 f35893b;

    public ce0(fe0 fe0Var, int i10) {
        this.f35892a = i10;
        this.f35893b = fe0Var;
    }

    @Override
    public final void run() {
        switch (this.f35892a) {
            case 0:
                fe0 fe0Var = this.f35893b;
                ei.e2 e2Var = fe0Var.f36890c;
                e2Var.requestFocus();
                String str = fe0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = fe0Var.K.length() + i11;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i10 = 0;
                        }
                        e2Var.setSelection(Utilities.clamp(length2 + i10, obj.length(), 0), e2Var.getText().length());
                        return;
                    }
                }
                e2Var.setSelection(0, e2Var.getText().length());
                return;
            case 1:
                this.f35893b.q(true);
                return;
            case 2:
                this.f35893b.o(false);
                return;
            default:
                ei.e2 e2Var2 = this.f35893b.f36890c;
                if (e2Var2 != null) {
                    e2Var2.requestFocus();
                    e2Var2.setSelection(e2Var2.length());
                    AndroidUtilities.showKeyboard(e2Var2);
                    return;
                }
                return;
        }
    }
}
