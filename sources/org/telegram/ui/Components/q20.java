package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.view.KeyEvent;
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
public final class q20 implements Runnable {
    public final int f38712a;
    public final Object f38713b;
    public final Object f38714c;
    public final Object d;
    public final Object f38715e;

    public q20(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f38712a = i7;
        this.f38714c = callback;
        this.f38715e = obj;
        this.d = tLObject;
        this.f38713b = tL_error;
    }

    private final void a() {
        org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.f38714c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f38713b;
        Bundle bundle = (Bundle) this.f38715e;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.de0 de0Var = gd0Var.f48028v0;
        gd0Var.f48011g0 = false;
        if (tL_error == null) {
            gd0Var.f48023r0 = bundle;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                gd0Var.f48025s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    gd0Var.f48014j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    gd0Var.f48014j0 = 16;
                }
                de0Var.y1(bundle, tL_auth_sentCode, true);
            } else if (tLObject instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject;
                bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                de0Var.M1(18, true, bundle, true);
            }
        } else {
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("PHONE_NUMBER_INVALID")) {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, null));
                } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        gd0Var.c(true);
                        de0Var.M1(0, true, null, true);
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, null));
                    } else if (tL_error.code != -1000) {
                        String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                        sb2.append(tL_error.text);
                        de0Var.D1(N0, sb2.toString());
                    }
                } else {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, null));
                }
            }
        }
        gd0Var.y(false);
    }

    private final void b() {
        int i7;
        f5.m mVar = (f5.m) this.f38713b;
        org.telegram.ui.r3 r3Var = (org.telegram.ui.r3) this.d;
        org.telegram.ui.de0 de0Var = ((org.telegram.ui.ld0) this.f38714c).f49577w;
        de0Var.f46893e = true;
        org.telegram.messenger.r1.i().d(mVar.f11296c, new org.telegram.ui.f3(r3Var, 4));
        org.telegram.messenger.r1.i().h = new org.telegram.ui.kd0(r3Var, 0);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        Activity parentActivity = de0Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i7);
        wf.b bVar = new wf.b(17, false);
        bVar.R(mVar);
        i10.l(parentActivity, a10, (TLRPC.TL_inputStorePaymentAuthCode) this.f38715e, Collections.singletonList(bVar.q()));
    }

    @Override
    public final void run() {
        ?? r92;
        int i7;
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j3;
        org.telegram.messenger.c cVar;
        TLRPC.VideoSize videoSize;
        org.telegram.messenger.c cVar2;
        boolean z12;
        String a02;
        int i11;
        byte[] bArr;
        int i12;
        String G;
        int i13 = this.f38712a;
        Object obj = this.f38715e;
        Object obj2 = this.d;
        Object obj3 = this.f38713b;
        Object obj4 = this.f38714c;
        switch (i13) {
            case 0:
                v20 v20Var = (v20) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) obj;
                nv0 nv0Var = v20Var.f39042u1;
                a0.h hVar3 = v20Var.V1;
                a0.h hVar4 = v20Var.W1;
                ArrayList arrayList2 = v20Var.S1;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    org.telegram.messenger.np.u1(v20Var.f30139a).f4(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.np.u1(v20Var.f30139a).Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = org.telegram.messenger.k10.i(v20Var.f30139a).e();
                    int i14 = 0;
                    while (true) {
                        if (i14 < tL_channels_channelParticipants.participants.size()) {
                            if (org.telegram.messenger.gj.B1(tL_channels_channelParticipants.participants.get(i14).peer) == e10) {
                                tL_channels_channelParticipants.participants.remove(i14);
                            } else {
                                i14++;
                            }
                        }
                    }
                    v20Var.P1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = v20Var.T1;
                        hVar = hVar4;
                    } else {
                        hVar = hVar3;
                        arrayList = arrayList2;
                    }
                    arrayList.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i15);
                        hVar.k(channelParticipant, org.telegram.messenger.gj.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        long B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i16)).peer);
                        if (hVar4.f(B1) != null || ((hVar2 = v20Var.Z1) != null && hVar2.h(B1) >= 0)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        TLRPC.User c22 = org.telegram.messenger.np.u1(v20Var.f30139a).c2(Long.valueOf(B1));
                        if ((c22 != null && c22.bot) || org.telegram.messenger.p10.y(c22)) {
                            z10 = true;
                        }
                        if (z10) {
                            arrayList2.remove(i16);
                            hVar3.l(B1);
                            i16--;
                            size2--;
                        }
                        i16++;
                    }
                    try {
                        if (v20Var.R1.participants_count <= 200) {
                            Collections.sort(arrayList, new org.telegram.ui.vp(v20Var, ConnectionsManager.getInstance(v20Var.f30139a).getCurrentTime(), 1));
                        }
                    } catch (Exception e11) {
                        r92 = 1;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                r92 = 1;
                if (v20Var.P1 <= 0) {
                    v20Var.X1 = false;
                    v20Var.Y1 = r92;
                    if (v20Var.f40616l2 == r92) {
                        i10 = r92;
                    } else {
                        dk0 dk0Var = v20Var.f39038q1;
                        if (dk0Var != null) {
                            i7 = dk0Var.b() - r92;
                        } else {
                            i7 = 0;
                        }
                        i10 = i7;
                    }
                    v20Var.P0(i10);
                    if (arrayList2.isEmpty()) {
                        v20Var.f40608c2 = r92;
                        v20Var.S0();
                    }
                }
                v20Var.U0();
                dk0 dk0Var2 = v20Var.f39038q1;
                if (dk0Var2 != null) {
                    dk0Var2.f();
                    if (nv0Var != null && v20Var.f39038q1.b() == 0 && v20Var.Y1) {
                        nv0Var.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r70 r70Var = (r70) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.g2 g2Var = r70Var.f39061o1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    if (tL_error2 == null) {
                        if (updates != null && !updates.chats.isEmpty()) {
                            TLRPC.Chat chat = updates.chats.get(0);
                            chat.left = false;
                            chat.kicked = false;
                            org.telegram.messenger.np.u1(r70Var.f30139a).f4(updates.users, false);
                            org.telegram.messenger.np.u1(r70Var.f30139a).Z3(updates.chats, false);
                            long j10 = chat.f28398id;
                            boolean z13 = !org.telegram.messenger.v3.V(chat);
                            r70Var.getClass();
                            Bundle j11 = a8.p0.j(j10, "chat_id");
                            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(r70Var.f30139a);
                            org.telegram.ui.ActionBar.g2 g2Var2 = r70Var.f39061o1;
                            if (u12.E(j11, g2Var2, null, null)) {
                                g2Var2.presentFragment(new q70(r70Var, j11, z13, j10), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    "USER_ALREADY_PARTICIPANT".equals(tL_error2.text);
                    c5.c0(r70Var.f30139a, tL_error2, g2Var, tL_messages_importChatInvite, new Object[0]);
                    return;
                }
                return;
            case 2:
                g80 g80Var = (g80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                g80Var.E = false;
                g80Var.M = tL_chatInviteExported.link;
                if (tL_error3 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject2;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i17 = 0; i17 < tL_messages_chatInviteImporters.users.size(); i17++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    g80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 3:
                k90 k90Var = (k90) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(k90Var.R);
                for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                    ((TL_stories.StoryItem) arrayList3.get(i18)).pinned = zArr[i18];
                }
                k90Var.getMessagesController().R1().q0(k90Var.f36831e, arrayList3, false);
                return;
            case 4:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                hi.d dVar = (hi.d) obj4;
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error4 != null) {
                    lc.Y().g0(tL_error4, false);
                    return;
                }
                dVar.setLoading(false);
                o6Var.dismiss();
                org.telegram.messenger.f3.n(null, 2131746849, lc.Y(), 2131623982, 36);
                runnable.run();
                return;
            case 5:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                cxVar.showDialog(new a30((Context) obj2, cxVar.getResourceProvider(), new fw(28, (mm0) obj4, cxVar)));
                ((a70) obj).v();
                return;
            case 6:
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                a70 a70Var = (a70) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.h6 resourceProvider = cxVar2.getResourceProvider();
                fw fwVar = new fw(27, (mm0) obj4, tL_sponsoredPeer);
                int i19 = org.telegram.ui.qy0.f51360w1;
                int currentAccount = cxVar2.getCurrentAccount();
                Activity parentActivity = cxVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.hx(parentActivity, resourceProvider, bArr2, cxVar2, fwVar, currentAccount));
                }
                a70Var.v();
                return;
            case 7:
                ((AtomicReference) obj3).set(null);
                ((jo0) obj2).didReceivedNotification(322, ((ap0) obj4).f30139a, Long.valueOf(-((TLRPC.Dialog) obj).f28402id));
                return;
            case 8:
                kw0 kw0Var = (kw0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.messenger.si siVar = (org.telegram.messenger.si) obj;
                kw0Var.f36961a2 = 0;
                if (tL_error5 == null) {
                    cl0 cl0Var = new cl0(kw0Var, 1);
                    cl0Var.addTarget(kw0Var.f30142b);
                    TransitionManager.beginDelayedTransition(kw0Var.f30145c, cl0Var);
                    kw0Var.f36982s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    kw0Var.N1 = tL_messages_stickerSet;
                    siVar.N1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                        kw0Var.dismiss();
                        return;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = kw0Var.N1;
                    if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kw0Var.f36963c2 = z11;
                    kw0Var.K0();
                    siVar.t1(kw0Var.N1);
                    kw0Var.b1();
                    kw0Var.a1();
                    kw0Var.Z0();
                    kw0Var.f36975o1.f();
                    return;
                }
                kw0Var.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var3 = kw0Var.G1;
                if (g2Var3 != null) {
                    org.telegram.messenger.f3.o(null, 2131754382, lc.b0(g2Var3), null);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ro0 ro0Var = (org.telegram.ui.ro0) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                ro0Var.f36961a2 = 0;
                if (tL_error6 == null && (tLObject4 instanceof Vector)) {
                    Vector vector = (Vector) tLObject4;
                    if (vector.objects.isEmpty()) {
                        ro0Var.dismiss();
                        return;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        ro0Var.Q1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                        tL_inputStickerSetID.f28418id = stickerSet2.f28425id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        ro0Var.S0();
                        return;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        ro0Var.R1 = arrayList4;
                        arrayList4.addAll(vector.objects);
                        ro0Var.n1.setLayoutParams(c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        ro0Var.f36981r1.setVisibility(8);
                        ro0Var.E1[0].setVisibility(8);
                        ro0Var.f36975o1.f();
                        return;
                    }
                }
                c5.c0(ro0Var.f30139a, tL_error6, ro0Var.G1, tL_messages_getAttachedStickers, new Object[0]);
                ro0Var.dismiss();
                return;
            case 10:
                wy0 wy0Var = (wy0) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.np.u1(wy0Var.d).H3(0);
                    return;
                } else if (tL_error7 == null || tL_error7.code != -1000) {
                    String N0 = org.telegram.messenger.hd.N0(2131751093, null);
                    if (tL_error7 != null) {
                        StringBuilder n10 = p5.c.n(N0, "\n");
                        n10.append(tL_error7.text);
                        N0 = n10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wy0Var.getContext());
                    String N02 = org.telegram.messenger.hd.N0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.S = N02;
                    t1Var.U = N0;
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 11:
                a21 a21Var = (a21) obj4;
                ((a70) obj3).v();
                ((org.telegram.messenger.np) obj2).f25932t7.t(-a21Var.f33255f, ((TLRPC.TL_forumTopic) obj).f28450id, !tL_forumTopic.pinned, a21Var.f33265s);
                return;
            case 12:
                b31 b31Var = (b31) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                m21 m21Var = b31Var.f33711z1;
                a31 a31Var = b31Var.I1;
                b31Var.f33699m1 = null;
                if (tL_error8 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error8.text)) {
                    b31Var.Z0();
                    return;
                }
                if (tLObject6 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject6;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        b31Var.P1 = false;
                        TLRPC.TL_textWithEntities R0 = b31.R0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R0.text);
                        org.telegram.messenger.gj.b(valueOf, R0.entities, false, true, false, false, 0);
                        b31Var.A1.setText(b31Var.S0(valueOf));
                        a31Var.D(m21Var);
                        return;
                    }
                }
                if (b31Var.P1) {
                    b31Var.dismiss();
                    org.telegram.messenger.ls.e().k(295, 1, org.telegram.messenger.hd.N0(2131743703, null));
                    return;
                }
                org.telegram.messenger.f3.o(null, 2131743703, new lc((FrameLayout) b31Var.f30142b, b31Var.J0), null);
                x21 x21Var = b31Var.f33709x1.f42615e;
                String str = b31Var.f33708w1;
                b31Var.f33707v1 = str;
                x21Var.setText(b31.P0(str, null, null));
                a31Var.D(m21Var);
                return;
            case 13:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar3 = f40Var.f47488o1;
                org.telegram.messenger.t3 t3Var = new org.telegram.messenger.t3();
                f40Var.V2 = t3Var;
                t3Var.f26914b = new TLRPC.TL_groupCall();
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                TLRPC.GroupCall groupCall = t3Var2.f26914b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j3 = 0;
                } else {
                    j3 = chat2.f28398id;
                }
                t3Var2.f26915c = j3;
                groupCall.schedule_date = f40Var.f47469j4;
                groupCall.flags |= 128;
                t3Var2.C = cVar3;
                t3Var2.x(inputPeer);
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                TLRPC.GroupCall groupCall2 = t3Var3.f26914b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f28408id = groupCall3.f28408id;
                t3Var3.e();
                v10 v10Var = f40Var.o4;
                org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                v10Var.f40578c = t3Var4;
                f40Var.Z3.setGroupCall(t3Var4);
                org.telegram.ui.i40 i40Var = f40Var.f47486n4;
                org.telegram.messenger.t3 t3Var5 = f40Var.V2;
                i40Var.f48544c = t3Var5;
                f40Var.X1.D0(cVar3.f23166a, t3Var5.g(false));
                org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(cVar3.f23166a);
                org.telegram.messenger.t3 t3Var6 = f40Var.V2;
                u13.d4(t3Var6.f26915c, t3Var6);
                return;
            case 14:
                org.telegram.ui.f40 f40Var2 = (org.telegram.ui.f40) obj4;
                org.telegram.messenger.t3 t3Var7 = (org.telegram.messenger.t3) obj2;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (t3Var7 != null) {
                        t3Var7.t(longValue);
                    }
                    arrayList5.add(org.telegram.messenger.np.u1(f40Var2.f30139a).c2(l10));
                    ArrayList<TLRPC.InputUser> arrayList8 = getrequirementstocontact.f28607id;
                    org.telegram.messenger.np u14 = org.telegram.messenger.np.u1(f40Var2.f30139a);
                    arrayList8.add(u14.s1(u14.c2(l10)));
                }
                org.telegram.ui.ip ipVar = new org.telegram.ui.ip(f40Var2, arrayList5, arrayList6, arrayList7, str2, 10);
                if (org.telegram.messenger.k10.i(f40Var2.f30139a).q()) {
                    ipVar.run();
                    return;
                } else {
                    ConnectionsManager.getInstance(f40Var2.f30139a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList5, arrayList6, ipVar, 13));
                    return;
                }
            case 15:
                TLObject tLObject7 = (TLObject) obj2;
                ArrayList arrayList9 = (ArrayList) obj4;
                ArrayList arrayList10 = (ArrayList) obj3;
                org.telegram.ui.ip ipVar2 = (org.telegram.ui.ip) obj;
                if (tLObject7 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject7;
                    for (int i20 = 0; i20 < Math.min(arrayList9.size(), vector2.objects.size()); i20++) {
                        if (vector2.objects.get(i20) instanceof TL_account.requirementToContactPremium) {
                            arrayList10.add(Long.valueOf(((TLRPC.User) arrayList9.get(i20)).f28547id));
                        }
                    }
                }
                ipVar2.run();
                return;
            case 16:
                org.telegram.ui.o30 o30Var = (org.telegram.ui.o30) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.f40 f40Var3 = o30Var.f50439f;
                org.telegram.messenger.c cVar4 = f40Var3.f47488o1;
                org.telegram.ui.d20 d20Var = f40Var3.f47479m1;
                org.telegram.messenger.gc gcVar = o30Var.d;
                if (gcVar != null) {
                    d20Var.L0 = gcVar;
                    d20Var.f35846r1 = null;
                    d20Var.f35847s1 = null;
                    o30Var.d = null;
                }
                if (tL_error9 == null) {
                    org.telegram.messenger.np u15 = org.telegram.messenger.np.u1(cVar4.f23166a);
                    int i21 = cVar4.f23166a;
                    TLRPC.User c23 = u15.c2(Long.valueOf(org.telegram.messenger.k10.i(i21).e()));
                    if (c23 == null) {
                        c23 = org.telegram.messenger.k10.i(i21).f();
                        if (c23 != null) {
                            org.telegram.messenger.np.u1(i21).e4(c23, false, false);
                        } else {
                            return;
                        }
                    } else {
                        org.telegram.messenger.k10.i(i21).w(c23);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject8;
                    ArrayList<TLRPC.PhotoSize> arrayList11 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList11, 150, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList11, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c23.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28422id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && o30Var.f50437c != null) {
                        org.telegram.messenger.w7.G(f40Var3.f30139a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(f40Var3.f30139a);
                        org.telegram.messenger.w7.J(o30Var.f50437c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(o30Var.f50437c.volume_id);
                        sb2.append("_");
                        String n11 = a8.p0.n(o30Var.f50437c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = cVar4;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z12 = true;
                        org.telegram.messenger.fc.D().S(n11, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.l(f40Var3.f30139a, 1, c23));
                    } else {
                        cVar2 = cVar4;
                        z12 = true;
                    }
                    if (w11 != null && o30Var.f50436b != null) {
                        org.telegram.messenger.w7.G(f40Var3.f30139a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z12, z12);
                        org.telegram.messenger.w7.G(f40Var3.f30139a);
                        org.telegram.messenger.w7.J(o30Var.f50436b, null, z12, z12).renameTo(J2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(f40Var3.f30139a);
                        new File(str3).renameTo(org.telegram.messenger.w7.J(videoSize, "mp4", z12, z12));
                    }
                    org.telegram.messenger.np.u1(i21).W0(c23.f28547id).f();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(c23);
                    org.telegram.messenger.ur.a0(i21).m1(arrayList12, null, false, true);
                    TLRPC.User c24 = org.telegram.messenger.np.u1(i21).c2(Long.valueOf(o30Var.f50438e));
                    org.telegram.messenger.gc l11 = org.telegram.messenger.gc.l(i21, 0, c24);
                    org.telegram.messenger.gc l12 = org.telegram.messenger.gc.l(i21, 1, c24);
                    if (org.telegram.messenger.gc.e(o30Var.f50436b) == null) {
                        l12 = org.telegram.messenger.gc.e(o30Var.f50437c);
                    }
                    d20Var.setCreateThumbFromParent(false);
                    d20Var.H(null, l11, l12, true);
                    o30Var.f50437c = null;
                    o30Var.f50436b = null;
                    org.telegram.messenger.g0.Z3(f40Var3.L1);
                    o30Var.a(1.0f);
                    cVar = cVar2;
                } else {
                    cVar = cVar4;
                }
                int i22 = cVar.f23166a;
                int i23 = cVar.f23166a;
                org.telegram.messenger.ls.f(i22).k(2, Integer.valueOf(org.telegram.messenger.np.I8));
                org.telegram.messenger.ls.f(i23).k(46, new Object[0]);
                org.telegram.messenger.k10.i(i23).v(true);
                return;
            case 17:
                org.telegram.ui.f50.Z((org.telegram.ui.f50) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 18:
                org.telegram.ui.m50 m50Var = (org.telegram.ui.m50) obj4;
                m50Var.d = (ArrayList) obj3;
                m50Var.f49736e = (ArrayList) obj2;
                m50Var.f();
                org.telegram.ui.n50 n50Var = m50Var.f49739r;
                n50Var.f50077b.d.setVisibility(8);
                n50Var.f50077b.f37962e.setText(org.telegram.messenger.hd.a0(null, null, 2131752105, (String) obj));
                n50Var.f50077b.e(false, true);
                return;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.o60 o60Var = (org.telegram.ui.o60) obj;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                String str4 = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tLObject9 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject9;
                    Pattern pattern = c5.f33977a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.hd.E0().B.f23495c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                    if (equals) {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748861, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageSame", null, 2131748854, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131745787, null), new h1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748851, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageUnknownCustomAlert", null, 2131748852, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748853, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.hd.a0("LanguageAlert", null, 2131748860, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.hd.a0("LanguageCustomAlert", null, 2131748857, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131752540, null), new oi.e0(26, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i24 = indexOf + 1;
                        i11 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i24);
                        if (i11 != -1) {
                            spannableStringBuilder.delete(i11, i11 + 1);
                            spannableStringBuilder.delete(indexOf, i24);
                        }
                    } else {
                        i11 = -1;
                    }
                    if (indexOf != -1 && i11 != -1) {
                        spannableStringBuilder.setSpan(new u3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i11 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.t6.G(textView, org.telegram.ui.ActionBar.m6.f29475k5, null);
                    org.telegram.ui.ActionBar.t6.C(textView, org.telegram.ui.ActionBar.m6.f29493l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29455j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    return;
                } else if (tL_error10 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error10.text)) {
                        launchActivity.F0(c5.K(launchActivity, null, org.telegram.messenger.hd.N0(2131748850, null)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb4, "\n");
                    sb4.append(tL_error10.text);
                    launchActivity.F0(c5.K(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) obj4;
                TLObject tLObject10 = (TLObject) obj2;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                String str6 = LaunchActivity.C1;
                try {
                    t1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject10 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.o60(2, gVar, tL_error11));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj4;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                br.e(g2Var4.getContext(), s90Var.f51948b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new rh(17, s90Var, userArr), g2Var4.getResourceProvider(), org.telegram.ui.s90.d());
                return;
            case 22:
                org.telegram.ui.p90.z0((org.telegram.ui.p90) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                return;
            case 23:
                EditText editText = (EditText) obj2;
                bi.v vVar = (bi.v) obj;
                ((yb0) obj4).a(0.0f);
                ((View) obj3).setTag(2131296715, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.o60(14, editText, vVar));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ub0 ub0Var = (org.telegram.ui.ub0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str7 != null) {
                    bArr = org.telegram.messenger.g0.h1(str7);
                } else {
                    bArr = null;
                }
                org.telegram.ui.tb0 tb0Var = new org.telegram.ui.tb0(ub0Var, str7, str8, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ub0Var.f52515s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.kv.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                            tL_error12.text = "ALGO_INVALID";
                            tb0Var.run(null, tL_error12);
                        }
                    }
                    i12 = ((org.telegram.ui.ActionBar.g2) ub0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_auth_recoverPassword, tb0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error13 = new TLRPC.TL_error();
                tL_error13.text = "PASSWORD_HASH_INVALID";
                tb0Var.run(null, tL_error13);
                return;
            case 25:
                org.telegram.ui.hc0 hc0Var = (org.telegram.ui.hc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                org.telegram.ui.de0 de0Var = hc0Var.E;
                de0Var.C1(false, true);
                hc0Var.f48288n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", hc0Var.h);
                    de0Var.M1(9, true, bundle, false);
                    return;
                } else if (tL_error14 != null && !tL_error14.text.startsWith("CODE_INVALID")) {
                    if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error14.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750669, G));
                        return;
                    }
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error14.text);
                    return;
                } else {
                    hc0Var.n(true);
                    return;
                }
            case 26:
                a();
                return;
            case 27:
                org.telegram.ui.ld0.n((org.telegram.ui.ld0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 28:
                b();
                return;
            default:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj4;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                String str10 = (String) obj;
                ce0Var.N = false;
                org.telegram.ui.de0 de0Var2 = ce0Var.f46528h0;
                de0Var2.N1(false, true);
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject11;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743577, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", str10);
                    de0Var2.M1(6, true, bundle2, false);
                    return;
                }
                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error15.text);
                return;
        }
    }

    public q20(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f38712a = i7;
        this.f38714c = obj;
        this.f38713b = obj2;
        this.d = obj3;
        this.f38715e = obj4;
    }

    public q20(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i7) {
        this.f38712a = i7;
        this.f38714c = obj;
        this.d = tLObject;
        this.f38715e = obj2;
        this.f38713b = tL_error;
    }

    public q20(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ip ipVar) {
        this.f38712a = 15;
        this.d = tLObject;
        this.f38714c = arrayList;
        this.f38713b = arrayList2;
        this.f38715e = ipVar;
    }

    public q20(TLRPC.TL_error tL_error, hi.d dVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.f38712a = 4;
        this.f38713b = tL_error;
        this.f38714c = dVar;
        this.d = o6Var;
        this.f38715e = runnable;
    }

    public q20(g80 g80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f38712a = 2;
        this.f38714c = g80Var;
        this.f38715e = tL_chatInviteExported;
        this.f38713b = tL_error;
        this.d = tLObject;
    }

    public q20(org.telegram.ui.gd0 gd0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f38712a = 26;
        this.f38714c = gd0Var;
        this.f38713b = tL_error;
        this.f38715e = bundle;
        this.d = tLObject;
    }
}
