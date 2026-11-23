package org.telegram.ui;
public final class a70 implements Runnable {
    public final int f45528a;
    public final h60 f45529b;

    public a70(h60 h60Var, int i7) {
        this.f45528a = i7;
        this.f45529b = h60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45528a;
        h60 h60Var = this.f45529b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    h60Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    h60Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    h60Var.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
