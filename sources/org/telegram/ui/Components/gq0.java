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
import org.telegram.ui.gb1;
import org.telegram.ui.ra1;
public final class gq0 implements Runnable {
    public final int f25401a;
    public final Object f25402b;
    public final Object f25403c;
    public final Object d;
    public final Object e;

    public gq0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f25401a = i10;
        this.f25402b = obj;
        this.f25403c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        PhotoViewer photoViewer = (PhotoViewer) this.f25402b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f25403c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.U8;
        if (photoEntry.coverPath != null) {
            try {
                new File(photoEntry.coverPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        photoEntry.coverSavedPosition = -1L;
        photoEntry.coverPath = str;
        photoEntry.coverPhoto = null;
        photoEntry.coverPhotoParentObject = null;
        photoViewer.f32335q5.f26354b.setLoading(false);
        org.telegram.ui.iv0 iv0Var = photoViewer.d;
        if (iv0Var != null) {
            iv0Var.W(photoViewer.P4);
        }
        org.telegram.ui.gt0 gt0Var = photoViewer.f32244g1;
        if (gt0Var != null) {
            gt0Var.setImage(bitmap);
        }
        photoViewer.e3(0);
        CheckBox checkBox = photoViewer.N0;
        if (!checkBox.f23077x) {
            checkBox.callOnClick();
        }
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
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
        boolean z11;
        boolean z12;
        String str;
        TLRPC.Chat chat;
        int i20;
        int i21;
        String string;
        String formatString2;
        sc Q;
        String str2;
        org.telegram.ui.bp0 bp0Var;
        org.telegram.ui.bp0 bp0Var2;
        int i22 = this.f25401a;
        long j10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f25403c;
        Object obj4 = this.f25402b;
        switch (i22) {
            case 0:
                jr0.n((jr0) obj4, (AtomicReference) obj3, (qq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 1:
                ty0.G((ty0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 2:
                ty0.q((org.telegram.ui.ys0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 3:
                g11 g11Var = (g11) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(g11Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder i23 = t8.b.i(string2, "\n");
                        i23.append(tL_error.text);
                        string2 = i23.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = string3;
                    a2Var.T = string2;
                    org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 4:
                y31 y31Var = (y31) obj4;
                ((m80) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-y31Var.f31474c, ((TLRPC.TL_forumTopic) obj).f19268id, !tL_forumTopic.pinned, y31Var.h);
                return;
            case 5:
                x41.o((x41) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 6:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = n60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                n60Var.f38442a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = n60Var.f38442a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j10 = chat2.f19216id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = n60Var.f38485k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = n60Var.f38442a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f19226id = groupCall3.f19226id;
                call3.createNoVideoParticipant();
                f30 f30Var = n60Var.f38504p2;
                ChatObject.Call call4 = n60Var.f38442a1;
                f30Var.f24873c = call4;
                n60Var.a2.setGroupCall(call4);
                n60Var.f38500o2.f39974c = n60Var.f38442a1;
                n60Var.f38450c0.C0(accountInstance.getCurrentAccount(), n60Var.f38442a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = n60Var.f38442a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 7:
                org.telegram.ui.n60.y((org.telegram.ui.n60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 8:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                bi.c3 c3Var = (bi.c3) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i24 = 0; i24 < Math.min(arrayList.size(), vector.objects.size()); i24++) {
                        if (vector.objects.get(i24) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i24)).f19363id));
                        }
                    }
                }
                c3Var.run();
                return;
            case 9:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.n60 n60Var2 = u50Var.f40543f;
                AccountInstance accountInstance2 = n60Var2.d;
                org.telegram.ui.g40 g40Var = n60Var2.f38444b;
                ImageLocation imageLocation = u50Var.d;
                if (imageLocation != null) {
                    g40Var.K0 = imageLocation;
                    g40Var.f28334q1 = null;
                    g40Var.f28335r1 = null;
                    u50Var.d = null;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19240id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && u50Var.f40542c != null) {
                        i13 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(u50Var.f40542c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(u50Var.f40542c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(u50Var.f40542c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        z10 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && u50Var.f40541b != null) {
                        i11 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(u50Var.f40541b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str3 != null) {
                        i10 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        new File(str3).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.f19363id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(u50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(u50Var.f40541b) == null) {
                        forUser2 = ImageLocation.getForLocal(u50Var.f40542c);
                    }
                    g40Var.setCreateThumbFromParent(false);
                    g40Var.H(null, forUser, forUser2, true);
                    u50Var.f40542c = null;
                    u50Var.f40541b = null;
                    AndroidUtilities.updateVisibleRows(n60Var2.Q);
                    u50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                return;
            case 10:
                org.telegram.ui.p70.U((org.telegram.ui.p70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 11:
                org.telegram.ui.x70 x70Var = (org.telegram.ui.x70) obj4;
                x70Var.d = (ArrayList) obj3;
                x70Var.e = (ArrayList) obj2;
                x70Var.l();
                org.telegram.ui.y70 y70Var = x70Var.f41770r;
                y70Var.f42058b.d.setVisibility(8);
                y70Var.f42058b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                y70Var.f42058b.e(false, true);
                return;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.o00 o00Var = (org.telegram.ui.o00) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    o00Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = g5.f25184a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str4 = tL_langPackLanguage.base_lang_code;
                    if (str4 != null) {
                        tL_langPackLanguage.base_lang_code = str4.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    if (equals) {
                        a2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new h1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        a2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        a2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.z0(26, tL_langPackLanguage, launchActivity));
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
                        spannableStringBuilder.setSpan(new r3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20027k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20044l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(g5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error3.text);
                    launchActivity.B0(g5.M(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    a2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.o00(20, hVar, tL_error4));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.jc0 jc0Var = (org.telegram.ui.jc0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                qr.e(m2Var.getContext(), jc0Var.f37344b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.mt(5, jc0Var, userArr), m2Var.getResourceProvider(), org.telegram.ui.jc0.d());
                return;
            case 15:
                org.telegram.ui.gc0.t0((org.telegram.ui.gc0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 16:
                EditText editText = (EditText) obj2;
                eo eoVar = (eo) obj;
                ((yd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.wc0(2, editText, eoVar));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.re0 re0Var = (org.telegram.ui.re0) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str5 != null) {
                    bArr = AndroidUtilities.getStringBytes(str5);
                } else {
                    bArr = null;
                }
                org.telegram.ui.pe0 pe0Var = new org.telegram.ui.pe0(re0Var, str5, str6, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = re0Var.f39779s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str5 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            pe0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.m2) re0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, pe0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                tL_error6.text = "PASSWORD_HASH_INVALID";
                pe0Var.run(null, tL_error6);
                return;
            case 18:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) obj4;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.bh0 bh0Var = ff0Var.f35822y;
                bh0Var.k1(false, true);
                ff0Var.f35817n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str7);
                    bundle.putString("password", ff0Var.h);
                    bh0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    ff0Var.o(true);
                    return;
                }
            case 19:
                org.telegram.ui.eg0 eg0Var = (org.telegram.ui.eg0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.bh0 bh0Var2 = eg0Var.f35566s0;
                eg0Var.f35548d0 = false;
                if (tL_error8 == null) {
                    eg0Var.f35560o0 = bundle2;
                    if (tLObject6 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                        eg0Var.f35561p0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            eg0Var.f35552g0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            eg0Var.f35552g0 = 16;
                        }
                        bh0Var2.g1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject6;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        bh0Var2.u1(18, true, bundle2, true);
                    }
                } else {
                    String str8 = tL_error8.text;
                    if (str8 != null) {
                        if (str8.contains("PHONE_NUMBER_INVALID")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                eg0Var.c(true);
                                bh0Var2.u1(0, true, null, true);
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string4 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                bh0Var2.l1(string4, sb5.toString());
                            }
                        } else {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                eg0Var.z(false);
                return;
            case 20:
                org.telegram.ui.kg0.o((org.telegram.ui.kg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 21:
                c5.p pVar = (c5.p) obj3;
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj2;
                org.telegram.ui.bh0 bh0Var3 = ((org.telegram.ui.kg0) obj4).v;
                bh0Var3.e = true;
                BillingController.getInstance().addResultListener(pVar.f4404c, new org.telegram.ui.j3(v3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.ig0(v3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = bh0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.m2) bh0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                qf.b bVar = new qf.b(9);
                bVar.e0(pVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.w()));
                return;
            case 22:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str9 = (String) obj;
                ah0Var.K = false;
                org.telegram.ui.bh0 bh0Var4 = ah0Var.V;
                bh0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        g5.w0(bh0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str9);
                    bh0Var4.u1(6, true, bundle3, false);
                    return;
                }
                bh0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 23:
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) obj4;
                kg.b bVar2 = (kg.b) obj3;
                String str10 = (String) obj2;
                gb1 gb1Var = (gb1) obj;
                org.telegram.ui.qj0 qj0Var = nj0Var.v.d;
                if (bVar2 != null) {
                    qj0Var.v.put(str10, bVar2);
                }
                if (bVar2 != null && !gb1Var.f36371b && (i19 = gb1Var.f36370a) >= 0) {
                    View m10 = qj0Var.h.m(i19);
                    if (m10 instanceof ra1) {
                        nj0Var.f39723r.e = bVar2;
                        ra1 ra1Var = (ra1) m10;
                        ra1Var.f39719b.f13064t0.d(false, false);
                        ra1Var.g(false);
                    }
                }
                nj0Var.f();
                return;
            case 24:
                org.telegram.ui.wk0 wk0Var = (org.telegram.ui.wk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                hg.a2 a2Var4 = wk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = wk0Var.f41614n;
                if (notificationsCustomSettingsActivity.f32156f) {
                    wk0Var.f41613f = null;
                    wk0Var.d = arrayList5;
                    wk0Var.e = arrayList6;
                    a2Var4.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f32156f && !a2Var4.e()) {
                        notificationsCustomSettingsActivity.f32155c.c();
                    }
                    wk0Var.l();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                cp0Var.f34997a1 = true;
                cp0Var.f35010f1 = 1;
                cp0Var.x0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = cp0Var.f35000b1;
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
                if (!z13 && (bp0Var2 = cp0Var.Z0) != null) {
                    bp0Var2.a(cp0Var.f35010f1);
                }
                cp0Var.t0();
                if (z13 && (bp0Var = cp0Var.Z0) != null) {
                    bp0Var.a(cp0Var.f35010f1);
                }
                long r02 = cp0Var.r0();
                int i26 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i26 > 0) {
                    str = UserObject.getForcedFirstName(cp0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i26 < 0 && (chat = cp0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = cp0Var.q0();
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
                if (!z13) {
                    string = null;
                } else {
                    if (z12) {
                        i21 = R.string.StarsGiveawaySentPopup;
                    } else if (z11) {
                        i21 = R.string.StarsGiftSentPopup;
                    } else {
                        i21 = R.string.StarsAcquired;
                    }
                    string = LocaleController.getString(i21);
                }
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
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, cp0Var.R0[0], cp0Var.f35021q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    zc a02 = zc.a0(U);
                    if (i26 != 0 && string != null && !z12) {
                        Q = a02.K(i27, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.do0(r02, 1));
                    } else {
                        String str11 = string;
                        if (str11 != null) {
                            Q = a02.M(str11, replaceTags, i27);
                        } else {
                            Q = a02.Q(i27, 36, replaceTags);
                        }
                    }
                    Q.f29110r = false;
                    Q.f29102j = 5000;
                    bi.y4 y4Var = new bi.y4(cp0Var, Q, z11, message, 4);
                    wb wbVar = Q.e;
                    if (wbVar != null) {
                        wbVar.setOnClickListener(y4Var);
                    }
                    Q.k(z12);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.cp0.d0((org.telegram.ui.cp0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str12 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.or0(photoViewer, 10));
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
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str12));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    AndroidUtilities.runOnUIThread(new gq0(photoViewer, photoEntry, str12, createBitmap2, 28));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.or0(photoViewer, 11));
                    return;
                }
            case 28:
                a();
                return;
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ls0 ls0Var = (org.telegram.ui.ls0) obj;
                ImageView imageView = photoViewer2.f32399x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer2.f32399x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ls0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
