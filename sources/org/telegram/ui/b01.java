package org.telegram.ui;
public final class b01 implements Runnable {
    public final int f32198a;
    public final c01 f32199b;

    public b01(c01 c01Var, int i10) {
        this.f32198a = i10;
        this.f32199b = c01Var;
    }

    @Override
    public final void run() {
        switch (this.f32198a) {
            case 0:
                ProfileActivity profileActivity = this.f32199b.D0;
                oz0 oz0Var = profileActivity.B5;
                if (oz0Var != null) {
                    oz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.yl0 currentListView = this.f32199b.f32471x0.O.getCurrentListView();
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
