package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g41 implements org.telegram.ui.Components.eo0 {
    public final org.telegram.ui.Components.fo0 f33460a;
    public final j41 f33461b;
    public final j41 f33462c;
    public final j41 d;
    public final h41 e;

    public g41(h41 h41Var, org.telegram.ui.Components.fo0 fo0Var, j41 j41Var, j41 j41Var2, j41 j41Var3) {
        this.e = h41Var;
        this.f33460a = fo0Var;
        this.f33461b = j41Var;
        this.f33462c = j41Var2;
        this.d = j41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f33460a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        j41 j41Var = this.d;
        j41 j41Var2 = this.f33461b;
        j41 j41Var3 = this.f33462c;
        if (f7 >= 1.0f) {
            j41Var2.e(false, isAttachedToWindow);
            j41Var3.e(false, isAttachedToWindow);
            j41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            j41Var2.e(true, isAttachedToWindow);
            j41Var3.e(false, isAttachedToWindow);
            j41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            j41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            j41Var2.e(false, isAttachedToWindow);
            j41Var3.e(true, isAttachedToWindow);
            j41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
