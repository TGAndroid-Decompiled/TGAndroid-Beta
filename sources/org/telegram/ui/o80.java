package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class o80 implements Runnable {
    public final int f36812a;
    public final g00 f36813b;

    public o80(g00 g00Var, int i10) {
        this.f36812a = i10;
        this.f36813b = g00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36812a;
        g00 g00Var = this.f36813b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
