package org.telegram.ui;
public final class i01 implements Runnable {
    public final int f34373a;
    public final j01 f34374b;

    public i01(j01 j01Var, int i10) {
        this.f34373a = i10;
        this.f34374b = j01Var;
    }

    @Override
    public final void run() {
        switch (this.f34373a) {
            case 0:
                ProfileActivity profileActivity = this.f34374b.D0;
                vz0 vz0Var = profileActivity.B5;
                if (vz0Var != null) {
                    vz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ll0 currentListView = this.f34374b.f34767x0.O.getCurrentListView();
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
