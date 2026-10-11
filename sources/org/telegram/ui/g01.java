package org.telegram.ui;
public final class g01 implements Runnable {
    public final int f37866a;
    public final h01 f37867b;

    public g01(h01 h01Var, int i10) {
        this.f37866a = i10;
        this.f37867b = h01Var;
    }

    @Override
    public final void run() {
        switch (this.f37866a) {
            case 0:
                ProfileActivity profileActivity = this.f37867b.D0;
                uz0 uz0Var = profileActivity.B5;
                if (uz0Var != null) {
                    uz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.rm0 currentListView = this.f37867b.f38232x0.O.getCurrentListView();
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
