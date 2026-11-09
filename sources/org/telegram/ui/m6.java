package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class m6 implements Runnable {
    public final int f47775a;
    public final Object f47776b;
    public final Object f47777c;
    public final Object d;
    public final Object f47778e;

    public m6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f47775a = i7;
        this.f47776b = obj;
        this.d = obj2;
        this.f47778e = obj3;
        this.f47777c = obj4;
    }

    private final void a() {
        ((yw) this.f47776b).I4(((Integer) this.d).intValue());
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.fq(19, (org.telegram.ui.Components.fx) this.f47778e, (org.telegram.ui.ActionBar.f2) this.f47777c), 200L);
    }

    private final void b() {
        int i7;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z9;
        org.telegram.ui.Components.i20 i20Var = (org.telegram.ui.Components.i20) this.f47776b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f47778e;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.f47777c;
        org.telegram.ui.Components.cv0 cv0Var = i20Var.f32534q1;
        a0.h hVar3 = i20Var.R1;
        a0.h hVar4 = i20Var.S1;
        ArrayList arrayList2 = i20Var.O1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            org.telegram.messenger.qp.s1(i20Var.f28621a).Y3(tL_channels_channelParticipants.users, false);
            org.telegram.messenger.qp.s1(i20Var.f28621a).S3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.p10.i(i20Var.f28621a).e();
            int i10 = 0;
            while (true) {
                if (i10 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                } else if (org.telegram.messenger.ij.B1(tL_channels_channelParticipants.participants.get(i10).peer) == e10) {
                    tL_channels_channelParticipants.participants.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
            i20Var.L1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = i20Var.P1;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                hVar.k(channelParticipant, org.telegram.messenger.ij.B1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                long B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) arrayList2.get(i12)).peer);
                if (hVar4.f(B1) != null || ((hVar2 = i20Var.V1) != null && hVar2.h(B1) >= 0)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i20Var.f28621a).a2(Long.valueOf(B1));
                if ((a22 != null && a22.bot) || org.telegram.messenger.t10.x(a22)) {
                    z9 = true;
                }
                if (z9) {
                    arrayList2.remove(i12);
                    hVar3.l(B1);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (i20Var.N1.participants_count <= 200) {
                    Collections.sort(arrayList, new up(i20Var, ConnectionsManager.getInstance(i20Var.f28621a).getCurrentTime(), 1));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        if (i20Var.L1 <= 0) {
            i20Var.T1 = false;
            i20Var.U1 = true;
            if (i20Var.f34539h2 == 1) {
                i7 = 1;
            } else {
                org.telegram.ui.Components.pj0 pj0Var = i20Var.f32531m1;
                if (pj0Var != null) {
                    i7 = pj0Var.b() - 1;
                } else {
                    i7 = 0;
                }
            }
            i20Var.O0(i7);
            if (arrayList2.isEmpty()) {
                i20Var.Y1 = true;
                i20Var.R0();
            }
        }
        i20Var.T0();
        org.telegram.ui.Components.pj0 pj0Var2 = i20Var.f32531m1;
        if (pj0Var2 != null) {
            pj0Var2.f();
            if (cv0Var != null && i20Var.f32531m1.b() == 0 && i20Var.U1) {
                cv0Var.e(false, true);
            }
        }
    }

    private final void c() {
        org.telegram.ui.Components.c70 c70Var = (org.telegram.ui.Components.c70) this.f47776b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLRPC.Updates updates = (TLRPC.Updates) this.f47778e;
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f47777c;
        org.telegram.ui.ActionBar.f2 f2Var = c70Var.f32558k1;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            if (tL_error == null) {
                if (updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    org.telegram.messenger.qp.s1(c70Var.f28621a).Y3(updates.users, false);
                    org.telegram.messenger.qp.s1(c70Var.f28621a).S3(updates.chats, false);
                    long j3 = chat.f26956id;
                    boolean z9 = !org.telegram.messenger.t3.V(chat);
                    c70Var.getClass();
                    Bundle j10 = a8.p0.j(j3, "chat_id");
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(c70Var.f28621a);
                    org.telegram.ui.ActionBar.f2 f2Var2 = c70Var.f32558k1;
                    if (s12.E(j10, f2Var2, null, null)) {
                        f2Var2.presentFragment(new org.telegram.ui.Components.b70(c70Var, j10, z9, j3), f2Var2 instanceof cn);
                        return;
                    }
                    return;
                }
                return;
            }
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            org.telegram.ui.Components.v4.c0(c70Var.f28621a, tL_error, f2Var, tL_messages_importChatInvite, new Object[0]);
        }
    }

    private final void d() {
        org.telegram.ui.Components.r70 r70Var = (org.telegram.ui.Components.r70) this.f47776b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47778e;
        TLObject tLObject = (TLObject) this.f47777c;
        r70Var.D = false;
        r70Var.L = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i7 = 0; i7 < tL_messages_chatInviteImporters.users.size(); i7++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            r70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void f() {
        org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) this.f47776b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.f47778e;
        ((boolean[]) this.f47777c)[0] = true;
        org.telegram.messenger.g0.r(v80Var.Q);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((TL_stories.StoryItem) arrayList.get(i7)).pinned = zArr[i7];
        }
        v80Var.getMessagesController().P1().q0(v80Var.f39006e, arrayList, false);
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47776b;
        fi.d dVar = (fi.d) this.d;
        p6 p6Var = (p6) this.f47778e;
        Runnable runnable = (Runnable) this.f47777c;
        if (tL_error != null) {
            org.telegram.ui.Components.hc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        p6Var.dismiss();
        org.telegram.messenger.k5.o(null, 2131747043, org.telegram.ui.Components.hc.X(), 2131623981, 36);
        runnable.run();
    }

    private final void h() {
        yw ywVar = (yw) this.d;
        ywVar.showDialog(new org.telegram.ui.Components.n20((Context) this.f47778e, ywVar.getResourceProvider(), new org.telegram.ui.Components.w80(8, (org.telegram.ui.Components.zl0) this.f47776b, ywVar)));
        ((org.telegram.ui.Components.l60) this.f47777c).u();
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z9;
        int i10;
        String[] strArr;
        pq pqVar;
        qq qqVar;
        ArrayList arrayList;
        int i11;
        int i12;
        long B1;
        int i13;
        String lowerCase;
        boolean z10;
        String K;
        String str;
        String str2;
        String str3;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        r1.g gVar;
        char c10;
        float f12;
        r1.g gVar2;
        final float f13;
        boolean z13;
        int x02;
        int x03;
        int x04;
        int x05;
        org.telegram.messenger.rc rcVar;
        org.telegram.ui.Components.p3 p3Var;
        int i14;
        int i15 = this.f47775a;
        int i16 = -1;
        int i17 = 0;
        Object obj = this.f47777c;
        Object obj2 = this.f47778e;
        Object obj3 = this.d;
        Object obj4 = this.f47776b;
        switch (i15) {
            case 0:
                q6 q6Var = (q6) obj4;
                q6Var.getClass();
                ((bi.x5) obj3).f(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    q6Var.d.A0(true);
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) obj4;
                long[] jArr = (long[]) obj3;
                p6 p6Var = (p6) obj2;
                if (!((boolean[]) obj)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    return;
                }
                return;
            case 2:
                h8.Z((h8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 3:
                la.Z((la) obj4, (org.telegram.ui.ActionBar.u1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 4:
                cn cnVar = (cn) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) obj;
                if (f2Var instanceof org.telegram.messenger.ls) {
                    i7 = 4;
                    cnVar.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, 4);
                } else {
                    i7 = 4;
                }
                cnVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ijVar.f23262k.action.channel_id);
                ((ActionBarLayout) q4Var).c(q4Var.getFragmentStack().size() - 1, new cn(bundle));
                f2Var.finishFragment();
                return;
            case 5:
                cn cnVar2 = (cn) obj4;
                TLObject tLObject = (TLObject) obj2;
                bi.z2 z2Var = (bi.z2) obj;
                ((vf.b) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    cnVar2.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    cnVar2.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = cnVar2.getMessagesController().a2(Long.valueOf(o4));
                        z2Var.a(user);
                        return;
                    }
                }
                user = null;
                z2Var.a(user);
                return;
            case 6:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3((org.telegram.ui.Components.wq) imageView.getDrawable(), 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                ofFloat.start();
                return;
            case 7:
                cn cnVar3 = (cn) obj4;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.o80.g(ijVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                if (th2 == null && tL_webPage != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.messenger.g0.h3(new bi.l4(cnVar3, u1Var, zArr, z9, ijVar2, tL_webPage));
                return;
            case 8:
                cn cnVar4 = (cn) obj4;
                org.telegram.messenger.yr yrVar = (org.telegram.messenger.yr) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i18 = messages_messages.messages.get(0).f26977id;
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) cnVar4.E6[0].get(i18);
                    yrVar.f26719a.c(new org.telegram.messenger.aq(yrVar, i18, cnVar4.f44504j6, 4));
                    if (ijVar3 != null) {
                        TLRPC.Message message = ijVar3.f23262k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    cnVar4.l(i18, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    cnVar4.B6 = messages_messages.count;
                } else {
                    cnVar4.B6 = 0;
                }
                yrVar.f26719a.c(new org.telegram.messenger.yq(yrVar, cnVar4.b(), cnVar4.f44504j6, cnVar4.B6, 7));
                int i19 = cnVar4.B6;
                if (i19 == 0) {
                    cnVar4.C6 = true;
                    cnVar4.qc(false);
                    return;
                }
                cnVar4.f44676x1.c(2, i19, true);
                cnVar4.ja();
                return;
            case 9:
                cn.T0((cn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (n6) obj);
                return;
            case 10:
                uo.b0((uo) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.f2) obj);
                return;
            case 11:
                mp mpVar = (mp) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                mpVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    mpVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 12:
                qq qqVar2 = (qq) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                vp vpVar = (vp) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vpVar.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131689472, "AppName");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                u1Var2.R = M0;
                u1Var2.T = org.telegram.messenger.id.a0(null, null, 2131754350, org.telegram.messenger.t10.p(user2));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), new w0(vpVar, 26));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                qqVar2.showDialog(u1Var2);
                return;
            case 13:
                pq pqVar2 = (pq) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                qq qqVar3 = pqVar2.D;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.h3(new bi.u0(pqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase2, true, false);
                S0 = (lowerCase2.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i20 = i10 + 1;
                String[] strArr2 = new String[i20];
                strArr2[0] = lowerCase2;
                if (S0 != null) {
                    strArr2[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                String[] strArr3 = strArr2;
                a0.h hVar = new a0.h();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        TLObject tLObject4 = (TLObject) arrayList2.get(i21);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            strArr = strArr3;
                            pqVar = pqVar2;
                            B1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            strArr = strArr3;
                            pqVar = pqVar2;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                B1 = org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                            } else {
                                qqVar = qqVar3;
                                arrayList = arrayList2;
                                i11 = size;
                                i12 = i21;
                                i21 = i12 + 1;
                                pqVar2 = pqVar;
                                strArr3 = strArr;
                                qqVar3 = qqVar;
                                arrayList2 = arrayList;
                                size = i11;
                            }
                        }
                        if (B1 > 0) {
                            TLRPC.User a22 = qqVar3.getMessagesController().a2(Long.valueOf(B1));
                            i13 = size;
                            i12 = i21;
                            if (a22.f27105id == qqVar3.getUserConfig().e()) {
                                qqVar = qqVar3;
                                arrayList = arrayList2;
                                i11 = i13;
                                i21 = i12 + 1;
                                pqVar2 = pqVar;
                                strArr3 = strArr;
                                qqVar3 = qqVar;
                                arrayList2 = arrayList;
                                size = i11;
                            } else {
                                lowerCase = org.telegram.messenger.t10.p(a22).toLowerCase();
                                String n10 = org.telegram.messenger.t10.n(a22);
                                String str4 = a22.first_name;
                                qqVar = qqVar3;
                                str2 = a22.last_name;
                                str = str4;
                                K = n10;
                                z10 = false;
                            }
                        } else {
                            i13 = size;
                            i12 = i21;
                            TLRPC.Chat M02 = qqVar3.getMessagesController().M0(Long.valueOf(-B1));
                            lowerCase = M02.title.toLowerCase();
                            z10 = false;
                            K = org.telegram.messenger.t3.K(M02, false);
                            str = M02.title;
                            qqVar = qqVar3;
                            str2 = null;
                        }
                        arrayList = arrayList2;
                        i11 = i13;
                        String S02 = org.telegram.messenger.id.E0().S0(lowerCase, true, z10);
                        if (lowerCase.equals(S02)) {
                            S02 = null;
                        }
                        boolean z14 = false;
                        int i22 = 0;
                        while (true) {
                            if (i22 < i20) {
                                boolean z15 = z14;
                                String str5 = strArr[i22];
                                if (!lowerCase.startsWith(str5) && !jg.g.A(" ", str5, lowerCase) && (S02 == null || (!S02.startsWith(str5) && !jg.g.A(" ", str5, S02)))) {
                                    if (K != null && K.startsWith(str5)) {
                                        str3 = lowerCase;
                                        z11 = true;
                                    } else {
                                        str3 = lowerCase;
                                        z11 = z15;
                                    }
                                } else {
                                    str3 = lowerCase;
                                    z11 = true;
                                }
                                if (z11) {
                                    if (z11) {
                                        arrayList5.add(org.telegram.messenger.g0.r0(str, str2, str5));
                                    } else {
                                        arrayList5.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                                    }
                                    arrayList6.add(tLObject4);
                                } else {
                                    i22++;
                                    z14 = z11;
                                    lowerCase = str3;
                                }
                            }
                        }
                        i21 = i12 + 1;
                        pqVar2 = pqVar;
                        strArr3 = strArr;
                        qqVar3 = qqVar;
                        arrayList2 = arrayList;
                        size = i11;
                    }
                }
                qq qqVar4 = qqVar3;
                String[] strArr4 = strArr3;
                pq pqVar3 = pqVar2;
                if (arrayList3 != null) {
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        TLRPC.User a23 = qqVar4.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                        if (a23.f27105id != qqVar4.getUserConfig().e()) {
                            String lowerCase3 = org.telegram.messenger.t10.p(a23).toLowerCase();
                            String S03 = org.telegram.messenger.id.E0().S0(lowerCase3, true, false);
                            if (lowerCase3.equals(S03)) {
                                S03 = null;
                            }
                            boolean z16 = false;
                            int i24 = 0;
                            while (true) {
                                if (i24 < i20) {
                                    String str6 = strArr4[i24];
                                    if (!lowerCase3.startsWith(str6) && !jg.g.A(" ", str6, lowerCase3) && (S03 == null || (!S03.startsWith(str6) && !jg.g.A(" ", str6, S03)))) {
                                        String n11 = org.telegram.messenger.t10.n(a23);
                                        if (n11 != null && n11.startsWith(str6)) {
                                            z16 = true;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        if (z16) {
                                            arrayList5.add(org.telegram.messenger.g0.r0(a23.first_name, a23.last_name, str6));
                                        } else {
                                            arrayList5.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(a23), null, "@" + str6));
                                        }
                                        arrayList4.add(a23);
                                        hVar.k(a23, a23.f27105id);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new bi.u0(pqVar3, arrayList4, hVar, arrayList5, arrayList6, 29));
                return;
            case 14:
                String str7 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.g0) obj4, (Context) obj2, str7, str7, (org.telegram.ui.ActionBar.g6) obj).show();
                return;
            case 15:
                org.telegram.ui.Components.u4 u4Var = (org.telegram.ui.Components.u4) obj4;
                bi.b9 b9Var = (bi.b9) obj3;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                View view = (View) obj;
                String trim = u4Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    b9Var.a(lowerCase4);
                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                    if (u1Var3 != null) {
                        u1Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.F3(u4Var);
                return;
            case 16:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748506, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i25 = 0;
                while (true) {
                    if (i25 < iArr.length) {
                        if (iArr2[0] == iArr[i25]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i25]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()) {
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131230873, 0);
                    wpVar.G = 0.7f;
                    wpVar.f40120r = org.telegram.messenger.g0.L(-1.33f);
                    wpVar.f40121s = org.telegram.messenger.g0.L(0.0f);
                    wpVar.f40123x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(2131231976, 0);
                    wpVar2.G = 0.7f;
                    wpVar2.f40120r = org.telegram.messenger.g0.L(-1.33f);
                    wpVar2.f40121s = org.telegram.messenger.g0.L(0.0f);
                    wpVar2.f40123x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 17:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.kt0 kt0Var = (org.telegram.ui.Components.kt0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.bn0 bn0Var = (org.telegram.ui.Components.bn0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.f31114q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), 2131755354);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(kt0Var, c8.ha.e(40, 40, 3));
                    dialog.setContentView(frameLayout);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(134217728);
                    dialog.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    if (org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28145s8, true) == -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    org.telegram.messenger.g0.q3(dialog, z12);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, true)) >= 0.721f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        org.telegram.messenger.g0.n3(dialog, z13);
                    }
                    chatActivityEnterView.f31128s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f31128s0;
                    chatActivityEnterView.f31108p0.getLocationInWindow(iArr4);
                    final float f14 = iArr4[0];
                    float f15 = iArr4[1];
                    float L = org.telegram.messenger.g0.L(5.0f);
                    float L2 = iArr3[0] + chatActivityEnterView.f31128s0 + L + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f16 = iArr3[1] + chatActivityEnterView.f31133t0 + L + 0.0f;
                    kt0Var.setTranslationX(L2);
                    kt0Var.setTranslationY(f16);
                    float f17 = chatActivityEnterView.f31108p0.getLayoutParams().width;
                    if (chatActivityEnterView.f31113p5) {
                        f10 = chatActivityEnterView.f31108p0.getScaleX();
                    } else {
                        f10 = 1.0f;
                    }
                    float L3 = (f17 * f10) / org.telegram.messenger.g0.L(40.0f);
                    kt0Var.setPivotX(0.0f);
                    kt0Var.setPivotY(0.0f);
                    kt0Var.setScaleX(0.75f);
                    kt0Var.setScaleY(0.75f);
                    kt0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.oe(kt0Var, bn0Var));
                    dialog.show();
                    if (!chatActivityEnterView.f31113p5) {
                        f11 = 1.0f;
                        chatActivityEnterView.f31108p0.setScaleX(1.0f);
                        chatActivityEnterView.f31108p0.setScaleY(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    chatActivityEnterView.f31108p0.setAlpha(f11);
                    org.telegram.ui.Components.ne neVar = chatActivityEnterView.f31114q0;
                    boolean z17 = chatActivityEnterView.f31113p5;
                    r1.b bVar = r1.g.f54265q;
                    if (z17) {
                        c10 = 4;
                        f12 = 0.5f;
                        gVar = null;
                    } else {
                        c10 = 4;
                        gVar = new r1.g(chatActivityEnterView.f31108p0, bVar);
                        f12 = 0.5f;
                        gVar.f54280m = org.telegram.ui.Cells.f1.o(0.5f, 750.0f, f11);
                    }
                    boolean z18 = chatActivityEnterView.f31113p5;
                    r1.b bVar2 = r1.g.f54266r;
                    if (z18) {
                        f13 = f15;
                        gVar2 = null;
                    } else {
                        f13 = f15;
                        gVar2 = new r1.g(chatActivityEnterView.f31108p0, bVar2);
                        gVar2.f54280m = org.telegram.ui.Cells.f1.o(f12, 750.0f, f11);
                    }
                    r1.g gVar3 = new r1.g(chatActivityEnterView.f31108p0, r1.g.v);
                    gVar3.f54280m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, f11);
                    r1.c cVar = new r1.c() {
                        @Override
                        public final void a(r1.g gVar4, boolean z19, float f18, float f19) {
                            int i26 = r6;
                            float f20 = f13;
                            float f21 = f14;
                            kt0 kt0Var2 = kt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i26) {
                                case 0:
                                    int i27 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        kt0Var2.setTranslationX(f21);
                                        kt0Var2.setTranslationY(f20);
                                        dn0 dn0Var = chatActivityEnterView2.f31108p0;
                                        dn0Var.getClass();
                                        dn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f31113p5) {
                                            chatActivityEnterView2.f31108p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f31108p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f31108p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f31108p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i28 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        kt0Var2.setTranslationX(f21);
                                        kt0Var2.setTranslationY(f20);
                                        dn0 dn0Var2 = chatActivityEnterView2.f31108p0;
                                        dn0Var2.getClass();
                                        dn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f31113p5) {
                                            chatActivityEnterView2.f31108p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f31108p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f31108p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f31108p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    float f18 = f13;
                    gVar3.a(cVar);
                    r1.g gVar4 = new r1.g(kt0Var, r1.g.f54263o);
                    gVar4.f54271b = c8.j9.a(L2, f14 - org.telegram.messenger.g0.L(6.0f), L2);
                    gVar4.f54272c = true;
                    gVar4.f54280m = org.telegram.ui.Cells.f1.o(f14, 700.0f, 0.75f);
                    gVar4.h = f14 - org.telegram.messenger.g0.L(6.0f);
                    r1.g gVar5 = new r1.g(kt0Var, r1.g.f54264p);
                    gVar5.f54271b = c8.j9.a(f16, f16, org.telegram.messenger.g0.L(6.0f) + f18);
                    gVar5.f54272c = true;
                    gVar5.f54280m = org.telegram.ui.Cells.f1.o(f18, 700.0f, 0.75f);
                    gVar5.f54275g = org.telegram.messenger.g0.L(6.0f) + f18;
                    gVar5.b(new org.telegram.ui.Components.re(f18, kt0Var));
                    gVar5.a(new r1.c() {
                        @Override
                        public final void a(r1.g gVar42, boolean z19, float f182, float f19) {
                            int i26 = r6;
                            float f20 = f13;
                            float f21 = f14;
                            kt0 kt0Var2 = kt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i26) {
                                case 0:
                                    int i27 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        kt0Var2.setTranslationX(f21);
                                        kt0Var2.setTranslationY(f20);
                                        dn0 dn0Var = chatActivityEnterView2.f31108p0;
                                        dn0Var.getClass();
                                        dn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f31113p5) {
                                            chatActivityEnterView2.f31108p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f31108p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f31108p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f31108p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i28 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        kt0Var2.setTranslationX(f21);
                                        kt0Var2.setTranslationY(f20);
                                        dn0 dn0Var2 = chatActivityEnterView2.f31108p0;
                                        dn0Var2.getClass();
                                        dn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.f31113p5) {
                                            chatActivityEnterView2.f31108p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f31108p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f31108p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f31108p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    r1.g gVar6 = new r1.g(kt0Var, bVar);
                    gVar6.f54280m = org.telegram.ui.Cells.f1.o(L3, 1000.0f, 1.0f);
                    r1.g gVar7 = new r1.g(kt0Var, bVar2);
                    gVar7.f54280m = org.telegram.ui.Cells.f1.o(L3, 1000.0f, 1.0f);
                    r1.g[] gVarArr = new r1.g[7];
                    gVarArr[0] = gVar;
                    gVarArr[1] = gVar2;
                    gVarArr[2] = gVar3;
                    gVarArr[3] = gVar4;
                    gVarArr[c10] = gVar5;
                    gVarArr[5] = gVar6;
                    gVarArr[6] = gVar7;
                    neVar.l(gVarArr);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                long j3 = bnVar.V;
                final org.telegram.ui.Components.f2 f2Var2 = new org.telegram.ui.Components.f2(10, bnVar, (View) obj2);
                org.telegram.messenger.rc rcVar2 = new org.telegram.messenger.rc(27);
                int i26 = org.telegram.ui.ActionBar.l6.f27973j5;
                if (g6Var != null) {
                    x02 = g6Var.f(i26);
                } else {
                    x02 = org.telegram.ui.ActionBar.l6.x0(null, i26, false);
                }
                int i27 = org.telegram.ui.ActionBar.l6.f27938h5;
                if (g6Var != null) {
                    x03 = g6Var.f(i27);
                } else {
                    x03 = org.telegram.ui.ActionBar.l6.x0(null, i27, false);
                }
                int i28 = org.telegram.ui.ActionBar.l6.xj;
                if (g6Var != null) {
                    g6Var.f(i28);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.l6.Bj;
                if (g6Var != null) {
                    g6Var.f(i29);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.l6.E8;
                if (g6Var != null) {
                    g6Var.f(i30);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.l6.G8;
                if (g6Var != null) {
                    g6Var.f(i31);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.l6.f27957i6;
                if (g6Var != null) {
                    g6Var.f(i32);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.l6.Gi;
                if (g6Var != null) {
                    x04 = g6Var.f(i33);
                } else {
                    x04 = org.telegram.ui.ActionBar.l6.x0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.l6.Ci;
                if (g6Var != null) {
                    x05 = g6Var.f(i34);
                } else {
                    x05 = org.telegram.ui.ActionBar.l6.x0(null, i34, false);
                }
                int i35 = org.telegram.ui.ActionBar.l6.Ei;
                if (g6Var != null) {
                    g6Var.f(i35);
                } else {
                    org.telegram.ui.ActionBar.l6.x0(null, i35, false);
                }
                Pattern pattern = org.telegram.ui.Components.v4.f38913a;
                if (context != null) {
                    final int M1 = (int) org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24942x7.E.M1(TimeUnit.SECONDS);
                    final h9.f1 f1Var = new h9.f1(context, g6Var);
                    ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28656v0 = false;
                    final org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(context, g6Var);
                    ib0Var.setTextColor(x02);
                    ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                    ib0Var.setItemCount(5);
                    final ?? ib0Var2 = new org.telegram.ui.Components.ib0(context, g6Var);
                    ib0Var2.setWrapSelectorWheel(true);
                    ib0Var2.setAllItemsCount(24);
                    ib0Var2.setItemCount(5);
                    ib0Var2.setTextColor(x02);
                    ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                    final ?? ib0Var3 = new org.telegram.ui.Components.ib0(context, g6Var);
                    ib0Var3.setWrapSelectorWheel(true);
                    ib0Var3.setAllItemsCount(60);
                    ib0Var3.setItemCount(5);
                    ib0Var3.setTextColor(x02);
                    ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Components.p3 p3Var2 = new org.telegram.ui.Components.p3(context, ib0Var, ib0Var2, ib0Var3, 3);
                    p3Var2.setOrientation(1);
                    frameLayout2.addView(p3Var2, c8.ha.c(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context), c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    p3Var2.addView(frameLayout3, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(org.telegram.messenger.id.M0(2131744827, null));
                    textView2.setTextColor(x02);
                    com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
                    frameLayout3.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new ei.b(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    p3Var2.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28104q5, g6Var);
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.md mdVar = new bi.md(context, 16);
                    mdVar.setText(org.telegram.messenger.id.M0(2131744828, null));
                    c8.ka.b(mdVar, 0.02f, 1.2f);
                    linearLayout.addView(ib0Var, c8.ha.l(0.5f, 0, 270));
                    ib0Var.setMinValue(0);
                    ib0Var.setMaxValue(365);
                    ib0Var.setWrapSelectorWheel(false);
                    ib0Var.setFormatter(new br(23));
                    bi.i6 i6Var = new bi.i6(M1, ib0Var, (org.telegram.ui.Components.z3) ib0Var2, (org.telegram.ui.Components.a4) ib0Var3, textView3);
                    ib0Var.setOnValueChangedListener(i6Var);
                    ib0Var2.setMinValue(0);
                    ib0Var2.setMaxValue(23);
                    int i36 = x03;
                    linearLayout.addView((View) ib0Var2, c8.ha.l(0.2f, 0, 270));
                    ib0Var2.setFormatter(new br(24));
                    ib0Var2.setOnValueChangedListener(i6Var);
                    ib0Var3.setMinValue(0);
                    ib0Var3.setMaxValue(59);
                    ib0Var3.setValue(0);
                    ib0Var3.setFormatter(new br(25));
                    linearLayout.addView((View) ib0Var3, c8.ha.l(0.3f, 0, 270));
                    ib0Var3.setOnValueChangedListener(i6Var);
                    if (j3 > 0 && j3 != 2147483646) {
                        rcVar = rcVar2;
                        long j10 = j3 * 1000;
                        p3Var = p3Var2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i14 = x05;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            ib0Var3.setValue(calendar.get(12));
                            ib0Var2.setValue(calendar.get(11));
                            ib0Var.setValue(timeInMillis);
                        }
                    } else {
                        rcVar = rcVar2;
                        p3Var = p3Var2;
                        i14 = x05;
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.v4.g(null, null, 0L, M1, 3, ib0Var, ib0Var2, ib0Var3);
                    org.telegram.ui.Components.v4.e(textView3, ib0Var, ib0Var2, ib0Var3);
                    mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    mdVar.setGravity(17);
                    mdVar.setTextColor(x04);
                    mdVar.setTextSize(1, 14.0f);
                    mdVar.setTypeface(org.telegram.messenger.g0.o());
                    mdVar.setBackground(org.telegram.ui.ActionBar.a6.e(i14, 24.0f));
                    p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 14, 15, 14, 16));
                    mdVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            ib0 ib0Var4 = ib0Var;
                            z3 z3Var = ib0Var2;
                            a4 a4Var = ib0Var3;
                            boolean g10 = v4.g(null, null, 0L, M1, 3, ib0Var4, z3Var, a4Var);
                            v4.e(textView3, ib0Var4, z3Var, a4Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ib0Var4.getValue());
                            calendar2.set(11, z3Var.getValue());
                            calendar2.set(12, a4Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            f2Var2.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28660x0.run();
                        }
                    });
                    p3Var.addView(textView3, c8.ha.t(-1, -2, 83, 14, 0, 14, 16));
                    org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
                    v2Var.N = frameLayout2;
                    v2Var.show();
                    v2Var.setOnDismissListener(new org.telegram.ui.Components.d2(0, rcVar, zArr2));
                    v2Var.v0(i36);
                    v2Var.O(i36);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.dx dxVar = (org.telegram.ui.Components.dx) obj4;
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = (org.telegram.ui.ActionBar.u1[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                h9.f1 f1Var2 = (h9.f1) obj;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((org.telegram.ui.Components.hx) dxVar.f33180c.f2833b).F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    ((org.telegram.ui.ActionBar.v2) f1Var2.f14323b).f28660x0.run();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.ay ayVar = (org.telegram.ui.Components.ay) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = ayVar.f32015s;
                org.telegram.ui.Components.cy cyVar = ayVar.f32017x;
                if (cyVar.M == ayVar.f32009b) {
                    cyVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(ayVar.f32008a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i17 < size3) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i17);
                            if (ayVar.f32016w.indexOfKey(document.f26962id) < 0) {
                                arrayList7.add(document);
                            }
                            i17++;
                        }
                        if (size2 != arrayList7.size()) {
                            ayVar.f32012f.put(arrayList7, cyVar.N);
                            if (size2 == 0) {
                                ayVar.h.add(arrayList7);
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.wz wzVar = (org.telegram.ui.Components.wz) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                wzVar.f40256r2 = -1;
                org.telegram.ui.ActionBar.f2 f2Var3 = wzVar.f36305o1;
                iz.x0((TLRPC.TL_error) obj3, f2Var3, org.telegram.ui.Components.hc.a0(f2Var3));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i16 = ((TL_update.TL_updateDialogFilter) update).f27213id;
                            }
                        } else {
                            while (true) {
                                if (i17 < arrayList8.size()) {
                                    if (arrayList8.get(i17) instanceof TL_update.TL_updateDialogFilter) {
                                        i16 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i17)).f27213id;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                    if (wzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        f2Var3.getMessagesController().c3(true, new hi.d4(wzVar, c20Var, i16, 4));
                        return;
                    }
                    if (wzVar.S1 != null) {
                        f2Var3.getMessagesController().H(wzVar.Q1, true);
                    }
                    wzVar.f40257s2 = true;
                    wzVar.dismiss();
                    c20Var.a(Integer.valueOf(i16));
                    return;
                }
                wzVar.d2.a(false);
                return;
            case 22:
                a();
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                d();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                yw ywVar = (yw) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.g6 resourceProvider = ywVar.getResourceProvider();
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(7, (org.telegram.ui.Components.zl0) obj4, tL_sponsoredPeer);
                int i37 = ry0.f49634s1;
                int currentAccount = ywVar.getCurrentAccount();
                Activity parentActivity = ywVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.nx(parentActivity, resourceProvider, bArr, ywVar, w80Var, currentAccount));
                }
                l60Var.u();
                return;
        }
    }

    public m6(Object obj, boolean[] zArr, Object obj2, Object obj3, int i7) {
        this.f47775a = i7;
        this.f47776b = obj;
        this.f47777c = zArr;
        this.d = obj2;
        this.f47778e = obj3;
    }
}
