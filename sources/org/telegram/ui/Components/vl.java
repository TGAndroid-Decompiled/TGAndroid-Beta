package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class vl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f31727a;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31727a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31727a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24055r0;
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (gmVar != null && gmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24055r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
