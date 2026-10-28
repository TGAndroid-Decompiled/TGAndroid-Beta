package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class em extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f27886a;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f27886a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27886a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26055r0;
        pm pmVar = chatAttachAlertPhotoLayout.P;
        if (pmVar != null && pmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26055r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
