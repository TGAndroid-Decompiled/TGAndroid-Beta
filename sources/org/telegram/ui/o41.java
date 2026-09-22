package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o41 implements org.telegram.ui.Components.eo0 {
    public final org.telegram.ui.Components.fo0 f36109a;
    public final r41 f36110b;
    public final r41 f36111c;
    public final r41 d;
    public final p41 e;

    public o41(p41 p41Var, org.telegram.ui.Components.fo0 fo0Var, r41 r41Var, r41 r41Var2, r41 r41Var3) {
        this.e = p41Var;
        this.f36109a = fo0Var;
        this.f36110b = r41Var;
        this.f36111c = r41Var2;
        this.d = r41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f36109a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        r41 r41Var = this.d;
        r41 r41Var2 = this.f36110b;
        r41 r41Var3 = this.f36111c;
        if (f7 >= 1.0f) {
            r41Var2.e(false, isAttachedToWindow);
            r41Var3.e(false, isAttachedToWindow);
            r41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            r41Var2.e(true, isAttachedToWindow);
            r41Var3.e(false, isAttachedToWindow);
            r41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            r41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            r41Var2.e(false, isAttachedToWindow);
            r41Var3.e(true, isAttachedToWindow);
            r41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(r41Var3, true, 0.8f, isAttachedToWindow);
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
