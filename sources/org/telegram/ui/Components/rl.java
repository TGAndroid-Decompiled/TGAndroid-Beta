package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;
public final class rl implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout f32335a;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f32335a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i10;
        float f9;
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32335a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26281n0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
        String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i12 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i13 = 0; i13 < 2; i13++) {
                    imageViewArr[i13].setVisibility(4);
                    imageViewArr[i13].setAlpha(0.0f);
                    imageViewArr[i13].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.o0(imageViewArr[0], chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode());
                for (int i14 = 0; i14 < 2; i14++) {
                    ImageView imageView2 = imageViewArr[i14];
                    if (i14 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    ImageView imageView3 = imageViewArr[i14];
                    if (i14 == 0 && chatAttachAlertPhotoLayout.U) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    imageView3.setAlpha(f9);
                    imageViewArr[i14].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.L.isFrontface()) {
                i11 = R.drawable.camera_revert1;
            } else {
                i11 = R.drawable.camera_revert2;
            }
            imageView.setImageResource(i11);
            if (chatAttachAlertPhotoLayout.L.hasFrontFaceCamera()) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            if (!chatAttachAlertPhotoLayout.U) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.K = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.L, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.K.setDuration(180L);
                chatAttachAlertPhotoLayout.K.addListener(new org.telegram.ui.bm(this, 17));
                chatAttachAlertPhotoLayout.K.start();
            }
        }
    }
}
