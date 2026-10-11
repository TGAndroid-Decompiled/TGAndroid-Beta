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
import org.telegram.ui.za1;
public final class qo0 implements Runnable {
    public final int f30215a;
    public final Object f30216b;
    public final Object f30217c;
    public final Object d;
    public final Object f30218e;

    public qo0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30215a = i10;
        this.f30216b = obj;
        this.f30217c = obj2;
        this.d = obj3;
        this.f30218e = obj4;
    }

    private final void a() {
        PhotoViewer photoViewer = (PhotoViewer) this.f30216b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.d;
        String str = (String) this.f30218e;
        Drawable[] drawableArr = PhotoViewer.U8;
        Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) this.f30217c).path);
        if (decodeFile == null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.hr0(photoViewer, 10));
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
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), (int) (f10 * max3), config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            AndroidUtilities.runOnUIThread(new qo0(photoViewer, photoEntry, str, createBitmap2, 29));
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.hr0(photoViewer, 11));
        }
    }

    @Override
    public final void run() {
        TLRPC.TL_forumTopic tL_forumTopic;
        long j3;
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
        sc Q;
        String str2;
        org.telegram.ui.to0 to0Var;
        org.telegram.ui.to0 to0Var2;
        int i22 = this.f30215a;
        String str3 = null;
        Object obj = this.f30218e;
        Object obj2 = this.d;
        Object obj3 = this.f30217c;
        Object obj4 = this.f30216b;
        switch (i22) {
            case 0:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                q80 q80Var = (q80) obj;
                byte[] bArr2 = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.d6 resourceProvider = syVar.getResourceProvider();
                fi0 fi0Var = new fi0(5, (yo0) obj4, tL_sponsoredPeer);
                int i23 = org.telegram.ui.b41.v;
                int currentAccount = syVar.getCurrentAccount();
                Activity parentActivity = syVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr2;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ki(parentActivity, resourceProvider, bArr2, syVar, fi0Var, currentAccount));
                }
                q80Var.u();
                return;
            case 1:
                or0.o((or0) obj4, (AtomicReference) obj3, (vq0) obj2, (TLRPC.Dialog) obj);
                return;
            case 2:
                zy0.G((zy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                return;
            case 3:
                zy0.q((org.telegram.ui.qs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                return;
            case 4:
                m11 m11Var = (m11) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(m11Var.d).performLogout(0);
                    return;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder j10 = sc.v.j(string, "\n");
                        j10.append(tL_error.text);
                        string = j10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.R = string2;
                    a2Var.T = string;
                    org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else {
                    return;
                }
            case 5:
                e41 e41Var = (e41) obj4;
                ((q80) obj).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-e41Var.f25844c, ((TLRPC.TL_forumTopic) obj2).f20084id, !tL_forumTopic.pinned, e41Var.h);
                return;
            case 6:
                d51.p((d51) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                return;
            case 7:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance2 = g60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                g60Var.f37869a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = g60Var.f37869a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                if (chat2 == null) {
                    j3 = 0;
                } else {
                    j3 = chat2.f20032id;
                }
                call2.chatId = j3;
                groupCall.schedule_date = g60Var.f37912k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance2;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = g60Var.f37869a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.f20042id = groupCall3.f20042id;
                call3.createNoVideoParticipant();
                k30 k30Var = g60Var.f37931p2;
                ChatObject.Call call4 = g60Var.f37869a1;
                k30Var.f27827c = call4;
                g60Var.a2.setGroupCall(call4);
                g60Var.f37927o2.f39521c = g60Var.f37869a1;
                g60Var.f37877c0.C0(accountInstance2.getCurrentAccount(), g60Var.f37869a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance2.getMessagesController();
                ChatObject.Call call5 = g60Var.f37869a1;
                messagesController.putGroupCall(call5.chatId, call5);
                return;
            case 8:
                org.telegram.ui.g60.y((org.telegram.ui.g60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                return;
            case 9:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ai.n3 n3Var = (ai.n3) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i24 = 0; i24 < Math.min(arrayList.size(), vector.objects.size()); i24++) {
                        if (vector.objects.get(i24) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i24)).f20179id));
                        }
                    }
                }
                n3Var.run();
                return;
            case 10:
                org.telegram.ui.n50 n50Var = (org.telegram.ui.n50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.g60 g60Var2 = n50Var.f40131f;
                AccountInstance accountInstance3 = g60Var2.d;
                org.telegram.ui.a40 a40Var = g60Var2.f37871b;
                ImageLocation imageLocation = n50Var.d;
                if (imageLocation != null) {
                    a40Var.K0 = imageLocation;
                    a40Var.f31818q1 = null;
                    a40Var.f31819r1 = null;
                    n50Var.d = null;
                }
                if (tL_error2 == null) {
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
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20056id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null && n50Var.f40129c != null) {
                        i13 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(n50Var.f40129c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(n50Var.f40129c.volume_id);
                        sb2.append("_");
                        String o9 = a1.g.o(n50Var.f40129c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        accountInstance = accountInstance3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String o10 = a1.g.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        imageLoader.replaceImageInCache(o9, o10, ImageLocation.getForUser(i15, user, 1), false);
                    } else {
                        accountInstance = accountInstance3;
                    }
                    if (closestPhotoSizeWithSize2 != null && n50Var.f40128b != null) {
                        i11 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(n50Var.f40128b, true).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str4 != null) {
                        i10 = ((org.telegram.ui.ActionBar.e3) g60Var2).currentAccount;
                        new File(str4).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", true));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.f20179id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(n50Var.f40130e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(n50Var.f40128b) == null) {
                        forUser2 = ImageLocation.getForLocal(n50Var.f40129c);
                    }
                    a40Var.setCreateThumbFromParent(false);
                    a40Var.H(null, forUser, forUser2, true);
                    n50Var.f40129c = null;
                    n50Var.f40128b = null;
                    AndroidUtilities.updateVisibleRows(g60Var2.Q);
                    n50Var.a(1.0f);
                } else {
                    accountInstance = accountInstance3;
                }
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance.getUserConfig().saveConfig(true);
                return;
            case 11:
                org.telegram.ui.j70.U((org.telegram.ui.j70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 12:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) obj4;
                r70Var.d = (ArrayList) obj3;
                r70Var.f41343e = (ArrayList) obj2;
                r70Var.l();
                org.telegram.ui.s70 s70Var = r70Var.f41346r;
                s70Var.f41615b.d.setVisibility(8);
                s70Var.f41615b.f25351e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                s70Var.f41615b.e(false, true);
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.n70 n70Var = (org.telegram.ui.n70) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n70Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = g5.f26605a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20368a;
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
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.v0(24, tL_langPackLanguage, launchActivity));
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
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20931l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    return;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(g5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb4);
                    sb4.append(tL_error3.text);
                    launchActivity.B0(g5.M(launchActivity, null, sb4.toString()));
                    return;
                } else {
                    return;
                }
            case 14:
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.n70(8, hVar, tL_error4));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.dc0 dc0Var = (org.telegram.ui.dc0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                tr.e(m2Var.getContext(), dc0Var.f36976b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.et(5, dc0Var, userArr), m2Var.getResourceProvider(), org.telegram.ui.dc0.d());
                return;
            case 16:
                org.telegram.ui.ac0.t0((org.telegram.ui.ac0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 17:
                EditText editText = (EditText) obj2;
                ho hoVar = (ho) obj;
                ((be0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.n70(20, editText, hoVar));
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
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ke0Var.f39317s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str6 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ie0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.m2) ke0Var.E).currentAccount;
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
                org.telegram.ui.vg0 vg0Var = ye0Var.f44345y;
                vg0Var.k1(false, true);
                ye0Var.f44340n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str8);
                    bundle.putString("password", ye0Var.h);
                    vg0Var.u1(9, true, bundle, false);
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                    return;
                } else {
                    ye0Var.o(true);
                    return;
                }
            case 20:
                org.telegram.ui.yf0 yf0Var = (org.telegram.ui.yf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.vg0 vg0Var2 = yf0Var.f44382s0;
                yf0Var.f44363d0 = false;
                if (tL_error8 == null) {
                    yf0Var.f44376o0 = bundle2;
                    if (tLObject6 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                        yf0Var.f44377p0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            yf0Var.f44368g0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            yf0Var.f44368g0 = 16;
                        }
                        vg0Var2.g1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject6;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        vg0Var2.u1(18, true, bundle2, true);
                    }
                } else {
                    String str9 = tL_error8.text;
                    if (str9 != null) {
                        if (str9.contains("PHONE_NUMBER_INVALID")) {
                            vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error8.text.contains("PHONE_CODE_EMPTY") && !tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                                yf0Var.c(true);
                                vg0Var2.u1(0, true, null, true);
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error8.code != -1000) {
                                String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb5 = new StringBuilder();
                                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb5);
                                sb5.append(tL_error8.text);
                                vg0Var2.l1(string3, sb5.toString());
                            }
                        } else {
                            vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                yf0Var.z(false);
                return;
            case 21:
                org.telegram.ui.eg0.o((org.telegram.ui.eg0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 22:
                c5.o oVar = (c5.o) obj3;
                org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) obj2;
                org.telegram.ui.vg0 vg0Var3 = ((org.telegram.ui.eg0) obj4).v;
                vg0Var3.f43018e = true;
                BillingController.getInstance().addResultListener(oVar.f4278c, new org.telegram.ui.g3(s3Var, 3));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.cg0(s3Var, 1));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = vg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.m2) vg0Var3).currentAccount;
                AccountInstance accountInstance4 = AccountInstance.getInstance(i18);
                pf.b bVar = new pf.b(7, false);
                bVar.X(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance4, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.H()));
                return;
            case 23:
                org.telegram.ui.ug0 ug0Var = (org.telegram.ui.ug0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str10 = (String) obj;
                ug0Var.K = false;
                org.telegram.ui.vg0 vg0Var4 = ug0Var.V;
                vg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        g5.w0(vg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str10);
                    vg0Var4.u1(6, true, bundle3, false);
                    return;
                }
                vg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                return;
            case 24:
                org.telegram.ui.hj0 hj0Var = (org.telegram.ui.hj0) obj4;
                jg.b bVar2 = (jg.b) obj3;
                String str11 = (String) obj2;
                za1 za1Var = (za1) obj;
                org.telegram.ui.kj0 kj0Var = hj0Var.v.d;
                if (bVar2 != null) {
                    kj0Var.v.put(str11, bVar2);
                }
                if (bVar2 != null && !za1Var.f44628b && (i19 = za1Var.f44627a) >= 0) {
                    View m10 = kj0Var.h.m(i19);
                    if (m10 instanceof org.telegram.ui.ka1) {
                        hj0Var.f39254r.f39884e = bVar2;
                        org.telegram.ui.ka1 ka1Var = (org.telegram.ui.ka1) m10;
                        ka1Var.f39249b.f12191t0.d(false, false);
                        ka1Var.g(false);
                    }
                }
                hj0Var.f();
                return;
            case 25:
                org.telegram.ui.qk0 qk0Var = (org.telegram.ui.qk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                gg.b2 b2Var = qk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qk0Var.f41196n;
                if (notificationsCustomSettingsActivity.f33859f) {
                    qk0Var.f41195f = null;
                    qk0Var.d = arrayList5;
                    qk0Var.f41194e = arrayList6;
                    b2Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f33859f && !b2Var.e()) {
                        notificationsCustomSettingsActivity.f33857c.c();
                    }
                    qk0Var.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                uo0Var.f42694a1 = true;
                uo0Var.f42708f1 = 1;
                uo0Var.x0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = uo0Var.f42697b1;
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
                if (!z12 && (to0Var2 = uo0Var.Z0) != null) {
                    to0Var2.a(uo0Var.f42708f1);
                }
                uo0Var.t0();
                if (z12 && (to0Var = uo0Var.Z0) != null) {
                    to0Var.a(uo0Var.f42708f1);
                }
                long r02 = uo0Var.r0();
                int i26 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i26 > 0) {
                    str = UserObject.getForcedFirstName(uo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (i26 < 0 && (chat = uo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = uo0Var.q0();
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
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, uo0Var.R0[0], uo0Var.f42719q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    ad a02 = ad.a0(U);
                    if (i26 != 0 && str12 != null && !z11) {
                        Q = a02.K(i27, str12, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.vn0(r02, 1));
                    } else if (str12 != null) {
                        Q = a02.M(str12, replaceTags, i27);
                    } else {
                        Q = a02.Q(i27, 36, replaceTags);
                    }
                    Q.f30719r = false;
                    Q.f30711j = 5000;
                    ai.m5 m5Var = new ai.m5(uo0Var, Q, z10, message, 4);
                    wb wbVar = Q.f30707e;
                    if (wbVar != null) {
                        wbVar.setOnClickListener(m5Var);
                    }
                    Q.k(z11);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.uo0.d0((org.telegram.ui.uo0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 28:
                a();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                String str13 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                photoEntry.coverSavedPosition = -1L;
                photoEntry.coverPath = str13;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.f34040q5.f29050b.setLoading(false);
                org.telegram.ui.bv0 bv0Var = photoViewer.d;
                if (bv0Var != null) {
                    bv0Var.W(photoViewer.P4);
                }
                org.telegram.ui.ys0 ys0Var = photoViewer.f33950g1;
                if (ys0Var != null) {
                    ys0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.N0;
                if (!checkBox.f24073x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
        }
    }

    public qo0(e41 e41Var, q80 q80Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f30215a = 5;
        this.f30216b = e41Var;
        this.f30218e = q80Var;
        this.f30217c = messagesController;
        this.d = tL_forumTopic;
    }
}
