package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ef implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, qo0 {
    public final int f38853a;
    public final Runnable f38854b;

    public ef(int i10, Runnable runnable) {
        this.f38853a = i10;
        this.f38854b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f38853a;
        Runnable runnable = this.f38854b;
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
        switch (this.f38853a) {
            case 0:
                this.f38854b.run();
                return;
            case 1:
                this.f38854b.run();
                return;
            default:
                Runnable runnable = this.f38854b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f38853a) {
            case 3:
                this.f38854b.run();
                return true;
            case 4:
                this.f38854b.run();
                return true;
            case 5:
                this.f38854b.run();
                return true;
            case 6:
                this.f38854b.run();
                return true;
            case 7:
                this.f38854b.run();
                return true;
            default:
                this.f38854b.run();
                return true;
        }
    }
}
