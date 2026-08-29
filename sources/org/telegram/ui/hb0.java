package org.telegram.ui;
public final class hb0 implements Runnable {
    public final int f38842a;
    public final mb0 f38843b;
    public final String f38844c;

    public hb0(mb0 mb0Var, String str, int i10) {
        this.f38842a = i10;
        this.f38843b = mb0Var;
        this.f38844c = str;
    }

    @Override
    public final void run() {
        switch (this.f38842a) {
            case 0:
                mb0 mb0Var = this.f38843b;
                mb0Var.getClass();
                String str = this.f38844c;
                if ("disable".equalsIgnoreCase(str)) {
                    mb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    mb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    mb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                mb0 mb0Var2 = this.f38843b;
                mb0Var2.getClass();
                String str2 = this.f38844c;
                if ("disable".equalsIgnoreCase(str2)) {
                    mb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    mb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    mb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    mb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
