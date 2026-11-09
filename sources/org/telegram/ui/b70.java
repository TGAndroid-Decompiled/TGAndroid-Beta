package org.telegram.ui;
public final class b70 implements Runnable {
    public final int f43925a;
    public final s10 f43926b;

    public b70(s10 s10Var, int i7) {
        this.f43925a = i7;
        this.f43926b = s10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43925a;
        s10 s10Var = this.f43926b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    s10Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.B1;
                try {
                    s10Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.B1;
                try {
                    s10Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
