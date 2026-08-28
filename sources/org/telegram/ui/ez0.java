package org.telegram.ui;
public final class ez0 implements Runnable {
    public final int f38056a;
    public final fz0 f38057b;

    public ez0(fz0 fz0Var, int i9) {
        this.f38056a = i9;
        this.f38057b = fz0Var;
    }

    @Override
    public final void run() {
        switch (this.f38056a) {
            case 0:
                ProfileActivity profileActivity = this.f38057b.f38386z0;
                sy0 sy0Var = profileActivity.f36082x5;
                if (sy0Var != null) {
                    sy0Var.dismiss();
                    profileActivity.f36082x5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.wk0 currentListView = this.f38057b.f38380t0.K.getCurrentListView();
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
