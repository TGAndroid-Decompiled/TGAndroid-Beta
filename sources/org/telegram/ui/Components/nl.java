package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;
public final class nl implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout f31124a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31124a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i9;
        float f10;
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31124a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26270n0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
        String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i11 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i12 = 0; i12 < 2; i12++) {
                    imageViewArr[i12].setVisibility(4);
                    imageViewArr[i12].setAlpha(0.0f);
                    imageViewArr[i12].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.n0(imageViewArr[0], chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode());
                for (int i13 = 0; i13 < 2; i13++) {
                    ImageView imageView2 = imageViewArr[i13];
                    if (i13 == 0) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    imageView2.setVisibility(i9);
                    ImageView imageView3 = imageViewArr[i13];
                    if (i13 == 0 && chatAttachAlertPhotoLayout.U) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView3.setAlpha(f10);
                    imageViewArr[i13].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.L.isFrontface()) {
                i10 = R.drawable.camera_revert1;
            } else {
                i10 = R.drawable.camera_revert2;
            }
            imageView.setImageResource(i10);
            if (chatAttachAlertPhotoLayout.L.hasFrontFaceCamera()) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!chatAttachAlertPhotoLayout.U) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.K = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.L, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.K.setDuration(180L);
                chatAttachAlertPhotoLayout.K.addListener(new org.telegram.ui.xp(this, 15));
                chatAttachAlertPhotoLayout.K.start();
            }
        }
    }
}
