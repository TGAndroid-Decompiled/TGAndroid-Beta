package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
public interface e5 {
    p2 getBackgroundFragment();

    g3 getBottomSheet();

    List getFragmentStack();

    p2 getLastFragment();

    g5 getMessageDrawableOutMediaStart();

    g5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    p2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(b5 b5Var);

    void setDrawerLayoutContainer(y3 y3Var);

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
