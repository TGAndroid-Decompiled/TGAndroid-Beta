package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator$$ExternalSyntheticLambda1;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BetterRatingView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.JoinCallByUrlAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MainTabsLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda32;

public abstract class VoIPHelper {
    public static long lastCallTime;

    public static boolean canRateCall(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            Iterator<String> it = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(" ");
                if (strArrSplit.length >= 2) {
                    if (strArrSplit[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void doInitiateCall(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z, final boolean z2, final boolean z3, final boolean z4, final Activity activity, final BaseFragment baseFragment, final AccountInstance accountInstance, boolean z5, boolean z6, boolean z7) {
        ChatObject.Call groupCall;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - lastCallTime < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z5 && chat != null && !z4 && (chatFull2 = accountInstance.getMessagesController().getChatFull(chat.id)) != null && (peer = chatFull2.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer inputPeer2 = accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(peer));
                JoinCallAlert.checkFewUsers(activity, -chat.id, accountInstance, new MessagesStorage.BooleanCallback() {
                    @Override
                    public final void run(boolean z8) {
                        final String str2 = str;
                        final Activity activity2 = activity;
                        final TLRPC.Chat chat2 = chat;
                        final TLRPC.User user2 = user;
                        final TLRPC.InputPeer inputPeer3 = inputPeer2;
                        final boolean z9 = z2;
                        final boolean z10 = z3;
                        final BaseFragment baseFragment2 = baseFragment;
                        final AccountInstance accountInstance2 = accountInstance;
                        if (z8 || str2 == null) {
                            VoIPHelper.doInitiateCall(user2, chat2, str2, inputPeer3, !z8, z9, z10, false, activity2, baseFragment2, accountInstance2, false, false, false);
                            return;
                        }
                        JoinCallByUrlAlert joinCallByUrlAlert = new JoinCallByUrlAlert(activity2, chat2) {
                            @Override
                            public final void onJoin() {
                                VoIPHelper.doInitiateCall(user2, chat2, str2, inputPeer3, true, z9, z10, false, activity2, baseFragment2, accountInstance2, false, false, false);
                            }
                        };
                        if (baseFragment2 != null) {
                            baseFragment2.showDialog(joinCallByUrlAlert);
                        }
                    }
                });
                return;
            }
            if (z5 && chat != null) {
                JoinCallAlert.open(activity, -chat.id, accountInstance, baseFragment, !z4 ? 1 : 0, null, new VoIPHelper$$ExternalSyntheticLambda15(z4, activity, accountInstance, chat, str, user, z2, z3, baseFragment));
                return;
            }
            if (z6 && !z && (inputPeer instanceof TLRPC.TL_inputPeerUser) && ChatObject.shouldSendAnonymously(chat) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelVoiceChat : R.string.VoipGroupVoiceChat)).setMessage(LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelJoinAnonymouseAlert : R.string.VoipGroupJoinAnonymouseAlert)).setPositiveButton(LocaleController.getString(R.string.VoipChatJoin), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        VoIPHelper.doInitiateCall(user, chat, str, inputPeer, false, z2, z3, z4, activity, baseFragment, accountInstance, false, false, false);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
                return;
            }
            if (chat != null && inputPeer != null && (chatFull = accountInstance.getMessagesController().getChatFull(chat.id)) != null) {
                if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    chatFull.groupcall_default_join_as = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    chatFull.groupcall_default_join_as = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    chatFull.groupcall_default_join_as = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                }
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 32768;
                } else {
                    chatFull.flags |= 67108864;
                }
            }
            if (chat != null && !z4 && (groupCall = accountInstance.getMessagesController().getGroupCall(chat.id, false)) != null && groupCall.isScheduled()) {
                GroupCallActivity.create((LaunchActivity) activity, accountInstance, chat, inputPeer, z, str);
                return;
            }
            lastCallTime = SystemClock.elapsedRealtime();
            Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
            if (user != null) {
                intent.putExtra("user_id", user.id);
            } else {
                intent.putExtra("chat_id", chat.id);
                intent.putExtra("createGroupCall", z4);
                intent.putExtra("hasFewPeers", z);
                intent.putExtra("isRtmpStream", z7);
                intent.putExtra("hash", str);
                if (inputPeer != null) {
                    intent.putExtra("peerChannelId", inputPeer.channel_id);
                    intent.putExtra("peerChatId", inputPeer.chat_id);
                    intent.putExtra("peerUserId", inputPeer.user_id);
                    intent.putExtra("peerAccessHash", inputPeer.access_hash);
                }
            }
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", true);
            intent.putExtra("video_call", z2);
            intent.putExtra("can_video_call", z3);
            intent.putExtra("account", UserConfig.selectedAccount);
            try {
                activity.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public static int getDataSavingDefault() {
        boolean z = DownloadController.getInstance(0).lowPreset.lessCallData;
        boolean z2 = DownloadController.getInstance(0).mediumPreset.lessCallData;
        boolean z3 = DownloadController.getInstance(0).highPreset.lessCallData;
        if (!z && !z2 && !z3) {
            return 0;
        }
        if (z && !z2 && !z3) {
            return 3;
        }
        if (z && z2 && !z3) {
            return 1;
        }
        if (z && z2 && z3) {
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("Invalid call data saving preset configuration: " + z + "/" + z2 + "/" + z3);
        }
        return 0;
    }

    public static String getLogFilePath(String str, boolean z) {
        File[] fileArrListFiles;
        File file = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!BuildVars.DEBUG_VERSION && (fileArrListFiles = file.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(fileArrListFiles));
            while (arrayList.size() > 20) {
                int i = 0;
                File file2 = (File) arrayList.get(0);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    File file3 = (File) obj;
                    if (file3.getName().endsWith(".log") && file3.lastModified() < file2.lastModified()) {
                        file2 = file3;
                    }
                }
                file2.delete();
                arrayList.remove(file2);
            }
        }
        return z ? new File(file, zzhp.m(str, "_stats.log")).getAbsolutePath() : new File(file, zzhp.m(str, ".log")).getAbsolutePath();
    }

    public static void initiateCall(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Boolean bool, Activity activity, BaseFragment baseFragment, AccountInstance accountInstance) {
        char c;
        long j;
        String name;
        int i;
        int i2;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    doInitiateCall(user, chat, str, null, false, z, z2, z3, activity, baseFragment, accountInstance, bool != null ? bool.booleanValue() : true, true, false);
                    return;
                }
                return;
            }
            long j2 = user != null ? user.id : -chat.id;
            long callerId = sharedInstance.getCallerId();
            if (callerId == j2 && sharedInstance.getAccount() == accountInstance.getCurrentAccount()) {
                if (user != null || !(activity instanceof LaunchActivity)) {
                    activity.startActivity(new Intent(activity, (Class<?>) LaunchActivity.class).setAction(user != null ? "voip" : "voip_chat"));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    sharedInstance.setGroupCallHash(str);
                }
                GroupCallActivity.create((LaunchActivity) activity, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
                return;
            }
            if (sharedInstance.isConference()) {
                StringBuilder sb = new StringBuilder();
                if (sharedInstance.groupCall != null) {
                    int account = sharedInstance.getAccount();
                    int i3 = 0;
                    c = 1;
                    int i4 = 0;
                    j = 0;
                    while (true) {
                        if (i3 >= sharedInstance.groupCall.participants.size()) {
                            i2 = i4;
                            break;
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.valueAt(i3)).peer);
                        if (peerDialogId != UserConfig.getInstance(account).getClientUserId()) {
                            i2 = i4 + 1;
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(DialogObject.getShortName(account, peerDialogId));
                            if (i2 >= 2) {
                                break;
                            } else {
                                i4 = i2;
                            }
                        }
                        i3++;
                    }
                    if (i2 < sharedInstance.groupCall.participants.size() - 1) {
                        sb.append(LocaleController.formatPluralString("AndOther", (sharedInstance.groupCall.participants.size() - 1) - i2, new Object[0]));
                    }
                } else {
                    c = 1;
                    j = 0;
                }
                i = j2 > j ? R.string.VoipOngoingConferenceChatAlert : R.string.VoipOngoingConferenceChatAlert2;
                name = sb.toString();
            } else {
                c = 1;
                j = 0;
                if (callerId > 0) {
                    TLRPC.User user2 = sharedInstance.getUser();
                    name = ContactsController.formatName(user2.first_name, user2.last_name);
                    i = j2 > 0 ? R.string.VoipOngoingAlert : R.string.VoipOngoingAlert2;
                } else {
                    name = sharedInstance.getChat().title;
                    i = j2 > 0 ? R.string.VoipOngoingChatAlert2 : R.string.VoipOngoingChatAlert;
                }
            }
            String name2 = user != null ? ContactsController.formatName(user.first_name, user.last_name) : chat.title;
            AlertDialog.Builder title = new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(callerId < j ? R.string.VoipOngoingChatAlertTitle : R.string.VoipOngoingAlertTitle));
            Object[] objArr = new Object[2];
            objArr[0] = name;
            objArr[c] = name2;
            title.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i, objArr))).setPositiveButton(LocaleController.getString(R.string.OK), new VoIPHelper$$ExternalSyntheticLambda15(user, chat, str, z, z2, z3, activity, baseFragment, accountInstance)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }
    }

    public static void joinConference(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new RichEditorListView$$ExternalSyntheticLambda32(activity, i, inputGroupCall, z, groupCall, hashSet));
            return;
        }
        lastCallTime = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i2 = 0;
        intent.putExtra("createGroupCall", false);
        intent.putExtra("hasFewPeers", false);
        intent.putExtra("isRtmpStream", false);
        intent.putExtra("hash", (String) null);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", true);
        intent.putExtra("video_call", false);
        SerializedData serializedData = new SerializedData(inputGroupCall.getObjectSize());
        inputGroupCall.serializeToStream(serializedData);
        intent.putExtra("joinConference", serializedData.toByteArray());
        if (groupCall != null) {
            SerializedData serializedData2 = new SerializedData(groupCall.getObjectSize());
            groupCall.serializeToStream(serializedData2);
            intent.putExtra("joinConferenceCall", serializedData2.toByteArray());
        }
        if (hashSet != null) {
            long[] jArr = new long[hashSet.size()];
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jArr[i2] = ((Long) it.next()).longValue();
                i2++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i);
        intent.putExtra("video_call", z);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void permissionDenied(Activity activity, int i, Runnable runnable) {
        boolean z = i == 102;
        if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") || (z && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            new AlertDialog.Builder(activity, 0, null).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.VoipNeedMicCameraPermissionWithHint : R.string.VoipNeedMicPermissionWithHint))).setPositiveButton(LocaleController.getString(R.string.Settings), new BotLocation$$ExternalSyntheticLambda7(activity, 1)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(runnable, 5)).setTopAnimation(z ? R.raw.permission_request_camera : R.raw.permission_request_microphone, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).show();
        }
    }

    public static void showCallDebugSettings(Activity activity) {
        final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 16.0f, 8.0f, 16.0f, 8.0f));
        final TextCheckCell textCheckCell = new TextCheckCell(activity);
        textCheckCell.setTextAndCheck("Force TCP", globalMainSettings.getBoolean("dbg_force_tcp_in_calls", false), false);
        final int i = 0;
        textCheckCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        SharedPreferences sharedPreferences = globalMainSettings;
                        boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        boolean z2 = !z;
                        editorEdit.putBoolean("dbg_force_tcp_in_calls", z2);
                        editorEdit.commit();
                        textCheckCell.setChecked(z2);
                        break;
                    case 1:
                        SharedPreferences sharedPreferences2 = globalMainSettings;
                        boolean z3 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                        boolean z4 = !z3;
                        editorEdit2.putBoolean("dbg_dump_call_stats", z4);
                        editorEdit2.commit();
                        textCheckCell.setChecked(z4);
                        break;
                    default:
                        SharedPreferences sharedPreferences3 = globalMainSettings;
                        boolean z5 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                        boolean z6 = !z5;
                        editorEdit3.putBoolean("dbg_force_connection_service", z6);
                        editorEdit3.commit();
                        textCheckCell.setChecked(z6);
                        break;
                }
            }
        });
        linearLayout.addView(textCheckCell);
        if (BuildVars.DEBUG_VERSION && BuildVars.LOGS_ENABLED) {
            final TextCheckCell textCheckCell2 = new TextCheckCell(activity);
            textCheckCell2.setTextAndCheck("Dump detailed stats", globalMainSettings.getBoolean("dbg_dump_call_stats", false), false);
            final int i2 = 1;
            textCheckCell2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            boolean z2 = !z;
                            editorEdit.putBoolean("dbg_force_tcp_in_calls", z2);
                            editorEdit.commit();
                            textCheckCell2.setChecked(z2);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z3 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            boolean z4 = !z3;
                            editorEdit2.putBoolean("dbg_dump_call_stats", z4);
                            editorEdit2.commit();
                            textCheckCell2.setChecked(z4);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z5 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                            boolean z6 = !z5;
                            editorEdit3.putBoolean("dbg_force_connection_service", z6);
                            editorEdit3.commit();
                            textCheckCell2.setChecked(z6);
                            break;
                    }
                }
            });
            linearLayout.addView(textCheckCell2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final TextCheckCell textCheckCell3 = new TextCheckCell(activity);
            textCheckCell3.setTextAndCheck("Enable ConnectionService", globalMainSettings.getBoolean("dbg_force_connection_service", false), false);
            final int i3 = 2;
            textCheckCell3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            boolean z2 = !z;
                            editorEdit.putBoolean("dbg_force_tcp_in_calls", z2);
                            editorEdit.commit();
                            textCheckCell3.setChecked(z2);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z3 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            boolean z4 = !z3;
                            editorEdit2.putBoolean("dbg_dump_call_stats", z4);
                            editorEdit2.commit();
                            textCheckCell3.setChecked(z4);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z5 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                            boolean z6 = !z5;
                            editorEdit3.putBoolean("dbg_force_connection_service", z6);
                            editorEdit3.commit();
                            textCheckCell3.setChecked(z6);
                            break;
                    }
                }
            });
            linearLayout.addView(textCheckCell3);
        }
        new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(R.string.DebugMenuCallSettings)).setView(linearLayout).show();
    }

    public static void showRateAlert(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        Iterator<String> it = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(" ");
            if (strArrSplit.length >= 2) {
                if (strArrSplit[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        showRateAlert(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(strArrSplit[1]), UserConfig.selectedAccount, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void startCall(TLRPC.User user, boolean z, boolean z2, Activity activity, TLRPC.UserFull userFull, AccountInstance accountInstance) {
        if (accountInstance != null ? accountInstance.getMessagesController().isFrozen() : MessagesController.getInstance(UserConfig.selectedAccount).isFrozen()) {
            AccountFrozenAlert.show(accountInstance == null ? UserConfig.selectedAccount : accountInstance.getCurrentAccount());
            return;
        }
        if (userFull != null && userFull.phone_calls_private) {
            AlertsCreator.showCallsForbidden(activity, accountInstance.getCurrentAccount(), user.id, null);
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
            boolean z3 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(z3 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle)).setMessage(LocaleController.getString(z3 ? R.string.VoipOfflineAirplane : R.string.VoipOffline)).setPositiveButton(LocaleController.getString(R.string.OK), null);
            if (z3) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    positiveButton.setNeutralButton(LocaleController.getString(R.string.VoipOfflineOpenSettings), new VoIPHelper$$ExternalSyntheticLambda4(activity, intent, 0));
                }
            }
            try {
                positiveButton.show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            initiateCall(user, null, null, z, z2, false, null, activity, null, accountInstance);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (z && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.isEmpty()) {
            initiateCall(user, null, null, z, z2, false, null, activity, null, accountInstance);
        } else {
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), z ? 102 : 101);
        }
    }

    public static void showRateAlert(final Activity activity, MainTabsLayout$$ExternalSyntheticLambda0 mainTabsLayout$$ExternalSyntheticLambda0, boolean z, final long j, final long j2, final int i, final boolean z2) {
        File file;
        File file2;
        String string;
        String str;
        File file3;
        String[] list;
        if (BuildVars.DEBUG_VERSION && (list = (file3 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "logs")).list()) != null) {
            int length = list.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String str2 = list[i2];
                    if (str2.endsWith("voip" + j + ".txt")) {
                        file = new File(file3, str2);
                    } else {
                        i2++;
                    }
                } else {
                    file2 = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    file = new File(file2, j + ".log");
                }
            }
        } else {
            file2 = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = new File(file2, j + ".log");
        }
        final File file4 = file;
        final int[] iArr = {0};
        LinearLayout linearLayout = new LinearLayout(activity);
        int i3 = 1;
        linearLayout.setOrientation(1);
        int iDp = AndroidUtilities.dp(16.0f);
        linearLayout.setPadding(iDp, iDp, iDp, 0);
        final TextView textView = new TextView(activity);
        textView.setTextSize(2, 16.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.VoipRateCallAlert));
        linearLayout.addView(textView);
        final BetterRatingView betterRatingView = new BetterRatingView(activity);
        linearLayout.addView(betterRatingView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        BotAdView$$ExternalSyntheticLambda0 botAdView$$ExternalSyntheticLambda0 = new BotAdView$$ExternalSyntheticLambda0(7);
        String[] strArr = {z ? "distorted_video" : null, z ? "pixelated_video" : null, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i4 = 0;
        while (i4 < 9) {
            if (strArr[i4] != null) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(activity, i3);
                checkBoxCell.setClipToPadding(false);
                checkBoxCell.setTag(strArr[i4]);
                switch (i4) {
                    case 0:
                        string = LocaleController.getString(R.string.RateCallVideoDistorted);
                        str = string;
                        break;
                    case 1:
                        string = LocaleController.getString(R.string.RateCallVideoPixelated);
                        str = string;
                        break;
                    case 2:
                        string = LocaleController.getString(R.string.RateCallEcho);
                        str = string;
                        break;
                    case 3:
                        string = LocaleController.getString(R.string.RateCallNoise);
                        str = string;
                        break;
                    case 4:
                        string = LocaleController.getString(R.string.RateCallInterruptions);
                        str = string;
                        break;
                    case 5:
                        string = LocaleController.getString(R.string.RateCallDistorted);
                        str = string;
                        break;
                    case 6:
                        string = LocaleController.getString(R.string.RateCallSilentLocal);
                        str = string;
                        break;
                    case 7:
                        string = LocaleController.getString(R.string.RateCallSilentRemote);
                        str = string;
                        break;
                    case 8:
                        string = LocaleController.getString(R.string.RateCallDropped);
                        str = string;
                        break;
                    default:
                        str = null;
                        break;
                }
                checkBoxCell.setText(str, null, false, false, false);
                checkBoxCell.setOnClickListener(botAdView$$ExternalSyntheticLambda0);
                checkBoxCell.setTag(strArr[i4]);
                linearLayout2.addView(checkBoxCell);
            }
            i4++;
            i3 = 1;
        }
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, -8.0f, 0.0f, -8.0f, 0.0f));
        linearLayout2.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipFeedbackCommentHint));
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_dialogTextHint, false));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 8.0f, 8.0f, 8.0f, 0.0f));
        final boolean[] zArr = {true};
        final CheckBoxCell checkBoxCell2 = new CheckBoxCell(activity, 1);
        AlertDialog$$ExternalSyntheticLambda5 alertDialog$$ExternalSyntheticLambda5 = new AlertDialog$$ExternalSyntheticLambda5(27, zArr, checkBoxCell2);
        checkBoxCell2.setText(LocaleController.getString(R.string.CallReportIncludeLogs), null, true, false, false);
        checkBoxCell2.setClipToPadding(false);
        checkBoxCell2.setOnClickListener(alertDialog$$ExternalSyntheticLambda5);
        linearLayout.addView(checkBoxCell2, LayoutHelper.createLinear(-1, -2, -8.0f, 0.0f, -8.0f, 0.0f));
        final TextView textView2 = new TextView(activity);
        textView2.setTextSize(2, 14.0f);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        textView2.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(8.0f, R.string.CallReportLogsExplain, textView2), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setOnClickListener(alertDialog$$ExternalSyntheticLambda5);
        linearLayout.addView(textView2);
        checkBoxCell2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(R.string.CallMessageReportProblem)).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.Send), new LivePlayer$$ExternalSyntheticLambda1(3)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(mainTabsLayout$$ExternalSyntheticLambda0, 4)).create();
        if (BuildVars.LOGS_ENABLED && file4.exists()) {
            RateCallLayout$$ExternalSyntheticLambda1 rateCallLayout$$ExternalSyntheticLambda1 = new RateCallLayout$$ExternalSyntheticLambda1(10, activity, file4);
            alertDialogCreate.neutralButtonText = "Send log";
            alertDialogCreate.neutralButtonListener = rateCallLayout$$ExternalSyntheticLambda1;
        }
        alertDialogCreate.show();
        alertDialogCreate.getWindow().setSoftInputMode(3);
        final View button = alertDialogCreate.getButton(-1);
        button.setEnabled(false);
        betterRatingView.setOnRatingChangeListener(new BoolAnimator$$ExternalSyntheticLambda1(button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BetterRatingView betterRatingView2 = betterRatingView;
                int rating = betterRatingView2.getRating();
                LinearLayout linearLayout3 = linearLayout2;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                AlertDialog alertDialog = alertDialogCreate;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        betterRatingView2.setVisibility(8);
                        textView.setVisibility(8);
                        alertDialog.setTitle(LocaleController.getString(R.string.CallReportHint));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            checkBoxCell2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout3.setVisibility(0);
                        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Send, (TextView) button);
                        return;
                    }
                }
                int i5 = UserConfig.selectedAccount;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = betterRatingView2.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < linearLayout3.getChildCount(); i6++) {
                    CheckBoxCell checkBoxCell3 = (CheckBoxCell) linearLayout3.getChildAt(i6);
                    if (checkBoxCell3.isChecked()) {
                        arrayList.add("#" + checkBoxCell3.getTag());
                    }
                }
                if (setcallrating.rating < 5) {
                    setcallrating.comment = editTextBoldCursor2.getText().toString();
                } else {
                    setcallrating.comment = "";
                }
                boolean zIsEmpty = arrayList.isEmpty();
                boolean[] zArr2 = zArr;
                if (!zIsEmpty && !zArr2[0]) {
                    setcallrating.comment += " " + TextUtils.join(" ", arrayList);
                }
                TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                setcallrating.peer = tL_inputPhoneCall;
                tL_inputPhoneCall.access_hash = j2;
                tL_inputPhoneCall.id = j;
                setcallrating.user_initiative = z2;
                ConnectionsManager.getInstance(i).sendRequest(setcallrating, new ArticleViewer$$ExternalSyntheticLambda33(i5, zArr2, file5, setcallrating, arrayList, activity));
                alertDialog.dismiss();
            }
        });
    }

    public static String getLogFilePath(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static void startCall(TLRPC.Chat chat, String str, boolean z, Boolean bool, Activity activity, BaseFragment baseFragment, AccountInstance accountInstance) {
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
            boolean z2 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(z2 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle)).setMessage(LocaleController.getString(z2 ? R.string.VoipGroupOfflineAirplane : R.string.VoipGroupOffline)).setPositiveButton(LocaleController.getString(R.string.OK), null);
            if (z2) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    positiveButton.setNeutralButton(LocaleController.getString(R.string.VoipOfflineOpenSettings), new VoIPHelper$$ExternalSyntheticLambda4(activity, intent, 1));
                }
            }
            try {
                positiveButton.show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        initiateCall(null, chat, str, false, false, z, bool, activity, baseFragment, accountInstance);
    }
}
