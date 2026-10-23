package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h31 implements org.telegram.ui.Components.gp0 {
    public final org.telegram.ui.Components.hp0 f37722a;
    public final k31 f37723b;
    public final k31 f37724c;
    public final k31 d;
    public final i31 e;

    public h31(i31 i31Var, org.telegram.ui.Components.hp0 hp0Var, k31 k31Var, k31 k31Var2, k31 k31Var3) {
        this.e = i31Var;
        this.f37722a = hp0Var;
        this.f37723b = k31Var;
        this.f37724c = k31Var2;
        this.d = k31Var3;
    }

    @Override
    public final void L(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f37722a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        k31 k31Var = this.d;
        k31 k31Var2 = this.f37723b;
        k31 k31Var3 = this.f37724c;
        if (i10 >= 0) {
            k31Var2.e(false, isAttachedToWindow);
            k31Var3.e(false, isAttachedToWindow);
            k31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            k31Var2.e(true, isAttachedToWindow);
            k31Var3.e(false, isAttachedToWindow);
            k31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            k31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            k31Var2.e(false, isAttachedToWindow);
            k31Var3.e(true, isAttachedToWindow);
            k31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(k31Var3, true, 0.8f, isAttachedToWindow);
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
