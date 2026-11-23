package org.telegram.ui;
public final class k90 implements Runnable {
    public final int f49375a;
    public final r90 f49376b;
    public final String f49377c;

    public k90(r90 r90Var, String str, int i7) {
        this.f49375a = i7;
        this.f49376b = r90Var;
        this.f49377c = str;
    }

    @Override
    public final void run() {
        switch (this.f49375a) {
            case 0:
                r90 r90Var = this.f49376b;
                r90Var.getClass();
                String str = this.f49377c;
                if ("disable".equalsIgnoreCase(str)) {
                    r90Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    r90Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    r90Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    r90Var.x("fingerprintRow");
                    return;
                }
                return;
            case 1:
                this.f49376b.w(this.f49377c);
                return;
            case 2:
                r90 r90Var2 = this.f49376b;
                r90Var2.getClass();
                String str2 = this.f49377c;
                if ("disable".equalsIgnoreCase(str2)) {
                    r90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    r90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str2)) {
                    r90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                r90 r90Var3 = this.f49376b;
                if (r90Var3.a()) {
                    r90Var3.w(this.f49377c);
                    return;
                }
                return;
        }
    }
}
