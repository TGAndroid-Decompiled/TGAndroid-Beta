package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kf implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, no0 {
    public final int f35047a;
    public final Runnable f35048b;

    public kf(int i10, Runnable runnable) {
        this.f35047a = i10;
        this.f35048b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f35047a;
        Runnable runnable = this.f35048b;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35047a) {
            case 0:
                this.f35048b.run();
                return;
            case 1:
                this.f35048b.run();
                return;
            default:
                Runnable runnable = this.f35048b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35047a) {
            case 3:
                this.f35048b.run();
                return true;
            case 4:
                this.f35048b.run();
                return true;
            case 5:
                this.f35048b.run();
                return true;
            case 6:
                this.f35048b.run();
                return true;
            case 7:
                this.f35048b.run();
                return true;
            default:
                this.f35048b.run();
                return true;
        }
    }
}
