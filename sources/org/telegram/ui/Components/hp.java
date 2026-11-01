package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class hp extends FrameLayout {
    public TextView[] f26899a;
    public fi0[] f26900b;
    public ImageView f26901c;
    public AnimatorSet d;
    public ho e;
    public float f26902f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        ho hoVar = this.e;
        if (hoVar != null) {
            org.telegram.messenger.i0.r(hoVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f));
        this.d.addListener(new gp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f26902f;
    }
}
