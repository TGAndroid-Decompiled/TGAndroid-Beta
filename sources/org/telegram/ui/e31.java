package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e31 implements org.telegram.ui.Components.bp0 {
    public final org.telegram.ui.Components.cp0 f36383a;
    public final h31 f36384b;
    public final h31 f36385c;
    public final h31 d;
    public final f31 e;

    public e31(f31 f31Var, org.telegram.ui.Components.cp0 cp0Var, h31 h31Var, h31 h31Var2, h31 h31Var3) {
        this.e = f31Var;
        this.f36383a = cp0Var;
        this.f36384b = h31Var;
        this.f36385c = h31Var2;
        this.d = h31Var3;
    }

    @Override
    public final void L(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f36383a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        h31 h31Var = this.d;
        h31 h31Var2 = this.f36384b;
        h31 h31Var3 = this.f36385c;
        if (i10 >= 0) {
            h31Var2.e(false, isAttachedToWindow);
            h31Var3.e(false, isAttachedToWindow);
            h31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            h31Var2.e(true, isAttachedToWindow);
            h31Var3.e(false, isAttachedToWindow);
            h31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            h31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            h31Var2.e(false, isAttachedToWindow);
            h31Var3.e(true, isAttachedToWindow);
            h31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(h31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
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
