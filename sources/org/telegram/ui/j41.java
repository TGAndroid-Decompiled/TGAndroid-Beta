package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j41 implements org.telegram.ui.Components.xo0 {
    public final org.telegram.ui.Components.yo0 f37575a;
    public final m41 f37576b;
    public final m41 f37577c;
    public final m41 d;
    public final k41 f37578e;

    public j41(k41 k41Var, org.telegram.ui.Components.yo0 yo0Var, m41 m41Var, m41 m41Var2, m41 m41Var3) {
        this.f37578e = k41Var;
        this.f37575a = yo0Var;
        this.f37576b = m41Var;
        this.f37577c = m41Var2;
        this.d = m41Var3;
    }

    @Override
    public final void Y(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37578e.d;
        boolean isAttachedToWindow = this.f37575a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        m41 m41Var = this.d;
        m41 m41Var2 = this.f37576b;
        m41 m41Var3 = this.f37577c;
        if (f7 >= 1.0f) {
            m41Var2.e(false, isAttachedToWindow);
            m41Var3.e(false, isAttachedToWindow);
            m41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            m41Var2.e(true, isAttachedToWindow);
            m41Var3.e(false, isAttachedToWindow);
            m41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            m41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            m41Var2.e(false, isAttachedToWindow);
            m41Var3.e(true, isAttachedToWindow);
            m41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.W().limitVideo = j3;
            saveToGallerySettingsActivity.X();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int p0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
