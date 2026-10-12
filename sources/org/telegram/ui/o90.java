package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class o90 implements Utilities.Callback {
    public final int f38891a;
    public final Runnable f38892b;

    public o90(yh.n4 n4Var, int i10) {
        this.f38891a = i10;
        this.f38892b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38891a;
        Runnable runnable = this.f38892b;
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
