package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gf implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, do0 {
    public final int f37308a;
    public final Runnable f37309b;

    public gf(int i10, Runnable runnable) {
        this.f37308a = i10;
        this.f37309b = runnable;
    }

    @Override
    public void c(int i10) {
        int i11 = this.f37308a;
        Runnable runnable = this.f37309b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.C1;
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
        switch (this.f37308a) {
            case 0:
                this.f37309b.run();
                return;
            case 1:
                this.f37309b.run();
                return;
            default:
                Runnable runnable = this.f37309b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f37308a) {
            case 3:
                this.f37309b.run();
                return true;
            case 4:
                this.f37309b.run();
                return true;
            case 5:
                this.f37309b.run();
                return true;
            case 6:
                this.f37309b.run();
                return true;
            case 7:
                this.f37309b.run();
                return true;
            default:
                this.f37309b.run();
                return true;
        }
    }
}
