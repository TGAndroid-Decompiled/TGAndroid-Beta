package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d31 implements org.telegram.ui.Components.cp0 {
    public final org.telegram.ui.Components.dp0 f36246a;
    public final g31 f36247b;
    public final g31 f36248c;
    public final g31 d;
    public final e31 e;

    public d31(e31 e31Var, org.telegram.ui.Components.dp0 dp0Var, g31 g31Var, g31 g31Var2, g31 g31Var3) {
        this.e = e31Var;
        this.f36246a = dp0Var;
        this.f36247b = g31Var;
        this.f36248c = g31Var2;
        this.d = g31Var3;
    }

    @Override
    public final void L(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f36246a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        g31 g31Var = this.d;
        g31 g31Var2 = this.f36247b;
        g31 g31Var3 = this.f36248c;
        if (i10 >= 0) {
            g31Var2.e(false, isAttachedToWindow);
            g31Var3.e(false, isAttachedToWindow);
            g31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            g31Var2.e(true, isAttachedToWindow);
            g31Var3.e(false, isAttachedToWindow);
            g31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            g31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            g31Var2.e(false, isAttachedToWindow);
            g31Var3.e(true, isAttachedToWindow);
            g31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(g31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final int Y() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void v() {
    }
}
