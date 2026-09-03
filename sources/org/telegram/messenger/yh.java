package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.j71;
public final class yh implements ValueAnimator.AnimatorUpdateListener {
    public final int f20717a;
    public final Object f20718b;
    public final Object f20719c;

    public yh(int i10, Object obj, Object obj2) {
        this.f20717a = i10;
        this.f20718b = obj;
        this.f20719c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20717a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f20718b).lambda$start$0((View) this.f20719c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f20718b, (Window) this.f20719c, valueAnimator);
                return;
            default:
                ((MediaController) this.f20718b).lambda$cleanupPlayer$10((j71) this.f20719c, valueAnimator);
                return;
        }
    }
}
