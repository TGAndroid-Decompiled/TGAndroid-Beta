package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q41 implements org.telegram.ui.Components.eo0 {
    public final org.telegram.ui.Components.fo0 f39725a;
    public final t41 f39726b;
    public final t41 f39727c;
    public final t41 d;
    public final r41 f39728e;

    public q41(r41 r41Var, org.telegram.ui.Components.fo0 fo0Var, t41 t41Var, t41 t41Var2, t41 t41Var3) {
        this.f39728e = r41Var;
        this.f39725a = fo0Var;
        this.f39726b = t41Var;
        this.f39727c = t41Var2;
        this.d = t41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39728e.d;
        boolean isAttachedToWindow = this.f39725a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        t41 t41Var = this.d;
        t41 t41Var2 = this.f39726b;
        t41 t41Var3 = this.f39727c;
        if (f7 >= 1.0f) {
            t41Var2.e(false, isAttachedToWindow);
            t41Var3.e(false, isAttachedToWindow);
            t41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            t41Var2.e(true, isAttachedToWindow);
            t41Var3.e(false, isAttachedToWindow);
            t41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            t41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            t41Var2.e(false, isAttachedToWindow);
            t41Var3.e(true, isAttachedToWindow);
            t41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(t41Var3, true, 0.8f, isAttachedToWindow);
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
    public final int l0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
