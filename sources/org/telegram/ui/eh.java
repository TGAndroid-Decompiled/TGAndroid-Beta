package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class eh implements Runnable {
    public final int f36824a;
    public final View f36825b;

    public eh(int i10, View view) {
        this.f36824a = i10;
        this.f36825b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f36824a;
        View view = this.f36825b;
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
                org.telegram.messenger.uz.I(0);
                ((org.telegram.ui.Cells.x9) view).f23600c.c(org.telegram.messenger.dd.L0(2131744427, null), true, true);
                return;
            case 5:
                org.telegram.messenger.uz.I(1);
                ((org.telegram.ui.Cells.x9) view).f23600c.c(org.telegram.messenger.dd.L0(2131744426, null), true, true);
                return;
            default:
                org.telegram.messenger.uz.I(2);
                ((org.telegram.ui.Cells.x9) view).f23600c.c(org.telegram.messenger.dd.L0(2131744425, null), true, true);
                return;
        }
    }
}
