package org.telegram.ui;
public final class m90 implements Runnable {
    public final int f49188a;
    public final q90 f49189b;
    public final String f49190c;

    public m90(q90 q90Var, String str, int i7) {
        this.f49188a = i7;
        this.f49189b = q90Var;
        this.f49190c = str;
    }

    @Override
    public final void run() {
        switch (this.f49188a) {
            case 0:
                q90 q90Var = this.f49189b;
                if (q90Var.a()) {
                    q90Var.w(this.f49190c);
                    return;
                }
                return;
            case 1:
                this.f49189b.w(this.f49190c);
                return;
            case 2:
                q90 q90Var2 = this.f49189b;
                q90Var2.getClass();
                String str = this.f49190c;
                if ("disable".equalsIgnoreCase(str)) {
                    q90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    q90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    q90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                q90 q90Var3 = this.f49189b;
                q90Var3.getClass();
                String str2 = this.f49190c;
                if ("disable".equalsIgnoreCase(str2)) {
                    q90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    q90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    q90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    q90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
