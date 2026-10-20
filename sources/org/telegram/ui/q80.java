package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class q80 implements Runnable {
    public final int f40503a;
    public final z70 f40504b;

    public q80(z70 z70Var, int i10) {
        this.f40503a = i10;
        this.f40504b = z70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40503a;
        z70 z70Var = this.f40504b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                try {
                    z70Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    z70Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    z70Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
