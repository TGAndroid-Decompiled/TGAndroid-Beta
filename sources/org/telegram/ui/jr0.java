package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.xc;
public final class jr0 implements Runnable {
    public final int f34864a;
    public final Object f34865b;
    public final Object f34866c;
    public final Object d;
    public final Object e;

    public jr0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34864a = i10;
        this.f34865b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f34866c = obj4;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        String formatPluralString;
        org.telegram.ui.web.b1 b1Var;
        int i11 = this.f34864a;
        Object obj = this.f34866c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f34865b;
        switch (i11) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                String str = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                photoEntry.coverSavedPosition = -1L;
                photoEntry.coverPath = str;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.f31332q5.f28779b.setLoading(false);
                tu0 tu0Var = photoViewer.d;
                if (tu0Var != null) {
                    tu0Var.W(photoViewer.P4);
                }
                rs0 rs0Var = photoViewer.f31242g1;
                if (rs0Var != null) {
                    rs0Var.setImage(bitmap);
                }
                photoViewer.d3(0);
                CheckBox checkBox = photoViewer.N0;
                if (!checkBox.f22180x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj;
                boolean[] zArr = (boolean[]) obj3;
                wr0 wr0Var = (wr0) obj2;
                ImageView imageView = photoViewer2.f31396x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer2.f31396x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        wr0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer3 = ((ks0) obj4).f35168b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer3.T;
                    ArrayList arrayList = photoViewer3.f7;
                    MessagesController.getInstance(i12).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer3.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f18360id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kw0.U((kw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 4:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f31512a.l();
                    return;
                }
                return;
            case 6:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.xc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f31627o4 == iArr[0]) {
                    profileActivity.f31627o4 = 0;
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f31556e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f31556e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f31564f1));
                    }
                    d20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f31699z0);
                    return;
                }
                org.telegram.ui.Components.xc.b0(tL_error2);
                return;
            case 9:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.i41.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str2, str3, new h20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 10:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (String) obj2);
                return;
            case 11:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((yz0) obj4).f40296b;
                profileActivity4.f31616n0.f30881c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f31616n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f18360id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((j01) obj4).f34616c.e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f31556e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f31556e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f31564f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        d20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f31699z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.xc.b0(tL_error3);
                return;
            case 13:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    a2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    k81 k81Var = sessionsActivity.f31783a;
                    if (k81Var != null) {
                        k81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f31786f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    k81 k81Var2 = sessionsActivity2.f31783a;
                    if (k81Var2 != null) {
                        k81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                j81 j81Var = (j81) obj4;
                j81Var.f34688a = (TLObject) obj3;
                j81Var.f34689b = (TLRPC.TL_error) obj2;
                ((l9) obj).run();
                return;
            case 16:
                z81.c0((z81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (String) obj2);
                return;
            case 17:
                da1 da1Var = (da1) obj4;
                jg.b bVar = (jg.b) obj3;
                String str4 = (String) obj2;
                ra1 ra1Var = (ra1) obj;
                sa1 sa1Var = da1Var.f33071w;
                if (bVar != null) {
                    sa1Var.V.put(str4, bVar);
                }
                if (bVar != null && !ra1Var.f37280b && (i10 = ra1Var.f37279a) >= 0) {
                    View m10 = sa1Var.U.m(i10);
                    if (m10 instanceof da1) {
                        da1Var.f32618r.e = bVar;
                        da1 da1Var2 = (da1) m10;
                        da1Var2.f32614b.f11152t0.d(false, false);
                        da1Var2.g(false);
                    }
                }
                sa1.Z(sa1Var);
                return;
            case 18:
                ea1 ea1Var = (ea1) obj4;
                ea1Var.f33352k = false;
                ea1Var.d = (jg.b) obj3;
                ea1Var.f33349g = (String) obj2;
                ca1 ca1Var = (ca1) ((Utilities.Callback0Return) obj).run();
                if (ca1Var != null) {
                    ca1Var.e(ea1Var, true);
                    return;
                }
                return;
            case 19:
                TLObject tLObject7 = (TLObject) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) obj;
                se1 se1Var = ((oe1) obj4).f36226a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = se1Var.getMessagesController().getPeer(se1Var.f37723a);
                            tL_messageService.dialog_id = se1Var.f37723a;
                            tL_messageService.f18357id = tL_updateMessageID.f18589id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(se1.X(se1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = se1Var.getMessagesController().getChat(Long.valueOf(-se1Var.f37723a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f18388id = tL_updateMessageID.f18589id;
                            long j3 = se1Var.f37724b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.f18357id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = se1Var.getMessagesController().getPeer(se1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = se1Var.E;
                            wn wnVar = se1Var.f37732y;
                            if (wnVar != null) {
                                wnVar.La();
                                wnVar.Pa();
                                wnVar.pb(arrayList3, chat3, tL_messageService.f18357id, 1, 1, tL_forumTopic);
                                wnVar.f39435c = true;
                                wnVar.r8();
                                wnVar.Nc(true);
                                wnVar.f39410a1.n(true);
                                wnVar.Tc();
                                wnVar.R1.setCurrentTopic(wnVar.d());
                                wnVar.Qc(true);
                                wnVar.hc(true);
                                wnVar.e9(true);
                                wnVar.A6(true, true);
                                wnVar.Ea();
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f37723a, tL_forumTopic, true);
                                se1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -se1Var.f37723a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                wn wnVar2 = new wn(bundle);
                                wnVar2.pb(arrayList3, chat3, tL_messageService.f18357id, 1, 1, tL_forumTopic);
                                wnVar2.f39435c = true;
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f37723a, tL_forumTopic, true);
                                se1Var.presentFragment(wnVar2);
                            }
                        }
                    }
                }
                a2Var4.dismiss();
                return;
            case 20:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 21:
                zg1 zg1Var = (zg1) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    zg1Var.u0(new p81(17, zg1Var, str6));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    zg1Var.y0();
                    return;
                }
            case 22:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                ai.da daVar = (ai.da) obj3;
                String str7 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (y0Var.f39278c && ((b1Var = y0Var.Q) == null || !b1Var.p(daVar))) {
                    FileLog.d("notifyEvent " + str7 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str7 + "', " + jSONObject + ");");
                return;
            case 23:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str8 = iVar.f14119a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f41453f;
                try {
                    m5.e a2 = aVar.f41456c.a(str8);
                    if (a2 == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        gVar.a(new IllegalArgumentException(str9));
                    } else {
                        ((s5.h) aVar.e).f(new org.telegram.ui.Components.s50(aVar, iVar, ((j5.b) a2).a(hVar), 5));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e13) {
                    logger.warning("Error scheduling event " + e13.getMessage());
                    gVar.a(e13);
                    return;
                }
            case 24:
                qg.n2 n2Var = (qg.n2) obj4;
                n2Var.G = true;
                n2Var.H = (qg.k2[]) ((ArrayList) obj3).toArray(new qg.k2[0]);
                ((gr0) obj2).run((qg.k2) obj);
                return;
            case 25:
                qg.n2 n2Var2 = (qg.n2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                qg.l2 l2Var = (qg.l2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    l2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f41739c);
                    l2Var.f41740f = tL_messageMediaDocument;
                    n2Var2.a();
                    return;
                }
                n2Var2.h();
                n2Var2.n(tL_error7);
                return;
            case 26:
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
            case 27:
                final xh.o2 o2Var = (xh.o2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                xh.j1 j1Var = (xh.j1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.zr0 zr0Var = o2Var.f46328a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    j1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o2Var.f46329b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (o2Var.e.m(savedStarGift, z11, false)) {
                    new xh.r2(o2Var.getContext(), zr0Var.f46399c, savedStarGift, o2Var.f46330c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((j1) view).c(z11, true);
                            o2 o2Var2 = o2.this;
                            o2Var2.f46331f.u0(0);
                            return xc.a0(o2Var2.f46328a.f46397a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.xc.a0(zr0Var.f46397a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.f0.p(R.string.Gift2Unpinned, org.telegram.ui.Components.xc.a0(zr0Var.f46397a), R.raw.ic_unpin, 36);
                }
                ((xh.j1) view).c(z11, true);
                o2Var.f46331f.u0(0);
                return;
            case 28:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                nf.e eVar = (nf.e) obj2;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) obj;
                if (m2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.xc.a0(m2Var).d0(tL_error9, false);
                }
                if ((m2Var instanceof wn) && tL_error9 == null) {
                    ((wn) m2Var).Yb();
                }
                eVar.b();
                a2Var5.dismiss();
                return;
            default:
                yh.x3.Z((yh.x3) obj4, (boolean[]) obj3, (TL_stars.StarGiftAttribute) obj2, (org.telegram.ui.Components.zc[]) obj);
                return;
        }
    }

    public jr0(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, int i10) {
        this.f34864a = i10;
        this.f34865b = m2Var;
        this.d = tL_error;
        this.f34866c = tLObject;
        this.e = str;
    }

    public jr0(PhotoViewer photoViewer, Bitmap bitmap, boolean[] zArr, wr0 wr0Var) {
        this.f34864a = 1;
        this.f34865b = photoViewer;
        this.f34866c = bitmap;
        this.d = zArr;
        this.e = wr0Var;
    }
}
