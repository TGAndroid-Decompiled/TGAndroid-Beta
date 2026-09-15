package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n41 implements org.telegram.ui.Components.eo0 {
    public final org.telegram.ui.Components.fo0 f35880a;
    public final q41 f35881b;
    public final q41 f35882c;
    public final q41 d;
    public final o41 e;

    public n41(o41 o41Var, org.telegram.ui.Components.fo0 fo0Var, q41 q41Var, q41 q41Var2, q41 q41Var3) {
        this.e = o41Var;
        this.f35880a = fo0Var;
        this.f35881b = q41Var;
        this.f35882c = q41Var2;
        this.d = q41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f35880a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        q41 q41Var = this.d;
        q41 q41Var2 = this.f35881b;
        q41 q41Var3 = this.f35882c;
        if (f7 >= 1.0f) {
            q41Var2.e(false, isAttachedToWindow);
            q41Var3.e(false, isAttachedToWindow);
            q41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            q41Var2.e(true, isAttachedToWindow);
            q41Var3.e(false, isAttachedToWindow);
            q41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            q41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            q41Var2.e(false, isAttachedToWindow);
            q41Var3.e(true, isAttachedToWindow);
            q41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(q41Var3, true, 0.8f, isAttachedToWindow);
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
