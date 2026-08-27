package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class bf implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, co0 {

    public final int f36805a;

    public final Runnable f36806b;

    public bf(int i10, Runnable runnable) {
        this.f36805a = i10;
        this.f36806b = runnable;
    }

    @Override
    public void b(int i10) {
        int i11 = this.f36805a;
        Runnable runnable = this.f36806b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.f35496x1;
                if (i10 == 1) {
                    runnable.run();
                }
                break;
            default:
                if (i10 == 1) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36805a) {
            case 0:
                this.f36806b.run();
                break;
            case 1:
                this.f36806b.run();
                break;
            default:
                Runnable runnable = this.f36806b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f36805a) {
            case 3:
                this.f36806b.run();
                break;
            case 4:
                this.f36806b.run();
                break;
            case 5:
                this.f36806b.run();
                break;
            case 6:
                this.f36806b.run();
                break;
            case 7:
                this.f36806b.run();
                break;
            default:
                this.f36806b.run();
                break;
        }
        return true;
    }
}
