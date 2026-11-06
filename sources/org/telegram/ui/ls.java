package org.telegram.ui;

import android.view.View;
public final class ls implements org.telegram.messenger.ls {
    public final int f47581a;
    public final View f47582b;

    public ls(int i7, View view) {
        this.f47581a = i7;
        this.f47582b = view;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.f47581a) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) this.f47582b;
                if (i7 == 259) {
                    w9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ActionBar.m2) this.f47582b).invalidate();
                return;
        }
    }
}
