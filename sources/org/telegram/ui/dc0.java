package org.telegram.ui;
public final class dc0 implements Runnable {
    public final int f34956a;
    public final ic0 f34957b;
    public final String f34958c;

    public dc0(ic0 ic0Var, String str, int i10) {
        this.f34956a = i10;
        this.f34957b = ic0Var;
        this.f34958c = str;
    }

    @Override
    public final void run() {
        switch (this.f34956a) {
            case 0:
                ic0 ic0Var = this.f34957b;
                if (ic0Var.a()) {
                    ic0Var.w(this.f34958c);
                    return;
                }
                return;
            case 1:
                this.f34957b.w(this.f34958c);
                return;
            case 2:
                ic0 ic0Var2 = this.f34957b;
                ic0Var2.getClass();
                String str = this.f34958c;
                if ("disable".equalsIgnoreCase(str)) {
                    ic0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ic0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ic0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ic0 ic0Var3 = this.f34957b;
                ic0Var3.getClass();
                String str2 = this.f34958c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ic0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ic0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ic0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ic0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
