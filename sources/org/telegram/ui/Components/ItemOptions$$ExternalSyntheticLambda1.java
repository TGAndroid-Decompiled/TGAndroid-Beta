package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ItemOptions$$ExternalSyntheticLambda1 implements ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public ItemOptions$$ExternalSyntheticLambda1(int i, ItemOptions itemOptions) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
    }

    @Override
    public final void onDispatchKeyEvent(KeyEvent keyEvent) {
        ItemOptions.AnonymousClass4 anonymousClass4;
        ItemOptions.AnonymousClass4 anonymousClass5;
        switch (this.$r8$classId) {
            case 0:
                ItemOptions itemOptions = this.f$0;
                itemOptions.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (anonymousClass4 = itemOptions.actionBarPopupWindow) != null && anonymousClass4.isShowing()) {
                    itemOptions.dismiss();
                    break;
                }
                break;
            default:
                ItemOptions itemOptions2 = this.f$0;
                itemOptions2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (anonymousClass5 = itemOptions2.actionBarPopupWindow) != null && anonymousClass5.isShowing()) {
                    itemOptions2.dismiss();
                    break;
                }
                break;
        }
    }
}
