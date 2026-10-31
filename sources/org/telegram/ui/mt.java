package org.telegram.ui;

import android.view.View;
public final class mt implements org.telegram.messenger.us {
    public final int f39763a;
    public final View f39764b;

    public mt(int i10, View view) {
        this.f39763a = i10;
        this.f39764b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f39763a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f39764b;
                if (i10 == 259) {
                    x9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.q2) this.f39764b).invalidate();
                return;
        }
    }
}
