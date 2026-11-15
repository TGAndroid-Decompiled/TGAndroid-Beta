package org.telegram.ui;
public final class j70 implements org.telegram.messenger.z10 {
    public final int f48238a;
    public final Runnable f48239b;

    public j70(bi.h6 h6Var, int i7) {
        this.f48238a = i7;
        this.f48239b = h6Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48238a;
        Runnable runnable = this.f48239b;
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
