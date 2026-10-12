package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class dx implements View.OnFocusChangeListener {
    public final d00 f25475a;

    public dx(d00 d00Var) {
        this.f25475a = d00Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            d00 d00Var = this.f25475a;
            d00Var.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(d00Var.f25080c1).fetchNewEmojiKeywords(d00Var.W0);
        }
    }
}
