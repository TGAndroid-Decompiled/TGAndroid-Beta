package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v60 implements Runnable {
    public final int f39017a;
    public final Object f39018b;
    public final Object f39019c;
    public final Object d;
    public final Object f39020e;

    public v60(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f39017a = i3;
        this.f39019c = obj;
        this.f39018b = obj2;
        this.d = obj3;
        this.f39020e = obj4;
    }

    @Override
    public final void run() {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j10;
        org.telegram.messenger.c cVar;
        TLRPC.VideoSize videoSize;
        org.telegram.messenger.c cVar2;
        org.telegram.ui.w10 w10Var;
        boolean z11;
        String a02;
        int i3;
        byte[] bArr;
        int i10;
        String G;
        int i11;
        int i12;
        int i13 = this.f39017a;
        Object obj = this.f39020e;
        Object obj2 = this.d;
        Object obj3 = this.f39018b;
        Object obj4 = this.f39019c;
        switch (i13) {
            case 0:
                x60 x60Var = (x60) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.d2 d2Var = x60Var.f40248l1;
                if (d2Var != null && d2Var.getParentActivity() != null) {
                    if (tL_error == null) {
                        if (updates != null && !updates.chats.isEmpty()) {
                            TLRPC.Chat chat = updates.chats.get(0);
                            chat.left = false;
                            chat.kicked = false;
                            org.telegram.messenger.hp.s1(x60Var.f28583a).Y3(updates.users, false);
                            org.telegram.messenger.hp.s1(x60Var.f28583a).S3(updates.chats, false);
                            long j11 = chat.f27001id;
                            boolean z12 = !org.telegram.messenger.t3.V(chat);
                            x60Var.getClass();
                            Bundle j12 = a1.g.j(j11, "chat_id");
                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(x60Var.f28583a);
                            org.telegram.ui.ActionBar.d2 d2Var2 = x60Var.f40248l1;
                            if (s12.E(j12, d2Var2, null, null)) {
                                d2Var2.presentFragment(new w60(x60Var, j12, z12, j11), d2Var2 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
                    t4.e0(x60Var.f28583a, tL_error, d2Var, tL_messages_importChatInvite, new Object[0]);
                    return;
                }
                return;
            case 1:
                m70 m70Var = (m70) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj;
                m70Var.E = false;
                m70Var.M = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i14 = 0; i14 < tL_messages_chatInviteImporters.users.size(); i14++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    m70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 2:
                r80 r80Var = (r80) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(r80Var.R);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((TL_stories.StoryItem) arrayList.get(i15)).pinned = zArr[i15];
                }
                r80Var.getMessagesController().P1().q0(r80Var.f37684e, arrayList, false);
                return;
            case 3:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                gi.d dVar = (gi.d) obj4;
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error3 != null) {
                    fc.X().f0(tL_error3, false);
                    return;
                }
                dVar.setLoading(false);
                q6Var.dismiss();
                org.telegram.messenger.k5.o(null, 2131747051, fc.X(), 2131623981, 36);
                runnable.run();
                return;
            case 4:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                uwVar.showDialog(new i20((Context) obj2, uwVar.getResourceProvider(), new j50(13, (bm0) obj4, uwVar)));
                ((f60) obj).u();
                return;
            case 5:
                org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                f60 f60Var = (f60) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.e6 resourceProvider = uwVar2.getResourceProvider();
                j50 j50Var = new j50(12, (bm0) obj4, tL_sponsoredPeer);
                int i16 = org.telegram.ui.ey0.f45092t1;
                int currentAccount = uwVar2.getCurrentAccount();
                Activity parentActivity = uwVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.gx(parentActivity, resourceProvider, bArr2, uwVar2, j50Var, currentAccount));
                }
                f60Var.u();
                return;
            case 6:
                ((AtomicReference) obj3).set(null);
                ((xn0) obj2).didReceivedNotification(319, ((oo0) obj4).f28583a, Long.valueOf(-((TLRPC.Dialog) obj).f27005id));
                return;
            case 7:
                xv0 xv0Var = (xv0) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.messenger.li liVar = (org.telegram.messenger.li) obj;
                xv0Var.X1 = 0;
                if (tL_error4 == null) {
                    rk0 rk0Var = new rk0(xv0Var, 1);
                    rk0Var.addTarget(xv0Var.f28586b);
                    TransitionManager.beginDelayedTransition(xv0Var.f28589c, rk0Var);
                    xv0Var.f40523p1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    xv0Var.K1 = tL_messages_stickerSet;
                    liVar.I1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                        xv0Var.dismiss();
                        return;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xv0Var.K1;
                    if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xv0Var.Z1 = z10;
                    xv0Var.J0();
                    liVar.q1(xv0Var.K1);
                    xv0Var.a1();
                    xv0Var.Z0();
                    xv0Var.Y0();
                    xv0Var.f40517l1.f();
                    return;
                }
                xv0Var.dismiss();
                org.telegram.ui.ActionBar.d2 d2Var3 = xv0Var.D1;
                if (d2Var3 != null) {
                    org.telegram.messenger.k5.p(null, 2131754385, fc.a0(d2Var3), null);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                go0Var.X1 = 0;
                if (tL_error5 == null && (tLObject3 instanceof Vector)) {
                    Vector vector = (Vector) tLObject3;
                    if (vector.objects.isEmpty()) {
                        go0Var.dismiss();
                        return;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        go0Var.N1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                        tL_inputStickerSetID.f27021id = stickerSet2.f27028id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        go0Var.R0();
                        return;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        go0Var.O1 = arrayList2;
                        arrayList2.addAll(vector.objects);
                        go0Var.k1.setLayoutParams(b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        go0Var.f40522o1.setVisibility(8);
                        go0Var.B1[0].setVisibility(8);
                        go0Var.f40517l1.f();
                        return;
                    }
                }
                t4.e0(go0Var.f28583a, tL_error5, go0Var.D1, tL_messages_getAttachedStickers, new Object[0]);
                go0Var.dismiss();
                return;
            case 9:
                ky0 ky0Var = (ky0) obj4;
                TLObject tLObject4 = (TLObject) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj2).dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.hp.s1(ky0Var.d).A3(0);
                    return;
                } else if (tL_error6 == null || tL_error6.code != -1000) {
                    String M0 = org.telegram.messenger.bd.M0(2131751106, null);
                    if (tL_error6 != null) {
                        StringBuilder h = t4.c.h(M0, "\n");
                        h.append(tL_error6.text);
                        M0 = h.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                    String M02 = org.telegram.messenger.bd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M02;
                    s1Var.U = M0;
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 10:
                g11 g11Var = (g11) obj4;
                ((f60) obj3).u();
                ((org.telegram.messenger.hp) obj2).f23102q7.t(-g11Var.f33927f, ((TLRPC.TL_forumTopic) obj).f27053id, !tL_forumTopic.pinned, g11Var.f33937s);
                return;
            case 11:
                f21 f21Var = (f21) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                q11 q11Var = f21Var.f33677w1;
                e21 e21Var = f21Var.F1;
                f21Var.f33666j1 = null;
                if (tL_error7 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error7.text)) {
                    f21Var.X0();
                    return;
                }
                if (tLObject5 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject5;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        f21Var.M1 = false;
                        TLRPC.TL_textWithEntities P0 = f21.P0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                        org.telegram.messenger.zi.b(valueOf, P0.entities, false, true, false, false, 0);
                        f21Var.f33678x1.setText(f21Var.Q0(valueOf));
                        e21Var.D(q11Var);
                        return;
                    }
                }
                if (f21Var.M1) {
                    f21Var.dismiss();
                    org.telegram.messenger.hs.e().k(292, 1, org.telegram.messenger.bd.M0(2131743956, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743956, new fc((FrameLayout) f21Var.f28586b, f21Var.J0), null);
                b21 b21Var = f21Var.f33675u1.f32920e;
                String str = f21Var.f33674t1;
                f21Var.f33673s1 = str;
                b21Var.setText(f21.O0(str, null, null));
                e21Var.D(q11Var);
                return;
            case 12:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar3 = x30Var.f51759l1;
                org.telegram.messenger.r3 r3Var = new org.telegram.messenger.r3();
                x30Var.S2 = r3Var;
                r3Var.f25049b = new TLRPC.TL_groupCall();
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                TLRPC.GroupCall groupCall = r3Var2.f25049b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j10 = 0;
                } else {
                    j10 = chat2.f27001id;
                }
                r3Var2.f25050c = j10;
                groupCall.schedule_date = x30Var.f51725c4;
                groupCall.flags |= 128;
                r3Var2.C = cVar3;
                r3Var2.x(inputPeer);
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                TLRPC.GroupCall groupCall2 = r3Var3.f25049b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f27011id = groupCall3.f27011id;
                r3Var3.e();
                e10 e10Var = x30Var.f51745h4;
                org.telegram.messenger.r3 r3Var4 = x30Var.S2;
                e10Var.f33264c = r3Var4;
                x30Var.S3.setGroupCall(r3Var4);
                org.telegram.ui.a40 a40Var = x30Var.f51741g4;
                org.telegram.messenger.r3 r3Var5 = x30Var.S2;
                a40Var.f43588c = r3Var5;
                x30Var.U1.D0(cVar3.f21919a, r3Var5.g(false));
                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(cVar3.f21919a);
                org.telegram.messenger.r3 r3Var6 = x30Var.S2;
                s13.W3(r3Var6.f25050c, r3Var6);
                return;
            case 13:
                org.telegram.ui.x30 x30Var2 = (org.telegram.ui.x30) obj4;
                org.telegram.messenger.r3 r3Var7 = (org.telegram.messenger.r3) obj2;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (r3Var7 != null) {
                        r3Var7.t(longValue);
                    }
                    arrayList3.add(org.telegram.messenger.hp.s1(x30Var2.f28583a).a2(l10));
                    ArrayList<TLRPC.InputUser> arrayList6 = getrequirementstocontact.f27210id;
                    org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(x30Var2.f28583a);
                    arrayList6.add(s14.q1(s14.a2(l10)));
                }
                org.telegram.ui.lq lqVar = new org.telegram.ui.lq(x30Var2, arrayList3, arrayList4, arrayList5, str2, 8);
                if (org.telegram.messenger.h10.i(x30Var2.f28583a).q()) {
                    lqVar.run();
                    return;
                } else {
                    ConnectionsManager.getInstance(x30Var2.f28583a).sendRequest(getrequirementstocontact, new org.telegram.ui.y9(arrayList3, arrayList4, lqVar, 13));
                    return;
                }
            case 14:
                TLObject tLObject6 = (TLObject) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                org.telegram.ui.lq lqVar2 = (org.telegram.ui.lq) obj;
                if (tLObject6 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject6;
                    for (int i17 = 0; i17 < Math.min(arrayList7.size(), vector2.objects.size()); i17++) {
                        if (vector2.objects.get(i17) instanceof TL_account.requirementToContactPremium) {
                            arrayList8.add(Long.valueOf(((TLRPC.User) arrayList7.get(i17)).f27150id));
                        }
                    }
                }
                lqVar2.run();
                return;
            case 15:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.x30 x30Var3 = g30Var.f45511f;
                org.telegram.messenger.c cVar4 = x30Var3.f51759l1;
                org.telegram.ui.w10 w10Var2 = x30Var3.f51750j1;
                org.telegram.messenger.ac acVar = g30Var.d;
                if (acVar != null) {
                    w10Var2.L0 = acVar;
                    w10Var2.f39107r1 = null;
                    w10Var2.f39108s1 = null;
                    g30Var.d = null;
                }
                if (tL_error8 == null) {
                    org.telegram.messenger.hp s15 = org.telegram.messenger.hp.s1(cVar4.f21919a);
                    int i18 = cVar4.f21919a;
                    TLRPC.User a22 = s15.a2(Long.valueOf(org.telegram.messenger.h10.i(i18).e()));
                    if (a22 == null) {
                        a22 = org.telegram.messenger.h10.i(i18).f();
                        if (a22 != null) {
                            org.telegram.messenger.hp.s1(i18).X3(a22, false, false);
                        } else {
                            return;
                        }
                    } else {
                        org.telegram.messenger.h10.i(i18).w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject7;
                    ArrayList<TLRPC.PhotoSize> arrayList9 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList9, 150, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList9, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f27025id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && g30Var.f45509c != null) {
                        org.telegram.messenger.w7.G(x30Var3.f28583a);
                        File K = org.telegram.messenger.w7.K(w10, null, true, true);
                        org.telegram.messenger.w7.G(x30Var3.f28583a);
                        org.telegram.messenger.w7.K(g30Var.f45509c, null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(g30Var.f45509c.volume_id);
                        sb2.append("_");
                        String o10 = a1.g.o(g30Var.f45509c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = cVar4;
                        w10Var = w10Var2;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z11 = true;
                        org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.l(x30Var3.f28583a, 1, a22));
                    } else {
                        cVar2 = cVar4;
                        w10Var = w10Var2;
                        z11 = true;
                    }
                    if (w11 != null && g30Var.f45508b != null) {
                        org.telegram.messenger.w7.G(x30Var3.f28583a);
                        File K2 = org.telegram.messenger.w7.K(w11, null, z11, z11);
                        org.telegram.messenger.w7.G(x30Var3.f28583a);
                        org.telegram.messenger.w7.K(g30Var.f45508b, null, z11, z11).renameTo(K2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(x30Var3.f28583a);
                        new File(str3).renameTo(org.telegram.messenger.w7.K(videoSize, "mp4", z11, z11));
                    }
                    org.telegram.messenger.hp.s1(i18).U0(a22.f27150id).f();
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(a22);
                    org.telegram.messenger.qr.a0(i18).m1(arrayList10, null, false, true);
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(i18).a2(Long.valueOf(g30Var.f45510e));
                    org.telegram.messenger.ac l11 = org.telegram.messenger.ac.l(i18, 0, a23);
                    org.telegram.messenger.ac l12 = org.telegram.messenger.ac.l(i18, 1, a23);
                    if (org.telegram.messenger.ac.e(g30Var.f45508b) == null) {
                        l12 = org.telegram.messenger.ac.e(g30Var.f45509c);
                    }
                    org.telegram.ui.w10 w10Var3 = w10Var;
                    w10Var3.setCreateThumbFromParent(false);
                    w10Var3.H(null, l11, l12, true);
                    g30Var.f45509c = null;
                    g30Var.f45508b = null;
                    org.telegram.messenger.g0.b4(x30Var3.I1);
                    g30Var.a(1.0f);
                    cVar = cVar2;
                } else {
                    cVar = cVar4;
                }
                int i19 = cVar.f21919a;
                int i20 = cVar.f21919a;
                org.telegram.messenger.hs.f(i19).k(2, Integer.valueOf(org.telegram.messenger.hp.C8));
                org.telegram.messenger.hs.f(i20).k(46, new Object[0]);
                org.telegram.messenger.h10.i(i20).v(true);
                return;
            case 16:
                org.telegram.ui.y40.Z((org.telegram.ui.y40) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 17:
                org.telegram.ui.f50 f50Var = (org.telegram.ui.f50) obj4;
                f50Var.d = (ArrayList) obj3;
                f50Var.f45147e = (ArrayList) obj2;
                f50Var.f();
                org.telegram.ui.g50 g50Var = f50Var.f45150r;
                g50Var.f45534b.d.setVisibility(8);
                g50Var.f45534b.f41128e.setText(org.telegram.messenger.bd.a0(null, null, 2131752117, (String) obj));
                g50Var.f45534b.e(false, true);
                return;
            case 18:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) obj2;
                TLObject tLObject8 = (TLObject) obj;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                String str4 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject8 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject8;
                    Pattern pattern = t4.f38241a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.bd.E0().B.f26563c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    if (equals) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749062, null);
                        a02 = org.telegram.messenger.bd.a0("LanguageSame", null, 2131749055, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131745993, null), new x0(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749052, null);
                        a02 = org.telegram.messenger.bd.a0("LanguageUnknownCustomAlert", null, 2131749053, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                    } else {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749054, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.bd.a0("LanguageAlert", null, 2131749061, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.bd.a0("LanguageCustomAlert", null, 2131749058, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752552, null), new org.telegram.ui.jo(4, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i21 = indexOf + 1;
                        i3 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i21);
                        if (i3 != -1) {
                            spannableStringBuilder.delete(i3, i3 + 1);
                            spannableStringBuilder.delete(indexOf, i21);
                        }
                    } else {
                        i3 = -1;
                    }
                    if (indexOf != -1 && i3 != -1) {
                        spannableStringBuilder.setSpan(new l3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i3 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.f28006k5, null);
                    org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.f28025l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    return;
                } else if (tL_error9 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error9.text)) {
                        launchActivity.F0(t4.M(launchActivity, null, org.telegram.messenger.bd.M0(2131749051, null)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb4, "\n");
                    sb4.append(tL_error9.text);
                    launchActivity.F0(t4.M(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 19:
                org.telegram.ui.ActionBar.s1 s1Var3 = (org.telegram.ui.ActionBar.s1) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                String str6 = LaunchActivity.E1;
                try {
                    s1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject9 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ly(16, gVar, tL_error10));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.m90 m90Var = (org.telegram.ui.m90) obj4;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                lq.e(d2Var4.getContext(), m90Var.f47567b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new ei(16, m90Var, userArr), d2Var4.getResourceProvider(), org.telegram.ui.m90.d());
                return;
            case 21:
                org.telegram.ui.j90.z0((org.telegram.ui.j90) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                return;
            case 22:
                EditText editText = (EditText) obj2;
                ai.a0 a0Var = (ai.a0) obj;
                ((gb0) obj4).a(0.0f);
                ((View) obj3).setTag(2131296713, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.ly(28, editText, a0Var));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.qb0 qb0Var = (org.telegram.ui.qb0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str7 != null) {
                    bArr = org.telegram.messenger.g0.h1(str7);
                } else {
                    bArr = null;
                }
                org.telegram.ui.pb0 pb0Var = new org.telegram.ui.pb0(qb0Var, str7, str8, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = qb0Var.f48842s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.hv.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error11 = new TLRPC.TL_error();
                            tL_error11.text = "ALGO_INVALID";
                            pb0Var.run(null, tL_error11);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.d2) qb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, pb0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                tL_error12.text = "PASSWORD_HASH_INVALID";
                pb0Var.run(null, tL_error12);
                return;
            case 24:
                org.telegram.ui.fc0 fc0Var = (org.telegram.ui.fc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj3;
                org.telegram.ui.xd0 xd0Var = fc0Var.E;
                xd0Var.t1(false, true);
                fc0Var.f45252n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", fc0Var.h);
                    xd0Var.D1(9, true, bundle, false);
                    return;
                } else if (tL_error13 != null && !tL_error13.text.startsWith("CODE_INVALID")) {
                    if (tL_error13.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error13.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error13.text);
                    return;
                } else {
                    fc0Var.n(true);
                    return;
                }
            case 25:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) obj4;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject10 = (TLObject) obj;
                org.telegram.ui.xd0 xd0Var2 = dd0Var.f44663v0;
                dd0Var.f44646g0 = false;
                if (tL_error14 == null) {
                    dd0Var.f44658r0 = bundle2;
                    if (tLObject10 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject10;
                        dd0Var.f44660s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            dd0Var.f44649j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            dd0Var.f44649j0 = 16;
                        }
                        xd0Var2.p1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject10 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject10;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        xd0Var2.D1(18, true, bundle2, true);
                    }
                } else {
                    String str10 = tL_error14.text;
                    if (str10 != null) {
                        if (str10.contains("PHONE_NUMBER_INVALID")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, null));
                        } else if (!tL_error14.text.contains("PHONE_CODE_EMPTY") && !tL_error14.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error14.text.contains("PHONE_CODE_EXPIRED")) {
                                dd0Var.c(true);
                                xd0Var2.D1(0, true, null, true);
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                            } else if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, null));
                            } else if (tL_error14.code != -1000) {
                                String M03 = org.telegram.messenger.bd.M0(2131746081, null);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751106, sb5, "\n");
                                sb5.append(tL_error14.text);
                                xd0Var2.u1(M03, sb5.toString());
                            }
                        } else {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, null));
                        }
                    }
                }
                dd0Var.y(false);
                return;
            case 26:
                org.telegram.ui.id0.n((org.telegram.ui.id0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 27:
                e5.l lVar = (e5.l) obj3;
                org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) obj2;
                org.telegram.ui.xd0 xd0Var3 = ((org.telegram.ui.id0) obj4).f46252w;
                xd0Var3.f51953e = true;
                org.telegram.messenger.r1.i().d(lVar.f9611c, new org.telegram.ui.g3(s3Var, 3));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.hd0(s3Var, 0);
                org.telegram.messenger.r1 i22 = org.telegram.messenger.r1.i();
                Activity parentActivity2 = xd0Var3.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                ?? obj5 = new Object();
                obj5.B(lVar);
                i22.l(parentActivity2, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(obj5.k()));
                return;
            case 28:
                org.telegram.ui.wd0 wd0Var = (org.telegram.ui.wd0) obj4;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                String str11 = (String) obj;
                wd0Var.N = false;
                org.telegram.ui.xd0 xd0Var4 = wd0Var.f50785b0;
                xd0Var4.E1(false, true);
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject11;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        t4.w0(xd0Var4.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str11);
                    xd0Var4.D1(6, true, bundle3, false);
                    return;
                }
                xd0Var4.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error15.text);
                return;
            default:
                org.telegram.ui.ag0 ag0Var = (org.telegram.ui.ag0) obj4;
                ng.b bVar = (ng.b) obj3;
                String str12 = (String) obj2;
                org.telegram.ui.q41 q41Var = (org.telegram.ui.q41) obj;
                org.telegram.ui.dg0 dg0Var = ag0Var.f43775w.d;
                if (bVar != null) {
                    dg0Var.f44705w.l(str12, bVar);
                }
                if (bVar != null && !q41Var.f48751b && (i12 = q41Var.f48750a) >= 0) {
                    View m10 = dg0Var.h.m(i12);
                    if (m10 instanceof org.telegram.ui.b41) {
                        ag0Var.f43923r.f44541e = bVar;
                        org.telegram.ui.b41 b41Var = (org.telegram.ui.b41) m10;
                        b41Var.f43918b.f19362u0.d(false, false);
                        b41Var.g(false);
                    }
                }
                ag0Var.f();
                return;
        }
    }

    public v60(Object obj, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i3) {
        this.f39017a = i3;
        this.f39019c = obj;
        this.d = obj2;
        this.f39020e = obj3;
        this.f39018b = tL_error;
    }

    public v60(TLRPC.TL_error tL_error, gi.d dVar, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.f39017a = 3;
        this.f39018b = tL_error;
        this.f39019c = dVar;
        this.d = q6Var;
        this.f39020e = runnable;
    }

    public v60(m70 m70Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f39017a = 1;
        this.f39019c = m70Var;
        this.d = tL_chatInviteExported;
        this.f39018b = tL_error;
        this.f39020e = tLObject;
    }
}
