package org.telegram.ui;
public final class kb0 implements Runnable {
    public final int f38890a;
    public final ob0 f38891b;
    public final String f38892c;

    public kb0(ob0 ob0Var, String str, int i10) {
        this.f38890a = i10;
        this.f38891b = ob0Var;
        this.f38892c = str;
    }

    @Override
    public final void run() {
        switch (this.f38890a) {
            case 0:
                ob0 ob0Var = this.f38891b;
                if (ob0Var.a()) {
                    ob0Var.w(this.f38892c);
                    return;
                }
                return;
            case 1:
                this.f38891b.w(this.f38892c);
                return;
            case 2:
                ob0 ob0Var2 = this.f38891b;
                ob0Var2.getClass();
                String str = this.f38892c;
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
                ob0 ob0Var3 = this.f38891b;
                ob0Var3.getClass();
                String str2 = this.f38892c;
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
