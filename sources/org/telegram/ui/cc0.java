package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class cc0 implements Runnable {
    public final int f44727a;
    public final ec0 f44728b;

    public cc0(ec0 ec0Var, int i7) {
        this.f44727a = i7;
        this.f44728b = ec0Var;
    }

    @Override
    public final void run() {
        switch (this.f44727a) {
            case 0:
                ec0 ec0Var = this.f44728b;
                ah.i iVar = ec0Var.f45233c;
                iVar.requestFocus();
                String str = ec0Var.K;
                if (str != null) {
                    int i7 = 1;
                    if (str.length() > 1) {
                        String obj = iVar.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ec0Var.K.length() + i10;
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
                this.f44728b.p(true);
                return;
            case 2:
                this.f44728b.n(false);
                return;
            default:
                ah.i iVar2 = this.f44728b.f45233c;
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
