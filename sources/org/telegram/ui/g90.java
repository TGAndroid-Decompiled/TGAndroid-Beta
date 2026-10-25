package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class g90 implements Utilities.Callback {
    public final int f39566a;
    public final Runnable f39567b;

    public g90(zh.o4 o4Var, int i10) {
        this.f39566a = i10;
        this.f39567b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f39566a;
        Runnable runnable = this.f39567b;
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
