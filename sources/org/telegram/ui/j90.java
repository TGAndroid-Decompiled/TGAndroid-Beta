package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f38881a;
    public final Runnable f38882b;

    public j90(xh.p4 p4Var, int i10) {
        this.f38881a = i10;
        this.f38882b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38881a;
        Runnable runnable = this.f38882b;
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
