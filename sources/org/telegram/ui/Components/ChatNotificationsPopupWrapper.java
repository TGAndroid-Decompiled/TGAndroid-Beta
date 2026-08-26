package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChooseSpeedLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.ProfileActivity;

public final class ChatNotificationsPopupWrapper {
    public final ActionBarMenuSubItem backItem;
    public final Callback callback;
    public final int currentAccount;
    public final FrameLayout gap;
    public long lastDismissTime;
    public final ActionBarMenuSubItem muteForLastSelected;
    public int muteForLastSelected1Time;
    public final ActionBarMenuSubItem muteForLastSelected2;
    public int muteForLastSelected2Time;
    public final ActionBarMenuSubItem muteUnmuteButton;
    public ActionBarPopupWindow popupWindow;
    public final ActionBarMenuSubItem soundToggle;
    public final TextView topicsExceptionsTextView;
    public int type;
    public final ProfileActivity.AnonymousClass39 windowLayout;

    public interface Callback {
        void dismiss();

        void muteFor(int i);

        void openExceptions();

        void showCustomize();

        void toggleMute();

        void toggleSound();
    }

    public ChatNotificationsPopupWrapper(Context context, int i, PopupSwipeBackLayout popupSwipeBackLayout, boolean z, final Callback callback, Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.callback = callback;
        ProfileActivity.AnonymousClass39 anonymousClass39 = new ProfileActivity.AnonymousClass39(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider);
        this.windowLayout = anonymousClass39;
        anonymousClass39.setFitItems(true);
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, anonymousClass39, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, resourcesProvider);
            this.backItem = actionBarMenuSubItemAddItem;
            actionBarMenuSubItemAddItem.setOnClickListener(new ChooseSpeedLayout$$ExternalSyntheticLambda0(popupSwipeBackLayout, 3));
        }
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(false, false, anonymousClass39, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, resourcesProvider);
        this.soundToggle = actionBarMenuSubItemAddItem2;
        final int i2 = 0;
        actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
        int i3 = R.drawable.msg_mute_1h;
        int i4 = R.string.MuteFor1h;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(false, false, anonymousClass39, i3, LocaleController.getString(i4), false, resourcesProvider);
        this.muteForLastSelected = actionBarMenuSubItemAddItem3;
        final int i5 = 1;
        actionBarMenuSubItemAddItem3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(false, false, anonymousClass39, i3, LocaleController.getString(i4), false, resourcesProvider);
        this.muteForLastSelected2 = actionBarMenuSubItemAddItem4;
        final int i6 = 2;
        actionBarMenuSubItemAddItem4.setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
        ActionBarMenuItem.addItem(false, false, anonymousClass39, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, resourcesProvider).setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda6(this, context, resourcesProvider, i, callback, 1));
        final int i7 = 3;
        ActionBarMenuItem.addItem(false, false, anonymousClass39, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(false, false, anonymousClass39, 0, "", false, resourcesProvider);
        this.muteUnmuteButton = actionBarMenuSubItemAddItem5;
        final int i8 = 4;
        actionBarMenuSubItemAddItem5.setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.gap = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
        LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 8);
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = anonymousClass39.linearLayout;
        anonymousClass2.addView(frameLayout, layoutParamsCreateLinear);
        TextView textView = new TextView(context);
        this.topicsExceptionsTextView = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        int i9 = R.id.fit_width_tag;
        frameLayout.setTag(i9, 1);
        textView.setTag(i9, 1);
        anonymousClass2.addView(textView, LayoutHelper.createLinear(-2, -2));
        textView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 0, 6));
        final int i10 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f$0.dismiss();
                        callback.toggleSound();
                        break;
                    case 1:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = this.f$0;
                        chatNotificationsPopupWrapper.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper.muteForLastSelected1Time);
                        break;
                    case 2:
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = this.f$0;
                        chatNotificationsPopupWrapper2.dismiss();
                        callback.muteFor(chatNotificationsPopupWrapper2.muteForLastSelected2Time);
                        break;
                    case 3:
                        this.f$0.dismiss();
                        callback.showCustomize();
                        break;
                    case 4:
                        this.f$0.dismiss();
                        AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(callback, 19));
                        break;
                    default:
                        ChatNotificationsPopupWrapper.Callback callback2 = callback;
                        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper3 = this.f$0;
                        chatNotificationsPopupWrapper3.getClass();
                        callback2.openExceptions();
                        chatNotificationsPopupWrapper3.dismiss();
                        break;
                }
            }
        });
    }

    public static String formatMuteForTime(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = (i3 - (i4 * 3600)) / 60;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString());
    }

    public final void dismiss() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss(true);
            this.popupWindow.dismiss(true);
        }
        this.callback.dismiss();
        this.lastDismissTime = System.currentTimeMillis();
    }

    public final void showAsOptions(BaseFragment baseFragment, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (baseFragment.getFragmentView() == null) {
            return;
        }
        ProfileActivity.AnonymousClass39 anonymousClass39 = this.windowLayout;
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(anonymousClass39);
        this.popupWindow = actionBarPopupWindow;
        actionBarPopupWindow.pauseNotifications = true;
        actionBarPopupWindow.dismissAnimationDuration = 220;
        actionBarPopupWindow.setOutsideTouchable(true);
        this.popupWindow.setClippingEnabled(true);
        this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.popupWindow.setFocusable(true);
        anonymousClass39.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.popupWindow.setInputMethodMode(2);
        this.popupWindow.getContentView().setFocusableInTouchMode(true);
        while (view != baseFragment.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f += view.getX();
            f2 += view.getY();
            view = (View) view.getParent();
        }
        if (z) {
            measuredWidth = f - AndroidUtilities.dpf2(8.0f);
            measuredHeight = AndroidUtilities.dpf2(16.0f);
        } else {
            measuredWidth = f - (anonymousClass39.getMeasuredWidth() / 2.0f);
            measuredHeight = anonymousClass39.getMeasuredHeight() / 2.0f;
        }
        this.popupWindow.showAtLocation(baseFragment.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
        this.popupWindow.dimBehind(0.2f);
    }

    public final void update(long j, long j2, HashSet hashSet) {
        int color;
        int i;
        int i2;
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda37(9, j, j2, this, hashSet));
            return;
        }
        boolean zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(j, j2);
        if (zIsDialogMuted) {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGreenText2, false);
            this.soundToggle.setVisibility(8);
        } else {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
            this.soundToggle.setVisibility(0);
            if (MessagesController.getInstance(this.currentAccount).isDialogNotificationsSoundEnabled(j, j2)) {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            color = color2;
        }
        if (this.type == 1) {
            this.backItem.setVisibility(8);
        }
        if (zIsDialogMuted || this.type == 1) {
            i = 0;
            i2 = 0;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            i2 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        }
        if (i2 != 0) {
            this.muteForLastSelected1Time = i2;
            this.muteForLastSelected.setVisibility(0);
            ImageView imageView = this.muteForLastSelected.getImageView();
            TimerDrawable timerDrawable = new TimerDrawable(ApplicationLoader.applicationContext, null);
            timerDrawable.setTime(i2);
            timerDrawable.isStaticIcon = true;
            imageView.setImageDrawable(timerDrawable);
            this.muteForLastSelected.setText(formatMuteForTime(i2));
        } else {
            this.muteForLastSelected.setVisibility(8);
        }
        if (i != 0) {
            this.muteForLastSelected2Time = i;
            this.muteForLastSelected2.setVisibility(0);
            ImageView imageView2 = this.muteForLastSelected2.getImageView();
            TimerDrawable timerDrawable2 = new TimerDrawable(ApplicationLoader.applicationContext, null);
            timerDrawable2.setTime(i);
            timerDrawable2.isStaticIcon = true;
            imageView2.setImageDrawable(timerDrawable2);
            this.muteForLastSelected2.setText(formatMuteForTime(i));
        } else {
            this.muteForLastSelected2.setVisibility(8);
        }
        ActionBarMenuSubItem actionBarMenuSubItem = this.muteUnmuteButton;
        actionBarMenuSubItem.setTextColor(color);
        actionBarMenuSubItem.setIconColor(color);
        this.muteUnmuteButton.setSelectorColor(Theme.multAlpha(0.1f, color));
        if (hashSet == null || hashSet.isEmpty()) {
            this.gap.setVisibility(8);
            this.topicsExceptionsTextView.setVisibility(8);
        } else {
            this.gap.setVisibility(0);
            this.topicsExceptionsTextView.setVisibility(0);
            this.topicsExceptionsTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), Theme.key_windowBackgroundWhiteBlueText, 1, null));
        }
    }
}
