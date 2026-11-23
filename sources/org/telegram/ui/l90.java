package org.telegram.ui;
public final class l90 implements Runnable {
    public final int f49526a;
    public final s90 f49527b;
    public final String f49528c;

    public l90(s90 s90Var, String str, int i7) {
        this.f49526a = i7;
        this.f49527b = s90Var;
        this.f49528c = str;
    }

    @Override
    public final void run() {
        switch (this.f49526a) {
            case 0:
                s90 s90Var = this.f49527b;
                s90Var.getClass();
                String str = this.f49528c;
                if ("disable".equalsIgnoreCase(str)) {
                    s90Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    s90Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    s90Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    s90Var.x("fingerprintRow");
                    return;
                }
                return;
            case 1:
                this.f49527b.w(this.f49528c);
                return;
            case 2:
                s90 s90Var2 = this.f49527b;
                s90Var2.getClass();
                String str2 = this.f49528c;
                if ("disable".equalsIgnoreCase(str2)) {
                    s90Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    s90Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str2)) {
                    s90Var2.x("emailRow");
                    return;
                }
                return;
            default:
                s90 s90Var3 = this.f49527b;
                if (s90Var3.a()) {
                    s90Var3.w(this.f49528c);
                    return;
                }
                return;
        }
    }
}
