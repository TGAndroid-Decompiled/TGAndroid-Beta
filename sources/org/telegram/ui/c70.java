package org.telegram.ui;
public final class c70 implements Runnable {
    public final int f44268a;
    public final f10 f44269b;

    public c70(f10 f10Var, int i7) {
        this.f44268a = i7;
        this.f44269b = f10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44268a;
        f10 f10Var = this.f44269b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    f10Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.B1;
                try {
                    f10Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.B1;
                try {
                    f10Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
