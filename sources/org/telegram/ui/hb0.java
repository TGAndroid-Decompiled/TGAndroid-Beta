package org.telegram.ui;
public final class hb0 implements Runnable {
    public final int f39971a;
    public final lb0 f39972b;
    public final String f39973c;

    public hb0(lb0 lb0Var, String str, int i10) {
        this.f39971a = i10;
        this.f39972b = lb0Var;
        this.f39973c = str;
    }

    @Override
    public final void run() {
        switch (this.f39971a) {
            case 0:
                lb0 lb0Var = this.f39972b;
                if (lb0Var.a()) {
                    lb0Var.w(this.f39973c);
                    return;
                }
                return;
            case 1:
                this.f39972b.w(this.f39973c);
                return;
            case 2:
                lb0 lb0Var2 = this.f39972b;
                lb0Var2.getClass();
                String str = this.f39973c;
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
                lb0 lb0Var3 = this.f39972b;
                lb0Var3.getClass();
                String str2 = this.f39973c;
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
