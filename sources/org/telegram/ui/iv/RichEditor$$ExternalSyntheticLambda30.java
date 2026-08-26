package org.telegram.ui.iv;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.ItemOptions;

public final class RichEditor$$ExternalSyntheticLambda30 implements Runnable {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public RichEditor$$ExternalSyntheticLambda30(int i, ItemOptions itemOptions) {
        this.$r8$classId = i;
        this.f$0 = itemOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.closeSwipeback();
                break;
            case 1:
                this.f$0.closeSwipeback();
                break;
            case 2:
                ActionBarPopupWindow actionBarPopupWindow = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
                }
                break;
            case 3:
                ActionBarPopupWindow actionBarPopupWindow2 = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow2 != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow2.getContentView());
                }
                break;
            case 4:
                ActionBarPopupWindow actionBarPopupWindow3 = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow3 != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow3.getContentView());
                }
                break;
            case 5:
                ActionBarPopupWindow actionBarPopupWindow4 = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow4 != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow4.getContentView());
                }
                break;
            case 6:
                ActionBarPopupWindow actionBarPopupWindow5 = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow5 != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow5.getContentView());
                }
                break;
            case 7:
                ActionBarPopupWindow actionBarPopupWindow6 = this.f$0.actionBarPopupWindow;
                if (actionBarPopupWindow6 != null) {
                    AndroidUtilities.hideKeyboard(actionBarPopupWindow6.getContentView());
                }
                break;
            default:
                this.f$0.closeSwipeback();
                break;
        }
    }
}
