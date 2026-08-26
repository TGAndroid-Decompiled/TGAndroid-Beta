package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda10;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.ProfileNotificationsActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda199;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda15;

public class ChatNotificationsPopupWrapper {
    public static final String LAST_SELECTED_TIME_KEY_1 = "last_selected_mute_until_time";
    public static final String LAST_SELECTED_TIME_KEY_2 = "last_selected_mute_until_time2";
    public static final int TYPE_PREVIEW_MENU = 1;
    View backItem;
    Callback callback;
    int currentAccount;
    private final View gap;
    private final boolean isProfile;
    long lastDismissTime;
    ActionBarMenuSubItem muteForLastSelected;
    private int muteForLastSelected1Time;
    ActionBarMenuSubItem muteForLastSelected2;
    private int muteForLastSelected2Time;
    ActionBarMenuSubItem muteUnmuteButton;
    ActionBarPopupWindow popupWindow;
    ActionBarMenuSubItem soundToggle;
    private final TextView topicsExceptionsTextView;
    public int type;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout windowLayout;

    public ChatNotificationsPopupWrapper(Context context, int i, PopupSwipeBackLayout popupSwipeBackLayout, boolean z, boolean z2, final Callback callback, Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.callback = callback;
        this.isProfile = z2;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, z ? R.drawable.popup_fixed_alert : 0, resourcesProvider) {
            Path path = new Path();

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                canvas.save();
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.path);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        this.windowLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        if (popupSwipeBackLayout != null) {
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, resourcesProvider);
            this.backItem = actionBarMenuSubItemAddItem;
            actionBarMenuSubItemAddItem.setOnClickListener(new AutoDeletePopupWrapper$$ExternalSyntheticLambda3(popupSwipeBackLayout, 1));
        }
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, resourcesProvider);
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
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.windowLayout;
        int i3 = R.drawable.msg_mute_1h;
        int i4 = R.string.MuteFor1h;
        ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, i3, LocaleController.getString(i4), false, resourcesProvider);
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
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(this.windowLayout, i3, LocaleController.getString(i4), false, resourcesProvider);
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
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, resourcesProvider).setOnClickListener(new AutoDeletePopupWrapper$$ExternalSyntheticLambda7(this, context, resourcesProvider, i, callback));
        final int i7 = 3;
        ActionBarMenuItem.addItem(this.windowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, resourcesProvider).setOnClickListener(new View.OnClickListener(this) {
            public final ChatNotificationsPopupWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(this.windowLayout, 0, "", false, resourcesProvider);
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
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.gap = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider));
        this.windowLayout.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
        TextView textView = new TextView(context);
        this.topicsExceptionsTextView = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        int i9 = R.id.fit_width_tag;
        frameLayout.setTag(i9, 1);
        textView.setTag(i9, 1);
        this.windowLayout.addView((View) textView, LayoutHelper.createLinear(-2, -2));
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
                        this.f$0.lambda$new$1(callback, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(callback, view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(callback, view);
                        break;
                    case 3:
                        this.f$0.lambda$new$7(callback, view);
                        break;
                    case 4:
                        this.f$0.lambda$new$9(callback, view);
                        break;
                    default:
                        this.f$0.lambda$new$10(callback, view);
                        break;
                }
            }
        });
    }

    public static ItemOptions addAsItemOptions(final BaseFragment baseFragment, final ItemOptions itemOptions, final long j, final long j2) {
        final int currentAccount = baseFragment.getCurrentAccount();
        final Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BaseFragment baseFragment2 = baseFragment;
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$12(itemOptions, currentAccount, j, j2, baseFragment2, resourceProvider, (Integer) obj);
            }
        };
        ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new IntroActivity$$ExternalSyntheticLambda5(itemOptions, 5));
        itemOptionsMakeSwipeback.add(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new MessagesController$$ExternalSyntheticLambda10(itemOptions, currentAccount, j, j2, itemOptionsMakeSwipeback, baseFragment, resourceProvider));
        ActionBarMenuSubItem last = itemOptionsMakeSwipeback.getLast();
        itemOptionsMakeSwipeback.add(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ShareTopView$$ExternalSyntheticLambda3(itemOptions, resourceProvider, currentAccount, callback, 6));
        itemOptionsMakeSwipeback.add(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new MediaController$$ExternalSyntheticLambda8(itemOptions, j, j2, baseFragment, resourceProvider, 7));
        itemOptionsMakeSwipeback.add(0, "", new StarsIntroActivity$$ExternalSyntheticLambda15(itemOptions, currentAccount, j, j2, baseFragment, resourceProvider));
        lambda$addAsItemOptions$19(currentAccount, j, j2, itemOptionsMakeSwipeback.getLast(), last);
        return itemOptionsMakeSwipeback;
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

    private String formatMuteForTime(int i) {
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

    public static void lambda$addAsItemOptions$12(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, Integer num) {
        itemOptions.dismiss();
        if (num.intValue() != 0) {
            NotificationsController.getInstance(i).muteUntil(j, j2, num.intValue());
            if (BulletinFactory.canShowBulletin(baseFragment)) {
                BulletinFactory.createMuteBulletin(baseFragment, 5, num.intValue(), resourcesProvider).show();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i).isDialogMuted(j, j2)) {
            NotificationsController.getInstance(i).muteDialog(j, j2, false);
        }
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, 4, num.intValue(), resourcesProvider).show();
        }
    }

    public static void lambda$addAsItemOptions$13(ItemOptions itemOptions, int i, long j, long j2, ItemOptions itemOptions2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        boolean z = notificationsSettings.getBoolean(Theme.ResourcesProvider.CC.m(j, j2, "sound_enabled_"), true);
        notificationsSettings.edit().putBoolean(Theme.ResourcesProvider.CC.m(j, j2, "sound_enabled_"), !z).apply();
        itemOptions2.dismiss();
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createSoundEnabledBulletin(baseFragment, z ? 1 : 0, resourcesProvider).show();
        }
    }

    public static void lambda$addAsItemOptions$14(int i, int i2, Utilities.Callback callback) {
        if (i != 0) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i2);
            notificationsSettings.edit().putInt("last_selected_mute_until_time", i).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
        }
        callback.run(Integer.valueOf(i));
    }

    public static void lambda$addAsItemOptions$15(int i, Utilities.Callback callback, boolean z, int i2, int i3) {
        AndroidUtilities.runOnUIThread(new MessagePreviewView$Page$6$$ExternalSyntheticLambda0(callback, i2, i, 2), 16L);
    }

    public static void lambda$addAsItemOptions$16(ItemOptions itemOptions, Theme.ResourcesProvider resourcesProvider, int i, Utilities.Callback callback) {
        AlertsCreator.createMuteForPickerDialog(itemOptions.getContext(), resourcesProvider, new AlertsCreator$$ExternalSyntheticLambda139(i, callback, 4));
    }

    public static void lambda$addAsItemOptions$17(ItemOptions itemOptions, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j);
        bundle.putLong("topic_id", j2);
        baseFragment.presentFragment(new ProfileNotificationsActivity(bundle, resourcesProvider));
    }

    public static void lambda$addAsItemOptions$18(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        itemOptions.dismiss();
        boolean zIsDialogMuted = MessagesController.getInstance(i).isDialogMuted(j, j2);
        NotificationsController.getInstance(i).muteDialog(j, j2, !zIsDialogMuted);
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, resourcesProvider).show();
        }
    }

    private static void lambda$addAsItemOptions$19(int i, long j, long j2, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2) {
        int color;
        if (MessagesController.getInstance(i).isDialogMuted(j, j2)) {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute);
            color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGreenText2, false);
            actionBarMenuSubItem2.setVisibility(8);
        } else {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute);
            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
            actionBarMenuSubItem2.setVisibility(0);
            if (MessagesController.getInstance(i).isDialogNotificationsSoundEnabled(j, j2)) {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off);
            } else {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on);
            }
            color = color2;
        }
        actionBarMenuSubItem.setColors(color, color);
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.1f, color));
    }

    public void lambda$new$1(Callback callback, View view) {
        dismiss();
        callback.toggleSound();
    }

    public void lambda$new$10(Callback callback, View view) {
        if (callback != null) {
            callback.openExceptions();
        }
        dismiss();
    }

    public void lambda$new$2(Callback callback, View view) {
        dismiss();
        callback.muteFor(this.muteForLastSelected1Time);
    }

    public void lambda$new$3(Callback callback, View view) {
        dismiss();
        callback.muteFor(this.muteForLastSelected2Time);
    }

    public static void lambda$new$4(int i, int i2, Callback callback) {
        if (i != 0) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i2);
            notificationsSettings.edit().putInt("last_selected_mute_until_time", i).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
        }
        callback.muteFor(i);
    }

    public static void lambda$new$5(int i, Callback callback, boolean z, int i2, int i3) {
        AndroidUtilities.runOnUIThread(new MessagePreviewView$Page$6$$ExternalSyntheticLambda0(callback, i2, i, 3), 16L);
    }

    public void lambda$new$6(Context context, Theme.ResourcesProvider resourcesProvider, int i, Callback callback, View view) {
        dismiss();
        AlertsCreator.createMuteForPickerDialog(context, resourcesProvider, new AlertsCreator$$ExternalSyntheticLambda139(i, callback, 3));
    }

    public void lambda$new$7(Callback callback, View view) {
        dismiss();
        callback.showCustomize();
    }

    public void lambda$new$9(Callback callback, View view) {
        dismiss();
        AndroidUtilities.runOnUIThread(new GroupCallPip$$ExternalSyntheticLambda2(callback, 4));
    }

    public void showAsOptions(BaseFragment baseFragment, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (baseFragment == null || baseFragment.getFragmentView() == null) {
            return;
        }
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
            measuredWidth = f - (this.windowLayout.getMeasuredWidth() / 2.0f);
            measuredHeight = this.windowLayout.getMeasuredHeight() / 2.0f;
        }
        this.popupWindow.showAtLocation(baseFragment.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
        this.popupWindow.dimBehind();
    }

    public void lambda$update$11(long j, long j2, HashSet<Integer> hashSet) {
        int color;
        int i;
        int i2;
        if (System.currentTimeMillis() - this.lastDismissTime < 200) {
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda199(this, j, j2, hashSet, 11));
            return;
        }
        boolean zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(j, j2);
        if (zIsDialogMuted) {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute);
            color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGreenText2, false);
            this.soundToggle.setVisibility(8);
        } else {
            this.muteUnmuteButton.setTextAndIcon(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute);
            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
            this.soundToggle.setVisibility(0);
            if (MessagesController.getInstance(this.currentAccount).isDialogNotificationsSoundEnabled(j, j2)) {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off);
            } else {
                this.soundToggle.setTextAndIcon(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on);
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
            this.muteForLastSelected.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i2));
            this.muteForLastSelected.setText(formatMuteForTime(i2));
        } else {
            this.muteForLastSelected.setVisibility(8);
        }
        if (i != 0) {
            this.muteForLastSelected2Time = i;
            this.muteForLastSelected2.setVisibility(0);
            this.muteForLastSelected2.getImageView().setImageDrawable(TimerDrawable.getTtlIcon(i));
            this.muteForLastSelected2.setText(formatMuteForTime(i));
        } else {
            this.muteForLastSelected2.setVisibility(8);
        }
        this.muteUnmuteButton.setColors(color, color);
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

    public interface Callback {
        void dismiss();

        void muteFor(int i);

        void openExceptions();

        void showCustomize();

        void toggleMute();

        void toggleSound();

        public abstract class CC {
            public static void $default$dismiss(Callback callback) {
            }

            public static void $default$openExceptions(Callback callback) {
            }
        }
    }
}
