package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class c80 implements Runnable {
    public final int f37094a;
    public final x20 f37095b;

    public c80(x20 x20Var, int i9) {
        this.f37094a = i9;
        this.f37095b = x20Var;
    }

    @Override
    public final void run() {
        int i9 = this.f37094a;
        x20 x20Var = this.f37095b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
        }
    }
}
