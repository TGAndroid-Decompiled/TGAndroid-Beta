package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.i81;
public final class yh implements ValueAnimator.AnimatorUpdateListener {
    public final int f18805a;
    public final Object f18806b;
    public final Object f18807c;

    public yh(int i10, Object obj, Object obj2) {
        this.f18805a = i10;
        this.f18806b = obj;
        this.f18807c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18805a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f18806b).lambda$start$0((View) this.f18807c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f18806b, (Window) this.f18807c, valueAnimator);
                return;
            default:
                ((MediaController) this.f18806b).lambda$cleanupPlayer$10((i81) this.f18807c, valueAnimator);
                return;
        }
    }
}
