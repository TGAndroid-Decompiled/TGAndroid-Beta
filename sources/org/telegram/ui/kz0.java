package org.telegram.ui;
public final class kz0 implements Runnable {
    public final int f38695a;
    public final lz0 f38696b;

    public kz0(lz0 lz0Var, int i10) {
        this.f38695a = i10;
        this.f38696b = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f38695a) {
            case 0:
                ProfileActivity profileActivity = this.f38696b.D0;
                yy0 yy0Var = profileActivity.D5;
                if (yy0Var != null) {
                    yy0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.im0 currentListView = this.f38696b.f39094x0.O.getCurrentListView();
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
