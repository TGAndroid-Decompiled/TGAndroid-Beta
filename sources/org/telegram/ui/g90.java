package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class g90 implements Utilities.Callback {
    public final int f33491a;
    public final Runnable f33492b;

    public g90(xh.p4 p4Var, int i10) {
        this.f33491a = i10;
        this.f33492b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33491a;
        Runnable runnable = this.f33492b;
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
