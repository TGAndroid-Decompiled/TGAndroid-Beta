package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class sw implements View.OnFocusChangeListener {
    public final tz f30400a;

    public sw(tz tzVar) {
        this.f30400a = tzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            tz tzVar = this.f30400a;
            tzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(tzVar.f30747c1).fetchNewEmojiKeywords(tzVar.W0);
        }
    }
}
