package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class b90 implements Utilities.Callback {
    public final int f35549a;
    public final Runnable f35550b;

    public b90(yh.n4 n4Var, int i10) {
        this.f35549a = i10;
        this.f35550b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35549a;
        Runnable runnable = this.f35550b;
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
