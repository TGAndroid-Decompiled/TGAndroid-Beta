package org.telegram.ui;

import java.util.regex.Pattern;
public final class l80 implements org.telegram.messenger.q20 {
    public final int f39088a;
    public final Runnable f39089b;

    public l80(ph.w3 w3Var, int i10) {
        this.f39088a = i10;
        this.f39089b = w3Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f39088a;
        Runnable runnable = this.f39089b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
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
