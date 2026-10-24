package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class bm extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f25049a;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f25049a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25049a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24261r0;
        mm mmVar = chatAttachAlertPhotoLayout.P;
        if (mmVar != null && mmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24261r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
