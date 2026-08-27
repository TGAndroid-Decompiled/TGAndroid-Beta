package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

public final class g80 implements Runnable {

    public final int f38335a;

    public final a30 f38336b;

    public g80(a30 a30Var, int i10) {
        this.f38335a = i10;
        this.f38336b = a30Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38335a;
        a30 a30Var = this.f38336b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            default:
                Pattern pattern3 = LaunchActivity.f35496x1;
                try {
                    a30Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                break;
        }
    }
}
