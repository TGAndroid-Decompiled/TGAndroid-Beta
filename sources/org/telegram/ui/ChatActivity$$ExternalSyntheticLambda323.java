package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ChatActivity$$ExternalSyntheticLambda323 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChatActivity$$ExternalSyntheticLambda323(int i, MessageObject messageObject) {
        this.$r8$classId = 8;
        this.f$1 = i;
        this.f$0 = messageObject;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$createView$21(this.f$1, view);
                break;
            case 1:
                ((ChooseQualityLayout) this.f$0).lambda$update$1(this.f$1, view);
                break;
            case 2:
                ContentPreviewViewer.lambda$addVoteOptions$2((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$0, this.f$1, view);
                break;
            case 3:
                ((KeepMediaPopupView) this.f$0).lambda$new$3(this.f$1, view);
                break;
            case 4:
                ((MainTabsActivity) this.f$0).lambda$createView$0(this.f$1, view);
                break;
            case 5:
                ((PassportActivity) this.f$0).lambda$addDocumentView$55(this.f$1, view);
                break;
            case 6:
                ((PhotoAlbumPickerActivity) this.f$0).lambda$createView$6(this.f$1, view);
                break;
            case 7:
                ((PhotoPickerActivity) this.f$0).lambda$createView$8(this.f$1, view);
                break;
            case 8:
                PopupNotificationActivity.lambda$getButtonsViewForMessage$5(this.f$1, (MessageObject) this.f$0, view);
                break;
            case 9:
                ((ProfileActivity) this.f$0).lambda$createView$11(this.f$1, view);
                break;
            default:
                ((StatisticActivity) this.f$0).lambda$createView$5(this.f$1, view);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda323(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
