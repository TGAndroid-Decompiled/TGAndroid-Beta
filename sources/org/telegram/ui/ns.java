package org.telegram.ui;

import android.view.View;
public final class ns implements org.telegram.messenger.ls {
    public final int f48228a;
    public final View f48229b;

    public ns(int i7, View view) {
        this.f48228a = i7;
        this.f48229b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f48228a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.f48229b;
                if (i7 == 259) {
                    w9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.m2) this.f48229b).invalidate();
                return;
        }
    }
}
