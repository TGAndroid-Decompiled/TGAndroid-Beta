package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class ih0 implements Runnable {
    public final int f46266a;
    public final Object f46267b;
    public final Object f46268c;
    public final Object d;
    public final Object f46269e;

    public ih0(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f46266a = i3;
        this.f46267b = obj;
        this.f46268c = obj2;
        this.d = obj3;
        this.f46269e = obj4;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        String M0;
        String a02;
        org.telegram.ui.Components.ac Q;
        String str;
        cl0 cl0Var;
        cl0 cl0Var2;
        Uri fromFile;
        TLObject M02;
        int indexOf;
        TLObject M03;
        int i11;
        String G;
        org.telegram.ui.web.w0 w0Var;
        int i12 = this.f46266a;
        String str2 = "";
        Object obj = this.f46269e;
        Object obj2 = this.d;
        Object obj3 = this.f46268c;
        Object obj4 = this.f46267b;
        switch (i12) {
            case 0:
                jh0 jh0Var = (jh0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                kg.v1 v1Var = jh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = jh0Var.f46625n;
                if (notificationsCustomSettingsActivity.f41336f) {
                    jh0Var.f46624f = null;
                    jh0Var.d = arrayList;
                    jh0Var.f46623e = arrayList2;
                    v1Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f41336f && !v1Var.e()) {
                        notificationsCustomSettingsActivity.f41334c.c();
                    }
                    jh0Var.f();
                    return;
                }
                return;
            case 1:
                dl0 dl0Var = (dl0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                dl0Var.f44741b1 = true;
                dl0Var.f44754g1 = 1;
                dl0Var.D0((org.telegram.ui.ActionBar.q4) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = dl0Var.f44744c1;
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
                if (!z12 && (cl0Var2 = dl0Var.f44738a1) != null) {
                    cl0Var2.e(dl0Var.f44754g1);
                }
                dl0Var.z0();
                if (z12 && (cl0Var = dl0Var.f44738a1) != null) {
                    cl0Var.e(dl0Var.f44754g1);
                }
                long w02 = dl0Var.w0();
                int i13 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
                if (i13 > 0) {
                    str2 = org.telegram.messenger.l10.k(dl0Var.getMessagesController().a2(Long.valueOf(w02)));
                } else if (i13 < 0) {
                    TLRPC.Chat M04 = dl0Var.getMessagesController().M0(Long.valueOf(-w02));
                    str2 = M04 != null ? M04.title : "";
                }
                long v02 = dl0Var.v0();
                if (z12) {
                    if (!z10 && !z11) {
                        i3 = 2131624226;
                    } else {
                        i3 = 2131624225;
                    }
                } else {
                    i3 = 2131624114;
                }
                int i14 = i3;
                if (!z12) {
                    M0 = null;
                } else {
                    if (z11) {
                        i10 = 2131745102;
                    } else if (z10) {
                        i10 = 2131745110;
                    } else {
                        i10 = 2131745169;
                    }
                    M0 = org.telegram.messenger.bd.M0(i10, null);
                }
                if (z12) {
                    if (z11) {
                        a02 = org.telegram.messenger.bd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        a02 = org.telegram.messenger.bd.K(str, (int) v02, ',', str2);
                    }
                } else {
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131747409, dl0Var.S0[0], dl0Var.f44766r0);
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(T);
                    if (i13 != 0 && M0 != null && !z11) {
                        Q = a03.L(i14, M0, X2, org.telegram.messenger.bd.M0(2131743562, null), new ci.u3(w02, 3));
                    } else {
                        String str3 = M0;
                        if (str3 != null) {
                            Q = a03.I(i14, str3, X2);
                        } else {
                            Q = a03.Q(i14, 36, X2);
                        }
                    }
                    org.telegram.ui.Components.ac acVar = Q;
                    acVar.f31800r = false;
                    acVar.f31792j = 5000;
                    if (message != null) {
                        ei.u3 u3Var = new ei.u3(dl0Var, acVar, z10, message, 4);
                        org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                        if (fbVar != null) {
                            fbVar.setOnClickListener(u3Var);
                        }
                    }
                    acVar.k(z11);
                    return;
                }
                return;
            case 2:
                dl0.i0((dl0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj2;
                String str4 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.ye) obj3).I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.h3(new xm0(photoViewer, 10));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(yeVar.I, iArr, 0L);
                int max = Math.max(iArr[1], yeVar.F);
                int max2 = Math.max(iArr[2], yeVar.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i15 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i15, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str4));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.h3(new ih0(photoViewer, yeVar, str4, createBitmap2, 4));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new xm0(photoViewer, 11));
                    return;
                }
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) obj3;
                String str5 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                if (yeVar2.f25314g != null) {
                    try {
                        new File(yeVar2.f25314g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                yeVar2.d = -1L;
                yeVar2.f25314g = str5;
                yeVar2.f25312e = null;
                yeVar2.f25313f = null;
                photoViewer2.r5.f36807b.setLoading(false);
                kq0 kq0Var = photoViewer2.d;
                if (kq0Var != null) {
                    kq0Var.X(photoViewer2.Q4);
                }
                oo0 oo0Var = photoViewer2.f41438h1;
                if (oo0Var != null) {
                    oo0Var.setImage(bitmap);
                }
                photoViewer2.h3(0);
                CheckBox checkBox = photoViewer2.O0;
                if (!checkBox.f31319y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                tn0 tn0Var = (tn0) obj;
                ImageView imageView = photoViewer3.f41591y3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f41591y3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        tn0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                TLObject tLObject = (TLObject) obj3;
                org.telegram.messenger.h10 h10Var = (org.telegram.messenger.h10) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((ho0) obj4).f45959b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i16 = photoViewer4.U;
                    ArrayList arrayList4 = photoViewer4.g7;
                    org.telegram.messenger.hp.s1(i16).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(photoViewer4.U).a2(Long.valueOf(h10Var.f22848n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList4.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList4.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (a22 != null) {
                            a22.photo.photo_id = tL_photos_photo.photo.f27025id;
                            h10Var.w(a22);
                            h10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                xr0.Z((xr0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 8:
                PrivacyControlActivity.a0((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = true;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.f41704a.f();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                RectF rectF = ProfileActivity.T6;
                try {
                    s1Var.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 24) {
                        org.telegram.messenger.t0.d();
                        fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i17 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.bd.E0().z0().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, org.telegram.messenger.bd.M0(2131751106, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.T6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.fc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.f41821o4 == iArr2[0]) {
                    profileActivity.f41821o4 = 0;
                    return;
                }
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                RectF rectF3 = ProfileActivity.T6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.f21.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str6, str7, new h00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 13:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f41751e1 != 0) {
                        M02 = profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.f41751e1));
                    } else {
                        M02 = profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f41759f1));
                    }
                    f00.a(profileActivity3.getParentActivity(), 0, tL_username.username, M02, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.A0);
                    return;
                }
                RectF rectF4 = ProfileActivity.T6;
                org.telegram.ui.Components.fc.d0(tL_error2);
                return;
            case 14:
                ProfileActivity.e0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 15:
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.messenger.h10 h10Var2 = (org.telegram.messenger.h10) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((iv0) obj4).f46427b;
                profileActivity4.f41817o0.f39095d1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(h10Var2.f22848n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.f41817o0.W0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (a23 != null) {
                            a23.photo.photo_id = tL_photos_photo2.photo.f27025id;
                            h10Var2.w(a23);
                            h10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((uv0) obj4).f50198c.f44157e;
                profileActivity5.e5(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f41751e1 != 0) {
                        M03 = profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.f41751e1));
                    } else {
                        M03 = profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.f41759f1));
                    }
                    TLObject tLObject6 = M03;
                    if (profileActivity5.getParentActivity() != null) {
                        f00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.A0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.fc.d0(tL_error3);
                return;
            case 17:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    o21 o21Var = sessionsActivity.f41984a;
                    if (o21Var != null) {
                        o21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.f41987e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    o21 o21Var2 = sessionsActivity2.f41984a;
                    if (o21Var2 != null) {
                        o21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                n21 n21Var = (n21) obj4;
                n21Var.f47855a = (TLObject) obj3;
                n21Var.f47856b = (TLRPC.TL_error) obj2;
                ((i9) obj).run();
                return;
            case 20:
                c31.d0((c31) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 21:
                c41 c41Var = (c41) obj4;
                ng.b bVar = (ng.b) obj3;
                String str8 = (String) obj2;
                q41 q41Var = (q41) obj;
                r41 r41Var = c41Var.f44235x;
                if (bVar != null) {
                    r41Var.V.l(str8, bVar);
                }
                if (bVar != null && !q41Var.f48751b && (i11 = q41Var.f48750a) >= 0) {
                    View m10 = r41Var.U.m(i11);
                    if (m10 instanceof c41) {
                        c41Var.f43923r.f44541e = bVar;
                        c41 c41Var2 = (c41) m10;
                        c41Var2.f43918b.f19362u0.d(false, false);
                        c41Var2.g(false);
                    }
                }
                r41.c0(r41Var);
                return;
            case 22:
                d41 d41Var = (d41) obj4;
                d41Var.f44546k = false;
                d41Var.d = (ng.b) obj3;
                d41Var.f44543g = (String) obj2;
                b41 b41Var = (b41) ((org.telegram.messenger.m10) obj).run();
                if (b41Var != null) {
                    b41Var.e(d41Var, true);
                    return;
                }
                return;
            case 23:
                TLObject tLObject7 = (TLObject) obj3;
                String str9 = (String) obj2;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj;
                l81 l81Var = ((g81) obj4).f45603a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i18 = 0; i18 < updates.updates.size(); i18++) {
                        if (updates.updates.get(i18) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i18);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str9;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = l81Var.getMessagesController().z1(l81Var.f47218a);
                            tL_messageService.dialog_id = l81Var.f47218a;
                            tL_messageService.f27022id = tL_updateMessageID.f27259id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(new org.telegram.messenger.zi(l81.c0(l81Var), tL_messageService, false, false));
                            TLRPC.Chat M05 = l81Var.getMessagesController().M0(Long.valueOf(-l81Var.f47218a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f27053id = tL_updateMessageID.f27259id;
                            long j10 = l81Var.f47219b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str9;
                            tL_forumTopic.top_message = tL_messageService.f27022id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = l81Var.getMessagesController().z1(l81Var.getUserConfig().f22848n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = l81Var.F;
                            wm wmVar = l81Var.E;
                            if (wmVar != null) {
                                wmVar.kb();
                                wmVar.ob();
                                wmVar.Rb(arrayList6, M05, tL_messageService.f27022id, 1, 1, tL_forumTopic);
                                wmVar.f51265c = true;
                                wmVar.J8();
                                wmVar.sd(true);
                                wmVar.f51433p1.n(true);
                                wmVar.yd();
                                wmVar.f51323g2.setCurrentTopic(wmVar.b());
                                wmVar.vd(true);
                                wmVar.Lc(true);
                                wmVar.B9(true);
                                wmVar.M6(true, true);
                                wmVar.db();
                                l81Var.getMessagesController().f23102q7.q(l81Var.f47218a, tL_forumTopic, true);
                                l81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -l81Var.f47218a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                wm wmVar2 = new wm(bundle);
                                wmVar2.Rb(arrayList6, M05, tL_messageService.f27022id, 1, 1, tL_forumTopic);
                                wmVar2.f51265c = true;
                                l81Var.getMessagesController().f23102q7.q(l81Var.f47218a, tL_forumTopic, true);
                                l81Var.presentFragment(wmVar2);
                            }
                        }
                    }
                }
                s1Var2.dismiss();
                return;
            case 24:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 25:
                ra1 ra1Var = (ra1) obj4;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    ra1Var.z0(new ma1(0, ra1Var, str10));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    ra1Var.L0(org.telegram.messenger.bd.M0(2131743941, null), tL_error6.text);
                    return;
                } else {
                    ra1Var.D0();
                    return;
                }
            case 26:
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) obj4;
                ei.p7 p7Var = (ei.p7) obj3;
                String str11 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (t0Var.f51023c && ((w0Var = t0Var.R) == null || !w0Var.o(p7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str11 + " dropped after document change");
                    return;
                }
                t0Var.d("window.Telegram.WebView.receiveEvent('" + str11 + "', " + jSONObject + ");");
                return;
            case 27:
                s5.a aVar = (s5.a) obj4;
                n5.i iVar = (n5.i) obj3;
                String str12 = iVar.f20245a;
                k5.g gVar = (k5.g) obj2;
                n5.h hVar = (n5.h) obj;
                aVar.getClass();
                Logger logger = s5.a.f54666f;
                try {
                    o5.e a10 = aVar.f54669c.a(str12);
                    if (a10 == null) {
                        String str13 = "Transport backend '" + str12 + "' is not registered";
                        logger.warning(str13);
                        gVar.b(new IllegalArgumentException(str13));
                    } else {
                        ((u5.g) aVar.f54670e).f(new org.telegram.ui.Components.hr(aVar, iVar, ((l5.d) a10).a(hVar), 8));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e16) {
                    logger.warning("Error scheduling event " + e16.getMessage());
                    gVar.b(e16);
                    return;
                }
            case 28:
                ug.c2 c2Var = (ug.c2) obj4;
                c2Var.H = true;
                c2Var.I = (ug.z1[]) ((ArrayList) obj3).toArray(new ug.z1[0]);
                ((en0) obj2).a((ug.z1) obj);
                return;
            default:
                ug.c2 c2Var2 = (ug.c2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                ug.a2 a2Var = (ug.a2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    c2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    a2Var.f55866e = org.telegram.messenger.li.a0(tL_messageMediaDocument.document, a2Var.f55865c);
                    a2Var.f55867f = tL_messageMediaDocument;
                    c2Var2.a();
                    return;
                }
                c2Var2.h();
                c2Var2.n(tL_error7);
                return;
        }
    }
}
