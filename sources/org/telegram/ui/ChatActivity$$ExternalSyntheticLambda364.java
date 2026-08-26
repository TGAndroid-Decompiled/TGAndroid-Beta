package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ChatActivity$$ExternalSyntheticLambda364 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout f$0;

    public ChatActivity$$ExternalSyntheticLambda364(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$createMenu$278(this.f$0, view);
                break;
            case 1:
                ContentPreviewViewer.AnonymousClass1.lambda$run$6(this.f$0, view);
                break;
            default:
                ChatActivity.lambda$createMenu$255(this.f$0, view);
                break;
        }
    }
}
