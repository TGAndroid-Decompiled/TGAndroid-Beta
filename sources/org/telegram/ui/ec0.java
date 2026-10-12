package org.telegram.ui;
public final class ec0 implements Runnable {
    public final int f35512a;
    public final jc0 f35513b;
    public final String f35514c;

    public ec0(jc0 jc0Var, String str, int i10) {
        this.f35512a = i10;
        this.f35513b = jc0Var;
        this.f35514c = str;
    }

    @Override
    public final void run() {
        switch (this.f35512a) {
            case 0:
                jc0 jc0Var = this.f35513b;
                if (jc0Var.a()) {
                    jc0Var.w(this.f35514c);
                    return;
                }
                return;
            case 1:
                this.f35513b.w(this.f35514c);
                return;
            case 2:
                jc0 jc0Var2 = this.f35513b;
                jc0Var2.getClass();
                String str = this.f35514c;
                if ("disable".equalsIgnoreCase(str)) {
                    jc0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    jc0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    jc0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                jc0 jc0Var3 = this.f35513b;
                jc0Var3.getClass();
                String str2 = this.f35514c;
                if ("disable".equalsIgnoreCase(str2)) {
                    jc0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    jc0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    jc0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    jc0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
