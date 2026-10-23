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
public final class j90 implements Runnable {
    public final int f27631a;
    public final Object f27632b;
    public final Object f27633c;
    public final Object d;
    public final Object e;

    public j90(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f27631a = i10;
        this.f27632b = callback;
        this.f27633c = obj;
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
        int i20 = this.f27631a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f27633c;
        Object obj4 = this.f27632b;
        switch (i20) {
            case 0:
                r90 r90Var = (r90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                r90Var.f30132y = false;
                r90Var.L = tL_chatInviteExported.link;
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i21 = 0; i21 < tL_messages_chatInviteImporters.users.size(); i21++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    r90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 1:
                xa0 xa0Var = (xa0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(xa0Var.U);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    ((TL_stories.StoryItem) arrayList.get(i22)).pinned = zArr[i22];
                }
                xa0Var.getMessagesController().getStoriesController().n0(xa0Var.e, arrayList, false);
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ei.d dVar = (ei.d) obj4;
                org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) obj3;
                Runnable runnable = (Runnable) obj;
                if (tL_error2 != null) {
                    xc.X().f0(tL_error2, false);
                    return;
                }
                dVar.setLoading(false);
                r6Var.dismiss();
                xc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable.run();
                return;
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj3;
                eyVar.showDialog(new org.telegram.ui.l31((Context) obj2, eyVar.getResourceProvider(), new ko0(1, (so0) obj4, eyVar)));
                ((j80) obj).u();
                return;
            case 4:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                j80 j80Var = (j80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.g6 resourceProvider = eyVar2.getResourceProvider();
                ko0 ko0Var = new ko0(0, (so0) obj4, tL_sponsoredPeer);
                int i23 = org.telegram.ui.s21.f41291w;
                int currentAccount = eyVar2.getCurrentAccount();
                Activity parentActivity = eyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ii(parentActivity, resourceProvider, bArr2, eyVar2, ko0Var, currentAccount));
                }
                j80Var.u();
                return;
            case 5:
                ir0.m((ir0) obj4, (AtomicReference) obj3, (pq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 6:
                ty0.G((ty0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (MediaDataController) obj3);
                return;
            case 7:
                ty0.q((org.telegram.ui.as0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (TLRPC.TL_messages_getAttachedStickers) obj3);
                return;
            case 8:
                h11 h11Var = (h11) obj4;
                TLObject tLObject2 = (TLObject) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(h11Var.d).performLogout(0);
                    return;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error3 != null) {
                        StringBuilder i24 = si.o0.i(string, "\n");
                        i24.append(tL_error3.text);
                        string = i24.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.R = string2;
                    c2Var.T = string;
                    org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 9:
                w31 w31Var = (w31) obj4;
                ((j80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-w31Var.f32134c, ((TLRPC.TL_forumTopic) obj).f20395id, !tL_forumTopic.pinned, w31Var.h);
                return;
            case 10:
                y41.n((y41) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (TLRPC.TL_textWithEntities) obj3);
                return;
            case 11:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = u50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                u50Var.f42171a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = u50Var.f42171a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j10 = 0;
                } else {
                    j10 = chat.f20343id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = u50Var.f42214k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = u50Var.f42171a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f20353id = groupCall3.f20353id;
                call3.createNoVideoParticipant();
                a30 a30Var = u50Var.f42233p2;
                ChatObject.Call call4 = u50Var.f42171a1;
                a30Var.f24613c = call4;
                u50Var.a2.setGroupCall(call4);
                u50Var.f42229o2.f35579c = u50Var.f42171a1;
                u50Var.f42179c0.C0(accountInstance.getCurrentAccount(), u50Var.f42171a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = u50Var.f42171a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 12:
                org.telegram.ui.u50.x((org.telegram.ui.u50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
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
                            arrayList3.add(Long.valueOf(((TLRPC.User) arrayList2.get(i25)).f20490id));
                        }
                    }
                }
                g30Var.run();
                return;
            case 14:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                String str = (String) obj3;
                org.telegram.ui.u50 u50Var2 = b50Var.f35881f;
                AccountInstance accountInstance2 = u50Var2.d;
                org.telegram.ui.m30 m30Var = u50Var2.f42173b;
                ImageLocation imageLocation = b50Var.d;
                if (imageLocation != null) {
                    m30Var.K0 = imageLocation;
                    m30Var.f29200q1 = null;
                    m30Var.f29201r1 = null;
                    b50Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20367id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && b50Var.f35880c != null) {
                        i13 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(b50Var.f35880c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b50Var.f35880c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(b50Var.f35880c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && b50Var.f35879b != null) {
                        i11 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(b50Var.f35879b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str != null) {
                        i10 = ((org.telegram.ui.ActionBar.h3) u50Var2).currentAccount;
                        new File(str).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f20490id).reset();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(b50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(b50Var.f35879b) == null) {
                        forUser2 = ImageLocation.getForLocal(b50Var.f35880c);
                    }
                    m30Var.setCreateThumbFromParent(false);
                    m30Var.H(null, forUser, forUser2, true);
                    b50Var.f35880c = null;
                    b50Var.f35879b = null;
                    AndroidUtilities.updateVisibleRows(u50Var2.Q);
                    b50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 15:
                org.telegram.ui.w60.U((org.telegram.ui.w60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 16:
                org.telegram.ui.d70 d70Var = (org.telegram.ui.d70) obj4;
                d70Var.d = (ArrayList) obj3;
                d70Var.e = (ArrayList) obj2;
                d70Var.l();
                org.telegram.ui.e70 e70Var = d70Var.f36526r;
                e70Var.f36835b.d.setVisibility(8);
                e70Var.f36835b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                e70Var.f36835b.e(false, true);
                return;
            case 17:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) obj3;
                TLObject tLObject5 = (TLObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject5 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject5;
                    Pattern pattern2 = f5.f26167a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                    if (equals) {
                        c2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new g1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        c2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        c2Var2.R = LocaleController.getString(R.string.LanguageTitle);
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
                        spannableStringBuilder.setSpan(new p3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.I(textView, org.telegram.ui.ActionBar.k6.f21309k5, null);
                    org.telegram.ui.ActionBar.r6.E(textView, org.telegram.ui.ActionBar.k6.f21326l5, null);
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.G0(alertDialog$Builder2);
                    return;
                } else if (tL_error5 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error5.text)) {
                        launchActivity.G0(f5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error5.text);
                    launchActivity.G0(f5.N(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                Pattern pattern3 = LaunchActivity.E1;
                try {
                    c2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject6 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.f80(3, gVar, tL_error6));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                nr.e(o2Var.getContext(), ob0Var.f40120b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new qy(11, ob0Var, userArr), o2Var.getResourceProvider(), org.telegram.ui.ob0.d());
                return;
            case 20:
                org.telegram.ui.lb0.u0((org.telegram.ui.lb0) obj4, (TLObject) obj, (HashSet) obj3, (TLRPC.TL_error) obj2);
                return;
            case 21:
                EditText editText = (EditText) obj2;
                ao aoVar = (ao) obj;
                ((vd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.f80(15, editText, aoVar));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.xd0 xd0Var = (org.telegram.ui.xd0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str3 != null) {
                    bArr = AndroidUtilities.getStringBytes(str3);
                } else {
                    bArr = null;
                }
                org.telegram.ui.vd0 vd0Var = new org.telegram.ui.vd0(xd0Var, str3, str4, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xd0Var.f43579s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            vd0Var.run(null, tL_error7);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.o2) xd0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, vd0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                tL_error8.text = "PASSWORD_HASH_INVALID";
                vd0Var.run(null, tL_error8);
                return;
            case 23:
                org.telegram.ui.me0 me0Var = (org.telegram.ui.me0) obj4;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ig0 ig0Var = me0Var.f39532y;
                ig0Var.o1(false, true);
                me0Var.f39527n = false;
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str5);
                    bundle.putString("password", me0Var.h);
                    ig0Var.y1(9, true, bundle, false);
                    return;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error9.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    return;
                } else {
                    me0Var.n(true);
                    return;
                }
            case 24:
                org.telegram.ui.mf0 mf0Var = (org.telegram.ui.mf0) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj3;
                TLObject tLObject7 = (TLObject) obj;
                org.telegram.ui.ig0 ig0Var2 = mf0Var.f39562u0;
                mf0Var.f39545f0 = false;
                if (tL_error10 == null) {
                    mf0Var.f39556q0 = bundle2;
                    if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject7;
                        mf0Var.f39558r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            mf0Var.f39548i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            mf0Var.f39548i0 = 16;
                        }
                        ig0Var2.k1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject7;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        ig0Var2.y1(18, true, bundle2, true);
                    }
                } else {
                    String str6 = tL_error10.text;
                    if (str6 != null) {
                        if (str6.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error10.text.contains("PHONE_CODE_EMPTY") && !tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                                mf0Var.c(true);
                                ig0Var2.y1(0, true, null, true);
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error10.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error10.text);
                                ig0Var2.p1(string3, sb5.toString());
                            }
                        } else {
                            ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                mf0Var.y(false);
                return;
            case 25:
                org.telegram.ui.rf0.n((org.telegram.ui.rf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 26:
                c5.p pVar = (c5.p) obj3;
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj2;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.rf0) obj4).v;
                ig0Var3.e = true;
                BillingController.getInstance().addResultListener(pVar.f4780c, new org.telegram.ui.i3(u3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.qf0(u3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = ig0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.o2) ig0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                n4.s sVar = new n4.s(9, false);
                sVar.G(pVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(sVar.k()));
                return;
            case 27:
                org.telegram.ui.hg0 hg0Var = (org.telegram.ui.hg0) obj4;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj;
                String str7 = (String) obj3;
                hg0Var.M = false;
                org.telegram.ui.ig0 ig0Var4 = hg0Var.f37846a0;
                ig0Var4.z1(false, true);
                if (tL_error11 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject8;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        f5.x0(ig0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str7);
                    ig0Var4.y1(6, true, bundle3, false);
                    return;
                }
                ig0Var4.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error11.text);
                return;
            case 28:
                org.telegram.ui.vi0 vi0Var = (org.telegram.ui.vi0) obj4;
                kg.b bVar = (kg.b) obj3;
                String str8 = (String) obj2;
                org.telegram.ui.t91 t91Var = (org.telegram.ui.t91) obj;
                org.telegram.ui.yi0 yi0Var = vi0Var.v.d;
                if (bVar != null) {
                    yi0Var.v.put(str8, bVar);
                }
                if (bVar != null && !t91Var.f41931b && (i19 = t91Var.f41930a) >= 0) {
                    View m10 = yi0Var.h.m(i19);
                    if (m10 instanceof org.telegram.ui.e91) {
                        vi0Var.f36883r.e = bVar;
                        org.telegram.ui.e91 e91Var = (org.telegram.ui.e91) m10;
                        e91Var.f36879b.f14525t0.d(false, false);
                        e91Var.g(false);
                    }
                }
                vi0Var.f();
                return;
            default:
                org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                hg.a2 a2Var = fk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = fk0Var.f37368n;
                if (notificationsCustomSettingsActivity.f33510f) {
                    fk0Var.f37367f = null;
                    fk0Var.d = arrayList6;
                    fk0Var.e = arrayList7;
                    a2Var.f(arrayList8, null);
                    if (notificationsCustomSettingsActivity.f33510f && !a2Var.e()) {
                        notificationsCustomSettingsActivity.f33509c.c();
                    }
                    fk0Var.l();
                    return;
                }
                return;
        }
    }

    public j90(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27631a = i10;
        this.f27632b = obj;
        this.f27633c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public j90(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.f27631a = i10;
        this.f27632b = obj;
        this.e = tLObject;
        this.f27633c = obj2;
        this.d = tL_error;
    }

    public j90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, int i10) {
        this.f27631a = i10;
        this.f27632b = obj;
        this.d = tL_error;
        this.e = tLObject;
        this.f27633c = obj2;
    }

    public j90(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, g30 g30Var) {
        this.f27631a = 13;
        this.e = tLObject;
        this.f27632b = arrayList;
        this.f27633c = arrayList2;
        this.d = g30Var;
    }

    public j90(TLRPC.TL_error tL_error, ei.d dVar, org.telegram.ui.r6 r6Var, Runnable runnable) {
        this.f27631a = 2;
        this.d = tL_error;
        this.f27632b = dVar;
        this.f27633c = r6Var;
        this.e = runnable;
    }

    public j90(org.telegram.ui.mf0 mf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f27631a = 24;
        this.f27632b = mf0Var;
        this.d = tL_error;
        this.f27633c = bundle;
        this.e = tLObject;
    }
}
