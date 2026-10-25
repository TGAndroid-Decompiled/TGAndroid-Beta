package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i31 implements org.telegram.ui.Components.kp0 {
    public final org.telegram.ui.Components.lp0 f40129a;
    public final l31 f40130b;
    public final l31 f40131c;
    public final l31 d;
    public final j31 e;

    public i31(j31 j31Var, org.telegram.ui.Components.lp0 lp0Var, l31 l31Var, l31 l31Var2, l31 l31Var3) {
        this.e = j31Var;
        this.f40129a = lp0Var;
        this.f40130b = l31Var;
        this.f40131c = l31Var2;
        this.d = l31Var3;
    }

    @Override
    public final void U(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f40129a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        l31 l31Var = this.d;
        l31 l31Var2 = this.f40130b;
        l31 l31Var3 = this.f40131c;
        if (i10 >= 0) {
            l31Var2.e(false, isAttachedToWindow);
            l31Var3.e(false, isAttachedToWindow);
            l31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            l31Var2.e(true, isAttachedToWindow);
            l31Var3.e(false, isAttachedToWindow);
            l31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            l31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            l31Var2.e(false, isAttachedToWindow);
            l31Var3.e(true, isAttachedToWindow);
            l31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(l31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.Z().limitVideo = j10;
            saveToGallerySettingsActivity.a0();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void y() {
    }
}
