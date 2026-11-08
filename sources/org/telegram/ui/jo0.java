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
public final class jo0 implements Runnable {
    public final int f47014a;
    public final Object f47015b;
    public final Object f47016c;
    public final Object d;
    public final Object f47017e;

    public jo0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f47014a = i7;
        this.f47016c = obj;
        this.f47015b = obj2;
        this.d = obj3;
        this.f47017e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo0.a():void");
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
        switch (this.f47014a) {
            case 0:
                TLObject tLObject = (TLObject) this.f47015b;
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.f47017e;
                PhotoViewer photoViewer = ((qo0) this.f47016c).f49289b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer.T;
                    ArrayList arrayList = photoViewer.f41391e7;
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
                hs0.Z((hs0) this.f47016c, (TLRPC.TL_error) this.d, (TLObject) this.f47015b, (TL_stars.updatePaidMessagesPrice) this.f47017e);
                return;
            case 2:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.f47016c, (TLRPC.TL_error) this.d, (TLObject) this.f47015b, (boolean[]) this.f47017e);
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f47016c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                TLObject tLObject2 = (TLObject) this.f47015b;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.f47017e;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().H = setaccountttl.ttl.days;
                    privacySettingsActivity.f41677a.f();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f47016c;
                boolean[] zArr = (boolean[]) this.f47015b;
                Activity activity = (Activity) this.d;
                File file = (File) this.f47017e;
                RectF rectF = ProfileActivity.S6;
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
                    Toast.makeText(activity, org.telegram.messenger.id.M0(2131751106, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f47016c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr = (int[]) this.f47017e;
                if (!(((TLObject) this.f47015b) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.S6;
                    profileActivity.getClass();
                    i7 = 0;
                    org.telegram.ui.Components.hc.a0(profileActivity).f0(tL_error, false);
                } else {
                    i7 = 0;
                }
                if (profileActivity.f41787n4 == iArr[i7]) {
                    profileActivity.f41787n4 = i7;
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f47016c;
                String[] strArr = (String[]) this.f47015b;
                String str = (String) this.d;
                String str2 = (String) this.f47017e;
                RectF rectF3 = ProfileActivity.S6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.k21.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str, str2, new j00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f47016c;
                TLObject tLObject3 = (TLObject) this.f47015b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47017e;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f41716d1 != 0) {
                        M0 = profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.f41716d1));
                    } else {
                        M0 = profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f41723e1));
                    }
                    h00.a(profileActivity3.getParentActivity(), 0, tL_username.username, M0, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.f41869z0);
                    return;
                }
                RectF rectF4 = ProfileActivity.S6;
                org.telegram.ui.Components.hc.d0(tL_error2);
                return;
            case 8:
                ProfileActivity.e0((ProfileActivity) this.f47016c, (TLRPC.TL_error) this.d, (TLObject) this.f47015b, (String) this.f47017e);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) this.f47015b;
                org.telegram.messenger.p10 p10Var2 = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.f47017e;
                ProfileActivity profileActivity4 = ((rv0) this.f47016c).f49556b;
                profileActivity4.f41784n0.f38050c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(p10Var2.f24489n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f41784n0.V0;
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
                TLObject tLObject5 = (TLObject) this.f47015b;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f47017e;
                ProfileActivity profileActivity5 = ((cw0) this.f47016c).f44913c.f47047e;
                profileActivity5.e5(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f41716d1 != 0) {
                        M02 = profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.f41716d1));
                    } else {
                        M02 = profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.f41723e1));
                    }
                    TLObject tLObject6 = M02;
                    if (profileActivity5.getParentActivity() != null) {
                        h00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f41869z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.hc.d0(tL_error3);
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f47016c;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.f47015b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.f47017e;
                try {
                    u1Var3.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.f41955a;
                    if (y21Var != null) {
                        y21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f47016c;
                org.telegram.ui.ActionBar.u1 u1Var4 = (org.telegram.ui.ActionBar.u1) this.f47015b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f47017e;
                try {
                    u1Var4.dismiss();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.f41958e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.f41955a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                x21 x21Var = (x21) this.f47016c;
                x21Var.f51726a = (TLObject) this.f47015b;
                x21Var.f51727b = (TLRPC.TL_error) this.d;
                ((j9) this.f47017e).run();
                return;
            case 14:
                m31.d0((m31) this.f47016c, (TLRPC.TL_error) this.d, (TLObject) this.f47015b, (String) this.f47017e);
                return;
            case 15:
                m41 m41Var = (m41) this.f47016c;
                mg.b bVar = (mg.b) this.f47015b;
                String str3 = (String) this.d;
                b51 b51Var = (b51) this.f47017e;
                c51 c51Var = m41Var.f47660x;
                if (bVar != null) {
                    c51Var.U.l(str3, bVar);
                }
                if (bVar != null && !b51Var.f44203b && (i10 = b51Var.f44202a) >= 0) {
                    View m10 = c51Var.T.m(i10);
                    if (m10 instanceof m41) {
                        m41Var.f47419r.f48256e = bVar;
                        m41 m41Var2 = (m41) m10;
                        m41Var2.f47414b.f18322t0.d(false, false);
                        m41Var2.g(false);
                    }
                }
                c51.c0(c51Var);
                return;
            case 16:
                o41 o41Var = (o41) this.f47016c;
                o41Var.f48261k = false;
                o41Var.d = (mg.b) this.f47015b;
                o41Var.f48258g = (String) this.d;
                l41 l41Var = (l41) ((org.telegram.messenger.u10) this.f47017e).run();
                if (l41Var != null) {
                    l41Var.e(o41Var, true);
                    return;
                }
                return;
            case 17:
                TLObject tLObject7 = (TLObject) this.f47015b;
                String str4 = (String) this.d;
                org.telegram.ui.ActionBar.u1 u1Var5 = (org.telegram.ui.ActionBar.u1) this.f47017e;
                v81 v81Var = ((q81) this.f47016c).f49169a;
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
                            tL_messageService.peer_id = v81Var.getMessagesController().z1(v81Var.f50595a);
                            tL_messageService.dialog_id = v81Var.f50595a;
                            tL_messageService.f26977id = tL_updateMessageID.f27214id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new org.telegram.messenger.ij(v81.c0(v81Var), tL_messageService, false, false));
                            TLRPC.Chat M03 = v81Var.getMessagesController().M0(Long.valueOf(-v81Var.f50595a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f27008id = tL_updateMessageID.f27214id;
                            long j3 = v81Var.f50596b;
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
                            tL_forumTopic.from_id = v81Var.getMessagesController().z1(v81Var.getUserConfig().f24489n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = v81Var.E;
                            an anVar = v81Var.D;
                            if (anVar != null) {
                                anVar.kb();
                                anVar.ob();
                                anVar.Rb(arrayList3, M03, tL_messageService.f26977id, 1, 1, tL_forumTopic);
                                anVar.f43750c = true;
                                anVar.J8();
                                anVar.sd(true);
                                anVar.f43903o1.n(true);
                                anVar.yd();
                                anVar.f43794f2.setCurrentTopic(anVar.b());
                                anVar.vd(true);
                                anVar.Lc(true);
                                anVar.B9(true);
                                anVar.M6(true, true);
                                anVar.db();
                                v81Var.getMessagesController().f24877q7.q(v81Var.f50595a, tL_forumTopic, true);
                                v81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -v81Var.f50595a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                an anVar2 = new an(bundle);
                                anVar2.Rb(arrayList3, M03, tL_messageService.f26977id, 1, 1, tL_forumTopic);
                                anVar2.f43750c = true;
                                v81Var.getMessagesController().f24877q7.q(v81Var.f50595a, tL_forumTopic, true);
                                v81Var.presentFragment(anVar2);
                            }
                        }
                        i14++;
                        i11 = 2;
                    }
                }
                u1Var5.dismiss();
                return;
            case 18:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.f47016c, (byte[]) this.d, (TLObject) this.f47015b, (byte[]) this.f47017e);
                return;
            case 19:
                za1 za1Var = (za1) this.f47016c;
                String str5 = (String) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f47017e;
                if (((TLObject) this.f47015b) instanceof TLRPC.TL_boolTrue) {
                    za1Var.z0(new by0(25, za1Var, str5));
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
                        String M04 = org.telegram.messenger.id.M0(2131743934, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        za1Var.L0(M04, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, objArr));
                        return;
                    }
                    za1Var.L0(org.telegram.messenger.id.M0(2131743934, null), tL_error6.text);
                    return;
                } else {
                    za1Var.D0();
                    return;
                }
            case 20:
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.f47016c;
                di.o7 o7Var = (di.o7) this.f47015b;
                String str6 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.f47017e;
                if (u0Var.f51317c && ((x0Var = u0Var.Q) == null || !x0Var.o(o7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                u0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 21:
                ui.e eVar = (ui.e) this.f47016c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f47015b;
                p4.h hVar = (p4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f47017e;
                synchronized (eVar.f56930b) {
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
                p4.c1 c1Var = (p4.c1) this.f47016c;
                p4.v vVar = (p4.v) this.f47015b;
                p4.d0 d0Var = (p4.d0) this.d;
                p4.l lVar = (p4.l) this.f47017e;
                ui.e eVar2 = c1Var.f53183b;
                try {
                    c1Var.f53184c.remove(vVar);
                    if (!d0Var.j()) {
                        p4.x0 x0Var2 = (p4.x0) vVar.d;
                        x0Var2.getClass();
                        IBinder asBinder = x0Var2.f53464a.asBinder();
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
                        eVar2.b(asBinder, vVar, m11.f53445a, m11.f53446b);
                        com.google.android.gms.common.api.internal.s C = eVar2.C(vVar);
                        if (C == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            p4.g1 g1Var = d0Var.f53217t;
                            p4.e1 e1Var = d0Var.f53216s;
                            e2.y0 y0Var = m11.f53446b;
                            p4.e1 A1 = c1Var.A1(e1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f53369n.f53803b).f53787c.f53800b;
                            h9.i0 i0Var = m11.f53447c;
                            if (i0Var == null) {
                                i0Var = d0Var.f53221y;
                            }
                            h9.i0 i0Var2 = m11.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f53222z;
                            }
                            h9.i0 i0Var3 = d0Var.f53215r;
                            p4.j1 j1Var = m11.f53445a;
                            e2.y0 t6 = g1Var.t();
                            p4.o1 o1Var = d0Var.f53207j.f53392a;
                            o1Var.getClass();
                            p4.j jVar = new p4.j(c1Var, i0Var, i0Var2, i0Var3, j1Var, y0Var, t6, new Bundle(o1Var.f53417g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((p4.k) lVar).h1(C.e(), jVar.a(vVar.f53452c));
                                    z9 = true;
                                } catch (RemoteException unused2) {
                                    z9 = false;
                                }
                                if (z9 && (!d0Var.f53220x || !p4.d0.k(vVar))) {
                                    d0Var.f53203e.getClass();
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
                m9.e0 e0Var = (m9.e0) this.f47015b;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f47017e;
                if (((p4.d0) this.f47016c).j()) {
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
                p4.d0 d0Var2 = (p4.d0) this.f47016c;
                p4.z0 z0Var = (p4.z0) this.f47015b;
                p4.v vVar2 = (p4.v) this.d;
                List list = (List) this.f47017e;
                if (!d0Var2.j()) {
                    z0Var.a(d0Var2.f53217t, vVar2, list);
                    return;
                }
                return;
            case 26:
                t5.a aVar = (t5.a) this.f47016c;
                o5.i iVar = (o5.i) this.f47015b;
                String str7 = iVar.f20826a;
                l5.g gVar = (l5.g) this.d;
                o5.h hVar2 = (o5.h) this.f47017e;
                aVar.getClass();
                Logger logger = t5.a.f55444f;
                try {
                    p5.e a10 = aVar.f55447c.a(str7);
                    if (a10 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.b(new IllegalArgumentException(str8));
                    } else {
                        ((v5.g) aVar.f55448e).f(new org.telegram.ui.Components.hr(aVar, iVar, ((m5.b) a10).a(hVar2), 11));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar.b(e14);
                    return;
                }
            case 27:
                tg.c2 c2Var = (tg.c2) this.f47016c;
                c2Var.G = true;
                c2Var.H = (tg.z1[]) ((ArrayList) this.f47015b).toArray(new tg.z1[0]);
                ((jn0) this.d).a((tg.z1) this.f47017e);
                return;
            case 28:
                tg.c2 c2Var2 = (tg.c2) this.f47016c;
                TLObject tLObject8 = (TLObject) this.f47015b;
                tg.a2 a2Var = (tg.a2) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f47017e;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    c2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    a2Var.f55560e = org.telegram.messenger.ui.a0(tL_messageMediaDocument.document, a2Var.f55559c);
                    a2Var.f55561f = tL_messageMediaDocument;
                    c2Var2.a();
                    return;
                }
                c2Var2.h();
                c2Var2.n(tL_error7);
                return;
            default:
                ui.e eVar3 = (ui.e) this.f47016c;
                ((ArrayDeque) eVar3.f56930b).addLast(new ui.d((l2.y) this.f47015b, (ui.a) this.d, (RequestTimeDelegate) this.f47017e));
                eVar3.S();
                return;
        }
    }

    public jo0(org.telegram.ui.ActionBar.f2 f2Var, Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f47014a = i7;
        this.f47016c = f2Var;
        this.d = obj;
        this.f47015b = tLObject;
        this.f47017e = obj2;
    }
}
