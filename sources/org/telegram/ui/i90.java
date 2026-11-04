package org.telegram.ui;
public final class i90 implements Runnable {
    public final int f46198a;
    public final m90 f46199b;
    public final String f46200c;

    public i90(m90 m90Var, String str, int i3) {
        this.f46198a = i3;
        this.f46199b = m90Var;
        this.f46200c = str;
    }

    @Override
    public final void run() {
        switch (this.f46198a) {
            case 0:
                m90 m90Var = this.f46199b;
                if (m90Var.a()) {
                    m90Var.w(this.f46200c);
                    return;
                }
                return;
            case 1:
                this.f46199b.w(this.f46200c);
                return;
            case 2:
                m90 m90Var2 = this.f46199b;
                m90Var2.getClass();
                String str = this.f46200c;
                if ("disable".equalsIgnoreCase(str)) {
                    m90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    m90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    m90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                m90 m90Var3 = this.f46199b;
                m90Var3.getClass();
                String str2 = this.f46200c;
                if ("disable".equalsIgnoreCase(str2)) {
                    m90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    m90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    m90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    m90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
