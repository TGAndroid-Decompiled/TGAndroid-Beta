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
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.gx;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.r3;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pu0;
import org.telegram.ui.x30;
public abstract class n1 {
    public static long f39494a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : hp.s1(h10.f22829t0).f22989d7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.d2 d2Var, final org.telegram.messenger.c cVar, boolean z14, boolean z15, boolean z16) {
        r3 g12;
        TLRPC.ChatFull N0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull N02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - f39494a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (N02 = hp.s1(cVar.f21919a).N0(chat.f27001id)) != null && (peer = N02.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer j12 = hp.s1(cVar.f21919a).j1(zi.C1(peer));
                o60.J0(activity, -chat.f27001id, cVar, new ir() {
                    @Override
                    public final void o(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer2 = j12;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        org.telegram.messenger.c cVar2 = cVar;
                        if (!z17 && str2 != null) {
                            l1 l1Var = new l1(activity2, chat2, user2, chat2, str2, inputPeer2, z18, z19, activity2, d2Var2, cVar2);
                            if (d2Var2 != null) {
                                d2Var2.showDialog(l1Var);
                                return;
                            }
                            return;
                        }
                        n1.b(user2, chat2, str2, inputPeer2, !z17, z18, z19, false, activity2, d2Var2, cVar2, false, false, false);
                    }
                });
            } else if (z14 && chat != null) {
                o60.K0(activity, -chat.f27001id, cVar, d2Var, !z13 ? 1 : 0, null, new g1(z13, activity, cVar, chat, str, user, z11, z12, d2Var));
            } else if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!t3.T(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = bd.M0(t3.W(chat) ? 2131743457 : 2131743316, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(t3.W(chat) ? 2131743487 : 2131743379, null);
                alertDialog$Builder.k(bd.M0(2131743452, null), new org.telegram.ui.ActionBar.p1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                        n1.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, d2Var, cVar, false, false, false);
                    }
                });
                k2.p1.v(null, 2131752589, alertDialog$Builder, null);
            } else {
                if (chat != null && inputPeer != null && (N0 = hp.s1(cVar.f21919a).N0(chat.f27001id)) != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        N0.groupcall_default_join_as = tL_peerUser;
                        tL_peerUser.user_id = inputPeer.user_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        N0.groupcall_default_join_as = tL_peerChat;
                        tL_peerChat.chat_id = inputPeer.chat_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        N0.groupcall_default_join_as = tL_peerChannel;
                        tL_peerChannel.channel_id = inputPeer.channel_id;
                    }
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                if (chat != null && !z13 && (g12 = hp.s1(cVar.f21919a).g1(chat.f27001id, false, null)) != null && g12.j()) {
                    x30.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
                    return;
                }
                f39494a = SystemClock.elapsedRealtime();
                Intent intent = new Intent(activity, VoIPService.class);
                if (user != null) {
                    intent.putExtra("user_id", user.f27150id);
                } else {
                    intent.putExtra("chat_id", chat.f27001id);
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
                intent.putExtra("account", h10.f22829t0);
                try {
                    activity.startService(intent);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static int c() {
        boolean z10 = z5.q(0).K.f26528f;
        boolean z11 = z5.q(0).L.f26528f;
        boolean z12 = z5.q(0).M.f26528f;
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
            if (org.telegram.messenger.r2.f25040a) {
                a8.l("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(org.telegram.messenger.t0.f25457b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(org.telegram.messenger.t0.f25457b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z10 = org.telegram.messenger.r2.f25040a;
        return new File(file, t4.c.q(str, "_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar) {
        boolean z13;
        long j10;
        org.telegram.messenger.c cVar2;
        char c2;
        long j11;
        String str2;
        int i3;
        String str3;
        int i10;
        String str4;
        if (activity != null) {
            if (user != null || chat != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (user != null) {
                        j10 = user.f27150id;
                    } else {
                        j10 = -chat.f27001id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j10) {
                        cVar2 = cVar;
                        if (sharedInstance.getAccount() == cVar2.f21919a) {
                            if (user == null && (activity instanceof LaunchActivity)) {
                                if (!TextUtils.isEmpty(str)) {
                                    sharedInstance.setGroupCallHash(str);
                                }
                                x30.e1((LaunchActivity) activity, org.telegram.messenger.c.a(h10.f22829t0), null, null, false, null);
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
                        c2 = 1;
                        if (sharedInstance.groupCall != null) {
                            int account = sharedInstance.getAccount();
                            int i11 = 0;
                            int i12 = 0;
                            j11 = 0;
                            while (i11 < sharedInstance.groupCall.d.m()) {
                                int i13 = i11;
                                long o10 = m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i11)).peer);
                                if (o10 != h10.i(account).e()) {
                                    i12++;
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(m5.s(account, o10));
                                    if (i12 >= 2) {
                                        break;
                                    }
                                }
                                i11 = i13 + 1;
                            }
                            if (i12 < sharedInstance.groupCall.d.m() - 1) {
                                sb2.append(bd.G((sharedInstance.groupCall.d.m() - 1) - i12, "AndOther", new Object[0]));
                            }
                        } else {
                            j11 = 0;
                        }
                        if (j10 > j11) {
                            i3 = 2131743277;
                        } else {
                            i3 = 2131743276;
                        }
                        str2 = sb2.toString();
                    } else {
                        c2 = 1;
                        j11 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = g5.m(0, user2.first_name, user2.last_name);
                            if (j10 > 0) {
                                i3 = 2131743283;
                            } else {
                                i3 = 2131743282;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j10 > 0) {
                                i3 = 2131743279;
                            } else {
                                i3 = 2131743280;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = g5.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j11) {
                        i10 = 2131743278;
                    } else {
                        i10 = 2131743281;
                    }
                    String M0 = bd.M0(i10, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c2] = str3;
                    s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, i3, objArr));
                    alertDialog$Builder.k(bd.M0(2131747839, null), new g1(user, chat, str, z10, z11, z12, activity, d2Var, cVar2));
                    k2.p1.v(null, 2131752589, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z13 = bool.booleanValue();
                    } else {
                        z13 = true;
                    }
                    b(user, chat, str, null, false, z10, z11, z12, activity, d2Var, cVar, z13, true, false);
                }
            }
        }
    }

    public static void g(Activity activity, int i3, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new mi.q2(activity, i3, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        f39494a = SystemClock.elapsedRealtime();
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
        intent.putExtra("account", i3);
        intent.putExtra("video_call", z10);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i3) {
        boolean z10;
        int i10;
        int i11;
        if (i3 == 102) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") && (!z10 || activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        if (z10) {
            i10 = 2131743294;
        } else {
            i10 = 2131743293;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(i10, null));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = X2;
        alertDialog$Builder.k(bd.M0(2131745505, null), new ii.n0(activity, 1));
        alertDialog$Builder.h(bd.M0(2131751772, null), null);
        s1Var.setOnDismissListener(new org.telegram.ui.ActionBar.h2(1, runnable));
        if (z10) {
            i11 = 2131624116;
        } else {
            i11 = 2131624120;
        }
        int i12 = k6.L5;
        alertDialog$Builder.m(i11, 72, k6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    public static void i(Activity activity) {
        final SharedPreferences e12 = hp.e1();
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        r6.V(textView, k6.f27988j5, null);
        e10.addView(textView, mf.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final q8 q8Var = new q8(activity);
        q8Var.f("Force TCP", e12.getBoolean("dbg_force_tcp_in_calls", false), false);
        q8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        SharedPreferences sharedPreferences = e12;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("dbg_force_tcp_in_calls", z11);
                        edit.commit();
                        q8Var.setChecked(z11);
                        return;
                    case 1:
                        SharedPreferences sharedPreferences2 = e12;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        edit2.putBoolean("dbg_dump_call_stats", z13);
                        edit2.commit();
                        q8Var.setChecked(z13);
                        return;
                    default:
                        SharedPreferences sharedPreferences3 = e12;
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
        e10.addView(q8Var);
        if (org.telegram.messenger.r2.f25040a) {
            final q8 q8Var2 = new q8(activity);
            q8Var2.f("Dump detailed stats", e12.getBoolean("dbg_dump_call_stats", false), false);
            q8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = e12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            q8Var2.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = e12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            q8Var2.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = e12;
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
            e10.addView(q8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final q8 q8Var3 = new q8(activity);
            q8Var3.f("Enable ConnectionService", e12.getBoolean("dbg_force_connection_service", false), false);
            q8Var3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = e12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            q8Var3.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = e12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            q8Var3.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = e12;
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
            e10.addView(q8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f27343a.S = bd.M0(2131751646, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.p();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : hp.s1(h10.f22829t0).f22989d7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), h10.f22829t0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, pu0 pu0Var, boolean z10, final long j10, final long j11, final int i3, final boolean z11) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z12 = org.telegram.messenger.r2.f25040a;
        File file2 = new File(org.telegram.messenger.t0.f25457b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j10 + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(org.telegram.messenger.t0.f25457b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j10 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i10 = 1;
        LinearLayout f10 = k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        f10.setPadding(L, L, L, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        r6.V(textView, k6.f27988j5, null);
        k5.m(textView, 17, null, 2131743266);
        f10.addView(textView);
        final ?? view = new View(context);
        view.f36784c = new Paint();
        view.d = 5;
        view.f36785e = 0;
        view.f36782a = BitmapFactory.decodeResource(view.getResources(), 2131231458).extractAlpha();
        view.f36783b = BitmapFactory.decodeResource(view.getResources(), 2131231457).extractAlpha();
        f10.addView((View) view, mf.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ai.t tVar = new ai.t(19);
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
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, i10);
                c2Var.setClipToPadding(false);
                c2Var.setTag(strArr[i11]);
                switch (i11) {
                    case 0:
                        M0 = bd.M0(2131746424, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = bd.M0(2131746423, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = bd.M0(2131746429, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = bd.M0(2131746427, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = bd.M0(2131746428, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = bd.M0(2131746431, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = bd.M0(2131746426, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = bd.M0(2131746425, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = bd.M0(2131746430, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                c2Var.e(str3, null, false, false, false);
                c2Var.setOnClickListener(tVar);
                c2Var.setTag(strArr[i11]);
                linearLayout.addView(c2Var);
            }
            i11++;
            i10 = 1;
        }
        f10.addView(linearLayout, mf.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(bd.M0(2131743417, null));
        editTextBoldCursor.setInputType(147457);
        r6.V(editTextBoldCursor, k6.f27988j5, null);
        r6.E(editTextBoldCursor, k6.f28176t5, null);
        editTextBoldCursor.setBackground(null);
        r6.G(editTextBoldCursor, k6.f28195u5, k6.f28213v5, k6.f28122q7, null);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        f10.addView(editTextBoldCursor, mf.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 1);
        ux0 ux0Var = new ux0(9, (KeyEvent.Callback) c2Var2, (Object) zArr);
        c2Var2.e(bd.M0(2131752604, null), null, true, false, false);
        c2Var2.setClipToPadding(false);
        c2Var2.setOnClickListener(ux0Var);
        f10.addView(c2Var2, mf.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, k6.r5, null, null, 2131752603);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setOnClickListener(ux0Var);
        f10.addView(textView2);
        c2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f27343a.S = bd.M0(2131752614, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131745650, null), new u9.j(20));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.f27343a.setOnDismissListener(new org.telegram.ui.ActionBar.h2(2, pu0Var));
        final org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (org.telegram.messenger.r2.f25040a && file4.exists()) {
            i41 i41Var = new i41(3, context, file4);
            s1Var.f28561u0 = "Send log";
            s1Var.f28562v0 = i41Var;
        }
        s1Var.show();
        s1Var.getWindow().setSoftInputMode(3);
        final View d = s1Var.d(-1);
        d.setEnabled(false);
        view.setOnRatingChangeListener(new d1(d));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                org.telegram.ui.Cells.c2 c2Var3;
                o9 o9Var = o9.this;
                int rating = o9Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        o9Var.setVisibility(8);
                        textView.setVisibility(8);
                        s1Var2.setTitle(bd.M0(2131752605, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            c2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(bd.M0(2131745650, null).toUpperCase());
                        return;
                    }
                }
                int i12 = h10.f22829t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = o9Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < linearLayout2.getChildCount(); i13++) {
                    if (((org.telegram.ui.Cells.c2) linearLayout2.getChildAt(i13)).b()) {
                        arrayList.add("#" + c2Var3.getTag());
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
                tL_inputPhoneCall.f27066id = j10;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i3).sendRequest(setcallrating, new gx(i12, zArr2, file5, setcallrating, arrayList, context));
                s1Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar) {
        int i3;
        int i10;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(h10.f22829t0).getConnectionState() != 3) {
            boolean z11 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z11 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z11) {
                i3 = 2131743286;
            } else {
                i3 = 2131743284;
            }
            String M0 = bd.M0(i3, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (z11) {
                i10 = 2131743365;
            } else {
                i10 = 2131743366;
            }
            s1Var.U = bd.M0(i10, null);
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            if (z11) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(bd.M0(2131743285, null), new k1(activity, intent, 1));
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
        f(null, chat, str, false, false, z10, bool, activity, d2Var, cVar);
    }

    public static void m(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, org.telegram.messenger.c cVar) {
        int i3;
        int i10;
        boolean z12;
        int i11;
        int i12;
        if (cVar != null ? hp.s1(cVar.f21919a).v2() : hp.s1(h10.f22829t0).v2()) {
            if (cVar == null) {
                i3 = h10.f22829t0;
            } else {
                i3 = cVar.f21919a;
            }
            org.telegram.ui.b.b(i3);
        } else if (userFull != null && userFull.phone_calls_private) {
            t4.k0(activity, cVar.f21919a, user.f27150id);
        } else if (ConnectionsManager.getInstance(h10.f22829t0).getConnectionState() != 3) {
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z12) {
                i11 = 2131743286;
            } else {
                i11 = 2131743284;
            }
            String M0 = bd.M0(i11, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (z12) {
                i12 = 2131743287;
            } else {
                i12 = 2131743288;
            }
            s1Var.U = bd.M0(i12, null);
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(bd.M0(2131743285, null), new k1(activity, intent, 0));
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
