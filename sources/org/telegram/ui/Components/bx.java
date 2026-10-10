package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class bx implements View.OnFocusChangeListener {
    public final b00 f25071a;

    public bx(b00 b00Var) {
        this.f25071a = b00Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            b00 b00Var = this.f25071a;
            b00Var.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(b00Var.f24689c1).fetchNewEmojiKeywords(b00Var.W0);
        }
    }
}
