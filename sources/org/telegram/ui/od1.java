package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class od1 extends org.telegram.ui.Components.xu0 {
    public boolean f41126s0;

    @Override
    public final void onMeasure(int i9, int i10) {
        R();
        if (getKeyboardHeight() == 0 && !this.f41126s0) {
            int i11 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f34780f = i11;
            setPadding(0, 0, 0, i11);
        } else {
            this.f41126s0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i9, i10);
    }
}
