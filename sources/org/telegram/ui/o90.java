package org.telegram.ui;
public final class o90 implements Runnable {
    public final int f48471a;
    public final s90 f48472b;
    public final String f48473c;

    public o90(s90 s90Var, String str, int i7) {
        this.f48471a = i7;
        this.f48472b = s90Var;
        this.f48473c = str;
    }

    @Override
    public final void run() {
        switch (this.f48471a) {
            case 0:
                s90 s90Var = this.f48472b;
                if (s90Var.a()) {
                    s90Var.w(this.f48473c);
                    return;
                }
                return;
            case 1:
                this.f48472b.w(this.f48473c);
                return;
            case 2:
                s90 s90Var2 = this.f48472b;
                s90Var2.getClass();
                String str = this.f48473c;
                if ("disable".equalsIgnoreCase(str)) {
                    s90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    s90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    s90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                s90 s90Var3 = this.f48472b;
                s90Var3.getClass();
                String str2 = this.f48473c;
                if ("disable".equalsIgnoreCase(str2)) {
                    s90Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    s90Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    s90Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    s90Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
