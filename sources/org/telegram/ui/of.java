package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class of implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, uo0 {
    public final int f40518a;
    public final Runnable f40519b;

    public of(int i10, Runnable runnable) {
        this.f40518a = i10;
        this.f40519b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f40518a;
        Runnable runnable = this.f40519b;
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40518a) {
            case 0:
                this.f40519b.run();
                return;
            case 1:
                this.f40519b.run();
                return;
            default:
                Runnable runnable = this.f40519b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40518a) {
            case 3:
                this.f40519b.run();
                return true;
            case 4:
                this.f40519b.run();
                return true;
            case 5:
                this.f40519b.run();
                return true;
            case 6:
                this.f40519b.run();
                return true;
            case 7:
                this.f40519b.run();
                return true;
            default:
                this.f40519b.run();
                return true;
        }
    }
}
