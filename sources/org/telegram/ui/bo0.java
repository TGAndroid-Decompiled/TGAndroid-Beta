package org.telegram.ui;
public final class bo0 implements Runnable {
    public final int f34358a;
    public final long f34359b;

    public bo0(long j10, int i10) {
        this.f34358a = i10;
        this.f34359b = j10;
    }

    @Override
    public final void run() {
        switch (this.f34358a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(fo.W9(this.f34359b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(fo.W9(this.f34359b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(fo.W9(this.f34359b));
                    return;
                }
                return;
        }
    }
}
