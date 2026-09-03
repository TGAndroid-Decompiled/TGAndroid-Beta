package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c41 implements org.telegram.ui.Components.io0 {
    public final org.telegram.ui.Components.jo0 f33015a;
    public final f41 f33016b;
    public final f41 f33017c;
    public final f41 d;
    public final d41 e;

    public c41(d41 d41Var, org.telegram.ui.Components.jo0 jo0Var, f41 f41Var, f41 f41Var2, f41 f41Var3) {
        this.e = d41Var;
        this.f33015a = jo0Var;
        this.f33016b = f41Var;
        this.f33017c = f41Var2;
        this.d = f41Var3;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f33015a.isAttachedToWindow();
        if (f10 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        f41 f41Var = this.d;
        f41 f41Var2 = this.f33016b;
        f41 f41Var3 = this.f33017c;
        if (f10 >= 1.0f) {
            f41Var2.e(false, isAttachedToWindow);
            f41Var3.e(false, isAttachedToWindow);
            f41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            f41Var2.e(true, isAttachedToWindow);
            f41Var3.e(false, isAttachedToWindow);
            f41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            f41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            f41Var2.e(false, isAttachedToWindow);
            f41Var3.e(true, isAttachedToWindow);
            f41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(f41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z4) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
