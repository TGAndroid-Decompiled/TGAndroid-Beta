package org.telegram.ui;

import android.view.View;
public final class os implements org.telegram.messenger.is {
    public final int f50052a;
    public final View f50053b;

    public os(int i7, View view) {
        this.f50052a = i7;
        this.f50053b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f50052a) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) this.f50053b;
                if (i7 == 259) {
                    v9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.l2) this.f50053b).invalidate();
                return;
        }
    }
}
