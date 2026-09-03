package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class nl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f27294a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f27294a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27294a;
        ImageView imageView = chatAttachAlertPhotoLayout.f22898o0;
        zl zlVar = chatAttachAlertPhotoLayout.M;
        if (zlVar != null && zlVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22898o0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
