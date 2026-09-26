package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class mw implements View.OnFocusChangeListener {
    public final mz f26514a;

    public mw(mz mzVar) {
        this.f26514a = mzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            mz mzVar = this.f26514a;
            mzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(mzVar.f26548c1).fetchNewEmojiKeywords(mzVar.W0);
        }
    }
}
