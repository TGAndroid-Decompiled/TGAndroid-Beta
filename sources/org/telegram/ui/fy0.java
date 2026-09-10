package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.wc;
public final class fy0 implements Runnable {
    public final int f32933a;
    public final Object f32934b;
    public final Object f32935c;
    public final Object d;
    public final Object e;

    public fy0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f32933a = i10;
        this.f32935c = obj;
        this.f32934b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        String formatPluralString;
        org.telegram.ui.web.c1 c1Var;
        boolean z10;
        int i11;
        switch (this.f32933a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32935c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f32934b;
                TLObject tLObject = (TLObject) this.d;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                privacySettingsActivity.getClass();
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f30337a.l();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f32934b;
                boolean[] zArr = (boolean[]) this.f32935c;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                try {
                    d2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr[0]) {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i12 >= 24) {
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
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.f32935c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f32934b;
                int[] iArr = (int[]) this.e;
                if (!(((TLObject) this.d) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.wc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f30452o4 == iArr[0]) {
                    profileActivity.f30452o4 = 0;
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f32935c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f32934b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f30381e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f30381e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f30389f1));
                    }
                    j20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.f30524z0);
                    return;
                }
                org.telegram.ui.Components.wc.b0(tL_error2);
                return;
            case 4:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f32935c;
                String[] strArr = (String[]) this.f32934b;
                String str = (String) this.d;
                String str2 = (String) this.e;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.i41.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new n20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 5:
                ProfileActivity.n0((ProfileActivity) this.f32935c, (TLRPC.TL_error) this.f32934b, (TLObject) this.d, (String) this.e);
                return;
            case 6:
                TLObject tLObject3 = (TLObject) this.d;
                UserConfig userConfig = (UserConfig) this.f32934b;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = ((n01) this.f32935c).f35089b;
                profileActivity4.f30441n0.f29331c1--;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.f30441n0.V0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f17219id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f32934b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity5 = ((y01) this.f32935c).f38867c.e;
                profileActivity5.M4(null);
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f30381e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f30381e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f30389f1));
                    }
                    TLObject tLObject5 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        j20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject5, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity5.f30524z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.wc.b0(tL_error3);
                return;
            case 8:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f32935c;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f32934b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    d2Var3.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    v81 v81Var = sessionsActivity.f30608a;
                    if (v81Var != null) {
                        v81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f32935c;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) this.f32934b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    d2Var4.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f30611f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    v81 v81Var2 = sessionsActivity2.f30608a;
                    if (v81Var2 != null) {
                        v81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                u81 u81Var = (u81) this.f32935c;
                u81Var.f37157a = (TLObject) this.d;
                u81Var.f37158b = (TLRPC.TL_error) this.f32934b;
                ((l9) this.e).run();
                return;
            case 11:
                k91.c0((k91) this.f32935c, (TLRPC.TL_error) this.f32934b, (TLObject) this.d, (String) this.e);
                return;
            case 12:
                qa1 qa1Var = (qa1) this.f32935c;
                ig.b bVar = (ig.b) this.f32934b;
                String str3 = (String) this.d;
                eb1 eb1Var = (eb1) this.e;
                fb1 fb1Var = qa1Var.f36007w;
                if (bVar != null) {
                    fb1Var.V.put(str3, bVar);
                }
                if (bVar != null && !eb1Var.f32144b && (i10 = eb1Var.f32143a) >= 0) {
                    View m10 = fb1Var.U.m(i10);
                    if (m10 instanceof qa1) {
                        qa1Var.f35757r.e = bVar;
                        qa1 qa1Var2 = (qa1) m10;
                        qa1Var2.f35753b.f9382t0.d(false, false);
                        qa1Var2.g(false);
                    }
                }
                fb1.Z(fb1Var);
                return;
            case 13:
                ra1 ra1Var = (ra1) this.f32935c;
                ra1Var.f36319k = false;
                ra1Var.d = (ig.b) this.f32934b;
                ra1Var.f36316g = (String) this.d;
                pa1 pa1Var = (pa1) ((Utilities.Callback0Return) this.e).run();
                if (pa1Var != null) {
                    pa1Var.e(ra1Var, true);
                    return;
                }
                return;
            case 14:
                TLObject tLObject6 = (TLObject) this.d;
                String str4 = (String) this.e;
                org.telegram.ui.ActionBar.d2 d2Var5 = (org.telegram.ui.ActionBar.d2) this.f32934b;
                ef1 ef1Var = ((af1) this.f32935c).f30996a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                    for (int i13 = 0; i13 < updates.updates.size(); i13++) {
                        if (updates.updates.get(i13) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i13);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ef1Var.getMessagesController().getPeer(ef1Var.f32176a);
                            tL_messageService.dialog_id = ef1Var.f32176a;
                            tL_messageService.f17216id = tL_updateMessageID.f17453id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new MessageObject(ef1.X(ef1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = ef1Var.getMessagesController().getChat(Long.valueOf(-ef1Var.f32176a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f17247id = tL_updateMessageID.f17453id;
                            long j3 = ef1Var.f32177b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f17216id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = ef1Var.getMessagesController().getPeer(ef1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ef1Var.E;
                            eo eoVar = ef1Var.f32185y;
                            if (eoVar != null) {
                                eoVar.La();
                                eoVar.Pa();
                                eoVar.pb(arrayList2, chat3, tL_messageService.f17216id, 1, 1, tL_forumTopic);
                                eoVar.f32281c = true;
                                eoVar.r8();
                                eoVar.Nc(true);
                                eoVar.f32256a1.n(true);
                                eoVar.Tc();
                                eoVar.R1.setCurrentTopic(eoVar.d());
                                eoVar.Qc(true);
                                eoVar.hc(true);
                                eoVar.e9(true);
                                eoVar.A6(true, true);
                                eoVar.Ea();
                                ef1Var.getMessagesController().getTopicsController().onTopicCreated(ef1Var.f32176a, tL_forumTopic, true);
                                ef1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ef1Var.f32176a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                eo eoVar2 = new eo(bundle);
                                eoVar2.pb(arrayList2, chat3, tL_messageService.f17216id, 1, 1, tL_forumTopic);
                                eoVar2.f32281c = true;
                                ef1Var.getMessagesController().getTopicsController().onTopicCreated(ef1Var.f32176a, tL_forumTopic, true);
                                ef1Var.presentFragment(eoVar2);
                            }
                        }
                    }
                }
                d2Var5.dismiss();
                return;
            case 15:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.f32935c, (byte[]) this.f32934b, (TLObject) this.d, (byte[]) this.e);
                return;
            case 16:
                mh1 mh1Var = (mh1) this.f32935c;
                String str5 = (String) this.f32934b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.e;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    mh1Var.u0(new r91(15, mh1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    mh1Var.y0();
                    return;
                }
            case 17:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f32935c;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f32934b;
                String str6 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (y0Var.f38154c && ((c1Var = y0Var.Q) == null || !c1Var.p(a1Var))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 18:
                pg.n2 n2Var = (pg.n2) this.f32935c;
                n2Var.G = true;
                n2Var.H = (pg.k2[]) ((ArrayList) this.f32934b).toArray(new pg.k2[0]);
                ((or0) this.d).run((pg.k2) this.e);
                return;
            case 19:
                pg.n2 n2Var2 = (pg.n2) this.f32935c;
                TLObject tLObject7 = (TLObject) this.d;
                pg.l2 l2Var = (pg.l2) this.f32934b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                if (tLObject7 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                    l2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f40105c);
                    l2Var.f40106f = tL_messageMediaDocument;
                    n2Var2.a();
                    return;
                }
                n2Var2.h();
                n2Var2.n(tL_error7);
                return;
            case 20:
                q5.a aVar = (q5.a) this.f32935c;
                l5.i iVar = (l5.i) this.f32934b;
                String str7 = iVar.f12793a;
                i5.g gVar = (i5.g) this.d;
                l5.h hVar = (l5.h) this.e;
                aVar.getClass();
                Logger logger = q5.a.f40540f;
                try {
                    m5.e a2 = aVar.f40543c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.b(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.f21(aVar, iVar, ((j5.b) a2).a(hVar), 3));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.b(e12);
                    return;
                }
            case 21:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f32935c;
                Utilities.Callback callback = (Utilities.Callback) this.f32934b;
                TLObject tLObject8 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    return;
                } else if (tLObject8 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject8);
                    return;
                } else {
                    return;
                }
            case 22:
                final wh.m2 m2Var = (wh.m2) this.f32935c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f32934b;
                wh.h1 h1Var = (wh.h1) this.d;
                final View view = (View) this.e;
                org.telegram.ui.Components.wr0 wr0Var = m2Var.f44246a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f44247b).sendRequest(savestargift, null, 64);
                }
                boolean z11 = savedStarGift.pinned_to_top;
                final boolean z12 = !z11;
                if (m2Var.e.m(savedStarGift, z12, false)) {
                    new wh.p2(m2Var.getContext(), wr0Var.f44319c, savedStarGift, m2Var.f44248c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((h1) view).c(z12, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f44249f.u0(0);
                            return wc.a0(m2Var2.f44246a.f44317a);
                        }
                    }).show();
                    return;
                }
                if (!z11) {
                    org.telegram.ui.Components.wc.a0(wr0Var.f44317a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.a2.o(R.string.Gift2Unpinned, org.telegram.ui.Components.wc.a0(wr0Var.f44317a), R.raw.ic_unpin, 36);
                }
                ((wh.h1) view).c(z12, true);
                m2Var.f44249f.u0(0);
                return;
            case 23:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f32935c;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.d;
                nf.e eVar = (nf.e) this.e;
                org.telegram.ui.ActionBar.d2 d2Var6 = (org.telegram.ui.ActionBar.d2) this.f32934b;
                if (p2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.wc.a0(p2Var).d0(tL_error9, false);
                }
                if ((p2Var instanceof eo) && tL_error9 == null) {
                    ((eo) p2Var).Yb();
                }
                eVar.b();
                d2Var6.dismiss();
                return;
            case 24:
                xh.x3.Z((xh.x3) this.f32935c, (boolean[]) this.f32934b, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.yc[]) this.e);
                return;
            case 25:
                xh.x3.R0((xh.x3) this.f32935c, (TLObject) this.d, (org.telegram.ui.Components.sx0) this.f32934b, (TLRPC.TL_error) this.e);
                return;
            case 26:
                xh.x3.S0((xh.x3) this.f32935c, (MessageObject) this.f32934b, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 27:
                xh.x3 x3Var = (xh.x3) this.f32935c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.f32934b;
                TLObject tLObject9 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error10 == null && (tLObject9 instanceof TLRPC.Updates)) {
                    x3Var.f46297q0 = true;
                    x3Var.l1 = null;
                    x3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject9, new xh.b1(x3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.k0(14, x3Var, tLObject9));
                    return;
                }
                x3Var.getBulletinFactory().d0(tL_error10, false);
                return;
            case 28:
                xh.x2 x2Var = (xh.x2) this.f32935c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f32934b;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.o6 o6Var = x2Var.H;
                x2Var.f46255h0 = false;
                if (starGift == null) {
                    org.telegram.ui.Components.kj0 kj0Var = x2Var.f46259l0;
                    if (kj0Var != null) {
                        kj0Var.d();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(11), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList3.size(), new Object[0])));
                    o6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    o6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i14 = 0;
                        while (true) {
                            wh.h1[] h1VarArr = x2Var.O;
                            if (i14 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i14]);
                                i14++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new wh.h1[arrayList3.size()];
                    int i15 = 0;
                    while (i15 < arrayList3.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList3.get(i15);
                        wh.h1 h1Var2 = new wh.h1(x2Var.getContext(), x2Var.W, x2Var.f46244a);
                        h1Var2.g(starGift2, false, false, false, false, true);
                        h1Var2.f44133x.setVisibility(8);
                        h1Var2.setRibbonColor(-3065286);
                        org.telegram.ui.Components.w9 w9Var = h1Var2.f44134y;
                        FrameLayout.LayoutParams e13 = w7.a6.e(42, 42, 17);
                        h1Var2.E = e13;
                        w9Var.setLayoutParams(e13);
                        int i16 = i15 + 1;
                        if (i16 >= arrayList3.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i15] = h1Var2;
                        if (z10) {
                            i11 = 0;
                        } else {
                            i11 = 6;
                        }
                        linearLayout.addView(h1Var2, w7.a6.p(74, 74, 0.0f, 51, 0, 0, i11, 0));
                        i15 = i16;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                TLObject tLObject10 = (TLObject) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f32934b;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                zh.a3 a3Var = ((zh.v2) this.f32935c).f48986l;
                if (tLObject10 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject10;
                    MessagesController.getInstance(a3Var.C2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(a3Var.C2).putChats(tL_stories_stories.chats, false);
                    for (int i17 = 0; i17 < tL_stories_stories.stories.size(); i17++) {
                        if (tL_stories_stories.stories.get(i17).f17435id == storyItem.f17435id) {
                            callback3.run(tL_stories_stories.stories.get(i17).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
        }
    }

    public fy0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f32933a = i10;
        this.f32935c = obj;
        this.d = tLObject;
        this.f32934b = obj2;
        this.e = obj3;
    }

    public fy0(Object obj, TLObject tLObject, Object obj2, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f32933a = i10;
        this.f32935c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f32934b = d2Var;
    }

    public fy0(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, Activity activity, File file) {
        this.f32933a = 1;
        this.f32934b = d2Var;
        this.f32935c = zArr;
        this.d = activity;
        this.e = file;
    }
}
