package org.telegram.ui;
public final class ac0 implements Runnable {
    public final int f34380a;
    public final fc0 f34381b;
    public final String f34382c;

    public ac0(fc0 fc0Var, String str, int i10) {
        this.f34380a = i10;
        this.f34381b = fc0Var;
        this.f34382c = str;
    }

    @Override
    public final void run() {
        switch (this.f34380a) {
            case 0:
                fc0 fc0Var = this.f34381b;
                fc0Var.getClass();
                String str = this.f34382c;
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
                fc0 fc0Var2 = this.f34381b;
                fc0Var2.getClass();
                String str2 = this.f34382c;
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
