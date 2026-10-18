package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class d90 implements Utilities.Callback {
    public final int f36096a;
    public final Runnable f36097b;

    public d90(yh.n4 n4Var, int i10) {
        this.f36096a = i10;
        this.f36097b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f36096a;
        Runnable runnable = this.f36097b;
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
