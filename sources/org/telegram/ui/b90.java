package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class b90 implements Utilities.Callback {
    public final int f35544a;
    public final Runnable f35545b;

    public b90(yh.n4 n4Var, int i10) {
        this.f35544a = i10;
        this.f35545b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35544a;
        Runnable runnable = this.f35545b;
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
