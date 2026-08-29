package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class f80 implements Runnable {
    public final int f38039a;
    public final x60 f38040b;

    public f80(x60 x60Var, int i10) {
        this.f38039a = i10;
        this.f38040b = x60Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38039a;
        x60 x60Var = this.f38040b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
        }
    }
}
