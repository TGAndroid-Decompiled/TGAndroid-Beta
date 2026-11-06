package org.telegram.ui;
public final class pr0 implements Runnable {
    public final int f48915a;
    public final yr0 f48916b;

    public pr0(yr0 yr0Var, int i7) {
        this.f48915a = i7;
        this.f48916b = yr0Var;
    }

    @Override
    public final void run() {
        switch (this.f48915a) {
            case 0:
                yr0 yr0Var = this.f48916b;
                org.telegram.messenger.g0.h3(new pr0(yr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = yr0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = yr0Var.L;
                    q1Var2.f29798c6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = yr0Var.f52305e0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    yr0Var.f52305e0 = null;
                    return;
                }
                return;
            case 1:
                this.f48916b.c(false);
                return;
            case 2:
                this.f48916b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public pr0(yr0 yr0Var, boolean z9) {
        this.f48915a = 0;
        this.f48916b = yr0Var;
    }
}
