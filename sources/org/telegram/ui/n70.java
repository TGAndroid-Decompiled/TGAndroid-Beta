package org.telegram.ui;
public final class n70 implements org.telegram.messenger.c20 {
    public final int f48114a;
    public final Runnable f48115b;

    public n70(zh.r3 r3Var, int i7) {
        this.f48114a = i7;
        this.f48115b = r3Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48114a;
        Runnable runnable = this.f48115b;
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
