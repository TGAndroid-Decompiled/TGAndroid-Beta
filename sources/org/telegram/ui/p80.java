package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class p80 implements Runnable {
    public final int f39917a;
    public final z10 f39918b;

    public p80(z10 z10Var, int i10) {
        this.f39917a = i10;
        this.f39918b = z10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39917a;
        z10 z10Var = this.f39918b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
