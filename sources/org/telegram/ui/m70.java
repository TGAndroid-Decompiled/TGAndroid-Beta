package org.telegram.ui;
public final class m70 implements org.telegram.messenger.x10 {
    public final int f49776a;
    public final Runnable f49777b;

    public m70(bi.r8 r8Var, int i7) {
        this.f49776a = i7;
        this.f49777b = r8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49776a;
        Runnable runnable = this.f49777b;
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
