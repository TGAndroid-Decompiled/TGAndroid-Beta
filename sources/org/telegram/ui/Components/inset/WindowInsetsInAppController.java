package org.telegram.ui.Components.inset;

import org.telegram.messenger.AndroidUtilities;

public interface WindowInsetsInAppController {
    void requestInAppKeyboardHeight(int i);

    void requestInAppKeyboardHeightIncludeNavbar(int i);

    void resetInAppKeyboardHeight(boolean z);

    public abstract class CC {
        public static void $default$requestInAppKeyboardHeightIncludeNavbar(WindowInsetsInAppController windowInsetsInAppController, int i) {
            if (i > 0) {
                windowInsetsInAppController.requestInAppKeyboardHeight(i + AndroidUtilities.navigationBarHeight);
            } else {
                windowInsetsInAppController.resetInAppKeyboardHeight(true);
            }
        }
    }
}
