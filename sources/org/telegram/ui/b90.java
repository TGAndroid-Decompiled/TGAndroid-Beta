package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class b90 implements Utilities.Callback {
    public final int f35390a;
    public final Runnable f35391b;

    public b90(lh.u5 u5Var, int i10) {
        this.f35390a = i10;
        this.f35391b = u5Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35390a;
        Runnable runnable = this.f35391b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
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
