package org.telegram.ui;
public final class k01 implements Runnable {
    public final int f34962a;
    public final l01 f34963b;

    public k01(l01 l01Var, int i10) {
        this.f34962a = i10;
        this.f34963b = l01Var;
    }

    @Override
    public final void run() {
        switch (this.f34962a) {
            case 0:
                ProfileActivity profileActivity = this.f34963b.D0;
                xz0 xz0Var = profileActivity.B5;
                if (xz0Var != null) {
                    xz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ml0 currentListView = this.f34963b.f35400x0.O.getCurrentListView();
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
