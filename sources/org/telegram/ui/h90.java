package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class h90 implements Utilities.Callback {
    public final int f34167a;
    public final Runnable f34168b;

    public h90(xh.q4 q4Var, int i10) {
        this.f34167a = i10;
        this.f34168b = q4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34167a;
        Runnable runnable = this.f34168b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
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
