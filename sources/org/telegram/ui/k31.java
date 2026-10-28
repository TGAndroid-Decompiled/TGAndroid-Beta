package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k31 implements org.telegram.ui.Components.lp0 {
    public final org.telegram.ui.Components.mp0 f40652a;
    public final n31 f40653b;
    public final n31 f40654c;
    public final n31 d;
    public final l31 e;

    public k31(l31 l31Var, org.telegram.ui.Components.mp0 mp0Var, n31 n31Var, n31 n31Var2, n31 n31Var3) {
        this.e = l31Var;
        this.f40652a = mp0Var;
        this.f40653b = n31Var;
        this.f40654c = n31Var2;
        this.d = n31Var3;
    }

    @Override
    public final void U(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f40652a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        n31 n31Var = this.d;
        n31 n31Var2 = this.f40653b;
        n31 n31Var3 = this.f40654c;
        if (i10 >= 0) {
            n31Var2.e(false, isAttachedToWindow);
            n31Var3.e(false, isAttachedToWindow);
            n31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            n31Var2.e(true, isAttachedToWindow);
            n31Var3.e(false, isAttachedToWindow);
            n31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            n31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            n31Var2.e(false, isAttachedToWindow);
            n31Var3.e(true, isAttachedToWindow);
            n31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(n31Var3, true, 0.8f, isAttachedToWindow);
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
