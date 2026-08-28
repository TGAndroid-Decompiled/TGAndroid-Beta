package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j31 implements org.telegram.ui.Components.on0 {
    public final org.telegram.ui.Components.pn0 f39355a;
    public final m31 f39356b;
    public final m31 f39357c;
    public final m31 d;
    public final k31 f39358e;

    public j31(k31 k31Var, org.telegram.ui.Components.pn0 pn0Var, m31 m31Var, m31 m31Var2, m31 m31Var3) {
        this.f39358e = k31Var;
        this.f39355a = pn0Var;
        this.f39356b = m31Var;
        this.f39357c = m31Var2;
        this.d = m31Var3;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39358e.d;
        boolean isAttachedToWindow = this.f39355a.isAttachedToWindow();
        if (f10 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        m31 m31Var = this.d;
        m31 m31Var2 = this.f39356b;
        m31 m31Var3 = this.f39357c;
        if (f10 >= 1.0f) {
            m31Var2.e(false, isAttachedToWindow);
            m31Var3.e(false, isAttachedToWindow);
            m31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(m31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
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
            saveToGallerySettingsActivity.W().limitVideo = j10;
            saveToGallerySettingsActivity.X();
        }
    }

    @Override
    public final int c0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void n() {
    }
}
