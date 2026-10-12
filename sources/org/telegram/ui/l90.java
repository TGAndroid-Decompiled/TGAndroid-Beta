package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l90 implements Utilities.Callback {
    public final int f39674a;
    public final Runnable f39675b;

    public l90(xh.o4 o4Var, int i10) {
        this.f39674a = i10;
        this.f39675b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f39674a;
        Runnable runnable = this.f39675b;
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
