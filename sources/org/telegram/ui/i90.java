package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class i90 implements Utilities.Callback {
    public final int f40069a;
    public final Runnable f40070b;

    public i90(zh.o4 o4Var, int i10) {
        this.f40069a = i10;
        this.f40070b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f40069a;
        Runnable runnable = this.f40070b;
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
