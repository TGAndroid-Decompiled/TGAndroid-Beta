package org.telegram.ui;
public final class l70 implements org.telegram.messenger.c20 {
    public final int f47458a;
    public final Runnable f47459b;

    public l70(zh.r3 r3Var, int i7) {
        this.f47458a = i7;
        this.f47459b = r3Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f47458a;
        Runnable runnable = this.f47459b;
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
