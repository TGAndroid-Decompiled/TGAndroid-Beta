package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

public final class wv implements View.OnFocusChangeListener {

    public final yy f34347a;

    public wv(yy yyVar) {
        this.f34347a = yyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            yy yyVar = this.f34347a;
            yyVar.S0 = currentKeyboardLanguage;
            MediaDataController.getInstance(yyVar.Y0).fetchNewEmojiKeywords(yyVar.S0);
        }
    }
}
