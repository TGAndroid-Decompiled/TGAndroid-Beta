package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class ol extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f27586a;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f27586a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27586a;
        ImageView imageView = chatAttachAlertPhotoLayout.f22925o0;
        am amVar = chatAttachAlertPhotoLayout.M;
        if (amVar != null && amVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22925o0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
