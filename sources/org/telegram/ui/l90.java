package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l90 implements Utilities.Callback {
    public final int f35489a;
    public final Runnable f35490b;

    public l90(xh.o4 o4Var, int i10) {
        this.f35489a = i10;
        this.f35490b = o4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35489a;
        Runnable runnable = this.f35490b;
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
