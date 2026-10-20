package org.telegram.ui;
public final class kz0 implements Runnable {
    public final int f38699a;
    public final lz0 f38700b;

    public kz0(lz0 lz0Var, int i10) {
        this.f38699a = i10;
        this.f38700b = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f38699a) {
            case 0:
                ProfileActivity profileActivity = this.f38700b.D0;
                yy0 yy0Var = profileActivity.D5;
                if (yy0Var != null) {
                    yy0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.jm0 currentListView = this.f38700b.f39065x0.O.getCurrentListView();
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
