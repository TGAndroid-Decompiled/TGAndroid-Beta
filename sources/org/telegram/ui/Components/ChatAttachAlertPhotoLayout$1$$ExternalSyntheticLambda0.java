package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

public final class ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final ChatAttachAlertPhotoLayout.BasePhotoProvider f$0;
    public final boolean f$1;
    public final int f$2;
    public final boolean f$3;

    public ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout.AnonymousClass15 anonymousClass15, boolean z, boolean z2, int i) {
        this.f$0 = anonymousClass15;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayout.this.parentAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.buttonPressed = true;
                }
                chatAttachAlert.delegate.didPressedButton(7, true, this.f$1, this.f$2, 0, 0L, chatAttachAlert.isCaptionAbove(), this.f$3, l.longValue());
                HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
                map.clear();
                ChatAttachAlertPhotoLayout.cameraPhotos.clear();
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
                map.clear();
                PhotoViewer.getInstance();
                PhotoViewer.getInstance().closePhoto(PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation, false);
                PhotoViewer.getInstance().doneButtonPressed = true;
                break;
            default:
                Long l2 = (Long) obj;
                ChatAttachAlertPhotoLayout.AnonymousClass15 anonymousClass15 = (ChatAttachAlertPhotoLayout.AnonymousClass15) this.f$0;
                anonymousClass15.getClass();
                PhotoViewer.getInstance();
                PhotoViewer.getInstance().closePhotoAfterSelect = false;
                PhotoViewer.getInstance().doneButtonPressed = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout.parentAlert;
                chatAttachAlert2.sent = true;
                chatAttachAlert2.buttonPressed = true;
                chatAttachAlertPhotoLayout.closeCamera(false);
                ChatAttachAlert chatAttachAlert3 = chatAttachAlertPhotoLayout.parentAlert;
                ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert3.delegate;
                boolean z = this.f$1;
                int i = z ? 4 : 8;
                chatAttachViewDelegate.didPressedButton(i, true, this.f$3, this.f$2, 0, 0L, chatAttachAlert3.isCaptionAbove(), z, l2.longValue());
                ChatAttachAlertPhotoLayout.cameraPhotos.clear();
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
                ChatAttachAlertPhotoLayout.selectedPhotos.clear();
                chatAttachAlertPhotoLayout.adapter.notifyDataSetChanged();
                chatAttachAlertPhotoLayout.cameraAttachAdapter.notifyDataSetChanged();
                chatAttachAlert3.dismiss(true);
                PhotoViewer.getInstance();
                PhotoViewer.getInstance().closePhoto(PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation, false);
                PhotoViewer.getInstance().doneButtonPressed = true;
                break;
        }
    }

    public ChatAttachAlertPhotoLayout$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout.AnonymousClass1 anonymousClass1, boolean z, int i, boolean z2) {
        this.f$0 = anonymousClass1;
        this.f$1 = z;
        this.f$2 = i;
        this.f$3 = z2;
    }
}
