package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ec0 implements Runnable {
    public final int f45357a;
    public final gc0 f45358b;

    public ec0(gc0 gc0Var, int i7) {
        this.f45357a = i7;
        this.f45358b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45357a) {
            case 0:
                gc0 gc0Var = this.f45358b;
                ah.i iVar = gc0Var.f45965c;
                iVar.requestFocus();
                String str = gc0Var.K;
                if (str != null) {
                    int i7 = 1;
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = gc0Var.K.length() + i10;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i7 = 0;
                        }
                        iVar.setSelection(Utilities.j(length2 + i7, obj.length(), 0), iVar.getText().length());
                        return;
                    }
                }
                iVar.setSelection(0, iVar.getText().length());
                return;
            case 1:
                this.f45358b.p(true);
                return;
            case 2:
                this.f45358b.n(false);
                return;
            default:
                ah.i iVar2 = this.f45358b.f45965c;
                if (iVar2 != null) {
                    iVar2.requestFocus();
                    iVar2.setSelection(iVar2.length());
                    org.telegram.messenger.g0.K3(iVar2);
                    return;
                }
                return;
        }
    }
}
