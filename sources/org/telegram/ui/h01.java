package org.telegram.ui;
public final class h01 implements Runnable {
    public final int f38177a;
    public final i01 f38178b;

    public h01(i01 i01Var, int i10) {
        this.f38177a = i10;
        this.f38178b = i01Var;
    }

    @Override
    public final void run() {
        switch (this.f38177a) {
            case 0:
                ProfileActivity profileActivity = this.f38178b.D0;
                vz0 vz0Var = profileActivity.B5;
                if (vz0Var != null) {
                    vz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.qm0 currentListView = this.f38178b.f38426x0.O.getCurrentListView();
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
