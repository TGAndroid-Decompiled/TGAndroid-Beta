package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f37207a;
    public final kb0 f37208b;
    public final String f37209c;

    public gb0(kb0 kb0Var, String str, int i10) {
        this.f37207a = i10;
        this.f37208b = kb0Var;
        this.f37209c = str;
    }

    @Override
    public final void run() {
        switch (this.f37207a) {
            case 0:
                kb0 kb0Var = this.f37208b;
                if (kb0Var.a()) {
                    kb0Var.w(this.f37209c);
                    return;
                }
                return;
            case 1:
                this.f37208b.w(this.f37209c);
                return;
            case 2:
                kb0 kb0Var2 = this.f37208b;
                kb0Var2.getClass();
                String str = this.f37209c;
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
                kb0 kb0Var3 = this.f37208b;
                kb0Var3.getClass();
                String str2 = this.f37209c;
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
