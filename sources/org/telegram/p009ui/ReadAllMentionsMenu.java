package org.telegram.p009ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.Theme;

public class ReadAllMentionsMenu {
    public static ActionBarPopupWindow show(int i, Activity activity, FrameLayout frameLayout, View view, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        String str;
        int i2;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(activity);
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.m34dp(200.0f));
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) activity, true, true, resourcesProvider);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.m34dp(200.0f));
        if (i == 0) {
            i2 = C0952R.string.ReadAllReactions;
            str = "ReadAllReactions";
        } else {
            i2 = C0952R.string.ReadAllMentions;
            str = "ReadAllMentions";
        }
        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(str, i2), C0952R.C0953drawable.msg_seen);
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ReadAllMentionsMenu.lambda$show$0(runnable, view2);
            }
        });
        actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(C0952R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow.showAtLocation(frameLayout, 51, (int) (((view.getX() + view.getWidth()) - actionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.m34dp(8.0f)), (int) (view.getY() - actionBarPopupWindowLayout.getMeasuredHeight()));
        return actionBarPopupWindow;
    }

    public static void lambda$show$0(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
