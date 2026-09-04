package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k90 implements Utilities.Callback {
    public final int f37978a;
    public final Runnable f37979b;

    public k90(yh.n4 n4Var, int i10) {
        this.f37978a = i10;
        this.f37979b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37978a;
        Runnable runnable = this.f37979b;
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
