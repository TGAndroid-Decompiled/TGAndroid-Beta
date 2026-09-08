package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;
public final class wl implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout f32305a;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f32305a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i10;
        float f7;
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32305a;
        ImageView imageView = chatAttachAlertPhotoLayout.f23896r0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
        String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i12 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i13 = 0; i13 < 2; i13++) {
                    imageViewArr[i13].setVisibility(4);
                    imageViewArr[i13].setAlpha(0.0f);
                    imageViewArr[i13].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.o0(imageViewArr[0], chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode());
                for (int i14 = 0; i14 < 2; i14++) {
                    ImageView imageView2 = imageViewArr[i14];
                    if (i14 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    ImageView imageView3 = imageViewArr[i14];
                    if (i14 == 0 && chatAttachAlertPhotoLayout.f23865b0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView3.setAlpha(f7);
                    imageViewArr[i14].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.P.isFrontface()) {
                i11 = R.drawable.camera_revert1;
            } else {
                i11 = R.drawable.camera_revert2;
            }
            imageView.setImageResource(i11);
            if (chatAttachAlertPhotoLayout.P.hasFrontFaceCamera()) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            if (!chatAttachAlertPhotoLayout.f23865b0) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.O = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.P, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.O.setDuration(180L);
                chatAttachAlertPhotoLayout.O.addListener(new j6(this, 12));
                chatAttachAlertPhotoLayout.O.start();
            }
        }
    }
}
