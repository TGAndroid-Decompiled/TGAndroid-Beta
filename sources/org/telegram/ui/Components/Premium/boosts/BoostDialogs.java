package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults;
import org.telegram.tgnet.TLRPC$TL_payments_giveawayInfo;
import org.telegram.tgnet.TLRPC$TL_payments_giveawayInfoResults;
import org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption;
import org.telegram.tgnet.TLRPC$payments_GiveawayInfo;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StatisticActivity;
public class BoostDialogs {
    public static void lambda$checkReduceQuantity$13(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$checkReduceUsers$11(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showAbout$14(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showAboutEnd$15(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showAboutEnd$17(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showAboutEnd$18(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showBulletinAbout$27(TLRPC$TL_error tLRPC$TL_error) {
    }

    public static boolean lambda$showDatePicker$3(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$showMoreBoostsNeeded$29(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$showPrivateChannelAlert$20(DialogInterface dialogInterface, int i) {
    }

    public static long getThreeDaysAfterToday() {
        return roundByFiveMinutes(new Date().getTime() + 259200000);
    }

    public static void showToastError(Context context, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLRPC$TL_error == null || (str = tLRPC$TL_error.text) == null || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context, tLRPC$TL_error.text, 1).show();
    }

    public static void processApplyGiftCodeError(TLRPC$TL_error tLRPC$TL_error, FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        String str;
        if (tLRPC$TL_error == null || (str = tLRPC$TL_error.text) == null) {
            return;
        }
        if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            String format = LocaleController.getInstance().formatterBoostExpired.format(new Date(Integer.parseInt(tLRPC$TL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumActivateErrorText", R.string.GiftPremiumActivateErrorText), Theme.key_undo_cancelColor, 0, runnable);
            BulletinFactory of = BulletinFactory.of(frameLayout, resourcesProvider);
            int i = R.raw.chats_infotip;
            String string = LocaleController.getString("GiftPremiumActivateErrorTitle", R.string.GiftPremiumActivateErrorTitle);
            of.createSimpleBulletin(i, string, AndroidUtilities.replaceCharSequence("%1$s", replaceSingleTag, AndroidUtilities.replaceTags("**" + format + "**"))).show();
            try {
                frameLayout.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        showToastError(frameLayout.getContext(), tLRPC$TL_error);
    }

    public static void lambda$showBulletin$1(BulletinFactory bulletinFactory, boolean z, final TLRPC$Chat tLRPC$Chat, Theme.ResourcesProvider resourcesProvider) {
        String string;
        String string2;
        int i = R.raw.star_premium_2;
        if (z) {
            string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
        } else {
            string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
        }
        if (z) {
            string2 = LocaleController.getString("BoostingCheckStatistic", R.string.BoostingCheckStatistic);
        } else {
            string2 = LocaleController.getString("BoostingCheckGiftsStatistic", R.string.BoostingCheckGiftsStatistic);
        }
        bulletinFactory.createSimpleBulletin(i, string, AndroidUtilities.replaceSingleTag(string2, Theme.key_undo_cancelColor, 0, new Runnable() {
            @Override
            public final void run() {
                BoostDialogs.lambda$showBulletin$0(TLRPC$Chat.this);
            }
        }, resourcesProvider)).setDuration(5000).show();
    }

    private static void showBulletin(final BulletinFactory bulletinFactory, final Theme.ResourcesProvider resourcesProvider, final TLRPC$Chat tLRPC$Chat, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostDialogs.lambda$showBulletin$1(BulletinFactory.this, z, tLRPC$Chat, resourcesProvider);
            }
        }, 300L);
    }

    public static void lambda$showBulletin$0(TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$Chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", tLRPC$Chat.id);
            bundle.putBoolean("is_megagroup", tLRPC$Chat.megagroup);
            bundle.putBoolean("start_from_boosts", true);
            bundle.putBoolean("only_boosts", true);
            StatisticActivity statisticActivity = new StatisticActivity(bundle);
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            LaunchActivity.getLastFragment().showAsSheet(statisticActivity, bottomSheetParams);
        }
    }

    public static void showGiftLinkForwardedBulletin(long j) {
        final SpannableStringBuilder replaceTags;
        if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiftLinkForwardedToSavedMsg", R.string.BoostingGiftLinkForwardedToSavedMsg));
        } else if (DialogObject.isChatDialog(j)) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j)).title));
        } else {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j)))));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BoostDialogs.lambda$showGiftLinkForwardedBulletin$2(replaceTags);
            }
        }, 450L);
    }

    public static void lambda$showGiftLinkForwardedBulletin$2(CharSequence charSequence) {
        BulletinFactory global = BulletinFactory.global();
        if (global != null) {
            global.createSimpleBulletinWithIconSize(R.raw.forward, charSequence, 30).show();
        }
    }

    public static void showBulletin(BaseFragment baseFragment, TLRPC$Chat tLRPC$Chat, boolean z) {
        if (baseFragment == null) {
            return;
        }
        showBulletin(BulletinFactory.of(baseFragment), baseFragment.getResourceProvider(), tLRPC$Chat, z);
    }

    private static long roundByFiveMinutes(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i = calendar.get(12);
        while (i % 5 != 0) {
            i++;
        }
        calendar.set(12, i);
        return calendar.getTimeInMillis();
    }

    public static void showDatePicker(Context context, long j, final AlertsCreator.ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.ScheduleDatePickerColors scheduleDatePickerColors = new AlertsCreator.ScheduleDatePickerColors(resourcesProvider);
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(24);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker2.setTag("HOUR");
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        final LinearLayout linearLayout = new LinearLayout(context, scheduleDatePickerColors, numberPicker, numberPicker2, numberPicker3) {
            boolean ignoreLayout = false;
            final TextPaint paint;
            final AlertsCreator.ScheduleDatePickerColors val$datePickerColors;
            final NumberPicker val$dayPicker;
            final NumberPicker val$hourPicker;
            final NumberPicker val$minutePicker;

            {
                this.val$datePickerColors = scheduleDatePickerColors;
                this.val$dayPicker = numberPicker;
                this.val$hourPicker = numberPicker2;
                this.val$minutePicker = numberPicker3;
                TextPaint textPaint = new TextPaint(1);
                this.paint = textPaint;
                setWillNotDraw(false);
                textPaint.setTextSize(AndroidUtilities.dp(20.0f));
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textPaint.setColor(scheduleDatePickerColors.textColor);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                this.val$dayPicker.setItemCount(i3);
                this.val$hourPicker.setItemCount(i3);
                this.val$minutePicker.setItemCount(i3);
                this.val$dayPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.val$hourPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.val$minutePicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawText(":", this.val$hourPicker.getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), this.paint);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$showDatePicker$3;
                lambda$showDatePicker$3 = BoostDialogs.lambda$showDatePicker$3(view, motionEvent);
                return lambda$showDatePicker$3;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        final int i = calendar.get(1);
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        long giveawayPeriodMax = BoostRepository.giveawayPeriodMax() * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(giveawayPeriodMax);
        int i2 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) giveawayPeriodMax);
        final int i3 = calendar2.get(11);
        final int i4 = calendar.get(12);
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(i2 - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setTag("DAY");
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                String lambda$showDatePicker$4;
                lambda$showDatePicker$4 = BoostDialogs.lambda$showDatePicker$4(currentTimeMillis, calendar, i, i5);
                return lambda$showDatePicker$4;
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i5, int i6) {
                BoostDialogs.lambda$showDatePicker$5(linearLayout, numberPicker2, numberPicker3, i3, i4, numberPicker, numberPicker4, i5, i6);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                String valueOf;
                valueOf = String.valueOf(i5);
                return valueOf;
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(11);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                String lambda$showDatePicker$7;
                lambda$showDatePicker$7 = BoostDialogs.lambda$showDatePicker$7(i5);
                return lambda$showDatePicker$7;
            }
        });
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j > 0) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            calendar.setTimeInMillis(j);
            numberPicker3.setValue(calendar.get(12) / 5);
            numberPicker2.setValue(calendar.get(11));
            numberPicker.setValue((int) ((j - calendar.getTimeInMillis()) / 86400000));
            onValueChangeListener.onValueChange(numberPicker, numberPicker.getValue(), numberPicker.getValue());
            onValueChangeListener.onValueChange(numberPicker2, numberPicker2.getValue(), numberPicker2.getValue());
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView2.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 8.0f));
        textView2.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BoostDialogs.lambda$showDatePicker$8(calendar, numberPicker, numberPicker2, numberPicker3, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet show = builder.show();
        show.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        show.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        AndroidUtilities.setLightStatusBar(show.getWindow(), ColorUtils.calculateLuminance(scheduleDatePickerColors.backgroundColor) > 0.699999988079071d);
    }

    public static String lambda$showDatePicker$4(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().formatterScheduleDay.format(j2);
        }
        return LocaleController.getInstance().formatterScheduleYear.format(j2);
    }

    public static void lambda$showDatePicker$5(LinearLayout linearLayout, NumberPicker numberPicker, NumberPicker numberPicker2, int i, int i2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i3, int i4) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (numberPicker4.getTag() != null && numberPicker4.getTag().equals("DAY")) {
            if (numberPicker4.getValue() == numberPicker4.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i5 = calendar.get(11);
                int i6 = (calendar.get(12) / 5) + 1;
                if (i6 > 11) {
                    if (i5 == 23) {
                        numberPicker4.setMinValue(numberPicker4.getMinValue() + 1);
                        numberPicker.setMinValue(0);
                    } else {
                        numberPicker.setMinValue(i5 + 1);
                    }
                    numberPicker2.setMinValue(0);
                } else {
                    numberPicker.setMinValue(i5);
                    numberPicker2.setMinValue(i6);
                }
            } else if (numberPicker4.getValue() == numberPicker4.getMaxValue()) {
                numberPicker.setMaxValue(i);
                numberPicker2.setMaxValue(Math.min(i2 / 5, 11));
            } else {
                numberPicker.setMinValue(0);
                numberPicker2.setMinValue(0);
                numberPicker.setMaxValue(23);
                numberPicker2.setMaxValue(11);
            }
        }
        if (numberPicker4.getTag() != null && numberPicker4.getTag().equals("HOUR") && numberPicker3.getValue() == numberPicker3.getMinValue()) {
            if (numberPicker4.getValue() == numberPicker4.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i7 = (calendar2.get(12) / 5) + 1;
                if (i7 > 11) {
                    numberPicker2.setMinValue(0);
                    return;
                } else {
                    numberPicker2.setMinValue(i7);
                    return;
                }
            }
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(11);
        }
    }

    public static String lambda$showDatePicker$7(int i) {
        return String.format("%02d", Integer.valueOf(i * 5));
    }

    public static void lambda$showDatePicker$8(Calendar calendar, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, AlertsCreator.ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 24 * 3600 * 1000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue() * 5);
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000));
        builder.getDismissRunnable().run();
    }

    public static void showUnsavedChanges(int i, Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Runnable runnable2) {
        String string;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges));
        if (i == 1) {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        } else if (i == 2) {
            string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
        } else {
            string = i != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
        }
        builder.setMessage(string);
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString("Discard", R.string.Discard), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                runnable2.run();
            }
        });
        builder.show();
    }

    public static boolean checkReduceUsers(Context context, Theme.ResourcesProvider resourcesProvider, List<TLRPC$TL_premiumGiftCodeOption> list, TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption) {
        if (tLRPC$TL_premiumGiftCodeOption.store_product == null) {
            ArrayList arrayList = new ArrayList();
            for (TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption2 : list) {
                if (tLRPC$TL_premiumGiftCodeOption2.months == tLRPC$TL_premiumGiftCodeOption.months && tLRPC$TL_premiumGiftCodeOption2.store_product != null) {
                    arrayList.add(Integer.valueOf(tLRPC$TL_premiumGiftCodeOption2.users));
                }
            }
            String join = TextUtils.join(", ", arrayList);
            int i = tLRPC$TL_premiumGiftCodeOption.users;
            AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
            builder.setTitle(LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i, join)));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    BoostDialogs.lambda$checkReduceUsers$11(dialogInterface, i2);
                }
            });
            builder.show();
            return true;
        }
        return false;
    }

    public static boolean checkReduceQuantity(List<Integer> list, Context context, Theme.ResourcesProvider resourcesProvider, List<TLRPC$TL_premiumGiftCodeOption> list2, TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption, final Utilities.Callback<TLRPC$TL_premiumGiftCodeOption> callback) {
        if (tLRPC$TL_premiumGiftCodeOption.store_product == null) {
            ArrayList<TLRPC$TL_premiumGiftCodeOption> arrayList = new ArrayList();
            for (TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption2 : list2) {
                if (tLRPC$TL_premiumGiftCodeOption2.months == tLRPC$TL_premiumGiftCodeOption.months && tLRPC$TL_premiumGiftCodeOption2.store_product != null && list.contains(Integer.valueOf(tLRPC$TL_premiumGiftCodeOption2.users))) {
                    arrayList.add(tLRPC$TL_premiumGiftCodeOption2);
                }
            }
            final TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption3 = (TLRPC$TL_premiumGiftCodeOption) arrayList.get(0);
            for (TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption4 : arrayList) {
                int i = tLRPC$TL_premiumGiftCodeOption.users;
                int i2 = tLRPC$TL_premiumGiftCodeOption4.users;
                if (i > i2 && i2 > tLRPC$TL_premiumGiftCodeOption3.users) {
                    tLRPC$TL_premiumGiftCodeOption3 = tLRPC$TL_premiumGiftCodeOption4;
                }
            }
            String formatPluralString = LocaleController.formatPluralString("GiftMonths", tLRPC$TL_premiumGiftCodeOption3.months, new Object[0]);
            int i3 = tLRPC$TL_premiumGiftCodeOption.users;
            int i4 = tLRPC$TL_premiumGiftCodeOption3.users;
            AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
            builder.setTitle(LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i3, formatPluralString, Integer.valueOf(i4))));
            builder.setPositiveButton(LocaleController.getString("Reduce", R.string.Reduce), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    Utilities.Callback.this.run(tLRPC$TL_premiumGiftCodeOption3);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    BoostDialogs.lambda$checkReduceQuantity$13(dialogInterface, i5);
                }
            });
            builder.show();
            return true;
        }
        return false;
    }

    public static void showAbout(String str, long j, TLRPC$TL_payments_giveawayInfo tLRPC$TL_payments_giveawayInfo, TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway, Context context, Theme.ResourcesProvider resourcesProvider) {
        int i = tLRPC$TL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tLRPC$TL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().formatterGiveawayMonthDay.format(new Date(tLRPC$TL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().formatterDay.format(new Date(tLRPC$TL_payments_giveawayInfo.start_date * 1000));
        String format3 = LocaleController.getInstance().formatterGiveawayMonthDayYear.format(new Date(tLRPC$TL_payments_giveawayInfo.start_date * 1000));
        boolean z = tLRPC$TL_messageMediaGiveaway.channels.size() > 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("BoostingGiveAwayAbout", R.string.BoostingGiveAwayAbout));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksText", i, str, Integer.valueOf(i), formatPluralString)));
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str2 = tLRPC$TL_messageMediaGiveaway.prize_description;
        if (str2 != null && !str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i, str, tLRPC$TL_messageMediaGiveaway.prize_description)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tLRPC$TL_messageMediaGiveaway.only_new_subscribers) {
            if (z) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral1", i, format, Integer.valueOf(i), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, format2, format3))));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDate", i, format, Integer.valueOf(i), str, format2, format3)));
            }
        } else if (z) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral1", i, format, Integer.valueOf(i), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubText", i, format, Integer.valueOf(i), str)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tLRPC$TL_payments_giveawayInfo.participating) {
            String str3 = tLRPC$TL_payments_giveawayInfo.disallowed_country;
            if (str3 != null && !str3.isEmpty()) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayNotEligibleCountry", R.string.BoostingGiveawayNotEligibleCountry)));
            } else if (tLRPC$TL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tLRPC$TL_payments_giveawayInfo.admin_disallowed_chat_id));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligibleAdmin", R.string.BoostingGiveawayNotEligibleAdmin, chat != null ? chat.title : "")));
            } else if (tLRPC$TL_payments_giveawayInfo.joined_too_early_date != 0) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligible", R.string.BoostingGiveawayNotEligible, LocaleController.getInstance().formatterGiveawayMonthDayYear.format(new Date(tLRPC$TL_payments_giveawayInfo.joined_too_early_date * 1000)))));
            } else if (z) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayTakePartMultiPlural", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, str, format)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayTakePart", R.string.BoostingGiveawayTakePart, str, format)));
            }
        } else if (z) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayParticipantMultiPlural", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, str)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayParticipant", R.string.BoostingGiveawayParticipant, str)));
        }
        builder.setMessage(spannableStringBuilder);
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BoostDialogs.lambda$showAbout$14(dialogInterface, i2);
            }
        });
        applyDialogStyle(builder.show(), false);
    }

    public static void showAboutEnd(String str, long j, final TLRPC$TL_payments_giveawayInfoResults tLRPC$TL_payments_giveawayInfoResults, TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway, Context context, Theme.ResourcesProvider resourcesProvider) {
        String string;
        if (tLRPC$TL_messageMediaGiveaway.until_date == 0) {
            tLRPC$TL_messageMediaGiveaway.until_date = tLRPC$TL_payments_giveawayInfoResults.finish_date;
        }
        int i = tLRPC$TL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tLRPC$TL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().formatterGiveawayMonthDay.format(new Date(tLRPC$TL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().formatterDay.format(new Date(tLRPC$TL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = LocaleController.getInstance().formatterGiveawayMonthDayYear.format(new Date(tLRPC$TL_payments_giveawayInfoResults.start_date * 1000));
        boolean z = tLRPC$TL_messageMediaGiveaway.channels.size() > 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("BoostingGiveawayEnd", R.string.BoostingGiveawayEnd));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksTextEnd", i, str, Integer.valueOf(i), formatPluralString)));
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str2 = tLRPC$TL_messageMediaGiveaway.prize_description;
        if (str2 != null && !str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i, str, tLRPC$TL_messageMediaGiveaway.prize_description)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tLRPC$TL_messageMediaGiveaway.only_new_subscribers) {
            if (z) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", i, format, Integer.valueOf(i), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, format2, format3))));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateEnd", i, format, Integer.valueOf(i), str, format2, format3)));
            }
        } else if (z) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveralEnd1", i, format, Integer.valueOf(i), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tLRPC$TL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextEnd", i, format, Integer.valueOf(i), str)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i2 = tLRPC$TL_payments_giveawayInfoResults.activated_count;
        if (i2 > 0) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayUsedLinksPlural", i2, new Object[0])));
        }
        if (tLRPC$TL_payments_giveawayInfoResults.refunded) {
            String string2 = LocaleController.getString("BoostingGiveawayCanceledByPayment", R.string.BoostingGiveawayCanceledByPayment);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setGravity(17);
            textView.setText(string2);
            int i3 = Theme.key_text_RedRegular;
            textView.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Theme.multAlpha(Theme.getColor(i3, resourcesProvider), 0.1f)));
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            builder.addBottomView(textView);
            builder.setMessage(spannableStringBuilder);
            builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    BoostDialogs.lambda$showAboutEnd$15(dialogInterface, i4);
                }
            });
            applyDialogStyle(builder.show(), true);
            return;
        }
        builder.setMessage(spannableStringBuilder);
        if (tLRPC$TL_payments_giveawayInfoResults.winner) {
            string = LocaleController.getString("BoostingGiveawayYouWon", R.string.BoostingGiveawayYouWon);
            builder.setPositiveButton(LocaleController.getString("BoostingGiveawayViewPrize", R.string.BoostingGiveawayViewPrize), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    BoostDialogs.lambda$showAboutEnd$16(TLRPC$TL_payments_giveawayInfoResults.this, dialogInterface, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Close", R.string.Close), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    BoostDialogs.lambda$showAboutEnd$17(dialogInterface, i4);
                }
            });
        } else {
            string = LocaleController.getString("BoostingGiveawayYouNotWon", R.string.BoostingGiveawayYouNotWon);
            builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    BoostDialogs.lambda$showAboutEnd$18(dialogInterface, i4);
                }
            });
        }
        EffectsTextView effectsTextView = new EffectsTextView(context);
        NotificationCenter.listenEmojiLoading(effectsTextView);
        effectsTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        effectsTextView.setTextSize(1, 14.0f);
        effectsTextView.setGravity(17);
        effectsTextView.setText(string);
        effectsTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_profile_actionPressedBackground, resourcesProvider)));
        effectsTextView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f));
        builder.aboveMessageView(effectsTextView);
        applyDialogStyle(builder.show(), false);
    }

    public static void lambda$showAboutEnd$16(TLRPC$TL_payments_giveawayInfoResults tLRPC$TL_payments_giveawayInfoResults, DialogInterface dialogInterface, int i) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        GiftInfoBottomSheet.show(lastFragment, tLRPC$TL_payments_giveawayInfoResults.gift_code_slug);
    }

    public static void applyDialogStyle(AlertDialog alertDialog, boolean z) {
        alertDialog.setTextSize(20, 14);
        alertDialog.setMessageLineSpacing(2.5f);
        if (z) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) alertDialog.getButtonsLayout().getLayoutParams()).topMargin = AndroidUtilities.dp(-14.0f);
    }

    public static void showPrivateChannelAlert(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final Runnable runnable2) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("BoostingGiveawayPrivateChannel", R.string.BoostingGiveawayPrivateChannel));
        builder.setMessage(LocaleController.getString("BoostingGiveawayPrivateChannelWarning", R.string.BoostingGiveawayPrivateChannelWarning));
        builder.setPositiveButton(LocaleController.getString("Add", R.string.Add), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BoostDialogs.lambda$showPrivateChannelAlert$19(atomicBoolean, runnable2, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BoostDialogs.lambda$showPrivateChannelAlert$20(dialogInterface, i);
            }
        });
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BoostDialogs.lambda$showPrivateChannelAlert$21(atomicBoolean, runnable, dialogInterface);
            }
        });
        builder.show();
    }

    public static void lambda$showPrivateChannelAlert$19(AtomicBoolean atomicBoolean, Runnable runnable, DialogInterface dialogInterface, int i) {
        atomicBoolean.set(true);
        runnable.run();
    }

    public static void lambda$showPrivateChannelAlert$21(AtomicBoolean atomicBoolean, Runnable runnable, DialogInterface dialogInterface) {
        if (atomicBoolean.get()) {
            return;
        }
        runnable.run();
    }

    public static void openGiveAwayStatusDialog(MessageObject messageObject, final Browser.Progress progress, final Context context, final Theme.ResourcesProvider resourcesProvider) {
        final TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        progress.init();
        progress.onCancel(new Runnable() {
            @Override
            public final void run() {
                atomicBoolean.set(true);
            }
        });
        TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGiveawayResults) {
            TLRPC$TL_messageMediaGiveawayResults tLRPC$TL_messageMediaGiveawayResults = (TLRPC$TL_messageMediaGiveawayResults) tLRPC$MessageMedia;
            TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway2 = new TLRPC$TL_messageMediaGiveaway();
            tLRPC$TL_messageMediaGiveaway2.prize_description = tLRPC$TL_messageMediaGiveawayResults.prize_description;
            tLRPC$TL_messageMediaGiveaway2.months = tLRPC$TL_messageMediaGiveawayResults.months;
            tLRPC$TL_messageMediaGiveaway2.quantity = tLRPC$TL_messageMediaGiveawayResults.winners_count + tLRPC$TL_messageMediaGiveawayResults.unclaimed_count;
            tLRPC$TL_messageMediaGiveaway2.only_new_subscribers = tLRPC$TL_messageMediaGiveawayResults.only_new_subscribers;
            tLRPC$TL_messageMediaGiveaway2.until_date = tLRPC$TL_messageMediaGiveawayResults.until_date;
            tLRPC$TL_messageMediaGiveaway = tLRPC$TL_messageMediaGiveaway2;
        } else {
            tLRPC$TL_messageMediaGiveaway = (TLRPC$TL_messageMediaGiveaway) tLRPC$MessageMedia;
        }
        final String giveawayCreatorName = getGiveawayCreatorName(messageObject);
        final long j = 1000 * messageObject.messageOwner.date;
        BoostRepository.getGiveawayInfo(messageObject, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostDialogs.lambda$openGiveAwayStatusDialog$23(atomicBoolean, progress, giveawayCreatorName, j, tLRPC$TL_messageMediaGiveaway, context, resourcesProvider, (TLRPC$payments_GiveawayInfo) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostDialogs.lambda$openGiveAwayStatusDialog$24(atomicBoolean, progress, (TLRPC$TL_error) obj);
            }
        });
    }

    public static void lambda$openGiveAwayStatusDialog$23(AtomicBoolean atomicBoolean, Browser.Progress progress, String str, long j, TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC$payments_GiveawayInfo tLRPC$payments_GiveawayInfo) {
        if (atomicBoolean.get()) {
            return;
        }
        progress.end();
        if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfo) {
            showAbout(str, j, (TLRPC$TL_payments_giveawayInfo) tLRPC$payments_GiveawayInfo, tLRPC$TL_messageMediaGiveaway, context, resourcesProvider);
        } else if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfoResults) {
            showAboutEnd(str, j, (TLRPC$TL_payments_giveawayInfoResults) tLRPC$payments_GiveawayInfo, tLRPC$TL_messageMediaGiveaway, context, resourcesProvider);
        }
    }

    public static void lambda$openGiveAwayStatusDialog$24(AtomicBoolean atomicBoolean, Browser.Progress progress, TLRPC$TL_error tLRPC$TL_error) {
        if (atomicBoolean.get()) {
            return;
        }
        progress.end();
    }

    private static String getGiveawayCreatorName(MessageObject messageObject) {
        if (messageObject == null) {
            return "";
        }
        String forwardedName = messageObject.getForwardedName();
        if (forwardedName == null) {
            TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            return chat != null ? chat.title : "";
        }
        return forwardedName;
    }

    public static void showBulletinAbout(final MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        BoostRepository.getGiveawayInfo(messageObject, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostDialogs.lambda$showBulletinAbout$26(MessageObject.this, (TLRPC$payments_GiveawayInfo) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BoostDialogs.lambda$showBulletinAbout$27((TLRPC$TL_error) obj);
            }
        });
    }

    public static void lambda$showBulletinAbout$26(MessageObject messageObject, final TLRPC$payments_GiveawayInfo tLRPC$payments_GiveawayInfo) {
        TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway;
        TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGiveawayResults) {
            TLRPC$TL_messageMediaGiveawayResults tLRPC$TL_messageMediaGiveawayResults = (TLRPC$TL_messageMediaGiveawayResults) tLRPC$MessageMedia;
            tLRPC$TL_messageMediaGiveaway = new TLRPC$TL_messageMediaGiveaway();
            tLRPC$TL_messageMediaGiveaway.prize_description = tLRPC$TL_messageMediaGiveawayResults.prize_description;
            tLRPC$TL_messageMediaGiveaway.months = tLRPC$TL_messageMediaGiveawayResults.months;
            tLRPC$TL_messageMediaGiveaway.quantity = tLRPC$TL_messageMediaGiveawayResults.winners_count + tLRPC$TL_messageMediaGiveawayResults.unclaimed_count;
            tLRPC$TL_messageMediaGiveaway.only_new_subscribers = tLRPC$TL_messageMediaGiveawayResults.only_new_subscribers;
            tLRPC$TL_messageMediaGiveaway.until_date = tLRPC$TL_messageMediaGiveawayResults.until_date;
        } else {
            tLRPC$TL_messageMediaGiveaway = (TLRPC$TL_messageMediaGiveaway) tLRPC$MessageMedia;
        }
        final TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway2 = tLRPC$TL_messageMediaGiveaway;
        final long j = messageObject.messageOwner.date * 1000;
        final BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        final String giveawayCreatorName = getGiveawayCreatorName(messageObject);
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(lastFragment.getParentActivity(), lastFragment.getResourceProvider());
        if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfoResults) {
            lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
            lottieLayout.textView.setText(LocaleController.getString("BoostingGiveawayShortStatusEnded", R.string.BoostingGiveawayShortStatusEnded));
        } else if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfo) {
            if (((TLRPC$TL_payments_giveawayInfo) tLRPC$payments_GiveawayInfo).participating) {
                lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
                lottieLayout.textView.setText(LocaleController.getString("BoostingGiveawayShortStatusParticipating", R.string.BoostingGiveawayShortStatusParticipating));
            } else {
                lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
                lottieLayout.textView.setText(LocaleController.getString("BoostingGiveawayShortStatusNotParticipating", R.string.BoostingGiveawayShortStatusNotParticipating));
            }
        }
        lottieLayout.textView.setSingleLine(false);
        lottieLayout.textView.setMaxLines(2);
        lottieLayout.setButton(new Bulletin.UndoButton(lastFragment.getParentActivity(), true, lastFragment.getResourceProvider()).setText(LocaleController.getString("LearnMore", R.string.LearnMore)).setUndoAction(new Runnable() {
            @Override
            public final void run() {
                BoostDialogs.lambda$showBulletinAbout$25(TLRPC$payments_GiveawayInfo.this, giveawayCreatorName, j, tLRPC$TL_messageMediaGiveaway2, lastFragment);
            }
        }));
        Bulletin.make(lastFragment, lottieLayout, 2750).show();
    }

    public static void lambda$showBulletinAbout$25(TLRPC$payments_GiveawayInfo tLRPC$payments_GiveawayInfo, String str, long j, TLRPC$TL_messageMediaGiveaway tLRPC$TL_messageMediaGiveaway, BaseFragment baseFragment) {
        if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfo) {
            showAbout(str, j, (TLRPC$TL_payments_giveawayInfo) tLRPC$payments_GiveawayInfo, tLRPC$TL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        } else if (tLRPC$payments_GiveawayInfo instanceof TLRPC$TL_payments_giveawayInfoResults) {
            showAboutEnd(str, j, (TLRPC$TL_payments_giveawayInfoResults) tLRPC$payments_GiveawayInfo, tLRPC$TL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        }
    }

    public static void showMoreBoostsNeeded(long j, final BottomSheet bottomSheet) {
        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), lastFragment.getResourceProvider());
        builder.setTitle(LocaleController.getString("BoostingMoreBoostsNeeded", R.string.BoostingMoreBoostsNeeded));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGetMoreBoostByGiftingCount", BoostRepository.boostsPerSentGift(), chat.title)));
        builder.setNegativeButton(LocaleController.getString("GiftPremium", R.string.GiftPremium), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BoostDialogs.lambda$showMoreBoostsNeeded$28(BottomSheet.this, dialogInterface, i);
            }
        });
        builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BoostDialogs.lambda$showMoreBoostsNeeded$29(dialogInterface, i);
            }
        });
        builder.show();
    }

    public static void lambda$showMoreBoostsNeeded$28(BottomSheet bottomSheet, DialogInterface dialogInterface, int i) {
        bottomSheet.dismiss();
        UserSelectorBottomSheet.open();
    }

    public static void showFloodWait(int i) {
        String str;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (i < 60) {
            str = LocaleController.formatPluralString("Seconds", i, new Object[0]);
        } else if (i < 3600) {
            str = LocaleController.formatPluralString("Minutes", i / 60, new Object[0]);
        } else {
            int i2 = (i / 60) / 60;
            if (i2 > 2) {
                str = LocaleController.formatPluralString("Hours", i2, new Object[0]);
            } else {
                str = LocaleController.formatPluralString("Hours", i2, new Object[0]) + " " + LocaleController.formatPluralString("Minutes", i % 60, new Object[0]);
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), lastFragment.getResourceProvider());
        builder.setTitle(LocaleController.getString("CantBoostTooOften", R.string.CantBoostTooOften));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("CantBoostTooOftenDescription", R.string.CantBoostTooOftenDescription, str)));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public static void showStartGiveawayDialog(final Runnable runnable) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), lastFragment.getResourceProvider());
        builder.setTitle(LocaleController.getString("BoostingStartGiveawayConfirmTitle", R.string.BoostingStartGiveawayConfirmTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("BoostingStartGiveawayConfirmText", R.string.BoostingStartGiveawayConfirmText)));
        builder.setPositiveButton(LocaleController.getString("Start", R.string.Start), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}
