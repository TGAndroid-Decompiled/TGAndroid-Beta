package org.telegram.ui;
public final class ez0 implements Runnable {
    public final int f37935a;
    public final fz0 f37936b;

    public ez0(fz0 fz0Var, int i10) {
        this.f37935a = i10;
        this.f37936b = fz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37935a) {
            case 0:
                ProfileActivity profileActivity = this.f37936b.f38396z0;
                sy0 sy0Var = profileActivity.f36147x5;
                if (sy0Var != null) {
                    sy0Var.dismiss();
                    profileActivity.f36147x5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.jl0 currentListView = this.f37936b.f38390t0.K.getCurrentListView();
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
