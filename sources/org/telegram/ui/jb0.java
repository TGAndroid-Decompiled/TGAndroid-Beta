package org.telegram.ui;
public final class jb0 implements Runnable {
    public final int f40503a;
    public final ob0 f40504b;
    public final String f40505c;

    public jb0(ob0 ob0Var, String str, int i10) {
        this.f40503a = i10;
        this.f40504b = ob0Var;
        this.f40505c = str;
    }

    @Override
    public final void run() {
        switch (this.f40503a) {
            case 0:
                ob0 ob0Var = this.f40504b;
                if (ob0Var.a()) {
                    ob0Var.w(this.f40505c);
                    return;
                }
                return;
            case 1:
                this.f40504b.w(this.f40505c);
                return;
            case 2:
                ob0 ob0Var2 = this.f40504b;
                ob0Var2.getClass();
                String str = this.f40505c;
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
                ob0 ob0Var3 = this.f40504b;
                ob0Var3.getClass();
                String str2 = this.f40505c;
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
