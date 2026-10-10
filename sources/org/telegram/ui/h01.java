package org.telegram.ui;
public final class h01 implements Runnable {
    public final int f38223a;
    public final i01 f38224b;

    public h01(i01 i01Var, int i10) {
        this.f38223a = i10;
        this.f38224b = i01Var;
    }

    @Override
    public final void run() {
        switch (this.f38223a) {
            case 0:
                ProfileActivity profileActivity = this.f38224b.D0;
                vz0 vz0Var = profileActivity.B5;
                if (vz0Var != null) {
                    vz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.rm0 currentListView = this.f38224b.f38472x0.O.getCurrentListView();
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
