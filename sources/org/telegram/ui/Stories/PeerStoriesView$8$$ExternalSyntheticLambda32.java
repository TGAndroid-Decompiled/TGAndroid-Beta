package org.telegram.ui.Stories;

import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class PeerStoriesView$8$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout f$0;
    public final int f$1;

    public PeerStoriesView$8$$ExternalSyntheticLambda32(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = actionBarPopupWindowLayout;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.f$0;
                if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindowLayout.getSwipeBack().openForeground(this.f$1);
                }
                break;
            default:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.f$0;
                if (actionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindowLayout2.getSwipeBack().openForeground(this.f$1);
                }
                break;
        }
    }
}
