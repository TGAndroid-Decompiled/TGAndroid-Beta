package org.telegram.ui;
public final class o01 implements Runnable {
    public final int f38820a;
    public final p01 f38821b;

    public o01(p01 p01Var, int i10) {
        this.f38820a = i10;
        this.f38821b = p01Var;
    }

    @Override
    public final void run() {
        switch (this.f38820a) {
            case 0:
                ProfileActivity profileActivity = this.f38821b.D0;
                c01 c01Var = profileActivity.B5;
                if (c01Var != null) {
                    c01Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.f38821b.f39091x0.O.getCurrentListView();
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
