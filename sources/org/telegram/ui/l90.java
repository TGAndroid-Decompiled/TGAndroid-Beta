package org.telegram.ui;
public final class l90 implements Runnable {
    public final int f47474a;
    public final p90 f47475b;
    public final String f47476c;

    public l90(p90 p90Var, String str, int i7) {
        this.f47474a = i7;
        this.f47475b = p90Var;
        this.f47476c = str;
    }

    @Override
    public final void run() {
        switch (this.f47474a) {
            case 0:
                p90 p90Var = this.f47475b;
                if (p90Var.a()) {
                    p90Var.w(this.f47476c);
                    return;
                }
                return;
            case 1:
                this.f47475b.w(this.f47476c);
                return;
            case 2:
                p90 p90Var2 = this.f47475b;
                p90Var2.getClass();
                String str = this.f47476c;
                if ("disable".equalsIgnoreCase(str)) {
                    p90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    p90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    p90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                p90 p90Var3 = this.f47475b;
                p90Var3.getClass();
                String str2 = this.f47476c;
                if ("disable".equalsIgnoreCase(str2)) {
                    p90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    p90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    p90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    p90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
