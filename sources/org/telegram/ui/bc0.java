package org.telegram.ui;
public final class bc0 implements Runnable {
    public final int f31232a;
    public final fc0 f31233b;
    public final String f31234c;

    public bc0(fc0 fc0Var, String str, int i10) {
        this.f31232a = i10;
        this.f31233b = fc0Var;
        this.f31234c = str;
    }

    @Override
    public final void run() {
        switch (this.f31232a) {
            case 0:
                fc0 fc0Var = this.f31233b;
                fc0Var.getClass();
                String str = this.f31234c;
                if ("disable".equalsIgnoreCase(str)) {
                    fc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    fc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    fc0Var.o("emailRow");
                    return;
                }
                return;
            default:
                fc0 fc0Var2 = this.f31233b;
                fc0Var2.getClass();
                String str2 = this.f31234c;
                if ("disable".equalsIgnoreCase(str2)) {
                    fc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    fc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    fc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    fc0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
