package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.PopupSwipeBackLayout;

public final class ChooseDownloadQualityLayout {
    public final LinearLayout buttonsLayout;
    public final PhotoViewer$$ExternalSyntheticLambda49 callback;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout layout;

    public ChooseDownloadQualityLayout(ContextThemeWrapper contextThemeWrapper, PopupSwipeBackLayout popupSwipeBackLayout, PhotoViewer$$ExternalSyntheticLambda49 photoViewer$$ExternalSyntheticLambda49) {
        this.callback = photoViewer$$ExternalSyntheticLambda49;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.layout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        actionBarMenuSubItemAddItem.setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 1));
        actionBarMenuSubItemAddItem.setTextColor(-328966);
        actionBarMenuSubItemAddItem.setIconColor(-328966);
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(contextThemeWrapper, 10);
        anonymousClass19.setMinimumWidth(AndroidUtilities.dp(196.0f));
        anonymousClass19.setBackgroundColor(-15198184);
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
        anonymousClass2.addView(anonymousClass19);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) anonymousClass19.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        anonymousClass19.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(1);
        anonymousClass2.addView(linearLayout);
    }
}
