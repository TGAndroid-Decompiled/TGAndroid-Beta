package org.telegram.ui;

import java.util.regex.Pattern;
public final class k80 implements org.telegram.messenger.r20 {
    public final int f38675a;
    public final Runnable f38676b;

    public k80(ph.w3 w3Var, int i10) {
        this.f38675a = i10;
        this.f38676b = w3Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f38675a;
        Runnable runnable = this.f38676b;
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
