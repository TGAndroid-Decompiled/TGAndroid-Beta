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
import bi.y2;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.b6;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.yx;
import org.telegram.messenger.z20;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b50;
import org.telegram.ui.wv0;
public abstract class m1 {
    public static long f31537a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : vp.r1(d20.f15147s0).e7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
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

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z10, final boolean z11, final boolean z12, final boolean z13, final Activity activity, final org.telegram.ui.ActionBar.k2 k2Var, final org.telegram.messenger.c cVar, boolean z14, boolean z15, boolean z16) {
        u3 f12;
        TLRPC.ChatFull M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull M02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - f31537a < (chat != null ? 200 : 2000)) {
                return;
            }
            if (z14 && chat != null && !z13 && (M02 = vp.r1(cVar.f14863a).M0(chat.f19793id)) != null && (peer = M02.groupcall_default_join_as) != null) {
                final TLRPC.InputPeer i12 = vp.r1(cVar.f14863a).i1(jj.C1(peer));
                k70.J0(activity, -chat.f19793id, cVar, new zr() {
                    @Override
                    public final void i(boolean z17) {
                        String str2 = str;
                        Activity activity2 = activity;
                        TLRPC.Chat chat2 = chat;
                        TLRPC.User user2 = user;
                        TLRPC.InputPeer inputPeer2 = i12;
                        boolean z18 = z11;
                        boolean z19 = z12;
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        org.telegram.messenger.c cVar2 = cVar;
                        if (!z17 && str2 != null) {
                            k1 k1Var = new k1(activity2, chat2, user2, chat2, str2, inputPeer2, z18, z19, activity2, k2Var2, cVar2);
                            if (k2Var2 != null) {
                                k2Var2.showDialog(k1Var);
                                return;
                            }
                            return;
                        }
                        m1.b(user2, chat2, str2, inputPeer2, !z17, z18, z19, false, activity2, k2Var2, cVar2, false, false, false);
                    }
                });
            } else if (z14 && chat != null) {
                k70.K0(activity, -chat.f19793id, cVar, k2Var, !z13 ? 1 : 0, null, new e1(z13, activity, cVar, chat, str, user, z11, z12, k2Var));
            } else if (z15 && !z10 && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!w3.T(chat) || chat.megagroup)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String L0 = cd.L0(w3.W(chat) ? 2131743473 : 2131743332, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(w3.W(chat) ? 2131743503 : 2131743395, null);
                alertDialog$Builder.k(cd.L0(2131743468, null), new org.telegram.ui.ActionBar.u1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                        m1.b(TLRPC.User.this, chat, str, inputPeer, false, z11, z12, z13, activity, k2Var, cVar, false, false, false);
                    }
                });
                i0.a.s(null, 2131752589, alertDialog$Builder, null);
            } else {
                if (chat != null && inputPeer != null && (M0 = vp.r1(cVar.f14863a).M0(chat.f19793id)) != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        M0.groupcall_default_join_as = tL_peerUser;
                        tL_peerUser.user_id = inputPeer.user_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        M0.groupcall_default_join_as = tL_peerChat;
                        tL_peerChat.chat_id = inputPeer.chat_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        M0.groupcall_default_join_as = tL_peerChannel;
                        tL_peerChannel.channel_id = inputPeer.channel_id;
                    }
                    if (M0 instanceof TLRPC.TL_chatFull) {
                        M0.flags |= 32768;
                    } else {
                        M0.flags |= 67108864;
                    }
                }
                if (chat != null && !z13 && (f12 = vp.r1(cVar.f14863a).f1(chat.f19793id, false, null)) != null && f12.j()) {
                    b50.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
                    return;
                }
                f31537a = SystemClock.elapsedRealtime();
                Intent intent = new Intent(activity, VoIPService.class);
                if (user != null) {
                    intent.putExtra("user_id", user.f19942id);
                } else {
                    intent.putExtra("chat_id", chat.f19793id);
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
                intent.putExtra("account", d20.f15147s0);
                try {
                    activity.startService(intent);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
    }

    public static int c() {
        boolean z10 = b6.q(0).J.f14581f;
        boolean z11 = b6.q(0).K.f14581f;
        boolean z12 = b6.q(0).L.f14581f;
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
            if (org.telegram.messenger.v2.f18448a) {
                f8.l("Invalid call data saving preset configuration: " + z10 + "/" + z11 + "/" + z12);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(org.telegram.messenger.w0.f19025b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(org.telegram.messenger.w0.f19025b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z10 = org.telegram.messenger.v2.f18448a;
        return new File(file, sc.e.A(str, "_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Boolean bool, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        boolean z13;
        long j10;
        org.telegram.messenger.c cVar2;
        char c10;
        long j11;
        String str2;
        int i10;
        String str3;
        int i11;
        String str4;
        if (activity != null) {
            if (user != null || chat != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (user != null) {
                        j10 = user.f19942id;
                    } else {
                        j10 = -chat.f19793id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j10) {
                        cVar2 = cVar;
                        if (sharedInstance.getAccount() == cVar2.f14863a) {
                            if (user == null && (activity instanceof LaunchActivity)) {
                                if (!TextUtils.isEmpty(str)) {
                                    sharedInstance.setGroupCallHash(str);
                                }
                                b50.e1((LaunchActivity) activity, org.telegram.messenger.c.a(d20.f15147s0), null, null, false, null);
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
                            int i12 = 0;
                            int i13 = 0;
                            j11 = 0;
                            while (i12 < sharedInstance.groupCall.d.m()) {
                                int i14 = i12;
                                long o10 = o5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i12)).peer);
                                if (o10 != d20.i(account).e()) {
                                    i13++;
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(o5.s(account, o10));
                                    if (i13 >= 2) {
                                        break;
                                    }
                                }
                                i12 = i14 + 1;
                            }
                            if (i13 < sharedInstance.groupCall.d.m() - 1) {
                                sb2.append(cd.G((sharedInstance.groupCall.d.m() - 1) - i13, "AndOther", new Object[0]));
                            }
                        } else {
                            j11 = 0;
                        }
                        if (j10 > j11) {
                            i10 = 2131743293;
                        } else {
                            i10 = 2131743292;
                        }
                        str2 = sb2.toString();
                    } else {
                        c10 = 1;
                        j11 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = i5.m(0, user2.first_name, user2.last_name);
                            if (j10 > 0) {
                                i10 = 2131743299;
                            } else {
                                i10 = 2131743298;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j10 > 0) {
                                i10 = 2131743295;
                            } else {
                                i10 = 2131743296;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = i5.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j11) {
                        i11 = 2131743294;
                    } else {
                        i11 = 2131743297;
                    }
                    String L0 = cd.L0(i11, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c10] = str3;
                    x1Var.T = org.telegram.messenger.i0.W2(cd.a0(null, null, i10, objArr));
                    alertDialog$Builder.k(cd.L0(2131747847, null), new e1(user, chat, str, z10, z11, z12, activity, k2Var, cVar2));
                    i0.a.s(null, 2131752589, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z13 = bool.booleanValue();
                    } else {
                        z13 = true;
                    }
                    b(user, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, z13, true, false);
                }
            }
        }
    }

    public static void g(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new y2(activity, i10, inputGroupCall, z10, groupCall, hashSet));
            return;
        }
        f31537a = SystemClock.elapsedRealtime();
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
            f8.g(th2, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i10) {
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
            i11 = 2131743310;
        } else {
            i11 = 2131743309;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(i11, null));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = W2;
        alertDialog$Builder.k(cd.L0(2131745512, null), new j1(activity, 0));
        alertDialog$Builder.h(cd.L0(2131751772, null), null);
        x1Var.setOnDismissListener(new org.telegram.ui.ActionBar.m2(1, runnable));
        if (z10) {
            i12 = 2131624114;
        } else {
            i12 = 2131624118;
        }
        int i13 = t6.L5;
        alertDialog$Builder.m(i12, 72, t6.x0(null, i13, false), null);
        alertDialog$Builder.n(i13, null);
        alertDialog$Builder.p();
    }

    public static void i(Activity activity) {
        final SharedPreferences d12 = vp.d1();
        LinearLayout e = m5.e(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        a7.V(textView, t6.f21037j5, null);
        e.addView(textView, w7.b6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final t8 t8Var = new t8(activity);
        t8Var.f("Force TCP", d12.getBoolean("dbg_force_tcp_in_calls", false), false);
        t8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        SharedPreferences sharedPreferences = d12;
                        boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("dbg_force_tcp_in_calls", z11);
                        edit.commit();
                        t8Var.setChecked(z11);
                        return;
                    case 1:
                        SharedPreferences sharedPreferences2 = d12;
                        boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        boolean z13 = !z12;
                        edit2.putBoolean("dbg_dump_call_stats", z13);
                        edit2.commit();
                        t8Var.setChecked(z13);
                        return;
                    default:
                        SharedPreferences sharedPreferences3 = d12;
                        boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        boolean z15 = !z14;
                        edit3.putBoolean("dbg_force_connection_service", z15);
                        edit3.commit();
                        t8Var.setChecked(z15);
                        return;
                }
            }
        });
        e.addView(t8Var);
        if (org.telegram.messenger.v2.f18448a) {
            final t8 t8Var2 = new t8(activity);
            t8Var2.f("Dump detailed stats", d12.getBoolean("dbg_dump_call_stats", false), false);
            t8Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = d12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            t8Var2.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = d12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            t8Var2.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = d12;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            t8Var2.setChecked(z15);
                            return;
                    }
                }
            });
            e.addView(t8Var2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final t8 t8Var3 = new t8(activity);
            t8Var3.f("Enable ConnectionService", d12.getBoolean("dbg_force_connection_service", false), false);
            t8Var3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            SharedPreferences sharedPreferences = d12;
                            boolean z10 = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("dbg_force_tcp_in_calls", z11);
                            edit.commit();
                            t8Var3.setChecked(z11);
                            return;
                        case 1:
                            SharedPreferences sharedPreferences2 = d12;
                            boolean z12 = sharedPreferences2.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            boolean z13 = !z12;
                            edit2.putBoolean("dbg_dump_call_stats", z13);
                            edit2.commit();
                            t8Var3.setChecked(z13);
                            return;
                        default:
                            SharedPreferences sharedPreferences3 = d12;
                            boolean z14 = sharedPreferences3.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                            boolean z15 = !z14;
                            edit3.putBoolean("dbg_force_connection_service", z15);
                            edit3.commit();
                            t8Var3.setChecked(z15);
                            return;
                    }
                }
            });
            e.addView(t8Var3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20134a.R = cd.L0(2131751646, null);
        alertDialog$Builder.o(e);
        alertDialog$Builder.p();
    }

    public static void j(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : vp.r1(d20.f15147s0).e7.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        k(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), d20.f15147s0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void k(final Context context, wv0 wv0Var, boolean z10, final long j10, final long j11, final int i10, final boolean z11) {
        File file;
        String str;
        String str2;
        String L0;
        String str3;
        boolean z12 = org.telegram.messenger.v2.f18448a;
        File file2 = new File(org.telegram.messenger.w0.f19025b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j10 + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(org.telegram.messenger.w0.f19025b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j10 + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i11 = 1;
        LinearLayout f7 = m5.f(context, 1);
        int L = org.telegram.messenger.i0.L(16.0f);
        f7.setPadding(L, L, L, 0);
        final TextView textView = new TextView(context);
        textView.setTextSize(2, 16.0f);
        a7.V(textView, t6.f21037j5, null);
        m5.l(textView, 17, null, 2131743282);
        f7.addView(textView);
        final ?? view = new View(context);
        view.f27696c = new Paint();
        view.d = 5;
        view.e = 0;
        view.f27694a = BitmapFactory.decodeResource(view.getResources(), 2131231459).extractAlpha();
        view.f27695b = BitmapFactory.decodeResource(view.getResources(), 2131231458).extractAlpha();
        f7.addView((View) view, w7.b6.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bh.c cVar = new bh.c(11);
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
        int i12 = 0;
        while (i12 < 9) {
            if (strArr[i12] != null) {
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, i11);
                c2Var.setClipToPadding(false);
                c2Var.setTag(strArr[i12]);
                switch (i12) {
                    case 0:
                        L0 = cd.L0(2131746431, null);
                        str3 = L0;
                        break;
                    case 1:
                        L0 = cd.L0(2131746430, null);
                        str3 = L0;
                        break;
                    case 2:
                        L0 = cd.L0(2131746436, null);
                        str3 = L0;
                        break;
                    case 3:
                        L0 = cd.L0(2131746434, null);
                        str3 = L0;
                        break;
                    case 4:
                        L0 = cd.L0(2131746435, null);
                        str3 = L0;
                        break;
                    case 5:
                        L0 = cd.L0(2131746438, null);
                        str3 = L0;
                        break;
                    case 6:
                        L0 = cd.L0(2131746433, null);
                        str3 = L0;
                        break;
                    case 7:
                        L0 = cd.L0(2131746432, null);
                        str3 = L0;
                        break;
                    case 8:
                        L0 = cd.L0(2131746437, null);
                        str3 = L0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                c2Var.e(str3, null, false, false, false);
                c2Var.setOnClickListener(cVar);
                c2Var.setTag(strArr[i12]);
                linearLayout.addView(c2Var);
            }
            i12++;
            i11 = 1;
        }
        f7.addView(linearLayout, w7.b6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setHint(cd.L0(2131743433, null));
        editTextBoldCursor.setInputType(147457);
        a7.V(editTextBoldCursor, t6.f21037j5, null);
        a7.E(editTextBoldCursor, t6.f21222t5, null);
        editTextBoldCursor.setBackground(null);
        a7.G(editTextBoldCursor, t6.f21241u5, t6.f21258v5, t6.f21170q7, null);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        f7.addView(editTextBoldCursor, w7.b6.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 1);
        sr srVar = new sr(26, zArr, c2Var2);
        c2Var2.e(cd.L0(2131752604, null), null, true, false, false);
        c2Var2.setClipToPadding(false);
        c2Var2.setOnClickListener(srVar);
        f7.addView(c2Var2, w7.b6.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 14.0f);
        z20.p(textView2, t6.f21185r5, null, null, 2131752603);
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setOnClickListener(srVar);
        f7.addView(textView2);
        c2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20134a.R = cd.L0(2131752614, null);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131745657, null), new m4.v0(13));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        alertDialog$Builder.f20134a.setOnDismissListener(new org.telegram.ui.ActionBar.m2(2, wv0Var));
        final org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        if (org.telegram.messenger.v2.f18448a && file4.exists()) {
            org.telegram.ui.Components.f2 f2Var = new org.telegram.ui.Components.f2(24, context, file4);
            x1Var.f21504t0 = "Send log";
            x1Var.f21505u0 = f2Var;
        }
        x1Var.show();
        x1Var.getWindow().setSoftInputMode(3);
        final View d = x1Var.d(-1);
        d.setEnabled(false);
        view.setOnRatingChangeListener(new fe.a(d));
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                org.telegram.ui.Cells.c2 c2Var3;
                k9 k9Var = k9.this;
                int rating = k9Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        k9Var.setVisibility(8);
                        textView.setVisibility(8);
                        x1Var2.setTitle(cd.L0(2131752605, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            c2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) d).setText(cd.L0(2131745657, null).toUpperCase());
                        return;
                    }
                }
                int i13 = d20.f15147s0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = k9Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < linearLayout2.getChildCount(); i14++) {
                    if (((org.telegram.ui.Cells.c2) linearLayout2.getChildAt(i14)).b()) {
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
                tL_inputPhoneCall.f19858id = j10;
                setcallrating.user_initiative = z11;
                ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new yx(i13, zArr2, file5, setcallrating, arrayList, context));
                x1Var2.dismiss();
            }
        });
    }

    public static void l(TLRPC.Chat chat, String str, boolean z10, Boolean bool, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        int i10;
        int i11;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(d20.f15147s0).getConnectionState() != 3) {
            boolean z11 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z11 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z11) {
                i10 = 2131743302;
            } else {
                i10 = 2131743300;
            }
            String L0 = cd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (z11) {
                i11 = 2131743381;
            } else {
                i11 = 2131743382;
            }
            x1Var.T = cd.L0(i11, null);
            alertDialog$Builder.k(cd.L0(2131747847, null), null);
            if (z11) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(cd.L0(2131743301, null), new i1(activity, intent, 1));
                }
            }
            try {
                alertDialog$Builder.p();
                return;
            } catch (Exception e) {
                f8.g(e, true);
                return;
            }
        }
        f(null, chat, str, false, false, z10, bool, activity, k2Var, cVar);
    }

    public static void m(TLRPC.User user, boolean z10, boolean z11, Activity activity, TLRPC.UserFull userFull, org.telegram.messenger.c cVar) {
        int i10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        if (cVar != null ? vp.r1(cVar.f14863a).u2() : vp.r1(d20.f15147s0).u2()) {
            if (cVar == null) {
                i10 = d20.f15147s0;
            } else {
                i10 = cVar.f14863a;
            }
            org.telegram.ui.b.b(i10);
        } else if (userFull != null && userFull.phone_calls_private) {
            s4.k0(activity, cVar.f14863a, user.f19942id);
        } else if (ConnectionsManager.getInstance(d20.f15147s0).getConnectionState() != 3) {
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z12) {
                i12 = 2131743302;
            } else {
                i12 = 2131743300;
            }
            String L0 = cd.L0(i12, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (z12) {
                i13 = 2131743303;
            } else {
                i13 = 2131743304;
            }
            x1Var.T = cd.L0(i13, null);
            alertDialog$Builder.k(cd.L0(2131747847, null), null);
            if (z12) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.i(cd.L0(2131743301, null), new i1(activity, intent, 0));
                }
            }
            try {
                alertDialog$Builder.p();
            } catch (Exception e) {
                f8.g(e, true);
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
                i11 = 102;
            } else {
                i11 = 101;
            }
            activity.requestPermissions(strArr, i11);
        }
    }
}
