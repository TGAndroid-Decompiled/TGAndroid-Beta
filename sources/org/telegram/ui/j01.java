package org.telegram.ui;
public final class j01 implements Runnable {
    public final int f37473a;
    public final k01 f37474b;

    public j01(k01 k01Var, int i10) {
        this.f37473a = i10;
        this.f37474b = k01Var;
    }

    @Override
    public final void run() {
        switch (this.f37473a) {
            case 0:
                ProfileActivity profileActivity = this.f37474b.D0;
                wz0 wz0Var = profileActivity.B5;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    profileActivity.B5 = null;
                    return;
                }
                return;
            default:
                try {
                    org.telegram.ui.Components.ll0 currentListView = this.f37474b.f37874x0.O.getCurrentListView();
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
