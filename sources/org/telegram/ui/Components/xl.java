package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class xl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f29069a;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f29069a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29069a;
        ImageView imageView = chatAttachAlertPhotoLayout.f21021r0;
        im imVar = chatAttachAlertPhotoLayout.P;
        if (imVar != null && imVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f21021r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
