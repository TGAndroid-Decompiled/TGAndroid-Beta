package org.telegram.ui;

import android.widget.PopupWindow;

public final class ChatActivity$$ExternalSyntheticLambda21 implements PopupWindow.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda21(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$onSideControlButtonOnLongClick$478();
                break;
            case 1:
                ((ChatActivity.AnonymousClass17) this.f$0).lambda$onLongPress$0();
                break;
            case 2:
                ((ArticleViewer) this.f$0).lambda$showPopup$5();
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$createActionBar$4();
                break;
        }
    }
}
