package org.telegram.ui;

public final class ez0 implements Runnable {

    public final int f37883a;

    public final fz0 f37884b;

    public ez0(fz0 fz0Var, int i10) {
        this.f37883a = i10;
        this.f37884b = fz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37883a) {
            case 0:
                ProfileActivity profileActivity = this.f37884b.f38246z0;
                sy0 sy0Var = profileActivity.f36085x5;
                if (sy0Var != null) {
                    sy0Var.dismiss();
                    profileActivity.f36085x5 = null;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.zk0 currentListView = this.f37884b.f38240t0.K.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
