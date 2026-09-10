package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class j90 implements Utilities.Callback {
    public final int f34058a;
    public final Runnable f34059b;

    public j90(wh.o4 o4Var, int i10) {
        this.f34058a = i10;
        this.f34059b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34058a;
        Runnable runnable = this.f34059b;
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
