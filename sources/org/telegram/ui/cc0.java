package org.telegram.ui;
public final class cc0 implements Runnable {
    public final int f32707a;
    public final hc0 f32708b;
    public final String f32709c;

    public cc0(hc0 hc0Var, String str, int i10) {
        this.f32707a = i10;
        this.f32708b = hc0Var;
        this.f32709c = str;
    }

    @Override
    public final void run() {
        switch (this.f32707a) {
            case 0:
                hc0 hc0Var = this.f32708b;
                hc0Var.getClass();
                String str = this.f32709c;
                if ("disable".equalsIgnoreCase(str)) {
                    hc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    hc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    hc0Var.o("emailRow");
                    return;
                }
                return;
            default:
                hc0 hc0Var2 = this.f32708b;
                hc0Var2.getClass();
                String str2 = this.f32709c;
                if ("disable".equalsIgnoreCase(str2)) {
                    hc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    hc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    hc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    hc0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
