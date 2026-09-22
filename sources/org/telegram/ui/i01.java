package org.telegram.ui;
public final class i01 implements Runnable {
    public final int f34347a;
    public final j01 f34348b;

    public i01(j01 j01Var, int i10) {
        this.f34347a = i10;
        this.f34348b = j01Var;
    }

    @Override
    public final void run() {
        switch (this.f34347a) {
            case 0:
                ProfileActivity profileActivity = this.f34348b.D0;
                vz0 vz0Var = profileActivity.B5;
                if (vz0Var != null) {
                    vz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.yl0 currentListView = this.f34348b.f34744x0.O.getCurrentListView();
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
