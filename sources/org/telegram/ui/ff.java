package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ff implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, oo0 {
    public final int f39354a;
    public final Runnable f39355b;

    public ff(int i10, Runnable runnable) {
        this.f39354a = i10;
        this.f39355b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f39354a;
        Runnable runnable = this.f39355b;
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
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39354a) {
            case 0:
                this.f39355b.run();
                return;
            case 1:
                this.f39355b.run();
                return;
            default:
                Runnable runnable = this.f39355b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f39354a) {
            case 3:
                this.f39355b.run();
                return true;
            case 4:
                this.f39355b.run();
                return true;
            case 5:
                this.f39355b.run();
                return true;
            case 6:
                this.f39355b.run();
                return true;
            case 7:
                this.f39355b.run();
                return true;
            default:
                this.f39355b.run();
                return true;
        }
    }
}
