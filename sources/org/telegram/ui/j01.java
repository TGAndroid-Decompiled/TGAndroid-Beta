package org.telegram.ui;
public final class j01 implements Runnable {
    public final int f34751a;
    public final k01 f34752b;

    public j01(k01 k01Var, int i10) {
        this.f34751a = i10;
        this.f34752b = k01Var;
    }

    @Override
    public final void run() {
        switch (this.f34751a) {
            case 0:
                ProfileActivity profileActivity = this.f34752b.D0;
                wz0 wz0Var = profileActivity.B5;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ll0 currentListView = this.f34752b.f35018x0.O.getCurrentListView();
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
