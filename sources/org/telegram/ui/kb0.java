package org.telegram.ui;
public final class kb0 implements Runnable {
    public final int f38923a;
    public final ob0 f38924b;
    public final String f38925c;

    public kb0(ob0 ob0Var, String str, int i10) {
        this.f38923a = i10;
        this.f38924b = ob0Var;
        this.f38925c = str;
    }

    @Override
    public final void run() {
        switch (this.f38923a) {
            case 0:
                ob0 ob0Var = this.f38924b;
                if (ob0Var.a()) {
                    ob0Var.w(this.f38925c);
                    return;
                }
                return;
            case 1:
                this.f38924b.w(this.f38925c);
                return;
            case 2:
                ob0 ob0Var2 = this.f38924b;
                ob0Var2.getClass();
                String str = this.f38925c;
                if ("disable".equalsIgnoreCase(str)) {
                    ob0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ob0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ob0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ob0 ob0Var3 = this.f38924b;
                ob0Var3.getClass();
                String str2 = this.f38925c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ob0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ob0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ob0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ob0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
