package org.telegram.ui;
public final class n90 implements Runnable {
    public final int f48132a;
    public final r90 f48133b;
    public final String f48134c;

    public n90(r90 r90Var, String str, int i7) {
        this.f48132a = i7;
        this.f48133b = r90Var;
        this.f48134c = str;
    }

    @Override
    public final void run() {
        switch (this.f48132a) {
            case 0:
                r90 r90Var = this.f48133b;
                if (r90Var.a()) {
                    r90Var.w(this.f48134c);
                    return;
                }
                return;
            case 1:
                this.f48133b.w(this.f48134c);
                return;
            case 2:
                r90 r90Var2 = this.f48133b;
                r90Var2.getClass();
                String str = this.f48134c;
                if ("disable".equalsIgnoreCase(str)) {
                    r90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    r90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    r90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                r90 r90Var3 = this.f48133b;
                r90Var3.getClass();
                String str2 = this.f48134c;
                if ("disable".equalsIgnoreCase(str2)) {
                    r90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    r90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    r90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    r90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
