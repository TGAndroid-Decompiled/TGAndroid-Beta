package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class ow implements View.OnFocusChangeListener {
    public final nz f29458a;

    public ow(nz nzVar) {
        this.f29458a = nzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            nz nzVar = this.f29458a;
            nzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(nzVar.f29091c1).fetchNewEmojiKeywords(nzVar.W0);
        }
    }
}
