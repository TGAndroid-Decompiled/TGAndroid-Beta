package org.telegram.ui;
public final class ac0 implements Runnable {
    public final int f35760a;
    public final fc0 f35761b;
    public final String f35762c;

    public ac0(fc0 fc0Var, String str, int i10) {
        this.f35760a = i10;
        this.f35761b = fc0Var;
        this.f35762c = str;
    }

    @Override
    public final void run() {
        switch (this.f35760a) {
            case 0:
                fc0 fc0Var = this.f35761b;
                if (fc0Var.a()) {
                    fc0Var.w(this.f35762c);
                    return;
                }
                return;
            case 1:
                this.f35761b.w(this.f35762c);
                return;
            case 2:
                fc0 fc0Var2 = this.f35761b;
                fc0Var2.getClass();
                String str = this.f35762c;
                if ("disable".equalsIgnoreCase(str)) {
                    fc0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    fc0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    fc0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                fc0 fc0Var3 = this.f35761b;
                fc0Var3.getClass();
                String str2 = this.f35762c;
                if ("disable".equalsIgnoreCase(str2)) {
                    fc0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    fc0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    fc0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    fc0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
