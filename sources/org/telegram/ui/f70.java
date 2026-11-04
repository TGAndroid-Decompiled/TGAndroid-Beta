package org.telegram.ui;
public final class f70 implements org.telegram.messenger.u10 {
    public final int f45173a;
    public final Runnable f45174b;

    public f70(ai.p6 p6Var, int i3) {
        this.f45173a = i3;
        this.f45174b = p6Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f45173a;
        Runnable runnable = this.f45174b;
        String str = (String) obj;
        switch (i3) {
            case 0:
                String str2 = LaunchActivity.E1;
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
