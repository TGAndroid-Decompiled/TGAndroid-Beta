package org.telegram.ui;
public final class g01 implements Runnable {
    public final int f37832a;
    public final h01 f37833b;

    public g01(h01 h01Var, int i10) {
        this.f37832a = i10;
        this.f37833b = h01Var;
    }

    @Override
    public final void run() {
        switch (this.f37832a) {
            case 0:
                ProfileActivity profileActivity = this.f37833b.D0;
                uz0 uz0Var = profileActivity.B5;
                if (uz0Var != null) {
                    uz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.sm0 currentListView = this.f37833b.f38198x0.O.getCurrentListView();
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
