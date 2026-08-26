package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ItemOptions;

public final class ChatActivity$$ExternalSyntheticLambda326 implements Runnable {
    public final int $r8$classId;
    public final ItemOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda326(int i, ItemOptions itemOptions) {
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
                this.f$0.closeSwipeback();
                break;
            case 3:
                ItemOptions.AnonymousClass4 anonymousClass4 = this.f$0.actionBarPopupWindow;
                if (anonymousClass4 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass4.getContentView());
                }
                break;
            case 4:
                ItemOptions.AnonymousClass4 anonymousClass5 = this.f$0.actionBarPopupWindow;
                if (anonymousClass5 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass5.getContentView());
                }
                break;
            case 5:
                ItemOptions.AnonymousClass4 anonymousClass6 = this.f$0.actionBarPopupWindow;
                if (anonymousClass6 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass6.getContentView());
                }
                break;
            case 6:
                ItemOptions.AnonymousClass4 anonymousClass7 = this.f$0.actionBarPopupWindow;
                if (anonymousClass7 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass7.getContentView());
                }
                break;
            case 7:
                ItemOptions.AnonymousClass4 anonymousClass8 = this.f$0.actionBarPopupWindow;
                if (anonymousClass8 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass8.getContentView());
                }
                break;
            case 8:
                ItemOptions.AnonymousClass4 anonymousClass9 = this.f$0.actionBarPopupWindow;
                if (anonymousClass9 != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass9.getContentView());
                }
                break;
            case 9:
                this.f$0.closeSwipeback();
                break;
            default:
                this.f$0.closeSwipeback();
                break;
        }
    }
}
