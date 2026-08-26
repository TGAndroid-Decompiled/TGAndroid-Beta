package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda67;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;

public abstract class CustomPopupMenu {
    public boolean isShowing;
    public final ActionBarPopupWindow popupWindow;

    public CustomPopupMenu(Context context, DarkThemeResourceProvider darkThemeResourceProvider, boolean z) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z ? 1 : 0, context, darkThemeResourceProvider);
        actionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindowLayout.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 3));
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new ColorPicker$$ExternalSyntheticLambda6(this, 20));
        actionBarPopupWindowLayout.setShownFromBottom(false);
        onCreate(actionBarPopupWindowLayout);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
        this.popupWindow = actionBarPopupWindow;
        actionBarPopupWindow.animationEnabled = false;
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            actionBarPopupWindow.setFocusable(true);
        }
        actionBarPopupWindow.setOnDismissListener(new ArticleViewer$$ExternalSyntheticLambda67(this, 3));
    }

    public abstract void onCreate(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout);

    public abstract void onDismissed();
}
