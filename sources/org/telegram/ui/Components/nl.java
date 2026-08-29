package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class nl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f31084a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31084a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31084a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26281n0;
        yl ylVar = chatAttachAlertPhotoLayout.L;
        if (ylVar != null && ylVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26281n0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
