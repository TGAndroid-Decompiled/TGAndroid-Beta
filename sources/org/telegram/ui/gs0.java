package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
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
import org.telegram.ui.Components.zc;
public final class gs0 implements Runnable {
    public final int f38132a;
    public final Object f38133b;
    public final Object f38134c;
    public final Object d;
    public final Object f38135e;

    public gs0(Dialog dialog, boolean[] zArr, Object obj, Serializable serializable, int i10) {
        this.f38132a = i10;
        this.f38133b = dialog;
        this.d = zArr;
        this.f38134c = obj;
        this.f38135e = serializable;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        TLRPC.Updates updates;
        String formatPluralString;
        org.telegram.ui.web.b1 b1Var;
        int a2;
        int max;
        int max2;
        int i11 = 2;
        int i12 = 1;
        switch (this.f38132a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38133b;
                Bitmap bitmap = (Bitmap) this.f38134c;
                boolean[] zArr = (boolean[]) this.d;
                fs0 fs0Var = (fs0) this.f38135e;
                ImageView imageView = photoViewer.f33915x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.f33915x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        fs0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f38134c;
                UserConfig userConfig = (UserConfig) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.f38135e;
                PhotoViewer photoViewer2 = ((us0) this.f38133b).f42563b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i13 = photoViewer2.T;
                    ArrayList arrayList = photoViewer2.f7;
                    MessagesController.getInstance(i13).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer2.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f19827id;
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
                vw0.U((vw0) this.f38133b, (TLRPC.TL_error) this.f38134c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.f38135e);
                return;
            case 3:
                PrivacyControlActivity.V((PrivacyControlActivity) this.f38133b, (TLRPC.TL_error) this.f38134c, (TLObject) this.f38135e, (boolean[]) this.d);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f38133b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f38134c;
                TLObject tLObject2 = (TLObject) this.d;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.f38135e;
                privacySettingsActivity.getClass();
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f34036a.l();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f38133b;
                boolean[] zArr2 = (boolean[]) this.d;
                Activity activity = (Activity) this.f38134c;
                File file = (File) this.f38135e;
                try {
                    a2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i14 >= 24) {
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
                ProfileActivity profileActivity = (ProfileActivity) this.f38133b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr = (int[]) this.f38135e;
                if (!(((TLObject) this.f38134c) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.zc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.f34153o4 == iArr[0]) {
                    profileActivity.f34153o4 = 0;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f38133b;
                TLObject tLObject3 = (TLObject) this.f38134c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f38135e;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f34082e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f34082e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f34090f1));
                    }
                    i20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f34225z0);
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error2);
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f38133b;
                String[] strArr = (String[]) this.f38134c;
                String str = (String) this.d;
                String str2 = (String) this.f38135e;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.g51.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new m20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 9:
                ProfileActivity.n0((ProfileActivity) this.f38133b, (TLRPC.TL_error) this.f38134c, (TLObject) this.d, (String) this.f38135e);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) this.f38134c;
                UserConfig userConfig2 = (UserConfig) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.f38135e;
                ProfileActivity profileActivity4 = ((i01) this.f38133b).f38580b;
                profileActivity4.f34142n0.f32405c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f34142n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f19827id;
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
                TLObject tLObject5 = (TLObject) this.f38134c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f38135e;
                ProfileActivity profileActivity5 = ((t01) this.f38133b).f42041c.f35666e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f34082e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f34082e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f34090f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        i20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f34225z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error3);
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f38133b;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f38134c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.f38135e;
                sessionsActivity.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error4 == null) {
                    sessionsActivity.f34315e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    w81 w81Var = sessionsActivity.f34312a;
                    if (w81Var != null) {
                        w81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f38133b;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f38134c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f38135e;
                sessionsActivity2.getClass();
                try {
                    a2Var4.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.f34315e.remove(tL_authorization);
                    sessionsActivity2.f34316f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    w81 w81Var2 = sessionsActivity2.f34312a;
                    if (w81Var2 != null) {
                        w81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                v81 v81Var = (v81) this.f38133b;
                v81Var.f42716a = (TLObject) this.f38134c;
                v81Var.f42717b = (TLRPC.TL_error) this.d;
                ((n9) this.f38135e).run();
                return;
            case 15:
                k91.c0((k91) this.f38133b, (TLRPC.TL_error) this.f38134c, (TLObject) this.d, (String) this.f38135e);
                return;
            case 16:
                oa1 oa1Var = (oa1) this.f38133b;
                jg.b bVar = (jg.b) this.f38134c;
                String str3 = (String) this.d;
                cb1 cb1Var = (cb1) this.f38135e;
                db1 db1Var = oa1Var.f40641w;
                if (bVar != null) {
                    db1Var.V.put(str3, bVar);
                }
                if (bVar != null && !cb1Var.f36391b && (i10 = cb1Var.f36390a) >= 0) {
                    View m10 = db1Var.U.m(i10);
                    if (m10 instanceof oa1) {
                        oa1Var.f40345r.f40895e = bVar;
                        oa1 oa1Var2 = (oa1) m10;
                        oa1Var2.f40340b.f12190t0.d(false, false);
                        oa1Var2.g(false);
                    }
                }
                db1.Z(db1Var);
                return;
            case 17:
                pa1 pa1Var = (pa1) this.f38133b;
                pa1Var.f40900k = false;
                pa1Var.d = (jg.b) this.f38134c;
                pa1Var.f40897g = (String) this.d;
                na1 na1Var = (na1) ((Utilities.Callback0Return) this.f38135e).run();
                if (na1Var != null) {
                    na1Var.e(pa1Var, true);
                    return;
                }
                return;
            case 18:
                TLObject tLObject7 = (TLObject) this.f38134c;
                String str4 = (String) this.d;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) this.f38135e;
                df1 df1Var = ((ze1) this.f38133b).f44809a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject7;
                    int i15 = 0;
                    while (i15 < updates2.updates.size()) {
                        if (updates2.updates.get(i15) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates2.updates.get(i15);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = df1Var.getMessagesController().getPeer(df1Var.f36787a);
                            tL_messageService.dialog_id = df1Var.f36787a;
                            tL_messageService.f19824id = tL_updateMessageID.f20061id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(df1.X(df1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = df1Var.getMessagesController().getChat(Long.valueOf(-df1Var.f36787a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f19855id = tL_updateMessageID.f20061id;
                            long j3 = df1Var.f36788b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i11;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f19824id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = df1Var.getMessagesController().getPeer(df1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = df1Var.E;
                            eo eoVar = df1Var.f36797y;
                            if (eoVar != null) {
                                eoVar.Pa();
                                eoVar.Ta();
                                eoVar.tb(arrayList3, chat3, tL_messageService.f19824id, 1, 1, tL_forumTopic);
                                eoVar.f37220c = true;
                                eoVar.v8();
                                eoVar.Rc(true);
                                eoVar.f37195a1.o(true);
                                eoVar.Xc();
                                eoVar.R1.setCurrentTopic(eoVar.d());
                                eoVar.Uc(true);
                                eoVar.lc(true);
                                eoVar.j9(true);
                                eoVar.D6(true, true);
                                eoVar.Ia();
                                df1Var.getMessagesController().getTopicsController().onTopicCreated(df1Var.f36787a, tL_forumTopic, true);
                                df1Var.finishFragment();
                                updates = updates2;
                            } else {
                                Bundle bundle = new Bundle();
                                updates = updates2;
                                bundle.putLong("chat_id", -df1Var.f36787a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                eo eoVar2 = new eo(bundle);
                                eoVar2.tb(arrayList3, chat3, tL_messageService.f19824id, 1, 1, tL_forumTopic);
                                eoVar2.f37220c = true;
                                df1Var.getMessagesController().getTopicsController().onTopicCreated(df1Var.f36787a, tL_forumTopic, true);
                                df1Var.presentFragment(eoVar2);
                            }
                        } else {
                            updates = updates2;
                        }
                        i15++;
                        updates2 = updates;
                        i11 = 2;
                    }
                }
                a2Var5.dismiss();
                return;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.f38133b, (byte[]) this.f38134c, (TLObject) this.d, (byte[]) this.f38135e);
                return;
            case 20:
                kh1 kh1Var = (kh1) this.f38133b;
                String str5 = (String) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f38135e;
                if (((TLObject) this.f38134c) instanceof TLRPC.TL_boolTrue) {
                    kh1Var.u0(new u31(24, kh1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        kh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    kh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    kh1Var.y0();
                    return;
                }
            case 21:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f38133b;
                ai.ea eaVar = (ai.ea) this.f38134c;
                String str6 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.f38135e;
                if (y0Var.f43486c && ((b1Var = y0Var.Q) == null || !b1Var.o(eaVar))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 22:
                q5.a aVar = (q5.a) this.f38133b;
                l5.i iVar = (l5.i) this.f38134c;
                String str7 = iVar.f15160a;
                i5.g gVar = (i5.g) this.d;
                l5.h hVar = (l5.h) this.f38135e;
                aVar.getClass();
                Logger logger = q5.a.f45940f;
                try {
                    m5.e a10 = aVar.f45943c.a(str7);
                    if (a10 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.a(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.f45944e).f(new org.telegram.ui.Components.uz(aVar, iVar, ((j5.b) a10).a(hVar), 6));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e13) {
                    logger.warning("Error scheduling event " + e13.getMessage());
                    gVar.a(e13);
                    return;
                }
            case 23:
                qg.o2 o2Var = (qg.o2) this.f38133b;
                o2Var.G = true;
                o2Var.H = (qg.l2[]) ((ArrayList) this.f38134c).toArray(new qg.l2[0]);
                ((qr0) this.d).run((qg.l2) this.f38135e);
                return;
            case 24:
                qg.o2 o2Var2 = (qg.o2) this.f38133b;
                TLObject tLObject8 = (TLObject) this.f38134c;
                qg.m2 m2Var = (qg.m2) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f38135e;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    o2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    m2Var.f46346e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, m2Var.f46345c);
                    m2Var.f46347f = tL_messageMediaDocument;
                    o2Var2.a();
                    return;
                }
                o2Var2.h();
                o2Var2.n(tL_error7);
                return;
            case 25:
                qi.p pVar = (qi.p) this.f38133b;
                qi.i0 i0Var = (qi.i0) this.f38134c;
                qi.i0 i0Var2 = (qi.i0) this.d;
                Handler handler = (Handler) this.f38135e;
                if (pVar.f46841k0 && pVar.P == 0 && pVar.M) {
                    pVar.G.g(pVar.E, pVar.f46857x, false);
                    pVar.N = false;
                    pVar.O = false;
                    pVar.V = 0.0f;
                    pVar.P = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    pVar.Q = elapsedRealtimeNanos;
                    pVar.R = elapsedRealtimeNanos;
                    pVar.W = i0Var;
                    pVar.X = i0Var2;
                    String[] strArr2 = qi.q0.f46886a;
                    synchronized (qi.q0.class) {
                        qi.q0.b();
                        if (i0Var != i0Var2) {
                            if (i0Var == qi.i0.f46771b) {
                                i12 = 0;
                            }
                            a2 = qi.q0.a(i12);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    pVar.U = a2;
                    pVar.S = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    pVar.T = (max - max2) * 1000000;
                    pVar.f46829e.b("synthetic camera switch started: from=" + i0Var + ", to=" + i0Var2 + ", expectedWaitMs=" + pVar.U + ", targetBlurRadiusPx=" + (((pVar.G.f46924a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((pVar.S + pVar.T) / 1000000));
                    pVar.J = -1L;
                    handler.removeCallbacks(pVar.f46850p0);
                    handler.post(pVar.f46850p0);
                    return;
                }
                return;
            case 26:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f38133b;
                Utilities.Callback callback = (Utilities.Callback) this.f38134c;
                TLObject tLObject9 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f38135e;
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
                final xh.n2 n2Var = (xh.n2) this.f38133b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f38134c;
                xh.i1 i1Var = (xh.i1) this.d;
                final View view = (View) this.f38135e;
                org.telegram.ui.Components.xs0 xs0Var = n2Var.f51630a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    i1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n2Var.f51633e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n2Var.f51631b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (n2Var.f51633e.m(savedStarGift, z11, false)) {
                    new xh.q2(n2Var.getContext(), xs0Var.f51731c, savedStarGift, n2Var.f51632c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((i1) view).c(z11, true);
                            n2 n2Var2 = n2.this;
                            n2Var2.f51634f.u0(0);
                            return zc.a0(n2Var2.f51630a.f51729a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.zc.a0(xs0Var.f51729a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.v0.q(R.string.Gift2Unpinned, org.telegram.ui.Components.zc.a0(xs0Var.f51729a), R.raw.ic_unpin, 36);
                }
                ((xh.i1) view).c(z11, true);
                n2Var.f51634f.u0(0);
                return;
            case 28:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f38133b;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f38134c;
                of.e eVar = (of.e) this.d;
                org.telegram.ui.ActionBar.a2 a2Var6 = (org.telegram.ui.ActionBar.a2) this.f38135e;
                if (m2Var2 != null && tL_error9 != null) {
                    org.telegram.ui.Components.zc.a0(m2Var2).f0(tL_error9, false);
                }
                if ((m2Var2 instanceof eo) && tL_error9 == null) {
                    ((eo) m2Var2).cc();
                }
                eVar.b();
                a2Var6.dismiss();
                return;
            default:
                yh.s3.a0((yh.s3) this.f38133b, (boolean[]) this.d, (TL_stars.StarGiftAttribute) this.f38134c, (org.telegram.ui.Components.bd[]) this.f38135e);
                return;
        }
    }

    public gs0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38132a = i10;
        this.f38133b = obj;
        this.f38134c = obj2;
        this.d = obj3;
        this.f38135e = obj4;
    }

    public gs0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.f38132a = 3;
        this.f38133b = privacyControlActivity;
        this.f38134c = tL_error;
        this.f38135e = tLObject;
        this.d = zArr;
    }
}
