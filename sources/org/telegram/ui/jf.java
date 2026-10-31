package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class jf implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.gp, rm0 {
    public final int f38510a;
    public final Runnable f38511b;

    public jf(int i10, Runnable runnable) {
        this.f38510a = i10;
        this.f38511b = runnable;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f38510a) {
            case 3:
                this.f38511b.run();
                return true;
            case 4:
                this.f38511b.run();
                return true;
            case 5:
                this.f38511b.run();
                return true;
            case 6:
                this.f38511b.run();
                return true;
            case 7:
                this.f38511b.run();
                return true;
            default:
                this.f38511b.run();
                return true;
        }
    }

    @Override
    public void e(int i10) {
        int i11 = this.f38510a;
        Runnable runnable = this.f38511b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.D1;
                if (i10 == 1) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38510a) {
            case 0:
                this.f38511b.run();
                return;
            case 1:
                this.f38511b.run();
                return;
            default:
                Runnable runnable = this.f38511b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
