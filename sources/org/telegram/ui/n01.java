package org.telegram.ui;
public final class n01 implements Runnable {
    public final int f38105a;
    public final o01 f38106b;

    public n01(o01 o01Var, int i10) {
        this.f38105a = i10;
        this.f38106b = o01Var;
    }

    @Override
    public final void run() {
        switch (this.f38105a) {
            case 0:
                ProfileActivity profileActivity = this.f38106b.D0;
                b01 b01Var = profileActivity.B5;
                if (b01Var != null) {
                    b01Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.f38106b.f38509x0.O.getCurrentListView();
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
