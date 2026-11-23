package org.telegram.ui;
public final class m70 implements org.telegram.messenger.y10 {
    public final int f49780a;
    public final Runnable f49781b;

    public m70(bi.q8 q8Var, int i7) {
        this.f49780a = i7;
        this.f49781b = q8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49780a;
        Runnable runnable = this.f49781b;
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
