package org.telegram.ui;
public final class oz0 implements Runnable {
    public final int f40313a;
    public final pz0 f40314b;

    public oz0(pz0 pz0Var, int i10) {
        this.f40313a = i10;
        this.f40314b = pz0Var;
    }

    @Override
    public final void run() {
        switch (this.f40313a) {
            case 0:
                ProfileActivity profileActivity = this.f40314b.D0;
                cz0 cz0Var = profileActivity.D5;
                if (cz0Var != null) {
                    cz0Var.dismiss();
                    profileActivity.D5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.f40314b.f40579x0.O.getCurrentListView();
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
