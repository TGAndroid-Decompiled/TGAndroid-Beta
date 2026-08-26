package org.telegram.ui;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class ReadAllMentionsMenu {
    public static final int TYPE_MENTIONS = 1;
    public static final int TYPE_POLL_VOTES = 2;
    public static final int TYPE_REACTIONS = 0;

    public static void lambda$show$0(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static ActionBarPopupWindow show(int i, Activity activity, INavigationLayout iNavigationLayout, FrameLayout frameLayout, View view, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        String string;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(activity);
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, activity, resourcesProvider, true, true);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
        if (i == 0) {
            string = LocaleController.getString(R.string.ReadAllReactions);
        } else {
            string = i == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes);
        }
        actionBarMenuSubItem.setTextAndIcon(string, R.drawable.msg_seen);
        actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda34(1, runnable));
        actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        PointF pointF = new PointF();
        ViewPositionWatcher.computeCoordinatesInParent(view, frameLayout, pointF);
        float width = ((pointF.x + view.getWidth()) - actionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
        float measuredHeight = pointF.y - actionBarPopupWindowLayout.getMeasuredHeight();
        if (AndroidUtilities.isTablet()) {
            ViewGroup view2 = ((ActionBarLayout) iNavigationLayout).getView();
            width += view2.getX() + view2.getPaddingLeft();
            measuredHeight += view2.getY() + view2.getPaddingTop();
        }
        actionBarPopupWindow.showAtLocation(frameLayout, 51, (int) width, (int) measuredHeight);
        return actionBarPopupWindow;
    }
}
