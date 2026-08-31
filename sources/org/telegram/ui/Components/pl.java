package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class pl extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f30109a;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30109a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30109a;
        ImageView imageView = chatAttachAlertPhotoLayout.f24767o0;
        bm bmVar = chatAttachAlertPhotoLayout.M;
        if (bmVar != null && bmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24767o0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
