package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ac0 implements Runnable {
    public final int f43715a;
    public final cc0 f43716b;

    public ac0(cc0 cc0Var, int i3) {
        this.f43715a = i3;
        this.f43716b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f43715a) {
            case 0:
                cc0 cc0Var = this.f43716b;
                bh.g gVar = cc0Var.f44299c;
                gVar.requestFocus();
                String str = cc0Var.L;
                if (str != null) {
                    int i3 = 1;
                    if (str.length() > 1) {
                        String obj = gVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = cc0Var.L.length() + i10;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i3 = 0;
                        }
                        gVar.setSelection(Utilities.j(length2 + i3, obj.length(), 0), gVar.getText().length());
                        return;
                    }
                }
                gVar.setSelection(0, gVar.getText().length());
                return;
            case 1:
                this.f43716b.p(true);
                return;
            case 2:
                this.f43716b.n(false);
                return;
            default:
                bh.g gVar2 = this.f43716b.f44299c;
                if (gVar2 != null) {
                    gVar2.requestFocus();
                    gVar2.setSelection(gVar2.length());
                    org.telegram.messenger.g0.K3(gVar2);
                    return;
                }
                return;
        }
    }
}
