package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class ww implements View.OnFocusChangeListener {
    public final wz f30675a;

    public ww(wz wzVar) {
        this.f30675a = wzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            wz wzVar = this.f30675a;
            wzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(wzVar.f30707c1).fetchNewEmojiKeywords(wzVar.W0);
        }
    }
}
