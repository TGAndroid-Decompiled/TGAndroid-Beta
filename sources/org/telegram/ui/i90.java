package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class i90 implements Utilities.Callback {
    public final int f38663a;
    public final Runnable f38664b;

    public i90(xh.p4 p4Var, int i10) {
        this.f38663a = i10;
        this.f38664b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38663a;
        Runnable runnable = this.f38664b;
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
