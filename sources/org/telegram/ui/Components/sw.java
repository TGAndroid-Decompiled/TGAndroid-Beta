package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class sw implements View.OnFocusChangeListener {
    public final sz f32699a;

    public sw(sz szVar) {
        this.f32699a = szVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            sz szVar = this.f32699a;
            szVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(szVar.f32719c1).fetchNewEmojiKeywords(szVar.W0);
        }
    }
}
