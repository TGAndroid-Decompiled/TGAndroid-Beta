package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mf implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, wo0 {
    public final int f35734a;
    public final Runnable f35735b;

    public mf(int i10, Runnable runnable) {
        this.f35734a = i10;
        this.f35735b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f35734a;
        Runnable runnable = this.f35735b;
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
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35734a) {
            case 0:
                this.f35735b.run();
                return;
            case 1:
                this.f35735b.run();
                return;
            default:
                Runnable runnable = this.f35735b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35734a) {
            case 3:
                this.f35735b.run();
                return true;
            case 4:
                this.f35735b.run();
                return true;
            case 5:
                this.f35735b.run();
                return true;
            case 6:
                this.f35735b.run();
                return true;
            case 7:
                this.f35735b.run();
                return true;
            default:
                this.f35735b.run();
                return true;
        }
    }
}
