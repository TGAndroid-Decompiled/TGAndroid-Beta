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
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.opengl.GLSurfaceView;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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
import java.util.function.ToLongFunction;
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
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
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
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda257;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileNotificationsActivity;
import org.telegram.ui.SelectChatUserSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.TooManyCommunitiesActivity;
import org.telegram.ui.community.cells.CommunityBanGroupConfirmCell;

public abstract class AlertsCreator {
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

    public interface ScheduleDatePickerDelegate {
        void didSelectDate(boolean z, int i, int i2);
    }

    public interface SoundFrequencyDelegate {
        void didSelectValues(int i, int i2);
    }

    public interface StatusUntilDatePickerDelegate {
        void didSelectDate(int i);
    }

    public static boolean $r8$lambda$1HreA47cic2DI0iWvJkZk6xPpyU(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void $r8$lambda$5ibv31GrZ2uDbTuglY7LYmL1hQI(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static boolean $r8$lambda$7aMJfVl5JCJYvfk8SzgRczDtaSw(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$Bp37odEupQHZkZ2wzY3PSI8rcxQ(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean m1955$r8$lambda$JUaPqHmSQm6PEospDnLDYcZ9Y(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void $r8$lambda$JiwJr3bR3ySTvE4ZdMp08xfUBy0() {
    }

    public static boolean m1956$r8$lambda$K7vo9YwhxUSJbTe2hKmpWuB6k(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$L1EyoXhYk11m1x6sVYq3esVuUY4(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$MkNbiVHpO8p1uHtppfbn4K8GvEA(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void m1964$r8$lambda$OLVI5eDnZ8w8SUCLcFYmVk2GHE(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$RfLFCYJmkf8JaY8ibbNSRDlPIBw(NumberPicker numberPicker, int i, int i2) {
    }

    public static boolean m1972$r8$lambda$TmYfcFcaRGTgdgpdW4v5JmRx8A(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void $r8$lambda$_r3RcvTconMV7D20v6ZBT5fPT8k(AlertDialog alertDialog, int i) {
    }

    public static boolean m1978$r8$lambda$ctKtqQvkBzLZn5oZ6H_VO9PI(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$eb9uF0EmGJKGMQQgis2E80Uy8us(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$gYIk1AITF0ps4wFFU9fxFZgzP3c(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$h4C8ccJbV2_XEbASNd71RqSS130(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void $r8$lambda$qOYsogZLStXzANMwtGje_2TQEMs(NumberPicker numberPicker, int i, int i2) {
    }

    public static boolean $r8$lambda$qfvNwy3IClMAv_5PMfPdTUi9KX8(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$vTK8rgu3VmNvz3GtPZXFNz9bPrg(View view, MotionEvent motionEvent) {
        return true;
    }

    public static Dialog createForgotPasscodeDialog(Context context) {
        return new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.ForgotPasscode)).setMessage(LocaleController.getString(R.string.ForgotPasscodeInfo)).setPositiveButton(LocaleController.getString(R.string.Close), null).create();
    }

    public static Dialog createLocationRequiredDialog(final Context context, boolean z) {
        return new AlertDialog.Builder(context).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends))).setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.m2006$r8$lambda$z9OV7Sej2fK9BMVVPq5XSk9LM(context, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void m2006$r8$lambda$z9OV7Sej2fK9BMVVPq5XSk9LM(Context context, AlertDialog alertDialog, int i) {
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
                AlertsCreator.$r8$lambda$AvuHCR1k6V5fBzOuStuj5qfZeNs(context, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
            }
        }).create();
    }

    public static void $r8$lambda$AvuHCR1k6V5fBzOuStuj5qfZeNs(Context context, AlertDialog alertDialog, int i) {
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
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog.Builder topAnimation = new AlertDialog.Builder(context, resourcesProvider).setTopAnimation(i, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
        if (z) {
            str = str2;
        }
        return topAnimation.setMessage(AndroidUtilities.replaceTags(str)).setPositiveButton(LocaleController.getString(z ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.m1998$r8$lambda$tUfQ2PKxixHa2KrEl7AuAV6nLo(z, context, atomicBoolean, consumer, alertDialog, i3);
            }
        }).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.$r8$lambda$HEvbBaVkS3tygf2fstRGhrdMj8k(atomicBoolean, consumer, alertDialog, i3);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$e_UUPM06Fsq_qCQnM0W1euYrafk(atomicBoolean, consumer, dialogInterface);
            }
        }).create();
    }

    public static void m1998$r8$lambda$tUfQ2PKxixHa2KrEl7AuAV6nLo(boolean z, Context context, AtomicBoolean atomicBoolean, Consumer consumer, AlertDialog alertDialog, int i) {
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

    public static void $r8$lambda$HEvbBaVkS3tygf2fstRGhrdMj8k(AtomicBoolean atomicBoolean, Consumer consumer, AlertDialog alertDialog, int i) {
        atomicBoolean.set(true);
        consumer.accept(Boolean.FALSE);
    }

    public static void $r8$lambda$e_UUPM06Fsq_qCQnM0W1euYrafk(AtomicBoolean atomicBoolean, Consumer consumer, DialogInterface dialogInterface) {
        if (atomicBoolean.get()) {
            return;
        }
        consumer.accept(Boolean.FALSE);
    }

    public static Dialog createApkRestrictedDialog(final Context context, Theme.ResourcesProvider resourcesProvider) {
        return new AlertDialog.Builder(context, resourcesProvider).setMessage(LocaleController.getString(R.string.ApkRestricted)).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.m1937$r8$lambda$423SrzgdSx4Htk3AIZLaUXHAbI(context, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void m1937$r8$lambda$423SrzgdSx4Htk3AIZLaUXHAbI(Context context, AlertDialog alertDialog, int i) {
        try {
            context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
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
        BaseFragment lastFragment = baseFragment;
        boolean zBooleanValue = false;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long allowedPaidStars = StarsController.getAllowedPaidStars(tLObject);
                final long peer = StarsController.getPeer(tLObject);
                if (allowedPaidStars > 0) {
                    StarsController.getInstance(i).getBalance(true, new Runnable() {
                        @Override
                        public final void run() {
                            AlertsCreator.$r8$lambda$4f2RXDpSskM5bIoBqQs4mqEINPk(allowedPaidStars, i, peer);
                        }
                    }, true);
                }
            } else if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                showSimpleAlert(lastFragment, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout));
            } else {
                boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z) {
                    i2 = 5;
                    if (tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                        if (peerDialogId2 >= 0) {
                            firstName = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId2)));
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId2));
                            if (chat == null) {
                                firstName = "";
                            } else {
                                firstName = chat.title;
                            }
                        }
                        if (lastFragment == null) {
                            lastFragment = LaunchActivity.getLastFragment();
                        }
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, firstName));
                        MessagesController.getInstance(i).invalidateUserPremiumBlocked(peerDialogId2, 0);
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
                    } else if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError));
                    } else if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser));
                        } else {
                            showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup));
                        }
                    } else if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin));
                    } else if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid));
                    } else if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid));
                    } else if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang));
                    } else if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        showFloodWaitAlert(tL_error.text, lastFragment);
                    } else {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                } else if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                    if (lastFragment == null) {
                        lastFragment = LaunchActivity.getLastFragment();
                    }
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                    } else if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        showUpdateAppAlert(lastFragment.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                } else {
                    boolean z3 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (z3 || (tLObject instanceof TLRPC.TL_channels_editAdmin) || (tLObject instanceof TLRPC.TL_channels_inviteToChannel) || (tLObject instanceof TLRPC.TL_messages_addChatUser) || (tLObject instanceof TLRPC.TL_messages_startBot) || (tLObject instanceof TLRPC.TL_channels_editBanned) || (tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) || (tLObject instanceof TLRPC.TL_messages_editChatAdmin) || (tLObject instanceof TLRPC.TL_messages_migrateChat) || (tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (lastFragment != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (lastFragment.getParentActivity() != null) {
                                lastFragment.showDialog(new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 5, i, null));
                            } else if (z3 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                lastFragment.presentFragment(new TooManyCommunitiesActivity(0));
                            } else {
                                lastFragment.presentFragment(new TooManyCommunitiesActivity(1));
                            }
                            return null;
                        }
                        if (lastFragment != null) {
                            boolean zBooleanValue2 = (objArr == null || objArr.length <= 0) ? false : ((Boolean) objArr[0]).booleanValue();
                            if (objArr != null && objArr.length > 1) {
                                zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                            }
                            showAddUserAlert(tL_error, lastFragment, zBooleanValue2, zBooleanValue, tLObject);
                        } else if (tL_error.text.equals("PEER_FLOOD")) {
                            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, 1);
                        }
                    } else if (tLObject instanceof TLRPC.TL_messages_createChat) {
                        if (lastFragment == null) {
                            lastFragment = LaunchActivity.getLastFragment();
                        }
                        BaseFragment baseFragment2 = lastFragment;
                        if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (baseFragment2.getParentActivity() != null) {
                                baseFragment2.showDialog(new LimitReachedBottomSheet(baseFragment2, baseFragment2.getParentActivity(), 5, i, null));
                            } else {
                                baseFragment2.presentFragment(new TooManyCommunitiesActivity(2));
                            }
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            showFloodWaitAlert(tL_error.text, baseFragment2);
                        } else {
                            showAddUserAlert(tL_error, baseFragment2, false, false, tLObject);
                        }
                    } else if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        if (lastFragment == null) {
                            lastFragment = LaunchActivity.getLastFragment();
                        }
                        BaseFragment baseFragment3 = lastFragment;
                        if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (baseFragment3.getParentActivity() != null) {
                                baseFragment3.showDialog(new LimitReachedBottomSheet(baseFragment3, baseFragment3.getParentActivity(), 5, i, null));
                            } else {
                                baseFragment3.presentFragment(new TooManyCommunitiesActivity(2));
                            }
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            showFloodWaitAlert(tL_error.text, baseFragment3);
                        } else {
                            showAddUserAlert(tL_error, baseFragment3, false, false, tLObject);
                        }
                    } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                        if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                            if (lastFragment != null) {
                                showSimpleAlert(lastFragment, LocaleController.getString(R.string.EditMessageError));
                            } else {
                                showSimpleToast(null, LocaleController.getString(R.string.EditMessageError));
                            }
                        }
                    } else if (z || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
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
                        if (str2 != null && str2.startsWith("CHAT_SEND_") && tL_error.text.endsWith("FORBIDDEN")) {
                            String restrictedErrorText = tL_error.text;
                            TLRPC.Chat chat2 = peerDialogId < 0 ? MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId)) : null;
                            String str3 = tL_error.text;
                            str3.getClass();
                            switch (str3) {
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
                            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, restrictedErrorText);
                        } else {
                            String str4 = tL_error.text;
                            str4.getClass();
                            switch (str4) {
                                case "USER_BANNED_IN_CHANNEL":
                                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, Integer.valueOf(i2));
                                    break;
                                case "PEER_FLOOD":
                                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, 0);
                                    break;
                                case "SCHEDULE_TOO_MUCH":
                                    showSimpleToast(lastFragment, LocaleController.getString(R.string.MessageScheduledLimitReached));
                                    break;
                            }
                        }
                    } else if (tLObject instanceof TLRPC.TL_messages_importChatInvite) {
                        if (lastFragment == null) {
                            lastFragment = LaunchActivity.getLastFragment();
                        }
                        BaseFragment baseFragment4 = lastFragment;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            showSimpleAlert(baseFragment4, LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                            showSimpleAlert(baseFragment4, LocaleController.getString(R.string.JoinToGroupErrorFull));
                        } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (baseFragment4.getParentActivity() != null) {
                                baseFragment4.showDialog(new LimitReachedBottomSheet(baseFragment4, baseFragment4.getParentActivity(), 5, i, null));
                            } else {
                                baseFragment4.presentFragment(new TooManyCommunitiesActivity(0));
                            }
                        } else if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                            showSimpleAlert(baseFragment4, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired));
                        } else {
                            showSimpleAlert(baseFragment4, LocaleController.getString(R.string.JoinToGroupErrorNotExist));
                        }
                    } else if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                        if (lastFragment != null && lastFragment.getParentActivity() != null) {
                            Toast.makeText(lastFragment.getParentActivity(), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text, 0).show();
                        }
                    } else {
                        if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) {
                                return showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                            }
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                                return showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                            }
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                return showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                            }
                            return showSimpleAlert(lastFragment, tL_error.text);
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
                                return showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                        } else {
                            if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                if (tL_error.code == 400) {
                                    return showSimpleAlert(lastFragment, LocaleController.getString(R.string.CancelLinkExpired));
                                }
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    return showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                }
                                return showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                            }
                            if (tLObject instanceof TL_account.changePhone) {
                                if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidPhoneNumber));
                                } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                } else if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden));
                                } else {
                                    showSimpleAlert(lastFragment, tL_error.text);
                                }
                            } else if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                    LoginActivity.needShowInvalidAlert(lastFragment, (String) objArr[0], false);
                                } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.InvalidCode));
                                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.CodeExpired));
                                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                } else if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                    showSimpleAlert(lastFragment, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]));
                                } else if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                    LoginActivity.needShowInvalidAlert(lastFragment, (String) objArr[0], true);
                                } else {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                                }
                            } else if (tLObject instanceof TL_account.updateUsername) {
                                String str5 = tL_error.text;
                                str5.getClass();
                                if (str5.equals("USERNAME_INVALID")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.UsernameInvalid));
                                } else if (str5.equals("USERNAME_OCCUPIED")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.UsernameInUse));
                                } else {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred));
                                }
                            } else if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.FloodWait));
                                } else {
                                    showSimpleAlert(lastFragment, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                                }
                            } else if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    showSimpleToast(lastFragment, getFloodWaitString(tL_error.text));
                                } else {
                                    showSimpleToast(lastFragment, tL_error.text);
                                }
                            } else if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                String str6 = tL_error.text;
                                str6.getClass();
                                if (str6.equals("BOT_PRECHECKOUT_FAILED")) {
                                    showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                } else if (str6.equals("PAYMENT_FAILED")) {
                                    showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentFailed));
                                } else {
                                    showSimpleToast(lastFragment, tL_error.text);
                                }
                            } else if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                String str7 = tL_error.text;
                                str7.getClass();
                                if (str7.equals("SHIPPING_NOT_AVAILABLE")) {
                                    showSimpleToast(lastFragment, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                } else {
                                    showSimpleToast(lastFragment, tL_error.text);
                                }
                            } else if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                showSimpleAlert(lastFragment, LocaleController.getString(R.string.PaymentConfirmationError) + "\n" + tL_error.text);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void $r8$lambda$4f2RXDpSskM5bIoBqQs4mqEINPk(long j, int i, long j2) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        new StarsIntroActivity.StarsNeededSheet(activity, darkThemeResourceProvider, j, 13, DialogObject.getShortName(i, j2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$JiwJr3bR3ySTvE4ZdMp08xfUBy0();
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
                    Browser.openUrl(context, BuildVars.PLAYSTORE_APP_URL);
                }
            });
        }
        return builder.show();
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
                    launchActivity.presentFragment(new LanguageSelectActivity());
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
                    AlertsCreator.$r8$lambda$6ZqQMNFwAbwiSWlJWIeA75Lfd6A(tL_langPackLanguage, launchActivity, alertDialog, i);
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

    public static void $r8$lambda$6ZqQMNFwAbwiSWlJWIeA75Lfd6A(TLRPC.TL_langPackLanguage tL_langPackLanguage, LaunchActivity launchActivity, AlertDialog alertDialog, int i) {
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
        map.put("info1", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
        map.put("info2", Integer.valueOf(Theme.getColor(i, resourcesProvider)));
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
            return builder;
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(str3, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.$r8$lambda$m_KswKeRAssHkiLhfDbnwtSAr5M(runnable, alertDialog, i);
            }
        });
        return builder;
    }

    public static void $r8$lambda$m_KswKeRAssHkiLhfDbnwtSAr5M(Runnable runnable, AlertDialog alertDialog, int i) {
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

    public static void createStoriesAlbumEnterName(Context context, BaseFragment baseFragment, String str, String str2, String str3, String str4, String str5, Theme.ResourcesProvider resourcesProvider, MessagesStorage.StringCallback stringCallback) {
        createSimpleTextInputAlert(context, baseFragment, str, str2, str3, str4, 12, str5, resourcesProvider, stringCallback);
    }

    public static void createSimpleTextInputAlert(Context context, final BaseFragment baseFragment, String str, String str2, String str3, String str4, final int i, String str5, Theme.ResourcesProvider resourcesProvider, final MessagesStorage.StringCallback stringCallback) {
        final Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
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
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return AlertsCreator.$r8$lambda$AwoAOrUvysrgnd0Ax8bTi1NNwP0(editTextBoldCursor, i, stringCallback, alertDialogArr, currentFocus, textView, i3, keyEvent);
            }
        });
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

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
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.06f));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 20.0f, 9.0f, 20.0f, 9.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
        builder.setPositiveButton(str5, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.$r8$lambda$VsuoOj6LgHZM26KtLRCL7eTiDlo(editTextBoldCursor, i, stringCallback, alertDialog, i3);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                alertDialog.dismiss();
            }
        });
        alertDialogArr[0] = builder.create();
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, baseFragment.getClassGuid());
        }
        alertDialogArr[0].setDismissDialogByButtons(false);
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.m1935$r8$lambda$0gG6wS6rVuahA1HzAWarVn01Bo(editTextBoldCursor, baseFragment, activityFindActivity, dialogInterface);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$ybbFo4N65zXy_x4GVHtgSmHtb9U(editTextBoldCursor, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static boolean $r8$lambda$AwoAOrUvysrgnd0Ax8bTi1NNwP0(EditTextBoldCursor editTextBoldCursor, int i, MessagesStorage.StringCallback stringCallback, AlertDialog[] alertDialogArr, View view, TextView textView, int i2, KeyEvent keyEvent) {
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

    public static void $r8$lambda$VsuoOj6LgHZM26KtLRCL7eTiDlo(EditTextBoldCursor editTextBoldCursor, int i, MessagesStorage.StringCallback stringCallback, AlertDialog alertDialog, int i2) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (strTrim.length() > i || strTrim.isEmpty()) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            stringCallback.run(strTrim);
            alertDialog.dismiss();
        }
    }

    public static void m1935$r8$lambda$0gG6wS6rVuahA1HzAWarVn01Bo(EditTextBoldCursor editTextBoldCursor, BaseFragment baseFragment, Activity activity, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (baseFragment != null) {
            AndroidUtilities.requestAdjustResize(activity, baseFragment.getClassGuid());
        }
    }

    public static void $r8$lambda$ybbFo4N65zXy_x4GVHtgSmHtb9U(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void showAddLinkToPoll(Context context, Theme.ResourcesProvider resourcesProvider, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, final Runnable runnable) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
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
                return AlertsCreator.$r8$lambda$ISGHVganXhbap0xqfzUQvvZf8iE(editTextBoldCursor, callback, alertDialogArr, currentFocus, textView, i2, keyEvent);
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.06f));
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
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.$r8$lambda$gG9xjEcjlYHYWcSNM7cus94BWsQ(editTextBoldCursor, callback, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                alertDialog.dismiss();
            }
        });
        if (runnable != null) {
            builder.setNeutralButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.m1967$r8$lambda$QBsRViuFHoT2tZXxJrB59PHg(runnable, alertDialog, i2);
                }
            });
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.setDismissDialogByButtons(false);
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$ADkHyuSF8XrVGKedIjp7IUXCv8c(editTextBoldCursor, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        TextView textView = (TextView) alertDialogArr[0].getButton(-3);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static boolean $r8$lambda$ISGHVganXhbap0xqfzUQvvZf8iE(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog[] alertDialogArr, View view, TextView textView, int i, KeyEvent keyEvent) {
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

    public static void $r8$lambda$gG9xjEcjlYHYWcSNM7cus94BWsQ(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        String strTrim = editTextBoldCursor.getText().toString().trim();
        if (!isValidUrl(strTrim)) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            callback.run(strTrim);
            alertDialog.dismiss();
        }
    }

    public static void m1967$r8$lambda$QBsRViuFHoT2tZXxJrB59PHg(Runnable runnable, AlertDialog alertDialog, int i) {
        runnable.run();
        alertDialog.dismiss();
    }

    public static void $r8$lambda$ADkHyuSF8XrVGKedIjp7IUXCv8c(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void showAddBrowserException(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, final Utilities.Callback callback) {
        int i;
        int i2;
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        if (z) {
            i = R.string.BrowserSettingsAddTitle;
        } else {
            i = R.string.BrowserSettingsAddTitleExternal;
        }
        builder.setTitle(LocaleController.getString(i));
        if (z) {
            i2 = R.string.BrowserSettingsAddText;
        } else {
            i2 = R.string.BrowserSettingsAddTextExternal;
        }
        builder.setMessage(LocaleController.getString(i2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i3 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i3, resourcesProvider));
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
        gradientDrawable.setColor(Theme.multAlpha(Theme.getColor(i3, resourcesProvider), 0.06f));
        editTextBoldCursor.setBackground(gradientDrawable);
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$ZItObE1VZ1DDG7W_v3Fox3KBpr0(editTextBoldCursor, callback, alertDialogArr, currentFocus);
            }
        };
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                return AlertsCreator.$r8$lambda$VRQrE8qeVBub6KxkCgxwZs0jPpo(runnable, textView, i4, keyEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 4.0f, 24.0f, 9.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.setDismissDialogByButtons(false);
        alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
        });
        alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$iT0Q1OqWEhHXGl71eDAXEy3kh3U(editTextBoldCursor, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public static void $r8$lambda$ZItObE1VZ1DDG7W_v3Fox3KBpr0(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, AlertDialog[] alertDialogArr, View view) {
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

    public static boolean $r8$lambda$VRQrE8qeVBub6KxkCgxwZs0jPpo(Runnable runnable, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        runnable.run();
        return true;
    }

    public static void $r8$lambda$iT0Q1OqWEhHXGl71eDAXEy3kh3U(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    private static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return URL_PATTERN.matcher(str.trim()).matches();
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

    public static AlertDialog createSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, CharSequence charSequence, String str2, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(str);
        builder.setMessage(charSequence);
        builder.setPositiveButton(str2, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.$r8$lambda$7o7k7qpPmmMfrAymo4NyxHyiJ6c(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void $r8$lambda$7o7k7qpPmmMfrAymo4NyxHyiJ6c(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static AlertDialog showSimpleConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        AlertDialog alertDialogCreateSimpleConfirmAlert = createSimpleConfirmAlert(context, resourcesProvider, str, charSequence, str2, runnable);
        alertDialogCreateSimpleConfirmAlert.show();
        if (z && (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
        return alertDialogCreateSimpleConfirmAlert;
    }

    public static AlertDialog showSimpleConfirmAlert(BaseFragment baseFragment, String str, CharSequence charSequence, String str2, boolean z, Runnable runnable) {
        TextView textView;
        AlertDialog alertDialogCreateSimpleConfirmAlert = createSimpleConfirmAlert(baseFragment.getContext(), baseFragment.getResourceProvider(), str, charSequence, str2, runnable);
        baseFragment.showDialog(alertDialogCreateSimpleConfirmAlert);
        if (z && (textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1)) != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
        return alertDialogCreateSimpleConfirmAlert;
    }

    public static AlertDialog showBanGroupCreatorFromCommunityJoinedChatsAlert(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, ArrayList arrayList, final MessagesStorage.LongCallback longCallback) {
        boolean z;
        String pluralString;
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = 1;
        linearLayout.setOrientation(1);
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.CommunityBanUserTitle));
        int i3 = 0;
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i, j))));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setView(linearLayout);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4 += i2;
            Long l = (Long) obj;
            final long jLongValue = l.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(jLongValue);
            if (chat != null) {
                CommunityBanGroupConfirmCell communityBanGroupConfirmCell = new CommunityBanGroupConfirmCell(context, resourcesProvider, i3);
                communityBanGroupConfirmCell.titleView.setText(DialogObject.getName(chat));
                TextView textView = communityBanGroupConfirmCell.subtitleView;
                if (chatFull != null) {
                    z = false;
                    pluralString = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[i3]);
                } else {
                    z = false;
                    pluralString = null;
                }
                textView.setText(pluralString);
                communityBanGroupConfirmCell.avatarView.setForUserOrChat(chat, new AvatarDrawable(chat));
                communityBanGroupConfirmCell.setBackground(Theme.getSelectorDrawable(z));
                communityBanGroupConfirmCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.$r8$lambda$Htpg1_4_5jM2uBTX0BHN7zjSByY(alertDialogArr, longCallback, jLongValue, view);
                    }
                });
                linearLayout.addView(communityBanGroupConfirmCell, LayoutHelper.createLinear(-1, -2));
            }
            i2 = 1;
            i3 = 0;
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static void $r8$lambda$Htpg1_4_5jM2uBTX0BHN7zjSByY(AlertDialog[] alertDialogArr, MessagesStorage.LongCallback longCallback, long j, View view) {
        alertDialogArr[0].dismiss();
        longCallback.run(-j);
    }

    public static AlertDialog showBanGroupCreatorFromCommunityConfirmAlert(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, ArrayList arrayList, final MessagesStorage.LongCallback longCallback, final Runnable runnable) {
        boolean z;
        String pluralString;
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = 1;
        linearLayout.setOrientation(1);
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.CommunityBanWarningTitle));
        int i3 = 0;
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i, j))));
        builder.setPositiveButton(LocaleController.getString(R.string.Ban), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                AlertsCreator.$r8$lambda$mC3OtQ0uEbOu4bH2FqVHadGoRVg(runnable, alertDialog, i4);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setView(linearLayout);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4 += i2;
            Long l = (Long) obj;
            final long jLongValue = l.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(jLongValue);
            if (chat != null) {
                CommunityBanGroupConfirmCell communityBanGroupConfirmCell = new CommunityBanGroupConfirmCell(context, resourcesProvider);
                communityBanGroupConfirmCell.titleView.setText(DialogObject.getName(chat));
                TextView textView = communityBanGroupConfirmCell.subtitleView;
                if (chatFull != null) {
                    z = false;
                    pluralString = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[i3]);
                } else {
                    z = false;
                    pluralString = null;
                }
                textView.setText(pluralString);
                communityBanGroupConfirmCell.avatarView.setForUserOrChat(chat, new AvatarDrawable(chat));
                communityBanGroupConfirmCell.setBackground(Theme.getSelectorDrawable(z));
                communityBanGroupConfirmCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.$r8$lambda$ifAR8QapK5_4z3Au3xJHUzB0djk(alertDialogArr, longCallback, jLongValue, view);
                    }
                });
                linearLayout.addView(communityBanGroupConfirmCell, LayoutHelper.createLinear(-1, -2));
            }
            i2 = 1;
            i3 = 0;
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogArr[0] = alertDialogCreate;
        alertDialogCreate.show();
        TextView textView2 = (TextView) alertDialogCreate.getButton(-1);
        if (textView2 != null) {
            textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
        return alertDialogCreate;
    }

    public static void $r8$lambda$mC3OtQ0uEbOu4bH2FqVHadGoRVg(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$ifAR8QapK5_4z3Au3xJHUzB0djk(AlertDialog[] alertDialogArr, MessagesStorage.LongCallback longCallback, long j, View view) {
        alertDialogArr[0].dismiss();
        longCallback.run(-j);
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
                AlertsCreator.$r8$lambda$1aIuKIILGAVlIwZXhXuc9nfmWu8(runnable, dialogInterface);
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
                AlertsCreator.$r8$lambda$sBl9EkEb9VTN0vdgyWvB7ufGqJc(checkBoxCellArr, view);
            }
        });
        builder.setView(linearLayout);
        final TLRPC.Chat chat2 = chat;
        final TLRPC.User user2 = user;
        builder.setPositiveButton(LocaleController.getString(R.string.BlockAndDeleteReplies), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                AlertsCreator.m1989$r8$lambda$nZty1amtSGod2dJ4IIrC60e7KI(user2, accountInstance, chatActivity, chat2, messageObject, checkBoxCellArr, resourcesProvider, alertDialog, i);
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

    public static void $r8$lambda$1aIuKIILGAVlIwZXhXuc9nfmWu8(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$sBl9EkEb9VTN0vdgyWvB7ufGqJc(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void m1989$r8$lambda$nZty1amtSGod2dJ4IIrC60e7KI(TLRPC.User user, final AccountInstance accountInstance, ChatActivity chatActivity, TLRPC.Chat chat, MessageObject messageObject, CheckBoxCell[] checkBoxCellArr, Theme.ResourcesProvider resourcesProvider, AlertDialog alertDialog, int i) {
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
                AlertsCreator.$r8$lambda$Wui4zyolXQCx9ysbyHxqZCWt420(accountInstance, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$Wui4zyolXQCx9ysbyHxqZCWt420(AccountInstance accountInstance, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void showBlockReportSpamAlert(BaseFragment baseFragment, long j, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        long j2;
        boolean z2;
        CharSequence string;
        final CheckBoxCell[] checkBoxCellArr;
        TextView textView;
        CharSequence string2;
        int i;
        final CheckBoxCell[] checkBoxCellArr2;
        LinearLayout linearLayout;
        int i2;
        int iDp;
        int iDp2;
        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        ?? r4 = 1;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = baseFragment.getAccountInstance();
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), resourcesProvider2);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(baseFragment.getCurrentAccount());
        if (encryptedChat == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("dialog_bar_report");
            j2 = j;
            sb.append(j2);
            if (!notificationsSettings.getBoolean(sb.toString(), false)) {
                z2 = false;
            }
            if (user != null) {
                builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user)));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user))));
                string2 = LocaleController.getString(R.string.BlockContact);
                checkBoxCellArr2 = new CheckBoxCell[2];
                linearLayout = new LinearLayout(baseFragment.getParentActivity());
                linearLayout.setOrientation(1);
                i2 = 0;
                for (i = 2; i2 < i; i = 2) {
                    if (i2 == 0 || z2) {
                        CheckBoxCell checkBoxCell = new CheckBoxCell(baseFragment.getParentActivity(), r4, resourcesProvider2);
                        checkBoxCellArr2[i2] = checkBoxCell;
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        checkBoxCellArr2[i2].setTag(Integer.valueOf(i2));
                        if (i2 == 0) {
                            checkBoxCellArr2[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", r4, false);
                        } else {
                            checkBoxCellArr2[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false);
                        }
                        GLSurfaceView gLSurfaceView = checkBoxCellArr2[i2];
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
                        gLSurfaceView.setPadding(iDp, 0, iDp2, 0);
                        linearLayout.addView(checkBoxCellArr2[i2], LayoutHelper.createLinear(-1, -2));
                        checkBoxCellArr2[i2].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                AlertsCreator.$r8$lambda$7mRfxjOHDJL1Si1xUrnwuBHK5zQ(checkBoxCellArr2, view);
                            }
                        });
                    } else {
                        string2 = string2;
                    }
                    i2++;
                    resourcesProvider2 = resourcesProvider;
                    string2 = string2;
                    r4 = 1;
                }
                builder.setView(linearLayout);
                checkBoxCellArr = checkBoxCellArr2;
                string = string2;
            } else {
                if (chat == null && z) {
                    builder.setTitle(LocaleController.getString(R.string.ReportUnrelatedGroup));
                    if (chatFull != null) {
                        TLRPC.ChannelLocation channelLocation = chatFull.location;
                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address)));
                        } else {
                            builder.setMessage(LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress));
                        }
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress));
                    }
                } else {
                    builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                    if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                        builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertChannel));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                    }
                }
                string = LocaleController.getString(R.string.ReportChat);
                checkBoxCellArr = null;
            }
            final long j3 = j2;
            builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    AlertsCreator.$r8$lambda$vnc7xQJSMx1gukA4o_qv4Liibm4(user, accountInstance, checkBoxCellArr, j3, chat, encryptedChat, z, intCallback, alertDialog, i3);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
        j2 = j;
        z2 = true;
        if (user != null) {
            builder.setTitle(LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user)));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user))));
            string2 = LocaleController.getString(R.string.BlockContact);
            checkBoxCellArr2 = new CheckBoxCell[2];
            linearLayout = new LinearLayout(baseFragment.getParentActivity());
            linearLayout.setOrientation(1);
            i2 = 0;
            while (i2 < i) {
                if (i2 == 0) {
                    CheckBoxCell checkBoxCell2 = new CheckBoxCell(baseFragment.getParentActivity(), r4, resourcesProvider2);
                    checkBoxCellArr2[i2] = checkBoxCell2;
                    checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr2[i2].setTag(Integer.valueOf(i2));
                    if (i2 == 0) {
                        checkBoxCellArr2[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", r4, false);
                    } else {
                        checkBoxCellArr2[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false);
                    }
                    GLSurfaceView gLSurfaceView2 = checkBoxCellArr2[i2];
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
                    gLSurfaceView2.setPadding(iDp, 0, iDp2, 0);
                    linearLayout.addView(checkBoxCellArr2[i2], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr2[i2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.$r8$lambda$7mRfxjOHDJL1Si1xUrnwuBHK5zQ(checkBoxCellArr2, view);
                        }
                    });
                } else {
                    CheckBoxCell checkBoxCell3 = new CheckBoxCell(baseFragment.getParentActivity(), r4, resourcesProvider2);
                    checkBoxCellArr2[i2] = checkBoxCell3;
                    checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCellArr2[i2].setTag(Integer.valueOf(i2));
                    if (i2 == 0) {
                        checkBoxCellArr2[i2].setText(LocaleController.getString(R.string.DeleteReportSpam), "", r4, false);
                    } else {
                        checkBoxCellArr2[i2].setText(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false);
                    }
                    GLSurfaceView gLSurfaceView3 = checkBoxCellArr2[i2];
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
                    gLSurfaceView3.setPadding(iDp, 0, iDp2, 0);
                    linearLayout.addView(checkBoxCellArr2[i2], LayoutHelper.createLinear(-1, -2));
                    checkBoxCellArr2[i2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.$r8$lambda$7mRfxjOHDJL1Si1xUrnwuBHK5zQ(checkBoxCellArr2, view);
                        }
                    });
                }
                i2++;
                resourcesProvider2 = resourcesProvider;
                string2 = string2;
                r4 = 1;
            }
            builder.setView(linearLayout);
            checkBoxCellArr = checkBoxCellArr2;
            string = string2;
        } else {
            if (chat == null) {
                builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                if (!ChatObject.isChannel(chat)) {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ReportSpamAlertGroup));
                }
            } else {
                builder.setTitle(LocaleController.getString(R.string.ReportSpamTitle));
                if (!ChatObject.isChannel(chat)) {
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
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.$r8$lambda$vnc7xQJSMx1gukA4o_qv4Liibm4(user, accountInstance, checkBoxCellArr, j4, chat, encryptedChat, z, intCallback, alertDialog, i3);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        textView = (TextView) alertDialogCreate2.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void $r8$lambda$7mRfxjOHDJL1Si1xUrnwuBHK5zQ(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void $r8$lambda$vnc7xQJSMx1gukA4o_qv4Liibm4(TLRPC.User user, AccountInstance accountInstance, CheckBoxCell[] checkBoxCellArr, long j, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
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

    public static void showCustomNotificationsDialog(BaseFragment baseFragment, long j, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3, MessagesStorage.IntCallback intCallback) {
        showCustomNotificationsDialog(baseFragment, j, i, i2, arrayList, arrayList2, i3, intCallback, null);
    }

    public static void showCustomNotificationsDialog(final BaseFragment baseFragment, long j, final int i, final int i2, final ArrayList arrayList, final ArrayList arrayList2, final int i3, final MessagesStorage.IntCallback intCallback, final MessagesStorage.IntCallback intCallback2) {
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
        final ?? builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        int i5 = 0;
        ?? r0 = linearLayout;
        while (i5 < 5) {
            if (strArr[i5] == null) {
                r13 = r0;
            } else {
                ?? textView = new TextView(baseFragment.getParentActivity());
                Drawable drawable = baseFragment.getParentActivity().getResources().getDrawable(iArr[i5]);
                if (i5 == 4) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_text_RedRegular), PorterDuff.Mode.MULTIPLY));
                } else {
                    textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                    drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogIcon), PorterDuff.Mode.MULTIPLY));
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
                        AlertsCreator.m1988$r8$lambda$lVM18fDfbPN8jTUkYUZ879ND04(j2, i3, zIsGlobalNotificationsEnabled, i, intCallback2, i2, baseFragment, arrayList, arrayList2, intCallback, builder, view);
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

    public static void m1988$r8$lambda$lVM18fDfbPN8jTUkYUZ879ND04(long j, int i, boolean z, int i2, MessagesStorage.IntCallback intCallback, int i3, BaseFragment baseFragment, ArrayList arrayList, ArrayList arrayList2, MessagesStorage.IntCallback intCallback2, AlertDialog.Builder builder, View view) {
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
                    if (iIntValue != i4 && !z) {
                        intCallback.run(0);
                    } else {
                        intCallback.run(1);
                    }
                }
                if (j == 0) {
                    NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i3, Integer.MAX_VALUE);
                }
            }
            i4 = 4;
            NotificationsController.getInstance(i).muteUntil(j, i2, currentTime);
            if (j != 0) {
                if (iIntValue != i4) {
                    intCallback.run(1);
                } else {
                    intCallback.run(1);
                }
            }
            if (j == 0) {
                NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i3, Integer.MAX_VALUE);
            }
        } else if (j != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            baseFragment.presentFragment(new ProfileNotificationsActivity(bundle));
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
                    AlertsCreator.$r8$lambda$D9oh4ZDfJDJuAdh2qMMwYPcPcvQ(arrayList2, runnable, builder, view);
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

    public static void $r8$lambda$D9oh4ZDfJDJuAdh2qMMwYPcPcvQ(ArrayList arrayList, Runnable runnable, AlertDialog.Builder builder, View view) {
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

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, boolean z4, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, z2, z3, z4, progress, (TLRPC.WebPage) null, resourcesProvider);
    }

    public static void showOpenUrlAlert(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, Browser.Progress progress, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(context, str, z, z2, z3, z4, j, progress, null, resourcesProvider);
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, boolean z3, boolean z4, Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        showOpenUrlAlert(baseFragment.getParentActivity(), str, z, z2, z3, z4, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getInlineReturn() : 0L, progress, webPage, resourcesProvider);
    }

    public static void showOpenUrlAlert(final Context context, final String str, boolean z, final boolean z2, boolean z3, boolean z4, final long j, final Browser.Progress progress, TLRPC.WebPage webPage, Theme.ResourcesProvider resourcesProvider) {
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
                    strReplaceHostname = str;
                }
            } else {
                strReplaceHostname = str;
            }
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    Browser.openUrl(context, Uri.parse(str), j == 0, z2, progress);
                }
            };
            AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
            TextView textView = new TextView(context);
            textView.setText(strReplaceHostname);
            textView.setTextSize(1, 14.0f);
            int i = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.06f));
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
            builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    runnable.run();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
    }

    public static void showOpenExternalBrowserAlert(Context context, Theme.ResourcesProvider resourcesProvider, String str, boolean z, boolean z2, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final AlertDialog[] alertDialogArr = new AlertDialog[1];
            AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
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
            gradientDrawable.setColor(Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.06f));
            textView.setBackground(gradientDrawable);
            final CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, resourcesProvider);
            checkBoxCell.setMultiline(true);
            checkBoxCell.getTextView().getLayoutParams().width = -1;
            checkBoxCell.getTextView().setSingleLine(false);
            checkBoxCell.getTextView().setMaxLines(3);
            checkBoxCell.getTextView().setTextSize(1, 16.0f);
            checkBoxCell.setText(LocaleController.getString(z ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false);
            checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CheckBoxCell checkBoxCell2 = checkBoxCell;
                    checkBoxCell2.setChecked(!checkBoxCell2.isChecked(), true);
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 22.0f, 4.0f, 22.0f, 9.0f));
            if (z2) {
                linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2, 3, 8, 6, 8, 4));
            }
            builder.setView(linearLayout);
            builder.setWidth(Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100));
            builder.setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.$r8$lambda$2T2SCKet91jbAfyt0rAtu3bH0sY(callback2, checkBoxCell, alertDialogArr, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.$r8$lambda$zQAevWB6uuL7DP9vk4cQmoCklys(callback2, checkBoxCell, alertDialogArr, alertDialog, i2);
                }
            });
            alertDialogArr[0] = builder.show();
        }
    }

    public static void $r8$lambda$2T2SCKet91jbAfyt0rAtu3bH0sY(Utilities.Callback2 callback2, CheckBoxCell checkBoxCell, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        callback2.run(Boolean.TRUE, Boolean.valueOf(checkBoxCell.isChecked()));
        AlertDialog alertDialog2 = alertDialogArr[0];
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
    }

    public static void $r8$lambda$zQAevWB6uuL7DP9vk4cQmoCklys(Utilities.Callback2 callback2, CheckBoxCell checkBoxCell, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        callback2.run(Boolean.FALSE, Boolean.valueOf(checkBoxCell.isChecked()));
        AlertDialog alertDialog2 = alertDialogArr[0];
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
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

    public static void performAskAQuestion(final BaseFragment baseFragment) {
        String string;
        final int currentAccount = baseFragment.getCurrentAccount();
        final SharedPreferences mainSettings = MessagesController.getMainSettings(currentAccount);
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(mainSettings, "support_id2", 0L);
        TLRPC.User user = null;
        if (prefIntOrLong != 0) {
            TLRPC.User user2 = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(prefIntOrLong));
            if (user2 != null || (string = mainSettings.getString("support_user", null)) == null) {
                user = user2;
            } else {
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
                    } else {
                        user = user2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        if (user == null) {
            final AlertDialog alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
            alertDialog.setCanCancel(false);
            alertDialog.show();
            ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AlertsCreator.m1947$r8$lambda$DfSDyQJvVN5LJevi0cw_Sj1nE0(mainSettings, alertDialog, currentAccount, baseFragment, tLObject, tL_error);
                }
            });
            return;
        }
        MessagesController.getInstance(currentAccount).putUser(user, true);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        baseFragment.presentFragment(new ChatActivity(bundle));
    }

    public static void m1947$r8$lambda$DfSDyQJvVN5LJevi0cw_Sj1nE0(final SharedPreferences sharedPreferences, final AlertDialog alertDialog, final int i, final BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            final TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.m1971$r8$lambda$TLFygnMlUG_PIaKeYLD1x9mJgM(sharedPreferences, tL_help_support, alertDialog, i, baseFragment);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.m1939$r8$lambda$50UI4skuLQ_kxgSy6wU5uHII4c(alertDialog);
                }
            });
        }
    }

    public static void m1971$r8$lambda$TLFygnMlUG_PIaKeYLD1x9mJgM(SharedPreferences sharedPreferences, TLRPC.TL_help_support tL_help_support, AlertDialog alertDialog, int i, BaseFragment baseFragment) {
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

    public static void m1939$r8$lambda$50UI4skuLQ_kxgSy6wU5uHII4c(AlertDialog alertDialog) {
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
                AlertsCreator.$r8$lambda$08KK04yKjF8yptiAYmwP6Yc5EhI(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.create());
    }

    public static void $r8$lambda$08KK04yKjF8yptiAYmwP6Yc5EhI(Runnable runnable, AlertDialog alertDialog, int i) {
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
                AlertsCreator.m1966$r8$lambda$PDvkNJsF5cbbEBjcZiEaZNJtLw(user, baseFragment, builder, view);
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
                AlertsCreator.m1953$r8$lambda$HyH6bWL04JWAb9MyQvOd7B4a3E(runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        final AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate, false, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$zWjo8K8vCLEts9xdIJzE1WlUmxg(runnable2, dialogInterface);
            }
        });
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$QPMXv7V94bqPzWzZGqXZ5Qn1nIo(alertDialogCreate, context);
            }
        }));
    }

    public static void m1966$r8$lambda$PDvkNJsF5cbbEBjcZiEaZNJtLw(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void m1953$r8$lambda$HyH6bWL04JWAb9MyQvOd7B4a3E(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$zWjo8K8vCLEts9xdIJzE1WlUmxg(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$QPMXv7V94bqPzWzZGqXZ5Qn1nIo(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static void createBotLaunchAlert(final BaseFragment baseFragment, final AtomicBoolean atomicBoolean, final TLRPC.User user, final Runnable runnable) {
        ?? r18;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int iDp;
        int iDp2;
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
            protected void onMeasure(int i8, int i9) {
                super.onMeasure(i8, i9);
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
        } else {
            if (user.verified) {
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
                int color = Theme.getColor(Theme.key_chats_verifiedBackground);
                r18 = 0;
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
            if (LocaleController.isRTL) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$I_UIT43E6zXkAIT6ywH8QtQMN9M(user, baseFragment, builder, view);
                }
            });
            SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
            coloredImageSpan.setTopOffset(1);
            coloredImageSpan.setSize(AndroidUtilities.dp(10.0f));
            spannableStringValueOf.setSpan(coloredImageSpan, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
            textView.setText(spannableStringValueOf);
            z = LocaleController.isRTL;
            if (z) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            int i8 = i2 | 48;
            if (z) {
                i3 = 21;
            } else {
                i3 = 76;
            }
            float f = i3;
            if (z) {
                i4 = 76;
            } else {
                i4 = 21;
            }
            frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i8, f, 0.0f, i4, 0.0f));
            z2 = LocaleController.isRTL;
            if (z2) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            int i9 = i5 | 48;
            if (z2) {
                i6 = 21;
            } else {
                i6 = 76;
            }
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, i9, i6, 24.0f, z2 ? 76 : 21, 0.0f));
            if (LocaleController.isRTL) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
            if (atomicBoolean != null) {
                atomicBoolean.set(true);
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, baseFragment.getResourceProvider());
                checkBoxCellArr[r18] = checkBoxCell;
                checkBoxCell.allowMultiline();
                checkBoxCellArr[r18].setBackgroundDrawable(Theme.getSelectorDrawable(r18));
                CheckBoxCell checkBoxCell2 = checkBoxCellArr[r18];
                int i10 = R.string.OpenUrlOption2;
                Object[] objArr = new Object[1];
                objArr[r18] = UserObject.getUserName(user);
                checkBoxCell2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)), "", true, false);
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
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.$r8$lambda$zdtAh4DS2b_8DLLCSvqyh3xasps(atomicBoolean, view);
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
                public final void onClick(AlertDialog alertDialog, int i11) {
                    runnable.run();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            final AlertDialog alertDialogCreate = builder.create();
            baseFragment.showDialog(alertDialogCreate);
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.m1965$r8$lambda$Ot_y6Y6xcQUoS6nfW3cthhDiKc(alertDialogCreate, context);
                }
            }));
        }
        r18 = 0;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlue));
        textView2.setTextSize(1, 14.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i = 5;
        } else {
            i = 3;
        }
        textView2.setGravity(i | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$I_UIT43E6zXkAIT6ywH8QtQMN9M(user, baseFragment, builder, view);
            }
        });
        SpannableString spannableStringValueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan2.setTopOffset(1);
        coloredImageSpan2.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf2.setSpan(coloredImageSpan2, spannableStringValueOf2.length() - 1, spannableStringValueOf2.length(), 33);
        textView2.setText(spannableStringValueOf2);
        z = LocaleController.isRTL;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i11 = i2 | 48;
        if (z) {
            i3 = 21;
        } else {
            i3 = 76;
        }
        float f2 = i3;
        if (z) {
            i4 = 76;
        } else {
            i4 = 21;
        }
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, i11, f2, 0.0f, i4, 0.0f));
        z2 = LocaleController.isRTL;
        if (z2) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i12 = i5 | 48;
        if (z2) {
            i6 = 21;
        } else {
            i6 = 76;
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i12, i6, 24.0f, z2 ? 76 : 21, 0.0f));
        if (LocaleController.isRTL) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
            CheckBoxCell checkBoxCell4 = new CheckBoxCell(context, 1, baseFragment.getResourceProvider());
            checkBoxCellArr[r18] = checkBoxCell4;
            checkBoxCell4.allowMultiline();
            checkBoxCellArr[r18].setBackgroundDrawable(Theme.getSelectorDrawable(r18));
            CheckBoxCell checkBoxCell5 = checkBoxCellArr[r18];
            int i13 = R.string.OpenUrlOption2;
            Object[] objArr2 = new Object[1];
            objArr2[r18] = UserObject.getUserName(user);
            checkBoxCell5.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i13, objArr2)), "", true, false);
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
            checkBoxCellArr[0].setChecked(true, false);
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$zdtAh4DS2b_8DLLCSvqyh3xasps(atomicBoolean, view);
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
            public final void onClick(AlertDialog alertDialog, int i14) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        final AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.m1965$r8$lambda$Ot_y6Y6xcQUoS6nfW3cthhDiKc(alertDialogCreate2, context);
            }
        }));
    }

    public static void $r8$lambda$I_UIT43E6zXkAIT6ywH8QtQMN9M(TLRPC.User user, BaseFragment baseFragment, AlertDialog.Builder builder, View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        if (baseFragment.getMessagesController().checkCanOpenChat(bundle, baseFragment)) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$zdtAh4DS2b_8DLLCSvqyh3xasps(AtomicBoolean atomicBoolean, View view) {
        atomicBoolean.set(!atomicBoolean.get());
        ((CheckBoxCell) view).setChecked(atomicBoolean.get(), true);
    }

    public static void m1965$r8$lambda$Ot_y6Y6xcQUoS6nfW3cthhDiKc(AlertDialog alertDialog, Context context) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Browser.openUrl(context, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
    }

    public static boolean ensurePaidMessagesMultiConfirmationTopicKeys(int i, ArrayList arrayList, int i2, Utilities.Callback callback) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
        }
        return ensurePaidMessagesMultiConfirmation(i, new ArrayList(hashSet), i2, callback);
    }

    public static boolean ensurePaidMessagesMultiConfirmation(final int i, final ArrayList arrayList, int i2, final Utilities.Callback callback) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        int i3 = 1;
        if (callback == null) {
            return false;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        final HashMap map = new HashMap();
        int size = arrayList.size();
        long j = 0;
        int i4 = 0;
        boolean z = true;
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4 += i3;
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i).getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i).isUserContactBlocked(jLongValue));
            }
            map.put(l, Long.valueOf(sendPaidMessagesStars));
            j += sendPaidMessagesStars;
            StarsController.getInstance(i).sendingMessagesCount.put(l, Integer.valueOf(i2));
            if (sendPaidMessagesStars > 0) {
                i5++;
            }
            if (sendPaidMessagesStars > 0 && z) {
                if (MessagesController.getInstance(i).getMainSettings().getLong("ask_paid_message_" + jLongValue + "_price", 0L) < sendPaidMessagesStars) {
                    z = false;
                }
            }
            i3 = 1;
        }
        final long jMax = j * ((long) Math.max(1, i2));
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
            public final void run(Object obj2) {
                AlertsCreator.m1991$r8$lambda$qteJxMvPmrnMXT0INQ_tQkGWDM(i, arrayList, jMax, activity, resourcesProvider, callback, map, (Boolean) obj2);
            }
        }, resourcesProvider);
        return true;
    }

    public static void m1991$r8$lambda$qteJxMvPmrnMXT0INQ_tQkGWDM(final int i, final ArrayList arrayList, final long j, final Activity activity, final Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback, final HashMap map, Boolean bool) {
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
                editorEdit.putLong("ask_paid_message_" + jLongValue + "_price", sendPaidMessagesStars);
                StarsController.getInstance(i).justAgreedToNotAskDialogs.put(l, Long.valueOf(System.currentTimeMillis()));
            }
            editorEdit.apply();
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$AetVSz4TQqOlqMVL2jP2ZlSWqOY(i, j, activity, arrayList, resourcesProvider, callback, map);
            }
        };
        if (!StarsController.getInstance(i).balanceAvailable()) {
            StarsController.getInstance(i).invalidateBalance(runnable);
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$AetVSz4TQqOlqMVL2jP2ZlSWqOY(int i, long j, Activity activity, ArrayList arrayList, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback, final HashMap map) {
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
        if (sendPaidMessagesStars <= 0) {
            return false;
        }
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        StringBuilder sb = new StringBuilder();
        sb.append("ask_paid_message_");
        sb.append(j);
        sb.append("_price");
        return sendPaidMessagesStars > mainSettings.getLong(sb.toString(), 0L);
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
        final long j3 = ((long) i2) * sendPaidMessagesStars;
        StarsController.getInstance(i).sendingMessagesCount.put(Long.valueOf(j), Integer.valueOf(i2));
        if (j3 <= 0 || j2 == j3) {
            callback.run(Long.valueOf(j3));
            return false;
        }
        final long j4 = sendPaidMessagesStars;
        showPayForMessageAlert(i, j, j4, i2, new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$5aUufNy1MDZKIkBKmtkSXzIDxdE(i, j3, j, callback, j4);
            }
        });
        return true;
    }

    public static void $r8$lambda$5aUufNy1MDZKIkBKmtkSXzIDxdE(final int i, final long j, final long j2, final Utilities.Callback callback, final long j3) {
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$zCy7pB1CXr7OX5ar9_SX12XHyPA(i, j, j2, callback, j3);
            }
        };
        if (!StarsController.getInstance(i).balanceAvailable()) {
            StarsController.getInstance(i).invalidateBalance(runnable);
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$zCy7pB1CXr7OX5ar9_SX12XHyPA(int i, long j, long j2, final Utilities.Callback callback, final long j3) {
        Theme.ResourcesProvider darkThemeResourceProvider;
        if (StarsController.getInstance(i).getBalance().amount < j) {
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
            new StarsIntroActivity.StarsNeededSheet(activity, resourcesProvider, j, 13, DialogObject.getShortName(i, j2), new Runnable() {
                @Override
                public final void run() {
                    callback.run(Long.valueOf(j3));
                }
            }, j2).show();
            return;
        }
        callback.run(Long.valueOf(j3));
    }

    public static void showPayForMessageAlert(final int i, final long j, final long j2, int i2, final Runnable runnable) {
        Theme.ResourcesProvider darkThemeResourceProvider;
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
        if (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) {
            darkThemeResourceProvider = new DarkThemeResourceProvider();
        } else {
            darkThemeResourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        }
        Theme.ResourcesProvider resourcesProvider = darkThemeResourceProvider;
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
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) (((long) i2) * j2))));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i2)));
        }
        showAlertWithCheckboxWithBalance(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                AlertsCreator.$r8$lambda$ut4Kz8uwJxaVhrM5ejsodrNuCYE(i, j, j2, runnable, (Boolean) obj);
            }
        }, resourcesProvider);
    }

    public static void $r8$lambda$ut4Kz8uwJxaVhrM5ejsodrNuCYE(int i, long j, long j2, Runnable runnable, Boolean bool) {
        if (bool.booleanValue()) {
            MessagesController.getInstance(i).getMainSettings().edit().putLong("ask_paid_message_" + j + "_price", j2).apply();
            StarsController.getInstance(i).justAgreedToNotAskDialogs.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static AlertDialog showAlertWithCheckbox(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        return showAlertWithCheckbox(context, charSequence, charSequence2, charSequence3, charSequence4, callback, resourcesProvider, false);
    }

    public static AlertDialog showAlertWithCheckboxWithBalance(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        return showAlertWithCheckbox(context, charSequence, charSequence2, charSequence3, charSequence4, callback, resourcesProvider, true);
    }

    public static AlertDialog showAlertWithCheckbox(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (context == null) {
            callback.run(Boolean.FALSE);
            return null;
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
            checkBoxCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 7, AndroidUtilities.dp(12.0f)));
            checkBoxCellArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) checkBoxCellArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            checkBoxCellArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            checkBoxCellArr[0].setText(charSequence3, "", false, false);
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$ZGWe5xlOoqo_Z0ZZCeYTPG7wA0E(zArr, view);
                }
            });
        }
        builder.setPositiveButton(charSequence4, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                callback.run(Boolean.valueOf(zArr[0]));
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        if (z) {
            alertDialogCreate.setShowStarsBalance(true);
        }
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static void $r8$lambda$ZGWe5xlOoqo_Z0ZZCeYTPG7wA0E(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean z3, boolean z4, boolean z5, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, chat, user, z2, z3, z4, z5, booleanCallback, baseFragment != null ? baseFragment.getResourceProvider() : null);
    }

    public static void createClearOrDeleteDialogAlert(final BaseFragment baseFragment, final boolean z, final boolean z2, final TLRPC.Chat chat, final TLRPC.User user, final boolean z3, final boolean z4, boolean z5, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider) {
        int i;
        float f;
        float f2;
        final boolean z7;
        boolean z8;
        boolean z9;
        char c;
        int iDp;
        int iDp2;
        final Runnable runnable;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        String string;
        String string2;
        CharSequence string3;
        TextView textView;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = baseFragment.getCurrentAccount();
        final Activity parentActivity = baseFragment.getParentActivity();
        final AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        TextView textView2 = new TextView(parentActivity) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = !z6 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat);
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight() + AndroidUtilities.dp(7.0f));
                }
            }
        };
        builder.setCustomViewOffset(6);
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(parentActivity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(parentActivity);
        animatedTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
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
        frameLayout.addView(animatedTextView, LayoutHelper.createFrame(-1, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 22 : 65, 7.66f, z11 ? 65 : 22, 0.0f));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        TLRPC.Chat monoForumLinkedChat = ChatObject.isMonoForum(chat) ? baseFragment.getMessagesController().getMonoForumLinkedChat(chat.id) : null;
        boolean z12 = (user == null || user.bot || user.id == clientUserId || !MessagesController.getInstance(currentAccount).canRevokePmInbox) ? false : true;
        if (user != null) {
            i = MessagesController.getInstance(currentAccount).revokeTimePmLimit;
        } else {
            i = MessagesController.getInstance(currentAccount).revokeTimeLimit;
        }
        boolean z13 = !z3 && user != null && z12 && i == Integer.MAX_VALUE;
        final boolean z14 = z10;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.get(user.id) : null;
        boolean z15 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        String str = "";
        if (user != null) {
            f = 10.0f;
            if (user.bot) {
                if (user.id != 489000) {
                    CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                    checkBoxCellArr[0] = checkBoxCell;
                    checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.BlockBot), "", false, false);
                    checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    CheckBoxCell checkBoxCell2 = checkBoxCellArr[0];
                    zArr[0] = true;
                    checkBoxCell2.setChecked(true, false);
                    checkBoxCellArr[0].setMultiline(true);
                    frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.$r8$lambda$FWtbR3kCopyK2FVQWCCRfLbVRkk(zArr, view);
                        }
                    });
                    z8 = false;
                } else {
                    str = "";
                    f2 = 8.0f;
                    checkBoxCellArr = checkBoxCellArr;
                    if (!z2 || (((!z3 || z) && !z13) || UserObject.isDeleted(user) || z15)) {
                        if (z4 || z || chat == null || !chat.creator) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                        }
                        z8 = z7;
                    } else {
                        z7 = false;
                    }
                    CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                    checkBoxCellArr[0] = checkBoxCell3;
                    checkBoxCell3.setBackground(Theme.getSelectorDrawable(false));
                    if (z7) {
                        if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteChannelForAll), str, false, false);
                        } else {
                            checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), str, false, false);
                        }
                        z9 = true;
                        c = 0;
                    } else if (z) {
                        z9 = true;
                        c = 0;
                        checkBoxCellArr[0].setText(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), str, false, false);
                    } else {
                        z9 = true;
                        c = 0;
                        checkBoxCellArr[0].setText(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), str, false, false);
                    }
                    checkBoxCellArr[c].setMultiline(z9);
                    CheckBoxCell checkBoxCell4 = checkBoxCellArr[c];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(f2);
                    }
                    int iDp3 = AndroidUtilities.dp(f);
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(f2);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    checkBoxCell4.setPadding(iDp, iDp3, iDp2, AndroidUtilities.dp(f));
                    frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    runnable = new Runnable() {
                        @Override
                        public final void run() {
                            AlertsCreator.$r8$lambda$bXvJwjkHdFeKlzxgvBjYcykI64M(z7, chat, builder, zArr);
                        }
                    };
                    checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.$r8$lambda$ahd5FNcNo3t6ZJvqZEMa0QosEZw(zArr, runnable, view);
                        }
                    });
                    if (z5) {
                        CheckBoxCell checkBoxCell5 = checkBoxCellArr[0];
                        zArr[0] = true;
                        checkBoxCell5.setChecked(true, false);
                        runnable.run();
                    }
                    z8 = z7;
                }
            }
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
                    avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                    backupImageView.setForUserOrChat(user, avatarDrawable);
                }
            } else {
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
                backupImageView.setForUserOrChat(chat3, avatarDrawable);
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
            } else if (z) {
                if (z14) {
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
            builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    AlertsCreator.$r8$lambda$lLfMTKtUAUn_Q91M4tYAEtVNmUg(z14, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, builder, currentAccount, parentActivity, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
        f = 10.0f;
        f2 = 8.0f;
        if (z2) {
            if (z4) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                CheckBoxCell checkBoxCell6 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell6;
                checkBoxCell6.setBackground(Theme.getSelectorDrawable(false));
                if (z7) {
                    if (!ChatObject.isChannel(chat)) {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), str, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), str, false, false);
                    }
                    z9 = true;
                    c = 0;
                } else if (z) {
                    z9 = true;
                    c = 0;
                    checkBoxCellArr[0].setText(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), str, false, false);
                } else {
                    z9 = true;
                    c = 0;
                    checkBoxCellArr[0].setText(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), str, false, false);
                }
                checkBoxCellArr[c].setMultiline(z9);
                CheckBoxCell checkBoxCell7 = checkBoxCellArr[c];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(f2);
                }
                int iDp4 = AndroidUtilities.dp(f);
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(f2);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell7.setPadding(iDp, iDp4, iDp2, AndroidUtilities.dp(f));
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        AlertsCreator.$r8$lambda$bXvJwjkHdFeKlzxgvBjYcykI64M(z7, chat, builder, zArr);
                    }
                };
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.$r8$lambda$ahd5FNcNo3t6ZJvqZEMa0QosEZw(zArr, runnable, view);
                    }
                });
                if (z5) {
                    CheckBoxCell checkBoxCell8 = checkBoxCellArr[0];
                    zArr[0] = true;
                    checkBoxCell8.setChecked(true, false);
                    runnable.run();
                }
            }
        } else {
            if (z4) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                CheckBoxCell checkBoxCell9 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell9;
                checkBoxCell9.setBackground(Theme.getSelectorDrawable(false));
                if (z7) {
                    if (!ChatObject.isChannel(chat)) {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), str, false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteGroupForAll), str, false, false);
                    }
                    z9 = true;
                    c = 0;
                } else if (z) {
                    z9 = true;
                    c = 0;
                    checkBoxCellArr[0].setText(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), str, false, false);
                } else {
                    z9 = true;
                    c = 0;
                    checkBoxCellArr[0].setText(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), str, false, false);
                }
                checkBoxCellArr[c].setMultiline(z9);
                CheckBoxCell checkBoxCell10 = checkBoxCellArr[c];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(f2);
                }
                int iDp5 = AndroidUtilities.dp(f);
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(f2);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                checkBoxCell10.setPadding(iDp, iDp5, iDp2, AndroidUtilities.dp(f));
                frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        AlertsCreator.$r8$lambda$bXvJwjkHdFeKlzxgvBjYcykI64M(z7, chat, builder, zArr);
                    }
                };
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.$r8$lambda$ahd5FNcNo3t6ZJvqZEMa0QosEZw(zArr, runnable, view);
                    }
                });
                if (z5) {
                    CheckBoxCell checkBoxCell11 = checkBoxCellArr[0];
                    zArr[0] = true;
                    checkBoxCell11.setChecked(true, false);
                    runnable.run();
                }
            }
        }
        z8 = z7;
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
                avatarDrawable.setInfo(baseFragment.getCurrentAccount(), user);
                backupImageView.setForUserOrChat(user, avatarDrawable);
            }
        } else {
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
            backupImageView.setForUserOrChat(chat3, avatarDrawable);
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
        } else if (z) {
            if (z14) {
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
        builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.$r8$lambda$lLfMTKtUAUn_Q91M4tYAEtVNmUg(z14, z2, z3, user, baseFragment, z, chat, z4, zArr, z6, booleanCallback, resourcesProvider, builder, currentAccount, parentActivity, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder.create();
        baseFragment.showDialog(alertDialogCreate2);
        textView = (TextView) alertDialogCreate2.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void $r8$lambda$FWtbR3kCopyK2FVQWCCRfLbVRkk(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void $r8$lambda$bXvJwjkHdFeKlzxgvBjYcykI64M(boolean z, TLRPC.Chat chat, AlertDialog.Builder builder, boolean[] zArr) {
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

    public static void $r8$lambda$ahd5FNcNo3t6ZJvqZEMa0QosEZw(boolean[] zArr, Runnable runnable, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
        runnable.run();
    }

    public static void $r8$lambda$lLfMTKtUAUn_Q91M4tYAEtVNmUg(boolean z, final boolean z2, boolean z3, final TLRPC.User user, final BaseFragment baseFragment, final boolean z4, final TLRPC.Chat chat, final boolean z5, final boolean[] zArr, final boolean z6, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider, AlertDialog.Builder builder, final int i, final Context context, AlertDialog alertDialog, int i2) {
        if (!z && !z2 && !z3) {
            if (UserObject.isUserSelf(user)) {
                createClearOrDeleteDialogAlert(baseFragment, z4, true, chat, user, false, z5, zArr[0], z6, booleanCallback, resourcesProvider);
                return;
            }
            if (user != null && zArr[0]) {
                MessagesStorage.getInstance(baseFragment.getCurrentAccount()).getMessagesCount(user.id, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i3) {
                        AlertsCreator.m1950$r8$lambda$FdBSQ4DmWtLy0vf3rBePlw_ls(baseFragment, z4, chat, user, z5, zArr, z6, booleanCallback, resourcesProvider, i3);
                    }
                });
                return;
            }
            if (ChatObject.isChannel(chat) && chat.creator && !zArr[0]) {
                final Browser.Progress progressMakeButtonLoading = builder.create().makeButtonLoading(-1);
                progressMakeButtonLoading.init();
                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat);
                ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        AlertsCreator.$r8$lambda$w68h0YW26apBYgKDwPmJeVa2PPE(progressMakeButtonLoading, booleanCallback, z2, zArr, baseFragment, chat, context, i, resourcesProvider, (TLRPC.User) obj, (TLRPC.TL_error) obj2);
                    }
                });
                return;
            }
        }
        if (booleanCallback != null) {
            booleanCallback.run(z2 || zArr[0]);
        }
    }

    public static void m1950$r8$lambda$FdBSQ4DmWtLy0vf3rBePlw_ls(BaseFragment baseFragment, boolean z, TLRPC.Chat chat, TLRPC.User user, boolean z2, boolean[] zArr, boolean z3, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider, int i) {
        if (i >= 50) {
            createClearOrDeleteDialogAlert(baseFragment, z, true, chat, user, false, z2, zArr[0], z3, booleanCallback, resourcesProvider);
        } else if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void $r8$lambda$w68h0YW26apBYgKDwPmJeVa2PPE(Browser.Progress progress, final MessagesStorage.BooleanCallback booleanCallback, boolean z, boolean[] zArr, BaseFragment baseFragment, final TLRPC.Chat chat, final Context context, final int i, final Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLRPC.TL_error tL_error) {
        boolean z2;
        progress.end();
        TLRPC.User user2 = user;
        if (user2 instanceof TLRPC.TL_userEmpty) {
            user2 = null;
        }
        final TLRPC.User user3 = user2;
        if (user3 != null) {
            showLeaveGroupWithFutureOwner(baseFragment, chat, user3, new Runnable() {
                @Override
                public final void run() {
                    new SelectChatUserSheet(context, chat, user3, new Runnable() {
                        @Override
                        public final void run() {
                            AlertsCreator.m1946$r8$lambda$DP3Flx_19e7kX7lERIqvkgTuYg(i, booleanCallback);
                        }
                    }, resourcesProvider).show();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.$r8$lambda$dB10C3QGB2OJtKiwiiWtTyryijc(booleanCallback);
                }
            });
        } else if (booleanCallback != null) {
            if (!z) {
                z2 = zArr[0];
            }
            booleanCallback.run(z2);
        }
    }

    public static void m1946$r8$lambda$DP3Flx_19e7kX7lERIqvkgTuYg(int i, final MessagesStorage.BooleanCallback booleanCallback) {
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.closeChats, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$EfGCdEHZ6XnCY73QX9KXracZlZA(booleanCallback);
            }
        }, 250L);
    }

    public static void $r8$lambda$EfGCdEHZ6XnCY73QX9KXracZlZA(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
    }

    public static void $r8$lambda$dB10C3QGB2OJtKiwiiWtTyryijc(MessagesStorage.BooleanCallback booleanCallback) {
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
                        AlertsCreator.$r8$lambda$rpSqZ28hNqqGIyQlGAc5KOQO1RA(zArr, view);
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
                AlertsCreator.$r8$lambda$3K60EZXg0glnhfXOGYE_JiKboss(booleanCallback, zArr, alertDialog, i3);
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

    public static void $r8$lambda$rpSqZ28hNqqGIyQlGAc5KOQO1RA(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void $r8$lambda$3K60EZXg0glnhfXOGYE_JiKboss(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void createClearDaysDialogAlert(BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.Chat chat, boolean z, final MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        boolean z2;
        int iDp;
        int iDp2;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        Activity parentActivity = baseFragment.getParentActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, resourcesProvider);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
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
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (checkBoxCellArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight());
                }
            }
        };
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
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i == -1) {
            z2 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else if (z) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                } else {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                }
            } else if (chat.megagroup) {
                textView.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
            } else {
                textView.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
            }
        } else {
            z2 = false;
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i, new Object[0]));
            textView.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        final boolean[] zArr = new boolean[1];
        zArr[z2 ? 1 : 0] = z2;
        if (chat != null && z && ChatObject.isPublic(chat)) {
            zArr[z2 ? 1 : 0] = true;
        }
        if (user != null) {
            long j = user.id;
            if (j != clientUserId && j != 489000 && !ChatObject.isMonoForum(chat)) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (chat != null) {
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false);
                } else {
                    checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false);
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
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.m2002$r8$lambda$yj4QfQ35aeJDKheKrPH5XwNjc8(zArr, view);
                    }
                });
            } else if (chat != null && z && !ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.isMonoForum(chat)) {
                CheckBoxCell checkBoxCell3 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell3;
                checkBoxCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                if (chat != null) {
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false);
                } else {
                    checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false);
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
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.m2002$r8$lambda$yj4QfQ35aeJDKheKrPH5XwNjc8(zArr, view);
                    }
                });
            }
        } else if (chat != null) {
            CheckBoxCell checkBoxCell5 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
            checkBoxCellArr[0] = checkBoxCell5;
            checkBoxCell5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (chat != null) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false);
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
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.m2002$r8$lambda$yj4QfQ35aeJDKheKrPH5XwNjc8(zArr, view);
                }
            });
        }
        CharSequence string = LocaleController.getString(R.string.Delete);
        if (chat != null && z && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                booleanCallback.run(zArr[0]);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        baseFragment.showDialog(alertDialogCreate);
        TextView textView3 = (TextView) alertDialogCreate.getButton(-1);
        if (textView3 != null) {
            textView3.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void m2002$r8$lambda$yj4QfQ35aeJDKheKrPH5XwNjc8(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
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
                AlertsCreator.m2003$r8$lambda$yoV6i0tGFOpY7IWqiwllviv51E(baseFragment, user, z, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
    }

    public static void m2003$r8$lambda$yoV6i0tGFOpY7IWqiwllviv51E(BaseFragment baseFragment, TLRPC.User user, boolean z, AlertDialog alertDialog, int i) {
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
                AlertsCreator.$r8$lambda$xIyxWcjsNMgcFEwDBhxLdmijgP8(j, i, editText, alertDialog, i4);
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
                return AlertsCreator.$r8$lambda$uKUb9tGYapeO2Rk54oRTOb3Ge5g(j, alertDialogCreate, onButtonClickListener, textView, i4, keyEvent);
            }
        });
        alertDialogCreate.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(i2));
    }

    public static void $r8$lambda$xIyxWcjsNMgcFEwDBhxLdmijgP8(long j, int i, EditText editText, AlertDialog alertDialog, int i2) {
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
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                }
            }
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.about = strTrim;
            updateprofile.flags = 4 | updateprofile.flags;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AlertsCreator.m1964$r8$lambda$OLVI5eDnZ8w8SUCLcFYmVk2GHE(tLObject, tL_error);
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
                    notificationCenter.postNotificationName(i3, chatFull, 0, bool, bool);
                }
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            MessagesController.getInstance(i).updateChatAbout(j2, string, chatFull);
        }
        alertDialog.dismiss();
    }

    public static boolean $r8$lambda$uKUb9tGYapeO2Rk54oRTOb3Ge5g(long j, AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
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
            editText = new EditText(context);
            editText.setTextColor(Theme.getColor(i2));
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString(R.string.LastName));
            editText.setBackground(Theme.createEditTextDrawable(context, true));
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
        final AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.$r8$lambda$at1Lj5EAulB_5YdXke2wEYx8MAs(editText2, j, i, editText, alertDialog, i3);
            }
        };
        builder.setPositiveButton(LocaleController.getString(R.string.Save), onButtonClickListener);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$3QflegZHuRSovccR49XCyInXnZw(editText2, editText, dialogInterface);
            }
        });
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        alertDialogCreate.show();
        alertDialogCreate.setTextColor(Theme.getColor(i2));
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return AlertsCreator.m1985$r8$lambda$jnpxz8nqTU8eRWzJ6gbrEZoB2A(alertDialogCreate, onButtonClickListener, textView, i3, keyEvent);
            }
        };
        if (editText != null) {
            editText.setOnEditorActionListener(onEditorActionListener);
        } else {
            editText2.setOnEditorActionListener(onEditorActionListener);
        }
    }

    public static void $r8$lambda$at1Lj5EAulB_5YdXke2wEYx8MAs(EditText editText, long j, int i, EditText editText2, AlertDialog alertDialog, int i2) {
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
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(i).sendRequest(updateprofile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AlertsCreator.$r8$lambda$5ibv31GrZ2uDbTuglY7LYmL1hQI(tLObject, tL_error);
                }
            });
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 3, Long.valueOf(j));
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
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
            MessagesController.getInstance(i).changeChatTitle(j2, string3);
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 3, Long.valueOf(j));
        }
        alertDialog.dismiss();
    }

    public static void $r8$lambda$3QflegZHuRSovccR49XCyInXnZw(EditText editText, EditText editText2, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editText);
        AndroidUtilities.hideKeyboard(editText2);
    }

    public static boolean m1985$r8$lambda$jnpxz8nqTU8eRWzJ6gbrEZoB2A(AlertDialog alertDialog, AlertDialog.OnButtonClickListener onButtonClickListener, TextView textView, int i, KeyEvent keyEvent) {
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
                bottomSheetShow.dismiss();
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
                AlertsCreator.m1962$r8$lambda$NaHT1_Fs_AGQ7fQZGZg0qXf_dw(str3, baseFragment, alertDialog, i);
            }
        });
        baseFragment.showDialog(builder.create());
    }

    public static void m1962$r8$lambda$NaHT1_Fs_AGQ7fQZGZg0qXf_dw(String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$tvOo0jNxsVhaNr_joB3manIcg4g(i, chat, arrayList, arrayList2, arrayList3);
            }
        }, 200L);
    }

    public static void $r8$lambda$tvOo0jNxsVhaNr_joB3manIcg4g(int i, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
                        AlertsCreator.$r8$lambda$Am6_19zU9G9eEwK0FMf1m9k2ynA(zArr, i2, view);
                    }
                });
            }
        }
        builder.setPositiveButton(string, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                AlertsCreator.BlockDialogCallback blockDialogCallback2 = blockDialogCallback;
                boolean[] zArr2 = zArr;
                blockDialogCallback2.run(zArr2[0], zArr2[1]);
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

    public static void $r8$lambda$Am6_19zU9G9eEwK0FMf1m9k2ynA(boolean[] zArr, int i, View view) {
        boolean z = !zArr[i];
        zArr[i] = z;
        ((CheckBoxCell) view).setChecked(z, true);
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
                Text text = this.separatorText;
                float width = (getWidth() - this.separatorText.getCurrentWidth()) / 2.0f;
                float height = getHeight() / 2.0f;
                int i4 = Theme.key_windowBackgroundWhiteBlackText;
                text.draw(canvas, width, height, Theme.getColor(i4), 1.0f);
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
                AlertsCreator.$r8$lambda$9bjTEWKVJyR7xgYrEa42elVUxHc(i2, i3, numberPicker, numberPicker2, i, linearLayout, (Boolean) obj);
            }
        };
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return AlertsCreator.$r8$lambda$jAzHL3pfDhTcKm0UqG5U8YRB_Zk(i4);
            }
        });
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i4, int i5) {
                callback2.run(Boolean.TRUE);
            }
        });
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return String.format("%02d", Integer.valueOf(i4));
            }
        });
        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker3, int i4, int i5) {
                callback2.run(Boolean.TRUE);
            }
        });
        callback2.run(Boolean.FALSE);
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i4, int i5) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
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
                return AlertsCreator.m1956$r8$lambda$K7vo9YwhxUSJbTe2hKmpWuB6k(view, motionEvent);
            }
        });
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView round = new ButtonWithCounterView(context, null).setRound();
        round.setText(LocaleController.getString(R.string.Select), false);
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                bottomSheetArr[0].dismiss();
            }
        });
        linearLayout2.addView(round, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        builder.setCustomView(linearLayout2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                callback.run(Integer.valueOf((numberPicker.getValue() * 60) + numberPicker2.getValue()));
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet bottomSheetCreate = builder.create();
        final BottomSheet[] bottomSheetArr = {bottomSheetCreate};
        return bottomSheetCreate;
    }

    public static void $r8$lambda$9bjTEWKVJyR7xgYrEa42elVUxHc(int i, int i2, NumberPicker numberPicker, NumberPicker numberPicker2, int i3, LinearLayout linearLayout, Boolean bool) {
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

    public static String $r8$lambda$jAzHL3pfDhTcKm0UqG5U8YRB_Zk(int i) {
        boolean z = LocaleController.is24HourFormat;
        String str = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
        return i >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, str) : str;
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
                AlertsCreator.$r8$lambda$X9IMVTzA7vU6cHZQ_G_xb3M_4wI(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
            }
        });
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, -2, 0.3f));
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i7) {
                return AlertsCreator.$r8$lambda$qW8ZCUHwjDRb9EMgx7ZYuihcpqk(i7);
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
                AlertsCreator.$r8$lambda$R44R0t9MSgFz4YKLtYJUzLwdQhw(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i7 = calendar.get(1);
        numberPicker3.setMinValue(i + i7);
        numberPicker3.setMaxValue(i2 + i7);
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
                AlertsCreator.$r8$lambda$0uPx5Lr8h9wui2nFNblQBfETMwA(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i8);
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
                AlertsCreator.$r8$lambda$12t6X6Wghoh4uvPznc8gVr7wan8(z, numberPicker2, numberPicker, numberPicker3, datePickerDelegate, alertDialog, i8);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        return builder;
    }

    public static void $r8$lambda$X9IMVTzA7vU6cHZQ_G_xb3M_4wI(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static String $r8$lambda$qW8ZCUHwjDRb9EMgx7ZYuihcpqk(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, i);
        return calendar.getDisplayName(2, 1, Locale.getDefault());
    }

    public static void $r8$lambda$R44R0t9MSgFz4YKLtYJUzLwdQhw(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void $r8$lambda$0uPx5Lr8h9wui2nFNblQBfETMwA(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void $r8$lambda$12t6X6Wghoh4uvPznc8gVr7wan8(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DatePickerDelegate datePickerDelegate, AlertDialog alertDialog, int i) {
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
            calendar.setTimeInMillis(jCurrentTimeMillis + (j2 * 1000));
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
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend(i4 + (i * 3)).format(timeInMillis3));
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

    public static BottomSheet.Builder createScheduleDatePickerDialog(final Context context, final String str, final long j, long j2, int i, boolean z, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, final ScheduleDatePickerColors scheduleDatePickerColors, final Theme.ResourcesProvider resourcesProvider) {
        char c;
        ?? r43;
        Context context2;
        char c2;
        final ActionBarMenuItem actionBarMenuItem;
        BottomSheet.Builder builder;
        int i2;
        int i3;
        int i4;
        char c3;
        final int[] iArr;
        final String[] strArr;
        final int[] iArr2;
        FrameLayout frameLayout;
        Runnable runnable2;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        TextView textView = null;
        if (context == null) {
            return null;
        }
        int[] iArr3 = {i};
        final long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        builder2.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i5) {
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
            protected CharSequence getContentDescription(int i5) {
                return LocaleController.formatPluralString("Minutes", i5, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        ?? r12 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i5, int i6) {
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
        r12.setClipToPadding(false);
        r12.setClipChildren(false);
        r12.setOrientation(1);
        frameLayout2.addView(r12, LayoutHelper.createFrame(-1, -1.0f));
        final FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        r12.addView(frameLayout4, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView2 = new TextView(context);
        if (!TextUtils.isEmpty(str)) {
            textView2.setText(str);
            c = 0;
        } else if (j == clientUserId) {
            c = 0;
            textView2.setText(LocaleController.getString(R.string.SetReminder));
        } else {
            c = 0;
            textView2.setText(LocaleController.getString(R.string.ScheduleMessage));
        }
        textView2.setTextColor(scheduleDatePickerColors.textColor);
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout4.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$7aMJfVl5JCJYvfk8SzgRczDtaSw(view, motionEvent);
            }
        });
        final boolean[] zArr = new boolean[1];
        zArr[c] = true;
        if (!DialogObject.isUserDialog(j) || j == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            iArr3 = iArr3;
            r43 = frameLayout2;
            context2 = context;
            c2 = 5;
            actionBarMenuItem = null;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            String str2 = firstName;
            context2 = context;
            r43 = frameLayout2;
            c2 = 5;
            actionBarMenuItem = new ActionBarMenuItem(context2, null, 0, scheduleDatePickerColors.textColor, false, resourcesProvider);
            actionBarMenuItem.setLongClickEnabled(false);
            actionBarMenuItem.setSubMenuOpenSide(2);
            actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
            actionBarMenuItem.setBackground(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1));
            frameLayout4.addView(actionBarMenuItem, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            actionBarMenuItem.addSubItem(1, LocaleController.formatString(R.string.ScheduleWhenOnline, str2));
            actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$Aqcq045idOutwS208U0Ewt05Xxw(actionBarMenuItem, scheduleDatePickerColors, view);
                }
            });
            actionBarMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                @Override
                public final void onItemClick(int i5) {
                    AlertsCreator.$r8$lambda$pBceKTJzWm8BkMgx6viy9EBgmOs(scheduleDatePickerDelegate, zArr, builder2, i5);
                }
            });
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
        rLottieImageView.setBackground(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1));
        frameLayout4.addView(rLottieImageView, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, (actionBarMenuItem != null ? 42 : 0) + 8, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r12.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final Calendar calendar = Calendar.getInstance();
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
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return AlertsCreator.$r8$lambda$21l4_Cw4AhcAAphNHtPUGXlHA54(i5);
            }
        });
        final ActionBarMenuItem actionBarMenuItem2 = actionBarMenuItem;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i5, int i6) {
                AlertsCreator.$r8$lambda$jdceVmACS2pOIoh7ubFTPOSCGwI(textView3, str, clientUserId, j, numberPicker, numberPicker2, numberPicker3, numberPicker4, i5, i6);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return String.format("%02d", Integer.valueOf(i5));
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i5) {
                return String.format("%02d", Integer.valueOf(i5));
            }
        });
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j2 <= 0 || j2 == 2147483646) {
            builder = builder2;
        } else {
            long j3 = 1000 * j2;
            builder = builder2;
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
            i3 = 10;
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[2] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[c2] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            i4 = 8;
            c3 = 3;
            iArr[8] = 15724800;
            iArr[9] = 31536000;
        } else {
            i3 = 10;
            i4 = 8;
            c3 = 3;
            iArr = new int[8];
            iArr[0] = 0;
            iArr[1] = 86400;
            iArr[2] = 604800;
            iArr[3] = 1209600;
            iArr[4] = 2592000;
            iArr[c2] = 7862400;
            iArr[6] = 15724800;
            iArr[7] = 31536000;
        }
        if (zIsTestBackend) {
            strArr = new String[i3];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[c2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i4] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[9] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i4];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[c2] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (z) {
            iArr2 = iArr3;
            frameLayout = null;
            runnable2 = null;
        } else {
            FrameLayout frameLayout5 = new FrameLayout(context);
            int i5 = scheduleDatePickerColors.textColor;
            int iBlendOver = Theme.blendOver(scheduleDatePickerColors.backgroundColor, Theme.multAlpha(i5, 0.075f));
            int iMultAlpha = Theme.multAlpha(scheduleDatePickerColors.textColor, 0.1f);
            final TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i5);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(14.0f), iBlendOver, Theme.blendOver(iBlendOver, iMultAlpha)));
            textView4.setGravity(17);
            iArr2 = iArr3;
            Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.m1969$r8$lambda$QqFTRS_CNNCUsxLI7GAiISvtY(iArr, iArr2, strArr, textView4);
                }
            };
            runnable3.run();
            frameLayout5.addView(textView4, LayoutHelper.createFrame(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r12.addView(frameLayout5, LayoutHelper.createLinear(-1, -2));
            runnable2 = runnable3;
            frameLayout = frameLayout5;
            textView = textView4;
        }
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 24.0f));
        r12.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        final ?? r14 = builder;
        final int[] iArr4 = iArr2;
        TextView textView5 = textView;
        final String[] strArr2 = strArr;
        final int[] iArr5 = iArr;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.m1944$r8$lambda$7m6PwJyNaMAbxvc4PvB70ZsnA(zArr2, str, clientUserId, j, numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, zArr, iArr4, r14, view);
            }
        });
        r14.setCustomView(r43);
        final BottomSheet bottomSheetShow = r14.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$iRDS_w27CCc85uOPm0LOMbUQbBw(runnable, zArr2, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        if (textView5 != null) {
            final FrameLayout frameLayout6 = frameLayout;
            final Runnable runnable4 = runnable2;
            textView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.m1952$r8$lambda$HVgR70FEHMhocCffrRID_G51t4(frameLayout3, resourcesProvider, bottomSheetShow, frameLayout6, iArr5, strArr2, iArr4, runnable4, view);
                }
            });
        }
        final HintView2[] hintView2Arr = new HintView2[1];
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$tMzwpZIm4rgEe0Wx1WehWU18aRM(zArr, rLottieDrawable, hintView2Arr, j, context, clientUserId, actionBarMenuItem2, bottomSheetShow, view);
            }
        });
        return r14;
    }

    public static void $r8$lambda$Aqcq045idOutwS208U0Ewt05Xxw(ActionBarMenuItem actionBarMenuItem, ScheduleDatePickerColors scheduleDatePickerColors, View view) {
        actionBarMenuItem.toggleSubMenu();
        actionBarMenuItem.setPopupItemsColor(scheduleDatePickerColors.subMenuTextColor, false);
        actionBarMenuItem.setupPopupRadialSelectors(scheduleDatePickerColors.subMenuSelectorColor);
        actionBarMenuItem.redrawPopup(scheduleDatePickerColors.subMenuBackgroundColor);
    }

    public static void $r8$lambda$pBceKTJzWm8BkMgx6viy9EBgmOs(ScheduleDatePickerDelegate scheduleDatePickerDelegate, boolean[] zArr, BottomSheet.Builder builder, int i) {
        if (i == 1) {
            scheduleDatePickerDelegate.didSelectDate(zArr[0], 2147483646, 0);
            builder.getDismissRunnable().run();
        }
    }

    public static String $r8$lambda$21l4_Cw4AhcAAphNHtPUGXlHA54(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        if (calendar.get(1) == i2) {
            return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
    }

    public static void $r8$lambda$jdceVmACS2pOIoh7ubFTPOSCGwI(TextView textView, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        int i3;
        if (str != null) {
            i3 = 3;
        } else {
            i3 = j == j2 ? 1 : 0;
        }
        checkScheduleDate(textView, null, i3, numberPicker, numberPicker2, numberPicker3);
    }

    public static void m1969$r8$lambda$QqFTRS_CNNCUsxLI7GAiISvtY(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
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

    public static void m1944$r8$lambda$7m6PwJyNaMAbxvc4PvB70ZsnA(boolean[] zArr, String str, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, boolean[] zArr2, int[] iArr, BottomSheet.Builder builder, View view) {
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
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$iRDS_w27CCc85uOPm0LOMbUQbBw(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static void m1952$r8$lambda$HVgR70FEHMhocCffrRID_G51t4(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet, FrameLayout frameLayout2, int[] iArr, String[] strArr, final int[] iArr2, final Runnable runnable, View view) {
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.$r8$lambda$cJSqyYMbtl5PwvRxzcdUq3mCf5g();
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
                    AlertsCreator.m1945$r8$lambda$CG7XFeaK4NJS8WGUWD8ZTEZvNM(iArr2, i2, runnable);
                }
            });
        }
        itemOptionsMakeOptions.setGravity(1);
        itemOptionsMakeOptions.show();
    }

    public static void $r8$lambda$cJSqyYMbtl5PwvRxzcdUq3mCf5g() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(new PremiumPreviewFragment("schedule_repeat"), bottomSheetParams);
    }

    public static void m1945$r8$lambda$CG7XFeaK4NJS8WGUWD8ZTEZvNM(int[] iArr, int i, Runnable runnable) {
        iArr[0] = i;
        runnable.run();
    }

    public static void $r8$lambda$tMzwpZIm4rgEe0Wx1WehWU18aRM(boolean[] zArr, RLottieDrawable rLottieDrawable, HintView2[] hintView2Arr, long j, Context context, long j2, ActionBarMenuItem actionBarMenuItem, BottomSheet bottomSheet, View view) {
        String string;
        boolean z = zArr[0];
        zArr[0] = !z;
        if (!z) {
            if (rLottieDrawable.getCurrentFrame() >= 40) {
                rLottieDrawable.setCurrentFrame(0);
            }
            rLottieDrawable.setCustomEndFrame(40);
            rLottieDrawable.start();
        } else {
            if (rLottieDrawable.getCurrentFrame() < 40) {
                rLottieDrawable.setCurrentFrame(40);
            }
            rLottieDrawable.setCustomEndFrame(80);
            rLottieDrawable.start();
        }
        HintView2 hintView2 = hintView2Arr[0];
        if (hintView2 != null) {
            hintView2.hide();
            hintView2Arr[0] = null;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        final HintView2 hintView3 = new HintView2(context, 3);
        hintView2Arr[0] = hintView3;
        hintView3.setRoundingWithCornerEffect(false);
        hintView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        hintView3.setRounding(20.0f);
        hintView3.setShadow(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(-16777216, 0.25f));
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
        hintView3.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(hintView3);
            }
        });
        bottomSheet.getContainerView().setClipToPadding(false);
        bottomSheet.getContainerView().setClipChildren(false);
        bottomSheet.getContainerView().addView(hintView3, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
        hintView3.show();
    }

    public static BottomSheet.Builder createDatePickerDialog(Context context, String str, String str2, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        ScheduleDatePickerColors scheduleDatePickerColors;
        ?? r17;
        float f;
        ?? r18;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors2 = new ScheduleDatePickerColors();
        final ?? builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? r11 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
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
        r11.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        r11.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(scheduleDatePickerColors2.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$eb9uF0EmGJKGMQQgis2E80Uy8us(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final Calendar calendar = Calendar.getInstance();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return AlertsCreator.$r8$lambda$lCwpmDJh99RvVoEf32BgwftFZ4w(i);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                AlertsCreator.checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return String.format("%02d", Integer.valueOf(i));
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return String.format("%02d", Integer.valueOf(i));
            }
        });
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            scheduleDatePickerColors = scheduleDatePickerColors2;
            r17 = r11;
            f = 34.0f;
        } else {
            r18 = r11;
            long j2 = j * 1000;
            f = 34.0f;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            scheduleDatePickerColors = scheduleDatePickerColors2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                r17 = r18;
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
                r17 = r18;
            }
        }
        r17 = r18;
        checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        textView2.setGravity(17);
        ScheduleDatePickerColors scheduleDatePickerColors3 = scheduleDatePickerColors;
        textView2.setTextColor(scheduleDatePickerColors3.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors3.buttonBackgroundColor, scheduleDatePickerColors3.buttonBackgroundPressedColor));
        textView2.setText(str2);
        ?? r2 = r17;
        r2.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$iUpvg1bnA7ltqPiN3q3C7KofTeM(numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(r2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors3.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors3.backgroundColor);
        return builder;
    }

    public static String $r8$lambda$lCwpmDJh99RvVoEf32BgwftFZ4w(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        if (calendar.get(1) == i2) {
            return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
    }

    public static void $r8$lambda$iUpvg1bnA7ltqPiN3q3C7KofTeM(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
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
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createBirthdayPickerDialog(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, final Utilities.Callback callback, Runnable runnable, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
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
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$L1EyoXhYk11m1x6sVYq3esVuUY4(view, motionEvent);
            }
        });
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
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$pTlmU8JiaMMd303DH35aCMGj4Q0(numberPicker3, i5, numberPicker, numberPicker2, i4, i3, i2);
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
            public final String format(int i6) {
                return AlertsCreator.$r8$lambda$GLsZvrDWJql175SLGyjZ55OxSsk(i6);
            }
        });
        NumberPicker.OnScrollListener onScrollListener = new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i6) {
                AlertsCreator.$r8$lambda$_4wfzS6BWWsVlCIBXuPUYOYgA20(runnable2, numberPicker4, i6);
            }
        };
        numberPicker.setOnScrollListener(onScrollListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i6) {
                return AlertsCreator.m1970$r8$lambda$RHnjPFDKA0IdadReOgNV5gw1XA(i6);
            }
        });
        numberPicker2.setOnScrollListener(onScrollListener);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i5);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i6) {
                return AlertsCreator.m2005$r8$lambda$zB8DXy7jLz1wfPU7KxCjeSdbE(i5, i6);
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
            final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setGravity(17);
            frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-2, -2, 17));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            final int i6 = UserConfig.selectedAccount;
            final Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.$r8$lambda$nJXCjK5mKIzWLIb62Ymb0s0C61Q(i6, linksTextView);
                }
            };
            runnable3.run();
            NotificationCenter.getInstance(i6).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    runnable3.run();
                }
            });
            ContactsController.getInstance(i6).loadPrivacySettings();
        }
        if (z) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.DateOfBirthHideYear), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$jK5Ybq742MMpP2tLihLXEI7dQDA(numberPicker3, i5, runnable2, view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
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
                AlertsCreator.m1934$r8$lambda$RTUKpavGH9wcWdYlcUP03KJyRo(numberPicker, numberPicker2, numberPicker3, i5, builder, callback, view);
            }
        });
        if (z2) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.BirthdayRemove), false);
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$tZJkz9dlkXBpNZkJP6exob_Jpmo(builder, callback, view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 83, 16, 4, 16, 16));
        }
        builder.setCustomView(linearLayout);
        return builder;
    }

    public static void $r8$lambda$pTlmU8JiaMMd303DH35aCMGj4Q0(NumberPicker numberPicker, int i, NumberPicker numberPicker2, NumberPicker numberPicker3, int i2, int i3, int i4) {
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

    public static String $r8$lambda$GLsZvrDWJql175SLGyjZ55OxSsk(int i) {
        return "" + i;
    }

    public static void $r8$lambda$_4wfzS6BWWsVlCIBXuPUYOYgA20(Runnable runnable, NumberPicker numberPicker, int i) {
        if (i == 0) {
            runnable.run();
        }
    }

    public static String m1970$r8$lambda$RHnjPFDKA0IdadReOgNV5gw1XA(int i) {
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

    public static String m2005$r8$lambda$zB8DXy7jLz1wfPU7KxCjeSdbE(int i, int i2) {
        return i2 == i ? "—" : String.format("%02d", Integer.valueOf(i2));
    }

    public static void $r8$lambda$nJXCjK5mKIzWLIb62Ymb0s0C61Q(int i, LinkSpanDrawable.LinksTextView linksTextView) {
        final ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i).getPrivacyRules(11);
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
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.$r8$lambda$2KGv6EnP_swgyCxLM8oIyqd3_fs(privacyRules);
            }
        }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
    }

    public static void $r8$lambda$2KGv6EnP_swgyCxLM8oIyqd3_fs(ArrayList arrayList) {
        BaseFragment lastFragment;
        if (arrayList == null || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public static void $r8$lambda$jK5Ybq742MMpP2tLihLXEI7dQDA(NumberPicker numberPicker, int i, Runnable runnable, View view) {
        numberPicker.setValue(i);
        runnable.run();
    }

    public static void m1934$r8$lambda$RTUKpavGH9wcWdYlcUP03KJyRo(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i, BottomSheet.Builder builder, Utilities.Callback callback, View view) {
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

    public static void $r8$lambda$tZJkz9dlkXBpNZkJP6exob_Jpmo(BottomSheet.Builder builder, Utilities.Callback callback, View view) {
        builder.getDismissRunnable().run();
        callback.run(null);
    }

    public static BottomSheet.Builder createFormattedDatePickerDialog(Context context, final FormattedDatePickerDelegate formattedDatePickerDelegate, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors(resourcesProvider);
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
                return AlertsCreator.m2004$r8$lambda$yxpnQHVaxgqJm5fjO5ZVhq0QwM(i2);
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
                return AlertsCreator.$r8$lambda$zUQj4Wv_eIyf4TJ9Rv8evNVnXy4(calendar, i, i2);
            }
        });
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setContentDescriptionCallback(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
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
                return String.format("%02d", Integer.valueOf(i2));
            }
        });
        final NumberPicker numberPicker4 = new NumberPicker(context, resourcesProvider);
        numberPicker4.setContentDescriptionCallback(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
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
                return String.format("%02d", Integer.valueOf(i2));
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
                Point point = AndroidUtilities.displaySize;
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
                return AlertsCreator.m1978$r8$lambda$ctKtqQvkBzLZn5oZ6H_VO9PI(view, motionEvent);
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
                AlertsCreator.m1982$r8$lambda$h_XcHNlTI1EbwXkklFwQPsiOqs(zArr, numberPicker, numberPicker2, numberPicker3, numberPicker4, formattedDatePickerDelegate, iArr, builder, view);
            }
        });
        builder.setCustomView(frameLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$vSQJVYrnZiVDMyB3Fnv12QhH6cc(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        checkFormattedDateInput(buttonWithCounterView, numberPicker, numberPicker2, numberPicker3, numberPicker4);
        return builder;
    }

    public static String m2004$r8$lambda$yxpnQHVaxgqJm5fjO5ZVhq0QwM(int i) {
        return "" + i;
    }

    public static String $r8$lambda$zUQj4Wv_eIyf4TJ9Rv8evNVnXy4(Calendar calendar, int i, int i2) {
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, 0);
        calendar.add(2, i2 - 120);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    public static void m1982$r8$lambda$h_XcHNlTI1EbwXkklFwQPsiOqs(boolean[] zArr, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, FormattedDatePickerDelegate formattedDatePickerDelegate, int[] iArr, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        formattedDatePickerDelegate.didSelectDate((int) (checkFormattedDateInput(null, numberPicker, numberPicker2, numberPicker3, numberPicker4) / 1000), iArr[0]);
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$vSQJVYrnZiVDMyB3Fnv12QhH6cc(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    private static String formatPollCloseCustomDeadline(int i) {
        int i2 = i / 86400;
        int i3 = (i % 86400) / 3600;
        int i4 = (i % 3600) / 60;
        return LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, i2 > 0 ? LocaleController.formatPluralString("Days", i2, new Object[0]) : "", i3 > 0 ? LocaleController.formatPluralString("Hours", i3, new Object[0]) : "", i4 > 0 ? LocaleController.formatPluralString("Minutes", i4, new Object[0]) : "").trim());
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

    public static BottomSheet.Builder createPollCloseDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder;
        int i;
        if (context == null) {
            return null;
        }
        final int i2 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        builder2.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i3) {
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
            protected CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Minutes", i3, new Object[0]);
            }
        };
        numberPicker3.setWrapSelectorWheel(true);
        numberPicker3.setAllItemsCount(60);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i3, int i4) {
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
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout.addView(new FrameLayout(context), LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$MkNbiVHpO8p1uHtppfbn4K8GvEA(view, motionEvent);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(1.0f);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 23, 0, 23));
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
        linearLayout2.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return AlertsCreator.m1933$r8$lambda$7KrKpIeJiZytsohTe5zsLPOoU(i3);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i3, int i4) {
                AlertsCreator.$r8$lambda$T9HqkWUPeZsHlFqODVd52XR00G0(i2, numberPicker, numberPicker2, numberPicker3, textView2, numberPicker4, i3, i4);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return String.format("%02d", Integer.valueOf(i3));
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i3) {
                return String.format("%02d", Integer.valueOf(i3));
            }
        });
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            builder = builder2;
            i = i2;
        } else {
            long j2 = j * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            builder = builder2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            i = i2;
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        final int i3 = i;
        checkScheduleDate(null, null, i3, 3, numberPicker, numberPicker2, numberPicker3);
        checkPollCloseCustomDeadline(textView2, numberPicker, numberPicker2, numberPicker3);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 24.0f));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 14, 15, 14, 16));
        final BottomSheet.Builder builder3 = builder;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$mWc54uoAIeORAfRceatMXEjrHwQ(zArr, i3, numberPicker, numberPicker2, numberPicker3, textView2, calendar, scheduleDatePickerDelegate, builder3, view);
            }
        });
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 83, 14, 0, 14, 16));
        builder3.setCustomView(frameLayout);
        BottomSheet bottomSheetShow = builder3.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$liUcXCDPa4hrsR8Gg4blqblIauA(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder3;
    }

    public static String m1933$r8$lambda$7KrKpIeJiZytsohTe5zsLPOoU(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        if (calendar.get(1) == i2) {
            return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
    }

    public static void $r8$lambda$T9HqkWUPeZsHlFqODVd52XR00G0(int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TextView textView, NumberPicker numberPicker4, int i2, int i3) {
        checkScheduleDate(null, null, i, 3, numberPicker, numberPicker2, numberPicker3);
        checkPollCloseCustomDeadline(textView, numberPicker, numberPicker2, numberPicker3);
    }

    public static void $r8$lambda$mWc54uoAIeORAfRceatMXEjrHwQ(boolean[] zArr, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TextView textView, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
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
        builder.getDismissRunnable().run();
    }

    public static void $r8$lambda$liUcXCDPa4hrsR8Gg4blqblIauA(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable == null || !zArr[0]) {
            return;
        }
        runnable.run();
    }

    public static BottomSheet.Builder createStatusUntilDatePickerDialog(Context context, long j, final StatusUntilDatePickerDelegate statusUntilDatePickerDelegate) {
        ScheduleDatePickerColors scheduleDatePickerColors;
        ?? r17;
        float f;
        ?? r18;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors2 = new ScheduleDatePickerColors();
        final ?? builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i, new Object[0]);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i, new Object[0]);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors2.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? r11 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
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
        r11.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        r11.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
        textView.setTextColor(scheduleDatePickerColors2.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.m1955$r8$lambda$JUaPqHmSQm6PEospDnLDYcZ9Y(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final Calendar calendar = Calendar.getInstance();
        TextView textView2 = new TextView(context) {
            @Override
            public CharSequence getAccessibilityClassName() {
                return Button.class.getName();
            }
        };
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return AlertsCreator.$r8$lambda$R31fahtnXBrbRmMqgZf7LvEtmbo(i);
            }
        });
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                AlertsCreator.checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return String.format("%02d", Integer.valueOf(i));
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                return String.format("%02d", Integer.valueOf(i));
            }
        });
        linearLayout.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            scheduleDatePickerColors = scheduleDatePickerColors2;
            r17 = r11;
            f = 34.0f;
        } else {
            r18 = r11;
            long j2 = j * 1000;
            f = 34.0f;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            scheduleDatePickerColors = scheduleDatePickerColors2;
            int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j2);
            if (timeInMillis >= 0) {
                r17 = r18;
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
                r17 = r18;
            }
        }
        r17 = r18;
        checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        textView2.setGravity(17);
        ScheduleDatePickerColors scheduleDatePickerColors3 = scheduleDatePickerColors;
        textView2.setTextColor(scheduleDatePickerColors3.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), scheduleDatePickerColors3.buttonBackgroundColor, scheduleDatePickerColors3.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
        ?? r2 = r17;
        r2.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$UX1PFc2t3NkY33eqw0zS_4_wqPk(numberPicker, numberPicker2, numberPicker3, calendar, statusUntilDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(r2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors3.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors3.backgroundColor);
        return builder;
    }

    public static String $r8$lambda$R31fahtnXBrbRmMqgZf7LvEtmbo(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        calendar.add(6, i);
        long timeInMillis = calendar.getTimeInMillis();
        int i3 = calendar.get(1);
        if (i3 != i2 || i >= 7) {
            if (i3 == i2) {
                return LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            }
            return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
        }
        return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
    }

    public static void $r8$lambda$UX1PFc2t3NkY33eqw0zS_4_wqPk(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, StatusUntilDatePickerDelegate statusUntilDatePickerDelegate, BottomSheet.Builder builder, View view) {
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
                return AlertsCreator.$r8$lambda$Zj4tAZSbGWSpI3S3AyFtUzzMY1Q(iArr, i2);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i2, int i3) {
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
                return AlertsCreator.m1972$r8$lambda$TmYfcFcaRGTgdgpdW4v5JmRx8A(view, motionEvent);
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
                AlertsCreator.$r8$lambda$J_wqdDsd2Tj98MtVmS12CLRp2Ag(animatedTextView, numberPicker2, i2, i3);
            }
        });
        animatedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.m2007$r8$lambda$zQ71STz_78Tm5KNamx0WU7BCA(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String $r8$lambda$Zj4tAZSbGWSpI3S3AyFtUzzMY1Q(int[] iArr, int i) {
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

    public static void $r8$lambda$J_wqdDsd2Tj98MtVmS12CLRp2Ag(AnimatedTextView animatedTextView, NumberPicker numberPicker, int i, int i2) {
        try {
            if (i2 == 0) {
                animatedTextView.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                animatedTextView.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    public static void m2007$r8$lambda$zQ71STz_78Tm5KNamx0WU7BCA(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
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
                return LocaleController.formatPluralString("Times", i3 + 1, new Object[0]);
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
                return LocaleController.formatPluralString("Minutes", i3 + 1, new Object[0]);
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
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i3, int i4) {
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
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$Bp37odEupQHZkZ2wzY3PSI8rcxQ(view, motionEvent);
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
                AlertsCreator.$r8$lambda$qOYsogZLStXzANMwtGje_2TQEMs(numberPicker4, i3, i4);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$kAfBVnUDNetQsqjCYxPq5FL4mrY(numberPicker, numberPicker2, soundFrequencyDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static void $r8$lambda$kAfBVnUDNetQsqjCYxPq5FL4mrY(NumberPicker numberPicker, NumberPicker numberPicker2, SoundFrequencyDelegate soundFrequencyDelegate, BottomSheet.Builder builder, View view) {
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
                return AlertsCreator.m1993$r8$lambda$rflMfZyqS0dZ6vs7LG_HZx0w6Q(iArr, i);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
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
                return AlertsCreator.$r8$lambda$qfvNwy3IClMAv_5PMfPdTUi9KX8(view, motionEvent);
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
                AlertsCreator.$r8$lambda$RfLFCYJmkf8JaY8ibbNSRDlPIBw(numberPicker2, i, i2);
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
                AlertsCreator.$r8$lambda$KjmhvXIy8LEV1LAHU_1kdCu4G94(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String m1993$r8$lambda$rflMfZyqS0dZ6vs7LG_HZx0w6Q(int[] iArr, int i) {
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

    public static void $r8$lambda$KjmhvXIy8LEV1LAHU_1kdCu4G94(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
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
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AlertsCreator.$r8$lambda$h4C8ccJbV2_XEbASNd71RqSS130(view, motionEvent);
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
                return AlertsCreator.$r8$lambda$j3s_HgFefEz0nsvMRJSP59JQFXQ(i);
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
                return AlertsCreator.$r8$lambda$QeSpnsZVMvwAoZ3fdeYUyTz3utw(i);
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
                return String.format("%02d", Integer.valueOf(i3));
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
                AlertsCreator.m1951$r8$lambda$FeujI2eoXN7IFkSzgOjbF9fdg(j, numberPicker, numberPicker2, numberPicker3, calendar, intCallback, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        return builder;
    }

    public static String $r8$lambda$j3s_HgFefEz0nsvMRJSP59JQFXQ(int i) {
        return "" + i;
    }

    public static String $r8$lambda$QeSpnsZVMvwAoZ3fdeYUyTz3utw(int i) {
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

    public static void m1951$r8$lambda$FeujI2eoXN7IFkSzgOjbF9fdg(long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, MessagesStorage.IntCallback intCallback, BottomSheet.Builder builder, View view) {
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
                AlertsCreator.m1980$r8$lambda$ef5VQCTbBOe_qaO48sHPKVYcfE(j, j2, baseFragment, resourcesProvider, dialogInterface, i2);
            }
        });
        return builder.create();
    }

    public static void m1980$r8$lambda$ef5VQCTbBOe_qaO48sHPKVYcfE(long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
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
                AlertsCreator.m1960$r8$lambda$MLpqeoItyYxOiXMWGrOXsikK2A(arrayList, i, baseFragment, resourcesProvider, dialogInterface, i3);
            }
        });
        return builder.create();
    }

    public static void m1960$r8$lambda$MLpqeoItyYxOiXMWGrOXsikK2A(ArrayList arrayList, int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i2) {
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

    public static void createReportPhotoAlert(final int i, final Context context, final long j, final TLRPC.Photo photo, final Theme.ResourcesProvider resourcesProvider) {
        if (context == null || photo == null) {
            return;
        }
        final Utilities.Callback2 callback2 = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AlertsCreator.$r8$lambda$AxPS805L1weUTV5sYjRWdS4TBG4(i, j, photo, context, resourcesProvider, (Integer) obj, (String) obj2);
            }
        };
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ReportProfilePhoto), true);
        final int[] iArr = {0, 6, 1, 2, 3, 4, 5, 100};
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)}, new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.$r8$lambda$2XbkJTJqR_2dfQJ2bGBZHz1UAPg(iArr, context, resourcesProvider, callback2, dialogInterface, i2);
            }
        });
        builder.show();
    }

    public static void $r8$lambda$AxPS805L1weUTV5sYjRWdS4TBG4(int i, long j, TLRPC.Photo photo, Context context, Theme.ResourcesProvider resourcesProvider, Integer num, String str) {
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

    public static void $r8$lambda$2XbkJTJqR_2dfQJ2bGBZHz1UAPg(int[] iArr, Context context, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback2 callback2, DialogInterface dialogInterface, int i) {
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

    public static void showAddUserAlert(TLRPC.TL_error tL_error, final BaseFragment baseFragment, boolean z, boolean z2, TLObject tLObject) {
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
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
                builder.setNegativeButton(LocaleController.getString(R.string.MoreInfo), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BaseFragment baseFragment2 = baseFragment;
                        MessagesController.getInstance(baseFragment2.getCurrentAccount()).openByUserName("spambot", baseFragment2, 1);
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
                    if (z) {
                        builder.setMessage(LocaleController.getString(R.string.InviteToChannelError));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.InviteToGroupError));
                    }
                    break;
                }
                break;
            case "USER_ALREADY_PARTICIPANT":
                builder.setTitle(LocaleController.getString(R.string.VoipGroupVoiceChat));
                builder.setMessage(LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant));
                break;
            default:
                builder.setMessage(LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                break;
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show();
    }

    public static Dialog createColorSelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createColorSelectDialog(activity, j, i, i2, runnable, null);
    }

    public static Dialog createColorSelectDialog(Activity activity, final long j, final long j2, final int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        if (j != 0) {
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
        for (int i3 = 0; i3 < 9; i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            int i4 = TextColorCell.colors[i3];
            radioColorCell.setCheckColor(i4, i4);
            radioColorCell.setTextAndValue(strArr[i3], i2 == TextColorCell.colorsToSave[i3]);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$DDiPMR78M1MQK5Ky3igtUZls2H8(linearLayout, iArr, view);
                }
            });
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.LedColor));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Set), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i5) {
                AlertsCreator.m1990$r8$lambda$qojMeL26Gxr08M0myzdWd9xCwk(j, sharedPrefKey, iArr, j2, i, runnable, alertDialog, i5);
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.LedDisabled), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i5) {
                AlertsCreator.$r8$lambda$0JwEVAD9YtQJ8uobaoI7EHZytmI(j, i, runnable, alertDialog, i5);
            }
        });
        if (j != 0) {
            builder.setNegativeButton(LocaleController.getString(R.string.Default), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    AlertsCreator.$r8$lambda$A6dvnja8SyjP58P_m7XnNQA5IPY(sharedPrefKey, runnable, alertDialog, i5);
                }
            });
        }
        return builder.create();
    }

    public static void $r8$lambda$DDiPMR78M1MQK5Ky3igtUZls2H8(LinearLayout linearLayout, int[] iArr, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioColorCell radioColorCell = (RadioColorCell) linearLayout.getChildAt(i);
            radioColorCell.setChecked(radioColorCell == view, true);
        }
        iArr[0] = TextColorCell.colorsToSave[((Integer) view.getTag()).intValue()];
    }

    public static void m1990$r8$lambda$qojMeL26Gxr08M0myzdWd9xCwk(long j, String str, int[] iArr, long j2, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
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

    public static void $r8$lambda$0JwEVAD9YtQJ8uobaoI7EHZytmI(long j, int i, Runnable runnable, AlertDialog alertDialog, int i2) {
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

    public static void $r8$lambda$A6dvnja8SyjP58P_m7XnNQA5IPY(String str, Runnable runnable, AlertDialog alertDialog, int i) {
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
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        int i3 = 0;
        while (i3 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i3], iArr[0] == i3);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.m1983$r8$lambda$htgzC239K3aMC6XCGEorU_u2I8(iArr, j, str2, j2, builder, runnable, view);
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

    public static void m1983$r8$lambda$htgzC239K3aMC6XCGEorU_u2I8(int[] iArr, long j, String str, long j2, AlertDialog.Builder builder, Runnable runnable, View view) {
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
                    AlertsCreator.$r8$lambda$2Aej9lmRwgl9JfyBmCqEyahgDd0(iArr, linearLayout, view);
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
                AlertsCreator.m1996$r8$lambda$tCYtRsH65mgszRwAV6vMp291X8(iArr, intCallback, alertDialog, i2);
            }
        });
        builder.setNeutralButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void $r8$lambda$2Aej9lmRwgl9JfyBmCqEyahgDd0(int[] iArr, LinearLayout linearLayout, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof RadioColorCell) {
                ((RadioColorCell) childAt).setChecked(childAt == view, true);
            }
        }
    }

    public static void m1996$r8$lambda$tCYtRsH65mgszRwAV6vMp291X8(int[] iArr, MessagesStorage.IntCallback intCallback, AlertDialog alertDialog, int i) {
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
                AlertsCreator.$r8$lambda$HIpu5BX8TMJZid3Sw3E2W3bvcW4(activity, alertDialog, i);
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

    public static void $r8$lambda$HIpu5BX8TMJZid3Sw3E2W3bvcW4(Activity activity, AlertDialog alertDialog, int i) {
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
                AlertsCreator.m1961$r8$lambda$NM8dWZ3VRvOos5CntgUnlVVKTc(activity, z, alertDialog, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), onButtonClickListener);
        builder.setTopViewAspectRatio(0.50427353f);
        return builder;
    }

    public static void m1961$r8$lambda$NM8dWZ3VRvOos5CntgUnlVVKTc(Activity activity, boolean z, AlertDialog alertDialog, int i) {
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
                AlertsCreator.m1975$r8$lambda$UphUSWQK17Ccf1fYtYmm9ww5q8(context, alertDialog, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setTopViewAspectRatio(0.5769231f);
        return builder;
    }

    public static void m1975$r8$lambda$UphUSWQK17Ccf1fYtYmm9ww5q8(Context context, AlertDialog alertDialog, int i) {
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
                launchActivity.presentFragment(new CacheControlActivity());
            }
        });
        return builder.create();
    }

    public static Dialog createPrioritySelectDialog(Activity activity, long j, int i, int i2, Runnable runnable) {
        return createPrioritySelectDialog(activity, j, i, i2, runnable, null);
    }

    public static Dialog createPrioritySelectDialog(Activity activity, long j, final long j2, int i, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        String[] strArr;
        final long j3 = j;
        final int i2 = i;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i3 = notificationsSettings.getInt("priority_" + j3, 3);
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
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        int i5 = 0;
        while (i5 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i5));
            radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            radioColorCell.setTextAndValue(strArr2[i5], iArr[0] == i5);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.$r8$lambda$S6EhQrhOSmE6FIW40bSdClMX0Oo(iArr, j3, j2, i2, notificationsSettings, builder, runnable, view);
                }
            });
            i5++;
            j3 = j;
            i2 = i;
        }
        builder.setTitle(LocaleController.getString(R.string.NotificationsImportance));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void $r8$lambda$S6EhQrhOSmE6FIW40bSdClMX0Oo(int[] iArr, long j, long j2, int i, SharedPreferences sharedPreferences, AlertDialog.Builder builder, Runnable runnable, View view) {
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
                    AlertsCreator.$r8$lambda$UPYTJM7W1afuEQYPifD24Qz2m_U(iArr, i, builder, runnable, view);
                }
            });
            i2++;
        }
        builder.setTitle(LocaleController.getString(R.string.PopupNotification));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void $r8$lambda$UPYTJM7W1afuEQYPifD24Qz2m_U(int[] iArr, int i, AlertDialog.Builder builder, Runnable runnable, View view) {
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
                    AlertsCreator.$r8$lambda$zmJStr41tP6nYyNKNtBH0HQXZvI(builder, onClickListener, view);
                }
            });
            i2++;
        }
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
        return builder.create();
    }

    public static void $r8$lambda$zmJStr41tP6nYyNKNtBH0HQXZvI(AlertDialog.Builder builder, DialogInterface.OnClickListener onClickListener, View view) {
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
                return AlertsCreator.m1992$r8$lambda$rUjl1vLvbTmHOmMCAXUUwCUKCI(i2);
            }
        });
        builder.setView(numberPicker);
        builder.setNegativeButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                AlertsCreator.$r8$lambda$uvqGVjYda547Ggw9Gm2Glg80YsQ(encryptedChat, numberPicker, alertDialog, i2);
            }
        });
        return builder;
    }

    public static String m1992$r8$lambda$rUjl1vLvbTmHOmMCAXUUwCUKCI(int i) {
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

    public static void $r8$lambda$uvqGVjYda547Ggw9Gm2Glg80YsQ(TLRPC.EncryptedChat encryptedChat, NumberPicker numberPicker, AlertDialog alertDialog, int i) {
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
                        AlertsCreator.m1942$r8$lambda$6TKM3SXam8Y6Q2ZmVm8zM5T8pI(alertDialogArr, dismissRunnable, accountSelectDelegate, view);
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

    public static void m1942$r8$lambda$6TKM3SXam8Y6Q2ZmVm8zM5T8pI(AlertDialog[] alertDialogArr, Runnable runnable, AccountSelectDelegate accountSelectDelegate, View view) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.setOnDismissListener(null);
        }
        runnable.run();
        accountSelectDelegate.didSelectAccount(((AccountSelectCell) view).getAccountNumber());
    }

    public static void createDeleteMessagesAlert(final BaseFragment baseFragment, TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i, final int i2, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider) {
        Activity parentActivity;
        int size;
        long jMakeEncryptedDialogId;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        boolean z6;
        TLRPC.MessageAction messageAction;
        boolean z7;
        AlertDialog.Builder builder;
        int i8;
        AlertDialog.Builder builder2;
        int i9;
        int i10;
        boolean z8;
        String str;
        int i11;
        AlertDialog alertDialogCreate;
        TextView textView;
        TextView textView2;
        AlertDialog.Builder builder3;
        AlertDialog.Builder builder4;
        int i12;
        int i13;
        TLRPC.MessageAction messageAction2;
        final int i14;
        final int i15;
        TLRPC.Message message;
        int i16;
        final TLRPC.User user2 = user;
        MessageObject messageObject2 = messageObject;
        boolean z9 = i2 == 1;
        boolean z10 = i2 == 3;
        if (baseFragment != null) {
            if ((user2 == null && chat == null && encryptedChat == null) || (parentActivity = baseFragment.getParentActivity()) == null) {
                return;
            }
            final int currentAccount = baseFragment.getCurrentAccount();
            AlertDialog.Builder builder5 = new AlertDialog.Builder(parentActivity, resourcesProvider);
            builder5.setDimAlpha(runnable2 != null ? 0.5f : 0.6f);
            if (groupedMessages != null) {
                size = groupedMessages.messages.size();
            } else {
                size = messageObject2 != null ? 1 : sparseArrayArr[0].size() + sparseArrayArr[1].size();
            }
            if (encryptedChat != null) {
                jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            } else if (user2 != null) {
                jMakeEncryptedDialogId = user2.id;
            } else {
                jMakeEncryptedDialogId = -chat.id;
            }
            final long j3 = jMakeEncryptedDialogId;
            if (z9) {
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (i16 = message.schedule_repeat_period) > 0) {
                    i14 = message.date;
                    i15 = i16;
                } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                    i14 = 0;
                    i15 = 0;
                } else {
                    int i17 = groupedMessages.messages.get(0).messageOwner.date;
                    i15 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
                    i14 = i17;
                }
                if (i14 > 0 && i15 > 0) {
                    String string = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i15));
                    if (i15 == 31536000) {
                        string = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                    } else if (i15 >= 2592000) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i15 / 2592000, new Object[0]);
                    } else if (i15 >= 604800) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i15 / 604800, new Object[0]);
                    } else if (i15 >= 86400) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i15 / 86400, new Object[0]);
                    }
                    final boolean z11 = z10;
                    new AlertDialog.Builder(parentActivity, resourcesProvider).setTitle(LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle)).setMessage(LocaleController.getString(R.string.MessageScheduledRepeatDeleteText)).setNegativeButton(string, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i18) {
                            AlertsCreator.$r8$lambda$Fse0bs0FUgL8R1tIibUFNudXsx4(groupedMessages, currentAccount, baseFragment, i14, i15, messageObject, alertDialog, i18);
                        }
                    }).setNeutralButton(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i18) {
                            AlertsCreator.$r8$lambda$El27Es6zZ5unVzJ9RMidjaovZKI(j3, z11, currentAccount, messageObject, groupedMessages, encryptedChat, j, i, i2, sparseArrayArr, runnable, alertDialog, i18);
                        }
                    }).setPositiveButton(LocaleController.getString(R.string.Cancel), null).makeRed(-2).makeRed(-3).setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AlertsCreator.$r8$lambda$YiYDC9ZqnvZds3Qux6K7CEryNxI(runnable2, dialogInterface);
                        }
                    }).show();
                    return;
                }
                messageObject2 = messageObject;
            }
            final Runnable runnable3 = runnable2;
            boolean z12 = z10;
            final int i18 = currentAccount;
            int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
            MessagesController.getInstance(i18).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
            if (messageObject2 != null) {
                z4 = !messageObject2.isDice() || Math.abs(currentTime - messageObject2.messageOwner.date) > 86400;
                if (messageObject2.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    z2 = message2.paid_suggested_post_stars;
                    z = message2.paid_suggested_post_ton;
                    z3 = z12;
                    i3 = currentTime;
                } else {
                    z3 = z12;
                    i3 = currentTime;
                    z = false;
                    z2 = false;
                }
            } else {
                int i19 = 0;
                z = false;
                z2 = false;
                boolean z13 = false;
                while (i19 < 2) {
                    int i20 = 0;
                    while (true) {
                        z5 = z12;
                        if (i20 < sparseArrayArr[i19].size()) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i19].valueAt(i20);
                            if (messageObject3.isDice()) {
                                i4 = i20;
                                i5 = currentTime;
                                if (Math.abs(currentTime - messageObject3.messageOwner.date) > 86400) {
                                }
                                if (messageObject3.isPaidSuggestedPostProtected()) {
                                    TLRPC.Message message3 = messageObject3.messageOwner;
                                    z2 |= message3.paid_suggested_post_stars;
                                    z |= message3.paid_suggested_post_ton;
                                }
                                i20 = i4 + 1;
                                z12 = z5;
                                currentTime = i5;
                            } else {
                                i4 = i20;
                                i5 = currentTime;
                            }
                            z13 = true;
                            if (messageObject3.isPaidSuggestedPostProtected()) {
                                TLRPC.Message message4 = messageObject3.messageOwner;
                                z2 |= message4.paid_suggested_post_stars;
                                z |= message4.paid_suggested_post_ton;
                            }
                            i20 = i4 + 1;
                            z12 = z5;
                            currentTime = i5;
                        }
                    }
                    i19++;
                    z12 = z5;
                    currentTime = currentTime;
                }
                z3 = z12;
                i3 = currentTime;
                z4 = z13;
            }
            if (groupedMessages != null) {
                for (int i21 = 0; i21 < groupedMessages.messages.size(); i21++) {
                    MessageObject messageObject4 = groupedMessages.messages.get(i21);
                    if (messageObject4.isPaidSuggestedPostProtected()) {
                        TLRPC.Message message5 = messageObject4.messageOwner;
                        boolean z14 = message5.paid_suggested_post_stars | z2;
                        z = message5.paid_suggested_post_ton | z;
                        z2 = z14;
                    }
                }
            }
            boolean z15 = z;
            boolean z16 = z2;
            final boolean[] zArr = new boolean[1];
            boolean z17 = user2 != null && MessagesController.getInstance(i18).canRevokePmInbox;
            if (user2 != null) {
                i6 = MessagesController.getInstance(i18).revokeTimePmLimit;
            } else {
                i6 = MessagesController.getInstance(i18).revokeTimeLimit;
            }
            boolean z18 = encryptedChat == null && user2 != null && z17 && i6 == Integer.MAX_VALUE;
            boolean z19 = z17;
            int i22 = size;
            if (chat != null && chat.megagroup && !z9 && !z3) {
                ArrayList arrayList = new ArrayList();
                if (messageObject2 != null) {
                    TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                    if (messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser)) {
                        if (groupedMessages != null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            arrayList.add(messageObject2);
                        }
                    }
                    i12 = (!messageObject2.isSendError() && messageObject2.getDialogId() == j && ((messageAction2 = messageObject2.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject2.isOut() && i3 - messageObject2.messageOwner.date <= i6) ? 1 : 0;
                } else {
                    int i23 = 1;
                    i12 = 0;
                    while (i23 >= 0) {
                        int i24 = 0;
                        while (i24 < sparseArrayArr[i23].size()) {
                            MessageObject messageObject5 = (MessageObject) sparseArrayArr[i23].valueAt(i24);
                            int i25 = i24;
                            if (i23 == 1 && messageObject5.isOut()) {
                                TLRPC.Message message6 = messageObject5.messageOwner;
                                i13 = i23;
                                if (message6.action == null && i3 - message6.date <= i6) {
                                    i12++;
                                }
                            } else {
                                i13 = i23;
                            }
                            arrayList.add(messageObject5);
                            i24 = i25 + 1;
                            i23 = i13;
                        }
                        i23--;
                    }
                }
                final long clientUserId = UserConfig.getInstance(i18).getClientUserId();
                ArrayList arrayList2 = (ArrayList) Collection.EL.stream(arrayList).filter(new Predicate() {
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
                        return AlertsCreator.m1948$r8$lambda$EFq37VBW8vo0QsyMmv_jA_FETI((MessageObject) obj);
                    }
                }).mapToLong(new ToLongFunction() {
                    @Override
                    public final long applyAsLong(Object obj) {
                        return ((MessageObject) obj).getFromChatId();
                    }
                }).distinct().mapToObj(new LongFunction() {
                    @Override
                    public final Object apply(long j4) {
                        return AlertsCreator.m1940$r8$lambda$50d03PVFVJwpfTfrOOU3f0D5oQ(i18, j4);
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
                        return AlertsCreator.$r8$lambda$hpRKH2toyVjwxIyyioD2XRqR21U(clientUserId, (TLObject) obj);
                    }
                }).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda257()));
                if (!arrayList2.isEmpty()) {
                    if (channelParticipantArr == null) {
                        final AlertDialog[] alertDialogArr = {new AlertDialog(parentActivity, 3)};
                        final int size2 = arrayList2.size();
                        int i26 = i18;
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        final int[] iArr2 = new int[1];
                        final int i27 = 0;
                        while (i27 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i27));
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i26);
                            int i28 = i26;
                            ArrayList arrayList3 = arrayList2;
                            final int[] iArr3 = iArr;
                            final Runnable runnable4 = runnable3;
                            RequestDelegate requestDelegate = new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            AlertsCreator.m1979$r8$lambda$eNEnxorrMcDedDjvVEOR6O2cik(iArr, iArr, i, tLObject, channelParticipantArr, i, alertDialogArr, baseFragment, user, chat, encryptedChat, chatFull, j, messageObject, sparseArrayArr, groupedMessages, i, i, runnable, runnable, resourcesProvider);
                                        }
                                    });
                                }
                            };
                            iArr = iArr3;
                            int i29 = i27;
                            iArr[i29] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                            runnable3 = runnable2;
                            size2 = size2;
                            user2 = user2;
                            iArr2 = iArr2;
                            i27 = i29 + 1;
                            i26 = i28;
                            arrayList2 = arrayList3;
                        }
                        final int i30 = i26;
                        final int[] iArr4 = iArr;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                AlertsCreator.$r8$lambda$Gfm6RMR2kv9xu5XKwtGcLyTIf78(alertDialogArr, iArr4, i30, runnable2, baseFragment);
                            }
                        }, 1000L);
                        return;
                    }
                    DeleteMessagesBottomSheet deleteMessagesBottomSheet = new DeleteMessagesBottomSheet(baseFragment, chat, arrayList, arrayList2, channelParticipantArr, j, i, i2, false, runnable);
                    if (runnable3 != null) {
                        deleteMessagesBottomSheet.setOnHideListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                runnable3.run();
                            }
                        });
                    }
                    deleteMessagesBottomSheet.show();
                    return;
                }
                j2 = 1000;
                if (i12 <= 0 || !z4) {
                    i7 = i12;
                    z6 = false;
                    z7 = false;
                } else {
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    CheckBoxCell checkBoxCell = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                    checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCell.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false);
                    checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.m1987$r8$lambda$kbgx7kFYJqcwpgFkA8zr3Y_hjw(zArr, view);
                        }
                    });
                    builder5.setView(frameLayout);
                    builder5.setCustomViewOffset(9);
                    i18 = i18;
                    i7 = i12;
                    z6 = false;
                    z7 = true;
                }
            } else {
                j2 = 1000;
                if (z9 || z3 || ChatObject.isChannel(chat) || encryptedChat != null) {
                    i7 = 0;
                    z6 = false;
                } else {
                    if ((user2 == null || user2.id == UserConfig.getInstance(i18).getClientUserId() || (user2.bot && !user2.support)) && chat == null) {
                        i18 = i18;
                        i7 = 0;
                        z6 = false;
                    } else if (messageObject2 != null) {
                        i7 = (messageObject2.isSendError() || !((messageAction = messageObject2.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject2.isOut() || z19 || ChatObject.hasAdminRights(chat)) || i3 - messageObject2.messageOwner.date > i6)) ? 0 : 1;
                        i18 = i18;
                        z6 = !messageObject2.isOut();
                    } else {
                        int i31 = 0;
                        z6 = false;
                        for (int i32 = 1; i32 >= 0; i32--) {
                            int i33 = 0;
                            while (i33 < sparseArrayArr[i32].size()) {
                                MessageObject messageObject6 = (MessageObject) sparseArrayArr[i32].valueAt(i33);
                                int i34 = i18;
                                TLRPC.MessageAction messageAction4 = messageObject6.messageOwner.action;
                                if ((messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction4 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction4 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject6.isOut() || z19 || (chat != null && ChatObject.canBlockUsers(chat))) && i3 - messageObject6.messageOwner.date <= i6)) {
                                    i31++;
                                    if (!z6 && !messageObject6.isOut()) {
                                        z6 = true;
                                    }
                                }
                                i33++;
                                i18 = i34;
                            }
                        }
                        i18 = i18;
                        i7 = i31;
                    }
                    if (i7 > 0 && z4 && (user == null || !UserObject.isDeleted(user))) {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        CheckBoxCell checkBoxCell2 = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                        checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (z18) {
                            checkBoxCell2.setText(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false);
                        } else if (chat != null && (z6 || i7 == i22)) {
                            checkBoxCell2.setText(LocaleController.getString(R.string.DeleteForAll), "", false, false);
                        } else {
                            checkBoxCell2.setText(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false);
                        }
                        checkBoxCell2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(checkBoxCell2, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        checkBoxCell2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                AlertsCreator.$r8$lambda$bGkuT195hlVEtVuPZaYzY2o_1oI(zArr, view);
                            }
                        });
                        builder5.setView(frameLayout2);
                        builder5.setCustomViewOffset(9);
                        z7 = true;
                    }
                }
                z7 = false;
            }
            final int i35 = i18;
            int i36 = i7;
            final boolean z20 = z3;
            AlertDialog.OnButtonClickListener onButtonClickListener = new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i37) {
                    AlertsCreator.m1938$r8$lambda$49VA2U1NeUd0CG7QK1ZL_Kd4_E(j3, z20, i35, messageObject, groupedMessages, encryptedChat, j, i, zArr, i2, sparseArrayArr, runnable, alertDialog, i37);
                }
            };
            if (!z20) {
                builder = builder5;
                if (i8 == 1) {
                    builder.setTitle(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                } else {
                    builder.setTitle(LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i8, new Object[0])));
                }
            } else if (i8 == 1) {
                builder4 = builder5;
                builder4.setTitle(LocaleController.getString(R.string.UnsaveSingleMessagesTitle));
            } else {
                builder3 = builder5;
                builder3.setTitle(LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i8, new Object[0])));
            }
            if (!z20) {
                i8 = i22;
                builder2 = builder;
                i8 = i22;
                builder2 = builder;
                i8 = i22;
                builder2 = builder3;
                if (chat == null || !z6) {
                    i8 = i22;
                    builder2 = builder4;
                    if (!z7 || z18 || i36 == i8) {
                        if (chat == null || !chat.megagroup || z9) {
                            if (i8 == 1) {
                                builder2.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                            } else {
                                builder2.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                            }
                        } else if (i8 == 1) {
                            if (messageObject != null && messageObject.isEphemeral()) {
                                i9 = R.string.AreYouSureDeleteSingleMessage;
                            } else {
                                i9 = R.string.AreYouSureDeleteSingleMessageMega;
                            }
                            builder2.setMessage(LocaleController.getString(i9));
                        } else {
                            builder2.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega));
                        }
                    } else if (chat != null) {
                        builder2.setMessage(LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i36, new Object[0])));
                    } else {
                        builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i36, new Object[0]), UserObject.getFirstName(user))));
                    }
                } else if (z7 && i36 != i8) {
                    builder2.setMessage(LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i36, new Object[0])));
                } else if (i8 == 1) {
                    builder2.setMessage(LocaleController.getString(R.string.AreYouSureDeleteSingleMessage));
                } else {
                    builder2.setMessage(LocaleController.getString(R.string.AreYouSureDeleteFewMessages));
                }
            } else if (i8 == 1) {
                builder2.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage));
            } else {
                builder2.setMessage(LocaleController.getString(R.string.AreYouSureUnsaveFewMessages));
            }
            if (messageObject != null) {
                z8 = messageObject.isGiveaway() && !messageObject.isForwarded();
                if (z8) {
                    long j4 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date) * j2;
                    String str2 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j4));
                    z8 = System.currentTimeMillis() < j4;
                    str = str2;
                } else {
                    str = null;
                }
            } else {
                if (i8 == 1) {
                    z8 = false;
                    str = null;
                    for (int i37 = 1; i37 >= 0; i37--) {
                        for (int i38 = 0; i38 < sparseArrayArr[i37].size(); i38++) {
                            MessageObject messageObject7 = (MessageObject) sparseArrayArr[i37].valueAt(i38);
                            boolean z21 = messageObject7.isGiveaway() && !messageObject7.isForwarded();
                            if (z21) {
                                long j5 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject7.messageOwner.media).until_date) * j2;
                                String str3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j5));
                                z8 = System.currentTimeMillis() < j5;
                                str = str3;
                            } else {
                                z8 = z21;
                            }
                        }
                    }
                } else {
                    i10 = -1;
                    z8 = false;
                    str = null;
                }
                if (z16) {
                    int i39 = (int) MessagesController.getInstance(i35).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder2.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                    builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i39))));
                    builder2.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z15) {
                    int i40 = (int) MessagesController.getInstance(i35).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    builder2.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                    builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i40))));
                    builder2.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
                } else if (z8 || z20) {
                    if (z20) {
                        i11 = R.string.Remove;
                    } else {
                        i11 = R.string.Delete;
                    }
                    builder2.setPositiveButton(LocaleController.getString(i11), onButtonClickListener);
                } else {
                    builder2.setTitle(LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle));
                    builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str)));
                    builder2.setNeutralButton(LocaleController.getString(R.string.Delete), onButtonClickListener);
                }
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder2.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AlertsCreator.$r8$lambda$shbnAatIWjRTJVdhllbfQqdlhaE(runnable2, dialogInterface);
                    }
                });
                alertDialogCreate = builder2.create();
                baseFragment.showDialog(alertDialogCreate);
                textView = (TextView) alertDialogCreate.getButton(i10);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
                textView2 = (TextView) alertDialogCreate.getButton(-3);
                if (textView2 != null) {
                    alertDialogCreate.getButtonsLayout().setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) alertDialogCreate.getButtonsLayout().getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }
            i10 = -1;
            if (z16) {
                int i310 = (int) MessagesController.getInstance(i35).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder2.setTitle(LocaleController.getString(R.string.SuggestionStarsWillBeLost));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i310))));
                builder2.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z15) {
                int i41 = (int) MessagesController.getInstance(i35).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                builder2.setTitle(LocaleController.getString(R.string.SuggestionTONWillBeLost));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i41))));
                builder2.setPositiveButton(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), onButtonClickListener);
            } else if (z8) {
                if (z20) {
                    i11 = R.string.Remove;
                } else {
                    i11 = R.string.Delete;
                }
                builder2.setPositiveButton(LocaleController.getString(i11), onButtonClickListener);
            } else {
                if (z20) {
                    i11 = R.string.Remove;
                } else {
                    i11 = R.string.Delete;
                }
                builder2.setPositiveButton(LocaleController.getString(i11), onButtonClickListener);
            }
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder2.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertsCreator.$r8$lambda$shbnAatIWjRTJVdhllbfQqdlhaE(runnable2, dialogInterface);
                }
            });
            alertDialogCreate = builder2.create();
            baseFragment.showDialog(alertDialogCreate);
            textView = (TextView) alertDialogCreate.getButton(i10);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
            textView2 = (TextView) alertDialogCreate.getButton(-3);
            if (textView2 != null) {
                alertDialogCreate.getButtonsLayout().setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) alertDialogCreate.getButtonsLayout().getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public static void $r8$lambda$Fse0bs0FUgL8R1tIibUFNudXsx4(MessageObject.GroupedMessages groupedMessages, int i, BaseFragment baseFragment, int i2, int i3, MessageObject messageObject, AlertDialog alertDialog, int i4) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(i).editMessage(groupedMessages.messages.get(0), null, false, baseFragment, null, i2 + i3, i3);
        } else {
            SendMessagesHelper.getInstance(i).editMessage(messageObject, null, false, baseFragment, null, i2 + i3, i3);
        }
    }

    public static void $r8$lambda$El27Es6zZ5unVzJ9RMidjaovZKI(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
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

    public static void $r8$lambda$YiYDC9ZqnvZds3Qux6K7CEryNxI(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean m1948$r8$lambda$EFq37VBW8vo0QsyMmv_jA_FETI(MessageObject messageObject) {
        return !messageObject.isEphemeral();
    }

    public static TLObject m1940$r8$lambda$50d03PVFVJwpfTfrOOU3f0D5oQ(int i, long j) {
        if (j > 0) {
            return MessagesController.getInstance(i).getUser(Long.valueOf(j));
        }
        return MessagesController.getInstance(i).getChat(Long.valueOf(-j));
    }

    public static boolean $r8$lambda$hpRKH2toyVjwxIyyioD2XRqR21U(long j, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id != j;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return !ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
        }
        return false;
    }

    public static void m1979$r8$lambda$eNEnxorrMcDedDjvVEOR6O2cik(int[] iArr, int[] iArr2, int i, TLObject tLObject, TLRPC.ChannelParticipant[] channelParticipantArr, int i2, AlertDialog[] alertDialogArr, BaseFragment baseFragment, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, TLRPC.ChatFull chatFull, long j, MessageObject messageObject, SparseArray[] sparseArrayArr, MessageObject.GroupedMessages groupedMessages, int i3, int i4, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
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

    public static void $r8$lambda$Gfm6RMR2kv9xu5XKwtGcLyTIf78(AlertDialog[] alertDialogArr, final int[] iArr, final int i, final Runnable runnable, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                AlertsCreator.$r8$lambda$Khvy2O8CSUZ7RNkcHUhrljTfhPg(iArr, i, runnable, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void $r8$lambda$Khvy2O8CSUZ7RNkcHUhrljTfhPg(int[] iArr, int i, Runnable runnable, DialogInterface dialogInterface) {
        for (int i2 : iArr) {
            if (i2 != 0) {
                ConnectionsManager.getInstance(i).cancelRequest(i2, true);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void m1987$r8$lambda$kbgx7kFYJqcwpgFkA8zr3Y_hjw(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void $r8$lambda$bGkuT195hlVEtVuPZaYzY2o_1oI(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void m1938$r8$lambda$49VA2U1NeUd0CG7QK1ZL_Kd4_E(long j, boolean z, int i, MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC.EncryptedChat encryptedChat, long j2, int i2, boolean[] zArr, int i3, SparseArray[] sparseArrayArr, Runnable runnable, AlertDialog alertDialog, int i4) {
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

    public static void $r8$lambda$shbnAatIWjRTJVdhllbfQqdlhaE(Runnable runnable, DialogInterface dialogInterface) {
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
                AlertsCreator.$r8$lambda$_r3RcvTconMV7D20v6ZBT5fPT8k(alertDialog, i2);
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
                return AlertsCreator.$r8$lambda$NoSunofCr_9GnwXXstYARvp3pLQ(textView2, i3, keyEvent);
            }
        });
        editTextBoldCursor.setText(generateThemeName(themeAccent));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AlertsCreator.$r8$lambda$Mf3yD52gvDlbJXbrPusGFwBelYA(editTextBoldCursor);
                    }
                });
            }
        });
        baseFragment.showDialog(alertDialogCreate);
        editTextBoldCursor.requestFocus();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws Throwable {
                AlertsCreator.m1968$r8$lambda$QKtMfAVTeEyfiIdaREtYzDIn4Q(baseFragment, editTextBoldCursor, themeAccent, themeInfo, alertDialogCreate, view);
            }
        });
    }

    public static boolean $r8$lambda$NoSunofCr_9GnwXXstYARvp3pLQ(TextView textView, int i, KeyEvent keyEvent) {
        AndroidUtilities.hideKeyboard(textView);
        return false;
    }

    public static void $r8$lambda$Mf3yD52gvDlbJXbrPusGFwBelYA(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void m1968$r8$lambda$QKtMfAVTeEyfiIdaREtYzDIn4Q(final BaseFragment baseFragment, final EditTextBoldCursor editTextBoldCursor, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo, final AlertDialog alertDialog, View view) throws Throwable {
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
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() throws Throwable {
                            AlertsCreator.processCreate(editTextBoldCursor, alertDialog, baseFragment);
                        }
                    });
                }
            });
            return;
        }
        processCreate(editTextBoldCursor, alertDialog, baseFragment);
    }

    public static void processCreate(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) throws Throwable {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        Theme.ThemeInfo themeInfoCreateNewTheme = Theme.createNewTheme(editTextBoldCursor.getText().toString());
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeListUpdated, new Object[0]);
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
                AlertsCreator.$r8$lambda$z1MZBzZkPDURI31kp_2PuqmM3X0(callback, editText, alertDialog, i);
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

    public static void $r8$lambda$z1MZBzZkPDURI31kp_2PuqmM3X0(Utilities.Callback callback, EditText editText, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        if (callback != null) {
            callback.run(editText.getText().toString());
        }
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Theme.ResourcesProvider resourcesProvider, int i) {
        return createSuggestedMessageDatePickerDialog(context, j, scheduleDatePickerDelegate, null, new ScheduleDatePickerColors(), resourcesProvider, i);
    }

    public static BottomSheet.Builder createSuggestedMessageDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider, int i) {
        long j2;
        Calendar calendar;
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
                return AlertsCreator.$r8$lambda$gYIk1AITF0ps4wFFU9fxFZgzP3c(view, motionEvent);
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
                return AlertsCreator.$r8$lambda$1HreA47cic2DI0iWvJkZk6xPpyU(view, motionEvent);
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        final int i2 = calendar2.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j3 = configTime.get(timeUnit) * 2;
        final long j4 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
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
                return AlertsCreator.m1986$r8$lambda$kRcsrOaKcYAxS2nZY24ZTyBooc(i2, i3);
            }
        });
        final int i3 = i == 1 ? 5 : 3;
        NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i4, int i5) {
                AlertsCreator.checkScheduleDate(textView3, null, j3, j4, i3, numberPicker, numberPicker2, numberPicker3);
            }
        };
        numberPicker.setOnValueChangedListener(onValueChangeListener);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return String.format("%02d", Integer.valueOf(i4));
            }
        });
        numberPicker2.setOnValueChangedListener(onValueChangeListener);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i4) {
                return String.format("%02d", Integer.valueOf(i4));
            }
        });
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(onValueChangeListener);
        if (j <= 0 || j == 2147483646) {
            j2 = j3;
            calendar = calendar2;
        } else {
            long j5 = 1000 * j;
            j2 = j3;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j5 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j5);
            if (timeInMillis >= 0) {
                numberPicker3.setValue(calendar.get(12));
                numberPicker2.setValue(calendar.get(11));
                numberPicker.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        final long j6 = j2;
        checkScheduleDate(textView3, null, j6, j4, i3, numberPicker, numberPicker2, numberPicker3);
        textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView3.setGravity(17);
        textView3.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 8.0f));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 4));
        final Calendar calendar3 = calendar;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.$r8$lambda$UslW02T3dCRO8e82nlRUSo3ET5g(zArr, j6, j4, i3, numberPicker, numberPicker2, numberPicker3, calendar3, scheduleDatePickerDelegate, builder, view);
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
                AlertsCreator.$r8$lambda$f6_CdOStFOMsWjNuTm_dtMAhtU0(zArr, scheduleDatePickerDelegate, builder, view);
            }
        });
        ScaleStateListAnimator.apply(textView4, 0.02f, 1.2f);
        builder.setCustomView(linearLayout);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.m1977$r8$lambda$_uZXHpSghzjq7fwWAYiRCNqfU(runnable, zArr, dialogInterface);
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String m1986$r8$lambda$kRcsrOaKcYAxS2nZY24ZTyBooc(int i, int i2) {
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

    public static void $r8$lambda$UslW02T3dCRO8e82nlRUSo3ET5g(boolean[] zArr, long j, long j2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
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

    public static void $r8$lambda$f6_CdOStFOMsWjNuTm_dtMAhtU0(boolean[] zArr, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        scheduleDatePickerDelegate.didSelectDate(true, -1, 0);
        builder.getDismissRunnable().run();
    }

    public static void m1977$r8$lambda$_uZXHpSghzjq7fwWAYiRCNqfU(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
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
                AlertsCreator.$r8$lambda$PdRfzyJwBfQZKnM4rm1jjjUgqtY(i, buttonWithCounterView, bottomSheetCreate, j, resourcesProvider, view);
            }
        });
        bottomSheetCreate.fixNavigationBar();
        bottomSheetCreate.show();
    }

    public static void $r8$lambda$PdRfzyJwBfQZKnM4rm1jjjUgqtY(final int i, final ButtonWithCounterView buttonWithCounterView, final BottomSheet bottomSheet, final long j, final Theme.ResourcesProvider resourcesProvider, View view) {
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AlertsCreator.$r8$lambda$p_pBOoOX7R1YsAxU0ji33V9L7vg(tLObject, i, buttonWithCounterView, bottomSheet, j, tL_error, resourcesProvider);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$p_pBOoOX7R1YsAxU0ji33V9L7vg(TLObject tLObject, final int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider) {
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListFindUpdates.get(i2);
                i2++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.getInstance(i).processUpdates(updates, false);
                }
            });
            if (groupCall == null || LaunchActivity.instance == null) {
                buttonWithCounterView.setLoading(false);
                return;
            }
            bottomSheet.dismiss();
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
        bottomSheet.dismiss();
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall, false, groupcall.call, null);
        SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(groupcall.call.invite_link, j));
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
                return AlertsCreator.$r8$lambda$xfre_n6kI6Yzkx5DqCCNGwmyglQ(strArr, i2);
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
                return AlertsCreator.$r8$lambda$vTK8rgu3VmNvz3GtPZXFNz9bPrg(view, motionEvent);
            }
        });
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                bottomSheetArr[0].dismiss();
            }
        });
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
        builder.setCustomView(linearLayout2);
        BottomSheet bottomSheetShow = builder.show();
        bottomSheetShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                callback.run(Integer.valueOf(numberPicker.getValue()));
            }
        });
        bottomSheetShow.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        bottomSheetShow.fixNavigationBar(scheduleDatePickerColors.backgroundColor);
        BottomSheet bottomSheetCreate = builder.create();
        final BottomSheet[] bottomSheetArr = {bottomSheetCreate};
        return bottomSheetCreate;
    }

    public static String $r8$lambda$xfre_n6kI6Yzkx5DqCCNGwmyglQ(String[] strArr, int i) {
        return strArr[i];
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
                AlertsCreator.$r8$lambda$OnT2j_R1FVTV8_FH3L1zMRWnAzk(zArr, dismissRunnable, view);
            }
        });
        buttonWithCounterView.setRound();
        buttonWithCounterView.setText(LocaleController.getString(R.string.DisableSharingInfoButton), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        builder.setCustomView(linearLayout);
        builder.show().setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.m1984$r8$lambda$iAiQlrBcPuFoBOcGOpxoD_JGZU(zArr, runnable);
            }
        });
    }

    public static void $r8$lambda$OnT2j_R1FVTV8_FH3L1zMRWnAzk(boolean[] zArr, Runnable runnable, View view) {
        zArr[0] = true;
        runnable.run();
    }

    public static void m1984$r8$lambda$iAiQlrBcPuFoBOcGOpxoD_JGZU(boolean[] zArr, Runnable runnable) {
        if (!zArr[0] || runnable == null) {
            return;
        }
        runnable.run();
    }
}
