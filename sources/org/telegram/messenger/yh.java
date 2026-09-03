package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.i71;
public final class yh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19041a;
    public final Object f19042b;
    public final Object f19043c;

    public yh(int i10, Object obj, Object obj2) {
        this.f19041a = i10;
        this.f19042b = obj;
        this.f19043c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19041a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19042b).lambda$start$0((View) this.f19043c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19042b, (Window) this.f19043c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19042b).lambda$cleanupPlayer$10((i71) this.f19043c, valueAnimator);
                return;
        }
    }
}
