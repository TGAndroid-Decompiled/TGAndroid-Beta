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
    public final int f33348a;
    public final Object f33349b;
    public final Object f33350c;

    public ex(int i7, Object obj, Object obj2) {
        this.f33348a = i7;
        this.f33349b = obj;
        this.f33350c = obj2;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f10;
        float f11;
        int[] iArr;
        int i7;
        float f12;
        float f13;
        TLRPC.Document document;
        float f14;
        float f15;
        v4.d1 K;
        int i10 = this.f33348a;
        float f16 = 0.25f;
        int i11 = 0;
        Object obj2 = this.f33350c;
        Object obj3 = this.f33349b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                gx gxVar = ((fx) obj3).f33663a;
                if (ConnectionsManager.getInstance(gxVar.F.f34016c1).getConnectionState() != 3) {
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
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(zxVar.f41154x.Q.f34016c1).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        zxVar.f41150n.add(new yw(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                vz vzVar = (vz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (vzVar.V1 == null && !(vzVar.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    bc I = gc.a0(f2Var).I(2131623989, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750678, vzVar.f39821a2)), org.telegram.messenger.id.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f32203j = 5000;
                    I.j();
                    return;
                }
                gc a02 = gc.a0(f2Var);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750626, vzVar.f39821a2));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.id.G(vzVar.f39823c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.id.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                bc I2 = a02.I(2131624025, X2, G);
                I2.f32203j = 5000;
                I2.j();
                return;
            case 3:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f22567q;
                    int j3 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f22561m) + org.telegram.messenger.g0.f22562n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f22561m) + org.telegram.messenger.g0.f22562n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
                    if ((j3 != 0 || j10 != 0 || j11 != bitmap.getWidth() || j12 != bitmap.getHeight()) && j11 > 0 && j12 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j3, j10, j11, j12);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f16 = 0.04f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f16);
                float f17 = -0.07f;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = -0.04f;
                } else {
                    f10 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f10);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f11 = 2.0f;
                } else {
                    f11 = 3.0f;
                }
                colorMatrix2.setSaturation(f11);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
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
                        gc.a0(T).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131745574, null), new cd(2, T)), true)).k(true);
                    }
                    np0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    gc.a0(T).I(2131624011, org.telegram.messenger.id.M0(2131754311, null), org.telegram.messenger.id.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 5:
                ys0.a((ys0) obj3, (TL_stories.StoryItem) obj2, (di.s6) obj);
                return;
            case 6:
                s01 s01Var = (s01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = s01Var.M;
                s01Var.N = 0;
                if (((String) obj2).equals(s01Var.L)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    s01Var.h();
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                Long l12 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                f2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                return;
            case 9:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.c20) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.f47066a.o();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    zwVar.showDialog(new org.telegram.ui.gh0(activity, !c8.ia.a(), new org.telegram.ui.uu(activity, 0)));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.hm0 hm0Var = (org.telegram.ui.hm0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.jz jzVar = ((org.telegram.ui.gz) obj3).f46182e;
                if (!jzVar.getUserConfig().q()) {
                    jzVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) jzVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                jzVar.E = intValue;
                hm0Var.a(intValue, true);
                org.telegram.ui.zy zyVar = jzVar.I;
                if (zyVar != null) {
                    if (!jzVar.getUserConfig().q()) {
                        i7 = -1;
                    } else {
                        i7 = jzVar.E;
                    }
                    zyVar.d(i7, true);
                }
                jzVar.o0(true);
                return;
            case 12:
                org.telegram.ui.q30 q30Var = (org.telegram.ui.q30) obj3;
                org.telegram.ui.o00 o00Var = (org.telegram.ui.o00) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (o00Var != null) {
                    q30Var.getClass();
                    o00Var.setVisibility(0);
                }
                q30Var.f48928c = bitmap2;
                Paint paint = new Paint(1);
                q30Var.d = paint;
                Bitmap bitmap3 = q30Var.f48928c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                q30Var.f48929e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f12);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f13);
                q30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 13:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                s90Var.c();
                if (user != null) {
                    long j13 = userArr[0].f27109id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f27109id);
                    s90Var.u(new org.telegram.ui.r90(bundle2, user, userArr, j13), false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = tg0Var.f50266a2;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f27109id)) && tg0Var.d1(user2)) {
                            arrayList7.add(user2);
                            hashSet.add(Long.valueOf(user2.f27109id));
                        }
                    }
                }
                Boolean bool2 = tg0Var.f50277m2;
                if (bool2 != null && bool2.booleanValue()) {
                    ex exVar = new ex(15, tg0Var, hashSet);
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f27006q = str;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.p41(9, s12, exVar));
                    } else {
                        org.telegram.messenger.g0.h3(new sh.b(exVar, 28));
                    }
                    tg0Var.f50272h2 = i11;
                    return;
                }
                tg0Var.g1(true, true);
                return;
            case 15:
                org.telegram.ui.tg0 tg0Var2 = (org.telegram.ui.tg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f27109id)) && tg0Var2.d1(user3)) {
                            tg0Var2.f50266a2.add(user3);
                            hashSet2.add(Long.valueOf(user3.f27109id));
                        }
                    }
                }
                tg0Var2.g1(true, true);
                return;
            case 16:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    dh0Var.K1.setImageDrawable(null);
                    dh0Var.f44989t1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131748278, null), new org.telegram.ui.tc0(12, dh0Var, str2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = dh0Var.getContext().getResources().getDrawable(2131232398).mutate();
                    org.telegram.ui.ActionBar.t6.x(dh0Var.K1, mutate, org.telegram.ui.ActionBar.m6.f28225v6, dh0Var.I0, PorterDuff.Mode.SRC_IN);
                    dh0Var.K1.setImageDrawable(mutate);
                    if (user4.contact) {
                        dh0Var.f44989t1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131748279, null), new org.telegram.ui.tc0(13, dh0Var, user4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        dh0Var.f44989t1.setText(org.telegram.messenger.id.M0(2131748277, null));
                    }
                }
                dh0Var.O0(false);
                return;
            case 17:
                ArrayList arrayList8 = (ArrayList) obj2;
                k9[] k9VarArr = (k9[]) obj3;
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
                                        if (tL_messages_stickerSet.documents.get(i14).f26966id == longValue) {
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
                            k9VarArr[i12].m(org.telegram.messenger.hc.b(document), "40_40", org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.i6.f(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 18:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.ci0) obj2).run();
                return;
            case 19:
                org.telegram.ui.cs0 cs0Var = (org.telegram.ui.cs0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj2;
                Long l13 = (Long) obj;
                cs0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                f2Var3.presentFragment(new ProfileActivity(bundle3, null));
                cs0Var.c(false);
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.V6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.oo0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.V6;
                ((org.telegram.ui.ActionBar.u1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.va D = fi.va.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.N = a10;
                    fi.la laVar = D.f12946c1;
                    if (laVar != null) {
                        laVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.cx0 cx0Var = (org.telegram.ui.cx0) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.t11.k(tL_messages_stickerSet2, str4);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.fx0.f45862s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                cx0Var.f44826c = imageReceiver;
                cx0Var.f44827e.add(imageReceiver);
                int f18 = org.telegram.ui.lx.f();
                cx0Var.f44826c.W(0);
                org.telegram.ui.ex0 ex0Var = cx0Var.f44826c;
                String str5 = f18 + "_" + f18 + "_precache";
                org.telegram.ui.uu0 uu0Var = new org.telegram.ui.uu0(cx0Var, 6);
                ex0Var.getClass();
                ex0Var.f21200g1 = new org.telegram.ui.dx0(new Runnable[]{uu0Var});
                ex0Var.q0(org.telegram.messenger.hc.b(k10), str5, null, null, tL_messages_stickerSet2, 0);
                cx0Var.f44826c.P();
                cx0Var.f44829g[1] = true;
                cx0Var.a();
                return;
            case 23:
                Runnable runnable3 = (Runnable) obj;
                ((di.e) obj3).a((HashSet) obj2);
                return;
            case 24:
                org.telegram.ui.vz0 vz0Var = (org.telegram.ui.vz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    vz0Var.getClass();
                    view2.setVisibility(0);
                }
                vz0Var.f50838f = bitmap4;
                Paint paint2 = new Paint(1);
                vz0Var.f50839n = paint2;
                Bitmap bitmap5 = vz0Var.f50838f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                vz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f14 = 0.05f;
                } else {
                    f14 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix4, f14);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f15 = -0.02f;
                } else {
                    f15 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix4, f15);
                vz0Var.f50839n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                vz0Var.f50840r = new Matrix();
                return;
            case 25:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.o31.c0((org.telegram.ui.o31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.iz.f23445u0 = false;
                    org.telegram.messenger.iz.y();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    pj0 pj0Var = themeActivity.f42011b;
                    if (pj0Var != null && pj0Var.G && (K = pj0Var.K(themeActivity.M)) != null) {
                        themeActivity.f42009a.t(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.rw0 rw0Var = (org.telegram.ui.rw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    rw0Var.run();
                    return;
                } else {
                    gc.a0(themeActivity2).I(2131624011, org.telegram.messenger.id.M0(2131754311, null), org.telegram.messenger.id.M0(2131754312, null)).j();
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.l0.j("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    l8Var.a(str6);
                    return;
                }
                org.telegram.ui.Wallet.l0.H("sending disableBackup to server");
                org.telegram.ui.Wallet.g3.a(l0Var.f42749a, new ai.c0(11), null, null, null, new di.b0(6, l0Var, l8Var), true, true, new bg.v0((Object) null, 2));
                return;
            default:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                try {
                    ((org.telegram.messenger.c20) obj2).a((String) obj);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
        }
    }

    public ex(ArrayList arrayList, k9[] k9VarArr) {
        this.f33348a = 17;
        this.f33350c = arrayList;
        this.f33349b = k9VarArr;
    }
}
