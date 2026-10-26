package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dq extends FrameLayout {
    public TextView[] f27578a;
    public ak0[] f27579b;
    public ImageView f27580c;
    public AnimatorSet d;
    public bq e;
    public float f27581f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        bq bqVar = this.e;
        if (bqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bqVar);
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
        return this.f27581f;
    }
}
