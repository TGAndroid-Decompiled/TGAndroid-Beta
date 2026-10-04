package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fa1;
import org.telegram.ui.ua1;
public final class bo0 implements Runnable {
    public final int f25017a;
    public final Object f25018b;
    public final Object f25019c;
    public final Object d;
    public final Object f25020e;

    public bo0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f25017a = i10;
        this.f25018b = obj;
        this.f25019c = obj2;
        this.d = obj3;
        this.f25020e = obj4;
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.h60 h60Var;
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
        boolean z10;
        boolean z11;
        String str;
        TLRPC.Chat chat;
        int i20;
        int i21;
        String formatString2;
        rc Q;
        String str2;
        org.telegram.ui.ro0 ro0Var;
        org.telegram.ui.ro0 ro0Var2;
        int i22 = this.f25017a;
        long j3 = 0;
        String str3 = null;
        Object obj = this.f25020e;
        Object obj2 = this.d;
        Object obj3 = this.f25019c;
        Object obj4 = this.f25018b;
        switch (i22) {
            case 0:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                b80 b80Var = (b80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.d6 resourceProvider = uyVar.getResourceProvider();
                yw ywVar = new yw(28, (jo0) obj4, tL_sponsoredPeer);
                int i23 = org.telegram.ui.v31.v;
                int currentAccount = uyVar.getCurrentAccount();
                Activity parentActivity = uyVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ii(parentActivity, resourceProvider, bArr2, uyVar, ywVar, currentAccount));
                }
                b80Var.u();
                return;
            case 1:
                zq0.r((zq0) obj4, (AtomicReference) obj3, (gq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 2:
                qy0.D((qy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 3:
                qy0.o((org.telegram.ui.ms0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 4:
                d11 d11Var = (d11) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(d11Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder j10 = sa.e.j(string, "\n");
                        j10.append(tL_error.text);
                        string = j10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                    b2Var.R = string2;
                    b2Var.T = string;
                    org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 5:
                v31 v31Var = (v31) obj4;
                ((b80) obj).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-v31Var.f31554c, ((TLRPC.TL_forumTopic) obj2).f20094id, !tL_forumTopic.pinned, v31Var.h);
                return;
            case 6:
                t41.n((t41) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 7:
                org.telegram.ui.h60 h60Var2 = (org.telegram.ui.h60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = h60Var2.d;
                ChatObject.Call call = new ChatObject.Call();
                h60Var2.f36879a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = h60Var2.f36879a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j3 = chat2.f20042id;
                }
                call2.chatId = j3;
                groupCall.schedule_date = h60Var2.f36922k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = h60Var2.f36879a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f20052id = groupCall3.f20052id;
                call3.createNoVideoParticipant();
                w20 w20Var = h60Var2.f36941p2;
                ChatObject.Call call4 = h60Var2.f36879a1;
                w20Var.f32449c = call4;
                h60Var2.a2.setGroupCall(call4);
                h60Var2.f36937o2.f38832c = h60Var2.f36879a1;
                h60Var2.f36887c0.D0(accountInstance.getCurrentAccount(), h60Var2.f36879a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = h60Var2.f36879a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 8:
                org.telegram.ui.h60.w((org.telegram.ui.h60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 9:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ai.m3 m3Var = (ai.m3) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i24 = 0; i24 < Math.min(arrayList.size(), vector.objects.size()); i24++) {
                        if (vector.objects.get(i24) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i24)).f20189id));
                        }
                    }
                }
                m3Var.run();
                return;
            case 10:
                org.telegram.ui.p50 p50Var = (org.telegram.ui.p50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.h60 h60Var3 = p50Var.f39351f;
                AccountInstance accountInstance2 = h60Var3.d;
                org.telegram.ui.c40 c40Var = h60Var3.f36881b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f24979q1 = null;
                    c40Var.f24980r1 = null;
                    p50Var.d = null;
                }
                if (tL_error2 == null) {
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
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    ArrayList<TLRPC.PhotoSize> arrayList3 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 800);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        videoSize = null;
                    } else {
                        videoSize = tL_photos_photo.photo.video_sizes.get(0);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20066id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && p50Var.f39349c != null) {
                        i13 = ((org.telegram.ui.ActionBar.f3) h60Var3).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.f3) h60Var3).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(p50Var.f39349c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(p50Var.f39349c.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(p50Var.f39349c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        h60Var = h60Var3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String o10 = a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.f3) h60Var).currentAccount;
                        imageLoader.replaceImageInCache(o9, o10, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        h60Var = h60Var3;
                    }
                    if (closestPhotoSizeWithSize2 != null && p50Var.f39348b != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) h60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.f3) h60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(p50Var.f39348b, true).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) h60Var).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", true));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f20189id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(p50Var.f39350e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(p50Var.f39348b) == null) {
                        forUser2 = ImageLocation.getForLocal(p50Var.f39349c);
                    }
                    c40Var.setCreateThumbFromParent(false);
                    c40Var.H(null, forUser, forUser2, true);
                    p50Var.f39349c = null;
                    p50Var.f39348b = null;
                    AndroidUtilities.updateVisibleRows(h60Var.Q);
                    p50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 11:
                org.telegram.ui.k70.S((org.telegram.ui.k70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 12:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) obj4;
                r70Var.d = (ArrayList) obj3;
                r70Var.f39945e = (ArrayList) obj2;
                r70Var.l();
                org.telegram.ui.s70 s70Var = r70Var.f39948r;
                s70Var.f40381b.d.setVisibility(8);
                s70Var.f40381b.f31201e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                s70Var.f40381b.e(false, true);
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.h90 h90Var = (org.telegram.ui.h90) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = e5.f25919a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20372a;
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
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new org.telegram.ui.o(24, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i25 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i25);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i25);
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
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20950k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20968l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20930j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(e5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error3.text);
                    launchActivity.B0(e5.N(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    b2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.h90(1, hVar, tL_error4));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.dc0 dc0Var = (org.telegram.ui.dc0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                fr.a(n2Var.getContext(), dc0Var.f35741b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.ft(5, dc0Var, userArr), n2Var.getResourceProvider(), org.telegram.ui.dc0.b());
                return;
            case 16:
                org.telegram.ui.ac0.t0((org.telegram.ui.ac0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 17:
                EditText editText = (EditText) obj2;
                tn tnVar = (tn) obj;
                ((ld0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.h90(13, editText, tnVar));
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ke0 ke0Var = (org.telegram.ui.ke0) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str6 != null) {
                    bArr = AndroidUtilities.getStringBytes(str6);
                } else {
                    bArr = null;
                }
                org.telegram.ui.ie0 ie0Var = new org.telegram.ui.ie0(ke0Var, str6, str7, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ke0Var.f37960s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ie0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.n2) ke0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ie0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                tL_error6.text = "PASSWORD_HASH_INVALID";
                ie0Var.run(null, tL_error6);
                return;
            case 19:
                org.telegram.ui.ye0 ye0Var = (org.telegram.ui.ye0) obj4;
                String str8 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.ug0 ug0Var = ye0Var.f43160y;
                ug0Var.k1(false, true);
                ye0Var.f43155n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", ye0Var.h);
                    ug0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    ye0Var.o(true);
                    return;
                }
            case 20:
                org.telegram.ui.xf0 xf0Var = (org.telegram.ui.xf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.ug0 ug0Var2 = xf0Var.f42882s0;
                xf0Var.f42863d0 = false;
                if (tL_error8 == null) {
                    xf0Var.f42876o0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    xf0Var.f42877p0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        xf0Var.f42868g0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        xf0Var.f42868g0 = 16;
                    }
                    ug0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                xf0Var.c(true);
                                ug0Var2.u1(0, true, null, true);
                                ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                ug0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                xf0Var.z(false);
                return;
            case 21:
                org.telegram.ui.dg0.o((org.telegram.ui.dg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 22:
                c5.o oVar = (c5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.ug0 ug0Var3 = ((org.telegram.ui.dg0) obj4).v;
                ug0Var3.f41207e = true;
                BillingController.getInstance().addResultListener(oVar.f4229c, new org.telegram.ui.h3(t3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.bg0(t3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = ug0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.n2) ug0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                of.b bVar = new of.b(7, false);
                bVar.O(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.i()));
                return;
            case 23:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str10 = (String) obj;
                tg0Var.K = false;
                org.telegram.ui.ug0 ug0Var4 = tg0Var.V;
                ug0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        e5.x0(ug0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str10);
                    ug0Var4.u1(6, true, bundle3, false);
                    return;
                }
                ug0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 24:
                org.telegram.ui.ej0 ej0Var = (org.telegram.ui.ej0) obj4;
                jg.b bVar2 = (jg.b) obj3;
                String str11 = (String) obj2;
                ua1 ua1Var = (ua1) obj;
                org.telegram.ui.hj0 hj0Var = ej0Var.v.d;
                if (bVar2 != null) {
                    hj0Var.v.put(str11, bVar2);
                }
                if (bVar2 != null && !ua1Var.f41145b && (i19 = ua1Var.f41144a) >= 0) {
                    View m10 = hj0Var.h.m(i19);
                    if (m10 instanceof fa1) {
                        ej0Var.f36241r.f37024e = bVar2;
                        fa1 fa1Var = (fa1) m10;
                        fa1Var.f36236b.f12145t0.d(false, false);
                        fa1Var.g(false);
                    }
                }
                ej0Var.f();
                return;
            case 25:
                org.telegram.ui.ok0 ok0Var = (org.telegram.ui.ok0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                gg.c2 c2Var = ok0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ok0Var.f39233n;
                if (notificationsCustomSettingsActivity.f33828f) {
                    ok0Var.f39232f = null;
                    ok0Var.d = arrayList5;
                    ok0Var.f39231e = arrayList6;
                    c2Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f33828f && !c2Var.e()) {
                        notificationsCustomSettingsActivity.f33826c.c();
                    }
                    ok0Var.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                so0Var.f40548a1 = true;
                so0Var.f40562f1 = 1;
                so0Var.x0((org.telegram.ui.ActionBar.c5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = so0Var.f40551b1;
                boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12 && (ro0Var2 = so0Var.Z0) != null) {
                    ro0Var2.a(so0Var.f40562f1);
                }
                so0Var.t0();
                if (z12 && (ro0Var = so0Var.Z0) != null) {
                    ro0Var.a(so0Var.f40562f1);
                }
                long r02 = so0Var.r0();
                int i26 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i26 > 0) {
                    str = UserObject.getForcedFirstName(so0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i26 < 0 && (chat = so0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = so0Var.q0();
                if (z12) {
                    if (!z10 && !z11) {
                        i20 = R.raw.stars_topup;
                    } else {
                        i20 = R.raw.stars_send;
                    }
                } else {
                    i20 = R.raw.payment_success;
                }
                int i27 = i20;
                if (z12) {
                    if (z11) {
                        i21 = R.string.StarsGiveawaySentPopup;
                    } else if (z10) {
                        i21 = R.string.StarsGiftSentPopup;
                    } else {
                        i21 = R.string.StarsAcquired;
                    }
                    str3 = LocaleController.getString(i21);
                }
                String str12 = str3;
                if (z12) {
                    if (z11) {
                        formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        if (z10) {
                            str2 = "StarsGiftSentPopupInfo";
                        } else {
                            str2 = "StarsAcquiredInfo";
                        }
                        formatString2 = LocaleController.formatPluralStringComma(str2, (int) q02, str);
                    }
                } else {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, so0Var.R0[0], so0Var.f40573q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yc a02 = yc.a0(U);
                    if (i26 != 0 && str12 != null && !z11) {
                        Q = a02.K(i27, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.tn0(r02, 1));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i27);
                    } else {
                        Q = a02.Q(i27, 36, replaceTags);
                    }
                    Q.f30353r = false;
                    Q.f30345j = 5000;
                    ai.l5 l5Var = new ai.l5(so0Var, Q, z10, message, 4);
                    vb vbVar = Q.f30341e;
                    if (vbVar != null) {
                        vbVar.setOnClickListener(l5Var);
                    }
                    Q.k(z11);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.so0.d0((org.telegram.ui.so0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dr0(photoViewer, 10));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(photoEntry.path, iArr, 0L);
                int max = Math.max(iArr[1], photoEntry.width);
                int max2 = Math.max(iArr[2], photoEntry.height);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f7 = max;
                float f10 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f7, decodeFile.getHeight() / f10);
                int i28 = (int) (f10 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), i28, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str13));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    AndroidUtilities.runOnUIThread(new bo0(photoViewer, photoEntry, str13, createBitmap2, 29));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dr0(photoViewer, 11));
                    return;
                }
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str14 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str14;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.f34009q5.f32532b.setLoading(false);
                org.telegram.ui.wu0 wu0Var = photoViewer2.d;
                if (wu0Var != null) {
                    wu0Var.W(photoViewer2.P4);
                }
                org.telegram.ui.us0 us0Var = photoViewer2.f33919g1;
                if (us0Var != null) {
                    us0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f24082x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
        }
    }

    public bo0(v31 v31Var, b80 b80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f25017a = 5;
        this.f25018b = v31Var;
        this.f25020e = b80Var;
        this.f25019c = messagesController;
        this.d = tL_forumTopic;
    }
}
