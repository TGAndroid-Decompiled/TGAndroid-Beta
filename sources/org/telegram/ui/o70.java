package org.telegram.ui;
public final class o70 implements org.telegram.messenger.c20 {
    public final int f48454a;
    public final Runnable f48455b;

    public o70(zh.r3 r3Var, int i7) {
        this.f48454a = i7;
        this.f48455b = r3Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48454a;
        Runnable runnable = this.f48455b;
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
