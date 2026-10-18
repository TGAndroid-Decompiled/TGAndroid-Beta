package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f37177a;
    public final kb0 f37178b;
    public final String f37179c;

    public gb0(kb0 kb0Var, String str, int i10) {
        this.f37177a = i10;
        this.f37178b = kb0Var;
        this.f37179c = str;
    }

    @Override
    public final void run() {
        switch (this.f37177a) {
            case 0:
                kb0 kb0Var = this.f37178b;
                if (kb0Var.a()) {
                    kb0Var.w(this.f37179c);
                    return;
                }
                return;
            case 1:
                this.f37178b.w(this.f37179c);
                return;
            case 2:
                kb0 kb0Var2 = this.f37178b;
                kb0Var2.getClass();
                String str = this.f37179c;
                if ("disable".equalsIgnoreCase(str)) {
                    kb0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    kb0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    kb0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                kb0 kb0Var3 = this.f37178b;
                kb0Var3.getClass();
                String str2 = this.f37179c;
                if ("disable".equalsIgnoreCase(str2)) {
                    kb0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    kb0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    kb0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    kb0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
