package org.telegram.ui;
public final class ac0 implements Runnable {
    public final int f35758a;
    public final fc0 f35759b;
    public final String f35760c;

    public ac0(fc0 fc0Var, String str, int i10) {
        this.f35758a = i10;
        this.f35759b = fc0Var;
        this.f35760c = str;
    }

    @Override
    public final void run() {
        switch (this.f35758a) {
            case 0:
                fc0 fc0Var = this.f35759b;
                if (fc0Var.a()) {
                    fc0Var.w(this.f35760c);
                    return;
                }
                return;
            case 1:
                this.f35759b.w(this.f35760c);
                return;
            case 2:
                fc0 fc0Var2 = this.f35759b;
                fc0Var2.getClass();
                String str = this.f35760c;
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
                fc0 fc0Var3 = this.f35759b;
                fc0Var3.getClass();
                String str2 = this.f35760c;
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
