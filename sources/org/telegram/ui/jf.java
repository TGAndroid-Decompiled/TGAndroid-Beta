package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jf implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, ko0 {
    public final int f35263a;
    public final Runnable f35264b;

    public jf(int i10, Runnable runnable) {
        this.f35263a = i10;
        this.f35264b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f35263a;
        Runnable runnable = this.f35264b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.f31586y1;
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
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35263a) {
            case 0:
                this.f35264b.run();
                return;
            case 1:
                this.f35264b.run();
                return;
            default:
                Runnable runnable = this.f35264b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35263a) {
            case 3:
                this.f35264b.run();
                return true;
            case 4:
                this.f35264b.run();
                return true;
            case 5:
                this.f35264b.run();
                return true;
            case 6:
                this.f35264b.run();
                return true;
            case 7:
                this.f35264b.run();
                return true;
            default:
                this.f35264b.run();
                return true;
        }
    }
}
