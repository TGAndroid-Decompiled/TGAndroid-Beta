package org.telegram.ui;
public final class k01 implements Runnable {
    public final int f34967a;
    public final l01 f34968b;

    public k01(l01 l01Var, int i10) {
        this.f34967a = i10;
        this.f34968b = l01Var;
    }

    @Override
    public final void run() {
        switch (this.f34967a) {
            case 0:
                ProfileActivity profileActivity = this.f34968b.D0;
                xz0 xz0Var = profileActivity.B5;
                if (xz0Var != null) {
                    xz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ml0 currentListView = this.f34968b.f35405x0.O.getCurrentListView();
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
