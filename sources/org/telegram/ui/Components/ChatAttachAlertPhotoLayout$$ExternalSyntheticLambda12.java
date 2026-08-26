package org.telegram.ui.Components;

import android.os.Build;
import androidx.core.content.ContextCompat;

public final class ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayout f$0;

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatAttachAlertPhotoLayout.parentAlert.getContainer().removeView(chatAttachAlertPhotoLayout.cameraView);
                chatAttachAlertPhotoLayout.cameraView = null;
                break;
            case 1:
                chatAttachAlertPhotoLayout.showZoomControls(false);
                chatAttachAlertPhotoLayout.zoomControlHideRunnable = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.showZoomControls(false);
                chatAttachAlertPhotoLayout.zoomControlHideRunnable = null;
                break;
            case 3:
                chatAttachAlertPhotoLayout.dropDownContainer.setVisibility(8);
                break;
            case 4:
                chatAttachAlertPhotoLayout.adapter.notifyDataSetChanged();
                break;
            case 5:
                boolean z = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                chatAttachAlertPhotoLayout.getClass();
                if (Build.VERSION.SDK_INT >= 23) {
                    ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                    if (ContextCompat.checkSelfPermission(chatAttachAlert.baseFragment.getParentActivity(), "android.permission.CAMERA") != 0) {
                        try {
                            chatAttachAlert.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                chatAttachAlertPhotoLayout.openCameraByClick();
                break;
            default:
                boolean z2 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                chatAttachAlertPhotoLayout.getClass();
                try {
                    int i = Build.VERSION.SDK_INT;
                    ChatAttachAlert chatAttachAlert2 = chatAttachAlertPhotoLayout.parentAlert;
                    if (i >= 33) {
                        chatAttachAlert2.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                    } else if (i >= 23) {
                        chatAttachAlert2.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
