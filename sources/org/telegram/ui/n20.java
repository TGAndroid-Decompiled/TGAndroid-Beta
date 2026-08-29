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
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class n20 implements Runnable {
    public final int f40693a;
    public final Object f40694b;
    public final Object f40695c;
    public final Object d;
    public final Object f40696e;

    public n20(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40693a = i10;
        this.f40694b = obj;
        this.f40695c = obj2;
        this.d = obj3;
        this.f40696e = obj4;
    }

    private final void a() {
        Uri fromFile;
        org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f40694b;
        boolean[] zArr = (boolean[]) this.f40695c;
        Activity activity = (Activity) this.d;
        File file = (File) this.f40696e;
        try {
            c2Var.dismiss();
        } catch (Exception unused) {
        }
        if (zArr[0]) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (i10 >= 24) {
                intent.addFlags(1);
            }
            intent.setType("message/rfc822");
            intent.putExtra("android.intent.extra.EMAIL", "");
            intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
            intent.putExtra("android.intent.extra.STREAM", fromFile);
            if (activity != null) {
                try {
                    activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (activity != null) {
            Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
        }
    }

    @Override
    public final void run() {
        AccountInstance accountInstance;
        TLRPC.VideoSize videoSize;
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
        org.telegram.ui.Components.mc Q;
        String str2;
        ao0 ao0Var;
        ao0 ao0Var2;
        int i22 = this.f40693a;
        long j10 = 0;
        String str3 = null;
        Object obj = this.f40696e;
        Object obj2 = this.d;
        Object obj3 = this.f40695c;
        Object obj4 = this.f40694b;
        switch (i22) {
            case 0:
                r50 r50Var = (r50) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance2 = r50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                r50Var.W0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = r50Var.W0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 != null) {
                    j10 = chat2.f22392id;
                }
                call2.chatId = j10;
                groupCall.schedule_date = r50Var.f41896g2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance2;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = r50Var.W0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f22402id = groupCall3.f22402id;
                call3.createNoVideoParticipant();
                org.telegram.ui.Components.o20 o20Var = r50Var.f41915l2;
                ChatObject.Call call4 = r50Var.W0;
                o20Var.f31235c = call4;
                r50Var.W1.setGroupCall(call4);
                r50Var.f41912k2.f44469c = r50Var.W0;
                r50Var.Y.C0(accountInstance2.getCurrentAccount(), r50Var.W0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance2.getMessagesController();
                ChatObject.Call call5 = r50Var.W0;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 1:
                r50.w((r50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i23 = 0; i23 < Math.min(arrayList.size(), vector.objects.size()); i23++) {
                        if (vector.objects.get(i23) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i23)).f22539id));
                        }
                    }
                }
                u20Var.run();
                return;
            case 3:
                y40 y40Var = (y40) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str4 = (String) obj;
                r50 r50Var2 = y40Var.f44742f;
                AccountInstance accountInstance3 = r50Var2.d;
                l30 l30Var = r50Var2.f41871b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    l30Var.G0 = imageLocation;
                    l30Var.f30057m1 = null;
                    l30Var.f30058n1 = null;
                    y40Var.d = null;
                }
                if (tL_error == null) {
                    TLRPC.User user = accountInstance3.getMessagesController().getUser(Long.valueOf(accountInstance3.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance3.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance3.getMessagesController().putUser(user, false);
                        } else {
                            return;
                        }
                    } else {
                        accountInstance3.getUserConfig().setCurrentUser(user);
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22416id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && y40Var.f44740c != null) {
                        i13 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(y40Var.f44740c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(y40Var.f44740c.volume_id);
                        sb2.append("_");
                        String l10 = a4.w.l(y40Var.f44740c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        accountInstance = accountInstance3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        accountInstance = accountInstance3;
                    }
                    if (closestPhotoSizeWithSize2 != null && y40Var.f44739b != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(y40Var.f44739b, true).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) r50Var2).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", true));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.f22539id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(y40Var.f44741e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(y40Var.f44739b) == null) {
                        forUser2 = ImageLocation.getForLocal(y40Var.f44740c);
                    }
                    l30Var.setCreateThumbFromParent(false);
                    l30Var.H(null, forUser, forUser2, true);
                    y40Var.f44740c = null;
                    y40Var.f44739b = null;
                    AndroidUtilities.updateVisibleRows(r50Var2.M);
                    y40Var.a(1.0f);
                } else {
                    accountInstance = accountInstance3;
                }
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance.getUserConfig().saveConfig(true);
                return;
            case 4:
                t60.U((t60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 5:
                b70 b70Var = (b70) obj4;
                b70Var.d = (ArrayList) obj3;
                b70Var.f36703e = (ArrayList) obj2;
                b70Var.l();
                c70 c70Var = b70Var.f36706r;
                c70Var.f37013b.d.setVisibility(8);
                c70Var.f37013b.f32122e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                c70Var.f37013b.e(false, true);
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                x60 x60Var = (x60) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                try {
                    x60Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject3 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject3;
                    Pattern pattern2 = org.telegram.ui.Components.c5.f27308a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    if (equals) {
                        c2Var.N = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.i(LocaleController.getString(R.string.SETTINGS), new org.telegram.ui.Components.i1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        c2Var.N = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        c2Var.N = LocaleController.getString(R.string.LanguageTitle);
                        if (tL_langPackLanguage.official) {
                            formatString = LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            formatString = LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new org.telegram.ui.Components.j1(0, tL_langPackLanguage, launchActivity));
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o3(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23188k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23205l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                    alertDialog$Builder.n(textView);
                    launchActivity.B0(alertDialog$Builder);
                    return;
                } else if (tL_error2 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error2.text)) {
                        launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    b.j(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error2.text);
                    launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                i iVar = (i) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.f35560x1;
                try {
                    c2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject4 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new x60(7, iVar, tL_error3));
                    return;
                }
                return;
            case 8:
                mb0 mb0Var = (mb0) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.wq.a(o2Var.getContext(), mb0Var.f40514b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new tm(23, mb0Var, userArr), o2Var.getResourceProvider(), mb0.b());
                return;
            case 9:
                jb0.t0((jb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 10:
                EditText editText = (EditText) obj2;
                ag.c0 c0Var = (ag.c0) obj;
                ((org.telegram.ui.Components.uc0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new x60(19, editText, c0Var));
                    return;
                }
                return;
            case 11:
                ud0 ud0Var = (ud0) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str6 != null) {
                    bArr = AndroidUtilities.getStringBytes(str6);
                } else {
                    bArr = null;
                }
                td0 td0Var = new td0(ud0Var, str6, str7, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ud0Var.f43237s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                            tL_error4.text = "ALGO_INVALID";
                            td0Var.run(null, tL_error4);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.o2) ud0Var.A).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, td0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                tL_error5.text = "PASSWORD_HASH_INVALID";
                td0Var.run(null, tL_error5);
                return;
            case 12:
                ie0 ie0Var = (ie0) obj4;
                String str8 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                fg0 fg0Var = ie0Var.f39226y;
                fg0Var.k1(false, true);
                ie0Var.f39221n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", ie0Var.h);
                    fg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                    return;
                } else {
                    ie0Var.o(true);
                    return;
                }
            case 13:
                if0 if0Var = (if0) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject5 = (TLObject) obj;
                fg0 fg0Var2 = if0Var.f39249o0;
                if0Var.W = false;
                if (tL_error7 == null) {
                    if0Var.f39245k0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject5;
                    if0Var.f39246l0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        if0Var.f39235c0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        if0Var.f39235c0 = 16;
                    }
                    fg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str9 = tL_error7.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                if0Var.c(true);
                                fg0Var2.u1(0, true, null, true);
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error7.code != -1000) {
                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                b.j(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error7.text);
                                fg0Var2.l1(string, sb5.toString());
                            }
                        } else {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                if0Var.z(false);
                return;
            case 14:
                of0.o((of0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 15:
                p2.l lVar = (p2.l) obj3;
                x3 x3Var = (x3) obj2;
                fg0 fg0Var3 = ((of0) obj4).v;
                fg0Var3.f38158e = true;
                BillingController.getInstance().addResultListener(lVar.f45473c, new l3(x3Var, 3));
                BillingController.getInstance().setOnCanceled(new nf0(x3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = fg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                AccountInstance accountInstance4 = AccountInstance.getInstance(i18);
                oc.i iVar2 = new oc.i(16);
                iVar2.i2(lVar);
                billingController.launchBillingFlow(parentActivity, accountInstance4, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(iVar2.M1()));
                return;
            case 16:
                eg0 eg0Var = (eg0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str10 = (String) obj;
                eg0Var.G = false;
                fg0 fg0Var4 = eg0Var.R;
                fg0Var4.v1(false, true);
                if (tL_error8 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.c5.x0(fg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
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
                fg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error8.text);
                return;
            case 17:
                pi0 pi0Var = (pi0) obj4;
                uf.b bVar = (uf.b) obj3;
                String str11 = (String) obj2;
                s91 s91Var = (s91) obj;
                si0 si0Var = pi0Var.v.d;
                if (bVar != null) {
                    si0Var.v.put(str11, bVar);
                }
                if (bVar != null && !s91Var.f42328b && (i19 = s91Var.f42327a) >= 0) {
                    View m10 = si0Var.h.m(i19);
                    if (m10 instanceof d91) {
                        pi0Var.f37430r.f38072e = bVar;
                        d91 d91Var = (d91) m10;
                        d91Var.f37425b.f48278p0.d(false, false);
                        d91Var.g(false);
                    }
                }
                pi0Var.f();
                return;
            case 18:
                yj0 yj0Var = (yj0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                rf.k1 k1Var = yj0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = yj0Var.f44899n;
                if (notificationsCustomSettingsActivity.f35614f) {
                    yj0Var.f44898f = null;
                    yj0Var.d = arrayList5;
                    yj0Var.f44897e = arrayList6;
                    k1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f35614f && !k1Var.e()) {
                        notificationsCustomSettingsActivity.f35612c.c();
                    }
                    yj0Var.l();
                    return;
                }
                return;
            case 19:
                bo0 bo0Var = (bo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                bo0Var.W0 = true;
                bo0Var.f36843b1 = 1;
                bo0Var.x0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = bo0Var.X0;
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
                if (!z12 && (ao0Var2 = bo0Var.V0) != null) {
                    ao0Var2.a(bo0Var.f36843b1);
                }
                bo0Var.t0();
                if (z12 && (ao0Var = bo0Var.V0) != null) {
                    ao0Var.a(bo0Var.f36843b1);
                }
                long r02 = bo0Var.r0();
                int i25 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i25 > 0) {
                    str = UserObject.getForcedFirstName(bo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i25 < 0 && (chat = bo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = bo0Var.q0();
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
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, bo0Var.N0[0], bo0Var.m0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(U);
                    if (i25 != 0 && str12 != null && !z11) {
                        Q = a02.K(i26, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new jh.r9(r02, 2));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i26);
                    } else {
                        Q = a02.Q(i26, 36, replaceTags);
                    }
                    Q.f30660r = false;
                    Q.f30652j = 5000;
                    cg.f1 f1Var = new cg.f1(bo0Var, Q, z10, message, 5);
                    org.telegram.ui.Components.rb rbVar = Q.f30648e;
                    if (rbVar != null) {
                        rbVar.setOnClickListener(f1Var);
                    }
                    Q.k(z11);
                    return;
                }
                return;
            case 20:
                bo0.d0((bo0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new gq0(photoViewer, 10));
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
                float f9 = max;
                float f10 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f9, decodeFile.getHeight() / f10);
                int i27 = (int) (f10 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f9 * max3), i27, config);
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
                    AndroidUtilities.runOnUIThread(new n20(photoViewer, photoEntry, str13, createBitmap2, 22));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    AndroidUtilities.runOnUIThread(new gq0(photoViewer, 11));
                    return;
                }
            case 22:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str14 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.P8;
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
                photoViewer2.f35759m5.f28391b.setLoading(false);
                xt0 xt0Var = photoViewer2.d;
                if (xt0Var != null) {
                    xt0Var.W(photoViewer2.L4);
                }
                vr0 vr0Var = photoViewer2.f35667c1;
                if (vr0Var != null) {
                    vr0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.J0;
                if (!checkBox.f26308x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                br0 br0Var = (br0) obj;
                ImageView imageView = photoViewer3.f35821t3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f35821t3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.f35867y2;
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
            case 24:
                TLObject tLObject7 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((or0) obj4).f41216b;
                if (tLObject7 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject7;
                    int i28 = photoViewer4.P;
                    ArrayList arrayList8 = photoViewer4.f35663b7;
                    MessagesController.getInstance(i28).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.P).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo2.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList8.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList8.set(indexOf2, tL_photos_photo2.photo);
                        }
                        if (user3 != null) {
                            user3.photo.photo_id = tL_photos_photo2.photo.f22416id;
                            userConfig.setCurrentUser(user3);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
                pv0.U((pv0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 26:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    c2Var3.dismiss();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.M = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f35973a.l();
                    return;
                }
                return;
            case 28:
                a();
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.tc.a0(profileActivity).d0(tL_error9, false);
                }
                if (profileActivity.f36060k4 == iArr2[0]) {
                    profileActivity.f36060k4 = 0;
                    return;
                }
                return;
        }
    }
}
