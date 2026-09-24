package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kf implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, no0 {
    public final int f35034a;
    public final Runnable f35035b;

    public kf(int i10, Runnable runnable) {
        this.f35034a = i10;
        this.f35035b = runnable;
    }

    @Override
    public void a(int i10) {
        int i11 = this.f35034a;
        Runnable runnable = this.f35035b;
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
        switch (this.f35034a) {
            case 0:
                this.f35035b.run();
                return;
            case 1:
                this.f35035b.run();
                return;
            default:
                Runnable runnable = this.f35035b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f35034a) {
            case 3:
                this.f35035b.run();
                return true;
            case 4:
                this.f35035b.run();
                return true;
            case 5:
                this.f35035b.run();
                return true;
            case 6:
                this.f35035b.run();
                return true;
            case 7:
                this.f35035b.run();
                return true;
            default:
                this.f35035b.run();
                return true;
        }
    }
}
