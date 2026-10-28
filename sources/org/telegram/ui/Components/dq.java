package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dq extends FrameLayout {
    public TextView[] f27517a;
    public bk0[] f27518b;
    public ImageView f27519c;
    public AnimatorSet d;
    public cp e;
    public float f27520f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        cp cpVar = this.e;
        if (cpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cpVar);
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
        this.d.addListener(new cq(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f27520f;
    }
}
