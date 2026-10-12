package org.telegram.ui;
public final class j01 implements Runnable {
    public final int f39062a;
    public final k01 f39063b;

    public j01(k01 k01Var, int i10) {
        this.f39062a = i10;
        this.f39063b = k01Var;
    }

    @Override
    public final void run() {
        switch (this.f39062a) {
            case 0:
                ProfileActivity profileActivity = this.f39063b.D0;
                xz0 xz0Var = profileActivity.B5;
                if (xz0Var != null) {
                    xz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.wm0 currentListView = this.f39063b.f39310x0.O.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
