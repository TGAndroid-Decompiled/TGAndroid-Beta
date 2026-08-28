package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class xv implements View.OnFocusChangeListener {
    public final wy f34797a;

    public xv(wy wyVar) {
        this.f34797a = wyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            wy wyVar = this.f34797a;
            wyVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(wyVar.Y0).fetchNewEmojiKeywords(wyVar.S0);
        }
    }
}
