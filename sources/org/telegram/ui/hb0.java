package org.telegram.ui;
public final class hb0 implements Runnable {
    public final int f39974a;
    public final lb0 f39975b;
    public final String f39976c;

    public hb0(lb0 lb0Var, String str, int i10) {
        this.f39974a = i10;
        this.f39975b = lb0Var;
        this.f39976c = str;
    }

    @Override
    public final void run() {
        switch (this.f39974a) {
            case 0:
                lb0 lb0Var = this.f39975b;
                if (lb0Var.a()) {
                    lb0Var.w(this.f39976c);
                    return;
                }
                return;
            case 1:
                this.f39975b.w(this.f39976c);
                return;
            case 2:
                lb0 lb0Var2 = this.f39975b;
                lb0Var2.getClass();
                String str = this.f39976c;
                if ("disable".equalsIgnoreCase(str)) {
                    lb0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    lb0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    lb0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                lb0 lb0Var3 = this.f39975b;
                lb0Var3.getClass();
                String str2 = this.f39976c;
                if ("disable".equalsIgnoreCase(str2)) {
                    lb0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    lb0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    lb0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    lb0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
