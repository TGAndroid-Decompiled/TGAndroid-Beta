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
import org.telegram.ui.c91;
import org.telegram.ui.r91;
public final class no0 implements Runnable {
    public final int f31139a;
    public final Object f31140b;
    public final Object f31141c;
    public final Object d;
    public final Object f31142e;

    public no0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f31139a = i9;
        this.f31140b = obj;
        this.f31141c = obj2;
        this.d = obj3;
        this.f31142e = obj4;
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.VideoSize videoSize;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        int i15;
        byte[] bArr;
        int i16;
        String formatPluralString;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        String str;
        TLRPC.Chat chat;
        int i19;
        int i20;
        String formatString2;
        gc Q;
        String str2;
        org.telegram.ui.bo0 bo0Var;
        org.telegram.ui.bo0 bo0Var2;
        int i21 = this.f31139a;
        long j10 = 0;
        String str3 = null;
        Object obj = this.f31142e;
        Object obj2 = this.d;
        Object obj3 = this.f31141c;
        Object obj4 = this.f31140b;
        switch (i21) {
            case 0:
                rp0.m((rp0) obj4, (AtomicReference) obj3, (yo0) obj2, (TLRPC.Dialog) obj);
                return;
            case 1:
                cx0.E((cx0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 2:
                cx0.o((org.telegram.ui.or0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 3:
                mz0 mz0Var = (mz0) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(mz0Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder e11 = ta.b.e(string, "\n");
                        e11.append(tL_error.text);
                        string = e11.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mz0Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string2;
                    c2Var.P = string;
                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 4:
                b21 b21Var = (b21) obj4;
                ((x60) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-b21Var.f27002c, ((TLRPC.TL_forumTopic) obj).f22432id, !tL_forumTopic.pinned, b21Var.h);
                return;
            case 5:
                z21.n((z21) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 6:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = o50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                o50Var.W0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = o50Var.W0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j10 = chat2.f22380id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = o50Var.f40909g2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = o50Var.W0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f22390id = groupCall3.f22390id;
                call3.createNoVideoParticipant();
                c20 c20Var = o50Var.f40928l2;
                ChatObject.Call call4 = o50Var.W0;
                c20Var.f27349c = call4;
                o50Var.W1.setGroupCall(call4);
                o50Var.f40925k2.f43137c = o50Var.W0;
                o50Var.Y.C0(accountInstance.getCurrentAccount(), o50Var.W0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = o50Var.W0;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 7:
                org.telegram.ui.o50.w((org.telegram.ui.o50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 8:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.hr hrVar = (org.telegram.ui.hr) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i22 = 0; i22 < Math.min(arrayList.size(), vector.objects.size()); i22++) {
                        if (vector.objects.get(i22) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i22)).f22527id));
                        }
                    }
                }
                hrVar.run();
                return;
            case 9:
                org.telegram.ui.w40 w40Var = (org.telegram.ui.w40) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.o50 o50Var2 = w40Var.f43667f;
                AccountInstance accountInstance2 = o50Var2.d;
                org.telegram.ui.i30 i30Var = o50Var2.f40883b;
                ImageLocation imageLocation = w40Var.d;
                if (imageLocation != null) {
                    i30Var.G0 = imageLocation;
                    i30Var.f26806m1 = null;
                    i30Var.f26807n1 = null;
                    w40Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && w40Var.f43665c != null) {
                        i12 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize, true);
                        i13 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(w40Var.f43665c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w40Var.f43665c.volume_id);
                        sb2.append("_");
                        String l10 = aa.d.l(w40Var.f43665c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i14 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUser(i14, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && w40Var.f43664b != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i11 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        FileLoader.getInstance(i11).getPathToAttach(w40Var.f43664b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i9 = ((org.telegram.ui.ActionBar.f3) o50Var2).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i9).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f22527id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(w40Var.f43666e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(w40Var.f43664b) == null) {
                        forUser2 = ImageLocation.getForLocal(w40Var.f43665c);
                    }
                    i30Var.setCreateThumbFromParent(false);
                    i30Var.H(null, forUser, forUser2, true);
                    w40Var.f43665c = null;
                    w40Var.f43664b = null;
                    AndroidUtilities.updateVisibleRows(o50Var2.M);
                    w40Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 10:
                org.telegram.ui.r60.T((org.telegram.ui.r60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 11:
                org.telegram.ui.y60 y60Var = (org.telegram.ui.y60) obj4;
                y60Var.d = (ArrayList) obj3;
                y60Var.f44754e = (ArrayList) obj2;
                y60Var.l();
                org.telegram.ui.z60 z60Var = y60Var.f44757r;
                z60Var.f45042b.d.setVisibility(8);
                z60Var.f45042b.f28885e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                z60Var.f45042b.e(false, true);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.x20 x20Var = (org.telegram.ui.x20) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                try {
                    x20Var.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = y4.f34847a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    if (equals) {
                        c2Var2.N = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new f1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        c2Var2.N = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        c2Var2.N = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new g1(0, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i23 = indexOf + 1;
                        i15 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i23);
                        if (i15 != -1) {
                            spannableStringBuilder.delete(i15, i15 + 1);
                            spannableStringBuilder.delete(indexOf, i23);
                        }
                    } else {
                        i15 = -1;
                    }
                    if (indexOf != -1 && i15 != -1) {
                        spannableStringBuilder.setSpan(new k3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i15 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23126k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23143l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(y4.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error3.text);
                    launchActivity.B0(y4.N(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.f35493x1;
                try {
                    c2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.x20(10, hVar, tL_error4));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.kb0 kb0Var = (org.telegram.ui.kb0) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                sq.a(o2Var.getContext(), kb0Var.f39791b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.eb0(0, kb0Var, userArr), o2Var.getResourceProvider(), org.telegram.ui.kb0.b());
                return;
            case 15:
                org.telegram.ui.hb0.s0((org.telegram.ui.hb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 16:
                EditText editText = (EditText) obj2;
                fh.t4 t4Var = (fh.t4) obj;
                ((fc0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.x20(22, editText, t4Var));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.vd0 vd0Var = (org.telegram.ui.vd0) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str6 != null) {
                    bArr = AndroidUtilities.getStringBytes(str6);
                } else {
                    bArr = null;
                }
                org.telegram.ui.td0 td0Var = new org.telegram.ui.td0(vd0Var, str6, str7, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = vd0Var.f43453s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            td0Var.run(null, tL_error5);
                        }
                    }
                    i16 = ((org.telegram.ui.ActionBar.o2) vd0Var.A).currentAccount;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_auth_recoverPassword, td0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                tL_error6.text = "PASSWORD_HASH_INVALID";
                td0Var.run(null, tL_error6);
                return;
            case 18:
                org.telegram.ui.je0 je0Var = (org.telegram.ui.je0) obj4;
                String str8 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.fg0 fg0Var = je0Var.f39463y;
                fg0Var.k1(false, true);
                je0Var.f39458n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", je0Var.h);
                    fg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    je0Var.o(true);
                    return;
                }
            case 19:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.fg0 fg0Var2 = jf0Var.f39488o0;
                jf0Var.W = false;
                if (tL_error8 == null) {
                    jf0Var.f39484k0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    jf0Var.f39485l0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        jf0Var.f39474c0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        jf0Var.f39474c0 = 16;
                    }
                    fg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                jf0Var.c(true);
                                fg0Var2.u1(0, true, null, true);
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                fg0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                jf0Var.z(false);
                return;
            case 20:
                org.telegram.ui.of0.o((org.telegram.ui.of0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 21:
                n2.l lVar = (n2.l) obj3;
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) obj2;
                org.telegram.ui.fg0 fg0Var3 = ((org.telegram.ui.of0) obj4).v;
                fg0Var3.f38266e = true;
                BillingController.getInstance().addResultListener(lVar.f18335c, new org.telegram.ui.k3(w3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.nf0(w3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = fg0Var3.getParentActivity();
                i17 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i17);
                g5.b bVar = new g5.b(23);
                bVar.t(lVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.h()));
                return;
            case 22:
                org.telegram.ui.eg0 eg0Var = (org.telegram.ui.eg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str10 = (String) obj;
                eg0Var.G = false;
                org.telegram.ui.fg0 fg0Var4 = eg0Var.R;
                fg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.h0(password, true)) {
                        y4.x0(fg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str10);
                    fg0Var4.u1(6, true, bundle3, false);
                    return;
                }
                fg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 23:
                org.telegram.ui.qi0 qi0Var = (org.telegram.ui.qi0) obj4;
                rf.b bVar2 = (rf.b) obj3;
                String str11 = (String) obj2;
                r91 r91Var = (r91) obj;
                org.telegram.ui.ti0 ti0Var = qi0Var.v.d;
                if (bVar2 != null) {
                    ti0Var.v.put(str11, bVar2);
                }
                if (bVar2 != null && !r91Var.f42335b && (i18 = r91Var.f42334a) >= 0) {
                    View m10 = ti0Var.h.m(i18);
                    if (m10 instanceof c91) {
                        qi0Var.f37133r.f37872e = bVar2;
                        c91 c91Var = (c91) m10;
                        c91Var.f37128b.f46219p0.d(false, false);
                        c91Var.g(false);
                    }
                }
                qi0Var.f();
                return;
            case 24:
                org.telegram.ui.bk0 bk0Var = (org.telegram.ui.bk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                of.v1 v1Var = bk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = bk0Var.f36899n;
                if (notificationsCustomSettingsActivity.f35547f) {
                    bk0Var.f36898f = null;
                    bk0Var.d = arrayList5;
                    bk0Var.f36897e = arrayList6;
                    v1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f35547f && !v1Var.e()) {
                        notificationsCustomSettingsActivity.f35545c.c();
                    }
                    bk0Var.l();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.co0 co0Var = (org.telegram.ui.co0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                co0Var.W0 = true;
                co0Var.f37250b1 = 1;
                co0Var.w0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = co0Var.X0;
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
                if (!z13 && (bo0Var2 = co0Var.V0) != null) {
                    bo0Var2.b(co0Var.f37250b1);
                }
                co0Var.s0();
                if (z13 && (bo0Var = co0Var.V0) != null) {
                    bo0Var.b(co0Var.f37250b1);
                }
                long q02 = co0Var.q0();
                int i24 = (q02 > 0L ? 1 : (q02 == 0L ? 0 : -1));
                if (i24 > 0) {
                    str = UserObject.getForcedFirstName(co0Var.getMessagesController().getUser(Long.valueOf(q02)));
                } else {
                    str = "";
                    if (i24 < 0 && (chat = co0Var.getMessagesController().getChat(Long.valueOf(-q02))) != null) {
                        str = chat.title;
                    }
                }
                long p02 = co0Var.p0();
                if (z13) {
                    if (!z11 && !z12) {
                        i19 = R.raw.stars_topup;
                    } else {
                        i19 = R.raw.stars_send;
                    }
                } else {
                    i19 = R.raw.payment_success;
                }
                int i25 = i19;
                if (z13) {
                    if (z12) {
                        i20 = R.string.StarsGiveawaySentPopup;
                    } else if (z11) {
                        i20 = R.string.StarsGiftSentPopup;
                    } else {
                        i20 = R.string.StarsAcquired;
                    }
                    str3 = LocaleController.getString(i20);
                }
                String str12 = str3;
                if (z13) {
                    if (z12) {
                        formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) p02);
                    } else {
                        if (z11) {
                            str2 = "StarsGiftSentPopupInfo";
                        } else {
                            str2 = "StarsAcquiredInfo";
                        }
                        formatString2 = LocaleController.formatPluralStringComma(str2, (int) p02, str);
                    }
                } else {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, co0Var.N0[0], co0Var.m0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    oc a02 = oc.a0(U);
                    if (i24 != 0 && str12 != null && !z12) {
                        Q = a02.K(i25, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new gh.w9(q02, 2));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i25);
                    } else {
                        Q = a02.Q(i25, 36, replaceTags);
                    }
                    Q.f28745r = false;
                    Q.f28737j = 5000;
                    ih.t3 t3Var = new ih.t3(co0Var, Q, z11, message, 4);
                    lb lbVar = Q.f28733e;
                    if (lbVar != null) {
                        lbVar.setOnClickListener(t3Var);
                    }
                    Q.k(z12);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.co0.c0((org.telegram.ui.co0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gq0(photoViewer, 10));
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
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i26 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i26, config);
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
                    AndroidUtilities.runOnUIThread(new no0(photoViewer, photoEntry, str13, createBitmap2, 28));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gq0(photoViewer, 11));
                    return;
                }
            case 28:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str14 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str14;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.f35693m5.f32147b.setLoading(false);
                org.telegram.ui.zt0 zt0Var = photoViewer2.d;
                if (zt0Var != null) {
                    zt0Var.W(photoViewer2.L4);
                }
                org.telegram.ui.wr0 wr0Var = photoViewer2.f35599c1;
                if (wr0Var != null) {
                    wr0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.J0;
                if (!checkBox.f26297x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) obj;
                ImageView imageView = photoViewer3.f35755t3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f35755t3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.f35800y2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        br0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
