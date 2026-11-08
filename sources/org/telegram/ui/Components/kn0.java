package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
public final class kn0 implements Runnable {
    public final int f35396a;
    public final Object f35397b;
    public final Object f35398c;
    public final Object d;
    public final Object f35399e;

    public kn0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f35396a = i7;
        this.f35397b = obj;
        this.f35398c = obj2;
        this.d = obj3;
        this.f35399e = obj4;
    }

    private final void a() {
        boolean z9;
        boolean z10;
        String str;
        TLRPC.Chat M0;
        int i7;
        int i10;
        String M02;
        String a02;
        cc Q;
        String str2;
        org.telegram.ui.gl0 gl0Var;
        org.telegram.ui.gl0 gl0Var2;
        org.telegram.ui.hl0 hl0Var = (org.telegram.ui.hl0) this.f35397b;
        TLRPC.Message message = (TLRPC.Message) this.f35399e;
        hl0Var.f46407a1 = true;
        hl0Var.f46421f1 = 1;
        hl0Var.D0((org.telegram.ui.ActionBar.q4) this.f35398c, (Activity) this.d);
        TLRPC.InputInvoice inputInvoice = hl0Var.f46410b1;
        boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        if (z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z11 && (gl0Var2 = hl0Var.Z0) != null) {
            gl0Var2.b(hl0Var.f46421f1);
        }
        hl0Var.z0();
        if (z11 && (gl0Var = hl0Var.Z0) != null) {
            gl0Var.b(hl0Var.f46421f1);
        }
        long w02 = hl0Var.w0();
        int i11 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
        if (i11 > 0) {
            str = org.telegram.messenger.t10.k(hl0Var.getMessagesController().a2(Long.valueOf(w02)));
        } else {
            str = "";
            if (i11 < 0 && (M0 = hl0Var.getMessagesController().M0(Long.valueOf(-w02))) != null) {
                str = M0.title;
            }
        }
        long v02 = hl0Var.v0();
        if (z11) {
            if (!z9 && !z10) {
                i7 = 2131624226;
            } else {
                i7 = 2131624225;
            }
        } else {
            i7 = 2131624114;
        }
        int i12 = i7;
        if (!z11) {
            M02 = null;
        } else {
            if (z10) {
                i10 = 2131745095;
            } else if (z9) {
                i10 = 2131745103;
            } else {
                i10 = 2131745162;
            }
            M02 = org.telegram.messenger.id.M0(i10, null);
        }
        if (z11) {
            if (z10) {
                a02 = org.telegram.messenger.id.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
            } else {
                if (z9) {
                    str2 = "StarsGiftSentPopupInfo";
                } else {
                    str2 = "StarsAcquiredInfo";
                }
                a02 = org.telegram.messenger.id.K(str2, (int) v02, ',', str);
            }
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131747402, hl0Var.R0[0], hl0Var.f46432q0);
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        hc a03 = hc.a0(T);
        if (i11 != 0 && M02 != null && !z10) {
            Q = a03.L(i12, M02, X2, org.telegram.messenger.id.M0(2131743555, null), new bi.k4(w02, 3));
        } else {
            String str3 = M02;
            if (str3 != null) {
                Q = a03.I(i12, str3, X2);
            } else {
                Q = a03.Q(i12, 36, X2);
            }
        }
        cc ccVar = Q;
        ccVar.f32553r = false;
        ccVar.f32545j = 5000;
        if (message != null) {
            di.r3 r3Var = new di.r3(hl0Var, ccVar, z9, message, 4);
            gb gbVar = ccVar.f32541e;
            if (gbVar != null) {
                gbVar.setOnClickListener(r3Var);
            }
        }
        ccVar.k(z10);
    }

    private final void b() {
        PhotoViewer photoViewer = (PhotoViewer) this.f35397b;
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.d;
        String str = (String) this.f35399e;
        Drawable[] drawableArr = PhotoViewer.Y8;
        Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.gf) this.f35398c).I);
        if (decodeFile == null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.cn0(photoViewer, 10));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(gfVar.I, iArr, 0L);
        int max = Math.max(iArr[1], gfVar.F);
        int max2 = Math.max(iArr[2], gfVar.G);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f10 = max;
        float f11 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
        int i7 = (int) (f11 * max3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i7, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            org.telegram.messenger.g0.h3(new kn0(photoViewer, gfVar, str, createBitmap2, 28));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new org.telegram.ui.cn0(photoViewer, 11));
        }
    }

    @Override
    public final void run() {
        boolean z9;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j3;
        org.telegram.messenger.c cVar;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.l30 l30Var;
        boolean z10;
        String a02;
        int i7;
        byte[] bArr;
        int i10;
        String G;
        int i11;
        int i12;
        int i13 = this.f35396a;
        Object obj = this.f35399e;
        Object obj2 = this.d;
        Object obj3 = this.f35398c;
        Object obj4 = this.f35397b;
        switch (i13) {
            case 0:
                ((AtomicReference) obj3).set(null);
                ((vn0) obj2).didReceivedNotification(319, ((mo0) obj4).f28616a, Long.valueOf(-((TLRPC.Dialog) obj).f26960id));
                return;
            case 1:
                yv0 yv0Var = (yv0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) obj;
                yv0Var.W1 = 0;
                if (tL_error == null) {
                    nk0 nk0Var = new nk0(yv0Var, 1);
                    nk0Var.addTarget(yv0Var.f28619b);
                    TransitionManager.beginDelayedTransition(yv0Var.f28622c, nk0Var);
                    yv0Var.f40792o1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    yv0Var.J1 = tL_messages_stickerSet;
                    uiVar.I1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yv0Var.J1;
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                        yv0Var.dismiss();
                        return;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = yv0Var.J1;
                    if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    yv0Var.Y1 = z9;
                    yv0Var.J0();
                    uiVar.q1(yv0Var.J1);
                    yv0Var.a1();
                    yv0Var.Z0();
                    yv0Var.Y0();
                    yv0Var.f40787k1.f();
                    return;
                }
                yv0Var.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = yv0Var.C1;
                if (f2Var != null) {
                    org.telegram.messenger.k5.p(null, 2131754385, hc.a0(f2Var), null);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.po0 po0Var = (org.telegram.ui.po0) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                po0Var.W1 = 0;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    if (vector.objects.isEmpty()) {
                        po0Var.dismiss();
                        return;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        po0Var.M1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                        tL_inputStickerSetID.f26976id = stickerSet2.f26983id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        po0Var.R0();
                        return;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        po0Var.N1 = arrayList;
                        arrayList.addAll(vector.objects);
                        po0Var.f40785j1.setLayoutParams(c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        po0Var.n1.setVisibility(8);
                        po0Var.A1[0].setVisibility(8);
                        po0Var.f40787k1.f();
                        return;
                    }
                }
                v4.c0(po0Var.f28616a, tL_error2, po0Var.C1, tL_messages_getAttachedStickers, new Object[0]);
                po0Var.dismiss();
                return;
            case 3:
                ly0 ly0Var = (ly0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.qp.s1(ly0Var.d).A3(0);
                    return;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String M0 = org.telegram.messenger.id.M0(2131751106, null);
                    if (tL_error3 != null) {
                        StringBuilder j10 = rf.b.j(M0, "\n");
                        j10.append(tL_error3.text);
                        M0 = j10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ly0Var.getContext());
                    String M02 = org.telegram.messenger.id.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M02;
                    u1Var.T = M0;
                    jg.g.C(null, 2131747832, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 4:
                m11 m11Var = (m11) obj4;
                ((k60) obj3).u();
                ((org.telegram.messenger.qp) obj2).f24877q7.t(-m11Var.f35852f, ((TLRPC.TL_forumTopic) obj).f27008id, !tL_forumTopic.pinned, m11Var.f35861s);
                return;
            case 5:
                k21 k21Var = (k21) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                v11 v11Var = k21Var.f35175v1;
                j21 j21Var = k21Var.E1;
                k21Var.f35164i1 = null;
                if (tL_error4 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error4.text)) {
                    k21Var.X0();
                    return;
                }
                if (tLObject4 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject4;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        k21Var.L1 = false;
                        TLRPC.TL_textWithEntities P0 = k21.P0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                        org.telegram.messenger.ij.b(valueOf, P0.entities, false, true, false, false, 0);
                        k21Var.f35176w1.setText(k21Var.Q0(valueOf));
                        j21Var.D(v11Var);
                        return;
                    }
                }
                if (k21Var.L1) {
                    k21Var.dismiss();
                    org.telegram.messenger.qs.e().k(292, 1, org.telegram.messenger.id.M0(2131743949, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743949, new hc((FrameLayout) k21Var.f28619b, k21Var.I0), null);
                g21 g21Var = k21Var.f35173t1.f34514e;
                String str = k21Var.f35172s1;
                k21Var.f35171r1 = str;
                g21Var.setText(k21.O0(str, null, null));
                j21Var.D(v11Var);
                return;
            case 6:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar2 = c40Var.f44588k1;
                org.telegram.messenger.r3 r3Var = new org.telegram.messenger.r3();
                c40Var.R2 = r3Var;
                r3Var.f25222b = new TLRPC.TL_groupCall();
                org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                TLRPC.GroupCall groupCall = r3Var2.f25222b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j3 = 0;
                } else {
                    j3 = chat.f26956id;
                }
                r3Var2.f25223c = j3;
                groupCall.schedule_date = c40Var.f44554b4;
                groupCall.flags |= 128;
                r3Var2.C = cVar2;
                r3Var2.x(inputPeer);
                org.telegram.messenger.r3 r3Var3 = c40Var.R2;
                TLRPC.GroupCall groupCall2 = r3Var3.f25222b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f26966id = groupCall3.f26966id;
                r3Var3.e();
                i10 i10Var = c40Var.f44573g4;
                org.telegram.messenger.r3 r3Var4 = c40Var.R2;
                i10Var.f34498c = r3Var4;
                c40Var.R3.setGroupCall(r3Var4);
                org.telegram.ui.f40 f40Var = c40Var.f44569f4;
                org.telegram.messenger.r3 r3Var5 = c40Var.R2;
                f40Var.f45434c = r3Var5;
                c40Var.T1.D0(cVar2.f21765a, r3Var5.g(false));
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(cVar2.f21765a);
                org.telegram.messenger.r3 r3Var6 = c40Var.R2;
                s12.W3(r3Var6.f25223c, r3Var6);
                return;
            case 7:
                org.telegram.ui.c40 c40Var2 = (org.telegram.ui.c40) obj4;
                org.telegram.messenger.r3 r3Var7 = (org.telegram.messenger.r3) obj2;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (r3Var7 != null) {
                        r3Var7.t(longValue);
                    }
                    arrayList2.add(org.telegram.messenger.qp.s1(c40Var2.f28616a).a2(l10));
                    ArrayList<TLRPC.InputUser> arrayList5 = getrequirementstocontact.f27165id;
                    org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(c40Var2.f28616a);
                    arrayList5.add(s13.q1(s13.a2(l10)));
                }
                jv0 jv0Var = new jv0((Object) c40Var2, (Object) arrayList2, (Object) arrayList3, (Object) arrayList4, str2, 6);
                if (org.telegram.messenger.p10.i(c40Var2.f28616a).q()) {
                    jv0Var.run();
                    return;
                } else {
                    ConnectionsManager.getInstance(c40Var2.f28616a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList2, arrayList3, jv0Var, 13));
                    return;
                }
            case 8:
                TLObject tLObject5 = (TLObject) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                jv0 jv0Var2 = (jv0) obj;
                if (tLObject5 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject5;
                    for (int i14 = 0; i14 < Math.min(arrayList6.size(), vector2.objects.size()); i14++) {
                        if (vector2.objects.get(i14) instanceof TL_account.requirementToContactPremium) {
                            arrayList7.add(Long.valueOf(((TLRPC.User) arrayList6.get(i14)).f27105id));
                        }
                    }
                }
                jv0Var2.run();
                return;
            case 9:
                org.telegram.ui.l30 l30Var2 = (org.telegram.ui.l30) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.c40 c40Var3 = l30Var2.f47404f;
                org.telegram.messenger.c cVar3 = c40Var3.f44588k1;
                org.telegram.ui.b20 b20Var = c40Var3.f44579i1;
                org.telegram.messenger.hc hcVar = l30Var2.d;
                if (hcVar != null) {
                    b20Var.K0 = hcVar;
                    b20Var.f38062q1 = null;
                    b20Var.f38063r1 = null;
                    l30Var2.d = null;
                }
                if (tL_error5 == null) {
                    org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(cVar3.f21765a);
                    int i15 = cVar3.f21765a;
                    TLRPC.User a22 = s14.a2(Long.valueOf(org.telegram.messenger.p10.i(i15).e()));
                    if (a22 == null) {
                        a22 = org.telegram.messenger.p10.i(i15).f();
                        if (a22 != null) {
                            org.telegram.messenger.qp.s1(i15).X3(a22, false, false);
                        } else {
                            return;
                        }
                    } else {
                        org.telegram.messenger.p10.i(i15).w(a22);
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26980id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 != null && l30Var2.f47402c != null) {
                        org.telegram.messenger.w7.G(c40Var3.f28616a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(c40Var3.f28616a);
                        org.telegram.messenger.w7.J(l30Var2.f47402c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(l30Var2.f47402c.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(l30Var2.f47402c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        l30Var = l30Var2;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.l(c40Var3.f28616a, 1, a22));
                    } else {
                        l30Var = l30Var2;
                        z10 = true;
                    }
                    org.telegram.ui.l30 l30Var3 = l30Var;
                    if (w11 != null && l30Var3.f47401b != null) {
                        org.telegram.messenger.w7.G(c40Var3.f28616a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z10, z10);
                        org.telegram.messenger.w7.G(c40Var3.f28616a);
                        org.telegram.messenger.w7.J(l30Var3.f47401b, null, z10, z10).renameTo(J2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(c40Var3.f28616a);
                        new File(str3).renameTo(org.telegram.messenger.w7.J(videoSize, "mp4", z10, z10));
                    }
                    org.telegram.messenger.qp.s1(i15).U0(a22.f27105id).f();
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(a22);
                    org.telegram.messenger.yr.a0(i15).m1(arrayList9, null, false, true);
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(i15).a2(Long.valueOf(l30Var3.f47403e));
                    org.telegram.messenger.hc l11 = org.telegram.messenger.hc.l(i15, 0, a23);
                    org.telegram.messenger.hc l12 = org.telegram.messenger.hc.l(i15, 1, a23);
                    if (org.telegram.messenger.hc.e(l30Var3.f47401b) == null) {
                        l12 = org.telegram.messenger.hc.e(l30Var3.f47402c);
                    }
                    b20Var.setCreateThumbFromParent(false);
                    b20Var.H(null, l11, l12, true);
                    l30Var3.f47402c = null;
                    l30Var3.f47401b = null;
                    org.telegram.messenger.g0.b4(c40Var3.H1);
                    l30Var3.a(1.0f);
                    cVar = cVar3;
                } else {
                    cVar = cVar3;
                }
                int i16 = cVar.f21765a;
                int i17 = cVar.f21765a;
                org.telegram.messenger.qs.f(i16).k(2, Integer.valueOf(org.telegram.messenger.qp.C8));
                org.telegram.messenger.qs.f(i17).k(46, new Object[0]);
                org.telegram.messenger.p10.i(i17).v(true);
                return;
            case 10:
                org.telegram.ui.d50.Z((org.telegram.ui.d50) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 11:
                org.telegram.ui.l50 l50Var = (org.telegram.ui.l50) obj4;
                l50Var.d = (ArrayList) obj3;
                l50Var.f47424e = (ArrayList) obj2;
                l50Var.f();
                org.telegram.ui.m50 m50Var = l50Var.f47427r;
                m50Var.f47663b.d.setVisibility(8);
                m50Var.f47663b.f31927e.setText(org.telegram.messenger.id.a0(null, null, 2131752117, (String) obj));
                m50Var.f47663b.e(false, true);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.q10 q10Var = (org.telegram.ui.q10) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str4 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject7 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject7;
                    Pattern pattern = v4.f38848a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.id.E0().B.f22398c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    if (equals) {
                        u1Var2.R = org.telegram.messenger.id.M0(2131749055, null);
                        a02 = org.telegram.messenger.id.a0("LanguageSame", null, 2131749048, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747832, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.id.M0(2131745986, null), new y0(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        u1Var2.R = org.telegram.messenger.id.M0(2131749045, null);
                        a02 = org.telegram.messenger.id.a0("LanguageUnknownCustomAlert", null, 2131749046, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747832, null), null);
                    } else {
                        u1Var2.R = org.telegram.messenger.id.M0(2131749047, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.id.a0("LanguageAlert", null, 2131749054, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.id.a0("LanguageCustomAlert", null, 2131749051, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131752552, null), new ni.c(24, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i18 = indexOf + 1;
                        i7 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i18);
                        if (i7 != -1) {
                            spannableStringBuilder.delete(i7, i7 + 1);
                            spannableStringBuilder.delete(indexOf, i18);
                        }
                    } else {
                        i7 = -1;
                    }
                    if (indexOf != -1 && i7 != -1) {
                        spannableStringBuilder.setSpan(new n3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i7 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.f27980k5, null);
                    org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.f27998l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    return;
                } else if (tL_error6 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error6.text)) {
                        launchActivity.F0(v4.K(launchActivity, null, org.telegram.messenger.id.M0(2131749044, null)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb4, "\n");
                    sb4.append(tL_error6.text);
                    launchActivity.F0(v4.K(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                String str6 = LaunchActivity.B1;
                try {
                    u1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject8 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.q10(11, gVar, tL_error7));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.p90 p90Var = (org.telegram.ui.p90) obj4;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                lq.e(f2Var2.getContext(), p90Var.f48712b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new fx(13, p90Var, userArr), f2Var2.getResourceProvider(), org.telegram.ui.p90.d());
                return;
            case 15:
                org.telegram.ui.m90.z0((org.telegram.ui.m90) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 16:
                EditText editText = (EditText) obj2;
                fi.h7 h7Var = (fi.h7) obj;
                ((lb0) obj4).a(0.0f);
                ((View) obj3).setTag(2131296713, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.q10(23, editText, h7Var));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.ub0 ub0Var = (org.telegram.ui.ub0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str7 != null) {
                    bArr = org.telegram.messenger.g0.h1(str7);
                } else {
                    bArr = null;
                }
                org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(ub0Var, str7, str8, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ub0Var.f50299s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.pv.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                            tL_error8.text = "ALGO_INVALID";
                            sb0Var.run(null, tL_error8);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.f2) ub0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, sb0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error9 = new TLRPC.TL_error();
                tL_error9.text = "PASSWORD_HASH_INVALID";
                sb0Var.run(null, tL_error9);
                return;
            case 18:
                org.telegram.ui.hc0 hc0Var = (org.telegram.ui.hc0) obj4;
                String str9 = (String) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                org.telegram.ui.ce0 ce0Var = hc0Var.D;
                ce0Var.C1(false, true);
                hc0Var.f46338n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", hc0Var.h);
                    ce0Var.M1(9, true, bundle, false);
                    return;
                } else if (tL_error10 != null && !tL_error10.text.startsWith("CODE_INVALID")) {
                    if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error10.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error10.text);
                    return;
                } else {
                    hc0Var.n(true);
                    return;
                }
            case 19:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) obj4;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject9 = (TLObject) obj;
                org.telegram.ui.ce0 ce0Var2 = gd0Var.f45982u0;
                gd0Var.f45965f0 = false;
                if (tL_error11 == null) {
                    gd0Var.f45976q0 = bundle2;
                    if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject9;
                        gd0Var.f45978r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            gd0Var.f45968i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            gd0Var.f45968i0 = 16;
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
                    String str10 = tL_error11.text;
                    if (str10 != null) {
                        if (str10.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, null));
                        } else if (!tL_error11.text.contains("PHONE_CODE_EMPTY") && !tL_error11.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error11.text.contains("PHONE_CODE_EXPIRED")) {
                                gd0Var.c(true);
                                ce0Var2.M1(0, true, null, true);
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                            } else if (tL_error11.text.startsWith("FLOOD_WAIT")) {
                                ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, null));
                            } else if (tL_error11.code != -1000) {
                                String M03 = org.telegram.messenger.id.M0(2131746074, null);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751106, sb5, "\n");
                                sb5.append(tL_error11.text);
                                ce0Var2.D1(M03, sb5.toString());
                            }
                        } else {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, null));
                        }
                    }
                }
                gd0Var.y(false);
                return;
            case 20:
                org.telegram.ui.ld0.n((org.telegram.ui.ld0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 21:
                f5.l lVar = (f5.l) obj3;
                org.telegram.ui.r3 r3Var8 = (org.telegram.ui.r3) obj2;
                org.telegram.ui.ce0 ce0Var3 = ((org.telegram.ui.ld0) obj4).f47522w;
                ce0Var3.f44768e = true;
                org.telegram.messenger.r1.i().d(lVar.f11168c, new org.telegram.ui.f3(r3Var8, 3));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.kd0(r3Var8, 0);
                org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                Activity parentActivity = ce0Var3.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.f2) ce0Var3).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                q4.q qVar = new q4.q(20, false);
                qVar.g(lVar);
                i19.l(parentActivity, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(qVar.a()));
                return;
            case 22:
                org.telegram.ui.be0 be0Var = (org.telegram.ui.be0) obj4;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj3;
                TLObject tLObject10 = (TLObject) obj2;
                String str11 = (String) obj;
                be0Var.M = false;
                org.telegram.ui.ce0 ce0Var4 = be0Var.f44304g0;
                ce0Var4.N1(false, true);
                if (tL_error12 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject10;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        v4.u0(ce0Var4.getParentActivity(), org.telegram.messenger.id.M0(2131743823, "UpdateAppAlert"), true);
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
                ce0Var4.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error12.text);
                return;
            case 23:
                org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) obj4;
                mg.b bVar = (mg.b) obj3;
                String str12 = (String) obj2;
                org.telegram.ui.b51 b51Var = (org.telegram.ui.b51) obj;
                org.telegram.ui.jg0 jg0Var = gg0Var.f46003w.d;
                if (bVar != null) {
                    jg0Var.f46971w.l(str12, bVar);
                }
                if (bVar != null && !b51Var.f44203b && (i12 = b51Var.f44202a) >= 0) {
                    View m10 = jg0Var.h.m(i12);
                    if (m10 instanceof org.telegram.ui.l41) {
                        gg0Var.f47419r.f48256e = bVar;
                        org.telegram.ui.l41 l41Var = (org.telegram.ui.l41) m10;
                        l41Var.f47414b.f18322t0.d(false, false);
                        l41Var.g(false);
                    }
                }
                gg0Var.f();
                return;
            case 24:
                org.telegram.ui.mh0 mh0Var = (org.telegram.ui.mh0) obj4;
                ArrayList arrayList10 = (ArrayList) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                jg.z1 z1Var = mh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = mh0Var.f47811n;
                if (notificationsCustomSettingsActivity.f41307f) {
                    mh0Var.f47810f = null;
                    mh0Var.d = arrayList10;
                    mh0Var.f47809e = arrayList11;
                    z1Var.f(arrayList12, null);
                    if (notificationsCustomSettingsActivity.f41307f && !z1Var.e()) {
                        notificationsCustomSettingsActivity.f41305c.c();
                    }
                    mh0Var.f();
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                org.telegram.ui.hl0.i0((org.telegram.ui.hl0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 27:
                b();
                return;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj3;
                String str13 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (gfVar.f26849g != null) {
                    try {
                        new File(gfVar.f26849g).delete();
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                }
                gfVar.d = -1L;
                gfVar.f26849g = str13;
                gfVar.f26847e = null;
                gfVar.f26848f = null;
                photoViewer.f41483p5.f38614b.setLoading(false);
                org.telegram.ui.uq0 uq0Var = photoViewer.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer.O4);
                }
                org.telegram.ui.xo0 xo0Var = photoViewer.f41404g1;
                if (xo0Var != null) {
                    xo0Var.setImage(bitmap);
                }
                photoViewer.b3(0);
                CheckBox checkBox = photoViewer.N0;
                if (!checkBox.f31248y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ao0 ao0Var = (org.telegram.ui.ao0) obj;
                ImageView imageView = photoViewer2.f41545w3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer2.f41545w3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ao0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
