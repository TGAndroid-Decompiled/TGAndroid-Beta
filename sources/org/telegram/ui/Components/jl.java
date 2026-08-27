package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView;

public final class jl implements CameraView.CameraViewDelegate {

    public final ChatAttachAlertPhotoLayout f29717a;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f29717a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29717a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26266n0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
        String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
        if (currentFlashMode == null || nextFlashMode == null) {
            return;
        }
        if (currentFlashMode.equals(nextFlashMode)) {
            for (int i10 = 0; i10 < 2; i10++) {
                imageViewArr[i10].setVisibility(4);
                imageViewArr[i10].setAlpha(0.0f);
                imageViewArr[i10].setTranslationY(0.0f);
            }
        } else {
            ChatAttachAlertPhotoLayout.o0(imageViewArr[0], chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode());
            int i11 = 0;
            while (i11 < 2) {
                imageViewArr[i11].setVisibility(i11 == 0 ? 0 : 4);
                imageViewArr[i11].setAlpha((i11 == 0 && chatAttachAlertPhotoLayout.U) ? 1.0f : 0.0f);
                imageViewArr[i11].setTranslationY(0.0f);
                i11++;
            }
        }
        imageView.setImageResource(chatAttachAlertPhotoLayout.L.isFrontface() ? R.drawable.camera_revert1 : R.drawable.camera_revert2);
        imageView.setVisibility(chatAttachAlertPhotoLayout.L.hasFrontFaceCamera() ? 0 : 4);
        if (chatAttachAlertPhotoLayout.U) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        chatAttachAlertPhotoLayout.K = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.L, (Property<ql, Float>) View.ALPHA, 0.0f, 1.0f));
        chatAttachAlertPhotoLayout.K.setDuration(180L);
        chatAttachAlertPhotoLayout.K.addListener(new org.telegram.ui.am(this, 17));
        chatAttachAlertPhotoLayout.K.start();
    }
}
