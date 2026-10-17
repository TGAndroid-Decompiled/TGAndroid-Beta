package org.telegram.ui;
public final class mz0 implements Runnable {
    public final int f39279a;
    public final nz0 f39280b;

    public mz0(nz0 nz0Var, int i10) {
        this.f39279a = i10;
        this.f39280b = nz0Var;
    }

    @Override
    public final void run() {
        switch (this.f39279a) {
            case 0:
                ProfileActivity profileActivity = this.f39280b.D0;
                az0 az0Var = profileActivity.D5;
                if (az0Var != null) {
                    az0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.im0 currentListView = this.f39280b.f39599x0.O.getCurrentListView();
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
