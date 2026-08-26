package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import java.util.Iterator;

public final class BottomSheetTabs$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public BottomSheetTabs$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) this.f$0;
                bottomSheetTabs.getClass();
                bottomSheetTabs.bottomTabsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = bottomSheetTabs.invalidateListeners.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                bottomSheetTabs.invalidate();
                break;
            case 1:
                ActionBarMenuSlider actionBarMenuSlider = (ActionBarMenuSlider) this.f$0;
                actionBarMenuSlider.getClass();
                actionBarMenuSlider.value = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                actionBarMenuSlider.invalidate();
                break;
            case 2:
                ActionBarPopupWindow.lambda$startAnimation$2((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$0, valueAnimator);
                break;
            case 3:
                ((AdjustPanLayoutHelper) this.f$0).lambda$animateHeight$0(valueAnimator);
                break;
            default:
                BottomSheetTabsOverlay.TabPreview tabPreview = (BottomSheetTabsOverlay.TabPreview) this.f$0;
                tabPreview.getClass();
                tabPreview.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BottomSheetTabsOverlay bottomSheetTabsOverlay = tabPreview.parentView;
                if (bottomSheetTabsOverlay != null) {
                    bottomSheetTabsOverlay.invalidate();
                }
                break;
        }
    }
}
