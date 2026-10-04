package org.telegram.ui;
public final class b01 implements Runnable {
    public final int f34945a;
    public final c01 f34946b;

    public b01(c01 c01Var, int i10) {
        this.f34945a = i10;
        this.f34946b = c01Var;
    }

    @Override
    public final void run() {
        switch (this.f34945a) {
            case 0:
                ProfileActivity profileActivity = this.f34946b.D0;
                pz0 pz0Var = profileActivity.B5;
                if (pz0Var != null) {
                    pz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.zl0 currentListView = this.f34946b.f35236x0.O.getCurrentListView();
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
