package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k90 implements Utilities.Callback {
    public final int f37979a;
    public final Runnable f37980b;

    public k90(yh.n4 n4Var, int i10) {
        this.f37979a = i10;
        this.f37980b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37979a;
        Runnable runnable = this.f37980b;
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
