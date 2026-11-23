package org.telegram.ui;
public final class l70 implements org.telegram.messenger.w10 {
    public final int f49615a;
    public final Runnable f49616b;

    public l70(bi.t8 t8Var, int i7) {
        this.f49615a = i7;
        this.f49616b = t8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49615a;
        Runnable runnable = this.f49616b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                String str2 = LaunchActivity.C1;
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
