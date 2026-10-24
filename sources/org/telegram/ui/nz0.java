package org.telegram.ui;
public final class nz0 implements Runnable {
    public final int f40028a;
    public final oz0 f40029b;

    public nz0(oz0 oz0Var, int i10) {
        this.f40028a = i10;
        this.f40029b = oz0Var;
    }

    @Override
    public final void run() {
        switch (this.f40028a) {
            case 0:
                ProfileActivity profileActivity = this.f40029b.D0;
                bz0 bz0Var = profileActivity.D5;
                if (bz0Var != null) {
                    bz0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.lm0 currentListView = this.f40029b.f40291x0.O.getCurrentListView();
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
