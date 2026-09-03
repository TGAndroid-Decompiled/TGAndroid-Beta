package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class c90 implements Utilities.Callback {
    public final int f33047a;
    public final Runnable f33048b;

    public c90(kh.t5 t5Var, int i10) {
        this.f33047a = i10;
        this.f33048b = t5Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33047a;
        Runnable runnable = this.f33048b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
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
