package org.telegram.ui.Components;

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
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda67;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda50;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ButtonOnLongClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;

public final class ScrollSlidingTextTabStrip$$ExternalSyntheticLambda2 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;

    public ScrollSlidingTextTabStrip$$ExternalSyntheticLambda2(FrameLayout frameLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = i;
    }

    @Override
    public final boolean onLongClick(View view) {
        ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate;
        ChatActivity$$ExternalSyntheticLambda22 chatActivity$$ExternalSyntheticLambda22;
        char c;
        String string;
        switch (this.$r8$classId) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f$0;
                return (scrollSlidingTextTabStrip.reordering || (scrollSlidingTabStripDelegate = scrollSlidingTextTabStrip.delegate) == null || !scrollSlidingTabStripDelegate.showOptions(this.f$1, view)) ? false : true;
            default:
                ButtonOnLongClickListener buttonOnLongClickListener = ((ChatActivitySideControlsButtonsLayout) this.f$0).onLongClickListener;
                if (buttonOnLongClickListener != null) {
                    ChatActivity chatActivity = ((ChatActivity$$ExternalSyntheticLambda50) buttonOnLongClickListener).f$0;
                    int i = this.f$1;
                    if (i == 2) {
                        chatActivity$$ExternalSyntheticLambda22 = new ChatActivity$$ExternalSyntheticLambda22(chatActivity, 9);
                        c = 1;
                    } else if (i == 3) {
                        chatActivity$$ExternalSyntheticLambda22 = new ChatActivity$$ExternalSyntheticLambda22(chatActivity, 10);
                        c = 0;
                    } else if (i == 4) {
                        chatActivity$$ExternalSyntheticLambda22 = new ChatActivity$$ExternalSyntheticLambda22(chatActivity, 11);
                        c = 2;
                    }
                    Activity parentActivity = chatActivity.getParentActivity();
                    INavigationLayout parentLayout = chatActivity.getParentLayout();
                    ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity.contentView;
                    Theme.ResourcesProvider resourceProvider = chatActivity.getResourceProvider();
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity);
                    actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, parentActivity, resourceProvider, true, true);
                    actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    if (c == 0) {
                        string = LocaleController.getString(R.string.ReadAllReactions);
                    } else {
                        string = c == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes);
                    }
                    actionBarMenuSubItem.setTextAndIcon(string, R.drawable.msg_seen, null);
                    actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda51(8, chatActivity$$ExternalSyntheticLambda22));
                    actionBarPopupWindowLayout.linearLayout.addView(actionBarMenuSubItem);
                    ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
                    actionBarPopupWindow.pauseNotifications = true;
                    actionBarPopupWindow.dismissAnimationDuration = 220;
                    actionBarPopupWindow.setOutsideTouchable(true);
                    actionBarPopupWindow.setClippingEnabled(true);
                    actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                    actionBarPopupWindow.setFocusable(true);
                    actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    actionBarPopupWindow.setInputMethodMode(2);
                    actionBarPopupWindow.setSoftInputMode(0);
                    actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    ViewPositionWatcher.computeCoordinatesInParent(view, chatActivityFragmentView, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = ((ActionBarLayout) parentLayout).getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    actionBarPopupWindow.showAtLocation(chatActivityFragmentView, 51, (int) width, (int) measuredHeight);
                    chatActivity.scrimPopupWindow = actionBarPopupWindow;
                    ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = chatActivity.sideControlsButtonsLayout;
                    chatActivity.setScrimView(chatActivitySideControlsButtonsLayout);
                    chatActivity.dimBehindView(false, chatActivitySideControlsButtonsLayout != chatActivity.sideControlsButtonsLayout, 0.2f);
                    chatActivity.scrimPopupWindow.setOnDismissListener(new ArticleViewer$$ExternalSyntheticLambda67(chatActivity, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
        }
    }
}
