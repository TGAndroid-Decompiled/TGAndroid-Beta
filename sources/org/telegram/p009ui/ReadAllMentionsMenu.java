package org.telegram.p009ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;

public class ReadAllMentionsMenu {
    public static ActionBarPopupWindow show(int i, Activity activity, INavigationLayout iNavigationLayout, FrameLayout frameLayout, View view, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        int i2;
        String str;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(activity);
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.m35dp(200.0f));
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) activity, true, true, resourcesProvider);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.m35dp(200.0f));
        if (i == 0) {
            i2 = C1010R.string.ReadAllReactions;
            str = "ReadAllReactions";
        } else {
            i2 = C1010R.string.ReadAllMentions;
            str = "ReadAllMentions";
        }
        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(str, i2), C1010R.C1011drawable.msg_seen);
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
        actionBarPopupWindow.setAnimationStyle(C1010R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        float x = ((view.getX() + view.getWidth()) - actionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.m35dp(8.0f);
        float y = view.getY() - actionBarPopupWindowLayout.getMeasuredHeight();
        if (AndroidUtilities.isTablet()) {
            ViewGroup view2 = iNavigationLayout.getView();
            x += view2.getX() + view2.getPaddingLeft();
            y += view2.getY() + view2.getPaddingTop();
        }
        actionBarPopupWindow.showAtLocation(frameLayout, 51, (int) x, (int) y);
        return actionBarPopupWindow;
    }

    public static void lambda$show$0(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
