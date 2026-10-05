package org.telegram.ui;
public final class b01 implements Runnable {
    public final int f35001a;
    public final c01 f35002b;

    public b01(c01 c01Var, int i10) {
        this.f35001a = i10;
        this.f35002b = c01Var;
    }

    @Override
    public final void run() {
        switch (this.f35001a) {
            case 0:
                ProfileActivity profileActivity = this.f35002b.D0;
                pz0 pz0Var = profileActivity.B5;
                if (pz0Var != null) {
                    pz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.zl0 currentListView = this.f35002b.f35265x0.O.getCurrentListView();
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
