package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class kw implements View.OnFocusChangeListener {
    public final kz f25701a;

    public kw(kz kzVar) {
        this.f25701a = kzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            kz kzVar = this.f25701a;
            kzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(kzVar.f25716c1).fetchNewEmojiKeywords(kzVar.W0);
        }
    }
}
