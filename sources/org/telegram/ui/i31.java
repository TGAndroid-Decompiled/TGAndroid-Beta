package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class i31 implements org.telegram.ui.Components.pn0 {

    public final org.telegram.ui.Components.qn0 f38966a;

    public final l31 f38967b;

    public final l31 f38968c;
    public final l31 d;

    public final j31 f38969e;

    public i31(j31 j31Var, org.telegram.ui.Components.qn0 qn0Var, l31 l31Var, l31 l31Var2, l31 l31Var3) {
        this.f38969e = j31Var;
        this.f38966a = qn0Var;
        this.f38967b = l31Var;
        this.f38968c = l31Var2;
        this.d = l31Var3;
    }

    @Override
    public final void P(float f10, boolean z10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f38969e.d;
        boolean zIsAttachedToWindow = this.f38966a.isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        l31 l31Var = this.d;
        l31 l31Var2 = this.f38967b;
        l31 l31Var3 = this.f38968c;
        if (f10 >= 1.0f) {
            l31Var2.e(false, zIsAttachedToWindow);
            l31Var3.e(false, zIsAttachedToWindow);
            l31Var.e(true, zIsAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, zIsAttachedToWindow);
        } else if (f10 == 0.0f) {
            l31Var2.e(true, zIsAttachedToWindow);
            l31Var3.e(false, zIsAttachedToWindow);
            l31Var.e(false, zIsAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, zIsAttachedToWindow);
        } else {
            l31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            l31Var2.e(false, zIsAttachedToWindow);
            l31Var3.e(true, zIsAttachedToWindow);
            l31Var.e(false, zIsAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, true, 0.8f, zIsAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void r() {
    }
}
