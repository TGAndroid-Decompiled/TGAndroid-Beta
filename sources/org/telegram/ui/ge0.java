package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class ge0 implements Runnable {

    public final int f38395a;

    public final je0 f38396b;

    public ge0(je0 je0Var, int i10) {
        this.f38395a = i10;
        this.f38396b = je0Var;
    }

    @Override
    public final void run() {
        switch (this.f38395a) {
            case 0:
                je0 je0Var = this.f38396b;
                gg.g gVar = je0Var.f39352c;
                gVar.requestFocus();
                String str = je0Var.G;
                if (str != null) {
                    if (str.length() > 1) {
                        String string = gVar.getText().toString();
                        int length = string.length();
                        int i10 = 0;
                        while (i10 < length && string.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = je0Var.G.length() + i10;
                        gVar.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= string.length() || string.charAt(length2) != ' ') ? 0 : 1), string.length(), 0), gVar.getText().length());
                    }
                }
                gVar.setSelection(0, gVar.getText().length());
                break;
            case 1:
                this.f38396b.q(true);
                break;
            case 2:
                this.f38396b.o(false);
                break;
            default:
                gg.g gVar2 = this.f38396b.f39352c;
                if (gVar2 != null) {
                    gVar2.requestFocus();
                    gVar2.setSelection(gVar2.length());
                    AndroidUtilities.showKeyboard(gVar2);
                }
                break;
        }
    }
}
