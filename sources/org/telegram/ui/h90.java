package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class h90 implements Utilities.Callback {
    public final int f37786a;
    public final Runnable f37787b;

    public h90(yh.n4 n4Var, int i10) {
        this.f37786a = i10;
        this.f37787b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37786a;
        Runnable runnable = this.f37787b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
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
