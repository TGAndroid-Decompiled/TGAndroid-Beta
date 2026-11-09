package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class lo0 implements Runnable {
    public final int f47657a;
    public final Object f47658b;
    public final Object f47659c;
    public final Object d;
    public final Object f47660e;

    public lo0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f47657a = i7;
        this.f47659c = obj;
        this.f47658b = obj2;
        this.d = obj3;
        this.f47660e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lo0.a():void");
    }

    @Override
    public final void run() {
        Uri fromFile;
        int i7;
        TLObject M0;
        int indexOf;
        TLObject M02;
        int i10;
        char c10;
        String G;
        org.telegram.ui.web.x0 x0Var;
        boolean z9;
        int i11 = 2;
        boolean z10 = false;
        switch (this.f47657a) {
            case 0:
                TLObject tLObject = (TLObject) this.f47658b;
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.f47660e;
                PhotoViewer photoViewer = ((so0) this.f47659c).f49967b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer.T;
                    ArrayList arrayList = photoViewer.f41398e7;
                    org.telegram.messenger.qp.s1(i12).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(photoViewer.T).a2(Long.valueOf(p10Var.f24489n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (a22 != null) {
                            a22.photo.photo_id = tL_photos_photo.photo.f26980id;
                            p10Var.w(a22);
                            p10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                js0.Z((js0) this.f47659c, (TLRPC.TL_error) this.d, (TLObject) this.f47658b, (TL_stars.updatePaidMessagesPrice) this.f47660e);
                return;
            case 2:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.f47659c, (TLRPC.TL_error) this.d, (TLObject) this.f47658b, (boolean[]) this.f47660e);
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f47659c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                TLObject tLObject2 = (TLObject) this.f47658b;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.f47660e;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().H = setaccountttl.ttl.days;
                    privacySettingsActivity.f41684a.f();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f47659c;
                boolean[] zArr = (boolean[]) this.f47658b;
                Activity activity = (Activity) this.d;
                File file = (File) this.f47660e;
                RectF rectF = ProfileActivity.V6;
                try {
                    u1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr[0]) {
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 24) {
                        org.telegram.messenger.t0.d();
                        fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i13 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.id.E0().z0().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, org.telegram.messenger.id.M0(2131751105, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f47659c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr = (int[]) this.f47660e;
                if (!(((TLObject) this.f47658b) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.V6;
                    profileActivity.getClass();
                    i7 = 0;
                    org.telegram.ui.Components.hc.a0(profileActivity).f0(tL_error, false);
                } else {
                    i7 = 0;
                }
                if (profileActivity.f41794n4 == iArr[i7]) {
                    profileActivity.f41794n4 = i7;
                    return;
                }
                return;
            case 6:
                ProfileActivity.i0((ProfileActivity) this.f47659c, (TLRPC.TL_error) this.d, (TLObject) this.f47658b, (String) this.f47660e);
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f47659c;
                String[] strArr = (String[]) this.f47658b;
                String str = (String) this.d;
                String str2 = (String) this.f47660e;
                RectF rectF3 = ProfileActivity.V6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.l21.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str, str2, new l00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f47659c;
                TLObject tLObject3 = (TLObject) this.f47658b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47660e;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f41723d1 != 0) {
                        M0 = profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.f41723d1));
                    } else {
                        M0 = profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f41730e1));
                    }
                    j00.a(profileActivity3.getParentActivity(), 0, tL_username.username, M0, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.f41876z0);
                    return;
                }
                RectF rectF4 = ProfileActivity.V6;
                org.telegram.ui.Components.hc.d0(tL_error2);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) this.f47658b;
                org.telegram.messenger.p10 p10Var2 = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.f47660e;
                ProfileActivity profileActivity4 = ((tv0) this.f47659c).f50246b;
                profileActivity4.f41791n0.f38397c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(p10Var2.f24489n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f41791n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (a23 != null) {
                            a23.photo.photo_id = tL_photos_photo2.photo.f26980id;
                            p10Var2.w(a23);
                            p10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                TLObject tLObject5 = (TLObject) this.f47658b;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f47660e;
                ProfileActivity profileActivity5 = ((ew0) this.f47659c).f45523c.f47690e;
                profileActivity5.h5(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f41723d1 != 0) {
                        M02 = profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.f41723d1));
                    } else {
                        M02 = profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.f41730e1));
                    }
                    TLObject tLObject6 = M02;
                    if (profileActivity5.getParentActivity() != null) {
                        j00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f41876z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.hc.d0(tL_error3);
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f47659c;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.f47658b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.f47660e;
                try {
                    u1Var3.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    a31 a31Var = sessionsActivity.f41962a;
                    if (a31Var != null) {
                        a31Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f47659c;
                org.telegram.ui.ActionBar.u1 u1Var4 = (org.telegram.ui.ActionBar.u1) this.f47658b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f47660e;
                try {
                    u1Var4.dismiss();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.f41965e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    a31 a31Var2 = sessionsActivity2.f41962a;
                    if (a31Var2 != null) {
                        a31Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                z21 z21Var = (z21) this.f47659c;
                z21Var.f52403a = (TLObject) this.f47658b;
                z21Var.f52404b = (TLRPC.TL_error) this.d;
                ((j9) this.f47660e).run();
                return;
            case 14:
                n31.d0((n31) this.f47659c, (TLRPC.TL_error) this.d, (TLObject) this.f47658b, (String) this.f47660e);
                return;
            case 15:
                n41 n41Var = (n41) this.f47659c;
                mg.b bVar = (mg.b) this.f47658b;
                String str3 = (String) this.d;
                c51 c51Var = (c51) this.f47660e;
                d51 d51Var = n41Var.f48094x;
                if (bVar != null) {
                    d51Var.U.l(str3, bVar);
                }
                if (bVar != null && !c51Var.f44226b && (i10 = c51Var.f44225a) >= 0) {
                    View m10 = d51Var.T.m(i10);
                    if (m10 instanceof n41) {
                        n41Var.f47749r.f48623e = bVar;
                        n41 n41Var2 = (n41) m10;
                        n41Var2.f47744b.f18322t0.d(false, false);
                        n41Var2.g(false);
                    }
                }
                d51.c0(d51Var);
                return;
            case 16:
                p41 p41Var = (p41) this.f47659c;
                p41Var.f48628k = false;
                p41Var.d = (mg.b) this.f47658b;
                p41Var.f48625g = (String) this.d;
                m41 m41Var = (m41) ((org.telegram.messenger.u10) this.f47660e).run();
                if (m41Var != null) {
                    m41Var.e(p41Var, true);
                    return;
                }
                return;
            case 17:
                TLObject tLObject7 = (TLObject) this.f47658b;
                String str4 = (String) this.d;
                org.telegram.ui.ActionBar.u1 u1Var5 = (org.telegram.ui.ActionBar.u1) this.f47660e;
                w81 w81Var = ((r81) this.f47659c).f49345a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    int i14 = 0;
                    while (i14 < updates.updates.size()) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = w81Var.getMessagesController().z1(w81Var.f50975a);
                            tL_messageService.dialog_id = w81Var.f50975a;
                            tL_messageService.f26977id = tL_updateMessageID.f27214id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new org.telegram.messenger.ij(w81.c0(w81Var), tL_messageService, false, false));
                            TLRPC.Chat M03 = w81Var.getMessagesController().M0(Long.valueOf(-w81Var.f50975a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f27008id = tL_updateMessageID.f27214id;
                            long j3 = w81Var.f50976b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i11;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f26977id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = w81Var.getMessagesController().z1(w81Var.getUserConfig().f24489n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = w81Var.E;
                            cn cnVar = w81Var.D;
                            if (cnVar != null) {
                                cnVar.nb();
                                cnVar.rb();
                                cnVar.Ub(arrayList3, M03, tL_messageService.f26977id, 1, 1, tL_forumTopic);
                                cnVar.f44405c = true;
                                cnVar.K8();
                                cnVar.vd(true);
                                cnVar.f44560o1.n(true);
                                cnVar.Bd();
                                cnVar.f44449f2.setCurrentTopic(cnVar.b());
                                cnVar.yd(true);
                                cnVar.Oc(true);
                                cnVar.C9(true);
                                cnVar.N6(true, true);
                                cnVar.gb();
                                w81Var.getMessagesController().f24877q7.q(w81Var.f50975a, tL_forumTopic, true);
                                w81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -w81Var.f50975a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                cn cnVar2 = new cn(bundle);
                                cnVar2.Ub(arrayList3, M03, tL_messageService.f26977id, 1, 1, tL_forumTopic);
                                cnVar2.f44405c = true;
                                w81Var.getMessagesController().f24877q7.q(w81Var.f50975a, tL_forumTopic, true);
                                w81Var.presentFragment(cnVar2);
                            }
                        }
                        i14++;
                        i11 = 2;
                    }
                }
                u1Var5.dismiss();
                return;
            case 18:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.f47659c, (byte[]) this.d, (TLObject) this.f47658b, (byte[]) this.f47660e);
                return;
            case 19:
                bb1 bb1Var = (bb1) this.f47659c;
                String str5 = (String) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f47660e;
                if (((TLObject) this.f47658b) instanceof TLRPC.TL_boolTrue) {
                    bb1Var.z0(new ax0(26, bb1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M04 = org.telegram.messenger.id.M0(2131743931, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        bb1Var.L0(M04, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, objArr));
                        return;
                    }
                    bb1Var.L0(org.telegram.messenger.id.M0(2131743931, null), tL_error6.text);
                    return;
                } else {
                    bb1Var.D0();
                    return;
                }
            case 20:
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.f47659c;
                di.p7 p7Var = (di.p7) this.f47658b;
                String str6 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.f47660e;
                if (u0Var.f51296c && ((x0Var = u0Var.Q) == null || !x0Var.o(p7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                u0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 21:
                ui.e eVar = (ui.e) this.f47659c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f47658b;
                p4.h hVar = (p4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f47660e;
                synchronized (eVar.f56943b) {
                    try {
                        if (!atomicBoolean.get()) {
                            eVar.p(hVar);
                        } else {
                            atomicBoolean2.set(true);
                        }
                    } finally {
                    }
                }
                return;
            case 22:
                a();
                return;
            case 23:
                p4.c1 c1Var = (p4.c1) this.f47659c;
                p4.v vVar = (p4.v) this.f47658b;
                p4.d0 d0Var = (p4.d0) this.d;
                p4.l lVar = (p4.l) this.f47660e;
                ui.e eVar2 = c1Var.f53196b;
                try {
                    c1Var.f53197c.remove(vVar);
                    if (!d0Var.j()) {
                        p4.x0 x0Var2 = (p4.x0) vVar.d;
                        x0Var2.getClass();
                        IBinder asBinder = x0Var2.f53477a.asBinder();
                        p4.t m11 = d0Var.m(vVar);
                        if (eVar2.D(vVar)) {
                            try {
                                h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z10) {
                                    c8.bb.a(lVar);
                                }
                                throw th;
                            }
                        }
                        eVar2.b(asBinder, vVar, m11.f53458a, m11.f53459b);
                        com.google.android.gms.common.api.internal.s C = eVar2.C(vVar);
                        if (C == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            p4.g1 g1Var = d0Var.f53230t;
                            p4.e1 e1Var = d0Var.f53229s;
                            e2.y0 y0Var = m11.f53459b;
                            p4.e1 A1 = c1Var.A1(e1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f53382n.f53816b).f53800c.f53813b;
                            h9.i0 i0Var = m11.f53460c;
                            if (i0Var == null) {
                                i0Var = d0Var.f53234y;
                            }
                            h9.i0 i0Var2 = m11.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f53235z;
                            }
                            h9.i0 i0Var3 = d0Var.f53228r;
                            p4.j1 j1Var = m11.f53458a;
                            e2.y0 t6 = g1Var.t();
                            p4.o1 o1Var = d0Var.f53220j.f53405a;
                            o1Var.getClass();
                            p4.j jVar = new p4.j(c1Var, i0Var, i0Var2, i0Var3, j1Var, y0Var, t6, new Bundle(o1Var.f53430g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((p4.k) lVar).h1(C.e(), jVar.a(vVar.f53465c));
                                    z9 = true;
                                } catch (RemoteException unused2) {
                                    z9 = false;
                                }
                                if (z9 && (!d0Var.f53233x || !p4.d0.k(vVar))) {
                                    d0Var.f53216e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    c8.bb.a(lVar);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                break;
            case 24:
                m9.e0 e0Var = (m9.e0) this.f47658b;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f47660e;
                if (((p4.d0) this.f47659c).j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th4) {
                    e0Var.n(th4);
                    return;
                }
            case 25:
                p4.d0 d0Var2 = (p4.d0) this.f47659c;
                p4.z0 z0Var = (p4.z0) this.f47658b;
                p4.v vVar2 = (p4.v) this.d;
                List list = (List) this.f47660e;
                if (!d0Var2.j()) {
                    z0Var.a(d0Var2.f53230t, vVar2, list);
                    return;
                }
                return;
            case 26:
                t5.a aVar = (t5.a) this.f47659c;
                o5.i iVar = (o5.i) this.f47658b;
                String str7 = iVar.f20826a;
                l5.g gVar = (l5.g) this.d;
                o5.h hVar2 = (o5.h) this.f47660e;
                aVar.getClass();
                Logger logger = t5.a.f55457f;
                try {
                    p5.e a10 = aVar.f55460c.a(str7);
                    if (a10 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.b(new IllegalArgumentException(str8));
                    } else {
                        ((v5.g) aVar.f55461e).f(new org.telegram.ui.Components.hr(aVar, iVar, ((m5.b) a10).a(hVar2), 11));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar.b(e14);
                    return;
                }
            case 27:
                tg.c2 c2Var = (tg.c2) this.f47659c;
                c2Var.G = true;
                c2Var.H = (tg.z1[]) ((ArrayList) this.f47658b).toArray(new tg.z1[0]);
                ((ln0) this.d).a((tg.z1) this.f47660e);
                return;
            case 28:
                tg.c2 c2Var2 = (tg.c2) this.f47659c;
                TLObject tLObject8 = (TLObject) this.f47658b;
                tg.a2 a2Var = (tg.a2) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f47660e;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    c2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    a2Var.f55573e = org.telegram.messenger.ui.a0(tL_messageMediaDocument.document, a2Var.f55572c);
                    a2Var.f55574f = tL_messageMediaDocument;
                    c2Var2.a();
                    return;
                }
                c2Var2.h();
                c2Var2.n(tL_error7);
                return;
            default:
                ui.e eVar3 = (ui.e) this.f47659c;
                ((ArrayDeque) eVar3.f56943b).addLast(new ui.d((l2.x) this.f47658b, (ui.a) this.d, (RequestTimeDelegate) this.f47660e));
                eVar3.S();
                return;
        }
    }

    public lo0(org.telegram.ui.ActionBar.f2 f2Var, Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f47657a = i7;
        this.f47659c = f2Var;
        this.d = obj;
        this.f47658b = tLObject;
        this.f47660e = obj2;
    }
}
