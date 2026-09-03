package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class dh implements Runnable {
    public final int f33476a;
    public final View f33477b;

    public dh(int i10, View view) {
        this.f33476a = i10;
        this.f33477b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f33476a;
        View view = this.f33477b;
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
                ((org.telegram.ui.Cells.z9) view).f22678c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                return;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.z9) view).f22678c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                return;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.z9) view).f22678c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                return;
        }
    }
}
