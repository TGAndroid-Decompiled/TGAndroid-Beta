package org.telegram.ui;
public final class jv0 implements Runnable {
    public final int f46694a;
    public final kv0 f46695b;

    public jv0(kv0 kv0Var, int i3) {
        this.f46694a = i3;
        this.f46695b = kv0Var;
    }

    @Override
    public final void run() {
        switch (this.f46694a) {
            case 0:
                ProfileActivity profileActivity = this.f46695b.f47034n0;
                yu0 yu0Var = profileActivity.O5;
                if (yu0Var != null) {
                    yu0Var.dismiss();
                    profileActivity.O5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.tj0 currentListView = this.f46695b.f47029h0.O.getCurrentListView();
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
