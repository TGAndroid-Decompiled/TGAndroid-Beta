package org.telegram.ui;
public final class pn0 implements Runnable {
    public final int f36573a;
    public final long f36574b;

    public pn0(long j3, int i10) {
        this.f36573a = i10;
        this.f36574b = j3;
    }

    @Override
    public final void run() {
        switch (this.f36573a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(wn.R9(this.f36574b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.R9(this.f36574b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.R9(this.f36574b));
                    return;
                }
                return;
        }
    }
}
