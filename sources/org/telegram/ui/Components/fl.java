package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;

public final class fl extends AnimatorListenerAdapter {

    public final ChatAttachAlertPhotoLayout f28401a;

    public fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28401a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28401a;
        ImageView imageView = chatAttachAlertPhotoLayout.f26266n0;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        imageView.setImageResource((qlVar == null || !qlVar.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26266n0, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
