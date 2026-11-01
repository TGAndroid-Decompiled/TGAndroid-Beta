package org.telegram.ui;
public final class pa0 implements Runnable {
    public final int f40437a;
    public final ta0 f40438b;
    public final String f40439c;

    public pa0(ta0 ta0Var, String str, int i10) {
        this.f40437a = i10;
        this.f40438b = ta0Var;
        this.f40439c = str;
    }

    @Override
    public final void run() {
        switch (this.f40437a) {
            case 0:
                ta0 ta0Var = this.f40438b;
                if (ta0Var.a()) {
                    ta0Var.w(this.f40439c);
                    return;
                }
                return;
            case 1:
                this.f40438b.w(this.f40439c);
                return;
            case 2:
                ta0 ta0Var2 = this.f40438b;
                ta0Var2.getClass();
                String str = this.f40439c;
                if ("disable".equalsIgnoreCase(str)) {
                    ta0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ta0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ta0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ta0 ta0Var3 = this.f40438b;
                ta0Var3.getClass();
                String str2 = this.f40439c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ta0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ta0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ta0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ta0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
