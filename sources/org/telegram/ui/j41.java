package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j41 implements org.telegram.ui.Components.so0 {
    public final org.telegram.ui.Components.to0 f34633a;
    public final m41 f34634b;
    public final m41 f34635c;
    public final m41 d;
    public final k41 e;

    public j41(k41 k41Var, org.telegram.ui.Components.to0 to0Var, m41 m41Var, m41 m41Var2, m41 m41Var3) {
        this.e = k41Var;
        this.f34633a = to0Var;
        this.f34634b = m41Var;
        this.f34635c = m41Var2;
        this.d = m41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f34633a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        m41 m41Var = this.d;
        m41 m41Var2 = this.f34634b;
        m41 m41Var3 = this.f34635c;
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
