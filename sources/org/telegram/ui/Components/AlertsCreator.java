package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda80;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.BlurSettingsBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda426;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Gifts.AuctionJoinSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda14;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileNotificationsActivity;
import org.telegram.ui.SelectChatUserSheet;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda74;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.TooManyCommunitiesActivity;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;

public class AlertsCreator {
    private static final int FMT_DATE_MONTH_PICKER_HALF_SIZE = 120;
    public static final int NEW_DENY_DIALOG_TOP_ICON_SIZE = 52;
    public static final int PERMISSIONS_REQUEST_TOP_ICON_SIZE = 72;
    public static final int REPORT_TYPE_CHILD_ABUSE = 2;
    public static final int REPORT_TYPE_FAKE_ACCOUNT = 6;
    public static final int REPORT_TYPE_ILLEGAL_DRUGS = 3;
    public static final int REPORT_TYPE_OTHER = 100;
    public static final int REPORT_TYPE_PERSONAL_DETAILS = 4;
    public static final int REPORT_TYPE_PORNOGRAPHY = 5;
    public static final int REPORT_TYPE_SPAM = 0;
    public static final int REPORT_TYPE_VIOLENCE = 1;
    public static final int SUGGEST_DATE_PICKER_MODE_ACCEPT = 1;
    public static final int SUGGEST_DATE_PICKER_MODE_EDIT = 0;
    private static final Pattern URL_PATTERN = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public interface AccountSelectDelegate {
        void didSelectAccount(int i);
    }

    public interface BlockDialogCallback {
        void run(boolean z, boolean z2);
    }

    public interface DatePickerDelegate {
        void didSelectDate(int i, int i2, int i3);
    }

    public interface FormattedDatePickerDelegate {
        void didSelectDate(int i, int i2);
    }

    public interface PaymentAlertDelegate {
        void didPressedNewCard();
    }

    public static class ScheduleDatePickerColors {
        public final int backgroundColor;
        public final int buttonBackgroundColor;
        public final int buttonBackgroundPressedColor;
        public final int buttonTextColor;
        public final int iconColor;
        public final int iconSelectorColor;
        public final int subMenuBackgroundColor;
        public final int subMenuSelectorColor;
        public final int subMenuTextColor;
        public final int textColor;

        private ScheduleDatePickerColors() {
            this((Theme.ResourcesProvider) null);
        }

        public ScheduleDatePickerColors(Theme.ResourcesProvider resourcesProvider) {
            int color;
            int color2;
            int color3;
            int color4;
            int color5;
            int color6;
            int color7;
            int color8;
            int color9;
            int color10;
            if (resourcesProvider != null) {
                color = resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack);
            } else {
                color = Theme.getColor(null, Theme.key_dialogTextBlack, false);
            }
            int i = color;
            if (resourcesProvider != null) {
                color2 = resourcesProvider.getColorOrDefault(Theme.key_dialogBackground);
            } else {
                color2 = Theme.getColor(null, Theme.key_dialogBackground, false);
            }
            int i2 = color2;
            if (resourcesProvider != null) {
                color3 = resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
            } else {
                color3 = Theme.getColor(null, Theme.key_sheet_other, false);
            }
            int i3 = color3;
            if (resourcesProvider != null) {
                color4 = resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector);
            } else {
                color4 = Theme.getColor(null, Theme.key_player_actionBarSelector, false);
            }
            int i4 = color4;
            if (resourcesProvider != null) {
                color5 = resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
            } else {
                color5 = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
            }
            int i5 = color5;
            if (resourcesProvider != null) {
                color6 = resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
            } else {
                color6 = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
            }
            int i6 = color6;
            if (resourcesProvider != null) {
                color7 = resourcesProvider.getColorOrDefault(Theme.key_listSelector);
            } else {
                color7 = Theme.getColor(null, Theme.key_listSelector, false);
            }
            int i7 = color7;
            if (resourcesProvider != null) {
                color8 = resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText);
            } else {
                color8 = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
            }
            int i8 = color8;
            if (resourcesProvider != null) {
                color9 = resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton);
            } else {
                color9 = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            }
            int i9 = color9;
            if (resourcesProvider != null) {
                color10 = resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed);
            } else {
                color10 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            }
            this(i, i2, i3, i4, i5, i6, i7, i8, i9, color10);
        }

        public ScheduleDatePickerColors(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this(i, i2, i3, i4, i5, i6, i7, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), Theme.getColor(null, Theme.key_featuredStickers_addButton, false), Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false));
        }

        public ScheduleDatePickerColors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.textColor = i;
            this.backgroundColor = i2;
            this.iconColor = i3;
            this.iconSelectorColor = i4;
            this.subMenuTextColor = i5;
            this.subMenuBackgroundColor = i6;
            this.subMenuSelectorColor = i7;
            this.buttonTextColor = i8;
            this.buttonBackgroundColor = i9;
            this.buttonBackgroundPressedColor = i10;
        }
    }

    public interface ScheduleDatePickerDelegate {
        void didSelectDate(boolean z, int i, int i2);
    }

    public interface SoundFrequencyDelegate {
        void didSelectValues(int i, int i2);
    }

    public interface StatusUntilDatePickerDelegate {
        void didSelectDate(int i);
    }

    public static void checkCalendarDate(long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i5 = calendar.get(1);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        numberPicker3.setMaxValue(i5);
        numberPicker3.setMinValue(i2);
        int value = numberPicker3.getValue();
        numberPicker2.setMaxValue(value == i5 ? i6 : 11);
        numberPicker2.setMinValue(value == i2 ? i3 : 0);
        int value2 = numberPicker2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i5 && value2 == i6) {
            actualMaximum = Math.min(i7, actualMaximum);
        }
        numberPicker.setMaxValue(actualMaximum);
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        numberPicker.setMinValue(i);
    }

    public static long checkFormattedDateInput(ButtonWithCounterView buttonWithCounterView, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((numberPicker2.getValue() - 120) / 12) + i2;
        int value2 = (numberPicker2.getValue() - 120) % 12;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, value2);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(calendar.getActualMaximum(5));
        int value3 = numberPicker.getValue();
        int value4 = numberPicker3.getValue();
        int value5 = numberPicker4.getValue();
        calendar.set(5, value3);
        calendar.set(11, value4);
        calendar.set(12, value5);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (buttonWithCounterView != null) {
            if (value3 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            buttonWithCounterView.setText(LocaleController.getInstance().getFormatterScheduleSend(i + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    private static boolean checkInternalBotApp(String str) {
        return Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$");
    }

    private static void checkMuteForButton(NumberPicker numberPicker, NumberPicker numberPicker2, TextView textView, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (numberPicker.getValue() != 0) {
            sb.append(numberPicker.getValue());
            sb.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (numberPicker2.getValue() != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(numberPicker2.getValue());
            sb.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (sb.length() == 0) {
            textView.setText(LocaleController.getString(R.string.ChooseTimeForMute));
            if (textView.isEnabled()) {
                textView.setEnabled(false);
                if (z) {
                    textView.animate().alpha(0.5f);
                    return;
                } else {
                    textView.setAlpha(0.5f);
                    return;
                }
            }
            return;
        }
        textView.setText(LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString()));
        if (textView.isEnabled()) {
            return;
        }
        textView.setEnabled(true);
        if (z) {
            textView.animate().alpha(1.0f);
        } else {
            textView.setAlpha(1.0f);
        }
    }

    private static void checkPickerDate(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = 1;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        numberPicker3.setMinValue(i2);
        int value = numberPicker3.getValue();
        numberPicker2.setMinValue(value == i2 ? i3 : 0);
        int value2 = numberPicker2.getValue();
        if (value == i2 && value2 == i3) {
            i = i4;
        }
        numberPicker.setMinValue(i);
    }

    public static void checkPollCloseCustomDeadline(TextView textView, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        int value3 = numberPicker3.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (textView != null) {
            textView.setText(formatPollCloseCustomDeadline((int) ((timeInMillis - jCurrentTimeMillis) / 1000)));
        }
    }

    public static void checkRestrictedInviteUsers(int i, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i2);
            i2++;
            TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
            if (tL_messages_invitedUsers.updates == null) {
                user = null;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messages_invitedUsers.updates.users.size()) {
                    user = null;
                    break;
                }
                user = tL_messages_invitedUsers.updates.users.get(i3);
                if (user.id == tL_missingInvitee2.user_id) {
                    break;
                } else {
                    i3++;
                }
            }
            if (user == null) {
                user = MessagesController.getInstance(i).getUser(Long.valueOf(tL_missingInvitee2.user_id));
            }
            if (user != null) {
                arrayList.add(user);
                if (tL_missingInvitee2.premium_required_for_pm) {
                    arrayList2.add(Long.valueOf(user.id));
                }
                if (tL_missingInvitee2.premium_would_allow_invite) {
                    arrayList3.add(Long.valueOf(user.id));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(i, chat, arrayList, arrayList2, arrayList3), 200L);
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        return checkScheduleDate(textView, textView2, 0L, 0L, i, numberPicker, numberPicker2, numberPicker3);
    }

    public static boolean checkSlowMode(Context context, int i, long j, boolean z) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j) || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i).loadChatInfo(chat.id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        createSimpleAlert(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).show();
        return true;
    }

    public static AlertDialog createAccountSelectDialog(Activity activity, AccountSelectDelegate accountSelectDelegate) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        Runnable dismissRunnable = builder.getDismissRunnable();
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).getCurrentUser() != null) {
                AccountSelectCell accountSelectCell = new AccountSelectCell(activity, false);
                accountSelectCell.accountNumber = i;
                TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                AvatarDrawable avatarDrawable = accountSelectCell.avatarDrawable;
                avatarDrawable.setInfo(i, currentUser);
                accountSelectCell.textView.setText(ContactsController.formatName(currentUser.first_name, currentUser.last_name));
                BackupImageView backupImageView = accountSelectCell.imageView;
                backupImageView.getImageReceiver().setCurrentAccount(i);
                backupImageView.setForUserOrChat(currentUser, avatarDrawable);
                accountSelectCell.checkImageView.setVisibility(4);
                accountSelectCell.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                accountSelectCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                linearLayout.addView(accountSelectCell, LayoutHelper.createLinear(-1, 50));
                accountSelectCell.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(alertDialogArr, dismissRunnable, accountSelectDelegate, 7));
            }
        }
        builder.setTitle(LocaleController.getString(R.string.SelectAccount));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        return alertDialogCreate;
    }

    public static Dialog createApkRestrictedDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        return new AlertDialog.Builder(context, 0, resourcesProvider).setMessage(LocaleController.getString(R.string.ApkRestricted)).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertsCreator$$ExternalSyntheticLambda8(context, 1)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static BottomSheet.Builder createAutoDeleteDatePickerDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        int i2 = 1;
        char c = 1;
        char c2 = 1;
        boolean z = false;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i3) {
                int i4 = iArr[i3];
                if (i4 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
                }
                if (i4 < 10080) {
                    return LocaleController.formatPluralString("Days", i4 / 1440, new Object[0]);
                }
                if (i4 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i4 / 1440, new Object[0]);
                }
                return i4 < 525600 ? LocaleController.formatPluralString("Months", i4 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i4 * 5) / 31) * 1440, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda71(i2, iArr));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i5 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i5);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                this.ignoreLayout = false;
                super.onMeasure(i3, i4);
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
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, c2 == true ? 1 : 0, c == true ? 1 : 0, z) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 1.0f));
        animatedTextView.setPadding(0, 0, 0, 0);
        animatedTextView.setGravity(17);
        animatedTextView.setTextColor(scheduleDatePickerColors.buttonTextColor);
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int i3 = scheduleDatePickerColors.buttonBackgroundColor;
        int i4 = scheduleDatePickerColors.buttonBackgroundPressedColor;
        animatedTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i3, i4, i4));
        linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        animatedTextView.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        numberPicker.setOnValueChangedListener(new EmojiView$$ExternalSyntheticLambda21(animatedTextView, 19));
        animatedTextView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda74(iArr, numberPicker, scheduleDatePickerDelegate, builder, 1));
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static Dialog createBackgroundActivityDialog(Context context) {
        int i;
        AlertDialog.Builder title = new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.AllowBackgroundActivity));
        if (OneUIUtilities.isOneUI()) {
            i = Build.VERSION.SDK_INT >= 31 ? R.string.AllowBackgroundActivityInfoOneUIAboveS : R.string.AllowBackgroundActivityInfoOneUIBelowS;
        } else {
            i = R.string.AllowBackgroundActivityInfo;
        }
        return title.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(i))).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertsCreator$$ExternalSyntheticLambda8(context, 0)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda9(0)).create();
    }

    public static AlertDialog.Builder createBackgroundLocationPermissionDialog(Activity activity, TLRPC.User user, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (activity == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        String res = AndroidUtilities.readRes(themeInfo.isDark() ? R.raw.permission_map_dark : R.raw.permission_map);
        Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
        if (themeInfo2 == null) {
            themeInfo2 = Theme.defaultTheme;
        }
        String res2 = AndroidUtilities.readRes(themeInfo2.isDark() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(res));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(res2));
        frameLayout.addView(view2, LayoutHelper.createFrame(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(26.0f));
        backupImageView.setForUserOrChat(user, new AvatarDrawable(user));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        builder.setTopView(frameLayout);
        builder.setTopViewAspectRatio(0.37820512f);
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation)));
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertsCreator$$ExternalSyntheticLambda100(activity, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertsCreator$$ExternalSyntheticLambda7(1, runnable));
        return builder;
    }

    public static BottomSheet.Builder createBirthdayPickerDialog(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback<TL_account.TL_birthday> callback, Runnable runnable, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        float f;
        if (context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(24.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
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
        textView.setText(str);
        zzkr.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        final int i2 = calendar.get(5);
        final int i3 = calendar.get(2);
        final int i4 = calendar.get(1);
        final int i5 = i4 + 1;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createBirthdayPickerDialog$143(numberPicker3, i5, numberPicker, numberPicker2, i4, i3, i2);
            }
        };
        System.currentTimeMillis();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(6));
        EmojiView$$ExternalSyntheticLambda21 emojiView$$ExternalSyntheticLambda21 = new EmojiView$$ExternalSyntheticLambda21(runnable2, 18);
        numberPicker.setOnScrollListener(emojiView$$ExternalSyntheticLambda21);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(7));
        numberPicker2.setOnScrollListener(emojiView$$ExternalSyntheticLambda21);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i5);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new AlertsCreator$$ExternalSyntheticLambda131(i5, 0));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker3.setOnScrollListener(emojiView$$ExternalSyntheticLambda21);
        if (tL_birthday != null) {
            numberPicker.setValue(tL_birthday.day);
            numberPicker2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                numberPicker3.setValue(tL_birthday.year);
            } else {
                numberPicker3.setValue(i5);
            }
        } else {
            numberPicker.setValue(calendar.get(5));
            numberPicker2.setValue(calendar.get(2));
            numberPicker3.setValue(i5);
        }
        runnable2.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setGravity(17);
            frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-2, -2, 17));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            int i6 = UserConfig.selectedAccount;
            EmojiView$$ExternalSyntheticLambda9 emojiView$$ExternalSyntheticLambda9 = new EmojiView$$ExternalSyntheticLambda9(i6, linksTextView, 4);
            emojiView$$ExternalSyntheticLambda9.run();
            f = 8.0f;
            NotificationCenter.getInstance(i6).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new PasscodeView$$ExternalSyntheticLambda8(emojiView$$ExternalSyntheticLambda9, 2));
            ContactsController.getInstance(i6).loadPrivacySettings();
        } else {
            f = 8.0f;
        }
        if (z) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.DateOfBirthHideYear), false);
            buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda134(numberPicker3, i5, runnable2, 0));
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int iDp = AndroidUtilities.dp(f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        ScaleStateListAnimator.apply(textView2);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
        textView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda14(numberPicker, numberPicker2, numberPicker3, i5, builder, callback));
        if (z2) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.BirthdayRemove), false);
            buttonWithCounterView2.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(11, builder, callback));
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 83, 16, 4, 16, 16));
        }
        bottomSheet.customView = linearLayout;
        return builder;
    }

    public static void createBlockDialogAlert(BaseFragment baseFragment, int i, boolean z, TLRPC.User user, BlockDialogCallback blockDialogCallback) {
        String string;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (i == 1 && user == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[2];
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        if (i == 1) {
            String name = ContactsController.formatName(user.first_name, user.last_name);
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, name));
            string = LocaleController.getString(R.string.BlockUser);
            SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUserMessage", R.string.BlockUserMessage, new Object[]{name}, builder);
        } else {
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", i, new Object[0])));
            string = LocaleController.getString(R.string.BlockUsers);
            SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUsersMessage", R.string.BlockUsersMessage, new Object[]{LocaleController.formatPluralString("UsersCount", i, new Object[0])}, builder);
        }
        boolean[] zArr = {true, true};
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            if (i2 != 0 || z) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1);
                checkBoxCellArr[i2] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (i2 == 0) {
                    checkBoxCellArr[i2].setText(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                } else {
                    checkBoxCellArr[i2].setText(LocaleController.getString(i == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                }
                checkBoxCellArr[i2].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[i2], LayoutHelper.createLinear(-1, 48));
                checkBoxCellArr[i2].setOnClickListener(new ReportAlert$$ExternalSyntheticLambda1(zArr, i2, 3));
            }
            i2++;
        }
        builder.setPositiveButton(string, new AIEditorAlert$$ExternalSyntheticLambda34(10, blockDialogCallback, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void createBotLaunchAlert(BaseFragment baseFragment, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = baseFragment.getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(linksTextView);
        linksTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        simpleTextView.setTextSize(20);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(user.first_name);
        if (user.scam) {
            simpleTextView.setRightDrawable(Theme.dialogs_scamDrawable);
        } else if (user.fake) {
            simpleTextView.setRightDrawable(Theme.dialogs_fakeDrawable);
        } else if (user.verified) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedCheck, false), mode));
            simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
        }
        TextView textView = new TextView(context);
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView, Theme.getColor(null, Theme.key_dialogTextBlue, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda10(user, baseFragment, builder, 1));
        SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan.setTopOffset(1);
        coloredImageSpan.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf.setSpan(coloredImageSpan, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
        textView.setText(spannableStringValueOf);
        boolean z = LocaleController.isRTL;
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 0.0f, z ? 76 : 21, 0.0f));
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 24.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            avatarDrawable.setScaleSize(0.8f);
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, user);
        } else {
            avatarDrawable.setScaleSize(1.0f);
            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertsCreator$$ExternalSyntheticLambda7(2, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate, false, new AlertsCreator$$ExternalSyntheticLambda20(1, runnable2));
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda13(context, alertDialogCreate, 1)));
    }

    public static BottomSheet.Builder createCalendarPickerDialog(Context context, final long j, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(24.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
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
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        zzkr.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(18));
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                NumberPicker numberPicker5 = numberPicker2;
                NumberPicker numberPicker6 = numberPicker3;
                AlertsCreator.checkCalendarDate(j, numberPicker, numberPicker5, numberPicker6);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(19));
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i2);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(20));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        numberPicker.setValue(31);
        numberPicker2.setValue(12);
        numberPicker3.setValue(i2);
        checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet.Builder builder2 = builder;
                AlertsCreator.lambda$createCalendarPickerDialog$196(j, numberPicker, numberPicker2, numberPicker3, calendar, intCallback, builder2, view);
            }
        });
        bottomSheet.customView = linearLayout;
        return builder;
    }

    public static void createCallDialogAlert(BaseFragment baseFragment, TLRPC.User user, boolean z) {
        String string;
        String string2;
        if (baseFragment == null || baseFragment.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(baseFragment.getCurrentAccount()).getClientUserId() == user.id) {
            return;
        }
        baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            string2 = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            string2 = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        TextView textView = new TextView(parentActivity) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(string2));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        avatarDrawable.setScaleSize(1.0f);
        avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
        BackupImageView backupImageView = new BackupImageView(parentActivity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        backupImageView.setForUserOrChat(user, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(string);
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        baseFragment.showDialog(new AlertDialog.Builder(parentActivity, 0, null).setView(frameLayout).setPositiveButton(LocaleController.getString(R.string.Call), new AlertsCreator$$ExternalSyntheticLambda136(baseFragment, user, z)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
    }

    public static void createChangeBioAlert(String str, final long j, final Context context, int i) {
        int i2 = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(j > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        builder.setMessage(LocaleController.getString(j > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        if (j < 0) {
            long j2 = -j;
            if (MessagesController.getInstance(i).getChatFull(j2) == null) {
                MessagesController.getInstance(i).loadFullChat(j2, ConnectionsManager.generateClassGuid(), true);
            }
        }
        final NumberTextView numberTextView = new NumberTextView(context);
        EditText editText = new EditText(context);
        int i3 = Theme.key_voipgroup_actionBarItems;
        editText.setTextColor(Theme.getColor(null, i3, false));
        editText.setHint(LocaleController.getString(j > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(Theme.createEditTextDrawable(context));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        final int i4 = j > 0 ? 70 : 255;
        editText.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(i4) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
                CharSequence charSequenceFilter = super.filter(charSequence, i5, i6, spanned, i7, i8);
                if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length()) {
                    Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(numberTextView);
                }
                return charSequenceFilter;
            }
        }});
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, LayoutHelper.createFrame(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                int iCodePointCount = i4 - Character.codePointCount(editable, 0, editable.length());
                if (iCodePointCount >= 30) {
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                    return;
                }
                NumberTextView numberTextView2 = numberTextView;
                numberTextView2.setNumber(iCodePointCount, numberTextView2.getVisibility() == 0);
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
        editText.setText(str);
        editText.setSelection(editText.getText().toString().length());
        builder.setView(frameLayout);
        final VoIPService$$ExternalSyntheticLambda80 voIPService$$ExternalSyntheticLambda80 = new VoIPService$$ExternalSyntheticLambda80(editText, i, j, 1);
        builder.setPositiveButton(LocaleController.getString(R.string.Save), voIPService$$ExternalSyntheticLambda80);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda108(editText, i2));
        frameLayout.addView(editText, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.showKeyboard(editText);
        final AlertDialog alertDialogCreate = builder.create();
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                return AlertsCreator.lambda$createChangeBioAlert$89(j, alertDialogCreate, voIPService$$ExternalSyntheticLambda80, textView, i5, keyEvent);
            }
        });
        alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(null, i3, false));
    }

    public static void createChangeNameAlert(long j, Context context, int i) {
        String str;
        String str2;
        EditText editText;
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = MessagesController.getInstance(i).getChat(Long.valueOf(-j)).title;
            str2 = null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(j > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        EditText editText2 = new EditText(context);
        int i2 = Theme.key_voipgroup_actionBarItems;
        editText2.setTextColor(Theme.getColor(null, i2, false));
        editText2.setTextSize(1, 16.0f);
        editText2.setMaxLines(1);
        editText2.setLines(1);
        editText2.setSingleLine(true);
        editText2.setGravity(LocaleController.isRTL ? 5 : 3);
        editText2.setInputType(49152);
        editText2.setImeOptions(j > 0 ? 5 : 6);
        editText2.setHint(LocaleController.getString(j > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText2.setBackground(Theme.createEditTextDrawable(context));
        editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText2.requestFocus();
        if (j > 0) {
            editText = new EditText(context);
            editText.setTextColor(Theme.getColor(null, i2, false));
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(Theme.createEditTextDrawable(context));
            editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        } else {
            editText = null;
        }
        AndroidUtilities.showKeyboard(editText2);
        linearLayout.addView(editText2, LayoutHelper.createLinear(-1, -2, 0, 23, 12, 23, 21));
        if (editText != null) {
            linearLayout.addView(editText, LayoutHelper.createLinear(-1, -2, 0, 23, 12, 23, 21));
        }
        editText2.setText(str);
        editText2.setSelection(editText2.getText().toString().length());
        if (editText != null) {
            editText.setText(str2);
            editText.setSelection(editText.getText().toString().length());
        }
        builder.setView(linearLayout);
        AlertDialog.OnButtonClickListener botVerifySheet$$ExternalSyntheticLambda0 = new BotVerifySheet$$ExternalSyntheticLambda0(editText2, j, i, editText);
        builder.setPositiveButton(LocaleController.getString(R.string.Save), botVerifySheet$$ExternalSyntheticLambda0);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda43(0, editText2, editText));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(null, i2, false));
        AlertsCreator$$ExternalSyntheticLambda44 alertsCreator$$ExternalSyntheticLambda44 = new AlertsCreator$$ExternalSyntheticLambda44(0, alertDialogCreate, botVerifySheet$$ExternalSyntheticLambda0);
        if (editText != null) {
            editText.setOnEditorActionListener(alertsCreator$$ExternalSyntheticLambda44);
        } else {
            editText2.setOnEditorActionListener(alertsCreator$$ExternalSyntheticLambda44);
        }
    }

    public static void createClearDaysDialogAlert(BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        boolean[] zArr;
        String string;
        TextView textView;
        int iDp;
        int iDp2;
        long j;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        TextView textView2 = new TextView(parentActivity) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), checkBoxCellArr[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setView(frameLayout);
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView3.setTextSize(1, 20.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setLines(1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i == -1) {
            textView3.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else {
                if (z) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i2 = 1;
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                    }
                    zArr = new boolean[i2];
                    zArr[0] = false;
                    if (chat != null && z && ChatObject.isPublic(chat)) {
                        zArr[0] = i2;
                    }
                    if (user != null) {
                        j = user.id;
                        if (j == clientUserId && j != 489000 && !ChatObject.isMonoForum(chat)) {
                            CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                            checkBoxCellArr[0] = checkBoxCell;
                            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            if (chat != null) {
                                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            checkBoxCellArr[0].setChecked(false, false);
                            checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
                        } else if (chat != null && z && !ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.isMonoForum(chat)) {
                            CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                            checkBoxCellArr[0] = checkBoxCell3;
                            checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            if (chat != null) {
                                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            CheckBoxCell checkBoxCell4 = checkBoxCellArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            checkBoxCell4.setPadding(iDp, 0, iDp2, 0);
                            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            checkBoxCellArr[0].setChecked(false, false);
                            checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
                        }
                    } else if (chat != null) {
                        CheckBoxCell checkBoxCell5 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                        checkBoxCellArr[0] = checkBoxCell5;
                        checkBoxCell5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (chat != null) {
                            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                        } else {
                            checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        }
                        CheckBoxCell checkBoxCell6 = checkBoxCellArr[0];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        checkBoxCell6.setPadding(iDp, 0, iDp2, 0);
                        frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCellArr[0].setChecked(false, false);
                        checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
                    }
                    string = LocaleController.getString(R.string.Delete);
                    if (chat != null && z && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString(R.string.ClearForAll);
                    }
                    builder.setPositiveButton(string, new AlertsCreator$$ExternalSyntheticLambda77(booleanCallback, zArr, 1));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog alertDialogCreate = builder.create();
                    baseFragment.showDialog(alertDialogCreate);
                    textView = (TextView) alertDialogCreate.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    }
                }
                if (chat.megagroup) {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                } else {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                }
            }
        } else {
            textView3.setText(LocaleController.formatPluralString("DeleteDays", i, new Object[0]));
            textView2.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        i2 = 1;
        zArr = new boolean[i2];
        zArr[0] = false;
        if (chat != null) {
            zArr[0] = i2;
        }
        if (user != null) {
            j = user.id;
            if (j == clientUserId) {
                if (chat != null) {
                    CheckBoxCell checkBoxCell7 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                    checkBoxCellArr[0] = checkBoxCell7;
                    checkBoxCell7.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (chat != null) {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    }
                    CheckBoxCell checkBoxCell8 = checkBoxCellArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell8.setPadding(iDp, 0, iDp2, 0);
                    frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCellArr[0].setChecked(false, false);
                    checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
                }
            } else if (chat != null) {
                CheckBoxCell checkBoxCell9 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell9;
                checkBoxCell9.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (chat != null) {
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                } else {
                    checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                }
                CheckBoxCell checkBoxCell10 = checkBoxCellArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell10.setPadding(iDp, 0, iDp2, 0);
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setChecked(false, false);
                checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
            }
        } else if (chat != null) {
            CheckBoxCell checkBoxCell11 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell11;
            checkBoxCell11.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (chat != null) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            }
            CheckBoxCell checkBoxCell12 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(16.0f);
            }
            checkBoxCell12.setPadding(iDp, 0, iDp2, 0);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setChecked(false, false);
            checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 2));
        }
        string = LocaleController.getString(R.string.Delete);
        if (chat != null) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        builder.setPositiveButton(string, new AlertsCreator$$ExternalSyntheticLambda77(booleanCallback, zArr, 1));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        textView = (TextView) alertDialogCreate2.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, chat, user, z2, false, false, z3, booleanCallback, baseFragment != null ? baseFragment.getResourceProvider() : null);
    }

    public static void createClearOrDeleteDialogsAlert(BaseFragment baseFragment, boolean z, boolean z2, int i, int i2, boolean z3, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        ViewGroup viewGroup;
        TextView textView;
        int i3;
        String string;
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        int i4 = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
        UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        boolean[] zArr = new boolean[1];
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            public void onMeasure(int i5, int i6) {
                super.onMeasure(i5, i6);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView3.setTextSize(1, 20.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setLines(1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        if (z2) {
            if (z3) {
                viewGroup = frameLayout;
                textView = textView3;
                i3 = 5;
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                viewGroup.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, i3));
            } else {
                viewGroup = frameLayout;
                textView = textView3;
                i3 = 5;
            }
            textView.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", i2, new Object[0])));
            textView2.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
        } else {
            viewGroup = frameLayout;
            textView = textView3;
            i3 = 5;
            if (i != 0) {
                textView.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", i2, new Object[0])));
                textView2.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
            } else {
                textView.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", i2, new Object[0])));
                textView2.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
            }
        }
        viewGroup.addView(textView, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        if (!LocaleController.isRTL) {
            i3 = 3;
        }
        viewGroup.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i3 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (z2) {
            string = LocaleController.getString("Delete", R.string.Delete);
        } else {
            string = i != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory);
        }
        builder.setPositiveButton(string, new AlertsCreator$$ExternalSyntheticLambda77(booleanCallback, zArr, i4));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView4 = (TextView) alertDialogCreate.getButton(-1);
        if (textView4 != null) {
            textView4.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static Dialog createColorSelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createColorSelectDialog(activity, j, i, i2, runnable, null);
    }

    public static void createContactInviteDialog(BaseFragment baseFragment, String str, String str2, String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.ContactNotRegisteredTitle));
        builder.setMessage(LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2)));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Invite), new AIEditorAlert$$ExternalSyntheticLambda34(13, str3, baseFragment));
        baseFragment.showDialog(builder.create());
    }

    public static AlertDialog.Builder createContactsPermissionDialog(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        builder.setTopAnimation(R.raw.permission_request_contacts, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert)));
        final int i = 0;
        builder.setPositiveButton(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                switch (i) {
                    case 0:
                        intCallback.run(1);
                        break;
                    default:
                        intCallback.run(0);
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        intCallback.run(1);
                        break;
                    default:
                        intCallback.run(0);
                        break;
                }
            }
        });
        return builder;
    }

    public static BottomSheet createCustomPicker(Context context, String str, int i, String[] strArr, Utilities.Callback<Integer> callback) {
        TimezonesController timezonesController = TimezonesController.getInstance(UserConfig.selectedAccount);
        timezonesController.load();
        if (timezonesController.timezones.isEmpty()) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet bottomSheet = new BottomSheet(context, false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setAllItemsCount(strArr.length);
        numberPicker.setItemCount(Math.min(strArr.length, 8));
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setGravity(17);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(strArr.length - 1);
        numberPicker.setValue(i);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 432, 1.0f));
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda21(strArr, 20));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
                this.ignoreLayout = false;
                super.onMeasure(i2, i3);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setText(str);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(9));
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false);
        buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda95(bottomSheetArr, 2));
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        bottomSheet.customView = linearLayout2;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda43(2, callback, numberPicker));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet[] bottomSheetArr = {bottomSheet};
        return bottomSheet;
    }

    public static AlertDialog.Builder createDatePickerDialog(Context context, int i, int i2, int i3, int i4, int i5, int i6, String str, final boolean z, final DatePickerDelegate datePickerDelegate) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final NumberPicker numberPicker = new NumberPicker(context);
        final NumberPicker numberPicker2 = new NumberPicker(context);
        final NumberPicker numberPicker3 = new NumberPicker(context);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, -2, 0.3f));
        final int i7 = 0;
        numberPicker2.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i8) {
                switch (i7) {
                    case 0:
                        NumberPicker numberPicker5 = numberPicker;
                        NumberPicker numberPicker6 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$114(z, numberPicker2, numberPicker5, numberPicker6, numberPicker4, i8);
                        break;
                    case 1:
                        NumberPicker numberPicker7 = numberPicker;
                        NumberPicker numberPicker8 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$117(z, numberPicker2, numberPicker7, numberPicker8, numberPicker4, i8);
                        break;
                    default:
                        NumberPicker numberPicker9 = numberPicker;
                        NumberPicker numberPicker10 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$119(z, numberPicker2, numberPicker9, numberPicker10, numberPicker4, i8);
                        break;
                }
            }
        });
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, -2, 0.3f));
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(8));
        numberPicker.setOnValueChangedListener(new AlertsCreator$$ExternalSyntheticLambda47(numberPicker2, numberPicker, numberPicker3, 1));
        final int i8 = 1;
        numberPicker.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i9) {
                switch (i8) {
                    case 0:
                        NumberPicker numberPicker5 = numberPicker;
                        NumberPicker numberPicker6 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$114(z, numberPicker2, numberPicker5, numberPicker6, numberPicker4, i9);
                        break;
                    case 1:
                        NumberPicker numberPicker7 = numberPicker;
                        NumberPicker numberPicker8 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$117(z, numberPicker2, numberPicker7, numberPicker8, numberPicker4, i9);
                        break;
                    default:
                        NumberPicker numberPicker9 = numberPicker;
                        NumberPicker numberPicker10 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$119(z, numberPicker2, numberPicker9, numberPicker10, numberPicker4, i9);
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i9 = calendar.get(1);
        numberPicker3.setMinValue(i + i9);
        numberPicker3.setMaxValue(i2 + i9);
        numberPicker3.setValue(i9 + i3);
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, -2, 0.4f));
        numberPicker3.setOnValueChangedListener(new AlertsCreator$$ExternalSyntheticLambda47(numberPicker2, numberPicker, numberPicker3, 2));
        final int i10 = 2;
        numberPicker3.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i11) {
                switch (i10) {
                    case 0:
                        NumberPicker numberPicker5 = numberPicker;
                        NumberPicker numberPicker6 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$114(z, numberPicker2, numberPicker5, numberPicker6, numberPicker4, i11);
                        break;
                    case 1:
                        NumberPicker numberPicker7 = numberPicker;
                        NumberPicker numberPicker8 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$117(z, numberPicker2, numberPicker7, numberPicker8, numberPicker4, i11);
                        break;
                    default:
                        NumberPicker numberPicker9 = numberPicker;
                        NumberPicker numberPicker10 = numberPicker3;
                        AlertsCreator.lambda$createDatePickerDialog$119(z, numberPicker2, numberPicker9, numberPicker10, numberPicker4, i11);
                        break;
                }
            }
        });
        updateDayPicker(numberPicker2, numberPicker, numberPicker3);
        if (z) {
            checkPickerDate(numberPicker2, numberPicker, numberPicker3);
        }
        if (i4 != -1) {
            numberPicker2.setValue(i4);
            numberPicker.setValue(i5);
            numberPicker3.setValue(i6);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i11) {
                NumberPicker numberPicker4 = numberPicker3;
                AlertsCreator.lambda$createDatePickerDialog$120(z, numberPicker2, numberPicker, numberPicker4, datePickerDelegate, alertDialog, i11);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder;
    }

    public static void createDeleteMessagesAlert(final BaseFragment baseFragment, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray<MessageObject>[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        Activity parentActivity;
        boolean z;
        long jMakeEncryptedDialogId;
        AlertDialog.Builder builder;
        boolean z2;
        boolean z3;
        boolean z4;
        AlertDialog.Builder builder2;
        int i3;
        int i4;
        MessageObject messageObject2;
        int i5;
        boolean z5;
        AlertDialog.Builder builder3;
        long j2;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.MessageAction messageAction;
        AlertDialog.OnButtonClickListener onButtonClickListener;
        int i7;
        final MessageObject messageObject3;
        AlertDialog.Builder builder4;
        final int i8;
        final boolean z9;
        AlertDialog.Builder builder5;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        MessageObject messageObjectValueAt;
        boolean z12;
        long j3;
        int i15;
        AlertDialog alertDialogCreate;
        TextView textView;
        TextView textView2;
        long j4;
        int i16;
        TLRPC.MessageAction messageAction2;
        final int i17;
        final int i18;
        TLRPC.Message message;
        int i19;
        MessageObject messageObject4 = messageObject;
        boolean z13 = i2 == 1;
        boolean z14 = i2 == 3;
        if (baseFragment != null) {
            if ((user == null && chat == null && encryptedChat == null) || (parentActivity = baseFragment.getParentActivity()) == null) {
                return;
            }
            final int currentAccount = baseFragment.getCurrentAccount();
            AlertDialog.Builder builder6 = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
            builder6.setDimAlpha(runnable2 != null ? 0.5f : 0.6f);
            int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject4 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
            if (encryptedChat != null) {
                z = z14;
                jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            } else {
                z = z14;
                jMakeEncryptedDialogId = user != null ? user.id : -chat.id;
            }
            if (z13) {
                if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (i19 = message.schedule_repeat_period) > 0) {
                    i18 = i19;
                    i17 = message.date;
                } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                    i17 = 0;
                    i18 = 0;
                } else {
                    int i20 = groupedMessages.messages.get(0).messageOwner.date;
                    i18 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
                    i17 = i20;
                }
                if (i17 > 0 && i18 > 0) {
                    String string = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i18));
                    if (i18 == 31536000) {
                        string = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                    } else if (i18 >= 2592000) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i18 / 2592000, new Object[0]);
                    } else if (i18 >= 604800) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i18 / 604800, new Object[0]);
                    } else if (i18 >= 86400) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i18 / 86400, new Object[0]);
                    }
                    String str2 = string;
                    final long j5 = jMakeEncryptedDialogId;
                    final boolean z15 = z;
                    new AlertDialog.Builder(parentActivity, 0, resourcesProvider).setTitle(LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle)).setMessage(LocaleController.getString(R.string.MessageScheduledRepeatDeleteText)).setNegativeButton(str2, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i21) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$222(groupedMessages, currentAccount, baseFragment, i17, i18, messageObject, alertDialog, i21);
                        }
                    }).setNeutralButton(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i21) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$223(j5, z15, currentAccount, messageObject, groupedMessages, encryptedChat, j, i, i2, sparseArrayArr, runnable, alertDialog, i21);
                        }
                    }).setPositiveButton(LocaleController.getString(R.string.Cancel), null).makeRed(-2).makeRed(-3).setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(3, runnable2)).show();
                    return;
                }
                messageObject4 = messageObject;
            } else {
                builder6 = builder6;
            }
            final int i21 = currentAccount;
            int currentTime = ConnectionsManager.getInstance(i21).getCurrentTime();
            MessagesController.getInstance(i21).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
            if (messageObject4 != null) {
                z4 = !messageObject4.isDice() || Math.abs(currentTime - messageObject4.messageOwner.date) > 86400;
                if (messageObject4.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message2 = messageObject4.messageOwner;
                    z2 = message2.paid_suggested_post_stars;
                    z3 = message2.paid_suggested_post_ton;
                    builder = builder6;
                } else {
                    builder = builder6;
                    z2 = false;
                    z3 = false;
                }
            } else {
                int i22 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (i22 < 2) {
                    int i23 = 0;
                    while (true) {
                        builder2 = builder6;
                        if (i23 < sparseArrayArr[i22].size()) {
                            MessageObject messageObjectValueAt2 = sparseArrayArr[i22].valueAt(i23);
                            if (messageObjectValueAt2.isDice()) {
                                i3 = i23;
                                i4 = i22;
                                if (Math.abs(currentTime - messageObjectValueAt2.messageOwner.date) > 86400) {
                                }
                                if (messageObjectValueAt2.isPaidSuggestedPostProtected()) {
                                    TLRPC.Message message3 = messageObjectValueAt2.messageOwner;
                                    z17 |= message3.paid_suggested_post_stars;
                                    z16 |= message3.paid_suggested_post_ton;
                                }
                                i23 = i3 + 1;
                                builder6 = builder2;
                                i22 = i4;
                            } else {
                                i3 = i23;
                                i4 = i22;
                            }
                            z18 = true;
                            if (messageObjectValueAt2.isPaidSuggestedPostProtected()) {
                                TLRPC.Message message4 = messageObjectValueAt2.messageOwner;
                                z17 |= message4.paid_suggested_post_stars;
                                z16 |= message4.paid_suggested_post_ton;
                            }
                            i23 = i3 + 1;
                            builder6 = builder2;
                            i22 = i4;
                        }
                    }
                    i22++;
                    builder6 = builder2;
                }
                builder = builder6;
                z2 = z17;
                z3 = z16;
                z4 = z18;
            }
            if (groupedMessages != null) {
                for (int i24 = 0; i24 < groupedMessages.messages.size(); i24++) {
                    MessageObject messageObject5 = groupedMessages.messages.get(i24);
                    if (messageObject5.isPaidSuggestedPostProtected()) {
                        TLRPC.Message message5 = messageObject5.messageOwner;
                        z2 = message5.paid_suggested_post_stars | z2;
                        z3 = message5.paid_suggested_post_ton | z3;
                    }
                }
            }
            final long j6 = jMakeEncryptedDialogId;
            boolean z19 = z3;
            boolean z20 = z2;
            final boolean[] zArr = new boolean[1];
            boolean z21 = user != null && MessagesController.getInstance(i21).canRevokePmInbox;
            int i25 = user != null ? MessagesController.getInstance(i21).revokeTimePmLimit : MessagesController.getInstance(i21).revokeTimeLimit;
            boolean z22 = encryptedChat == null && user != null && z21 && i25 == Integer.MAX_VALUE;
            if (chat == null || !chat.megagroup || z13 || z) {
                messageObject2 = messageObject4;
                i5 = i21;
                z5 = z20;
                builder3 = builder;
                j2 = 1000;
                if (z13 || z || ChatObject.isChannel(chat) || encryptedChat != null) {
                    i6 = 0;
                } else {
                    if ((user == null || user.id == UserConfig.getInstance(i5).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                        i6 = 0;
                        z6 = false;
                    } else if (messageObject2 != null) {
                        int i26 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z21 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject2.messageOwner.date > i25)) ? 0 : 1;
                        z6 = !messageObject2.isOut();
                        i6 = i26;
                    } else {
                        int i27 = 1;
                        int i28 = 0;
                        boolean z23 = false;
                        while (i27 >= 0) {
                            int i29 = 0;
                            while (i29 < sparseArrayArr[i27].size()) {
                                MessageObject messageObjectValueAt3 = sparseArrayArr[i27].valueAt(i29);
                                boolean z24 = z21;
                                TLRPC.MessageAction messageAction3 = messageObjectValueAt3.messageOwner.action;
                                int i30 = i27;
                                if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObjectValueAt3.isOut() || z24 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObjectValueAt3.messageOwner.date <= i25)) {
                                    i28++;
                                    if (!z23 && !messageObjectValueAt3.isOut()) {
                                        z23 = true;
                                    }
                                }
                                i29++;
                                i27 = i30;
                                z21 = z24;
                            }
                            i27--;
                        }
                        i6 = i28;
                        z6 = z23;
                    }
                    if (i6 <= 0 || !z4 || (user != null && UserObject.isDeleted(user))) {
                        z7 = z6;
                        z8 = false;
                    } else {
                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                        CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (z22) {
                            checkBoxCell.setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            if (chat == null || !(z6 || i6 == size)) {
                                checkBoxCell.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                            } else {
                                checkBoxCell.setText(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                            }
                            checkBoxCell = checkBoxCell;
                        }
                        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 4));
                        builder3.setView(frameLayout);
                        builder3.setCustomViewOffset(9);
                        z7 = z6;
                        z8 = true;
                    }
                }
                int i31 = i6;
                i7 = size;
                messageObject3 = messageObject2;
                builder4 = builder3;
                i8 = i5;
                z9 = z;
                onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i32) {
                        AlertsCreator.lambda$createDeleteMessagesAlert$235(j6, z9, i8, messageObject3, groupedMessages, encryptedChat, j, i, zArr, i2, sparseArrayArr, runnable, alertDialog, i32);
                    }
                };
                if (z9) {
                    i9 = i7;
                    if (i9 == 1) {
                        builder5 = builder4;
                        builder5.setTitle(LocaleController.getString(R.string.UnsaveSingleMessagesTitle));
                        i10 = 0;
                    } else {
                        builder5 = builder4;
                        i10 = 0;
                        builder5.setTitle(LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                    }
                } else {
                    builder5 = builder4;
                    i9 = i7;
                    i10 = 0;
                    i10 = 0;
                    if (i9 == 1) {
                        builder5.setTitle(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    } else {
                        builder5.setTitle(LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                    }
                }
                if (!z9) {
                    if (chat != null || !z7) {
                        if (z8 || z22 || i31 == i9) {
                            i11 = 2;
                            if (chat == null && chat.megagroup && !z13) {
                                if (i9 == 1) {
                                    builder5.setMessage(LocaleController.getString((messageObject3 == null || !messageObject3.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage));
                                } else {
                                    builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega));
                                }
                            } else if (i9 == 1) {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (chat != null) {
                            int i32 = R.string.DeleteMessagesTextGroup;
                            Object[] objArr = new Object[1];
                            objArr[i10] = LocaleController.formatPluralString("messages", i31, new Object[i10]);
                            builder5.setMessage(LocaleController.formatString("DeleteMessagesTextGroup", i32, objArr));
                        } else {
                            int i33 = R.string.DeleteMessagesText;
                            String pluralString = LocaleController.formatPluralString("messages", i31, new Object[i10]);
                            String firstName = UserObject.getFirstName(user);
                            i11 = 2;
                            Object[] objArr2 = new Object[2];
                            objArr2[i10] = pluralString;
                            objArr2[1] = firstName;
                            SendMessagesHelper$$ExternalSyntheticOutline0.m("DeleteMessagesText", i33, objArr2, builder5);
                        }
                        if (messageObject3 != null) {
                            if (i9 == 1) {
                                i13 = 1;
                                str = null;
                                z10 = false;
                                while (i13 >= 0) {
                                    z11 = z10;
                                    for (i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                                        messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                                        if (messageObjectValueAt.isGiveaway() || messageObjectValueAt.isForwarded()) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (z12) {
                                            j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                            str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                            if (System.currentTimeMillis() < j3) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        } else {
                                            z11 = z12;
                                        }
                                    }
                                    i13--;
                                    z10 = z11;
                                }
                            } else {
                                i12 = -1;
                                str = null;
                                z10 = false;
                            }
                            if (z5) {
                                int i34 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                                builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                                int i35 = R.string.SuggestionStarsWillBeLostInfo;
                                Object[] objArr3 = new Object[1];
                                objArr3[i10] = Integer.valueOf(i34);
                                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i35, objArr3)));
                                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                            } else if (z19) {
                                int i36 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                                builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                                int i37 = R.string.SuggestionTONWillBeLostInfo;
                                Object[] objArr4 = new Object[1];
                                objArr4[i10] = Integer.valueOf(i36);
                                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i37, objArr4)));
                                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                            } else if (z10 || z9) {
                                if (z9) {
                                    i15 = R.string.Remove;
                                } else {
                                    i15 = R.string.Delete;
                                }
                                builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                            } else {
                                builder5.setTitle(LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle));
                                int i38 = R.string.BoostingGiveawayDeleteMsgText;
                                Object[] objArr5 = new Object[1];
                                objArr5[i10] = str;
                                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i38, objArr5)));
                                builder5.setNeutralButton(LocaleController.getString(R.string.Delete), onButtonClickListener);
                            }
                            builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                            alertDialogCreate = builder5.create();
                            baseFragment.showDialog(alertDialogCreate);
                            textView = (TextView) alertDialogCreate.getButton(i12);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                            }
                            textView2 = (TextView) alertDialogCreate.getButton(-3);
                            if (textView2 != null) {
                                alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                                ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                                textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                            }
                        }
                        if (messageObject3.isGiveaway() || messageObject3.isForwarded()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                            String str3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                            if (System.currentTimeMillis() < j4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            str = str3;
                        } else {
                            str = null;
                        }
                        i12 = -1;
                        if (z5) {
                            int i39 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                            builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                            int i310 = R.string.SuggestionStarsWillBeLostInfo;
                            Object[] objArr6 = new Object[1];
                            objArr6[i10] = Integer.valueOf(i39);
                            builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i310, objArr6)));
                            builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                        } else if (z19) {
                            int i311 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                            builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                            int i312 = R.string.SuggestionTONWillBeLostInfo;
                            Object[] objArr7 = new Object[1];
                            objArr7[i10] = Integer.valueOf(i311);
                            builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i312, objArr7)));
                            builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                        } else if (z10) {
                            if (z9) {
                                i15 = R.string.Remove;
                            } else {
                                i15 = R.string.Delete;
                            }
                            builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                        } else {
                            if (z9) {
                                i15 = R.string.Remove;
                            } else {
                                i15 = R.string.Delete;
                            }
                            builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                        }
                        builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                        alertDialogCreate = builder5.create();
                        baseFragment.showDialog(alertDialogCreate);
                        textView = (TextView) alertDialogCreate.getButton(i12);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                        }
                        textView2 = (TextView) alertDialogCreate.getButton(-3);
                        if (textView2 != null) {
                            alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                            ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                        }
                    }
                    if (z8 && i31 != i9) {
                        int i40 = R.string.DeleteMessagesTextGroupPart;
                        Object[] objArr8 = new Object[1];
                        objArr8[i10] = LocaleController.formatPluralString("messages", i31, new Object[i10]);
                        builder5.setMessage(LocaleController.formatString(i40, objArr8));
                    } else if (i9 == 1) {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                    } else {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                    }
                } else if (i9 == 1) {
                    builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage));
                } else {
                    builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveFewMessages));
                }
                i11 = 2;
                if (messageObject3 != null) {
                    if (i9 == 1) {
                        i13 = 1;
                        str = null;
                        z10 = false;
                        while (i13 >= 0) {
                            z11 = z10;
                            while (i14 < sparseArrayArr[i13].size()) {
                                messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                                if (messageObjectValueAt.isGiveaway()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                    str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                    if (System.currentTimeMillis() < j3) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = z12;
                                }
                            }
                            i13--;
                            z10 = z11;
                        }
                    } else {
                        i12 = -1;
                        str = null;
                        z10 = false;
                    }
                    if (z5) {
                        int i313 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                        int i314 = R.string.SuggestionStarsWillBeLostInfo;
                        Object[] objArr9 = new Object[1];
                        objArr9[i10] = Integer.valueOf(i313);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i314, objArr9)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z19) {
                        int i315 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                        int i316 = R.string.SuggestionTONWillBeLostInfo;
                        Object[] objArr10 = new Object[1];
                        objArr10[i10] = Integer.valueOf(i315);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i316, objArr10)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z10) {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    } else {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    }
                    builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                    alertDialogCreate = builder5.create();
                    baseFragment.showDialog(alertDialogCreate);
                    textView = (TextView) alertDialogCreate.getButton(i12);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                    textView2 = (TextView) alertDialogCreate.getButton(-3);
                    if (textView2 != null) {
                        alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                        ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                        textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                }
                if (messageObject3.isGiveaway()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                    String str4 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                    if (System.currentTimeMillis() < j4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str = str4;
                } else {
                    str = null;
                }
                i12 = -1;
                if (z5) {
                    int i317 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    int i318 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr11 = new Object[1];
                    objArr11[i10] = Integer.valueOf(i317);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i318, objArr11)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z19) {
                    int i319 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    int i3110 = R.string.SuggestionTONWillBeLostInfo;
                    Object[] objArr12 = new Object[1];
                    objArr12[i10] = Integer.valueOf(i319);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3110, objArr12)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z10) {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                } else {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                }
                builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                alertDialogCreate = builder5.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i12);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (messageObject4 != null) {
                TLRPC.MessageAction messageAction4 = messageObject4.messageOwner.action;
                if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                    if (groupedMessages != null) {
                        arrayList.addAll(groupedMessages.messages);
                    } else {
                        arrayList.add(messageObject4);
                    }
                }
                i16 = (!messageObject4.isSendError() && messageObject4.getDialogId() == j && ((messageAction2 = messageObject4.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject4.isOut() && currentTime - messageObject4.messageOwner.date <= i25) ? 1 : 0;
            } else {
                i16 = 0;
                for (int i41 = 1; i41 >= 0; i41--) {
                    for (int i42 = 0; i42 < sparseArrayArr[i41].size(); i42++) {
                        MessageObject messageObjectValueAt4 = sparseArrayArr[i41].valueAt(i42);
                        if (i41 == 1 && messageObjectValueAt4.isOut()) {
                            TLRPC.Message message6 = messageObjectValueAt4.messageOwner;
                            if (message6.action == null && currentTime - message6.date <= i25) {
                                i16++;
                            }
                        }
                        arrayList.add(messageObjectValueAt4);
                    }
                }
            }
            long clientUserId = UserConfig.getInstance(i21).getClientUserId();
            final int i43 = 0;
            Stream streamMapToObj = Collection.EL.stream(arrayList).filter(new Predicate() {
                public final Predicate and(Predicate predicate) {
                    int i44 = i43;
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final Predicate negate() {
                    switch (i43) {
                        case 0:
                            break;
                    }
                    return Predicate$CC.$default$negate(this);
                }

                public final Predicate or(Predicate predicate) {
                    int i44 = i43;
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    switch (i43) {
                        case 0:
                            return AlertsCreator.lambda$createDeleteMessagesAlert$225((MessageObject) obj);
                        default:
                            return Objects.nonNull((TLObject) obj);
                    }
                }
            }).mapToLong(new AlertsCreator$$ExternalSyntheticLambda28()).distinct().mapToObj(new LongFunction() {
                @Override
                public final Object apply(long j7) {
                    return AlertsCreator.lambda$createDeleteMessagesAlert$226(i21, j7);
                }
            });
            final int i44 = 1;
            ArrayList arrayList2 = (ArrayList) streamMapToObj.filter(new Predicate() {
                public final Predicate and(Predicate predicate) {
                    int i45 = i44;
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final Predicate negate() {
                    switch (i44) {
                        case 0:
                            break;
                    }
                    return Predicate$CC.$default$negate(this);
                }

                public final Predicate or(Predicate predicate) {
                    int i45 = i44;
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    switch (i44) {
                        case 0:
                            return AlertsCreator.lambda$createDeleteMessagesAlert$225((MessageObject) obj);
                        default:
                            return Objects.nonNull((TLObject) obj);
                    }
                }
            }).filter(new CallLogActivity$$ExternalSyntheticLambda13(clientUserId, 2)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
            if (!arrayList2.isEmpty()) {
                if (channelParticipantArr != null) {
                    DeleteMessagesBottomSheet deleteMessagesBottomSheet = new DeleteMessagesBottomSheet(baseFragment, chat, arrayList, arrayList2, channelParticipantArr, j, i, i2, false, runnable);
                    if (runnable2 != null) {
                        deleteMessagesBottomSheet.setOnHideListener(new AlertsCreator$$ExternalSyntheticLambda20(0, runnable2));
                    }
                    deleteMessagesBottomSheet.show();
                    return;
                }
                final AlertDialog[] alertDialogArr = {new AlertDialog(parentActivity, 3, null)};
                final int size2 = arrayList2.size();
                TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                final int[] iArr = new int[size2];
                int[] iArr2 = new int[1];
                int i45 = 0;
                while (i45 < size2) {
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i45));
                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                    ArrayList arrayList3 = arrayList2;
                    final int[] iArr3 = iArr2;
                    final int i46 = i45;
                    final Runnable runnable3 = runnable2;
                    iArr[i46] = ConnectionsManager.getInstance(i21).sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$229(iArr3, iArr, i46, channelParticipantArr3, size2, alertDialogArr, baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i, i2, runnable, runnable3, resourcesProvider, tLObject, tL_error);
                        }
                    });
                    i45 = i46 + 1;
                    runnable2 = runnable2;
                    iArr2 = iArr3;
                    channelParticipantArr2 = channelParticipantArr3;
                    i21 = i21;
                    arrayList2 = arrayList3;
                }
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(alertDialogArr, iArr, i21, runnable2, baseFragment, 11), 1000L);
                return;
            }
            i5 = i21;
            messageObject2 = messageObject;
            if (i16 <= 0 || !z4) {
                j2 = 1000;
                z5 = z20;
                builder3 = builder;
                i6 = i16;
            } else {
                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                j2 = 1000;
                z5 = z20;
                builder3 = builder;
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCell2.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                int i47 = 0;
                checkBoxCell2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                frameLayout2.addView(checkBoxCell2, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCell2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, i47));
                builder3.setView(frameLayout2);
                builder3.setCustomViewOffset(9);
                i6 = i16;
                z8 = true;
            }
            z7 = false;
            int i320 = i6;
            i7 = size;
            messageObject3 = messageObject2;
            builder4 = builder3;
            i8 = i5;
            z9 = z;
            onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i321) {
                    AlertsCreator.lambda$createDeleteMessagesAlert$235(j6, z9, i8, messageObject3, groupedMessages, encryptedChat, j, i, zArr, i2, sparseArrayArr, runnable, alertDialog, i321);
                }
            };
            if (z9) {
                i9 = i7;
                if (i9 == 1) {
                    builder5 = builder4;
                    builder5.setTitle(LocaleController.getString(R.string.UnsaveSingleMessagesTitle));
                    i10 = 0;
                } else {
                    builder5 = builder4;
                    i10 = 0;
                    builder5.setTitle(LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                }
            } else {
                builder5 = builder4;
                i9 = i7;
                i10 = 0;
                i10 = 0;
                if (i9 == 1) {
                    builder5.setTitle(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                } else {
                    builder5.setTitle(LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                }
            }
            if (!z9) {
                if (chat != null) {
                    if (z8) {
                        i11 = 2;
                        if (chat == null) {
                            if (i9 == 1) {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else {
                        i11 = 2;
                        if (chat == null) {
                            if (i9 == 1) {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    }
                } else if (z8) {
                    i11 = 2;
                    if (chat == null) {
                        if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else if (i9 == 1) {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                    } else {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                    }
                } else {
                    i11 = 2;
                    if (chat == null) {
                        if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else if (i9 == 1) {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                    } else {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                    }
                }
                if (messageObject3 != null) {
                    if (i9 == 1) {
                        i13 = 1;
                        str = null;
                        z10 = false;
                        while (i13 >= 0) {
                            z11 = z10;
                            while (i14 < sparseArrayArr[i13].size()) {
                                messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                                if (messageObjectValueAt.isGiveaway()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                    str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                    if (System.currentTimeMillis() < j3) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = z12;
                                }
                            }
                            i13--;
                            z10 = z11;
                        }
                    } else {
                        i12 = -1;
                        str = null;
                        z10 = false;
                    }
                    if (z5) {
                        int i3111 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                        int i3112 = R.string.SuggestionStarsWillBeLostInfo;
                        Object[] objArr13 = new Object[1];
                        objArr13[i10] = Integer.valueOf(i3111);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3112, objArr13)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z19) {
                        int i3113 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                        int i3114 = R.string.SuggestionTONWillBeLostInfo;
                        Object[] objArr14 = new Object[1];
                        objArr14[i10] = Integer.valueOf(i3113);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3114, objArr14)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z10) {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    } else {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    }
                    builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                    alertDialogCreate = builder5.create();
                    baseFragment.showDialog(alertDialogCreate);
                    textView = (TextView) alertDialogCreate.getButton(i12);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                    textView2 = (TextView) alertDialogCreate.getButton(-3);
                    if (textView2 != null) {
                        alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                        ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                        textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                }
                if (messageObject3.isGiveaway()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                    String str5 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                    if (System.currentTimeMillis() < j4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str = str5;
                } else {
                    str = null;
                }
                i12 = -1;
                if (z5) {
                    int i3115 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    int i3116 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr15 = new Object[1];
                    objArr15[i10] = Integer.valueOf(i3115);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3116, objArr15)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z19) {
                    int i3117 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    int i3118 = R.string.SuggestionTONWillBeLostInfo;
                    Object[] objArr16 = new Object[1];
                    objArr16[i10] = Integer.valueOf(i3117);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3118, objArr16)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z10) {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                } else {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                }
                builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                alertDialogCreate = builder5.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i12);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
            }
            if (i9 == 1) {
                builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage));
            } else {
                builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveFewMessages));
            }
            i11 = 2;
            if (messageObject3 != null) {
                if (i9 == 1) {
                    i13 = 1;
                    str = null;
                    z10 = false;
                    while (i13 >= 0) {
                        z11 = z10;
                        while (i14 < sparseArrayArr[i13].size()) {
                            messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                            if (messageObjectValueAt.isGiveaway()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                if (System.currentTimeMillis() < j3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = z12;
                            }
                        }
                        i13--;
                        z10 = z11;
                    }
                } else {
                    i12 = -1;
                    str = null;
                    z10 = false;
                }
                if (z5) {
                    int i3119 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    int i31110 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr17 = new Object[1];
                    objArr17[i10] = Integer.valueOf(i3119);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i31110, objArr17)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z19) {
                    int i31111 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    int i31112 = R.string.SuggestionTONWillBeLostInfo;
                    Object[] objArr18 = new Object[1];
                    objArr18[i10] = Integer.valueOf(i31111);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i31112, objArr18)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z10) {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                } else {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                }
                builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                alertDialogCreate = builder5.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i12);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
            }
            if (messageObject3.isGiveaway()) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                String str6 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                if (System.currentTimeMillis() < j4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str = str6;
            } else {
                str = null;
            }
            i12 = -1;
            if (z5) {
                int i31113 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                int i31114 = R.string.SuggestionStarsWillBeLostInfo;
                Object[] objArr19 = new Object[1];
                objArr19[i10] = Integer.valueOf(i31113);
                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i31114, objArr19)));
                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z19) {
                int i31115 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                int i31116 = R.string.SuggestionTONWillBeLostInfo;
                Object[] objArr110 = new Object[1];
                objArr110[i10] = Integer.valueOf(i31115);
                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i31116, objArr110)));
                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z10) {
                if (z9) {
                    i15 = R.string.Remove;
                } else {
                    i15 = R.string.Delete;
                }
                builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
            } else {
                if (z9) {
                    i15 = R.string.Remove;
                } else {
                    i15 = R.string.Delete;
                }
                builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
            }
            builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
            alertDialogCreate = builder5.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(i12);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
            }
            textView2 = (TextView) alertDialogCreate.getButton(-3);
            if (textView2 != null) {
                alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
            }
            z8 = false;
            z7 = false;
            int i321 = i6;
            i7 = size;
            messageObject3 = messageObject2;
            builder4 = builder3;
            i8 = i5;
            z9 = z;
            onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i322) {
                    AlertsCreator.lambda$createDeleteMessagesAlert$235(j6, z9, i8, messageObject3, groupedMessages, encryptedChat, j, i, zArr, i2, sparseArrayArr, runnable, alertDialog, i322);
                }
            };
            if (z9) {
                i9 = i7;
                if (i9 == 1) {
                    builder5 = builder4;
                    builder5.setTitle(LocaleController.getString(R.string.UnsaveSingleMessagesTitle));
                    i10 = 0;
                } else {
                    builder5 = builder4;
                    i10 = 0;
                    builder5.setTitle(LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                }
            } else {
                builder5 = builder4;
                i9 = i7;
                i10 = 0;
                i10 = 0;
                if (i9 == 1) {
                    builder5.setTitle(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                } else {
                    builder5.setTitle(LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i9, new Object[0])));
                }
            }
            if (!z9) {
                if (chat != null) {
                    if (z8) {
                        i11 = 2;
                        if (chat == null) {
                            if (i9 == 1) {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else {
                        i11 = 2;
                        if (chat == null) {
                            if (i9 == 1) {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    }
                } else if (z8) {
                    i11 = 2;
                    if (chat == null) {
                        if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else if (i9 == 1) {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                    } else {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                    }
                } else {
                    i11 = 2;
                    if (chat == null) {
                        if (i9 == 1) {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else if (i9 == 1) {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                    } else {
                        builder5.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                    }
                }
                if (messageObject3 != null) {
                    if (i9 == 1) {
                        i13 = 1;
                        str = null;
                        z10 = false;
                        while (i13 >= 0) {
                            z11 = z10;
                            while (i14 < sparseArrayArr[i13].size()) {
                                messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                                if (messageObjectValueAt.isGiveaway()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                    str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                    if (System.currentTimeMillis() < j3) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = z12;
                                }
                            }
                            i13--;
                            z10 = z11;
                        }
                    } else {
                        i12 = -1;
                        str = null;
                        z10 = false;
                    }
                    if (z5) {
                        int i31117 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                        int i31118 = R.string.SuggestionStarsWillBeLostInfo;
                        Object[] objArr111 = new Object[1];
                        objArr111[i10] = Integer.valueOf(i31117);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i31118, objArr111)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z19) {
                        int i31119 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                        int i311110 = R.string.SuggestionTONWillBeLostInfo;
                        Object[] objArr112 = new Object[1];
                        objArr112[i10] = Integer.valueOf(i31119);
                        builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i311110, objArr112)));
                        builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                    } else if (z10) {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    } else {
                        if (z9) {
                            i15 = R.string.Remove;
                        } else {
                            i15 = R.string.Delete;
                        }
                        builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                    }
                    builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                    alertDialogCreate = builder5.create();
                    baseFragment.showDialog(alertDialogCreate);
                    textView = (TextView) alertDialogCreate.getButton(i12);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                    textView2 = (TextView) alertDialogCreate.getButton(-3);
                    if (textView2 != null) {
                        alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                        ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                        textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                    }
                }
                if (messageObject3.isGiveaway()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                    String str7 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                    if (System.currentTimeMillis() < j4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str = str7;
                } else {
                    str = null;
                }
                i12 = -1;
                if (z5) {
                    int i311111 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    int i311112 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr113 = new Object[1];
                    objArr113[i10] = Integer.valueOf(i311111);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i311112, objArr113)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z19) {
                    int i311113 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    int i311114 = R.string.SuggestionTONWillBeLostInfo;
                    Object[] objArr114 = new Object[1];
                    objArr114[i10] = Integer.valueOf(i311113);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i311114, objArr114)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z10) {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                } else {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                }
                builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                alertDialogCreate = builder5.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i12);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
            }
            if (i9 == 1) {
                builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage));
            } else {
                builder5.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveFewMessages));
            }
            i11 = 2;
            if (messageObject3 != null) {
                if (i9 == 1) {
                    i13 = 1;
                    str = null;
                    z10 = false;
                    while (i13 >= 0) {
                        z11 = z10;
                        while (i14 < sparseArrayArr[i13].size()) {
                            messageObjectValueAt = sparseArrayArr[i13].valueAt(i14);
                            if (messageObjectValueAt.isGiveaway()) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                j3 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObjectValueAt.messageOwner.media).until_date) * j2;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                                if (System.currentTimeMillis() < j3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = z12;
                            }
                        }
                        i13--;
                        z10 = z11;
                    }
                } else {
                    i12 = -1;
                    str = null;
                    z10 = false;
                }
                if (z5) {
                    int i311115 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    int i311116 = R.string.SuggestionStarsWillBeLostInfo;
                    Object[] objArr115 = new Object[1];
                    objArr115[i10] = Integer.valueOf(i311115);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i311116, objArr115)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z19) {
                    int i311117 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    int i311118 = R.string.SuggestionTONWillBeLostInfo;
                    Object[] objArr116 = new Object[1];
                    objArr116[i10] = Integer.valueOf(i311117);
                    builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i311118, objArr116)));
                    builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z10) {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                } else {
                    if (z9) {
                        i15 = R.string.Remove;
                    } else {
                        i15 = R.string.Delete;
                    }
                    builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
                }
                builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
                alertDialogCreate = builder5.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i12);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
                }
            }
            if (messageObject3.isGiveaway()) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject3.messageOwner.media).until_date) * j2;
                String str8 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                if (System.currentTimeMillis() < j4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str = str8;
            } else {
                str = null;
            }
            i12 = -1;
            if (z5) {
                int i311119 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder5.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                int i3111110 = R.string.SuggestionStarsWillBeLostInfo;
                Object[] objArr117 = new Object[1];
                objArr117[i10] = Integer.valueOf(i311119);
                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3111110, objArr117)));
                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z19) {
                int i3111111 = (int) MessagesController.getInstance(i8).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder5.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                int i3111112 = R.string.SuggestionTONWillBeLostInfo;
                Object[] objArr118 = new Object[1];
                objArr118[i10] = Integer.valueOf(i3111111);
                builder5.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3111112, objArr118)));
                builder5.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z10) {
                if (z9) {
                    i15 = R.string.Remove;
                } else {
                    i15 = R.string.Delete;
                }
                builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
            } else {
                if (z9) {
                    i15 = R.string.Remove;
                } else {
                    i15 = R.string.Delete;
                }
                builder5.setPositiveButton(LocaleController.getString(i15), onButtonClickListener);
            }
            builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder5.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(i11, runnable2));
            alertDialogCreate = builder5.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(i12);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
            }
            textView2 = (TextView) alertDialogCreate.getButton(-3);
            if (textView2 != null) {
                alertDialogCreate.buttonsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) alertDialogCreate.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, i10));
            }
        }
    }

    public static AlertDialog.Builder createDrawOverlayGroupCallPermissionDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        String res = AndroidUtilities.readRes(R.raw.pip_voice_request);
        final GroupCallPipButton groupCallPipButton = new GroupCallPipButton(context, 0, true);
        groupCallPipButton.setImportantForAccessibility(2);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                groupCallPipButton.setTranslationY((getMeasuredHeight() * 0.28f) - (groupCallPipButton.getMeasuredWidth() / 2.0f));
                groupCallPipButton.setTranslationX((getMeasuredWidth() * 0.82f) - (groupCallPipButton.getMeasuredWidth() / 2.0f));
            }
        };
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        frameLayout.addView(groupCallPipButton, LayoutHelper.createFrame(117, 117.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle));
        builder.setMessage(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall));
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new AlertsCreator$$ExternalSyntheticLambda8(context, 4));
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTopViewAspectRatio(0.5769231f);
        return builder;
    }

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener) {
        return createDrawOverlayPermissionDialog(activity, onButtonClickListener, false);
    }

    public static Dialog createForgotPasscodeDialog(Context context) {
        return new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.ForgotPasscode)).setMessage(LocaleController.getString(R.string.ForgotPasscodeInfo)).setPositiveButton(LocaleController.getString(R.string.Close), null).create();
    }

    public static BottomSheet.Builder createFormattedDatePickerDialog(Context context, FormattedDatePickerDelegate formattedDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i4 = calendar.get(1);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(22));
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker2.setItemCount(5);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(239);
        numberPicker2.setValue(120);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(new AlertsCreator$$ExternalSyntheticLambda139(calendar, i4, i));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setContentDescriptionCallback(new AlertsCreator$$ExternalSyntheticLambda260(i3));
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(24);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(23);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(23));
        final NumberPicker numberPicker4 = new NumberPicker(context, resourcesProvider);
        numberPicker4.setContentDescriptionCallback(new AlertsCreator$$ExternalSyntheticLambda260(i2));
        numberPicker4.setWrapSelectorWheel(true);
        numberPicker4.setAllItemsCount(60);
        numberPicker4.setItemCount(5);
        numberPicker4.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker4.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker4.setMinValue(0);
        numberPicker4.setMaxValue(59);
        numberPicker4.setValue(0);
        numberPicker4.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(24));
        calendar.setTimeInMillis(jCurrentTimeMillis);
        numberPicker4.setValue(calendar.get(12));
        numberPicker3.setValue(calendar.get(11));
        numberPicker.setValue(calendar.get(5));
        numberPicker2.setValue(calendar.get(2) + 120);
        Text maxWidth = new Text(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f).setMaxWidth(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        maxWidth.align(alignment).multiline(1).setColor(scheduleDatePickerColors.textColor);
        final Text color = new Text(":", 18.0f).setMaxWidth(AndroidUtilities.dp(100.0f)).align(alignment).multiline(1).setColor(scheduleDatePickerColors.textColor);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i5, int i6) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i7 = point.x > point.y ? 3 : 5;
                numberPicker2.setItemCount(i7);
                numberPicker.setItemCount(i7);
                numberPicker3.setItemCount(i7);
                numberPicker4.setItemCount(i7);
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                this.ignoreLayout = false;
                super.onMeasure(i5, i6);
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
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(10));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                color.draw(canvas, numberPicker4.getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
            }
        };
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker5, int i5, int i6) {
                AlertsCreator.checkFormattedDateInput(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.2f));
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.4f));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.2f));
        linearLayout2.addView(numberPicker4, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        numberPicker4.setOnValueChangedListener(onValueChangeListener);
        boolean[] zArr = {true};
        buttonWithCounterView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        buttonWithCounterView.setRound();
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda198(zArr, numberPicker, numberPicker2, numberPicker3, numberPicker4, formattedDatePickerDelegate, new int[1], builder));
        bottomSheet.customView = frameLayout;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda41(3, runnable, zArr));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        checkFormattedDateInput(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
        return builder;
    }

    public static Dialog createFreeSpaceDialog(LaunchActivity launchActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity, 0, null);
        builder.setTitle(LocaleController.getString(R.string.LowDiskSpaceTitle));
        builder.setMessage(LocaleController.getString(R.string.LowDiskSpaceMessage2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.LowDiskSpaceButton), new AlertsCreator$$ExternalSyntheticLambda79(launchActivity, 1));
        return builder.create();
    }

    public static AlertDialog.Builder createGigagroupConvertAlert(Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener, AlertDialog.OnButtonClickListener onButtonClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        String res = AndroidUtilities.readRes(R.raw.gigagroup);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        builder.setTopView(frameLayout);
        builder.setTopViewAspectRatio(0.3974359f);
        builder.setTitle(LocaleController.getString(R.string.GigagroupAlertTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText)));
        builder.setPositiveButton(LocaleController.getString(R.string.GigagroupAlertLearnMore), onButtonClickListener);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), onButtonClickListener2);
        return builder;
    }

    public static void createImportDialogAlert(BaseFragment baseFragment, String str, String str2, TLRPC.User user, TLRPC.Chat chat, Runnable runnable) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(parentActivity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(LocaleController.getString(R.string.ImportMessages));
        boolean z = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 11.0f, z ? 76 : 21, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        if (user == null) {
            avatarDrawable.setInfo(currentAccount, chat);
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        } else if (UserObject.isReplyUser(user)) {
            avatarDrawable.setScaleSize(0.8f);
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, user);
        } else if (user.id == clientUserId) {
            avatarDrawable.setScaleSize(0.8f);
            avatarDrawable.setAvatarType(1);
            backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, user);
        } else {
            avatarDrawable.setScaleSize(1.0f);
            avatarDrawable.setInfo(currentAccount, user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
        textView.setText(AndroidUtilities.replaceTags(str2));
        builder.setPositiveButton(LocaleController.getString(R.string.Import), new AlertsCreator$$ExternalSyntheticLambda7(4, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.create());
    }

    public static AlertDialog.Builder createLanguageAlert(LaunchActivity launchActivity, TLRPC.TL_langPackLanguage tL_langPackLanguage) {
        String string;
        int iIndexOf;
        int i = 0;
        if (tL_langPackLanguage == null) {
            return null;
        }
        tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
        tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
        String str = tL_langPackLanguage.base_lang_code;
        if (str != null) {
            tL_langPackLanguage.base_lang_code = str.replace('-', '_').toLowerCase();
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity, 0, null);
        if (LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code)) {
            builder.setTitle(LocaleController.getString(R.string.Language));
            string = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
            builder.setNeutralButton(LocaleController.getString(R.string.SETTINGS), new AlertsCreator$$ExternalSyntheticLambda79(launchActivity, i));
        } else if (tL_langPackLanguage.strings_count == 0) {
            builder.setTitle(LocaleController.getString(R.string.LanguageUnknownTitle));
            string = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
        } else {
            builder.setTitle(LocaleController.getString(R.string.LanguageTitle));
            string = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
            builder.setPositiveButton(LocaleController.getString(R.string.Change), new AIEditorAlert$$ExternalSyntheticLambda34(16, tL_langPackLanguage, launchActivity));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(string));
        int iIndexOf2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
        if (iIndexOf2 != -1) {
            int i2 = iIndexOf2 + 1;
            iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i2);
            if (iIndexOf != -1) {
                spannableStringBuilder.delete(iIndexOf, iIndexOf + 1);
                spannableStringBuilder.delete(iIndexOf2, i2);
            }
        } else {
            iIndexOf = -1;
        }
        if (iIndexOf2 != -1 && iIndexOf != -1) {
            spannableStringBuilder.setSpan(new URLSpanNoUnderline(tL_langPackLanguage.translations_url) {
                @Override
                public void onClick(View view) {
                    builder.getDismissRunnable().run();
                    super.onClick(view);
                }
            }, iIndexOf2, iIndexOf - 1, 33);
        }
        TextView textView = new TextView(launchActivity);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 16.0f);
        textView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
        textView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        builder.setView(textView);
        return builder;
    }

    public static Dialog createLocationRequiredDialog(Context context, boolean z) {
        return new AlertDialog.Builder(context, 0, null).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends))).setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertsCreator$$ExternalSyntheticLambda8(context, 2)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static Dialog createLocationUpdateDialog(Activity activity, boolean z, TLRPC.User user, MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        textView.setTextColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.heightDp = 42;
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i));
            radioColorCell.radioButton.setColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_radioBackground) : Theme.getColor(null, Theme.key_radioBackground, false), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogRadioBackgroundChecked) : Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue(strArr[i], iArr[0] == i);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda14(iArr, linearLayout));
            i++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.LiveLocationAlertExpandTitle));
        } else {
            builder.setTopImage(new ShareLocationDrawable(activity, 0), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTopBackground) : Theme.getColor(null, Theme.key_dialogTopBackground, false));
        }
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.ShareFile), new AIEditorAlert$$ExternalSyntheticLambda34(11, iArr, intCallback));
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static BottomSheet createMuteAlert(final BaseFragment baseFragment, final long j, final long j2, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet bottomSheet = new BottomSheet(baseFragment.getParentActivity(), false, false, resourcesProvider);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(R.string.Notifications);
        bottomSheet.bigTitle = true;
        int i = R.string.MuteFor;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createMuteAlert$197(j, j2, baseFragment, resourcesProvider, dialogInterface, i2);
            }
        };
        bottomSheet.items = charSequenceArr;
        bottomSheet.onClickListener = onClickListener;
        return bottomSheet;
    }

    public static BottomSheet.Builder createMuteForPickerDialog(Context context, Theme.ResourcesProvider resourcesProvider, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        int i = 0;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i2) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    return LocaleController.getString(R.string.MuteNever);
                }
                if (i3 < 60) {
                    return LocaleController.formatPluralString("Minutes", i3, new Object[0]);
                }
                if (i3 < 1440) {
                    return LocaleController.formatPluralString("Hours", i3 / 60, new Object[0]);
                }
                if (i3 < 10080) {
                    return LocaleController.formatPluralString("Days", i3 / 1440, new Object[0]);
                }
                if (i3 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i3 / 10080, new Object[0]);
                }
                return i3 < 525600 ? LocaleController.formatPluralString("Months", i3 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i3 / 525600, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda71(i, iArr));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i4 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i4);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                this.ignoreLayout = false;
                super.onMeasure(i2, i3);
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
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(14));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 1.0f));
        numberPicker.setOnValueChangedListener(new EmojiView$$ExternalSyntheticLambda30(9));
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int i2 = scheduleDatePickerColors.buttonBackgroundColor;
        int i3 = scheduleDatePickerColors.buttonBackgroundPressedColor;
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i2, i3, i3));
        textView2.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda74(iArr, numberPicker, scheduleDatePickerDelegate, builder, 0));
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static AlertDialog.Builder createNoAccessAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(str);
        HashMap map = new HashMap();
        int i = Theme.key_dialogTopBackground;
        map.put("info1", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
        map.put("info2", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
        builder.setTopAnimation(R.raw.not_available, 52, false, Theme.getColor(i, resourcesProvider), map);
        builder.setTopAnimationIsNew(true);
        builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
        builder.setMessage(str2);
        return builder;
    }

    public static BottomSheet.Builder createPollCloseDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        ?? r0;
        ?? r1;
        if (context == null) {
            return null;
        }
        final int i = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i2) {
                return LocaleController.formatPluralString("Hours", i2, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(24);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i2) {
                return LocaleController.formatPluralString("Minutes", i2, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout = new FrameLayout(context);
        ?? r15 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i4 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i4);
                numberPicker2.setItemCount(i4);
                numberPicker3.setItemCount(i4);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                this.ignoreLayout = false;
                super.onMeasure(i2, i3);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        r15.setOrientation(1);
        frameLayout.addView(r15, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout.addView(new FrameLayout(context), LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        r15.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r15.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        TextView textView3 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        textView3.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
        ScaleStateListAnimator.apply(textView3, 0.02f, 1.2f);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(29));
        AlertsCreator$$ExternalSyntheticLambda37 alertsCreator$$ExternalSyntheticLambda37 = new AlertsCreator$$ExternalSyntheticLambda37(i, numberPicker, numberPicker2, numberPicker3, textView2);
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda37);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new EmojiView$$ExternalSyntheticLambda30(1));
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda37);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new EmojiView$$ExternalSyntheticLambda30(2));
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda37);
        if (j <= 0 || j == 2147483646) {
            r0 = frameLayout;
        } else {
            long j2 = 1000 * j;
            r1 = frameLayout;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                r0 = r1;
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
                r0 = r1;
            }
        }
        r0 = r1;
        final boolean[] zArr = {true};
        checkScheduleDate(null, null, i, 3, numberPicker, numberPicker2, numberPicker3);
        checkPollCloseCustomDeadline(textView2, numberPicker, numberPicker2, numberPicker3);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        int i2 = scheduleDatePickerColors.buttonBackgroundColor;
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, i2, Theme.AdaptiveRipple.calcRippleColor(i2)));
        r15.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 14, 15, 14, 16));
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet.Builder builder2 = builder;
                AlertsCreator.lambda$createPollCloseDatePickerDialog$169(zArr, i, numberPicker, numberPicker2, numberPicker3, textView2, calendar, scheduleDatePickerDelegate, builder2, view);
            }
        });
        r15.addView(textView2, LayoutHelper.createLinear(-1, -2, 83, 14, 0, 14, 16));
        bottomSheet.customView = r0;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda41(0, runnable, zArr));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static Dialog createPopupSelectDialog(Activity activity, final int i, final Runnable runnable) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (i == 1) {
            iArr[0] = notificationsSettings.getInt("popupAll", 0);
        } else if (i == 0) {
            iArr[0] = notificationsSettings.getInt("popupGroup", 0);
        } else {
            iArr[0] = notificationsSettings.getInt("popupChannel", 0);
        }
        String[] strArr = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        int i2 = 0;
        while (i2 < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, null);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue(strArr[i2], iArr[0] == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createPopupSelectDialog$217(iArr, i, builder, runnable, view);
                }
            });
            i2++;
        }
        builder.setTitle(LocaleController.getString(R.string.PopupNotification));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static Dialog createPrioritySelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createPrioritySelectDialog(activity, j, i, i2, runnable, null);
    }

    public static void createReportPhotoAlert(int i, final Context context, long j, TLRPC.Photo photo, final Theme.ResourcesProvider resourcesProvider) {
        if (context == null || photo == null) {
            return;
        }
        final AuctionJoinSheet$$ExternalSyntheticLambda0 auctionJoinSheet$$ExternalSyntheticLambda0 = new AuctionJoinSheet$$ExternalSyntheticLambda0(i, context, j, photo, resourcesProvider);
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, true, false, resourcesProvider);
        bottomSheetM.title = LocaleController.getString(R.string.ReportProfilePhoto);
        bottomSheetM.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
        int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
        final int[] iArr2 = {0, 6, 1, 2, 3, 4, 5, 100};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createReportPhotoAlert$200(iArr2, context, resourcesProvider, auctionJoinSheet$$ExternalSyntheticLambda0, dialogInterface, i2);
            }
        };
        bottomSheetM.items = charSequenceArr;
        bottomSheetM.itemIcons = iArr;
        bottomSheetM.onClickListener = onClickListener;
        bottomSheetM.show();
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        return createScheduleDatePickerDialog(context, j, -1L, scheduleDatePickerDelegate, (Runnable) null);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str) {
        return createSimpleAlert(context, null, str);
    }

    public static AlertDialog createSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(str);
        builder.setMessage(charSequence);
        builder.setPositiveButton(str2, new AlertsCreator$$ExternalSyntheticLambda7(10, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static ActionBarPopupWindow createSimplePopup(BaseFragment baseFragment, View view, View view2, float f, float f2) {
        if (baseFragment == null || view2 == null || view == null) {
            return null;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(view, -2, -2);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        float x = 0.0f;
        View view3 = view2;
        float y = 0.0f;
        while (view3 != view2.getRootView()) {
            x += view3.getX();
            y += view3.getY();
            view3 = (View) view3.getParent();
            if (view3 == null) {
                break;
            }
        }
        actionBarPopupWindow.showAtLocation(view2.getRootView(), 0, (int) ((x + f) - (view.getMeasuredWidth() / 2.0f)), (int) ((y + f2) - (view.getMeasuredHeight() / 2.0f)));
        actionBarPopupWindow.dimBehind();
        return actionBarPopupWindow;
    }

    public static void createSimpleTextInputAlert(Context context, BaseFragment baseFragment, String str, String str2, String str3, String str4, final int i, String str5, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(str == null ? LocaleController.getString(R.string.AppName) : str);
        builder.setMessage(str2);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new AlertsCreator$$ExternalSyntheticLambda249(editTextBoldCursor, i, stringCallback, alertDialogArr, currentFocus, 0));
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void afterTextChanged(Editable editable) {
                if (this.ignoreTextChange) {
                    return;
                }
                int length = editable.length();
                int i3 = i;
                if (length > i3) {
                    this.ignoreTextChange = true;
                    editable.delete(i3, editable.length());
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i2, resourcesProvider)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 20.0f, 9.0f, 20.0f, 9.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
        builder.setPositiveButton(str5, new SearchTagsList$$ExternalSyntheticLambda3(editTextBoldCursor, i, stringCallback, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AIEditorAlert$$ExternalSyntheticLambda20(21));
        alertDialogArr[0] = builder.create();
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, baseFragment.getClassGuid());
        }
        AlertDialog alertDialog = alertDialogArr[0];
        alertDialog.dismissDialogByButtons = false;
        alertDialog.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda96(editTextBoldCursor, baseFragment, activityFindActivity, 2));
        alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(1, editTextBoldCursor));
        alertDialogArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static Dialog createSingleChoiceDialog(Activity activity, String[] strArr, String str, int i, DialogInterface.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        int i2 = 0;
        while (i2 < strArr.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, null);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue(strArr[i2], i == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(10, builder, onClickListener));
            i2++;
        }
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static BottomSheet.Builder createSoundFrequencyPickerDialog(Context context, int i, int i2, SoundFrequencyDelegate soundFrequencyDelegate) {
        return createSoundFrequencyPickerDialog(context, i, i2, soundFrequencyDelegate, null);
    }

    public static BottomSheet.Builder createStatusUntilDatePickerDialog(Context context, long j, StatusUntilDatePickerDelegate statusUntilDatePickerDelegate) {
        BottomSheet bottomSheet;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
        BottomSheet bottomSheet2 = builder.bottomSheet;
        bottomSheet2.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
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
        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(13));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda30(3));
        AlertsCreator$$ExternalSyntheticLambda47 alertsCreator$$ExternalSyntheticLambda47 = new AlertsCreator$$ExternalSyntheticLambda47(numberPicker, numberPicker2, numberPicker3, 0);
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new EmojiView$$ExternalSyntheticLambda30(4));
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new EmojiView$$ExternalSyntheticLambda30(5));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        if (j <= 0 || j == 2147483646) {
            bottomSheet = bottomSheet2;
        } else {
            long j2 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            bottomSheet = bottomSheet2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int i = scheduleDatePickerColors.buttonBackgroundColor;
        int i2 = scheduleDatePickerColors.buttonBackgroundPressedColor;
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i, i2, i2));
        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda50(numberPicker, numberPicker2, numberPicker3, calendar, statusUntilDatePickerDelegate, builder, 0));
        BottomSheet bottomSheet3 = bottomSheet;
        bottomSheet3.customView = linearLayout;
        bottomSheet3.show();
        bottomSheet3.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet3.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static void createStoriesAlbumEnterName(Context context, BaseFragment baseFragment, String str, String str2, String str3, String str4, String str5, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createSimpleTextInputAlert(context, baseFragment, str, str2, str3, str4, 12, str5, resourcesProvider, stringCallback);
    }

    public static void createStoriesAlbumEnterNameForCreate(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createStoriesAlbumEnterName(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, LocaleController.getString(R.string.Create), resourcesProvider, stringCallback);
    }

    public static void createStoriesAlbumEnterNameForRename(Context context, BaseFragment baseFragment, String str, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createStoriesAlbumEnterName(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), str, LocaleController.getString(R.string.Rename), resourcesProvider, stringCallback);
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider, int i) {
        return createSuggestedMessageDatePickerDialog(context, j, scheduleDatePickerDelegate, null, new ScheduleDatePickerColors(), resourcesProvider, i);
    }

    public static AlertDialog createSupportAlert(final BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()) {
                @Override
                public void onClick(View view) {
                    baseFragment.dismissCurrentDialog();
                    super.onClick(view);
                }
            }, spanStart, spanEnd, 0);
        }
        linksTextView.setText(spannableString);
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_dialogTextLink, resourcesProvider));
        linksTextView.setHighlightColor(Theme.getColor(Theme.key_dialogLinkSelection, resourcesProvider));
        linksTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider);
        builder.setView(linksTextView);
        builder.setTitle(LocaleController.getString(R.string.AskAQuestion));
        builder.setPositiveButton(LocaleController.getString(R.string.AskButton), new AlertsCreator$$ExternalSyntheticLambda159(baseFragment, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static AlertDialog.Builder createTTLAlert(Context context, TLRPC.EncryptedChat encryptedChat, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.MessageLifetime));
        NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        int i = encryptedChat.ttl;
        if (i > 0 && i < 16) {
            numberPicker.setValue(i);
        } else if (i == 30) {
            numberPicker.setValue(16);
        } else if (i == 60) {
            numberPicker.setValue(17);
        } else if (i == 3600) {
            numberPicker.setValue(18);
        } else if (i == 86400) {
            numberPicker.setValue(19);
        } else if (i == 604800) {
            numberPicker.setValue(20);
        } else if (i == 0) {
            numberPicker.setValue(0);
        }
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda30(6));
        builder.setView(numberPicker);
        builder.setNegativeButton(LocaleController.getString(R.string.Done), new AIEditorAlert$$ExternalSyntheticLambda34(15, encryptedChat, numberPicker));
        return builder;
    }

    public static void createThemeCreateDialog(BaseFragment baseFragment, int i, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        builder.setTitle(LocaleController.getString(R.string.NewTheme));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Create), new EmojiView$$ExternalSyntheticLambda30(8));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i2, false));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new ColorPicker$$ExternalSyntheticLambda1(2));
        editTextBoldCursor.setText(generateThemeName(themeAccent));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(2, editTextBoldCursor));
        baseFragment.showDialog(alertDialogCreate);
        editTextBoldCursor.requestFocus();
        alertDialogCreate.getButton(-1).setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda70(baseFragment, editTextBoldCursor, themeAccent, themeInfo, alertDialogCreate, 0));
    }

    public static BottomSheet createTimePickerDialog(Context context, String str, int i, int i2, int i3, Utilities.Callback<Integer> callback) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet bottomSheet = new BottomSheet(context, false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Hours", i4, new Object[0]);
            }
        };
        LinearLayout linearLayout = new LinearLayout(context) {
            private Text ampmText;
            private boolean isAM;
            private final Text separatorText = new Text(":", 18.0f);

            @Override
            public void dispatchDraw(Canvas canvas) {
                Text text = this.separatorText;
                float width = (getWidth() - this.separatorText.getCurrentWidth()) / 2.0f;
                float height = getHeight() / 2.0f;
                int i4 = Theme.key_windowBackgroundWhiteBlackText;
                text.draw(canvas, width, height, Theme.getColor(null, i4, false), 1.0f);
                if (!LocaleController.is24HourFormat) {
                    boolean z = numberPicker.getValue() % 24 < 12;
                    if (this.isAM != z || this.ampmText == null) {
                        this.isAM = z;
                        this.ampmText = new Text(z ? "AM" : "PM", 18.0f);
                    }
                    this.ampmText.draw(canvas, (getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), Theme.getColor(null, i4, false), 1.0f);
                }
                super.dispatchDraw(canvas);
            }
        };
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        numberPicker.setAllItemsCount(24);
        numberPicker.setItemCount(5);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setGravity(5);
        numberPicker.setTextOffset(-AndroidUtilities.dp(12.0f));
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Minutes", i4, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(60);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setGravity(3);
        numberPicker2.setTextOffset(AndroidUtilities.dp(12.0f));
        final StarGiftSheet$$ExternalSyntheticLambda74 starGiftSheet$$ExternalSyntheticLambda74 = new StarGiftSheet$$ExternalSyntheticLambda74(i2, i3, numberPicker, numberPicker2, i, linearLayout);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setFormatter(new EmojiView$$ExternalSyntheticLambda30(11));
        final int i4 = 0;
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i5, int i6) {
                switch (i4) {
                    case 0:
                        AlertsCreator.lambda$createTimePickerDialog$108(starGiftSheet$$ExternalSyntheticLambda74, numberPicker3, i5, i6);
                        break;
                    default:
                        AlertsCreator.lambda$createTimePickerDialog$110(starGiftSheet$$ExternalSyntheticLambda74, numberPicker3, i5, i6);
                        break;
                }
            }
        });
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new EmojiView$$ExternalSyntheticLambda30(12));
        final int i5 = 1;
        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i6, int i7) {
                switch (i5) {
                    case 0:
                        AlertsCreator.lambda$createTimePickerDialog$108(starGiftSheet$$ExternalSyntheticLambda74, numberPicker3, i6, i7);
                        break;
                    default:
                        AlertsCreator.lambda$createTimePickerDialog$110(starGiftSheet$$ExternalSyntheticLambda74, numberPicker3, i6, i7);
                        break;
                }
            }
        });
        starGiftSheet$$ExternalSyntheticLambda74.run(Boolean.FALSE);
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i6, int i7) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i8 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i8);
                numberPicker2.setItemCount(i8);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i8;
                this.ignoreLayout = false;
                super.onMeasure(i6, i7);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setText(str);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(15));
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, null).setRound();
        round.setText(LocaleController.getString(R.string.Select), false);
        round.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda95(bottomSheetArr, 0));
        linearLayout2.addView(round, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        bottomSheet.customView = linearLayout2;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda96(callback, numberPicker, numberPicker2, 0));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet[] bottomSheetArr = {bottomSheet};
        return bottomSheet;
    }

    public static BottomSheet createTimezonePickerDialog(Context context, String str, String str2, Utilities.Callback<String> callback) {
        final int i = UserConfig.selectedAccount;
        TimezonesController timezonesController = TimezonesController.getInstance(i);
        timezonesController.load();
        if (timezonesController.timezones.isEmpty()) {
            return null;
        }
        TimezonesController timezonesController2 = TimezonesController.getInstance(i);
        timezonesController2.load();
        final ArrayList arrayList = new ArrayList(timezonesController2.timezones);
        Collections.sort(arrayList, new SeekBar$$ExternalSyntheticLambda0(2));
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet bottomSheet = new BottomSheet(context, false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i2) {
                TimezonesController.getInstance(i);
                return TimezonesController.getTimezoneName((TLRPC.TL_timezone) arrayList.get(i2), true);
            }
        };
        numberPicker.setAllItemsCount(24);
        numberPicker.setItemCount(8);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setGravity(17);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(arrayList.size() - 1);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(str2, ((TLRPC.TL_timezone) arrayList.get(i2)).id)) {
                numberPicker.setValue(i2);
                break;
            }
        }
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 432, 1.0f));
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda139(i, arrayList, 0));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
                this.ignoreLayout = false;
                super.onMeasure(i3, i4);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setText(str);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(2));
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false);
        buttonWithCounterView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda95(bottomSheetArr, 1));
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        bottomSheet.customView = linearLayout2;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda96(callback, arrayList, numberPicker));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet[] bottomSheetArr = {bottomSheet};
        return bottomSheet;
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, long j2, boolean z, boolean z2, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String strM;
        if (j != 0) {
            strM = Log.m(j, "vibrate_");
        } else {
            strM = z ? "vibrate_group" : "vibrate_messages";
        }
        return createVibrationSelectDialog(activity, j, j2, strM, runnable, resourcesProvider);
    }

    public static Dialog createWebViewPermissionsRequestDialog(Context context, Theme.ResourcesProvider resourcesProvider, String[] strArr, int i, String str, String str2, Consumer consumer) {
        boolean z;
        if (strArr != null && (context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                String str3 = strArr[i2];
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z = true;
                    break;
                }
                i2++;
            }
        } else {
            z = false;
            break;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog.Builder topAnimation = new AlertDialog.Builder(context, 0, resourcesProvider).setTopAnimation(i, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
        if (z) {
            str = str2;
        }
        return topAnimation.setMessage(AndroidUtilities.replaceTags(str)).setPositiveButton(LocaleController.getString(z ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new AlertsCreator$$ExternalSyntheticLambda239(z, context, atomicBoolean, consumer)).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new AIEditorAlert$$ExternalSyntheticLambda34(14, atomicBoolean, consumer)).setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda43(1, atomicBoolean, consumer)).create();
    }

    public static boolean ensurePaidMessageConfirmation(int i, long j, int i2, Utilities.Callback<Long> callback) {
        return ensurePaidMessageConfirmation(i, j, i2, callback, 0L);
    }

    public static boolean ensurePaidMessagesMultiConfirmation(final int i, final ArrayList<Long> arrayList, int i2, final Utilities.Callback<HashMap<Long, Long>> callback) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        int i3 = 1;
        if (callback == null) {
            return false;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new HashMap<>());
            return false;
        }
        final HashMap<Long, Long> map = new HashMap<>();
        int size = arrayList.size();
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        boolean z = true;
        int i5 = 0;
        while (i4 < size) {
            Long l = arrayList.get(i4);
            i4 += i3;
            Long l2 = l;
            long jLongValue = l2.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= j && jLongValue > j) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
            }
            map.put(l2, Long.valueOf(sendPaidMessagesStars));
            j2 += sendPaidMessagesStars;
            long j3 = j;
            StarsController.getInstance(i, false).sendingMessagesCount.put(l2, Integer.valueOf(i2));
            if (sendPaidMessagesStars > j3) {
                i5++;
            }
            if (sendPaidMessagesStars <= j3 || !z || MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(jLongValue, "ask_paid_message_", "_price"), j3) >= sendPaidMessagesStars) {
                j = 0;
            } else {
                j = 0;
                z = false;
            }
            i3 = 1;
        }
        final long jMax = ((long) Math.max(1, i2)) * j2;
        if (z || jMax <= 0) {
            callback.run(map);
            return false;
        }
        final Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        final Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i5)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) jMax, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i5) * i2))));
        showAlertWithCheckboxWithBalance(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList arrayList2 = arrayList;
                Utilities.Callback callback2 = callback;
                AlertsCreator.lambda$ensurePaidMessagesMultiConfirmation$62(i, arrayList2, jMax, activity, resourcesProvider, callback2, map, (Boolean) obj);
            }
        }, resourcesProvider);
        return true;
    }

    public static boolean ensurePaidMessagesMultiConfirmationTopicKeys(int i, ArrayList<MessagesStorage.TopicKey> arrayList, int i2, Utilities.Callback<HashMap<Long, Long>> callback) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                MessagesStorage.TopicKey topicKey = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(topicKey.dialogId));
            }
        }
        return ensurePaidMessagesMultiConfirmation(i, new ArrayList(hashSet), i2, callback);
    }

    private static String formatPollCloseCustomDeadline(int i) {
        int i2 = i / 86400;
        int i3 = (i % 86400) / 3600;
        int i4 = (i % 3600) / 60;
        return LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, i2 > 0 ? LocaleController.formatPluralString("Days", i2, new Object[0]) : "", i3 > 0 ? LocaleController.formatPluralString("Hours", i3, new Object[0]) : "", i4 > 0 ? LocaleController.formatPluralString("Minutes", i4, new Object[0]) : "").trim());
    }

    private static String generateThemeName(Theme.ThemeAccent themeAccent) {
        Theme.ThemeAccent accent;
        int i;
        List listAsList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List listAsList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap map = new HashMap();
        AlertsCreator$$ExternalSyntheticOutline0.m(9306112, map, "Berry", 14598550, "Brandy");
        AlertsCreator$$ExternalSyntheticOutline0.m(8391495, map, "Cherry", 16744272, "Coral");
        AlertsCreator$$ExternalSyntheticOutline0.m(14372985, map, "Cranberry", 14423100, "Crimson");
        AlertsCreator$$ExternalSyntheticOutline0.m(14725375, map, "Mauve", 16761035, "Pink");
        AlertsCreator$$ExternalSyntheticOutline0.m(16711680, map, "Red", 16711807, "Rose");
        AlertsCreator$$ExternalSyntheticOutline0.m(8406555, map, "Russet", 16720896, "Scarlet");
        AlertsCreator$$ExternalSyntheticOutline0.m(15856113, map, "Seashell", 16724889, "Strawberry");
        AlertsCreator$$ExternalSyntheticOutline0.m(16760576, map, "Amber", 15438707, "Apricot");
        AlertsCreator$$ExternalSyntheticOutline0.m(16508850, map, "Banana", 10601738, "Citrus");
        AlertsCreator$$ExternalSyntheticOutline0.m(11560192, map, "Ginger", 16766720, "Gold");
        AlertsCreator$$ExternalSyntheticOutline0.m(16640272, map, "Lemon", 16753920, "Orange");
        AlertsCreator$$ExternalSyntheticOutline0.m(16770484, map, "Peach", 16739155, "Persimmon");
        AlertsCreator$$ExternalSyntheticOutline0.m(14996514, map, "Sunflower", 15893760, "Tangerine");
        AlertsCreator$$ExternalSyntheticOutline0.m(16763004, map, "Topaz", 16776960, "Yellow");
        AlertsCreator$$ExternalSyntheticOutline0.m(3688720, map, "Clover", 8628829, "Cucumber");
        AlertsCreator$$ExternalSyntheticOutline0.m(5294200, map, "Emerald", 11907932, "Olive");
        AlertsCreator$$ExternalSyntheticOutline0.m(65280, map, "Green", 43115, "Jade");
        AlertsCreator$$ExternalSyntheticOutline0.m(2730887, map, "Jungle", 12582656, "Lime");
        AlertsCreator$$ExternalSyntheticOutline0.m(776785, map, "Malachite", 10026904, "Mint");
        AlertsCreator$$ExternalSyntheticOutline0.m(11394989, map, "Moss", 3234721, "Azure");
        AlertsCreator$$ExternalSyntheticOutline0.m(255, map, "Blue", 18347, "Cobalt");
        AlertsCreator$$ExternalSyntheticOutline0.m(5204422, map, "Indigo", 96647, "Lagoon");
        AlertsCreator$$ExternalSyntheticOutline0.m(7461346, map, "Aquamarine", 1182351, "Ultramarine");
        AlertsCreator$$ExternalSyntheticOutline0.m(128, map, "Navy", 3101086, "Sapphire");
        AlertsCreator$$ExternalSyntheticOutline0.m(7788522, map, "Sky", 32896, "Teal");
        AlertsCreator$$ExternalSyntheticOutline0.m(4251856, map, "Turquoise", 10053324, "Amethyst");
        AlertsCreator$$ExternalSyntheticOutline0.m(5046581, map, "Blackberry", 6373457, "Eggplant");
        AlertsCreator$$ExternalSyntheticOutline0.m(13148872, map, "Lilac", 11894492, "Lavender");
        AlertsCreator$$ExternalSyntheticOutline0.m(13421823, map, "Periwinkle", 8663417, "Plum");
        AlertsCreator$$ExternalSyntheticOutline0.m(6684825, map, "Purple", 14204888, "Thistle");
        AlertsCreator$$ExternalSyntheticOutline0.m(14315734, map, "Orchid", 2361920, "Violet");
        AlertsCreator$$ExternalSyntheticOutline0.m(4137225, map, "Bronze", 3604994, "Chocolate");
        AlertsCreator$$ExternalSyntheticOutline0.m(8077056, map, "Cinnamon", 3153694, "Cocoa");
        AlertsCreator$$ExternalSyntheticOutline0.m(7365973, map, "Coffee", 7956873, "Rum");
        AlertsCreator$$ExternalSyntheticOutline0.m(5113350, map, "Mahogany", 7875865, "Mocha");
        AlertsCreator$$ExternalSyntheticOutline0.m(12759680, map, "Sand", 8924439, "Sienna");
        AlertsCreator$$ExternalSyntheticOutline0.m(7864585, map, "Maple", 15787660, "Khaki");
        AlertsCreator$$ExternalSyntheticOutline0.m(12088115, map, "Copper", 12144200, "Chestnut");
        AlertsCreator$$ExternalSyntheticOutline0.m(15653316, map, "Almond", 16776656, "Cream");
        AlertsCreator$$ExternalSyntheticOutline0.m(12186367, map, "Diamond", 11109127, "Honey");
        AlertsCreator$$ExternalSyntheticOutline0.m(16777200, map, "Ivory", 15392968, "Pearl");
        AlertsCreator$$ExternalSyntheticOutline0.m(15725299, map, "Porcelain", 13745832, "Vanilla");
        AlertsCreator$$ExternalSyntheticOutline0.m(16777215, map, "White", 8421504, "Gray");
        AlertsCreator$$ExternalSyntheticOutline0.m(0, map, "Black", 15266260, "Chrome");
        AlertsCreator$$ExternalSyntheticOutline0.m(3556687, map, "Charcoal", 789277, "Ebony");
        AlertsCreator$$ExternalSyntheticOutline0.m(12632256, map, "Silver", 16119285, "Smoke");
        AlertsCreator$$ExternalSyntheticOutline0.m(2499381, map, "Steel", 5220413, "Apple");
        AlertsCreator$$ExternalSyntheticOutline0.m(8434628, map, "Glacier", 16693933, "Melon");
        AlertsCreator$$ExternalSyntheticOutline0.m(12929932, map, "Mulberry", 11126466, "Opal");
        map.put(5547512, "Blue");
        if (themeAccent == null) {
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            accent = themeInfo.getAccent(false);
        } else {
            accent = themeAccent;
        }
        if (accent == null || (i = accent.accentColor) == 0) {
            i = AndroidUtilities.calcDrawableColor(Theme.getCachedWallpaper())[0];
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        String str = null;
        int i2 = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iRed2 = Color.red(num.intValue());
            int i3 = (iRed + iRed2) / 2;
            int i4 = iRed - iRed2;
            int iGreen2 = iGreen - Color.green(num.intValue());
            int iBlue2 = iBlue - Color.blue(num.intValue());
            int i5 = ((((767 - i3) * iBlue2) * iBlue2) >> 8) + (iGreen2 * 4 * iGreen2) + ((((i3 + 512) * i4) * i4) >> 8);
            if (i5 < i2) {
                str = (String) entry.getValue();
                i2 = i5;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            return Fragment$$ExternalSyntheticOutline0.m((String) listAsList.get(Utilities.random.nextInt(listAsList.size())), " ", str, new StringBuilder());
        }
        StringBuilder sbM = Log.m(str, " ");
        sbM.append((String) listAsList2.get(Utilities.random.nextInt(listAsList2.size())));
        return sbM.toString();
    }

    private static String getFloodWaitString(String str) {
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        return LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]));
    }

    private static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return URL_PATTERN.matcher(str.trim()).matches();
    }

    public static void lambda$checkRestrictedInviteUsers$98(int i, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        BaseFragment lastFragment;
        if (!LaunchActivity.isActive || (lastFragment = LaunchActivity.getLastFragment()) == null || lastFragment.getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(11, lastFragment, lastFragment.getParentActivity(), i, null);
        limitReachedBottomSheet.setRestrictedUsers(chat, arrayList, arrayList2, arrayList3, null);
        limitReachedBottomSheet.show();
    }

    public static void lambda$createAccountSelectDialog$221(AlertDialog[] alertDialogArr, Runnable runnable, AccountSelectDelegate accountSelectDelegate, View view) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.setOnDismissListener(null);
        }
        runnable.run();
        accountSelectDelegate.didSelectAccount(((AccountSelectCell) view).getAccountNumber());
    }

    public static void lambda$createApkRestrictedDialog$6(Context context, AlertDialog alertDialog, int i) {
        try {
            context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static String lambda$createAutoDeleteDatePickerDialog$177(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 == 0) {
            return LocaleController.getString(R.string.AutoDeleteNever);
        }
        if (i2 < 10080) {
            return LocaleController.formatPluralString("Days", i2 / 1440, new Object[0]);
        }
        if (i2 < 44640) {
            return LocaleController.formatPluralString("Weeks", i2 / 10080, new Object[0]);
        }
        return i2 < 525600 ? LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
    }

    public static boolean lambda$createAutoDeleteDatePickerDialog$178(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createAutoDeleteDatePickerDialog$179(AnimatedTextView animatedTextView, NumberPicker numberPicker, int i, int i2) {
        try {
            if (i2 == 0) {
                animatedTextView.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$createAutoDeleteDatePickerDialog$180(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()], 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createBackgroundActivityDialog$1(Context context, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$createBackgroundLocationPermissionDialog$209(Activity activity, AlertDialog alertDialog, int i) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static boolean lambda$createBirthdayPickerDialog$142(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createBirthdayPickerDialog$143(NumberPicker numberPicker, int i, NumberPicker numberPicker2, NumberPicker numberPicker3, int i2, int i3, int i4) {
        if (numberPicker.getValue() == i) {
            numberPicker2.setMinValue(1);
            try {
                numberPicker2.setMaxValue(YearMonth.of(2024, numberPicker3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                numberPicker2.setMaxValue(31);
            }
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(11);
            return;
        }
        if (numberPicker.getValue() != i2) {
            numberPicker2.setMinValue(1);
            try {
                numberPicker2.setMaxValue(YearMonth.of(numberPicker.getValue(), numberPicker3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                FileLog.e(e2);
                numberPicker2.setMaxValue(31);
            }
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(11);
            return;
        }
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(i3);
        if (numberPicker3.getValue() == i3) {
            numberPicker2.setMinValue(1);
            numberPicker2.setMaxValue(i4);
            return;
        }
        numberPicker2.setMinValue(1);
        try {
            numberPicker2.setMaxValue(YearMonth.of(numberPicker.getValue(), numberPicker3.getValue() + 1).lengthOfMonth());
        } catch (Exception e3) {
            FileLog.e(e3);
            numberPicker2.setMaxValue(31);
        }
    }

    public static String lambda$createBirthdayPickerDialog$144(int i) {
        return DiffUtil.m(i, "");
    }

    public static void lambda$createBirthdayPickerDialog$145(Runnable runnable, NumberPicker numberPicker, int i) {
        if (i == 0) {
            runnable.run();
        }
    }

    public static String lambda$createBirthdayPickerDialog$146(int i) {
        switch (i) {
            case 0:
                return LocaleController.getString(R.string.January);
            case 1:
                return LocaleController.getString(R.string.February);
            case 2:
                return LocaleController.getString(R.string.March);
            case 3:
                return LocaleController.getString(R.string.April);
            case 4:
                return LocaleController.getString(R.string.May);
            case 5:
                return LocaleController.getString(R.string.June);
            case 6:
                return LocaleController.getString(R.string.July);
            case 7:
                return LocaleController.getString(R.string.August);
            case 8:
                return LocaleController.getString(R.string.September);
            case 9:
                return LocaleController.getString(R.string.October);
            case 10:
                return LocaleController.getString(R.string.November);
            default:
                return LocaleController.getString(R.string.December);
        }
    }

    public static String lambda$createBirthdayPickerDialog$147(int i, int i2) {
        return i2 == i ? "—" : String.format("%02d", Integer.valueOf(i2));
    }

    public static void lambda$createBirthdayPickerDialog$148(ArrayList arrayList) {
        BaseFragment lastFragment;
        if (arrayList == null || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        lastFragment.showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public static void lambda$createBirthdayPickerDialog$149(int i, LinkSpanDrawable.LinksTextView linksTextView) {
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i).getPrivacyRules(11);
        String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
        if (privacyRules != null && !privacyRules.isEmpty()) {
            for (int i2 = 0; i2 < privacyRules.size(); i2++) {
                if (privacyRules.get(i2) instanceof TLRPC.TL_privacyValueAllowContacts) {
                    string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                    break;
                }
                if ((privacyRules.get(i2) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i2) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                }
            }
        }
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new AlertsCreator$$ExternalSyntheticLambda156(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
    }

    public static void lambda$createBirthdayPickerDialog$151(NumberPicker numberPicker, int i, Runnable runnable, View view) {
        numberPicker.setValue(i);
        runnable.run();
    }

    public static void lambda$createBirthdayPickerDialog$152(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i, BottomSheet.Builder builder, Utilities.Callback callback, View view) {
        TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
        tL_birthday.day = numberPicker.getValue();
        tL_birthday.month = numberPicker2.getValue() + 1;
        if (numberPicker3.getValue() != i) {
            tL_birthday.flags |= 1;
            tL_birthday.year = numberPicker3.getValue();
        }
        builder.bottomSheet.dismissRunnable.run();
        callback.run(tL_birthday);
    }

    public static void lambda$createBirthdayPickerDialog$153(BottomSheet.Builder builder, Utilities.Callback callback, View view) {
        builder.bottomSheet.dismissRunnable.run();
        callback.run(null);
    }

    public static void lambda$createBlockDialogAlert$100(BlockDialogCallback blockDialogCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        blockDialogCallback.run(zArr[0], zArr[1]);
    }

    public static void lambda$createBlockDialogAlert$99(boolean[] zArr, int i, View view) {
        boolean z = !zArr[i];
        zArr[i] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createBotLaunchAlert$52(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void lambda$createBotLaunchAlert$53(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createBotLaunchAlert$54(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createBotLaunchAlert$55(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static void lambda$createBotLaunchAlert$56(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void lambda$createBotLaunchAlert$57(AtomicBoolean atomicBoolean, View view) {
        atomicBoolean.set(!atomicBoolean.get());
        ((CheckBoxCell) view).setChecked(atomicBoolean.get(), true);
    }

    public static void lambda$createBotLaunchAlert$59(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static boolean lambda$createCalendarPickerDialog$191(View view, MotionEvent motionEvent) {
        return true;
    }

    public static String lambda$createCalendarPickerDialog$192(int i) {
        return DiffUtil.m(i, "");
    }

    public static String lambda$createCalendarPickerDialog$194(int i) {
        switch (i) {
            case 0:
                return LocaleController.getString(R.string.January);
            case 1:
                return LocaleController.getString(R.string.February);
            case 2:
                return LocaleController.getString(R.string.March);
            case 3:
                return LocaleController.getString(R.string.April);
            case 4:
                return LocaleController.getString(R.string.May);
            case 5:
                return LocaleController.getString(R.string.June);
            case 6:
                return LocaleController.getString(R.string.July);
            case 7:
                return LocaleController.getString(R.string.August);
            case 8:
                return LocaleController.getString(R.string.September);
            case 9:
                return LocaleController.getString(R.string.October);
            case 10:
                return LocaleController.getString(R.string.November);
            default:
                return LocaleController.getString(R.string.December);
        }
    }

    public static String lambda$createCalendarPickerDialog$195(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createCalendarPickerDialog$196(long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, MessagesStorage.IntCallback intCallback, BottomSheet.Builder builder, View view) {
        checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
        calendar.set(1, numberPicker3.getValue());
        calendar.set(2, numberPicker2.getValue());
        calendar.set(5, numberPicker.getValue());
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(13, 0);
        intCallback.run((int) (calendar.getTimeInMillis() / 1000));
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createCallDialogAlert$85(BaseFragment baseFragment, TLRPC.User user, boolean z, AlertDialog alertDialog, int i) {
        TLRPC.UserFull userFull = baseFragment.getMessagesController().getUserFull(user.id);
        VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, baseFragment.getParentActivity(), userFull, baseFragment.getAccountInstance());
    }

    public static void lambda$createChangeBioAlert$86(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$createChangeBioAlert$87(long j, int i, EditText editText, AlertDialog alertDialog, int i2) {
        int i3 = 2;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(UserConfig.getInstance(i).getClientUserId());
            String strTrim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
            if (userFull != null) {
                String str = userFull.about;
                if ((str != null ? str : "").equals(strTrim)) {
                    AndroidUtilities.hideKeyboard(editText);
                    alertDialog.dismiss();
                    return;
                } else {
                    userFull.about = strTrim;
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                }
            }
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.about = strTrim;
            updateprofile.flags = 4 | updateprofile.flags;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new EmojiView$23$$ExternalSyntheticLambda0(i3), 2);
        } else {
            long j2 = -j;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j2);
            String string = editText.getText().toString();
            if (chatFull != null) {
                String str2 = chatFull.about;
                if ((str2 != null ? str2 : "").equals(string)) {
                    AndroidUtilities.hideKeyboard(editText);
                    alertDialog.dismiss();
                    return;
                } else {
                    chatFull.about = string;
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
                    int i4 = NotificationCenter.chatInfoDidLoad;
                    Boolean bool = Boolean.FALSE;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, chatFull, 0, bool, bool);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            MessagesController.getInstance(i).updateChatAbout(j2, string, chatFull);
        }
        alertDialog.dismiss();
    }

    public static boolean lambda$createChangeBioAlert$89(long j, AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && (j <= 0 || keyEvent.getKeyCode() != 66)) || !alertDialog.isShowing()) {
            return false;
        }
        onButtonClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void lambda$createChangeNameAlert$90(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$createChangeNameAlert$91(EditText editText, long j, int i, EditText editText2, AlertDialog alertDialog, int i2) {
        int i3 = 1;
        if (editText.getText() == null) {
            return;
        }
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            String string = editText.getText().toString();
            String string2 = editText2.getText().toString();
            String str = user.first_name;
            String str2 = user.last_name;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(string) && str2.equals(string2)) {
                alertDialog.dismiss();
                return;
            }
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = string;
            user.first_name = string;
            updateprofile.last_name = string2;
            user.last_name = string2;
            TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
            if (user2 != null) {
                user2.first_name = updateprofile.first_name;
                user2.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(i).saveConfig(true);
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new EmojiView$23$$ExternalSyntheticLambda0(i3));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j));
        } else {
            long j2 = -j;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
            String string3 = editText.getText().toString();
            String str3 = chat.title;
            if (str3 != null && str3.equals(string3)) {
                alertDialog.dismiss();
                return;
            }
            chat.title = string3;
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
            MessagesController.getInstance(i).changeChatTitle(j2, string3);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j));
        }
        alertDialog.dismiss();
    }

    public static void lambda$createChangeNameAlert$92(EditText editText, EditText editText2, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editText);
        AndroidUtilities.hideKeyboard(editText2);
    }

    public static boolean lambda$createChangeNameAlert$93(AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && keyEvent.getKeyCode() != 66) || !alertDialog.isShowing()) {
            return false;
        }
        onButtonClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void lambda$createClearDaysDialogAlert$83(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearDaysDialogAlert$84(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        booleanCallback.run(zArr[0]);
    }

    public static void lambda$createClearOrDeleteDialogAlert$69(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearOrDeleteDialogAlert$70(boolean z, TLRPC.Chat chat, AlertDialog.Builder builder, boolean[] zArr) {
        if (z && ChatObject.isChannel(chat)) {
            View button = builder.create().getButton(-1);
            if (button instanceof TextView) {
                TextView textView = (TextView) button;
                if (zArr[0]) {
                    textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ChannelDelete : R.string.DeleteMega));
                    return;
                }
                if (chat.monoforum) {
                    textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                } else if (chat.megagroup) {
                    textView.setText(LocaleController.getString(R.string.LeaveMega));
                } else {
                    textView.setText(LocaleController.getString(R.string.LeaveChannel));
                }
            }
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$71(boolean[] zArr, Runnable runnable, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
        runnable.run();
    }

    public static void lambda$createClearOrDeleteDialogAlert$72(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean[] zArr, boolean z3, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider, int i) {
        if (i >= 50) {
            createClearOrDeleteDialogAlert(baseFragment, z, true, chat, user, false, z2, zArr[0], z3, booleanCallback, resourcesProvider);
        } else if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$73(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$74(int i, MessagesStorage.BooleanCallback booleanCallback) {
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda154(0, booleanCallback), 250L);
    }

    public static void lambda$createClearOrDeleteDialogAlert$75(Context context, TLRPC.Chat chat, TLRPC.User user, int i, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        new SelectChatUserSheet(context, chat, user, new EmojiView$$ExternalSyntheticLambda9(i, booleanCallback, 5), resourcesProvider).show();
    }

    public static void lambda$createClearOrDeleteDialogAlert$76(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$77(Browser.Progress progress, MessagesStorage.BooleanCallback booleanCallback, boolean z, boolean[] zArr, BaseFragment baseFragment, TLRPC.Chat chat, Context context, int i, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLRPC.TL_error tL_error) {
        boolean z2;
        progress.end();
        TLRPC.User user2 = user;
        if (user2 instanceof TLRPC.TL_userEmpty) {
            user2 = null;
        }
        TLRPC.User user3 = user2;
        if (user3 != null) {
            showLeaveGroupWithFutureOwner(baseFragment, chat, user3, new OAuthSheet$$ExternalSyntheticLambda16(context, chat, user3, i, booleanCallback, resourcesProvider), new AlertsCreator$$ExternalSyntheticLambda154(1, booleanCallback));
        } else if (booleanCallback != null) {
            if (!z) {
                z2 = zArr[0];
            }
            booleanCallback.run(z2);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$78(boolean z, final boolean z2, boolean z3, final TLRPC.User user, final BaseFragment baseFragment, final boolean z4, final TLRPC.Chat chat, final boolean z5, final boolean[] zArr, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider, AlertDialog.Builder builder, final int i, final Context context, AlertDialog alertDialog, int i2) {
        boolean z7 = true;
        if (!z && !z2 && !z3) {
            if (UserObject.isUserSelf(user)) {
                createClearOrDeleteDialogAlert(baseFragment, z4, true, chat, user, false, z5, zArr[0], z6, booleanCallback, resourcesProvider);
                return;
            }
            if (user != null && zArr[0]) {
                MessagesStorage.getInstance(baseFragment.getCurrentAccount()).getMessagesCount(user.id, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i3) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$72(baseFragment, z4, chat, user, z5, zArr, z6, booleanCallback, resourcesProvider, i3);
                    }
                });
                return;
            }
            if (ChatObject.isChannel(chat) && chat.creator && !zArr[0]) {
                final Browser.Progress progressMakeButtonLoading = builder.create().makeButtonLoading(-1, true, true);
                progressMakeButtonLoading.init();
                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat);
                ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        Browser.Progress progress = progressMakeButtonLoading;
                        boolean[] zArr2 = zArr;
                        TLRPC.Chat chat2 = chat;
                        int i3 = i;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$77(progress, booleanCallback, z2, zArr2, baseFragment, chat2, context, i3, resourcesProvider2, (TLRPC.User) obj, (TLRPC.TL_error) obj2);
                    }
                });
                return;
            }
        }
        if (booleanCallback != null) {
            if (!z2 && !zArr[0]) {
                z7 = false;
            }
            booleanCallback.run(z7);
        }
    }

    public static void lambda$createClearOrDeleteDialogsAlert$81(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearOrDeleteDialogsAlert$82(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void lambda$createColorSelectDialog$202(LinearLayout linearLayout, int[] iArr, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioColorCell radioColorCell = (RadioColorCell) linearLayout.getChildAt(i);
            radioColorCell.radioButton.setChecked(radioColorCell == view, true);
        }
        iArr[0] = TextColorCell.colorsToSave[((Integer) view.getTag()).intValue()];
    }

    public static void lambda$createColorSelectDialog$203(long j, String str, int[] iArr, long j2, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            editorEdit.putInt(zzii.m("color_", str), iArr[0]);
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j, j2);
        } else {
            if (i == 1) {
                editorEdit.putInt("MessagesLed", iArr[0]);
            } else if (i == 0) {
                editorEdit.putInt("GroupLed", iArr[0]);
            } else if (i == 3) {
                editorEdit.putInt("StoriesLed", iArr[0]);
            } else if (i == 5 || i == 4) {
                editorEdit.putInt("ReactionLed", iArr[0]);
            } else {
                editorEdit.putInt("ChannelLed", iArr[0]);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i);
        }
        editorEdit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createColorSelectDialog$204(long j, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            editorEdit.putInt("color_" + j, 0);
        } else if (i == 1) {
            editorEdit.putInt("MessagesLed", 0);
        } else if (i == 0) {
            editorEdit.putInt("GroupLed", 0);
        } else if (i == 3) {
            editorEdit.putInt("StoriesLed", 0);
        } else if (i == 5 || i == 4) {
            editorEdit.putInt("ReactionsLed", 0);
        } else {
            editorEdit.putInt("ChannelLed", 0);
        }
        editorEdit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createColorSelectDialog$205(String str, Runnable runnable, AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        editorEdit.remove("color_" + str);
        editorEdit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createContactInviteDialog$97(String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(baseFragment.getCurrentAccount()).getInviteText(1));
            baseFragment.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static String lambda$createCustomPicker$263(String[] strArr, int i) {
        return strArr[i];
    }

    public static boolean lambda$createCustomPicker$264(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createCustomPicker$265(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void lambda$createCustomPicker$266(Utilities.Callback callback, NumberPicker numberPicker, DialogInterface dialogInterface) {
        callback.run(Integer.valueOf(numberPicker.getValue()));
    }

    public static void lambda$createDatePickerDialog$114(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static String lambda$createDatePickerDialog$115(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, i);
        return calendar.getDisplayName(2, 1, Locale.getDefault());
    }

    public static void lambda$createDatePickerDialog$117(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$119(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$120(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DatePickerDelegate datePickerDelegate, AlertDialog alertDialog, int i) {
        if (z) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
        datePickerDelegate.didSelectDate(numberPicker3.getValue(), numberPicker2.getValue(), numberPicker.getValue());
    }

    public static boolean lambda$createDatePickerDialog$136(View view, MotionEvent motionEvent) {
        return true;
    }

    public static String lambda$createDatePickerDialog$137(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        return calendar.get(1) == i2 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
    }

    public static String lambda$createDatePickerDialog$139(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createDatePickerDialog$140(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createDatePickerDialog$141(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        boolean zCheckScheduleDate = checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, numberPicker.getValue());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createDeleteMessagesAlert$222(MessageObject.GroupedMessages groupedMessages, int i, BaseFragment baseFragment, int i2, int i3, MessageObject messageObject, AlertDialog alertDialog, int i4) {
        if (groupedMessages == null || groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(i).editMessage(messageObject, null, false, baseFragment, null, i2 + i3, i3);
        } else {
            SendMessagesHelper.getInstance(i).editMessage(groupedMessages.messages.get(0), null, false, baseFragment, null, i2 + i3, i3);
        }
    }

    public static void lambda$createDeleteMessagesAlert$223(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
        ArrayList<Long> arrayList;
        TLRPC.Peer peer;
        long clientUserId = z ? UserConfig.getInstance(i).getClientUserId() : j;
        ArrayList<Long> arrayList2 = null;
        long j3 = 0;
        if (messageObject != null) {
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            if (groupedMessages != null) {
                for (int i5 = 0; i5 < groupedMessages.messages.size(); i5++) {
                    MessageObject messageObject2 = groupedMessages.messages.get(i5);
                    arrayList3.add(Integer.valueOf(messageObject2.getId()));
                    if (encryptedChat != null && messageObject2.messageOwner.random_id != 0 && messageObject2.type != 10) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        arrayList2.add(Long.valueOf(messageObject2.messageOwner.random_id));
                    }
                }
            } else {
                arrayList3.add(Integer.valueOf(messageObject.getId()));
                if (encryptedChat != null && messageObject.messageOwner.random_id != 0 && messageObject.type != 10) {
                    arrayList2 = new ArrayList<>();
                    arrayList2.add(Long.valueOf(messageObject.messageOwner.random_id));
                }
            }
            MessagesController.getInstance(i).deleteMessages(arrayList3, arrayList2, encryptedChat, (j2 == 0 || (peer = messageObject.messageOwner.peer_id) == null || peer.chat_id != (-j2)) ? clientUserId : j2, i2, true, i3);
        } else {
            int i6 = 1;
            while (i6 >= 0) {
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                for (int i7 = 0; i7 < sparseArrayArr[i6].size(); i7++) {
                    arrayList4.add(Integer.valueOf(sparseArrayArr[i6].keyAt(i7)));
                }
                if (encryptedChat != null) {
                    ArrayList<Long> arrayList5 = new ArrayList<>();
                    int i8 = 0;
                    while (i8 < sparseArrayArr[i6].size()) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i6].valueAt(i8);
                        long j4 = j3;
                        long j5 = messageObject3.messageOwner.random_id;
                        if (j5 != j4 && messageObject3.type != 10) {
                            arrayList5.add(Long.valueOf(j5));
                        }
                        i8++;
                        j3 = j4;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                long j6 = j3;
                MessagesController.getInstance(i).deleteMessages(arrayList4, arrayList, encryptedChat, (i6 != 1 || j2 == j6) ? clientUserId : j2, i2, true, i3);
                sparseArrayArr[i6].clear();
                i6--;
                j3 = j6;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$224(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean lambda$createDeleteMessagesAlert$225(MessageObject messageObject) {
        return !messageObject.isEphemeral();
    }

    public static TLObject lambda$createDeleteMessagesAlert$226(int i, long j) {
        return j > 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j)) : MessagesController.getInstance(i).getChat(Long.valueOf(-j));
    }

    public static boolean lambda$createDeleteMessagesAlert$227(long j, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id != j;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return !ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
        }
        return false;
    }

    public static void lambda$createDeleteMessagesAlert$228(int[] iArr, int[] iArr2, int i, TLObject tLObject, TLRPC.ChannelParticipant[] channelParticipantArr, int i2, AlertDialog[] alertDialogArr, BaseFragment baseFragment, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, TLRPC.ChatFull chatFull, long j, MessageObject messageObject, SparseArray[] sparseArrayArr, MessageObject.GroupedMessages groupedMessages, int i3, int i4, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        iArr[0] = iArr[0] + 1;
        iArr2[i] = 0;
        if (tLObject != null) {
            channelParticipantArr[i] = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
        }
        if (iArr[0] == i2) {
            try {
                alertDialogArr[0].dismiss();
            } catch (Throwable unused) {
            }
            alertDialogArr[0] = null;
            createDeleteMessagesAlert(baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i3, i4, channelParticipantArr, runnable, runnable2, resourcesProvider);
        }
    }

    public static void lambda$createDeleteMessagesAlert$229(final int[] iArr, final int[] iArr2, final int i, final TLRPC.ChannelParticipant[] channelParticipantArr, final int i2, final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i3, final int i4, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createDeleteMessagesAlert$228(iArr, iArr2, i, tLObject, channelParticipantArr, i2, alertDialogArr, baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i3, i4, runnable, runnable2, resourcesProvider);
            }
        });
    }

    public static void lambda$createDeleteMessagesAlert$230(int[] iArr, int i, Runnable runnable, DialogInterface dialogInterface) {
        for (int i2 : iArr) {
            if (i2 != 0) {
                ConnectionsManager.getInstance(i).cancelRequest(i2, true);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$231(AlertDialog[] alertDialogArr, final int[] iArr, final int i, final Runnable runnable, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createDeleteMessagesAlert$230(iArr, i, runnable, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void lambda$createDeleteMessagesAlert$233(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createDeleteMessagesAlert$234(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createDeleteMessagesAlert$235(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, boolean[] zArr, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
        ArrayList<Long> arrayList;
        long j3;
        TLRPC.Peer peer;
        long clientUserId = z ? UserConfig.getInstance(i).getClientUserId() : j;
        ArrayList<Long> arrayList2 = null;
        int i5 = 0;
        if (messageObject != null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<Integer> arrayList4 = new ArrayList<>();
            if (groupedMessages != null) {
                for (int i6 = 0; i6 < groupedMessages.messages.size(); i6++) {
                    MessageObject messageObject2 = groupedMessages.messages.get(i6);
                    if (messageObject2.isEphemeral()) {
                        arrayList3.add(messageObject2);
                    } else {
                        arrayList4.add(Integer.valueOf(messageObject2.getId()));
                        if (encryptedChat != null) {
                            if (messageObject2.messageOwner.random_id != 0 && messageObject2.type != 10) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList<>();
                                }
                                arrayList2.add(Long.valueOf(messageObject2.messageOwner.random_id));
                            }
                        }
                    }
                }
                j3 = 0;
            } else {
                j3 = 0;
                if (messageObject.isEphemeral()) {
                    arrayList3.add(messageObject);
                } else {
                    arrayList4.add(Integer.valueOf(messageObject.getId()));
                    if (encryptedChat != null && messageObject.messageOwner.random_id != 0 && messageObject.type != 10) {
                        arrayList2 = new ArrayList<>();
                        arrayList2.add(Long.valueOf(messageObject.messageOwner.random_id));
                    }
                }
            }
            ArrayList<Long> arrayList5 = arrayList2;
            long j4 = (j2 == j3 || (peer = messageObject.messageOwner.peer_id) == null || peer.chat_id != (-j2)) ? clientUserId : j2;
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(i).deleteMessages(arrayList4, arrayList5, encryptedChat, j4, i2, zArr[0], i3);
            }
            long j5 = j4;
            int size = arrayList3.size();
            while (i5 < size) {
                Object obj = arrayList3.get(i5);
                i5++;
                MessagesController.getInstance(i).deleteEphemeralMessage(j5, i2, (MessageObject) obj);
            }
        } else {
            int i7 = 1;
            while (i7 >= 0) {
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i8 = 0; i8 < sparseArrayArr[i7].size(); i8++) {
                    arrayList6.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i8)));
                }
                if (encryptedChat != null) {
                    ArrayList<Long> arrayList7 = new ArrayList<>();
                    for (int i9 = 0; i9 < sparseArrayArr[i7].size(); i9++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i7].valueAt(i9);
                        long j6 = messageObject3.messageOwner.random_id;
                        if (j6 != 0 && messageObject3.type != 10) {
                            arrayList7.add(Long.valueOf(j6));
                        }
                    }
                    arrayList = arrayList7;
                } else {
                    arrayList = null;
                }
                MessagesController.getInstance(i).deleteMessages(arrayList6, arrayList, encryptedChat, (i7 != 1 || j2 == 0) ? clientUserId : j2, i2, zArr[0], i3);
                sparseArrayArr[i7].clear();
                i7--;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$236(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDrawOverlayGroupCallPermissionDialog$212(Context context, AlertDialog alertDialog, int i) {
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                    Activity activityFindActivity = AndroidUtilities.findActivity(context);
                    if (activityFindActivity instanceof LaunchActivity) {
                        activityFindActivity.startActivityForResult(intent, 105);
                    } else {
                        context.startActivity(intent);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$createDrawOverlayPermissionDialog$211(Activity activity, boolean z, AlertDialog alertDialog, int i) {
        if (activity == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (z && PipUtils.checkPermissions(activity) == -2) {
            try {
                activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                return;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static String lambda$createFormattedDatePickerDialog$154(int i) {
        return DiffUtil.m(i, "");
    }

    public static String lambda$createFormattedDatePickerDialog$155(Calendar calendar, int i, int i2) {
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, 0);
        calendar.add(2, i2 - 120);
        return calendar.get(1) == i ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    public static CharSequence lambda$createFormattedDatePickerDialog$156(Integer num) {
        return LocaleController.formatPluralString("Hours", num.intValue(), new Object[0]);
    }

    public static String lambda$createFormattedDatePickerDialog$157(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static CharSequence lambda$createFormattedDatePickerDialog$158(Integer num) {
        return LocaleController.formatPluralString("Minutes", num.intValue(), new Object[0]);
    }

    public static String lambda$createFormattedDatePickerDialog$159(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static boolean lambda$createFormattedDatePickerDialog$160(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createFormattedDatePickerDialog$162(boolean[] zArr, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, FormattedDatePickerDelegate formattedDatePickerDelegate, int[] iArr, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        formattedDatePickerDelegate.didSelectDate((int) (checkFormattedDateInput(null, numberPicker, numberPicker2, numberPicker3, numberPicker4) / 1000), iArr[0]);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createFormattedDatePickerDialog$163(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void lambda$createFreeSpaceDialog$215(LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
        launchActivity.lambda$runLinkRequest$100(new CacheControlActivity());
    }

    public static void lambda$createImportDialogAlert$51(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createLanguageAlert$10(LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
        launchActivity.lambda$runLinkRequest$100(new LanguageSelectActivity());
    }

    public static void lambda$createLanguageAlert$11(TLRPC.TL_langPackLanguage tL_langPackLanguage, LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
        String str;
        if (tL_langPackLanguage.official) {
            str = "remote_" + tL_langPackLanguage.lang_code;
        } else {
            str = "unofficial_" + tL_langPackLanguage.lang_code;
        }
        LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
        if (languageFromDict == null) {
            languageFromDict = new LocaleController.LocaleInfo();
            languageFromDict.name = tL_langPackLanguage.native_name;
            languageFromDict.nameEnglish = tL_langPackLanguage.name;
            languageFromDict.shortName = tL_langPackLanguage.lang_code;
            languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
            languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
            languageFromDict.isRtl = tL_langPackLanguage.rtl;
            if (tL_langPackLanguage.official) {
                languageFromDict.pathToFile = "remote";
            } else {
                languageFromDict.pathToFile = "unofficial";
            }
        }
        LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
        launchActivity.rebuildAllFragments(true);
    }

    public static void lambda$createLocationRequiredDialog$0(Context context, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$createLocationUpdateDialog$207(int[] iArr, LinearLayout linearLayout, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof RadioColorCell) {
                ((RadioColorCell) childAt).radioButton.setChecked(childAt == view, true);
            }
        }
    }

    public static void lambda$createLocationUpdateDialog$208(int[] iArr, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
        int i2;
        int i3 = iArr[0];
        if (i3 == 0) {
            i2 = 900;
        } else if (i3 == 1) {
            i2 = 3600;
        } else {
            i2 = i3 == 2 ? 28800 : Integer.MAX_VALUE;
        }
        intCallback.run(i2);
    }

    public static void lambda$createMuteAlert$197(long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 1;
        } else {
            i2 = i == 2 ? 2 : 3;
        }
        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j, j2, i2);
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, i2, 0, resourcesProvider).show();
        }
    }

    public static void lambda$createMuteAlert$198(ArrayList arrayList, int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i2) {
        int i3;
        if (i2 == 0) {
            i3 = 0;
        } else if (i2 == 1) {
            i3 = 1;
        } else {
            i3 = i2 == 2 ? 2 : 3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i4)).longValue(), i, i3);
            }
        }
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, i3, 0, resourcesProvider).show();
        }
    }

    public static String lambda$createMuteForPickerDialog$187(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 == 0) {
            return LocaleController.getString(R.string.MuteNever);
        }
        if (i2 < 60) {
            return LocaleController.formatPluralString("Minutes", i2, new Object[0]);
        }
        if (i2 < 1440) {
            return LocaleController.formatPluralString("Hours", i2 / 60, new Object[0]);
        }
        if (i2 < 10080) {
            return LocaleController.formatPluralString("Days", i2 / 1440, new Object[0]);
        }
        if (i2 < 44640) {
            return LocaleController.formatPluralString("Weeks", i2 / 10080, new Object[0]);
        }
        return i2 < 525600 ? LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
    }

    public static boolean lambda$createMuteForPickerDialog$188(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createMuteForPickerDialog$189(NumberPicker numberPicker, int i, int i2) {
    }

    public static void lambda$createMuteForPickerDialog$190(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()] * 60, 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static boolean lambda$createPollCloseDatePickerDialog$164(View view, MotionEvent motionEvent) {
        return true;
    }

    public static String lambda$createPollCloseDatePickerDialog$165(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        if (calendar.get(1) != i2) {
            return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
    }

    public static void lambda$createPollCloseDatePickerDialog$166(int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TextView textView, NumberPicker numberPicker4, int i2, int i3) {
        checkScheduleDate(null, null, i, 3, numberPicker, numberPicker2, numberPicker3);
        checkPollCloseCustomDeadline(textView, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createPollCloseDatePickerDialog$167(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createPollCloseDatePickerDialog$168(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createPollCloseDatePickerDialog$169(boolean[] zArr, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TextView textView, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        boolean zCheckScheduleDate = checkScheduleDate(null, null, i, 3, numberPicker, numberPicker2, numberPicker3);
        checkPollCloseCustomDeadline(textView, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, numberPicker.getValue());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createPollCloseDatePickerDialog$170(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void lambda$createPopupSelectDialog$217(int[] iArr, int i, AlertDialog.Builder builder, Runnable runnable, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (i == 1) {
            editorEdit.putInt("popupAll", iArr[0]);
        } else if (i == 0) {
            editorEdit.putInt("popupGroup", iArr[0]);
        } else {
            editorEdit.putInt("popupChannel", iArr[0]);
        }
        editorEdit.commit();
        builder.getDismissRunnable().run();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createPrioritySelectDialog$216(int[] iArr, long j, long j2, int i, SharedPreferences sharedPreferences, AlertDialog.Builder builder, Runnable runnable, View view) {
        int i2;
        int i3 = 0;
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            int i4 = iArr[0];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i3 = 4;
            } else if (i4 == 2) {
                i3 = 5;
            } else if (i4 != 3) {
                i3 = 1;
            }
            editorEdit.putInt("priority_" + j, i3);
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j, j2);
        } else {
            int i5 = iArr[0];
            if (i5 == 0) {
                i2 = 4;
            } else if (i5 == 1) {
                i2 = 5;
            } else {
                i2 = i5 == 2 ? 0 : 1;
            }
            if (i == 1) {
                editorEdit.putInt("priority_messages", i2);
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i == 0) {
                editorEdit.putInt("priority_group", i2);
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i == 2) {
                editorEdit.putInt("priority_channel", i2);
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i == 3) {
                editorEdit.putInt("priority_stories", i2);
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i == 4 || i == 5) {
                editorEdit.putInt("priority_react", i2);
                iArr[0] = sharedPreferences.getInt("priority_react", 1);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i);
        }
        editorEdit.commit();
        builder.getDismissRunnable().run();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createReportPhotoAlert$199(int i, long j, TLRPC.Photo photo, Context context, Theme.ResourcesProvider resourcesProvider, Integer num, String str) {
        TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
        reportprofilephoto.peer = MessagesController.getInstance(i).getInputPeer(j);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        reportprofilephoto.photo_id = tL_inputPhoto;
        reportprofilephoto.message = "";
        if (num.intValue() == 0) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
        } else if (num.intValue() == 1) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
        } else if (num.intValue() == 2) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
        } else if (num.intValue() == 5) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
        } else if (num.intValue() == 3) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
        } else if (num.intValue() == 4) {
            reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
        }
        ConnectionsManager.getInstance(i).sendRequest(reportprofilephoto, null);
        BulletinFactory.of(Bulletin.BulletinWindow.make(context), resourcesProvider).createReportSent(resourcesProvider).show();
    }

    public static void lambda$createReportPhotoAlert$200(int[] iArr, Context context, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback2 callback2, DialogInterface dialogInterface, int i) {
        int i2 = iArr[i];
        if (i2 == 100) {
            new ReportAlert(context, i2, resourcesProvider) {
                @Override
                public void onSend(int i3, String str) {
                    callback2.run(Integer.valueOf(i3), str);
                }

                @Override
                public void setLastVisible(boolean z) {
                }
            }.show();
        } else {
            callback2.run(Integer.valueOf(i2), "");
        }
    }

    public static boolean lambda$createScheduleDatePickerDialog$121(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createScheduleDatePickerDialog$122(ActionBarMenuItem actionBarMenuItem, ScheduleDatePickerColors scheduleDatePickerColors, View view) {
        actionBarMenuItem.toggleSubMenu();
        actionBarMenuItem.setPopupItemsColor(scheduleDatePickerColors.subMenuTextColor, false);
        actionBarMenuItem.setupPopupRadialSelectors(scheduleDatePickerColors.subMenuSelectorColor);
        actionBarMenuItem.redrawPopup(scheduleDatePickerColors.subMenuBackgroundColor);
    }

    public static void lambda$createScheduleDatePickerDialog$123(ScheduleDatePickerDelegate scheduleDatePickerDelegate, boolean[] zArr, BottomSheet.Builder builder, int i) {
        if (i == 1) {
            scheduleDatePickerDelegate.didSelectDate(zArr[0], 2147483646, 0);
            builder.bottomSheet.dismissRunnable.run();
        }
    }

    public static String lambda$createScheduleDatePickerDialog$124(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        if (calendar.get(1) != i2) {
            return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
    }

    public static void lambda$createScheduleDatePickerDialog$125(TextView textView, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        int i3;
        if (str != null) {
            i3 = 3;
        } else {
            i3 = j == j2 ? 1 : 0;
        }
        checkScheduleDate(textView, null, i3, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createScheduleDatePickerDialog$126(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createScheduleDatePickerDialog$127(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createScheduleDatePickerDialog$128(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr2[0] == iArr[i]) {
                spannableStringBuilder.append((CharSequence) strArr[i]);
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                break;
            }
        }
        spannableStringBuilder.append((CharSequence) " v");
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
            coloredImageSpan.spaceScaleX = 0.7f;
            coloredImageSpan.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
            coloredImageSpan.setAlpha(0.75f);
            spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_switch_lock);
            coloredImageSpan2.spaceScaleX = 0.7f;
            coloredImageSpan2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
            coloredImageSpan2.setAlpha(0.75f);
            spannableStringBuilder.setSpan(coloredImageSpan2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    public static void lambda$createScheduleDatePickerDialog$129(boolean[] zArr, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, boolean[] zArr2, int[] iArr, BottomSheet.Builder builder, View view) {
        int i;
        zArr[0] = false;
        if (str != null) {
            i = 3;
        } else {
            i = j == j2 ? 1 : 0;
        }
        boolean zCheckScheduleDate = checkScheduleDate(null, null, i, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, numberPicker.getValue());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(zArr2[0], (int) (calendar.getTimeInMillis() / 1000), iArr[0]);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createScheduleDatePickerDialog$130(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void lambda$createScheduleDatePickerDialog$131() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        safeLastFragment.showAsSheet(new PremiumPreviewFragment("schedule_repeat"), bottomSheetParams);
    }

    public static void lambda$createScheduleDatePickerDialog$132(int[] iArr, int i, Runnable runnable) {
        iArr[0] = i;
        runnable.run();
    }

    public static void lambda$createScheduleDatePickerDialog$133(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, Runnable runnable, View view) {
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new UndoView$$ExternalSyntheticLambda7(6))).show();
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, resourcesProvider, frameLayout2);
        for (int i = 0; i < iArr.length; i++) {
            itemOptionsMakeOptions.add(strArr[i], new SlotsDrawable$$ExternalSyntheticLambda9(iArr2, iArr[i], runnable, 12));
        }
        itemOptionsMakeOptions.setGravity(1);
        itemOptionsMakeOptions.show();
    }

    public static void lambda$createScheduleDatePickerDialog$135(boolean[] zArr, RLottieDrawable rLottieDrawable, HintView2[] hintView2Arr, long j, Context context, long j2, ActionBarMenuItem actionBarMenuItem, BottomSheet bottomSheet, View view) {
        String string;
        boolean z = zArr[0];
        zArr[0] = !z;
        if (z) {
            if (rLottieDrawable.getCurrentFrame() < 40) {
                rLottieDrawable.setCurrentFrame(40);
            }
            rLottieDrawable.setCustomEndFrame(80);
            rLottieDrawable.start();
        } else {
            if (rLottieDrawable.getCurrentFrame() >= 40) {
                rLottieDrawable.setCurrentFrame(0);
            }
            rLottieDrawable.setCustomEndFrame(40);
            rLottieDrawable.start();
        }
        HintView2 hintView2 = hintView2Arr[0];
        if (hintView2 != null) {
            hintView2.hide();
            hintView2Arr[0] = null;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        HintView2 hintView3 = new HintView2(context, 3);
        hintView2Arr[0] = hintView3;
        hintView3.setRoundingWithCornerEffect(false);
        hintView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        hintView3.setRounding(20.0f);
        hintView3.setShadow(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(0.25f, -16777216));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            string = LocaleController.getString(zArr[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
        } else if (chat != null || user == null) {
            string = LocaleController.getString(zArr[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
        } else if (j == j2) {
            string = LocaleController.getString(zArr[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
        } else {
            string = LocaleController.formatString(zArr[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user));
        }
        hintView3.setText(string);
        hintView3.setDuration(5000L);
        hintView3.setJoint(1.0f, -((actionBarMenuItem != null ? 42 : -8) + 20));
        hintView3.setOnHiddenListener(new ShareAlert$23$$ExternalSyntheticLambda0(hintView3, 17));
        bottomSheet.getContainerView().setClipToPadding(false);
        bottomSheet.getContainerView().setClipChildren(false);
        bottomSheet.getContainerView().addView(hintView3, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
        hintView3.show();
    }

    public static void lambda$createSimpleAlert$12(Runnable runnable, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createSimpleConfirmAlert$30(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean lambda$createSimpleTextInputAlert$13(EditTextBoldCursor editTextBoldCursor, int i, MessagesStorage.StringCallback stringCallback, AlertDialog[] alertDialogArr, View view, TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return false;
        }
        String string = editTextBoldCursor.getText().toString();
        if (string.length() > i) {
            AndroidUtilities.shakeView(editTextBoldCursor);
            return true;
        }
        stringCallback.run(string);
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }

    public static void lambda$createSimpleTextInputAlert$14(EditTextBoldCursor editTextBoldCursor, int i, MessagesStorage.StringCallback stringCallback, AlertDialog alertDialog, int i2) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (strTrim.length() > i || strTrim.isEmpty()) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            stringCallback.run(strTrim);
            alertDialog.dismiss();
        }
    }

    public static void lambda$createSimpleTextInputAlert$16(EditTextBoldCursor editTextBoldCursor, BaseFragment baseFragment, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustResize(activity, baseFragment.getClassGuid());
        }
    }

    public static void lambda$createSimpleTextInputAlert$17(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$createSingleChoiceDialog$218(AlertDialog.Builder builder, DialogInterface.OnClickListener onClickListener, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        builder.getDismissRunnable().run();
        onClickListener.onClick(null, iIntValue);
    }

    public static String lambda$createSoundFrequencyPickerDialog$181(int i) {
        return LocaleController.formatPluralString("Times", i + 1, new Object[0]);
    }

    public static String lambda$createSoundFrequencyPickerDialog$182(int i) {
        return LocaleController.formatPluralString("Minutes", i + 1, new Object[0]);
    }

    public static String lambda$createSoundFrequencyPickerDialog$183(int i) {
        return LocaleController.getString(R.string.NotificationsFrequencyDivider);
    }

    public static boolean lambda$createSoundFrequencyPickerDialog$184(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createSoundFrequencyPickerDialog$185(NumberPicker numberPicker, int i, int i2) {
    }

    public static void lambda$createSoundFrequencyPickerDialog$186(NumberPicker numberPicker, NumberPicker numberPicker2, SoundFrequencyDelegate soundFrequencyDelegate, BottomSheet.Builder builder, View view) {
        soundFrequencyDelegate.didSelectValues(numberPicker.getValue() + 1, (numberPicker2.getValue() + 1) * 60);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static boolean lambda$createStatusUntilDatePickerDialog$171(View view, MotionEvent motionEvent) {
        return true;
    }

    public static String lambda$createStatusUntilDatePickerDialog$172(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        int i3 = calendar.get(1);
        if (i3 != i2 || i >= 7) {
            return i3 == i2 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
    }

    public static String lambda$createStatusUntilDatePickerDialog$174(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createStatusUntilDatePickerDialog$175(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createStatusUntilDatePickerDialog$176(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, StatusUntilDatePickerDelegate statusUntilDatePickerDelegate, BottomSheet.Builder builder, View view) {
        boolean zCheckScheduleDate = checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, numberPicker.getValue());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        statusUntilDatePickerDelegate.didSelectDate((int) (calendar.getTimeInMillis() / 1000));
        builder.bottomSheet.dismissRunnable.run();
    }

    public static boolean lambda$createSuggestedMessageDatePickerDialog$249(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createSuggestedMessageDatePickerDialog$250(View view, MotionEvent motionEvent) {
        return true;
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$251(int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        LocalDate localDatePlusDays = LocalDate.now().plusDays(i2);
        int year = localDatePlusDays.getYear();
        long epochMilli = localDatePlusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        if (year != i) {
            return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
        }
        return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$253(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$254(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$255(boolean[] zArr, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        boolean zCheckScheduleDate = checkScheduleDate(null, null, j, j2, i, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(LocalDate.now().plusDays(numberPicker.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$256(boolean[] zArr, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        scheduleDatePickerDelegate.didSelectDate(true, -1, 0);
        builder.bottomSheet.dismissRunnable.run();
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$257(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static String lambda$createTTLAlert$219(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.ShortMessageLifetimeForever);
        }
        if (i >= 1 && i < 16) {
            return LocaleController.formatTTLString(i);
        }
        if (i == 16) {
            return LocaleController.formatTTLString(30);
        }
        if (i == 17) {
            return LocaleController.formatTTLString(60);
        }
        if (i == 18) {
            return LocaleController.formatTTLString(3600);
        }
        if (i == 19) {
            return LocaleController.formatTTLString(86400);
        }
        return i == 20 ? LocaleController.formatTTLString(604800) : "";
    }

    public static void lambda$createTTLAlert$220(TLRPC.EncryptedChat encryptedChat, NumberPicker numberPicker, AlertDialog alertDialog, int i) {
        int i2 = encryptedChat.ttl;
        int value = numberPicker.getValue();
        if (value >= 0 && value < 16) {
            encryptedChat.ttl = value;
        } else if (value == 16) {
            encryptedChat.ttl = 30;
        } else if (value == 17) {
            encryptedChat.ttl = 60;
        } else if (value == 18) {
            encryptedChat.ttl = 3600;
        } else if (value == 19) {
            encryptedChat.ttl = 86400;
        } else if (value == 20) {
            encryptedChat.ttl = 604800;
        }
        if (i2 != encryptedChat.ttl) {
            SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
            MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
        }
    }

    public static void lambda$createThemeCreateDialog$237(AlertDialog alertDialog, int i) {
    }

    public static boolean lambda$createThemeCreateDialog$238(TextView textView, int i, KeyEvent keyEvent) {
        AndroidUtilities.hideKeyboard(textView);
        return false;
    }

    public static void lambda$createThemeCreateDialog$239(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$createThemeCreateDialog$240(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new TagEditCell$$ExternalSyntheticLambda3(1, editTextBoldCursor));
    }

    public static void lambda$createThemeCreateDialog$242(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) {
        AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda5(editTextBoldCursor, alertDialog, baseFragment, 1));
    }

    public static void lambda$createThemeCreateDialog$243(BaseFragment baseFragment, EditTextBoldCursor editTextBoldCursor, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo, AlertDialog alertDialog, View view) throws Throwable {
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        if (editTextBoldCursor.length() == 0) {
            Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(editTextBoldCursor);
            return;
        }
        if (baseFragment instanceof ThemePreviewActivity) {
            Theme.applyPreviousTheme();
            baseFragment.finishFragment();
        }
        if (themeAccent == null) {
            processCreate(editTextBoldCursor, alertDialog, baseFragment);
            return;
        }
        themeInfo.setCurrentAccentId(themeAccent.id);
        Theme.refreshThemeColors(false, false);
        Utilities.searchQueue.postRunnable(new AlertsCreator$$ExternalSyntheticLambda5(editTextBoldCursor, alertDialog, baseFragment, 0));
    }

    public static void lambda$createTimePickerDialog$106(int i, int i2, NumberPicker numberPicker, NumberPicker numberPicker2, int i3, LinearLayout linearLayout, Boolean bool) {
        int minValue;
        int value;
        int i4 = i % 60;
        int i5 = (i - i4) / 60;
        int i6 = i2 % 60;
        int i7 = (i2 - i6) / 60;
        if (i6 == 0 && i7 > 0) {
            i7--;
            i6 = 59;
        }
        if (bool.booleanValue()) {
            value = numberPicker.getValue();
            minValue = numberPicker2.getValue();
        } else {
            minValue = i3 % 60;
            value = (i3 - minValue) / 60;
            if (value == 24) {
                value--;
                minValue = 59;
            }
        }
        numberPicker.setMinValue(i5);
        numberPicker.setMaxValue(i7);
        if (value > i7) {
            numberPicker.setValue(i7);
            value = i7;
        } else if (value < i5) {
            numberPicker.setValue(i5);
            value = i5;
        }
        if (value <= i5) {
            numberPicker2.setMinValue(i4);
            numberPicker2.setMaxValue(i5 == i7 ? i6 : 59);
        } else if (value >= i7) {
            if (i5 != i7) {
                i4 = 0;
            }
            numberPicker2.setMinValue(i4);
            numberPicker2.setMaxValue(i6);
        } else if (i5 == i7) {
            numberPicker2.setMinValue(i4);
            numberPicker2.setMaxValue(i6);
        } else {
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(59);
        }
        if (minValue > numberPicker2.getMaxValue()) {
            minValue = numberPicker2.getMaxValue();
            numberPicker2.setValue(minValue);
        } else if (minValue < numberPicker2.getMinValue()) {
            minValue = numberPicker2.getMinValue();
            numberPicker2.setValue(minValue);
        }
        if (!bool.booleanValue()) {
            numberPicker.setValue(value);
            numberPicker2.setValue(minValue);
        }
        linearLayout.invalidate();
    }

    public static String lambda$createTimePickerDialog$107(int i) {
        boolean z = LocaleController.is24HourFormat;
        String str = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
        return i >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, str) : str;
    }

    public static void lambda$createTimePickerDialog$108(Utilities.Callback callback, NumberPicker numberPicker, int i, int i2) {
        callback.run(Boolean.TRUE);
    }

    public static String lambda$createTimePickerDialog$109(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createTimePickerDialog$110(Utilities.Callback callback, NumberPicker numberPicker, int i, int i2) {
        callback.run(Boolean.TRUE);
    }

    public static boolean lambda$createTimePickerDialog$111(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createTimePickerDialog$112(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void lambda$createTimePickerDialog$113(Utilities.Callback callback, NumberPicker numberPicker, NumberPicker numberPicker2, DialogInterface dialogInterface) {
        callback.run(Integer.valueOf(numberPicker2.getValue() + (numberPicker.getValue() * 60)));
    }

    public static int lambda$createTimezonePickerDialog$101(TLRPC.TL_timezone tL_timezone, TLRPC.TL_timezone tL_timezone2) {
        return tL_timezone.utc_offset - tL_timezone2.utc_offset;
    }

    public static String lambda$createTimezonePickerDialog$102(int i, ArrayList arrayList, int i2) {
        TimezonesController.getInstance(i);
        return TimezonesController.getTimezoneName((TLRPC.TL_timezone) arrayList.get(i2), true);
    }

    public static boolean lambda$createTimezonePickerDialog$103(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createTimezonePickerDialog$104(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void lambda$createTimezonePickerDialog$105(Utilities.Callback callback, ArrayList arrayList, NumberPicker numberPicker, DialogInterface dialogInterface) {
        callback.run(((TLRPC.TL_timezone) arrayList.get(numberPicker.getValue())).id);
    }

    public static void lambda$createVibrationSelectDialog$206(int[] iArr, long j, String str, long j2, AlertDialog.Builder builder, Runnable runnable, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            int i = iArr[0];
            if (i == 0) {
                editorEdit.putInt(str, 0);
            } else if (i == 1) {
                editorEdit.putInt(str, 1);
            } else if (i == 2) {
                editorEdit.putInt(str, 3);
            } else if (i == 3) {
                editorEdit.putInt(str, 2);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j, j2);
        } else {
            int i2 = iArr[0];
            if (i2 == 0) {
                editorEdit.putInt(str, 2);
            } else if (i2 == 1) {
                editorEdit.putInt(str, 0);
            } else if (i2 == 2) {
                editorEdit.putInt(str, 1);
            } else if (i2 == 3) {
                editorEdit.putInt(str, 3);
            } else if (i2 == 4) {
                editorEdit.putInt(str, 4);
            }
            if (str.equals("vibrate_channel")) {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
            } else if (str.equals("vibrate_group")) {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
            } else if (str.equals("vibrate_react")) {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(4);
            } else {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
            }
        }
        editorEdit.commit();
        builder.getDismissRunnable().run();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createWebViewPermissionsRequestDialog$3(boolean z, Context context, AtomicBoolean atomicBoolean, Consumer consumer, AlertDialog alertDialog, int i) {
        if (!z) {
            atomicBoolean.set(true);
            consumer.accept(Boolean.TRUE);
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$createWebViewPermissionsRequestDialog$4(AtomicBoolean atomicBoolean, Consumer consumer, AlertDialog alertDialog, int i) {
        atomicBoolean.set(true);
        consumer.accept(Boolean.FALSE);
    }

    public static void lambda$createWebViewPermissionsRequestDialog$5(AtomicBoolean atomicBoolean, Consumer consumer, DialogInterface dialogInterface) {
        if (atomicBoolean.get()) {
            return;
        }
        consumer.accept(Boolean.FALSE);
    }

    public static void lambda$ensurePaidMessageConfirmation$63(Utilities.Callback callback, long j) {
        callback.run(Long.valueOf(j));
    }

    public static void lambda$ensurePaidMessageConfirmation$64(int i, long j, long j2, Utilities.Callback callback, long j3) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        if (StarsController.getInstance(i, false).getBalance().amount >= j) {
            callback.run(Long.valueOf(j3));
            return;
        }
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
        if (activity == null) {
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, j, 13, DialogObject.getShortName(i, j2), new AlertsCreator$$ExternalSyntheticLambda163(callback, j3, 0), j2).show();
    }

    public static void lambda$ensurePaidMessageConfirmation$65(int i, long j, long j2, Utilities.Callback callback, long j3) {
        AlertsCreator$$ExternalSyntheticLambda6 alertsCreator$$ExternalSyntheticLambda6 = new AlertsCreator$$ExternalSyntheticLambda6(i, j, j2, callback, j3, 1);
        if (StarsController.getInstance(i, false).balanceLoaded) {
            alertsCreator$$ExternalSyntheticLambda6.run();
            return;
        }
        StarsController starsController = StarsController.getInstance(i, false);
        starsController.balanceLoaded = false;
        starsController.getBalance(alertsCreator$$ExternalSyntheticLambda6, false, true);
        starsController.balanceLoaded = true;
    }

    public static void lambda$ensurePaidMessagesMultiConfirmation$61(int i, long j, Activity activity, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback, HashMap map) {
        if (StarsController.getInstance(i, false).getBalance().amount >= j) {
            callback.run(map);
        } else {
            if (activity == null) {
                return;
            }
            long jLongValue = ((Long) arrayList.get(0)).longValue();
            new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, j, 13, DialogObject.getShortName(i, jLongValue), new EmojiView$2$$ExternalSyntheticLambda0(27, callback, map), jLongValue).show();
        }
    }

    public static void lambda$ensurePaidMessagesMultiConfirmation$62(int i, ArrayList arrayList, long j, Activity activity, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback, HashMap map, Boolean bool) {
        if (bool.booleanValue()) {
            SharedPreferences.Editor editorEdit = MessagesController.getInstance(i).getMainSettings().edit();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
                if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
                }
                editorEdit.putLong(RendererCapabilities.CC.m(jLongValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                StarsController.getInstance(i, false).justAgreedToNotAskDialogs.put(l, Long.valueOf(System.currentTimeMillis()));
            }
            editorEdit.apply();
        }
        AlertsCreator$$ExternalSyntheticLambda137 alertsCreator$$ExternalSyntheticLambda137 = new AlertsCreator$$ExternalSyntheticLambda137(i, j, activity, arrayList, resourcesProvider, callback, map);
        if (StarsController.getInstance(i, false).balanceLoaded) {
            alertsCreator$$ExternalSyntheticLambda137.run();
            return;
        }
        StarsController starsController = StarsController.getInstance(i, false);
        starsController.balanceLoaded = false;
        starsController.getBalance(alertsCreator$$ExternalSyntheticLambda137, false, true);
        starsController.balanceLoaded = true;
    }

    public static void lambda$performAskAQuestion$48(SharedPreferences sharedPreferences, TLRPC.TL_help_support tL_help_support, AlertDialog alertDialog, int i, BaseFragment baseFragment) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("support_id2", tL_help_support.user.id);
        SerializedData serializedData = new SerializedData();
        tL_help_support.user.serializeToStream(serializedData);
        editorEdit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        editorEdit.commit();
        serializedData.cleanup();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_help_support.user);
        MessagesStorage.getInstance(i).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(i).putUser(tL_help_support.user, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.id);
        baseFragment.presentFragment(new ChatActivity(bundle));
    }

    public static void lambda$performAskAQuestion$49(AlertDialog alertDialog) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$performAskAQuestion$50(SharedPreferences sharedPreferences, AlertDialog alertDialog, int i, BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(sharedPreferences, (TLRPC.TL_help_support) tLObject, alertDialog, i, baseFragment, 12));
        } else {
            AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda257(alertDialog, 0));
        }
    }

    public static void lambda$processError$7() {
    }

    public static void lambda$processError$8(long j, int i, long j2) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        new StarsIntroActivity.StarsNeededSheet(activity, darkThemeResourceProvider, j, 13, DialogObject.getShortName(i, j2), new UndoView$$ExternalSyntheticLambda7(7), j2).show();
    }

    public static void lambda$showAddBrowserException$24(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog[] alertDialogArr, View view) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        Uri uri = Uri.parse(strTrim);
        if (uri == null || uri.getHost() == null) {
            uri = Uri.parse("https://" + strTrim);
        }
        if (uri == null || uri.getHost() == null) {
            AndroidUtilities.shakeView(editTextBoldCursor);
            return;
        }
        String lowerCase = uri.getHost().toLowerCase();
        if (lowerCase.startsWith("www.")) {
            lowerCase = lowerCase.substring(4);
        }
        callback.run(lowerCase);
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (view != null) {
            view.requestFocus();
        }
    }

    public static boolean lambda$showAddBrowserException$25(Runnable runnable, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        runnable.run();
        return true;
    }

    public static void lambda$showAddBrowserException$29(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static boolean lambda$showAddLinkToPoll$18(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog[] alertDialogArr, View view, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (!isValidUrl(strTrim)) {
            AndroidUtilities.shakeView(editTextBoldCursor);
            return true;
        }
        callback.run(strTrim);
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }

    public static void lambda$showAddLinkToPoll$19(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (!isValidUrl(strTrim)) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            callback.run(strTrim);
            alertDialog.dismiss();
        }
    }

    public static void lambda$showAddLinkToPoll$21(Runnable runnable, AlertDialog alertDialog, int i) {
        runnable.run();
        alertDialog.dismiss();
    }

    public static void lambda$showAddLinkToPoll$23(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$showAddUserAlert$201(BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        MessagesController.getInstance(baseFragment.getCurrentAccount()).openByUserName("spambot", baseFragment, 1);
    }

    public static void lambda$showAlertWithCheckbox$67(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$showAlertWithCheckbox$68(Utilities.Callback callback, boolean[] zArr, AlertDialog alertDialog, int i) {
        callback.run(Boolean.valueOf(zArr[0]));
    }

    public static void lambda$showBanGroupCreatorFromCommunityConfirmAlert$32(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showBanGroupCreatorFromCommunityConfirmAlert$33(AlertDialog[] alertDialogArr, MessagesStorage.LongCallback longCallback, long j, View view) {
        alertDialogArr[0].dismiss();
        longCallback.run(-j);
    }

    public static void lambda$showBanGroupCreatorFromCommunityJoinedChatsAlert$31(AlertDialog[] alertDialogArr, MessagesStorage.LongCallback longCallback, long j, View view) {
        alertDialogArr[0].dismiss();
        longCallback.run(-j);
    }

    public static void lambda$showBlockReportSpamAlert$38(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamAlert$39(TLRPC.User user, AccountInstance accountInstance, CheckBoxCell[] checkBoxCellArr, long j, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
        CheckBoxCell checkBoxCell;
        if (user != null) {
            accountInstance.getMessagesController().blockPeer(user.id);
        }
        if (checkBoxCellArr == null || ((checkBoxCell = checkBoxCellArr[0]) != null && checkBoxCell.isChecked())) {
            accountInstance.getMessagesController().reportSpam(j, user, chat, encryptedChat, chat != null && z);
        }
        if (checkBoxCellArr != null && !checkBoxCellArr[1].isChecked()) {
            intCallback.run(0);
            return;
        }
        if (chat == null || ChatObject.isNotInChat(chat)) {
            accountInstance.getMessagesController().deleteDialog(j, 0);
        } else {
            accountInstance.getMessagesController().deleteParticipantFromChat(-j, accountInstance.getMessagesController().getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId())));
        }
        intCallback.run(1);
    }

    public static void lambda$showBlockReportSpamReplyAlert$34(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$35(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamReplyAlert$36(AccountInstance accountInstance, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$37(TLRPC.User user, AccountInstance accountInstance, ChatActivity chatActivity, TLRPC.Chat chat, MessageObject messageObject, CheckBoxCell[] checkBoxCellArr, Theme.ResourcesProvider resourcesProvider, AlertDialog alertDialog, int i) {
        UndoView undoView;
        if (user != null) {
            accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), user.id);
        } else {
            accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), -chat.id);
        }
        TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
        tL_contacts_blockFromReplies.msg_id = messageObject.getId();
        tL_contacts_blockFromReplies.delete_message = true;
        tL_contacts_blockFromReplies.delete_history = true;
        if (checkBoxCellArr[0].isChecked()) {
            tL_contacts_blockFromReplies.report_spam = true;
            if (chatActivity.getParentActivity() != null && (undoView = chatActivity.getUndoView()) != null) {
                undoView.showWithAction(0L, 74, (Runnable) null);
            }
        }
        accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new UndoView$$ExternalSyntheticLambda0(accountInstance, 5));
    }

    public static void lambda$showCallsForbidden$258(int i, TLRPC.Updates updates) {
        MessagesController.getInstance(i).processUpdates(updates, false);
    }

    public static void lambda$showCallsForbidden$259(TLObject tLObject, int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            if (LaunchActivity.instance == null) {
                buttonWithCounterView.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            bottomSheet.lambda$showGiftOfferSheet$15();
            VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall, false, groupcall.call, null);
            SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j));
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(i).putUsers(updates.users, false);
        MessagesController.getInstance(i).putChats(updates.chats, false);
        ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
        int size = arrayListFindUpdates.size();
        TLRPC.GroupCall groupCall2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListFindUpdates.get(i2);
            i2++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        Utilities.stageQueue.postRunnable(new EmojiView$$ExternalSyntheticLambda9(i, updates, 6));
        if (groupCall2 == null || LaunchActivity.instance == null) {
            buttonWithCounterView.setLoading(false);
            return;
        }
        bottomSheet.lambda$showGiftOfferSheet$15();
        SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall2.invite_link, j));
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (safeLastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) safeLastFragment;
                if (chatActivity.getDialogId() == j && chatActivity.getChatMode() == 0) {
                    return;
                }
            }
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static void lambda$showCallsForbidden$260(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new AlertsCreator$$ExternalSyntheticLambda137(i, buttonWithCounterView, bottomSheet, j, resourcesProvider, tLObject, tL_error));
    }

    public static void lambda$showCallsForbidden$261(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, Theme.ResourcesProvider resourcesProvider, View view) {
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new AlertsCreator$$ExternalSyntheticLambda16(i, buttonWithCounterView, bottomSheet, j, resourcesProvider));
    }

    public static void lambda$showCustomNotificationsDialog$40(long j, int i, boolean z, int i2, MessagesStorage.IntCallback intCallback, int i3, BaseFragment baseFragment, ArrayList arrayList, ArrayList arrayList2, MessagesStorage.IntCallback intCallback2, AlertDialog.Builder builder, View view) {
        int i4;
        int i5;
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (iIntValue == 0) {
            if (j != 0) {
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(i).edit();
                if (z) {
                    editorEdit.remove("notify2_" + j);
                } else {
                    editorEdit.putInt("notify2_" + j, 0);
                }
                MessagesStorage.getInstance(i).setDialogFlags(j, 0L);
                editorEdit.commit();
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i).dialogs_dict.get(j);
                if (dialog != null) {
                    dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
                NotificationsController.getInstance(i).updateServerNotificationsSettings(j, i2);
                if (intCallback != null) {
                    if (z) {
                        intCallback.run(0);
                    } else {
                        intCallback.run(1);
                    }
                }
            } else {
                NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i3, 0);
            }
        } else if (iIntValue != 3) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            if (iIntValue == 1) {
                currentTime += 3600;
            } else {
                if (iIntValue == 2) {
                    currentTime += 172800;
                } else {
                    i4 = 4;
                    if (iIntValue == 4) {
                        currentTime = Integer.MAX_VALUE;
                    }
                }
                NotificationsController.getInstance(i).muteUntil(j, i2, currentTime);
                if (j != 0 && intCallback != null) {
                    if (iIntValue == i4 || z) {
                        intCallback.run(1);
                    } else {
                        intCallback.run(0);
                    }
                }
                if (j == 0) {
                    NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i3, Integer.MAX_VALUE);
                }
            }
            i4 = 4;
            NotificationsController.getInstance(i).muteUntil(j, i2, currentTime);
            if (j != 0) {
                if (iIntValue == i4) {
                    intCallback.run(1);
                } else {
                    intCallback.run(1);
                }
            }
            if (j == 0) {
                NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i3, Integer.MAX_VALUE);
            }
        } else if (j != 0) {
            baseFragment.presentFragment(new ProfileNotificationsActivity(FBool.m(j, "dialog_id")));
        } else {
            baseFragment.presentFragment(new NotificationsCustomSettingsActivity(i3, arrayList, arrayList2));
        }
        if (intCallback2 != null) {
            intCallback2.run(iIntValue);
        }
        builder.getDismissRunnable().run();
        if (iIntValue == 0) {
            i5 = 4;
        } else if (iIntValue == 1) {
            i5 = 0;
        } else if (iIntValue == 2) {
            i5 = 2;
        } else {
            i5 = iIntValue == 4 ? 3 : -1;
        }
        if (i5 < 0 || !BulletinFactory.canShowBulletin(baseFragment)) {
            return;
        }
        BulletinFactory.createMuteBulletin(baseFragment, i5).show();
    }

    public static void lambda$showDeclineSuggestedPostDialog$246(Utilities.Callback callback, EditText editText, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        if (callback != null) {
            callback.run(editText.getText().toString());
        }
    }

    public static void lambda$showDisableSharingInfo$267(boolean[] zArr, Runnable runnable, View view) {
        zArr[0] = true;
        runnable.run();
    }

    public static void lambda$showDisableSharingInfo$268(boolean[] zArr, Runnable runnable) {
        if (!zArr[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void lambda$showDiscardTopicDialog$96(Runnable runnable, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        runnable.run();
    }

    public static void lambda$showOpenExternalBrowserAlert$44(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$showOpenExternalBrowserAlert$45(Utilities.Callback2 callback2, CheckBoxCell checkBoxCell, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        callback2.run(Boolean.TRUE, Boolean.valueOf(checkBoxCell.isChecked()));
        AlertDialog alertDialog2 = alertDialogArr[0];
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
    }

    public static void lambda$showOpenExternalBrowserAlert$46(Utilities.Callback2 callback2, CheckBoxCell checkBoxCell, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        callback2.run(Boolean.FALSE, Boolean.valueOf(checkBoxCell.isChecked()));
        AlertDialog alertDialog2 = alertDialogArr[0];
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
    }

    public static void lambda$showOpenUrlAlert$42(Context context, String str, long j, boolean z, Browser.Progress progress) {
        Browser.openUrl(context, Uri.parse(str), j == 0, z, progress);
    }

    public static void lambda$showPayForMessageAlert$66(int i, long j, long j2, Runnable runnable, Boolean bool) {
        if (bool.booleanValue()) {
            MessagesController.getInstance(i).getMainSettings().edit().putLong(RendererCapabilities.CC.m(j, "ask_paid_message_", "_price"), j2).apply();
            StarsController.getInstance(i, false).justAgreedToNotAskDialogs.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static boolean lambda$showPopupMenu$244(ActionBarPopupWindow actionBarPopupWindow, View view, int i, KeyEvent keyEvent) {
        if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        actionBarPopupWindow.dismiss();
        return true;
    }

    public static boolean lambda$showPopupMenu$245(ActionBarPopupWindow actionBarPopupWindow, Rect rect, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        actionBarPopupWindow.dismiss();
        return false;
    }

    public static void lambda$showSecretLocationAlert$41(ArrayList arrayList, Runnable runnable, AlertDialog.Builder builder, View view) {
        SharedConfig.setSecretMapPreviewType(((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue());
        if (runnable != null) {
            runnable.run();
        }
        builder.getDismissRunnable().run();
    }

    public static void lambda$showUpdateAppAlert$9(Context context, AlertDialog alertDialog, int i) {
        Browser.openUrl(context, BuildVars.PLAYSTORE_APP_URL);
    }

    public static boolean needsPaidMessageAlert(int i, long j) {
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(j, "ask_paid_message_", "_price"), 0L);
    }

    public static void performAskAQuestion(BaseFragment baseFragment) {
        TLRPC.User user;
        String string;
        int currentAccount = baseFragment.getCurrentAccount();
        SharedPreferences mainSettings = MessagesController.getMainSettings(currentAccount);
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(mainSettings, "support_id2", 0L);
        if (prefIntOrLong != 0) {
            user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(prefIntOrLong));
            if (user == null && (string = mainSettings.getString("support_user", null)) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    if (bArrDecode != null) {
                        SerializedData serializedData = new SerializedData(bArrDecode);
                        TLRPC.User userTLdeserialize = TLRPC.User.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        if (userTLdeserialize != null && userTLdeserialize.id == 333000) {
                            userTLdeserialize = null;
                        }
                        serializedData.cleanup();
                        user = userTLdeserialize;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    user = null;
                }
            }
        } else {
            user = null;
        }
        if (user == null) {
            AlertDialog alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3, null);
            alertDialog.canCacnel = false;
            alertDialog.show();
            ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new AlertsCreator$$ExternalSyntheticLambda55(mainSettings, alertDialog, currentAccount, baseFragment, 0));
            return;
        }
        MessagesController.getInstance(currentAccount).putUser(user, true);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        baseFragment.presentFragment(new ChatActivity(bundle));
    }

    public static void processCreate(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) throws Throwable {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String string = editTextBoldCursor.getText().toString();
        int i = Theme.default_shadow_color;
        Theme.ThemeInfo themeInfo = new Theme.ThemeInfo();
        themeInfo.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        themeInfo.name = string;
        Theme.themedWallpaperLink = Theme.getWallpaperUrl(Theme.currentTheme.overrideWallpaper);
        themeInfo.account = UserConfig.selectedAccount;
        Theme.saveCurrentTheme(themeInfo, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().show(baseFragment.getParentActivity(), themeInfo);
        alertDialog.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(baseFragment.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static Dialog processError(final int i, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLObject tLObject, Object... objArr) {
        String str;
        int i2;
        TLRPC.InputPeer inputPeer;
        long peerDialogId;
        String firstName;
        final long j;
        long peerDialogId2;
        BaseFragment lastFragment = baseFragment;
        boolean zBooleanValue = false;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long allowedPaidStars = StarsController.getAllowedPaidStars(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else {
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                    } else {
                        j = 0;
                    }
                    if (allowedPaidStars > 0) {
                        StarsController.getInstance(i, false).getBalance(new Runnable() {
                            @Override
                            public final void run() {
                                AlertsCreator.lambda$processError$8(allowedPaidStars, i, j);
                            }
                        }, true, true);
                        return null;
                    }
                }
                j = peerDialogId2;
                if (allowedPaidStars > 0) {
                    StarsController.getInstance(i, false).getBalance(new Runnable() {
                        @Override
                        public final void run() {
                            AlertsCreator.lambda$processError$8(allowedPaidStars, i, j);
                        }
                    }, true, true);
                    return null;
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout));
                    return null;
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z) {
                    i2 = 5;
                    if (tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                        if (peerDialogId3 >= 0) {
                            firstName = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId3)));
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId3));
                            firstName = chat != null ? chat.title : "";
                        }
                        if (lastFragment == null) {
                            lastFragment = LaunchActivity.getLastFragment();
                        }
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, firstName));
                        MessagesController.getInstance(i).invalidateUserPremiumBlocked(peerDialogId3, 0);
                        return null;
                    }
                } else {
                    i2 = 5;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z2 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    if (z2) {
                        inputPeer = ((TLRPC.TL_messages_initHistoryImport) tLObject).peer;
                    } else {
                        inputPeer = tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    }
                    if (lastFragment == null) {
                        lastFragment = LaunchActivity.getLastFragment();
                    }
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorUserBlocked));
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError));
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser));
                            return null;
                        }
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup));
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin));
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid));
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid));
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang));
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload));
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        showFloodWaitAlert(tL_error.text, lastFragment);
                        return null;
                    }
                    String string = LocaleController.getString(R.string.ImportErrorTitle);
                    StringBuilder sb = new StringBuilder();
                    zzko.m(R.string.ErrorOccurred, "\n", sb);
                    sb.append(tL_error.text);
                    showSimpleAlert(lastFragment, string, sb.toString());
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        BaseFragment lastFragment2 = lastFragment == null ? LaunchActivity.getLastFragment() : lastFragment;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            showSimpleAlert(lastFragment2, LocaleController.getString(R.string.InvalidPhoneNumber));
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            showSimpleAlert(lastFragment2, LocaleController.getString(R.string.FloodWait));
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            showUpdateAppAlert(lastFragment2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        zzko.m(R.string.ErrorOccurred, "\n", sb2);
                        sb2.append(tL_error.text);
                        showSimpleAlert(lastFragment2, sb2.toString());
                        return null;
                    }
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (lastFragment != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (lastFragment.getParentActivity() != null) {
                                lastFragment.showDialog(new LimitReachedBottomSheet(5, lastFragment, lastFragment.getParentActivity(), i, null));
                                return null;
                            }
                            if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                lastFragment.presentFragment(new TooManyCommunitiesActivity(0));
                                return null;
                            }
                            lastFragment.presentFragment(new TooManyCommunitiesActivity(1));
                            return null;
                        }
                        if (lastFragment != null) {
                            boolean zBooleanValue2 = (objArr == null || objArr.length <= 0) ? false : ((Boolean) objArr[0]).booleanValue();
                            if (objArr != null && objArr.length > 1) {
                                zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                            }
                            showAddUserAlert(tL_error, lastFragment, zBooleanValue2, zBooleanValue, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 1);
                            return null;
                        }
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            if (lastFragment == null) {
                                lastFragment = LaunchActivity.getLastFragment();
                            }
                            BaseFragment baseFragment2 = lastFragment;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (baseFragment2.getParentActivity() != null) {
                                    baseFragment2.showDialog(new LimitReachedBottomSheet(5, baseFragment2, baseFragment2.getParentActivity(), i, null));
                                    return null;
                                }
                                baseFragment2.presentFragment(new TooManyCommunitiesActivity(2));
                                return null;
                            }
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                showFloodWaitAlert(tL_error.text, baseFragment2);
                                return null;
                            }
                            showAddUserAlert(tL_error, baseFragment2, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            if (lastFragment == null) {
                                lastFragment = LaunchActivity.getLastFragment();
                            }
                            BaseFragment baseFragment3 = lastFragment;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (baseFragment3.getParentActivity() != null) {
                                    baseFragment3.showDialog(new LimitReachedBottomSheet(5, baseFragment3, baseFragment3.getParentActivity(), i, null));
                                    return null;
                                }
                                baseFragment3.presentFragment(new TooManyCommunitiesActivity(2));
                                return null;
                            }
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                showFloodWaitAlert(tL_error.text, baseFragment3);
                                return null;
                            }
                            showAddUserAlert(tL_error, baseFragment3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (lastFragment != null) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.EditMessageError));
                                    return null;
                                }
                                showSimpleToast(null, LocaleController.getString(R.string.EditMessageError));
                                return null;
                            }
                        } else {
                            if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                if (z) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TL_ephemeral.TL_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                                } else {
                                    peerDialogId = tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                }
                                String str2 = tL_error.text;
                                if (str2 == null || !str2.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str3 = tL_error.text;
                                    str3.getClass();
                                    switch (str3) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, Integer.valueOf(i2));
                                            return null;
                                        case "PEER_FLOOD":
                                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 0);
                                            return null;
                                        case "SCHEDULE_TOO_MUCH":
                                            showSimpleToast(lastFragment, LocaleController.getString(R.string.MessageScheduledLimitReached));
                                            return null;
                                    }
                                }
                                String restrictedErrorText = tL_error.text;
                                TLRPC.Chat chat2 = peerDialogId < 0 ? MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId)) : null;
                                String str4 = tL_error.text;
                                str4.getClass();
                                switch (str4) {
                                    case "CHAT_SEND_VOICES_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 20);
                                        break;
                                    case "CHAT_SEND_PLAIN_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 22);
                                        break;
                                    case "CHAT_SEND_AUDIOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 18);
                                        break;
                                    case "CHAT_SEND_POLL_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 10);
                                        break;
                                    case "CHAT_SEND_DOCS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 19);
                                        break;
                                    case "CHAT_SEND_ROUNDVIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 21);
                                        break;
                                    case "CHAT_SEND_VIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 17);
                                        break;
                                    case "CHAT_SEND_GIFS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 23);
                                        break;
                                    case "CHAT_SEND_PHOTOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 16);
                                        break;
                                    case "CHAT_SEND_STICKERS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 8);
                                        break;
                                }
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, restrictedErrorText);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_importChatInvite) {
                                BaseFragment lastFragment3 = lastFragment == null ? LaunchActivity.getLastFragment() : lastFragment;
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleAlert(lastFragment3, LocaleController.getString(R.string.FloodWait));
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    showSimpleAlert(lastFragment3, LocaleController.getString(R.string.JoinToGroupErrorFull));
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (lastFragment3.getParentActivity() != null) {
                                        lastFragment3.showDialog(new LimitReachedBottomSheet(5, lastFragment3, lastFragment3.getParentActivity(), i, null));
                                        return null;
                                    }
                                    lastFragment3.presentFragment(new TooManyCommunitiesActivity(0));
                                    return null;
                                }
                                if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                                    showSimpleAlert(lastFragment3, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired));
                                    return null;
                                }
                                showSimpleAlert(lastFragment3, LocaleController.getString(R.string.JoinToGroupErrorNotExist));
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                                if (lastFragment != null && lastFragment.getParentActivity() != null) {
                                    Activity parentActivity = lastFragment.getParentActivity();
                                    StringBuilder sb3 = new StringBuilder();
                                    zzko.m(R.string.ErrorOccurred, "\n", sb3);
                                    sb3.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb3.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                    }
                                    return tL_error.text.startsWith("FLOOD_WAIT") ? showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait)) : showSimpleAlert(lastFragment, tL_error.text);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidPhoneNumber));
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb4 = new StringBuilder();
                                        zzko.m(R.string.ErrorOccurred, "\n", sb4);
                                        sb4.append(tL_error.text);
                                        return showSimpleAlert(lastFragment, sb4.toString());
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        if (tL_error.code == 400) {
                                            return showSimpleAlert(lastFragment, LocaleController.getString(R.string.CancelLinkExpired));
                                        }
                                        return tL_error.text.startsWith("FLOOD_WAIT") ? showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait)) : showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidPhoneNumber));
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden));
                                            return null;
                                        }
                                        showSimpleAlert(lastFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            LoginActivity.needShowInvalidAlert(lastFragment, (String) objArr[0], false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            showSimpleAlert(lastFragment, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]));
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            LoginActivity.needShowInvalidAlert(lastFragment, (String) objArr[0], true);
                                            return null;
                                        }
                                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str5 = tL_error.text;
                                        str5.getClass();
                                        if (str5.equals("USERNAME_INVALID")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.UsernameInvalid));
                                            return null;
                                        }
                                        if (str5.equals("USERNAME_OCCUPIED")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.UsernameInUse));
                                            return null;
                                        }
                                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                            return null;
                                        }
                                        StringBuilder sb5 = new StringBuilder();
                                        zzko.m(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        showSimpleAlert(lastFragment, sb5.toString());
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            showSimpleToast(lastFragment, getFloodWaitString(tL_error.text));
                                            return null;
                                        }
                                        showSimpleToast(lastFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str6 = tL_error.text;
                                        str6.getClass();
                                        if (str6.equals("BOT_PRECHECKOUT_FAILED")) {
                                            showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str6.equals("PAYMENT_FAILED")) {
                                            showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        showSimpleToast(lastFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("SHIPPING_NOT_AVAILABLE")) {
                                            showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        showSimpleToast(lastFragment, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb6 = new StringBuilder();
                                        zzko.m(R.string.PaymentConfirmationError, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        showSimpleAlert(lastFragment, sb6.toString());
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void showAddBrowserException(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, Utilities.Callback<String> callback) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(z ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal));
        builder.setMessage(LocaleController.getString(z ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i, resourcesProvider));
        editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
        editTextBoldCursor.setBackground(gradientDrawable);
        ShareAlert$$ExternalSyntheticLambda1 shareAlert$$ExternalSyntheticLambda1 = new ShareAlert$$ExternalSyntheticLambda1(7, editTextBoldCursor, callback, alertDialogArr, currentFocus);
        editTextBoldCursor.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(shareAlert$$ExternalSyntheticLambda1, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 4.0f, 24.0f, 9.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new EmojiView$$ExternalSyntheticLambda21(shareAlert$$ExternalSyntheticLambda1, 22));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda30(7));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.dismissDialogByButtons = false;
        int i2 = 0;
        alertDialogCreate.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda62(i2, editTextBoldCursor));
        alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(i2, editTextBoldCursor));
        alertDialogArr[0].show();
    }

    public static void showAddLinkToPoll(Context context, Theme.ResourcesProvider resourcesProvider, String str, TLRPC.WebPage webPage, final Utilities.Callback<String> callback, Runnable runnable) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.PollV2AddLinkTitle));
        builder.setMessage(LocaleController.getString(R.string.PollV2AddLinkMessage));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
                editorInfo.imeOptions &= -1073741825;
                return inputConnectionOnCreateInputConnection;
            }
        };
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i, resourcesProvider));
        editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return AlertsCreator.lambda$showAddLinkToPoll$18(editTextBoldCursor, callback, alertDialogArr, currentFocus, textView, i2, keyEvent);
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 4.0f, 24.0f, 9.0f));
        if (WebPagePreviewView.hasPreview(webPage)) {
            WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context, resourcesProvider, UserConfig.selectedAccount);
            webPagePreviewView.setWebPage(webPage);
            linearLayout.addView(webPagePreviewView, LayoutHelper.createLinear(-1, -2, 22.0f, 3.0f, 22.0f, 7.0f));
        }
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new AIEditorAlert$$ExternalSyntheticLambda34(17, editTextBoldCursor, callback));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda30(10));
        if (runnable != null) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new AlertsCreator$$ExternalSyntheticLambda7(11, runnable));
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.dismissDialogByButtons = false;
        alertDialogCreate.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda62(1, editTextBoldCursor));
        alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(3, editTextBoldCursor));
        alertDialogArr[0].show();
        TextView textView = (TextView) alertDialogArr[0].getButton(-3);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showAddUserAlert(TLRPC.TL_error tL_error, BaseFragment baseFragment, boolean z, boolean z2, TLObject tLObject) {
        int i = 1;
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        String str = tL_error.text;
        str.getClass();
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                builder.setMessage(LocaleController.getString(R.string.LocatedChannelsTooMuch));
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                builder.setMessage(LocaleController.getString(R.string.PublicChannelsTooMuch));
                break;
            case "USERS_TOO_FEW":
                builder.setMessage(LocaleController.getString(R.string.CreateGroupError));
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserCantAdd));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserCantAdd));
                    break;
                }
                break;
            case "USER_RESTRICTED":
                builder.setMessage(LocaleController.getString(R.string.UserRestricted));
                break;
            case "PEER_FLOOD":
                builder.setMessage(LocaleController.getString(R.string.NobodyLikesSpam2));
                builder.setNegativeButton(LocaleController.getString(R.string.MoreInfo), new AlertsCreator$$ExternalSyntheticLambda159(baseFragment, i));
                break;
            case "BOTS_TOO_MUCH":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserCantBot));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserCantBot));
                    break;
                }
                break;
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                    builder.setMessage(LocaleController.getString(R.string.AddUserErrorBlacklisted));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.AddAdminErrorBlacklisted));
                    break;
                }
                break;
            case "YOU_BLOCKED_USER":
                builder.setMessage(LocaleController.getString(R.string.YouBlockedUser));
                break;
            case "USER_ADMIN_INVALID":
                builder.setMessage(LocaleController.getString(R.string.AddBannedErrorAdmin));
                break;
            case "USERS_TOO_MUCH":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserAddLimit));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserAddLimit));
                    break;
                }
                break;
            case "ADMINS_TOO_MUCH":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserCantAdmin));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserCantAdmin));
                    break;
                }
                break;
            case "CHANNELS_TOO_MUCH":
                builder.setTitle(LocaleController.getString(R.string.ChannelTooMuchTitle));
                if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelTooMuch));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ChannelTooMuchJoin));
                    break;
                }
                break;
            case "USER_CHANNELS_TOO_MUCH":
                builder.setTitle(LocaleController.getString(R.string.ChannelTooMuchTitle));
                builder.setMessage(LocaleController.getString(R.string.UserChannelTooMuchJoin));
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserLeftError));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserLeftError));
                    break;
                }
                break;
            case "CHAT_ADMIN_INVITE_REQUIRED":
                builder.setMessage(LocaleController.getString(R.string.AddAdminErrorNotAMember));
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (z2) {
                    builder.setMessage(LocaleController.getString(R.string.InviteToCommunityError));
                    break;
                } else {
                    if (!z) {
                        builder.setMessage(LocaleController.getString(R.string.InviteToGroupError));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.InviteToChannelError));
                    }
                    break;
                }
                break;
            case "USER_ALREADY_PARTICIPANT":
                builder.setTitle(LocaleController.getString(R.string.VoipGroupVoiceChat));
                builder.setMessage(LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant));
                break;
            default:
                StringBuilder sb = new StringBuilder();
                zzko.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                builder.setMessage(sb.toString());
                break;
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show();
    }

    public static AlertDialog showAlertWithCheckbox(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Utilities.Callback<Boolean> callback, Theme.ResourcesProvider resourcesProvider) {
        return showAlertWithCheckbox(context, charSequence, charSequence2, charSequence3, charSequence4, callback, resourcesProvider, false);
    }

    public static AlertDialog showAlertWithCheckboxWithBalance(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Utilities.Callback<Boolean> callback, Theme.ResourcesProvider resourcesProvider) {
        return showAlertWithCheckbox(context, charSequence, charSequence2, charSequence3, charSequence4, callback, resourcesProvider, true);
    }

    public static AlertDialog showBanGroupCreatorFromCommunityConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, ArrayList<Long> arrayList, MessagesStorage.LongCallback longCallback, Runnable runnable) {
        boolean z;
        String pluralString;
        boolean z2 = true;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        int i2 = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.CommunityBanWarningTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i, j))));
        builder.setPositiveButton(LocaleController.getString(R.string.Ban), new AlertsCreator$$ExternalSyntheticLambda7(8, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setView(linearLayoutM);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            Long l = arrayList.get(i3);
            long jLongValue = l.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(jLongValue);
            if (chat != null) {
                StealthModeAlert.ItemCell itemCell = new StealthModeAlert.ItemCell(context, resourcesProvider, z2);
                ((TextView) itemCell.textView).setText(DialogObject.getName(chat));
                TextView textView = (TextView) itemCell.description;
                if (chatFull != null) {
                    z = false;
                    pluralString = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[i2]);
                } else {
                    z = false;
                    pluralString = null;
                }
                textView.setText(pluralString);
                ((BackupImageView) itemCell.imageView).setForUserOrChat(chat, new AvatarDrawable(chat));
                itemCell.setBackground(Theme.getSelectorDrawable(z));
                itemCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda34(alertDialogArr, longCallback, jLongValue, 0));
                linearLayoutM.addView(itemCell, LayoutHelper.createLinear(-1, -2));
            }
            i3 = i4;
            z2 = true;
            i2 = 0;
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.show();
        TextView textView2 = (TextView) alertDialogCreate.getButton(-1);
        if (textView2 != null) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        return alertDialogCreate;
    }

    public static AlertDialog showBanGroupCreatorFromCommunityJoinedChatsAlert(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, ArrayList<Long> arrayList, MessagesStorage.LongCallback longCallback) {
        boolean z;
        String pluralString;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        int i2 = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.CommunityBanUserTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i, j))));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setView(linearLayoutM);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            Long l = arrayList.get(i3);
            long jLongValue = l.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(jLongValue);
            if (chat != null) {
                StealthModeAlert.ItemCell itemCell = new StealthModeAlert.ItemCell(context, resourcesProvider, (boolean) i2);
                ((TextView) itemCell.textView).setText(DialogObject.getName(chat));
                TextView textView = (TextView) itemCell.description;
                if (chatFull != null) {
                    z = false;
                    pluralString = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[i2]);
                } else {
                    z = false;
                    pluralString = null;
                }
                textView.setText(pluralString);
                ((BackupImageView) itemCell.imageView).setForUserOrChat(chat, new AvatarDrawable(chat));
                itemCell.setBackground(Theme.getSelectorDrawable(z));
                itemCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda34(alertDialogArr, longCallback, jLongValue, 1));
                linearLayoutM.addView(itemCell, LayoutHelper.createLinear(-1, -2));
            }
            i3 = i4;
            i2 = 0;
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static void showBlockReportSpamAlert(BaseFragment baseFragment, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        long j2;
        boolean z2;
        int i;
        String string;
        final CheckBoxCell[] checkBoxCellArr;
        TextView textView;
        int i2;
        CheckBoxCell[] checkBoxCellArr2;
        LinearLayout linearLayout;
        int i3;
        CheckBoxCell[] checkBoxCellArr3;
        LinearLayout linearLayout2;
        int iDp;
        int iDp2;
        int i4;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = baseFragment.getAccountInstance();
        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider2);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(baseFragment.getCurrentAccount());
        if (encryptedChat == null) {
            j2 = j;
            if (!NotificationsController$$ExternalSyntheticOutline0.m("dialog_bar_report", j2, notificationsSettings, false)) {
                z2 = false;
            }
            if (user != null) {
                builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user)));
                SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUserAlert", R.string.BlockUserAlert, new Object[]{UserObject.getFirstName(user)}, builder);
                string = LocaleController.getString(R.string.BlockContact);
                i2 = 2;
                checkBoxCellArr2 = new CheckBoxCell[2];
                linearLayout = new LinearLayout(baseFragment.getParentActivity());
                linearLayout.setOrientation(1);
                i3 = 0;
                while (i3 < i2) {
                    if (i3 == 0 || z2) {
                        Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                        checkBoxCellArr3 = checkBoxCellArr2;
                        linearLayout2 = linearLayout;
                        CheckBoxCell checkBoxCell = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider3);
                        checkBoxCellArr3[i3] = checkBoxCell;
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        checkBoxCellArr3[i3].setTag(Integer.valueOf(i3));
                        if (i3 == 0) {
                            checkBoxCellArr3[i3].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                        } else {
                            checkBoxCellArr3[i3].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                        }
                        CheckBoxCell checkBoxCell2 = checkBoxCellArr3[i3];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                        linearLayout2.addView(checkBoxCellArr3[i3], LayoutHelper.createLinear(-1, -2));
                        i4 = 1;
                        checkBoxCellArr3[i3].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda53(checkBoxCellArr3, i4));
                    } else {
                        checkBoxCellArr3 = checkBoxCellArr2;
                        linearLayout2 = linearLayout;
                        i4 = 1;
                    }
                    i3 += i4;
                    linearLayout = linearLayout2;
                    checkBoxCellArr2 = checkBoxCellArr3;
                    i2 = 2;
                    resourcesProvider2 = resourcesProvider;
                }
                CheckBoxCell[] checkBoxCellArr4 = checkBoxCellArr2;
                i = -1;
                builder.setView(linearLayout);
                checkBoxCellArr = checkBoxCellArr4;
            } else {
                i = -1;
                if (chat == null && z) {
                    builder.setTitle(LocaleController.getString(R.string.ReportUnrelatedGroup));
                    if (chatFull != null) {
                        TLRPC.ChannelLocation channelLocation = chatFull.location;
                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                            SendMessagesHelper$$ExternalSyntheticOutline0.m("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, new Object[]{((TLRPC.TL_channelLocation) channelLocation).address}, builder);
                        } else {
                            builder.setMessage(LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress));
                        }
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress));
                    }
                } else {
                    builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                    if (ChatObject.isChannel(chat) || chat.megagroup) {
                        builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertChannel));
                    }
                }
                string = LocaleController.getString(R.string.ReportChat);
                checkBoxCellArr = null;
            }
            final long j3 = j2;
            builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    AlertsCreator.lambda$showBlockReportSpamAlert$39(user, accountInstance, checkBoxCellArr, j3, chat, encryptedChat, z, intCallback, alertDialog, i5);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(i);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        j2 = j;
        z2 = true;
        if (user != null) {
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user)));
            SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUserAlert", R.string.BlockUserAlert, new Object[]{UserObject.getFirstName(user)}, builder);
            string = LocaleController.getString(R.string.BlockContact);
            i2 = 2;
            checkBoxCellArr2 = new CheckBoxCell[2];
            linearLayout = new LinearLayout(baseFragment.getParentActivity());
            linearLayout.setOrientation(1);
            i3 = 0;
            while (i3 < i2) {
                if (i3 == 0) {
                    Theme.ResourcesProvider resourcesProvider4 = resourcesProvider2;
                    checkBoxCellArr3 = checkBoxCellArr2;
                    linearLayout2 = linearLayout;
                    CheckBoxCell checkBoxCell3 = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider4);
                    checkBoxCellArr3[i3] = checkBoxCell3;
                    checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr3[i3].setTag(Integer.valueOf(i3));
                    if (i3 == 0) {
                        checkBoxCellArr3[i3].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        checkBoxCellArr3[i3].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    CheckBoxCell checkBoxCell4 = checkBoxCellArr3[i3];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell4.setPadding(iDp, 0, iDp2, 0);
                    linearLayout2.addView(checkBoxCellArr3[i3], LayoutHelper.createLinear(-1, -2));
                    i4 = 1;
                    checkBoxCellArr3[i3].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda53(checkBoxCellArr3, i4));
                } else {
                    Theme.ResourcesProvider resourcesProvider5 = resourcesProvider2;
                    checkBoxCellArr3 = checkBoxCellArr2;
                    linearLayout2 = linearLayout;
                    CheckBoxCell checkBoxCell5 = new CheckBoxCell(baseFragment.getParentActivity(), 1, 17, false, resourcesProvider5);
                    checkBoxCellArr3[i3] = checkBoxCell5;
                    checkBoxCell5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr3[i3].setTag(Integer.valueOf(i3));
                    if (i3 == 0) {
                        checkBoxCellArr3[i3].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        checkBoxCellArr3[i3].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    CheckBoxCell checkBoxCell6 = checkBoxCellArr3[i3];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell6.setPadding(iDp, 0, iDp2, 0);
                    linearLayout2.addView(checkBoxCellArr3[i3], LayoutHelper.createLinear(-1, -2));
                    i4 = 1;
                    checkBoxCellArr3[i3].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda53(checkBoxCellArr3, i4));
                }
                i3 += i4;
                linearLayout = linearLayout2;
                checkBoxCellArr2 = checkBoxCellArr3;
                i2 = 2;
                resourcesProvider2 = resourcesProvider;
            }
            CheckBoxCell[] checkBoxCellArr5 = checkBoxCellArr2;
            i = -1;
            builder.setView(linearLayout);
            checkBoxCellArr = checkBoxCellArr5;
        } else {
            i = -1;
            if (chat == null) {
                builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                if (ChatObject.isChannel(chat)) {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                }
            } else {
                builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                if (ChatObject.isChannel(chat)) {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                }
            }
            string = LocaleController.getString(R.string.ReportChat);
            checkBoxCellArr = null;
        }
        final long j4 = j2;
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i5) {
                AlertsCreator.lambda$showBlockReportSpamAlert$39(user, accountInstance, checkBoxCellArr, j4, chat, encryptedChat, z, intCallback, alertDialog, i5);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        textView = (TextView) alertDialogCreate2.getButton(i);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showBlockReportSpamReplyAlert(final ChatActivity chatActivity, final MessageObject messageObject, long j, final Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        int i = 0;
        if (chatActivity == null || chatActivity.getParentActivity() == null || messageObject == null) {
            return;
        }
        final AccountInstance accountInstance = chatActivity.getAccountInstance();
        TLRPC.User user = j > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j)) : null;
        TLRPC.Chat chat = j < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j)) : null;
        if (user == null && chat == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), 0, resourcesProvider);
        builder.setDimEnabled(runnable == null);
        builder.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda20(4, runnable));
        builder.setTitle(LocaleController.getString(R.string.BlockUser));
        if (user != null) {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUserReplyAlert", R.string.BlockUserReplyAlert, new Object[]{UserObject.getFirstName(user)}, builder);
        } else {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("BlockUserReplyAlert", R.string.BlockUserReplyAlert, new Object[]{chat.title}, builder);
        }
        LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
        linearLayout.setOrientation(1);
        final CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(chatActivity.getParentActivity(), 1, 17, false, resourcesProvider)};
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        checkBoxCellArr[0].setTag(0);
        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
        checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda53(checkBoxCellArr, i));
        builder.setView(linearLayout);
        final TLRPC.Chat chat2 = chat;
        final TLRPC.User user2 = user;
        builder.setPositiveButton(LocaleController.getString(R.string.BlockAndDeleteReplies), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                CheckBoxCell[] checkBoxCellArr2 = checkBoxCellArr;
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$37(user2, accountInstance, chatActivity, chat2, messageObject, checkBoxCellArr2, resourcesProvider, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        chatActivity.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showCallsForbidden(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        zzkr.m(i2, resourcesProvider, textView, 20.0f);
        textView.setText(LocaleController.getString(R.string.CallForbiddenInviteLinkTitle));
        textView.setGravity(17);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(-1, -2, 32.0f, 16.0f, 32.0f, 8.0f), context);
        OKLCH.m(i2, resourcesProvider, textViewM, 14.0f);
        textViewM.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i, j))));
        textViewM.setGravity(17);
        linearLayoutM.addView(textViewM, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 18.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false);
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        bottomSheetM.customView = linearLayoutM;
        buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda6(i, buttonWithCounterView, bottomSheetM, j, resourcesProvider));
        bottomSheetM.fixNavigationBar();
        bottomSheetM.show();
    }

    public static void showChatWithAdmin(BaseFragment baseFragment, TLRPC.User user, String str, boolean z, int i) {
        int i2 = 1;
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        BottomSheet bottomSheet = new BottomSheet(baseFragment.getParentActivity(), false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(z ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
        bottomSheet.bigTitle = true;
        LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(baseFragment.getParentActivity());
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -1, 0, 21, 0, 21, 8));
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setTextSize(1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i, false))));
        TextView textView2 = new TextView(baseFragment.getParentActivity());
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.IUnderstand));
        textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 8));
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        textView2.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheet, i2));
    }

    public static void showCustomNotificationsDialog(BaseFragment baseFragment, long j, int i, int i2, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, int i3, MessagesStorage.IntCallback intCallback) {
        showCustomNotificationsDialog(baseFragment, j, i, i2, arrayList, arrayList2, i3, intCallback, null);
    }

    public static void showDeclineSuggestedPostDialog(BaseFragment baseFragment, long j, boolean z, Utilities.Callback<String> callback) {
        int i = 1;
        final Context context = baseFragment.getContext();
        AlertDialog.Builder builder = z ? new DarkAlertDialog.Builder(context, 0, null) : new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(R.string.SuggestedMessageDecline));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(j))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        EditText editText = new EditText(context);
        editText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(Theme.createEditTextDrawable(context));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(255) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                Vibrator vibrator;
                CharSequence charSequenceFilter = super.filter(charSequence, i2, i3, spanned, i4, i5);
                if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length() && (vibrator = (Vibrator) context.getSystemService("vibrator")) != null) {
                    vibrator.vibrate(200L);
                }
                return charSequenceFilter;
            }
        }});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Decline), new AIEditorAlert$$ExternalSyntheticLambda34(12, callback, editText));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new AlertsCreator$$ExternalSyntheticLambda108(editText, i));
        frameLayout.addView(editText, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(editText, 16), 100L);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showDisableSharingInfo(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (context == null) {
            return;
        }
        boolean[] zArr = new boolean[1];
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, null);
        Runnable runnable2 = bottomSheetM.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(110, 110, 17, 0, 21, 0, 11));
        rLottieImageView.setAnimation(R.raw.raised_hand, 110, 110);
        rLottieImageView.setAutoRepeat(false);
        rLottieImageView.playAnimation();
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 14));
        PremiumFeatureCell premiumFeatureCell = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell.title.setText(LocaleController.getString(R.string.DisableSharingInfoHeader1));
        premiumFeatureCell.description.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
        premiumFeatureCell.nextIcon.setVisibility(8);
        premiumFeatureCell.imageView.setImageResource(R.drawable.menu_photo_off_24);
        premiumFeatureCell.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell2 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell2.title.setText(LocaleController.getString(R.string.DisableSharingInfoHeader2));
        premiumFeatureCell2.description.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
        premiumFeatureCell2.nextIcon.setVisibility(8);
        premiumFeatureCell2.imageView.setImageResource(R.drawable.menu_share_off_24);
        premiumFeatureCell2.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell2, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell3 = new PremiumFeatureCell(context, resourcesProvider);
        premiumFeatureCell3.title.setText(LocaleController.getString(R.string.DisableSharingInfoHeader3));
        premiumFeatureCell3.description.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
        premiumFeatureCell3.nextIcon.setVisibility(8);
        premiumFeatureCell3.imageView.setImageResource(R.drawable.menu_download_off_24);
        premiumFeatureCell3.imageView.setColorFilter(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(premiumFeatureCell3, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, 8.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(12, zArr, runnable2));
        buttonWithCounterView.setRound();
        buttonWithCounterView.setText(LocaleController.getString(R.string.DisableSharingInfoButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        bottomSheetM.customView = linearLayout;
        bottomSheetM.show();
        bottomSheetM.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda145(0, runnable, zArr));
    }

    public static void showDiscardTopicDialog(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DiscardTopic));
        builder.setMessage(LocaleController.getString(R.string.DiscardTopicMessage));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AIEditorAlert$$ExternalSyntheticLambda20(17));
        builder.setPositiveButton(LocaleController.getString(R.string.Discard), new AlertsCreator$$ExternalSyntheticLambda7(5, runnable));
        baseFragment.showDialog(builder.create());
    }

    public static void showFloodWaitAlert(String str, BaseFragment baseFragment) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        String pluralString = iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(builder.create(), true, null);
    }

    public static void showGiftThemeApplyConfirm(Context context, Theme.ResourcesProvider resourcesProvider, int i, TL_stars.StarGift starGift, long j, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.addView(new StarGiftSheet.GiftThemeReuseTopView(context, starGift, userOrChat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
        ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
        new AlertDialog.Builder(context, 0, resourcesProvider).setView(linearLayoutM).setPositiveButton(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new AlertsCreator$$ExternalSyntheticLambda7(0, runnable)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    public static void showLeaveGroupWithFutureOwner(BaseFragment baseFragment, TLRPC.Chat chat, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        if (baseFragment == null || baseFragment.getParentActivity() == null || chat == null) {
            return;
        }
        Context context = baseFragment.getContext();
        TLRPC.User currentUser = UserConfig.getInstance(baseFragment.getCurrentAccount()).getCurrentUser();
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        BackupImageView backupImageView = new BackupImageView(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(new PorterDuffColorFilter(baseFragment.getThemedColor(Theme.key_divider), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
        BackupImageView backupImageView2 = new BackupImageView(context) {
            final Path path = new Path();

            @Override
            public void onDraw(Canvas canvas) {
                canvas.save();
                this.path.rewind();
                this.path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
                super.onDraw(canvas);
                canvas.restore();
            }
        };
        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
        avatarDrawable2.setInfo(user);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
        backupImageView2.setForUserOrChat(user, avatarDrawable2);
        frameLayout.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
        BackupImageView backupImageView3 = new BackupImageView(context);
        AvatarDrawable avatarDrawable3 = new AvatarDrawable();
        avatarDrawable3.setInfo(chat);
        backupImageView3.setRoundRadius(AndroidUtilities.dp(12.0f));
        backupImageView3.setForUserOrChat(chat, avatarDrawable3);
        frameLayout.addView(backupImageView3, LayoutHelper.createFrame(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTopViewAspectRatio(-1.0f);
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user), chat.title)));
        builder.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new AlertsCreator$$ExternalSyntheticLambda7(6, runnable));
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new AlertsCreator$$ExternalSyntheticLambda7(7, runnable2));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        View button = alertDialogCreate.getButton(-1);
        if (button instanceof TextView) {
            ((TextView) button).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static void showOpenExternalBrowserAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, boolean z, boolean z2, final Utilities.Callback2<Boolean, Boolean> callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final AlertDialog[] alertDialogArr = new AlertDialog[1];
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
            textView.setBackground(gradientDrawable);
            final CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, resourcesProvider);
            checkBoxCell.setMultiline(true);
            checkBoxCell.getTextView().getLayoutParams().width = -1;
            checkBoxCell.getTextView().setSingleLine(false);
            checkBoxCell.getTextView().setMaxLines(3);
            checkBoxCell.getTextView().setTextSize(1, 16.0f);
            checkBoxCell.setText(LocaleController.getString(z ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            checkBoxCell.setOnClickListener(new HintView$$ExternalSyntheticLambda0(checkBoxCell, 11));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 22.0f, 4.0f, 22.0f, 9.0f));
            if (z2) {
                linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2, 3, 8, 6, 8, 4));
            }
            builder.setView(linearLayout);
            builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
            final int i2 = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            AlertsCreator.lambda$showOpenExternalBrowserAlert$45(callback2, checkBoxCell, alertDialogArr, alertDialog, i3);
                            break;
                        default:
                            AlertsCreator.lambda$showOpenExternalBrowserAlert$46(callback2, checkBoxCell, alertDialogArr, alertDialog, i3);
                            break;
                    }
                }
            });
            final int i3 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i3) {
                        case 0:
                            AlertsCreator.lambda$showOpenExternalBrowserAlert$45(callback2, checkBoxCell, alertDialogArr, alertDialog, i4);
                            break;
                        default:
                            AlertsCreator.lambda$showOpenExternalBrowserAlert$46(callback2, checkBoxCell, alertDialogArr, alertDialog, i4);
                            break;
                    }
                }
            });
            alertDialogArr[0] = builder.show();
        }
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2) {
        showOpenUrlAlert(baseFragment, str, z, true, z2, false, null, null);
    }

    public static void showPayForMessageAlert(final int i, final long j, final long j2, int i2, final Runnable runnable) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        TLRPC.Chat chat;
        if (runnable == null) {
            return;
        }
        if (j2 <= MessagesController.getInstance(i).getMainSettings().getLong(RendererCapabilities.CC.m(j, "ask_paid_message_", "_price"), 0L)) {
            runnable.run();
            return;
        }
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
        String shortName = DialogObject.getShortName(i, j);
        if (ChatObject.isMonoForum(i, j)) {
            shortName = ForumUtilities.getMonoForumTitle(i, j);
        } else if (safeLastFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) safeLastFragment;
            if (chatActivity.isComments && chatActivity.getDialogId() == j && (chat = chatActivity.replyOriginalChat) != null) {
                shortName = DialogObject.getShortName(i, -chat.id);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = (int) j2;
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i3, shortName)));
        spannableStringBuilder.append((CharSequence) " ");
        if (i2 == 1) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i3)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) (((long) i2) * j2))));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i2)));
        }
        showAlertWithCheckboxWithBalance(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                long j3 = j;
                long j4 = j2;
                AlertsCreator.lambda$showPayForMessageAlert$66(i, j3, j4, runnable, (Boolean) obj);
            }
        }, resourcesProvider);
    }

    public static ActionBarPopupWindow showPopupMenu(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view, int i, int i2) {
        Rect rect = new Rect();
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupAnimation);
        actionBarPopupWindow.setAnimationEnabled(true);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setOnKeyListener(new AlertsCreator$$ExternalSyntheticLambda65(actionBarPopupWindow, 0));
        actionBarPopupWindowLayout.measure(OKLCH.m(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        actionBarPopupWindow.showAsDropDown(view, i, i2);
        actionBarPopupWindowLayout.updateRadialSelectors();
        ActionBarPopupWindow.startAnimation(actionBarPopupWindowLayout);
        actionBarPopupWindowLayout.setOnTouchListener(new AlertsCreator$$ExternalSyntheticLambda66(0, actionBarPopupWindow, rect));
        return actionBarPopupWindow;
    }

    public static AlertDialog showSecretLocationAlert(Context context, int i, Runnable runnable, boolean z, Theme.ResourcesProvider resourcesProvider) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = MessagesController.getInstance(i).availableMapProviders;
        if ((i2 & 1) != 0) {
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.MapPreviewProviderTelegram, arrayList, 0, arrayList2);
        }
        if ((i2 & 2) != 0) {
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.MapPreviewProviderGoogle, arrayList, 1, arrayList2);
        }
        if ((i2 & 4) != 0) {
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.MapPreviewProviderYandex, arrayList, 3, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.MapPreviewProviderTitle));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(context, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue((CharSequence) arrayList.get(i3), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i3)).intValue());
            radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(arrayList2, runnable, builder, 5));
        }
        if (!z) {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        AlertDialog alertDialogShow = builder.show();
        if (z) {
            alertDialogShow.setCanceledOnTouchOutside(false);
        }
        return alertDialogShow;
    }

    public static void showSendMediaAlert(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (i == 0 || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.UnableForward));
        if (i == 1) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedStickers));
        } else if (i == 2) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedMedia));
        } else if (i == 3) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPolls));
        } else if (i == 4) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedStickersAll));
        } else if (i == 5) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedMediaAll));
        } else if (i == 6) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPollsAll));
        } else if (i == 7) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages));
        } else if (i == 8) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages));
        } else if (i == 9) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedVideoAll));
        } else if (i == 10) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll));
        } else if (i == 11) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedVideo));
        } else if (i == 12) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPhoto));
        } else if (i == 13) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll));
        } else if (i == 14) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedVoice));
        } else if (i == 15) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedRoundAll));
        } else if (i == 16) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedRound));
        } else if (i == 17) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll));
        } else if (i == 18) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedDocuments));
        } else if (i == 19) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedMusicAll));
        } else if (i == 20) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedMusic));
        } else if (i == 21) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodoAll));
        } else if (i == 22) {
            builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodo));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(builder.create(), true, null);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str) {
        return showSimpleAlert(baseFragment, null, str);
    }

    public static AlertDialog showSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        AlertDialog alertDialogCreateSimpleConfirmAlert = createSimpleConfirmAlert(context, resourcesProvider, str, charSequence, str2, runnable);
        alertDialogCreateSimpleConfirmAlert.show();
        if (z && (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        return alertDialogCreateSimpleConfirmAlert;
    }

    public static Toast showSimpleToast(BaseFragment baseFragment, String str) {
        if (str == null) {
            return null;
        }
        Toast toastMakeText = Toast.makeText((baseFragment == null || baseFragment.getParentActivity() == null) ? ApplicationLoader.applicationContext : baseFragment.getParentActivity(), str, 1);
        toastMakeText.show();
        return toastMakeText;
    }

    public static AlertDialog showUpdateAppAlert(Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(str);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        if (z) {
            builder.setNegativeButton(LocaleController.getString(R.string.UpdateApp), new AlertsCreator$$ExternalSyntheticLambda8(context, 3));
        }
        return builder.show();
    }

    public static void updateDayPicker(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, numberPicker2.getValue());
        calendar.set(1, numberPicker3.getValue());
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(calendar.getActualMaximum(5));
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        return checkScheduleDate(textView, textView2, 0L, j, i, numberPicker, numberPicker2, numberPicker3);
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, chat, user, z2, z3, z4, z5, booleanCallback, baseFragment != null ? baseFragment.getResourceProvider() : null);
    }

    public static Dialog createColorSelectDialog(Activity activity, final long j, final long j2, final int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (j != 0) {
            i2 = notificationsSettings.contains("color_" + sharedPrefKey) ? notificationsSettings.getInt("color_" + sharedPrefKey, -16776961) : DialogObject.isChatDialog(j) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 1) {
            i2 = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 0) {
            i2 = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i == 3) {
            i2 = notificationsSettings.getInt("StoriesLed", -16776961);
        } else {
            i2 = (i == 5 || i == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i2};
        for (int i3 = 0; i3 < 9; i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            int i4 = TextColorCell.colors[i3];
            radioColorCell.radioButton.setColor(i4, i4);
            radioColorCell.setTextAndValue(strArr[i3], i2 == TextColorCell.colorsToSave[i3]);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda14(linearLayout, iArr));
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.LedColor));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i5) {
                AlertsCreator.lambda$createColorSelectDialog$203(j, sharedPrefKey, iArr, j2, i, runnable, alertDialog, i5);
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.LedDisabled), new VoIPService$$ExternalSyntheticLambda80(runnable, i, j, 2));
        if (j != 0) {
            builder.setNegativeButton(LocaleController.getString(R.string.Default), new AIEditorAlert$$ExternalSyntheticLambda34(8, sharedPrefKey, runnable));
        }
        return builder.create();
    }

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        String res = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle));
        builder.setMessage(LocaleController.getString(R.string.PermissionDrawAboveOtherApps));
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new JoinGroupAlert$$ExternalSyntheticLambda9(activity, z));
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), onButtonClickListener);
        builder.setTopViewAspectRatio(0.50427353f);
        return builder;
    }

    public static Dialog createPrioritySelectDialog(Activity activity, long j, final long j2, int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        final long j3 = j;
        final int i2 = i;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        int i3 = 0;
        if (j3 != 0) {
            int i4 = notificationsSettings.getInt("priority_" + j3, 3);
            iArr[0] = i4;
            if (i4 == 3) {
                iArr[0] = 0;
            } else if (i4 == 4) {
                iArr[0] = 1;
            } else if (i4 == 5) {
                iArr[0] = 2;
            } else if (i4 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i2 == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i2 == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i2 == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i2 == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i2 == 4 || i2 == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i5 = iArr[0];
            if (i5 == 4) {
                iArr[0] = 0;
            } else if (i5 == 5) {
                iArr[0] = 1;
            } else if (i5 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        int i6 = 0;
        while (i6 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), i3, AndroidUtilities.dp(4.0f), i3);
            radioColorCell.setTag(Integer.valueOf(i6));
            radioColorCell.radioButton.setColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i6], iArr[i3] == i6);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertDialog.Builder builder2 = builder;
                    AlertsCreator.lambda$createPrioritySelectDialog$216(iArr, j3, j2, i2, notificationsSettings, builder2, runnable, view);
                }
            });
            i6++;
            j3 = j;
            i2 = i;
            i3 = 0;
        }
        builder.setTitle(LocaleController.getString(R.string.NotificationsImportance));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, (Runnable) null, resourcesProvider);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2) {
        return createSimpleAlert(context, str, str2, null);
    }

    public static BottomSheet.Builder createSoundFrequencyPickerDialog(Context context, int i, int i2, SoundFrequencyDelegate soundFrequencyDelegate, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(i - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(25));
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1, new Object[0]);
            }
        };
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(10);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setValue((i2 / 60) - 1);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(26));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(0);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setValue(0);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(27));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i5 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i5);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                numberPicker2.setItemCount(i5);
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                numberPicker3.setItemCount(i5);
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                this.ignoreLayout = false;
                super.onMeasure(i3, i4);
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
        textView.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(11));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.4f));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, -2, 0.2f, 16));
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.4f));
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int i3 = scheduleDatePickerColors.buttonBackgroundColor;
        int i4 = scheduleDatePickerColors.buttonBackgroundPressedColor;
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i3, i4, i4));
        textView2.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        AIEditorAlert$$ExternalSyntheticLambda20 aIEditorAlert$$ExternalSyntheticLambda20 = new AIEditorAlert$$ExternalSyntheticLambda20(28);
        numberPicker.setOnValueChangedListener(aIEditorAlert$$ExternalSyntheticLambda20);
        numberPicker2.setOnValueChangedListener(aIEditorAlert$$ExternalSyntheticLambda20);
        textView2.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda4(numberPicker, numberPicker2, soundFrequencyDelegate, builder, 1));
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider, int i) {
        int i2 = 5;
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Hours", i3, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(24);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Minutes", i3, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i5 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i5);
                numberPicker2.setItemCount(i5);
                numberPicker3.setItemCount(i5);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i5;
                this.ignoreLayout = false;
                super.onMeasure(i3, i4);
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
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(4));
        TextView textView2 = new TextView(context);
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(i2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i3 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j2 = configTime.get(timeUnit) * 2;
        final long j3 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final TextView textView3 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout3.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AlertsCreator$$ExternalSyntheticLambda131(i3, 2));
        final int i4 = i == 1 ? 5 : 3;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i5, int i6) {
                NumberPicker numberPicker5 = numberPicker2;
                NumberPicker numberPicker6 = numberPicker3;
                AlertsCreator.checkScheduleDate(textView3, null, j2, j3, i4, numberPicker, numberPicker5, numberPicker6);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(9));
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(10));
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j > 0 && j != 2147483646) {
            long j4 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j4 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j4);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        checkScheduleDate(textView3, null, j2, j3, i4, numberPicker, numberPicker2, numberPicker3);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        int i5 = scheduleDatePickerColors.buttonBackgroundColor;
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, i5, Theme.AdaptiveRipple.calcRippleColor(i5)));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet.Builder builder2 = builder;
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$255(zArr, j2, j3, i4, numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder2, view);
            }
        });
        ScaleStateListAnimator.apply(textView3, 0.02f, 1.2f);
        TextView textView4 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(i == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        textView4.setTextColor(scheduleDatePickerColors.buttonBackgroundColor);
        textView4.setTextSize(1, 14.0f);
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
        int color2 = Theme.getColor(null, Theme.key_listSelector, false);
        textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, 48, 83, 16, 0, 16, 16));
        textView4.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(zArr, scheduleDatePickerDelegate, builder, 6));
        ScaleStateListAnimator.apply(textView4, 0.02f, 1.2f);
        bottomSheet.customView = linearLayout;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda41(1, runnable, zArr));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static boolean ensurePaidMessageConfirmation(int i, long j, int i2, Utilities.Callback<Long> callback, long j2) {
        if (callback == null) {
            return false;
        }
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        long j3 = ((long) i2) * sendPaidMessagesStars;
        StarsController.getInstance(i, false).sendingMessagesCount.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            callback.run(Long.valueOf(j3));
            return false;
        }
        long j4 = sendPaidMessagesStars;
        showPayForMessageAlert(i, j, j4, i2, new AlertsCreator$$ExternalSyntheticLambda6(i, j3, j, callback, j4, 0));
        return true;
    }

    public static AlertDialog showAlertWithCheckbox(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Utilities.Callback<Boolean> callback, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (context == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        boolean[] zArr = new boolean[1];
        TextView textView = new TextView(context) {
            @Override
            public void setText(CharSequence charSequence5, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence5, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(charSequence2);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        TextView textView2 = new TextView(context);
        zzkr.m(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider, textView2, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(charSequence);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence3)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 7, AndroidUtilities.dp(12.0f)));
            checkBoxCellArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) checkBoxCellArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            checkBoxCellArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            checkBoxCellArr[0].setText(charSequence3, "", false, false, false);
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 3));
        }
        builder.setPositiveButton(charSequence4, new AIEditorAlert$$ExternalSyntheticLambda34(9, callback, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        if (z) {
            alertDialogCreate.needStarsBalance = true;
        }
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static void showCustomNotificationsDialog(final BaseFragment baseFragment, long j, final int i, final int i2, final ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, final ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, final int i3, final MessagesStorage.IntCallback intCallback, final MessagesStorage.IntCallback intCallback2) {
        ?? r13;
        final long j2 = j;
        ?? r14 = 0;
        ?? r15 = 1;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final boolean zIsGlobalNotificationsEnabled = NotificationsController.getInstance(i3).isGlobalNotificationsEnabled(j2, false, false);
        String string = LocaleController.getString(R.string.NotificationsTurnOn);
        int i4 = R.string.MuteFor;
        String[] strArr = {string, LocaleController.formatString("MuteFor", i4, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i4, LocaleController.formatPluralString("Days", 2, new Object[0])), (j2 == 0 && (baseFragment instanceof NotificationsCustomSettingsActivity)) ? null : LocaleController.getString(R.string.NotificationsCustomize), LocaleController.getString(R.string.NotificationsTurnOff)};
        int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
        LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
        linearLayout.setOrientation(1);
        final ?? builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        int i5 = 0;
        ?? r0 = linearLayout;
        while (i5 < 5) {
            if (strArr[i5] == null) {
                r13 = r0;
            } else {
                ?? textView = new TextView(baseFragment.getParentActivity());
                Drawable drawable = baseFragment.getParentActivity().getResources().getDrawable(iArr[i5]);
                if (i5 == 4) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, r14));
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_text_RedRegular, r14), PorterDuff.Mode.MULTIPLY));
                } else {
                    textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, r14));
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogIcon, r14), PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextSize(r15, 16.0f);
                textView.setLines(r15);
                textView.setMaxLines(r15);
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                textView.setTag(Integer.valueOf(i5));
                textView.setBackgroundDrawable(Theme.getSelectorDrawable(r14));
                textView.setPadding(AndroidUtilities.dp(24.0f), r14, AndroidUtilities.dp(24.0f), r14);
                textView.setSingleLine(r15);
                textView.setGravity(19);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                textView.setText(strArr[i5]);
                r0.addView(textView, LayoutHelper.createLinear(-1, 48, 51));
                r13 = r0;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertDialog.Builder builder2 = builder;
                        AlertsCreator.lambda$showCustomNotificationsDialog$40(j2, i3, zIsGlobalNotificationsEnabled, i, intCallback2, i2, baseFragment, arrayList, arrayList2, intCallback, builder2, view);
                    }
                });
            }
            i5++;
            j2 = j;
            r0 = r13;
            r14 = 0;
            r15 = 1;
        }
        builder.setTitle(LocaleController.getString(R.string.Notifications));
        builder.setView(r0);
        baseFragment.showDialog(builder.create());
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, true, z2, false, null, resourcesProvider);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str, String str2) {
        return showSimpleAlert(baseFragment, str, str2, null);
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        long timeInMillis;
        int i2;
        int iBetween;
        int i3;
        boolean z;
        boolean z2;
        String pluralString;
        int i4;
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        int value3 = numberPicker3.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i5 = calendar.get(1);
        calendar.get(6);
        if (j2 > 0) {
            calendar.setTimeInMillis((j2 * 1000) + jCurrentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            iBetween = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(jCurrentTimeMillis).atZone(ZoneId.systemDefault()).d(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).d());
            timeInMillis = calendar.getTimeInMillis();
            i2 = 23;
            i3 = 59;
        } else {
            timeInMillis = j2;
            i2 = 0;
            iBetween = 0;
            i3 = 0;
        }
        long millis = j > 0 ? TimeUnit.SECONDS.toMillis(j) : 60000L;
        long j3 = jCurrentTimeMillis + millis;
        calendar.setTimeInMillis(j3);
        int i6 = calendar.get(11);
        int i7 = calendar.get(12);
        long j4 = timeInMillis;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        numberPicker.setMinValue(0);
        if (j4 > 0) {
            numberPicker.setMaxValue(iBetween);
        }
        int value4 = numberPicker.getValue();
        numberPicker2.setMinValue(value4 == 0 ? i6 : 0);
        if (j4 > 0) {
            numberPicker2.setMaxValue(value4 == iBetween ? i2 : 23);
        }
        int value5 = numberPicker2.getValue();
        numberPicker3.setMinValue((value4 == 0 && value5 == i6) ? i7 : 0);
        if (j4 > 0) {
            numberPicker3.setMaxValue((value4 == iBetween && value5 == i2) ? i3 : 59);
        }
        int value6 = numberPicker3.getValue();
        if (timeInMillis2 <= j3) {
            calendar.setTimeInMillis(j3);
        } else if (j4 > 0 && timeInMillis2 > j4) {
            calendar.setTimeInMillis(j4);
        }
        int i8 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis3 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i4 = 0;
            } else {
                i4 = i5 == i8 ? 1 : 2;
            }
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i * 3) + i4).format(timeInMillis3));
        }
        if (textView2 != null) {
            int i9 = (int) ((timeInMillis3 - jCurrentTimeMillis) / 1000);
            if (i9 > 86400) {
                z2 = false;
                pluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i9 / 86400.0f), new Object[0]);
            } else {
                z2 = false;
                z2 = false;
                z2 = false;
                if (i9 >= 3600) {
                    pluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i9 / 3600.0f), new Object[0]);
                } else if (i9 >= 60) {
                    pluralString = LocaleController.formatPluralString("MinutesSchedule", Math.round(i9 / 60.0f), new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("SecondsSchedule", i9, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i10 = R.string.VoipChannelScheduleInfo;
                z = true;
                Object[] objArr = new Object[1];
                objArr[z2 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i10, objArr));
            } else {
                z = true;
                int i11 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z2 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i11, objArr2));
            }
        } else {
            z = true;
            z2 = false;
        }
        return timeInMillis2 - jCurrentTimeMillis > millis ? z : z2;
    }

    public static void createClearOrDeleteDialogAlert(final BaseFragment baseFragment, final boolean z, final boolean z2, final TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider) {
        int i;
        ?? r23;
        boolean z7;
        float f;
        float f2;
        boolean z8;
        AvatarDrawable avatarDrawable;
        ?? r5;
        final ?? r13;
        BackupImageView backupImageView;
        boolean z9;
        int iDp;
        int iDp2;
        JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3;
        ?? r14;
        ?? r1;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        String string;
        String string2;
        String string3;
        TextView textView;
        ?? r24;
        if (baseFragment == 0 || baseFragment.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = baseFragment.getCurrentAccount();
        final Activity parentActivity = baseFragment.getParentActivity();
        ?? builder = new AlertDialog.Builder(parentActivity, 0, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        TextView textView2 = new TextView(parentActivity) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = !z6 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat);
        ?? r11 = new FrameLayout(parentActivity) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(r11);
        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
        avatarDrawable2.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView2 = new BackupImageView(parentActivity);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(15.0f));
        r11.addView(backupImageView2, LayoutHelper.createFrame(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(parentActivity);
        animatedTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        animatedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        animatedTextView.setEllipsizeByGradient(true);
        if (z) {
            if (z10) {
                animatedTextView.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat != null) {
            if (ChatObject.isCommunity(chat)) {
                animatedTextView.setText(LocaleController.getString(R.string.CommunityDelete));
            } else if (ChatObject.isChannel(chat)) {
                if (chat.monoforum) {
                    animatedTextView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                } else if (chat.megagroup) {
                    animatedTextView.setText(LocaleController.getString(R.string.LeaveMega));
                } else {
                    animatedTextView.setText(LocaleController.getString(R.string.LeaveChannel));
                }
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.LeaveMega));
            }
        } else {
            animatedTextView.setText(LocaleController.getString(R.string.DeleteChatUser));
        }
        boolean z11 = LocaleController.isRTL;
        r11.addView(animatedTextView, LayoutHelper.createFrame(-1, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 22 : 65, 7.66f, z11 ? 65 : 22, 0.0f));
        r11.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        TLRPC.Chat monoForumLinkedChat = ChatObject.isMonoForum(chat) ? baseFragment.getMessagesController().getMonoForumLinkedChat(chat.id) : null;
        boolean z12 = (user == null || user.bot || user.id == clientUserId || !MessagesController.getInstance(currentAccount).canRevokePmInbox) ? false : true;
        if (user != null) {
            i = MessagesController.getInstance(currentAccount).revokeTimePmLimit;
        } else {
            i = MessagesController.getInstance(currentAccount).revokeTimeLimit;
        }
        boolean z13 = !z3 && user != null && z12 && i == Integer.MAX_VALUE;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.get(user.id) : null;
        boolean z14 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null && user.bot) {
            r24 = builder;
            f2 = 10.0f;
            if (user.id != 489000) {
                r1 = 0;
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                zArr[0] = true;
                checkBoxCell2.setChecked(true, false);
                checkBoxCellArr[0].setMultiline(true);
                r11.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 1));
                r5 = backupImageView2;
                r13 = r24;
                avatarDrawable = avatarDrawable2;
                z8 = false;
            } else {
                z7 = false;
                f = 16.0f;
            }
            if (user != null) {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(12);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else if (user.id == clientUserId) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(1);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else {
                    avatarDrawable.setScaleSize(1.0f);
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    r5.setForUserOrChat(user, avatarDrawable);
                }
            } else {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                int currentAccount2 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != 0) {
                    chat2 = monoForumLinkedChat;
                } else {
                    chat2 = chat;
                }
                avatarDrawable.setInfo(currentAccount2, chat2);
                if (monoForumLinkedChat != 0) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat;
                }
                r5.setForUserOrChat(chat3, avatarDrawable);
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat == null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                chat4 = monoForumLinkedChat;
                if (user != null) {
                    if (z3) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                    } else if (user.id == clientUserId) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                    } else if (user.bot || user.support) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                    }
                } else if (ChatObject.isChannel(chat)) {
                    if (chat4 != null) {
                        string = LocaleController.formatString(R.string.MonoforumTitle, chat4.title);
                    } else {
                        string = chat.title;
                    }
                    if (chat.megagroup) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                    }
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat.title)));
                }
            } else if (user != null) {
                if (monoForumLinkedChat != 0) {
                    string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string2 = chat.title;
                }
                if (ChatObject.isChannel(chat) || (chat.megagroup && !ChatObject.isPublic(chat))) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                } else if (chat.megagroup) {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                } else {
                    textView2.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                }
            } else if (z3) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
            } else if (user.id == clientUserId) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            }
            if (z2) {
                string3 = LocaleController.getString(R.string.DeleteAll);
            } else {
                if (z) {
                    if (z10) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z8 && zArr[0]) {
                    string3 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.ChannelDelete : R.string.DeleteMega);
                } else if (ChatObject.isChannel(chat)) {
                    if (chat.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                }
                final boolean z15 = z10;
                r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z15, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                    }
                });
                r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = r13.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            final boolean z16 = z10;
            r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z16, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                }
            });
            r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate2 = r13.create();
            baseFragment.showDialog(alertDialogCreate2);
            textView = (TextView) alertDialogCreate2.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        r23 = builder;
        z7 = false;
        f = 16.0f;
        f2 = 10.0f;
        if (z2 || (((!z3 || z) && !z13) || UserObject.isDeleted(user) || z14)) {
            z8 = z4 && !z && chat != null && chat.creator;
            avatarDrawable = avatarDrawable2;
            if (!z8) {
                r5 = backupImageView2;
                r13 = r23;
            }
            if (user != null) {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(12);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else if (user.id == clientUserId) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(1);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else {
                    avatarDrawable.setScaleSize(1.0f);
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    r5.setForUserOrChat(user, avatarDrawable);
                }
            } else {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                int currentAccount3 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != 0) {
                    chat2 = monoForumLinkedChat;
                } else {
                    chat2 = chat;
                }
                avatarDrawable.setInfo(currentAccount3, chat2);
                if (monoForumLinkedChat != 0) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat;
                }
                r5.setForUserOrChat(chat3, avatarDrawable);
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat == null) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                chat4 = monoForumLinkedChat;
                if (user != null) {
                    if (z3) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                    } else if (user.id == clientUserId) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                    } else if (user.bot) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    }
                } else if (ChatObject.isChannel(chat)) {
                    if (chat4 != null) {
                        string = LocaleController.formatString(R.string.MonoforumTitle, chat4.title);
                    } else {
                        string = chat.title;
                    }
                    if (chat.megagroup) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                    }
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat.title)));
                }
            } else if (user != null) {
                if (monoForumLinkedChat != 0) {
                    string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string2 = chat.title;
                }
                if (ChatObject.isChannel(chat)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                }
            } else if (z3) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
            } else if (user.id == clientUserId) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            }
            if (z2) {
                string3 = LocaleController.getString(R.string.DeleteAll);
            } else {
                if (z) {
                    if (z10) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z8) {
                    if (ChatObject.isChannel(chat)) {
                        if (chat.monoforum) {
                            string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                        } else if (chat.megagroup) {
                            string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                        } else {
                            string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                        }
                    } else {
                        string3 = LocaleController.getString(R.string.DeleteChatUser);
                    }
                } else if (ChatObject.isChannel(chat)) {
                    if (chat.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                }
                final boolean z17 = z10;
                r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z17, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                    }
                });
                r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate3 = r13.create();
                baseFragment.showDialog(alertDialogCreate3);
                textView = (TextView) alertDialogCreate3.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            final boolean z18 = z10;
            r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z18, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                }
            });
            r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate4 = r13.create();
            baseFragment.showDialog(alertDialogCreate4);
            textView = (TextView) alertDialogCreate4.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        z8 = false;
        avatarDrawable = avatarDrawable2;
        backupImageView = backupImageView2;
        CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, 17, false, resourcesProvider);
        checkBoxCellArr[0] = checkBoxCell3;
        checkBoxCell3.setBackground(Theme.getSelectorDrawable(false));
        if (z8) {
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
            }
        } else {
            if (z) {
                checkBoxCellArr[0].setText(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            } else {
                z9 = true;
                checkBoxCellArr[0].setText(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            }
            checkBoxCellArr[0].setMultiline(z9);
            CheckBoxCell checkBoxCell4 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            int iDp3 = AndroidUtilities.dp(f2);
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(f);
            }
            checkBoxCell4.setPadding(iDp, iDp3, iDp2, AndroidUtilities.dp(f2));
            r11.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            r14 = r23;
            joinGroupAlert$$ExternalSyntheticLambda3 = new JoinGroupAlert$$ExternalSyntheticLambda3(z8, chat, (AlertDialog.Builder) r14, zArr);
            checkBoxCellArr[0].setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(9, zArr, joinGroupAlert$$ExternalSyntheticLambda3));
            r1 = z7;
            r5 = backupImageView;
            r13 = r14;
            if (z5) {
                CheckBoxCell checkBoxCell5 = checkBoxCellArr[0];
                zArr[0] = true;
                checkBoxCell5.setChecked(true, false);
                joinGroupAlert$$ExternalSyntheticLambda3.run();
            }
            if (user != null) {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(12);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else if (user.id == clientUserId) {
                    avatarDrawable.setScaleSize(0.8f);
                    avatarDrawable.setAvatarType(1);
                    r5.setImage(r1, r1, avatarDrawable, user);
                } else {
                    avatarDrawable.setScaleSize(1.0f);
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    r5.setForUserOrChat(user, avatarDrawable);
                }
            } else {
                r1 = z7;
                r1 = z7;
                r5 = backupImageView;
                r13 = r14;
                int currentAccount4 = baseFragment.getCurrentAccount();
                if (monoForumLinkedChat != 0) {
                    chat2 = monoForumLinkedChat;
                } else {
                    chat2 = chat;
                }
                avatarDrawable.setInfo(currentAccount4, chat2);
                if (monoForumLinkedChat != 0) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat;
                }
                r5.setForUserOrChat(chat3, avatarDrawable);
            }
            if (z2) {
                if (UserObject.isUserSelf(user)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat == null) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z) {
                chat4 = monoForumLinkedChat;
                if (user != null) {
                    if (z3) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                    } else if (user.id == clientUserId) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                    } else if (user.bot) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                    }
                } else if (ChatObject.isChannel(chat)) {
                    if (chat4 != null) {
                        string = LocaleController.formatString(R.string.MonoforumTitle, chat4.title);
                    } else {
                        string = chat.title;
                    }
                    if (chat.megagroup) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                    }
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat.title)));
                }
            } else if (user != null) {
                if (monoForumLinkedChat != 0) {
                    string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string2 = chat.title;
                }
                if (ChatObject.isChannel(chat)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                }
            } else if (z3) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
            } else if (user.id == clientUserId) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            }
            if (z2) {
                string3 = LocaleController.getString(R.string.DeleteAll);
            } else {
                if (z) {
                    if (z10) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z8) {
                    if (ChatObject.isChannel(chat)) {
                        if (chat.monoforum) {
                            string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                        } else if (chat.megagroup) {
                            string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                        } else {
                            string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                        }
                    } else {
                        string3 = LocaleController.getString(R.string.DeleteChatUser);
                    }
                } else if (ChatObject.isChannel(chat)) {
                    if (chat.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                }
                final boolean z19 = z10;
                r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z19, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                    }
                });
                r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate5 = r13.create();
                baseFragment.showDialog(alertDialogCreate5);
                textView = (TextView) alertDialogCreate5.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
            final boolean z110 = z10;
            r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z110, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                }
            });
            r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate6 = r13.create();
            baseFragment.showDialog(alertDialogCreate6);
            textView = (TextView) alertDialogCreate6.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        z9 = true;
        checkBoxCellArr[0].setMultiline(z9);
        CheckBoxCell checkBoxCell6 = checkBoxCellArr[0];
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(f);
        } else {
            iDp = AndroidUtilities.dp(8.0f);
        }
        int iDp4 = AndroidUtilities.dp(f2);
        if (LocaleController.isRTL) {
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp2 = AndroidUtilities.dp(f);
        }
        checkBoxCell6.setPadding(iDp, iDp4, iDp2, AndroidUtilities.dp(f2));
        r11.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r14 = r23;
        joinGroupAlert$$ExternalSyntheticLambda3 = new JoinGroupAlert$$ExternalSyntheticLambda3(z8, chat, (AlertDialog.Builder) r14, zArr);
        checkBoxCellArr[0].setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(9, zArr, joinGroupAlert$$ExternalSyntheticLambda3));
        r1 = z7;
        r5 = backupImageView;
        r13 = r14;
        if (z5) {
            CheckBoxCell checkBoxCell7 = checkBoxCellArr[0];
            zArr[0] = true;
            checkBoxCell7.setChecked(true, false);
            joinGroupAlert$$ExternalSyntheticLambda3.run();
        }
        if (user != null) {
            r1 = z7;
            r1 = z7;
            r5 = backupImageView;
            r13 = r14;
            if (UserObject.isReplyUser(user)) {
                avatarDrawable.setScaleSize(0.8f);
                avatarDrawable.setAvatarType(12);
                r5.setImage(r1, r1, avatarDrawable, user);
            } else if (user.id == clientUserId) {
                avatarDrawable.setScaleSize(0.8f);
                avatarDrawable.setAvatarType(1);
                r5.setImage(r1, r1, avatarDrawable, user);
            } else {
                avatarDrawable.setScaleSize(1.0f);
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                r5.setForUserOrChat(user, avatarDrawable);
            }
        } else {
            r1 = z7;
            r1 = z7;
            r5 = backupImageView;
            r13 = r14;
            int currentAccount5 = baseFragment.getCurrentAccount();
            if (monoForumLinkedChat != 0) {
                chat2 = monoForumLinkedChat;
            } else {
                chat2 = chat;
            }
            avatarDrawable.setInfo(currentAccount5, chat2);
            if (monoForumLinkedChat != 0) {
                chat3 = monoForumLinkedChat;
            } else {
                chat3 = chat;
            }
            r5.setForUserOrChat(chat3, avatarDrawable);
        }
        if (z2) {
            if (UserObject.isUserSelf(user)) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
            } else if (chat == null) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            }
        } else if (z) {
            chat4 = monoForumLinkedChat;
            if (user != null) {
                if (z3) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                } else if (user.id == clientUserId) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                } else if (user.bot) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                }
            } else if (ChatObject.isChannel(chat)) {
                if (chat4 != null) {
                    string = LocaleController.formatString(R.string.MonoforumTitle, chat4.title);
                } else {
                    string = chat.title;
                }
                if (chat.megagroup) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                }
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat.title)));
            }
        } else if (user != null) {
            if (monoForumLinkedChat != 0) {
                string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
            } else {
                string2 = chat.title;
            }
            if (ChatObject.isChannel(chat)) {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
            } else {
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
            }
        } else if (z3) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
        } else if (user.id == clientUserId) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
        } else {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
        }
        if (z2) {
            string3 = LocaleController.getString(R.string.DeleteAll);
        } else {
            if (z) {
                if (z10) {
                    string3 = LocaleController.getString(R.string.ClearHistoryCache);
                } else {
                    string3 = LocaleController.getString(R.string.ClearForMe);
                }
            } else if (!z8) {
                if (ChatObject.isChannel(chat)) {
                    if (chat.monoforum) {
                        string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                    } else if (chat.megagroup) {
                        string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                    } else {
                        string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                    }
                } else {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                }
            } else if (ChatObject.isChannel(chat)) {
                if (chat.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
            } else {
                string3 = LocaleController.getString(R.string.DeleteChatUser);
            }
            final boolean z111 = z10;
            r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z111, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
                }
            });
            r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate7 = r13.create();
            baseFragment.showDialog(alertDialogCreate7);
            textView = (TextView) alertDialogCreate7.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
        final boolean z112 = z10;
        r13.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$78(z112, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, r13, currentAccount, parentActivity, alertDialog, i2);
            }
        });
        r13.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate8 = r13.create();
        baseFragment.showDialog(alertDialogCreate8);
        textView = (TextView) alertDialogCreate8.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, ScheduleDatePickerColors scheduleDatePickerColors) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, null, scheduleDatePickerColors, null);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        return createSimpleAlert(context, str, str2, null, null, resourcesProvider);
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, z2, z3, false, progress, resourcesProvider);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getSafeLastFragment();
        }
        if (str2 == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        AlertDialog alertDialogCreate = createSimpleAlert(baseFragment.getParentActivity(), str, str2, resourcesProvider).create();
        baseFragment.showDialog(alertDialogCreate);
        return alertDialogCreate;
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, runnable, resourcesProvider);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, String str3, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        if (str3 == null) {
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            return builder;
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(str3, new AlertsCreator$$ExternalSyntheticLambda7(9, runnable));
        return builder;
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, long j2, boolean z, boolean z2, Runnable runnable) {
        return createVibrationSelectDialog(activity, j, j2, z, z2, runnable, null);
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, boolean z4, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, z2, z3, z4, progress, (TLRPC.WebPage) null, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, String str, long j, long j2, boolean z, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable) {
        return createScheduleDatePickerDialog(context, str, j, j2, 0, z, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(), null);
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, long j2, String str, Runnable runnable) {
        return createVibrationSelectDialog(activity, j, j2, str, runnable, (Theme.ResourcesProvider) null);
    }

    public static void showOpenUrlAlert(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(context, str, z, z2, z3, z4, j, progress, null, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable) {
        return createScheduleDatePickerDialog(context, j, j2, 0, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(), null);
    }

    public static Dialog createVibrationSelectDialog(Activity activity, final long j, final long j2, String str, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j != 0) {
            int i = notificationsSettings.getInt(str2, 0);
            iArr[0] = i;
            if (i == 3) {
                iArr[0] = 2;
            } else if (i == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i2 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = 1;
            } else if (i2 == 1) {
                iArr[0] = 2;
            } else if (i2 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        int i3 = 0;
        while (i3 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.radioButton.setColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i3], iArr[0] == i3);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertDialog.Builder builder2 = builder;
                    AlertsCreator.lambda$createVibrationSelectDialog$206(iArr, j, str2, j2, builder2, runnable, view);
                }
            });
            i3++;
            str2 = str;
        }
        builder.setTitle(LocaleController.getString(R.string.Vibrate));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, boolean z4, Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        showOpenUrlAlert(baseFragment.getParentActivity(), str, z, z2, z3, z4, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getInlineReturn() : 0L, progress, webPage, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, i, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public static AlertDialog showSimpleConfirmAlert(BaseFragment baseFragment, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        AlertDialog alertDialogCreateSimpleConfirmAlert = createSimpleConfirmAlert(baseFragment.getContext(), baseFragment.getResourceProvider(), str, charSequence, str2, runnable);
        baseFragment.showDialog(alertDialogCreateSimpleConfirmAlert);
        if (z && (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        return alertDialogCreateSimpleConfirmAlert;
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, i, false, scheduleDatePickerDelegate, runnable, scheduleDatePickerColors, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, boolean z, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, null, j, j2, i, z, scheduleDatePickerDelegate, runnable, scheduleDatePickerColors, resourcesProvider);
    }

    public static void showOpenUrlAlert(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
        String strReplace;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (!Browser.isInternalUri(Uri.parse(str), false, null) && z3 && !"mailto".equalsIgnoreCase(scheme)) {
                if (z) {
                    try {
                        Uri uri = Uri.parse(str);
                        strReplace = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                        strReplace = str;
                    }
                } else {
                    strReplace = str;
                }
                AlertsCreator$$ExternalSyntheticLambda254 alertsCreator$$ExternalSyntheticLambda254 = new AlertsCreator$$ExternalSyntheticLambda254(context, str, j, z2, progress);
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
                TextView textView = new TextView(context);
                textView.setText(strReplace);
                textView.setTextSize(1, 14.0f);
                int i = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i, resourcesProvider));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
                textView.setBackground(gradientDrawable);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 22.0f, 4.0f, 22.0f, 9.0f));
                if (WebPagePreviewView.hasPreview(webPage)) {
                    WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context, resourcesProvider, UserConfig.selectedAccount);
                    webPagePreviewView.setWebPage(webPage);
                    linearLayout.addView(webPagePreviewView, LayoutHelper.createLinear(-1, -2, 22.0f, 3.0f, 22.0f, 7.0f));
                }
                builder.setView(linearLayout);
                builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
                builder.setPositiveButton(LocaleController.getString(R.string.Open), new EmojiView$$ExternalSyntheticLambda21(alertsCreator$$ExternalSyntheticLambda254, 21));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.show();
                return;
            }
            Browser.openUrl(context, Uri.parse(str), j == 0, z2, z4 && checkInternalBotApp(str), progress, null, false, true, false);
        }
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(final Context context, final String str, final long j, long j2, int i, boolean z, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        ?? r41;
        Context context2;
        char c;
        ActionBarMenuItem actionBarMenuItem;
        FrameLayout frameLayout;
        Calendar calendar;
        int i2;
        char c2;
        int i3;
        int i4;
        char c3;
        int[] iArr;
        String[] strArr;
        String[] strArr2;
        int[] iArr2;
        int[] iArr3;
        FrameLayout frameLayout2;
        ShareAlert$$ExternalSyntheticLambda1 shareAlert$$ExternalSyntheticLambda1;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        TextView textView = null;
        if (context == null) {
            return null;
        }
        int[] iArr4 = {i};
        final long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, resourcesProvider);
        final BottomSheet bottomSheet = builder.bottomSheet;
        bottomSheet.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i5) {
                return LocaleController.formatPluralString("Hours", i5, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(24);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider) {
            @Override
            public CharSequence getContentDescription(int i5) {
                return LocaleController.formatPluralString("Minutes", i5, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout3 = new FrameLayout(context);
        ?? r10 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i5, int i6) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i7 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i7);
                numberPicker2.setItemCount(i7);
                numberPicker3.setItemCount(i7);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i7;
                this.ignoreLayout = false;
                super.onMeasure(i5, i6);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        r10.setClipToPadding(false);
        r10.setClipChildren(false);
        r10.setOrientation(1);
        frameLayout3.addView(r10, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout3.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        r10.addView(frameLayout5, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView2 = new TextView(context);
        if (!TextUtils.isEmpty(str)) {
            textView2.setText(str);
        } else if (j == clientUserId) {
            textView2.setText(LocaleController.getString(R.string.SetReminder));
        } else {
            textView2.setText(LocaleController.getString(R.string.ScheduleMessage));
        }
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView2, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout5.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView2.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(7));
        final boolean[] zArr = {true};
        if (!DialogObject.isUserDialog(j) || j == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            r41 = frameLayout3;
            context2 = context;
            c = 5;
            actionBarMenuItem = null;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            String str2 = firstName;
            r41 = frameLayout3;
            context2 = context;
            c = 5;
            ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context2, null, 0, scheduleDatePickerColors.textColor, false, resourcesProvider);
            actionBarMenuItem2.setLongClickEnabled(false);
            actionBarMenuItem2.setSubMenuOpenSide(2);
            actionBarMenuItem2.setIcon(R.drawable.ic_ab_other);
            actionBarMenuItem2.setBackground(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1, -1));
            frameLayout5.addView(actionBarMenuItem2, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            actionBarMenuItem2.addSubItem(1, LocaleController.formatString(R.string.ScheduleWhenOnline, str2));
            actionBarMenuItem2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            actionBarMenuItem = actionBarMenuItem2;
        }
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(13, actionBarMenuItem, scheduleDatePickerColors));
            actionBarMenuItem.setDelegate(new AlertsCreator$$ExternalSyntheticLambda201(scheduleDatePickerDelegate, zArr, builder, 0));
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context2);
        final RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieDrawable.start();
        rLottieDrawable.setCurrentFrame(40);
        rLottieDrawable.setCustomEndFrame(40);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(scheduleDatePickerColors.textColor, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1, -1));
        frameLayout5.addView(rLottieImageView, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, (actionBarMenuItem != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r10.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final TextView textView3 = new TextView(context2) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(14));
        final ActionBarMenuItem actionBarMenuItem3 = actionBarMenuItem;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i5, int i6) {
                NumberPicker numberPicker5 = numberPicker2;
                NumberPicker numberPicker6 = numberPicker3;
                AlertsCreator.lambda$createScheduleDatePickerDialog$125(textView3, str, clientUserId, j, numberPicker, numberPicker5, numberPicker6, numberPicker4, i5, i6);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(15));
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(16));
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j2 <= 0 || j2 == 2147483646) {
            frameLayout = frameLayout4;
            calendar = calendar2;
        } else {
            long j3 = 1000 * j2;
            frameLayout = frameLayout4;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        final boolean[] zArr2 = {true};
        if (str != null) {
            i2 = 3;
        } else {
            i2 = clientUserId == j ? 1 : 0;
        }
        checkScheduleDate(textView3, null, i2, numberPicker, numberPicker2, numberPicker3);
        boolean zIsTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (zIsTestBackend) {
            c2 = 3;
            i3 = 10;
            int[] iArr5 = new int[10];
            iArr5[0] = 0;
            iArr5[1] = 60;
            iArr5[2] = 300;
            iArr5[3] = 86400;
            iArr5[4] = 604800;
            iArr5[c] = 1209600;
            iArr5[6] = 2592000;
            iArr5[7] = 7862400;
            iArr5[8] = 15724800;
            iArr5[9] = 31536000;
            iArr = iArr5;
            i4 = 8;
            c3 = '\t';
        } else {
            c2 = 3;
            i3 = 10;
            i4 = 8;
            c3 = '\t';
            int[] iArr6 = new int[8];
            iArr6[0] = 0;
            iArr6[1] = 86400;
            iArr6[2] = 604800;
            iArr6[3] = 1209600;
            iArr6[4] = 2592000;
            iArr6[c] = 7862400;
            iArr6[6] = 15724800;
            iArr6[7] = 31536000;
            iArr = iArr6;
        }
        if (zIsTestBackend) {
            strArr = new String[i3];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[c2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[c] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i4] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i4];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[c2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[c] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        String[] strArr3 = strArr;
        if (z) {
            strArr2 = strArr3;
            iArr2 = iArr4;
            iArr3 = iArr;
            frameLayout2 = null;
            shareAlert$$ExternalSyntheticLambda1 = null;
        } else {
            FrameLayout frameLayout6 = new FrameLayout(context);
            int i5 = scheduleDatePickerColors.textColor;
            int iBlendOver = Theme.blendOver(scheduleDatePickerColors.backgroundColor, Theme.multAlpha(0.075f, i5));
            strArr2 = strArr3;
            int iMultAlpha = Theme.multAlpha(0.1f, scheduleDatePickerColors.textColor);
            int[] iArr7 = iArr;
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i5);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int iDp = AndroidUtilities.dp(14.0f);
            int iBlendOver2 = Theme.blendOver(iBlendOver, iMultAlpha);
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iBlendOver, iBlendOver2, iBlendOver2));
            textView4.setGravity(17);
            iArr2 = iArr4;
            ShareAlert$$ExternalSyntheticLambda1 shareAlert$$ExternalSyntheticLambda2 = new ShareAlert$$ExternalSyntheticLambda1(6, iArr7, iArr2, strArr2, textView4);
            iArr3 = iArr7;
            shareAlert$$ExternalSyntheticLambda2.run();
            frameLayout6.addView(textView4, LayoutHelper.createFrame(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r10.addView(frameLayout6, LayoutHelper.createLinear(-1, -2));
            shareAlert$$ExternalSyntheticLambda1 = shareAlert$$ExternalSyntheticLambda2;
            textView = textView4;
            frameLayout2 = frameLayout6;
        }
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        int i6 = scheduleDatePickerColors.buttonBackgroundColor;
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, i6, Theme.AdaptiveRipple.calcRippleColor(i6)));
        r10.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        TextView textView5 = textView;
        FrameLayout frameLayout7 = frameLayout;
        final int[] iArr8 = iArr2;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int[] iArr9 = iArr8;
                BottomSheet.Builder builder2 = builder;
                AlertsCreator.lambda$createScheduleDatePickerDialog$129(zArr2, str, clientUserId, j, numberPicker, numberPicker2, numberPicker3, calendar3, scheduleDatePickerDelegate, zArr, iArr9, builder2, view);
            }
        });
        bottomSheet.customView = r41;
        bottomSheet.show();
        bottomSheet.setOnDismissListener(new AlertsCreator$$ExternalSyntheticLambda41(2, runnable, zArr2));
        bottomSheet.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        if (textView5 != null) {
            textView5.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda198(frameLayout7, resourcesProvider, bottomSheet, frameLayout2, iArr3, strArr2, iArr8, shareAlert$$ExternalSyntheticLambda1));
        }
        final HintView2[] hintView2Arr = new HintView2[1];
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet bottomSheet2 = bottomSheet;
                AlertsCreator.lambda$createScheduleDatePickerDialog$135(zArr, rLottieDrawable, hintView2Arr, j, context, clientUserId, actionBarMenuItem3, bottomSheet2, view);
            }
        });
        return builder;
    }

    public static BottomSheet createMuteAlert(final BaseFragment baseFragment, final ArrayList<Long> arrayList, final int i, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet bottomSheet = new BottomSheet(baseFragment.getParentActivity(), false, false, resourcesProvider);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(R.string.Notifications);
        bottomSheet.bigTitle = true;
        int i2 = R.string.MuteFor;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AlertsCreator.lambda$createMuteAlert$198(arrayList, i, baseFragment, resourcesProvider, dialogInterface, i3);
            }
        };
        bottomSheet.items = charSequenceArr;
        bottomSheet.onClickListener = onClickListener;
        return bottomSheet;
    }

    public static BottomSheet.Builder createDatePickerDialog(Context context, String str, String str2, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        BottomSheet bottomSheet;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
        BottomSheet bottomSheet2 = builder.bottomSheet;
        bottomSheet2.applyBottomPadding = false;
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            public CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            public void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
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
        textView.setText(str);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, scheduleDatePickerColors.textColor, 1, 20.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(11));
        AlertsCreator$$ExternalSyntheticLambda47 alertsCreator$$ExternalSyntheticLambda47 = new AlertsCreator$$ExternalSyntheticLambda47(numberPicker, numberPicker2, numberPicker3, 3);
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(12));
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new AIEditorAlert$$ExternalSyntheticLambda20(13));
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda47);
        if (j <= 0 || j == 2147483646) {
            bottomSheet = bottomSheet2;
        } else {
            long j2 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            bottomSheet = bottomSheet2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int i = scheduleDatePickerColors.buttonBackgroundColor;
        int i2 = scheduleDatePickerColors.buttonBackgroundPressedColor;
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, i, i2, i2));
        textView2.setText(str2);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda50(numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, 1));
        BottomSheet bottomSheet3 = bottomSheet;
        bottomSheet3.customView = linearLayout;
        bottomSheet3.show();
        bottomSheet3.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheet3.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static void createBotLaunchAlert(BaseFragment baseFragment, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        CheckBoxCell checkBoxCell;
        int iDp;
        int iDp2;
        if (baseFragment == null) {
            return;
        }
        Context context = baseFragment.getContext();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(linksTextView);
        linksTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onMeasure(int i8, int i9) {
                super.onMeasure(i8, i9);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + checkBoxCellArr[0].getMeasuredHeight() + getMeasuredHeight());
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        simpleTextView.setTextSize(20);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(user.first_name);
        if (user.scam) {
            simpleTextView.setRightDrawable(Theme.dialogs_scamDrawable);
        } else if (user.fake) {
            simpleTextView.setRightDrawable(Theme.dialogs_fakeDrawable);
        } else {
            if (user.verified) {
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
                int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
                z = false;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedCheck, false), mode));
                simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
            }
            TextView textView = new TextView(context);
            BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView, Theme.getColor(null, Theme.key_dialogTextBlue, z), 1, 14.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda10(user, baseFragment, builder, 0));
            SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
            coloredImageSpan.setTopOffset(1);
            coloredImageSpan.setSize(AndroidUtilities.dp(10.0f));
            spannableStringValueOf.setSpan(coloredImageSpan, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
            textView.setText(spannableStringValueOf);
            z2 = LocaleController.isRTL;
            if (z2) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            int i8 = i2 | 48;
            if (z2) {
                i3 = 21;
            } else {
                i3 = 76;
            }
            float f = i3;
            if (z2) {
                i4 = 76;
            } else {
                i4 = 21;
            }
            frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i8, f, 0.0f, i4, 0.0f));
            z3 = LocaleController.isRTL;
            if (z3) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            int i9 = i5 | 48;
            if (z3) {
                i6 = 21;
            } else {
                i6 = 76;
            }
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, i9, i6, 24.0f, z3 ? 76 : 21, 0.0f));
            if (LocaleController.isRTL) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            if (atomicBoolean != null) {
                atomicBoolean.set(true);
                checkBoxCell = new CheckBoxCell(context, 1, 17, false, baseFragment.getResourceProvider());
                checkBoxCellArr[0] = checkBoxCell;
                if (!checkBoxCell.textAnimated) {
                    CheckBoxCell.AnonymousClass2 anonymousClass2 = checkBoxCell.linksTextView;
                    anonymousClass2.setLines(3);
                    anonymousClass2.setMaxLines(3);
                    anonymousClass2.setSingleLine(false);
                }
                checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
                CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell2.setPadding(iDp, 0, iDp2, 0);
                checkBoxCellArr[0].setChecked(true, false);
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setOnClickListener(new HintView$$ExternalSyntheticLambda0(atomicBoolean, 10));
            }
            if (UserObject.isReplyUser(user)) {
                avatarDrawable.setScaleSize(0.8f);
                avatarDrawable.setAvatarType(12);
                backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, user);
            } else {
                avatarDrawable.setScaleSize(1.0f);
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.setForUserOrChat(user, avatarDrawable);
            }
            builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertsCreator$$ExternalSyntheticLambda7(3, runnable));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            baseFragment.showDialog(alertDialogCreate);
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda13(context, alertDialogCreate, 0)));
        }
        z = false;
        TextView textView2 = new TextView(context);
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView2, Theme.getColor(null, Theme.key_dialogTextBlue, z), 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i = 5;
        } else {
            i = 3;
        }
        textView2.setGravity(i | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda10(user, baseFragment, builder, 0));
        SpannableString spannableStringValueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan2.setTopOffset(1);
        coloredImageSpan2.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf2.setSpan(coloredImageSpan2, spannableStringValueOf2.length() - 1, spannableStringValueOf2.length(), 33);
        textView2.setText(spannableStringValueOf2);
        z2 = LocaleController.isRTL;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i10 = i2 | 48;
        if (z2) {
            i3 = 21;
        } else {
            i3 = 76;
        }
        float f2 = i3;
        if (z2) {
            i4 = 76;
        } else {
            i4 = 21;
        }
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i10, f2, 0.0f, i4, 0.0f));
        z3 = LocaleController.isRTL;
        if (z3) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i11 = i5 | 48;
        if (z3) {
            i6 = 21;
        } else {
            i6 = 76;
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i11, i6, 24.0f, z3 ? 76 : 21, 0.0f));
        if (LocaleController.isRTL) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
            checkBoxCell = new CheckBoxCell(context, 1, 17, false, baseFragment.getResourceProvider());
            checkBoxCellArr[0] = checkBoxCell;
            if (!checkBoxCell.textAnimated) {
                CheckBoxCell.AnonymousClass2 anonymousClass3 = checkBoxCell.linksTextView;
                anonymousClass3.setLines(3);
                anonymousClass3.setMaxLines(3);
                anonymousClass3.setSingleLine(false);
            }
            checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
            checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
            CheckBoxCell checkBoxCell3 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(16.0f);
            }
            checkBoxCell3.setPadding(iDp, 0, iDp2, 0);
            checkBoxCellArr[0].setChecked(true, false);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new HintView$$ExternalSyntheticLambda0(atomicBoolean, 10));
        }
        if (UserObject.isReplyUser(user)) {
            avatarDrawable.setScaleSize(0.8f);
            avatarDrawable.setAvatarType(12);
            backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, user);
        } else {
            avatarDrawable.setScaleSize(1.0f);
            avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertsCreator$$ExternalSyntheticLambda7(3, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new AlertsCreator$$ExternalSyntheticLambda13(context, alertDialogCreate2, 0)));
    }
}
