package org.telegram.p009ui.Components;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.CacheControlActivity;
import org.telegram.p009ui.Cells.AccountSelectCell;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Cells.RadioColorCell;
import org.telegram.p009ui.Cells.TextColorCell;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.NumberPicker;
import org.telegram.p009ui.Components.voip.VoIPHelper;
import org.telegram.p009ui.LanguageSelectActivity;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.p009ui.LoginActivity;
import org.telegram.p009ui.NotificationsCustomSettingsActivity;
import org.telegram.p009ui.NotificationsSettingsActivity;
import org.telegram.p009ui.ProfileNotificationsActivity;
import org.telegram.p009ui.ThemePreviewActivity;
import org.telegram.p009ui.TooManyCommunitiesActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$ReportReason;
import org.telegram.tgnet.TLRPC$TL_account_changePhone;
import org.telegram.tgnet.TLRPC$TL_account_confirmPhone;
import org.telegram.tgnet.TLRPC$TL_account_getAuthorizationForm;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_getTmpPassword;
import org.telegram.tgnet.TLRPC$TL_account_reportPeer;
import org.telegram.tgnet.TLRPC$TL_account_saveSecureValue;
import org.telegram.tgnet.TLRPC$TL_account_sendChangePhoneCode;
import org.telegram.tgnet.TLRPC$TL_account_sendConfirmPhoneCode;
import org.telegram.tgnet.TLRPC$TL_account_updateProfile;
import org.telegram.tgnet.TLRPC$TL_account_verifyEmail;
import org.telegram.tgnet.TLRPC$TL_account_verifyPhone;
import org.telegram.tgnet.TLRPC$TL_auth_resendCode;
import org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_createChannel;
import org.telegram.tgnet.TLRPC$TL_channels_editAdmin;
import org.telegram.tgnet.TLRPC$TL_channels_editBanned;
import org.telegram.tgnet.TLRPC$TL_channels_inviteToChannel;
import org.telegram.tgnet.TLRPC$TL_channels_joinChannel;
import org.telegram.tgnet.TLRPC$TL_channels_reportSpam;
import org.telegram.tgnet.TLRPC$TL_contacts_blockFromReplies;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_support;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonChildAbuse;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonFake;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonIllegalDrugs;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonPersonalDetails;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonPornography;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonSpam;
import org.telegram.tgnet.TLRPC$TL_inputReportReasonViolence;
import org.telegram.tgnet.TLRPC$TL_langPackLanguage;
import org.telegram.tgnet.TLRPC$TL_messages_addChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImport;
import org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImportPeer;
import org.telegram.tgnet.TLRPC$TL_messages_createChat;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAdmin;
import org.telegram.tgnet.TLRPC$TL_messages_editChatDefaultBannedRights;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_forwardMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_importChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_initHistoryImport;
import org.telegram.tgnet.TLRPC$TL_messages_migrateChat;
import org.telegram.tgnet.TLRPC$TL_messages_report;
import org.telegram.tgnet.TLRPC$TL_messages_sendInlineBotResult;
import org.telegram.tgnet.TLRPC$TL_messages_sendMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendMessage;
import org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_startBot;
import org.telegram.tgnet.TLRPC$TL_messages_startHistoryImport;
import org.telegram.tgnet.TLRPC$TL_payments_sendPaymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_validateRequestedInfo;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_phone_inviteToGroupCall;
import org.telegram.tgnet.TLRPC$TL_updateUserName;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserStatus;

public class AlertsCreator {

    public interface AccountSelectDelegate {
        void didSelectAccount(int i);
    }

    public interface BlockDialogCallback {
        void run(boolean z, boolean z2);
    }

    public interface DatePickerDelegate {
        void didSelectDate(int i, int i2, int i3);
    }

    public interface ScheduleDatePickerDelegate {
        void didSelectDate(boolean z, int i);
    }

    public interface SoundFrequencyDelegate {
        void didSelectValues(int i, int i2);
    }

    public static boolean lambda$createAutoDeleteDatePickerDialog$63(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createCalendarPickerDialog$76(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createChangeBioAlert$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$createChangeNameAlert$33(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static boolean lambda$createDatePickerDialog$56(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createDeleteMessagesAlert$117(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static boolean lambda$createMuteForPickerDialog$73(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createReportAlert$85(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static boolean lambda$createScheduleDatePickerDialog$47(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$createSoundFrequencyPickerDialog$69(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createThemeCreateDialog$120(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$sendReport$83(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static Dialog createForgotPasscodeDialog(Context context) {
        return new AlertDialog.Builder(context).setTitle(LocaleController.getString((int) C0952R.string.ForgotPasscode)).setMessage(LocaleController.getString((int) C0952R.string.ForgotPasscodeInfo)).setPositiveButton(LocaleController.getString((int) C0952R.string.Close), null).create();
    }

    public static Dialog createLocationRequiredDialog(final Context context, boolean z) {
        String str;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (z) {
            str = LocaleController.getString("PermissionNoLocationFriends", C0952R.string.PermissionNoLocationFriends);
        } else {
            str = LocaleController.getString("PermissionNoLocationPeopleNearby", C0952R.string.PermissionNoLocationPeopleNearby);
        }
        return builder.setMessage(AndroidUtilities.replaceTags(str)).setTopAnimation(C0952R.raw.permission_request_location, 72, false, Theme.getColor("dialogTopBackground")).setPositiveButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createLocationRequiredDialog$0(context, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void lambda$createLocationRequiredDialog$0(Context context, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public static Dialog createBackgroundActivityDialog(final Context context) {
        return new AlertDialog.Builder(context).setTitle(LocaleController.getString((int) C0952R.string.AllowBackgroundActivity)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(OneUIUtilities.isOneUI() ? Build.VERSION.SDK_INT >= 31 ? C0952R.string.AllowBackgroundActivityInfoOneUIAboveS : C0952R.string.AllowBackgroundActivityInfoOneUIBelowS : C0952R.string.AllowBackgroundActivityInfo))).setTopAnimation(C0952R.raw.permission_request_apk, 72, false, Theme.getColor("dialogTopBackground")).setPositiveButton(LocaleController.getString((int) C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createBackgroundActivityDialog$1(context, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void lambda$createBackgroundActivityDialog$1(Context context, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public static Dialog createWebViewPermissionsRequestDialog(final Context context, Theme.ResourcesProvider resourcesProvider, String[] strArr, int i, String str, String str2, final Consumer<Boolean> consumer) {
        final boolean z;
        if (strArr != null && (context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog.Builder topAnimation = new AlertDialog.Builder(context, resourcesProvider).setTopAnimation(i, 72, false, Theme.getColor("dialogTopBackground"));
        if (z) {
            str = str2;
        }
        return topAnimation.setMessage(AndroidUtilities.replaceTags(str)).setPositiveButton(LocaleController.getString(z ? C0952R.string.PermissionOpenSettings : C0952R.string.BotWebViewRequestAllow), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$2(z, context, atomicBoolean, consumer, dialogInterface, i2);
            }
        }).setNegativeButton(LocaleController.getString((int) C0952R.string.BotWebViewRequestDontAllow), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$3(atomicBoolean, consumer, dialogInterface, i2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createWebViewPermissionsRequestDialog$4(atomicBoolean, consumer, dialogInterface);
            }
        }).create();
    }

    public static void lambda$createWebViewPermissionsRequestDialog$2(boolean z, Context context, AtomicBoolean atomicBoolean, Consumer consumer, DialogInterface dialogInterface, int i) {
        if (z) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                context.startActivity(intent);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        } else {
            atomicBoolean.set(true);
            consumer.accept(Boolean.TRUE);
        }
    }

    public static void lambda$createWebViewPermissionsRequestDialog$3(AtomicBoolean atomicBoolean, Consumer consumer, DialogInterface dialogInterface, int i) {
        atomicBoolean.set(true);
        consumer.accept(Boolean.FALSE);
    }

    public static void lambda$createWebViewPermissionsRequestDialog$4(AtomicBoolean atomicBoolean, Consumer consumer, DialogInterface dialogInterface) {
        if (!atomicBoolean.get()) {
            consumer.accept(Boolean.FALSE);
        }
    }

    public static Dialog createApkRestrictedDialog(final Context context, Theme.ResourcesProvider resourcesProvider) {
        return new AlertDialog.Builder(context, resourcesProvider).setMessage(LocaleController.getString("ApkRestricted", C0952R.string.ApkRestricted)).setTopAnimation(C0952R.raw.permission_request_apk, 72, false, Theme.getColor("dialogTopBackground")).setPositiveButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createApkRestrictedDialog$5(context, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), null).create();
    }

    public static void lambda$createApkRestrictedDialog$5(Context context, DialogInterface dialogInterface, int i) {
        try {
            context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public static Dialog processError(int i, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, Object... objArr) {
        String str;
        TLRPC$InputPeer tLRPC$InputPeer;
        int i2 = tLRPC$TL_error.code;
        if (i2 == 406 || (str = tLRPC$TL_error.text) == null) {
            return null;
        }
        boolean z = tLObject instanceof TLRPC$TL_messages_initHistoryImport;
        if (z || (tLObject instanceof TLRPC$TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC$TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC$TL_messages_startHistoryImport)) {
            if (z) {
                tLRPC$InputPeer = ((TLRPC$TL_messages_initHistoryImport) tLObject).peer;
            } else {
                tLRPC$InputPeer = tLObject instanceof TLRPC$TL_messages_startHistoryImport ? ((TLRPC$TL_messages_startHistoryImport) tLObject).peer : null;
            }
            if (str.contains("USER_IS_BLOCKED")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorUserBlocked", C0952R.string.ImportErrorUserBlocked));
            } else if (tLRPC$TL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportMutualError", C0952R.string.ImportMutualError));
            } else if (tLRPC$TL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser) {
                    showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorChatInvalidUser", C0952R.string.ImportErrorChatInvalidUser));
                } else {
                    showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorChatInvalidGroup", C0952R.string.ImportErrorChatInvalidGroup));
                }
            } else if (tLRPC$TL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorNotAdmin", C0952R.string.ImportErrorNotAdmin));
            } else if (tLRPC$TL_error.text.startsWith("IMPORT_FORMAT")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorFileFormatInvalid", C0952R.string.ImportErrorFileFormatInvalid));
            } else if (tLRPC$TL_error.text.startsWith("PEER_ID_INVALID")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorPeerInvalid", C0952R.string.ImportErrorPeerInvalid));
            } else if (tLRPC$TL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportErrorFileLang", C0952R.string.ImportErrorFileLang));
            } else if (tLRPC$TL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                showSimpleAlert(baseFragment, LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle), LocaleController.getString("ImportFailedToUpload", C0952R.string.ImportFailedToUpload));
            } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                showFloodWaitAlert(tLRPC$TL_error.text, baseFragment);
            } else {
                String string = LocaleController.getString("ImportErrorTitle", C0952R.string.ImportErrorTitle);
                showSimpleAlert(baseFragment, string, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text);
            }
        } else if (!(tLObject instanceof TLRPC$TL_account_saveSecureValue) && !(tLObject instanceof TLRPC$TL_account_getAuthorizationForm)) {
            boolean z2 = tLObject instanceof TLRPC$TL_channels_joinChannel;
            if (!z2 && !(tLObject instanceof TLRPC$TL_channels_editAdmin) && !(tLObject instanceof TLRPC$TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC$TL_messages_addChatUser) && !(tLObject instanceof TLRPC$TL_messages_startBot) && !(tLObject instanceof TLRPC$TL_channels_editBanned) && !(tLObject instanceof TLRPC$TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC$TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC$TL_messages_migrateChat) && !(tLObject instanceof TLRPC$TL_phone_inviteToGroupCall)) {
                if (tLObject instanceof TLRPC$TL_messages_createChat) {
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        baseFragment.presentFragment(new TooManyCommunitiesActivity(2));
                        return null;
                    } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        showFloodWaitAlert(tLRPC$TL_error.text, baseFragment);
                    } else {
                        showAddUserAlert(tLRPC$TL_error.text, baseFragment, false, tLObject);
                    }
                } else if (tLObject instanceof TLRPC$TL_channels_createChannel) {
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        baseFragment.presentFragment(new TooManyCommunitiesActivity(2));
                        return null;
                    } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        showFloodWaitAlert(tLRPC$TL_error.text, baseFragment);
                    } else {
                        showAddUserAlert(tLRPC$TL_error.text, baseFragment, false, tLObject);
                    }
                } else if (tLObject instanceof TLRPC$TL_messages_editMessage) {
                    if (!str.equals("MESSAGE_NOT_MODIFIED")) {
                        if (baseFragment != null) {
                            showSimpleAlert(baseFragment, LocaleController.getString("EditMessageError", C0952R.string.EditMessageError));
                        } else {
                            showSimpleToast(null, LocaleController.getString("EditMessageError", C0952R.string.EditMessageError));
                        }
                    }
                } else if ((tLObject instanceof TLRPC$TL_messages_sendMessage) || (tLObject instanceof TLRPC$TL_messages_sendMedia) || (tLObject instanceof TLRPC$TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC$TL_messages_forwardMessages) || (tLObject instanceof TLRPC$TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC$TL_messages_sendScheduledMessages)) {
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1809401834:
                            if (str.equals("USER_BANNED_IN_CHANNEL")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -454039871:
                            if (str.equals("PEER_FLOOD")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1169786080:
                            if (str.equals("SCHEDULE_TOO_MUCH")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, 5);
                            break;
                        case 1:
                            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, 0);
                            break;
                        case 2:
                            showSimpleToast(baseFragment, LocaleController.getString("MessageScheduledLimitReached", C0952R.string.MessageScheduledLimitReached));
                            break;
                    }
                } else if (tLObject instanceof TLRPC$TL_messages_importChatInvite) {
                    if (str.startsWith("FLOOD_WAIT")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    } else if (tLRPC$TL_error.text.equals("USERS_TOO_MUCH")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("JoinToGroupErrorFull", C0952R.string.JoinToGroupErrorFull));
                    } else if (tLRPC$TL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        baseFragment.presentFragment(new TooManyCommunitiesActivity(0));
                    } else if (tLRPC$TL_error.text.equals("INVITE_HASH_EXPIRED")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("ExpiredLink", C0952R.string.ExpiredLink), LocaleController.getString("InviteExpired", C0952R.string.InviteExpired));
                    } else {
                        showSimpleAlert(baseFragment, LocaleController.getString("JoinToGroupErrorNotExist", C0952R.string.JoinToGroupErrorNotExist));
                    }
                } else if (tLObject instanceof TLRPC$TL_messages_getAttachedStickers) {
                    if (!(baseFragment == null || baseFragment.getParentActivity() == null)) {
                        Activity parentActivity = baseFragment.getParentActivity();
                        Toast.makeText(parentActivity, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text, 0).show();
                    }
                } else if ((tLObject instanceof TLRPC$TL_account_confirmPhone) || (tLObject instanceof TLRPC$TL_account_verifyPhone) || (tLObject instanceof TLRPC$TL_account_verifyEmail)) {
                    if (str.contains("PHONE_CODE_EMPTY") || tLRPC$TL_error.text.contains("PHONE_CODE_INVALID") || tLRPC$TL_error.text.contains("CODE_INVALID") || tLRPC$TL_error.text.contains("CODE_EMPTY")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("InvalidCode", C0952R.string.InvalidCode));
                    }
                    if (tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED") || tLRPC$TL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("CodeExpired", C0952R.string.CodeExpired));
                    }
                    if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    }
                    return showSimpleAlert(baseFragment, tLRPC$TL_error.text);
                } else if (tLObject instanceof TLRPC$TL_auth_resendCode) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("InvalidPhoneNumber", C0952R.string.InvalidPhoneNumber));
                    }
                    if (tLRPC$TL_error.text.contains("PHONE_CODE_EMPTY") || tLRPC$TL_error.text.contains("PHONE_CODE_INVALID")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("InvalidCode", C0952R.string.InvalidCode));
                    }
                    if (tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("CodeExpired", C0952R.string.CodeExpired));
                    }
                    if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    }
                    if (tLRPC$TL_error.code != -1000) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text);
                    }
                } else if (tLObject instanceof TLRPC$TL_account_sendConfirmPhoneCode) {
                    if (i2 == 400) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("CancelLinkExpired", C0952R.string.CancelLinkExpired));
                    }
                    if (str.startsWith("FLOOD_WAIT")) {
                        return showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    }
                    return showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred));
                } else if (tLObject instanceof TLRPC$TL_account_changePhone) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("InvalidPhoneNumber", C0952R.string.InvalidPhoneNumber));
                    } else if (tLRPC$TL_error.text.contains("PHONE_CODE_EMPTY") || tLRPC$TL_error.text.contains("PHONE_CODE_INVALID")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("InvalidCode", C0952R.string.InvalidCode));
                    } else if (tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("CodeExpired", C0952R.string.CodeExpired));
                    } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    } else {
                        showSimpleAlert(baseFragment, tLRPC$TL_error.text);
                    }
                } else if (tLObject instanceof TLRPC$TL_account_sendChangePhoneCode) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.needShowInvalidAlert(baseFragment, (String) objArr[0], false);
                    } else if (tLRPC$TL_error.text.contains("PHONE_CODE_EMPTY") || tLRPC$TL_error.text.contains("PHONE_CODE_INVALID")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("InvalidCode", C0952R.string.InvalidCode));
                    } else if (tLRPC$TL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("CodeExpired", C0952R.string.CodeExpired));
                    } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    } else if (tLRPC$TL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                        showSimpleAlert(baseFragment, LocaleController.formatString("ChangePhoneNumberOccupied", C0952R.string.ChangePhoneNumberOccupied, objArr[0]));
                    } else if (tLRPC$TL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                        LoginActivity.needShowInvalidAlert(baseFragment, (String) objArr[0], true);
                    } else {
                        showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred));
                    }
                } else if (tLObject instanceof TLRPC$TL_updateUserName) {
                    str.hashCode();
                    if (str.equals("USERNAME_INVALID")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("UsernameInvalid", C0952R.string.UsernameInvalid));
                    } else if (!str.equals("USERNAME_OCCUPIED")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred));
                    } else {
                        showSimpleAlert(baseFragment, LocaleController.getString("UsernameInUse", C0952R.string.UsernameInUse));
                    }
                } else if (tLObject instanceof TLRPC$TL_contacts_importContacts) {
                    if (str.startsWith("FLOOD_WAIT")) {
                        showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
                    } else {
                        showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text);
                    }
                } else if ((tLObject instanceof TLRPC$TL_account_getPassword) || (tLObject instanceof TLRPC$TL_account_getTmpPassword)) {
                    if (str.startsWith("FLOOD_WAIT")) {
                        showSimpleToast(baseFragment, getFloodWaitString(tLRPC$TL_error.text));
                    } else {
                        showSimpleToast(baseFragment, tLRPC$TL_error.text);
                    }
                } else if (tLObject instanceof TLRPC$TL_payments_sendPaymentForm) {
                    str.hashCode();
                    if (str.equals("BOT_PRECHECKOUT_FAILED")) {
                        showSimpleToast(baseFragment, LocaleController.getString("PaymentPrecheckoutFailed", C0952R.string.PaymentPrecheckoutFailed));
                    } else if (!str.equals("PAYMENT_FAILED")) {
                        showSimpleToast(baseFragment, tLRPC$TL_error.text);
                    } else {
                        showSimpleToast(baseFragment, LocaleController.getString("PaymentFailed", C0952R.string.PaymentFailed));
                    }
                } else if (tLObject instanceof TLRPC$TL_payments_validateRequestedInfo) {
                    str.hashCode();
                    if (!str.equals("SHIPPING_NOT_AVAILABLE")) {
                        showSimpleToast(baseFragment, tLRPC$TL_error.text);
                    } else {
                        showSimpleToast(baseFragment, LocaleController.getString("PaymentNoShippingMethod", C0952R.string.PaymentNoShippingMethod));
                    }
                }
                return null;
            } else if (baseFragment == null || !str.equals("CHANNELS_TOO_MUCH")) {
                if (baseFragment != null) {
                    showAddUserAlert(tLRPC$TL_error.text, baseFragment, (objArr == null || objArr.length <= 0) ? false : ((Boolean) objArr[0]).booleanValue(), tLObject);
                } else if (tLRPC$TL_error.text.equals("PEER_FLOOD")) {
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.needShowAlert, 1);
                }
            } else if (z2 || (tLObject instanceof TLRPC$TL_channels_inviteToChannel)) {
                baseFragment.presentFragment(new TooManyCommunitiesActivity(0));
                return null;
            } else {
                baseFragment.presentFragment(new TooManyCommunitiesActivity(1));
                return null;
            }
        } else if (str.contains("PHONE_NUMBER_INVALID")) {
            showSimpleAlert(baseFragment, LocaleController.getString("InvalidPhoneNumber", C0952R.string.InvalidPhoneNumber));
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            showSimpleAlert(baseFragment, LocaleController.getString("FloodWait", C0952R.string.FloodWait));
        } else if ("APP_VERSION_OUTDATED".equals(tLRPC$TL_error.text)) {
            showUpdateAppAlert(baseFragment.getParentActivity(), LocaleController.getString("UpdateAppAlert", C0952R.string.UpdateAppAlert), true);
        } else {
            showSimpleAlert(baseFragment, LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text);
        }
        return null;
    }

    public static Toast showSimpleToast(BaseFragment baseFragment, String str) {
        Context context;
        if (str == null) {
            return null;
        }
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            context = ApplicationLoader.applicationContext;
        } else {
            context = baseFragment.getParentActivity();
        }
        Toast makeText = Toast.makeText(context, str, 1);
        makeText.show();
        return makeText;
    }

    public static AlertDialog showUpdateAppAlert(final Context context, String str, boolean z) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
        builder.setMessage(str);
        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
        if (z) {
            builder.setNegativeButton(LocaleController.getString("UpdateApp", C0952R.string.UpdateApp), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertsCreator.lambda$showUpdateAppAlert$6(context, dialogInterface, i);
                }
            });
        }
        return builder.show();
    }

    public static void lambda$showUpdateAppAlert$6(Context context, DialogInterface dialogInterface, int i) {
        Browser.openUrl(context, BuildVars.PLAYSTORE_APP_URL);
    }

    public static AlertDialog.Builder createLanguageAlert(final LaunchActivity launchActivity, final TLRPC$TL_langPackLanguage tLRPC$TL_langPackLanguage) {
        String str;
        int i;
        if (tLRPC$TL_langPackLanguage == null) {
            return null;
        }
        tLRPC$TL_langPackLanguage.lang_code = tLRPC$TL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
        tLRPC$TL_langPackLanguage.plural_code = tLRPC$TL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
        String str2 = tLRPC$TL_langPackLanguage.base_lang_code;
        if (str2 != null) {
            tLRPC$TL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
        if (LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tLRPC$TL_langPackLanguage.lang_code)) {
            builder.setTitle(LocaleController.getString("Language", C0952R.string.Language));
            str = LocaleController.formatString("LanguageSame", C0952R.string.LanguageSame, tLRPC$TL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString("OK", C0952R.string.OK), null);
            builder.setNeutralButton(LocaleController.getString("SETTINGS", C0952R.string.SETTINGS), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AlertsCreator.lambda$createLanguageAlert$7(LaunchActivity.this, dialogInterface, i2);
                }
            });
        } else if (tLRPC$TL_langPackLanguage.strings_count == 0) {
            builder.setTitle(LocaleController.getString("LanguageUnknownTitle", C0952R.string.LanguageUnknownTitle));
            str = LocaleController.formatString("LanguageUnknownCustomAlert", C0952R.string.LanguageUnknownCustomAlert, tLRPC$TL_langPackLanguage.name);
            builder.setNegativeButton(LocaleController.getString("OK", C0952R.string.OK), null);
        } else {
            builder.setTitle(LocaleController.getString("LanguageTitle", C0952R.string.LanguageTitle));
            str = tLRPC$TL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", C0952R.string.LanguageAlert, tLRPC$TL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tLRPC$TL_langPackLanguage.translated_count / tLRPC$TL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", C0952R.string.LanguageCustomAlert, tLRPC$TL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tLRPC$TL_langPackLanguage.translated_count / tLRPC$TL_langPackLanguage.strings_count) * 100.0f)));
            builder.setPositiveButton(LocaleController.getString("Change", C0952R.string.Change), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AlertsCreator.lambda$createLanguageAlert$8(TLRPC$TL_langPackLanguage.this, launchActivity, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str));
        int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            i = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i2);
            if (i != -1) {
                spannableStringBuilder.delete(i, i + 1);
                spannableStringBuilder.delete(indexOf, i2);
            }
        } else {
            i = -1;
        }
        if (!(indexOf == -1 || i == -1)) {
            spannableStringBuilder.setSpan(new URLSpanNoUnderline(tLRPC$TL_langPackLanguage.translations_url) {
                @Override
                public void onClick(View view) {
                    builder.getDismissRunnable().run();
                    super.onClick(view);
                }
            }, indexOf, i - 1, 33);
        }
        TextView textView = new TextView(launchActivity);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 16.0f);
        textView.setLinkTextColor(Theme.getColor("dialogTextLink"));
        textView.setHighlightColor(Theme.getColor("dialogLinkSelection"));
        textView.setPadding(AndroidUtilities.m34dp(23.0f), 0, AndroidUtilities.m34dp(23.0f), 0);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        builder.setView(textView);
        return builder;
    }

    public static void lambda$createLanguageAlert$7(LaunchActivity launchActivity, DialogInterface dialogInterface, int i) {
        launchActivity.lambda$runLinkRequest$54(new LanguageSelectActivity());
    }

    public static void lambda$createLanguageAlert$8(TLRPC$TL_langPackLanguage tLRPC$TL_langPackLanguage, LaunchActivity launchActivity, DialogInterface dialogInterface, int i) {
        String str;
        if (tLRPC$TL_langPackLanguage.official) {
            str = "remote_" + tLRPC$TL_langPackLanguage.lang_code;
        } else {
            str = "unofficial_" + tLRPC$TL_langPackLanguage.lang_code;
        }
        LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
        if (languageFromDict == null) {
            languageFromDict = new LocaleController.LocaleInfo();
            languageFromDict.name = tLRPC$TL_langPackLanguage.native_name;
            languageFromDict.nameEnglish = tLRPC$TL_langPackLanguage.name;
            languageFromDict.shortName = tLRPC$TL_langPackLanguage.lang_code;
            languageFromDict.baseLangCode = tLRPC$TL_langPackLanguage.base_lang_code;
            languageFromDict.pluralLangCode = tLRPC$TL_langPackLanguage.plural_code;
            languageFromDict.isRtl = tLRPC$TL_langPackLanguage.rtl;
            if (tLRPC$TL_langPackLanguage.official) {
                languageFromDict.pathToFile = "remote";
            } else {
                languageFromDict.pathToFile = "unofficial";
            }
        }
        LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount);
        launchActivity.rebuildAllFragments(true);
    }

    public static boolean checkSlowMode(Context context, int i, long j, boolean z) {
        TLRPC$Chat chat;
        if (!DialogObject.isChatDialog(j) || (chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z) {
            TLRPC$ChatFull chatFull = MessagesController.getInstance(i).getChatFull(chat.f854id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i).loadChatInfo(chat.f854id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        createSimpleAlert(context, chat.title, LocaleController.getString("SlowmodeSendError", C0952R.string.SlowmodeSendError)).show();
        return true;
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str) {
        return createSimpleAlert(context, null, str);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2) {
        return createSimpleAlert(context, str, str2, null);
    }

    public static AlertDialog.Builder createSimpleAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (str == null) {
            str = LocaleController.getString("AppName", C0952R.string.AppName);
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
        return builder;
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str) {
        return showSimpleAlert(baseFragment, null, str);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str, String str2) {
        return showSimpleAlert(baseFragment, str, str2, null);
    }

    public static Dialog showSimpleAlert(BaseFragment baseFragment, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        if (str2 == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        AlertDialog create = createSimpleAlert(baseFragment.getParentActivity(), str, str2, resourcesProvider).create();
        baseFragment.showDialog(create);
        return create;
    }

    public static void showBlockReportSpamReplyAlert(final ChatActivity chatActivity, final MessageObject messageObject, long j, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        if (chatActivity != null && chatActivity.getParentActivity() != null && messageObject != null) {
            final AccountInstance accountInstance = chatActivity.getAccountInstance();
            TLRPC$User user = j > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j)) : null;
            final TLRPC$Chat chat = j < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j)) : null;
            if (user != null || chat != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity(), resourcesProvider);
                builder.setDimEnabled(runnable == null);
                builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AlertsCreator.lambda$showBlockReportSpamReplyAlert$9(runnable, dialogInterface);
                    }
                });
                builder.setTitle(LocaleController.getString("BlockUser", C0952R.string.BlockUser));
                if (user != null) {
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", C0952R.string.BlockUserReplyAlert, UserObject.getFirstName(user))));
                } else {
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", C0952R.string.BlockUserReplyAlert, chat.title)));
                }
                LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
                linearLayout.setOrientation(1);
                final CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(chatActivity.getParentActivity(), 1, resourcesProvider)};
                checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setTag(0);
                checkBoxCellArr[0].setText(LocaleController.getString("DeleteReportSpam", C0952R.string.DeleteReportSpam), "", true, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.m34dp(16.0f) : AndroidUtilities.m34dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(8.0f) : AndroidUtilities.m34dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.lambda$showBlockReportSpamReplyAlert$10(checkBoxCellArr, view);
                    }
                });
                builder.setCustomViewOffset(12);
                builder.setView(linearLayout);
                final TLRPC$User tLRPC$User = user;
                builder.setPositiveButton(LocaleController.getString("BlockAndDeleteReplies", C0952R.string.BlockAndDeleteReplies), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AlertsCreator.lambda$showBlockReportSpamReplyAlert$12(TLRPC$User.this, accountInstance, chatActivity, chat, messageObject, checkBoxCellArr, resourcesProvider, dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder.create();
                chatActivity.showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$9(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$showBlockReportSpamReplyAlert$10(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamReplyAlert$12(TLRPC$User tLRPC$User, final AccountInstance accountInstance, ChatActivity chatActivity, TLRPC$Chat tLRPC$Chat, MessageObject messageObject, CheckBoxCell[] checkBoxCellArr, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
        if (tLRPC$User != null) {
            accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), tLRPC$User.f985id);
        } else {
            accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), -tLRPC$Chat.f854id);
        }
        TLRPC$TL_contacts_blockFromReplies tLRPC$TL_contacts_blockFromReplies = new TLRPC$TL_contacts_blockFromReplies();
        tLRPC$TL_contacts_blockFromReplies.msg_id = messageObject.getId();
        tLRPC$TL_contacts_blockFromReplies.delete_message = true;
        tLRPC$TL_contacts_blockFromReplies.delete_history = true;
        if (checkBoxCellArr[0].isChecked()) {
            tLRPC$TL_contacts_blockFromReplies.report_spam = true;
            if (chatActivity.getParentActivity() != null) {
                chatActivity.getUndoView().showWithAction(0L, 74, (Runnable) null);
            }
        }
        accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_contacts_blockFromReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$11(AccountInstance.this, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$showBlockReportSpamReplyAlert$11(AccountInstance accountInstance, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public static void showBlockReportSpamAlert(org.telegram.p009ui.ActionBar.BaseFragment r17, final long r18, final org.telegram.tgnet.TLRPC$User r20, final org.telegram.tgnet.TLRPC$Chat r21, final org.telegram.tgnet.TLRPC$EncryptedChat r22, final boolean r23, org.telegram.tgnet.TLRPC$ChatFull r24, final org.telegram.messenger.MessagesStorage.IntCallback r25, org.telegram.p009ui.ActionBar.Theme.ResourcesProvider r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AlertsCreator.showBlockReportSpamAlert(org.telegram.ui.ActionBar.BaseFragment, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$showBlockReportSpamAlert$13(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$showBlockReportSpamAlert$14(TLRPC$User tLRPC$User, AccountInstance accountInstance, CheckBoxCell[] checkBoxCellArr, long j, TLRPC$Chat tLRPC$Chat, TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z, MessagesStorage.IntCallback intCallback, DialogInterface dialogInterface, int i) {
        if (tLRPC$User != null) {
            accountInstance.getMessagesController().blockPeer(tLRPC$User.f985id);
        }
        if (checkBoxCellArr == null || (checkBoxCellArr[0] != null && checkBoxCellArr[0].isChecked())) {
            accountInstance.getMessagesController().reportSpam(j, tLRPC$User, tLRPC$Chat, tLRPC$EncryptedChat, tLRPC$Chat != null && z);
        }
        if (checkBoxCellArr == null || checkBoxCellArr[1].isChecked()) {
            if (tLRPC$Chat == null) {
                accountInstance.getMessagesController().deleteDialog(j, 0);
            } else if (ChatObject.isNotInChat(tLRPC$Chat)) {
                accountInstance.getMessagesController().deleteDialog(j, 0);
            } else {
                accountInstance.getMessagesController().deleteParticipantFromChat(-j, accountInstance.getMessagesController().getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId())), null);
            }
            intCallback.run(1);
            return;
        }
        intCallback.run(0);
    }

    public static void showCustomNotificationsDialog(BaseFragment baseFragment, long j, int i, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, int i2, MessagesStorage.IntCallback intCallback) {
        showCustomNotificationsDialog(baseFragment, j, i, arrayList, i2, intCallback, null);
    }

    public static void showCustomNotificationsDialog(final BaseFragment baseFragment, final long j, final int i, final ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, final int i2, final MessagesStorage.IntCallback intCallback, final MessagesStorage.IntCallback intCallback2) {
        String[] strArr;
        Drawable drawable;
        int[] iArr;
        final AlertDialog.Builder builder;
        int i3;
        LinearLayout linearLayout;
        if (!(baseFragment == null || baseFragment.getParentActivity() == null)) {
            final boolean isGlobalNotificationsEnabled = NotificationsController.getInstance(i2).isGlobalNotificationsEnabled(j);
            String[] strArr2 = new String[5];
            strArr2[0] = LocaleController.getString("NotificationsTurnOn", C0952R.string.NotificationsTurnOn);
            ?? r8 = 1;
            strArr2[1] = LocaleController.formatString("MuteFor", C0952R.string.MuteFor, LocaleController.formatPluralString("Hours", 1));
            strArr2[2] = LocaleController.formatString("MuteFor", C0952R.string.MuteFor, LocaleController.formatPluralString("Days", 2));
            Drawable drawable2 = null;
            strArr2[3] = (j != 0 || !(baseFragment instanceof NotificationsCustomSettingsActivity)) ? LocaleController.getString("NotificationsCustomize", C0952R.string.NotificationsCustomize) : null;
            int i4 = 4;
            strArr2[4] = LocaleController.getString("NotificationsTurnOff", C0952R.string.NotificationsTurnOff);
            int[] iArr2 = {C0952R.C0953drawable.notifications_on, C0952R.C0953drawable.notifications_mute1h, C0952R.C0953drawable.notifications_mute2d, C0952R.C0953drawable.notifications_settings, C0952R.C0953drawable.notifications_off};
            LinearLayout linearLayout2 = new LinearLayout(baseFragment.getParentActivity());
            linearLayout2.setOrientation(1);
            AlertDialog.Builder builder2 = new AlertDialog.Builder(baseFragment.getParentActivity());
            int i5 = 0;
            LinearLayout linearLayout3 = linearLayout2;
            for (int i6 = 5; i5 < i6; i6 = 5) {
                if (strArr2[i5] == null) {
                    i3 = i5;
                    builder = builder2;
                    linearLayout = linearLayout3;
                    iArr = iArr2;
                    drawable = drawable2;
                    strArr = strArr2;
                } else {
                    TextView textView = new TextView(baseFragment.getParentActivity());
                    Drawable drawable3 = baseFragment.getParentActivity().getResources().getDrawable(iArr2[i5]);
                    if (i5 == i4) {
                        textView.setTextColor(Theme.getColor("dialogTextRed"));
                        drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogRedIcon"), PorterDuff.Mode.MULTIPLY));
                    } else {
                        textView.setTextColor(Theme.getColor("dialogTextBlack"));
                        drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogIcon"), PorterDuff.Mode.MULTIPLY));
                    }
                    int i7 = r8 == true ? 1 : 0;
                    int i8 = r8 == true ? 1 : 0;
                    textView.setTextSize(i7, 16.0f);
                    textView.setLines(r8);
                    textView.setMaxLines(r8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, drawable2, drawable2, drawable2);
                    textView.setTag(Integer.valueOf(i5));
                    textView.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    textView.setPadding(AndroidUtilities.m34dp(24.0f), 0, AndroidUtilities.m34dp(24.0f), 0);
                    textView.setSingleLine(r8);
                    textView.setGravity(19);
                    textView.setCompoundDrawablePadding(AndroidUtilities.m34dp(26.0f));
                    textView.setText(strArr2[i5]);
                    linearLayout3.addView(textView, LayoutHelper.createLinear(-1, 48, 51));
                    i3 = i5;
                    builder = builder2;
                    linearLayout = linearLayout3;
                    iArr = iArr2;
                    drawable = drawable2;
                    strArr = strArr2;
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.lambda$showCustomNotificationsDialog$15(j, i2, isGlobalNotificationsEnabled, intCallback2, i, baseFragment, arrayList, intCallback, builder, view);
                        }
                    });
                }
                i5 = i3 + 1;
                linearLayout3 = linearLayout;
                builder2 = builder;
                iArr2 = iArr;
                drawable2 = drawable;
                strArr2 = strArr;
                i4 = 4;
                r8 = 1;
            }
            AlertDialog.Builder builder3 = builder2;
            builder3.setTitle(LocaleController.getString("Notifications", C0952R.string.Notifications));
            builder3.setView(linearLayout3);
            baseFragment.showDialog(builder3.create());
        }
    }

    public static void lambda$showCustomNotificationsDialog$15(long j, int i, boolean z, MessagesStorage.IntCallback intCallback, int i2, BaseFragment baseFragment, ArrayList arrayList, MessagesStorage.IntCallback intCallback2, AlertDialog.Builder builder, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            if (j != 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i).edit();
                if (z) {
                    edit.remove("notify2_" + j);
                } else {
                    edit.putInt("notify2_" + j, 0);
                }
                MessagesStorage.getInstance(i).setDialogFlags(j, 0L);
                edit.commit();
                TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(i).dialogs_dict.get(j);
                if (tLRPC$Dialog != null) {
                    tLRPC$Dialog.notify_settings = new TLRPC$TL_peerNotifySettings();
                }
                NotificationsController.getInstance(i).updateServerNotificationsSettings(j);
                if (intCallback != null) {
                    if (z) {
                        intCallback.run(0);
                    } else {
                        intCallback.run(1);
                    }
                }
            } else {
                NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i2, 0);
            }
        } else if (intValue != 3) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            if (intValue == 1) {
                currentTime += 3600;
            } else if (intValue == 2) {
                currentTime += 172800;
            } else if (intValue == 4) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            NotificationsController.getInstance(i).muteUntil(j, currentTime);
            if (!(j == 0 || intCallback == null)) {
                if (intValue != 4 || z) {
                    intCallback.run(1);
                } else {
                    intCallback.run(0);
                }
            }
            if (j == 0) {
                NotificationsController.getInstance(i).setGlobalNotificationsEnabled(i2, ConnectionsManager.DEFAULT_DATACENTER_ID);
            }
        } else if (j != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            baseFragment.presentFragment(new ProfileNotificationsActivity(bundle));
        } else {
            baseFragment.presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList));
        }
        if (intCallback2 != null) {
            intCallback2.run(intValue);
        }
        builder.getDismissRunnable().run();
        int i3 = intValue == 0 ? 4 : intValue == 1 ? 0 : intValue == 2 ? 2 : intValue == 4 ? 3 : -1;
        if (i3 >= 0 && BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, i3).show();
        }
    }

    public static AlertDialog showSecretLocationAlert(Context context, int i, final Runnable runnable, boolean z, Theme.ResourcesProvider resourcesProvider) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i2 = MessagesController.getInstance(i).availableMapProviders;
        if ((i2 & 1) != 0) {
            arrayList.add(LocaleController.getString("MapPreviewProviderTelegram", C0952R.string.MapPreviewProviderTelegram));
            arrayList2.add(0);
        }
        if ((i2 & 2) != 0) {
            arrayList.add(LocaleController.getString("MapPreviewProviderGoogle", C0952R.string.MapPreviewProviderGoogle));
            arrayList2.add(1);
        }
        if ((i2 & 4) != 0) {
            arrayList.add(LocaleController.getString("MapPreviewProviderYandex", C0952R.string.MapPreviewProviderYandex));
            arrayList2.add(3);
        }
        arrayList.add(LocaleController.getString("MapPreviewProviderNobody", C0952R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        final AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("MapPreviewProviderTitle", C0952R.string.MapPreviewProviderTitle));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RadioColorCell radioColorCell = new RadioColorCell(context, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue((String) arrayList.get(i3), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i3)).intValue());
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$showSecretLocationAlert$16(arrayList2, runnable, builder, view);
                }
            });
        }
        if (!z) {
            builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        }
        AlertDialog show = builder.show();
        if (z) {
            show.setCanceledOnTouchOutside(false);
        }
        return show;
    }

    public static void lambda$showSecretLocationAlert$16(ArrayList arrayList, Runnable runnable, AlertDialog.Builder builder, View view) {
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
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        if (i > numberPicker3.getValue()) {
            numberPicker3.setValue(i);
        }
        if (numberPicker3.getValue() == i) {
            if (i2 > numberPicker2.getValue()) {
                numberPicker2.setValue(i2);
            }
            if (i2 == numberPicker2.getValue() && i3 > numberPicker.getValue()) {
                numberPicker.setValue(i3);
            }
        }
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2) {
        showOpenUrlAlert(baseFragment, str, z, true, z2, null);
    }

    public static void showOpenUrlAlert(BaseFragment baseFragment, String str, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        showOpenUrlAlert(baseFragment, str, z, true, z2, resourcesProvider);
    }

    public static void showOpenUrlAlert(final org.telegram.p009ui.ActionBar.BaseFragment r12, final java.lang.String r13, boolean r14, final boolean r15, boolean r16, org.telegram.p009ui.ActionBar.Theme.ResourcesProvider r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AlertsCreator.showOpenUrlAlert(org.telegram.ui.ActionBar.BaseFragment, java.lang.String, boolean, boolean, boolean, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$showOpenUrlAlert$17(BaseFragment baseFragment, String str, long j, boolean z, DialogInterface dialogInterface, int i) {
        Browser.openUrl(baseFragment.getParentActivity(), str, j == 0, z);
    }

    public static AlertDialog createSupportAlert(final BaseFragment baseFragment) {
        URLSpan[] uRLSpanArr;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        TextView textView = new TextView(baseFragment.getParentActivity());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString("AskAQuestionInfo", C0952R.string.AskAQuestionInfo).replace("\n", "<br>")));
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
        textView.setText(spannableString);
        textView.setTextSize(1, 16.0f);
        textView.setLinkTextColor(Theme.getColor("dialogTextLink"));
        textView.setHighlightColor(Theme.getColor("dialogLinkSelection"));
        textView.setPadding(AndroidUtilities.m34dp(23.0f), 0, AndroidUtilities.m34dp(23.0f), 0);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
        builder.setView(textView);
        builder.setTitle(LocaleController.getString("AskAQuestion", C0952R.string.AskAQuestion));
        builder.setPositiveButton(LocaleController.getString("AskButton", C0952R.string.AskButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.performAskAQuestion(BaseFragment.this);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder.create();
    }

    public static void performAskAQuestion(final BaseFragment baseFragment) {
        String string;
        final int currentAccount = baseFragment.getCurrentAccount();
        final SharedPreferences mainSettings = MessagesController.getMainSettings(currentAccount);
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(mainSettings, "support_id2", 0L);
        TLRPC$User tLRPC$User = null;
        if (prefIntOrLong != 0) {
            TLRPC$User user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(prefIntOrLong));
            if (user == null && (string = mainSettings.getString("support_user", null)) != null) {
                try {
                    byte[] decode = Base64.decode(string, 0);
                    if (decode != null) {
                        SerializedData serializedData = new SerializedData(decode);
                        TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        if (TLdeserialize != null && TLdeserialize.f985id == 333000) {
                            TLdeserialize = null;
                        }
                        serializedData.cleanup();
                        tLRPC$User = TLdeserialize;
                    }
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            }
            tLRPC$User = user;
        }
        if (tLRPC$User == null) {
            final AlertDialog alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
            alertDialog.setCanCancel(false);
            alertDialog.show();
            ConnectionsManager.getInstance(currentAccount).sendRequest(new TLObject() {
                public static int constructor = -1663104819;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$TL_help_support.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    AlertsCreator.lambda$performAskAQuestion$21(mainSettings, alertDialog, currentAccount, baseFragment, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        MessagesController.getInstance(currentAccount).putUser(tLRPC$User, true);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.f985id);
        baseFragment.presentFragment(new ChatActivity(bundle));
    }

    public static void lambda$performAskAQuestion$21(final SharedPreferences sharedPreferences, final AlertDialog alertDialog, final int i, final BaseFragment baseFragment, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_help_support tLRPC$TL_help_support = (TLRPC$TL_help_support) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AlertsCreator.lambda$performAskAQuestion$19(sharedPreferences, tLRPC$TL_help_support, alertDialog, i, baseFragment);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$performAskAQuestion$20(AlertDialog.this);
            }
        });
    }

    public static void lambda$performAskAQuestion$19(SharedPreferences sharedPreferences, TLRPC$TL_help_support tLRPC$TL_help_support, AlertDialog alertDialog, int i, BaseFragment baseFragment) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("support_id2", tLRPC$TL_help_support.user.f985id);
        SerializedData serializedData = new SerializedData();
        tLRPC$TL_help_support.user.serializeToStream(serializedData);
        edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        edit.commit();
        serializedData.cleanup();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        arrayList.add(tLRPC$TL_help_support.user);
        MessagesStorage.getInstance(i).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(i).putUser(tLRPC$TL_help_support.user, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$TL_help_support.user.f985id);
        baseFragment.presentFragment(new ChatActivity(bundle));
    }

    public static void lambda$performAskAQuestion$20(AlertDialog alertDialog) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public static void createImportDialogAlert(BaseFragment baseFragment, String str, String str2, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, final Runnable runnable) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (tLRPC$Chat != null || tLRPC$User != null) {
                int currentAccount = baseFragment.getCurrentAccount();
                Activity parentActivity = baseFragment.getParentActivity();
                AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
                long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(Theme.getColor("dialogTextBlack"));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                builder.setView(frameLayout);
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setTextSize(AndroidUtilities.m34dp(12.0f));
                BackupImageView backupImageView = new BackupImageView(parentActivity);
                backupImageView.setRoundRadius(AndroidUtilities.m34dp(20.0f));
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setText(LocaleController.getString("ImportMessages", C0952R.string.ImportMessages));
                boolean z = LocaleController.isRTL;
                int i = (z ? 5 : 3) | 48;
                int i2 = 21;
                float f = z ? 21 : 76;
                if (z) {
                    i2 = 76;
                }
                frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i, f, 11.0f, i2, 0.0f));
                frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (tLRPC$User == null) {
                    avatarDrawable.setInfo(tLRPC$Chat);
                    backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
                } else if (UserObject.isReplyUser(tLRPC$User)) {
                    avatarDrawable.setSmallSize(true);
                    avatarDrawable.setAvatarType(12);
                    backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, tLRPC$User);
                } else if (tLRPC$User.f985id == clientUserId) {
                    avatarDrawable.setSmallSize(true);
                    avatarDrawable.setAvatarType(1);
                    backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, tLRPC$User);
                } else {
                    avatarDrawable.setSmallSize(false);
                    avatarDrawable.setInfo(tLRPC$User);
                    backupImageView.setForUserOrChat(tLRPC$User, avatarDrawable);
                }
                textView.setText(AndroidUtilities.replaceTags(str2));
                builder.setPositiveButton(LocaleController.getString("Import", C0952R.string.Import), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        AlertsCreator.lambda$createImportDialogAlert$22(runnable, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                baseFragment.showDialog(builder.create());
            }
        }
    }

    public static void lambda$createImportDialogAlert$22(Runnable runnable, DialogInterface dialogInterface, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z2, boolean z3, MessagesStorage.BooleanCallback booleanCallback) {
        createClearOrDeleteDialogAlert(baseFragment, z, false, false, tLRPC$Chat, tLRPC$User, z2, false, z3, booleanCallback, null);
    }

    public static void createClearOrDeleteDialogAlert(BaseFragment baseFragment, boolean z, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z2, boolean z3, boolean z4, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        createClearOrDeleteDialogAlert(baseFragment, z, tLRPC$Chat != null && tLRPC$Chat.creator, false, tLRPC$Chat, tLRPC$User, z2, z3, z4, booleanCallback, resourcesProvider);
    }

    public static void createClearOrDeleteDialogAlert(final org.telegram.p009ui.ActionBar.BaseFragment r34, final boolean r35, final boolean r36, final boolean r37, final org.telegram.tgnet.TLRPC$Chat r38, final org.telegram.tgnet.TLRPC$User r39, final boolean r40, final boolean r41, final boolean r42, final org.telegram.messenger.MessagesStorage.BooleanCallback r43, final org.telegram.p009ui.ActionBar.Theme.ResourcesProvider r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AlertsCreator.createClearOrDeleteDialogAlert(org.telegram.ui.ActionBar.BaseFragment, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$createClearOrDeleteDialogAlert$23(boolean[] zArr, View view) {
        zArr[0] = !zArr[0];
        ((CheckBoxCell) view).setChecked(zArr[0], true);
    }

    public static void lambda$createClearOrDeleteDialogAlert$25(boolean z, boolean z2, boolean z3, final TLRPC$User tLRPC$User, final BaseFragment baseFragment, final boolean z4, final boolean z5, final TLRPC$Chat tLRPC$Chat, final boolean z6, final boolean z7, final MessagesStorage.BooleanCallback booleanCallback, final Theme.ResourcesProvider resourcesProvider, final boolean[] zArr, DialogInterface dialogInterface, int i) {
        boolean z8 = false;
        if (!z && !z2 && !z3) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                createClearOrDeleteDialogAlert(baseFragment, z4, z5, true, tLRPC$Chat, tLRPC$User, false, z6, z7, booleanCallback, resourcesProvider);
                return;
            } else if (tLRPC$User != null && zArr[0]) {
                MessagesStorage.getInstance(baseFragment.getCurrentAccount()).getMessagesCount(tLRPC$User.f985id, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i2) {
                        AlertsCreator.lambda$createClearOrDeleteDialogAlert$24(BaseFragment.this, z4, z5, tLRPC$Chat, tLRPC$User, z6, z7, booleanCallback, resourcesProvider, zArr, i2);
                    }
                });
                return;
            }
        }
        if (booleanCallback != null) {
            if (z2 || zArr[0]) {
                z8 = true;
            }
            booleanCallback.run(z8);
        }
    }

    public static void lambda$createClearOrDeleteDialogAlert$24(BaseFragment baseFragment, boolean z, boolean z2, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z3, boolean z4, MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider, boolean[] zArr, int i) {
        if (i >= 50) {
            createClearOrDeleteDialogAlert(baseFragment, z, z2, true, tLRPC$Chat, tLRPC$User, false, z3, z4, booleanCallback, resourcesProvider);
        } else if (booleanCallback != null) {
            booleanCallback.run(zArr[0]);
        }
    }

    public static void createClearDaysDialogAlert(BaseFragment baseFragment, int i, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z, final MessagesStorage.BooleanCallback booleanCallback, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        float f;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (tLRPC$User != null || tLRPC$Chat != null) {
                int currentAccount = baseFragment.getCurrentAccount();
                Activity parentActivity = baseFragment.getParentActivity();
                AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, resourcesProvider);
                long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(Theme.getColor("dialogTextBlack"));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                FrameLayout frameLayout = new FrameLayout(parentActivity) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, i4);
                        if (checkBoxCellArr[0] != null) {
                            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + checkBoxCellArr[0].getMeasuredHeight());
                        }
                    }
                };
                builder.setView(frameLayout);
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
                if (i == -1) {
                    textView2.setText(LocaleController.formatString("ClearHistory", C0952R.string.ClearHistory, new Object[0]));
                    if (tLRPC$User != null) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", C0952R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(tLRPC$User))));
                    } else if (z) {
                        if (ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", C0952R.string.AreYouSureClearHistoryWithChannel, tLRPC$Chat.title)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", C0952R.string.AreYouSureClearHistoryWithChat, tLRPC$Chat.title)));
                        }
                    } else if (tLRPC$Chat.megagroup) {
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryGroup", C0952R.string.AreYouSureClearHistoryGroup));
                    } else {
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryChannel", C0952R.string.AreYouSureClearHistoryChannel));
                    }
                } else {
                    textView2.setText(LocaleController.formatPluralString("DeleteDays", i));
                    textView.setText(LocaleController.getString("DeleteHistoryByDaysMessage", C0952R.string.DeleteHistoryByDaysMessage));
                }
                final boolean[] zArr = {false};
                if (tLRPC$Chat != null && z && !TextUtils.isEmpty(tLRPC$Chat.username)) {
                    zArr[0] = true;
                }
                if (!(tLRPC$User == null || tLRPC$User.f985id == clientUserId) || (tLRPC$Chat != null && z && TextUtils.isEmpty(tLRPC$Chat.username) && !ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat))) {
                    checkBoxCellArr[0] = new CheckBoxCell(parentActivity, 1, resourcesProvider);
                    checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (tLRPC$Chat != null) {
                        checkBoxCellArr[0].setText(LocaleController.getString("DeleteMessagesOptionAlsoChat", C0952R.string.DeleteMessagesOptionAlsoChat), "", false, false);
                    } else {
                        checkBoxCellArr[0].setText(LocaleController.formatString("DeleteMessagesOptionAlso", C0952R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(tLRPC$User)), "", false, false);
                    }
                    CheckBoxCell checkBoxCell = checkBoxCellArr[0];
                    if (LocaleController.isRTL) {
                        f = 16.0f;
                        i2 = AndroidUtilities.m34dp(16.0f);
                    } else {
                        f = 16.0f;
                        i2 = AndroidUtilities.m34dp(8.0f);
                    }
                    checkBoxCell.setPadding(i2, 0, LocaleController.isRTL ? AndroidUtilities.m34dp(8.0f) : AndroidUtilities.m34dp(f), 0);
                    frameLayout.addView(checkBoxCellArr[0], LayoutHelper.createFrame(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    checkBoxCellArr[0].setChecked(false, false);
                    checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AlertsCreator.lambda$createClearDaysDialogAlert$26(zArr, view);
                        }
                    });
                }
                CharSequence string = LocaleController.getString("Delete", C0952R.string.Delete);
                if (tLRPC$Chat != null && z && !TextUtils.isEmpty(tLRPC$Chat.username) && !ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
                    string = LocaleController.getString("ClearForAll", C0952R.string.ClearForAll);
                }
                builder.setPositiveButton(string, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        AlertsCreator.lambda$createClearDaysDialogAlert$27(MessagesStorage.BooleanCallback.this, zArr, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder.create();
                baseFragment.showDialog(create);
                TextView textView3 = (TextView) create.getButton(-1);
                if (textView3 != null) {
                    textView3.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }
    }

    public static void lambda$createClearDaysDialogAlert$26(boolean[] zArr, View view) {
        zArr[0] = !zArr[0];
        ((CheckBoxCell) view).setChecked(zArr[0], true);
    }

    public static void lambda$createClearDaysDialogAlert$27(MessagesStorage.BooleanCallback booleanCallback, boolean[] zArr, DialogInterface dialogInterface, int i) {
        booleanCallback.run(zArr[0]);
    }

    public static void createCallDialogAlert(final BaseFragment baseFragment, final TLRPC$User tLRPC$User, final boolean z) {
        String str;
        String str2;
        if (baseFragment != null && baseFragment.getParentActivity() != null && tLRPC$User != null && !UserObject.isDeleted(tLRPC$User) && UserConfig.getInstance(baseFragment.getCurrentAccount()).getClientUserId() != tLRPC$User.f985id) {
            baseFragment.getCurrentAccount();
            Activity parentActivity = baseFragment.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z) {
                str2 = LocaleController.getString("VideoCallAlertTitle", C0952R.string.VideoCallAlertTitle);
                str = LocaleController.formatString("VideoCallAlert", C0952R.string.VideoCallAlert, UserObject.getUserName(tLRPC$User));
            } else {
                str2 = LocaleController.getString("CallAlertTitle", C0952R.string.CallAlertTitle);
                str = LocaleController.formatString("CallAlert", C0952R.string.CallAlert, UserObject.getUserName(tLRPC$User));
            }
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(Theme.getColor("dialogTextBlack"));
            textView.setTextSize(1, 16.0f);
            int i = 5;
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setText(AndroidUtilities.replaceTags(str));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.m34dp(12.0f));
            avatarDrawable.setSmallSize(false);
            avatarDrawable.setInfo(tLRPC$User);
            BackupImageView backupImageView = new BackupImageView(parentActivity);
            backupImageView.setRoundRadius(AndroidUtilities.m34dp(20.0f));
            backupImageView.setForUserOrChat(tLRPC$User, avatarDrawable);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(str2);
            boolean z2 = LocaleController.isRTL;
            int i2 = (z2 ? 5 : 3) | 48;
            int i3 = 21;
            float f = z2 ? 21 : 76;
            if (z2) {
                i3 = 76;
            }
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, i2, f, 11.0f, i3, 0.0f));
            if (!LocaleController.isRTL) {
                i = 3;
            }
            frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, i | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            baseFragment.showDialog(new AlertDialog.Builder(parentActivity).setView(frameLayout).setPositiveButton(LocaleController.getString("Call", C0952R.string.Call), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    AlertsCreator.lambda$createCallDialogAlert$28(BaseFragment.this, tLRPC$User, z, dialogInterface, i4);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null).create());
        }
    }

    public static void lambda$createCallDialogAlert$28(BaseFragment baseFragment, TLRPC$User tLRPC$User, boolean z, DialogInterface dialogInterface, int i) {
        TLRPC$UserFull userFull = baseFragment.getMessagesController().getUserFull(tLRPC$User.f985id);
        VoIPHelper.startCall(tLRPC$User, z, userFull != null && userFull.video_calls_available, baseFragment.getParentActivity(), userFull, baseFragment.getAccountInstance());
    }

    public static void createChangeBioAlert(String str, final long j, final Context context, final int i) {
        String str2;
        int i2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(j > 0 ? LocaleController.getString("UserBio", C0952R.string.UserBio) : LocaleController.getString("DescriptionPlaceholder", C0952R.string.DescriptionPlaceholder));
        if (j > 0) {
            i2 = C0952R.string.VoipGroupBioEditAlertText;
            str2 = "VoipGroupBioEditAlertText";
        } else {
            i2 = C0952R.string.DescriptionInfo;
            str2 = "DescriptionInfo";
        }
        builder.setMessage(LocaleController.getString(str2, i2));
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
        editText.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
        editText.setHint(j > 0 ? LocaleController.getString("UserBio", C0952R.string.UserBio) : LocaleController.getString("DescriptionPlaceholder", C0952R.string.DescriptionPlaceholder));
        editText.setTextSize(1, 16.0f);
        editText.setBackground(Theme.createEditTextDrawable(context, true));
        editText.setMaxLines(4);
        editText.setRawInputType(147457);
        editText.setImeOptions(6);
        InputFilter[] inputFilterArr = new InputFilter[1];
        final int i3 = j > 0 ? 70 : 255;
        inputFilterArr[0] = new CodepointsLengthInputFilter(i3) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                CharSequence filter = super.filter(charSequence, i4, i5, spanned, i6, i7);
                if (!(filter == null || charSequence == null || filter.length() == charSequence.length())) {
                    Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(numberTextView, 2.0f, 0);
                }
                return filter;
            }
        };
        editText.setFilters(inputFilterArr);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, LayoutHelper.createFrame(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 14.0f, 21.0f, 0.0f));
        editText.setPadding(LocaleController.isRTL ? AndroidUtilities.m34dp(24.0f) : 0, AndroidUtilities.m34dp(8.0f), LocaleController.isRTL ? 0 : AndroidUtilities.m34dp(24.0f), AndroidUtilities.m34dp(8.0f));
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z = false;
                int codePointCount = i3 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount < 30) {
                    NumberTextView numberTextView2 = numberTextView;
                    if (numberTextView2.getVisibility() == 0) {
                        z = true;
                    }
                    numberTextView2.setNumber(codePointCount, z);
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
        final DialogInterface.OnClickListener alertsCreator$$ExternalSyntheticLambda1 = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AlertsCreator.lambda$createChangeBioAlert$30(j, i, editText, dialogInterface, i4);
            }
        };
        builder.setPositiveButton(LocaleController.getString("Save", C0952R.string.Save), alertsCreator$$ExternalSyntheticLambda1);
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AndroidUtilities.hideKeyboard(editText);
            }
        });
        frameLayout.addView(editText, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText.requestFocus();
        AndroidUtilities.showKeyboard(editText);
        final AlertDialog create = builder.create();
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean lambda$createChangeBioAlert$32;
                lambda$createChangeBioAlert$32 = AlertsCreator.lambda$createChangeBioAlert$32(j, create, alertsCreator$$ExternalSyntheticLambda1, textView, i4, keyEvent);
                return lambda$createChangeBioAlert$32;
            }
        });
        create.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
        create.show();
        create.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
    }

    public static void lambda$createChangeBioAlert$30(long j, int i, EditText editText, DialogInterface dialogInterface, int i2) {
        String str = "";
        if (j > 0) {
            TLRPC$UserFull userFull = MessagesController.getInstance(i).getUserFull(UserConfig.getInstance(i).getClientUserId());
            String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
            if (userFull != null) {
                String str2 = userFull.about;
                if (str2 != null) {
                    str = str2;
                }
                if (str.equals(trim)) {
                    AndroidUtilities.hideKeyboard(editText);
                    dialogInterface.dismiss();
                    return;
                }
                userFull.about = trim;
                NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
            }
            TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile = new TLRPC$TL_account_updateProfile();
            tLRPC$TL_account_updateProfile.about = trim;
            tLRPC$TL_account_updateProfile.flags = 4 | tLRPC$TL_account_updateProfile.flags;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_account_updateProfile, AlertsCreator$$ExternalSyntheticLambda98.INSTANCE, 2);
        } else {
            long j2 = -j;
            TLRPC$ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j2);
            String obj = editText.getText().toString();
            if (chatFull != null) {
                String str3 = chatFull.about;
                if (str3 != null) {
                    str = str3;
                }
                if (str.equals(obj)) {
                    AndroidUtilities.hideKeyboard(editText);
                    dialogInterface.dismiss();
                    return;
                }
                chatFull.about = obj;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
                int i3 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationName(i3, chatFull, 0, bool, bool);
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 2, Long.valueOf(j));
            MessagesController.getInstance(i).updateChatAbout(j2, obj, chatFull);
        }
        dialogInterface.dismiss();
    }

    public static boolean lambda$createChangeBioAlert$32(long j, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && (j <= 0 || keyEvent.getKeyCode() != 66)) || !alertDialog.isShowing()) {
            return false;
        }
        onClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void createChangeNameAlert(final long j, Context context, final int i) {
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        final EditText editText;
        if (DialogObject.isUserDialog(j)) {
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = MessagesController.getInstance(i).getChat(Long.valueOf(-j)).title;
            str2 = null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (j > 0) {
            i2 = C0952R.string.VoipEditName;
            str3 = "VoipEditName";
        } else {
            i2 = C0952R.string.VoipEditTitle;
            str3 = "VoipEditTitle";
        }
        builder.setTitle(LocaleController.getString(str3, i2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final EditText editText2 = new EditText(context);
        editText2.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
        editText2.setTextSize(1, 16.0f);
        editText2.setMaxLines(1);
        editText2.setLines(1);
        editText2.setSingleLine(true);
        editText2.setGravity(LocaleController.isRTL ? 5 : 3);
        editText2.setInputType(49152);
        editText2.setImeOptions(j > 0 ? 5 : 6);
        if (j > 0) {
            i3 = C0952R.string.FirstName;
            str4 = "FirstName";
        } else {
            i3 = C0952R.string.VoipEditTitleHint;
            str4 = "VoipEditTitleHint";
        }
        editText2.setHint(LocaleController.getString(str4, i3));
        editText2.setBackground(Theme.createEditTextDrawable(context, true));
        editText2.setPadding(0, AndroidUtilities.m34dp(8.0f), 0, AndroidUtilities.m34dp(8.0f));
        editText2.requestFocus();
        if (j > 0) {
            editText = new EditText(context);
            editText.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            editText.setTextSize(1, 16.0f);
            editText.setMaxLines(1);
            editText.setLines(1);
            editText.setSingleLine(true);
            editText.setGravity(LocaleController.isRTL ? 5 : 3);
            editText.setInputType(49152);
            editText.setImeOptions(6);
            editText.setHint(LocaleController.getString("LastName", C0952R.string.LastName));
            editText.setBackground(Theme.createEditTextDrawable(context, true));
            editText.setPadding(0, AndroidUtilities.m34dp(8.0f), 0, AndroidUtilities.m34dp(8.0f));
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
        final EditText editText3 = editText;
        final DialogInterface.OnClickListener alertsCreator$$ExternalSyntheticLambda13 = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AlertsCreator.lambda$createChangeNameAlert$34(editText2, j, i, editText3, dialogInterface, i4);
            }
        };
        builder.setPositiveButton(LocaleController.getString("Save", C0952R.string.Save), alertsCreator$$ExternalSyntheticLambda13);
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createChangeNameAlert$35(editText2, editText, dialogInterface);
            }
        });
        final AlertDialog create = builder.create();
        create.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
        create.show();
        create.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
        TextView.OnEditorActionListener alertsCreator$$ExternalSyntheticLambda83 = new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean lambda$createChangeNameAlert$36;
                lambda$createChangeNameAlert$36 = AlertsCreator.lambda$createChangeNameAlert$36(AlertDialog.this, alertsCreator$$ExternalSyntheticLambda13, textView, i4, keyEvent);
                return lambda$createChangeNameAlert$36;
            }
        };
        if (editText != null) {
            editText.setOnEditorActionListener(alertsCreator$$ExternalSyntheticLambda83);
        } else {
            editText2.setOnEditorActionListener(alertsCreator$$ExternalSyntheticLambda83);
        }
    }

    public static void lambda$createChangeNameAlert$34(EditText editText, long j, int i, EditText editText2, DialogInterface dialogInterface, int i2) {
        if (editText.getText() != null) {
            if (j > 0) {
                TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                String obj = editText.getText().toString();
                String obj2 = editText2.getText().toString();
                String str = user.first_name;
                String str2 = user.last_name;
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (!str.equals(obj) || !str2.equals(obj2)) {
                    TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile = new TLRPC$TL_account_updateProfile();
                    tLRPC$TL_account_updateProfile.flags = 3;
                    tLRPC$TL_account_updateProfile.first_name = obj;
                    user.first_name = obj;
                    tLRPC$TL_account_updateProfile.last_name = obj2;
                    user.last_name = obj2;
                    TLRPC$User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
                    if (user2 != null) {
                        user2.first_name = tLRPC$TL_account_updateProfile.first_name;
                        user2.last_name = tLRPC$TL_account_updateProfile.last_name;
                    }
                    UserConfig.getInstance(i).saveConfig(true);
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                    ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_account_updateProfile, AlertsCreator$$ExternalSyntheticLambda100.INSTANCE);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 3, Long.valueOf(j));
                } else {
                    dialogInterface.dismiss();
                    return;
                }
            } else {
                long j2 = -j;
                TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
                String obj3 = editText.getText().toString();
                String str3 = chat.title;
                if (str3 == null || !str3.equals(obj3)) {
                    chat.title = obj3;
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                    MessagesController.getInstance(i).changeChatTitle(j2, obj3);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 3, Long.valueOf(j));
                } else {
                    dialogInterface.dismiss();
                    return;
                }
            }
            dialogInterface.dismiss();
        }
    }

    public static void lambda$createChangeNameAlert$35(EditText editText, EditText editText2, DialogInterface dialogInterface) {
        AndroidUtilities.hideKeyboard(editText);
        AndroidUtilities.hideKeyboard(editText2);
    }

    public static boolean lambda$createChangeNameAlert$36(AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if ((i != 6 && keyEvent.getKeyCode() != 66) || !alertDialog.isShowing()) {
            return false;
        }
        onClickListener.onClick(alertDialog, 0);
        return true;
    }

    public static void showChatWithAdmin(BaseFragment baseFragment, TLRPC$User tLRPC$User, String str, boolean z, int i) {
        int i2;
        String str2;
        if (baseFragment.getParentActivity() != null) {
            BottomSheet.Builder builder = new BottomSheet.Builder(baseFragment.getParentActivity());
            if (z) {
                i2 = C0952R.string.ChatWithAdminChannelTitle;
                str2 = "ChatWithAdminChannelTitle";
            } else {
                i2 = C0952R.string.ChatWithAdminGroupTitle;
                str2 = "ChatWithAdminGroupTitle";
            }
            builder.setTitle(LocaleController.getString(str2, i2), true);
            LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
            linearLayout.setOrientation(1);
            TextView textView = new TextView(baseFragment.getParentActivity());
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -1, 0, 24, 16, 24, 24));
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            textView.setTextSize(1, 16.0f);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", C0952R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i, false))));
            TextView textView2 = new TextView(baseFragment.getParentActivity());
            textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
            textView2.setGravity(17);
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            textView2.setText(LocaleController.getString("IUnderstand", C0952R.string.IUnderstand));
            textView2.setTextColor(Theme.getColor("featuredStickers_buttonText"));
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(6.0f), Theme.getColor("featuredStickers_addButton"), Theme.getColor("featuredStickers_addButtonPressed")));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 0, 24, 15, 16, 24));
            builder.setCustomView(linearLayout);
            final BottomSheet show = builder.show();
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BottomSheet.this.dismiss();
                }
            });
        }
    }

    public static void createBlockDialogAlert(BaseFragment baseFragment, int i, boolean z, TLRPC$User tLRPC$User, final BlockDialogCallback blockDialogCallback) {
        String str;
        String str2;
        int i2;
        if (!(baseFragment == null || baseFragment.getParentActivity() == null)) {
            if (!(i == 1 && tLRPC$User == null)) {
                Activity parentActivity = baseFragment.getParentActivity();
                AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
                CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[2];
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                if (i == 1) {
                    String formatName = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
                    builder.setTitle(LocaleController.formatString("BlockUserTitle", C0952R.string.BlockUserTitle, formatName));
                    str = LocaleController.getString("BlockUser", C0952R.string.BlockUser);
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", C0952R.string.BlockUserMessage, formatName)));
                } else {
                    builder.setTitle(LocaleController.formatString("BlockUserTitle", C0952R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", i)));
                    str = LocaleController.getString("BlockUsers", C0952R.string.BlockUsers);
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", C0952R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", i))));
                }
                final boolean[] zArr = {true, true};
                final int i3 = 0;
                for (int i4 = 2; i3 < i4; i4 = 2) {
                    if (i3 != 0 || z) {
                        checkBoxCellArr[i3] = new CheckBoxCell(parentActivity, 1);
                        checkBoxCellArr[i3].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        if (i3 == 0) {
                            checkBoxCellArr[i3].setText(LocaleController.getString("ReportSpamTitle", C0952R.string.ReportSpamTitle), "", true, false);
                        } else {
                            CheckBoxCell checkBoxCell = checkBoxCellArr[i3];
                            if (i == 1) {
                                i2 = C0952R.string.DeleteThisChatBothSides;
                                str2 = "DeleteThisChatBothSides";
                            } else {
                                i2 = C0952R.string.DeleteTheseChatsBothSides;
                                str2 = "DeleteTheseChatsBothSides";
                            }
                            checkBoxCell.setText(LocaleController.getString(str2, i2), "", true, false);
                        }
                        checkBoxCellArr[i3].setPadding(LocaleController.isRTL ? AndroidUtilities.m34dp(16.0f) : AndroidUtilities.m34dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(8.0f) : AndroidUtilities.m34dp(16.0f), 0);
                        linearLayout.addView(checkBoxCellArr[i3], LayoutHelper.createLinear(-1, 48));
                        checkBoxCellArr[i3].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                AlertsCreator.lambda$createBlockDialogAlert$38(zArr, i3, view);
                            }
                        });
                    }
                    i3++;
                }
                builder.setPositiveButton(str, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        AlertsCreator.lambda$createBlockDialogAlert$39(AlertsCreator.BlockDialogCallback.this, zArr, dialogInterface, i5);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder.create();
                baseFragment.showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }
    }

    public static void lambda$createBlockDialogAlert$38(boolean[] zArr, int i, View view) {
        zArr[i] = !zArr[i];
        ((CheckBoxCell) view).setChecked(zArr[i], true);
    }

    public static void lambda$createBlockDialogAlert$39(BlockDialogCallback blockDialogCallback, boolean[] zArr, DialogInterface dialogInterface, int i) {
        blockDialogCallback.run(zArr[0], zArr[1]);
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
                AlertsCreator.lambda$createDatePickerDialog$40(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
            }
        });
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, -2, 0.3f));
        numberPicker.setFormatter(AlertsCreator$$ExternalSyntheticLambda113.INSTANCE);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i7, int i8) {
                AlertsCreator.updateDayPicker(NumberPicker.this, numberPicker, numberPicker3);
            }
        });
        numberPicker.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i7) {
                AlertsCreator.lambda$createDatePickerDialog$43(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i7);
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
                AlertsCreator.updateDayPicker(NumberPicker.this, numberPicker, numberPicker3);
            }
        });
        numberPicker3.setOnScrollListener(new NumberPicker.OnScrollListener() {
            @Override
            public final void onScrollStateChange(NumberPicker numberPicker4, int i8) {
                AlertsCreator.lambda$createDatePickerDialog$45(z, numberPicker2, numberPicker, numberPicker3, numberPicker4, i8);
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
        builder.setPositiveButton(LocaleController.getString("Set", C0952R.string.Set), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AlertsCreator.lambda$createDatePickerDialog$46(z, numberPicker2, numberPicker, numberPicker3, datePickerDelegate, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder;
    }

    public static void lambda$createDatePickerDialog$40(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static String lambda$createDatePickerDialog$41(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, i);
        return calendar.getDisplayName(2, 1, Locale.getDefault());
    }

    public static void lambda$createDatePickerDialog$43(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$45(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i) {
        if (z && i == 0) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
    }

    public static void lambda$createDatePickerDialog$46(boolean z, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DatePickerDelegate datePickerDelegate, DialogInterface dialogInterface, int i) {
        if (z) {
            checkPickerDate(numberPicker, numberPicker2, numberPicker3);
        }
        datePickerDelegate.didSelectDate(numberPicker3.getValue(), numberPicker2.getValue(), numberPicker.getValue());
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        return checkScheduleDate(textView, textView2, 0L, i, numberPicker, numberPicker2, numberPicker3);
    }

    public static boolean checkScheduleDate(TextView textView, TextView textView2, long j, int i, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        int i2;
        long j2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int value = numberPicker.getValue();
        int value2 = numberPicker2.getValue();
        int value3 = numberPicker3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i8 = calendar.get(1);
        int i9 = calendar.get(6);
        if (j > 0) {
            i2 = i8;
            calendar.setTimeInMillis(currentTimeMillis + (j * 1000));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            j2 = calendar.getTimeInMillis();
        } else {
            i2 = i8;
            j2 = j;
        }
        calendar.setTimeInMillis(System.currentTimeMillis() + (value * 24 * 3600 * 1000));
        calendar.set(11, value2);
        calendar.set(12, value3);
        long timeInMillis = calendar.getTimeInMillis();
        long j3 = currentTimeMillis + 60000;
        if (timeInMillis <= j3) {
            calendar.setTimeInMillis(j3);
            if (i9 != calendar.get(6)) {
                numberPicker.setValue(1);
                i7 = 11;
                i4 = 1;
            } else {
                i4 = value;
                i7 = 11;
            }
            i3 = calendar.get(i7);
            numberPicker2.setValue(i3);
            value3 = calendar.get(12);
            numberPicker3.setValue(value3);
        } else if (j2 <= 0 || timeInMillis <= j2) {
            i4 = value;
            i3 = value2;
        } else {
            calendar.setTimeInMillis(j2);
            i4 = 7;
            numberPicker.setValue(7);
            i3 = calendar.get(11);
            numberPicker2.setValue(i3);
            value3 = calendar.get(12);
            numberPicker3.setValue(value3);
        }
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis() + (i4 * 24 * 3600 * 1000));
        calendar.set(11, i3);
        calendar.set(12, value3);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (i4 == 0) {
                i6 = 1;
                i5 = 0;
            } else if (i2 == i10) {
                i6 = 1;
                i5 = 1;
            } else {
                i6 = 1;
                i5 = 2;
            }
            if (i == i6) {
                i5 += 3;
            } else if (i == 2) {
                i5 += 6;
            } else if (i == 3) {
                i5 += 9;
            }
            textView.setText(LocaleController.getInstance().formatterScheduleSend[i5].format(timeInMillis2));
        }
        if (textView2 != null) {
            int i11 = (int) ((timeInMillis2 - currentTimeMillis) / 1000);
            if (i11 > 86400) {
                str = LocaleController.formatPluralString("DaysSchedule", Math.round(i11 / 86400.0f));
            } else if (i11 >= 3600) {
                str = LocaleController.formatPluralString("HoursSchedule", Math.round(i11 / 3600.0f));
            } else if (i11 >= 60) {
                str = LocaleController.formatPluralString("MinutesSchedule", Math.round(i11 / 60.0f));
            } else {
                str = LocaleController.formatPluralString("SecondsSchedule", i11);
            }
            if (textView2.getTag() != null) {
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", C0952R.string.VoipChannelScheduleInfo, str));
            } else {
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", C0952R.string.VoipGroupScheduleInfo, str));
            }
        }
        return timeInMillis - currentTimeMillis > 60000;
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

        private ScheduleDatePickerColors(Theme.ResourcesProvider resourcesProvider) {
            this(resourcesProvider != null ? resourcesProvider.getColorOrDefault("dialogTextBlack") : Theme.getColor("dialogTextBlack"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("dialogBackground") : Theme.getColor("dialogBackground"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("key_sheet_other") : Theme.getColor("key_sheet_other"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("player_actionBarSelector") : Theme.getColor("player_actionBarSelector"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("actionBarDefaultSubmenuItem") : Theme.getColor("actionBarDefaultSubmenuItem"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("actionBarDefaultSubmenuBackground") : Theme.getColor("actionBarDefaultSubmenuBackground"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("listSelectorSDK21") : Theme.getColor("listSelectorSDK21"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("featuredStickers_buttonText") : Theme.getColor("featuredStickers_buttonText"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("featuredStickers_addButton") : Theme.getColor("featuredStickers_addButton"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("featuredStickers_addButtonPressed") : Theme.getColor("featuredStickers_addButtonPressed"));
        }

        public ScheduleDatePickerColors(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this(i, i2, i3, i4, i5, i6, i7, Theme.getColor("featuredStickers_buttonText"), Theme.getColor("featuredStickers_addButton"), Theme.getColor("featuredStickers_addButtonPressed"));
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
        return createScheduleDatePickerDialog(context, j, -1L, scheduleDatePickerDelegate, null, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, ScheduleDatePickerColors scheduleDatePickerColors) {
        return createScheduleDatePickerDialog(context, j, -1L, scheduleDatePickerDelegate, null, scheduleDatePickerColors, null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, -1L, scheduleDatePickerDelegate, runnable, resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable) {
        return createScheduleDatePickerDialog(context, j, j2, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(), null);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, long j, long j2, ScheduleDatePickerDelegate scheduleDatePickerDelegate, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        return createScheduleDatePickerDialog(context, j, j2, scheduleDatePickerDelegate, runnable, new ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public static BottomSheet.Builder createScheduleDatePickerDialog(Context context, final long j, long j2, final ScheduleDatePickerDelegate scheduleDatePickerDelegate, final Runnable runnable, final ScheduleDatePickerColors scheduleDatePickerColors, Theme.ResourcesProvider resourcesProvider) {
        LinearLayout linearLayout;
        int i;
        final Calendar calendar;
        TLRPC$User user;
        TLRPC$UserStatus tLRPC$UserStatus;
        if (context == null) {
            return null;
        }
        final long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.m34dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i2) {
                return LocaleController.formatPluralString("Hours", i2);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.m34dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider) {
            @Override
            protected CharSequence getContentDescription(int i2) {
                return LocaleController.formatPluralString("Minutes", i2);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.m34dp(34.0f));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i4 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i4);
                numberPicker2.setItemCount(i4);
                numberPicker3.setItemCount(i4);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i4;
                numberPicker2.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i4;
                numberPicker3.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i4;
                this.ignoreLayout = false;
                super.onMeasure(i2, i3);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (j == clientUserId) {
            textView.setText(LocaleController.getString("SetReminder", C0952R.string.SetReminder));
        } else {
            textView.setText(LocaleController.getString("ScheduleMessage", C0952R.string.ScheduleMessage));
        }
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda77.INSTANCE);
        if (!DialogObject.isUserDialog(j) || j == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j))) == null || user.bot || (tLRPC$UserStatus = user.status) == null || tLRPC$UserStatus.expires <= 0) {
            linearLayout = linearLayout2;
            i = 1;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            linearLayout = linearLayout2;
            final ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, scheduleDatePickerColors.iconColor, false, resourcesProvider);
            actionBarMenuItem.setLongClickEnabled(false);
            actionBarMenuItem.setSubMenuOpenSide(2);
            actionBarMenuItem.setIcon(C0952R.C0953drawable.ic_ab_other);
            i = 1;
            actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(scheduleDatePickerColors.iconSelectorColor, 1));
            frameLayout.addView(actionBarMenuItem, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            actionBarMenuItem.addSubItem(1, LocaleController.formatString("ScheduleWhenOnline", C0952R.string.ScheduleWhenOnline, firstName));
            actionBarMenuItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$48(ActionBarMenuItem.this, scheduleDatePickerColors, view);
                }
            });
            actionBarMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
                @Override
                public final void onItemClick(int i2) {
                    AlertsCreator.lambda$createScheduleDatePickerDialog$49(AlertsCreator.ScheduleDatePickerDelegate.this, builder, i2);
                }
            });
            actionBarMenuItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C0952R.string.AccDescrMoreOptions));
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        final LinearLayout linearLayout4 = linearLayout;
        linearLayout4.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        final long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(currentTimeMillis);
        final int i2 = calendar2.get(i);
        final TextView textView2 = new TextView(context) {
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
                String lambda$createScheduleDatePickerDialog$50;
                lambda$createScheduleDatePickerDialog$50 = AlertsCreator.lambda$createScheduleDatePickerDialog$50(currentTimeMillis, calendar2, i2, i3);
                return lambda$createScheduleDatePickerDialog$50;
            }
        });
        NumberPicker.OnValueChangeListener alertsCreator$$ExternalSyntheticLambda125 = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i3, int i4) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$51(linearLayout4, textView2, clientUserId, j, numberPicker, numberPicker2, numberPicker3, numberPicker4, i3, i4);
            }
        };
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda125);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(AlertsCreator$$ExternalSyntheticLambda110.INSTANCE);
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda125);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(AlertsCreator$$ExternalSyntheticLambda112.INSTANCE);
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda125);
        if (j2 <= 0 || j2 == 2147483646) {
            calendar = calendar2;
        } else {
            long j3 = 1000 * j2;
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
        final boolean[] zArr = {true};
        checkScheduleDate(textView2, null, clientUserId == j ? 1 : 0, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setBackground(Theme.AdaptiveRipple.filledRect(scheduleDatePickerColors.buttonBackgroundColor, 4.0f));
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$54(zArr, clientUserId, j, numberPicker, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout4);
        BottomSheet show = builder.show();
        show.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertsCreator.lambda$createScheduleDatePickerDialog$55(runnable, zArr, dialogInterface);
            }
        });
        show.setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static void lambda$createScheduleDatePickerDialog$48(ActionBarMenuItem actionBarMenuItem, ScheduleDatePickerColors scheduleDatePickerColors, View view) {
        actionBarMenuItem.toggleSubMenu();
        actionBarMenuItem.setPopupItemsColor(scheduleDatePickerColors.subMenuTextColor, false);
        actionBarMenuItem.setupPopupRadialSelectors(scheduleDatePickerColors.subMenuSelectorColor);
        actionBarMenuItem.redrawPopup(scheduleDatePickerColors.subMenuBackgroundColor);
    }

    public static void lambda$createScheduleDatePickerDialog$49(ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, int i) {
        if (i == 1) {
            scheduleDatePickerDelegate.didSelectDate(true, 2147483646);
            builder.getDismissRunnable().run();
        }
    }

    public static String lambda$createScheduleDatePickerDialog$50(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString("MessageScheduleToday", C0952R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().formatterScheduleDay.format(j2);
        }
        return LocaleController.getInstance().formatterScheduleYear.format(j2);
    }

    public static void lambda$createScheduleDatePickerDialog$51(LinearLayout linearLayout, TextView textView, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        checkScheduleDate(textView, null, j == j2 ? 1 : 0, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createScheduleDatePickerDialog$52(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createScheduleDatePickerDialog$53(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createScheduleDatePickerDialog$54(boolean[] zArr, long j, long j2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        zArr[0] = false;
        boolean checkScheduleDate = checkScheduleDate(null, null, j == j2 ? 1 : 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 24 * 3600 * 1000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000));
        builder.getDismissRunnable().run();
    }

    public static void lambda$createScheduleDatePickerDialog$55(Runnable runnable, boolean[] zArr, DialogInterface dialogInterface) {
        if (runnable != null && zArr[0]) {
            runnable.run();
        }
    }

    public static BottomSheet.Builder createDatePickerDialog(Context context, long j, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        LinearLayout linearLayout;
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setTextOffset(AndroidUtilities.m34dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Hours", i);
            }
        };
        numberPicker2.setItemCount(5);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setTextOffset(-AndroidUtilities.m34dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                return LocaleController.formatPluralString("Minutes", i);
            }
        };
        numberPicker3.setItemCount(5);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setTextOffset(-AndroidUtilities.m34dp(34.0f));
        final LinearLayout linearLayout2 = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("ExpireAfter", C0952R.string.ExpireAfter));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda76.INSTANCE);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setWeightSum(1.0f);
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
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
        linearLayout3.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(365);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                String lambda$createDatePickerDialog$57;
                lambda$createDatePickerDialog$57 = AlertsCreator.lambda$createDatePickerDialog$57(currentTimeMillis, calendar, i, i2);
                return lambda$createDatePickerDialog$57;
            }
        });
        NumberPicker.OnValueChangeListener alertsCreator$$ExternalSyntheticLambda126 = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i2, int i3) {
                AlertsCreator.lambda$createDatePickerDialog$58(linearLayout2, numberPicker, numberPicker2, numberPicker3, numberPicker4, i2, i3);
            }
        };
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda126);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(23);
        linearLayout3.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
        numberPicker2.setFormatter(AlertsCreator$$ExternalSyntheticLambda111.INSTANCE);
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda126);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(0);
        numberPicker3.setFormatter(AlertsCreator$$ExternalSyntheticLambda115.INSTANCE);
        linearLayout3.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda126);
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
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString("SetTimeLimit", C0952R.string.SetTimeLimit));
        LinearLayout linearLayout4 = linearLayout;
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createDatePickerDialog$61(NumberPicker.this, numberPicker2, numberPicker3, calendar, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout4);
        builder.show().setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createDatePickerDialog$57(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString("MessageScheduleToday", C0952R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().formatterScheduleDay.format(j2);
        }
        return LocaleController.getInstance().formatterScheduleYear.format(j2);
    }

    public static void lambda$createDatePickerDialog$58(LinearLayout linearLayout, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createDatePickerDialog$59(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$createDatePickerDialog$60(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createDatePickerDialog$61(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        boolean checkScheduleDate = checkScheduleDate(null, null, 0, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 24 * 3600 * 1000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        scheduleDatePickerDelegate.didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000));
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createAutoDeleteDatePickerDialog(Context context, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                int[] iArr2 = iArr;
                if (iArr2[i] == 0) {
                    return LocaleController.getString("AutoDeleteNever", C0952R.string.AutoDeleteNever);
                }
                if (iArr2[i] < 10080) {
                    return LocaleController.formatPluralString("Days", iArr2[i] / 1440);
                }
                if (iArr2[i] < 44640) {
                    return LocaleController.formatPluralString("Weeks", iArr2[i] / 1440);
                }
                if (iArr2[i] < 525600) {
                    return LocaleController.formatPluralString("Months", iArr2[i] / 10080);
                }
                return LocaleController.formatPluralString("Years", ((iArr2[i] * 5) / 31) * 60 * 24);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                String lambda$createAutoDeleteDatePickerDialog$62;
                lambda$createAutoDeleteDatePickerDialog$62 = AlertsCreator.lambda$createAutoDeleteDatePickerDialog$62(iArr, i);
                return lambda$createAutoDeleteDatePickerDialog$62;
            }
        });
        final LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("AutoDeleteAfteTitle", C0952R.string.AutoDeleteAfteTitle));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda79.INSTANCE);
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
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString("AutoDeleteConfirm", C0952R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker2, int i, int i2) {
                AlertsCreator.lambda$createAutoDeleteDatePickerDialog$64(linearLayout, numberPicker2, i, i2);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createAutoDeleteDatePickerDialog$65(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        builder.show().setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createAutoDeleteDatePickerDialog$62(int[] iArr, int i) {
        if (iArr[i] == 0) {
            return LocaleController.getString("AutoDeleteNever", C0952R.string.AutoDeleteNever);
        }
        if (iArr[i] < 10080) {
            return LocaleController.formatPluralString("Days", iArr[i] / 1440);
        }
        if (iArr[i] < 44640) {
            return LocaleController.formatPluralString("Weeks", iArr[i] / 10080);
        }
        if (iArr[i] < 525600) {
            return LocaleController.formatPluralString("Months", iArr[i] / 44640);
        }
        return LocaleController.formatPluralString("Years", iArr[i] / 525600);
    }

    public static void lambda$createAutoDeleteDatePickerDialog$64(LinearLayout linearLayout, NumberPicker numberPicker, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void lambda$createAutoDeleteDatePickerDialog$65(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()]);
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createSoundFrequencyPickerDialog(Context context, int i, int i2, final SoundFrequencyDelegate soundFrequencyDelegate) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(i - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setFormatter(AlertsCreator$$ExternalSyntheticLambda117.INSTANCE);
        final NumberPicker numberPicker2 = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i3) {
                return LocaleController.formatPluralString("Times", i3 + 1);
            }
        };
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(10);
        numberPicker2.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker2.setValue((i2 / 60) - 1);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setFormatter(AlertsCreator$$ExternalSyntheticLambda107.INSTANCE);
        final NumberPicker numberPicker3 = new NumberPicker(context);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(0);
        numberPicker3.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker3.setValue(0);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(AlertsCreator$$ExternalSyntheticLambda109.INSTANCE);
        final LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i3, int i4) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i5 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i5);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i5;
                numberPicker2.setItemCount(i5);
                numberPicker2.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i5;
                numberPicker3.setItemCount(i5);
                numberPicker3.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i5;
                this.ignoreLayout = false;
                super.onMeasure(i3, i4);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("NotfificationsFrequencyTitle", C0952R.string.NotfificationsFrequencyTitle));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda81.INSTANCE);
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
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString("AutoDeleteConfirm", C0952R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        NumberPicker.OnValueChangeListener alertsCreator$$ExternalSyntheticLambda123 = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i3, int i4) {
                AlertsCreator.lambda$createSoundFrequencyPickerDialog$70(linearLayout, numberPicker4, i3, i4);
            }
        };
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda123);
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda123);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createSoundFrequencyPickerDialog$71(NumberPicker.this, numberPicker2, soundFrequencyDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        builder.show().setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createSoundFrequencyPickerDialog$66(int i) {
        return LocaleController.formatPluralString("Times", i + 1);
    }

    public static String lambda$createSoundFrequencyPickerDialog$67(int i) {
        return LocaleController.formatPluralString("Minutes", i + 1);
    }

    public static void lambda$createSoundFrequencyPickerDialog$70(LinearLayout linearLayout, NumberPicker numberPicker, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void lambda$createSoundFrequencyPickerDialog$71(NumberPicker numberPicker, NumberPicker numberPicker2, SoundFrequencyDelegate soundFrequencyDelegate, BottomSheet.Builder builder, View view) {
        soundFrequencyDelegate.didSelectValues(numberPicker.getValue() + 1, (numberPicker2.getValue() + 1) * 60);
        builder.getDismissRunnable().run();
    }

    public static BottomSheet.Builder createMuteForPickerDialog(Context context, final ScheduleDatePickerDelegate scheduleDatePickerDelegate) {
        if (context == null) {
            return null;
        }
        ScheduleDatePickerColors scheduleDatePickerColors = new ScheduleDatePickerColors();
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false);
        builder.setApplyBottomPadding(false);
        final int[] iArr = {0, 30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        final NumberPicker numberPicker = new NumberPicker(context) {
            @Override
            protected CharSequence getContentDescription(int i) {
                int[] iArr2 = iArr;
                if (iArr2[i] == 0) {
                    return LocaleController.getString("MuteNever", C0952R.string.MuteNever);
                }
                if (iArr2[i] < 60) {
                    return LocaleController.formatPluralString("Minutes", iArr2[i]);
                }
                if (iArr2[i] < 1440) {
                    return LocaleController.formatPluralString("Hours", iArr2[i] / 60);
                }
                if (iArr2[i] < 10080) {
                    return LocaleController.formatPluralString("Days", iArr2[i] / 1440);
                }
                if (iArr2[i] < 44640) {
                    return LocaleController.formatPluralString("Weeks", iArr2[i] / 10080);
                }
                if (iArr2[i] < 525600) {
                    return LocaleController.formatPluralString("Months", iArr2[i] / 44640);
                }
                return LocaleController.formatPluralString("Years", iArr2[i] / 525600);
            }
        };
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(21);
        numberPicker.setTextColor(scheduleDatePickerColors.textColor);
        numberPicker.setValue(0);
        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i) {
                String lambda$createMuteForPickerDialog$72;
                lambda$createMuteForPickerDialog$72 = AlertsCreator.lambda$createMuteForPickerDialog$72(iArr, i);
                return lambda$createMuteForPickerDialog$72;
            }
        });
        final LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("MuteForAlert", C0952R.string.MuteForAlert));
        textView.setTextColor(scheduleDatePickerColors.textColor);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda80.INSTANCE);
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
                AlertsCreator.lambda$createMuteForPickerDialog$74(linearLayout, numberPicker2, i, i2);
            }
        });
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(scheduleDatePickerColors.buttonTextColor);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), scheduleDatePickerColors.buttonBackgroundColor, scheduleDatePickerColors.buttonBackgroundPressedColor));
        textView2.setText(LocaleController.getString("AutoDeleteConfirm", C0952R.string.AutoDeleteConfirm));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createMuteForPickerDialog$75(iArr, numberPicker, scheduleDatePickerDelegate, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        builder.show().setBackgroundColor(scheduleDatePickerColors.backgroundColor);
        return builder;
    }

    public static String lambda$createMuteForPickerDialog$72(int[] iArr, int i) {
        if (iArr[i] == 0) {
            return LocaleController.getString("MuteNever", C0952R.string.MuteNever);
        }
        if (iArr[i] < 60) {
            return LocaleController.formatPluralString("Minutes", iArr[i]);
        }
        if (iArr[i] < 1440) {
            return LocaleController.formatPluralString("Hours", iArr[i] / 60);
        }
        if (iArr[i] < 10080) {
            return LocaleController.formatPluralString("Days", iArr[i] / 1440);
        }
        if (iArr[i] < 44640) {
            return LocaleController.formatPluralString("Weeks", iArr[i] / 10080);
        }
        if (iArr[i] < 525600) {
            return LocaleController.formatPluralString("Months", iArr[i] / 44640);
        }
        return LocaleController.formatPluralString("Years", iArr[i] / 525600);
    }

    public static void lambda$createMuteForPickerDialog$74(LinearLayout linearLayout, NumberPicker numberPicker, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void lambda$createMuteForPickerDialog$75(int[] iArr, NumberPicker numberPicker, ScheduleDatePickerDelegate scheduleDatePickerDelegate, BottomSheet.Builder builder, View view) {
        scheduleDatePickerDelegate.didSelectDate(true, iArr[numberPicker.getValue()] * 60);
        builder.getDismissRunnable().run();
    }

    private static void checkCalendarDate(long r11, org.telegram.p009ui.Components.NumberPicker r13, org.telegram.p009ui.Components.NumberPicker r14, org.telegram.p009ui.Components.NumberPicker r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AlertsCreator.checkCalendarDate(long, org.telegram.ui.Components.NumberPicker, org.telegram.ui.Components.NumberPicker, org.telegram.ui.Components.NumberPicker):void");
    }

    public static BottomSheet.Builder createCalendarPickerDialog(Context context, final long j, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        if (context == null) {
            return null;
        }
        final BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        final NumberPicker numberPicker = new NumberPicker(context, resourcesProvider);
        numberPicker.setTextOffset(AndroidUtilities.m34dp(10.0f));
        numberPicker.setItemCount(5);
        final NumberPicker numberPicker2 = new NumberPicker(context, resourcesProvider);
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.m34dp(10.0f));
        final NumberPicker numberPicker3 = new NumberPicker(context, resourcesProvider);
        numberPicker3.setItemCount(5);
        numberPicker3.setTextOffset(-AndroidUtilities.m34dp(24.0f));
        final LinearLayout linearLayout = new LinearLayout(context) {
            boolean ignoreLayout = false;

            @Override
            protected void onMeasure(int i, int i2) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i3 = point.x > point.y ? 3 : 5;
                numberPicker.setItemCount(i3);
                numberPicker2.setItemCount(i3);
                numberPicker3.setItemCount(i3);
                numberPicker.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                numberPicker2.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                numberPicker3.getLayoutParams().height = AndroidUtilities.m34dp(42.0f) * i3;
                this.ignoreLayout = false;
                super.onMeasure(i, i2);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("ChooseDate", C0952R.string.ChooseDate));
        textView.setTextColor(Theme.getColor("dialogTextBlack", resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(AlertsCreator$$ExternalSyntheticLambda78.INSTANCE);
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
        numberPicker.setFormatter(AlertsCreator$$ExternalSyntheticLambda106.INSTANCE);
        NumberPicker.OnValueChangeListener alertsCreator$$ExternalSyntheticLambda124 = new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker4, int i, int i2) {
                AlertsCreator.lambda$createCalendarPickerDialog$78(linearLayout, j, numberPicker, numberPicker2, numberPicker3, numberPicker4, i, i2);
            }
        };
        numberPicker.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda124);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setWrapSelectorWheel(false);
        linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.5f));
        numberPicker2.setFormatter(AlertsCreator$$ExternalSyntheticLambda114.INSTANCE);
        numberPicker2.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda124);
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        numberPicker3.setMinValue(i);
        numberPicker3.setMaxValue(i2);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setFormatter(AlertsCreator$$ExternalSyntheticLambda108.INSTANCE);
        linearLayout2.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.25f));
        numberPicker3.setOnValueChangedListener(alertsCreator$$ExternalSyntheticLambda124);
        numberPicker.setValue(31);
        numberPicker2.setValue(12);
        numberPicker3.setValue(i2);
        checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
        textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor("featuredStickers_buttonText", resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setText(LocaleController.getString("JumpToDate", C0952R.string.JumpToDate));
        textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), Theme.getColor("featuredStickers_addButton", resourcesProvider), Theme.getColor("featuredStickers_addButtonPressed", resourcesProvider)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AlertsCreator.lambda$createCalendarPickerDialog$81(j, numberPicker, numberPicker2, numberPicker3, calendar, intCallback, builder, view);
            }
        });
        builder.setCustomView(linearLayout);
        return builder;
    }

    public static String lambda$createCalendarPickerDialog$77(int i) {
        return "" + i;
    }

    public static void lambda$createCalendarPickerDialog$78(LinearLayout linearLayout, long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            linearLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        checkCalendarDate(j, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$createCalendarPickerDialog$79(int i) {
        switch (i) {
            case 0:
                return LocaleController.getString("January", C0952R.string.January);
            case 1:
                return LocaleController.getString("February", C0952R.string.February);
            case 2:
                return LocaleController.getString("March", C0952R.string.March);
            case 3:
                return LocaleController.getString("April", C0952R.string.April);
            case 4:
                return LocaleController.getString("May", C0952R.string.May);
            case 5:
                return LocaleController.getString("June", C0952R.string.June);
            case 6:
                return LocaleController.getString("July", C0952R.string.July);
            case 7:
                return LocaleController.getString("August", C0952R.string.August);
            case 8:
                return LocaleController.getString("September", C0952R.string.September);
            case 9:
                return LocaleController.getString("October", C0952R.string.October);
            case 10:
                return LocaleController.getString("November", C0952R.string.November);
            default:
                return LocaleController.getString("December", C0952R.string.December);
        }
    }

    public static String lambda$createCalendarPickerDialog$80(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static void lambda$createCalendarPickerDialog$81(long j, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Calendar calendar, MessagesStorage.IntCallback intCallback, BottomSheet.Builder builder, View view) {
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

    public static BottomSheet createMuteAlert(final BaseFragment baseFragment, final long j, final Theme.ResourcesProvider resourcesProvider) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(baseFragment.getParentActivity(), false, resourcesProvider);
        builder.setTitle(LocaleController.getString("Notifications", C0952R.string.Notifications), true);
        builder.setItems(new CharSequence[]{LocaleController.formatString("MuteFor", C0952R.string.MuteFor, LocaleController.formatPluralString("Hours", 1)), LocaleController.formatString("MuteFor", C0952R.string.MuteFor, LocaleController.formatPluralString("Hours", 8)), LocaleController.formatString("MuteFor", C0952R.string.MuteFor, LocaleController.formatPluralString("Days", 2)), LocaleController.getString("MuteDisable", C0952R.string.MuteDisable)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createMuteAlert$82(j, baseFragment, resourcesProvider, dialogInterface, i);
            }
        });
        return builder.create();
    }

    public static void lambda$createMuteAlert$82(long j, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
        int i2 = 2;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = 3;
        }
        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j, i2);
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, i2, 0, resourcesProvider).show();
        }
    }

    public static void sendReport(TLRPC$InputPeer tLRPC$InputPeer, int i, String str, ArrayList<Integer> arrayList) {
        TLRPC$TL_messages_report tLRPC$TL_messages_report = new TLRPC$TL_messages_report();
        tLRPC$TL_messages_report.peer = tLRPC$InputPeer;
        tLRPC$TL_messages_report.f948id.addAll(arrayList);
        tLRPC$TL_messages_report.message = str;
        if (i == 0) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonSpam();
        } else if (i == 6) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonFake();
        } else if (i == 1) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonViolence();
        } else if (i == 2) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonChildAbuse();
        } else if (i == 5) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonPornography();
        } else if (i == 3) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonIllegalDrugs();
        } else if (i == 4) {
            tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonPersonalDetails();
        } else if (i == 100) {
            tLRPC$TL_messages_report.reason = new TLRPC$ReportReason() {
                public static int constructor = -1041980751;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            };
        }
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_messages_report, AlertsCreator$$ExternalSyntheticLambda97.INSTANCE);
    }

    public static void createReportAlert(Context context, long j, int i, BaseFragment baseFragment, Runnable runnable) {
        createReportAlert(context, j, i, baseFragment, null, runnable);
    }

    public static void createReportAlert(final Context context, final long j, final int i, final BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        CharSequence[] charSequenceArr;
        int[] iArr;
        final int[] iArr2;
        if (context != null && baseFragment != null) {
            BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
            builder.setDimBehind(runnable == null);
            builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertsCreator.lambda$createReportAlert$84(runnable, dialogInterface);
                }
            });
            builder.setTitle(LocaleController.getString("ReportChat", C0952R.string.ReportChat), true);
            if (i != 0) {
                CharSequence[] charSequenceArr2 = {LocaleController.getString("ReportChatSpam", C0952R.string.ReportChatSpam), LocaleController.getString("ReportChatViolence", C0952R.string.ReportChatViolence), LocaleController.getString("ReportChatChild", C0952R.string.ReportChatChild), LocaleController.getString("ReportChatIllegalDrugs", C0952R.string.ReportChatIllegalDrugs), LocaleController.getString("ReportChatPersonalDetails", C0952R.string.ReportChatPersonalDetails), LocaleController.getString("ReportChatPornography", C0952R.string.ReportChatPornography), LocaleController.getString("ReportChatOther", C0952R.string.ReportChatOther)};
                iArr = new int[]{C0952R.C0953drawable.msg_report_spam, C0952R.C0953drawable.msg_report_violence, C0952R.C0953drawable.msg_report_abuse, C0952R.C0953drawable.msg_report_drugs, C0952R.C0953drawable.msg_report_personal, C0952R.C0953drawable.msg_report_xxx, C0952R.C0953drawable.msg_report_other};
                charSequenceArr = charSequenceArr2;
                iArr2 = new int[]{0, 1, 2, 3, 4, 5, 100};
            } else {
                CharSequence[] charSequenceArr3 = {LocaleController.getString("ReportChatSpam", C0952R.string.ReportChatSpam), LocaleController.getString("ReportChatFakeAccount", C0952R.string.ReportChatFakeAccount), LocaleController.getString("ReportChatViolence", C0952R.string.ReportChatViolence), LocaleController.getString("ReportChatChild", C0952R.string.ReportChatChild), LocaleController.getString("ReportChatIllegalDrugs", C0952R.string.ReportChatIllegalDrugs), LocaleController.getString("ReportChatPersonalDetails", C0952R.string.ReportChatPersonalDetails), LocaleController.getString("ReportChatPornography", C0952R.string.ReportChatPornography), LocaleController.getString("ReportChatOther", C0952R.string.ReportChatOther)};
                iArr2 = new int[]{0, 6, 1, 2, 3, 4, 5, 100};
                iArr = new int[]{C0952R.C0953drawable.msg_report_spam, C0952R.C0953drawable.msg_report_fake, C0952R.C0953drawable.msg_report_violence, C0952R.C0953drawable.msg_report_abuse, C0952R.C0953drawable.msg_report_drugs, C0952R.C0953drawable.msg_report_personal, C0952R.C0953drawable.msg_report_xxx, C0952R.C0953drawable.msg_report_other};
                charSequenceArr = charSequenceArr3;
            }
            builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AlertsCreator.lambda$createReportAlert$86(iArr2, i, baseFragment, context, j, resourcesProvider, dialogInterface, i2);
                }
            });
            baseFragment.showDialog(builder.create());
        }
    }

    public static void lambda$createReportAlert$84(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createReportAlert$86(int[] iArr, final int i, final BaseFragment baseFragment, Context context, final long j, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_account_reportPeer tLRPC$TL_account_reportPeer;
        int i3 = iArr[i2];
        if (i == 0 && ((i3 == 0 || i3 == 1 || i3 == 2 || i3 == 5 || i3 == 3 || i3 == 4) && (baseFragment instanceof ChatActivity))) {
            ((ChatActivity) baseFragment).openReportChat(i3);
        } else if (!(i == 0 && (i3 == 100 || i3 == 6)) && (i == 0 || i3 != 100)) {
            TLRPC$InputPeer inputPeer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(j);
            if (i != 0) {
                TLRPC$TL_messages_report tLRPC$TL_messages_report = new TLRPC$TL_messages_report();
                tLRPC$TL_messages_report.peer = inputPeer;
                tLRPC$TL_messages_report.f948id.add(Integer.valueOf(i));
                tLRPC$TL_messages_report.message = "";
                tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                if (i3 == 0) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonSpam();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                } else if (i3 == 1) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonViolence();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                } else if (i3 == 2) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonChildAbuse();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                } else if (i3 == 5) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonPornography();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                } else if (i3 == 3) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonIllegalDrugs();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                } else if (i3 == 4) {
                    tLRPC$TL_messages_report.reason = new TLRPC$TL_inputReportReasonPersonalDetails();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_messages_report;
                }
            } else {
                TLRPC$TL_account_reportPeer tLRPC$TL_account_reportPeer2 = new TLRPC$TL_account_reportPeer();
                tLRPC$TL_account_reportPeer2.peer = inputPeer;
                tLRPC$TL_account_reportPeer2.message = "";
                tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                if (i3 == 0) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonSpam();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 6) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonFake();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 1) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonViolence();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 2) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonChildAbuse();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 5) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonPornography();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 3) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonIllegalDrugs();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                } else if (i3 == 4) {
                    tLRPC$TL_account_reportPeer2.reason = new TLRPC$TL_inputReportReasonPersonalDetails();
                    tLRPC$TL_account_reportPeer = tLRPC$TL_account_reportPeer2;
                }
            }
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_account_reportPeer, AlertsCreator$$ExternalSyntheticLambda96.INSTANCE);
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).getUndoView().showWithAction(0L, 74, (Runnable) null);
            } else {
                BulletinFactory.m13of(baseFragment).createReportSent(resourcesProvider).show();
            }
        } else {
            if (baseFragment instanceof ChatActivity) {
                AndroidUtilities.requestAdjustNothing(baseFragment.getParentActivity(), baseFragment.getClassGuid());
            }
            baseFragment.showDialog(new ReportAlert(context, i3) {
                @Override
                public void dismissInternal() {
                    super.dismissInternal();
                    BaseFragment baseFragment2 = baseFragment;
                    if (baseFragment2 instanceof ChatActivity) {
                        ((ChatActivity) baseFragment2).checkAdjustResize();
                    }
                }

                @Override
                protected void onSend(int i4, String str) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = i;
                    if (i5 != 0) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                    AlertsCreator.sendReport(MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(j), i4, str, arrayList);
                    BaseFragment baseFragment2 = baseFragment;
                    if (baseFragment2 instanceof ChatActivity) {
                        ((ChatActivity) baseFragment2).getUndoView().showWithAction(0L, 74, (Runnable) null);
                    }
                }
            });
        }
    }

    private static String getFloodWaitString(String str) {
        String str2;
        int intValue = Utilities.parseInt(str).intValue();
        if (intValue < 60) {
            str2 = LocaleController.formatPluralString("Seconds", intValue);
        } else {
            str2 = LocaleController.formatPluralString("Minutes", intValue / 60);
        }
        return LocaleController.formatString("FloodWaitTime", C0952R.string.FloodWaitTime, str2);
    }

    public static void showFloodWaitAlert(String str, BaseFragment baseFragment) {
        String str2;
        if (str != null && str.startsWith("FLOOD_WAIT") && baseFragment != null && baseFragment.getParentActivity() != null) {
            int intValue = Utilities.parseInt(str).intValue();
            if (intValue < 60) {
                str2 = LocaleController.formatPluralString("Seconds", intValue);
            } else {
                str2 = LocaleController.formatPluralString("Minutes", intValue / 60);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
            builder.setMessage(LocaleController.formatString("FloodWaitTime", C0952R.string.FloodWaitTime, str2));
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            baseFragment.showDialog(builder.create(), true, null);
        }
    }

    public static void showSendMediaAlert(int i, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        if (i != 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), resourcesProvider);
            builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
            if (i == 1) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedStickers", C0952R.string.ErrorSendRestrictedStickers));
            } else if (i == 2) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedMedia", C0952R.string.ErrorSendRestrictedMedia));
            } else if (i == 3) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedPolls", C0952R.string.ErrorSendRestrictedPolls));
            } else if (i == 4) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedStickersAll", C0952R.string.ErrorSendRestrictedStickersAll));
            } else if (i == 5) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedMediaAll", C0952R.string.ErrorSendRestrictedMediaAll));
            } else if (i == 6) {
                builder.setMessage(LocaleController.getString("ErrorSendRestrictedPollsAll", C0952R.string.ErrorSendRestrictedPollsAll));
            }
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            baseFragment.showDialog(builder.create(), true, null);
        }
    }

    public static void showAddUserAlert(String str, final BaseFragment baseFragment, boolean z, TLObject tLObject) {
        if (str != null && baseFragment != null && baseFragment.getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString("AppName", C0952R.string.AppName));
            char c = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c = 20;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    builder.setMessage(LocaleController.getString("LocatedChannelsTooMuch", C0952R.string.LocatedChannelsTooMuch));
                    break;
                case 1:
                    builder.setMessage(LocaleController.getString("PublicChannelsTooMuch", C0952R.string.PublicChannelsTooMuch));
                    break;
                case 2:
                    builder.setMessage(LocaleController.getString("CreateGroupError", C0952R.string.CreateGroupError));
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (!z) {
                        builder.setMessage(LocaleController.getString("GroupUserCantAdd", C0952R.string.GroupUserCantAdd));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelUserCantAdd", C0952R.string.ChannelUserCantAdd));
                        break;
                    }
                case 4:
                    builder.setMessage(LocaleController.getString("UserRestricted", C0952R.string.UserRestricted));
                    break;
                case 5:
                    builder.setMessage(LocaleController.getString("NobodyLikesSpam2", C0952R.string.NobodyLikesSpam2));
                    builder.setNegativeButton(LocaleController.getString("MoreInfo", C0952R.string.MoreInfo), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AlertsCreator.lambda$showAddUserAlert$87(BaseFragment.this, dialogInterface, i);
                        }
                    });
                    break;
                case 6:
                    if (!z) {
                        builder.setMessage(LocaleController.getString("GroupUserCantBot", C0952R.string.GroupUserCantBot));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelUserCantBot", C0952R.string.ChannelUserCantBot));
                        break;
                    }
                case 7:
                case 11:
                    if (!(tLObject instanceof TLRPC$TL_channels_inviteToChannel)) {
                        builder.setMessage(LocaleController.getString("AddAdminErrorBlacklisted", C0952R.string.AddAdminErrorBlacklisted));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("AddUserErrorBlacklisted", C0952R.string.AddUserErrorBlacklisted));
                        break;
                    }
                case '\t':
                    builder.setMessage(LocaleController.getString("YouBlockedUser", C0952R.string.YouBlockedUser));
                    break;
                case '\n':
                    builder.setMessage(LocaleController.getString("AddBannedErrorAdmin", C0952R.string.AddBannedErrorAdmin));
                    break;
                case '\f':
                    if (!z) {
                        builder.setMessage(LocaleController.getString("GroupUserAddLimit", C0952R.string.GroupUserAddLimit));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelUserAddLimit", C0952R.string.ChannelUserAddLimit));
                        break;
                    }
                case 14:
                    if (!z) {
                        builder.setMessage(LocaleController.getString("GroupUserCantAdmin", C0952R.string.GroupUserCantAdmin));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelUserCantAdmin", C0952R.string.ChannelUserCantAdmin));
                        break;
                    }
                case 15:
                    builder.setTitle(LocaleController.getString("ChannelTooMuchTitle", C0952R.string.ChannelTooMuchTitle));
                    if (!(tLObject instanceof TLRPC$TL_channels_createChannel)) {
                        builder.setMessage(LocaleController.getString("ChannelTooMuchJoin", C0952R.string.ChannelTooMuchJoin));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelTooMuch", C0952R.string.ChannelTooMuch));
                        break;
                    }
                case 16:
                    builder.setTitle(LocaleController.getString("ChannelTooMuchTitle", C0952R.string.ChannelTooMuchTitle));
                    builder.setMessage(LocaleController.getString("UserChannelTooMuchJoin", C0952R.string.UserChannelTooMuchJoin));
                    break;
                case 17:
                    if (!z) {
                        builder.setMessage(LocaleController.getString("GroupUserLeftError", C0952R.string.GroupUserLeftError));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelUserLeftError", C0952R.string.ChannelUserLeftError));
                        break;
                    }
                case C0952R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                    builder.setMessage(LocaleController.getString("AddAdminErrorNotAMember", C0952R.string.AddAdminErrorNotAMember));
                    break;
                case C0952R.styleable.MapAttrs_uiTiltGestures:
                    if (!z) {
                        builder.setMessage(LocaleController.getString("InviteToGroupError", C0952R.string.InviteToGroupError));
                        break;
                    } else {
                        builder.setMessage(LocaleController.getString("InviteToChannelError", C0952R.string.InviteToChannelError));
                        break;
                    }
                case C0952R.styleable.MapAttrs_uiZoomControls:
                    builder.setTitle(LocaleController.getString("VoipGroupVoiceChat", C0952R.string.VoipGroupVoiceChat));
                    builder.setMessage(LocaleController.getString("VoipGroupInviteAlreadyParticipant", C0952R.string.VoipGroupInviteAlreadyParticipant));
                    break;
                default:
                    builder.setMessage(LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + str);
                    break;
            }
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            baseFragment.showDialog(builder.create(), true, null);
        }
    }

    public static void lambda$showAddUserAlert$87(BaseFragment baseFragment, DialogInterface dialogInterface, int i) {
        MessagesController.getInstance(baseFragment.getCurrentAccount()).openByUserName("spambot", baseFragment, 1);
    }

    public static Dialog createColorSelectDialog(Activity activity, final long j, final int i, final Runnable runnable) {
        int i2;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        if (j != 0) {
            if (notificationsSettings.contains("color_" + j)) {
                i2 = notificationsSettings.getInt("color_" + j, -16776961);
            } else if (DialogObject.isChatDialog(j)) {
                i2 = notificationsSettings.getInt("GroupLed", -16776961);
            } else {
                i2 = notificationsSettings.getInt("MessagesLed", -16776961);
            }
        } else if (i == 1) {
            i2 = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i == 0) {
            i2 = notificationsSettings.getInt("GroupLed", -16776961);
        } else {
            i2 = notificationsSettings.getInt("ChannelLed", -16776961);
        }
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        String[] strArr = {LocaleController.getString("ColorRed", C0952R.string.ColorRed), LocaleController.getString("ColorOrange", C0952R.string.ColorOrange), LocaleController.getString("ColorYellow", C0952R.string.ColorYellow), LocaleController.getString("ColorGreen", C0952R.string.ColorGreen), LocaleController.getString("ColorCyan", C0952R.string.ColorCyan), LocaleController.getString("ColorBlue", C0952R.string.ColorBlue), LocaleController.getString("ColorViolet", C0952R.string.ColorViolet), LocaleController.getString("ColorPink", C0952R.string.ColorPink), LocaleController.getString("ColorWhite", C0952R.string.ColorWhite)};
        final int[] iArr = {i2};
        int i3 = 0;
        for (int i4 = 9; i3 < i4; i4 = 9) {
            RadioColorCell radioColorCell = new RadioColorCell(activity);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            int[] iArr2 = TextColorCell.colors;
            radioColorCell.setCheckColor(iArr2[i3], iArr2[i3]);
            radioColorCell.setTextAndValue(strArr[i3], i2 == TextColorCell.colorsToSave[i3]);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createColorSelectDialog$88(linearLayout, iArr, view);
                }
            });
            i3++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(LocaleController.getString("LedColor", C0952R.string.LedColor));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("Set", C0952R.string.Set), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i5) {
                AlertsCreator.lambda$createColorSelectDialog$89(j, iArr, i, runnable, dialogInterface, i5);
            }
        });
        builder.setNeutralButton(LocaleController.getString("LedDisabled", C0952R.string.LedDisabled), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i5) {
                AlertsCreator.lambda$createColorSelectDialog$90(j, i, runnable, dialogInterface, i5);
            }
        });
        if (j != 0) {
            builder.setNegativeButton(LocaleController.getString("Default", C0952R.string.Default), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    AlertsCreator.lambda$createColorSelectDialog$91(j, runnable, dialogInterface, i5);
                }
            });
        }
        return builder.create();
    }

    public static void lambda$createColorSelectDialog$88(LinearLayout linearLayout, int[] iArr, View view) {
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioColorCell radioColorCell = (RadioColorCell) linearLayout.getChildAt(i);
            radioColorCell.setChecked(radioColorCell == view, true);
        }
        iArr[0] = TextColorCell.colorsToSave[((Integer) view.getTag()).intValue()];
    }

    public static void lambda$createColorSelectDialog$89(long j, int[] iArr, int i, Runnable runnable, DialogInterface dialogInterface, int i2) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            edit.putInt("color_" + j, iArr[0]);
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j);
        } else {
            if (i == 1) {
                edit.putInt("MessagesLed", iArr[0]);
            } else if (i == 0) {
                edit.putInt("GroupLed", iArr[0]);
            } else {
                edit.putInt("ChannelLed", iArr[0]);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i);
        }
        edit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createColorSelectDialog$90(long j, int i, Runnable runnable, DialogInterface dialogInterface, int i2) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            edit.putInt("color_" + j, 0);
        } else if (i == 1) {
            edit.putInt("MessagesLed", 0);
        } else if (i == 0) {
            edit.putInt("GroupLed", 0);
        } else {
            edit.putInt("ChannelLed", 0);
        }
        edit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createColorSelectDialog$91(long j, Runnable runnable, DialogInterface dialogInterface, int i) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        edit.remove("color_" + j);
        edit.commit();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Dialog createVibrationSelectDialog(Activity activity, long j, boolean z, boolean z2, Runnable runnable) {
        String str;
        if (j != 0) {
            str = "vibrate_" + j;
        } else {
            str = z ? "vibrate_group" : "vibrate_messages";
        }
        return createVibrationSelectDialog(activity, j, str, runnable);
    }

    public static Dialog createVibrationSelectDialog(Activity activity, final long j, final String str, final Runnable runnable) {
        String[] strArr;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        int i = 0;
        if (j != 0) {
            iArr[0] = notificationsSettings.getInt(str, 0);
            if (iArr[0] == 3) {
                iArr[0] = 2;
            } else if (iArr[0] == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString("VibrationDefault", C0952R.string.VibrationDefault), LocaleController.getString("Short", C0952R.string.Short), LocaleController.getString("Long", C0952R.string.Long), LocaleController.getString("VibrationDisabled", C0952R.string.VibrationDisabled)};
        } else {
            iArr[0] = notificationsSettings.getInt(str, 0);
            if (iArr[0] == 0) {
                iArr[0] = 1;
            } else if (iArr[0] == 1) {
                iArr[0] = 2;
            } else if (iArr[0] == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString("VibrationDisabled", C0952R.string.VibrationDisabled), LocaleController.getString("VibrationDefault", C0952R.string.VibrationDefault), LocaleController.getString("Short", C0952R.string.Short), LocaleController.getString("Long", C0952R.string.Long), LocaleController.getString("OnlyIfSilent", C0952R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        int i2 = 0;
        while (i2 < strArr2.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), i, AndroidUtilities.m34dp(4.0f), i);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr2[i2], iArr[i] == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createVibrationSelectDialog$92(iArr, j, str, builder, runnable, view);
                }
            });
            i2++;
            i = 0;
        }
        builder.setTitle(LocaleController.getString("Vibrate", C0952R.string.Vibrate));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createVibrationSelectDialog$92(int[] iArr, long j, String str, AlertDialog.Builder builder, Runnable runnable, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (j != 0) {
            if (iArr[0] == 0) {
                edit.putInt(str, 0);
            } else if (iArr[0] == 1) {
                edit.putInt(str, 1);
            } else if (iArr[0] == 2) {
                edit.putInt(str, 3);
            } else if (iArr[0] == 3) {
                edit.putInt(str, 2);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j);
        } else {
            if (iArr[0] == 0) {
                edit.putInt(str, 2);
            } else if (iArr[0] == 1) {
                edit.putInt(str, 0);
            } else if (iArr[0] == 2) {
                edit.putInt(str, 1);
            } else if (iArr[0] == 3) {
                edit.putInt(str, 3);
            } else if (iArr[0] == 4) {
                edit.putInt(str, 4);
            }
            if (str.equals("vibrate_channel")) {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
            } else if (str.equals("vibrate_group")) {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
            } else {
                NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
            }
        }
        edit.commit();
        builder.getDismissRunnable().run();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Dialog createLocationUpdateDialog(Activity activity, TLRPC$User tLRPC$User, final MessagesStorage.IntCallback intCallback, Theme.ResourcesProvider resourcesProvider) {
        final int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString("SendLiveLocationFor15m", C0952R.string.SendLiveLocationFor15m), LocaleController.getString("SendLiveLocationFor1h", C0952R.string.SendLiveLocationFor1h), LocaleController.getString("SendLiveLocationFor8h", C0952R.string.SendLiveLocationFor8h)};
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        if (tLRPC$User != null) {
            textView.setText(LocaleController.formatString("LiveLocationAlertPrivate", C0952R.string.LiveLocationAlertPrivate, UserObject.getFirstName(tLRPC$User)));
        } else {
            textView.setText(LocaleController.getString("LiveLocationAlertGroup", C0952R.string.LiveLocationAlertGroup));
        }
        textView.setTextColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault("dialogTextBlack") : Theme.getColor("dialogTextBlack"));
        textView.setTextSize(1, 16.0f);
        int i = 5;
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!LocaleController.isRTL) {
            i = 3;
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, i | 48, 24, 0, 24, 8));
        int i2 = 0;
        while (i2 < 3) {
            RadioColorCell radioColorCell = new RadioColorCell(activity, resourcesProvider);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setCheckColor(resourcesProvider != null ? resourcesProvider.getColorOrDefault("radioBackground") : Theme.getColor("radioBackground"), resourcesProvider != null ? resourcesProvider.getColorOrDefault("dialogRadioBackgroundChecked") : Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr[i2], iArr[0] == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createLocationUpdateDialog$93(iArr, linearLayout, view);
                }
            });
            i2++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        builder.setTopImage(new ShareLocationDrawable(activity, 0), resourcesProvider != null ? resourcesProvider.getColorOrDefault("dialogTopBackground") : Theme.getColor("dialogTopBackground"));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("ShareFile", C0952R.string.ShareFile), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AlertsCreator.lambda$createLocationUpdateDialog$94(iArr, intCallback, dialogInterface, i3);
            }
        });
        builder.setNeutralButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createLocationUpdateDialog$93(int[] iArr, LinearLayout linearLayout, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof RadioColorCell) {
                ((RadioColorCell) childAt).setChecked(childAt == view, true);
            }
        }
    }

    public static void lambda$createLocationUpdateDialog$94(int[] iArr, MessagesStorage.IntCallback intCallback, DialogInterface dialogInterface, int i) {
        int i2;
        if (iArr[0] == 0) {
            i2 = 900;
        } else {
            i2 = iArr[0] == 1 ? 3600 : 28800;
        }
        intCallback.run(i2);
    }

    public static AlertDialog.Builder createBackgroundLocationPermissionDialog(final Activity activity, TLRPC$User tLRPC$User, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        if (activity == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, resourcesProvider);
        String readRes = RLottieDrawable.readRes(null, Theme.getCurrentTheme().isDark() ? C0952R.raw.permission_map_dark : C0952R.raw.permission_map);
        String readRes2 = RLottieDrawable.readRes(null, Theme.getCurrentTheme().isDark() ? C0952R.raw.permission_pin_dark : C0952R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, LayoutHelper.createFrame(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.m34dp(26.0f));
        backupImageView.setForUserOrChat(tLRPC$User, new AvatarDrawable(tLRPC$User));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        builder.setTopView(frameLayout);
        builder.setTopViewAspectRatio(0.37820512f);
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString((int) C0952R.string.PermissionBackgroundLocation)));
        builder.setPositiveButton(LocaleController.getString((int) C0952R.string.Continue), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createBackgroundLocationPermissionDialog$95(activity, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        });
        return builder;
    }

    public static void lambda$createBackgroundLocationPermissionDialog$95(Activity activity, DialogInterface dialogInterface, int i) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static AlertDialog.Builder createGigagroupConvertAlert(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String readRes = RLottieDrawable.readRes(null, C0952R.raw.gigagroup);
        FrameLayout frameLayout = new FrameLayout(activity);
        if (Build.VERSION.SDK_INT >= 21) {
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f));
                }
            });
        }
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.m34dp(320.0f), AndroidUtilities.m34dp(127.17949f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        builder.setTopView(frameLayout);
        builder.setTopViewAspectRatio(0.3974359f);
        builder.setTitle(LocaleController.getString("GigagroupAlertTitle", C0952R.string.GigagroupAlertTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("GigagroupAlertText", C0952R.string.GigagroupAlertText)));
        builder.setPositiveButton(LocaleController.getString("GigagroupAlertLearnMore", C0952R.string.GigagroupAlertLearnMore), onClickListener);
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), onClickListener2);
        return builder;
    }

    public static AlertDialog.Builder createDrawOverlayPermissionDialog(final Activity activity, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String readRes = RLottieDrawable.readRes(null, C0952R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.m34dp(6.0f), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.m34dp(320.0f), AndroidUtilities.m34dp(161.36752f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString("PermissionDrawAboveOtherAppsTitle", C0952R.string.PermissionDrawAboveOtherAppsTitle));
        builder.setMessage(LocaleController.getString("PermissionDrawAboveOtherApps", C0952R.string.PermissionDrawAboveOtherApps));
        builder.setPositiveButton(LocaleController.getString("Enable", C0952R.string.Enable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createDrawOverlayPermissionDialog$97(activity, dialogInterface, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), onClickListener);
        builder.setTopViewAspectRatio(0.50427353f);
        return builder;
    }

    public static void lambda$createDrawOverlayPermissionDialog$97(Activity activity, DialogInterface dialogInterface, int i) {
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            try {
                activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public static AlertDialog.Builder createDrawOverlayGroupCallPermissionDialog(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        String readRes = RLottieDrawable.readRes(null, C0952R.raw.pip_voice_request);
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
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + AndroidUtilities.m34dp(6.0f), AndroidUtilities.dpf2(6.0f));
            }
        });
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.m34dp(320.0f), AndroidUtilities.m34dp(184.61539f), false)));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        frameLayout.addView(groupCallPipButton, LayoutHelper.createFrame(117, 117.0f));
        builder.setTopView(frameLayout);
        builder.setTitle(LocaleController.getString("PermissionDrawAboveOtherAppsGroupCallTitle", C0952R.string.PermissionDrawAboveOtherAppsGroupCallTitle));
        builder.setMessage(LocaleController.getString("PermissionDrawAboveOtherAppsGroupCall", C0952R.string.PermissionDrawAboveOtherAppsGroupCall));
        builder.setPositiveButton(LocaleController.getString("Enable", C0952R.string.Enable), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlertsCreator.lambda$createDrawOverlayGroupCallPermissionDialog$98(context, dialogInterface, i);
            }
        });
        builder.notDrawBackgroundOnTopView(true);
        builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        builder.setTopViewAspectRatio(0.5769231f);
        return builder;
    }

    public static void lambda$createDrawOverlayGroupCallPermissionDialog$98(Context context, DialogInterface dialogInterface, int i) {
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity instanceof LaunchActivity) {
                        findActivity.startActivityForResult(intent, 105);
                    } else {
                        context.startActivity(intent);
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public static AlertDialog.Builder createContactsPermissionDialog(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTopAnimation(C0952R.raw.permission_request_contacts, 72, false, Theme.getColor("dialogTopBackground"));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("ContactsPermissionAlert", C0952R.string.ContactsPermissionAlert)));
        builder.setPositiveButton(LocaleController.getString("ContactsPermissionAlertContinue", C0952R.string.ContactsPermissionAlertContinue), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                MessagesStorage.IntCallback.this.run(1);
            }
        });
        builder.setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                MessagesStorage.IntCallback.this.run(0);
            }
        });
        return builder;
    }

    public static Dialog createFreeSpaceDialog(final LaunchActivity launchActivity) {
        final int[] iArr = new int[1];
        int i = SharedConfig.keepMedia;
        int i2 = 3;
        if (i == 2) {
            iArr[0] = 3;
        } else if (i == 0) {
            iArr[0] = 1;
        } else if (i == 1) {
            iArr[0] = 2;
        } else if (i == 3) {
            iArr[0] = 0;
        }
        String[] strArr = {LocaleController.formatPluralString("Days", 3), LocaleController.formatPluralString("Weeks", 1), LocaleController.formatPluralString("Months", 1), LocaleController.getString("LowDiskSpaceNeverRemove", C0952R.string.LowDiskSpaceNeverRemove)};
        final LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(launchActivity);
        textView.setText(LocaleController.getString("LowDiskSpaceTitle2", C0952R.string.LowDiskSpaceTitle2));
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (LocaleController.isRTL) {
            i2 = 5;
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, i2 | 48, 24, 0, 24, 8));
        int i3 = 0;
        while (i3 < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(launchActivity);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i3));
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr[i3], iArr[0] == i3);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createFreeSpaceDialog$101(iArr, linearLayout, view);
                }
            });
            i3++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity);
        builder.setTitle(LocaleController.getString("LowDiskSpaceTitle", C0952R.string.LowDiskSpaceTitle));
        builder.setMessage(LocaleController.getString("LowDiskSpaceMessage", C0952R.string.LowDiskSpaceMessage));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AlertsCreator.lambda$createFreeSpaceDialog$102(iArr, dialogInterface, i4);
            }
        });
        builder.setNeutralButton(LocaleController.getString("ClearMediaCache", C0952R.string.ClearMediaCache), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AlertsCreator.lambda$createFreeSpaceDialog$103(LaunchActivity.this, dialogInterface, i4);
            }
        });
        return builder.create();
    }

    public static void lambda$createFreeSpaceDialog$101(int[] iArr, LinearLayout linearLayout, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            iArr[0] = 3;
        } else if (intValue == 1) {
            iArr[0] = 0;
        } else if (intValue == 2) {
            iArr[0] = 1;
        } else if (intValue == 3) {
            iArr[0] = 2;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof RadioColorCell) {
                ((RadioColorCell) childAt).setChecked(childAt == view, true);
            }
        }
    }

    public static void lambda$createFreeSpaceDialog$102(int[] iArr, DialogInterface dialogInterface, int i) {
        SharedConfig.setKeepMedia(iArr[0]);
    }

    public static void lambda$createFreeSpaceDialog$103(LaunchActivity launchActivity, DialogInterface dialogInterface, int i) {
        launchActivity.lambda$runLinkRequest$54(new CacheControlActivity());
    }

    public static Dialog createPrioritySelectDialog(Activity activity, final long j, final int i, final Runnable runnable) {
        String[] strArr;
        char c;
        int i2;
        Activity activity2 = activity;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        int i3 = 0;
        if (j != 0) {
            iArr[0] = notificationsSettings.getInt("priority_" + j, 3);
            if (iArr[0] == 3) {
                iArr[0] = 0;
            } else if (iArr[0] == 4) {
                iArr[0] = 1;
            } else {
                i2 = 5;
                if (iArr[0] == 5) {
                    iArr[0] = 2;
                } else if (iArr[0] == 0) {
                    iArr[0] = 3;
                } else {
                    iArr[0] = 4;
                }
                String[] strArr2 = new String[i2];
                strArr2[0] = LocaleController.getString("NotificationsPrioritySettings", C0952R.string.NotificationsPrioritySettings);
                strArr2[1] = LocaleController.getString("NotificationsPriorityLow", C0952R.string.NotificationsPriorityLow);
                strArr2[2] = LocaleController.getString("NotificationsPriorityMedium", C0952R.string.NotificationsPriorityMedium);
                strArr2[3] = LocaleController.getString("NotificationsPriorityHigh", C0952R.string.NotificationsPriorityHigh);
                strArr2[4] = LocaleController.getString("NotificationsPriorityUrgent", C0952R.string.NotificationsPriorityUrgent);
                strArr = strArr2;
            }
            i2 = 5;
            String[] strArr22 = new String[i2];
            strArr22[0] = LocaleController.getString("NotificationsPrioritySettings", C0952R.string.NotificationsPrioritySettings);
            strArr22[1] = LocaleController.getString("NotificationsPriorityLow", C0952R.string.NotificationsPriorityLow);
            strArr22[2] = LocaleController.getString("NotificationsPriorityMedium", C0952R.string.NotificationsPriorityMedium);
            strArr22[3] = LocaleController.getString("NotificationsPriorityHigh", C0952R.string.NotificationsPriorityHigh);
            strArr22[4] = LocaleController.getString("NotificationsPriorityUrgent", C0952R.string.NotificationsPriorityUrgent);
            strArr = strArr22;
        } else {
            if (i == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            }
            if (iArr[0] == 4) {
                iArr[0] = 0;
            } else if (iArr[0] == 5) {
                iArr[0] = 1;
            } else {
                if (iArr[0] == 0) {
                    c = 2;
                    iArr[0] = 2;
                } else {
                    c = 2;
                    iArr[0] = 3;
                }
                String[] strArr3 = new String[4];
                strArr3[0] = LocaleController.getString("NotificationsPriorityLow", C0952R.string.NotificationsPriorityLow);
                strArr3[1] = LocaleController.getString("NotificationsPriorityMedium", C0952R.string.NotificationsPriorityMedium);
                strArr3[c] = LocaleController.getString("NotificationsPriorityHigh", C0952R.string.NotificationsPriorityHigh);
                strArr3[3] = LocaleController.getString("NotificationsPriorityUrgent", C0952R.string.NotificationsPriorityUrgent);
                strArr = strArr3;
            }
            c = 2;
            String[] strArr32 = new String[4];
            strArr32[0] = LocaleController.getString("NotificationsPriorityLow", C0952R.string.NotificationsPriorityLow);
            strArr32[1] = LocaleController.getString("NotificationsPriorityMedium", C0952R.string.NotificationsPriorityMedium);
            strArr32[c] = LocaleController.getString("NotificationsPriorityHigh", C0952R.string.NotificationsPriorityHigh);
            strArr32[3] = LocaleController.getString("NotificationsPriorityUrgent", C0952R.string.NotificationsPriorityUrgent);
            strArr = strArr32;
        }
        LinearLayout linearLayout = new LinearLayout(activity2);
        linearLayout.setOrientation(1);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
        int i4 = 0;
        while (i4 < strArr.length) {
            RadioColorCell radioColorCell = new RadioColorCell(activity2);
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), i3, AndroidUtilities.m34dp(4.0f), i3);
            radioColorCell.setTag(Integer.valueOf(i4));
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr[i4], iArr[i3] == i4);
            linearLayout.addView(radioColorCell);
            final AlertDialog.Builder builder2 = builder;
            linearLayout = linearLayout;
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createPrioritySelectDialog$104(iArr, j, i, notificationsSettings, builder2, runnable, view);
                }
            });
            i4++;
            activity2 = activity;
            builder = builder2;
            i3 = 0;
        }
        AlertDialog.Builder builder3 = builder;
        builder3.setTitle(LocaleController.getString("NotificationsImportance", C0952R.string.NotificationsImportance));
        builder3.setView(linearLayout);
        builder3.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder3.create();
    }

    public static void lambda$createPrioritySelectDialog$104(int[] iArr, long j, int i, SharedPreferences sharedPreferences, AlertDialog.Builder builder, Runnable runnable, View view) {
        int i2 = 0;
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        int i3 = 5;
        if (j != 0) {
            if (iArr[0] == 0) {
                i2 = 3;
            } else if (iArr[0] == 1) {
                i2 = 4;
            } else if (iArr[0] == 2) {
                i2 = 5;
            } else if (iArr[0] != 3) {
                i2 = 1;
            }
            edit.putInt("priority_" + j, i2);
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j);
        } else {
            if (iArr[0] == 0) {
                i3 = 4;
            } else if (iArr[0] != 1) {
                i3 = iArr[0] == 2 ? 0 : 1;
            }
            if (i == 1) {
                edit.putInt("priority_messages", i3);
                iArr[0] = sharedPreferences.getInt("priority_messages", 1);
            } else if (i == 0) {
                edit.putInt("priority_group", i3);
                iArr[0] = sharedPreferences.getInt("priority_group", 1);
            } else if (i == 2) {
                edit.putInt("priority_channel", i3);
                iArr[0] = sharedPreferences.getInt("priority_channel", 1);
            }
            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i);
        }
        edit.commit();
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
        String[] strArr = {LocaleController.getString("NoPopup", C0952R.string.NoPopup), LocaleController.getString("OnlyWhenScreenOn", C0952R.string.OnlyWhenScreenOn), LocaleController.getString("OnlyWhenScreenOff", C0952R.string.OnlyWhenScreenOff), LocaleController.getString("AlwaysShowPopup", C0952R.string.AlwaysShowPopup)};
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        int i2 = 0;
        while (i2 < 4) {
            RadioColorCell radioColorCell = new RadioColorCell(activity);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr[i2], iArr[0] == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createPopupSelectDialog$105(iArr, i, builder, runnable, view);
                }
            });
            i2++;
        }
        builder.setTitle(LocaleController.getString("PopupNotification", C0952R.string.PopupNotification));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createPopupSelectDialog$105(int[] iArr, int i, AlertDialog.Builder builder, Runnable runnable, View view) {
        iArr[0] = ((Integer) view.getTag()).intValue();
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
        if (i == 1) {
            edit.putInt("popupAll", iArr[0]);
        } else if (i == 0) {
            edit.putInt("popupGroup", iArr[0]);
        } else {
            edit.putInt("popupChannel", iArr[0]);
        }
        edit.commit();
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
            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
            radioColorCell.setTag(Integer.valueOf(i2));
            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            radioColorCell.setTextAndValue(strArr[i2], i == i2);
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createSingleChoiceDialog$106(AlertDialog.Builder.this, onClickListener, view);
                }
            });
            i2++;
        }
        builder.setTitle(str);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        return builder.create();
    }

    public static void lambda$createSingleChoiceDialog$106(AlertDialog.Builder builder, DialogInterface.OnClickListener onClickListener, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        builder.getDismissRunnable().run();
        onClickListener.onClick(null, intValue);
    }

    public static AlertDialog.Builder createTTLAlert(Context context, final TLRPC$EncryptedChat tLRPC$EncryptedChat, Theme.ResourcesProvider resourcesProvider) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, resourcesProvider);
        builder.setTitle(LocaleController.getString("MessageLifetime", C0952R.string.MessageLifetime));
        final NumberPicker numberPicker = new NumberPicker(context);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        int i = tLRPC$EncryptedChat.ttl;
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
        numberPicker.setFormatter(AlertsCreator$$ExternalSyntheticLambda116.INSTANCE);
        builder.setView(numberPicker);
        builder.setNegativeButton(LocaleController.getString("Done", C0952R.string.Done), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlertsCreator.lambda$createTTLAlert$108(TLRPC$EncryptedChat.this, numberPicker, dialogInterface, i2);
            }
        });
        return builder;
    }

    public static String lambda$createTTLAlert$107(int i) {
        if (i == 0) {
            return LocaleController.getString("ShortMessageLifetimeForever", C0952R.string.ShortMessageLifetimeForever);
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

    public static void lambda$createTTLAlert$108(TLRPC$EncryptedChat tLRPC$EncryptedChat, NumberPicker numberPicker, DialogInterface dialogInterface, int i) {
        int i2 = tLRPC$EncryptedChat.ttl;
        int value = numberPicker.getValue();
        if (value >= 0 && value < 16) {
            tLRPC$EncryptedChat.ttl = value;
        } else if (value == 16) {
            tLRPC$EncryptedChat.ttl = 30;
        } else if (value == 17) {
            tLRPC$EncryptedChat.ttl = 60;
        } else if (value == 18) {
            tLRPC$EncryptedChat.ttl = 3600;
        } else if (value == 19) {
            tLRPC$EncryptedChat.ttl = 86400;
        } else if (value == 20) {
            tLRPC$EncryptedChat.ttl = 604800;
        }
        if (i2 != tLRPC$EncryptedChat.ttl) {
            SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(tLRPC$EncryptedChat, null);
            MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(tLRPC$EncryptedChat);
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
        for (int i = 0; i < 3; i++) {
            if (UserConfig.getInstance(i).getCurrentUser() != null) {
                AccountSelectCell accountSelectCell = new AccountSelectCell(activity, false);
                accountSelectCell.setAccount(i, false);
                accountSelectCell.setPadding(AndroidUtilities.m34dp(14.0f), 0, AndroidUtilities.m34dp(14.0f), 0);
                accountSelectCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                linearLayout.addView(accountSelectCell, LayoutHelper.createLinear(-1, 50));
                accountSelectCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AlertsCreator.lambda$createAccountSelectDialog$109(alertDialogArr, dismissRunnable, accountSelectDelegate, view);
                    }
                });
            }
        }
        builder.setTitle(LocaleController.getString("SelectAccount", C0952R.string.SelectAccount));
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
        AlertDialog create = builder.create();
        alertDialogArr[0] = create;
        return create;
    }

    public static void lambda$createAccountSelectDialog$109(AlertDialog[] alertDialogArr, Runnable runnable, AccountSelectDelegate accountSelectDelegate, View view) {
        if (alertDialogArr[0] != null) {
            alertDialogArr[0].setOnDismissListener(null);
        }
        runnable.run();
        accountSelectDelegate.didSelectAccount(((AccountSelectCell) view).getAccountNumber());
    }

    public static void createDeleteMessagesAlert(final org.telegram.p009ui.ActionBar.BaseFragment r43, final org.telegram.tgnet.TLRPC$User r44, final org.telegram.tgnet.TLRPC$Chat r45, final org.telegram.tgnet.TLRPC$EncryptedChat r46, final org.telegram.tgnet.TLRPC$ChatFull r47, final long r48, final org.telegram.messenger.MessageObject r50, final android.util.SparseArray<org.telegram.messenger.MessageObject>[] r51, final org.telegram.messenger.MessageObject.GroupedMessages r52, final boolean r53, int r54, final java.lang.Runnable r55, final java.lang.Runnable r56, final org.telegram.p009ui.ActionBar.Theme.ResourcesProvider r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AlertsCreator.createDeleteMessagesAlert(org.telegram.ui.ActionBar.BaseFragment, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, boolean, int, java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public static void lambda$createDeleteMessagesAlert$111(final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$ChatFull tLRPC$ChatFull, final long j, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final boolean z, final Runnable runnable, final Runnable runnable2, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createDeleteMessagesAlert$110(alertDialogArr, tLObject, tLRPC$TL_error, baseFragment, tLRPC$User, tLRPC$Chat, tLRPC$EncryptedChat, tLRPC$ChatFull, j, messageObject, sparseArrayArr, groupedMessages, z, runnable, runnable2, resourcesProvider);
            }
        });
    }

    public static void lambda$createDeleteMessagesAlert$110(AlertDialog[] alertDialogArr, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$ChatFull tLRPC$ChatFull, long j, MessageObject messageObject, SparseArray[] sparseArrayArr, MessageObject.GroupedMessages groupedMessages, boolean z, Runnable runnable, Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        int i;
        int i2 = 0;
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (tLObject != null) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = ((TLRPC$TL_channels_channelParticipant) tLObject).participant;
            if ((tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) || (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantCreator)) {
                i2 = 2;
            }
            i = i2;
        } else {
            i = (tLRPC$TL_error == null || !"USER_NOT_PARTICIPANT".equals(tLRPC$TL_error.text)) ? 2 : 0;
        }
        createDeleteMessagesAlert(baseFragment, tLRPC$User, tLRPC$Chat, tLRPC$EncryptedChat, tLRPC$ChatFull, j, messageObject, sparseArrayArr, groupedMessages, z, i, runnable, runnable2, resourcesProvider);
    }

    public static void lambda$createDeleteMessagesAlert$113(AlertDialog[] alertDialogArr, final int i, final int i2, BaseFragment baseFragment) {
        if (alertDialogArr[0] != null) {
            alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertsCreator.lambda$createDeleteMessagesAlert$112(i, i2, dialogInterface);
                }
            });
            baseFragment.showDialog(alertDialogArr[0]);
        }
    }

    public static void lambda$createDeleteMessagesAlert$112(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void lambda$createDeleteMessagesAlert$114(boolean[] zArr, View view) {
        if (view.isEnabled()) {
            CheckBoxCell checkBoxCell = (CheckBoxCell) view;
            Integer num = (Integer) checkBoxCell.getTag();
            zArr[num.intValue()] = !zArr[num.intValue()];
            checkBoxCell.setChecked(zArr[num.intValue()], true);
        }
    }

    public static void lambda$createDeleteMessagesAlert$115(boolean[] zArr, View view) {
        zArr[0] = !zArr[0];
        ((CheckBoxCell) view).setChecked(zArr[0], true);
    }

    public static void lambda$createDeleteMessagesAlert$116(boolean[] zArr, View view) {
        zArr[0] = !zArr[0];
        ((CheckBoxCell) view).setChecked(zArr[0], true);
    }

    public static void lambda$createDeleteMessagesAlert$118(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, TLRPC$EncryptedChat tLRPC$EncryptedChat, int i, long j, boolean[] zArr, boolean z, SparseArray[] sparseArrayArr, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean[] zArr2, TLRPC$Chat tLRPC$Chat2, TLRPC$ChatFull tLRPC$ChatFull, Runnable runnable, DialogInterface dialogInterface, int i2) {
        ArrayList<Integer> arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList<Long> arrayList3;
        int i4 = 10;
        ArrayList<Long> arrayList4 = null;
        int i5 = 0;
        if (messageObject != null) {
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            if (groupedMessages != null) {
                for (int i6 = 0; i6 < groupedMessages.messages.size(); i6++) {
                    MessageObject messageObject2 = groupedMessages.messages.get(i6);
                    arrayList5.add(Integer.valueOf(messageObject2.getId()));
                    if (!(tLRPC$EncryptedChat == null || messageObject2.messageOwner.random_id == 0 || messageObject2.type == 10)) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(Long.valueOf(messageObject2.messageOwner.random_id));
                    }
                }
            } else {
                arrayList5.add(Integer.valueOf(messageObject.getId()));
                if (!(tLRPC$EncryptedChat == null || messageObject.messageOwner.random_id == 0 || messageObject.type == 10)) {
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    arrayList6.add(Long.valueOf(messageObject.messageOwner.random_id));
                    arrayList3 = arrayList6;
                    arrayList = arrayList5;
                    i3 = 0;
                    MessagesController.getInstance(i).deleteMessages(arrayList5, arrayList3, tLRPC$EncryptedChat, j, zArr[0], z);
                }
            }
            arrayList3 = arrayList4;
            arrayList = arrayList5;
            i3 = 0;
            MessagesController.getInstance(i).deleteMessages(arrayList5, arrayList3, tLRPC$EncryptedChat, j, zArr[0], z);
        } else {
            ArrayList<Integer> arrayList7 = null;
            int i7 = 1;
            while (i7 >= 0) {
                ArrayList<Integer> arrayList8 = new ArrayList<>();
                for (int i8 = 0; i8 < sparseArrayArr[i7].size(); i8++) {
                    arrayList8.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i8)));
                }
                if (!arrayList8.isEmpty()) {
                    long j2 = ((MessageObject) sparseArrayArr[i7].get(arrayList8.get(i5).intValue())).messageOwner.peer_id.channel_id;
                }
                if (tLRPC$EncryptedChat != null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (int i9 = 0; i9 < sparseArrayArr[i7].size(); i9++) {
                        MessageObject messageObject3 = (MessageObject) sparseArrayArr[i7].valueAt(i9);
                        long j3 = messageObject3.messageOwner.random_id;
                        if (!(j3 == 0 || messageObject3.type == i4)) {
                            arrayList9.add(Long.valueOf(j3));
                        }
                    }
                    arrayList2 = arrayList9;
                } else {
                    arrayList2 = null;
                }
                MessagesController.getInstance(i).deleteMessages(arrayList8, arrayList2, tLRPC$EncryptedChat, j, zArr[i5], z);
                sparseArrayArr[i7].clear();
                i7--;
                arrayList7 = arrayList8;
                i5 = 0;
                i4 = 10;
            }
            i3 = 0;
            arrayList = arrayList7;
        }
        if (!(tLRPC$User == null && tLRPC$Chat == null)) {
            if (zArr2[i3]) {
                MessagesController.getInstance(i).deleteParticipantFromChat(tLRPC$Chat2.f854id, tLRPC$User, tLRPC$Chat, tLRPC$ChatFull, false, false);
            }
            if (zArr2[1]) {
                TLRPC$TL_channels_reportSpam tLRPC$TL_channels_reportSpam = new TLRPC$TL_channels_reportSpam();
                tLRPC$TL_channels_reportSpam.channel = MessagesController.getInputChannel(tLRPC$Chat2);
                if (tLRPC$User != null) {
                    tLRPC$TL_channels_reportSpam.participant = MessagesController.getInputPeer(tLRPC$User);
                } else {
                    tLRPC$TL_channels_reportSpam.participant = MessagesController.getInputPeer(tLRPC$Chat);
                }
                tLRPC$TL_channels_reportSpam.f896id = arrayList;
                ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_channels_reportSpam, AlertsCreator$$ExternalSyntheticLambda99.INSTANCE);
            }
            if (zArr2[2]) {
                MessagesController.getInstance(i).deleteUserChannelHistory(tLRPC$Chat2, tLRPC$User, tLRPC$Chat, i3);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$createDeleteMessagesAlert$119(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void createThemeCreateDialog(final BaseFragment baseFragment, int i, final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            Activity parentActivity = baseFragment.getParentActivity();
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setLineColors(Theme.getColor("dialogInputField"), Theme.getColor("dialogInputFieldActivated"), Theme.getColor("dialogTextRed2"));
            AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity);
            builder.setTitle(LocaleController.getString("NewTheme", C0952R.string.NewTheme));
            builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString("Create", C0952R.string.Create), AlertsCreator$$ExternalSyntheticLambda38.INSTANCE);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            builder.setView(linearLayout);
            TextView textView = new TextView(parentActivity);
            if (i != 0) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString("EnterThemeNameEdit", C0952R.string.EnterThemeNameEdit)));
            } else {
                textView.setText(LocaleController.getString("EnterThemeName", C0952R.string.EnterThemeName));
            }
            textView.setTextSize(1, 16.0f);
            textView.setPadding(AndroidUtilities.m34dp(23.0f), AndroidUtilities.m34dp(12.0f), AndroidUtilities.m34dp(23.0f), AndroidUtilities.m34dp(6.0f));
            textView.setTextColor(Theme.getColor("dialogTextBlack"));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            editTextBoldCursor.setTextSize(1, 16.0f);
            editTextBoldCursor.setTextColor(Theme.getColor("dialogTextBlack"));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            editTextBoldCursor.setCursorSize(AndroidUtilities.m34dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.m34dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(AlertsCreator$$ExternalSyntheticLambda84.INSTANCE);
            editTextBoldCursor.setText(generateThemeName(themeAccent));
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            final AlertDialog create = builder.create();
            create.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    AlertsCreator.lambda$createThemeCreateDialog$123(EditTextBoldCursor.this, dialogInterface);
                }
            });
            baseFragment.showDialog(create);
            editTextBoldCursor.requestFocus();
            create.getButton(-1).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AlertsCreator.lambda$createThemeCreateDialog$126(BaseFragment.this, editTextBoldCursor, themeAccent, themeInfo, create, view);
                }
            });
        }
    }

    public static void lambda$createThemeCreateDialog$123(final EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.lambda$createThemeCreateDialog$122(EditTextBoldCursor.this);
            }
        });
    }

    public static void lambda$createThemeCreateDialog$122(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$createThemeCreateDialog$126(final BaseFragment baseFragment, final EditTextBoldCursor editTextBoldCursor, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo, final AlertDialog alertDialog, View view) {
        if (baseFragment.getParentActivity() != null) {
            if (editTextBoldCursor.length() == 0) {
                Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(editTextBoldCursor, 2.0f, 0);
                return;
            }
            if (baseFragment instanceof ThemePreviewActivity) {
                Theme.applyPreviousTheme();
                baseFragment.finishFragment();
            }
            if (themeAccent != null) {
                themeInfo.setCurrentAccentId(themeAccent.f999id);
                Theme.refreshThemeColors();
                Utilities.searchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        AlertsCreator.lambda$createThemeCreateDialog$125(EditTextBoldCursor.this, alertDialog, baseFragment);
                    }
                });
                return;
            }
            processCreate(editTextBoldCursor, alertDialog, baseFragment);
        }
    }

    public static void lambda$createThemeCreateDialog$125(final EditTextBoldCursor editTextBoldCursor, final AlertDialog alertDialog, final BaseFragment baseFragment) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertsCreator.processCreate(EditTextBoldCursor.this, alertDialog, baseFragment);
            }
        });
    }

    public static void processCreate(EditTextBoldCursor editTextBoldCursor, AlertDialog alertDialog, BaseFragment baseFragment) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            Theme.ThemeInfo createNewTheme = Theme.createNewTheme(editTextBoldCursor.getText().toString());
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().show(baseFragment.getParentActivity(), createNewTheme);
            alertDialog.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("themehint", false)) {
                globalMainSettings.edit().putBoolean("themehint", true).commit();
                try {
                    Toast.makeText(baseFragment.getParentActivity(), LocaleController.getString("CreateNewThemeHelp", C0952R.string.CreateNewThemeHelp), 1).show();
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            }
        }
    }

    private static String generateThemeName(Theme.ThemeAccent themeAccent) {
        int i;
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        hashMap.put(9306112, "Berry");
        hashMap.put(14598550, "Brandy");
        hashMap.put(8391495, "Cherry");
        hashMap.put(16744272, "Coral");
        hashMap.put(14372985, "Cranberry");
        hashMap.put(14423100, "Crimson");
        hashMap.put(14725375, "Mauve");
        hashMap.put(16761035, "Pink");
        hashMap.put(16711680, "Red");
        hashMap.put(16711807, "Rose");
        hashMap.put(8406555, "Russet");
        hashMap.put(16720896, "Scarlet");
        hashMap.put(15856113, "Seashell");
        hashMap.put(16724889, "Strawberry");
        hashMap.put(16760576, "Amber");
        hashMap.put(15438707, "Apricot");
        hashMap.put(16508850, "Banana");
        hashMap.put(10601738, "Citrus");
        hashMap.put(11560192, "Ginger");
        hashMap.put(16766720, "Gold");
        hashMap.put(16640272, "Lemon");
        hashMap.put(16753920, "Orange");
        hashMap.put(16770484, "Peach");
        hashMap.put(16739155, "Persimmon");
        hashMap.put(14996514, "Sunflower");
        hashMap.put(15893760, "Tangerine");
        hashMap.put(16763004, "Topaz");
        hashMap.put(16776960, "Yellow");
        hashMap.put(3688720, "Clover");
        hashMap.put(8628829, "Cucumber");
        hashMap.put(5294200, "Emerald");
        hashMap.put(11907932, "Olive");
        hashMap.put(65280, "Green");
        hashMap.put(43115, "Jade");
        hashMap.put(2730887, "Jungle");
        hashMap.put(12582656, "Lime");
        hashMap.put(776785, "Malachite");
        hashMap.put(10026904, "Mint");
        hashMap.put(11394989, "Moss");
        hashMap.put(3234721, "Azure");
        hashMap.put(255, "Blue");
        hashMap.put(18347, "Cobalt");
        hashMap.put(5204422, "Indigo");
        hashMap.put(96647, "Lagoon");
        hashMap.put(7461346, "Aquamarine");
        hashMap.put(1182351, "Ultramarine");
        hashMap.put(Integer.valueOf((int) ConnectionsManager.RequestFlagNeedQuickAck), "Navy");
        hashMap.put(3101086, "Sapphire");
        hashMap.put(7788522, "Sky");
        hashMap.put(32896, "Teal");
        hashMap.put(4251856, "Turquoise");
        hashMap.put(10053324, "Amethyst");
        hashMap.put(5046581, "Blackberry");
        hashMap.put(6373457, "Eggplant");
        hashMap.put(13148872, "Lilac");
        hashMap.put(11894492, "Lavender");
        hashMap.put(13421823, "Periwinkle");
        hashMap.put(8663417, "Plum");
        hashMap.put(6684825, "Purple");
        hashMap.put(14204888, "Thistle");
        hashMap.put(14315734, "Orchid");
        hashMap.put(2361920, "Violet");
        hashMap.put(4137225, "Bronze");
        hashMap.put(3604994, "Chocolate");
        hashMap.put(8077056, "Cinnamon");
        hashMap.put(3153694, "Cocoa");
        hashMap.put(7365973, "Coffee");
        hashMap.put(7956873, "Rum");
        hashMap.put(5113350, "Mahogany");
        hashMap.put(7875865, "Mocha");
        hashMap.put(12759680, "Sand");
        hashMap.put(8924439, "Sienna");
        hashMap.put(7864585, "Maple");
        hashMap.put(15787660, "Khaki");
        hashMap.put(12088115, "Copper");
        hashMap.put(12144200, "Chestnut");
        hashMap.put(15653316, "Almond");
        hashMap.put(16776656, "Cream");
        hashMap.put(12186367, "Diamond");
        hashMap.put(11109127, "Honey");
        hashMap.put(16777200, "Ivory");
        hashMap.put(15392968, "Pearl");
        hashMap.put(15725299, "Porcelain");
        hashMap.put(13745832, "Vanilla");
        hashMap.put(16777215, "White");
        hashMap.put(8421504, "Gray");
        hashMap.put(0, "Black");
        hashMap.put(15266260, "Chrome");
        hashMap.put(3556687, "Charcoal");
        hashMap.put(789277, "Ebony");
        hashMap.put(12632256, "Silver");
        hashMap.put(16119285, "Smoke");
        hashMap.put(2499381, "Steel");
        hashMap.put(5220413, "Apple");
        hashMap.put(8434628, "Glacier");
        hashMap.put(16693933, "Melon");
        hashMap.put(12929932, "Mulberry");
        hashMap.put(11126466, "Opal");
        hashMap.put(5547512, "Blue");
        Theme.ThemeAccent accent = themeAccent == null ? Theme.getCurrentTheme().getAccent(false) : themeAccent;
        if (accent == null || (i = accent.accentColor) == 0) {
            i = AndroidUtilities.calcDrawableColor(Theme.getCachedWallpaper())[0];
        }
        String str = null;
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i3 = (red + red2) / 2;
            int i4 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i5 = ((((i3 + 512) * i4) * i4) >> 8) + (green2 * 4 * green2) + ((((767 - i3) * blue2) * blue2) >> 8);
            if (i5 < i2) {
                str = (String) entry.getValue();
                i2 = i5;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            return ((String) asList.get(Utilities.random.nextInt(asList.size()))) + " " + str;
        }
        return str + " " + ((String) asList2.get(Utilities.random.nextInt(asList2.size())));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static ActionBarPopupWindow showPopupMenu(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view, int i, int i2) {
        final Rect rect = new Rect();
        final ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        if (Build.VERSION.SDK_INT >= 19) {
            actionBarPopupWindow.setAnimationStyle(0);
        } else {
            actionBarPopupWindow.setAnimationStyle(C0952R.style.PopupAnimation);
        }
        actionBarPopupWindow.setAnimationEnabled(true);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public final boolean onKey(View view2, int i3, KeyEvent keyEvent) {
                boolean lambda$showPopupMenu$127;
                lambda$showPopupMenu$127 = AlertsCreator.lambda$showPopupMenu$127(ActionBarPopupWindow.this, view2, i3, keyEvent);
                return lambda$showPopupMenu$127;
            }
        });
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x - AndroidUtilities.m34dp(40.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        actionBarPopupWindow.showAsDropDown(view, i, i2);
        actionBarPopupWindowLayout.updateRadialSelectors();
        actionBarPopupWindow.startAnimation();
        actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$showPopupMenu$128;
                lambda$showPopupMenu$128 = AlertsCreator.lambda$showPopupMenu$128(ActionBarPopupWindow.this, rect, view2, motionEvent);
                return lambda$showPopupMenu$128;
            }
        });
        return actionBarPopupWindow;
    }

    public static boolean lambda$showPopupMenu$127(ActionBarPopupWindow actionBarPopupWindow, View view, int i, KeyEvent keyEvent) {
        if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        actionBarPopupWindow.dismiss();
        return true;
    }

    public static boolean lambda$showPopupMenu$128(ActionBarPopupWindow actionBarPopupWindow, Rect rect, View view, MotionEvent motionEvent) {
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
}
