package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class lw implements View.OnFocusChangeListener {
    public final kz f28312a;

    public lw(kz kzVar) {
        this.f28312a = kzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            kz kzVar = this.f28312a;
            kzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(kzVar.f27932c1).fetchNewEmojiKeywords(kzVar.W0);
        }
    }
}
