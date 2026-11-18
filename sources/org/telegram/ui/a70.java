package org.telegram.ui;
public final class a70 implements Runnable {
    public final int f45484a;
    public final o60 f45485b;

    public a70(o60 o60Var, int i7) {
        this.f45484a = i7;
        this.f45485b = o60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45484a;
        o60 o60Var = this.f45485b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    o60Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    o60Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    o60Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
