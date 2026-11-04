package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class pg implements Runnable {
    public final int f48573a;
    public final View f48574b;

    public pg(int i3, View view) {
        this.f48573a = i3;
        this.f48574b = view;
    }

    @Override
    public final void run() {
        int i3 = this.f48573a;
        View view = this.f48574b;
        switch (i3) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                view.setBackgroundDrawable(null);
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.V8;
                org.telegram.messenger.g0.E2(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                view.setVisibility(8);
                return;
            case 4:
                org.telegram.messenger.az.I(0);
                ((org.telegram.ui.Cells.v9) view).f30751c.c(org.telegram.messenger.bd.M0(2131744411, null), true, true);
                return;
            case 5:
                org.telegram.messenger.az.I(1);
                ((org.telegram.ui.Cells.v9) view).f30751c.c(org.telegram.messenger.bd.M0(2131744410, null), true, true);
                return;
            default:
                org.telegram.messenger.az.I(2);
                ((org.telegram.ui.Cells.v9) view).f30751c.c(org.telegram.messenger.bd.M0(2131744409, null), true, true);
                return;
        }
    }
}
