package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k90 implements Utilities.Callback {
    public final int f35068a;
    public final Runnable f35069b;

    public k90(xh.p4 p4Var, int i10) {
        this.f35068a = i10;
        this.f35069b = p4Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35068a;
        Runnable runnable = this.f35069b;
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
