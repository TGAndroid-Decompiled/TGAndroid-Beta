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
import org.telegram.ui.ab1;
import org.telegram.ui.la1;
public final class in0 implements Runnable {
    public final int f27193a;
    public final Object f27194b;
    public final Object f27195c;
    public final Object d;
    public final Object f27196e;

    public in0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27193a = i10;
        this.f27194b = obj;
        this.f27195c = obj2;
        this.d = obj3;
        this.f27196e = obj4;
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.j60 j60Var;
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
        boolean z11;
        boolean z12;
        String str;
        TLRPC.Chat chat;
        int i20;
        int i21;
        String formatString2;
        qc Q;
        String str2;
        org.telegram.ui.wo0 wo0Var;
        org.telegram.ui.wo0 wo0Var2;
        int i22 = this.f27193a;
        long j3 = 0;
        String str3 = null;
        Object obj = this.f27196e;
        Object obj2 = this.d;
        Object obj3 = this.f27195c;
        Object obj4 = this.f27194b;
        switch (i22) {
            case 0:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                n70 n70Var = (n70) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = uyVar.getResourceProvider();
                jn0 jn0Var = new jn0(0, (rn0) obj4, tL_sponsoredPeer);
                int i23 = org.telegram.ui.e41.v;
                int currentAccount = uyVar.getCurrentAccount();
                Activity parentActivity = uyVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.hi(parentActivity, resourceProvider, bArr2, uyVar, jn0Var, currentAccount));
                }
                n70Var.u();
                return;
            case 1:
                hq0.m((hq0) obj4, (AtomicReference) obj3, (op0) obj2, (TLRPC.Dialog) obj);
                return;
            case 2:
                ux0.F((ux0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 3:
                ux0.o((org.telegram.ui.qs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 4:
                e01 e01Var = (e01) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(e01Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder g10 = w.f.g(string, "\n");
                        g10.append(tL_error.text);
                        string = g10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e01Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.R = string2;
                    b2Var.T = string;
                    i2.g.B(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 5:
                w21 w21Var = (w21) obj4;
                ((n70) obj).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-w21Var.f32095c, ((TLRPC.TL_forumTopic) obj2).f19921id, !tL_forumTopic.pinned, w21Var.h);
                return;
            case 6:
                u31.n((u31) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 7:
                org.telegram.ui.j60 j60Var2 = (org.telegram.ui.j60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = j60Var2.d;
                ChatObject.Call call = new ChatObject.Call();
                j60Var2.f37513a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = j60Var2.f37513a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j3 = chat2.f19869id;
                }
                call2.chatId = j3;
                groupCall.schedule_date = j60Var2.f37556k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = j60Var2.f37513a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f19879id = groupCall3.f19879id;
                call3.createNoVideoParticipant();
                s20 s20Var = j60Var2.f37575p2;
                ChatObject.Call call4 = j60Var2.f37513a1;
                s20Var.f30170c = call4;
                j60Var2.a2.setGroupCall(call4);
                j60Var2.f37571o2.f39410c = j60Var2.f37513a1;
                j60Var2.f37521c0.C0(accountInstance.getCurrentAccount(), j60Var2.f37513a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = j60Var2.f37513a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 8:
                org.telegram.ui.j60.w((org.telegram.ui.j60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 9:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                bi.z2 z2Var = (bi.z2) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i24 = 0; i24 < Math.min(arrayList.size(), vector.objects.size()); i24++) {
                        if (vector.objects.get(i24) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i24)).f20016id));
                        }
                    }
                }
                z2Var.run();
                return;
            case 10:
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.j60 j60Var3 = q50Var.f39735f;
                AccountInstance accountInstance2 = j60Var3.d;
                org.telegram.ui.c40 c40Var = j60Var3.f37515b;
                ImageLocation imageLocation = q50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f29069q1 = null;
                    c40Var.f29070r1 = null;
                    q50Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19893id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && q50Var.f39733c != null) {
                        i13 = ((org.telegram.ui.ActionBar.f3) j60Var3).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.f3) j60Var3).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(q50Var.f39733c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(q50Var.f39733c.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(q50Var.f39733c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        j60Var = j60Var3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.f3) j60Var).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        j60Var = j60Var3;
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && q50Var.f39732b != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) j60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.f3) j60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(q50Var.f39732b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) j60Var).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f20016id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(q50Var.f39734e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(q50Var.f39732b) == null) {
                        forUser2 = ImageLocation.getForLocal(q50Var.f39733c);
                    }
                    c40Var.setCreateThumbFromParent(false);
                    c40Var.H(null, forUser, forUser2, true);
                    q50Var.f39733c = null;
                    q50Var.f39732b = null;
                    AndroidUtilities.updateVisibleRows(j60Var.Q);
                    q50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 11:
                org.telegram.ui.l70.U((org.telegram.ui.l70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 12:
                org.telegram.ui.t70 t70Var = (org.telegram.ui.t70) obj4;
                t70Var.d = (ArrayList) obj3;
                t70Var.f40644e = (ArrayList) obj2;
                t70Var.l();
                org.telegram.ui.u70 u70Var = t70Var.f40647r;
                u70Var.f40955b.d.setVisibility(8);
                u70Var.f40955b.f32755e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                u70Var.f40955b.e(false, true);
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.r80 r80Var = (org.telegram.ui.r80) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = e5.f25557a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                    if (equals) {
                        b2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new i1(launchActivity, 0));
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
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new org.telegram.ui.m4(21, tL_langPackLanguage, launchActivity));
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
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20790k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20808l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(e5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb4);
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r80(4, hVar, tL_error4));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.fc0 fc0Var = (org.telegram.ui.fc0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                br.a(n2Var.getContext(), fc0Var.f36368b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.nf(28, fc0Var, userArr), n2Var.getResourceProvider(), org.telegram.ui.fc0.b());
                return;
            case 16:
                org.telegram.ui.cc0.t0((org.telegram.ui.cc0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 17:
                EditText editText = (EditText) obj2;
                pn pnVar = (pn) obj;
                ((zc0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.r80(16, editText, pnVar));
                    return;
                }
                return;
            case 18:
                org.telegram.ui.me0 me0Var = (org.telegram.ui.me0) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str6 != null) {
                    bArr = AndroidUtilities.getStringBytes(str6);
                } else {
                    bArr = null;
                }
                org.telegram.ui.ke0 ke0Var = new org.telegram.ui.ke0(me0Var, str6, str7, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = me0Var.f38685s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ke0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.n2) me0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ke0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                tL_error6.text = "PASSWORD_HASH_INVALID";
                ke0Var.run(null, tL_error6);
                return;
            case 19:
                org.telegram.ui.af0 af0Var = (org.telegram.ui.af0) obj4;
                String str8 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.wg0 wg0Var = af0Var.f34409y;
                wg0Var.k1(false, true);
                af0Var.f34404n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", af0Var.h);
                    wg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    af0Var.o(true);
                    return;
                }
            case 20:
                org.telegram.ui.zf0 zf0Var = (org.telegram.ui.zf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.wg0 wg0Var2 = zf0Var.f43421s0;
                zf0Var.f43402d0 = false;
                if (tL_error8 == null) {
                    zf0Var.f43415o0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    zf0Var.f43416p0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        zf0Var.f43407g0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        zf0Var.f43407g0 = 16;
                    }
                    wg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                zf0Var.c(true);
                                wg0Var2.u1(0, true, null, true);
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                wg0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                zf0Var.z(false);
                return;
            case 21:
                org.telegram.ui.fg0.o((org.telegram.ui.fg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 22:
                c5.o oVar = (c5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.wg0 wg0Var3 = ((org.telegram.ui.fg0) obj4).v;
                wg0Var3.f42366e = true;
                BillingController.getInstance().addResultListener(oVar.f4422c, new org.telegram.ui.h3(t3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.dg0(t3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = wg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.n2) wg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                pf.b bVar = new pf.b(7, false);
                bVar.h0(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.w()));
                return;
            case 23:
                org.telegram.ui.vg0 vg0Var = (org.telegram.ui.vg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str10 = (String) obj;
                vg0Var.K = false;
                org.telegram.ui.wg0 wg0Var4 = vg0Var.V;
                wg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        e5.x0(wg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str10);
                    wg0Var4.u1(6, true, bundle3, false);
                    return;
                }
                wg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 24:
                org.telegram.ui.ij0 ij0Var = (org.telegram.ui.ij0) obj4;
                kg.b bVar2 = (kg.b) obj3;
                String str11 = (String) obj2;
                ab1 ab1Var = (ab1) obj;
                org.telegram.ui.lj0 lj0Var = ij0Var.v.d;
                if (bVar2 != null) {
                    lj0Var.v.put(str11, bVar2);
                }
                if (bVar2 != null && !ab1Var.f34377b && (i19 = ab1Var.f34376a) >= 0) {
                    View m10 = lj0Var.h.m(i19);
                    if (m10 instanceof la1) {
                        ij0Var.f38257r.f38897e = bVar2;
                        la1 la1Var = (la1) m10;
                        la1Var.f38252b.f13690t0.d(false, false);
                        la1Var.g(false);
                    }
                }
                ij0Var.f();
                return;
            case 25:
                org.telegram.ui.tk0 tk0Var = (org.telegram.ui.tk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                hg.b2 b2Var4 = tk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = tk0Var.f40790n;
                if (notificationsCustomSettingsActivity.f33477f) {
                    tk0Var.f40789f = null;
                    tk0Var.d = arrayList5;
                    tk0Var.f40788e = arrayList6;
                    b2Var4.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f33477f && !b2Var4.e()) {
                        notificationsCustomSettingsActivity.f33475c.c();
                    }
                    tk0Var.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.xo0 xo0Var = (org.telegram.ui.xo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                xo0Var.f42807a1 = true;
                xo0Var.f42821f1 = 1;
                xo0Var.x0((org.telegram.ui.ActionBar.d5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = xo0Var.f42810b1;
                boolean z13 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z13 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z13 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13 && (wo0Var2 = xo0Var.Z0) != null) {
                    wo0Var2.a(xo0Var.f42821f1);
                }
                xo0Var.t0();
                if (z13 && (wo0Var = xo0Var.Z0) != null) {
                    wo0Var.a(xo0Var.f42821f1);
                }
                long r02 = xo0Var.r0();
                int i26 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i26 > 0) {
                    str = UserObject.getForcedFirstName(xo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i26 < 0 && (chat = xo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = xo0Var.q0();
                if (z13) {
                    if (!z11 && !z12) {
                        i20 = R.raw.stars_topup;
                    } else {
                        i20 = R.raw.stars_send;
                    }
                } else {
                    i20 = R.raw.payment_success;
                }
                int i27 = i20;
                if (z13) {
                    if (z12) {
                        i21 = R.string.StarsGiveawaySentPopup;
                    } else if (z11) {
                        i21 = R.string.StarsGiftSentPopup;
                    } else {
                        i21 = R.string.StarsAcquired;
                    }
                    str3 = LocaleController.getString(i21);
                }
                String str12 = str3;
                if (z13) {
                    if (z12) {
                        formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        if (z11) {
                            str2 = "StarsGiftSentPopupInfo";
                        } else {
                            str2 = "StarsAcquiredInfo";
                        }
                        formatString2 = LocaleController.formatPluralStringComma(str2, (int) q02, str);
                    }
                } else {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, xo0Var.R0[0], xo0Var.f42832q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    yc a02 = yc.a0(U);
                    if (i26 != 0 && str12 != null && !z12) {
                        Q = a02.K(i27, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.yn0(r02, 1));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i27);
                    } else {
                        Q = a02.Q(i27, 36, replaceTags);
                    }
                    Q.f29687r = false;
                    Q.f29679j = 5000;
                    qc qcVar = Q;
                    bi.w4 w4Var = new bi.w4(xo0Var, qcVar, z11, message, 4);
                    ub ubVar = qcVar.f29675e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(w4Var);
                    }
                    qcVar.k(z12);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.xo0.d0((org.telegram.ui.xo0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ir0(photoViewer, 10));
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
                    AndroidUtilities.runOnUIThread(new in0(photoViewer, photoEntry, str13, createBitmap2, 29));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ir0(photoViewer, 11));
                    return;
                }
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str14 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.T8;
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
                photoViewer2.f33657q5.f27815b.setLoading(false);
                org.telegram.ui.av0 av0Var = photoViewer2.d;
                if (av0Var != null) {
                    av0Var.W(photoViewer2.P4);
                }
                org.telegram.ui.ys0 ys0Var = photoViewer2.f33567g1;
                if (ys0Var != null) {
                    ys0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f23891x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
        }
    }

    public in0(w21 w21Var, n70 n70Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f27193a = 5;
        this.f27194b = w21Var;
        this.f27196e = n70Var;
        this.f27195c = messagesController;
        this.d = tL_forumTopic;
    }
}
