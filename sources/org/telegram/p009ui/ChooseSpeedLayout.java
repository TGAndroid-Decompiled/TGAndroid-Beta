package org.telegram.p009ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ChooseSpeedLayout;
import org.telegram.p009ui.Components.PopupSwipeBackLayout;

public class ChooseSpeedLayout {
    ActionBarMenuSubItem[] speedItems = new ActionBarMenuSubItem[5];
    ActionBarPopupWindow.ActionBarPopupWindowLayout speedSwipeBackLayout;

    public interface Callback {
        void onSpeedSelected(float f);
    }

    public ChooseSpeedLayout(Context context, final PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, 0, null);
        this.speedSwipeBackLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_arrow_back, LocaleController.getString("Back", C0952R.string.Back), false, null);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PopupSwipeBackLayout.this.closeForeground();
            }
        });
        addItem.setColors(-328966, -328966);
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_speed_0_2, LocaleController.getString("SpeedVerySlow", C0952R.string.SpeedVerySlow), false, null);
        addItem2.setColors(-328966, -328966);
        addItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChooseSpeedLayout.Callback.this.onSpeedSelected(0.25f);
            }
        });
        this.speedItems[0] = addItem2;
        ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_speed_0_5, LocaleController.getString("SpeedSlow", C0952R.string.SpeedSlow), false, null);
        addItem3.setColors(-328966, -328966);
        addItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChooseSpeedLayout.Callback.this.onSpeedSelected(0.5f);
            }
        });
        this.speedItems[1] = addItem3;
        ActionBarMenuSubItem addItem4 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_speed_1, LocaleController.getString("SpeedNormal", C0952R.string.SpeedNormal), false, null);
        addItem4.setColors(-328966, -328966);
        addItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChooseSpeedLayout.Callback.this.onSpeedSelected(1.0f);
            }
        });
        this.speedItems[2] = addItem4;
        ActionBarMenuSubItem addItem5 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_speed_1_5, LocaleController.getString("SpeedFast", C0952R.string.SpeedFast), false, null);
        addItem5.setColors(-328966, -328966);
        addItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChooseSpeedLayout.Callback.this.onSpeedSelected(1.5f);
            }
        });
        this.speedItems[3] = addItem5;
        ActionBarMenuSubItem addItem6 = ActionBarMenuItem.addItem(this.speedSwipeBackLayout, C0952R.C0953drawable.msg_speed_2, LocaleController.getString("SpeedVeryFast", C0952R.string.SpeedVeryFast), false, null);
        addItem6.setColors(-328966, -328966);
        addItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChooseSpeedLayout.Callback.this.onSpeedSelected(2.0f);
            }
        });
        this.speedItems[4] = addItem6;
    }

    public void update(float f) {
        for (int i = 0; i < this.speedItems.length; i++) {
            if ((i != 0 || Math.abs(f - 0.25f) >= 0.001f) && ((i != 1 || Math.abs(f - 0.5f) >= 0.001f) && ((i != 2 || Math.abs(f - 1.0f) >= 0.001f) && ((i != 3 || Math.abs(f - 1.5f) >= 0.001f) && (i != 4 || Math.abs(f - 2.0f) >= 0.001f))))) {
                this.speedItems[i].setColors(-328966, -328966);
            } else {
                this.speedItems[i].setColors(-9718023, -9718023);
            }
        }
    }
}
