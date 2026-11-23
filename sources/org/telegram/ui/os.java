package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.gs {
    public final int f50627a;
    public final View f50628b;

    public os(int i7, View view) {
        this.f50627a = i7;
        this.f50628b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f50627a) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f50628b;
                if (i7 == 262) {
                    x9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.n2) this.f50628b).invalidate();
                return;
        }
    }
}
