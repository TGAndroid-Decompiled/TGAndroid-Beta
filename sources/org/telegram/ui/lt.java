package org.telegram.ui;

import android.view.View;
public final class lt implements org.telegram.messenger.vs {
    public final int f39373a;
    public final View f39374b;

    public lt(int i10, View view) {
        this.f39373a = i10;
        this.f39374b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f39373a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f39374b;
                if (i10 == 259) {
                    x9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.q2) this.f39374b).invalidate();
                return;
        }
    }
}
