package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.h81;
public final class zh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19192a;
    public final Object f19193b;
    public final Object f19194c;

    public zh(int i10, Object obj, Object obj2) {
        this.f19192a = i10;
        this.f19193b = obj;
        this.f19194c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19192a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19193b).lambda$start$0((View) this.f19194c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19193b, (Window) this.f19194c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19193b).lambda$cleanupPlayer$10((h81) this.f19194c, valueAnimator);
                return;
        }
    }
}
