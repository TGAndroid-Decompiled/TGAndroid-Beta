package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bq extends FrameLayout {
    public TextView[] f25123a;
    public bk0[] f25124b;
    public ImageView f25125c;
    public AnimatorSet d;
    public zp e;
    public float f25126f;

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        zp zpVar = this.e;
        if (zpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zpVar);
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
        this.d.addListener(new aq(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f25126f;
    }
}
