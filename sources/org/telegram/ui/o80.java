package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class o80 implements Utilities.Callback {
    public final int f41006a;
    public final Runnable f41007b;

    public o80(fh.j6 j6Var, int i9) {
        this.f41006a = i9;
        this.f41007b = j6Var;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f41006a;
        Runnable runnable = this.f41007b;
        String str = (String) obj;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
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
