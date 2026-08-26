package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;

public final class SpeedButtonsLayout extends LinearLayout {
    public final ActionBarMenuSubItem[] speedItems;

    public SpeedButtonsLayout(ContextThemeWrapper contextThemeWrapper, final PhotoViewer$$ExternalSyntheticLambda49 photoViewer$$ExternalSyntheticLambda49) {
        super(contextThemeWrapper);
        this.speedItems = new ActionBarMenuSubItem[]{actionBarMenuSubItemAddItem, actionBarMenuSubItemAddItem, actionBarMenuSubItemAddItem, actionBarMenuSubItemAddItem, actionBarMenuSubItemAddItem};
        setOrientation(1);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        actionBarMenuSubItemAddItem.setTextColor(-328966);
        actionBarMenuSubItemAddItem.setIconColor(-328966);
        final int i = 0;
        actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.2f);
                        break;
                    case 1:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.5f);
                        break;
                    case 2:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.0f);
                        break;
                    case 3:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.5f);
                        break;
                    default:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        actionBarMenuSubItemAddItem2.setTextColor(-328966);
        actionBarMenuSubItemAddItem2.setIconColor(-328966);
        final int i2 = 1;
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.2f);
                        break;
                    case 1:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.5f);
                        break;
                    case 2:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.0f);
                        break;
                    case 3:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.5f);
                        break;
                    default:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem2.setSelectorColor(268435455);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        actionBarMenuSubItemAddItem3.setTextColor(-328966);
        actionBarMenuSubItemAddItem3.setIconColor(-328966);
        final int i3 = 2;
        actionBarMenuSubItemAddItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.2f);
                        break;
                    case 1:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.5f);
                        break;
                    case 2:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.0f);
                        break;
                    case 3:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.5f);
                        break;
                    default:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem3.setSelectorColor(268435455);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        actionBarMenuSubItemAddItem4.setTextColor(-328966);
        actionBarMenuSubItemAddItem4.setIconColor(-328966);
        final int i4 = 3;
        actionBarMenuSubItemAddItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.2f);
                        break;
                    case 1:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.5f);
                        break;
                    case 2:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.0f);
                        break;
                    case 3:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.5f);
                        break;
                    default:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem4.setSelectorColor(268435455);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        actionBarMenuSubItemAddItem5.setTextColor(-328966);
        actionBarMenuSubItemAddItem5.setIconColor(-328966);
        final int i5 = 4;
        actionBarMenuSubItemAddItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.2f);
                        break;
                    case 1:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 0.5f);
                        break;
                    case 2:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.0f);
                        break;
                    case 3:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 1.5f);
                        break;
                    default:
                        photoViewer$$ExternalSyntheticLambda49.f$0.chooseSpeed(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem5.setSelectorColor(268435455);
        View anonymousClass14 = new TopicsFragment.AnonymousClass14(contextThemeWrapper, 3);
        anonymousClass14.setMinimumWidth(AndroidUtilities.dp(196.0f));
        anonymousClass14.setBackgroundColor(-15198184);
        addView(anonymousClass14);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) anonymousClass14.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        anonymousClass14.setLayoutParams(layoutParams);
    }
}
