package org.telegram.ui.Components;

import android.app.Activity;
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
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class gh implements org.telegram.messenger.z10 {
    public final int f34965a;
    public final Object f34966b;
    public final Object f34967c;

    public gh(int i7, Object obj, Object obj2) {
        this.f34965a = i7;
        this.f34966b = obj;
        this.f34967c = obj2;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f10;
        int[] iArr;
        int i7;
        TLRPC.Document document;
        int i10 = this.f34965a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        TLRPC.User user = null;
        boolean z11 = true;
        int i11 = 0;
        Object obj2 = this.f34967c;
        Object obj3 = this.f34966b;
        switch (i10) {
            case 0:
                ((ki.y3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 1:
                vi viVar = (vi) obj3;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj2;
                Long l10 = (Long) obj;
                viVar.f40436j0 = false;
                if (l10 != null) {
                    user = npVar.a2(l10);
                }
                viVar.f40435i0 = user;
                if (user != null) {
                    z11 = false;
                }
                viVar.f40437k0 = z11;
                if (user != null) {
                    viVar.T();
                    return;
                }
                return;
            case 2:
                uu uuVar = (uu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new tu(uuVar, 1));
                    return;
                }
                return;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                vs vsVar = (vs) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                vsVar.run();
                return;
            case 4:
                kx kxVar = (kx) obj3;
                lx lxVar = kxVar.f36635a;
                ly lyVar = lxVar.G;
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.f36941d1);
                String[] strArr = lyVar.X0;
                String str = lxVar.f36924w;
                km kmVar = new km(kxVar, (String) obj2, (Runnable) obj, 2);
                if (!org.telegram.messenger.gz.F && !org.telegram.messenger.m10.i(lyVar.f36941d1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                b02.V(strArr, str, false, kmVar, z10, false, true, false, 25);
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                lx lxVar2 = ((kx) obj3).f36635a;
                if (ConnectionsManager.getInstance(lxVar2.G.f36941d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    lx.E(lxVar2, runnable, arrayList2, false);
                    return;
                }
            case 6:
                fy fyVar = (fy) obj3;
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
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(fyVar.f34748x.R.f36941d1).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fyVar.f34744n.add(new ex(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 7:
                zz zzVar = (zz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (zzVar.W1 == null && !(zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    xb I = cc.a0(e2Var).I(2131623990, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750678, zzVar.f42498b2)), org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f41635j = 5000;
                    I.j();
                    return;
                }
                cc a02 = cc.a0(e2Var);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750626, zzVar.f42498b2));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.hd.G(zzVar.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                xb I2 = a02.I(2131624026, X2, G);
                I2.f41635j = 5000;
                I2.j();
                return;
            case 8:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f23611q;
                    int j3 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f23605m) + org.telegram.messenger.g0.f23606n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f23605m) + org.telegram.messenger.g0.f23606n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
                    if ((j3 != 0 || j10 != 0 || j11 != bitmap.getWidth() || j12 != bitmap.getHeight()) && j11 > 0 && j12 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j3, j10, j11, j12);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f14 = 0.04f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f14);
                float f15 = -0.07f;
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f13 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f13);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f15 = -0.2f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f15);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l11, l12);
                return;
            case 9:
                org.telegram.messenger.np npVar2 = (org.telegram.messenger.np) obj3;
                qp0 qp0Var = (qp0) obj2;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    npVar2.G4(true);
                    if (T != null) {
                        cc.a0(T).P(2131623982, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745574, null), new bd(2, T)), true)).k(true);
                    }
                    qp0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    cc.a0(T).I(2131624012, org.telegram.messenger.hd.M0(2131754311, null), org.telegram.messenger.hd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 10:
                ys0.a((ys0) obj3, (TL_stories.StoryItem) obj2, (fi.l6) obj);
                return;
            case 11:
                v01 v01Var = (v01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = v01Var.N;
                v01Var.O = 0;
                if (((String) obj2).equals(v01Var.M)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    v01Var.h();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj3;
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                k1Var.getClass();
                if (u0Var != null) {
                    u0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                k1Var.e();
                return;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                e2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                return;
            case 14:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.z10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.f48406a.o();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    ywVar.showDialog(new org.telegram.ui.fh0(activity, !c8.ka.a(), new org.telegram.ui.su(activity, 0)));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.hz hzVar = ((org.telegram.ui.ez) obj3).f46926e;
                if (!hzVar.getUserConfig().q()) {
                    hzVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) hzVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                hzVar.F = intValue;
                gm0Var.a(intValue, true);
                org.telegram.ui.xy xyVar = hzVar.J;
                if (xyVar != null) {
                    if (!hzVar.getUserConfig().q()) {
                        i7 = -1;
                    } else {
                        i7 = hzVar.F;
                    }
                    xyVar.d(i7, true);
                }
                hzVar.o0(true);
                return;
            case 17:
                org.telegram.ui.n30 n30Var = (org.telegram.ui.n30) obj3;
                org.telegram.ui.rv rvVar = (org.telegram.ui.rv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (rvVar != null) {
                    n30Var.getClass();
                    rvVar.setVisibility(0);
                }
                n30Var.f49433c = bitmap2;
                Paint paint = new Paint(1);
                n30Var.d = paint;
                Bitmap bitmap3 = n30Var.f49433c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                n30Var.f49434e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f12);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f11);
                n30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 18:
                org.telegram.ui.q90 q90Var = (org.telegram.ui.q90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                q90Var.c();
                if (user2 != null) {
                    long j13 = userArr[0].f28200id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f28200id);
                    q90Var.u(new org.telegram.ui.p90(bundle2, user2, userArr, j13), false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = qg0Var.f50599b2;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f28200id)) && qg0Var.d1(user3)) {
                            arrayList7.add(user3);
                            hashSet.add(Long.valueOf(user3.f28200id));
                        }
                    }
                }
                Boolean bool2 = qg0Var.f50610n2;
                if (bool2 != null && bool2.booleanValue()) {
                    gh ghVar = new gh(20, qg0Var, hashSet);
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f28097q = str2;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.a31(11, s12, ghVar));
                    } else {
                        org.telegram.messenger.g0.h3(new vg.o(ghVar, 4));
                    }
                    qg0Var.f50605i2 = i11;
                    return;
                }
                qg0Var.g1(true, true);
                return;
            case 20:
                org.telegram.ui.qg0 qg0Var2 = (org.telegram.ui.qg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f28200id)) && qg0Var2.d1(user4)) {
                            qg0Var2.f50599b2.add(user4);
                            hashSet2.add(Long.valueOf(user4.f28200id));
                        }
                    }
                }
                qg0Var2.g1(true, true);
                return;
            case 21:
                org.telegram.ui.bh0 bh0Var = (org.telegram.ui.bh0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    bh0Var.L1.setImageDrawable(null);
                    bh0Var.f45751u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748278, null), new org.telegram.ui.jd0(7, bh0Var, str3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = bh0Var.getContext().getResources().getDrawable(2131232399).mutate();
                    org.telegram.ui.ActionBar.q6.x(bh0Var.L1, mutate, org.telegram.ui.ActionBar.j6.f29184v6, bh0Var.J0, PorterDuff.Mode.SRC_IN);
                    bh0Var.L1.setImageDrawable(mutate);
                    if (user5.contact) {
                        bh0Var.f45751u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131748279, null), new org.telegram.ui.jd0(8, bh0Var, user5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        bh0Var.f45751u1.setText(org.telegram.messenger.hd.M0(2131748277, null));
                    }
                }
                bh0Var.O0(false);
                return;
            case 22:
                ArrayList arrayList8 = (ArrayList) obj3;
                i9[] i9VarArr = (i9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                        String str4 = (String) arrayList8.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i13).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i13).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i13).documents.get(0).longValue();
                                    for (int i14 = 0; i14 < tL_messages_stickerSet.documents.size(); i14++) {
                                        if (tL_messages_stickerSet.documents.get(i14).f28057id == longValue) {
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
                            i9VarArr[i12].m(org.telegram.messenger.gc.b(document), "40_40", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 23:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.bi0) obj2).run();
                return;
            case 24:
                org.telegram.ui.xr0 xr0Var = (org.telegram.ui.xr0) obj3;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj2;
                Long l14 = (Long) obj;
                xr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                e2Var3.presentFragment(new ProfileActivity(bundle3, null));
                xr0Var.c(false);
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.X6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.jo0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.X6;
                ((org.telegram.ui.ActionBar.t1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.sa D = hi.sa.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.ia iaVar = D.f15048d1;
                    if (iaVar != null) {
                        iaVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.n11.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.zw0.f54035s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                ww0Var.f53016c = imageReceiver;
                ww0Var.f53017e.add(imageReceiver);
                int f16 = org.telegram.ui.jx.f();
                ww0Var.f53016c.W(0);
                org.telegram.ui.yw0 yw0Var = ww0Var.f53016c;
                String str6 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.pu0 pu0Var = new org.telegram.ui.pu0(ww0Var, 6);
                yw0Var.getClass();
                yw0Var.f22276h1 = new org.telegram.ui.xw0(new Runnable[]{pu0Var});
                yw0Var.q0(org.telegram.messenger.gc.b(k10), str6, null, null, tL_messages_stickerSet2, 0);
                ww0Var.f53016c.P();
                ww0Var.f53019g[1] = true;
                ww0Var.a();
                return;
            case 28:
                Runnable runnable3 = (Runnable) obj;
                ((fi.e) obj3).a((HashSet) obj2);
                return;
            default:
                org.telegram.ui.pz0 pz0Var = (org.telegram.ui.pz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    pz0Var.getClass();
                    view2.setVisibility(0);
                }
                pz0Var.f50399f = bitmap4;
                Paint paint2 = new Paint(1);
                pz0Var.f50401n = paint2;
                Bitmap bitmap5 = pz0Var.f50399f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                pz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix4, f12);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix4, f11);
                pz0Var.f50401n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                pz0Var.f50402r = new Matrix();
                return;
        }
    }
}
