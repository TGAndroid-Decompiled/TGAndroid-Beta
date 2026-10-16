package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class fm extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f24776a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f24776a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24776a;
        ImageView imageView = chatAttachAlertPhotoLayout.f22756r0;
        qm qmVar = chatAttachAlertPhotoLayout.P;
        if (qmVar != null && qmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22756r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
