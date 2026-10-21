package org.telegram.ui;
public final class eb0 implements Runnable {
    public final int f36623a;
    public final ib0 f36624b;
    public final String f36625c;

    public eb0(ib0 ib0Var, String str, int i10) {
        this.f36623a = i10;
        this.f36624b = ib0Var;
        this.f36625c = str;
    }

    @Override
    public final void run() {
        switch (this.f36623a) {
            case 0:
                ib0 ib0Var = this.f36624b;
                if (ib0Var.a()) {
                    ib0Var.w(this.f36625c);
                    return;
                }
                return;
            case 1:
                this.f36624b.w(this.f36625c);
                return;
            case 2:
                ib0 ib0Var2 = this.f36624b;
                ib0Var2.getClass();
                String str = this.f36625c;
                if ("disable".equalsIgnoreCase(str)) {
                    ib0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ib0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ib0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ib0 ib0Var3 = this.f36624b;
                ib0Var3.getClass();
                String str2 = this.f36625c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ib0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ib0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ib0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ib0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
