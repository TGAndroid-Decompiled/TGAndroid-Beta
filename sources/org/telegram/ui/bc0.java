package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bc0 implements Runnable {
    public final int f45675a;
    public final dc0 f45676b;

    public bc0(dc0 dc0Var, int i7) {
        this.f45675a = i7;
        this.f45676b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45675a) {
            case 0:
                dc0 dc0Var = this.f45676b;
                ah.i iVar = dc0Var.f46330c;
                iVar.requestFocus();
                String str = dc0Var.L;
                if (str != null) {
                    int i7 = 1;
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = dc0Var.L.length() + i10;
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
                this.f45676b.p(true);
                return;
            case 2:
                this.f45676b.n(false);
                return;
            default:
                ah.i iVar2 = this.f45676b.f46330c;
                if (iVar2 != null) {
                    iVar2.requestFocus();
                    iVar2.setSelection(iVar2.length());
                    org.telegram.messenger.g0.J3(iVar2);
                    return;
                }
                return;
        }
    }
}
