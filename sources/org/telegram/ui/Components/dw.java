package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class dw implements View.OnFocusChangeListener {
    public final fz f27884a;

    public dw(fz fzVar) {
        this.f27884a = fzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            fz fzVar = this.f27884a;
            fzVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(fzVar.Y0).fetchNewEmojiKeywords(fzVar.S0);
        }
    }
}
