package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class sl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f30377a;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30377a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30377a;
        ImageView imageView = chatAttachAlertPhotoLayout.f23896r0;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null && dmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23896r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
