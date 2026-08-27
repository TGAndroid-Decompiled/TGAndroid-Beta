package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ex0 implements Runnable {

    public final int f37872a;

    public final Object f37873b;

    public final Object f37874c;
    public final Object d;

    public final Object f37875e;

    public ex0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37872a = i10;
        this.f37873b = obj;
        this.f37874c = obj2;
        this.d = obj3;
        this.f37875e = obj4;
    }

    @Override
    public final void run() {
        int iIndexOf;
        int i10;
        int i11 = this.f37872a;
        int i12 = 24;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        final int i13 = 1;
        final int i14 = 0;
        Object obj = this.f37875e;
        Object obj2 = this.d;
        Object obj3 = this.f37874c;
        Object obj4 = this.f37873b;
        switch (i11) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                    break;
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                        return;
                    }
                    return;
                }
                int i15 = Build.VERSION.SDK_INT;
                Uri uriD = i15 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                Intent intent = new Intent("android.intent.action.SEND");
                if (i15 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", uriD);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.mc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f35998k4 == iArr[0]) {
                    profileActivity.f35998k4 = 0;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    s10.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.f35923a1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35923a1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f35929b1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity2.f36067v0);
                    return;
                } else {
                    org.telegram.ui.Components.mc.b0(tL_error2);
                    return;
                }
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.b31.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new w10(profileActivity3, 2), null);
                    return;
                }
                return;
            case 4:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 5:
                TLObject tLObject2 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((dz0) obj4).f37574b;
                profileActivity4.f35987j0.Y0--;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.f35987j0.R0;
                        if (!arrayList.isEmpty() && (iIndexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(iIndexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f22404id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((oz0) obj4).f41229c.f43554e;
                profileActivity5.M4(null);
                if (!(tLObject3 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.mc.b0(tL_error3);
                    return;
                }
                TLObject user2 = profileActivity5.f35923a1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f35923a1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f35929b1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                s10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user2, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity5.f36067v0);
                return;
            case 7:
                SessionsActivity sessionsActivity = (SessionsActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    b2Var.dismiss();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.f36179e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    j71 j71Var = sessionsActivity.f36176a;
                    if (j71Var != null) {
                        j71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    b2Var2.dismiss();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.f36179e.remove(tL_authorization);
                    sessionsActivity2.f36180f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    j71 j71Var2 = sessionsActivity2.f36176a;
                    if (j71Var2 != null) {
                        j71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                i71 i71Var = (i71) obj4;
                i71Var.f38990a = (TLObject) obj3;
                i71Var.f38991b = (TLRPC.TL_error) obj2;
                ((k9) obj).run();
                return;
            case 10:
                x71.b0((x71) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 11:
                b91 b91Var = (b91) obj4;
                sf.b bVar = (sf.b) obj3;
                String str3 = (String) obj2;
                p91 p91Var = (p91) obj;
                q91 q91Var = b91Var.f36728w;
                if (bVar != null) {
                    q91Var.R.put(str3, bVar);
                }
                if (bVar != null && !p91Var.f41305b && (i10 = p91Var.f41304a) >= 0) {
                    View viewM = q91Var.Q.m(i10);
                    if (viewM instanceof b91) {
                        b91Var.f36469r.f37024e = bVar;
                        b91 b91Var2 = (b91) viewM;
                        b91Var2.f36464b.f46978p0.d(false, false);
                        b91Var2.g(false);
                    }
                }
                q91.Z(q91Var);
                return;
            case 12:
                c91 c91Var = (c91) obj4;
                c91Var.f37029k = false;
                c91Var.d = (sf.b) obj3;
                c91Var.f37026g = (String) obj2;
                a91 a91Var = (a91) ((Utilities.Callback0Return) obj).run();
                if (a91Var != null) {
                    a91Var.e(c91Var, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                sd1 sd1Var = ((od1) obj3).f41067a;
                if (tLObject4 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i16);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = sd1Var.getMessagesController().getPeer(sd1Var.f42591a);
                            tL_messageService.dialog_id = sd1Var.f42591a;
                            tL_messageService.f22401id = tL_updateMessageID.f22635id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new MessageObject(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount, tL_messageService, false, false));
                            TLRPC.Chat chat = sd1Var.getMessagesController().getChat(Long.valueOf(-sd1Var.f42591a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f22432id = tL_updateMessageID.f22635id;
                            long j10 = sd1Var.f42592b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f22401id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = sd1Var.getMessagesController().getPeer(sd1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = sd1Var.A;
                            rn rnVar = sd1Var.f42601y;
                            if (rnVar != null) {
                                rnVar.La();
                                rnVar.Pa();
                                rnVar.pb(arrayList2, chat, tL_messageService.f22401id, 1, 1, tL_forumTopic);
                                rnVar.f42000c = true;
                                rnVar.r8();
                                rnVar.Nc(true);
                                rnVar.W0.n(true);
                                rnVar.Tc();
                                rnVar.N1.setCurrentTopic(rnVar.b());
                                rnVar.Qc(true);
                                rnVar.hc(true);
                                rnVar.e9(true);
                                rnVar.A6(true, true);
                                rnVar.Ea();
                                sd1Var.getMessagesController().getTopicsController().onTopicCreated(sd1Var.f42591a, tL_forumTopic, true);
                                sd1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -sd1Var.f42591a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                rn rnVar2 = new rn(bundle);
                                rnVar2.pb(arrayList2, chat, tL_messageService.f22401id, 1, 1, tL_forumTopic);
                                rnVar2.f42000c = true;
                                sd1Var.getMessagesController().getTopicsController().onTopicCreated(sd1Var.f42591a, tL_forumTopic, true);
                                sd1Var.presentFragment(rnVar2);
                            }
                        }
                    }
                }
                b2Var3.dismiss();
                return;
            case 14:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 15:
                zf1 zf1Var = (zf1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    zf1Var.u0(new m21(i12, zf1Var, str5));
                    return;
                }
                if (tL_error6 == null || tL_error6.text.startsWith("CODE_INVALID")) {
                    zf1Var.y0();
                    return;
                } else if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            case 16:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    z0Var.v("file_download_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                    return;
                }
                Context context = z0Var.getContext();
                String userName = UserObject.getUserName(z0Var.Q);
                final gh.i iVar = new gh.i(z0Var, str6, str7, 12);
                HashMap map = nh.j0.f18767g;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.f22702a;
                b2Var4.N = string;
                b2Var4.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
                imageView.setImageResource(R.drawable.msg_round_file_s);
                linearLayout.addView(imageView, h7.z5.t(44, 44, 19, 0, 0, 10, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView textViewH = org.telegram.messenger.y1.h(context, 1, 15.0f);
                textViewH.setTypeface(AndroidUtilities.bold());
                textViewH.setText(str7);
                textViewH.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23233n5, false));
                linearLayout2.addView(textViewH, h7.z5.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(12.0f));
                SpannableString spannableString = new SpannableString("l");
                org.telegram.ui.Components.u80 u80Var = new org.telegram.ui.Components.u80(AndroidUtilities.dp(55.0f), j6Var);
                int i17 = org.telegram.ui.ActionBar.g6.Ed;
                u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.w0(null, i17, false)), org.telegram.ui.ActionBar.g6.l1(0.075f, org.telegram.ui.ActionBar.g6.w0(null, i17, false)));
                spannableString.setSpan(u80Var, 0, 1, 33);
                j6Var.setText(spannableString);
                lh.a8 a8Var = new lh.a8(j6Var, 7);
                HashMap map2 = nh.j0.h;
                if (map2.containsKey(str6)) {
                    Pair pair = (Pair) map2.get(str6);
                    a8Var.run((String) pair.first, (Long) pair.second);
                } else {
                    new nh.c0(str6, a8Var).execute(str6);
                }
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                linearLayout2.addView(j6Var, h7.z5.n(-1, 15));
                linearLayout.addView(linearLayout2, h7.z5.t(-1, -2, 23, 0, 0, 0, 2));
                alertDialog$Builder.n(linearLayout);
                final boolean[] zArr2 = new boolean[1];
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i18) {
                        switch (i14) {
                            case 0:
                                boolean[] zArr3 = zArr2;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr3[0] = true;
                                }
                                break;
                            default:
                                boolean[] zArr4 = zArr2;
                                if (!zArr4[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr4[0] = true;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i18) {
                        switch (i13) {
                            case 0:
                                boolean[] zArr3 = zArr2;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr3[0] = true;
                                }
                                break;
                            default:
                                boolean[] zArr4 = zArr2;
                                if (!zArr4[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr4[0] = true;
                                }
                                break;
                        }
                    }
                });
                b2Var4.setOnDismissListener(new cg.g(2, zArr2, iVar));
                b2Var4.show();
                return;
            case 17:
                pf.c cVar = (pf.c) obj4;
                Location location = (Location) obj3;
                String str8 = (String) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = cVar.f45744r;
                cVar.f45743n = false;
                if (location == null) {
                    cVar.B = 0;
                    cVar.h = false;
                    cVar.f45745s.clear();
                    cVar.F = false;
                    cVar.f45747x = str8;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                cVar.l();
                return;
            case 18:
                pf.c cVar2 = (pf.c) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                String str9 = (String) obj2;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList5 = cVar2.f45745s;
                if (tL_error7 == null) {
                    cVar2.B = 0;
                    cVar2.h = false;
                    arrayList5.clear();
                    cVar2.F = false;
                    cVar2.f45747x = str9;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size = messages_botresults.results.size();
                    while (i14 < size) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a9.p.p(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.f22378id;
                                arrayList5.add(tL_messageMediaVenue);
                            }
                        }
                        i14++;
                    }
                }
                pf.b bVar2 = cVar2.f45748y;
                if (bVar2 != null) {
                    bVar2.a(arrayList5);
                }
                cVar2.l();
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ex0((pf.k) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((org.telegram.ui.Components.fx) obj3, true), 20));
                return;
            case 20:
                pf.k kVar = (pf.k) obj4;
                Runnable runnable = (Runnable) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                f2.m mVar = (f2.m) obj;
                if (kVar.V) {
                    kVar.V = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    kVar.I = arrayList6;
                    mVar.b(kVar);
                    if (kVar.W) {
                        kVar.W = false;
                        kVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qf.v vVar = (qf.v) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = vVar.f46466b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int iIndexOf2 = arrayList7.indexOf(tL_businessChatLink);
                    if (iIndexOf2 != -1) {
                        arrayList7.set(iIndexOf2, tL_businessChatLink2);
                        NotificationCenter.getInstance(vVar.f46465a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        vVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                qf.q1 q1Var = (qf.q1) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                qf.p1 p1Var = (qf.p1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(p1Var.f46418a));
                        while (sQLiteCursorQueryFinalized.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    if (sQLiteCursorQueryFinalized != null) {
                    }
                    AndroidUtilities.runOnUIThread(new ex0(q1Var, arrayList8, p1Var, tL_messages_sendQuickReplyMessages, 23));
                    return;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new ex0(q1Var, arrayList8, p1Var, tL_messages_sendQuickReplyMessages, 23));
                return;
            case 23:
                qf.q1 q1Var2 = (qf.q1) obj4;
                ArrayList<Integer> arrayList9 = (ArrayList) obj3;
                qf.p1 p1Var2 = (qf.p1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i18 = q1Var2.f46433a;
                if (arrayList9.isEmpty() || arrayList9.size() < p1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = p1Var2.f46418a;
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_getQuickReplyMessages, new cg.y(q1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 27));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.f22495id = arrayList9;
                    while (i14 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 24:
                ((rh.p) obj4).f47324r.V4((rh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.b70) obj).u();
                return;
            case 25:
                zf.n2 n2Var = (zf.n2) obj4;
                n2Var.C = true;
                n2Var.D = (zf.k2[]) ((ArrayList) obj3).toArray(new zf.k2[0]);
                ((nq0) obj2).run((zf.k2) obj);
                return;
            default:
                zf.n2 n2Var2 = (zf.n2) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                zf.l2 l2Var = (zf.l2) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (!(tLObject7 instanceof TLRPC.TL_messageMediaDocument)) {
                    n2Var2.h();
                    n2Var2.n(tL_error8);
                    return;
                }
                n2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                l2Var.f50549e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f50548c);
                l2Var.f50550f = tL_messageMediaDocument;
                n2Var2.a();
                return;
        }
    }

    public ex0(SessionsActivity sessionsActivity, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37872a = i10;
        this.f37874c = sessionsActivity;
        this.f37873b = b2Var;
        this.d = tL_error;
        this.f37875e = tLObject;
    }

    public ex0(od1 od1Var, TLObject tLObject, String str, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f37872a = 13;
        this.f37874c = od1Var;
        this.d = tLObject;
        this.f37875e = str;
        this.f37873b = b2Var;
    }
}
