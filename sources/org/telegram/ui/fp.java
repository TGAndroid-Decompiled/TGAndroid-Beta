package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fp implements Runnable {
    public final int f37200a;
    public final Object f37201b;
    public final Object f37202c;
    public final Object d;
    public final Object e;

    public fp(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f37200a = i10;
        this.f37201b = callback;
        this.d = obj;
        this.f37202c = obj2;
        this.e = obj3;
    }

    private final void a() {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f37201b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37202c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
        org.telegram.ui.Components.ew0 ew0Var = z20Var.f26093q1;
        a0.h hVar3 = z20Var.R1;
        a0.h hVar4 = z20Var.S1;
        ArrayList arrayList2 = z20Var.O1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            org.telegram.messenger.wp.r1(z20Var.f21584a).V3(tL_channels_channelParticipants.users, false);
            org.telegram.messenger.wp.r1(z20Var.f21584a).P3(tL_channels_channelParticipants.chats, false);
            long e = org.telegram.messenger.e20.i(z20Var.f21584a).e();
            int i11 = 0;
            while (true) {
                if (i11 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                } else if (org.telegram.messenger.kj.C1(tL_channels_channelParticipants.participants.get(i11).peer) == e) {
                    tL_channels_channelParticipants.participants.remove(i11);
                    break;
                } else {
                    i11++;
                }
            }
            z20Var.L1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = z20Var.P1;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                hVar.k(channelParticipant, org.telegram.messenger.kj.C1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                long C1 = org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) arrayList2.get(i13)).peer);
                if (hVar4.f(C1) != null || ((hVar2 = z20Var.V1) != null && hVar2.h(C1) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(z20Var.f21584a).Z1(Long.valueOf(C1));
                if ((Z1 != null && Z1.bot) || org.telegram.messenger.i20.x(Z1)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i13);
                    hVar3.l(C1);
                    i13--;
                    size2--;
                }
                i13++;
            }
            try {
                if (z20Var.N1.participants_count <= 200) {
                    Collections.sort(arrayList, new rq(z20Var, ConnectionsManager.getInstance(z20Var.f21584a).getCurrentTime(), 1));
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        if (z20Var.L1 <= 0) {
            z20Var.T1 = false;
            z20Var.U1 = true;
            if (z20Var.f32980h2 == 1) {
                i10 = 1;
            } else {
                org.telegram.ui.Components.tk0 tk0Var = z20Var.f26089m1;
                if (tk0Var != null) {
                    i10 = tk0Var.b() - 1;
                } else {
                    i10 = 0;
                }
            }
            z20Var.O0(i10);
            if (arrayList2.isEmpty()) {
                z20Var.Y1 = true;
                z20Var.R0();
            }
        }
        z20Var.T0();
        org.telegram.ui.Components.tk0 tk0Var2 = z20Var.f26089m1;
        if (tk0Var2 != null) {
            tk0Var2.f();
            if (ew0Var != null && z20Var.f26089m1.b() == 0 && z20Var.U1) {
                ew0Var.e(false, true);
            }
        }
    }

    private final void b() {
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) this.f37201b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.f37202c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        j80Var.D = false;
        j80Var.L = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            j80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void c() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37201b;
        vh.d dVar = (vh.d) this.f37202c;
        p6 p6Var = (p6) this.d;
        Runnable runnable = (Runnable) this.e;
        if (tL_error != null) {
            org.telegram.ui.Components.cc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        p6Var.dismiss();
        org.telegram.messenger.m5.n(null, 2131747058, org.telegram.ui.Components.cc.X(), 2131623981, 36);
        runnable.run();
    }

    private final void d() {
        zx zxVar = (zx) this.f37202c;
        zxVar.showDialog(new org.telegram.ui.Components.e30((Context) this.d, zxVar.getResourceProvider(), new org.telegram.ui.Components.hi0(2, (org.telegram.ui.Components.an0) this.f37201b, zxVar)));
        ((org.telegram.ui.Components.z60) this.e).u();
    }

    private final void f() {
        zx zxVar = (zx) this.f37202c;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.d;
        org.telegram.ui.Components.z60 z60Var = (org.telegram.ui.Components.z60) this.e;
        byte[] bArr = tL_sponsoredPeer.random_id;
        org.telegram.ui.ActionBar.p6 resourceProvider = zxVar.getResourceProvider();
        org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(1, (org.telegram.ui.Components.an0) this.f37201b, tL_sponsoredPeer);
        int i10 = b01.f35885s1;
        int currentAccount = zxVar.getCurrentAccount();
        Activity parentActivity = zxVar.getParentActivity();
        if (parentActivity != null) {
            TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
            tL_messages_reportSponsoredMessage.random_id = bArr;
            tL_messages_reportSponsoredMessage.option = new byte[0];
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.zx(parentActivity, resourceProvider, bArr, zxVar, hi0Var, currentAccount));
        }
        z60Var.u();
    }

    private final void g() {
        ((AtomicReference) this.f37202c).set(null);
        ((org.telegram.ui.Components.yo0) this.d).didReceivedNotification(org.telegram.messenger.at.f14771q5, ((org.telegram.ui.Components.pp0) this.f37201b).f21584a, Long.valueOf(-((TLRPC.Dialog) this.e).f19798id));
    }

    private final void h() {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.Components.dx0 dx0Var = (org.telegram.ui.Components.dx0) this.f37201b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37202c;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.messenger.vi viVar = (org.telegram.messenger.vi) this.e;
        boolean z10 = false;
        dx0Var.W1 = 0;
        if (tL_error == null) {
            org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(dx0Var, 1);
            sl0Var.addTarget(dx0Var.f21587b);
            TransitionManager.beginDelayedTransition(dx0Var.f21590c, sl0Var);
            dx0Var.f25627o1.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            dx0Var.J1 = tL_messages_stickerSet;
            viVar.I1(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dx0Var.J1;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                dx0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = dx0Var.J1;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            dx0Var.Y1 = z10;
            dx0Var.J0();
            viVar.q1(dx0Var.J1);
            dx0Var.a1();
            dx0Var.Z0();
            dx0Var.Y0();
            dx0Var.f25621k1.f();
            return;
        }
        dx0Var.dismiss();
        org.telegram.ui.ActionBar.k2 k2Var = dx0Var.C1;
        if (k2Var != null) {
            org.telegram.messenger.m5.o(null, 2131754385, org.telegram.ui.Components.cc.a0(k2Var), null);
        }
    }

    private final void i() {
        xp0 xp0Var = (xp0) this.f37201b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37202c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) this.e;
        xp0Var.W1 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                xp0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                xp0Var.M1 = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f19814id = stickerSet.f19821id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                xp0Var.R0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                xp0Var.N1 = arrayList;
                arrayList.addAll(vector.objects);
                xp0Var.f25619j1.setLayoutParams(w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                xp0Var.f25626n1.setVisibility(8);
                xp0Var.A1[0].setVisibility(8);
                xp0Var.f25621k1.f();
                return;
            }
        }
        org.telegram.ui.Components.s4.e0(xp0Var.f21584a, tL_error, xp0Var.C1, tL_messages_getAttachedStickers, new Object[0]);
        xp0Var.dismiss();
    }

    private final void j() {
        org.telegram.ui.Components.qz0 qz0Var = (org.telegram.ui.Components.qz0) this.f37201b;
        org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f37202c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.messenger.wp.r1(qz0Var.d).x3(0);
        } else if (tL_error == null || tL_error.code != -1000) {
            String L0 = org.telegram.messenger.dd.L0(2131751106, null);
            if (tL_error != null) {
                StringBuilder i10 = sc.e.i(L0, "\n");
                i10.append(tL_error.text);
                L0 = i10.toString();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qz0Var.getContext());
            String L02 = org.telegram.messenger.dd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
            x1Var2.R = L02;
            x1Var2.T = L0;
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
        }
    }

    private final void k() {
        org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) this.f37201b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
        ((org.telegram.ui.Components.z60) this.f37202c).u();
        ((org.telegram.messenger.wp) this.d).f19234r7.t(-p21Var.f29330f, tL_forumTopic.f19846id, !tL_forumTopic.pinned, p21Var.f29339s);
    }

    private final void l() {
        org.telegram.ui.Components.n31 n31Var = (org.telegram.ui.Components.n31) this.f37201b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37202c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
        org.telegram.ui.Components.y21 y21Var = n31Var.f28658v1;
        org.telegram.ui.Components.m31 m31Var = n31Var.E1;
        n31Var.f28646i1 = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            n31Var.X0();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                n31Var.L1 = false;
                TLRPC.TL_textWithEntities P0 = org.telegram.ui.Components.n31.P0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                org.telegram.messenger.kj.b(valueOf, P0.entities, false, true, false, false, 0);
                n31Var.f28659w1.setText(n31Var.Q0(valueOf));
                m31Var.D(y21Var);
                return;
            }
        }
        if (n31Var.L1) {
            n31Var.dismiss();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.P4, 1, org.telegram.messenger.dd.L0(2131743971, null));
            return;
        }
        org.telegram.messenger.m5.o(null, 2131743971, new org.telegram.ui.Components.cc((FrameLayout) n31Var.f21587b, n31Var.I0), null);
        org.telegram.ui.Components.j31 j31Var = n31Var.f28656t1.e;
        String str = n31Var.f28655s1;
        n31Var.f28654r1 = str;
        j31Var.setText(org.telegram.ui.Components.n31.O0(str, null, null));
        m31Var.D(y21Var);
    }

    private final void m() {
        long j10;
        a50 a50Var = (a50) this.f37201b;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f37202c;
        TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) this.e;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        org.telegram.messenger.u3 u3Var = new org.telegram.messenger.u3();
        a50Var.R2 = u3Var;
        u3Var.f18361b = new TLRPC.TL_groupCall();
        org.telegram.messenger.u3 u3Var2 = a50Var.R2;
        TLRPC.GroupCall groupCall = u3Var2.f18361b;
        groupCall.participants_count = 0;
        groupCall.version = 1;
        groupCall.can_start_video = true;
        groupCall.can_change_join_muted = true;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = chat.f19794id;
        }
        u3Var2.f18362c = j10;
        groupCall.schedule_date = a50Var.f35584b4;
        groupCall.flags |= 128;
        u3Var2.C = cVar;
        u3Var2.x(inputPeer);
        org.telegram.messenger.u3 u3Var3 = a50Var.R2;
        TLRPC.GroupCall groupCall2 = u3Var3.f18361b;
        TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
        groupCall2.access_hash = groupCall3.access_hash;
        groupCall2.f19804id = groupCall3.f19804id;
        u3Var3.e();
        org.telegram.ui.Components.z10 z10Var = a50Var.f35604g4;
        org.telegram.messenger.u3 u3Var4 = a50Var.R2;
        z10Var.f32961c = u3Var4;
        a50Var.R3.setGroupCall(u3Var4);
        d50 d50Var = a50Var.f35600f4;
        org.telegram.messenger.u3 u3Var5 = a50Var.R2;
        d50Var.f36487c = u3Var5;
        a50Var.T1.D0(cVar.f15043a, u3Var5.g(false));
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(cVar.f15043a);
        org.telegram.messenger.u3 u3Var6 = a50Var.R2;
        r12.T3(u3Var6.f18362c, u3Var6);
    }

    private final void n() {
        a50 a50Var = (a50) this.f37201b;
        org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.d;
        String str = (String) this.e;
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((HashSet) this.f37202c).iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (u3Var != null) {
                u3Var.t(longValue);
            }
            arrayList.add(org.telegram.messenger.wp.r1(a50Var.f21584a).Z1(l4));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.f20002id;
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(a50Var.f21584a);
            arrayList4.add(r12.p1(r12.Z1(l4)));
        }
        ag.e3 e3Var = new ag.e3(a50Var, arrayList, arrayList2, arrayList3, str, 26);
        if (org.telegram.messenger.e20.i(a50Var.f21584a).q()) {
            e3Var.run();
        } else {
            ConnectionsManager.getInstance(a50Var.f21584a).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, e3Var, 13));
        }
    }

    private final void o() {
        TLObject tLObject = (TLObject) this.f37201b;
        ArrayList arrayList = (ArrayList) this.f37202c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ag.e3 e3Var = (ag.e3) this.e;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i10 = 0; i10 < Math.min(arrayList.size(), vector.objects.size()); i10++) {
                if (vector.objects.get(i10) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i10)).f19943id));
                }
            }
        }
        e3Var.run();
    }

    @Override
    public final void run() {
        int i10;
        pr prVar;
        or orVar;
        ArrayList arrayList;
        String[] strArr;
        int i11;
        int i12;
        long C1;
        ArrayList arrayList2;
        String lowerCase;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean z11;
        float f7;
        float f10;
        float f11;
        o1.j jVar;
        float f12;
        o1.j jVar2;
        boolean z12;
        boolean[] zArr;
        boolean z13;
        int x02;
        int x03;
        int x04;
        int x05;
        org.telegram.messenger.c cVar;
        TLRPC.VideoSize videoSize;
        boolean z14;
        String str4;
        int i13 = this.f37200a;
        int i14 = -1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f37202c;
        Object obj4 = this.f37201b;
        switch (i13) {
            case 0:
                qp.b0((qp) obj4, (org.telegram.ui.ActionBar.x1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.k2) obj);
                return;
            case 1:
                iq iqVar = (iq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                iqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    iqVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 2:
                pr prVar2 = (pr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                sq sqVar = (sq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    sqVar.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(prVar2.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131689472, "AppName");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131754350, org.telegram.messenger.i20.p(user));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, "OK"), new y0(sqVar, 25));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                prVar2.showDialog(x1Var);
                return;
            case 3:
                or orVar2 = (or) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                pr prVar3 = orVar2.D;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.i0.g3(new ag.e3(orVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList()));
                    return;
                }
                String R0 = org.telegram.messenger.dd.D0().R0(lowerCase2, true, false);
                R0 = (lowerCase2.equals(R0) || R0.length() == 0) ? null : null;
                if (R0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i15 = i10 + 1;
                String[] strArr2 = new String[i15];
                strArr2[0] = lowerCase2;
                if (R0 != null) {
                    strArr2[1] = R0;
                }
                ArrayList arrayList5 = new ArrayList();
                a0.h hVar = new a0.h();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLObject tLObject3 = (TLObject) arrayList3.get(i16);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            prVar = prVar3;
                            orVar = orVar2;
                            C1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            prVar = prVar3;
                            orVar = orVar2;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                C1 = org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            } else {
                                arrayList = arrayList3;
                                strArr = strArr2;
                                i11 = size;
                                i12 = i16;
                                i16 = i12 + 1;
                                prVar3 = prVar;
                                orVar2 = orVar;
                                strArr2 = strArr;
                                size = i11;
                                arrayList3 = arrayList;
                            }
                        }
                        if (C1 > 0) {
                            TLRPC.User Z1 = prVar.getMessagesController().Z1(Long.valueOf(C1));
                            arrayList2 = arrayList3;
                            if (Z1.f19943id == prVar.getUserConfig().e()) {
                                strArr = strArr2;
                                i11 = size;
                                i12 = i16;
                                arrayList = arrayList2;
                                i16 = i12 + 1;
                                prVar3 = prVar;
                                orVar2 = orVar;
                                strArr2 = strArr;
                                size = i11;
                                arrayList3 = arrayList;
                            } else {
                                String lowerCase3 = org.telegram.messenger.i20.p(Z1).toLowerCase();
                                String n10 = org.telegram.messenger.i20.n(Z1);
                                String str5 = Z1.first_name;
                                i11 = size;
                                str3 = Z1.last_name;
                                str = str5;
                                lowerCase = lowerCase3;
                                strArr = strArr2;
                                str2 = n10;
                                z10 = false;
                            }
                        } else {
                            arrayList2 = arrayList3;
                            TLRPC.Chat L02 = prVar.getMessagesController().L0(Long.valueOf(-C1));
                            lowerCase = L02.title.toLowerCase();
                            z10 = false;
                            String K = org.telegram.messenger.w3.K(L02, false);
                            str = L02.title;
                            strArr = strArr2;
                            str2 = K;
                            i11 = size;
                            str3 = null;
                        }
                        i12 = i16;
                        arrayList = arrayList2;
                        String R02 = org.telegram.messenger.dd.D0().R0(lowerCase, true, z10);
                        if (lowerCase.equals(R02)) {
                            R02 = null;
                        }
                        int i17 = 0;
                        boolean z15 = false;
                        while (true) {
                            if (i17 < i15) {
                                int i18 = i17;
                                String str6 = strArr[i18];
                                if (!lowerCase.startsWith(str6) && !sc.e.y(" ", str6, lowerCase) && (R02 == null || (!R02.startsWith(str6) && !sc.e.y(" ", str6, R02)))) {
                                    if (str2 != null && str2.startsWith(str6)) {
                                        z15 = true;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (z15) {
                                    if (z15) {
                                        arrayList6.add(org.telegram.messenger.i0.r0(str, str3, str6));
                                    } else {
                                        arrayList6.add(org.telegram.messenger.i0.r0(sc.e.h("@", str2), null, "@" + str6));
                                    }
                                    arrayList7.add(tLObject3);
                                } else {
                                    i17 = i18 + 1;
                                }
                            }
                        }
                        i16 = i12 + 1;
                        prVar3 = prVar;
                        orVar2 = orVar;
                        strArr2 = strArr;
                        size = i11;
                        arrayList3 = arrayList;
                    }
                }
                pr prVar4 = prVar3;
                or orVar3 = orVar2;
                String[] strArr3 = strArr2;
                if (arrayList4 != null) {
                    for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                        TLRPC.User Z12 = prVar4.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i19)).user_id));
                        if (Z12.f19943id != prVar4.getUserConfig().e()) {
                            String lowerCase4 = org.telegram.messenger.i20.p(Z12).toLowerCase();
                            String R03 = org.telegram.messenger.dd.D0().R0(lowerCase4, true, false);
                            if (lowerCase4.equals(R03)) {
                                R03 = null;
                            }
                            int i20 = 0;
                            boolean z16 = false;
                            while (true) {
                                if (i20 < i15) {
                                    String str7 = strArr3[i20];
                                    if (!lowerCase4.startsWith(str7) && !sc.e.y(" ", str7, lowerCase4) && (R03 == null || (!R03.startsWith(str7) && !sc.e.y(" ", str7, R03)))) {
                                        String n11 = org.telegram.messenger.i20.n(Z12);
                                        if (n11 != null && n11.startsWith(str7)) {
                                            z16 = true;
                                        }
                                    } else {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        if (z16) {
                                            arrayList6.add(org.telegram.messenger.i0.r0(Z12.first_name, Z12.last_name, str7));
                                        } else {
                                            arrayList6.add(org.telegram.messenger.i0.r0("@" + org.telegram.messenger.i20.n(Z12), null, "@" + str7));
                                        }
                                        arrayList5.add(Z12);
                                        hVar.k(Z12, Z12.f19943id);
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new ag.e3(orVar3, arrayList5, hVar, arrayList6, arrayList7));
                return;
            case 4:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.g0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.p6) obj).show();
                return;
            case 5:
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) obj4;
                nc ncVar = (nc) obj2;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj3;
                View view = (View) obj;
                String trim = r4Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase5 = parse.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    ncVar.a(lowerCase5);
                    org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
                    if (x1Var2 != null) {
                        x1Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                org.telegram.messenger.i0.E3(r4Var);
                return;
            case 6:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr4 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131748521, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i21 = 0;
                while (true) {
                    if (i21 < iArr.length) {
                        if (iArr2[0] == iArr[i21]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i21]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i21++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q()) {
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131230873, 0);
                    dqVar.G = 0.7f;
                    dqVar.f25568r = org.telegram.messenger.i0.L(-1.33f);
                    dqVar.f25569s = org.telegram.messenger.i0.L(0.0f);
                    dqVar.f25571x = 0.75f;
                    spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(2131231975, 0);
                    dqVar2.G = 0.7f;
                    dqVar2.f25568r = org.telegram.messenger.i0.L(-1.33f);
                    dqVar2.f25569s = org.telegram.messenger.i0.L(0.0f);
                    dqVar2.f25571x = 0.75f;
                    spannableStringBuilder.setSpan(dqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 7:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.mu0 mu0Var = (org.telegram.ui.Components.mu0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.co0 co0Var = (org.telegram.ui.Components.co0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.f23770q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), 2131755354);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(mu0Var, w7.b6.e(40, 40, 3));
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
                    if (org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, true) == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.i0.p3(dialog, z11);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, true)) >= 0.721f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.messenger.i0.m3(dialog, z12);
                    }
                    chatActivityEnterView.f23784s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f23784s0;
                    chatActivityEnterView.f23765p0.getLocationInWindow(iArr4);
                    float f13 = iArr4[0];
                    final float f14 = iArr4[1];
                    float L = org.telegram.messenger.i0.L(5.0f);
                    float L2 = iArr3[0] + chatActivityEnterView.f23784s0 + L + org.telegram.messenger.i0.L(4.0f) + 0.0f;
                    float f15 = iArr3[1] + chatActivityEnterView.f23789t0 + L + 0.0f;
                    mu0Var.setTranslationX(L2);
                    mu0Var.setTranslationY(f15);
                    float f16 = chatActivityEnterView.f23765p0.getLayoutParams().width;
                    if (chatActivityEnterView.p5) {
                        f7 = chatActivityEnterView.f23765p0.getScaleX();
                    } else {
                        f7 = 1.0f;
                    }
                    float L3 = (f16 * f7) / org.telegram.messenger.i0.L(40.0f);
                    mu0Var.setPivotX(0.0f);
                    mu0Var.setPivotY(0.0f);
                    mu0Var.setScaleX(0.75f);
                    mu0Var.setScaleY(0.75f);
                    mu0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.je(mu0Var, co0Var));
                    dialog.show();
                    if (!chatActivityEnterView.p5) {
                        f10 = 1.0f;
                        chatActivityEnterView.f23765p0.setScaleX(1.0f);
                        chatActivityEnterView.f23765p0.setScaleY(1.0f);
                    } else {
                        f10 = 1.0f;
                    }
                    chatActivityEnterView.f23765p0.setAlpha(f10);
                    org.telegram.ui.Components.ie ieVar = chatActivityEnterView.f23770q0;
                    boolean z17 = chatActivityEnterView.p5;
                    o1.c cVar2 = o1.j.f13944q;
                    if (z17) {
                        f11 = 0.5f;
                        jVar = null;
                    } else {
                        o1.j jVar3 = new o1.j(chatActivityEnterView.f23765p0, cVar2);
                        f11 = 0.5f;
                        jVar3.f13958m = org.telegram.ui.Cells.f1.p(0.5f, 750.0f, f10);
                        jVar = jVar3;
                    }
                    boolean z18 = chatActivityEnterView.p5;
                    o1.c cVar3 = o1.j.f13945r;
                    if (z18) {
                        f12 = f13;
                        jVar2 = null;
                    } else {
                        f12 = f13;
                        o1.j jVar4 = new o1.j(chatActivityEnterView.f23765p0, cVar3);
                        jVar4.f13958m = org.telegram.ui.Cells.f1.p(f11, 750.0f, f10);
                        jVar2 = jVar4;
                    }
                    o1.j jVar5 = new o1.j(chatActivityEnterView.f23765p0, o1.j.v);
                    jVar5.f13958m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, f10);
                    final float f17 = f12;
                    jVar5.a(new o1.f() {
                        @Override
                        public final void a(o1.j jVar6, boolean z19, float f18, float f19) {
                            int i22 = r6;
                            float f20 = f14;
                            float f21 = f17;
                            mu0 mu0Var2 = mu0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i22) {
                                case 0:
                                    int i23 = ChatActivityEnterView.f23673s5;
                                    if (dialog2.isShowing()) {
                                        mu0Var2.setTranslationX(f21);
                                        mu0Var2.setTranslationY(f20);
                                        eo0 eo0Var = chatActivityEnterView2.f23765p0;
                                        eo0Var.getClass();
                                        eo0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.f23765p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f23765p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f23765p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f23765p0.getViewTreeObserver().addOnPreDrawListener(new ke(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i24 = ChatActivityEnterView.f23673s5;
                                    if (dialog2.isShowing()) {
                                        mu0Var2.setTranslationX(f21);
                                        mu0Var2.setTranslationY(f20);
                                        eo0 eo0Var2 = chatActivityEnterView2.f23765p0;
                                        eo0Var2.getClass();
                                        eo0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.f23765p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f23765p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f23765p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f23765p0.getViewTreeObserver().addOnPreDrawListener(new ke(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.j jVar6 = new o1.j(mu0Var, o1.j.f13942o);
                    jVar6.f13950b = w7.u.a(L2, f17 - org.telegram.messenger.i0.L(6.0f), L2);
                    jVar6.f13951c = true;
                    jVar6.f13958m = org.telegram.ui.Cells.f1.p(f17, 700.0f, 0.75f);
                    jVar6.h = f17 - org.telegram.messenger.i0.L(6.0f);
                    o1.j jVar7 = new o1.j(mu0Var, o1.j.f13943p);
                    jVar7.f13950b = w7.u.a(f15, f15, org.telegram.messenger.i0.L(6.0f) + f14);
                    jVar7.f13951c = true;
                    jVar7.f13958m = org.telegram.ui.Cells.f1.p(f14, 700.0f, 0.75f);
                    jVar7.f13953g = org.telegram.messenger.i0.L(6.0f) + f14;
                    jVar7.b(new org.telegram.ui.Components.me(f14, mu0Var));
                    jVar7.a(new o1.f() {
                        @Override
                        public final void a(o1.j jVar62, boolean z19, float f18, float f19) {
                            int i22 = r6;
                            float f20 = f14;
                            float f21 = f17;
                            mu0 mu0Var2 = mu0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i22) {
                                case 0:
                                    int i23 = ChatActivityEnterView.f23673s5;
                                    if (dialog2.isShowing()) {
                                        mu0Var2.setTranslationX(f21);
                                        mu0Var2.setTranslationY(f20);
                                        eo0 eo0Var = chatActivityEnterView2.f23765p0;
                                        eo0Var.getClass();
                                        eo0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.f23765p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f23765p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f23765p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f23765p0.getViewTreeObserver().addOnPreDrawListener(new ke(chatActivityEnterView2, dialog2, 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i24 = ChatActivityEnterView.f23673s5;
                                    if (dialog2.isShowing()) {
                                        mu0Var2.setTranslationX(f21);
                                        mu0Var2.setTranslationY(f20);
                                        eo0 eo0Var2 = chatActivityEnterView2.f23765p0;
                                        eo0Var2.getClass();
                                        eo0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.f23765p0.setScaleX(1.0f);
                                            chatActivityEnterView2.f23765p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.f23765p0.setAlpha(1.0f);
                                        chatActivityEnterView2.f23765p0.getViewTreeObserver().addOnPreDrawListener(new ke(chatActivityEnterView2, dialog2, 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o1.j jVar8 = new o1.j(mu0Var, cVar2);
                    jVar8.f13958m = org.telegram.ui.Cells.f1.p(L3, 1000.0f, 1.0f);
                    o1.j jVar9 = new o1.j(mu0Var, cVar3);
                    jVar9.f13958m = org.telegram.ui.Cells.f1.p(L3, 1000.0f, 1.0f);
                    ieVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                long j10 = jnVar.V;
                final org.telegram.ui.Components.f2 f2Var = new org.telegram.ui.Components.f2(11, jnVar, (View) obj2);
                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(16);
                int i22 = org.telegram.ui.ActionBar.t6.f21038j5;
                if (p6Var != null) {
                    x02 = p6Var.f(i22);
                    zArr = null;
                    z13 = false;
                } else {
                    zArr = null;
                    z13 = false;
                    x02 = org.telegram.ui.ActionBar.t6.x0(null, i22, false);
                }
                int i23 = org.telegram.ui.ActionBar.t6.f21002h5;
                if (p6Var != null) {
                    x03 = p6Var.f(i23);
                } else {
                    x03 = org.telegram.ui.ActionBar.t6.x0(zArr, i23, z13);
                }
                int i24 = org.telegram.ui.ActionBar.t6.xj;
                if (p6Var != null) {
                    p6Var.f(i24);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i24, z13);
                }
                int i25 = org.telegram.ui.ActionBar.t6.Bj;
                if (p6Var != null) {
                    p6Var.f(i25);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i25, z13);
                }
                int i26 = org.telegram.ui.ActionBar.t6.E8;
                if (p6Var != null) {
                    p6Var.f(i26);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i26, z13);
                }
                int i27 = org.telegram.ui.ActionBar.t6.G8;
                if (p6Var != null) {
                    p6Var.f(i27);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i27, z13);
                }
                int i28 = org.telegram.ui.ActionBar.t6.f21021i6;
                if (p6Var != null) {
                    p6Var.f(i28);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i28, z13);
                }
                int i29 = org.telegram.ui.ActionBar.t6.Gi;
                if (p6Var != null) {
                    x04 = p6Var.f(i29);
                } else {
                    x04 = org.telegram.ui.ActionBar.t6.x0(zArr, i29, z13);
                }
                int i30 = org.telegram.ui.ActionBar.t6.Ci;
                if (p6Var != null) {
                    x05 = p6Var.f(i30);
                } else {
                    x05 = org.telegram.ui.ActionBar.t6.x0(zArr, i30, z13);
                }
                int i31 = org.telegram.ui.ActionBar.t6.Ei;
                if (p6Var != null) {
                    p6Var.f(i31);
                } else {
                    org.telegram.ui.ActionBar.t6.x0(zArr, i31, z13);
                }
                Pattern pattern = org.telegram.ui.Components.s4.f30174a;
                if (context != null) {
                    final int a2 = (int) org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19300y7.E.a(TimeUnit.SECONDS);
                    final l2.f fVar = new l2.f(context, p6Var);
                    ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21618v0 = false;
                    final org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(context, p6Var);
                    ac0Var.setTextColor(x02);
                    ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                    ac0Var.setItemCount(5);
                    final ?? ac0Var2 = new org.telegram.ui.Components.ac0(context, p6Var);
                    ac0Var2.setWrapSelectorWheel(true);
                    ac0Var2.setAllItemsCount(24);
                    ac0Var2.setItemCount(5);
                    ac0Var2.setTextColor(x02);
                    ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                    final ?? ac0Var3 = new org.telegram.ui.Components.ac0(context, p6Var);
                    ac0Var3.setWrapSelectorWheel(true);
                    ac0Var3.setAllItemsCount(60);
                    ac0Var3.setItemCount(5);
                    ac0Var3.setTextColor(x02);
                    ac0Var3.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context, ac0Var, ac0Var2, ac0Var3, 3);
                    n3Var.setOrientation(1);
                    frameLayout2.addView(n3Var, w7.b6.c(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context), w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    n3Var.addView(frameLayout3, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(org.telegram.messenger.dd.L0(2131744845, null));
                    textView2.setTextColor(x02);
                    sc.e.t(textView2, 1, 20.0f);
                    frameLayout3.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21170q5, p6Var);
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ag.j3 j3Var = new ag.j3(context, 13);
                    j3Var.setText(org.telegram.messenger.dd.L0(2131744846, null));
                    w7.e6.b(j3Var, 0.02f, 1.2f);
                    linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, 270));
                    ac0Var.setMinValue(0);
                    ac0Var.setMaxValue(365);
                    ac0Var.setWrapSelectorWheel(false);
                    ac0Var.setFormatter(new org.telegram.ui.Components.v1(7));
                    jg.q2 q2Var = new jg.q2(a2, ac0Var, (org.telegram.ui.Components.w3) ac0Var2, (org.telegram.ui.Components.x3) ac0Var3, textView3);
                    ac0Var.setOnValueChangedListener(q2Var);
                    ac0Var2.setMinValue(0);
                    ac0Var2.setMaxValue(23);
                    int i32 = x03;
                    linearLayout.addView((View) ac0Var2, w7.b6.l(0.2f, 0, 270));
                    ac0Var2.setFormatter(new org.telegram.ui.Components.v1(8));
                    ac0Var2.setOnValueChangedListener(q2Var);
                    ac0Var3.setMinValue(0);
                    ac0Var3.setMaxValue(59);
                    ac0Var3.setValue(0);
                    ac0Var3.setFormatter(new org.telegram.ui.Components.v1(9));
                    linearLayout.addView((View) ac0Var3, w7.b6.l(0.3f, 0, 270));
                    ac0Var3.setOnValueChangedListener(q2Var);
                    if (j10 > 0 && j10 != 2147483646) {
                        long j11 = 1000 * j10;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            ac0Var3.setValue(calendar.get(12));
                            ac0Var2.setValue(calendar.get(11));
                            ac0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.s4.g(null, null, 0L, a2, 3, ac0Var, ac0Var2, ac0Var3);
                    org.telegram.ui.Components.s4.e(textView3, ac0Var, ac0Var2, ac0Var3);
                    j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                    j3Var.setGravity(17);
                    j3Var.setTextColor(x04);
                    j3Var.setTextSize(1, 14.0f);
                    j3Var.setTypeface(org.telegram.messenger.i0.o());
                    j3Var.setBackground(org.telegram.ui.ActionBar.j6.e(x05, 24.0f));
                    n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 14, 15, 14, 16));
                    j3Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            ac0 ac0Var4 = ac0Var;
                            w3 w3Var = ac0Var2;
                            x3 x3Var = ac0Var3;
                            boolean g10 = s4.g(null, null, 0L, a2, 3, ac0Var4, w3Var, x3Var);
                            s4.e(textView3, ac0Var4, w3Var, x3Var);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ac0Var4.getValue());
                            calendar2.set(11, w3Var.getValue());
                            calendar2.set(12, x3Var.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            f2Var.K((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21622x0.run();
                        }
                    });
                    n3Var.addView(textView3, w7.b6.t(-1, -2, 83, 14, 0, 14, 16));
                    org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11588b;
                    z2Var.N = frameLayout2;
                    z2Var.show();
                    z2Var.setOnDismissListener(new org.telegram.ui.Components.d2(0, szVar, zArr2));
                    z2Var.v0(i32);
                    z2Var.P(i32);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.rx rxVar = (org.telegram.ui.Components.rx) obj4;
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = (org.telegram.ui.ActionBar.x1[]) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                l2.f fVar2 = (l2.f) obj;
                try {
                    x1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                x1VarArr2[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    gf.f.r(((org.telegram.ui.Components.ux) rxVar.f30097c.f1886b).F.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    ((org.telegram.ui.ActionBar.z2) fVar2.f11588b).f21622x0.run();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.py pyVar = (org.telegram.ui.Components.py) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = pyVar.f29569s;
                org.telegram.ui.Components.qy qyVar = pyVar.f29571x;
                if (qyVar.M == pyVar.f29564b) {
                    qyVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(pyVar.f29563a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList8.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        for (int i33 = 0; i33 < size3; i33++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i33);
                            if (pyVar.f29570w.indexOfKey(document.f19800id) < 0) {
                                arrayList8.add(document);
                            }
                        }
                        if (size2 != arrayList8.size()) {
                            pyVar.f29566f.put(arrayList8, qyVar.N);
                            if (size2 == 0) {
                                pyVar.h.add(arrayList8);
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.j00 j00Var = (org.telegram.ui.Components.j00) obj4;
                TLObject tLObject6 = (TLObject) obj2;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj;
                j00Var.f27234r2 = -1;
                org.telegram.ui.ActionBar.k2 k2Var = j00Var.f26727o1;
                h00.x0((TLRPC.TL_error) obj3, k2Var, org.telegram.ui.Components.cc.a0(k2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList9 = updates.updates;
                        if (!arrayList9.isEmpty()) {
                            int i34 = 0;
                            while (true) {
                                if (i34 < arrayList9.size()) {
                                    if (arrayList9.get(i34) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList9.get(i34)).f20050id;
                                    } else {
                                        i34++;
                                    }
                                }
                            }
                        } else {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).f20050id;
                            }
                        }
                    }
                    if (j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        k2Var.getMessagesController().a3(true, new jg.o2(j00Var, r20Var, i14, 3));
                        return;
                    }
                    if (j00Var.S1 != null) {
                        k2Var.getMessagesController().H(j00Var.Q1, true);
                    }
                    j00Var.f27235s2 = true;
                    j00Var.dismiss();
                    r20Var.a(Integer.valueOf(i14));
                    return;
                }
                j00Var.f27220d2.a(false);
                return;
            case 12:
                ((zx) obj4).I4(((Integer) obj3).intValue());
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.at(13, (org.telegram.ui.Components.vg) obj2, (org.telegram.ui.ActionBar.k2) obj), 200L);
                return;
            case 13:
                a();
                return;
            case 14:
                org.telegram.ui.Components.u70 u70Var = (org.telegram.ui.Components.u70) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = u70Var.f30886k1;
                if (k2Var2 != null && k2Var2.getParentActivity() != null) {
                    if (tL_error2 == null) {
                        if (updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat = updates2.chats.get(0);
                            chat.left = false;
                            chat.kicked = false;
                            org.telegram.messenger.wp.r1(u70Var.f21584a).V3(updates2.users, false);
                            org.telegram.messenger.wp.r1(u70Var.f21584a).P3(updates2.chats, false);
                            long j12 = chat.f19794id;
                            boolean z19 = !org.telegram.messenger.w3.V(chat);
                            u70Var.getClass();
                            Bundle k10 = org.telegram.ui.Cells.f1.k(j12, "chat_id");
                            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(u70Var.f21584a);
                            org.telegram.ui.ActionBar.k2 k2Var3 = u70Var.f30886k1;
                            if (r12.E(k10, k2Var3, null, null)) {
                                k2Var3.presentFragment(new org.telegram.ui.Components.t70(u70Var, k10, z19, j12), k2Var3 instanceof un);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    "USER_ALREADY_PARTICIPANT".equals(tL_error2.text);
                    org.telegram.ui.Components.s4.e0(u70Var.f21584a, tL_error2, k2Var2, tL_messages_importChatInvite, new Object[0]);
                    return;
                }
                return;
            case 15:
                b();
                return;
            case 16:
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) obj4;
                ArrayList arrayList10 = (ArrayList) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.i0.r(n90Var.Q);
                for (int i35 = 0; i35 < arrayList10.size(); i35++) {
                    ((TL_stories.StoryItem) arrayList10.get(i35)).pinned = zArr3[i35];
                }
                n90Var.getMessagesController().O1().q0(n90Var.e, arrayList10, false);
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                f();
                return;
            case 20:
                g();
                return;
            case 21:
                h();
                return;
            case 22:
                i();
                return;
            case 23:
                j();
                return;
            case 24:
                k();
                return;
            case 25:
                l();
                return;
            case 26:
                m();
                return;
            case 27:
                n();
                return;
            case 28:
                o();
                return;
            default:
                i40 i40Var = (i40) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str9 = (String) obj;
                a50 a50Var = i40Var.f37936f;
                org.telegram.messenger.c cVar4 = a50Var.f35620k1;
                z20 z20Var = a50Var.f35610i1;
                org.telegram.messenger.jc jcVar = i40Var.d;
                if (jcVar != null) {
                    z20Var.K0 = jcVar;
                    z20Var.f31300q1 = null;
                    z20Var.f31301r1 = null;
                    i40Var.d = null;
                }
                if (tL_error3 == null) {
                    org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(cVar4.f15043a);
                    int i36 = cVar4.f15043a;
                    TLRPC.User Z13 = r13.Z1(Long.valueOf(org.telegram.messenger.e20.i(i36).e()));
                    if (Z13 == null) {
                        Z13 = org.telegram.messenger.e20.i(i36).f();
                        if (Z13 != null) {
                            org.telegram.messenger.wp.r1(i36).U3(Z13, false, false);
                        } else {
                            return;
                        }
                    } else {
                        org.telegram.messenger.e20.i(i36).w(Z13);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject7;
                    ArrayList<TLRPC.PhotoSize> arrayList11 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList11, 150, false, null, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList11, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    Z13.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19818id;
                    if (w9 != null) {
                        tL_userProfilePhoto.photo_small = w9.location;
                    }
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_big = w10.location;
                    }
                    if (w9 != null && i40Var.f37935c != null) {
                        org.telegram.messenger.b8.G(a50Var.f21584a);
                        File K2 = org.telegram.messenger.b8.K(w9, null, true, true);
                        org.telegram.messenger.b8.G(a50Var.f21584a);
                        org.telegram.messenger.b8.K(i40Var.f37935c, null, true, true).renameTo(K2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i40Var.f37935c.volume_id);
                        sb2.append("_");
                        String p5 = a1.g.p(sb2, i40Var.f37935c.local_id, "@50_50");
                        StringBuilder sb3 = new StringBuilder();
                        str4 = str9;
                        sb3.append(w9.location.volume_id);
                        sb3.append("_");
                        String p9 = a1.g.p(sb3, w9.location.local_id, "@50_50");
                        z14 = true;
                        org.telegram.messenger.ic.D().S(p5, p9, org.telegram.messenger.jc.l(a50Var.f21584a, 1, Z13));
                    } else {
                        z14 = true;
                        str4 = str9;
                    }
                    if (w10 != null && i40Var.f37934b != null) {
                        org.telegram.messenger.b8.G(a50Var.f21584a);
                        File K3 = org.telegram.messenger.b8.K(w10, null, z14, z14);
                        org.telegram.messenger.b8.G(a50Var.f21584a);
                        org.telegram.messenger.b8.K(i40Var.f37934b, null, z14, z14).renameTo(K3);
                    }
                    if (videoSize != null && str4 != null) {
                        org.telegram.messenger.b8.G(a50Var.f21584a);
                        new File(str4).renameTo(org.telegram.messenger.b8.K(videoSize, "mp4", z14, z14));
                    }
                    org.telegram.messenger.wp.r1(i36).T0(Z13.f19943id).e();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(Z13);
                    org.telegram.messenger.is.a0(i36).m1(arrayList12, null, false, true);
                    TLRPC.User Z14 = org.telegram.messenger.wp.r1(i36).Z1(Long.valueOf(i40Var.e));
                    org.telegram.messenger.jc l4 = org.telegram.messenger.jc.l(i36, 0, Z14);
                    org.telegram.messenger.jc l10 = org.telegram.messenger.jc.l(i36, 1, Z14);
                    if (org.telegram.messenger.jc.e(i40Var.f37934b) == null) {
                        l10 = org.telegram.messenger.jc.e(i40Var.f37935c);
                    }
                    z20Var.setCreateThumbFromParent(false);
                    z20Var.H(null, l4, l10, true);
                    i40Var.f37935c = null;
                    i40Var.f37934b = null;
                    org.telegram.messenger.i0.a4(a50Var.H1);
                    i40Var.a(1.0f);
                    cVar = cVar4;
                } else {
                    cVar = cVar4;
                }
                int i37 = cVar.f15043a;
                int i38 = cVar.f15043a;
                org.telegram.messenger.at.f(i37).k(2, Integer.valueOf(org.telegram.messenger.wp.D8));
                org.telegram.messenger.at.f(i38).k(46, new Object[0]);
                org.telegram.messenger.e20.i(i38).v(true);
                return;
        }
    }

    public fp(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37200a = i10;
        this.f37201b = obj;
        this.f37202c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
