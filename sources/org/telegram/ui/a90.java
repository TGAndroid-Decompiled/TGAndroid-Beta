package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class a90 implements Runnable {
    public final int f33792a;
    public final d20 f33793b;

    public a90(d20 d20Var, int i10) {
        this.f33792a = i10;
        this.f33793b = d20Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33792a;
        d20 d20Var = this.f33793b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    d20Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    d20Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    d20Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
