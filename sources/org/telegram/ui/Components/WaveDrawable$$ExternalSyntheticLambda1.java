package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class WaveDrawable$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public WaveDrawable$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((WaveDrawable) this.f$0).lambda$new$0(valueAnimator);
                break;
            case 1:
                ((StickerEmptyView) this.f$0).lambda$setVisibility$2(valueAnimator);
                break;
            case 2:
                ((StorageDiagramView) this.f$0).lambda$setPressed$1(valueAnimator);
                break;
            case 3:
                ((SubstringLayoutAnimator) this.f$0).lambda$create$0(valueAnimator);
                break;
            case 4:
                ((ThemeSmallPreviewView) this.f$0).lambda$setSelected$4(valueAnimator);
                break;
            case 5:
                ((TopicsTabsView) this.f$0).lambda$animateSidemenuTo$2(valueAnimator);
                break;
            case 6:
                ((UnreadCounterTextView) this.f$0).lambda$setText$0(valueAnimator);
                break;
            case 7:
                ((UsersAlertBase.ContainerView) this.f$0).lambda$onMeasure$0(valueAnimator);
                break;
            default:
                ((ViewPagerFixed.TabsView) this.f$0).lambda$scrollToTab$2(valueAnimator);
                break;
        }
    }
}
