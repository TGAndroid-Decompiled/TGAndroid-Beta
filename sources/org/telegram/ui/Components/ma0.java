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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ma0 implements Runnable {
    public final int f37179a;
    public final Object f37180b;
    public final Object f37181c;
    public final Object d;
    public final Object f37182e;

    public ma0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f37179a = i7;
        this.f37180b = obj;
        this.f37181c = obj2;
        this.d = obj3;
        this.f37182e = obj4;
    }

    private final void a() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.Chat M0;
        int i7;
        int i10;
        String M02;
        String a02;
        xb Q;
        String str2;
        org.telegram.ui.il0 il0Var;
        org.telegram.ui.il0 il0Var2;
        org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.f37180b;
        TLRPC.Message message = (TLRPC.Message) this.f37182e;
        jl0Var.f48387b1 = true;
        jl0Var.f48400g1 = 1;
        jl0Var.D0((org.telegram.ui.ActionBar.o4) this.f37181c, (Activity) this.d);
        TLRPC.InputInvoice inputInvoice = jl0Var.f48390c1;
        boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z12 && (il0Var2 = jl0Var.f48384a1) != null) {
            il0Var2.e(jl0Var.f48400g1);
        }
        jl0Var.z0();
        if (z12 && (il0Var = jl0Var.f48384a1) != null) {
            il0Var.e(jl0Var.f48400g1);
        }
        long w02 = jl0Var.w0();
        int i11 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
        if (i11 > 0) {
            str = org.telegram.messenger.q10.k(jl0Var.getMessagesController().a2(Long.valueOf(w02)));
        } else {
            str = "";
            if (i11 < 0 && (M0 = jl0Var.getMessagesController().M0(Long.valueOf(-w02))) != null) {
                str = M0.title;
            }
        }
        long v02 = jl0Var.v0();
        if (z12) {
            if (!z10 && !z11) {
                i7 = 2131624227;
            } else {
                i7 = 2131624226;
            }
        } else {
            i7 = 2131624115;
        }
        int i12 = i7;
        if (!z12) {
            M02 = null;
        } else {
            if (z11) {
                i10 = 2131745092;
            } else if (z10) {
                i10 = 2131745100;
            } else {
                i10 = 2131745159;
            }
            M02 = org.telegram.messenger.hd.M0(i10, null);
        }
        if (z12) {
            if (z11) {
                a02 = org.telegram.messenger.hd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
            } else {
                if (z10) {
                    str2 = "StarsGiftSentPopupInfo";
                } else {
                    str2 = "StarsAcquiredInfo";
                }
                a02 = org.telegram.messenger.hd.K(str2, (int) v02, ',', str);
            }
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131747401, jl0Var.S0[0], jl0Var.f48412r0);
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        cc a03 = cc.a0(T);
        if (i11 != 0 && M02 != null && !z11) {
            Q = a03.L(i12, M02, X2, org.telegram.messenger.hd.M0(2131743552, null), new di.l3(w02, 3));
        } else {
            String str3 = M02;
            if (str3 != null) {
                Q = a03.I(i12, str3, X2);
            } else {
                Q = a03.Q(i12, 36, X2);
            }
        }
        xb xbVar = Q;
        xbVar.f41651r = false;
        xbVar.f41643j = 5000;
        if (message != null) {
            fi.m3 m3Var = new fi.m3(jl0Var, xbVar, z10, message, 4);
            cb cbVar = xbVar.f41639e;
            if (cbVar != null) {
                cbVar.setOnClickListener(m3Var);
            }
        }
        xbVar.k(z11);
    }

    @Override
    public final void run() {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j3;
        org.telegram.messenger.c cVar;
        TLRPC.VideoSize videoSize;
        org.telegram.messenger.c cVar2;
        org.telegram.ui.a20 a20Var;
        boolean z11;
        String a02;
        int i7;
        byte[] bArr;
        int i10;
        String G;
        int i11;
        int i12;
        int i13 = this.f37179a;
        Object obj = this.f37182e;
        Object obj2 = this.f37180b;
        Object obj3 = this.d;
        Object obj4 = this.f37181c;
        switch (i13) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hi.d dVar = (hi.d) obj4;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj3;
                Runnable runnable = (Runnable) obj;
                if (tL_error != null) {
                    cc.X().f0(tL_error, false);
                    return;
                }
                dVar.setLoading(false);
                p6Var.dismiss();
                org.telegram.messenger.k5.n(null, 2131747043, cc.X(), 2131623982, 36);
                runnable.run();
                return;
            case 1:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj4;
                ywVar.showDialog(new p20((Context) obj3, ywVar.getResourceProvider(), new hh0(2, (cm0) obj2, ywVar)));
                ((m60) obj).u();
                return;
            case 2:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj4;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj3;
                m60 m60Var = (m60) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.e6 resourceProvider = ywVar2.getResourceProvider();
                hh0 hh0Var = new hh0(1, (cm0) obj2, tL_sponsoredPeer);
                int i14 = org.telegram.ui.my0.f49340w1;
                int currentAccount = ywVar2.getCurrentAccount();
                Activity parentActivity = ywVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.lx(parentActivity, resourceProvider, bArr2, ywVar2, hh0Var, currentAccount));
                }
                m60Var.u();
                return;
            case 3:
                ((AtomicReference) obj4).set(null);
                ((yn0) obj3).didReceivedNotification(319, ((po0) obj2).f29679a, Long.valueOf(-((TLRPC.Dialog) obj).f28055id));
                return;
            case 4:
                bw0 bw0Var = (bw0) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                org.telegram.messenger.si siVar = (org.telegram.messenger.si) obj;
                bw0Var.f33396a2 = 0;
                if (tL_error2 == null) {
                    sk0 sk0Var = new sk0(bw0Var, 1);
                    sk0Var.addTarget(bw0Var.f29682b);
                    TransitionManager.beginDelayedTransition(bw0Var.f29685c, sk0Var);
                    bw0Var.f33417s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    bw0Var.N1 = tL_messages_stickerSet;
                    siVar.I1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                        bw0Var.dismiss();
                        return;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = bw0Var.N1;
                    if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bw0Var.f33398c2 = z10;
                    bw0Var.J0();
                    siVar.q1(bw0Var.N1);
                    bw0Var.a1();
                    bw0Var.Z0();
                    bw0Var.Y0();
                    bw0Var.f33410o1.f();
                    return;
                }
                bw0Var.dismiss();
                org.telegram.ui.ActionBar.e2 e2Var = bw0Var.G1;
                if (e2Var != null) {
                    org.telegram.messenger.k5.o(null, 2131754385, cc.a0(e2Var), null);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.no0 no0Var = (org.telegram.ui.no0) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                no0Var.f33396a2 = 0;
                if (tL_error3 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    if (vector.objects.isEmpty()) {
                        no0Var.dismiss();
                        return;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        no0Var.Q1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                        tL_inputStickerSetID.f28071id = stickerSet2.f28078id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        no0Var.R0();
                        return;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        no0Var.R1 = arrayList;
                        arrayList.addAll(vector.objects);
                        no0Var.n1.setLayoutParams(c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        no0Var.f33416r1.setVisibility(8);
                        no0Var.E1[0].setVisibility(8);
                        no0Var.f33410o1.f();
                        return;
                    }
                }
                t4.c0(no0Var.f29679a, tL_error3, no0Var.G1, tL_messages_getAttachedStickers, new Object[0]);
                no0Var.dismiss();
                return;
            case 6:
                ny0 ny0Var = (ny0) obj4;
                TLObject tLObject3 = (TLObject) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.np.s1(ny0Var.d).A3(0);
                    return;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String M0 = org.telegram.messenger.hd.M0(2131751105, null);
                    if (tL_error4 != null) {
                        StringBuilder m10 = r.b.m(M0, "\n");
                        m10.append(tL_error4.text);
                        M0 = m10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ny0Var.getContext());
                    String M02 = org.telegram.messenger.hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M02;
                    t1Var.U = M0;
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 7:
                p11 p11Var = (p11) obj2;
                ((m60) obj4).u();
                ((org.telegram.messenger.np) obj3).f25383r7.t(-p11Var.f38154f, ((TLRPC.TL_forumTopic) obj).f28103id, !tL_forumTopic.pinned, p11Var.f38164s);
                return;
            case 8:
                p21 p21Var = (p21) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a21 a21Var = p21Var.f38182z1;
                o21 o21Var = p21Var.I1;
                p21Var.f38170m1 = null;
                if (tL_error5 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error5.text)) {
                    p21Var.Y0();
                    return;
                }
                if (tLObject4 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject4;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        p21Var.P1 = false;
                        TLRPC.TL_textWithEntities Q0 = p21.Q0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(Q0.text);
                        org.telegram.messenger.gj.b(valueOf, Q0.entities, false, true, false, false, 0);
                        p21Var.A1.setText(p21Var.R0(valueOf));
                        o21Var.D(a21Var);
                        return;
                    }
                }
                if (p21Var.P1) {
                    p21Var.dismiss();
                    org.telegram.messenger.ns.e().k(292, 1, org.telegram.messenger.hd.M0(2131743946, null));
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743946, new cc((FrameLayout) p21Var.f29682b, p21Var.J0), null);
                l21 l21Var = p21Var.f38180x1.f37438e;
                String str = p21Var.f38179w1;
                p21Var.f38178v1 = str;
                l21Var.setText(p21.O0(str, null, null));
                o21Var.D(a21Var);
                return;
            case 9:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj3;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar3 = c40Var.f45951o1;
                org.telegram.messenger.r3 r3Var = new org.telegram.messenger.r3();
                c40Var.V2 = r3Var;
                r3Var.f26208b = new TLRPC.TL_groupCall();
                org.telegram.messenger.r3 r3Var2 = c40Var.V2;
                TLRPC.GroupCall groupCall = r3Var2.f26208b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j3 = 0;
                } else {
                    j3 = chat.f28051id;
                }
                r3Var2.f26209c = j3;
                groupCall.schedule_date = c40Var.f45932j4;
                groupCall.flags |= 128;
                r3Var2.C = cVar3;
                r3Var2.x(inputPeer);
                org.telegram.messenger.r3 r3Var3 = c40Var.V2;
                TLRPC.GroupCall groupCall2 = r3Var3.f26208b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f28061id = groupCall3.f28061id;
                r3Var3.e();
                l10 l10Var = c40Var.o4;
                org.telegram.messenger.r3 r3Var4 = c40Var.V2;
                l10Var.f36694c = r3Var4;
                c40Var.Z3.setGroupCall(r3Var4);
                org.telegram.ui.f40 f40Var = c40Var.f45949n4;
                org.telegram.messenger.r3 r3Var5 = c40Var.V2;
                f40Var.f46992c = r3Var5;
                c40Var.X1.D0(cVar3.f22778a, r3Var5.g(false));
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(cVar3.f22778a);
                org.telegram.messenger.r3 r3Var6 = c40Var.V2;
                s12.W3(r3Var6.f26209c, r3Var6);
                return;
            case 10:
                org.telegram.ui.c40 c40Var2 = (org.telegram.ui.c40) obj2;
                org.telegram.messenger.r3 r3Var7 = (org.telegram.messenger.r3) obj3;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = ((HashSet) obj4).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (r3Var7 != null) {
                        r3Var7.t(longValue);
                    }
                    arrayList2.add(org.telegram.messenger.np.s1(c40Var2.f29679a).a2(l10));
                    ArrayList<TLRPC.InputUser> arrayList5 = getrequirementstocontact.f28260id;
                    org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(c40Var2.f29679a);
                    arrayList5.add(s13.q1(s13.a2(l10)));
                }
                org.telegram.ui.hp hpVar = new org.telegram.ui.hp(c40Var2, arrayList2, arrayList3, arrayList4, str2, 10);
                if (org.telegram.messenger.m10.i(c40Var2.f29679a).q()) {
                    hpVar.run();
                    return;
                } else {
                    ConnectionsManager.getInstance(c40Var2.f29679a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList2, arrayList3, hpVar, 13));
                    return;
                }
            case 11:
                TLObject tLObject5 = (TLObject) obj2;
                ArrayList arrayList6 = (ArrayList) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                org.telegram.ui.hp hpVar2 = (org.telegram.ui.hp) obj;
                if (tLObject5 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject5;
                    for (int i15 = 0; i15 < Math.min(arrayList6.size(), vector2.objects.size()); i15++) {
                        if (vector2.objects.get(i15) instanceof TL_account.requirementToContactPremium) {
                            arrayList7.add(Long.valueOf(((TLRPC.User) arrayList6.get(i15)).f28200id));
                        }
                    }
                }
                hpVar2.run();
                return;
            case 12:
                org.telegram.ui.l30 l30Var = (org.telegram.ui.l30) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj3;
                String str3 = (String) obj;
                org.telegram.ui.c40 c40Var3 = l30Var.f48823f;
                org.telegram.messenger.c cVar4 = c40Var3.f45951o1;
                org.telegram.ui.a20 a20Var2 = c40Var3.f45942m1;
                org.telegram.messenger.gc gcVar = l30Var.d;
                if (gcVar != null) {
                    a20Var2.L0 = gcVar;
                    a20Var2.f40405r1 = null;
                    a20Var2.f40406s1 = null;
                    l30Var.d = null;
                }
                if (tL_error6 == null) {
                    org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(cVar4.f22778a);
                    int i16 = cVar4.f22778a;
                    TLRPC.User a22 = s14.a2(Long.valueOf(org.telegram.messenger.m10.i(i16).e()));
                    if (a22 == null) {
                        a22 = org.telegram.messenger.m10.i(i16).f();
                        if (a22 != null) {
                            org.telegram.messenger.np.s1(i16).X3(a22, false, false);
                        } else {
                            return;
                        }
                    } else {
                        org.telegram.messenger.m10.i(i16).w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject6;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList8, 150, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList8, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28075id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && l30Var.f48821c != null) {
                        org.telegram.messenger.w7.G(c40Var3.f29679a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(c40Var3.f29679a);
                        org.telegram.messenger.w7.J(l30Var.f48821c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(l30Var.f48821c.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(l30Var.f48821c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = cVar4;
                        a20Var = a20Var2;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z11 = true;
                        org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.l(c40Var3.f29679a, 1, a22));
                    } else {
                        cVar2 = cVar4;
                        a20Var = a20Var2;
                        z11 = true;
                    }
                    if (w11 != null && l30Var.f48820b != null) {
                        org.telegram.messenger.w7.G(c40Var3.f29679a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z11, z11);
                        org.telegram.messenger.w7.G(c40Var3.f29679a);
                        org.telegram.messenger.w7.J(l30Var.f48820b, null, z11, z11).renameTo(J2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(c40Var3.f29679a);
                        new File(str3).renameTo(org.telegram.messenger.w7.J(videoSize, "mp4", z11, z11));
                    }
                    org.telegram.messenger.np.s1(i16).U0(a22.f28200id).f();
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(a22);
                    org.telegram.messenger.vr.a0(i16).m1(arrayList9, null, false, true);
                    TLRPC.User a23 = org.telegram.messenger.np.s1(i16).a2(Long.valueOf(l30Var.f48822e));
                    org.telegram.messenger.gc l11 = org.telegram.messenger.gc.l(i16, 0, a23);
                    org.telegram.messenger.gc l12 = org.telegram.messenger.gc.l(i16, 1, a23);
                    if (org.telegram.messenger.gc.e(l30Var.f48820b) == null) {
                        l12 = org.telegram.messenger.gc.e(l30Var.f48821c);
                    }
                    org.telegram.ui.a20 a20Var3 = a20Var;
                    a20Var3.setCreateThumbFromParent(false);
                    a20Var3.H(null, l11, l12, true);
                    l30Var.f48821c = null;
                    l30Var.f48820b = null;
                    org.telegram.messenger.g0.a4(c40Var3.L1);
                    l30Var.a(1.0f);
                    cVar = cVar2;
                } else {
                    cVar = cVar4;
                }
                int i17 = cVar.f22778a;
                int i18 = cVar.f22778a;
                org.telegram.messenger.ns.f(i17).k(2, Integer.valueOf(org.telegram.messenger.np.D8));
                org.telegram.messenger.ns.f(i18).k(46, new Object[0]);
                org.telegram.messenger.m10.i(i18).v(true);
                return;
            case 13:
                org.telegram.ui.c50.Z((org.telegram.ui.c50) obj2, (ArrayList) obj4, (ArrayList) obj3, (CountDownLatch) obj);
                return;
            case 14:
                org.telegram.ui.k50 k50Var = (org.telegram.ui.k50) obj2;
                k50Var.d = (ArrayList) obj4;
                k50Var.f48588e = (ArrayList) obj3;
                k50Var.f();
                org.telegram.ui.l50 l50Var = k50Var.f48591r;
                l50Var.f48846b.d.setVisibility(8);
                l50Var.f48846b.f33707e.setText(org.telegram.messenger.hd.a0(null, null, 2131752117, (String) obj));
                l50Var.f48846b.e(false, true);
                return;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) obj3;
                TLObject tLObject7 = (TLObject) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject7 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject7;
                    Pattern pattern = t4.f39507a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.hd.E0().B.f23060c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    if (equals) {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749054, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageSame", null, 2131749047, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131745983, null), new v0(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749044, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageUnknownCustomAlert", null, 2131749045, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749046, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.hd.a0("LanguageAlert", null, 2131749053, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.hd.a0("LanguageCustomAlert", null, 2131749050, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752552, null), new m2.d(28, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i19 = indexOf + 1;
                        i7 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i19);
                        if (i7 != -1) {
                            spannableStringBuilder.delete(i7, i7 + 1);
                            spannableStringBuilder.delete(indexOf, i19);
                        }
                    } else {
                        i7 = -1;
                    }
                    if (indexOf != -1 && i7 != -1) {
                        spannableStringBuilder.setSpan(new l3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i7 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.q6.G(textView, org.telegram.ui.ActionBar.j6.f28977k5, null);
                    org.telegram.ui.ActionBar.q6.C(textView, org.telegram.ui.ActionBar.j6.f28995l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    return;
                } else if (tL_error7 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error7.text)) {
                        launchActivity.F0(t4.K(launchActivity, null, org.telegram.messenger.hd.M0(2131749043, null)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb4, "\n");
                    sb4.append(tL_error7.text);
                    launchActivity.F0(t4.K(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                String str6 = LaunchActivity.C1;
                try {
                    t1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject8 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.g50(7, gVar, tL_error8));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.q90 q90Var = (org.telegram.ui.q90) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                sq.e(e2Var2.getContext(), q90Var.f50511b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new gh(18, q90Var, userArr), e2Var2.getResourceProvider(), org.telegram.ui.q90.d());
                return;
            case 18:
                org.telegram.ui.n90.z0((org.telegram.ui.n90) obj4, (TLObject) obj3, (HashSet) obj, (TLRPC.TL_error) obj2);
                return;
            case 19:
                EditText editText = (EditText) obj3;
                bi.v vVar = (bi.v) obj;
                ((mb0) obj2).a(0.0f);
                ((View) obj4).setTag(2131296713, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.g50(19, editText, vVar));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.tb0 tb0Var = (org.telegram.ui.tb0) obj2;
                String str7 = (String) obj4;
                String str8 = (String) obj3;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str7 != null) {
                    bArr = org.telegram.messenger.g0.h1(str7);
                } else {
                    bArr = null;
                }
                org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(tb0Var, str7, str8, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = tb0Var.f51530s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.nv.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error9 = new TLRPC.TL_error();
                            tL_error9.text = "ALGO_INVALID";
                            sb0Var.run(null, tL_error9);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.e2) tb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, sb0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error10 = new TLRPC.TL_error();
                tL_error10.text = "PASSWORD_HASH_INVALID";
                sb0Var.run(null, tL_error10);
                return;
            case 21:
                org.telegram.ui.gc0 gc0Var = (org.telegram.ui.gc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ce0 ce0Var = gc0Var.E;
                ce0Var.C1(false, true);
                gc0Var.f47416n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", gc0Var.h);
                    ce0Var.M1(9, true, bundle, false);
                    return;
                } else if (tL_error11 != null && !tL_error11.text.startsWith("CODE_INVALID")) {
                    if (tL_error11.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error11.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                        return;
                    }
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error11.text);
                    return;
                } else {
                    gc0Var.n(true);
                    return;
                }
            case 22:
                org.telegram.ui.ed0 ed0Var = (org.telegram.ui.ed0) obj4;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj3;
                TLObject tLObject9 = (TLObject) obj;
                org.telegram.ui.ce0 ce0Var2 = ed0Var.f46759v0;
                ed0Var.f46742g0 = false;
                if (tL_error12 == null) {
                    ed0Var.f46754r0 = bundle2;
                    if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject9;
                        ed0Var.f46756s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            ed0Var.f46745j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            ed0Var.f46745j0 = 16;
                        }
                        ce0Var2.y1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject9 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject9;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        ce0Var2.M1(18, true, bundle2, true);
                    }
                } else {
                    String str10 = tL_error12.text;
                    if (str10 != null) {
                        if (str10.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                        } else if (!tL_error12.text.contains("PHONE_CODE_EMPTY") && !tL_error12.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                                ed0Var.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                            } else if (tL_error12.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                            } else if (tL_error12.code != -1000) {
                                String M03 = org.telegram.messenger.hd.M0(2131746071, null);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.y0.r(null, 2131751105, sb5, "\n");
                                sb5.append(tL_error12.text);
                                ce0Var2.D1(M03, sb5.toString());
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                        }
                    }
                }
                ed0Var.y(false);
                return;
            case 23:
                org.telegram.ui.kd0.n((org.telegram.ui.kd0) obj2, (String) obj4, (String) obj3, (String) obj);
                return;
            case 24:
                f5.m mVar = (f5.m) obj4;
                org.telegram.ui.r3 r3Var8 = (org.telegram.ui.r3) obj3;
                org.telegram.ui.ce0 ce0Var3 = ((org.telegram.ui.kd0) obj2).f48687w;
                ce0Var3.f46092e = true;
                org.telegram.messenger.r1.i().d(mVar.f10996c, new org.telegram.ui.f3(r3Var8, 3));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.id0(r3Var8, 0);
                org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                Activity parentActivity2 = ce0Var3.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.e2) ce0Var3).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                wf.b bVar = new wf.b(17, false);
                bVar.R(mVar);
                i20.l(parentActivity2, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.p()));
                return;
            case 25:
                org.telegram.ui.be0 be0Var = (org.telegram.ui.be0) obj4;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                TLObject tLObject10 = (TLObject) obj3;
                String str11 = (String) obj;
                be0Var.N = false;
                org.telegram.ui.ce0 ce0Var4 = be0Var.f45699h0;
                ce0Var4.N1(false, true);
                if (tL_error13 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject10;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        t4.u0(ce0Var4.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str11);
                    ce0Var4.M1(6, true, bundle3, false);
                    return;
                }
                ce0Var4.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error13.text);
                return;
            case 26:
                org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) obj2;
                mg.b bVar2 = (mg.b) obj4;
                String str12 = (String) obj3;
                org.telegram.ui.y41 y41Var = (org.telegram.ui.y41) obj;
                org.telegram.ui.jg0 jg0Var = gg0Var.f47450w.d;
                if (bVar2 != null) {
                    jg0Var.f48346w.l(str12, bVar2);
                }
                if (bVar2 != null && !y41Var.f53412b && (i12 = y41Var.f53411a) >= 0) {
                    View m11 = jg0Var.h.m(i12);
                    if (m11 instanceof org.telegram.ui.j41) {
                        gg0Var.f48221r.f48833e = bVar2;
                        org.telegram.ui.j41 j41Var = (org.telegram.ui.j41) m11;
                        j41Var.f48216b.f19456u0.d(false, false);
                        j41Var.g(false);
                    }
                }
                gg0Var.f();
                return;
            case 27:
                org.telegram.ui.oh0 oh0Var = (org.telegram.ui.oh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                jg.z1 z1Var = oh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = oh0Var.f49973n;
                if (notificationsCustomSettingsActivity.f42675f) {
                    oh0Var.f49972f = null;
                    oh0Var.d = arrayList10;
                    oh0Var.f49971e = arrayList11;
                    z1Var.f(arrayList12, null);
                    if (notificationsCustomSettingsActivity.f42675f && !z1Var.e()) {
                        notificationsCustomSettingsActivity.f42673c.c();
                    }
                    oh0Var.f();
                    return;
                }
                return;
            case 28:
                a();
                return;
            default:
                org.telegram.ui.jl0.i0((org.telegram.ui.jl0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
        }
    }

    public ma0(Object obj, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i7) {
        this.f37179a = i7;
        this.f37181c = obj;
        this.d = obj2;
        this.f37182e = obj3;
        this.f37180b = tL_error;
    }

    public ma0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, int i7) {
        this.f37179a = i7;
        this.f37181c = obj;
        this.f37180b = tL_error;
        this.d = obj2;
        this.f37182e = obj3;
    }

    public ma0(org.telegram.ui.jl0 jl0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        this.f37179a = 29;
        this.f37181c = jl0Var;
        this.d = tLObject;
        this.f37180b = tL_error;
        this.f37182e = gettmppassword;
    }
}
