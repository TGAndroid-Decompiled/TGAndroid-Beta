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
    public final int f27686a;
    public final Object f27687b;
    public final Object f27688c;
    public final Object d;
    public final Object e;

    public e10(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27686a = i10;
        this.f27687b = obj;
        this.f27688c = obj2;
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
        int i19 = this.f27686a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f27688c;
        Object obj4 = this.f27687b;
        switch (i19) {
            case 0:
                ((org.telegram.ui.cy) obj4).E4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new so(22, (oy) obj2, (org.telegram.ui.ActionBar.r2) obj), 200L);
                return;
            case 1:
                c40.N((c40) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                return;
            case 2:
                c90.n((c90) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                return;
            case 3:
                r90 r90Var = (r90) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                r90Var.f32179y = false;
                r90Var.L = tL_chatInviteExported.link;
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i20 = 0; i20 < tL_messages_chatInviteImporters.users.size(); i20++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    r90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    return;
                }
                return;
            case 4:
                ta0 ta0Var = (ta0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ta0Var.Q);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    ((TL_stories.StoryItem) arrayList.get(i21)).pinned = zArr[i21];
                }
                ta0Var.getMessagesController().getStoriesController().n0(ta0Var.e, arrayList, false);
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
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj4;
                cyVar.showDialog(new org.telegram.ui.m31((Context) obj2, cyVar.getResourceProvider(), new t90(11, (wo0) obj3, cyVar)));
                ((k80) obj).u();
                return;
            case 7:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) obj4;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                k80 k80Var = (k80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.u6 resourceProvider = cyVar2.getResourceProvider();
                t90 t90Var = new t90(10, (wo0) obj3, tL_sponsoredPeer);
                int i22 = org.telegram.ui.v21.f44577w;
                int currentAccount = cyVar2.getCurrentAccount();
                Activity parentActivity = cyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.li(parentActivity, resourceProvider, bArr2, cyVar2, t90Var, currentAccount));
                }
                k80Var.u();
                return;
            case 8:
                mr0.r((mr0) obj4, (AtomicReference) obj3, (tq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 9:
                cz0.H((cz0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 10:
                cz0.p((org.telegram.ui.es0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 11:
                p11 p11Var = (p11) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(p11Var.d).performLogout(0);
                    return;
                } else if (tL_error3 == null || tL_error3.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error3 != null) {
                        StringBuilder l4 = b10.l(string, "\n");
                        l4.append(tL_error3.text);
                        string = l4.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.R = string2;
                    e2Var.T = string;
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 12:
                e41 e41Var = (e41) obj4;
                ((k80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-e41Var.f27729c, ((TLRPC.TL_forumTopic) obj).f22079id, !tL_forumTopic.pinned, e41Var.h);
                return;
            case 13:
                f51.n((f51) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 14:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = v50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                v50Var.f44610a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = v50Var.f44610a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat == null) {
                    j10 = 0;
                } else {
                    j10 = chat.f22027id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = v50Var.f44653k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = v50Var.f44610a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f22037id = groupCall3.f22037id;
                call3.createNoVideoParticipant();
                c30 c30Var = v50Var.f44672p2;
                ChatObject.Call call4 = v50Var.f44610a1;
                c30Var.f27045c = call4;
                v50Var.a2.setGroupCall(call4);
                v50Var.f44668o2.f37982c = v50Var.f44610a1;
                v50Var.f44618c0.D0(accountInstance.getCurrentAccount(), v50Var.f44610a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = v50Var.f44610a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 15:
                org.telegram.ui.v50.w((org.telegram.ui.v50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
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
                            arrayList3.add(Long.valueOf(((TLRPC.User) arrayList2.get(i23)).f22176id));
                        }
                    }
                }
                i30Var.run();
                return;
            case 17:
                org.telegram.ui.c50 c50Var = (org.telegram.ui.c50) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str = (String) obj;
                org.telegram.ui.v50 v50Var2 = c50Var.f38272f;
                AccountInstance accountInstance2 = v50Var2.d;
                org.telegram.ui.o30 o30Var = v50Var2.f44612b;
                ImageLocation imageLocation = c50Var.d;
                if (imageLocation != null) {
                    o30Var.K0 = imageLocation;
                    o30Var.f31001q1 = null;
                    o30Var.f31002r1 = null;
                    c50Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22051id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && c50Var.f38271c != null) {
                        i13 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(c50Var.f38271c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c50Var.f38271c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(c50Var.f38271c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && c50Var.f38270b != null) {
                        i11 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(c50Var.f38270b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str != null) {
                        i10 = ((org.telegram.ui.ActionBar.k3) v50Var2).currentAccount;
                        new File(str).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f22176id).reset();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(c50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(c50Var.f38270b) == null) {
                        forUser2 = ImageLocation.getForLocal(c50Var.f38271c);
                    }
                    o30Var.setCreateThumbFromParent(false);
                    o30Var.H(null, forUser, forUser2, true);
                    c50Var.f38271c = null;
                    c50Var.f38270b = null;
                    AndroidUtilities.updateVisibleRows(v50Var2.Q);
                    c50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 18:
                org.telegram.ui.x60.V((org.telegram.ui.x60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 19:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj4;
                e70Var.d = (ArrayList) obj3;
                e70Var.e = (ArrayList) obj2;
                e70Var.l();
                org.telegram.ui.f70 f70Var = e70Var.f39015r;
                f70Var.f39289b.d.setVisibility(8);
                f70Var.f39289b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                f70Var.f39289b.e(false, true);
                return;
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.sz szVar = (org.telegram.ui.sz) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject5 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject5;
                    Pattern pattern2 = g5.f28420a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        tL_langPackLanguage.base_lang_code = str2.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
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
                    org.telegram.ui.ActionBar.f7.H(textView, org.telegram.ui.ActionBar.y6.f23483k5, null);
                    org.telegram.ui.ActionBar.f7.D(textView, org.telegram.ui.ActionBar.y6.f23501l5, null);
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, null);
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.sz(20, gVar, tL_error6));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.lb0 lb0Var = (org.telegram.ui.lb0) obj4;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                pr.e(r2Var.getContext(), lb0Var.f41239b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj2, true, new oy(13, lb0Var, userArr), r2Var.getResourceProvider(), org.telegram.ui.lb0.d());
                return;
            case 23:
                org.telegram.ui.ib0.v0((org.telegram.ui.ib0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                EditText editText = (EditText) obj2;
                bo boVar = (bo) obj;
                ((rd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.wb0(2, editText, boVar));
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ud0 ud0Var = (org.telegram.ui.ud0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str3 != null) {
                    bArr = AndroidUtilities.getStringBytes(str3);
                } else {
                    bArr = null;
                }
                org.telegram.ui.sd0 sd0Var = new org.telegram.ui.sd0(ud0Var, str3, str4, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ud0Var.f44108s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str3 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error7 = new TLRPC.TL_error();
                            tL_error7.text = "ALGO_INVALID";
                            sd0Var.run(null, tL_error7);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.r2) ud0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, sd0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error8 = new TLRPC.TL_error();
                tL_error8.text = "PASSWORD_HASH_INVALID";
                sd0Var.run(null, tL_error8);
                return;
            case 26:
                org.telegram.ui.je0 je0Var = (org.telegram.ui.je0) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.gg0 gg0Var = je0Var.f40584y;
                gg0Var.p1(false, true);
                je0Var.f40579n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str5);
                    bundle.putString("password", je0Var.h);
                    gg0Var.z1(9, true, bundle, false);
                    return;
                } else if (tL_error9 != null && !tL_error9.text.startsWith("CODE_INVALID")) {
                    if (tL_error9.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error9.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    return;
                } else {
                    je0Var.n(true);
                    return;
                }
            case 27:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject7 = (TLObject) obj;
                org.telegram.ui.gg0 gg0Var2 = jf0Var.f40619u0;
                jf0Var.f40602f0 = false;
                if (tL_error10 == null) {
                    jf0Var.f40613q0 = bundle2;
                    if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject7;
                        jf0Var.f40615r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            jf0Var.f40605i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            jf0Var.f40605i0 = 16;
                        }
                        gg0Var2.l1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject7;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        gg0Var2.z1(18, true, bundle2, true);
                    }
                } else {
                    String str6 = tL_error10.text;
                    if (str6 != null) {
                        if (str6.contains("PHONE_NUMBER_INVALID")) {
                            gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error10.text.contains("PHONE_CODE_EMPTY") && !tL_error10.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error10.text.contains("PHONE_CODE_EXPIRED")) {
                                jf0Var.c(true);
                                gg0Var2.z1(0, true, null, true);
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error10.text.startsWith("FLOOD_WAIT")) {
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error10.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error10.text);
                                gg0Var2.q1(string3, sb5.toString());
                            }
                        } else {
                            gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                jf0Var.y(false);
                return;
            case 28:
                org.telegram.ui.of0.n((org.telegram.ui.of0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            default:
                d5.o oVar = (d5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.gg0 gg0Var3 = ((org.telegram.ui.of0) obj4).v;
                gg0Var3.e = true;
                BillingController.getInstance().addResultListener(oVar.f8001c, new org.telegram.ui.h3(t3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.nf0(t3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = gg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.r2) gg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                rf.b bVar = new rf.b(13, false);
                bVar.R(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.E()));
                return;
        }
    }

    public e10(wo0 wo0Var, org.telegram.ui.cy cyVar, Object obj, k80 k80Var, int i10) {
        this.f27686a = i10;
        this.f27688c = wo0Var;
        this.f27687b = cyVar;
        this.d = obj;
        this.e = k80Var;
    }

    public e10(org.telegram.ui.lb0 lb0Var, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User[] userArr, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot) {
        this.f27686a = 22;
        this.f27687b = lb0Var;
        this.e = r2Var;
        this.f27688c = userArr;
        this.d = tL_requestPeerTypeCreateBot;
    }
}
