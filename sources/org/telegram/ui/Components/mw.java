package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class mw implements View.OnFocusChangeListener {
    public final mz f26505a;

    public mw(mz mzVar) {
        this.f26505a = mzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            mz mzVar = this.f26505a;
            mzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(mzVar.f26533c1).fetchNewEmojiKeywords(mzVar.W0);
        }
    }
}
