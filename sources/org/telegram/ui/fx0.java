package org.telegram.ui;
public final class fx0 implements Runnable {
    public final int f37360a;
    public final gx0 f37361b;

    public fx0(gx0 gx0Var, int i10) {
        this.f37360a = i10;
        this.f37361b = gx0Var;
    }

    @Override
    public final void run() {
        switch (this.f37360a) {
            case 0:
                ProfileActivity profileActivity = this.f37361b.m0;
                rw0 rw0Var = profileActivity.M5;
                if (rw0Var != null) {
                    rw0Var.dismiss();
                    profileActivity.M5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.tk0 currentListView = this.f37361b.f37663g0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
