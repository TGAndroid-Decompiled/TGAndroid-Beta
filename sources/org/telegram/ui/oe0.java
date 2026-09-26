package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oe0 implements Runnable {
    public final int f36223a;
    public final re0 f36224b;

    public oe0(re0 re0Var, int i10) {
        this.f36223a = i10;
        this.f36224b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f36223a) {
            case 0:
                re0 re0Var = this.f36224b;
                ci.h2 h2Var = re0Var.f37313c;
                h2Var.requestFocus();
                String str = re0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = re0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f36224b.q(true);
                return;
            case 2:
                this.f36224b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f36224b.f37313c;
                if (h2Var2 != null) {
                    h2Var2.requestFocus();
                    h2Var2.setSelection(h2Var2.length());
                    AndroidUtilities.showKeyboard(h2Var2);
                    return;
                }
                return;
        }
    }
}
