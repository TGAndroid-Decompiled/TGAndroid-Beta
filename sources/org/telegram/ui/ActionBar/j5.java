package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
public interface j5 {
    r2 getBackgroundFragment();

    k3 getBottomSheet();

    List getFragmentStack();

    r2 getLastFragment();

    l5 getMessageDrawableOutMediaStart();

    l5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    r2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(f5 f5Var);

    void setDrawerLayoutContainer(d4 d4Var);

    void setFragmentPanTranslationOffset(int i10);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z10);

    void setInBubbleMode(boolean z10);

    void setIsSheet(boolean z10);

    void setNavigationBarColor(int i10);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z10);

    void setUseAlphaAnimations(boolean z10);

    void setWindow(Window window);
}
