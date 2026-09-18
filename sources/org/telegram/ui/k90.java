package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k90 implements Utilities.Callback {
    public final int f35023a;
    public final Runnable f35024b;

    public k90(xh.p4 p4Var, int i10) {
        this.f35023a = i10;
        this.f35024b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35023a;
        Runnable runnable = this.f35024b;
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
