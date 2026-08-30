package org.telegram.ui;
public final class pz0 implements Runnable {
    public final int f37560a;
    public final qz0 f37561b;

    public pz0(qz0 qz0Var, int i10) {
        this.f37560a = i10;
        this.f37561b = qz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37560a) {
            case 0:
                ProfileActivity profileActivity = this.f37561b.A0;
                dz0 dz0Var = profileActivity.f32200y5;
                if (dz0Var != null) {
                    dz0Var.dismiss();
                    profileActivity.f32200y5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.sl0 currentListView = this.f37561b.f37876u0.L.getCurrentListView();
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
