package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class qw implements View.OnFocusChangeListener {
    public final rz f30005a;

    public qw(rz rzVar) {
        this.f30005a = rzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            rz rzVar = this.f30005a;
            rzVar.W0 = currentKeyboardLanguage;
            MediaDataController.getInstance(rzVar.f30310c1).fetchNewEmojiKeywords(rzVar.W0);
        }
    }
}
