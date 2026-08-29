package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ce0 implements Runnable {
    public final int f37088a;
    public final fe0 f37089b;

    public ce0(fe0 fe0Var, int i10) {
        this.f37088a = i10;
        this.f37089b = fe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37088a) {
            case 0:
                fe0 fe0Var = this.f37089b;
                ig.f fVar = fe0Var.f38125c;
                fVar.requestFocus();
                String str = fe0Var.G;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = fe0Var.G.length() + i11;
                        fVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), fVar.getText().length());
                        return;
                    }
                }
                fVar.setSelection(0, fVar.getText().length());
                return;
            case 1:
                this.f37089b.q(true);
                return;
            case 2:
                this.f37089b.o(false);
                return;
            default:
                ig.f fVar2 = this.f37089b.f38125c;
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
