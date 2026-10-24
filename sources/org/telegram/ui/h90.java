package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class h90 implements Utilities.Callback {
    public final int f37792a;
    public final Runnable f37793b;

    public h90(yh.n4 n4Var, int i10) {
        this.f37792a = i10;
        this.f37793b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37792a;
        Runnable runnable = this.f37793b;
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
