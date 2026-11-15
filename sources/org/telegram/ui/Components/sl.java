package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.camera.CameraView;
public final class sl implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout f39335a;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f39335a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i7;
        float f10;
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39335a;
        ImageView imageView = chatAttachAlertPhotoLayout.f32405s0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
        String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i11 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i12 = 0; i12 < 2; i12++) {
                    imageViewArr[i12].setVisibility(4);
                    imageViewArr[i12].setAlpha(0.0f);
                    imageViewArr[i12].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.r0(imageViewArr[0], chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode());
                for (int i13 = 0; i13 < 2; i13++) {
                    ImageView imageView2 = imageViewArr[i13];
                    if (i13 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    imageView2.setVisibility(i7);
                    ImageView imageView3 = imageViewArr[i13];
                    if (i13 == 0 && chatAttachAlertPhotoLayout.f32374c0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView3.setAlpha(f10);
                    imageViewArr[i13].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.Q.isFrontface()) {
                i10 = 2131230929;
            } else {
                i10 = 2131230930;
            }
            imageView.setImageResource(i10);
            if (chatAttachAlertPhotoLayout.Q.hasFrontFaceCamera()) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!chatAttachAlertPhotoLayout.f32374c0) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.P = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.Q, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.P.setDuration(180L);
                chatAttachAlertPhotoLayout.P.addListener(new x5(this, 13));
                chatAttachAlertPhotoLayout.P.start();
            }
        }
    }
}
