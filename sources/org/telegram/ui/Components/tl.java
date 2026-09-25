package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class tl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f28561a;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28561a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28561a;
        ImageView imageView = chatAttachAlertPhotoLayout.f22159r0;
        em emVar = chatAttachAlertPhotoLayout.P;
        if (emVar != null && emVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22159r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
