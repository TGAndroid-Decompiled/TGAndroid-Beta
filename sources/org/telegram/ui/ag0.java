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
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class ag0 implements Runnable {
    public final int f37787a;
    public final Object f37788b;
    public final Object f37789c;
    public final Object d;
    public final Object e;

    public ag0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37787a = i10;
        this.f37789c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37788b = obj4;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        String formatString;
        org.telegram.ui.Components.qc R;
        String str;
        oo0 oo0Var;
        oo0 oo0Var2;
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i13;
        String formatPluralString;
        org.telegram.ui.web.a1 a1Var;
        int i14 = this.f37787a;
        String str2 = "";
        String str3 = null;
        Object obj = this.f37788b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f37789c;
        switch (i14) {
            case 0:
                fg0 fg0Var = (fg0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str4 = (String) obj;
                fg0Var.M = false;
                gg0 gg0Var = fg0Var.f39362a0;
                gg0Var.A1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.j0(password, true)) {
                        org.telegram.ui.Components.g5.w0(gg0Var.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle.putString("phoneFormated", str4);
                    gg0Var.z1(6, true, bundle, false);
                    return;
                }
                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            case 1:
                si0 si0Var = (si0) obj4;
                lg.b bVar = (lg.b) obj3;
                String str5 = (String) obj;
                v91 v91Var = (v91) obj2;
                vi0 vi0Var = si0Var.v.d;
                if (bVar != null) {
                    vi0Var.v.put(str5, bVar);
                }
                if (bVar != null && !v91Var.f44750b && (i10 = v91Var.f44749a) >= 0) {
                    View m10 = vi0Var.h.m(i10);
                    if (m10 instanceof g91) {
                        si0Var.f39576r.e = bVar;
                        g91 g91Var = (g91) m10;
                        g91Var.f39572b.f16618t0.d(false, false);
                        g91Var.g(false);
                    }
                }
                si0Var.f();
                return;
            case 2:
                lk0 lk0Var = (lk0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ig.a2 a2Var = lk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = lk0Var.f41295n;
                if (notificationsCustomSettingsActivity.f35576f) {
                    lk0Var.f41294f = null;
                    lk0Var.d = arrayList;
                    lk0Var.e = arrayList2;
                    a2Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f35576f && !a2Var.e()) {
                        notificationsCustomSettingsActivity.f35575c.c();
                    }
                    lk0Var.l();
                    return;
                }
                return;
            case 3:
                po0 po0Var = (po0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                po0Var.f42588a1 = true;
                po0Var.f42601f1 = 1;
                po0Var.y0((org.telegram.ui.ActionBar.j5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = po0Var.f42591b1;
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
                if (!z12 && (oo0Var2 = po0Var.Z0) != null) {
                    oo0Var2.a(po0Var.f42601f1);
                }
                po0Var.u0();
                if (z12 && (oo0Var = po0Var.Z0) != null) {
                    oo0Var.a(po0Var.f42601f1);
                }
                long s02 = po0Var.s0();
                int i15 = (s02 > 0L ? 1 : (s02 == 0L ? 0 : -1));
                if (i15 > 0) {
                    str2 = UserObject.getForcedFirstName(po0Var.getMessagesController().getUser(Long.valueOf(s02)));
                } else if (i15 < 0) {
                    TLRPC.Chat chat3 = po0Var.getMessagesController().getChat(Long.valueOf(-s02));
                    str2 = chat3 != null ? chat3.title : "";
                }
                long r02 = po0Var.r0();
                if (z12) {
                    if (!z10 && !z11) {
                        i11 = R.raw.stars_topup;
                    } else {
                        i11 = R.raw.stars_send;
                    }
                } else {
                    i11 = R.raw.payment_success;
                }
                int i16 = i11;
                if (z12) {
                    if (z11) {
                        i12 = R.string.StarsGiveawaySentPopup;
                    } else if (z10) {
                        i12 = R.string.StarsGiftSentPopup;
                    } else {
                        i12 = R.string.StarsAcquired;
                    }
                    str3 = LocaleController.getString(i12);
                }
                String str6 = str3;
                if (z12) {
                    if (z11) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) r02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        formatString = LocaleController.formatPluralStringComma(str, (int) r02, str2);
                    }
                } else {
                    formatString = LocaleController.formatString(R.string.PaymentInfoHint, po0Var.R0[0], po0Var.f42612q0);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
                    if (i15 != 0 && str6 != null && !z11) {
                        R = b02.K(i16, str6, replaceTags, LocaleController.getString(R.string.ViewInChat), new bi.j4(s02, 3));
                    } else if (str6 != null) {
                        R = b02.M(str6, replaceTags, i16);
                    } else {
                        R = b02.R(i16, 36, replaceTags);
                    }
                    org.telegram.ui.Components.qc qcVar = R;
                    qcVar.f31898s = false;
                    qcVar.f31889j = 5000;
                    di.y3 y3Var = new di.y3(po0Var, qcVar, z10, message, 4);
                    org.telegram.ui.Components.ub ubVar = qcVar.e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(y3Var);
                    }
                    qcVar.k(z11);
                    return;
                }
                return;
            case 4:
                po0.e0((po0) obj4, (TLObject) obj2, (TLRPC.TL_error) obj3, (TL_account.getTmpPassword) obj);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str7 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new xq0(photoViewer, 10));
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
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str7));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    AndroidUtilities.runOnUIThread(new ag0((Object) photoViewer, (Object) photoEntry, str7, (Object) createBitmap2, 6));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new xq0(photoViewer, 11));
                    return;
                }
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str8 = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str8;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.q5.f28184b.setLoading(false);
                ou0 ou0Var = photoViewer2.d;
                if (ou0Var != null) {
                    ou0Var.X(photoViewer2.P4);
                }
                ms0 ms0Var = photoViewer2.f35665g1;
                if (ms0Var != null) {
                    ms0Var.setImage(bitmap);
                }
                photoViewer2.g3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f26074x) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                sr0 sr0Var = (sr0) obj;
                ImageView imageView = photoViewer3.f35819x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f35819x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        sr0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                TLObject tLObject2 = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((fs0) obj4).f39443b;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    int i17 = photoViewer4.T;
                    ArrayList arrayList4 = photoViewer4.f7;
                    MessagesController.getInstance(i17).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer4.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList4.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList4.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f22051id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fw0.V((fw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 10:
                PrivacyControlActivity.W((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    e2Var.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f35935a.l();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                int i18 = ProfileActivity.R6;
                try {
                    e2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i19 >= 24) {
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
                        } catch (Exception e12) {
                            FileLog.e(e12);
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
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    int i20 = ProfileActivity.R6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.wc.b0(profileActivity).g0(tL_error2, false);
                }
                if (profileActivity.f36086t4 == iArr2[0]) {
                    profileActivity.f36086t4 = 0;
                    return;
                }
                return;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f35979e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35979e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f35987f1));
                    }
                    t10.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity2.f36126z0);
                    return;
                }
                int i21 = ProfileActivity.R6;
                org.telegram.ui.Components.wc.e0(tL_error3);
                return;
            case 15:
                ProfileActivity.Y((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str9 = (String) obj;
                String str10 = (String) obj2;
                int i22 = ProfileActivity.R6;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.f51.T(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str9, str10, new x10(profileActivity3, 2), null);
                    return;
                }
                return;
            case 17:
                TLObject tLObject5 = (TLObject) obj2;
                UserConfig userConfig2 = (UserConfig) obj3;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((rz0) obj4).f43315b;
                profileActivity4.f36040n0.f30988c1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.f36040n0.V0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f22051id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                ProfileActivity profileActivity5 = ((c01) obj4).f38202c.e;
                profileActivity5.V4(null);
                if (tLObject6 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f35979e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f35979e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f35987f1));
                    }
                    TLObject tLObject7 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        t10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject7, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.f36126z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.wc.e0(tL_error4);
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    e2Var3.dismiss();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tL_error5 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.n0();
                    n71 n71Var = sessionsActivity.f36211a;
                    if (n71Var != null) {
                        n71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var4 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    e2Var4.dismiss();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tL_error6 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.n0();
                    n71 n71Var2 = sessionsActivity2.f36211a;
                    if (n71Var2 != null) {
                        n71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                m71 m71Var = (m71) obj4;
                m71Var.f41485a = (TLObject) obj2;
                m71Var.f41486b = (TLRPC.TL_error) obj3;
                ((p9) obj).run();
                return;
            case 22:
                d81.c0((d81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 23:
                h91 h91Var = (h91) obj4;
                lg.b bVar2 = (lg.b) obj3;
                String str11 = (String) obj;
                v91 v91Var2 = (v91) obj2;
                w91 w91Var = h91Var.f39964w;
                if (bVar2 != null) {
                    w91Var.U.put(str11, bVar2);
                }
                if (bVar2 != null && !v91Var2.f44750b && (i13 = v91Var2.f44749a) >= 0) {
                    View m11 = w91Var.T.m(i13);
                    if (m11 instanceof h91) {
                        h91Var.f39576r.e = bVar2;
                        h91 h91Var2 = (h91) m11;
                        h91Var2.f39572b.f16618t0.d(false, false);
                        h91Var2.g(false);
                    }
                }
                w91.Y(w91Var);
                return;
            case 24:
                i91 i91Var = (i91) obj4;
                i91Var.f40193k = false;
                i91Var.d = (lg.b) obj3;
                i91Var.f40190g = (String) obj;
                g91 g91Var2 = (g91) ((Utilities.Callback0Return) obj2).run();
                if (g91Var2 != null) {
                    g91Var2.e(i91Var, true);
                    return;
                }
                return;
            case 25:
                TLObject tLObject8 = (TLObject) obj2;
                String str12 = (String) obj;
                org.telegram.ui.ActionBar.e2 e2Var5 = (org.telegram.ui.ActionBar.e2) obj3;
                wd1 wd1Var = ((sd1) obj4).f43477a;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    for (int i23 = 0; i23 < updates.updates.size(); i23++) {
                        if (updates.updates.get(i23) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i23);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str12;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = wd1Var.getMessagesController().getPeer(wd1Var.f45108a);
                            tL_messageService.dialog_id = wd1Var.f45108a;
                            tL_messageService.f22048id = tL_updateMessageID.f22285id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(new MessageObject(wd1.Y(wd1Var), tL_messageService, false, false));
                            TLRPC.Chat chat4 = wd1Var.getMessagesController().getChat(Long.valueOf(-wd1Var.f45108a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f22079id = tL_updateMessageID.f22285id;
                            long j10 = wd1Var.f45109b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str12;
                            tL_forumTopic.top_message = tL_messageService.f22048id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = wd1Var.getMessagesController().getPeer(wd1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = wd1Var.E;
                            un unVar = wd1Var.f45117y;
                            if (unVar != null) {
                                unVar.Ua();
                                unVar.Ya();
                                unVar.Ab(arrayList6, chat4, tL_messageService.f22048id, 1, 1, tL_forumTopic);
                                unVar.f44206c = true;
                                unVar.z8();
                                unVar.ad(true);
                                unVar.f44330m1.n(true);
                                unVar.gd();
                                unVar.f44222d2.setCurrentTopic(unVar.b());
                                unVar.dd(true);
                                unVar.uc(true);
                                unVar.o9(true);
                                unVar.F6(true, true);
                                unVar.Na();
                                wd1Var.getMessagesController().getTopicsController().onTopicCreated(wd1Var.f45108a, tL_forumTopic, true);
                                wd1Var.finishFragment();
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", -wd1Var.f45108a);
                                bundle2.putInt("message_id", 1);
                                bundle2.putInt("unread_count", 0);
                                bundle2.putBoolean("historyPreloaded", false);
                                un unVar2 = new un(bundle2);
                                unVar2.Ab(arrayList6, chat4, tL_messageService.f22048id, 1, 1, tL_forumTopic);
                                unVar2.f44206c = true;
                                wd1Var.getMessagesController().getTopicsController().onTopicCreated(wd1Var.f45108a, tL_forumTopic, true);
                                wd1Var.presentFragment(unVar2);
                            }
                        }
                    }
                }
                e2Var5.dismiss();
                return;
            case 26:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 27:
                dg1 dg1Var = (dg1) obj4;
                String str13 = (String) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    dg1Var.v0(new zc1(8, dg1Var, str13));
                    return;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        dg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    dg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error7.text);
                    return;
                } else {
                    dg1Var.z0();
                    return;
                }
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                di.x7 x7Var = (di.x7) obj3;
                String str14 = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                if (x0Var.f45444c && ((a1Var = x0Var.Q) == null || !a1Var.o(x7Var))) {
                    FileLog.d("notifyEvent " + str14 + " dropped after document change");
                    return;
                }
                x0Var.d("window.Telegram.WebView.receiveEvent('" + str14 + "', " + jSONObject + ");");
                return;
            default:
                r5.a aVar = (r5.a) obj4;
                m5.i iVar = (m5.i) obj3;
                String str15 = iVar.f18333a;
                j5.g gVar = (j5.g) obj2;
                m5.h hVar = (m5.h) obj;
                aVar.getClass();
                Logger logger = r5.a.f47300f;
                try {
                    n5.e a2 = aVar.f47303c.a(str15);
                    if (a2 == null) {
                        String str16 = "Transport backend '" + str15 + "' is not registered";
                        logger.warning(str16);
                        gVar.d(new IllegalArgumentException(str16));
                    } else {
                        ((t5.g) aVar.e).f(new org.telegram.ui.Components.qy(aVar, iVar, ((k5.c) a2).a(hVar), 7));
                        gVar.d(null);
                    }
                    return;
                } catch (Exception e15) {
                    logger.warning("Error scheduling event " + e15.getMessage());
                    gVar.d(e15);
                    return;
                }
        }
    }

    public ag0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f37787a = i10;
        this.f37789c = obj;
        this.e = obj2;
        this.d = obj3;
        this.f37788b = obj4;
    }

    public ag0(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f37787a = i10;
        this.f37789c = obj;
        this.d = obj2;
        this.f37788b = str;
        this.e = obj3;
    }

    public ag0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f37787a = i10;
        this.f37789c = obj;
        this.e = tLObject;
        this.f37788b = obj2;
        this.d = obj3;
    }
}
