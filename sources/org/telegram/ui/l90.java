package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l90 implements Utilities.Callback {
    public final int f39668a;
    public final Runnable f39669b;

    public l90(xh.o4 o4Var, int i10) {
        this.f39668a = i10;
        this.f39669b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f39668a;
        Runnable runnable = this.f39669b;
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
