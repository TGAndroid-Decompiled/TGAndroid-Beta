package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
public interface q4 {
    f2 getBackgroundFragment();

    v2 getBottomSheet();

    List getFragmentStack();

    f2 getLastFragment();

    t4 getMessageDrawableOutMediaStart();

    t4 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    f2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(n4 n4Var);

    void setDrawerLayoutContainer(n3 n3Var);

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
