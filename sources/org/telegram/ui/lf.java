package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lf implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, wo0 {
    public final int f38331a;
    public final Runnable f38332b;

    public lf(int i10, Runnable runnable) {
        this.f38331a = i10;
        this.f38332b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f38331a;
        Runnable runnable = this.f38332b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.B1;
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38331a) {
            case 0:
                this.f38332b.run();
                return;
            case 1:
                this.f38332b.run();
                return;
            default:
                Runnable runnable = this.f38332b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f38331a) {
            case 3:
                this.f38332b.run();
                return true;
            case 4:
                this.f38332b.run();
                return true;
            case 5:
                this.f38332b.run();
                return true;
            case 6:
                this.f38332b.run();
                return true;
            case 7:
                this.f38332b.run();
                return true;
            default:
                this.f38332b.run();
                return true;
        }
    }
}
