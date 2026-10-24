package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g31 implements org.telegram.ui.Components.fp0 {
    public final org.telegram.ui.Components.gp0 f37432a;
    public final j31 f37433b;
    public final j31 f37434c;
    public final j31 d;
    public final h31 e;

    public g31(h31 h31Var, org.telegram.ui.Components.gp0 gp0Var, j31 j31Var, j31 j31Var2, j31 j31Var3) {
        this.e = h31Var;
        this.f37432a = gp0Var;
        this.f37433b = j31Var;
        this.f37434c = j31Var2;
        this.d = j31Var3;
    }

    @Override
    public final void L(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f37432a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        j31 j31Var = this.d;
        j31 j31Var2 = this.f37433b;
        j31 j31Var3 = this.f37434c;
        if (i10 >= 0) {
            j31Var2.e(false, isAttachedToWindow);
            j31Var3.e(false, isAttachedToWindow);
            j31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            j31Var2.e(true, isAttachedToWindow);
            j31Var3.e(false, isAttachedToWindow);
            j31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            j31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            j31Var2.e(false, isAttachedToWindow);
            j31Var3.e(true, isAttachedToWindow);
            j31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(j31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.Y().limitVideo = j10;
            saveToGallerySettingsActivity.Z();
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
