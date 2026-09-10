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
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eb1;
import org.telegram.ui.pa1;
public final class q01 implements Runnable {
    public final int f26292a;
    public final Object f26293b;
    public final Object f26294c;
    public final Object d;
    public final Object e;

    public q01(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f26292a = i10;
        this.f26293b = obj;
        this.f26294c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        org.telegram.ui.vw0.U((org.telegram.ui.vw0) this.f26293b, (TLRPC.TL_error) this.e, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.f26294c);
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
        pc Q;
        String str2;
        org.telegram.ui.vo0 vo0Var;
        org.telegram.ui.vo0 vo0Var2;
        int i22 = this.f26292a;
        long j3 = 0;
        String str3 = null;
        Object obj = this.f26294c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f26293b;
        switch (i22) {
            case 0:
                s01 s01Var = (s01) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(s01Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder g10 = w.f.g(string, "\n");
                        g10.append(tL_error.text);
                        string = g10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s01Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string2;
                    d2Var.T = string;
                    hc.b.A(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 1:
                k31 k31Var = (k31) obj4;
                ((w70) obj).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-k31Var.f24590c, ((TLRPC.TL_forumTopic) obj3).f17247id, !tL_forumTopic.pinned, k31Var.h);
                return;
            case 2:
                i41.n((i41) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 3:
                org.telegram.ui.j60 j60Var2 = (org.telegram.ui.j60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj3;
                AccountInstance accountInstance = j60Var2.d;
                ChatObject.Call call = new ChatObject.Call();
                j60Var2.f33936a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = j60Var2.f33936a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j3 = chat2.f17195id;
                }
                call2.chatId = j3;
                groupCall.schedule_date = j60Var2.f33978k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = j60Var2.f33936a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f17205id = groupCall3.f17205id;
                call3.createNoVideoParticipant();
                b30 b30Var = j60Var2.f33997p2;
                ChatObject.Call call4 = j60Var2.f33936a1;
                b30Var.f21693c = call4;
                j60Var2.a2.setGroupCall(call4);
                j60Var2.f33993o2.f35686c = j60Var2.f33936a1;
                j60Var2.f33944c0.C0(accountInstance.getCurrentAccount(), j60Var2.f33936a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = j60Var2.f33936a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 4:
                org.telegram.ui.j60.w((org.telegram.ui.j60) obj4, (HashSet) obj, (ChatObject.Call) obj2, (String) obj3);
                return;
            case 5:
                TLObject tLObject2 = (TLObject) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList arrayList2 = (ArrayList) obj;
                bi.ya yaVar = (bi.ya) obj3;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i23 = 0; i23 < Math.min(arrayList.size(), vector.objects.size()); i23++) {
                        if (vector.objects.get(i23) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i23)).f17342id));
                        }
                    }
                }
                yaVar.run();
                return;
            case 6:
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.j60 j60Var3 = q50Var.f35974f;
                AccountInstance accountInstance2 = j60Var3.d;
                org.telegram.ui.d40 d40Var = j60Var3.f33938b;
                ImageLocation imageLocation = q50Var.d;
                if (imageLocation != null) {
                    d40Var.K0 = imageLocation;
                    d40Var.f29344q1 = null;
                    d40Var.f29345r1 = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f17219id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && q50Var.f35973c != null) {
                        i13 = ((org.telegram.ui.ActionBar.h3) j60Var3).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.h3) j60Var3).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(q50Var.f35973c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(q50Var.f35973c.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(q50Var.f35973c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        j60Var = j60Var3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.h3) j60Var).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        j60Var = j60Var3;
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && q50Var.f35972b != null) {
                        i11 = ((org.telegram.ui.ActionBar.h3) j60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.h3) j60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(q50Var.f35972b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i10 = ((org.telegram.ui.ActionBar.h3) j60Var).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f17342id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(q50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(q50Var.f35972b) == null) {
                        forUser2 = ImageLocation.getForLocal(q50Var.f35973c);
                    }
                    d40Var.setCreateThumbFromParent(false);
                    d40Var.H(null, forUser, forUser2, true);
                    q50Var.f35973c = null;
                    q50Var.f35972b = null;
                    AndroidUtilities.updateVisibleRows(j60Var.Q);
                    q50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 7:
                org.telegram.ui.k70.U((org.telegram.ui.k70) obj4, (ArrayList) obj, (ArrayList) obj2, (CountDownLatch) obj3);
                return;
            case 8:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) obj4;
                r70Var.d = (ArrayList) obj;
                r70Var.e = (ArrayList) obj2;
                r70Var.l();
                org.telegram.ui.s70 s70Var = r70Var.f36253r;
                s70Var.f36567b.d.setVisibility(8);
                s70Var.f36567b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj3));
                s70Var.f36567b.e(false, true);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.h90 h90Var = (org.telegram.ui.h90) obj;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = d5.f22289a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                    if (equals) {
                        d2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new j1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        d2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        d2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new org.telegram.ui.oe(16, tL_langPackLanguage, launchActivity));
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
                        spannableStringBuilder.setSpan(new o3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18054k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18072l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(d5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error3.text);
                    launchActivity.B0(d5.N(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    d2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.h90(1, hVar, tL_error4));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.fc0 fc0Var = (org.telegram.ui.fc0) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                ir.a(p2Var.getContext(), fc0Var.f32779b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj3, true, new org.telegram.ui.pf(28, fc0Var, userArr), p2Var.getResourceProvider(), org.telegram.ui.fc0.b());
                return;
            case 12:
                org.telegram.ui.cc0.t0((org.telegram.ui.cc0) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                return;
            case 13:
                EditText editText = (EditText) obj2;
                og.x xVar = (og.x) obj3;
                ((hd0) obj4).a(0.0f);
                ((View) obj).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.h90(13, editText, xVar));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.me0 me0Var = (org.telegram.ui.me0) obj4;
                String str6 = (String) obj;
                String str7 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj3;
                if (str6 != null) {
                    bArr = AndroidUtilities.getStringBytes(str6);
                } else {
                    bArr = null;
                }
                org.telegram.ui.ke0 ke0Var = new org.telegram.ui.ke0(me0Var, str6, str7, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = me0Var.f34930s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ke0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.p2) me0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ke0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                tL_error6.text = "PASSWORD_HASH_INVALID";
                ke0Var.run(null, tL_error6);
                return;
            case 15:
                org.telegram.ui.af0 af0Var = (org.telegram.ui.af0) obj4;
                String str8 = (String) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                org.telegram.ui.xg0 xg0Var = af0Var.f30995y;
                xg0Var.k1(false, true);
                af0Var.f30990n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", af0Var.h);
                    xg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    af0Var.o(true);
                    return;
                }
            case 16:
                org.telegram.ui.zf0 zf0Var = (org.telegram.ui.zf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj;
                TLObject tLObject6 = (TLObject) obj2;
                org.telegram.ui.xg0 xg0Var2 = zf0Var.f39305s0;
                zf0Var.f39287d0 = false;
                if (tL_error8 == null) {
                    zf0Var.f39299o0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    zf0Var.f39300p0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        zf0Var.f39291g0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        zf0Var.f39291g0 = 16;
                    }
                    xg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                zf0Var.c(true);
                                xg0Var2.u1(0, true, null, true);
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                xg0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                zf0Var.z(false);
                return;
            case 17:
                org.telegram.ui.fg0.o((org.telegram.ui.fg0) obj4, (String) obj, (String) obj2, (String) obj3);
                return;
            case 18:
                c5.o oVar = (c5.o) obj;
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj2;
                org.telegram.ui.xg0 xg0Var3 = ((org.telegram.ui.fg0) obj4).v;
                xg0Var3.e = true;
                BillingController.getInstance().addResultListener(oVar.f4331c, new org.telegram.ui.i3(u3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.dg0(u3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = xg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.p2) xg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                n4.y yVar = new n4.y(7, false);
                yVar.z(oVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj3, Collections.singletonList(yVar.d()));
                return;
            case 19:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str10 = (String) obj;
                wg0Var.K = false;
                org.telegram.ui.xg0 xg0Var4 = wg0Var.V;
                xg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        d5.x0(xg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str10);
                    xg0Var4.u1(6, true, bundle3, false);
                    return;
                }
                xg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 20:
                org.telegram.ui.hj0 hj0Var = (org.telegram.ui.hj0) obj4;
                ig.b bVar = (ig.b) obj;
                String str11 = (String) obj2;
                eb1 eb1Var = (eb1) obj3;
                org.telegram.ui.kj0 kj0Var = hj0Var.v.d;
                if (bVar != null) {
                    kj0Var.v.put(str11, bVar);
                }
                if (bVar != null && !eb1Var.f32144b && (i19 = eb1Var.f32143a) >= 0) {
                    View m10 = kj0Var.h.m(i19);
                    if (m10 instanceof pa1) {
                        hj0Var.f35757r.e = bVar;
                        pa1 pa1Var = (pa1) m10;
                        pa1Var.f35753b.f9382t0.d(false, false);
                        pa1Var.g(false);
                    }
                }
                hj0Var.f();
                return;
            case 21:
                org.telegram.ui.sk0 sk0Var = (org.telegram.ui.sk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj3;
                fg.d2 d2Var4 = sk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = sk0Var.f36718n;
                if (notificationsCustomSettingsActivity.f29980f) {
                    sk0Var.f36717f = null;
                    sk0Var.d = arrayList5;
                    sk0Var.e = arrayList6;
                    d2Var4.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f29980f && !d2Var4.e()) {
                        notificationsCustomSettingsActivity.f29979c.c();
                    }
                    sk0Var.l();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj3;
                wo0Var.f38256a1 = true;
                wo0Var.f38269f1 = 1;
                wo0Var.x0((org.telegram.ui.ActionBar.f5) obj, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = wo0Var.f38259b1;
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
                if (!z13 && (vo0Var2 = wo0Var.Z0) != null) {
                    vo0Var2.a(wo0Var.f38269f1);
                }
                wo0Var.t0();
                if (z13 && (vo0Var = wo0Var.Z0) != null) {
                    vo0Var.a(wo0Var.f38269f1);
                }
                long r02 = wo0Var.r0();
                int i25 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i25 > 0) {
                    str = UserObject.getForcedFirstName(wo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i25 < 0 && (chat = wo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = wo0Var.q0();
                if (z13) {
                    if (!z11 && !z12) {
                        i20 = R.raw.stars_topup;
                    } else {
                        i20 = R.raw.stars_send;
                    }
                } else {
                    i20 = R.raw.payment_success;
                }
                int i26 = i20;
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
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, wo0Var.R0[0], wo0Var.f38280q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    wc a02 = wc.a0(U);
                    if (i25 != 0 && str12 != null && !z12) {
                        Q = a02.K(i26, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.xn0(r02, 1));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i26);
                    } else {
                        Q = a02.Q(i26, 36, replaceTags);
                    }
                    Q.f26089r = false;
                    Q.f26081j = 5000;
                    pc pcVar = Q;
                    org.telegram.ui.ou ouVar = new org.telegram.ui.ou(wo0Var, pcVar, z11, message, 3);
                    tb tbVar = pcVar.e;
                    if (tbVar != null) {
                        tbVar.setOnClickListener(ouVar);
                    }
                    pcVar.k(z12);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.wo0.d0((org.telegram.ui.wo0) obj4, (TLObject) obj2, (TLRPC.TL_error) obj3, (TL_account.getTmpPassword) obj);
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj3;
                Drawable[] drawableArr = PhotoViewer.T8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj).path);
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
                int i27 = (int) (f10 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), i27, config);
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
                    AndroidUtilities.runOnUIThread(new q01(photoViewer, photoEntry, str13, createBitmap2, 25));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ir0(photoViewer, 11));
                    return;
                }
            case 25:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
                String str14 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj3;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str14;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.f30157q5.f27403b.setLoading(false);
                org.telegram.ui.cv0 cv0Var = photoViewer2.d;
                if (cv0Var != null) {
                    cv0Var.W(photoViewer2.P4);
                }
                org.telegram.ui.ys0 ys0Var = photoViewer2.f30067g1;
                if (ys0Var != null) {
                    ys0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f21042x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ds0 ds0Var = (org.telegram.ui.ds0) obj3;
                ImageView imageView = photoViewer3.f30221x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f30221x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ds0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                TLObject tLObject8 = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj;
                TLRPC.Photo photo = (TLRPC.Photo) obj3;
                PhotoViewer photoViewer4 = ((org.telegram.ui.rs0) obj4).f36451b;
                if (tLObject8 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject8;
                    int i28 = photoViewer4.T;
                    ArrayList arrayList8 = photoViewer4.f7;
                    MessagesController.getInstance(i28).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo2.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList8.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList8.set(indexOf2, tL_photos_photo2.photo);
                        }
                        if (user3 != null) {
                            user3.photo.photo_id = tL_photos_photo2.photo.f17219id;
                            userConfig.setCurrentUser(user3);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                a();
                return;
            default:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
        }
    }

    public q01(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, int i10) {
        this.f26292a = i10;
        this.f26293b = obj;
        this.d = tLObject;
        this.f26294c = obj2;
        this.e = tLObject2;
    }

    public q01(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, int i10) {
        this.f26292a = i10;
        this.f26293b = obj;
        this.e = tL_error;
        this.d = tLObject;
        this.f26294c = obj2;
    }

    public q01(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, bi.ya yaVar) {
        this.f26292a = 5;
        this.d = tLObject;
        this.f26293b = arrayList;
        this.f26294c = arrayList2;
        this.e = yaVar;
    }

    public q01(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, org.telegram.ui.h hVar, TLRPC.TL_error tL_error) {
        this.f26292a = 10;
        this.f26294c = d2Var;
        this.d = tLObject;
        this.f26293b = hVar;
        this.e = tL_error;
    }

    public q01(org.telegram.ui.zf0 zf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f26292a = 16;
        this.f26293b = zf0Var;
        this.e = tL_error;
        this.f26294c = bundle;
        this.d = tLObject;
    }

    public q01(org.telegram.ui.wo0 wo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        this.f26292a = 23;
        this.f26293b = wo0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f26294c = gettmppassword;
    }
}
