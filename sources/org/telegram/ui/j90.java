package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f34839a;
    public final Runnable f34840b;

    public j90(xh.o4 o4Var, int i10) {
        this.f34839a = i10;
        this.f34840b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34839a;
        Runnable runnable = this.f34840b;
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
