package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ChatActivity$$ExternalSyntheticLambda222 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout f$0;

    public ChatActivity$$ExternalSyntheticLambda222(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getSwipeBack().closeForeground(true);
                break;
            case 1:
                this.f$0.getSwipeBack().closeForeground(true);
                break;
            case 2:
                this.f$0.getSwipeBack().closeForeground(true);
                break;
            default:
                this.f$0.getSwipeBack().closeForeground(true);
                break;
        }
    }
}
