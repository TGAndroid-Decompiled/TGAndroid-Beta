package org.telegram.ui.Wallet;
public final class y5 implements Runnable {
    public final int f33884a;
    public final b6 f33885b;

    public y5(b6 b6Var, int i10) {
        this.f33884a = i10;
        this.f33885b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f33884a) {
            case 0:
                b6.a(this.f33885b);
                return;
            default:
                b6 b6Var = this.f33885b;
                Runnable runnable = b6Var.f32970c0;
                b6Var.f32970c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
