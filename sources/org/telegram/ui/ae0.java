package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ae0 implements Runnable {
    public final int f35355a;
    public final de0 f35356b;

    public ae0(de0 de0Var, int i10) {
        this.f35355a = i10;
        this.f35356b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f35355a) {
            case 0:
                de0 de0Var = this.f35356b;
                ei.e2 e2Var = de0Var.f36346c;
                e2Var.requestFocus();
                String str = de0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = de0Var.K.length() + i11;
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
                this.f35356b.q(true);
                return;
            case 2:
                this.f35356b.o(false);
                return;
            default:
                ei.e2 e2Var2 = this.f35356b.f36346c;
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
