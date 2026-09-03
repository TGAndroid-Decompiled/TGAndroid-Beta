package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class bh implements Runnable {
    public final int f35531a;
    public final View f35532b;

    public bh(int i10, View view) {
        this.f35531a = i10;
        this.f35532b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f35531a;
        View view = this.f35532b;
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
                Drawable[] drawableArr = PhotoViewer.Q8;
                AndroidUtilities.removeFromParent(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                view.setVisibility(8);
                return;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.aa) view).f22570c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                return;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.aa) view).f22570c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                return;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.aa) view).f22570c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                return;
        }
    }
}
