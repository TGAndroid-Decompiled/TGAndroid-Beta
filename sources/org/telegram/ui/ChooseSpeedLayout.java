package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PopupSwipeBackLayout;

public final class ChooseSpeedLayout {
    public final ActionBarMenuSlider.SpeedSlider slider;
    public final ActionBarMenuSubItem[] speedItems;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout speedSwipeBackLayout;

    public ChooseSpeedLayout(Context context, PopupSwipeBackLayout popupSwipeBackLayout, final PhotoViewer.AnonymousClass14 anonymousClass14) {
        ActionBarMenuSubItem[] actionBarMenuSubItemArr = new ActionBarMenuSubItem[5];
        this.speedItems = actionBarMenuSubItemArr;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(0, 0, context, null);
        this.speedSwipeBackLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        actionBarMenuSubItemAddItem.setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 0));
        actionBarMenuSubItemAddItem.setTextColor(-328966);
        actionBarMenuSubItemAddItem.setIconColor(-328966);
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 11);
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
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(context, null);
        this.slider = speedSlider;
        speedSlider.setMinimumWidth(AndroidUtilities.dp(196.0f));
        speedSlider.setDrawShadow(false);
        speedSlider.setBackgroundColor(-14540254);
        speedSlider.setTextColor(-1);
        speedSlider.setOnValueChange(new CallLogActivity$$ExternalSyntheticLambda3(anonymousClass14, 16));
        anonymousClass2.addView(speedSlider, LayoutHelper.createLinear(-1, 44));
        View anonymousClass110 = new PhotoViewer.AnonymousClass19(context, 12);
        anonymousClass110.setMinimumWidth(AndroidUtilities.dp(196.0f));
        anonymousClass110.setBackgroundColor(-15198184);
        anonymousClass2.addView(anonymousClass110);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) anonymousClass110.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        anonymousClass110.setLayoutParams(layoutParams2);
        final int i = 0;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        actionBarMenuSubItemAddItem2.setTextColor(-328966);
        actionBarMenuSubItemAddItem2.setIconColor(-328966);
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        anonymousClass14.onSpeedSelected(true, true, 0.2f);
                        break;
                    case 1:
                        anonymousClass14.onSpeedSelected(true, true, 0.5f);
                        break;
                    case 2:
                        anonymousClass14.onSpeedSelected(true, true, 1.0f);
                        break;
                    case 3:
                        anonymousClass14.onSpeedSelected(true, true, 1.5f);
                        break;
                    default:
                        anonymousClass14.onSpeedSelected(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem2.setSelectorColor(268435455);
        actionBarMenuSubItemArr[0] = actionBarMenuSubItemAddItem2;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        actionBarMenuSubItemAddItem3.setTextColor(-328966);
        actionBarMenuSubItemAddItem3.setIconColor(-328966);
        final int i2 = 1;
        actionBarMenuSubItemAddItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        anonymousClass14.onSpeedSelected(true, true, 0.2f);
                        break;
                    case 1:
                        anonymousClass14.onSpeedSelected(true, true, 0.5f);
                        break;
                    case 2:
                        anonymousClass14.onSpeedSelected(true, true, 1.0f);
                        break;
                    case 3:
                        anonymousClass14.onSpeedSelected(true, true, 1.5f);
                        break;
                    default:
                        anonymousClass14.onSpeedSelected(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem3.setSelectorColor(268435455);
        actionBarMenuSubItemArr[1] = actionBarMenuSubItemAddItem3;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        actionBarMenuSubItemAddItem4.setTextColor(-328966);
        actionBarMenuSubItemAddItem4.setIconColor(-328966);
        final int i3 = 2;
        actionBarMenuSubItemAddItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        anonymousClass14.onSpeedSelected(true, true, 0.2f);
                        break;
                    case 1:
                        anonymousClass14.onSpeedSelected(true, true, 0.5f);
                        break;
                    case 2:
                        anonymousClass14.onSpeedSelected(true, true, 1.0f);
                        break;
                    case 3:
                        anonymousClass14.onSpeedSelected(true, true, 1.5f);
                        break;
                    default:
                        anonymousClass14.onSpeedSelected(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem4.setSelectorColor(268435455);
        actionBarMenuSubItemArr[2] = actionBarMenuSubItemAddItem4;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        actionBarMenuSubItemAddItem5.setTextColor(-328966);
        actionBarMenuSubItemAddItem5.setIconColor(-328966);
        final int i4 = 3;
        actionBarMenuSubItemAddItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        anonymousClass14.onSpeedSelected(true, true, 0.2f);
                        break;
                    case 1:
                        anonymousClass14.onSpeedSelected(true, true, 0.5f);
                        break;
                    case 2:
                        anonymousClass14.onSpeedSelected(true, true, 1.0f);
                        break;
                    case 3:
                        anonymousClass14.onSpeedSelected(true, true, 1.5f);
                        break;
                    default:
                        anonymousClass14.onSpeedSelected(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem5.setSelectorColor(268435455);
        actionBarMenuSubItemArr[3] = actionBarMenuSubItemAddItem5;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem6 = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        actionBarMenuSubItemAddItem6.setTextColor(-328966);
        actionBarMenuSubItemAddItem6.setIconColor(-328966);
        final int i5 = 4;
        actionBarMenuSubItemAddItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        anonymousClass14.onSpeedSelected(true, true, 0.2f);
                        break;
                    case 1:
                        anonymousClass14.onSpeedSelected(true, true, 0.5f);
                        break;
                    case 2:
                        anonymousClass14.onSpeedSelected(true, true, 1.0f);
                        break;
                    case 3:
                        anonymousClass14.onSpeedSelected(true, true, 1.5f);
                        break;
                    default:
                        anonymousClass14.onSpeedSelected(true, true, 2.0f);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem6.setSelectorColor(268435455);
        actionBarMenuSubItemArr[4] = actionBarMenuSubItemAddItem6;
    }

    public final void update(float f, boolean z) {
        int i = 0;
        while (true) {
            ActionBarMenuSubItem[] actionBarMenuSubItemArr = this.speedItems;
            if (i >= actionBarMenuSubItemArr.length) {
                this.slider.setSpeed(f, true);
                return;
            }
            if (!z || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                ActionBarMenuSubItem actionBarMenuSubItem = actionBarMenuSubItemArr[i];
                actionBarMenuSubItem.setTextColor(-328966);
                actionBarMenuSubItem.setIconColor(-328966);
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem2 = actionBarMenuSubItemArr[i];
                actionBarMenuSubItem2.setTextColor(-9718023);
                actionBarMenuSubItem2.setIconColor(-9718023);
            }
            i++;
        }
    }
}
