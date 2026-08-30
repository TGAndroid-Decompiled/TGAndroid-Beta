package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.i71;
public final class yh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19057a;
    public final Object f19058b;
    public final Object f19059c;

    public yh(int i10, Object obj, Object obj2) {
        this.f19057a = i10;
        this.f19058b = obj;
        this.f19059c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19057a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19058b).lambda$start$0((View) this.f19059c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19058b, (Window) this.f19059c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19058b).lambda$cleanupPlayer$10((i71) this.f19059c, valueAnimator);
                return;
        }
    }
}
