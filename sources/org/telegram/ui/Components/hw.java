package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
public final class hw implements View.OnFocusChangeListener {
    public final kz f25507a;

    public hw(kz kzVar) {
        this.f25507a = kzVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            kz kzVar = this.f25507a;
            kzVar.T0 = currentKeyboardLanguage;
            MediaDataController.getInstance(kzVar.Z0).fetchNewEmojiKeywords(kzVar.T0);
        }
    }
}
