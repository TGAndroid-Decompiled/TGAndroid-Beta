package org.telegram.ui;
public final class l70 implements org.telegram.messenger.x10 {
    public final int f49463a;
    public final Runnable f49464b;

    public l70(bi.o8 o8Var, int i7) {
        this.f49463a = i7;
        this.f49464b = o8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49463a;
        Runnable runnable = this.f49464b;
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
