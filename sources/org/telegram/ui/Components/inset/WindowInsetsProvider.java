package org.telegram.ui.Components.inset;

public interface WindowInsetsProvider {
    float getAnimatedImeBottomInset();

    float getAnimatedMaxBottomInset();

    int getCurrentNavigationBarInset();

    int getInAppKeyboardRecommendedViewHeight();

    boolean inAppViewIsVisible();
}
