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
import i7.f6;
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
import org.telegram.messenger.gi;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.x9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ky0;
import org.telegram.ui.r50;
import org.telegram.ui.th;
public abstract class h2 {
    public static long f33742a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
                String[] split = str.split(" ");
                if (split.length >= 2) {
                    String str2 = split[0];
                    if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.o2 o2Var, final AccountInstance accountInstance, boolean z14, boolean z15, boolean z16) {
        int i10;
        ChatObject.Call groupCall;
        TLRPC.ChatFull chatFull;
        int i11;
        int i12;
        TLRPC.ChatFull chatFull2;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user != null || chat != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f33742a;
                if (chat != null) {
                    i10 = 200;
                } else {
                    i10 = 2000;
                }
                if (elapsedRealtime >= i10) {
                    if (z14 && chat != null && !z13 && (chatFull2 = accountInstance.getMessagesController().getChatFull(chat.f22392id)) != null && (peer = chatFull2.groupcall_default_join_as) != null) {
                        final TLRPC.InputPeer inputPeer2 = accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(peer));
                        t70.t(activity, -chat.f22392id, accountInstance, new MessagesStorage.BooleanCallback() {
                            @Override
                            public final void run(boolean z17) {
                                String str2 = str;
                                Activity activity2 = activity;
                                TLRPC.Chat chat2 = chat;
                                TLRPC.User user2 = user;
                                TLRPC.InputPeer inputPeer3 = inputPeer2;
                                boolean z18 = z11;
                                boolean z19 = z12;
                                org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                                AccountInstance accountInstance2 = accountInstance;
                                if (!z17 && str2 != null) {
                                    f2 f2Var = new f2(activity2, chat2, user2, chat2, str2, inputPeer3, z18, z19, activity2, o2Var2, accountInstance2);
                                    if (o2Var2 != null) {
                                        o2Var2.showDialog(f2Var);
                                        return;
                                    }
                                    return;
                                }
                                h2.b(user2, chat2, str2, inputPeer3, !z17, z18, z19, false, activity2, o2Var2, accountInstance2, false, false, false);
                            }
                        });
                    } else if (z14 && chat != null) {
                        t70.u(activity, -chat.f22392id, accountInstance, o2Var, !z13 ? 1 : 0, null, new y1(z13, activity, accountInstance, chat, str, user, z11, z12, o2Var));
                    } else if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && ChatObject.shouldSendAnonymously(chat) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                        if (ChatObject.isChannelOrGiga(chat)) {
                            i11 = R.string.VoipChannelVoiceChat;
                        } else {
                            i11 = R.string.VoipGroupVoiceChat;
                        }
                        alertDialog$Builder.f22714a.N = LocaleController.getString(i11);
                        if (ChatObject.isChannelOrGiga(chat)) {
                            i12 = R.string.VoipChannelJoinAnonymouseAlert;
                        } else {
                            i12 = R.string.VoipGroupJoinAnonymouseAlert;
                        }
                        alertDialog$Builder.f22714a.P = LocaleController.getString(i12);
                        alertDialog$Builder.k(LocaleController.getString(R.string.VoipChatJoin), new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i13) {
                                h2.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, o2Var, accountInstance, false, false, false);
                            }
                        });
                        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                    } else {
                        if (chat != null && inputPeer != null && (chatFull = accountInstance.getMessagesController().getChatFull(chat.f22392id)) != null) {
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
                        if (chat != null && !z13 && (groupCall = accountInstance.getMessagesController().getGroupCall(chat.f22392id, false)) != null && groupCall.isScheduled()) {
                            r50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
                            return;
                        }
                        f33742a = SystemClock.elapsedRealtime();
                        Intent intent = new Intent(activity, VoIPService.class);
                        if (user != null) {
                            intent.putExtra("user_id", user.f22539id);
                        } else {
                            intent.putExtra("chat_id", chat.f22392id);
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
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                }
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
        File[] listFiles;
        File f9 = f();
        if (!BuildVars.DEBUG_VERSION && (listFiles = f9.listFiles()) != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
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
        if (z10) {
            return new File(f9, u3.c.k(str, "_stats.log")).getAbsolutePath();
        }
        return new File(f9, u3.c.k(str, ".log")).getAbsolutePath();
    }

    public static File f() {
        File file = new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void g(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        boolean z13;
        long j10;
        char c3;
        long j11;
        String str2;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4;
        if (activity != null) {
            if (user != null || chat != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (user != null) {
                        j10 = user.f22539id;
                    } else {
                        j10 = -chat.f22392id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j10 && sharedInstance.getAccount() == accountInstance.getCurrentAccount()) {
                        if (user == null && (activity instanceof LaunchActivity)) {
                            if (!TextUtils.isEmpty(str)) {
                                sharedInstance.setGroupCallHash(str);
                            }
                            r50.c1((LaunchActivity) activity, AccountInstance.getInstance(UserConfig.selectedAccount), null, null, false, null);
                            return;
                        }
                        Intent intent = new Intent(activity, LaunchActivity.class);
                        if (user != null) {
                            str4 = "voip";
                        } else {
                            str4 = "voip_chat";
                        }
                        activity.startActivity(intent.setAction(str4));
                        return;
                    }
                    if (sharedInstance.isConference()) {
                        StringBuilder sb2 = new StringBuilder();
                        if (sharedInstance.groupCall != null) {
                            int account = sharedInstance.getAccount();
                            int i13 = 0;
                            c3 = 1;
                            int i14 = 0;
                            j11 = 0;
                            while (true) {
                                if (i13 < sharedInstance.groupCall.participants.m()) {
                                    long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.n(i13)).peer);
                                    if (peerDialogId != UserConfig.getInstance(account).getClientUserId()) {
                                        i12 = i14 + 1;
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(DialogObject.getShortName(account, peerDialogId));
                                        if (i12 >= 2) {
                                            break;
                                        }
                                        i14 = i12;
                                    }
                                    i13++;
                                } else {
                                    i12 = i14;
                                    break;
                                }
                            }
                            if (i12 < sharedInstance.groupCall.participants.m() - 1) {
                                sb2.append(LocaleController.formatPluralString("AndOther", (sharedInstance.groupCall.participants.m() - 1) - i12, new Object[0]));
                            }
                        } else {
                            c3 = 1;
                            j11 = 0;
                        }
                        if (j10 > j11) {
                            i10 = R.string.VoipOngoingConferenceChatAlert;
                        } else {
                            i10 = R.string.VoipOngoingConferenceChatAlert2;
                        }
                        str2 = sb2.toString();
                    } else {
                        c3 = 1;
                        j11 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = ContactsController.formatName(user2.first_name, user2.last_name);
                            if (j10 > 0) {
                                i10 = R.string.VoipOngoingAlert;
                            } else {
                                i10 = R.string.VoipOngoingAlert2;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j10 > 0) {
                                i10 = R.string.VoipOngoingChatAlert2;
                            } else {
                                i10 = R.string.VoipOngoingChatAlert;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j11) {
                        i11 = R.string.VoipOngoingChatAlertTitle;
                    } else {
                        i11 = R.string.VoipOngoingAlertTitle;
                    }
                    String string = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c3] = str3;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr));
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new y1(user, chat, str, z10, z11, z12, activity, o2Var, accountInstance));
                    j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z13 = bool.booleanValue();
                    } else {
                        z13 = true;
                    }
                    b(user, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, z13, true, false);
                }
            }
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
        f33742a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, VoIPService.class);
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public static void i(Activity activity, Runnable runnable, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (i10 == 102) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") && (!z10 || activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        if (z10) {
            i11 = R.string.VoipNeedMicCameraPermissionWithHint;
        } else {
            i11 = R.string.VoipNeedMicPermissionWithHint;
        }
        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.Settings), new d2(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.f22714a.setOnDismissListener(new e2(0, runnable));
        if (z10) {
            i12 = R.raw.permission_request_camera;
        } else {
            i12 = R.raw.permission_request_microphone;
        }
        alertDialog$Builder.m(i12, 72, g6.w0(null, g6.L5, false), null);
        alertDialog$Builder.o();
    }

    public static void j(Activity activity) {
        final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        LinearLayout f9 = x3.f(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        textView.setTextColor(g6.w0(null, g6.f23169j5, false));
        f9.addView(textView, f6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final q8 q8Var = new q8(activity);
        q8Var.f("Force TCP", globalMainSettings.getBoolean("dbg_force_tcp_in_calls", false), false);
        q8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        SharedPreferences sharedPreferences = globalMainSettings;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("dbg_force_tcp_in_calls", z11);
                        edit.commit();
                        q8Var.setChecked(z11);
                        return;
                    case 1:
                        SharedPreferences sharedPreferences2 = globalMainSettings;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        edit2.putBoolean("dbg_dump_call_stats", z13);
                        edit2.commit();
                        q8Var.setChecked(z13);
                        return;
                    default:
                        SharedPreferences sharedPreferences3 = globalMainSettings;
                        boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        boolean z15 = !z14;
                        edit3.putBoolean("dbg_force_connection_service", z15);
                        edit3.commit();
                        q8Var.setChecked(z15);
                        return;
                }
            }
        });
        f9.addView(q8Var);
        if (BuildVars.DEBUG_VERSION && BuildVars.LOGS_ENABLED) {
            final q8 q8Var2 = new q8(activity);
            q8Var2.f("Dump detailed stats", globalMainSettings.getBoolean("dbg_dump_call_stats", false), false);
            q8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            q8Var2.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            q8Var2.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            q8Var2.setChecked(z15);
                            return;
                    }
                }
            });
            f9.addView(q8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final q8 q8Var3 = new q8(activity);
            q8Var3.f("Enable ConnectionService", globalMainSettings.getBoolean("dbg_force_connection_service", false), false);
            q8Var3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = globalMainSettings;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            q8Var3.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = globalMainSettings;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            q8Var3.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = globalMainSettings;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            q8Var3.setChecked(z15);
                            return;
                    }
                }
            });
            f9.addView(q8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DebugMenuCallSettings);
        alertDialog$Builder.n(f9);
        alertDialog$Builder.o();
    }

    public static void k(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : MessagesController.getNotificationsSettings(UserConfig.selectedAccount).getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        l(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), UserConfig.selectedAccount, true);
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
            for (String str2 : list) {
                if (str2.endsWith("voip" + j10 + ".txt")) {
                    file = new File(file2, str2);
                    break;
                }
            }
        }
        file = new File(f(), j10 + ".log");
        final File file3 = file;
        final int[] iArr = {0};
        int i11 = 1;
        LinearLayout g10 = x3.g(context, 1);
        int dp = AndroidUtilities.dp(16.0f);
        g10.setPadding(dp, dp, dp, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        th.s(g6.f23169j5, null, false, textView, 17);
        textView.setText(LocaleController.getString(R.string.VoipRateCallAlert));
        g10.addView(textView);
        final ?? view = new View(context);
        view.f34655c = new Paint();
        view.d = 5;
        view.f34656e = 0;
        view.f34653a = BitmapFactory.decodeResource(view.getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        view.f34654b = BitmapFactory.decodeResource(view.getResources(), R.drawable.ic_rating_star).extractAlpha();
        g10.addView((View) view, f6.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bg.n nVar = new bg.n(18);
        String[] strArr = {z10 ? "distorted_video" : null, z10 ? "pixelated_video" : null, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i12 = 0;
        while (i12 < 9) {
            if (strArr[i12] != null) {
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, i11);
                y1Var.setClipToPadding(false);
                y1Var.setTag(strArr[i12]);
                switch (i12) {
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
                y1Var.setOnClickListener(nVar);
                y1Var.setTag(strArr[i12]);
                linearLayout.addView(y1Var);
            }
            i12++;
            i11 = 1;
        }
        g10.addView(linearLayout, f6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipFeedbackCommentHint));
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setTextColor(g6.w0(null, g6.f23169j5, false));
        editTextBoldCursor.setHintTextColor(g6.w0(null, g6.f23345t5, false));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(g6.w0(null, g6.f23364u5, false), g6.w0(null, g6.f23382v5, false), g6.w0(null, g6.f23295q7, false));
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        g10.addView(editTextBoldCursor, f6.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, 1);
        fi0 fi0Var = new fi0(13, zArr, y1Var2);
        y1Var2.e(LocaleController.getString(R.string.CallReportIncludeLogs), null, true, false, false);
        y1Var2.setClipToPadding(false);
        y1Var2.setOnClickListener(fi0Var);
        g10.addView(y1Var2, f6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.f23310r5, false));
        textView2.setPadding(org.telegram.ui.b.e(8.0f, R.string.CallReportLogsExplain, textView2), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setOnClickListener(fi0Var);
        g10.addView(textView2);
        y1Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file3.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.CallMessageReportProblem);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Send), new eg.c(0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22714a.setOnDismissListener(new e2(1, ky0Var));
        final org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        if (BuildVars.LOGS_ENABLED && file3.exists()) {
            org.telegram.ui.Components.j1 j1Var = new org.telegram.ui.Components.j1(29, context, file3);
            c2Var.f22796n0 = "Send log";
            c2Var.f22797o0 = j1Var;
        }
        c2Var.show();
        c2Var.getWindow().setSoftInputMode(3);
        final View d = c2Var.d(-1);
        d.setEnabled(false);
        view.setOnRatingChangeListener(new u1(d));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                org.telegram.ui.Cells.y1 y1Var3;
                x9 x9Var = x9.this;
                int rating = x9Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file4 = file3;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        x9Var.setVisibility(8);
                        textView.setVisibility(8);
                        c2Var2.setTitle(LocaleController.getString(R.string.CallReportHint));
                        editTextBoldCursor2.setVisibility(0);
                        if (file4.exists()) {
                            y1Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(LocaleController.getString(R.string.Send).toUpperCase());
                        return;
                    }
                }
                int i13 = UserConfig.selectedAccount;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = x9Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < linearLayout2.getChildCount(); i14++) {
                    if (((org.telegram.ui.Cells.y1) linearLayout2.getChildAt(i14)).b()) {
                        arrayList.add("#" + y1Var3.getTag());
                    }
                }
                if (setcallrating.rating < 5) {
                    setcallrating.comment = editTextBoldCursor2.getText().toString();
                } else {
                    setcallrating.comment = "";
                }
                boolean isEmpty = arrayList.isEmpty();
                boolean[] zArr2 = zArr;
                if (!isEmpty && !zArr2[0]) {
                    setcallrating.comment += " " + TextUtils.join(" ", arrayList);
                }
                TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                setcallrating.peer = tL_inputPhoneCall;
                tL_inputPhoneCall.access_hash = j11;
                tL_inputPhoneCall.f22457id = j10;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new gi(i13, zArr2, file4, setcallrating, arrayList, context));
                c2Var2.dismiss();
            }
        });
    }

    public static void m(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        int i10;
        int i11;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
            boolean z11 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z11 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z11) {
                i10 = R.string.VoipOfflineAirplaneTitle;
            } else {
                i10 = R.string.VoipOfflineTitle;
            }
            alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
            if (z11) {
                i11 = R.string.VoipGroupOfflineAirplane;
            } else {
                i11 = R.string.VoipGroupOffline;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            if (z11) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new c2(activity, intent, 1));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        g(null, chat, str, false, false, z10, bool, activity, o2Var, accountInstance);
    }

    public static void n(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, AccountInstance accountInstance) {
        int currentAccount;
        int i10;
        int i11;
        int i12;
        if (accountInstance != null ? accountInstance.getMessagesController().isFrozen() : MessagesController.getInstance(UserConfig.selectedAccount).isFrozen()) {
            if (accountInstance == null) {
                currentAccount = UserConfig.selectedAccount;
            } else {
                currentAccount = accountInstance.getCurrentAccount();
            }
            org.telegram.ui.c.b(currentAccount);
        } else if (userFull != null && userFull.phone_calls_private) {
            c5.l0(activity, accountInstance.getCurrentAccount(), user.f22539id);
        } else {
            boolean z12 = false;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() != 3) {
                if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                    z12 = true;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                if (z12) {
                    i11 = R.string.VoipOfflineAirplaneTitle;
                } else {
                    i11 = R.string.VoipOfflineTitle;
                }
                alertDialog$Builder.f22714a.N = LocaleController.getString(i11);
                if (z12) {
                    i12 = R.string.VoipOfflineAirplane;
                } else {
                    i12 = R.string.VoipOffline;
                }
                alertDialog$Builder.f22714a.P = LocaleController.getString(i12);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                if (z12) {
                    Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                    if (intent.resolveActivity(activity.getPackageManager()) != null) {
                        alertDialog$Builder.i(LocaleController.getString(R.string.VoipOfflineOpenSettings), new c2(activity, intent, 0));
                    }
                }
                try {
                    alertDialog$Builder.o();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                ArrayList arrayList = new ArrayList();
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                if (z10 && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    arrayList.add("android.permission.CAMERA");
                }
                if (arrayList.isEmpty()) {
                    g(user, null, null, z10, z11, false, null, activity, null, accountInstance);
                    return;
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (z10) {
                    i10 = 102;
                } else {
                    i10 = 101;
                }
                activity.requestPermissions(strArr, i10);
            } else {
                g(user, null, null, z10, z11, false, null, activity, null, accountInstance);
            }
        }
    }
}
