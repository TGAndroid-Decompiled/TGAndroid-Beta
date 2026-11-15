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
import c8.ja;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.lx;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.r3;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.telegram.ui.pu0;
public abstract class c2 {
    public static long f40534a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : np.s1(m10.f24934t0).f25270e7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.e2 e2Var, final org.telegram.messenger.c cVar, boolean z14, boolean z15, boolean z16) {
        r3 g12;
        TLRPC.ChatFull N0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull N02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - f40534a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (N02 = np.s1(cVar.f22778a).N0(chat.f28051id)) != null && (peer = N02.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer j12 = np.s1(cVar.f22778a).j1(gj.B1(peer));
                v60.J0(activity, -chat.f28051id, cVar, new nr() {
                    @Override
                    public final void j(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer2 = j12;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        org.telegram.messenger.c cVar2 = cVar;
                        if (!z17 && str2 != null) {
                            a2 a2Var = new a2(activity2, chat2, user2, chat2, str2, inputPeer2, z18, z19, activity2, e2Var2, cVar2);
                            if (e2Var2 != null) {
                                e2Var2.showDialog(a2Var);
                                return;
                            }
                            return;
                        }
                        c2.b(user2, chat2, str2, inputPeer2, !z17, z18, z19, false, activity2, e2Var2, cVar2, false, false, false);
                    }
                });
            } else if (z14 && chat != null) {
                v60.K0(activity, -chat.f28051id, cVar, e2Var, !z13 ? 1 : 0, null, new v1(z13, activity, cVar, chat, str, user, z11, z12, e2Var));
            } else if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!t3.T(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = hd.M0(t3.W(chat) ? 2131743447 : 2131743306, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(t3.W(chat) ? 2131743477 : 2131743369, null);
                alertDialog$Builder.k(hd.M0(2131743442, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                        c2.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, e2Var, cVar, false, false, false);
                    }
                });
                i5.c.x(null, 2131752589, alertDialog$Builder, null);
            } else {
                if (chat != null && inputPeer != null && (N0 = np.s1(cVar.f22778a).N0(chat.f28051id)) != null) {
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
                if (chat != null && !z13 && (g12 = np.s1(cVar.f22778a).g1(chat.f28051id, false, null)) != null && g12.j()) {
                    c40.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
                    return;
                }
                f40534a = SystemClock.elapsedRealtime();
                Intent intent = new Intent(activity, VoIPService.class);
                if (user != null) {
                    intent.putExtra("user_id", user.f28200id);
                } else {
                    intent.putExtra("chat_id", chat.f28051id);
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
                intent.putExtra("account", m10.f24934t0);
                try {
                    activity.startService(intent);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static int c() {
        boolean z10 = z5.q(0).K.f27662f;
        boolean z11 = z5.q(0).L.f27662f;
        boolean z12 = z5.q(0).M.f27662f;
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
            if (org.telegram.messenger.r2.f26198a) {
                a8.l("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(org.telegram.messenger.t0.f26600b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(org.telegram.messenger.t0.f26600b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z10 = org.telegram.messenger.r2.f26198a;
        return new File(file, r.b.v(str, "_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar) {
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
                        j3 = user.f28200id;
                    } else {
                        j3 = -chat.f28051id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j3) {
                        cVar2 = cVar;
                        if (sharedInstance.getAccount() == cVar2.f22778a) {
                            if (user == null && (activity instanceof LaunchActivity)) {
                                if (!TextUtils.isEmpty(str)) {
                                    sharedInstance.setGroupCallHash(str);
                                }
                                c40.e1((LaunchActivity) activity, org.telegram.messenger.c.a(m10.f24934t0), null, null, false, null);
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
                                long o4 = m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i11)).peer);
                                if (o4 != m10.i(account).e()) {
                                    i12++;
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(m5.s(account, o4));
                                    if (i12 >= 2) {
                                        break;
                                    }
                                }
                                i11 = i13 + 1;
                            }
                            if (i12 < sharedInstance.groupCall.d.m() - 1) {
                                sb2.append(hd.G((sharedInstance.groupCall.d.m() - 1) - i12, "AndOther", new Object[0]));
                            }
                        } else {
                            j10 = 0;
                        }
                        if (j3 > j10) {
                            i7 = 2131743267;
                        } else {
                            i7 = 2131743266;
                        }
                        str2 = sb2.toString();
                    } else {
                        c10 = 1;
                        j10 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = g5.m(0, user2.first_name, user2.last_name);
                            if (j3 > 0) {
                                i7 = 2131743273;
                            } else {
                                i7 = 2131743272;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j3 > 0) {
                                i7 = 2131743269;
                            } else {
                                i7 = 2131743270;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = g5.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j10) {
                        i10 = 2131743268;
                    } else {
                        i10 = 2131743271;
                    }
                    String M0 = hd.M0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c10] = str3;
                    t1Var.U = org.telegram.messenger.g0.X2(hd.a0(null, null, i7, objArr));
                    alertDialog$Builder.k(hd.M0(2131747831, null), new v1(user, chat, str, z10, z11, z12, activity, e2Var, cVar2));
                    i5.c.x(null, 2131752589, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z13 = bool.booleanValue();
                    } else {
                        z13 = true;
                    }
                    b(user, chat, str, null, false, z10, z11, z12, activity, e2Var, cVar, z13, true, false);
                }
            }
        }
    }

    public static void g(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new oi.n2(activity, i7, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        f40534a = SystemClock.elapsedRealtime();
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
            i10 = 2131743284;
        } else {
            i10 = 2131743283;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(i10, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = X2;
        alertDialog$Builder.k(hd.M0(2131745495, null), new ki.n0(activity, 1));
        alertDialog$Builder.h(hd.M0(2131751772, null), null);
        t1Var.setOnDismissListener(new org.telegram.ui.ActionBar.i2(1, runnable));
        if (z10) {
            i11 = 2131624117;
        } else {
            i11 = 2131624121;
        }
        int i12 = j6.L5;
        alertDialog$Builder.m(i11, 72, j6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        alertDialog$Builder.p();
    }

    public static void i(Activity activity) {
        final SharedPreferences e12 = np.e1();
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        q6.U(textView, j6.f28957j5, null);
        e10.addView(textView, ja.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
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
        if (org.telegram.messenger.r2.f26198a) {
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
        alertDialog$Builder.f28392a.S = hd.M0(2131751645, null);
        alertDialog$Builder.o(e10);
        alertDialog$Builder.p();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : np.s1(m10.f24934t0).f25270e7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), m10.f24934t0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, pu0 pu0Var, boolean z10, final long j3, final long j10, final int i7, final boolean z11) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z12 = org.telegram.messenger.r2.f26198a;
        File file2 = new File(org.telegram.messenger.t0.f26600b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j3 + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(org.telegram.messenger.t0.f26600b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j3 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i10 = 1;
        LinearLayout f10 = k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        f10.setPadding(L, L, L, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        q6.U(textView, j6.f28957j5, null);
        k5.l(textView, 17, null, 2131743256);
        f10.addView(textView);
        final ?? view = new View(context);
        view.f37173c = new Paint();
        view.d = 5;
        view.f37174e = 0;
        view.f37171a = BitmapFactory.decodeResource(view.getResources(), 2131231458).extractAlpha();
        view.f37172b = BitmapFactory.decodeResource(view.getResources(), 2131231457).extractAlpha();
        f10.addView((View) view, ja.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bi.o oVar = new bi.o(16);
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
                        M0 = hd.M0(2131746416, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = hd.M0(2131746415, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = hd.M0(2131746421, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = hd.M0(2131746419, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = hd.M0(2131746420, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = hd.M0(2131746423, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = hd.M0(2131746418, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = hd.M0(2131746417, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = hd.M0(2131746422, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                c2Var.e(str3, null, false, false, false);
                c2Var.setOnClickListener(oVar);
                c2Var.setTag(strArr[i11]);
                linearLayout.addView(c2Var);
            }
            i11++;
            i10 = 1;
        }
        f10.addView(linearLayout, ja.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(hd.M0(2131743407, null));
        editTextBoldCursor.setInputType(147457);
        q6.U(editTextBoldCursor, j6.f28957j5, null);
        q6.D(editTextBoldCursor, j6.f29145t5, null);
        editTextBoldCursor.setBackground(null);
        q6.F(editTextBoldCursor, j6.f29164u5, j6.f29183v5, j6.f29090q7, null);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        f10.addView(editTextBoldCursor, ja.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 1);
        vv0 vv0Var = new vv0(11, zArr, c2Var2);
        c2Var2.e(hd.M0(2131752604, null), null, true, false, false);
        c2Var2.setClipToPadding(false);
        c2Var2.setOnClickListener(vv0Var);
        f10.addView(c2Var2, ja.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        i20.q(textView2, j6.f29107r5, null, null, 2131752603);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setOnClickListener(vv0Var);
        f10.addView(textView2);
        c2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f28392a.S = hd.M0(2131752614, null);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131745640, null), new ug.x(16));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.f28392a.setOnDismissListener(new org.telegram.ui.ActionBar.i2(2, pu0Var));
        final org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (org.telegram.messenger.r2.f26198a && file4.exists()) {
            org.telegram.ui.Components.f1 f1Var = new org.telegram.ui.Components.f1(27, context, file4);
            t1Var.f29649s0 = "Send log";
            t1Var.f29650t0 = f1Var;
        }
        t1Var.show();
        t1Var.getWindow().setSoftInputMode(3);
        final View d = t1Var.d(-1);
        d.setEnabled(false);
        view.setOnRatingChangeListener(new s1(d));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                org.telegram.ui.Cells.c2 c2Var3;
                m9 m9Var = m9.this;
                int rating = m9Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        m9Var.setVisibility(8);
                        textView.setVisibility(8);
                        t1Var2.setTitle(hd.M0(2131752605, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            c2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(hd.M0(2131745640, null).toUpperCase());
                        return;
                    }
                }
                int i12 = m10.f24934t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = m9Var.getRating();
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
                tL_inputPhoneCall.access_hash = j10;
                tL_inputPhoneCall.f28116id = j3;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i7).sendRequest(setcallrating, new lx(i12, zArr2, file5, setcallrating, arrayList, context));
                t1Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar) {
        int i7;
        int i10;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(m10.f24934t0).getConnectionState() != 3) {
            boolean z11 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z11 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z11) {
                i7 = 2131743276;
            } else {
                i7 = 2131743274;
            }
            String M0 = hd.M0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (z11) {
                i10 = 2131743355;
            } else {
                i10 = 2131743356;
            }
            t1Var.U = hd.M0(i10, null);
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
            if (z11) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(hd.M0(2131743275, null), new z1(activity, intent, 1));
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
        f(null, chat, str, false, false, z10, bool, activity, e2Var, cVar);
    }

    public static void m(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, org.telegram.messenger.c cVar) {
        int i7;
        int i10;
        boolean z12;
        int i11;
        int i12;
        if (cVar != null ? np.s1(cVar.f22778a).v2() : np.s1(m10.f24934t0).v2()) {
            if (cVar == null) {
                i7 = m10.f24934t0;
            } else {
                i7 = cVar.f22778a;
            }
            org.telegram.ui.b.b(i7);
        } else if (userFull != null && userFull.phone_calls_private) {
            t4.i0(activity, cVar.f22778a, user.f28200id);
        } else if (ConnectionsManager.getInstance(m10.f24934t0).getConnectionState() != 3) {
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z12) {
                i11 = 2131743276;
            } else {
                i11 = 2131743274;
            }
            String M0 = hd.M0(i11, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (z12) {
                i12 = 2131743277;
            } else {
                i12 = 2131743278;
            }
            t1Var.U = hd.M0(i12, null);
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(hd.M0(2131743275, null), new z1(activity, intent, 0));
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
