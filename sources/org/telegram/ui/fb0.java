package org.telegram.ui;
public final class fb0 implements Runnable {
    public final int f38203a;
    public final kb0 f38204b;
    public final String f38205c;

    public fb0(kb0 kb0Var, String str, int i9) {
        this.f38203a = i9;
        this.f38204b = kb0Var;
        this.f38205c = str;
    }

    @Override
    public final void run() {
        switch (this.f38203a) {
            case 0:
                kb0 kb0Var = this.f38204b;
                kb0Var.getClass();
                String str = this.f38205c;
                if ("disable".equalsIgnoreCase(str)) {
                    kb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    kb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    kb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                kb0 kb0Var2 = this.f38204b;
                kb0Var2.getClass();
                String str2 = this.f38205c;
                if ("disable".equalsIgnoreCase(str2)) {
                    kb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    kb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    kb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    kb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
