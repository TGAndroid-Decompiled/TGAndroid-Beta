package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class lw implements View.OnFocusChangeListener {
    public final lz f26202a;

    public lw(lz lzVar) {
        this.f26202a = lzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            lz lzVar = this.f26202a;
            lzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(lzVar.f26236c1).fetchNewEmojiKeywords(lzVar.W0);
        }
    }
}
