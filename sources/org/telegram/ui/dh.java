package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class dh implements Runnable {
    public final int f38885a;
    public final View f38886b;

    public dh(int i10, View view) {
        this.f38885a = i10;
        this.f38886b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f38885a;
        View view = this.f38886b;
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
                view.setVisibility(8);
                return;
            case 3:
                Drawable[] drawableArr = PhotoViewer.U8;
                AndroidUtilities.removeFromParent(view);
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                view.setVisibility(8);
                return;
            case 5:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.ga) view).f24179c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                return;
            case 6:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.ga) view).f24179c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                return;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.ga) view).f24179c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                return;
        }
    }
}
