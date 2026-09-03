package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oe0 implements Runnable {
    public final int f36768a;
    public final re0 f36769b;

    public oe0(re0 re0Var, int i10) {
        this.f36768a = i10;
        this.f36769b = re0Var;
    }

    @Override
    public final void run() {
        switch (this.f36768a) {
            case 0:
                re0 re0Var = this.f36769b;
                kg.f fVar = re0Var.f37811c;
                fVar.requestFocus();
                String str = re0Var.H;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = fVar.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = re0Var.H.length() + i11;
                        fVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), fVar.getText().length());
                        return;
                    }
                }
                fVar.setSelection(0, fVar.getText().length());
                return;
            case 1:
                this.f36769b.q(true);
                return;
            case 2:
                this.f36769b.o(false);
                return;
            default:
                kg.f fVar2 = this.f36769b.f37811c;
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
