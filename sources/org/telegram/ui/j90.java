package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f37606a;
    public final Runnable f37607b;

    public j90(xh.p4 p4Var, int i10) {
        this.f37606a = i10;
        this.f37607b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37606a;
        Runnable runnable = this.f37607b;
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
