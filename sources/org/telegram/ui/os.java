package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.fs {
    public final int f50657a;
    public final View f50658b;

    public os(int i7, View view) {
        this.f50657a = i7;
        this.f50658b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f50657a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.f50658b;
                if (i7 == 261) {
                    w9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.o2) this.f50658b).invalidate();
                return;
        }
    }
}
