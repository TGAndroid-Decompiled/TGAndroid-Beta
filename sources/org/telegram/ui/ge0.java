package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ge0 implements Runnable {
    public final int f37585a;
    public final je0 f37586b;

    public ge0(je0 je0Var, int i10) {
        this.f37585a = i10;
        this.f37586b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f37585a) {
            case 0:
                je0 je0Var = this.f37586b;
                ei.e2 e2Var = je0Var.f38542c;
                e2Var.requestFocus();
                String str = je0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = e2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = je0Var.K.length() + i11;
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
                this.f37586b.p(true);
                return;
            case 2:
                this.f37586b.n(false);
                return;
            default:
                ei.e2 e2Var2 = this.f37586b.f38542c;
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
