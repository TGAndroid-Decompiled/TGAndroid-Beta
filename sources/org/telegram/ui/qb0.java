package org.telegram.ui;
public final class qb0 implements Runnable {
    public final int f37715a;
    public final wb0 f37716b;
    public final String f37717c;

    public qb0(wb0 wb0Var, String str, int i10) {
        this.f37715a = i10;
        this.f37716b = wb0Var;
        this.f37717c = str;
    }

    @Override
    public final void run() {
        switch (this.f37715a) {
            case 0:
                wb0 wb0Var = this.f37716b;
                wb0Var.getClass();
                String str = this.f37717c;
                if ("disable".equalsIgnoreCase(str)) {
                    wb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    wb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    wb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                wb0 wb0Var2 = this.f37716b;
                wb0Var2.getClass();
                String str2 = this.f37717c;
                if ("disable".equalsIgnoreCase(str2)) {
                    wb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    wb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    wb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    wb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
