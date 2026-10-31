package org.telegram.ui;
public final class qa0 implements Runnable {
    public final int f40943a;
    public final ua0 f40944b;
    public final String f40945c;

    public qa0(ua0 ua0Var, String str, int i10) {
        this.f40943a = i10;
        this.f40944b = ua0Var;
        this.f40945c = str;
    }

    @Override
    public final void run() {
        switch (this.f40943a) {
            case 0:
                ua0 ua0Var = this.f40944b;
                if (ua0Var.a()) {
                    ua0Var.w(this.f40945c);
                    return;
                }
                return;
            case 1:
                this.f40944b.w(this.f40945c);
                return;
            case 2:
                ua0 ua0Var2 = this.f40944b;
                ua0Var2.getClass();
                String str = this.f40945c;
                if ("disable".equalsIgnoreCase(str)) {
                    ua0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ua0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ua0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ua0 ua0Var3 = this.f40944b;
                ua0Var3.getClass();
                String str2 = this.f40945c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ua0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ua0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ua0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ua0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
