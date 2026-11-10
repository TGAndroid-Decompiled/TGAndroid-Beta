package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
public interface r4 {
    f2 getBackgroundFragment();

    w2 getBottomSheet();

    List getFragmentStack();

    f2 getLastFragment();

    u4 getMessageDrawableOutMediaStart();

    u4 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    f2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(o4 o4Var);

    void setDrawerLayoutContainer(o3 o3Var);

    void setFragmentPanTranslationOffset(int i7);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z9);

    void setInBubbleMode(boolean z9);

    void setIsSheet(boolean z9);

    void setNavigationBarColor(int i7);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z9);

    void setUseAlphaAnimations(boolean z9);

    void setWindow(Window window);
}
