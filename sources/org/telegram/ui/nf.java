package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nf implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, qo0 {
    public final int f35978a;
    public final Runnable f35979b;

    public nf(int i10, Runnable runnable) {
        this.f35978a = i10;
        this.f35979b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f35978a;
        Runnable runnable = this.f35979b;
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35978a) {
            case 0:
                this.f35979b.run();
                return;
            case 1:
                this.f35979b.run();
                return;
            default:
                Runnable runnable = this.f35979b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35978a) {
            case 3:
                this.f35979b.run();
                return true;
            case 4:
                this.f35979b.run();
                return true;
            case 5:
                this.f35979b.run();
                return true;
            case 6:
                this.f35979b.run();
                return true;
            case 7:
                this.f35979b.run();
                return true;
            default:
                this.f35979b.run();
                return true;
        }
    }
}
