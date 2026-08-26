package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
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

public class ChooseSpeedLayout {
    private static final float MAX_SPEED = 2.5f;
    private static final float MIN_SPEED = 0.2f;
    ActionBarMenuSlider.SpeedSlider slider;
    ActionBarMenuSubItem[] speedItems = new ActionBarMenuSubItem[5];
    public ActionBarPopupWindow.ActionBarPopupWindowLayout speedSwipeBackLayout;

    public interface Callback {
        void onSpeedSelected(float f, boolean z, boolean z2);
    }

    public ChooseSpeedLayout(Context context, PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, 0, null, 0);
        this.speedSwipeBackLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        actionBarMenuSubItemAddItem.setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 0));
        actionBarMenuSubItemAddItem.setColors(-328966, -328966);
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }
        };
        frameLayout.setMinimumWidth(AndroidUtilities.dp(196.0f));
        frameLayout.setBackgroundColor(-15198184);
        this.speedSwipeBackLayout.addView(frameLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        frameLayout.setLayoutParams(layoutParams);
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(context, null);
        this.slider = speedSlider;
        speedSlider.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.slider.setDrawShadow(false);
        this.slider.setBackgroundColor(-14540254);
        this.slider.setTextColor(-1);
        this.slider.setOnValueChange(new LinkManager$$ExternalSyntheticLambda6(callback, 11));
        this.speedSwipeBackLayout.addView((View) this.slider, LayoutHelper.createLinear(-1, 44));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }
        };
        frameLayout2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        frameLayout2.setBackgroundColor(-15198184);
        this.speedSwipeBackLayout.addView(frameLayout2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        frameLayout2.setLayoutParams(layoutParams2);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        actionBarMenuSubItemAddItem2.setColors(-328966, -328966);
        final int i = 0;
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        callback.onSpeedSelected(0.2f, true, true);
                        break;
                    case 1:
                        callback.onSpeedSelected(0.5f, true, true);
                        break;
                    case 2:
                        callback.onSpeedSelected(1.0f, true, true);
                        break;
                    case 3:
                        callback.onSpeedSelected(1.5f, true, true);
                        break;
                    default:
                        callback.onSpeedSelected(2.0f, true, true);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem2.setSelectorColor(268435455);
        this.speedItems[0] = actionBarMenuSubItemAddItem2;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        actionBarMenuSubItemAddItem3.setColors(-328966, -328966);
        final int i2 = 1;
        actionBarMenuSubItemAddItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        callback.onSpeedSelected(0.2f, true, true);
                        break;
                    case 1:
                        callback.onSpeedSelected(0.5f, true, true);
                        break;
                    case 2:
                        callback.onSpeedSelected(1.0f, true, true);
                        break;
                    case 3:
                        callback.onSpeedSelected(1.5f, true, true);
                        break;
                    default:
                        callback.onSpeedSelected(2.0f, true, true);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem3.setSelectorColor(268435455);
        this.speedItems[1] = actionBarMenuSubItemAddItem3;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        actionBarMenuSubItemAddItem4.setColors(-328966, -328966);
        final int i3 = 2;
        actionBarMenuSubItemAddItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        callback.onSpeedSelected(0.2f, true, true);
                        break;
                    case 1:
                        callback.onSpeedSelected(0.5f, true, true);
                        break;
                    case 2:
                        callback.onSpeedSelected(1.0f, true, true);
                        break;
                    case 3:
                        callback.onSpeedSelected(1.5f, true, true);
                        break;
                    default:
                        callback.onSpeedSelected(2.0f, true, true);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem4.setSelectorColor(268435455);
        this.speedItems[2] = actionBarMenuSubItemAddItem4;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        actionBarMenuSubItemAddItem5.setColors(-328966, -328966);
        final int i4 = 3;
        actionBarMenuSubItemAddItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        callback.onSpeedSelected(0.2f, true, true);
                        break;
                    case 1:
                        callback.onSpeedSelected(0.5f, true, true);
                        break;
                    case 2:
                        callback.onSpeedSelected(1.0f, true, true);
                        break;
                    case 3:
                        callback.onSpeedSelected(1.5f, true, true);
                        break;
                    default:
                        callback.onSpeedSelected(2.0f, true, true);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem5.setSelectorColor(268435455);
        this.speedItems[3] = actionBarMenuSubItemAddItem5;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem6 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        actionBarMenuSubItemAddItem6.setColors(-328966, -328966);
        final int i5 = 4;
        actionBarMenuSubItemAddItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        callback.onSpeedSelected(0.2f, true, true);
                        break;
                    case 1:
                        callback.onSpeedSelected(0.5f, true, true);
                        break;
                    case 2:
                        callback.onSpeedSelected(1.0f, true, true);
                        break;
                    case 3:
                        callback.onSpeedSelected(1.5f, true, true);
                        break;
                    default:
                        callback.onSpeedSelected(2.0f, true, true);
                        break;
                }
            }
        });
        actionBarMenuSubItemAddItem6.setSelectorColor(268435455);
        this.speedItems[4] = actionBarMenuSubItemAddItem6;
    }

    public static void lambda$new$1(Callback callback, Float f, Boolean bool) {
        callback.onSpeedSelected((f.floatValue() * 2.3f) + 0.2f, bool.booleanValue(), false);
    }

    public void update(float f, boolean z) {
        for (int i = 0; i < this.speedItems.length; i++) {
            if (!z || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                this.speedItems[i].setColors(-328966, -328966);
            } else {
                this.speedItems[i].setColors(-9718023, -9718023);
            }
        }
        this.slider.setSpeed(f, true);
    }
}
