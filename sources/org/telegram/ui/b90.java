package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class b90 implements Utilities.Callback {
    public final int f35543a;
    public final Runnable f35544b;

    public b90(yh.n4 n4Var, int i10) {
        this.f35543a = i10;
        this.f35544b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35543a;
        Runnable runnable = this.f35544b;
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
