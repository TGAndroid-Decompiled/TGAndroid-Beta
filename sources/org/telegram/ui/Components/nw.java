package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class nw implements View.OnFocusChangeListener {
    public final nz f26790a;

    public nw(nz nzVar) {
        this.f26790a = nzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            nz nzVar = this.f26790a;
            nzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(nzVar.f26818c1).fetchNewEmojiKeywords(nzVar.W0);
        }
    }
}
