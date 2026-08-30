package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gf implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, io0 {
    public final int f34591a;
    public final Runnable f34592b;

    public gf(int i10, Runnable runnable) {
        this.f34591a = i10;
        this.f34592b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f34591a;
        Runnable runnable = this.f34592b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.f31612y1;
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
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34591a) {
            case 0:
                this.f34592b.run();
                return;
            case 1:
                this.f34592b.run();
                return;
            default:
                Runnable runnable = this.f34592b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f34591a) {
            case 3:
                this.f34592b.run();
                return true;
            case 4:
                this.f34592b.run();
                return true;
            case 5:
                this.f34592b.run();
                return true;
            case 6:
                this.f34592b.run();
                return true;
            case 7:
                this.f34592b.run();
                return true;
            default:
                this.f34592b.run();
                return true;
        }
    }
}
