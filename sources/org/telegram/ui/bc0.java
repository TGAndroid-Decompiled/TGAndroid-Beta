package org.telegram.ui;
public final class bc0 implements Runnable {
    public final int f32305a;
    public final gc0 f32306b;
    public final String f32307c;

    public bc0(gc0 gc0Var, String str, int i10) {
        this.f32305a = i10;
        this.f32306b = gc0Var;
        this.f32307c = str;
    }

    @Override
    public final void run() {
        switch (this.f32305a) {
            case 0:
                gc0 gc0Var = this.f32306b;
                gc0Var.getClass();
                String str = this.f32307c;
                if ("disable".equalsIgnoreCase(str)) {
                    gc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    gc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    gc0Var.o("emailRow");
                    return;
                }
                return;
            default:
                gc0 gc0Var2 = this.f32306b;
                gc0Var2.getClass();
                String str2 = this.f32307c;
                if ("disable".equalsIgnoreCase(str2)) {
                    gc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    gc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    gc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    gc0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
