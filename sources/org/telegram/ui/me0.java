package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class me0 implements Runnable {
    public final int f38959a;
    public final pe0 f38960b;

    public me0(pe0 pe0Var, int i10) {
        this.f38959a = i10;
        this.f38960b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f38959a) {
            case 0:
                pe0 pe0Var = this.f38960b;
                lg.f fVar = pe0Var.f39988c;
                fVar.requestFocus();
                String str = pe0Var.H;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = pe0Var.H.length() + i11;
                        fVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), fVar.getText().length());
                        return;
                    }
                }
                fVar.setSelection(0, fVar.getText().length());
                return;
            case 1:
                this.f38960b.q(true);
                return;
            case 2:
                this.f38960b.o(false);
                return;
            default:
                lg.f fVar2 = this.f38960b.f39988c;
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
