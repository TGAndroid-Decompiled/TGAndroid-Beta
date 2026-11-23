package org.telegram.ui;
public final class m70 implements org.telegram.messenger.y10 {
    public final int f49753a;
    public final Runnable f49754b;

    public m70(bi.t8 t8Var, int i7) {
        this.f49753a = i7;
        this.f49754b = t8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49753a;
        Runnable runnable = this.f49754b;
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
