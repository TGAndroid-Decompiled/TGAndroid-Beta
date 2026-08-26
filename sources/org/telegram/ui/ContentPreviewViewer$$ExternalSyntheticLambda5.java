package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ContentPreviewViewer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda5(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getSwipeBack().closeForeground(true);
                break;
            default:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.f$0;
                if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindowLayout.getSwipeBack().closeForeground(true);
                }
                break;
        }
    }
}
