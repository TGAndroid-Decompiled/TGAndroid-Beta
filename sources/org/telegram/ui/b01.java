package org.telegram.ui;
public final class b01 implements Runnable {
    public final int f31916a;
    public final c01 f31917b;

    public b01(c01 c01Var, int i10) {
        this.f31916a = i10;
        this.f31917b = c01Var;
    }

    @Override
    public final void run() {
        switch (this.f31916a) {
            case 0:
                ProfileActivity profileActivity = this.f31917b.D0;
                oz0 oz0Var = profileActivity.B5;
                if (oz0Var != null) {
                    oz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ml0 currentListView = this.f31917b.f32211x0.O.getCurrentListView();
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
