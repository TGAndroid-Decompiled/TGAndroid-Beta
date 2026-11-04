package org.telegram.ui;

import android.view.View;
public final class js implements org.telegram.messenger.cs {
    public final int f46683a;
    public final View f46684b;

    public js(int i3, View view) {
        this.f46683a = i3;
        this.f46684b = view;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
        switch (this.f46683a) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) this.f46684b;
                if (i3 == 259) {
                    v9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.k2) this.f46684b).invalidate();
                return;
        }
    }
}
