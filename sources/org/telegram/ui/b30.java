package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
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
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class b30 implements Runnable {
    public final int f35311a;
    public final Object f35312b;
    public final Object f35313c;
    public final Object d;
    public final Object f35314e;

    public b30(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35311a = i10;
        this.f35312b = obj;
        this.f35313c = obj2;
        this.d = obj3;
        this.f35314e = obj4;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f35313c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.f35314e;
        if (!(((TLObject) this.f35312b) instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            org.telegram.ui.Components.qc.a0(profileActivity).d0(tL_error, false);
        }
        if (profileActivity.f34642l4 == iArr[0]) {
            profileActivity.f34642l4 = 0;
        }
    }

    private final void b() {
        TLObject chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f35313c;
        TLObject tLObject = (TLObject) this.f35312b;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35314e;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            if (profileActivity.f34569b1 != 0) {
                chat = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
            } else {
                chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f34577c1));
            }
            e20.a(profileActivity.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.f34714w0);
            return;
        }
        org.telegram.ui.Components.qc.b0(tL_error);
    }

    @Override
    public final void run() {
        TLRPC.VideoSize videoSize;
        d60 d60Var;
        boolean z4;
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
        TLRPC.Chat chat;
        int i20;
        int i21;
        String string;
        String formatString2;
        org.telegram.ui.Components.ic Q;
        String str;
        ko0 ko0Var;
        ko0 ko0Var2;
        Uri fromFile;
        int i22 = this.f35311a;
        String str2 = "";
        Object obj = this.f35314e;
        Object obj2 = this.d;
        Object obj3 = this.f35313c;
        Object obj4 = this.f35312b;
        switch (i22) {
            case 0:
                TLObject tLObject = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.Components.ky0 ky0Var = (org.telegram.ui.Components.ky0) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i23 = 0; i23 < Math.min(arrayList.size(), vector.objects.size()); i23++) {
                        if (vector.objects.get(i23) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i23)).f20990id));
                        }
                    }
                }
                ky0Var.run();
                return;
            case 1:
                l50 l50Var = (l50) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj4;
                String str3 = (String) obj;
                d60 d60Var2 = l50Var.f38644f;
                AccountInstance accountInstance = d60Var2.d;
                y30 y30Var = d60Var2.f36014b;
                ImageLocation imageLocation = l50Var.d;
                if (imageLocation != null) {
                    y30Var.H0 = imageLocation;
                    y30Var.f33095n1 = null;
                    y30Var.f33096o1 = null;
                    l50Var.d = null;
                }
                if (tL_error == null) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        accountInstance.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20867id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && l50Var.f38642c != null) {
                        i13 = ((org.telegram.ui.ActionBar.h3) d60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.h3) d60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(l50Var.f38642c, true).renameTo(pathToAttach);
                        StringBuilder sb = new StringBuilder();
                        sb.append(l50Var.f38642c.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(l50Var.f38642c.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        d60Var = d60Var2;
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String m10 = android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.h3) d60Var).currentAccount;
                        z4 = true;
                        imageLoader.replaceImageInCache(m9, m10, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        d60Var = d60Var2;
                        z4 = true;
                    }
                    if (closestPhotoSizeWithSize2 != null && l50Var.f38641b != null) {
                        i11 = ((org.telegram.ui.ActionBar.h3) d60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z4);
                        i12 = ((org.telegram.ui.ActionBar.h3) d60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(l50Var.f38641b, z4).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str3 != null) {
                        i10 = ((org.telegram.ui.ActionBar.h3) d60Var).currentAccount;
                        new File(str3).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z4));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.f20990id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(l50Var.f38643e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(l50Var.f38641b) == null) {
                        forUser2 = ImageLocation.getForLocal(l50Var.f38642c);
                    }
                    y30Var.setCreateThumbFromParent(false);
                    y30Var.H(null, forUser, forUser2, true);
                    l50Var.f38642c = null;
                    l50Var.f38641b = null;
                    AndroidUtilities.updateVisibleRows(d60Var.N);
                    l50Var.a(1.0f);
                }
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance.getUserConfig().saveConfig(true);
                return;
            case 2:
                f70.U((f70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 3:
                m70 m70Var = (m70) obj4;
                m70Var.d = (ArrayList) obj3;
                m70Var.f38986e = (ArrayList) obj2;
                m70Var.l();
                n70 n70Var = m70Var.f38989r;
                n70Var.f39332b.d.setVisibility(8);
                n70Var.f39332b.f25364e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                n70Var.f39332b.e(false, true);
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                v10 v10Var = (v10) obj2;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    v10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tLObject3 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject3;
                    Pattern pattern2 = org.telegram.ui.Components.z4.f33718a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str4 = tL_langPackLanguage.base_lang_code;
                    if (str4 != null) {
                        tL_langPackLanguage.base_lang_code = str4.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    if (equals) {
                        d2Var.O = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.i(LocaleController.getString(R.string.SETTINGS), new org.telegram.ui.Components.g1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        d2Var.O = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        d2Var.O = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new ng.w(29, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l3(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21784k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21802l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
                    alertDialog$Builder.n(textView);
                    launchActivity.B0(alertDialog$Builder);
                    return;
                } else if (tL_error2 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error2.text)) {
                        launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(tL_error2.text);
                    launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, sb3.toString()));
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj3;
                TLObject tLObject4 = (TLObject) obj4;
                i iVar = (i) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.f34134y1;
                try {
                    d2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject4 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new v10(15, iVar, tL_error3));
                    return;
                }
                return;
            case 6:
                xb0 xb0Var = (xb0) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.cr.a(p2Var.getContext(), xb0Var.f43022b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.Components.xk(15, xb0Var, userArr), p2Var.getResourceProvider(), xb0.b());
                return;
            case 7:
                ub0.t0((ub0) obj3, (TLObject) obj4, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 8:
                EditText editText = (EditText) obj2;
                dg.b0 b0Var = (dg.b0) obj;
                ((org.telegram.ui.Components.cd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new v10(27, editText, b0Var));
                    return;
                }
                return;
            case 9:
                ee0 ee0Var = (ee0) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str5 != null) {
                    bArr = AndroidUtilities.getStringBytes(str5);
                } else {
                    bArr = null;
                }
                de0 de0Var = new de0(ee0Var, str5, str6, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ee0Var.f36565s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str5 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                            tL_error4.text = "ALGO_INVALID";
                            de0Var.run(null, tL_error4);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.p2) ee0Var.B).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, de0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                tL_error5.text = "PASSWORD_HASH_INVALID";
                de0Var.run(null, tL_error5);
                return;
            case 10:
                te0 te0Var = (te0) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                og0 og0Var = te0Var.f41596y;
                og0Var.k1(false, true);
                te0Var.f41591n = false;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str7);
                    bundle.putString("password", te0Var.h);
                    og0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                    return;
                } else {
                    te0Var.o(true);
                    return;
                }
            case 11:
                sf0 sf0Var = (sf0) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj;
                TLObject tLObject5 = (TLObject) obj4;
                og0 og0Var2 = sf0Var.f41271p0;
                sf0Var.f41252a0 = false;
                if (tL_error7 == null) {
                    sf0Var.f41267l0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject5;
                    sf0Var.m0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        sf0Var.f41257d0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        sf0Var.f41257d0 = 16;
                    }
                    og0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str8 = tL_error7.text;
                    if (str8 != null) {
                        if (str8.contains("PHONE_NUMBER_INVALID")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                sf0Var.c(true);
                                og0Var2.u1(0, true, null, true);
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error7.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb4 = new StringBuilder();
                                b.i(R.string.ErrorOccurred, "\n", sb4);
                                sb4.append(tL_error7.text);
                                og0Var2.l1(string2, sb4.toString());
                            }
                        } else {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                sf0Var.z(false);
                return;
            case 12:
                xf0.o((xf0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 13:
                p2.m mVar = (p2.m) obj3;
                w3 w3Var = (w3) obj2;
                og0 og0Var3 = ((xf0) obj4).v;
                og0Var3.f39757e = true;
                BillingController.getInstance().addResultListener(mVar.f44161c, new j3(w3Var, 3));
                BillingController.getInstance().setOnCanceled(new wf0(w3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = og0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.p2) og0Var3).currentAccount;
                AccountInstance accountInstance2 = AccountInstance.getInstance(i18);
                n7.qa qaVar = new n7.qa(23);
                qaVar.i1(mVar);
                billingController.launchBillingFlow(parentActivity, accountInstance2, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(qaVar.O0()));
                return;
            case 14:
                ng0 ng0Var = (ng0) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj4;
                String str9 = (String) obj;
                ng0Var.H = false;
                og0 og0Var4 = ng0Var.S;
                og0Var4.v1(false, true);
                if (tL_error8 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.z4.x0(og0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str9);
                    og0Var4.u1(6, true, bundle3, false);
                    return;
                }
                og0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error8.text);
                return;
            case 15:
                yi0 yi0Var = (yi0) obj4;
                xf.b bVar = (xf.b) obj3;
                String str10 = (String) obj2;
                ga1 ga1Var = (ga1) obj;
                bj0 bj0Var = yi0Var.v.d;
                if (bVar != null) {
                    bj0Var.v.put(str10, bVar);
                }
                if (bVar != null && !ga1Var.f37145b && (i19 = ga1Var.f37144a) >= 0) {
                    View m11 = bj0Var.h.m(i19);
                    if (m11 instanceof r91) {
                        yi0Var.f40873r.f41545e = bVar;
                        r91 r91Var = (r91) m11;
                        r91Var.f40868b.f49570q0.d(false, false);
                        r91Var.g(false);
                    }
                }
                yi0Var.f();
                return;
            case 16:
                ik0 ik0Var = (ik0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                uf.k1 k1Var = ik0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ik0Var.f37891n;
                if (notificationsCustomSettingsActivity.f34188f) {
                    ik0Var.f37890f = null;
                    ik0Var.d = arrayList5;
                    ik0Var.f37889e = arrayList6;
                    k1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f34188f && !k1Var.e()) {
                        notificationsCustomSettingsActivity.f34186c.c();
                    }
                    ik0Var.l();
                    return;
                }
                return;
            case 17:
                lo0 lo0Var = (lo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                lo0Var.X0 = true;
                lo0Var.f38803c1 = 1;
                lo0Var.x0((org.telegram.ui.ActionBar.f5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = lo0Var.Y0;
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
                if (!z12 && (ko0Var2 = lo0Var.W0) != null) {
                    ko0Var2.a(lo0Var.f38803c1);
                }
                lo0Var.t0();
                if (z12 && (ko0Var = lo0Var.W0) != null) {
                    ko0Var.a(lo0Var.f38803c1);
                }
                long r02 = lo0Var.r0();
                int i25 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i25 > 0) {
                    str2 = UserObject.getForcedFirstName(lo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else if (i25 < 0 && (chat = lo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                    str2 = chat.title;
                }
                long q02 = lo0Var.q0();
                if (z12) {
                    if (!z10 && !z11) {
                        i20 = R.raw.stars_topup;
                    } else {
                        i20 = R.raw.stars_send;
                    }
                } else {
                    i20 = R.raw.payment_success;
                }
                int i26 = i20;
                if (!z12) {
                    string = null;
                } else {
                    if (z11) {
                        i21 = R.string.StarsGiveawaySentPopup;
                    } else if (z10) {
                        i21 = R.string.StarsGiftSentPopup;
                    } else {
                        i21 = R.string.StarsAcquired;
                    }
                    string = LocaleController.getString(i21);
                }
                if (z12) {
                    if (z11) {
                        formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        formatString2 = LocaleController.formatPluralStringComma(str, (int) q02, str2);
                    }
                } else {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, lo0Var.O0[0], lo0Var.f38816n0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(U);
                    if (i25 != 0 && string != null && !z11) {
                        Q = a02.K(i26, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new mh.s9(r02, 2));
                    } else {
                        String str11 = string;
                        if (str11 != null) {
                            Q = a02.M(str11, replaceTags, i26);
                        } else {
                            Q = a02.Q(i26, 36, replaceTags);
                        }
                    }
                    org.telegram.ui.Components.ic icVar = Q;
                    icVar.f27753r = false;
                    icVar.f27745j = 5000;
                    fg.d1 d1Var = new fg.d1(lo0Var, icVar, z10, message, 5);
                    org.telegram.ui.Components.nb nbVar = icVar.f27741e;
                    if (nbVar != null) {
                        nbVar.setOnClickListener(d1Var);
                    }
                    icVar.k(z11);
                    return;
                }
                return;
            case 18:
                lo0.d0((lo0) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str12 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new oq0(photoViewer, 10));
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
                int i27 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i27, config);
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
                    AndroidUtilities.runOnUIThread(new b30(photoViewer, photoEntry, str12, createBitmap2, 20));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    AndroidUtilities.runOnUIThread(new oq0(photoViewer, 11));
                    return;
                }
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str13 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str13;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.f34343n5.f30385b.setLoading(false);
                ju0 ju0Var = photoViewer2.d;
                if (ju0Var != null) {
                    ju0Var.W(photoViewer2.M4);
                }
                fs0 fs0Var = photoViewer2.f34249d1;
                if (fs0Var != null) {
                    fs0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.K0;
                if (!checkBox.f24793x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                lr0 lr0Var = (lr0) obj;
                ImageView imageView = photoViewer3.f34404u3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f34404u3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.f34451z2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        lr0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                TLObject tLObject7 = (TLObject) obj4;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((yr0) obj3).f43699b;
                if (tLObject7 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject7;
                    int i28 = photoViewer4.Q;
                    ArrayList arrayList8 = photoViewer4.f34246c7;
                    MessagesController.getInstance(i28).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.Q).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo2.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList8.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList8.set(indexOf2, tL_photos_photo2.photo);
                        }
                        if (user3 != null) {
                            user3.photo.photo_id = tL_photos_photo2.photo.f20867id;
                            userConfig.setCurrentUser(user3);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                aw0.U((aw0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj4, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 24:
                PrivacyControlActivity.V((PrivacyControlActivity) obj3, (TLRPC.TL_error) obj2, (TLObject) obj4, (boolean[]) obj);
                return;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                TLObject tLObject8 = (TLObject) obj4;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    d2Var3.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.N = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f34549a.l();
                    return;
                }
                return;
            case 26:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                } catch (Exception unused2) {
                }
                if (zArr2[0]) {
                    int i29 = Build.VERSION.SDK_INT;
                    if (i29 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i29 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    return;
                } else {
                    return;
                }
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str14 = (String) obj2;
                String str15 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity.getParentActivity())) {
                    org.telegram.ui.Components.w31.J(profileActivity.getParentActivity(), profileActivity, strArr[0], str14, str15, new i20(profileActivity, 2), null);
                    return;
                }
                return;
        }
    }

    public b30(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f35311a = i10;
        this.f35313c = obj;
        this.d = obj2;
        this.f35312b = tLObject;
        this.f35314e = obj3;
    }

    public b30(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f35311a = i10;
        this.f35313c = obj;
        this.f35312b = tLObject;
        this.d = obj2;
        this.f35314e = obj3;
    }

    public b30(sf0 sf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f35311a = 11;
        this.f35313c = sf0Var;
        this.d = tL_error;
        this.f35314e = bundle;
        this.f35312b = tLObject;
    }
}
