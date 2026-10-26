package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class g90 implements Utilities.Callback {
    public final int f39569a;
    public final Runnable f39570b;

    public g90(zh.o4 o4Var, int i10) {
        this.f39569a = i10;
        this.f39570b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f39569a;
        Runnable runnable = this.f39570b;
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
