package org.telegram.ui;
public final class kz0 implements Runnable {
    public final int f38704a;
    public final lz0 f38705b;

    public kz0(lz0 lz0Var, int i10) {
        this.f38704a = i10;
        this.f38705b = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f38704a) {
            case 0:
                ProfileActivity profileActivity = this.f38705b.D0;
                yy0 yy0Var = profileActivity.D5;
                if (yy0Var != null) {
                    yy0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.jm0 currentListView = this.f38705b.f39070x0.O.getCurrentListView();
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
