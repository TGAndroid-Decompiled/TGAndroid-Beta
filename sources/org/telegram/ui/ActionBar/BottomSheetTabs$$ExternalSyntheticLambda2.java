package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;

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
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                actionBarMenuSubItem.setTextColor(ColorUtils.blendARGB(fFloatValue, -1, -9194260));
                actionBarMenuSubItem.setIconColor(ColorUtils.blendARGB(fFloatValue, -1, -9194260));
                break;
            case 3:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$0;
                int itemsCount = actionBarPopupWindowLayout.getItemsCount();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i = 0; i < itemsCount; i++) {
                    View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i);
                    if (!(childAt instanceof ActionBarPopupWindow.GapView)) {
                        float fCascade = AndroidUtilities.cascade(fFloatValue2, actionBarPopupWindowLayout.shownFromBottom ? (itemsCount - 1) - i : i, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-6.0f));
                        childAt.setAlpha(fCascade * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                }
                break;
            case 4:
                AdjustPanLayoutHelper adjustPanLayoutHelper = (AdjustPanLayoutHelper) this.f$0;
                adjustPanLayoutHelper.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (adjustPanLayoutHelper.inverse) {
                    fFloatValue3 = 1.0f - fFloatValue3;
                }
                float fM = (int) DiffUtil.m(1.0f, fFloatValue3, adjustPanLayoutHelper.to, adjustPanLayoutHelper.from * fFloatValue3);
                if (!(adjustPanLayoutHelper instanceof ChatCustomReactionsEditActivity$2$1)) {
                    adjustPanLayoutHelper.parent.setTranslationY(fM);
                }
                adjustPanLayoutHelper.onPanTranslationUpdate(-fM, fFloatValue3, adjustPanLayoutHelper.isKeyboardVisible);
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
