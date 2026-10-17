package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class d90 implements Utilities.Callback {
    public final int f36103a;
    public final Runnable f36104b;

    public d90(yh.o4 o4Var, int i10) {
        this.f36103a = i10;
        this.f36104b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f36103a;
        Runnable runnable = this.f36104b;
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
