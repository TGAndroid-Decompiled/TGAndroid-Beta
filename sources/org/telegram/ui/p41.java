package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p41 implements org.telegram.ui.Components.kp0 {
    public final org.telegram.ui.Components.lp0 f40777a;
    public final s41 f40778b;
    public final s41 f40779c;
    public final s41 d;
    public final q41 f40780e;

    public p41(q41 q41Var, org.telegram.ui.Components.lp0 lp0Var, s41 s41Var, s41 s41Var2, s41 s41Var3) {
        this.f40780e = q41Var;
        this.f40777a = lp0Var;
        this.f40778b = s41Var;
        this.f40779c = s41Var2;
        this.d = s41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40780e.d;
        boolean isAttachedToWindow = this.f40777a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        s41 s41Var = this.d;
        s41 s41Var2 = this.f40778b;
        s41 s41Var3 = this.f40779c;
        if (i10 >= 0) {
            s41Var2.e(false, isAttachedToWindow);
            s41Var3.e(false, isAttachedToWindow);
            s41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            s41Var2.e(true, isAttachedToWindow);
            s41Var3.e(false, isAttachedToWindow);
            s41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            s41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            s41Var2.e(false, isAttachedToWindow);
            s41Var3.e(true, isAttachedToWindow);
            s41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(s41Var3, true, 0.8f, isAttachedToWindow);
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
    public final int i0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
