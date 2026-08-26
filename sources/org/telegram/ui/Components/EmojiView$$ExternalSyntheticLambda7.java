package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class EmojiView$$ExternalSyntheticLambda7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public EmojiView$$ExternalSyntheticLambda7(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).lambda$animateTabsY$23(this.f$1, valueAnimator);
                break;
            case 1:
                ((RecyclerItemsEnterAnimator.AnonymousClass2) this.f$0).lambda$onPreDraw$0(this.f$1, valueAnimator);
                break;
            case 2:
                ((EditTextEmoji) this.f$0).lambda$hidePopup$1(this.f$1, valueAnimator);
                break;
            default:
                ((MediaActivity) this.f$0).lambda$showSubtitle$12(this.f$1, valueAnimator);
                break;
        }
    }
}
