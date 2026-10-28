package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class e10 implements Runnable {
    public final int f27651a;
    public final Object f27652b;
    public final Object f27653c;
    public final Object d;
    public final Object e;

    public e10(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27651a = i10;
        this.f27652b = obj;
        this.f27653c = obj2;
        this.d = obj3;
        this.e = obj4;
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
        int i19 = this.f27651a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f27653c;
        Object obj4 = this.f27652b;
        switch (i19) {
            case 0:
                ((org.telegram.ui.ey) obj4).E4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new so(22, (oy) obj2, (org.telegram.ui.ActionBar.r2) obj), 200L);
                return;
            case 1:
                c40.N((c40) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 2:
                d90.n((d90) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 3:
                s90 s90Var = (s90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                s90Var.f32529y = false;
                s90Var.L = tL_chatInviteExported.link;
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i20 = 0; i20 < tL_messages_chatInviteImporters.users.size(); i20++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    s90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 4:
                ua0 ua0Var = (ua0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ua0Var.Q);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    ((TL_stories.StoryItem) arrayList.get(i21)).pinned = zArr[i21];
                }
                ua0Var.getMessagesController().getStoriesController().q0(ua0Var.e, arrayList, false);
                return;
            case 5:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                fi.d dVar = (fi.d) obj3;
                org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error2 != null) {
                    wc.Y().g0(tL_error2, false);
                    return;
                }
                dVar.setLoading(false);
                s6Var.dismiss();
                wc.Y().R(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                runnable.run();
                return;
            case 6:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                eyVar.showDialog(new org.telegram.ui.o31((Context) obj2, eyVar.getResourceProvider(), new u90(11, (xo0) obj3, eyVar)));
                ((l80) obj).u();
                return;
            case 7:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) obj4;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                l80 l80Var = (l80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.u6 resourceProvider = eyVar2.getResourceProvider();
                u90 u90Var = new u90(10, (xo0) obj3, tL_sponsoredPeer);
                int i22 = org.telegram.ui.x21.f45461w;
                int currentAccount = eyVar2.getCurrentAccount();
                Activity parentActivity = eyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.mi(parentActivity, resourceProvider, bArr2, eyVar2, u90Var, currentAccount));
                }
                l80Var.u();
                return;
            case 8:
                nr0.r((nr0) obj4, (AtomicReference) obj3, (uq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 9:
                dz0.H((dz0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 10:
                dz0.p((org.telegram.ui.gs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 11:
                q11 q11Var = (q11) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(q11Var.d).performLogout(0);
                    return;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error3 != null) {
                        StringBuilder l4 = b10.l(string, "\n");
                        l4.append(tL_error3.text);
                        string = l4.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string2;
                    e2Var.T = string;
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 12:
                f41 f41Var = (f41) obj4;
                ((l80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-f41Var.f28015c, ((TLRPC.TL_forumTopic) obj).f22080id, !tL_forumTopic.pinned, f41Var.h);
                return;
            case 13:
                g51.n((g51) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 14:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = x50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                x50Var.f45491a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = x50Var.f45491a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j10 = 0;
                } else {
                    j10 = chat.f22028id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = x50Var.f45534k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = x50Var.f45491a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f22038id = groupCall3.f22038id;
                call3.createNoVideoParticipant();
                c30 c30Var = x50Var.f45553p2;
                ChatObject.Call call4 = x50Var.f45491a1;
                c30Var.f27040c = call4;
                x50Var.a2.setGroupCall(call4);
                x50Var.f45549o2.f38521c = x50Var.f45491a1;
                x50Var.f45499c0.D0(accountInstance.getCurrentAccount(), x50Var.f45491a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = x50Var.f45491a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 15:
                org.telegram.ui.x50.w((org.telegram.ui.x50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 16:
                TLObject tLObject3 = (TLObject) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                i30 i30Var = (i30) obj;
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    for (int i23 = 0; i23 < Math.min(arrayList2.size(), vector.objects.size()); i23++) {
                        if (vector.objects.get(i23) instanceof TL_account.requirementToContactPremium) {
                            arrayList3.add(Long.valueOf(((TLRPC.User) arrayList2.get(i23)).f22177id));
                        }
                    }
                }
                i30Var.run();
                return;
            case 17:
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str = (String) obj;
                org.telegram.ui.x50 x50Var2 = e50Var.f38760f;
                AccountInstance accountInstance2 = x50Var2.d;
                org.telegram.ui.q30 q30Var = x50Var2.f45493b;
                ImageLocation imageLocation = e50Var.d;
                if (imageLocation != null) {
                    q30Var.K0 = imageLocation;
                    q30Var.f31310q1 = null;
                    q30Var.f31311r1 = null;
                    e50Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22052id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && e50Var.f38759c != null) {
                        i13 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(e50Var.f38759c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e50Var.f38759c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(e50Var.f38759c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && e50Var.f38758b != null) {
                        i11 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(e50Var.f38758b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str != null) {
                        i10 = ((org.telegram.ui.ActionBar.k3) x50Var2).currentAccount;
                        new File(str).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f22177id).reset();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(e50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(e50Var.f38758b) == null) {
                        forUser2 = ImageLocation.getForLocal(e50Var.f38759c);
                    }
                    q30Var.setCreateThumbFromParent(false);
                    q30Var.H(null, forUser, forUser2, true);
                    e50Var.f38759c = null;
                    e50Var.f38758b = null;
                    AndroidUtilities.updateVisibleRows(x50Var2.Q);
                    e50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 18:
                org.telegram.ui.z60.V((org.telegram.ui.z60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 19:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) obj4;
                g70Var.d = (ArrayList) obj3;
                g70Var.e = (ArrayList) obj2;
                g70Var.l();
                org.telegram.ui.h70 h70Var = g70Var.f39523r;
                h70Var.f39804b.d.setVisibility(8);
                h70Var.f39804b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                h70Var.f39804b.e(false, true);
                return;
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject5 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject5;
                    Pattern pattern2 = g5.f28387a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                    if (equals) {
                        e2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new g1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        e2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        e2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.s0(29, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i24 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i24);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i24);
                        }
                    } else {
                        i16 = -1;
                    }
                    if (indexOf != -1 && i16 != -1) {
                        spannableStringBuilder.setSpan(new r3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.f7.H(textView, org.telegram.ui.ActionBar.y6.f23484k5, null);
                    org.telegram.ui.ActionBar.f7.D(textView, org.telegram.ui.ActionBar.y6.f23502l5, null);
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.G0(alertDialog$Builder2);
                    return;
                } else if (tL_error5 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error5.text)) {
                        launchActivity.G0(g5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error5.text);
                    launchActivity.G0(g5.M(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    e2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject6 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kz(21, gVar, tL_error6));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj4;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                pr.e(r2Var.getContext(), ob0Var.f42051b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj2, true, new oy(13, ob0Var, userArr), r2Var.getResourceProvider(), org.telegram.ui.ob0.d());
                return;
            case 23:
                org.telegram.ui.lb0.v0((org.telegram.ui.lb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                EditText editText = (EditText) obj2;
                bo boVar = (bo) obj;
                ((sd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.kb0(3, editText, boVar));
                    return;
                }
                return;
            case 25:
                org.telegram.ui.wd0 wd0Var = (org.telegram.ui.wd0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str3 != null) {
                    bArr = AndroidUtilities.getStringBytes(str3);
                } else {
                    bArr = null;
                }
                org.telegram.ui.ud0 ud0Var = new org.telegram.ui.ud0(wd0Var, str3, str4, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wd0Var.f44643s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            ud0Var.run(null, tL_error7);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.r2) wd0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ud0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                tL_error8.text = "PASSWORD_HASH_INVALID";
                ud0Var.run(null, tL_error8);
                return;
            case 26:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var = le0Var.f41101y;
                ig0Var.p1(false, true);
                le0Var.f41096n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str5);
                    bundle.putString("password", le0Var.h);
                    ig0Var.z1(9, true, bundle, false);
                    return;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error9.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    return;
                } else {
                    le0Var.n(true);
                    return;
                }
            case 27:
                org.telegram.ui.lf0 lf0Var = (org.telegram.ui.lf0) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject7 = (TLObject) obj;
                org.telegram.ui.ig0 ig0Var2 = lf0Var.f41134u0;
                lf0Var.f41117f0 = false;
                if (tL_error10 == null) {
                    lf0Var.f41128q0 = bundle2;
                    if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject7;
                        lf0Var.f41130r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            lf0Var.f41120i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            lf0Var.f41120i0 = 16;
                        }
                        ig0Var2.l1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject7;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        ig0Var2.z1(18, true, bundle2, true);
                    }
                } else {
                    String str6 = tL_error10.text;
                    if (str6 != null) {
                        if (str6.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error10.text.contains("PHONE_CODE_EMPTY") && !tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                                lf0Var.c(true);
                                ig0Var2.z1(0, true, null, true);
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error10.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error10.text);
                                ig0Var2.q1(string3, sb5.toString());
                            }
                        } else {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                lf0Var.y(false);
                return;
            case 28:
                org.telegram.ui.qf0.n((org.telegram.ui.qf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            default:
                d5.o oVar = (d5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.qf0) obj4).v;
                ig0Var3.e = true;
                BillingController.getInstance().addResultListener(oVar.f8001c, new org.telegram.ui.h3(t3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.pf0(t3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = ig0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                rf.b bVar = new rf.b(13, false);
                bVar.R(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.E()));
                return;
        }
    }

    public e10(xo0 xo0Var, org.telegram.ui.ey eyVar, Object obj, l80 l80Var, int i10) {
        this.f27651a = i10;
        this.f27653c = xo0Var;
        this.f27652b = eyVar;
        this.d = obj;
        this.e = l80Var;
    }

    public e10(org.telegram.ui.ob0 ob0Var, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User[] userArr, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot) {
        this.f27651a = 22;
        this.f27652b = ob0Var;
        this.e = r2Var;
        this.f27653c = userArr;
        this.d = tL_requestPeerTypeCreateBot;
    }
}
