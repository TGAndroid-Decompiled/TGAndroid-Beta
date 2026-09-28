package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class f90 implements Utilities.Callback {
    public final int f33584a;
    public final Runnable f33585b;

    public f90(xh.p4 p4Var, int i10) {
        this.f33584a = i10;
        this.f33585b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33584a;
        Runnable runnable = this.f33585b;
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
