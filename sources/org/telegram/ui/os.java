package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.ls {
    public final int f48572a;
    public final View f48573b;

    public os(int i7, View view) {
        this.f48572a = i7;
        this.f48573b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f48572a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.f48573b;
                if (i7 == 259) {
                    w9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.n2) this.f48573b).invalidate();
                return;
        }
    }
}
