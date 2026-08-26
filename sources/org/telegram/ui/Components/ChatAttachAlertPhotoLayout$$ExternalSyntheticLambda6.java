package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;

public final class ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6 implements AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener, ZoomControlView.ZoomControlViewDelegate {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayout f$0;

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda6(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPhotoLayout;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 1:
                ChatAttachAlert chatAttachAlert = this.f$0.parentAlert;
                chatAttachAlert.applyCaption();
                chatAttachAlert.delegate.didPressedButton(7, false, z, i, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                break;
            default:
                ChatAttachAlert chatAttachAlert2 = this.f$0.parentAlert;
                chatAttachAlert2.applyCaption();
                chatAttachAlert2.delegate.didPressedButton(4, true, z, i, 0, 0L, chatAttachAlert2.isCaptionAbove(), false, 0L);
                break;
        }
    }

    @Override
    public void didSetZoom(float f) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal = chatAttachAlertPhotoLayout.cameraView;
        if (cameraViewInternal != null) {
            chatAttachAlertPhotoLayout.cameraZoom = f;
            cameraViewInternal.setZoom(f);
        }
        chatAttachAlertPhotoLayout.showZoomControls(true);
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
        ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
        if (!chatAttachAlert.storyMediaPicker) {
            if (i == 0 && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
                if (chatAttachViewDelegate != null) {
                    chatAttachViewDelegate.didPressedButton(0, false, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                }
                return true;
            }
            if (view instanceof PhotoAttachPhotoCell) {
                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                boolean z = !photoAttachPhotoCell.isChecked();
                chatAttachAlertPhotoLayout.shouldSelect = z;
                chatAttachAlertPhotoLayout.itemRangeSelector.setIsActive(photoAttachPhotoCell, i, z);
            }
        }
        return false;
    }
}
