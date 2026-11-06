package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class ex implements org.telegram.messenger.c20 {
    public final int f33347a;
    public final Object f33348b;
    public final Object f33349c;

    public ex(int i7, Object obj, Object obj2) {
        this.f33347a = i7;
        this.f33348b = obj;
        this.f33349c = obj2;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f10;
        float f11;
        float f12;
        int[] iArr;
        int i7;
        float f13;
        float f14;
        TLRPC.Document document;
        float f15;
        float f16;
        v4.d1 K;
        int i10 = this.f33347a;
        int i11 = 0;
        Object obj2 = this.f33349c;
        Object obj3 = this.f33348b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                gx gxVar = ((fx) obj3).f33708a;
                if (ConnectionsManager.getInstance(gxVar.F.f34076c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    gx.E(gxVar, runnable, arrayList2, false);
                    return;
                }
            case 1:
                zx zxVar = (zx) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i11 < size) {
                    Object obj4 = arrayList3.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(zxVar.f41110x.Q.f34076c1).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        zxVar.f41106n.add(new yw(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                vz vzVar = (vz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (vzVar.S1 == null && !(vzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    cc I = hc.a0(f2Var).I(2131623989, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750679, vzVar.X1)), org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f32523j = 5000;
                    I.j();
                    return;
                }
                hc a02 = hc.a0(f2Var);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750627, vzVar.X1));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.hd.G(vzVar.Z1.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                cc I2 = a02.I(2131624025, X2, G);
                I2.f32523j = 5000;
                I2.j();
                return;
            case 3:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f22537q;
                    int j3 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f22531m) + org.telegram.messenger.g0.f22532n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f22531m) + org.telegram.messenger.g0.f22532n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
                    if ((j3 != 0 || j10 != 0 || j11 != bitmap.getWidth() || j12 != bitmap.getHeight()) && j11 > 0 && j12 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j3, j10, j11, j12);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 0.04f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                float f17 = -0.07f;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                } else {
                    f11 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 2.0f;
                } else {
                    f12 = 3.0f;
                }
                colorMatrix2.setSaturation(f12);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f17 = -0.2f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f17);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l10, l11);
                return;
            case 4:
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj3;
                np0 np0Var = (np0) obj2;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    qpVar.F4(true);
                    if (T != null) {
                        hc.a0(T).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745575, null), new dd(2, T)), true)).k(true);
                    }
                    np0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    hc.a0(T).I(2131624011, org.telegram.messenger.hd.M0(2131754311, null), org.telegram.messenger.hd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 5:
                xs0.a((xs0) obj3, (TL_stories.StoryItem) obj2, (di.r6) obj);
                return;
            case 6:
                n01 n01Var = (n01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = n01Var.M;
                n01Var.N = 0;
                if (((String) obj2).equals(n01Var.L)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    n01Var.g();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj3;
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                g1Var.getClass();
                if (q0Var != null) {
                    q0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                g1Var.a();
                return;
            case 8:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj3;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                Long l12 = (Long) obj;
                ksVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                f2Var2.presentFragment(new ProfileActivity(bundle, null));
                ksVar.o();
                return;
            case 9:
                org.telegram.ui.gs gsVar = (org.telegram.ui.gs) obj3;
                Boolean bool = (Boolean) obj;
                gsVar.getClass();
                ((org.telegram.messenger.c20) obj2).a(bool);
                if (bool.booleanValue()) {
                    gsVar.f46062a.o();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    wwVar.showDialog(new org.telegram.ui.dh0(activity, !c8.ia.a(), new org.telegram.ui.ru(activity, 0)));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.gz gzVar = ((org.telegram.ui.dz) obj3).f45134e;
                if (!gzVar.getUserConfig().q()) {
                    gzVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) gzVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                gzVar.E = intValue;
                em0Var.a(intValue, true);
                org.telegram.ui.wy wyVar = gzVar.I;
                if (wyVar != null) {
                    if (!gzVar.getUserConfig().q()) {
                        i7 = -1;
                    } else {
                        i7 = gzVar.E;
                    }
                    wyVar.d(i7, true);
                }
                gzVar.o0(true);
                return;
            case 12:
                org.telegram.ui.n30 n30Var = (org.telegram.ui.n30) obj3;
                org.telegram.ui.l00 l00Var = (org.telegram.ui.l00) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (l00Var != null) {
                    n30Var.getClass();
                    l00Var.setVisibility(0);
                }
                n30Var.f47924c = bitmap2;
                Paint paint = new Paint(1);
                n30Var.d = paint;
                Bitmap bitmap3 = n30Var.f47924c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                n30Var.f47925e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = 0.05f;
                } else {
                    f13 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f13);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f14 = -0.02f;
                } else {
                    f14 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f14);
                n30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 13:
                org.telegram.ui.p90 p90Var = (org.telegram.ui.p90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                p90Var.c();
                if (user != null) {
                    long j13 = userArr[0].f27101id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f27101id);
                    p90Var.u(new org.telegram.ui.o90(bundle2, user, userArr, j13), false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = qg0Var.X1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f27101id)) && qg0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.f27101id));
                        }
                    }
                }
                Boolean bool2 = qg0Var.f49203j2;
                if (bool2 != null && bool2.booleanValue()) {
                    ex exVar = new ex(15, qg0Var, hashSet);
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f26998q = str;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.n41(9, s12, exVar));
                    } else {
                        org.telegram.messenger.g0.h3(new wg.p(exVar, 0));
                    }
                    qg0Var.f49198e2 = i11;
                    return;
                }
                qg0Var.g1(true, true);
                return;
            case 15:
                org.telegram.ui.qg0 qg0Var2 = (org.telegram.ui.qg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f27101id)) && qg0Var2.d1(user3)) {
                            qg0Var2.X1.add(user3);
                            hashSet2.add(Long.valueOf(user3.f27101id));
                        }
                    }
                }
                qg0Var2.g1(true, true);
                return;
            case 16:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ah0Var.H1.setImageDrawable(null);
                    ah0Var.f43633q1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748277, null), new org.telegram.ui.zc0(11, ah0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = ah0Var.getContext().getResources().getDrawable(2131232398).mutate();
                    org.telegram.ui.ActionBar.r6.y(ah0Var.H1, mutate, org.telegram.ui.ActionBar.k6.f28183v6, ah0Var.I0, PorterDuff.Mode.SRC_IN);
                    ah0Var.H1.setImageDrawable(mutate);
                    if (user4.contact) {
                        ah0Var.f43633q1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748278, null), new org.telegram.ui.zc0(12, ah0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        ah0Var.f43633q1.setText(org.telegram.messenger.hd.M0(2131748276, null));
                    }
                }
                ah0Var.O0(false);
                return;
            case 17:
                ArrayList arrayList8 = (ArrayList) obj2;
                l9[] l9VarArr = (l9[]) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                        String str3 = (String) arrayList8.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i13).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i13).emoticon, str3)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i13).documents.get(0).longValue();
                                    for (int i14 = 0; i14 < tL_messages_stickerSet.documents.size(); i14++) {
                                        if (tL_messages_stickerSet.documents.get(i14).f26958id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i14);
                                        }
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            l9VarArr[i12].m(org.telegram.messenger.hc.b(document), "40_40", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.i6.f(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 18:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.zh0) obj2).run();
                return;
            case 19:
                org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj2;
                Long l13 = (Long) obj;
                yr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                f2Var3.presentFragment(new ProfileActivity(bundle3, null));
                yr0Var.c(false);
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.S6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.ko0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.S6;
                ((org.telegram.ui.ActionBar.u1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.va D = fi.va.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.N = a10;
                    fi.la laVar = D.f12944c1;
                    if (laVar != null) {
                        laVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.xw0 xw0Var = (org.telegram.ui.xw0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.q11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.ax0.f44091s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                xw0Var.f51983c = imageReceiver;
                xw0Var.f51984e.add(imageReceiver);
                int f18 = org.telegram.ui.ix.f();
                xw0Var.f51983c.W(0);
                org.telegram.ui.zw0 zw0Var = xw0Var.f51983c;
                String str5 = f18 + "_" + f18 + "_precache";
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0(xw0Var, 6);
                zw0Var.getClass();
                zw0Var.f21192g1 = new org.telegram.ui.yw0(new Runnable[]{qu0Var});
                zw0Var.q0(org.telegram.messenger.hc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                xw0Var.f51983c.P();
                xw0Var.f51986g[1] = true;
                xw0Var.a();
                return;
            case 23:
                Runnable runnable3 = (Runnable) obj;
                ((di.e) obj3).a((HashSet) obj2);
                return;
            case 24:
                org.telegram.ui.rz0 rz0Var = (org.telegram.ui.rz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    rz0Var.getClass();
                    view2.setVisibility(0);
                }
                rz0Var.f49580f = bitmap4;
                Paint paint2 = new Paint(1);
                rz0Var.f49581n = paint2;
                Bitmap bitmap5 = rz0Var.f49580f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                rz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f15 = 0.05f;
                } else {
                    f15 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix4, f15);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f16 = -0.02f;
                } else {
                    f16 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix4, f16);
                rz0Var.f49581n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                rz0Var.f49582r = new Matrix();
                return;
            case 25:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.m31.c0((org.telegram.ui.m31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.iz.f23413u0 = false;
                    org.telegram.messenger.iz.y();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    pj0 pj0Var = themeActivity.f41985b;
                    if (pj0Var != null && pj0Var.G && (K = pj0Var.K(themeActivity.M)) != null) {
                        themeActivity.f41983a.t(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.by0 by0Var = (org.telegram.ui.by0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    by0Var.run();
                    return;
                } else {
                    hc.a0(themeActivity2).I(2131624011, org.telegram.messenger.hd.M0(2131754311, null), org.telegram.messenger.hd.M0(2131754312, null)).j();
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj3;
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.n0.j("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    k8Var.a(str6);
                    return;
                }
                org.telegram.ui.Wallet.n0.H("sending disableBackup to server");
                org.telegram.ui.Wallet.i3.a(n0Var.f42768a, new ai.c0(11), null, null, null, new di.b0(6, n0Var, k8Var), true, true, new bg.v0((Object) null, 2));
                return;
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj3;
                try {
                    ((org.telegram.messenger.c20) obj2).a((String) obj);
                    if (k0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (k0Var != null) {
                        k0Var.close();
                    }
                }
        }
    }

    public ex(ArrayList arrayList, l9[] l9VarArr) {
        this.f33347a = 17;
        this.f33349c = arrayList;
        this.f33348b = l9VarArr;
    }
}
