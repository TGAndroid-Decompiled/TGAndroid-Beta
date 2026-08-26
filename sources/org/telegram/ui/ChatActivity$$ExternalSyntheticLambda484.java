package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ChatActivity$$ExternalSyntheticLambda484 implements Runnable {
    public final int $r8$classId;
    public final ActionBarPopupWindow f$0;

    public ChatActivity$$ExternalSyntheticLambda484(ActionBarPopupWindow actionBarPopupWindow, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarPopupWindow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
