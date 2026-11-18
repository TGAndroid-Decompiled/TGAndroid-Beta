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
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gx;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.t3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.u9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f40;
import org.telegram.ui.ru0;
public abstract class b2 {
    public static long f40780a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : mp.u1(j10.f24770t0).f25658g7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.h2 h2Var, final org.telegram.messenger.c cVar, boolean z14, boolean z15, boolean z16) {
        t3 i12;
        TLRPC.ChatFull P0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull P02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - f40780a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (P02 = mp.u1(cVar.f23218a).P0(chat.f28403id)) != null && (peer = P02.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer l1 = mp.u1(cVar.f23218a).l1(fj.B1(peer));
                g70.K0(activity, -chat.f28403id, cVar, new lr() {
                    @Override
                    public final void d(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer2 = l1;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                        org.telegram.messenger.c cVar2 = cVar;
                        if (!z17 && str2 != null) {
                            z1 z1Var = new z1(activity2, chat2, user2, chat2, str2, inputPeer2, z18, z19, activity2, h2Var2, cVar2);
                            if (h2Var2 != null) {
                                h2Var2.showDialog(z1Var);
                                return;
                            }
                            return;
                        }
                        b2.b(user2, chat2, str2, inputPeer2, !z17, z18, z19, false, activity2, h2Var2, cVar2, false, false, false);
                    }
                });
            } else if (z14 && chat != null) {
                g70.L0(activity, -chat.f28403id, cVar, h2Var, !z13 ? 1 : 0, null, new u1(z13, activity, cVar, chat, str, user, z11, z12, h2Var));
            } else if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!v3.T(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = gd.M0(v3.W(chat) ? 2131743210 : 2131743069, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(v3.W(chat) ? 2131743240 : 2131743132, null);
                alertDialog$Builder.k(gd.M0(2131743205, null), new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                        b2.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, h2Var, cVar, false, false, false);
                    }
                });
                i5.c.y(null, 2131752578, alertDialog$Builder, null);
            } else {
                if (chat != null && inputPeer != null && (P0 = mp.u1(cVar.f23218a).P0(chat.f28403id)) != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        P0.groupcall_default_join_as = tL_peerUser;
                        tL_peerUser.user_id = inputPeer.user_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        P0.groupcall_default_join_as = tL_peerChat;
                        tL_peerChat.chat_id = inputPeer.chat_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        P0.groupcall_default_join_as = tL_peerChannel;
                        tL_peerChannel.channel_id = inputPeer.channel_id;
                    }
                    if (P0 instanceof TLRPC.TL_chatFull) {
                        P0.flags |= 32768;
                    } else {
                        P0.flags |= 67108864;
                    }
                }
                if (chat != null && !z13 && (i12 = mp.u1(cVar.f23218a).i1(chat.f28403id, false, null)) != null && i12.j()) {
                    f40.f1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
                    return;
                }
                f40780a = SystemClock.elapsedRealtime();
                Intent intent = new Intent(activity, VoIPService.class);
                if (user != null) {
                    intent.putExtra("user_id", user.f28552id);
                } else {
                    intent.putExtra("chat_id", chat.f28403id);
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
                intent.putExtra("account", j10.f24770t0);
                try {
                    activity.startService(intent);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static int c() {
        boolean z10 = a6.q(0).K.f28267f;
        boolean z11 = a6.q(0).L.f28267f;
        boolean z12 = a6.q(0).M.f28267f;
        if (z10 || z11 || z12) {
            if (z10 && !z11 && !z12) {
                return 3;
            }
            if (z10 && z11 && !z12) {
                return 1;
            }
            if (z10 && z11 && z12) {
                return 2;
            }
            if (org.telegram.messenger.s2.f26721a) {
                a8.l("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(org.telegram.messenger.t0.f26913b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(org.telegram.messenger.t0.f26913b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z10 = org.telegram.messenger.s2.f26721a;
        return new File(file, p5.c.v(str, "_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.c cVar) {
        boolean z13;
        long j3;
        org.telegram.messenger.c cVar2;
        char c10;
        long j10;
        String str2;
        int i7;
        String str3;
        int i10;
        String str4;
        if (activity != null) {
            if (user != null || chat != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (user != null) {
                        j3 = user.f28552id;
                    } else {
                        j3 = -chat.f28403id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j3) {
                        cVar2 = cVar;
                        if (sharedInstance.getAccount() == cVar2.f23218a) {
                            if (user == null && (activity instanceof LaunchActivity)) {
                                if (!TextUtils.isEmpty(str)) {
                                    sharedInstance.setGroupCallHash(str);
                                }
                                f40.f1((LaunchActivity) activity, org.telegram.messenger.c.a(j10.f24770t0), null, null, false, null);
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
                    } else {
                        cVar2 = cVar;
                    }
                    if (sharedInstance.isConference()) {
                        StringBuilder sb2 = new StringBuilder();
                        c10 = 1;
                        if (sharedInstance.groupCall != null) {
                            int account = sharedInstance.getAccount();
                            int i11 = 0;
                            int i12 = 0;
                            j10 = 0;
                            while (i11 < sharedInstance.groupCall.d.m()) {
                                int i13 = i11;
                                long o4 = n5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i11)).peer);
                                if (o4 != j10.i(account).e()) {
                                    i12++;
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(n5.s(account, o4));
                                    if (i12 >= 2) {
                                        break;
                                    }
                                }
                                i11 = i13 + 1;
                            }
                            if (i12 < sharedInstance.groupCall.d.m() - 1) {
                                sb2.append(gd.G((sharedInstance.groupCall.d.m() - 1) - i12, "AndOther", new Object[0]));
                            }
                        } else {
                            j10 = 0;
                        }
                        if (j3 > j10) {
                            i7 = 2131743030;
                        } else {
                            i7 = 2131743029;
                        }
                        str2 = sb2.toString();
                    } else {
                        c10 = 1;
                        j10 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = i5.m(0, user2.first_name, user2.last_name);
                            if (j3 > 0) {
                                i7 = 2131743036;
                            } else {
                                i7 = 2131743035;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j3 > 0) {
                                i7 = 2131743032;
                            } else {
                                i7 = 2131743033;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = i5.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j10) {
                        i10 = 2131743031;
                    } else {
                        i10 = 2131743034;
                    }
                    String M0 = gd.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c10] = str3;
                    u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, objArr));
                    alertDialog$Builder.k(gd.M0(2131747638, null), new u1(user, chat, str, z10, z11, z12, activity, h2Var, cVar2));
                    i5.c.y(null, 2131752578, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z13 = bool.booleanValue();
                    } else {
                        z13 = true;
                    }
                    b(user, chat, str, null, false, z10, z11, z12, activity, h2Var, cVar, z13, true, false);
                }
            }
        }
    }

    public static void g(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new oi.o2(activity, i7, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        f40780a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i10 = 0;
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
                jArr[i10] = ((Long) it.next()).longValue();
                i10++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i7);
        intent.putExtra("video_call", z10);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i7) {
        boolean z10;
        int i10;
        int i11;
        if (i7 == 102) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") && (!z10 || activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        if (z10) {
            i10 = 2131743047;
        } else {
            i10 = 2131743046;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(i10, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.U = W2;
        alertDialog$Builder.k(gd.M0(2131745300, null), new ki.n0(activity, 1));
        alertDialog$Builder.h(gd.M0(2131751761, null), null);
        u1Var.setOnDismissListener(new org.telegram.ui.ActionBar.l2(1, runnable));
        if (z10) {
            i11 = 2131624117;
        } else {
            i11 = 2131624121;
        }
        int i12 = n6.L5;
        alertDialog$Builder.m(i11, 72, n6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    public static void i(Activity activity) {
        final SharedPreferences g12 = mp.g1();
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        u6.U(textView, n6.f29502j5, null);
        f10.addView(textView, ma.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final s8 s8Var = new s8(activity);
        s8Var.f("Force TCP", g12.getBoolean("dbg_force_tcp_in_calls", false), false);
        s8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        SharedPreferences sharedPreferences = g12;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("dbg_force_tcp_in_calls", z11);
                        edit.commit();
                        s8Var.setChecked(z11);
                        return;
                    case 1:
                        SharedPreferences sharedPreferences2 = g12;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        edit2.putBoolean("dbg_dump_call_stats", z13);
                        edit2.commit();
                        s8Var.setChecked(z13);
                        return;
                    default:
                        SharedPreferences sharedPreferences3 = g12;
                        boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        boolean z15 = !z14;
                        edit3.putBoolean("dbg_force_connection_service", z15);
                        edit3.commit();
                        s8Var.setChecked(z15);
                        return;
                }
            }
        });
        f10.addView(s8Var);
        if (org.telegram.messenger.s2.f26721a) {
            final s8 s8Var2 = new s8(activity);
            s8Var2.f("Dump detailed stats", g12.getBoolean("dbg_dump_call_stats", false), false);
            s8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = g12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            s8Var2.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = g12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            s8Var2.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = g12;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            s8Var2.setChecked(z15);
                            return;
                    }
                }
            });
            f10.addView(s8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final s8 s8Var3 = new s8(activity);
            s8Var3.f("Enable ConnectionService", g12.getBoolean("dbg_force_connection_service", false), false);
            s8Var3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = g12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            s8Var3.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = g12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            s8Var3.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = g12;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            s8Var3.setChecked(z15);
                            return;
                    }
                }
            });
            f10.addView(s8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f28744a.S = gd.M0(2131751634, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.p();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : mp.u1(j10.f24770t0).f25658g7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), j10.f24770t0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, ru0 ru0Var, boolean z10, final long j3, final long j10, final int i7, final boolean z11) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z12 = org.telegram.messenger.s2.f26721a;
        File file2 = new File(org.telegram.messenger.t0.f26913b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j3 + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(org.telegram.messenger.t0.f26913b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j3 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i10 = 1;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        g10.setPadding(L, L, L, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        u6.U(textView, n6.f29502j5, null);
        org.telegram.messenger.f3.k(textView, 17, null, 2131743019);
        g10.addView(textView);
        final ?? view = new View(context);
        view.f40269c = new Paint();
        view.d = 5;
        view.f40270e = 0;
        view.f40267a = BitmapFactory.decodeResource(view.getResources(), 2131231458).extractAlpha();
        view.f40268b = BitmapFactory.decodeResource(view.getResources(), 2131231457).extractAlpha();
        g10.addView((View) view, ma.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bi.o oVar = new bi.o(18);
        if (z10) {
            str = "distorted_video";
        } else {
            str = null;
        }
        if (z10) {
            str2 = "pixelated_video";
        } else {
            str2 = null;
        }
        String[] strArr = {str, str2, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i11 = 0;
        while (i11 < 9) {
            if (strArr[i11] != null) {
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, i10);
                d2Var.setClipToPadding(false);
                d2Var.setTag(strArr[i11]);
                switch (i11) {
                    case 0:
                        M0 = gd.M0(2131746221, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = gd.M0(2131746220, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = gd.M0(2131746226, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = gd.M0(2131746224, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = gd.M0(2131746225, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = gd.M0(2131746228, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = gd.M0(2131746223, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = gd.M0(2131746222, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = gd.M0(2131746227, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                d2Var.e(str3, null, false, false, false);
                d2Var.setOnClickListener(oVar);
                d2Var.setTag(strArr[i11]);
                linearLayout.addView(d2Var);
            }
            i11++;
            i10 = 1;
        }
        g10.addView(linearLayout, ma.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(gd.M0(2131743170, null));
        editTextBoldCursor.setInputType(147457);
        u6.U(editTextBoldCursor, n6.f29502j5, null);
        u6.D(editTextBoldCursor, n6.f29690t5, null);
        editTextBoldCursor.setBackground(null);
        u6.F(editTextBoldCursor, n6.f29709u5, n6.f29728v5, n6.f29635q7, null);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        g10.addView(editTextBoldCursor, ma.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context, 1);
        c31 c31Var = new c31(7, zArr, d2Var2);
        d2Var2.e(gd.M0(2131752593, null), null, true, false, false);
        d2Var2.setClipToPadding(false);
        d2Var2.setOnClickListener(c31Var);
        g10.addView(d2Var2, ma.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        n10.r(textView2, n6.f29652r5, null, null, 2131752592);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setOnClickListener(c31Var);
        g10.addView(textView2);
        d2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f28744a.S = gd.M0(2131752603, null);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.M0(2131745445, null), new ug.x(17));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.f28744a.setOnDismissListener(new org.telegram.ui.ActionBar.l2(2, ru0Var));
        final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        if (org.telegram.messenger.s2.f26721a && file4.exists()) {
            org.telegram.ui.Components.g2 g2Var = new org.telegram.ui.Components.g2(26, context, file4);
            u1Var.f30059s0 = "Send log";
            u1Var.f30060t0 = g2Var;
        }
        u1Var.show();
        u1Var.getWindow().setSoftInputMode(3);
        final View d = u1Var.d(-1);
        d.setEnabled(false);
        view.setOnRatingChangeListener(new r1(d));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                org.telegram.ui.Cells.d2 d2Var3;
                u9 u9Var = u9.this;
                int rating = u9Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        u9Var.setVisibility(8);
                        textView.setVisibility(8);
                        u1Var2.setTitle(gd.M0(2131752594, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            d2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(gd.M0(2131745445, null).toUpperCase());
                        return;
                    }
                }
                int i12 = j10.f24770t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = u9Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < linearLayout2.getChildCount(); i13++) {
                    if (((org.telegram.ui.Cells.d2) linearLayout2.getChildAt(i13)).b()) {
                        arrayList.add("#" + d2Var3.getTag());
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
                tL_inputPhoneCall.access_hash = j10;
                tL_inputPhoneCall.f28468id = j3;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i7).sendRequest(setcallrating, new gx(i12, zArr2, file5, setcallrating, arrayList, context));
                u1Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.c cVar) {
        int i7;
        int i10;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(j10.f24770t0).getConnectionState() != 3) {
            boolean z11 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z11 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z11) {
                i7 = 2131743039;
            } else {
                i7 = 2131743037;
            }
            String M0 = gd.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            if (z11) {
                i10 = 2131743118;
            } else {
                i10 = 2131743119;
            }
            u1Var.U = gd.M0(i10, null);
            alertDialog$Builder.k(gd.M0(2131747638, null), null);
            if (z11) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(gd.M0(2131743038, null), new y1(activity, intent, 1));
                }
            }
            try {
                alertDialog$Builder.p();
                return;
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        f(null, chat, str, false, false, z10, bool, activity, h2Var, cVar);
    }

    public static void m(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, org.telegram.messenger.c cVar) {
        int i7;
        int i10;
        boolean z12;
        int i11;
        int i12;
        if (cVar != null ? mp.u1(cVar.f23218a).A2() : mp.u1(j10.f24770t0).A2()) {
            if (cVar == null) {
                i7 = j10.f24770t0;
            } else {
                i7 = cVar.f23218a;
            }
            org.telegram.ui.b.b(i7);
        } else if (userFull != null && userFull.phone_calls_private) {
            b5.i0(activity, cVar.f23218a, user.f28552id);
        } else if (ConnectionsManager.getInstance(j10.f24770t0).getConnectionState() != 3) {
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z12) {
                i11 = 2131743039;
            } else {
                i11 = 2131743037;
            }
            String M0 = gd.M0(i11, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            if (z12) {
                i12 = 2131743040;
            } else {
                i12 = 2131743041;
            }
            u1Var.U = gd.M0(i12, null);
            alertDialog$Builder.k(gd.M0(2131747638, null), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(gd.M0(2131743038, null), new y1(activity, intent, 0));
                }
            }
            try {
                alertDialog$Builder.p();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (z10 && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (arrayList.isEmpty()) {
                f(user, null, null, z10, z11, false, null, activity, null, cVar);
                return;
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (z10) {
                i10 = 102;
            } else {
                i10 = 101;
            }
            activity.requestPermissions(strArr, i10);
        }
    }
}
