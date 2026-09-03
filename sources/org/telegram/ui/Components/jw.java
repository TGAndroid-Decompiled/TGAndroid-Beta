package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class jw implements View.OnFocusChangeListener {
    public final mz f28204a;

    public jw(mz mzVar) {
        this.f28204a = mzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            mz mzVar = this.f28204a;
            mzVar.T0 = currentKeyboardLanguage;
            MediaDataController.getInstance(mzVar.Z0).fetchNewEmojiKeywords(mzVar.T0);
        }
    }
}
