package org.telegram.ui;

public final class jb0 implements Runnable {

    public final int f39330a;

    public final ob0 f39331b;

    public final String f39332c;

    public jb0(ob0 ob0Var, String str, int i10) {
        this.f39330a = i10;
        this.f39331b = ob0Var;
        this.f39332c = str;
    }

    @Override
    public final void run() {
        switch (this.f39330a) {
            case 0:
                ob0 ob0Var = this.f39331b;
                ob0Var.getClass();
                String str = this.f39332c;
                if ("disable".equalsIgnoreCase(str)) {
                    ob0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ob0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ob0Var.o("emailRow");
                }
                break;
            default:
                ob0 ob0Var2 = this.f39331b;
                ob0Var2.getClass();
                String str2 = this.f39332c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ob0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ob0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ob0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ob0Var2.o("fingerprintRow");
                }
                break;
        }
    }
}
