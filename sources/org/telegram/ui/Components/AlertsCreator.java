package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.Consumer;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda242;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SelectChatUserSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.ThemePreviewActivity;

public abstract class AlertsCreator {

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

    public interface ScheduleDatePickerDelegate {
        void didSelectDate(boolean z, int i, int i2);
    }

    public interface SoundFrequencyDelegate {
        void didSelectValues(int i, int i2);
    }

    public interface StatusUntilDatePickerDelegate {
        void didSelectDate(int i);
    }

    public static boolean lambda$createAutoDeleteDatePickerDialog$154(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createBirthdayPickerDialog$124(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createCalendarPickerDialog$167(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createChangeBioAlert$70(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$createChangeNameAlert$74(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static boolean lambda$createCustomPicker$239(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createDatePickerDialog$118(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createFormattedDatePickerDialog$142(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createMuteForPickerDialog$164(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createMuteForPickerDialog$165(NumberPicker numberPicker, int i, int i2) {
    }

    public static boolean lambda$createScheduleDatePickerDialog$105(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createSoundFrequencyPickerDialog$160(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createSoundFrequencyPickerDialog$161(NumberPicker numberPicker, int i, int i2) {
    }

    public static boolean lambda$createStatusUntilDatePickerDialog$147(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createSuggestedMessageDatePickerDialog$224(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createSuggestedMessageDatePickerDialog$225(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createThemeCreateDialog$212(AlertDialog alertDialog, int i) {
    }

    public static boolean lambda$createTimePickerDialog$95(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$processError$7() {
    }

    public static Dialog createForgotPasscodeDialog(Context context) {
        return new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.ForgotPasscode)).setMessage(LocaleController.getString(R.string.ForgotPasscodeInfo)).setPositiveButton(LocaleController.getString(R.string.Close), null).create();
    }

    public static Dialog createLocationRequiredDialog(final Context context, boolean z) {
        return new AlertDialog.Builder(context).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends))).setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createLocationRequiredDialog$0(context, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
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

    public static Dialog createBackgroundActivityDialog(final Context context) {
        int i;
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.AllowBackgroundActivity));
        if (OneUIUtilities.isOneUI()) {
            i = Build.VERSION.SDK_INT >= 31 ? R.string.AllowBackgroundActivityInfoOneUIAboveS : R.string.AllowBackgroundActivityInfoOneUIBelowS;
        } else {
            i = R.string.AllowBackgroundActivityInfo;
        }
        return title.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(i))).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createBackgroundActivityDialog$1(context, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
            }
        }).create();
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

    public static Dialog createWebViewPermissionsRequestDialog(final Context context, Theme.ResourcesProvider resourcesProvider, String[] strArr, int i, String str, String str2, final Consumer consumer) {
        final boolean z;
        if (strArr == null || !(context instanceof Activity) || Build.VERSION.SDK_INT < 23) {
            z = false;
        } else {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog.Builder topAnimation = new AlertDialog.Builder(context, resourcesProvider).setTopAnimation(i, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
        if (z) {
            str = str2;
        }
        return topAnimation.setMessage(AndroidUtilities.replaceTags(str)).setPositiveButton(LocaleController.getString(z ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$3(z, context, atomicBoolean, consumer, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$4(atomicBoolean, consumer, alertDialog, i2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$5(atomicBoolean, consumer, dialogInterface);
            }
        }).create();
    }

    public static void lambda$createWebViewPermissionsRequestDialog$3(boolean z, Context context, AtomicBoolean atomicBoolean, Consumer consumer, AlertDialog alertDialog, int i) {
        if (z) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                context.startActivity(intent);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        atomicBoolean.set(true);
        consumer.accept(Boolean.TRUE);
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

    public static Dialog createApkRestrictedDialog(final Context context, Theme.ResourcesProvider resourcesProvider) {
        return new AlertDialog.Builder(context, resourcesProvider).setMessage(LocaleController.getString(R.string.ApkRestricted)).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createApkRestrictedDialog$6(context, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void lambda$createApkRestrictedDialog$6(Context context, AlertDialog alertDialog, int i) {
        try {
            context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static android.app.Dialog processError(final int r21, org.telegram.tgnet.TLRPC.TL_error r22, org.telegram.ui.ActionBar.BaseFragment r23, org.telegram.tgnet.TLObject r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.processError(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.BaseFragment, org.telegram.tgnet.TLObject, java.lang.Object[]):android.app.Dialog");
    }

    public static void lambda$processError$8(long j, int i, long j2) {
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        new StarsIntroActivity.StarsNeededSheet(activity, (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null, j, 13, DialogObject.getShortName(i, j2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$processError$7();
            }
        }, j2).show();
    }

    public static Toast showSimpleToast(BaseFragment baseFragment, String str) {
        Context parentActivity;
        if (str == null) {
            return null;
        }
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            parentActivity = baseFragment.getParentActivity();
        } else {
            parentActivity = ApplicationLoader.applicationContext;
        }
        Toast toastMakeText = Toast.makeText(parentActivity, str, 1);
        toastMakeText.show();
        return toastMakeText;
    }

    public static AlertDialog showUpdateAppAlert(final Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(str);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        if (z) {
            builder.setNegativeButton(LocaleController.getString(R.string.UpdateApp), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    AlertsCreator.lambda$showUpdateAppAlert$9(context, alertDialog, i);
                }
            });
        }
        return builder.show();
    }

    public static void lambda$showUpdateAppAlert$9(Context context, AlertDialog alertDialog, int i) {
        Browser.openUrl(context, BuildVars.PLAYSTORE_APP_URL);
    }

    public static AlertDialog.Builder createLanguageAlert(final LaunchActivity launchActivity, final TLRPC.TL_langPackLanguage tL_langPackLanguage) {
        String string;
        int iIndexOf;
        if (tL_langPackLanguage == null) {
            return null;
        }
        tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
        tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
        String str = tL_langPackLanguage.base_lang_code;
        if (str != null) {
            tL_langPackLanguage.base_lang_code = str.replace('-', '_').toLowerCase();
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
        if (LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code)) {
            builder.setTitle(LocaleController.getString(R.string.Language));
            string = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
            builder.setNeutralButton(LocaleController.getString(R.string.SETTINGS), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    AlertsCreator.lambda$createLanguageAlert$10(launchActivity, alertDialog, i);
                }
            });
        } else if (tL_langPackLanguage.strings_count == 0) {
            builder.setTitle(LocaleController.getString(R.string.LanguageUnknownTitle));
            string = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
        } else {
            builder.setTitle(LocaleController.getString(R.string.LanguageTitle));
            if (tL_langPackLanguage.official) {
                string = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
            } else {
                string = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
            }
            builder.setPositiveButton(LocaleController.getString(R.string.Change), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    AlertsCreator.lambda$createLanguageAlert$11(tL_langPackLanguage, launchActivity, alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(string));
        int iIndexOf2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
        if (iIndexOf2 != -1) {
            int i = iIndexOf2 + 1;
            iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i);
            if (iIndexOf != -1) {
                spannableStringBuilder.delete(iIndexOf, iIndexOf + 1);
                spannableStringBuilder.delete(iIndexOf2, i);
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
        textView.setLinkTextColor(Theme.getColor(Theme.key_dialogTextLink));
        textView.setHighlightColor(Theme.getColor(Theme.key_dialogLinkSelection));
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        builder.setView(textView);
        return builder;
    }

    public static void lambda$createLanguageAlert$10(LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
        launchActivity.lambda$runLinkRequest$99(new LanguageSelectActivity());
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

    public static AlertDialog.Builder createNoAccessAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        HashMap map = new HashMap();
        int i = Theme.key_dialogTopBackground;
        map.put("info1.**", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
        map.put("info2.**", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
        builder.setTopAnimation(R.raw.not_available, 52, false, Theme.getColor(i, resourcesProvider), map);
        builder.setTopAnimationIsNew(true);
        builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
        builder.setMessage(str2);
        return builder;
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str) {
        return createSimpleAlert(context, null, str);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2) {
        return createSimpleAlert(context, str, str2, null);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        return createSimpleAlert(context, str, str2, null, null, resourcesProvider);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, String str3, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        if (str3 == null) {
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setPositiveButton(str3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    AlertsCreator.lambda$createSimpleAlert$12(runnable, alertDialog, i);
                }
            });
        }
        return builder;
    }

    public static void lambda$createSimpleAlert$12(Runnable runnable, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void createStoriesAlbumEnterNameForCreate(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createStoriesAlbumEnterName(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, LocaleController.getString(R.string.Create), resourcesProvider, stringCallback);
    }

    public static void createStoriesAlbumEnterNameForRename(Context context, BaseFragment baseFragment, String str, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createStoriesAlbumEnterName(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), str, LocaleController.getString(R.string.Rename), resourcesProvider, stringCallback);
    }

    public static void createStoriesAlbumEnterName(Context context, final BaseFragment baseFragment, String str, String str2, String str3, String str4, String str5, final Theme.ResourcesProvider resourcesProvider, final MessagesStorage.StringCallback stringCallback) {
        final Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(str == null ? LocaleController.getString(R.string.AppName) : str);
        builder.setMessage(str2);
        final EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }

            @Override
            protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.onTextChanged(charSequence, i, i2, i3);
                if (this.limit != null) {
                    this.limitCount = 12 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str6 = "";
                    if (this.limitCount <= 4) {
                        str6 = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str6);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }
        };
        editTextCaption.lineYFix = true;
        editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return AlertsCreator.lambda$createStoriesAlbumEnterName$13(editTextCaption, stringCallback, alertDialogArr, currentFocus, textView, i, keyEvent);
            }
        });
        editTextCaption.setTextSize(1, 18.0f);
        editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextCaption.setHintText(str3);
        editTextCaption.setFocusable(true);
        editTextCaption.setInputType(147457);
        editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextCaption.setImeOptions(6);
        editTextCaption.setBackgroundDrawable(null);
        editTextCaption.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        editTextCaption.setText(str4);
        editTextCaption.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!this.ignoreTextChange && editable.length() > 12) {
                    this.ignoreTextChange = true;
                    editable.delete(12, editable.length());
                    AndroidUtilities.shakeView(editTextCaption);
                    try {
                        editTextCaption.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        builder.setPositiveButton(str5, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createStoriesAlbumEnterName$14(editTextCaption, stringCallback, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        alertDialogArr[0] = builder.create();
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, baseFragment.getClassGuid());
        }
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createStoriesAlbumEnterName$16(editTextCaption, baseFragment, activityFindActivity, dialogInterface);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createStoriesAlbumEnterName$17(editTextCaption, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        alertDialogArr[0].setDismissDialogByButtons(false);
        editTextCaption.setSelection(editTextCaption.getText().length());
    }

    public static boolean lambda$createStoriesAlbumEnterName$13(EditTextCaption editTextCaption, MessagesStorage.StringCallback stringCallback, AlertDialog[] alertDialogArr, View view, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        String string = editTextCaption.getText().toString();
        if (string.length() > 12) {
            AndroidUtilities.shakeView(editTextCaption);
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

    public static void lambda$createStoriesAlbumEnterName$14(EditTextCaption editTextCaption, MessagesStorage.StringCallback stringCallback, AlertDialog alertDialog, int i) {
        String strTrim = editTextCaption.getText().toString().trim();
        if (strTrim.length() > 12 || strTrim.isEmpty()) {
            AndroidUtilities.shakeView(editTextCaption);
        } else {
            stringCallback.run(strTrim);
            alertDialog.dismiss();
        }
    }

    public static void lambda$createStoriesAlbumEnterName$16(EditTextCaption editTextCaption, BaseFragment baseFragment, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextCaption);
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustResize(activity, baseFragment.getClassGuid());
        }
    }

    public static void lambda$createStoriesAlbumEnterName$17(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str) {
        return showSimpleAlert(baseFragment, null, str);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str, String str2) {
        return showSimpleAlert(baseFragment, str, str2, null);
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

    public static AlertDialog showSimpleConfirmAlert(BaseFragment baseFragment, String str, CharSequence charSequence, String str2, boolean z, final Runnable runnable) {
        TextView textView;
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        builder.setTitle(str);
        builder.setMessage(charSequence);
        builder.setPositiveButton(str2, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$showSimpleConfirmAlert$18(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        if (z && (textView = (TextView) alertDialogCreate.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
        return alertDialogCreate;
    }

    public static void lambda$showSimpleConfirmAlert$18(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void showBlockReportSpamReplyAlert(final ChatActivity chatActivity, final MessageObject messageObject, long j, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        if (chatActivity == null || chatActivity.getParentActivity() == null || messageObject == null) {
            return;
        }
        final AccountInstance accountInstance = chatActivity.getAccountInstance();
        TLRPC.User user = j > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j)) : null;
        TLRPC.Chat chat = j < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j)) : null;
        if (user == null && chat == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), resourcesProvider);
        builder.setDimEnabled(runnable == null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$19(runnable, dialogInterface);
            }
        });
        builder.setTitle(LocaleController.getString(R.string.BlockUser));
        if (user != null) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user))));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title)));
        }
        LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
        linearLayout.setOrientation(1);
        final CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(chatActivity.getParentActivity(), 1, resourcesProvider)};
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        checkBoxCellArr[0].setTag(0);
        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteReportSpam), "", true, false);
        checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
        checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$20(checkBoxCellArr, view);
            }
        });
        builder.setView(linearLayout);
        final TLRPC.User user2 = user;
        final TLRPC.Chat chat2 = chat;
        builder.setPositiveButton(LocaleController.getString(R.string.BlockAndDeleteReplies), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$22(user2, accountInstance, chatActivity, chat2, messageObject, checkBoxCellArr, resourcesProvider, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        chatActivity.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$19(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$20(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[((Integer) view.getTag()).intValue()].setChecked(!checkBoxCellArr[r2.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamReplyAlert$22(TLRPC.User user, final AccountInstance accountInstance, ChatActivity chatActivity, TLRPC.Chat chat, MessageObject messageObject, CheckBoxCell[] checkBoxCellArr, Theme.ResourcesProvider resourcesProvider, AlertDialog alertDialog, int i) {
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
        accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$21(accountInstance, tLObject, tL_error);
            }
        });
    }

    public static void lambda$showBlockReportSpamReplyAlert$21(AccountInstance accountInstance, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void showBlockReportSpamAlert(org.telegram.ui.ActionBar.BaseFragment r18, final long r19, final org.telegram.tgnet.TLRPC.User r21, final org.telegram.tgnet.TLRPC.Chat r22, final org.telegram.tgnet.TLRPC.EncryptedChat r23, final boolean r24, org.telegram.tgnet.TLRPC.ChatFull r25, final org.telegram.messenger.MessagesStorage.IntCallback r26, org.telegram.ui.ActionBar.Theme.ResourcesProvider r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.showBlockReportSpamAlert(org.telegram.ui.ActionBar.BaseFragment, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$showBlockReportSpamAlert$23(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[((Integer) view.getTag()).intValue()].setChecked(!checkBoxCellArr[r2.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamAlert$24(TLRPC.User user, AccountInstance accountInstance, CheckBoxCell[] checkBoxCellArr, long j, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
        CheckBoxCell checkBoxCell;
        if (user != null) {
            accountInstance.getMessagesController().blockPeer(user.id);
        }
        if (checkBoxCellArr == null || ((checkBoxCell = checkBoxCellArr[0]) != null && checkBoxCell.isChecked())) {
            accountInstance.getMessagesController().reportSpam(j, user, chat, encryptedChat, chat != null && z);
        }
        if (checkBoxCellArr == null || checkBoxCellArr[1].isChecked()) {
            if (chat == null || ChatObject.isNotInChat(chat)) {
                accountInstance.getMessagesController().deleteDialog(j, 0);
            } else {
                accountInstance.getMessagesController().deleteParticipantFromChat(-j, accountInstance.getMessagesController().getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId())));
            }
            intCallback.run(1);
            return;
        }
        intCallback.run(0);
    }

    public static void showCustomNotificationsDialog(BaseFragment baseFragment, long j, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3, MessagesStorage.IntCallback intCallback) throws Resources.NotFoundException {
        showCustomNotificationsDialog(baseFragment, j, i, i2, arrayList, arrayList2, i3, intCallback, null);
    }

    public static void showCustomNotificationsDialog(final BaseFragment baseFragment, final long j, final int i, final int i2, final ArrayList arrayList, final ArrayList arrayList2, final int i3, final MessagesStorage.IntCallback intCallback, final MessagesStorage.IntCallback intCallback2) throws Resources.NotFoundException {
        int i4;
        final AlertDialog.Builder builder;
        Object obj;
        Drawable drawable;
        ?? r12 = 0;
        ?? r11 = 1;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final boolean zIsGlobalNotificationsEnabled = NotificationsController.getInstance(i3).isGlobalNotificationsEnabled(j, false, false);
        String string = LocaleController.getString(R.string.NotificationsTurnOn);
        int i5 = R.string.MuteFor;
        Drawable drawable2 = null;
        String[] strArr = {string, LocaleController.formatString("MuteFor", i5, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i5, LocaleController.formatPluralString("Days", 2, new Object[0])), (j == 0 && (baseFragment instanceof NotificationsCustomSettingsActivity)) ? null : LocaleController.getString(R.string.NotificationsCustomize), LocaleController.getString(R.string.NotificationsTurnOff)};
        int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
        LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
        linearLayout.setOrientation(1);
        AlertDialog.Builder builder2 = new AlertDialog.Builder(baseFragment.getParentActivity());
        int i6 = 0;
        View view = linearLayout;
        while (i6 < 5) {
            if (strArr[i6] == null) {
                i4 = i6;
                builder = builder2;
                obj = view;
                drawable = drawable2;
            } else {
                ?? textView = new TextView(baseFragment.getParentActivity());
                Drawable drawable3 = baseFragment.getParentActivity().getResources().getDrawable(iArr[i6]);
                if (i6 == 4) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_text_RedRegular), PorterDuff.Mode.MULTIPLY));
                } else {
                    textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                    drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogIcon), PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextSize(r11, 16.0f);
                textView.setLines(r11);
                textView.setMaxLines(r11);
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, drawable2, drawable2, drawable2);
                textView.setTag(Integer.valueOf(i6));
                textView.setBackgroundDrawable(Theme.getSelectorDrawable(r12));
                textView.setPadding(AndroidUtilities.dp(24.0f), r12, AndroidUtilities.dp(24.0f), r12);
                textView.setSingleLine(r11);
                textView.setGravity(19);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                textView.setText(strArr[i6]);
                view.addView(textView, LayoutHelper.createLinear(-1, 48, 51));
                i4 = i6;
                builder = builder2;
                obj = view;
                drawable = drawable2;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        AlertsCreator.lambda$showCustomNotificationsDialog$25(j, i3, zIsGlobalNotificationsEnabled, i, intCallback2, i2, baseFragment, arrayList, arrayList2, intCallback, builder, view2);
                    }
                });
            }
            i6 = i4 + 1;
            view = obj;
            builder2 = builder;
            drawable2 = drawable;
            r11 = 1;
            r12 = 0;
        }
        AlertDialog.Builder builder3 = builder2;
        builder3.setTitle(LocaleController.getString(R.string.Notifications));
        builder3.setView(view);
        baseFragment.showDialog(builder3.create());
    }

    public static void lambda$showCustomNotificationsDialog$25(long r20, int r22, boolean r23, int r24, org.telegram.messenger.MessagesStorage.IntCallback r25, int r26, org.telegram.ui.ActionBar.BaseFragment r27, java.util.ArrayList r28, java.util.ArrayList r29, org.telegram.messenger.MessagesStorage.IntCallback r30, org.telegram.ui.ActionBar.AlertDialog.Builder r31, android.view.View r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.lambda$showCustomNotificationsDialog$25(long, int, boolean, int, org.telegram.messenger.MessagesStorage$IntCallback, int, org.telegram.ui.ActionBar.BaseFragment, java.util.ArrayList, java.util.ArrayList, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.AlertDialog$Builder, android.view.View):void");
    }

    public static AlertDialog showSecretLocationAlert(Context context, int i, final Runnable runnable, boolean z, Theme.ResourcesProvider resourcesProvider) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i2 = MessagesController.getInstance(i).availableMapProviders;
        if ((i2 & 1) != 0) {
            arrayList.add(LocaleController.getString(R.string.MapPreviewProviderTelegram));
            arrayList2.add(0);
        }
        if ((i2 & 2) != 0) {
            arrayList.add(LocaleController.getString(R.string.MapPreviewProviderGoogle));
            arrayList2.add(1);
        }
        if ((i2 & 4) != 0) {
            arrayList.add(LocaleController.getString(R.string.MapPreviewProviderYandex));
            arrayList2.add(3);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        final AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.MapPreviewProviderTitle));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(context, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            radioColorCell.setTextAndValue((CharSequence) arrayList.get(i3), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i3)).intValue());
            radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$showSecretLocationAlert$26(arrayList2, runnable, builder, view);
                }
            });
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

    public static void lambda$showSecretLocationAlert$26(ArrayList arrayList, Runnable runnable, AlertDialog.Builder builder, View view) {
        SharedConfig.setSecretMapPreviewType(((Integer) arrayList.get(((Integer) view.getTag()).intValue())).intValue());
        if (runnable != null) {
            runnable.run();
        }
        builder.getDismissRunnable().run();
    }

    public static void updateDayPicker(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, numberPicker2.getValue());
        calendar.set(1, numberPicker3.getValue());
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(calendar.getActualMaximum(5));
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

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2) {
        showOpenUrlAlert(baseFragment, str, z, true, z2, false, null, null);
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, z2, z3, false, progress, resourcesProvider);
    }

    public static void showOpenUrlAlert(final BaseFragment baseFragment, final String str, boolean z, final boolean z2, boolean z3, boolean z4, final Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        String strReplaceHostname;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final long inlineReturn = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getInlineReturn() : 0L;
        String scheme = str == null ? null : Uri.parse(str).getScheme();
        if (Browser.isInternalUrl(str, null) || !z3 || "mailto".equalsIgnoreCase(scheme)) {
            Browser.openUrl(baseFragment.getParentActivity(), Uri.parse(str), inlineReturn == 0, z2, z4 && checkInternalBotApp(str), progress, null, false, true, false);
            return;
        }
        if (z) {
            try {
                Uri uri = Uri.parse(str);
                strReplaceHostname = Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
        } else {
            strReplaceHostname = str;
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$showOpenUrlAlert$27(baseFragment, str, inlineReturn, z2, progress);
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        SpannableString spannableString = new SpannableString(strReplaceHostname);
        spannableString.setSpan(new URLSpan(strReplaceHostname) {
            @Override
            public void onClick(View view) {
                runnable.run();
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.OpenUrlAlert2));
        int iIndexOf = spannableStringBuilder.toString().indexOf("%1$s");
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableString);
        }
        builder.setMessage(spannableStringBuilder);
        builder.setMessageTextViewClickable(false);
        builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        baseFragment.showDialog(alertDialogCreate);
    }

    public static void lambda$showOpenUrlAlert$27(BaseFragment baseFragment, String str, long j, boolean z, Browser.Progress progress) {
        Browser.openUrl(baseFragment.getParentActivity(), Uri.parse(str), j == 0, z, progress);
    }

    public static void showOpenUrlAlert(final Context context, final String str, boolean z, final boolean z2, boolean z3, boolean z4, final long j, final Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        String strReplaceHostname;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (Browser.isInternalUrl(str, null) || !z3 || "mailto".equalsIgnoreCase(scheme)) {
                Browser.openUrl(context, Uri.parse(str), j == 0, z2, z4 && checkInternalBotApp(str), progress, null, false, true, false);
                return;
            }
            if (z) {
                try {
                    Uri uri = Uri.parse(str);
                    strReplaceHostname = Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
            } else {
                strReplaceHostname = str;
            }
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$showOpenUrlAlert$29(context, str, j, z2, progress);
                }
            };
            AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
            final AlertDialog[] alertDialogArr = new AlertDialog[1];
            SpannableString spannableString = new SpannableString(strReplaceHostname);
            spannableString.setSpan(new URLSpan(strReplaceHostname) {
                @Override
                public void onClick(View view) {
                    runnable.run();
                    AlertDialog alertDialog = alertDialogArr[0];
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                }
            }, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.OpenUrlAlert2));
            int iIndexOf = spannableStringBuilder.toString().indexOf("%1$s");
            if (iIndexOf >= 0) {
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableString);
            }
            builder.setMessage(spannableStringBuilder);
            builder.setMessageTextViewClickable(false);
            builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    runnable.run();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialogArr[0] = builder.show();
        }
    }

    public static void lambda$showOpenUrlAlert$29(Context context, String str, long j, boolean z, Browser.Progress progress) {
        Browser.openUrl(context, Uri.parse(str), j == 0, z, progress);
    }

    private static boolean checkInternalBotApp(String str) {
        return Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$");
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
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), resourcesProvider);
        builder.setView(linksTextView);
        builder.setTitle(LocaleController.getString(R.string.AskAQuestion));
        builder.setPositiveButton(LocaleController.getString(R.string.AskButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.performAskAQuestion(baseFragment);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void performAskAQuestion(final org.telegram.ui.ActionBar.BaseFragment r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.performAskAQuestion(org.telegram.ui.ActionBar.BaseFragment):void");
    }

    public static void lambda$performAskAQuestion$34(final SharedPreferences sharedPreferences, final AlertDialog alertDialog, final int i, final BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            final TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$performAskAQuestion$32(sharedPreferences, tL_help_support, alertDialog, i, baseFragment);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$performAskAQuestion$33(alertDialog);
                }
            });
        }
    }

    public static void lambda$performAskAQuestion$32(SharedPreferences sharedPreferences, TLRPC.TL_help_support tL_help_support, AlertDialog alertDialog, int i, BaseFragment baseFragment) {
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

    public static void lambda$performAskAQuestion$33(AlertDialog alertDialog) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void createImportDialogAlert(BaseFragment baseFragment, String str, String str2, TLRPC.User user, TLRPC.Chat chat, final Runnable runnable) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
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
        textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
        if (user != null) {
            if (UserObject.isReplyUser(user)) {
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
        } else {
            avatarDrawable.setInfo(currentAccount, chat);
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        }
        textView.setText(AndroidUtilities.replaceTags(str2));
        builder.setPositiveButton(LocaleController.getString(R.string.Import), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createImportDialogAlert$35(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.create());
    }

    public static void lambda$createImportDialogAlert$35(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void createBotLaunchAlert(final BaseFragment baseFragment, final TLRPC.User user, final Runnable runnable, final Runnable runnable2) {
        final Context context = baseFragment.getContext();
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(linksTextView);
        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
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
        simpleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
            int color = Theme.getColor(Theme.key_chats_verifiedBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedCheck), mode));
            simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
        }
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue));
        textView.setTextSize(1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createBotLaunchAlert$36(user, baseFragment, builder, view);
            }
        });
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
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createBotLaunchAlert$37(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        final AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate, false, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createBotLaunchAlert$38(runnable2, dialogInterface);
            }
        });
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createBotLaunchAlert$39(alertDialogCreate, context);
            }
        }));
    }

    public static void lambda$createBotLaunchAlert$36(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void lambda$createBotLaunchAlert$37(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createBotLaunchAlert$38(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createBotLaunchAlert$39(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static void createBotLaunchAlert(final BaseFragment baseFragment, final AtomicBoolean atomicBoolean, final TLRPC.User user, final Runnable runnable) {
        float f;
        int iDp;
        if (baseFragment == null) {
            return;
        }
        final Context context = baseFragment.getContext();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(linksTextView);
        linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight() + AndroidUtilities.dp(7.0f));
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
        simpleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
            int color = Theme.getColor(Theme.key_chats_verifiedBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedCheck), mode));
            simpleTextView.setRightDrawable(new CombinedDrawable(drawableMutate, drawableMutate2));
        }
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue));
        textView.setTextSize(1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createBotLaunchAlert$40(user, baseFragment, builder, view);
            }
        });
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
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, baseFragment.getResourceProvider());
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.allowMultiline();
            checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
            checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false);
            CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
            if (LocaleController.isRTL) {
                f = 16.0f;
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                f = 16.0f;
                iDp = AndroidUtilities.dp(8.0f);
            }
            checkBoxCell2.setPadding(iDp, 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(f), 0);
            checkBoxCellArr[0].setChecked(true, false);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createBotLaunchAlert$41(atomicBoolean, view);
                }
            });
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
        builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        final AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createBotLaunchAlert$43(alertDialogCreate, context);
            }
        }));
    }

    public static void lambda$createBotLaunchAlert$40(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void lambda$createBotLaunchAlert$41(AtomicBoolean atomicBoolean, View view) {
        atomicBoolean.set(!atomicBoolean.get());
        ((CheckBoxCell) view).setChecked(atomicBoolean.get(), true);
    }

    public static void lambda$createBotLaunchAlert$43(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static boolean ensurePaidMessagesMultiConfirmationTopicKeys(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) it.next()).dialogId));
            }
        }
        return ensurePaidMessagesMultiConfirmation(i, new ArrayList(hashSet), i2, callback);
    }

    public static boolean ensurePaidMessagesMultiConfirmation(final int i, final ArrayList arrayList, int i2, final Utilities.Callback callback) {
        if (callback == null) {
            return false;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        final HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        long j = 0;
        boolean z = true;
        int i3 = 0;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
            }
            map.put(l, Long.valueOf(sendPaidMessagesStars));
            j += sendPaidMessagesStars;
            StarsController.getInstance(i).sendingMessagesCount.put(l, Integer.valueOf(i2));
            if (sendPaidMessagesStars > 0) {
                i3++;
            }
            if (sendPaidMessagesStars > 0 && z) {
                if (MessagesController.getInstance(i).getMainSettings().getLong("ask_paid_message_" + jLongValue + "_price", 0L) < sendPaidMessagesStars) {
                    z = false;
                }
            }
        }
        final long jMax = j * Math.max(1, i2);
        if (z || jMax <= 0) {
            callback.run(map);
            return false;
        }
        final Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        final Theme.ResourcesProvider darkThemeResourceProvider = (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i3)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) jMax, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i3) * i2))));
        showAlertWithCheckbox(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AlertsCreator.lambda$ensurePaidMessagesMultiConfirmation$46(i, arrayList, jMax, activity, darkThemeResourceProvider, callback, map, (Boolean) obj);
            }
        }, darkThemeResourceProvider);
        return true;
    }

    public static void lambda$ensurePaidMessagesMultiConfirmation$46(final int i, final ArrayList arrayList, final long j, final Activity activity, final Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback, final HashMap map, Boolean bool) {
        if (bool.booleanValue()) {
            SharedPreferences.Editor editorEdit = MessagesController.getInstance(i).getMainSettings().edit();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                long jLongValue = l.longValue();
                long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
                if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
                }
                editorEdit.putLong("ask_paid_message_" + jLongValue + "_price", sendPaidMessagesStars);
                StarsController.getInstance(i).justAgreedToNotAskDialogs.put(l, Long.valueOf(System.currentTimeMillis()));
            }
            editorEdit.apply();
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$ensurePaidMessagesMultiConfirmation$45(i, j, activity, arrayList, resourcesProvider, callback, map);
            }
        };
        if (!StarsController.getInstance(i).balanceAvailable()) {
            StarsController.getInstance(i).invalidateBalance(runnable);
        } else {
            runnable.run();
        }
    }

    public static void lambda$ensurePaidMessagesMultiConfirmation$45(int i, long j, Activity activity, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback, final HashMap map) {
        if (StarsController.getInstance(i).getBalance().amount >= j) {
            callback.run(map);
        } else {
            if (activity == null) {
                return;
            }
            long jLongValue = ((Long) arrayList.get(0)).longValue();
            new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, j, 13, DialogObject.getShortName(i, jLongValue), new Runnable() {
                @Override
                public final void run() {
                    callback.run(map);
                }
            }, jLongValue).show();
        }
    }

    public static boolean needsPaidMessageAlert(int i, long j) {
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        if (sendPaidMessagesStars > 0) {
            if (sendPaidMessagesStars > MessagesController.getInstance(i).getMainSettings().getLong("ask_paid_message_" + j + "_price", 0L)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ensurePaidMessageConfirmation(int i, long j, int i2, Utilities.Callback callback) {
        return ensurePaidMessageConfirmation(i, j, i2, callback, 0L);
    }

    public static boolean ensurePaidMessageConfirmation(final int i, final long j, int i2, final Utilities.Callback callback, long j2) {
        if (callback == null) {
            return false;
        }
        long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
        if (sendPaidMessagesStars <= 0 && j > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(j));
        }
        final long j3 = sendPaidMessagesStars;
        final long j4 = i2 * j3;
        StarsController.getInstance(i).sendingMessagesCount.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j4 <= 0 || j2 == j4) {
            callback.run(Long.valueOf(j4));
            return false;
        }
        showPayForMessageAlert(i, j, j3, i2, new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$ensurePaidMessageConfirmation$49(i, j4, j, callback, j3);
            }
        });
        return true;
    }

    public static void lambda$ensurePaidMessageConfirmation$49(final int i, final long j, final long j2, final Utilities.Callback callback, final long j3) {
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$ensurePaidMessageConfirmation$48(i, j, j2, callback, j3);
            }
        };
        if (!StarsController.getInstance(i).balanceAvailable()) {
            StarsController.getInstance(i).invalidateBalance(runnable);
        } else {
            runnable.run();
        }
    }

    public static void lambda$ensurePaidMessageConfirmation$48(int i, long j, long j2, final Utilities.Callback callback, final long j3) {
        if (StarsController.getInstance(i).getBalance().amount < j) {
            Activity activity = AndroidUtilities.getActivity();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            Theme.ResourcesProvider darkThemeResourceProvider = (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
            if (activity == null) {
                return;
            }
            new StarsIntroActivity.StarsNeededSheet(activity, darkThemeResourceProvider, j, 13, DialogObject.getShortName(i, j2), new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$ensurePaidMessageConfirmation$47(callback, j3);
                }
            }, j2).show();
            return;
        }
        callback.run(Long.valueOf(j3));
    }

    public static void lambda$ensurePaidMessageConfirmation$47(Utilities.Callback callback, long j) {
        callback.run(Long.valueOf(j));
    }

    public static void showPayForMessageAlert(final int i, final long j, final long j2, int i2, final Runnable runnable) {
        TLRPC.Chat chat;
        if (runnable == null) {
            return;
        }
        if (j2 <= MessagesController.getInstance(i).getMainSettings().getLong("ask_paid_message_" + j + "_price", 0L)) {
            runnable.run();
            return;
        }
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider darkThemeResourceProvider = (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        String shortName = DialogObject.getShortName(i, j);
        if (ChatObject.isMonoForum(i, j)) {
            shortName = ForumUtilities.getMonoForumTitle(i, j, true);
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
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) (i2 * j2))));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i2)));
        }
        showAlertWithCheckbox(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AlertsCreator.lambda$showPayForMessageAlert$50(i, j, j2, runnable, (Boolean) obj);
            }
        }, darkThemeResourceProvider);
    }

    public static void lambda$showPayForMessageAlert$50(int i, long j, long j2, Runnable runnable, Boolean bool) {
        if (bool.booleanValue()) {
            MessagesController.getInstance(i).getMainSettings().edit().putLong("ask_paid_message_" + j + "_price", j2).apply();
            StarsController.getInstance(i).justAgreedToNotAskDialogs.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void showAlertWithCheckbox(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            callback.run(Boolean.FALSE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        final boolean[] zArr = new boolean[1];
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
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight() + AndroidUtilities.dp(7.0f));
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(charSequence);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence3)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCellArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) checkBoxCellArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            checkBoxCellArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            checkBoxCellArr[0].setText(charSequence3, "", false, false);
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, -2, 83));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$showAlertWithCheckbox$51(zArr, view);
                }
            });
        }
        builder.setPositiveButton(charSequence4, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$showAlertWithCheckbox$52(callback, zArr, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setShowStarsBalance(true);
        alertDialogCreate.show();
    }

    public static void lambda$showAlertWithCheckbox$51(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$showAlertWithCheckbox$52(Utilities.Callback callback, boolean[] zArr, AlertDialog alertDialog, int i) {
        callback.run(Boolean.valueOf(zArr[0]));
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, chat, user, z2, z3, z4, z5, booleanCallback, baseFragment != null ? baseFragment.getResourceProvider() : null);
    }

    public static void createClearOrDeleteDialogAlert(final org.telegram.ui.ActionBar.BaseFragment r38, final boolean r39, final boolean r40, final org.telegram.tgnet.TLRPC.Chat r41, final org.telegram.tgnet.TLRPC.User r42, final boolean r43, final boolean r44, boolean r45, final boolean r46, final org.telegram.messenger.MessagesStorage.BooleanCallback r47, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.createClearOrDeleteDialogAlert(org.telegram.ui.ActionBar.BaseFragment, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$createClearOrDeleteDialogAlert$53(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearOrDeleteDialogAlert$54(boolean z, TLRPC.Chat chat, AlertDialog.Builder builder, boolean[] zArr) {
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

    public static void lambda$createClearOrDeleteDialogAlert$55(boolean[] zArr, Runnable runnable, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
        runnable.run();
    }

    public static void lambda$createClearOrDeleteDialogAlert$62(boolean z, final boolean z2, boolean z3, final TLRPC.User user, final BaseFragment baseFragment, final boolean z4, final TLRPC.Chat chat, final boolean z5, final boolean[] zArr, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider, AlertDialog.Builder builder, final int i, final Context context, AlertDialog alertDialog, int i2) {
        if (!z && !z2 && !z3) {
            if (UserObject.isUserSelf(user)) {
                createClearOrDeleteDialogAlert(baseFragment, z4, true, chat, user, false, z5, zArr[0], z6, booleanCallback, resourcesProvider);
                return;
            }
            if (user != null && zArr[0]) {
                MessagesStorage.getInstance(baseFragment.getCurrentAccount()).getMessagesCount(user.id, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i3) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$56(baseFragment, z4, chat, user, z5, zArr, z6, booleanCallback, resourcesProvider, i3);
                    }
                });
                return;
            }
            if (ChatObject.isChannel(chat) && chat.creator && !zArr[0]) {
                final Browser.Progress progressMakeButtonLoading = builder.create().makeButtonLoading(-1);
                progressMakeButtonLoading.init();
                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat);
                ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$61(progressMakeButtonLoading, booleanCallback, z2, zArr, baseFragment, chat, context, i, resourcesProvider, (TLRPC.User) obj, (TLRPC.TL_error) obj2);
                    }
                });
                return;
            }
        }
        if (booleanCallback != null) {
            booleanCallback.run(z2 || zArr[0]);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$56(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean[] zArr, boolean z3, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider, int i) {
        if (i >= 50) {
            createClearOrDeleteDialogAlert(baseFragment, z, true, chat, user, false, z2, zArr[0], z3, booleanCallback, resourcesProvider);
        } else if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$61(org.telegram.messenger.browser.Browser.Progress r10, final org.telegram.messenger.MessagesStorage.BooleanCallback r11, boolean r12, boolean[] r13, org.telegram.ui.ActionBar.BaseFragment r14, final org.telegram.tgnet.TLRPC.Chat r15, final android.content.Context r16, final int r17, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r18, org.telegram.tgnet.TLRPC.User r19, org.telegram.tgnet.TLRPC.TL_error r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.lambda$createClearOrDeleteDialogAlert$61(org.telegram.messenger.browser.Browser$Progress, org.telegram.messenger.MessagesStorage$BooleanCallback, boolean, boolean[], org.telegram.ui.ActionBar.BaseFragment, org.telegram.tgnet.TLRPC$Chat, android.content.Context, int, org.telegram.ui.ActionBar.Theme$ResourcesProvider, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public static void lambda$createClearOrDeleteDialogAlert$59(Context context, TLRPC.Chat chat, TLRPC.User user, final int i, final MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        new SelectChatUserSheet(context, chat, user, new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$58(i, booleanCallback);
            }
        }, resourcesProvider).show();
    }

    public static void lambda$createClearOrDeleteDialogAlert$58(int i, final MessagesStorage.BooleanCallback booleanCallback) {
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$57(booleanCallback);
            }
        }, 250L);
    }

    public static void lambda$createClearOrDeleteDialogAlert$57(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$60(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
    }

    public static void showLeaveGroupWithFutureOwner(BaseFragment baseFragment, TLRPC.Chat chat, TLRPC.User user, final Runnable runnable, final Runnable runnable2) {
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
            protected void onDraw(Canvas canvas) {
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
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTopViewAspectRatio(-1.0f);
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user), chat.title)));
        builder.setNegativeButton(LocaleController.getString(R.string.AppointNewOwner), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable2.run();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        View button = alertDialogCreate.getButton(-1);
        if (button instanceof TextView) {
            ((TextView) button).setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void createClearOrDeleteDialogsAlert(BaseFragment baseFragment, boolean z, boolean z2, int i, int i2, boolean z3, final MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        CharSequence string;
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, resourcesProvider);
        UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        final boolean[] zArr = new boolean[1];
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight() + AndroidUtilities.dp(7.0f));
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        if (z2) {
            if (z3) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.lambda$createClearOrDeleteDialogsAlert$65(zArr, view);
                    }
                });
            }
            textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", i2, new Object[0])));
            textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
        } else if (i != 0) {
            textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", i2, new Object[0])));
            textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
        } else {
            textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", i2, new Object[0])));
            textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (z2) {
            string = LocaleController.getString("Delete", R.string.Delete);
        } else if (i != 0) {
            string = LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache);
        } else {
            string = LocaleController.getString("ClearHistory", R.string.ClearHistory);
        }
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.lambda$createClearOrDeleteDialogsAlert$66(booleanCallback, zArr, alertDialog, i3);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView3 = (TextView) alertDialogCreate.getButton(-1);
        if (textView3 != null) {
            textView3.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void lambda$createClearOrDeleteDialogsAlert$65(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearOrDeleteDialogsAlert$66(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void createClearDaysDialogAlert(org.telegram.ui.ActionBar.BaseFragment r26, int r27, org.telegram.tgnet.TLRPC.User r28, org.telegram.tgnet.TLRPC.Chat r29, boolean r30, final org.telegram.messenger.MessagesStorage.BooleanCallback r31, org.telegram.ui.ActionBar.Theme.ResourcesProvider r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AlertsCreator.createClearDaysDialogAlert(org.telegram.ui.ActionBar.BaseFragment, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$createClearDaysDialogAlert$67(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createClearDaysDialogAlert$68(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        booleanCallback.run(zArr[0]);
    }

    public static void createCallDialogAlert(final BaseFragment baseFragment, final TLRPC.User user, final boolean z) {
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
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
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
        textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
        baseFragment.showDialog(new AlertDialog.Builder(parentActivity).setView(frameLayout).setPositiveButton(LocaleController.getString(R.string.Call), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createCallDialogAlert$69(baseFragment, user, z, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
    }

    public static void lambda$createCallDialogAlert$69(BaseFragment baseFragment, TLRPC.User user, boolean z, AlertDialog alertDialog, int i) {
        TLRPC.UserFull userFull = baseFragment.getMessagesController().getUserFull(user.id);
        VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, baseFragment.getParentActivity(), userFull, baseFragment.getAccountInstance());
    }

    public static void createChangeBioAlert(String str, final long j, final Context context, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
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
        final EditText editText = new EditText(context);
        int i2 = Theme.key_voipgroup_actionBarItems;
        editText.setTextColor(Theme.getColor(i2));
        editText.setHint(LocaleController.getString(j > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(Theme.createEditTextDrawable(context, true));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        final int i3 = j > 0 ? 70 : 255;
        editText.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(i3) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                CharSequence charSequenceFilter = super.filter(charSequence, i4, i5, spanned, i6, i7);
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
        numberTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, LayoutHelper.createFrame(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int iCodePointCount = i3 - Character.codePointCount(editable, 0, editable.length());
                if (iCodePointCount < 30) {
                    NumberTextView numberTextView2 = numberTextView;
                    numberTextView2.setNumber(iCodePointCount, numberTextView2.getVisibility() == 0);
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                    return;
                }
                AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
        editText.setText(str);
        editText.setSelection(editText.getText().toString().length());
        builder.setView(frameLayout);
        final AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                AlertsCreator.lambda$createChangeBioAlert$71(j, i, editText, alertDialog, i4);
            }
        };
        builder.setPositiveButton(LocaleController.getString(R.string.Save), onButtonClickListener);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(editText);
            }
        });
        frameLayout.addView(editText, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.showKeyboard(editText);
        final AlertDialog alertDialogCreate = builder.create();
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                return AlertsCreator.lambda$createChangeBioAlert$73(j, alertDialogCreate, onButtonClickListener, textView, i4, keyEvent);
            }
        });
        alertDialogCreate.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(i2));
    }

    public static void lambda$createChangeBioAlert$71(long j, int i, EditText editText, AlertDialog alertDialog, int i2) {
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
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AlertsCreator.lambda$createChangeBioAlert$70(tLObject, tL_error);
                }
            }, 2);
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
                    int i3 = NotificationCenter.chatInfoDidLoad;
                    Boolean bool = Boolean.FALSE;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, chatFull, 0, bool, bool);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            MessagesController.getInstance(i).updateChatAbout(j2, string, chatFull);
        }
        alertDialog.dismiss();
    }

    public static boolean lambda$createChangeBioAlert$73(long j, AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && (j <= 0 || keyEvent.getKeyCode() != 66)) || !alertDialog.isShowing()) {
            return false;
        }
        onButtonClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void createChangeNameAlert(final long j, Context context, final int i) {
        String str;
        String str2;
        final EditText editText;
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = MessagesController.getInstance(i).getChat(Long.valueOf(-j)).title;
            str2 = null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(j > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final EditText editText2 = new EditText(context);
        int i2 = Theme.key_voipgroup_actionBarItems;
        editText2.setTextColor(Theme.getColor(i2));
        editText2.setTextSize(1, 16.0f);
        editText2.setMaxLines(1);
        editText2.setLines(1);
        editText2.setSingleLine(true);
        editText2.setGravity(LocaleController.isRTL ? 5 : 3);
        editText2.setInputType(49152);
        editText2.setImeOptions(j > 0 ? 5 : 6);
        editText2.setHint(LocaleController.getString(j > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
        editText2.setBackground(Theme.createEditTextDrawable(context, true));
        editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        editText2.requestFocus();
        if (j > 0) {
            EditText editText3 = new EditText(context);
            editText3.setTextColor(Theme.getColor(i2));
            editText3.setTextSize(1, 16.0f);
            editText3.setMaxLines(1);
            editText3.setLines(1);
            editText3.setSingleLine(true);
            editText3.setGravity(LocaleController.isRTL ? 5 : 3);
            editText3.setInputType(49152);
            editText3.setImeOptions(6);
            editText3.setHint(LocaleController.getString(R.string.LastName));
            editText3.setBackground(Theme.createEditTextDrawable(context, true));
            editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText = editText3;
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
        final EditText editText4 = editText;
        final AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.lambda$createChangeNameAlert$75(editText2, j, i, editText4, alertDialog, i3);
            }
        };
        builder.setPositiveButton(LocaleController.getString(R.string.Save), onButtonClickListener);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createChangeNameAlert$76(editText2, editText, dialogInterface);
            }
        });
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(i2));
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return AlertsCreator.lambda$createChangeNameAlert$77(alertDialogCreate, onButtonClickListener, textView, i3, keyEvent);
            }
        };
        if (editText != null) {
            editText.setOnEditorActionListener(onEditorActionListener);
        } else {
            editText2.setOnEditorActionListener(onEditorActionListener);
        }
    }

    public static void lambda$createChangeNameAlert$75(EditText editText, long j, int i, EditText editText2, AlertDialog alertDialog, int i2) {
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
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AlertsCreator.lambda$createChangeNameAlert$74(tLObject, tL_error);
                }
            });
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

    public static void lambda$createChangeNameAlert$76(EditText editText, EditText editText2, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editText);
        AndroidUtilities.hideKeyboard(editText2);
    }

    public static boolean lambda$createChangeNameAlert$77(AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && keyEvent.getKeyCode() != 66) || !alertDialog.isShowing()) {
            return false;
        }
        onButtonClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void showChatWithAdmin(BaseFragment baseFragment, TLRPC.User user, String str, boolean z, int i) {
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(baseFragment.getParentActivity());
        builder.setTitle(LocaleController.getString(z ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle), true);
        LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(baseFragment.getParentActivity());
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -1, 0, 21, 0, 21, 8));
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        textView.setTextSize(1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i, false))));
        TextView textView2 = new TextView(baseFragment.getParentActivity());
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.IUnderstand));
        textView2.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 8));
        builder.setCustomView(linearLayout);
        final BottomSheet bottomSheetShow = builder.show();
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                bottomSheetShow.lambda$new$0();
            }
        });
    }

    public static void createContactInviteDialog(final BaseFragment baseFragment, String str, String str2, final String str3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.ContactNotRegisteredTitle));
        builder.setMessage(LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2)));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Invite), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createContactInviteDialog$81(str3, baseFragment, alertDialog, i);
            }
        });
        baseFragment.showDialog(builder.create());
    }

    public static void lambda$createContactInviteDialog$81(String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(baseFragment.getCurrentAccount()).getInviteText(1));
            baseFragment.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
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
        float y = 0.0f;
        View view3 = view2;
        float x = 0.0f;
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

    public static void checkRestrictedInviteUsers(final int i, final TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator<TLRPC.TL_missingInvitee> it = tL_messages_invitedUsers.missing_invitees.iterator();
        while (it.hasNext()) {
            TLRPC.TL_missingInvitee next = it.next();
            if (tL_messages_invitedUsers.updates != null) {
                for (int i2 = 0; i2 < tL_messages_invitedUsers.updates.users.size(); i2++) {
                    user = tL_messages_invitedUsers.updates.users.get(i2);
                    if (user.id == next.user_id) {
                        break;
                    }
                }
                user = null;
            } else {
                user = null;
            }
            if (user == null) {
                user = MessagesController.getInstance(i).getUser(Long.valueOf(next.user_id));
            }
            if (user != null) {
                arrayList.add(user);
                if (next.premium_required_for_pm) {
                    arrayList2.add(Long.valueOf(user.id));
                }
                if (next.premium_would_allow_invite) {
                    arrayList3.add(Long.valueOf(user.id));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$checkRestrictedInviteUsers$82(i, chat, arrayList, arrayList2, arrayList3);
            }
        }, 200L);
    }

    public static void lambda$checkRestrictedInviteUsers$82(int i, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        BaseFragment lastFragment;
        if (!LaunchActivity.isActive || (lastFragment = LaunchActivity.getLastFragment()) == null || lastFragment.getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 11, i, null);
        limitReachedBottomSheet.setRestrictedUsers(chat, arrayList, arrayList2, arrayList3, null);
        limitReachedBottomSheet.show();
    }

    public static void createBlockDialogAlert(BaseFragment baseFragment, int i, boolean z, TLRPC.User user, final BlockDialogCallback blockDialogCallback) {
        String string;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (i == 1 && user == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
        CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[2];
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        if (i == 1) {
            String name = ContactsController.formatName(user.first_name, user.last_name);
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, name));
            string = LocaleController.getString(R.string.BlockUser);
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, name)));
        } else {
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", i, new Object[0])));
            string = LocaleController.getString(R.string.BlockUsers);
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", i, new Object[0]))));
        }
        final boolean[] zArr = {true, true};
        for (final int i2 = 0; i2 < 2; i2++) {
            if (i2 != 0 || z) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1);
                checkBoxCellArr[i2] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (i2 == 0) {
                    checkBoxCellArr[i2].setText(LocaleController.getString(R.string.ReportSpamTitle), "", true, false);
                } else {
                    checkBoxCellArr[i2].setText(LocaleController.getString(i == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false);
                }
                checkBoxCellArr[i2].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[i2], LayoutHelper.createLinear(-1, 48));
                checkBoxCellArr[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.lambda$createBlockDialogAlert$83(zArr, i2, view);
                    }
                });
            }
        }
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.lambda$createBlockDialogAlert$84(blockDialogCallback, zArr, alertDialog, i3);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void lambda$createBlockDialogAlert$83(boolean[] zArr, int i, View view) {
        boolean z = !zArr[i];
        zArr[i] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createBlockDialogAlert$84(BlockDialogCallback blockDialogCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        blockDialogCallback.run(zArr[0], zArr[1]);
    }

    public static BottomSheet createTimePickerDialog(Context context, String str, final int i, final int i2, final int i3, final Utilities.Callback callback) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, null);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Hours", i4, new Object[0]);
            }
        };
        final LinearLayout linearLayout = new LinearLayout(context) {
            private Text ampmText;
            private boolean isAM;
            private final Text separatorText = new Text(":", 18.0f);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                int i4 = Theme.key_windowBackgroundWhiteBlackText;
                this.separatorText.draw(canvas, (getWidth() - this.separatorText.getCurrentWidth()) / 2.0f, getHeight() / 2.0f, Theme.getColor(i4), 1.0f);
                if (!LocaleController.is24HourFormat) {
                    boolean z = numberPicker.getValue() % 24 < 12;
                    if (this.isAM != z || this.ampmText == null) {
                        this.isAM = z;
                        this.ampmText = new Text(z ? "AM" : "PM", 18.0f);
                    }
                    this.ampmText.draw(canvas, (getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), Theme.getColor(i4), 1.0f);
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
            protected CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Minutes", i4, new Object[0]);
            }
        };
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setAllItemsCount(60);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setGravity(3);
        numberPicker2.setTextOffset(AndroidUtilities.dp(12.0f));
        final Utilities.Callback callback2 = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AlertsCreator.lambda$createTimePickerDialog$90(i2, i3, numberPicker, numberPicker2, i, linearLayout, (Boolean) obj);
            }
        };
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return AlertsCreator.lambda$createTimePickerDialog$91(i4);
            }
        });
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i4, int i5) {
                AlertsCreator.lambda$createTimePickerDialog$92(callback2, numberPicker3, i4, i5);
            }
        });
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return AlertsCreator.lambda$createTimePickerDialog$93(i4);
            }
        });
        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i4, int i5) {
                AlertsCreator.lambda$createTimePickerDialog$94(callback2, numberPicker3, i4, i5);
            }
        });
        callback2.run(Boolean.FALSE);
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i4, int i5) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
                int i6 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i6);
                numberPicker2.setItemCount(i6);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                this.ignoreLayout = false;
                super.onMeasure(i4, i5);
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
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createTimePickerDialog$95(view, motionEvent);
            }
        });
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createTimePickerDialog$96(bottomSheetArr, view);
            }
        });
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        builder.setCustomView(linearLayout2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createTimePickerDialog$97(callback, numberPicker, numberPicker2, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet bottomSheetCreate = builder.create();
        final BottomSheet[] bottomSheetArr = {bottomSheetCreate};
        return bottomSheetCreate;
    }

    public static void lambda$createTimePickerDialog$90(int i, int i2, NumberPicker numberPicker, NumberPicker numberPicker2, int i3, LinearLayout linearLayout, Boolean bool) {
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

    public static String lambda$createTimePickerDialog$91(int i) {
        boolean z = LocaleController.is24HourFormat;
        String str = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
        return i >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, str) : str;
    }

    public static void lambda$createTimePickerDialog$92(Utilities.Callback callback, NumberPicker numberPicker, int i, int i2) {
        callback.run(Boolean.TRUE);
    }

    public static String lambda$createTimePickerDialog$93(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createTimePickerDialog$94(Utilities.Callback callback, NumberPicker numberPicker, int i, int i2) {
        callback.run(Boolean.TRUE);
    }

    public static void lambda$createTimePickerDialog$96(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$new$0();
    }

    public static void lambda$createTimePickerDialog$97(Utilities.Callback callback, NumberPicker numberPicker, NumberPicker numberPicker2, DialogInterface dialogInterface) {
        callback.run(Integer.valueOf((numberPicker.getValue() * 60) + numberPicker2.getValue()));
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
        numberPicker2.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i7) {
                AlertsCreator.lambda$createDatePickerDialog$98(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
            }
        });
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, -2, 0.3f));
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i7) {
                return AlertsCreator.lambda$createDatePickerDialog$99(i7);
            }
        });
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i7, int i8) {
                AlertsCreator.updateDayPicker(numberPicker2, numberPicker, numberPicker3);
            }
        });
        numberPicker.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i7) {
                AlertsCreator.lambda$createDatePickerDialog$101(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        numberPicker3.setMinValue(i7 + i);
        numberPicker3.setMaxValue(i7 + i2);
        numberPicker3.setValue(i7 + i3);
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, -2, 0.4f));
        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i8, int i9) {
                AlertsCreator.updateDayPicker(numberPicker2, numberPicker, numberPicker3);
            }
        });
        numberPicker3.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i8) {
                AlertsCreator.lambda$createDatePickerDialog$103(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i8);
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
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i8) {
                AlertsCreator.lambda$createDatePickerDialog$104(z, numberPicker2, numberPicker, numberPicker3, datePickerDelegate, alertDialog, i8);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder;
    }

    public static void lambda$createDatePickerDialog$98(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static String lambda$createDatePickerDialog$99(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, i);
        return calendar.getDisplayName(2, 1, Locale.getDefault());
    }

    public static void lambda$createDatePickerDialog$101(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$103(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$104(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DatePickerDelegate datePickerDelegate, AlertDialog alertDialog, int i) {
        if (z) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
        datePickerDelegate.didSelectDate(numberPicker3.getValue(), numberPicker2.getValue(), numberPicker.getValue());
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        return checkScheduleDate(textView, textView2, 0L, 0L, i, numberPicker, numberPicker2, numberPicker3);
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        return checkScheduleDate(textView, textView2, 0L, j, i, numberPicker, numberPicker2, numberPicker3);
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        int i2;
        long timeInMillis;
        int i3;
        int days;
        int i4;
        NumberPicker numberPicker4;
        int i5;
        char c;
        String pluralString;
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        int value3 = numberPicker3.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i6 = calendar.get(1);
        calendar.get(6);
        if (j2 > 0) {
            i2 = i6;
            long j3 = j2 * 1000;
            calendar.setTimeInMillis(jCurrentTimeMillis + j3);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            days = (int) TimeUnit.MILLISECONDS.toDays(j3);
            timeInMillis = calendar.getTimeInMillis();
            i3 = 23;
            i4 = 59;
        } else {
            i2 = i6;
            timeInMillis = j2;
            i3 = 0;
            days = 0;
            i4 = 0;
        }
        long millis = j > 0 ? TimeUnit.SECONDS.toMillis(j) : 60000L;
        long j4 = jCurrentTimeMillis + millis;
        calendar.setTimeInMillis(j4);
        int i7 = calendar.get(11);
        int i8 = calendar.get(12);
        calendar.setTimeInMillis(System.currentTimeMillis() + (value * 86400000));
        calendar.set(11, value2);
        calendar.set(12, value3);
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis2);
        numberPicker.setMinValue(0);
        if (timeInMillis > 0) {
            numberPicker.setMaxValue(days);
        }
        int value4 = numberPicker.getValue();
        long j5 = millis;
        numberPicker2.setMinValue(value4 == 0 ? i7 : 0);
        if (timeInMillis > 0) {
            numberPicker2.setMaxValue(value4 == days ? i3 : 23);
        }
        int value5 = numberPicker2.getValue();
        if (value4 == 0 && value5 == i7) {
            numberPicker4 = numberPicker3;
            i5 = i8;
        } else {
            numberPicker4 = numberPicker3;
            i5 = 0;
        }
        numberPicker4.setMinValue(i5);
        if (timeInMillis > 0) {
            numberPicker4.setMaxValue((value4 == days && value5 == i3) ? i4 : 59);
        }
        int value6 = numberPicker3.getValue();
        if (timeInMillis2 <= j4) {
            calendar.setTimeInMillis(j4);
        } else if (timeInMillis > 0 && timeInMillis2 > timeInMillis) {
            calendar.setTimeInMillis(timeInMillis);
        }
        int i9 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis() + (value4 * 86400000));
        calendar.set(11, value5);
        calendar.set(12, value6);
        long timeInMillis3 = calendar.getTimeInMillis();
        if (textView != null) {
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((value4 == 0 ? 0 : i2 == i9 ? 1 : 2) + (i * 3)).format(timeInMillis3));
        }
        if (textView2 != null) {
            int i10 = (int) ((timeInMillis3 - jCurrentTimeMillis) / 1000);
            if (i10 > 86400) {
                c = 0;
                pluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i10 / 86400.0f), new Object[0]);
            } else {
                c = 0;
                if (i10 >= 3600) {
                    pluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i10 / 3600.0f), new Object[0]);
                } else if (i10 >= 60) {
                    pluralString = LocaleController.formatPluralString("MinutesSchedule", Math.round(i10 / 60.0f), new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("SecondsSchedule", i10, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i11 = R.string.VoipChannelScheduleInfo;
                Object[] objArr = new Object[1];
                objArr[c] = pluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i11, objArr));
            } else {
                int i12 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[c] = pluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i12, objArr2));
            }
        }
        return timeInMillis2 - jCurrentTimeMillis > j5;
    }

    public static long checkFormattedDateInput(ButtonWithCounterView buttonWithCounterView, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i = 1;
        int i2 = calendar.get(1);
        int value = ((numberPicker2.getValue() - 120) / 12) + i2;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (numberPicker2.getValue() - 120) % 12);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(calendar.getActualMaximum(5));
        int value2 = numberPicker.getValue();
        int value3 = numberPicker3.getValue();
        int value4 = numberPicker4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (buttonWithCounterView != null) {
            if (value2 == 0) {
                i = 0;
            } else if (i2 != value) {
                i = 2;
            }
            buttonWithCounterView.setText(LocaleController.getInstance().getFormatterScheduleSend(i + 9).format(timeInMillis));
        }
        return timeInMillis;
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
            this(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(Theme.key_dialogTextBlack), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(Theme.key_dialogBackground), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_sheet_other) : Theme.getColor(Theme.key_sheet_other), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector) : Theme.getColor(Theme.key_player_actionBarSelector), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem) : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground) : Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_listSelector) : Theme.getColor(Theme.key_listSelector), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(Theme.key_featuredStickers_buttonText), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(Theme.key_featuredStickers_addButton), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed) : Theme.getColor(Theme.key_featuredStickers_addButtonPressed));
        }

        public ScheduleDatePickerColors(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this(i, i2, i3, i4, i5, i6, i7, Theme.getColor(Theme.key_featuredStickers_buttonText), Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed));
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

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        return createScheduleDatePickerDialog(context, j, -1L, scheduleDatePickerDelegate, (Runnable) null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, (Runnable) null, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, ScheduleDatePickerColors scheduleDatePickerColors) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, null, scheduleDatePickerColors, null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, -1L, 0, scheduleDatePickerDelegate, runnable, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, String str, long j, long j2, boolean z, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable) {
        return createScheduleDatePickerDialog(context, str, j, j2, 0, z, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(), null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable) {
        return createScheduleDatePickerDialog(context, j, j2, 0, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(), null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, i, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, i, false, scheduleDatePickerDelegate, runnable, scheduleDatePickerColors, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, int i, boolean z, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, null, j, j2, i, z, scheduleDatePickerDelegate, runnable, scheduleDatePickerColors, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, final String str, final long j, long j2, int i, boolean z, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, final ScheduleDatePickerColors scheduleDatePickerColors, final Theme.ResourcesProvider resourcesProvider) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        NumberPicker numberPicker;
        NumberPicker numberPicker2;
        final BottomSheet.Builder builder;
        NumberPicker numberPicker3;
        char c;
        int i2;
        final int[] iArr;
        String[] strArr;
        ScheduleDatePickerColors scheduleDatePickerColors2;
        Calendar calendar;
        int i3;
        TextView textView;
        Runnable runnable2;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        FrameLayout frameLayout3 = null;
        if (context == null) {
            return null;
        }
        final int[] iArr2 = {i};
        final long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        builder2.setApplyBottomPadding(false);
        final NumberPicker numberPicker4 = new NumberPicker(context, resourcesProvider);
        numberPicker4.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker4.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker4.setItemCount(5);
        final NumberPicker numberPicker5 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Hours", i4, new Object[0]);
            }
        };
        numberPicker5.setWrapSelectorWheel(true);
        numberPicker5.setAllItemsCount(24);
        numberPicker5.setItemCount(5);
        numberPicker5.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker5.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker6 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i4) {
                return LocaleController.formatPluralString("Minutes", i4, new Object[0]);
            }
        };
        numberPicker6.setWrapSelectorWheel(true);
        numberPicker6.setAllItemsCount(60);
        numberPicker6.setItemCount(5);
        numberPicker6.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker6.setTextOffset(-AndroidUtilities.dp(34.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i4, int i5) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
                int i6 = point.x > point.y ? 3 : 5;
                numberPicker4.setItemCount(i6);
                numberPicker5.setItemCount(i6);
                numberPicker6.setItemCount(i6);
                numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                numberPicker5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                numberPicker6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i6;
                this.ignoreLayout = false;
                super.onMeasure(i4, i5);
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
        frameLayout4.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        linearLayout.addView(frameLayout6, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView2 = new TextView(context);
        if (!TextUtils.isEmpty(str)) {
            textView2.setText(str);
        } else if (j == clientUserId) {
            textView2.setText(LocaleController.getString(R.string.SetReminder));
        } else {
            textView2.setText(LocaleController.getString(R.string.ScheduleMessage));
        }
        textView2.setTextColor(scheduleDatePickerColors.textColor);
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout6.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createScheduleDatePickerDialog$105(view, motionEvent);
            }
        });
        if (!DialogObject.isUserDialog(j) || j == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            frameLayout = frameLayout4;
            frameLayout2 = frameLayout5;
            numberPicker = numberPicker6;
            numberPicker2 = numberPicker5;
            builder = builder2;
            numberPicker3 = numberPicker4;
            c = 5;
            i2 = 60;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            frameLayout = frameLayout4;
            frameLayout2 = frameLayout5;
            i2 = 60;
            numberPicker = numberPicker6;
            numberPicker2 = numberPicker5;
            c = 5;
            numberPicker3 = numberPicker4;
            builder = builder2;
            final ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, scheduleDatePickerColors.iconColor, false, resourcesProvider);
            actionBarMenuItem.setLongClickEnabled(false);
            actionBarMenuItem.setSubMenuOpenSide(2);
            actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
            actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1));
            frameLayout6.addView(actionBarMenuItem, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            actionBarMenuItem.addSubItem(1, LocaleController.formatString("ScheduleWhenOnline", R.string.ScheduleWhenOnline, firstName));
            actionBarMenuItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$106(actionBarMenuItem, scheduleDatePickerColors, view);
                }
            });
            actionBarMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                @Override
                public final void onItemClick(int i4) {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$107(scheduleDatePickerDelegate, builder, i4);
                }
            });
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        final int i4 = calendar2.get(1);
        final TextView textView3 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        final NumberPicker numberPicker7 = numberPicker3;
        linearLayout2.addView(numberPicker7, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker7.setMinValue(0);
        numberPicker7.setMaxValue(365);
        numberPicker7.setWrapSelectorWheel(false);
        numberPicker7.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.lambda$createScheduleDatePickerDialog$108(jCurrentTimeMillis, calendar2, i4, i5);
            }
        });
        final BottomSheet.Builder builder3 = builder;
        final NumberPicker numberPicker8 = numberPicker2;
        final NumberPicker numberPicker9 = numberPicker;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker10, int i5, int i6) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$109(textView3, str, clientUserId, j, numberPicker7, numberPicker8, numberPicker9, numberPicker10, i5, i6);
            }
        };
        numberPicker7.setOnValueChangedListener(onValueChangeListener);
        final NumberPicker numberPicker10 = numberPicker2;
        numberPicker10.setMinValue(0);
        numberPicker10.setMaxValue(23);
        linearLayout2.addView(numberPicker10, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker10.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.lambda$createScheduleDatePickerDialog$110(i5);
            }
        });
        numberPicker10.setOnValueChangedListener(onValueChangeListener);
        final NumberPicker numberPicker11 = numberPicker;
        numberPicker11.setMinValue(0);
        numberPicker11.setMaxValue(59);
        numberPicker11.setValue(0);
        numberPicker11.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.lambda$createScheduleDatePickerDialog$111(i5);
            }
        });
        linearLayout2.addView(numberPicker11, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker11.setOnValueChangedListener(onValueChangeListener);
        if (j2 > 0 && j2 != 2147483646) {
            long j3 = 1000 * j2;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j3);
            if (timeInMillis >= 0) {
                numberPicker11.setValue(calendar2.get(12));
                numberPicker10.setValue(calendar2.get(11));
                numberPicker7.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        checkScheduleDate(textView3, null, str != null ? 3 : clientUserId == j ? 1 : 0, numberPicker7, numberPicker10, numberPicker11);
        boolean zIsTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (zIsTestBackend) {
            int[] iArr3 = new int[10];
            iArr3[0] = 0;
            iArr3[1] = i2;
            iArr3[2] = 300;
            iArr3[3] = 86400;
            iArr3[4] = 604800;
            iArr3[c] = 1209600;
            iArr3[6] = 2592000;
            iArr3[7] = 7862400;
            iArr3[8] = 15724800;
            iArr3[9] = 31536000;
            iArr = iArr3;
        } else {
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[2] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[c] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
        }
        if (zIsTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[c] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[8] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[9] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[8];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[c] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        final String[] strArr2 = strArr;
        if (z) {
            scheduleDatePickerColors2 = scheduleDatePickerColors;
            calendar = calendar2;
            i3 = 17;
            textView = null;
            runnable2 = null;
        } else {
            FrameLayout frameLayout7 = new FrameLayout(context);
            scheduleDatePickerColors2 = scheduleDatePickerColors;
            int i5 = scheduleDatePickerColors2.textColor;
            int iBlendOver = Theme.blendOver(scheduleDatePickerColors2.backgroundColor, Theme.multAlpha(i5, 0.075f));
            int iMultAlpha = Theme.multAlpha(scheduleDatePickerColors2.textColor, 0.1f);
            final TextView textView4 = new TextView(context);
            calendar = calendar2;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i5);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(14.0f), iBlendOver, Theme.blendOver(iBlendOver, iMultAlpha)));
            i3 = 17;
            textView4.setGravity(17);
            Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$112(iArr, iArr2, strArr2, textView4);
                }
            };
            runnable3.run();
            frameLayout7.addView(textView4, LayoutHelper.createFrame(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            linearLayout.addView(frameLayout7, LayoutHelper.createLinear(-1, -2));
            frameLayout3 = frameLayout7;
            runnable2 = runnable3;
            textView = textView4;
        }
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(i3);
        textView3.setTextColor(scheduleDatePickerColors2.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors2.buttonBackgroundColor, 24.0f));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        final int[] iArr4 = iArr;
        final Calendar calendar3 = calendar;
        TextView textView5 = textView;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$113(zArr, str, clientUserId, j, numberPicker7, numberPicker10, numberPicker11, calendar3, scheduleDatePickerDelegate, iArr2, builder3, view);
            }
        });
        builder3.setCustomView(frameLayout);
        final BottomSheet bottomSheetShow = builder3.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$114(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        if (textView5 != null) {
            final FrameLayout frameLayout8 = frameLayout2;
            final FrameLayout frameLayout9 = frameLayout3;
            final Runnable runnable4 = runnable2;
            textView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$117(frameLayout8, resourcesProvider, bottomSheetShow, frameLayout9, iArr4, strArr2, iArr2, runnable4, view);
                }
            });
        }
        return builder3;
    }

    public static void lambda$createScheduleDatePickerDialog$106(ActionBarMenuItem actionBarMenuItem, ScheduleDatePickerColors scheduleDatePickerColors, View view) {
        actionBarMenuItem.toggleSubMenu();
        actionBarMenuItem.setPopupItemsColor(scheduleDatePickerColors.subMenuTextColor, false);
        actionBarMenuItem.setupPopupRadialSelectors(scheduleDatePickerColors.subMenuSelectorColor);
        actionBarMenuItem.redrawPopup(scheduleDatePickerColors.subMenuBackgroundColor);
    }

    public static void lambda$createScheduleDatePickerDialog$107(ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, int i) {
        if (i == 1) {
            scheduleDatePickerDelegate.didSelectDate(true, 2147483646, 0);
            builder.getDismissRunnable().run();
        }
    }

    public static String lambda$createScheduleDatePickerDialog$108(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().getFormatterWeek().format(j2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(j2);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
    }

    public static void lambda$createScheduleDatePickerDialog$109(TextView textView, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        checkScheduleDate(textView, null, str != null ? 3 : j == j2 ? 1 : 0, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createScheduleDatePickerDialog$110(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createScheduleDatePickerDialog$111(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createScheduleDatePickerDialog$112(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                break;
            }
            if (iArr2[0] == iArr[i]) {
                spannableStringBuilder.append((CharSequence) strArr[i]);
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                break;
            }
            i++;
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

    public static void lambda$createScheduleDatePickerDialog$113(boolean[] zArr, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, int[] iArr, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        boolean zCheckScheduleDate = checkScheduleDate(null, null, str != null ? 3 : j == j2 ? 1 : 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 86400000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), iArr[0]);
        builder.getDismissRunnable().run();
    }

    public static void lambda$createScheduleDatePickerDialog$114(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void lambda$createScheduleDatePickerDialog$117(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet, FrameLayout frameLayout2, int[] iArr, String[] strArr, final int[] iArr2, final Runnable runnable, View view) {
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$115();
                }
            })).show();
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, resourcesProvider, frameLayout2);
        for (int i = 0; i < iArr.length; i++) {
            final int i2 = iArr[i];
            itemOptionsMakeOptions.add(strArr[i], new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$116(iArr2, i2, runnable);
                }
            });
        }
        itemOptionsMakeOptions.setGravity(1);
        itemOptionsMakeOptions.show();
    }

    public static void lambda$createScheduleDatePickerDialog$115() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(new PremiumPreviewFragment("schedule_repeat"), bottomSheetParams);
    }

    public static void lambda$createScheduleDatePickerDialog$116(int[] iArr, int i, Runnable runnable) {
        iArr[0] = i;
        runnable.run();
    }

    public static BottomSheet.Builder createDatePickerDialog(Context context, String str, String str2, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        LinearLayout linearLayout;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createDatePickerDialog$118(view, motionEvent);
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        final int i = calendar.get(1);
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout3.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createDatePickerDialog$119(jCurrentTimeMillis, calendar, i, i2);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i2, int i3) {
                AlertsCreator.checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createDatePickerDialog$121(i2);
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createDatePickerDialog$122(i2);
            }
        });
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            linearLayout = linearLayout2;
        } else {
            long j2 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            linearLayout = linearLayout2;
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
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(str2);
        LinearLayout linearLayout4 = linearLayout;
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createDatePickerDialog$123(numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout4);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createDatePickerDialog$119(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().getFormatterScheduleDay().format(j2);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
    }

    public static String lambda$createDatePickerDialog$121(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createDatePickerDialog$122(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createDatePickerDialog$123(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        boolean zCheckScheduleDate = checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 86400000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createBirthdayPickerDialog(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, final Utilities.Callback callback, Runnable runnable, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        int i;
        BottomSheet.Builder builder;
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        builder2.setApplyBottomPadding(false);
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
            protected void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createBirthdayPickerDialog$124(view, motionEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        final int i3 = calendar.get(5);
        final int i4 = calendar.get(2);
        final int i5 = calendar.get(1);
        final int i6 = i5 + 1;
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createBirthdayPickerDialog$125(numberPicker3, i6, numberPicker, numberPicker2, i5, i4, i3);
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i7) {
                return AlertsCreator.lambda$createBirthdayPickerDialog$126(i7);
            }
        });
        NumberPicker.OnScrollListener onScrollListener = new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i7) {
                AlertsCreator.lambda$createBirthdayPickerDialog$127(runnable2, numberPicker4, i7);
            }
        };
        numberPicker.setOnScrollListener(onScrollListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i7) {
                return AlertsCreator.lambda$createBirthdayPickerDialog$128(i7);
            }
        });
        numberPicker2.setOnScrollListener(onScrollListener);
        numberPicker3.setMinValue(i2);
        numberPicker3.setMaxValue(i6);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i7) {
                return AlertsCreator.lambda$createBirthdayPickerDialog$129(i6, i7);
            }
        });
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker3.setOnScrollListener(onScrollListener);
        if (tL_birthday != null) {
            numberPicker.setValue(tL_birthday.day);
            numberPicker2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                numberPicker3.setValue(tL_birthday.year);
            } else {
                numberPicker3.setValue(i6);
            }
        } else {
            numberPicker.setValue(calendar.get(5));
            numberPicker2.setValue(calendar.get(2));
            numberPicker3.setValue(i6);
        }
        runnable2.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            i = 17;
            linksTextView.setGravity(17);
            frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-2, -2, 17));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            final int i7 = UserConfig.selectedAccount;
            final Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$createBirthdayPickerDialog$131(i7, linksTextView);
                }
            };
            runnable3.run();
            NotificationCenter.getInstance(i7).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    runnable3.run();
                }
            });
            ContactsController.getInstance(i7).loadPrivacySettings();
        } else {
            i = 17;
        }
        if (z) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.DateOfBirthHideYear), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createBirthdayPickerDialog$133(numberPicker3, i6, runnable2, view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(i);
        textView2.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider)));
        ScaleStateListAnimator.apply(textView2);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, z ? 0 : 15, 16, z2 ? 0 : 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createBirthdayPickerDialog$134(numberPicker, numberPicker2, numberPicker3, i6, builder2, callback, view);
            }
        });
        if (z2) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.BirthdayRemove), false);
            final BottomSheet.Builder builder3 = builder2;
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createBirthdayPickerDialog$135(builder3, callback, view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 83, 16, 4, 16, 16));
            builder = builder3;
        } else {
            builder = builder2;
        }
        builder.setCustomView(linearLayout);
        return builder;
    }

    public static void lambda$createBirthdayPickerDialog$125(NumberPicker numberPicker, int i, NumberPicker numberPicker2, NumberPicker numberPicker3, int i2, int i3, int i4) {
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
        if (numberPicker.getValue() == i2) {
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
                return;
            } catch (Exception e2) {
                FileLog.e(e2);
                numberPicker2.setMaxValue(31);
                return;
            }
        }
        numberPicker2.setMinValue(1);
        try {
            numberPicker2.setMaxValue(YearMonth.of(numberPicker.getValue(), numberPicker3.getValue() + 1).lengthOfMonth());
        } catch (Exception e3) {
            FileLog.e(e3);
            numberPicker2.setMaxValue(31);
        }
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(11);
    }

    public static String lambda$createBirthdayPickerDialog$126(int i) {
        return "" + i;
    }

    public static void lambda$createBirthdayPickerDialog$127(Runnable runnable, NumberPicker numberPicker, int i) {
        if (i == 0) {
            runnable.run();
        }
    }

    public static String lambda$createBirthdayPickerDialog$128(int i) {
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

    public static String lambda$createBirthdayPickerDialog$129(int i, int i2) {
        return i2 == i ? "—" : String.format("%02d", Integer.valueOf(i2));
    }

    public static void lambda$createBirthdayPickerDialog$131(int i, LinkSpanDrawable.LinksTextView linksTextView) {
        final ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i).getPrivacyRules(11);
        String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
        if (privacyRules != null && !privacyRules.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 >= privacyRules.size()) {
                    break;
                }
                if (privacyRules.get(i2) instanceof TLRPC.TL_privacyValueAllowContacts) {
                    string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                    break;
                }
                if ((privacyRules.get(i2) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i2) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                }
                i2++;
            }
        }
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createBirthdayPickerDialog$130(privacyRules);
            }
        }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
    }

    public static void lambda$createBirthdayPickerDialog$130(ArrayList arrayList) {
        BaseFragment lastFragment;
        if (arrayList == null || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public static void lambda$createBirthdayPickerDialog$133(NumberPicker numberPicker, int i, Runnable runnable, View view) {
        numberPicker.setValue(i);
        runnable.run();
    }

    public static void lambda$createBirthdayPickerDialog$134(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i, BottomSheet.Builder builder, Utilities.Callback callback, View view) {
        TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
        tL_birthday.day = numberPicker.getValue();
        tL_birthday.month = numberPicker2.getValue() + 1;
        if (numberPicker3.getValue() != i) {
            tL_birthday.flags |= 1;
            tL_birthday.year = numberPicker3.getValue();
        }
        builder.getDismissRunnable().run();
        callback.run(tL_birthday);
    }

    public static void lambda$createBirthdayPickerDialog$135(BottomSheet.Builder builder, Utilities.Callback callback, View view) {
        builder.getDismissRunnable().run();
        callback.run(null);
    }

    public static BottomSheet.Builder createFormattedDatePickerDialog(Context context, final FormattedDatePickerDelegate formattedDatePickerDelegate, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        final int i = calendar.get(1);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$136(i2);
            }
        });
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker2.setItemCount(5);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(239);
        numberPicker2.setValue(120);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$137(calendar, i, i2);
            }
        });
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setContentDescriptionCallback(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$138((Integer) obj);
            }
        });
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(24);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(23);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$139(i2);
            }
        });
        final NumberPicker numberPicker4 = new NumberPicker(context, resourcesProvider);
        numberPicker4.setContentDescriptionCallback(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$140((Integer) obj);
            }
        });
        numberPicker4.setWrapSelectorWheel(true);
        numberPicker4.setAllItemsCount(60);
        numberPicker4.setItemCount(5);
        numberPicker4.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker4.setTextOffset(-AndroidUtilities.dp(10.0f));
        numberPicker4.setMinValue(0);
        numberPicker4.setMaxValue(59);
        numberPicker4.setValue(0);
        numberPicker4.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$141(i2);
            }
        });
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
            protected void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
                int i4 = point.x > point.y ? 3 : 5;
                numberPicker2.setItemCount(i4);
                numberPicker.setItemCount(i4);
                numberPicker3.setItemCount(i4);
                numberPicker4.setItemCount(i4);
                numberPicker2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                numberPicker3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
                numberPicker4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i4;
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
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createFormattedDatePickerDialog$142(view, motionEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                color.draw(canvas, numberPicker4.getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f);
            }
        };
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker5, int i2, int i3) {
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
        final boolean[] zArr = {true};
        final int[] iArr = new int[1];
        buttonWithCounterView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        buttonWithCounterView.setRound();
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createFormattedDatePickerDialog$145(zArr, numberPicker, numberPicker2, numberPicker3, numberPicker4, formattedDatePickerDelegate, iArr, builder, view);
            }
        });
        builder.setCustomView(frameLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createFormattedDatePickerDialog$146(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        checkFormattedDateInput(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
        return builder;
    }

    public static String lambda$createFormattedDatePickerDialog$136(int i) {
        return "" + i;
    }

    public static String lambda$createFormattedDatePickerDialog$137(Calendar calendar, int i, int i2) {
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, 0);
        calendar.add(2, i2 - 120);
        if (calendar.get(1) == i) {
            switch (i2 % 12) {
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
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    public static CharSequence lambda$createFormattedDatePickerDialog$138(Integer num) {
        return LocaleController.formatPluralString("Hours", num.intValue(), new Object[0]);
    }

    public static String lambda$createFormattedDatePickerDialog$139(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static CharSequence lambda$createFormattedDatePickerDialog$140(Integer num) {
        return LocaleController.formatPluralString("Minutes", num.intValue(), new Object[0]);
    }

    public static String lambda$createFormattedDatePickerDialog$141(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createFormattedDatePickerDialog$145(boolean[] zArr, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, FormattedDatePickerDelegate formattedDatePickerDelegate, int[] iArr, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        formattedDatePickerDelegate.didSelectDate((int) (checkFormattedDateInput(null, numberPicker, numberPicker2, numberPicker3, numberPicker4) / 1000), iArr[0]);
        builder.getDismissRunnable().run();
    }

    public static void lambda$createFormattedDatePickerDialog$146(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static BottomSheet.Builder createStatusUntilDatePickerDialog(Context context, long j, final StatusUntilDatePickerDelegate statusUntilDatePickerDelegate) {
        LinearLayout linearLayout;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$147(view, motionEvent);
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        final int i = calendar.get(1);
        final int i2 = calendar.get(6);
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout3.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$148(jCurrentTimeMillis, calendar, i, i2, i3);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i3, int i4) {
                AlertsCreator.checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$150(i3);
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$151(i3);
            }
        });
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            linearLayout = linearLayout2;
        } else {
            long j2 = 1000 * j;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            linearLayout = linearLayout2;
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
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
        LinearLayout linearLayout4 = linearLayout;
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createStatusUntilDatePickerDialog$152(numberPicker, numberPicker2, numberPicker3, calendar, statusUntilDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout4);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createStatusUntilDatePickerDialog$148(long j, Calendar calendar, int i, int i2, int i3) {
        if (i3 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = j + (i3 * 86400000);
        calendar.setTimeInMillis(j2);
        int i4 = calendar.get(1);
        int i5 = calendar.get(6);
        if (i4 != i || i5 >= i2 + 7) {
            if (i4 == i) {
                return LocaleController.getInstance().getFormatterScheduleDay().format(j2);
            }
            return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
        }
        return LocaleController.getInstance().getFormatterWeek().format(j2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(j2);
    }

    public static String lambda$createStatusUntilDatePickerDialog$150(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createStatusUntilDatePickerDialog$151(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createStatusUntilDatePickerDialog$152(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, StatusUntilDatePickerDelegate statusUntilDatePickerDelegate, BottomSheet.Builder builder, View view) {
        boolean zCheckScheduleDate = checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 86400000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        statusUntilDatePickerDelegate.didSelectDate((int) (calendar.getTimeInMillis() / 1000));
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createAutoDeleteDatePickerDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        boolean z = false;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i2) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
                }
                if (i3 < 10080) {
                    return LocaleController.formatPluralString("Days", i3 / 1440, new Object[0]);
                }
                if (i3 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i3 / 1440, new Object[0]);
                }
                if (i3 < 525600) {
                    return LocaleController.formatPluralString("Months", i3 / 10080, new Object[0]);
                }
                return LocaleController.formatPluralString("Years", ((i3 * 5) / 31) * 1440, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createAutoDeleteDatePickerDialog$153(iArr, i2);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        boolean z2 = true;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createAutoDeleteDatePickerDialog$154(view, motionEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final AnimatedTextView animatedTextView = new AnimatedTextView(context, z2, z2, z) {
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
        animatedTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        animatedTextView.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker2, int i2, int i3) {
                AlertsCreator.lambda$createAutoDeleteDatePickerDialog$155(animatedTextView, numberPicker2, i2, i3);
            }
        });
        animatedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createAutoDeleteDatePickerDialog$156(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createAutoDeleteDatePickerDialog$153(int[] iArr, int i) {
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
        if (i2 < 525600) {
            return LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
    }

    public static void lambda$createAutoDeleteDatePickerDialog$155(AnimatedTextView animatedTextView, NumberPicker numberPicker, int i, int i2) {
        try {
            if (i2 == 0) {
                animatedTextView.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    public static void lambda$createAutoDeleteDatePickerDialog$156(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()], 0);
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createSoundFrequencyPickerDialog(Context context, int i, int i2, final SoundFrequencyDelegate soundFrequencyDelegate, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(i - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$157(i3);
            }
        });
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1, new Object[0]);
            }
        };
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(10);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setValue((i2 / 60) - 1);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$158(i3);
            }
        });
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(0);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setValue(0);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$159(i3);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$160(view, motionEvent);
            }
        });
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
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i3, int i4) {
                AlertsCreator.lambda$createSoundFrequencyPickerDialog$161(numberPicker4, i3, i4);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createSoundFrequencyPickerDialog$162(numberPicker, numberPicker2, soundFrequencyDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createSoundFrequencyPickerDialog$157(int i) {
        return LocaleController.formatPluralString("Times", i + 1, new Object[0]);
    }

    public static String lambda$createSoundFrequencyPickerDialog$158(int i) {
        return LocaleController.formatPluralString("Minutes", i + 1, new Object[0]);
    }

    public static String lambda$createSoundFrequencyPickerDialog$159(int i) {
        return LocaleController.getString(R.string.NotificationsFrequencyDivider);
    }

    public static void lambda$createSoundFrequencyPickerDialog$162(NumberPicker numberPicker, NumberPicker numberPicker2, SoundFrequencyDelegate soundFrequencyDelegate, BottomSheet.Builder builder, View view) {
        soundFrequencyDelegate.didSelectValues(numberPicker.getValue() + 1, (numberPicker2.getValue() + 1) * 60);
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createMuteForPickerDialog(Context context, Theme.ResourcesProvider resourcesProvider, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i) {
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
                if (i2 < 525600) {
                    return LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]);
                }
                return LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return AlertsCreator.lambda$createMuteForPickerDialog$163(iArr, i);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i3;
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
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createMuteForPickerDialog$164(view, motionEvent);
            }
        });
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
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker2, int i, int i2) {
                AlertsCreator.lambda$createMuteForPickerDialog$165(numberPicker2, i, i2);
            }
        });
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createMuteForPickerDialog$166(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createMuteForPickerDialog$163(int[] iArr, int i) {
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
        if (i2 < 525600) {
            return LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
    }

    public static void lambda$createMuteForPickerDialog$166(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()] * 60, 0);
        builder.getDismissRunnable().run();
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

    public static BottomSheet.Builder createCalendarPickerDialog(Context context, final long j, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
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
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createCalendarPickerDialog$167(view, motionEvent);
            }
        });
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return AlertsCreator.lambda$createCalendarPickerDialog$168(i);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                AlertsCreator.checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return AlertsCreator.lambda$createCalendarPickerDialog$170(i);
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i2);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createCalendarPickerDialog$171(i3);
            }
        });
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
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createCalendarPickerDialog$172(j, numberPicker, numberPicker2, numberPicker3, calendar, intCallback, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        return builder;
    }

    public static String lambda$createCalendarPickerDialog$168(int i) {
        return "" + i;
    }

    public static String lambda$createCalendarPickerDialog$170(int i) {
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

    public static String lambda$createCalendarPickerDialog$171(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createCalendarPickerDialog$172(long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, MessagesStorage.IntCallback intCallback, BottomSheet.Builder builder, View view) {
        checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
        calendar.set(1, numberPicker3.getValue());
        calendar.set(2, numberPicker2.getValue());
        calendar.set(5, numberPicker.getValue());
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(13, 0);
        intCallback.run((int) (calendar.getTimeInMillis() / 1000));
        builder.getDismissRunnable().run();
    }

    public static BottomSheet createMuteAlert(final BaseFragment baseFragment, final long j, final long j2, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(baseFragment.getParentActivity(), false, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.Notifications), true);
        int i = R.string.MuteFor;
        builder.setItems(new CharSequence[]{LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", i, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createMuteAlert$173(j, j2, baseFragment, resourcesProvider, dialogInterface, i2);
            }
        });
        return builder.create();
    }

    public static void lambda$createMuteAlert$173(long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                }
            }
        }
        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j, j2, i2);
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, i2, 0, resourcesProvider).show();
        }
    }

    public static BottomSheet createMuteAlert(final BaseFragment baseFragment, final ArrayList arrayList, final int i, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(baseFragment.getParentActivity(), false, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.Notifications), true);
        int i2 = R.string.MuteFor;
        builder.setItems(new CharSequence[]{LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", i2, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AlertsCreator.lambda$createMuteAlert$174(arrayList, i, baseFragment, resourcesProvider, dialogInterface, i3);
            }
        });
        return builder.create();
    }

    public static void lambda$createMuteAlert$174(ArrayList arrayList, int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i2) {
        int i3;
        if (i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                }
            }
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

    public static void createReportPhotoAlert(final int i, final Context context, final long j, final TLRPC.Photo photo, final Theme.ResourcesProvider resourcesProvider) {
        if (context == null || photo == null) {
            return;
        }
        final Utilities.Callback2 callback2 = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AlertsCreator.lambda$createReportPhotoAlert$175(i, j, photo, context, resourcesProvider, (Integer) obj, (String) obj2);
            }
        };
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ReportProfilePhoto), true);
        final int[] iArr = {0, 6, 1, 2, 3, 4, 5, 100};
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)}, new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createReportPhotoAlert$176(iArr, context, resourcesProvider, callback2, dialogInterface, i2);
            }
        });
        builder.show();
    }

    public static void lambda$createReportPhotoAlert$175(int i, long j, TLRPC.Photo photo, Context context, Theme.ResourcesProvider resourcesProvider, Integer num, String str) {
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

    public static void lambda$createReportPhotoAlert$176(int[] iArr, Context context, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback2 callback2, DialogInterface dialogInterface, int i) {
        int i2 = iArr[i];
        if (i2 == 100) {
            new ReportAlert(context, i2, resourcesProvider) {
                @Override
                protected void onSend(int i3, String str) {
                    callback2.run(Integer.valueOf(i3), str);
                }
            }.show();
        } else {
            callback2.run(Integer.valueOf(i2), "");
        }
    }

    private static String getFloodWaitString(String str) {
        String pluralString;
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        if (iIntValue < 60) {
            pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
        } else {
            pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
        }
        return LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString);
    }

    public static void showFloodWaitAlert(String str, BaseFragment baseFragment) {
        String pluralString;
        if (str == null || !str.startsWith("FLOOD_WAIT") || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        if (iIntValue < 60) {
            pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
        } else {
            pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(builder.create(), true, null);
    }

    public static void showSendMediaAlert(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (i == 0 || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), resourcesProvider);
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

    public static void showAddUserAlert(String str, final BaseFragment baseFragment, boolean z, TLObject tLObject) {
        AlertDialog.Builder builder;
        if (str == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
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
            case "USER_RESTRICTED":
                builder.setMessage(LocaleController.getString(R.string.UserRestricted));
                break;
            case "PEER_FLOOD":
                builder.setMessage(LocaleController.getString(R.string.NobodyLikesSpam2));
                builder.setNegativeButton(LocaleController.getString(R.string.MoreInfo), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        AlertsCreator.lambda$showAddUserAlert$177(baseFragment, alertDialog, i);
                    }
                });
                break;
            case "BOTS_TOO_MUCH":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserCantBot));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserCantBot));
                    break;
                }
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                    builder.setMessage(LocaleController.getString(R.string.AddUserErrorBlacklisted));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.AddAdminErrorBlacklisted));
                    break;
                }
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
            case "ADMINS_TOO_MUCH":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelUserCantAdmin));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.GroupUserCantAdmin));
                    break;
                }
            case "CHANNELS_TOO_MUCH":
                builder.setTitle(LocaleController.getString(R.string.ChannelTooMuchTitle));
                if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                    builder.setMessage(LocaleController.getString(R.string.ChannelTooMuch));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ChannelTooMuchJoin));
                    break;
                }
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
            case "CHAT_ADMIN_INVITE_REQUIRED":
                builder.setMessage(LocaleController.getString(R.string.AddAdminErrorNotAMember));
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (z) {
                    builder.setMessage(LocaleController.getString(R.string.InviteToChannelError));
                    break;
                } else {
                    builder.setMessage(LocaleController.getString(R.string.InviteToGroupError));
                    break;
                }
            case "USER_ALREADY_PARTICIPANT":
                builder.setTitle(LocaleController.getString(R.string.VoipGroupVoiceChat));
                builder.setMessage(LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant));
                break;
            default:
                builder.setMessage(LocaleController.getString(R.string.ErrorOccurred) + "\n" + str);
                break;
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(builder.create(), true, null);
    }

    public static void lambda$showAddUserAlert$177(BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        MessagesController.getInstance(baseFragment.getCurrentAccount()).openByUserName("spambot", baseFragment, 1);
    }

    public static Dialog createColorSelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createColorSelectDialog(activity, j, i, i2, runnable, null);
    }

    public static Dialog createColorSelectDialog(Activity activity, final long j, final long j2, final int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i2 = notificationsSettings.getInt("color_" + sharedPrefKey, -16776961);
            } else if (DialogObject.isChatDialog(j)) {
                i2 = notificationsSettings.getInt("GroupLed", -16776961);
            } else {
                i2 = notificationsSettings.getInt("MessagesLed", -16776961);
            }
        } else if (i == 1) {
            i2 = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 0) {
            i2 = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i == 3) {
            i2 = notificationsSettings.getInt("StoriesLed", -16776961);
        } else if (i == 5 || i == 4) {
            i2 = notificationsSettings.getInt("ReactionsLed", -16776961);
        } else {
            i2 = notificationsSettings.getInt("ChannelLed", -16776961);
        }
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i2};
        int i4 = 0;
        while (i4 < 9) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            int i5 = i3;
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i4));
            int i6 = TextColorCell.colors[i4];
            radioColorCell.setCheckColor(i6, i6);
            radioColorCell.setTextAndValue(strArr[i4], i2 == TextColorCell.colorsToSave[i4]);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createColorSelectDialog$178(linearLayout, iArr, view);
                }
            });
            i4++;
            i3 = i5;
        }
        int i7 = i3;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.LedColor));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i8) {
                AlertsCreator.lambda$createColorSelectDialog$179(j, sharedPrefKey, iArr, j2, i, runnable, alertDialog, i8);
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.LedDisabled), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i8) {
                AlertsCreator.lambda$createColorSelectDialog$180(j, i, runnable, alertDialog, i8);
            }
        });
        if (i7 != 0) {
            builder.setNegativeButton(LocaleController.getString(R.string.Default), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i8) {
                    AlertsCreator.lambda$createColorSelectDialog$181(sharedPrefKey, runnable, alertDialog, i8);
                }
            });
        }
        return builder.create();
    }

    public static void lambda$createColorSelectDialog$178(LinearLayout linearLayout, int[] iArr, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioColorCell radioColorCell = (RadioColorCell) linearLayout.getChildAt(i);
            radioColorCell.setChecked(radioColorCell == view, true);
        }
        iArr[0] = TextColorCell.colorsToSave[((Integer) view.getTag()).intValue()];
    }

    public static void lambda$createColorSelectDialog$179(long j, String str, int[] iArr, long j2, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            editorEdit.putInt("color_" + str, iArr[0]);
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

    public static void lambda$createColorSelectDialog$180(long j, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
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

    public static void lambda$createColorSelectDialog$181(String str, Runnable runnable, AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        editorEdit.remove("color_" + str);
        editorEdit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, long j2, boolean z, boolean z2, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String str;
        if (j != 0) {
            str = "vibrate_" + j;
        } else {
            str = z ? "vibrate_group" : "vibrate_messages";
        }
        return createVibrationSelectDialog(activity, j, j2, str, runnable, resourcesProvider);
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, long j2, String str, Runnable runnable) {
        return createVibrationSelectDialog(activity, j, j2, str, runnable, null);
    }

    public static Dialog createVibrationSelectDialog(Activity activity, final long j, final long j2, final String str, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        Activity activity2 = activity;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        int i = 0;
        if (j != 0) {
            int i2 = notificationsSettings.getInt(str, 0);
            iArr[0] = i2;
            if (i2 == 3) {
                iArr[0] = 2;
            } else if (i2 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i3 = notificationsSettings.getInt(str, 0);
            iArr[0] = i3;
            if (i3 == 0) {
                iArr[0] = 1;
            } else if (i3 == 1) {
                iArr[0] = 2;
            } else if (i3 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayout = new LinearLayout(activity2);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity2, resourcesProvider);
        int i4 = 0;
        while (i4 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity2, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), i, AndroidUtilities.dp(4.0f), i);
            radioColorCell.setTag(Integer.valueOf(i4));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i4], iArr[i] == i4);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createVibrationSelectDialog$182(iArr, j, str, j2, builder, runnable, view);
                }
            });
            i4++;
            linearLayout = linearLayout;
            i = 0;
            activity2 = activity;
        }
        builder.setTitle(LocaleController.getString(R.string.Vibrate));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createVibrationSelectDialog$182(int[] iArr, long j, String str, long j2, AlertDialog.Builder builder, Runnable runnable, View view) {
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

    public static Dialog createLocationUpdateDialog(Activity activity, boolean z, TLRPC.User user, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        final int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        final LinearLayout linearLayout = new LinearLayout(activity);
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
        textView.setTextColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z ? 4 : 0, 24, 8));
        int i = 0;
        while (i < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.heightDp = 42;
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i));
            radioColorCell.setCheckColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_radioBackground) : Theme.getColor(Theme.key_radioBackground), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogRadioBackgroundChecked) : Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            radioColorCell.setTextAndValue(strArr[i], iArr[0] == i);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createLocationUpdateDialog$183(iArr, linearLayout, view);
                }
            });
            i++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.LiveLocationAlertExpandTitle));
        } else {
            builder.setTopImage(new ShareLocationDrawable(activity, 0), resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTopBackground) : Theme.getColor(Theme.key_dialogTopBackground));
        }
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.ShareFile), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createLocationUpdateDialog$184(iArr, intCallback, alertDialog, i2);
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createLocationUpdateDialog$183(int[] iArr, LinearLayout linearLayout, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof RadioColorCell) {
                ((RadioColorCell) childAt).setChecked(childAt == view, true);
            }
        }
    }

    public static void lambda$createLocationUpdateDialog$184(int[] iArr, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
        int i2 = iArr[0];
        intCallback.run(i2 == 0 ? 900 : i2 == 1 ? 3600 : i2 == 2 ? 28800 : Integer.MAX_VALUE);
    }

    public static AlertDialog.Builder createBackgroundLocationPermissionDialog(final Activity activity, TLRPC.User user, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (activity == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        String res = AndroidUtilities.readRes(Theme.getCurrentTheme().isDark() ? R.raw.permission_map_dark : R.raw.permission_map);
        String res2 = AndroidUtilities.readRes(Theme.getCurrentTheme().isDark() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createBackgroundLocationPermissionDialog$185(activity, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        });
        return builder;
    }

    public static void lambda$createBackgroundLocationPermissionDialog$185(Activity activity, AlertDialog alertDialog, int i) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static AlertDialog.Builder createGigagroupConvertAlert(Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener, AlertDialog.OnButtonClickListener onButtonClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String res = AndroidUtilities.readRes(R.raw.gigagroup);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener) {
        return createDrawOverlayPermissionDialog(activity, onButtonClickListener, false);
    }

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(final Activity activity, AlertDialog.OnButtonClickListener onButtonClickListener, final boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String res = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.dp(6.0f), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle));
        builder.setMessage(LocaleController.getString(R.string.PermissionDrawAboveOtherApps));
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createDrawOverlayPermissionDialog$187(activity, z, alertDialog, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), onButtonClickListener);
        builder.setTopViewAspectRatio(0.50427353f);
        return builder;
    }

    public static void lambda$createDrawOverlayPermissionDialog$187(Activity activity, boolean z, AlertDialog alertDialog, int i) {
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

    public static AlertDialog.Builder createDrawOverlayGroupCallPermissionDialog(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        String res = AndroidUtilities.readRes(R.raw.pip_voice_request);
        final GroupCallPipButton groupCallPipButton = new GroupCallPipButton(context, 0, true);
        groupCallPipButton.setImportantForAccessibility(2);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.dp(6.0f), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        frameLayout.addView(groupCallPipButton, LayoutHelper.createFrame(117, 117.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle));
        builder.setMessage(LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall));
        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createDrawOverlayGroupCallPermissionDialog$188(context, alertDialog, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTopViewAspectRatio(0.5769231f);
        return builder;
    }

    public static void lambda$createDrawOverlayGroupCallPermissionDialog$188(Context context, AlertDialog alertDialog, int i) {
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

    public static AlertDialog.Builder createContactsPermissionDialog(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTopAnimation(R.raw.permission_request_contacts, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert)));
        builder.setPositiveButton(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                intCallback.run(1);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                intCallback.run(0);
            }
        });
        return builder;
    }

    public static Dialog createFreeSpaceDialog(final LaunchActivity launchActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
        builder.setTitle(LocaleController.getString(R.string.LowDiskSpaceTitle));
        builder.setMessage(LocaleController.getString(R.string.LowDiskSpaceMessage2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.LowDiskSpaceButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$createFreeSpaceDialog$191(launchActivity, alertDialog, i);
            }
        });
        return builder.create();
    }

    public static void lambda$createFreeSpaceDialog$191(LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
        launchActivity.lambda$runLinkRequest$99(new CacheControlActivity());
    }

    public static Dialog createPrioritySelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createPrioritySelectDialog(activity, j, i, i2, runnable, null);
    }

    public static Dialog createPrioritySelectDialog(Activity activity, final long j, final long j2, final int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        Activity activity2 = activity;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        int[] iArr = new int[1];
        int i2 = 0;
        if (j != 0) {
            int i3 = notificationsSettings.getInt("priority_" + j, 3);
            iArr[0] = i3;
            if (i3 == 3) {
                iArr[0] = 0;
            } else if (i3 == 4) {
                iArr[0] = 1;
            } else if (i3 == 5) {
                iArr[0] = 2;
            } else if (i3 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i == 4 || i == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i4 = iArr[0];
            if (i4 == 4) {
                iArr[0] = 0;
            } else if (i4 == 5) {
                iArr[0] = 1;
            } else if (i4 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayout = new LinearLayout(activity2);
        linearLayout.setOrientation(1);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity2, resourcesProvider);
        int i5 = 0;
        while (i5 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity2, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), i2, AndroidUtilities.dp(4.0f), i2);
            radioColorCell.setTag(Integer.valueOf(i5));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i5], iArr[i2] == i5);
            linearLayout.addView(radioColorCell);
            final int[] iArr2 = iArr;
            final AlertDialog.Builder builder2 = builder;
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createPrioritySelectDialog$192(iArr2, j, j2, i, notificationsSettings, builder2, runnable, view);
                }
            });
            i5++;
            activity2 = activity;
            linearLayout = linearLayout;
            builder = builder2;
            strArr2 = strArr2;
            iArr = iArr;
            i2 = 0;
        }
        AlertDialog.Builder builder3 = builder;
        builder3.setTitle(LocaleController.getString(R.string.NotificationsImportance));
        builder3.setView(linearLayout);
        builder3.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder3.create();
    }

    public static void lambda$createPrioritySelectDialog$192(int[] iArr, long j, long j2, int i, SharedPreferences sharedPreferences, AlertDialog.Builder builder, Runnable runnable, View view) {
        int i2 = 0;
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            int i3 = iArr[0];
            if (i3 == 0) {
                i2 = 3;
            } else if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                i2 = 1;
            }
            editorEdit.putInt("priority_" + j, i2);
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j, j2);
        } else {
            int i4 = iArr[0];
            int i5 = i4 == 0 ? 4 : i4 == 1 ? 5 : i4 == 2 ? 0 : 1;
            if (i == 1) {
                editorEdit.putInt("priority_messages", i5);
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i == 0) {
                editorEdit.putInt("priority_group", i5);
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i == 2) {
                editorEdit.putInt("priority_channel", i5);
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            } else if (i == 3) {
                editorEdit.putInt("priority_stories", i5);
                iArr[0] = sharedPreferences.getInt("priority_stories", 1);
            } else if (i == 4 || i == 5) {
                editorEdit.putInt("priority_react", i5);
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
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        int i2 = 0;
        while (i2 < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            radioColorCell.setTextAndValue(strArr[i2], iArr[0] == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createPopupSelectDialog$193(iArr, i, builder, runnable, view);
                }
            });
            i2++;
        }
        builder.setTitle(LocaleController.getString(R.string.PopupNotification));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createPopupSelectDialog$193(int[] iArr, int i, AlertDialog.Builder builder, Runnable runnable, View view) {
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

    public static Dialog createSingleChoiceDialog(Activity activity, String[] strArr, String str, int i, final DialogInterface.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        int i2 = 0;
        while (i2 < strArr.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            radioColorCell.setTextAndValue(strArr[i2], i == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createSingleChoiceDialog$194(builder, onClickListener, view);
                }
            });
            i2++;
        }
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createSingleChoiceDialog$194(AlertDialog.Builder builder, DialogInterface.OnClickListener onClickListener, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        builder.getDismissRunnable().run();
        onClickListener.onClick(null, iIntValue);
    }

    public static AlertDialog.Builder createTTLAlert(Context context, final TLRPC.EncryptedChat encryptedChat, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.MessageLifetime));
        final NumberPicker numberPicker = new NumberPicker(context);
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createTTLAlert$195(i2);
            }
        });
        builder.setView(numberPicker);
        builder.setNegativeButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createTTLAlert$196(encryptedChat, numberPicker, alertDialog, i2);
            }
        });
        return builder;
    }

    public static String lambda$createTTLAlert$195(int i) {
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
        if (i == 20) {
            return LocaleController.formatTTLString(604800);
        }
        return "";
    }

    public static void lambda$createTTLAlert$196(TLRPC.EncryptedChat encryptedChat, NumberPicker numberPicker, AlertDialog alertDialog, int i) {
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

    public static AlertDialog createAccountSelectDialog(Activity activity, final AccountSelectDelegate accountSelectDelegate) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        final Runnable dismissRunnable = builder.getDismissRunnable();
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).getCurrentUser() != null) {
                AccountSelectCell accountSelectCell = new AccountSelectCell(activity, false);
                accountSelectCell.setAccount(i, false);
                accountSelectCell.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                accountSelectCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                linearLayout.addView(accountSelectCell, LayoutHelper.createLinear(-1, 50));
                accountSelectCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.lambda$createAccountSelectDialog$197(alertDialogArr, dismissRunnable, accountSelectDelegate, view);
                    }
                });
            }
        }
        builder.setTitle(LocaleController.getString(R.string.SelectAccount));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        return alertDialogCreate;
    }

    public static void lambda$createAccountSelectDialog$197(AlertDialog[] alertDialogArr, Runnable runnable, AccountSelectDelegate accountSelectDelegate, View view) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.setOnDismissListener(null);
        }
        runnable.run();
        accountSelectDelegate.didSelectAccount(((AccountSelectCell) view).getAccountNumber());
    }

    public static void createDeleteMessagesAlert(final BaseFragment baseFragment, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        Activity parentActivity;
        int size;
        long jMakeEncryptedDialogId;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        AlertDialog.Builder builder;
        final boolean[] zArr;
        int i5;
        boolean z4;
        boolean z5;
        TLRPC.Chat chat2;
        AlertDialog.Builder builder2;
        boolean[] zArr2;
        int i6;
        float f;
        float f2;
        int iDp;
        int i7;
        TLRPC.MessageAction messageAction;
        AlertDialog.Builder builder3;
        int i8;
        String str;
        boolean z6;
        int i9;
        float f3;
        float f4;
        int iDp2;
        TLRPC.MessageAction messageAction2;
        final int i10;
        int i11;
        TLRPC.Message message;
        boolean z7 = i2 == 1;
        boolean z8 = i2 == 3;
        if (baseFragment != null) {
            if ((user == null && chat == null && encryptedChat == null) || (parentActivity = baseFragment.getParentActivity()) == null) {
                return;
            }
            final int currentAccount = baseFragment.getCurrentAccount();
            AlertDialog.Builder builder4 = new AlertDialog.Builder(parentActivity, resourcesProvider);
            builder4.setDimAlpha(runnable2 != null ? 0.5f : 0.6f);
            if (groupedMessages != null) {
                size = groupedMessages.messages.size();
            } else {
                size = messageObject != null ? 1 : sparseArrayArr[0].size() + sparseArrayArr[1].size();
            }
            if (encryptedChat != null) {
                jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            } else if (user != null) {
                jMakeEncryptedDialogId = user.id;
            } else {
                jMakeEncryptedDialogId = -chat.id;
            }
            final long j2 = jMakeEncryptedDialogId;
            if (z7) {
                if (messageObject != null && (message = messageObject.messageOwner) != null && (i11 = message.schedule_repeat_period) > 0) {
                    i10 = message.date;
                } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    i10 = groupedMessages.messages.get(0).messageOwner.date;
                    i11 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
                }
                if (i10 > 0 && i11 > 0) {
                    String string = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i11));
                    if (i11 == 31536000) {
                        string = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                    } else if (i11 >= 2592000) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i11 / 2592000, new Object[0]);
                    } else if (i11 >= 604800) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i11 / 604800, new Object[0]);
                    } else if (i11 >= 86400) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i11 / 86400, new Object[0]);
                    }
                    final int i12 = i11;
                    final boolean z9 = z8;
                    new AlertDialog.Builder(parentActivity, resourcesProvider).setTitle(LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle)).setMessage(LocaleController.getString(R.string.MessageScheduledRepeatDeleteText)).setNegativeButton(string, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i13) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$198(groupedMessages, currentAccount, baseFragment, i10, i12, messageObject, alertDialog, i13);
                        }
                    }).setNeutralButton(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i13) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$199(j2, z9, currentAccount, messageObject, groupedMessages, encryptedChat, j, i, i2, sparseArrayArr, runnable, alertDialog, i13);
                        }
                    }).setPositiveButton(LocaleController.getString(R.string.Cancel), null).makeRed(-2).makeRed(-3).setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$200(runnable2, dialogInterface);
                        }
                    }).show();
                    return;
                }
            }
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            MessagesController.getInstance(currentAccount).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
            if (messageObject != null) {
                z3 = !messageObject.isDice() || Math.abs(currentTime - messageObject.messageOwner.date) > 86400;
                if (messageObject.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    z2 = message2.paid_suggested_post_stars;
                    z = message2.paid_suggested_post_ton;
                } else {
                    z = false;
                    z2 = false;
                }
            } else {
                int i13 = 0;
                z = false;
                z2 = false;
                boolean z10 = false;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    for (int i15 = 0; i15 < sparseArrayArr[i13].size(); i15++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr[i13].valueAt(i15);
                        if (!messageObject2.isDice() || Math.abs(currentTime - messageObject2.messageOwner.date) > 86400) {
                            z10 = true;
                        }
                        if (messageObject2.isPaidSuggestedPostProtected()) {
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            z2 |= message3.paid_suggested_post_stars;
                            z |= message3.paid_suggested_post_ton;
                        }
                    }
                    i13++;
                }
                z3 = z10;
            }
            if (groupedMessages != null) {
                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                    MessageObject messageObject3 = groupedMessages.messages.get(i16);
                    if (messageObject3.isPaidSuggestedPostProtected()) {
                        TLRPC.Message message4 = messageObject3.messageOwner;
                        z2 |= message4.paid_suggested_post_stars;
                        z |= message4.paid_suggested_post_ton;
                    }
                }
            }
            boolean z11 = z;
            boolean z12 = z2;
            final boolean[] zArr3 = new boolean[1];
            boolean z13 = user != null && MessagesController.getInstance(currentAccount).canRevokePmInbox;
            if (user != null) {
                i3 = MessagesController.getInstance(currentAccount).revokeTimePmLimit;
            } else {
                i3 = MessagesController.getInstance(currentAccount).revokeTimeLimit;
            }
            boolean z14 = encryptedChat == null && user != null && z13 && i3 == Integer.MAX_VALUE;
            if (chat != null && chat.megagroup && !z7 && !z8) {
                ArrayList arrayList = new ArrayList();
                if (messageObject != null) {
                    TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                    if (messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser)) {
                        if (groupedMessages != null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            arrayList.add(messageObject);
                        }
                    }
                    i9 = (!messageObject.isSendError() && messageObject.getDialogId() == j && ((messageAction2 = messageObject.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject.isOut() && currentTime - messageObject.messageOwner.date <= i3) ? 1 : 0;
                } else {
                    i9 = 0;
                    for (int i17 = 1; i17 >= 0; i17--) {
                        int i18 = 0;
                        while (i18 < sparseArrayArr[i17].size()) {
                            MessageObject messageObject4 = (MessageObject) sparseArrayArr[i17].valueAt(i18);
                            int i19 = 1;
                            if (i17 == 1 && messageObject4.isOut()) {
                                TLRPC.Message message5 = messageObject4.messageOwner;
                                if (message5.action != null || currentTime - message5.date > i3) {
                                    i19 = 1;
                                } else {
                                    i19 = 1;
                                    i9++;
                                }
                            }
                            arrayList.add(messageObject4);
                            i18 += i19;
                        }
                    }
                }
                final long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                final int i20 = currentAccount;
                ArrayList arrayList2 = (ArrayList) Collection.EL.stream(arrayList).mapToLong(new ToLongFunction() {
                    @Override
                    public final long applyAsLong(Object obj) {
                        return ((MessageObject) obj).getFromChatId();
                    }
                }).distinct().mapToObj(new LongFunction() {
                    @Override
                    public final Object apply(long j3) {
                        return AlertsCreator.lambda$createDeleteMessagesAlert$201(i20, j3);
                    }
                }).filter(new Predicate() {
                    public Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        return Objects.nonNull((TLObject) obj);
                    }
                }).filter(new Predicate() {
                    public Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        return AlertsCreator.lambda$createDeleteMessagesAlert$202(clientUserId, (TLObject) obj);
                    }
                }).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda242()));
                if (!arrayList2.isEmpty()) {
                    if (channelParticipantArr == null) {
                        AlertDialog[] alertDialogArr = {new AlertDialog(parentActivity, 3)};
                        int size2 = arrayList2.size();
                        TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        int[] iArr2 = new int[1];
                        int i21 = 0;
                        while (i21 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i21));
                            final int[] iArr3 = iArr2;
                            final int[] iArr4 = iArr;
                            final int i22 = i21;
                            final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                            final int i23 = size2;
                            final AlertDialog[] alertDialogArr2 = alertDialogArr;
                            int i24 = i21;
                            int[] iArr5 = iArr;
                            iArr5[i24] = ConnectionsManager.getInstance(i20).sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    AlertsCreator.lambda$createDeleteMessagesAlert$204(iArr3, iArr4, i22, channelParticipantArr3, i23, alertDialogArr2, baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i, i2, runnable, runnable2, resourcesProvider, tLObject, tL_error);
                                }
                            });
                            i21 = i24 + 1;
                            iArr2 = iArr2;
                            iArr = iArr5;
                            channelParticipantArr2 = channelParticipantArr2;
                            arrayList2 = arrayList2;
                            size2 = size2;
                            alertDialogArr = alertDialogArr;
                            i20 = i20;
                        }
                        final int[] iArr6 = iArr;
                        final int i25 = i20;
                        final AlertDialog[] alertDialogArr3 = alertDialogArr;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                AlertsCreator.lambda$createDeleteMessagesAlert$206(alertDialogArr3, iArr6, i25, runnable2, baseFragment);
                            }
                        }, 1000L);
                        return;
                    }
                    DeleteMessagesBottomSheet deleteMessagesBottomSheet = new DeleteMessagesBottomSheet(baseFragment, chat, arrayList, arrayList2, channelParticipantArr, j, i, i2, runnable);
                    if (runnable2 != null) {
                        deleteMessagesBottomSheet.setOnHideListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                runnable2.run();
                            }
                        });
                    }
                    deleteMessagesBottomSheet.show();
                    return;
                }
                i4 = i20;
                if (i9 <= 0 || !z3) {
                    builder = builder4;
                    zArr = zArr3;
                    i5 = i9;
                    z4 = false;
                    z5 = false;
                } else {
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                    checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCell.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false);
                    if (LocaleController.isRTL) {
                        f3 = 16.0f;
                        iDp2 = AndroidUtilities.dp(16.0f);
                        f4 = 8.0f;
                    } else {
                        f3 = 16.0f;
                        f4 = 8.0f;
                        iDp2 = AndroidUtilities.dp(8.0f);
                    }
                    checkBoxCell.setPadding(iDp2, 0, LocaleController.isRTL ? AndroidUtilities.dp(f4) : AndroidUtilities.dp(f3), 0);
                    frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.lambda$createDeleteMessagesAlert$208(zArr3, view);
                        }
                    });
                    builder4.setView(frameLayout);
                    builder4.setCustomViewOffset(9);
                    builder = builder4;
                    zArr = zArr3;
                    i5 = i9;
                    z4 = false;
                    z5 = true;
                }
            } else {
                i4 = currentAccount;
                if (z7 || z8 || ChatObject.isChannel(chat) || encryptedChat != null) {
                    builder = builder4;
                    zArr = zArr3;
                    i5 = 0;
                    z4 = false;
                } else {
                    if (user == null || user.id == UserConfig.getInstance(i4).getClientUserId() || (user.bot && !user.support)) {
                        chat2 = chat;
                        if (chat2 == null) {
                            builder2 = builder4;
                            zArr2 = zArr3;
                            i6 = 0;
                            z4 = false;
                        }
                        if (i6 > 0 || !z3 || (user != null && UserObject.isDeleted(user))) {
                            builder = builder2;
                            zArr = zArr2;
                            i5 = i6;
                        } else {
                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                            CheckBoxCell checkBoxCell2 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                            checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            if (z14) {
                                checkBoxCell2.setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false);
                            } else if (chat2 != null && (z4 || i6 == size)) {
                                checkBoxCell2.setText(LocaleController.getString(R.string.DeleteForAll), "", false, false);
                            } else {
                                checkBoxCell2.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false);
                            }
                            if (LocaleController.isRTL) {
                                f = 16.0f;
                                iDp = AndroidUtilities.dp(16.0f);
                                f2 = 8.0f;
                            } else {
                                f = 16.0f;
                                f2 = 8.0f;
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            checkBoxCell2.setPadding(iDp, 0, LocaleController.isRTL ? AndroidUtilities.dp(f2) : AndroidUtilities.dp(f), 0);
                            frameLayout2.addView(checkBoxCell2, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            zArr = zArr2;
                            checkBoxCell2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    AlertsCreator.lambda$createDeleteMessagesAlert$209(zArr, view);
                                }
                            });
                            builder = builder2;
                            builder.setView(frameLayout2);
                            builder.setCustomViewOffset(9);
                            i5 = i6;
                            z5 = true;
                        }
                    } else {
                        chat2 = chat;
                    }
                    if (messageObject != null) {
                        builder2 = builder4;
                        i6 = (messageObject.isSendError() || !((messageAction = messageObject.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject.isOut() || z13 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject.messageOwner.date > i3)) ? 0 : 1;
                        z4 = !messageObject.isOut();
                        zArr2 = zArr3;
                    } else {
                        int i26 = 1;
                        int i27 = 0;
                        z4 = false;
                        AlertDialog.Builder builder5 = builder4;
                        while (i26 >= 0) {
                            int i28 = 0;
                            AlertDialog.Builder builder6 = builder5;
                            while (i28 < sparseArrayArr[i26].size()) {
                                MessageObject messageObject5 = (MessageObject) sparseArrayArr[i26].valueAt(i28);
                                AlertDialog.Builder builder7 = builder6;
                                TLRPC.MessageAction messageAction4 = messageObject5.messageOwner.action;
                                boolean[] zArr4 = zArr3;
                                if ((messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction4 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction4 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject5.isOut() || z13 || (chat2 != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject5.messageOwner.date <= i3)) {
                                    i7 = 1;
                                    i27++;
                                    if (!z4 && !messageObject5.isOut()) {
                                        z4 = true;
                                    }
                                } else {
                                    i7 = 1;
                                }
                                i28 += i7;
                                builder6 = builder7;
                                zArr3 = zArr4;
                            }
                            i26--;
                            zArr3 = zArr3;
                            builder5 = builder6;
                        }
                        builder2 = builder5;
                        zArr2 = zArr3;
                        i6 = i27;
                    }
                    if (i6 > 0) {
                    }
                    builder = builder2;
                    zArr = zArr2;
                    i5 = i6;
                }
                z5 = false;
            }
            AlertDialog.Builder builder8 = builder;
            final boolean z15 = z8;
            final int i29 = i4;
            int i30 = size;
            final boolean[] zArr5 = zArr;
            int i31 = i5;
            AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i32) {
                    AlertsCreator.lambda$createDeleteMessagesAlert$210(j2, z15, i29, messageObject, groupedMessages, encryptedChat, j, i, zArr5, i2, sparseArrayArr, runnable, alertDialog, i32);
                }
            };
            if (z8) {
                i8 = 1;
                if (i30 == 1) {
                    builder3 = builder8;
                    builder3.setTitle(LocaleController.getString(R.string.UnsaveSingleMessagesTitle));
                } else {
                    builder3 = builder8;
                    builder3.setTitle(LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i30, new Object[0])));
                }
            } else {
                builder3 = builder8;
                i8 = 1;
                if (i30 == 1) {
                    builder3.setTitle(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                } else {
                    builder3.setTitle(LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i30, new Object[0])));
                }
            }
            if (z8) {
                if (i30 == i8) {
                    builder3.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage));
                } else {
                    builder3.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveFewMessages));
                }
            } else if (chat == null || !z4) {
                if (!z5 || z14 || i31 == i30) {
                    if (chat == null || !chat.megagroup || z7) {
                        if (i30 == i8) {
                            builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                        } else {
                            builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                        }
                    } else if (i30 == i8) {
                        builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessageMega));
                    } else {
                        builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega));
                    }
                } else if (chat != null) {
                    int i32 = R.string.DeleteMessagesTextGroup;
                    Object[] objArr = new Object[i8];
                    objArr[0] = LocaleController.formatPluralString("messages", i31, new Object[0]);
                    builder3.setMessage(LocaleController.formatString("DeleteMessagesTextGroup", i32, objArr));
                } else {
                    int i33 = R.string.DeleteMessagesText;
                    String pluralString = LocaleController.formatPluralString("messages", i31, new Object[0]);
                    String firstName = UserObject.getFirstName(user);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = pluralString;
                    objArr2[i8] = firstName;
                    builder3.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", i33, objArr2)));
                }
            } else if (z5 && i31 != i30) {
                int i34 = R.string.DeleteMessagesTextGroupPart;
                Object[] objArr3 = new Object[i8];
                objArr3[0] = LocaleController.formatPluralString("messages", i31, new Object[0]);
                builder3.setMessage(LocaleController.formatString(i34, objArr3));
            } else if (i30 == i8) {
                builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
            } else {
                builder3.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
            }
            if (messageObject != null) {
                z6 = messageObject.isGiveaway() && !messageObject.isForwarded();
                if (z6) {
                    long j3 = ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date * 1000;
                    str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j3));
                    z6 = System.currentTimeMillis() < j3;
                } else {
                    str = null;
                }
            } else if (i30 == i8) {
                int i35 = 1;
                String str2 = null;
                z6 = false;
                while (i35 >= 0) {
                    boolean z16 = z6;
                    for (int i36 = 0; i36 < sparseArrayArr[i35].size(); i36 += i8) {
                        MessageObject messageObject6 = (MessageObject) sparseArrayArr[i35].valueAt(i36);
                        boolean z17 = messageObject6.isGiveaway() && !messageObject6.isForwarded();
                        if (z17) {
                            long j4 = ((TLRPC.TL_messageMediaGiveaway) messageObject6.messageOwner.media).until_date * 1000;
                            str2 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                            z16 = System.currentTimeMillis() < j4;
                        } else {
                            z16 = z17;
                        }
                    }
                    i35--;
                    z6 = z16;
                }
                str = str2;
            } else {
                str = null;
            }
            if (z12) {
                int i37 = (int) MessagesController.getInstance(i4).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder3.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                int i38 = R.string.SuggestionStarsWillBeLostInfo;
                Object[] objArr4 = new Object[i8];
                objArr4[0] = Integer.valueOf(i37);
                builder3.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i38, objArr4)));
                builder3.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z11) {
                int i39 = (int) MessagesController.getInstance(i4).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder3.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                int i40 = R.string.SuggestionTONWillBeLostInfo;
                Object[] objArr5 = new Object[i8];
                objArr5[0] = Integer.valueOf(i39);
                builder3.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i40, objArr5)));
                builder3.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (!z6 || z8) {
                builder3.setPositiveButton(LocaleController.getString(z8 ? R.string.Remove : R.string.Delete), onButtonClickListener);
            } else {
                builder3.setTitle(LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle));
                int i41 = R.string.BoostingGiveawayDeleteMsgText;
                Object[] objArr6 = new Object[i8];
                objArr6[0] = str;
                builder3.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i41, objArr6)));
                builder3.setNeutralButton(LocaleController.getString(R.string.Delete), onButtonClickListener);
            }
            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder3.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertsCreator.lambda$createDeleteMessagesAlert$211(runnable2, dialogInterface);
                }
            });
            AlertDialog alertDialogCreate = builder3.create();
            baseFragment.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
            TextView textView2 = (TextView) alertDialogCreate.getButton(-3);
            if (textView2 != null) {
                alertDialogCreate.getButtonsLayout().setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) alertDialogCreate.getButtonsLayout().getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public static void lambda$createDeleteMessagesAlert$198(MessageObject.GroupedMessages groupedMessages, int i, BaseFragment baseFragment, int i2, int i3, MessageObject messageObject, AlertDialog alertDialog, int i4) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(i).editMessage(groupedMessages.messages.get(0), null, false, baseFragment, null, i2 + i3, i3);
        } else {
            SendMessagesHelper.getInstance(i).editMessage(messageObject, null, false, baseFragment, null, i2 + i3, i3);
        }
    }

    public static void lambda$createDeleteMessagesAlert$199(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
        ArrayList<Long> arrayList;
        TLRPC.Peer peer;
        long clientUserId = z ? UserConfig.getInstance(i).getClientUserId() : j;
        ArrayList<Long> arrayList2 = null;
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
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    arrayList4.add(Long.valueOf(messageObject.messageOwner.random_id));
                    arrayList2 = arrayList4;
                }
            }
            MessagesController.getInstance(i).deleteMessages(arrayList3, arrayList2, encryptedChat, (j2 == 0 || (peer = messageObject.messageOwner.peer_id) == null || peer.chat_id != (-j2)) ? clientUserId : j2, i2, true, i3);
        } else {
            int i6 = 1;
            int i7 = 1;
            while (i7 >= 0) {
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                for (int i8 = 0; i8 < sparseArrayArr[i7].size(); i8++) {
                    arrayList5.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i8)));
                }
                if (encryptedChat != null) {
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    for (int i9 = 0; i9 < sparseArrayArr[i7].size(); i9++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i7].valueAt(i9);
                        long j3 = messageObject3.messageOwner.random_id;
                        if (j3 != 0 && messageObject3.type != 10) {
                            arrayList6.add(Long.valueOf(j3));
                        }
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                int i10 = i7;
                MessagesController.getInstance(i).deleteMessages(arrayList5, arrayList, encryptedChat, (i7 != i6 || j2 == 0) ? clientUserId : j2, i2, true, i3);
                sparseArrayArr[i10].clear();
                i7 = i10 - 1;
                i6 = 1;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$200(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static TLObject lambda$createDeleteMessagesAlert$201(int i, long j) {
        if (j > 0) {
            return MessagesController.getInstance(i).getUser(Long.valueOf(j));
        }
        return MessagesController.getInstance(i).getChat(Long.valueOf(-j));
    }

    public static boolean lambda$createDeleteMessagesAlert$202(long j, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id != j;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return !ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
        }
        return false;
    }

    public static void lambda$createDeleteMessagesAlert$204(final int[] iArr, final int[] iArr2, final int i, final TLRPC.ChannelParticipant[] channelParticipantArr, final int i2, final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i3, final int i4, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createDeleteMessagesAlert$203(iArr, iArr2, i, tLObject, channelParticipantArr, i2, alertDialogArr, baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i3, i4, runnable, runnable2, resourcesProvider);
            }
        });
    }

    public static void lambda$createDeleteMessagesAlert$203(int[] iArr, int[] iArr2, int i, TLObject tLObject, TLRPC.ChannelParticipant[] channelParticipantArr, int i2, AlertDialog[] alertDialogArr, BaseFragment baseFragment, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, TLRPC.ChatFull chatFull, long j, MessageObject messageObject, SparseArray[] sparseArrayArr, MessageObject.GroupedMessages groupedMessages, int i3, int i4, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
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

    public static void lambda$createDeleteMessagesAlert$206(AlertDialog[] alertDialogArr, final int[] iArr, final int i, final Runnable runnable, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createDeleteMessagesAlert$205(iArr, i, runnable, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void lambda$createDeleteMessagesAlert$205(int[] iArr, int i, Runnable runnable, DialogInterface dialogInterface) {
        for (int i2 : iArr) {
            if (i2 != 0) {
                ConnectionsManager.getInstance(i).cancelRequest(i2, true);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$208(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createDeleteMessagesAlert$209(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$createDeleteMessagesAlert$210(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, boolean[] zArr, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
        ArrayList<Long> arrayList;
        TLRPC.Peer peer;
        long clientUserId = z ? UserConfig.getInstance(i).getClientUserId() : j;
        ArrayList<Long> arrayList2 = null;
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
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    arrayList4.add(Long.valueOf(messageObject.messageOwner.random_id));
                    arrayList2 = arrayList4;
                }
            }
            MessagesController.getInstance(i).deleteMessages(arrayList3, arrayList2, encryptedChat, (j2 == 0 || (peer = messageObject.messageOwner.peer_id) == null || peer.chat_id != (-j2)) ? clientUserId : j2, i2, zArr[0], i3);
        } else {
            int i6 = 1;
            int i7 = 1;
            while (i7 >= 0) {
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                for (int i8 = 0; i8 < sparseArrayArr[i7].size(); i8++) {
                    arrayList5.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i8)));
                }
                if (encryptedChat != null) {
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    for (int i9 = 0; i9 < sparseArrayArr[i7].size(); i9++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i7].valueAt(i9);
                        long j3 = messageObject3.messageOwner.random_id;
                        if (j3 != 0 && messageObject3.type != 10) {
                            arrayList6.add(Long.valueOf(j3));
                        }
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                int i10 = i7;
                MessagesController.getInstance(i).deleteMessages(arrayList5, arrayList, encryptedChat, (i7 != i6 || j2 == 0) ? clientUserId : j2, i2, zArr[0], i3);
                sparseArrayArr[i10].clear();
                i7 = i10 - 1;
                i6 = 1;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$211(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void createThemeCreateDialog(final BaseFragment baseFragment, int i, final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_dialogInputField), Theme.getColor(Theme.key_dialogInputFieldActivated), Theme.getColor(Theme.key_text_RedBold));
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
        builder.setTitle(LocaleController.getString(R.string.NewTheme));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Create), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.lambda$createThemeCreateDialog$212(alertDialog, i2);
            }
        });
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i != 0) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EnterThemeNameEdit)));
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(Theme.getColor(i2));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView2, int i3, KeyEvent keyEvent) {
                return AlertsCreator.lambda$createThemeCreateDialog$213(textView2, i3, keyEvent);
            }
        });
        editTextBoldCursor.setText(generateThemeName(themeAccent));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createThemeCreateDialog$215(editTextBoldCursor, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogCreate);
        editTextBoldCursor.requestFocus();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws Throwable {
                AlertsCreator.lambda$createThemeCreateDialog$218(baseFragment, editTextBoldCursor, themeAccent, themeInfo, alertDialogCreate, view);
            }
        });
    }

    public static boolean lambda$createThemeCreateDialog$213(TextView textView, int i, KeyEvent keyEvent) {
        AndroidUtilities.hideKeyboard(textView);
        return false;
    }

    public static void lambda$createThemeCreateDialog$215(final EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createThemeCreateDialog$214(editTextBoldCursor);
            }
        });
    }

    public static void lambda$createThemeCreateDialog$214(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$createThemeCreateDialog$218(final BaseFragment baseFragment, final EditTextBoldCursor editTextBoldCursor, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo, final AlertDialog alertDialog, View view) throws Throwable {
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
        if (themeAccent != null) {
            themeInfo.setCurrentAccentId(themeAccent.id);
            Theme.refreshThemeColors();
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$createThemeCreateDialog$217(editTextBoldCursor, alertDialog, baseFragment);
                }
            });
            return;
        }
        processCreate(editTextBoldCursor, alertDialog, baseFragment);
    }

    public static void lambda$createThemeCreateDialog$217(final EditTextBoldCursor editTextBoldCursor, final AlertDialog alertDialog, final BaseFragment baseFragment) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws Throwable {
                AlertsCreator.processCreate(editTextBoldCursor, alertDialog, baseFragment);
            }
        });
    }

    public static void processCreate(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) throws Throwable {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        Theme.ThemeInfo themeInfoCreateNewTheme = Theme.createNewTheme(editTextBoldCursor.getText().toString());
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().show(baseFragment.getParentActivity(), themeInfoCreateNewTheme);
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

    private static String generateThemeName(Theme.ThemeAccent themeAccent) {
        int i;
        List listAsList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List listAsList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap map = new HashMap();
        map.put(9306112, "Berry");
        map.put(14598550, "Brandy");
        map.put(8391495, "Cherry");
        map.put(16744272, "Coral");
        map.put(14372985, "Cranberry");
        map.put(14423100, "Crimson");
        map.put(14725375, "Mauve");
        map.put(16761035, "Pink");
        map.put(16711680, "Red");
        map.put(16711807, "Rose");
        map.put(8406555, "Russet");
        map.put(16720896, "Scarlet");
        map.put(15856113, "Seashell");
        map.put(16724889, "Strawberry");
        map.put(16760576, "Amber");
        map.put(15438707, "Apricot");
        map.put(16508850, "Banana");
        map.put(10601738, "Citrus");
        map.put(11560192, "Ginger");
        map.put(16766720, "Gold");
        map.put(16640272, "Lemon");
        map.put(16753920, "Orange");
        map.put(16770484, "Peach");
        map.put(16739155, "Persimmon");
        map.put(14996514, "Sunflower");
        map.put(15893760, "Tangerine");
        map.put(16763004, "Topaz");
        map.put(16776960, "Yellow");
        map.put(3688720, "Clover");
        map.put(8628829, "Cucumber");
        map.put(5294200, "Emerald");
        map.put(11907932, "Olive");
        map.put(65280, "Green");
        map.put(43115, "Jade");
        map.put(2730887, "Jungle");
        map.put(12582656, "Lime");
        map.put(776785, "Malachite");
        map.put(10026904, "Mint");
        map.put(11394989, "Moss");
        map.put(3234721, "Azure");
        map.put(255, "Blue");
        map.put(18347, "Cobalt");
        map.put(5204422, "Indigo");
        map.put(96647, "Lagoon");
        map.put(7461346, "Aquamarine");
        map.put(1182351, "Ultramarine");
        map.put(128, "Navy");
        map.put(3101086, "Sapphire");
        map.put(7788522, "Sky");
        map.put(32896, "Teal");
        map.put(4251856, "Turquoise");
        map.put(10053324, "Amethyst");
        map.put(5046581, "Blackberry");
        map.put(6373457, "Eggplant");
        map.put(13148872, "Lilac");
        map.put(11894492, "Lavender");
        map.put(13421823, "Periwinkle");
        map.put(8663417, "Plum");
        map.put(6684825, "Purple");
        map.put(14204888, "Thistle");
        map.put(14315734, "Orchid");
        map.put(2361920, "Violet");
        map.put(4137225, "Bronze");
        map.put(3604994, "Chocolate");
        map.put(8077056, "Cinnamon");
        map.put(3153694, "Cocoa");
        map.put(7365973, "Coffee");
        map.put(7956873, "Rum");
        map.put(5113350, "Mahogany");
        map.put(7875865, "Mocha");
        map.put(12759680, "Sand");
        map.put(8924439, "Sienna");
        map.put(7864585, "Maple");
        map.put(15787660, "Khaki");
        map.put(12088115, "Copper");
        map.put(12144200, "Chestnut");
        map.put(15653316, "Almond");
        map.put(16776656, "Cream");
        map.put(12186367, "Diamond");
        map.put(11109127, "Honey");
        map.put(16777200, "Ivory");
        map.put(15392968, "Pearl");
        map.put(15725299, "Porcelain");
        map.put(13745832, "Vanilla");
        map.put(16777215, "White");
        map.put(8421504, "Gray");
        map.put(0, "Black");
        map.put(15266260, "Chrome");
        map.put(3556687, "Charcoal");
        map.put(789277, "Ebony");
        map.put(12632256, "Silver");
        map.put(16119285, "Smoke");
        map.put(2499381, "Steel");
        map.put(5220413, "Apple");
        map.put(8434628, "Glacier");
        map.put(16693933, "Melon");
        map.put(12929932, "Mulberry");
        map.put(11126466, "Opal");
        map.put(5547512, "Blue");
        Theme.ThemeAccent accent = themeAccent == null ? Theme.getCurrentTheme().getAccent(false) : themeAccent;
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
            int i5 = ((((767 - i3) * iBlue2) * iBlue2) >> 8) + ((((i3 + 512) * i4) * i4) >> 8) + (iGreen2 * 4 * iGreen2);
            if (i5 < i2) {
                str = (String) entry.getValue();
                i2 = i5;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            return ((String) listAsList.get(Utilities.random.nextInt(listAsList.size()))) + " " + str;
        }
        return str + " " + ((String) listAsList2.get(Utilities.random.nextInt(listAsList2.size())));
    }

    public static void showDeclineSuggestedPostDialog(BaseFragment baseFragment, long j, boolean z, final Utilities.Callback callback) {
        final Context context = baseFragment.getContext();
        AlertDialog.Builder builder = z ? new AlertDialogDecor.Builder(context) : new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(R.string.SuggestedMessageDecline));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(j))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        final EditText editText = new EditText(context);
        editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
        editText.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(Theme.createEditTextDrawable(context, true));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        editText.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(255) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                Vibrator vibrator;
                CharSequence charSequenceFilter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length() && (vibrator = (Vibrator) context.getSystemService("vibrator")) != null) {
                    vibrator.vibrate(200L);
                }
                return charSequenceFilter;
            }
        }});
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, AndroidUtilities.dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
        editText.setSelection(editText.getText().toString().length());
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Decline), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.lambda$showDeclineSuggestedPostDialog$221(callback, editText, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(editText);
            }
        });
        frameLayout.addView(editText, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.showKeyboard(editText);
            }
        }, 100L);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void lambda$showDeclineSuggestedPostDialog$221(Utilities.Callback callback, EditText editText, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        if (callback != null) {
            callback.run(editText.getText().toString());
        }
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider, int i) {
        return createSuggestedMessageDatePickerDialog(context, j, scheduleDatePickerDelegate, null, new ScheduleDatePickerColors(), resourcesProvider, i);
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider, int i) {
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i2) {
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
            protected CharSequence getContentDescription(int i2) {
                return LocaleController.formatPluralString("Minutes", i2, new Object[0]);
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
            protected void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                android.graphics.Point point = AndroidUtilities.displaySize;
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
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$224(view, motionEvent);
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$225(view, motionEvent);
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        final int i2 = calendar.get(1);
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$226(i2, i3);
            }
        });
        int i3 = i == 1 ? 5 : 3;
        final int i4 = i3;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i5, int i6) {
                AlertsCreator.checkScheduleDate(textView3, null, j2, j3, i4, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$228(i5);
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$229(i5);
            }
        });
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
        checkScheduleDate(textView3, null, j2, j3, i3, numberPicker, numberPicker2, numberPicker3);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 8.0f));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        final int i5 = i3;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$230(zArr, j2, j3, i5, numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, view);
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
        textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_windowBackgroundWhite), Theme.getColor(Theme.key_listSelector)));
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, 48, 83, 16, 0, 16, 16));
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$231(zArr, scheduleDatePickerDelegate, builder, view);
            }
        });
        ScaleStateListAnimator.apply(textView4, 0.02f, 1.2f);
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$232(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$226(int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        LocalDate localDatePlusDays = LocalDate.now().plusDays(i2);
        int year = localDatePlusDays.getYear();
        long epochMilli = localDatePlusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        if (year == i) {
            return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$228(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createSuggestedMessageDatePickerDialog$229(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$230(boolean[] zArr, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        boolean zCheckScheduleDate = checkScheduleDate(null, null, j, j2, i, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(LocalDate.now().plusDays(numberPicker.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
        builder.getDismissRunnable().run();
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$231(boolean[] zArr, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        scheduleDatePickerDelegate.didSelectDate(true, -1, 0);
        builder.getDismissRunnable().run();
    }

    public static void lambda$createSuggestedMessageDatePickerDialog$232(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void showCallsForbidden(Context context, final int i, final long j, final Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
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
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.CallForbiddenInviteLinkTitle));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 32.0f, 16.0f, 32.0f, 8.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i, j))));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 18.0f));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet bottomSheetCreate = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$showCallsForbidden$236(i, buttonWithCounterView, bottomSheetCreate, j, resourcesProvider, view);
            }
        });
        bottomSheetCreate.fixNavigationBar();
        bottomSheetCreate.show();
    }

    public static void lambda$showCallsForbidden$236(final int i, final ButtonWithCounterView buttonWithCounterView, final BottomSheet bottomSheet, final long j, final Theme.ResourcesProvider resourcesProvider, View view) {
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AlertsCreator.lambda$showCallsForbidden$235(i, buttonWithCounterView, bottomSheet, j, resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public static void lambda$showCallsForbidden$235(final int i, final ButtonWithCounterView buttonWithCounterView, final BottomSheet bottomSheet, final long j, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                AlertsCreator.lambda$showCallsForbidden$234(tLObject, i, buttonWithCounterView, bottomSheet, j, tL_error, resourcesProvider);
            }
        });
    }

    public static void lambda$showCallsForbidden$234(TLObject tLObject, final int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) throws InterruptedException {
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            Iterator it = MessagesController.findUpdates(updates, TLRPC.TL_updateGroupCall.class).iterator();
            TLRPC.GroupCall groupCall = null;
            while (it.hasNext()) {
                groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$showCallsForbidden$233(i, updates);
                }
            });
            if (groupCall == null || LaunchActivity.instance == null) {
                buttonWithCounterView.setLoading(false);
                return;
            }
            bottomSheet.lambda$new$0();
            SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(groupCall.invite_link, j));
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                if (safeLastFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) safeLastFragment;
                    if (chatActivity.getDialogId() == j && chatActivity.getChatMode() == 0) {
                        return;
                    }
                }
                safeLastFragment.presentFragment(ChatActivity.of(j));
                return;
            }
            return;
        }
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
        TLRPC.GroupCall groupCall2 = groupcall.call;
        tL_inputGroupCall.id = groupCall2.id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        bottomSheet.lambda$new$0();
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall, false, groupcall.call, null);
        SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j));
    }

    public static void lambda$showCallsForbidden$233(int i, TLRPC.Updates updates) {
        MessagesController.getInstance(i).processUpdates(updates, false);
    }

    public static void showGiftThemeApplyConfirm(Context context, Theme.ResourcesProvider resourcesProvider, int i, TL_stars.StarGift starGift, long j, final Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new StarGiftSheet.GiftThemeReuseTopView(context, starGift, userOrChat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftThemesSetInReuseInfo, DialogObject.getDialogTitle(userOrChat))));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
        new AlertDialog.Builder(context, resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    public static BottomSheet createCustomPicker(Context context, String str, int i, final String[] strArr, final Utilities.Callback callback) {
        if (TimezonesController.getInstance(UserConfig.selectedAccount).getTimezones().isEmpty()) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, null);
        builder.setApplyBottomPadding(false);
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                return AlertsCreator.lambda$createCustomPicker$238(strArr, i2);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i2, int i3) {
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
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.lambda$createCustomPicker$239(view, motionEvent);
            }
        });
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createCustomPicker$240(bottomSheetArr, view);
            }
        });
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        builder.setCustomView(linearLayout2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createCustomPicker$241(callback, numberPicker, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet bottomSheetCreate = builder.create();
        final BottomSheet[] bottomSheetArr = {bottomSheetCreate};
        return bottomSheetCreate;
    }

    public static String lambda$createCustomPicker$238(String[] strArr, int i) {
        return strArr[i];
    }

    public static void lambda$createCustomPicker$240(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$new$0();
    }

    public static void lambda$createCustomPicker$241(Utilities.Callback callback, NumberPicker numberPicker, DialogInterface dialogInterface) {
        callback.run(Integer.valueOf(numberPicker.getValue()));
    }

    public static void showDisableSharingInfo(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        if (context == null) {
            return;
        }
        final boolean[] zArr = new boolean[1];
        BottomSheet.Builder builder = new BottomSheet.Builder(context);
        final Runnable dismissRunnable = builder.getDismissRunnable();
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
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$showDisableSharingInfo$242(zArr, dismissRunnable, view);
            }
        });
        buttonWithCounterView.setRound();
        buttonWithCounterView.setText(LocaleController.getString(R.string.DisableSharingInfoButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        builder.setCustomView(linearLayout);
        builder.show().setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$showDisableSharingInfo$243(zArr, runnable);
            }
        });
    }

    public static void lambda$showDisableSharingInfo$242(boolean[] zArr, Runnable runnable, View view) {
        zArr[0] = true;
        runnable.run();
    }

    public static void lambda$showDisableSharingInfo$243(boolean[] zArr, Runnable runnable) {
        if (!zArr[0] || runnable == null) {
            return;
        }
        runnable.run();
    }
}
