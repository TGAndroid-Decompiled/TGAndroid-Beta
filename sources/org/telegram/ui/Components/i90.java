package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i90 implements Runnable {
    public final int f27205a;
    public final Object f27206b;
    public final Object f27207c;
    public final Object d;
    public final Object e;

    public i90(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f27205a = i10;
        this.f27206b = callback;
        this.f27207c = obj;
        this.e = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
        long j10;
        TLRPC.VideoSize videoSize;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formatString;
        int i16;
        byte[] bArr;
        int i17;
        String formatPluralString;
        int i18;
        int i19;
        int i20 = this.f27205a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f27207c;
        Object obj4 = this.f27206b;
        switch (i20) {
            case 0:
                q90 q90Var = (q90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                q90Var.f29508y = false;
                q90Var.K = tL_chatInviteExported.link;
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i21 = 0; i21 < tL_messages_chatInviteImporters.users.size(); i21++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    q90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 1:
                wa0 wa0Var = (wa0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(wa0Var.U);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    ((TL_stories.StoryItem) arrayList.get(i22)).pinned = zArr[i22];
                }
                wa0Var.getMessagesController().getStoriesController().n0(wa0Var.e, arrayList, false);
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ei.d dVar = (ei.d) obj4;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj3;
                Runnable runnable = (Runnable) obj;
                if (tL_error2 != null) {
                    xc.X().f0(tL_error2, false);
                    return;
                }
                dVar.setLoading(false);
                f3Var.dismiss();
                xc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable.run();
                return;
            case 3:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj3;
                cyVar.showDialog(new org.telegram.ui.h31((Context) obj2, cyVar.getResourceProvider(), new ho0(1, (po0) obj4, cyVar)));
                ((i80) obj).u();
                return;
            case 4:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                i80 i80Var = (i80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.d6 resourceProvider = cyVar2.getResourceProvider();
                ho0 ho0Var = new ho0(0, (po0) obj4, tL_sponsoredPeer);
                int i23 = org.telegram.ui.o21.v;
                int currentAccount = cyVar2.getCurrentAccount();
                Activity parentActivity = cyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ji(parentActivity, resourceProvider, bArr2, cyVar2, ho0Var, currentAccount));
                }
                i80Var.u();
                return;
            case 5:
                fr0.n((fr0) obj4, (AtomicReference) obj3, (lq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 6:
                qy0.F((qy0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (MediaDataController) obj3);
                return;
            case 7:
                qy0.p((org.telegram.ui.xr0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (TLRPC.TL_messages_getAttachedStickers) obj3);
                return;
            case 8:
                e11 e11Var = (e11) obj4;
                TLObject tLObject2 = (TLObject) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(e11Var.d).performLogout(0);
                    return;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error3 != null) {
                        StringBuilder i24 = r4.c.i(string, "\n");
                        i24.append(tL_error3.text);
                        string = i24.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                    b2Var.R = string2;
                    b2Var.T = string;
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 9:
                s31 s31Var = (s31) obj4;
                ((i80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-s31Var.f30185c, ((TLRPC.TL_forumTopic) obj).f20331id, !tL_forumTopic.pinned, s31Var.h);
                return;
            case 10:
                t41.o((t41) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (TLRPC.TL_textWithEntities) obj3);
                return;
            case 11:
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = q50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                q50Var.f40379a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = q50Var.f40379a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j10 = 0;
                } else {
                    j10 = chat.f20279id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = q50Var.f40422k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = q50Var.f40379a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f20289id = groupCall3.f20289id;
                call3.createNoVideoParticipant();
                a30 a30Var = q50Var.f40441p2;
                ChatObject.Call call4 = q50Var.f40379a1;
                a30Var.f24480c = call4;
                q50Var.a2.setGroupCall(call4);
                q50Var.f40437o2.f42476c = q50Var.f40379a1;
                q50Var.f40387c0.C0(accountInstance.getCurrentAccount(), q50Var.f40379a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = q50Var.f40379a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 12:
                org.telegram.ui.q50.y((org.telegram.ui.q50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                g30 g30Var = (g30) obj2;
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    for (int i25 = 0; i25 < Math.min(arrayList2.size(), vector.objects.size()); i25++) {
                        if (vector.objects.get(i25) instanceof TL_account.requirementToContactPremium) {
                            arrayList3.add(Long.valueOf(((TLRPC.User) arrayList2.get(i25)).f20426id));
                        }
                    }
                }
                g30Var.run();
                return;
            case 14:
                org.telegram.ui.y40 y40Var = (org.telegram.ui.y40) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                String str = (String) obj3;
                org.telegram.ui.q50 q50Var2 = y40Var.f43354f;
                AccountInstance accountInstance2 = q50Var2.d;
                org.telegram.ui.j30 j30Var = q50Var2.f40381b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    j30Var.K0 = imageLocation;
                    j30Var.f28194q1 = null;
                    j30Var.f28195r1 = null;
                    y40Var.d = null;
                }
                if (tL_error4 == null) {
                    TLRPC.User user = accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance2.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance2.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        accountInstance2.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20303id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && y40Var.f43353c != null) {
                        i13 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(y40Var.f43353c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(y40Var.f43353c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(y40Var.f43353c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && y40Var.f43352b != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(y40Var.f43352b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) q50Var2).currentAccount;
                        new File(str).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f20426id).reset();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(y40Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(y40Var.f43352b) == null) {
                        forUser2 = ImageLocation.getForLocal(y40Var.f43353c);
                    }
                    j30Var.setCreateThumbFromParent(false);
                    j30Var.H(null, forUser, forUser2, true);
                    y40Var.f43353c = null;
                    y40Var.f43352b = null;
                    AndroidUtilities.updateVisibleRows(q50Var2.Q);
                    y40Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 15:
                org.telegram.ui.s60.U((org.telegram.ui.s60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 16:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj4;
                z60Var.d = (ArrayList) obj3;
                z60Var.e = (ArrayList) obj2;
                z60Var.l();
                org.telegram.ui.a70 a70Var = z60Var.f43652r;
                a70Var.f35295b.d.setVisibility(8);
                a70Var.f35295b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                a70Var.f35295b.e(false, true);
                return;
            case 17:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.z70 z70Var = (org.telegram.ui.z70) obj3;
                TLObject tLObject5 = (TLObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.C1;
                try {
                    z70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject5 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject5;
                    Pattern pattern2 = f5.f26080a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20608a;
                    if (equals) {
                        b2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new h1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        b2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        b2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.w0(27, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i26 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i26);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i26);
                        }
                    } else {
                        i16 = -1;
                    }
                    if (indexOf != -1 && i16 != -1) {
                        spannableStringBuilder.setSpan(new q3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21119k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21136l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21099j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    return;
                } else if (tL_error5 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error5.text)) {
                        launchActivity.F0(f5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error5.text);
                    launchActivity.F0(f5.M(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    b2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject6 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.z70(3, hVar, tL_error6));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ib0 ib0Var = (org.telegram.ui.ib0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                nr.e(n2Var.getContext(), ib0Var.f37916b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new qy(11, ib0Var, userArr), n2Var.getResourceProvider(), org.telegram.ui.ib0.d());
                return;
            case 20:
                org.telegram.ui.fb0.t0((org.telegram.ui.fb0) obj4, (TLObject) obj, (HashSet) obj3, (TLRPC.TL_error) obj2);
                return;
            case 21:
                EditText editText = (EditText) obj2;
                ao aoVar = (ao) obj;
                ((sd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.z70(15, editText, aoVar));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.sd0 sd0Var = (org.telegram.ui.sd0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str3 != null) {
                    bArr = AndroidUtilities.getStringBytes(str3);
                } else {
                    bArr = null;
                }
                org.telegram.ui.qd0 qd0Var = new org.telegram.ui.qd0(sd0Var, str3, str4, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = sd0Var.f41445s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            qd0Var.run(null, tL_error7);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.n2) sd0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, qd0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                tL_error8.text = "PASSWORD_HASH_INVALID";
                qd0Var.run(null, tL_error8);
                return;
            case 23:
                org.telegram.ui.ge0 ge0Var = (org.telegram.ui.ge0) obj4;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                org.telegram.ui.dg0 dg0Var = ge0Var.f37311y;
                dg0Var.k1(false, true);
                ge0Var.f37306n = false;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str5);
                    bundle.putString("password", ge0Var.h);
                    dg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error9.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    return;
                } else {
                    ge0Var.o(true);
                    return;
                }
            case 24:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj3;
                TLObject tLObject7 = (TLObject) obj;
                org.telegram.ui.dg0 dg0Var2 = hf0Var.f37620s0;
                hf0Var.f37602d0 = false;
                if (tL_error10 == null) {
                    hf0Var.f37614o0 = bundle2;
                    if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject7;
                        hf0Var.f37615p0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            hf0Var.f37606g0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            hf0Var.f37606g0 = 16;
                        }
                        dg0Var2.g1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject7;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        dg0Var2.u1(18, true, bundle2, true);
                    }
                } else {
                    String str6 = tL_error10.text;
                    if (str6 != null) {
                        if (str6.contains("PHONE_NUMBER_INVALID")) {
                            dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error10.text.contains("PHONE_CODE_EMPTY") && !tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                                hf0Var.c(true);
                                dg0Var2.u1(0, true, null, true);
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error10.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error10.text);
                                dg0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                hf0Var.z(false);
                return;
            case 25:
                org.telegram.ui.mf0.o((org.telegram.ui.mf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 26:
                c5.p pVar = (c5.p) obj3;
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj2;
                org.telegram.ui.dg0 dg0Var3 = ((org.telegram.ui.mf0) obj4).v;
                dg0Var3.e = true;
                BillingController.getInstance().addResultListener(pVar.f4775c, new org.telegram.ui.j3(v3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.lf0(v3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = dg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.n2) dg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                n4.s sVar = new n4.s(9, false);
                sVar.G(pVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(sVar.k()));
                return;
            case 27:
                org.telegram.ui.cg0 cg0Var = (org.telegram.ui.cg0) obj4;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj;
                String str7 = (String) obj3;
                cg0Var.K = false;
                org.telegram.ui.dg0 dg0Var4 = cg0Var.V;
                dg0Var4.v1(false, true);
                if (tL_error11 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject8;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        f5.w0(dg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str7);
                    dg0Var4.u1(6, true, bundle3, false);
                    return;
                }
                dg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error11.text);
                return;
            case 28:
                org.telegram.ui.ri0 ri0Var = (org.telegram.ui.ri0) obj4;
                kg.b bVar = (kg.b) obj3;
                String str8 = (String) obj2;
                org.telegram.ui.o91 o91Var = (org.telegram.ui.o91) obj;
                org.telegram.ui.ui0 ui0Var = ri0Var.v.d;
                if (bVar != null) {
                    ui0Var.v.put(str8, bVar);
                }
                if (bVar != null && !o91Var.f39807b && (i19 = o91Var.f39806a) >= 0) {
                    View m10 = ui0Var.h.m(i19);
                    if (m10 instanceof org.telegram.ui.z81) {
                        ri0Var.f43678r.e = bVar;
                        org.telegram.ui.z81 z81Var = (org.telegram.ui.z81) m10;
                        z81Var.f43674b.f14480t0.d(false, false);
                        z81Var.g(false);
                    }
                }
                ri0Var.f();
                return;
            default:
                org.telegram.ui.ak0 ak0Var = (org.telegram.ui.ak0) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                hg.a2 a2Var = ak0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ak0Var.f35387n;
                if (notificationsCustomSettingsActivity.f33212f) {
                    ak0Var.f35386f = null;
                    ak0Var.d = arrayList6;
                    ak0Var.e = arrayList7;
                    a2Var.f(arrayList8, null);
                    if (notificationsCustomSettingsActivity.f33212f && !a2Var.e()) {
                        notificationsCustomSettingsActivity.f33211c.c();
                    }
                    ak0Var.l();
                    return;
                }
                return;
        }
    }

    public i90(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27205a = i10;
        this.f27206b = obj;
        this.f27207c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public i90(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.f27205a = i10;
        this.f27206b = obj;
        this.e = tLObject;
        this.f27207c = obj2;
        this.d = tL_error;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, int i10) {
        this.f27205a = i10;
        this.f27206b = obj;
        this.d = tL_error;
        this.e = tLObject;
        this.f27207c = obj2;
    }

    public i90(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, g30 g30Var) {
        this.f27205a = 13;
        this.e = tLObject;
        this.f27206b = arrayList;
        this.f27207c = arrayList2;
        this.d = g30Var;
    }

    public i90(TLRPC.TL_error tL_error, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.f27205a = 2;
        this.d = tL_error;
        this.f27206b = dVar;
        this.f27207c = f3Var;
        this.e = runnable;
    }

    public i90(org.telegram.ui.hf0 hf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f27205a = 24;
        this.f27206b = hf0Var;
        this.d = tL_error;
        this.f27207c = bundle;
        this.e = tLObject;
    }
}
