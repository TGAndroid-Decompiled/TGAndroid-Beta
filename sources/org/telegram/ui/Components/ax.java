package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class ax implements View.OnFocusChangeListener {
    public final a00 f24787a;

    public ax(a00 a00Var) {
        this.f24787a = a00Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            a00 a00Var = this.f24787a;
            a00Var.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(a00Var.f24401c1).fetchNewEmojiKeywords(a00Var.W0);
        }
    }
}
