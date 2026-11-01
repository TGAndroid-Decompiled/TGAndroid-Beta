package org.telegram.ui;
public final class ex0 implements Runnable {
    public final int f36922a;
    public final fx0 f36923b;

    public ex0(fx0 fx0Var, int i10) {
        this.f36922a = i10;
        this.f36923b = fx0Var;
    }

    @Override
    public final void run() {
        switch (this.f36922a) {
            case 0:
                ProfileActivity profileActivity = this.f36923b.m0;
                qw0 qw0Var = profileActivity.N5;
                if (qw0Var != null) {
                    qw0Var.dismiss();
                    profileActivity.N5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.uk0 currentListView = this.f36923b.f37249g0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
