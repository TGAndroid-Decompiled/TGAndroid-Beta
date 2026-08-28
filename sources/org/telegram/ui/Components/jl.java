package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class jl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f29755a;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f29755a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29755a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26270n0;
        ul ulVar = chatAttachAlertPhotoLayout.L;
        if (ulVar != null && ulVar.isFrontface()) {
            i9 = R.drawable.camera_revert1;
        } else {
            i9 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i9);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26270n0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
