package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class a90 implements Utilities.Callback {
    public final int f32492a;
    public final Runnable f32493b;

    public a90(kh.u5 u5Var, int i10) {
        this.f32492a = i10;
        this.f32493b = u5Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32492a;
        Runnable runnable = this.f32493b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
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
