package org.telegram.ui;
public final class j01 implements Runnable {
    public final int f37500a;
    public final k01 f37501b;

    public j01(k01 k01Var, int i10) {
        this.f37500a = i10;
        this.f37501b = k01Var;
    }

    @Override
    public final void run() {
        switch (this.f37500a) {
            case 0:
                ProfileActivity profileActivity = this.f37501b.D0;
                wz0 wz0Var = profileActivity.B5;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ll0 currentListView = this.f37501b.f37901x0.O.getCurrentListView();
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
