package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ItemOptions$$ExternalSyntheticLambda4 implements ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public ItemOptions$$ExternalSyntheticLambda4(int i, ItemOptions itemOptions) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
    }

    @Override
    public final void onDispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addSpaceGap$10(keyEvent);
                break;
            default:
                this.f$0.lambda$init$0(keyEvent);
                break;
        }
    }
}
