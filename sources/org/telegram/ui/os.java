package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.fs {
    public final int f50748a;
    public final View f50749b;

    public os(int i7, View view) {
        this.f50748a = i7;
        this.f50749b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f50748a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.f50749b;
                if (i7 == 262) {
                    w9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.n2) this.f50749b).invalidate();
                return;
        }
    }
}
