package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.fs {
    public final int f50646a;
    public final View f50647b;

    public os(int i7, View view) {
        this.f50646a = i7;
        this.f50647b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f50646a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f50647b;
                if (i7 == 262) {
                    x9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.n2) this.f50647b).invalidate();
                return;
        }
    }
}
