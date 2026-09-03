package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;
public final class ul implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout f31643a;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31643a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i10;
        float f10;
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31643a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24769o0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
        String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i12 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i13 = 0; i13 < 2; i13++) {
                    imageViewArr[i13].setVisibility(4);
                    imageViewArr[i13].setAlpha(0.0f);
                    imageViewArr[i13].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.o0(imageViewArr[0], chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode());
                for (int i14 = 0; i14 < 2; i14++) {
                    ImageView imageView2 = imageViewArr[i14];
                    if (i14 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    ImageView imageView3 = imageViewArr[i14];
                    if (i14 == 0 && chatAttachAlertPhotoLayout.V) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView3.setAlpha(f10);
                    imageViewArr[i14].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.M.isFrontface()) {
                i11 = R.drawable.camera_revert1;
            } else {
                i11 = R.drawable.camera_revert2;
            }
            imageView.setImageResource(i11);
            if (chatAttachAlertPhotoLayout.M.hasFrontFaceCamera()) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            if (!chatAttachAlertPhotoLayout.V) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.L = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.M, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.L.setDuration(180L);
                chatAttachAlertPhotoLayout.L.addListener(new a9(this, 8));
                chatAttachAlertPhotoLayout.L.start();
            }
        }
    }
}
