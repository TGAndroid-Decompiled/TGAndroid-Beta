package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k90 implements Utilities.Callback {
    public final int f38005a;
    public final Runnable f38006b;

    public k90(yh.n4 n4Var, int i10) {
        this.f38005a = i10;
        this.f38006b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38005a;
        Runnable runnable = this.f38006b;
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
