package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h41 implements org.telegram.ui.Components.so0 {
    public final org.telegram.ui.Components.to0 f34120a;
    public final k41 f34121b;
    public final k41 f34122c;
    public final k41 d;
    public final i41 e;

    public h41(i41 i41Var, org.telegram.ui.Components.to0 to0Var, k41 k41Var, k41 k41Var2, k41 k41Var3) {
        this.e = i41Var;
        this.f34120a = to0Var;
        this.f34121b = k41Var;
        this.f34122c = k41Var2;
        this.d = k41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f34120a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        k41 k41Var = this.d;
        k41 k41Var2 = this.f34121b;
        k41 k41Var3 = this.f34122c;
        if (f7 >= 1.0f) {
            k41Var2.e(false, isAttachedToWindow);
            k41Var3.e(false, isAttachedToWindow);
            k41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            k41Var2.e(true, isAttachedToWindow);
            k41Var3.e(false, isAttachedToWindow);
            k41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            k41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            k41Var2.e(false, isAttachedToWindow);
            k41Var3.e(true, isAttachedToWindow);
            k41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k41Var3, true, 0.8f, isAttachedToWindow);
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
