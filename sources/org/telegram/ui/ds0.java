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
import java.util.ArrayDeque;
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
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ad;
public final class ds0 implements Runnable {
    public final int f37087a;
    public final Object f37088b;
    public final Object f37089c;
    public final Object d;
    public final Object f37090e;

    public ds0(Dialog dialog, boolean[] zArr, Object obj, Serializable serializable, int i10) {
        this.f37087a = i10;
        this.f37088b = dialog;
        this.d = zArr;
        this.f37089c = obj;
        this.f37090e = serializable;
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
        int i11 = this.f37087a;
        Object obj = this.f37090e;
        Object obj2 = this.f37089c;
        Object obj3 = this.d;
        Object obj4 = this.f37088b;
        switch (i11) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                boolean[] zArr = (boolean[]) obj3;
                cs0 cs0Var = (cs0) obj;
                ImageView imageView = photoViewer.f34104x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.f34104x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        cs0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer2 = ((rs0) obj4).f41508b;
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
                            user.photo.photo_id = tL_photos_photo.photo.f20056id;
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
                sw0.U((sw0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 3:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (boolean[]) obj3);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TLObject tLObject2 = (TLObject) obj3;
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
                    privacySettingsActivity.f34225a.l();
                    return;
                }
                return;
            case 5:
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
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.ad.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.f34342o4 == iArr[0]) {
                    profileActivity.f34342o4 = 0;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f34271e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f34271e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f34279f1));
                    }
                    f20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f34414z0);
                    return;
                }
                org.telegram.ui.Components.ad.d0(tL_error2);
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj2;
                String str = (String) obj3;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.d51.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new j20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 9:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) obj2;
                UserConfig userConfig2 = (UserConfig) obj3;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((f01) obj4).f37499b;
                profileActivity4.f34331n0.f31805c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f34331n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f20056id;
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
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((q01) obj4).f41014c.f43916e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f34271e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f34271e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f34279f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        f20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f34414z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.ad.d0(tL_error3);
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    a2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error4 == null) {
                    sessionsActivity.f34504e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    t81 t81Var = sessionsActivity.f34501a;
                    if (t81Var != null) {
                        t81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.f34504e.remove(tL_authorization);
                    sessionsActivity2.f34505f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    t81 t81Var2 = sessionsActivity2.f34501a;
                    if (t81Var2 != null) {
                        t81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                s81 s81Var = (s81) obj4;
                s81Var.f41641a = (TLObject) obj2;
                s81Var.f41642b = (TLRPC.TL_error) obj3;
                ((j9) obj).run();
                return;
            case 15:
                h91.c0((h91) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 16:
                la1 la1Var = (la1) obj4;
                jg.b bVar = (jg.b) obj2;
                String str3 = (String) obj3;
                za1 za1Var = (za1) obj;
                ab1 ab1Var = la1Var.f39575w;
                if (bVar != null) {
                    ab1Var.V.put(str3, bVar);
                }
                if (bVar != null && !za1Var.f44628b && (i10 = za1Var.f44627a) >= 0) {
                    View m10 = ab1Var.U.m(i10);
                    if (m10 instanceof la1) {
                        la1Var.f39254r.f39884e = bVar;
                        la1 la1Var2 = (la1) m10;
                        la1Var2.f39249b.f12191t0.d(false, false);
                        la1Var2.g(false);
                    }
                }
                ab1.Z(ab1Var);
                return;
            case 17:
                ma1 ma1Var = (ma1) obj4;
                ma1Var.f39889k = false;
                ma1Var.d = (jg.b) obj2;
                ma1Var.f39886g = (String) obj3;
                ka1 ka1Var = (ka1) ((Utilities.Callback0Return) obj).run();
                if (ka1Var != null) {
                    ka1Var.e(ma1Var, true);
                    return;
                }
                return;
            case 18:
                TLObject tLObject7 = (TLObject) obj2;
                String str4 = (String) obj3;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) obj;
                af1 af1Var = ((we1) obj4).f43402a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = af1Var.getMessagesController().getPeer(af1Var.f36054a);
                            tL_messageService.dialog_id = af1Var.f36054a;
                            tL_messageService.f20053id = tL_updateMessageID.f20288id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(af1.X(af1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = af1Var.getMessagesController().getChat(Long.valueOf(-af1Var.f36054a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f20084id = tL_updateMessageID.f20288id;
                            long j3 = af1Var.f36055b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f20053id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = af1Var.getMessagesController().getPeer(af1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = af1Var.E;
                            zn znVar = af1Var.f36064y;
                            if (znVar != null) {
                                znVar.Pa();
                                znVar.Ta();
                                znVar.tb(arrayList3, chat3, tL_messageService.f20053id, 1, 1, tL_forumTopic);
                                znVar.f44726c = true;
                                znVar.v8();
                                znVar.Rc(true);
                                znVar.f44701a1.o(true);
                                znVar.Xc();
                                znVar.R1.setCurrentTopic(znVar.d());
                                znVar.Uc(true);
                                znVar.lc(true);
                                znVar.j9(true);
                                znVar.D6(true, true);
                                znVar.Ia();
                                af1Var.getMessagesController().getTopicsController().onTopicCreated(af1Var.f36054a, tL_forumTopic, true);
                                af1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -af1Var.f36054a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                zn znVar2 = new zn(bundle);
                                znVar2.tb(arrayList3, chat3, tL_messageService.f20053id, 1, 1, tL_forumTopic);
                                znVar2.f44726c = true;
                                af1Var.getMessagesController().getTopicsController().onTopicCreated(af1Var.f36054a, tL_forumTopic, true);
                                af1Var.presentFragment(znVar2);
                            }
                        }
                    }
                }
                a2Var4.dismiss();
                return;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj2, (TLObject) obj3, (byte[]) obj);
                return;
            case 20:
                hh1 hh1Var = (hh1) obj4;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    hh1Var.u0(new m31(25, hh1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        hh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    hh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    hh1Var.y0();
                    return;
                }
            case 21:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                ai.ea eaVar = (ai.ea) obj2;
                String str6 = (String) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                if (y0Var.f43731c && ((b1Var = y0Var.Q) == null || !b1Var.o(eaVar))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 22:
                pi.f fVar = (pi.f) obj4;
                ((ArrayDeque) fVar.f45938a).addLast(new pi.e((m4.w) obj2, (pi.b) obj3, (RequestTimeDelegate) obj));
                fVar.K();
                return;
            case 23:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj2;
                String str7 = iVar.f15414a;
                i5.g gVar = (i5.g) obj3;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f46070f;
                try {
                    m5.e a2 = aVar.f46073c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.a(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.f46074e).f(new org.telegram.ui.Components.sz(aVar, iVar, ((j5.b) a2).a(hVar), 6));
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
                n2Var.H = (qg.k2[]) ((ArrayList) obj2).toArray(new qg.k2[0]);
                ((nr0) obj3).run((qg.k2) obj);
                return;
            case 25:
                qg.n2 n2Var2 = (qg.n2) obj4;
                TLObject tLObject8 = (TLObject) obj2;
                qg.l2 l2Var = (qg.l2) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    l2Var.f46437e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f46436c);
                    l2Var.f46438f = tL_messageMediaDocument;
                    n2Var2.a();
                    return;
                }
                n2Var2.h();
                n2Var2.n(tL_error7);
                return;
            case 26:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                TLObject tLObject9 = (TLObject) obj3;
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
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                xh.j1 j1Var = (xh.j1) obj3;
                final View view = (View) obj;
                org.telegram.ui.Components.ts0 ts0Var = o2Var.f51522a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    j1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o2Var.f51525e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o2Var.f51523b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (o2Var.f51525e.m(savedStarGift, z11, false)) {
                    new xh.r2(o2Var.getContext(), ts0Var.f51600c, savedStarGift, o2Var.f51524c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((j1) view).c(z11, true);
                            o2 o2Var2 = o2.this;
                            o2Var2.f51526f.u0(0);
                            return ad.a0(o2Var2.f51522a.f51598a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.ad.a0(ts0Var.f51598a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.q.q(R.string.Gift2Unpinned, org.telegram.ui.Components.ad.a0(ts0Var.f51598a), R.raw.ic_unpin, 36);
                }
                ((xh.j1) view).c(z11, true);
                o2Var.f51526f.u0(0);
                return;
            case 28:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                of.e eVar = (of.e) obj3;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) obj;
                if (m2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.ad.a0(m2Var).f0(tL_error9, false);
                }
                if ((m2Var instanceof zn) && tL_error9 == null) {
                    ((zn) m2Var).cc();
                }
                eVar.b();
                a2Var5.dismiss();
                return;
            default:
                yh.s3.a0((yh.s3) obj4, (boolean[]) obj3, (TL_stars.StarGiftAttribute) obj2, (org.telegram.ui.Components.cd[]) obj);
                return;
        }
    }

    public ds0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37087a = i10;
        this.f37088b = obj;
        this.f37089c = obj2;
        this.d = obj3;
        this.f37090e = obj4;
    }

    public ds0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.f37087a = 3;
        this.f37088b = privacyControlActivity;
        this.f37089c = tL_error;
        this.f37090e = tLObject;
        this.d = zArr;
    }
}
