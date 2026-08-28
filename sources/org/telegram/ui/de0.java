package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class de0 implements Runnable {
    public final int f37520a;
    public final ge0 f37521b;

    public de0(ge0 ge0Var, int i9) {
        this.f37520a = i9;
        this.f37521b = ge0Var;
    }

    @Override
    public final void run() {
        switch (this.f37520a) {
            case 0:
                ge0 ge0Var = this.f37521b;
                fg.g gVar = ge0Var.f38520c;
                gVar.requestFocus();
                String str = ge0Var.G;
                if (str != null) {
                    int i9 = 1;
                    if (str.length() > 1) {
                        String obj = gVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ge0Var.G.length() + i10;
                        gVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), gVar.getText().length());
                        return;
                    }
                }
                gVar.setSelection(0, gVar.getText().length());
                return;
            case 1:
                this.f37521b.q(true);
                return;
            case 2:
                this.f37521b.o(false);
                return;
            default:
                fg.g gVar2 = this.f37521b.f38520c;
                if (gVar2 != null) {
                    gVar2.requestFocus();
                    gVar2.setSelection(gVar2.length());
                    AndroidUtilities.showKeyboard(gVar2);
                    return;
                }
                return;
        }
    }
}
