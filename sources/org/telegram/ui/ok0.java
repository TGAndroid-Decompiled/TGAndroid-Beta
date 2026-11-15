package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
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
public final class ok0 implements Runnable {
    public final int f49970a;
    public final Object f49971b;
    public final Object f49972c;
    public final Object d;
    public final Object f49973e;

    public ok0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f49970a = i7;
        this.f49971b = obj;
        this.f49972c = obj2;
        this.d = obj3;
        this.f49973e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ok0.a():void");
    }

    @Override
    public final void run() {
        Uri fromFile;
        int i7;
        TLObject M0;
        int indexOf;
        TLObject M02;
        int i10;
        char c10;
        String G;
        org.telegram.ui.web.v0 v0Var;
        boolean z10;
        int i11 = 2;
        switch (this.f49970a) {
            case 0:
                kl0.i0((kl0) this.f49971b, (TLObject) this.f49972c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.f49973e);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.f49971b;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.d;
                String str = (String) this.f49973e;
                Drawable[] drawableArr = PhotoViewer.Z8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.ff) this.f49972c).I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 10));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(ffVar.I, iArr, 0L);
                int max = Math.max(iArr[1], ffVar.F);
                int max2 = Math.max(iArr[2], ffVar.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i12 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), i12, config);
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
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.h3(new ok0(photoViewer, ffVar, str, createBitmap2, 2));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 11));
                    return;
                }
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f49971b;
                org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) this.f49972c;
                String str2 = (String) this.d;
                Bitmap bitmap = (Bitmap) this.f49973e;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                if (ffVar2.f27714g != null) {
                    try {
                        new File(ffVar2.f27714g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                ffVar2.d = -1L;
                ffVar2.f27714g = str2;
                ffVar2.f27712e = null;
                ffVar2.f27713f = null;
                photoViewer2.f42861q5.f40000b.setLoading(false);
                sq0 sq0Var = photoViewer2.d;
                if (sq0Var != null) {
                    sq0Var.X(photoViewer2.P4);
                }
                vo0 vo0Var = photoViewer2.f42782h1;
                if (vo0Var != null) {
                    vo0Var.setImage(bitmap);
                }
                photoViewer2.c3(0);
                CheckBox checkBox = photoViewer2.O0;
                if (!checkBox.f32426y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f49971b;
                Bitmap bitmap2 = (Bitmap) this.f49972c;
                boolean[] zArr = (boolean[]) this.d;
                ao0 ao0Var = (ao0) this.f49973e;
                ImageView imageView = photoViewer3.f42924x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f42924x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ao0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                TLObject tLObject = (TLObject) this.f49972c;
                org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.f49973e;
                PhotoViewer photoViewer4 = ((oo0) this.f49971b).f50016b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i13 = photoViewer4.U;
                    ArrayList arrayList = photoViewer4.f42770f7;
                    org.telegram.messenger.np.s1(i13).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = org.telegram.messenger.np.s1(photoViewer4.U).a2(Long.valueOf(m10Var.f24959n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (a22 != null) {
                            a22.photo.photo_id = tL_photos_photo.photo.f28075id;
                            m10Var.w(a22);
                            m10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                es0.Z((es0) this.f49971b, (TLRPC.TL_error) this.d, (TLObject) this.f49972c, (TL_stars.updatePaidMessagesPrice) this.f49973e);
                return;
            case 6:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.f49971b, (TLRPC.TL_error) this.d, (TLObject) this.f49972c, (boolean[]) this.f49973e);
                return;
            case 7:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f49971b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject2 = (TLObject) this.f49972c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.f49973e;
                try {
                    t1Var.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = true;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.f43047a.f();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f49971b;
                boolean[] zArr2 = (boolean[]) this.f49972c;
                Activity activity = (Activity) this.d;
                File file = (File) this.f49973e;
                RectF rectF = ProfileActivity.X6;
                try {
                    t1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        org.telegram.messenger.t0.d();
                        fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i14 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.hd.E0().z0().format(System.currentTimeMillis()));
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
                    Toast.makeText(activity, org.telegram.messenger.hd.M0(2131751105, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f49971b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr2 = (int[]) this.f49973e;
                if (!(((TLObject) this.f49972c) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.X6;
                    profileActivity.getClass();
                    i7 = 0;
                    org.telegram.ui.Components.cc.a0(profileActivity).f0(tL_error, false);
                } else {
                    i7 = 0;
                }
                if (profileActivity.f43171p4 == iArr2[i7]) {
                    profileActivity.f43171p4 = i7;
                    return;
                }
                return;
            case 10:
                ProfileActivity.i0((ProfileActivity) this.f49971b, (TLRPC.TL_error) this.d, (TLObject) this.f49972c, (String) this.f49973e);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f49971b;
                String[] strArr = (String[]) this.f49972c;
                String str3 = (String) this.d;
                String str4 = (String) this.f49973e;
                RectF rectF3 = ProfileActivity.X6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.p21.V0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str3, str4, new l00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f49971b;
                TLObject tLObject3 = (TLObject) this.f49972c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f49973e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f43094e1 != 0) {
                        M0 = profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.f43094e1));
                    } else {
                        M0 = profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f43102f1));
                    }
                    j00.a(profileActivity3.getParentActivity(), 0, tL_username.username, M0, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.A0);
                    return;
                }
                RectF rectF4 = ProfileActivity.X6;
                org.telegram.ui.Components.cc.d0(tL_error2);
                return;
            case 13:
                TLObject tLObject4 = (TLObject) this.f49972c;
                org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.f49973e;
                ProfileActivity profileActivity4 = ((pv0) this.f49971b).f50374b;
                profileActivity4.f43161o0.f40396d1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(m10Var2.f24959n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f43161o0.W0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (a23 != null) {
                            a23.photo.photo_id = tL_photos_photo2.photo.f28075id;
                            m10Var2.w(a23);
                            m10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                TLObject tLObject5 = (TLObject) this.f49972c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f49973e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                ProfileActivity profileActivity5 = ((bw0) this.f49971b).f45834c.f48123e;
                profileActivity5.g5(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f43094e1 != 0) {
                        M02 = profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.f43094e1));
                    } else {
                        M02 = profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.f43102f1));
                    }
                    TLObject tLObject6 = M02;
                    if (profileActivity5.getParentActivity() != null) {
                        j00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.A0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.cc.d0(tL_error3);
                return;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f49971b;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.f49972c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.f49973e;
                try {
                    t1Var3.dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    v21 v21Var = sessionsActivity.f43327a;
                    if (v21Var != null) {
                        v21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.f49971b;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.f49972c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f49973e;
                try {
                    t1Var4.dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.f43330e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    v21 v21Var2 = sessionsActivity2.f43327a;
                    if (v21Var2 != null) {
                        v21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                u21 u21Var = (u21) this.f49971b;
                u21Var.f51726a = (TLObject) this.f49972c;
                u21Var.f51727b = (TLRPC.TL_error) this.d;
                ((j9) this.f49973e).run();
                return;
            case 18:
                k31.d0((k31) this.f49971b, (TLRPC.TL_error) this.d, (TLObject) this.f49972c, (String) this.f49973e);
                return;
            case 19:
                k41 k41Var = (k41) this.f49971b;
                mg.b bVar = (mg.b) this.f49972c;
                String str5 = (String) this.d;
                y41 y41Var = (y41) this.f49973e;
                z41 z41Var = k41Var.f48538x;
                if (bVar != null) {
                    z41Var.V.l(str5, bVar);
                }
                if (bVar != null && !y41Var.f53416b && (i10 = y41Var.f53415a) >= 0) {
                    View m10 = z41Var.U.m(i10);
                    if (m10 instanceof k41) {
                        k41Var.f48206r.f48829e = bVar;
                        k41 k41Var2 = (k41) m10;
                        k41Var2.f48201b.f19456u0.d(false, false);
                        k41Var2.g(false);
                    }
                }
                z41.c0(z41Var);
                return;
            case 20:
                l41 l41Var = (l41) this.f49971b;
                l41Var.f48834k = false;
                l41Var.d = (mg.b) this.f49972c;
                l41Var.f48831g = (String) this.d;
                j41 j41Var = (j41) ((org.telegram.messenger.r10) this.f49973e).run();
                if (j41Var != null) {
                    j41Var.e(l41Var, true);
                    return;
                }
                return;
            case 21:
                TLObject tLObject7 = (TLObject) this.f49972c;
                String str6 = (String) this.d;
                org.telegram.ui.ActionBar.t1 t1Var5 = (org.telegram.ui.ActionBar.t1) this.f49973e;
                s81 s81Var = ((o81) this.f49971b).f49866a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    int i15 = 0;
                    while (i15 < updates.updates.size()) {
                        if (updates.updates.get(i15) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i15);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str6;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = s81Var.getMessagesController().z1(s81Var.f51146a);
                            tL_messageService.dialog_id = s81Var.f51146a;
                            tL_messageService.f28072id = tL_updateMessageID.f28309id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new org.telegram.messenger.gj(s81.c0(s81Var), tL_messageService, false, false));
                            TLRPC.Chat M03 = s81Var.getMessagesController().M0(Long.valueOf(-s81Var.f51146a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f28103id = tL_updateMessageID.f28309id;
                            long j3 = s81Var.f51147b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i11;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str6;
                            tL_forumTopic.top_message = tL_messageService.f28072id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = s81Var.getMessagesController().z1(s81Var.getUserConfig().f24959n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = s81Var.F;
                            an anVar = s81Var.E;
                            if (anVar != null) {
                                anVar.ob();
                                anVar.sb();
                                anVar.Vb(arrayList3, M03, tL_messageService.f28072id, 1, 1, tL_forumTopic);
                                anVar.f45145c = true;
                                anVar.L8();
                                anVar.wd(true);
                                anVar.f45313p1.n(true);
                                anVar.Cd();
                                anVar.f45201g2.setCurrentTopic(anVar.b());
                                anVar.zd(true);
                                anVar.Pc(true);
                                anVar.D9(true);
                                anVar.N6(true, true);
                                anVar.hb();
                                s81Var.getMessagesController().f25386r7.q(s81Var.f51146a, tL_forumTopic, true);
                                s81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -s81Var.f51146a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                an anVar2 = new an(bundle);
                                anVar2.Vb(arrayList3, M03, tL_messageService.f28072id, 1, 1, tL_forumTopic);
                                anVar2.f45145c = true;
                                s81Var.getMessagesController().f25386r7.q(s81Var.f51146a, tL_forumTopic, true);
                                s81Var.presentFragment(anVar2);
                            }
                        }
                        i15++;
                        i11 = 2;
                    }
                }
                t1Var5.dismiss();
                return;
            case 22:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.f49971b, (byte[]) this.d, (TLObject) this.f49972c, (byte[]) this.f49973e);
                return;
            case 23:
                xa1 xa1Var = (xa1) this.f49971b;
                String str7 = (String) this.f49973e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                if (((TLObject) this.f49972c) instanceof TLRPC.TL_boolTrue) {
                    xa1Var.z0(new fy0(22, xa1Var, str7));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error6.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M04 = org.telegram.messenger.hd.M0(2131743931, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        xa1Var.L0(M04, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, objArr));
                        return;
                    }
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), tL_error6.text);
                    return;
                } else {
                    xa1Var.D0();
                    return;
                }
            case 24:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.f49971b;
                fi.i7 i7Var = (fi.i7) this.f49972c;
                String str8 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.f49973e;
                if (s0Var.f52771c && ((v0Var = s0Var.R) == null || !v0Var.o(i7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str8 + " dropped after document change");
                    return;
                }
                s0Var.d("window.Telegram.WebView.receiveEvent('" + str8 + "', " + jSONObject + ");");
                return;
            case 25:
                ab.c0 c0Var = (ab.c0) this.f49971b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f49972c;
                p4.h hVar = (p4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f49973e;
                synchronized (c0Var.f909b) {
                    try {
                        if (!atomicBoolean.get()) {
                            c0Var.k(hVar);
                        } else {
                            atomicBoolean2.set(true);
                        }
                    } finally {
                    }
                }
                return;
            case 26:
                a();
                return;
            case 27:
                p4.c1 c1Var = (p4.c1) this.f49971b;
                p4.v vVar = (p4.v) this.f49972c;
                p4.d0 d0Var = (p4.d0) this.d;
                p4.l lVar = (p4.l) this.f49973e;
                ab.c0 c0Var2 = c1Var.f54601b;
                try {
                    c1Var.f54602c.remove(vVar);
                    if (!d0Var.j()) {
                        p4.x0 x0Var = (p4.x0) vVar.d;
                        x0Var.getClass();
                        IBinder asBinder = x0Var.f54882a.asBinder();
                        p4.t m11 = d0Var.m(vVar);
                        if (c0Var2.x(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var2.b(asBinder, vVar, m11.f54863a, m11.f54864b);
                        com.google.android.gms.common.api.internal.t u10 = c0Var2.u(vVar);
                        if (u10 == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            p4.g1 g1Var = d0Var.f54635t;
                            p4.e1 e1Var = d0Var.f54634s;
                            e2.y0 y0Var = m11.f54864b;
                            p4.e1 A1 = c1Var.A1(e1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.f54787n.f55252b).f55236c.f55249b;
                            h9.i0 i0Var = m11.f54865c;
                            if (i0Var == null) {
                                i0Var = d0Var.f54639y;
                            }
                            h9.i0 i0Var2 = m11.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.f54640z;
                            }
                            h9.i0 i0Var3 = d0Var.f54633r;
                            p4.j1 j1Var = m11.f54863a;
                            e2.y0 t6 = g1Var.t();
                            p4.o1 o1Var = d0Var.f54625j.f54810a;
                            o1Var.getClass();
                            p4.j jVar = new p4.j(c1Var, i0Var, i0Var2, i0Var3, j1Var, y0Var, t6, new Bundle(o1Var.f54835g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((p4.k) lVar).h1(u10.e(), jVar.a(vVar.f54870c));
                                    z10 = true;
                                } catch (RemoteException unused2) {
                                    z10 = false;
                                }
                                if (z10) {
                                    try {
                                        if (!d0Var.f54638x || !p4.d0.k(vVar)) {
                                            d0Var.f54621e.getClass();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (!z10) {
                                            c8.hb.a(lVar);
                                        }
                                        throw th;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                        }
                    }
                    c8.hb.a(lVar);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                break;
            case 28:
                m9.e0 e0Var = (m9.e0) this.f49972c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.f49973e;
                if (((p4.d0) this.f49971b).j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th4) {
                    e0Var.n(th4);
                    return;
                }
            default:
                p4.d0 d0Var2 = (p4.d0) this.f49971b;
                p4.z0 z0Var = (p4.z0) this.f49972c;
                p4.v vVar2 = (p4.v) this.d;
                List list = (List) this.f49973e;
                if (!d0Var2.j()) {
                    z0Var.a(d0Var2.f54635t, vVar2, list);
                    return;
                }
                return;
        }
    }

    public ok0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i7) {
        this.f49970a = i7;
        this.f49971b = obj;
        this.f49972c = tLObject;
        this.f49973e = obj2;
        this.d = tL_error;
    }

    public ok0(org.telegram.ui.ActionBar.e2 e2Var, Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f49970a = i7;
        this.f49971b = e2Var;
        this.d = obj;
        this.f49972c = tLObject;
        this.f49973e = obj2;
    }
}
