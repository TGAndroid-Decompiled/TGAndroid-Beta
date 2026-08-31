package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
public interface f5 {
    p2 getBackgroundFragment();

    h3 getBottomSheet();

    List getFragmentStack();

    p2 getLastFragment();

    h5 getMessageDrawableOutMediaStart();

    h5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    p2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(c5 c5Var);

    void setDrawerLayoutContainer(z3 z3Var);

    void setFragmentPanTranslationOffset(int i10);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z4);

    void setInBubbleMode(boolean z4);

    void setIsSheet(boolean z4);

    void setNavigationBarColor(int i10);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z4);

    void setUseAlphaAnimations(boolean z4);

    void setWindow(Window window);
}
