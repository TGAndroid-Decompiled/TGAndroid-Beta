package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.R;
public final class lm extends AnimatorListenerAdapter {
    public final ChatAttachAlertPhotoLayout f28229a;

    public lm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28229a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28229a;
        ImageView imageView = chatAttachAlertPhotoLayout.f23837r0;
        wm wmVar = chatAttachAlertPhotoLayout.P;
        if (wmVar != null && wmVar.isFrontface()) {
            i10 = R.drawable.camera_revert1;
        } else {
            i10 = R.drawable.camera_revert2;
        }
        imageView.setImageResource(i10);
        ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23837r0, View.SCALE_X, 1.0f).setDuration(100L).start();
    }
}
