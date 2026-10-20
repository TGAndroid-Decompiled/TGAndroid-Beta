package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class b90 implements Utilities.Callback {
    public final int f35539a;
    public final Runnable f35540b;

    public b90(yh.n4 n4Var, int i10) {
        this.f35539a = i10;
        this.f35540b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35539a;
        Runnable runnable = this.f35540b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
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
