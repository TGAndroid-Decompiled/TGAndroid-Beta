package org.telegram.ui;
public final class l90 implements Runnable {
    public final int f47476a;
    public final p90 f47477b;
    public final String f47478c;

    public l90(p90 p90Var, String str, int i7) {
        this.f47476a = i7;
        this.f47477b = p90Var;
        this.f47478c = str;
    }

    @Override
    public final void run() {
        switch (this.f47476a) {
            case 0:
                p90 p90Var = this.f47477b;
                if (p90Var.a()) {
                    p90Var.w(this.f47478c);
                    return;
                }
                return;
            case 1:
                this.f47477b.w(this.f47478c);
                return;
            case 2:
                p90 p90Var2 = this.f47477b;
                p90Var2.getClass();
                String str = this.f47478c;
                if ("disable".equalsIgnoreCase(str)) {
                    p90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    p90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    p90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                p90 p90Var3 = this.f47477b;
                p90Var3.getClass();
                String str2 = this.f47478c;
                if ("disable".equalsIgnoreCase(str2)) {
                    p90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    p90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    p90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    p90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
