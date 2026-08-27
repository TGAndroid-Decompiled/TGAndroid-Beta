package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
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
import org.telegram.messenger.di;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ky0;
import org.telegram.ui.s50;

public abstract class e2 {

    public static long f33548a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.n2 n2Var, final AccountInstance accountInstance, boolean z14, boolean z15, boolean z16) {
        ChatObject.Call groupCall;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - f33548a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (chatFull2 = accountInstance.getMessagesController().getChatFull(chat.f22380id)) != null && (peer = chatFull2.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer inputPeer2 = accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(peer));
                k70.u(activity, -chat.f22380id, accountInstance, new MessagesStorage.BooleanCallback() {
                    @Override
                    public final void run(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer3 = inputPeer2;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        AccountInstance accountInstance2 = accountInstance;
                        if (z17 || str2 == null) {
                            e2.b(user2, chat2, str2, inputPeer3, !z17, z18, z19, false, activity2, n2Var2, accountInstance2, false, false, false);
                            return;
                        }
                        c2 c2Var = new c2(activity2, chat2, user2, chat2, str2, inputPeer3, z18, z19, activity2, n2Var2, accountInstance2);
                        if (n2Var2 != null) {
                            n2Var2.showDialog(c2Var);
                        }
                    }
                });
                return;
            }
            if (z14 && chat != null) {
                k70.v(activity, -chat.f22380id, accountInstance, n2Var, !z13 ? 1 : 0, null, new w1(z13, activity, accountInstance, chat, str, user, z11, z12, n2Var));
                return;
            }
            if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && ChatObject.shouldSendAnonymously(chat) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.f22702a.N = LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelVoiceChat : R.string.VoipGroupVoiceChat);
                alertDialog$Builder.f22702a.P = LocaleController.getString(ChatObject.isChannelOrGiga(chat) ? R.string.VoipChannelJoinAnonymouseAlert : R.string.VoipGroupJoinAnonymouseAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipChatJoin), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        e2.b(user, chat, str, inputPeer, false, z11, z12, z13, activity, n2Var, accountInstance, false, false, false);
                    }
                });
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            if (chat != null && inputPeer != null && (chatFull = accountInstance.getMessagesController().getChatFull(chat.f22380id)) != null) {
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
            if (chat != null && !z13 && (groupCall = accountInstance.getMessagesController().getGroupCall(chat.f22380id, false)) != null && groupCall.isScheduled()) {
                s50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
                return;
            }
            f33548a = SystemClock.elapsedRealtime();
            Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
            if (user != null) {
                intent.putExtra("user_id", user.f22527id);
            } else {
                intent.putExtra("chat_id", chat.f22380id);
                intent.putExtra("createGroupCall", z13);
                intent.putExtra("hasFewPeers", z10);
                intent.putExtra("isRtmpStream", z16);
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
            intent.putExtra("video_call", z11);
            intent.putExtra("can_video_call", z12);
            intent.putExtra("account", UserConfig.selectedAccount);
            try {
                activity.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public static int c() {
        boolean z10 = DownloadController.getInstance(0).lowPreset.lessCallData;
        boolean z11 = DownloadController.getInstance(0).mediumPreset.lessCallData;
        boolean z12 = DownloadController.getInstance(0).highPreset.lessCallData;
        if (!z10 && !z11 && !z12) {
            return 0;
        }
        if (z10 && !z11 && !z12) {
            return 3;
        }
        if (z10 && z11 && !z12) {
            return 1;
        }
        if (z10 && z11 && z12) {
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str, boolean z10) {
        File[] fileArrListFiles;
        File fileF = f();
        if (!BuildVars.DEBUG_VERSION && (fileArrListFiles = fileF.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(fileArrListFiles));
            while (arrayList.size() > 20) {
                int i10 = 0;
                File file = (File) arrayList.get(0);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    File file2 = (File) obj;
                    if (file2.getName().endsWith(".log") && file2.lastModified() < file.lastModified()) {
                        file = file2;
                    }
                }
                file.delete();
                arrayList.remove(file);
            }
        }
        return z10 ? new File(fileF, s3.c.l(str, "_stats.log")).getAbsolutePath() : new File(fileF, s3.c.l(str, ".log")).getAbsolutePath();
    }

    public static File f() {
        File file = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void g(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        char c10;
        long j10;
        String name;
        int i10;
        int i11;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, bool != null ? bool.booleanValue() : true, true, false);
                    return;
                }
                return;
            }
            long j11 = user != null ? user.f22527id : -chat.f22380id;
            long callerId = sharedInstance.getCallerId();
            if (callerId == j11 && sharedInstance.getAccount() == accountInstance.getCurrentAccount()) {
                if (user != null || !(activity instanceof LaunchActivity)) {
                    activity.startActivity(new Intent(activity, (Class<?>) LaunchActivity.class).setAction(user != null ? "voip" : "voip_chat"));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    sharedInstance.setGroupCallHash(str);
                }
                s50.c1((LaunchActivity) activity, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
                return;
            }
            if (sharedInstance.isConference()) {
                StringBuilder sb2 = new StringBuilder();
                if (sharedInstance.groupCall != null) {
                    int account = sharedInstance.getAccount();
                    int i12 = 0;
                    c10 = 1;
                    int i13 = 0;
                    j10 = 0;
                    while (true) {
                        if (i12 >= sharedInstance.groupCall.participants.m()) {
                            i11 = i13;
                            break;
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.n(i12)).peer);
                        if (peerDialogId != UserConfig.getInstance(account).getClientUserId()) {
                            i11 = i13 + 1;
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(DialogObject.getShortName(account, peerDialogId));
                            if (i11 >= 2) {
                                break;
                            } else {
                                i13 = i11;
                            }
                        }
                        i12++;
                    }
                    if (i11 < sharedInstance.groupCall.participants.m() - 1) {
                        sb2.append(LocaleController.formatPluralString("AndOther", (sharedInstance.groupCall.participants.m() - 1) - i11, new Object[0]));
                    }
                } else {
                    c10 = 1;
                    j10 = 0;
                }
                i10 = j11 > j10 ? R.string.VoipOngoingConferenceChatAlert : R.string.VoipOngoingConferenceChatAlert2;
                name = sb2.toString();
            } else {
                c10 = 1;
                j10 = 0;
                if (callerId > 0) {
                    TLRPC.User user2 = sharedInstance.getUser();
                    name = ContactsController.formatName(user2.first_name, user2.last_name);
                    i10 = j11 > 0 ? R.string.VoipOngoingAlert : R.string.VoipOngoingAlert2;
                } else {
                    name = sharedInstance.getChat().title;
                    i10 = j11 > 0 ? R.string.VoipOngoingChatAlert2 : R.string.VoipOngoingChatAlert;
                }
            }
            String name2 = user != null ? ContactsController.formatName(user.first_name, user.last_name) : chat.title;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String string = LocaleController.getString(callerId < j10 ? R.string.VoipOngoingChatAlertTitle : R.string.VoipOngoingAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            Object[] objArr = new Object[2];
            objArr[0] = name;
            objArr[c10] = name2;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new w1(user, chat, str, z10, z11, z12, activity, n2Var, accountInstance));
            i0.a.w(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void h(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new org.telegram.messenger.r1(activity, i10, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        f33548a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i11 = 0;
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
                jArr[i11] = ((Long) it.next()).longValue();
                i11++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i10);
        intent.putExtra("video_call", z10);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void i(Activity activity, Runnable runnable, int i10) {
        boolean z10 = i10 == 102;
        if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") || (z10 && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.VoipNeedMicCameraPermissionWithHint : R.string.VoipNeedMicPermissionWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.Settings), new nh.o0(activity, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.f22702a.setOnDismissListener(new b2(0, runnable));
            alertDialog$Builder.m(z10 ? R.raw.permission_request_camera : R.raw.permission_request_microphone, 72, g6.w0(null, g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    public static void j(Activity activity) {
        final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        textView.setTextColor(g6.w0(null, g6.f23161j5, false));
        linearLayoutF.addView(textView, z5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final p8 p8Var = new p8(activity);
        p8Var.f("Force TCP", globalMainSettings.getBoolean("dbg_force_tcp_in_calls", false), false);
        final int i10 = 0;
        p8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        SharedPreferences sharedPreferences = globalMainSettings;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        editorEdit.putBoolean("dbg_force_tcp_in_calls", z11);
                        editorEdit.commit();
                        p8Var.setChecked(z11);
                        break;
                    case 1:
                        SharedPreferences sharedPreferences2 = globalMainSettings;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        editorEdit2.putBoolean("dbg_dump_call_stats", z13);
                        editorEdit2.commit();
                        p8Var.setChecked(z13);
                        break;
                    default:
                        SharedPreferences sharedPreferences3 = globalMainSettings;
                        boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                        boolean z15 = !z14;
                        editorEdit3.putBoolean("dbg_force_connection_service", z15);
                        editorEdit3.commit();
                        p8Var.setChecked(z15);
                        break;
                }
            }
        });
        linearLayoutF.addView(p8Var);
        if (BuildVars.DEBUG_VERSION && BuildVars.LOGS_ENABLED) {
            final p8 p8Var2 = new p8(activity);
            p8Var2.f("Dump detailed stats", globalMainSettings.getBoolean("dbg_dump_call_stats", false), false);
            final int i11 = 1;
            p8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            editorEdit.putBoolean("dbg_force_tcp_in_calls", z11);
                            editorEdit.commit();
                            p8Var2.setChecked(z11);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            editorEdit2.putBoolean("dbg_dump_call_stats", z13);
                            editorEdit2.commit();
                            p8Var2.setChecked(z13);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            editorEdit3.putBoolean("dbg_force_connection_service", z15);
                            editorEdit3.commit();
                            p8Var2.setChecked(z15);
                            break;
                    }
                }
            });
            linearLayoutF.addView(p8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final p8 p8Var3 = new p8(activity);
            p8Var3.f("Enable ConnectionService", globalMainSettings.getBoolean("dbg_force_connection_service", false), false);
            final int i12 = 2;
            p8Var3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            editorEdit.putBoolean("dbg_force_tcp_in_calls", z11);
                            editorEdit.commit();
                            p8Var3.setChecked(z11);
                            break;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            editorEdit2.putBoolean("dbg_dump_call_stats", z13);
                            editorEdit2.commit();
                            p8Var3.setChecked(z13);
                            break;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            editorEdit3.putBoolean("dbg_force_connection_service", z15);
                            editorEdit3.commit();
                            p8Var3.setChecked(z15);
                            break;
                    }
                }
            });
            linearLayoutF.addView(p8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DebugMenuCallSettings);
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.o();
    }

    public static void k(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        Iterator<String> it = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(" ");
            if (strArrSplit.length >= 2) {
                if (strArrSplit[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        l(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(strArrSplit[1]), UserConfig.selectedAccount, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void l(final Context context, ky0 ky0Var, boolean z10, final long j10, final long j11, final int i10, final boolean z11) {
        File file;
        String string;
        String str;
        File file2;
        String[] list;
        if (BuildVars.DEBUG_VERSION && (list = (file2 = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "logs")).list()) != null) {
            int length = list.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    file = new File(f(), j10 + ".log");
                    break;
                }
                String str2 = list[i11];
                if (str2.endsWith("voip" + j10 + ".txt")) {
                    file = new File(file2, str2);
                    break;
                }
                i11++;
            }
        } else {
            file = new File(f(), j10 + ".log");
            break;
        }
        final File file3 = file;
        final int[] iArr = {0};
        int i12 = 1;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        int iDp = AndroidUtilities.dp(16.0f);
        linearLayoutG.setPadding(iDp, iDp, iDp, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        pa.s(g6.f23161j5, null, false, textView, 17);
        textView.setText(LocaleController.getString(R.string.VoipRateCallAlert));
        linearLayoutG.addView(textView);
        final r9 r9Var = new r9(context);
        r9Var.f32110c = new Paint();
        r9Var.d = 5;
        r9Var.f32111e = 0;
        r9Var.f32108a = BitmapFactory.decodeResource(r9Var.getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        r9Var.f32109b = BitmapFactory.decodeResource(r9Var.getResources(), R.drawable.ic_rating_star).extractAlpha();
        linearLayoutG.addView(r9Var, z5.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ag.l2 l2Var = new ag.l2(18);
        String[] strArr = {z10 ? "distorted_video" : null, z10 ? "pixelated_video" : null, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i13 = 0;
        while (i13 < 9) {
            if (strArr[i13] != null) {
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, i12);
                y1Var.setClipToPadding(false);
                y1Var.setTag(strArr[i13]);
                switch (i13) {
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
                y1Var.e(str, null, false, false, false);
                y1Var.setOnClickListener(l2Var);
                y1Var.setTag(strArr[i13]);
                linearLayout.addView(y1Var);
            }
            i13++;
            i12 = 1;
        }
        linearLayoutG.addView(linearLayout, z5.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipFeedbackCommentHint));
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setTextColor(g6.w0(null, g6.f23161j5, false));
        editTextBoldCursor.setHintTextColor(g6.w0(null, g6.f23338t5, false));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(g6.w0(null, g6.f23356u5, false), g6.w0(null, g6.f23372v5, false), g6.w0(null, g6.f23284q7, false));
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        linearLayoutG.addView(editTextBoldCursor, z5.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, 1);
        xh0 xh0Var = new xh0(13, zArr, y1Var2);
        y1Var2.e(LocaleController.getString(R.string.CallReportIncludeLogs), null, true, false, false);
        y1Var2.setClipToPadding(false);
        y1Var2.setOnClickListener(xh0Var);
        linearLayoutG.addView(y1Var2, z5.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.f23300r5, false));
        textView2.setPadding(pa.c(8.0f, R.string.CallReportLogsExplain, textView2), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setOnClickListener(xh0Var);
        linearLayoutG.addView(textView2);
        y1Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file3.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.CallMessageReportProblem);
        alertDialog$Builder.n(linearLayoutG);
        alertDialog$Builder.k(LocaleController.getString(R.string.Send), new a9.m(14));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22702a.setOnDismissListener(new b2(1, ky0Var));
        final org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (BuildVars.LOGS_ENABLED && file3.exists()) {
            org.telegram.ui.Components.g1 g1Var = new org.telegram.ui.Components.g1(29, context, file3);
            b2Var.f22760n0 = "Send log";
            b2Var.f22761o0 = g1Var;
        }
        b2Var.show();
        b2Var.getWindow().setSoftInputMode(3);
        final View viewD = b2Var.d(-1);
        viewD.setEnabled(false);
        r9Var.setOnRatingChangeListener(new t1(viewD));
        viewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                r9 r9Var2 = r9Var;
                int rating = r9Var2.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file4 = file3;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        r9Var2.setVisibility(8);
                        textView.setVisibility(8);
                        b2Var2.setTitle(LocaleController.getString(R.string.CallReportHint));
                        editTextBoldCursor2.setVisibility(0);
                        if (file4.exists()) {
                            y1Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) viewD).setText(LocaleController.getString(R.string.Send).toUpperCase());
                        return;
                    }
                }
                int i14 = UserConfig.selectedAccount;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = r9Var2.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < linearLayout2.getChildCount(); i15++) {
                    org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) linearLayout2.getChildAt(i15);
                    if (y1Var3.b()) {
                        arrayList.add("#" + y1Var3.getTag());
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
                tL_inputPhoneCall.access_hash = j11;
                tL_inputPhoneCall.f22445id = j10;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new di(i14, zArr2, file4, setcallrating, arrayList, context));
                b2Var2.dismiss();
            }
        });
    }

    public static void m(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 3) {
            g(null, chat, str, false, false, z10, bool, activity, n2Var, accountInstance);
            return;
        }
        boolean z11 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(z11 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(z11 ? R.string.VoipGroupOfflineAirplane : R.string.VoipGroupOffline);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z11) {
            Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new a2(activity, intent, 1));
            }
        }
        try {
            alertDialog$Builder.o();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void n(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, AccountInstance accountInstance) {
        if (accountInstance != null ? accountInstance.getMessagesController().isFrozen() : MessagesController.getInstance(UserConfig.selectedAccount).isFrozen()) {
            org.telegram.ui.b.b(accountInstance == null ? UserConfig.selectedAccount : accountInstance.getCurrentAccount());
            return;
        }
        if (userFull != null && userFull.phone_calls_private) {
            y4.l0(activity, accountInstance.getCurrentAccount(), user.f22527id);
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
            boolean z12 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f22702a.N = LocaleController.getString(z12 ? R.string.VoipOfflineAirplaneTitle : R.string.VoipOfflineTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(z12 ? R.string.VoipOfflineAirplane : R.string.VoipOffline);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new a2(activity, intent, 0));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            g(user, null, null, z10, z11, false, null, activity, null, accountInstance);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (z10 && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (arrayList.isEmpty()) {
            g(user, null, null, z10, z11, false, null, activity, null, accountInstance);
        } else {
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), z10 ? 102 : 101);
        }
    }
}
