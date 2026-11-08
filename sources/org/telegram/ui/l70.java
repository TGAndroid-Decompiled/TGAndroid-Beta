package org.telegram.ui;
public final class l70 implements org.telegram.messenger.c20 {
    public final int f47463a;
    public final Runnable f47464b;

    public l70(zh.q3 q3Var, int i7) {
        this.f47463a = i7;
        this.f47464b = q3Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f47463a;
        Runnable runnable = this.f47464b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                String str2 = LaunchActivity.B1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
