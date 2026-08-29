package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j31 implements org.telegram.ui.Components.zn0 {
    public final org.telegram.ui.Components.ao0 f39421a;
    public final m31 f39422b;
    public final m31 f39423c;
    public final m31 d;
    public final k31 f39424e;

    public j31(k31 k31Var, org.telegram.ui.Components.ao0 ao0Var, m31 m31Var, m31 m31Var2, m31 m31Var3) {
        this.f39424e = k31Var;
        this.f39421a = ao0Var;
        this.f39422b = m31Var;
        this.f39423c = m31Var2;
        this.d = m31Var3;
    }

    @Override
    public final void W(float f9, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39424e.d;
        boolean isAttachedToWindow = this.f39421a.isAttachedToWindow();
        if (f9 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f9 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f9 / 0.7f)) + 524288.0f;
        }
        m31 m31Var = this.d;
        m31 m31Var2 = this.f39422b;
        m31 m31Var3 = this.f39423c;
        if (f9 >= 1.0f) {
            m31Var2.e(false, isAttachedToWindow);
            m31Var3.e(false, isAttachedToWindow);
            m31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f9 == 0.0f) {
            m31Var2.e(true, isAttachedToWindow);
            m31Var3.e(false, isAttachedToWindow);
            m31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            m31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            m31Var2.e(false, isAttachedToWindow);
            m31Var3.e(true, isAttachedToWindow);
            m31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
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
    public final void v() {
    }
}
