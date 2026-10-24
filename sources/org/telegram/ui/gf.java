package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gf implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, go0 {
    public final int f37553a;
    public final Runnable f37554b;

    public gf(int i10, Runnable runnable) {
        this.f37553a = i10;
        this.f37554b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f37553a;
        Runnable runnable = this.f37554b;
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37553a) {
            case 0:
                this.f37554b.run();
                return;
            case 1:
                this.f37554b.run();
                return;
            default:
                Runnable runnable = this.f37554b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f37553a) {
            case 3:
                this.f37554b.run();
                return true;
            case 4:
                this.f37554b.run();
                return true;
            case 5:
                this.f37554b.run();
                return true;
            case 6:
                this.f37554b.run();
                return true;
            case 7:
                this.f37554b.run();
                return true;
            default:
                this.f37554b.run();
                return true;
        }
    }
}
