package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class a90 implements Runnable {
    public final int f34089a;
    public final o00 f34090b;

    public a90(o00 o00Var, int i10) {
        this.f34089a = i10;
        this.f34090b = o00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34089a;
        o00 o00Var = this.f34090b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    o00Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    o00Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    o00Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
