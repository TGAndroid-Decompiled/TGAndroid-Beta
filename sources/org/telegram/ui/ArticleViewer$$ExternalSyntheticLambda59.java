package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;

public final class ArticleViewer$$ExternalSyntheticLambda59 implements View.OnTouchListener {
    public final int $r8$classId;

    public ArticleViewer$$ExternalSyntheticLambda59(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ArticleViewer.lambda$setParentActivity$41(view, motionEvent);
            case 1:
                return CallLogActivity.EmptyTextProgressView.lambda$new$1(view, motionEvent);
            case 2:
                return ActionIntroActivity.lambda$createView$0(view, motionEvent);
            case 3:
                return CallLogActivity.lambda$createActionMode$17(view, motionEvent);
            case 4:
                return CameraScanActivity.lambda$createView$1(view, motionEvent);
            case 5:
                return ChangeBioActivity.lambda$createView$0(view, motionEvent);
            case 6:
                return ChangeNameActivity.lambda$createView$0(view, motionEvent);
            case 7:
                return ChangeUsernameActivity.lambda$createView$0(view, motionEvent);
            case 8:
                return ChannelAdminLogActivity.lambda$createView$7(view, motionEvent);
            case 9:
                return ChannelColorActivity.lambda$toggleTheme$16(view, motionEvent);
            case 10:
                return ChannelCreateActivity.lambda$createView$5(view, motionEvent);
            case 11:
                return ChannelWallpaperActivity.lambda$toggleTheme$3(view, motionEvent);
            case 12:
                return ChatActivity.lambda$createActionMode$101(view, motionEvent);
            case 13:
                return ChatEditActivity.lambda$createView$2(view, motionEvent);
            case 14:
                return ContactsActivity.lambda$createView$1(view, motionEvent);
            case 15:
                return DialogsActivity.lambda$createActionMode$77(view, motionEvent);
            case 16:
                return GroupCreateFinalActivity.lambda$createView$1(view, motionEvent);
            case 17:
                return IdenticonActivity.lambda$createView$0(view, motionEvent);
            case 18:
                return LocationActivity.lambda$createView$9(view, motionEvent);
            case 19:
                return NewContactBottomSheet.lambda$createView$0(view, motionEvent);
            case 20:
                return NotificationsSoundActivity.lambda$createView$0(view, motionEvent);
            case 21:
                return PaymentFormActivity.lambda$createView$10(view, motionEvent);
            case 22:
                return PeerColorActivity.lambda$toggleTheme$10(view, motionEvent);
            case 23:
                return PhotoAlbumPickerActivity.lambda$createView$0(view, motionEvent);
            case 24:
                return PhotoAlbumPickerActivity.lambda$createView$1(view, motionEvent);
            case 25:
                return PhotoPickerActivity.lambda$createView$3(view, motionEvent);
            case 26:
                return PopupNotificationActivity.lambda$getButtonsViewForMessage$4(view, motionEvent);
            case 27:
                return ProxyListActivity.lambda$createView$3(view, motionEvent);
            case 28:
                return StickersActivity.lambda$createView$0(view, motionEvent);
            default:
                return ThemePreviewActivity.lambda$toggleTheme$34(view, motionEvent);
        }
    }
}
