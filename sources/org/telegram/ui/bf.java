package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bf implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, bo0 {
    public final int f36845a;
    public final Runnable f36846b;

    public bf(int i9, Runnable runnable) {
        this.f36845a = i9;
        this.f36846b = runnable;
    }

    @Override
    public void b(int i9) {
        int i10 = this.f36845a;
        Runnable runnable = this.f36846b;
        switch (i10) {
            case 9:
                Pattern pattern = LaunchActivity.f35493x1;
                if (i9 == 1) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (i9 == 1) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f36845a) {
            case 0:
                this.f36846b.run();
                return;
            case 1:
                this.f36846b.run();
                return;
            default:
                Runnable runnable = this.f36846b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f36845a) {
            case 3:
                this.f36846b.run();
                return true;
            case 4:
                this.f36846b.run();
                return true;
            case 5:
                this.f36846b.run();
                return true;
            case 6:
                this.f36846b.run();
                return true;
            case 7:
                this.f36846b.run();
                return true;
            default:
                this.f36846b.run();
                return true;
        }
    }
}
