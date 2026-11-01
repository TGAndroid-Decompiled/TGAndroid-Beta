package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class hf implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.hp, pm0 {
    public final int f37807a;
    public final Runnable f37808b;

    public hf(int i10, Runnable runnable) {
        this.f37807a = i10;
        this.f37808b = runnable;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f37807a) {
            case 3:
                this.f37808b.run();
                return true;
            case 4:
                this.f37808b.run();
                return true;
            case 5:
                this.f37808b.run();
                return true;
            case 6:
                this.f37808b.run();
                return true;
            case 7:
                this.f37808b.run();
                return true;
            default:
                this.f37808b.run();
                return true;
        }
    }

    @Override
    public void e(int i10) {
        int i11 = this.f37807a;
        Runnable runnable = this.f37808b;
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
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f37807a) {
            case 0:
                this.f37808b.run();
                return;
            case 1:
                this.f37808b.run();
                return;
            default:
                Runnable runnable = this.f37808b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
