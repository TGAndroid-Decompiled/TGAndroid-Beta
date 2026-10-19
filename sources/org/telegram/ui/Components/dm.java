package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class dm extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f25590a;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f25590a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25590a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24112r0;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null && omVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24112r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
