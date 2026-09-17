package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.vc;
public final class hs0 implements Runnable {
    public final int f34333a;
    public final Object f34334b;
    public final Object f34335c;
    public final Object d;
    public final Object e;

    public hs0(Dialog dialog, boolean[] zArr, Object obj, Serializable serializable, int i10) {
        this.f34333a = i10;
        this.f34334b = dialog;
        this.d = zArr;
        this.f34335c = obj;
        this.e = serializable;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        String formatPluralString;
        org.telegram.ui.web.d1 d1Var;
        int i11 = this.f34333a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f34335c;
        Object obj4 = this.f34334b;
        switch (i11) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                gs0 gs0Var = (gs0) obj;
                ImageView imageView = photoViewer.f31122x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.f31122x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        gs0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer2 = ((us0) obj4).f38192b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer2.T;
                    ArrayList arrayList = photoViewer2.f7;
                    MessagesController.getInstance(i12).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer2.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f18145id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vw0.U((vw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 3:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (boolean[]) obj2);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f31238a.l();
                    return;
                }
                return;
            case 5:
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj3;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i13 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    return;
                } else {
                    return;
                }
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.vc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f31353o4 == iArr[0]) {
                    profileActivity.f31353o4 = 0;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f31282e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f31282e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f31290f1));
                    }
                    k20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f31425z0);
                    return;
                }
                org.telegram.ui.Components.vc.b0(tL_error2);
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.w31.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new o20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 9:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((j01) obj4).f34743b;
                profileActivity4.f31342n0.f27031c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f31342n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f18145id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((u01) obj4).f37902c.e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f31282e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f31282e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f31290f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        k20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f31425z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.vc.b0(tL_error3);
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    c2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    r81 r81Var = sessionsActivity.f31509a;
                    if (r81Var != null) {
                        r81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    c2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f31512f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    r81 r81Var2 = sessionsActivity2.f31509a;
                    if (r81Var2 != null) {
                        r81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                q81 q81Var = (q81) obj4;
                q81Var.f36830a = (TLObject) obj3;
                q81Var.f36831b = (TLRPC.TL_error) obj2;
                ((n9) obj).run();
                return;
            case 15:
                g91.c0((g91) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 16:
                la1 la1Var = (la1) obj4;
                jg.b bVar = (jg.b) obj3;
                String str3 = (String) obj2;
                za1 za1Var = (za1) obj;
                ab1 ab1Var = la1Var.f35491w;
                if (bVar != null) {
                    ab1Var.V.put(str3, bVar);
                }
                if (bVar != null && !za1Var.f40196b && (i10 = za1Var.f40195a) >= 0) {
                    View m10 = ab1Var.U.m(i10);
                    if (m10 instanceof la1) {
                        la1Var.f35178r.e = bVar;
                        la1 la1Var2 = (la1) m10;
                        la1Var2.f35174b.f11165t0.d(false, false);
                        la1Var2.g(false);
                    }
                }
                ab1.Z(ab1Var);
                return;
            case 17:
                ma1 ma1Var = (ma1) obj4;
                ma1Var.f35748k = false;
                ma1Var.d = (jg.b) obj3;
                ma1Var.f35745g = (String) obj2;
                ka1 ka1Var = (ka1) ((Utilities.Callback0Return) obj).run();
                if (ka1Var != null) {
                    ka1Var.e(ma1Var, true);
                    return;
                }
                return;
            case 18:
                TLObject tLObject7 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj;
                bf1 bf1Var = ((xe1) obj4).f39604a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = bf1Var.getMessagesController().getPeer(bf1Var.f32115a);
                            tL_messageService.dialog_id = bf1Var.f32115a;
                            tL_messageService.f18142id = tL_updateMessageID.f18375id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(bf1.X(bf1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = bf1Var.getMessagesController().getChat(Long.valueOf(-bf1Var.f32115a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f18173id = tL_updateMessageID.f18375id;
                            long j3 = bf1Var.f32116b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f18142id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = bf1Var.getMessagesController().getPeer(bf1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = bf1Var.E;
                            bo boVar = bf1Var.f32124y;
                            if (boVar != null) {
                                boVar.La();
                                boVar.Pa();
                                boVar.pb(arrayList3, chat3, tL_messageService.f18142id, 1, 1, tL_forumTopic);
                                boVar.f32240c = true;
                                boVar.r8();
                                boVar.Nc(true);
                                boVar.f32215a1.n(true);
                                boVar.Tc();
                                boVar.R1.setCurrentTopic(boVar.d());
                                boVar.Qc(true);
                                boVar.hc(true);
                                boVar.e9(true);
                                boVar.A6(true, true);
                                boVar.Ea();
                                bf1Var.getMessagesController().getTopicsController().onTopicCreated(bf1Var.f32115a, tL_forumTopic, true);
                                bf1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -bf1Var.f32115a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                bo boVar2 = new bo(bundle);
                                boVar2.pb(arrayList3, chat3, tL_messageService.f18142id, 1, 1, tL_forumTopic);
                                boVar2.f32240c = true;
                                bf1Var.getMessagesController().getTopicsController().onTopicCreated(bf1Var.f32115a, tL_forumTopic, true);
                                bf1Var.presentFragment(boVar2);
                            }
                        }
                    }
                }
                c2Var4.dismiss();
                return;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 20:
                ih1 ih1Var = (ih1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    ih1Var.u0(new qb1(12, ih1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    ih1Var.y0();
                    return;
                }
            case 21:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                ai.da daVar = (ai.da) obj3;
                String str6 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (z0Var.f39011c && ((d1Var = z0Var.Q) == null || !d1Var.p(daVar))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                z0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 22:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str7 = iVar.f13907a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f41185f;
                try {
                    m5.e a2 = aVar.f41188c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.c(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.s50(aVar, iVar, ((j5.b) a2).a(hVar), 5));
                        gVar.c(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.c(e12);
                    return;
                }
            case 23:
                qg.p2 p2Var = (qg.p2) obj4;
                p2Var.G = true;
                p2Var.H = (qg.m2[]) ((ArrayList) obj3).toArray(new qg.m2[0]);
                ((qr0) obj2).run((qg.m2) obj);
                return;
            case 24:
                qg.p2 p2Var2 = (qg.p2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                qg.n2 n2Var = (qg.n2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    p2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    n2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, n2Var.f41504c);
                    n2Var.f41505f = tL_messageMediaDocument;
                    p2Var2.a();
                    return;
                }
                p2Var2.h();
                p2Var2.n(tL_error7);
                return;
            case 25:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    return;
                } else if (tLObject9 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject9);
                    return;
                } else {
                    return;
                }
            case 26:
                final xh.n2 n2Var2 = (xh.n2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                xh.i1 i1Var = (xh.i1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.or0 or0Var = n2Var2.f46057a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    i1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n2Var2.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n2Var2.f46058b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (n2Var2.e.m(savedStarGift, z11, false)) {
                    new xh.q2(n2Var2.getContext(), or0Var.f46130c, savedStarGift, n2Var2.f46059c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((i1) view).c(z11, true);
                            n2 n2Var3 = n2.this;
                            n2Var3.f46060f.v0(0);
                            return vc.a0(n2Var3.f46057a.f46128a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.vc.a0(or0Var.f46128a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.w1.o(R.string.Gift2Unpinned, org.telegram.ui.Components.vc.a0(or0Var.f46128a), R.raw.ic_unpin, 36);
                }
                ((xh.i1) view).c(z11, true);
                n2Var2.f46060f.v0(0);
                return;
            case 27:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                nf.e eVar = (nf.e) obj2;
                org.telegram.ui.ActionBar.c2 c2Var5 = (org.telegram.ui.ActionBar.c2) obj;
                if (o2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.vc.a0(o2Var).d0(tL_error9, false);
                }
                if ((o2Var instanceof bo) && tL_error9 == null) {
                    ((bo) o2Var).Yb();
                }
                eVar.b();
                c2Var5.dismiss();
                return;
            case 28:
                yh.a4.Z((yh.a4) obj4, (boolean[]) obj2, (TL_stars.StarGiftAttribute) obj3, (org.telegram.ui.Components.xc[]) obj);
                return;
            default:
                yh.a4.R0((yh.a4) obj4, (TLObject) obj3, (w9.v) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public hs0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34333a = i10;
        this.f34334b = obj;
        this.f34335c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public hs0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.f34333a = 3;
        this.f34334b = privacyControlActivity;
        this.f34335c = tL_error;
        this.e = tLObject;
        this.d = zArr;
    }
}
