package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class jh implements Runnable {
    public final int f34100a;
    public final View f34101b;

    public jh(int i10, View view) {
        this.f34100a = i10;
        this.f34101b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f34100a;
        View view = this.f34101b;
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
                Drawable[] drawableArr = PhotoViewer.T8;
                AndroidUtilities.removeFromParent(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                view.setVisibility(8);
                return;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.ga) view).f19221c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                return;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.ga) view).f19221c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                return;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.ga) view).f19221c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                return;
        }
    }
}
