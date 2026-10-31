package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hh implements Runnable {
    public final int f37964a;
    public final View f37965b;

    public hh(int i10, View view) {
        this.f37964a = i10;
        this.f37965b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f37964a;
        View view = this.f37965b;
        switch (i10) {
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
                Drawable[] drawableArr = PhotoViewer.U8;
                org.telegram.messenger.i0.E2(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                view.setVisibility(8);
                return;
            case 4:
                org.telegram.messenger.tz.I(0);
                ((org.telegram.ui.Cells.x9) view).f23599c.c(org.telegram.messenger.cd.L0(2131744427, null), true, true);
                return;
            case 5:
                org.telegram.messenger.tz.I(1);
                ((org.telegram.ui.Cells.x9) view).f23599c.c(org.telegram.messenger.cd.L0(2131744426, null), true, true);
                return;
            default:
                org.telegram.messenger.tz.I(2);
                ((org.telegram.ui.Cells.x9) view).f23599c.c(org.telegram.messenger.cd.L0(2131744425, null), true, true);
                return;
        }
    }
}
