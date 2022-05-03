package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;

public class ChatNotificationsPopupWrapper {
    View backItem;
    Callback callback;
    int currentAccount;
    long lastDismissTime;
    ActionBarMenuSubItem muteForLastSelected;
    private int muteForLastSelected1Time;
    ActionBarMenuSubItem muteForLastSelected2;
    private int muteForLastSelected2Time;
    ActionBarMenuSubItem muteUnmuteButton;
    ActionBarPopupWindow popupWindow;
    ActionBarMenuSubItem soundToggle;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public interface Callback {
        void dismiss();

        void muteFor(int i);

        void showCustomize();

        void toggleMute();

        void toggleSound();
    }

    public ChatNotificationsPopupWrapper(final Context context, final int i, final PopupSwipeBackLayout popupSwipeBackLayout, boolean z, boolean z2, final Callback callback, Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.callback = callback;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider);
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
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
        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_tone_on, LocaleController.getString("SoundOn", R.string.SoundOn), false, resourcesProvider);
        this.soundToggle = addItem2;
        addItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$1(callback, view);
            }
        });
        ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_mute_1h, LocaleController.getString("MuteFor1h", R.string.MuteFor1h), false, resourcesProvider);
        this.muteForLastSelected = addItem3;
        addItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$2(callback, view);
            }
        });
        ActionBarMenuSubItem addItem4 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_mute_1h, LocaleController.getString("MuteFor1h", R.string.MuteFor1h), false, resourcesProvider);
        this.muteForLastSelected2 = addItem4;
        addItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$3(callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_mute_period, LocaleController.getString("MuteForPopup", R.string.MuteForPopup), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$6(context, i, callback, view);
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, LocaleController.getString("NotificationsCustomize", R.string.NotificationsCustomize), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$7(callback, view);
            }
        });
        ActionBarMenuSubItem addItem5 = ActionBarMenuItem.addItem(this.windowLayout, 0, "", false, resourcesProvider);
        this.muteUnmuteButton = addItem5;
        addItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatNotificationsPopupWrapper.this.lambda$new$9(callback, view);
            }
        });
    }

    public void lambda$new$1(Callback callback, View view) {
        dismiss();
        callback.toggleSound();
    }

    public void lambda$new$2(Callback callback, View view) {
        dismiss();
        callback.muteFor(this.muteForLastSelected1Time);
    }

    public void lambda$new$3(Callback callback, View view) {
        dismiss();
        callback.muteFor(this.muteForLastSelected2Time);
    }

    public void lambda$new$6(Context context, final int i, final Callback callback, View view) {
        dismiss();
        AlertsCreator.createMuteForPickerDialog(context, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i2) {
                ChatNotificationsPopupWrapper.lambda$new$5(i, callback, z, i2);
            }
        });
    }

    public static void lambda$new$5(final int i, final Callback callback, boolean z, final int i2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatNotificationsPopupWrapper.lambda$new$4(i2, i, callback);
            }
        }, 16L);
    }

    public static void lambda$new$4(int i, int i2, Callback callback) {
        if (i != 0) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i2);
            notificationsSettings.edit().putInt("last_selected_mute_until_time", i).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
        }
        callback.muteFor(i);
    }

    public void lambda$new$7(Callback callback, View view) {
        dismiss();
        callback.showCustomize();
    }

    public void lambda$new$9(final Callback callback, View view) {
        dismiss();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatNotificationsPopupWrapper.Callback.this.toggleMute();
            }
        });
    }

    private void dismiss() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.popupWindow.dismiss();
        }
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public void lambda$update$10(final long j) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatNotificationsPopupWrapper.this.lambda$update$10(j);
                }
            });
            return;
        }
        boolean isDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(j);
        if (isDialogMuted) {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString("UnmuteNotifications", R.string.UnmuteNotifications), R.drawable.msg_unmute);
            i = Theme.getColor("wallet_greenText");
            this.soundToggle.setVisibility(8);
        } else {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString("MuteNotifications", R.string.MuteNotifications), R.drawable.msg_mute);
            int color = Theme.getColor("dialogTextRed");
            this.soundToggle.setVisibility(0);
            if (MessagesController.getInstance(this.currentAccount).isDialogNotificationsSoundEnabled(j)) {
                this.soundToggle.setTextAndIcon(LocaleController.getString("SoundOff", R.string.SoundOff), R.drawable.msg_tone_off);
            } else {
                this.soundToggle.setTextAndIcon(LocaleController.getString("SoundOn", R.string.SoundOn), R.drawable.msg_tone_on);
            }
            i = color;
        }
        if (isDialogMuted) {
            i2 = 0;
            i3 = 0;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            i3 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i2 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        }
        if (i3 != 0) {
            this.muteForLastSelected1Time = i3;
            this.muteForLastSelected.setVisibility(0);
            this.muteForLastSelected.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i3));
            this.muteForLastSelected.setText(formatMuteForTime(i3));
        } else {
            this.muteForLastSelected.setVisibility(8);
        }
        if (i2 != 0) {
            this.muteForLastSelected2Time = i2;
            this.muteForLastSelected2.setVisibility(0);
            this.muteForLastSelected2.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i2));
            this.muteForLastSelected2.setText(formatMuteForTime(i2));
        } else {
            this.muteForLastSelected2.setVisibility(8);
        }
        this.muteUnmuteButton.setColors(i, i);
    }

    private String formatMuteForTime(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = (i - (86400 * i2)) / 3600;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(LocaleController.getString("SecretChatTimerDays", R.string.SecretChatTimerDays));
        }
        if (i3 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i3);
            sb.append(LocaleController.getString("SecretChatTimerHours", R.string.SecretChatTimerHours));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString());
    }

    public void showAsOptions(BaseFragment baseFragment, View view, float f, float f2) {
        if (baseFragment != null && baseFragment.getFragmentView() != null) {
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.windowLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow;
            actionBarPopupWindow.setPauseNotifications(true);
            this.popupWindow.setDismissAnimationDuration(220);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            this.popupWindow.setFocusable(true);
            this.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            while (view != baseFragment.getFragmentView()) {
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            this.popupWindow.showAtLocation(baseFragment.getFragmentView(), 0, (int) (f - (this.windowLayout.getMeasuredWidth() / 2.0f)), (int) (f2 - (this.windowLayout.getMeasuredHeight() / 2.0f)));
            this.popupWindow.dimBehind();
        }
    }
}
