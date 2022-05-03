package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AutoDeletePopupWrapper;

public class AutoDeletePopupWrapper {
    View backItem;
    Callback callback;
    private final ActionBarMenuSubItem disableItem;
    long lastDismissTime;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public interface Callback {
        void dismiss();

        void setAutoDeleteHistory(int i, int i2);
    }

    public AutoDeletePopupWrapper(final Context context, final PopupSwipeBackLayout popupSwipeBackLayout, final Callback callback, boolean z, Theme.ResourcesProvider resourcesProvider) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider);
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        this.callback = callback;
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_arrow_back, LocaleController.getString("Back", R.string.Back), false, resourcesProvider);
            this.backItem = addItem;
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PopupSwipeBackLayout.this.closeForeground();
                }
            });
        }
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString("AutoDelete1Day", R.string.AutoDelete1Day), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$1(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString("AutoDelete7Days", R.string.AutoDelete7Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$2(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString("AutoDelete1Month", R.string.AutoDelete1Month), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$3(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, LocaleController.getString("AutoDeleteCustom", R.string.AutoDeleteCustom), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$5(context, callback, view);
            }
        });
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_disable, LocaleController.getString("AutoDeleteDisable", R.string.AutoDeleteDisable), false, resourcesProvider);
        this.disableItem = addItem2;
        addItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AutoDeletePopupWrapper.this.lambda$new$6(callback, view);
            }
        });
        addItem2.setColors(Theme.getColor("dialogTextRed2"), Theme.getColor("dialogTextRed2"));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor("graySection"));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        this.windowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
        TextView textView = new TextView(context);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
        textView.setText(LocaleController.getString("AutoDeletePopupDescription", R.string.AutoDeletePopupDescription));
        this.windowLayout.addView((View) textView, LayoutHelper.createLinear(-1, -2));
    }

    public void lambda$new$1(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(86400, 70);
    }

    public void lambda$new$2(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(604800, 70);
    }

    public void lambda$new$3(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(2678400, 70);
    }

    public void lambda$new$5(Context context, final Callback callback, View view) {
        dismiss();
        AlertsCreator.createAutoDeleteDatePickerDialog(context, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i) {
                AutoDeletePopupWrapper.lambda$new$4(AutoDeletePopupWrapper.Callback.this, z, i);
            }
        });
    }

    public static void lambda$new$4(Callback callback, boolean z, int i) {
        callback.setAutoDeleteHistory(i * 60, i == 0 ? 71 : 70);
    }

    public void lambda$new$6(Callback callback, View view) {
        dismiss();
        callback.setAutoDeleteHistory(0, 71);
    }

    private void dismiss() {
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public void lambda$updateItems$7(final int i) {
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AutoDeletePopupWrapper.this.lambda$updateItems$7(i);
                }
            });
        } else if (i == 0) {
            this.disableItem.setVisibility(8);
        } else {
            this.disableItem.setVisibility(0);
        }
    }
}
