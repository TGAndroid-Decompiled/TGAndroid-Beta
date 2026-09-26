package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class ul extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f28848a;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28848a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28848a;
        ImageView imageView = chatAttachAlertPhotoLayout.f22158r0;
        fm fmVar = chatAttachAlertPhotoLayout.P;
        if (fmVar != null && fmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22158r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
