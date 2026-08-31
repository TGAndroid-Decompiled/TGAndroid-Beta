package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.k71;
public final class yh implements ValueAnimator.AnimatorUpdateListener {
    public final int f20715a;
    public final Object f20716b;
    public final Object f20717c;

    public yh(int i10, Object obj, Object obj2) {
        this.f20715a = i10;
        this.f20716b = obj;
        this.f20717c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20715a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f20716b).lambda$start$0((View) this.f20717c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f20716b, (Window) this.f20717c, valueAnimator);
                return;
            default:
                ((MediaController) this.f20716b).lambda$cleanupPlayer$10((k71) this.f20717c, valueAnimator);
                return;
        }
    }
}
