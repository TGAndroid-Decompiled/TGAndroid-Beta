package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class jm extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f27728a;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f27728a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27728a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24063r0;
        um umVar = chatAttachAlertPhotoLayout.P;
        if (umVar != null && umVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24063r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
