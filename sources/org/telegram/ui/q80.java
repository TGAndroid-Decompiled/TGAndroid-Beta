package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class q80 implements Runnable {
    public final int f37332a;
    public final w10 f37333b;

    public q80(w10 w10Var, int i10) {
        this.f37332a = i10;
        this.f37333b = w10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37332a;
        w10 w10Var = this.f37333b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
