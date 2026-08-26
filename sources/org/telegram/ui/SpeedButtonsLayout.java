package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;

public class SpeedButtonsLayout extends LinearLayout {
    ActionBarMenuSubItem[] speedItems;

    public interface Callback {
        void onSpeedSelected(float f, boolean z, boolean z2);
    }

    public SpeedButtonsLayout(Context context, final Callback callback) {
        super(context);
        this.speedItems = new ActionBarMenuSubItem[5];
        setOrientation(1);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        actionBarMenuSubItemAddItem.setColors(-328966, -328966);
        final int i = 0;
        actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
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
        actionBarMenuSubItemAddItem.setSelectorColor(268435455);
        this.speedItems[0] = actionBarMenuSubItemAddItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        actionBarMenuSubItemAddItem2.setColors(-328966, -328966);
        final int i2 = 1;
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener() {
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
        actionBarMenuSubItemAddItem2.setSelectorColor(268435455);
        this.speedItems[1] = actionBarMenuSubItemAddItem2;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        actionBarMenuSubItemAddItem3.setColors(-328966, -328966);
        final int i3 = 2;
        actionBarMenuSubItemAddItem3.setOnClickListener(new View.OnClickListener() {
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
        actionBarMenuSubItemAddItem3.setSelectorColor(268435455);
        this.speedItems[2] = actionBarMenuSubItemAddItem3;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        actionBarMenuSubItemAddItem4.setColors(-328966, -328966);
        final int i4 = 3;
        actionBarMenuSubItemAddItem4.setOnClickListener(new View.OnClickListener() {
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
        actionBarMenuSubItemAddItem4.setSelectorColor(268435455);
        this.speedItems[3] = actionBarMenuSubItemAddItem4;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        actionBarMenuSubItemAddItem5.setColors(-328966, -328966);
        final int i5 = 4;
        actionBarMenuSubItemAddItem5.setOnClickListener(new View.OnClickListener() {
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
        actionBarMenuSubItemAddItem5.setSelectorColor(268435455);
        this.speedItems[4] = actionBarMenuSubItemAddItem5;
        View view = new FrameLayout(context) {
            @Override
            public void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
            }
        };
        view.setMinimumWidth(AndroidUtilities.dp(196.0f));
        view.setBackgroundColor(-15198184);
        addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        view.setLayoutParams(layoutParams);
    }

    public void update(float f, boolean z) {
        for (int i = 0; i < this.speedItems.length; i++) {
            if (!z || ((i != 0 || Math.abs(f - 0.2f) >= 0.01f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.1f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.1f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.1f) && (i != 4 || Math.abs(f - 2.0f) >= 0.1f)))))) {
                this.speedItems[i].setColors(-328966, -328966);
            } else {
                this.speedItems[i].setColors(-9718023, -9718023);
            }
        }
    }
}
