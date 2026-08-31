package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class p80 implements Runnable {
    public final int f39945a;
    public final v10 f39946b;

    public p80(v10 v10Var, int i10) {
        this.f39945a = i10;
        this.f39946b = v10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39945a;
        v10 v10Var = this.f39946b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    v10Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f34134y1;
                try {
                    v10Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f34134y1;
                try {
                    v10Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
