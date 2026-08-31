package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ne0 implements Runnable {
    public final int f39418a;
    public final qe0 f39419b;

    public ne0(qe0 qe0Var, int i10) {
        this.f39418a = i10;
        this.f39419b = qe0Var;
    }

    @Override
    public final void run() {
        switch (this.f39418a) {
            case 0:
                qe0 qe0Var = this.f39419b;
                lg.f fVar = qe0Var.f40449c;
                fVar.requestFocus();
                String str = qe0Var.H;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = qe0Var.H.length() + i11;
                        fVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), fVar.getText().length());
                        return;
                    }
                }
                fVar.setSelection(0, fVar.getText().length());
                return;
            case 1:
                this.f39419b.q(true);
                return;
            case 2:
                this.f39419b.o(false);
                return;
            default:
                lg.f fVar2 = this.f39419b.f40449c;
                if (fVar2 != null) {
                    fVar2.requestFocus();
                    fVar2.setSelection(fVar2.length());
                    AndroidUtilities.showKeyboard(fVar2);
                    return;
                }
                return;
        }
    }
}
