package org.telegram.ui;
public final class mz0 implements Runnable {
    public final int f39305a;
    public final nz0 f39306b;

    public mz0(nz0 nz0Var, int i10) {
        this.f39305a = i10;
        this.f39306b = nz0Var;
    }

    @Override
    public final void run() {
        switch (this.f39305a) {
            case 0:
                ProfileActivity profileActivity = this.f39306b.D0;
                az0 az0Var = profileActivity.D5;
                if (az0Var != null) {
                    az0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.im0 currentListView = this.f39306b.f39620x0.O.getCurrentListView();
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
