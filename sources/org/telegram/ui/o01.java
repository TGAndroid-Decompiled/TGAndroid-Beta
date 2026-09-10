package org.telegram.ui;
public final class o01 implements Runnable {
    public final int f35377a;
    public final p01 f35378b;

    public o01(p01 p01Var, int i10) {
        this.f35377a = i10;
        this.f35378b = p01Var;
    }

    @Override
    public final void run() {
        switch (this.f35377a) {
            case 0:
                ProfileActivity profileActivity = this.f35378b.D0;
                zz0 zz0Var = profileActivity.B5;
                if (zz0Var != null) {
                    zz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.vl0 currentListView = this.f35378b.f35656x0.O.getCurrentListView();
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
