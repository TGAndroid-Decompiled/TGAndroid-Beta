package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f38883a;
    public final Runnable f38884b;

    public j90(xh.p4 p4Var, int i10) {
        this.f38883a = i10;
        this.f38884b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38883a;
        Runnable runnable = this.f38884b;
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
