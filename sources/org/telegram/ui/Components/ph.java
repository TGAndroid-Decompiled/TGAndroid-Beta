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
public final class ph implements org.telegram.messenger.w10 {
    public final int f38489a;
    public final Object f38490b;
    public final Object f38491c;

    public ph(int i7, Object obj, Object obj2) {
        this.f38489a = i7;
        this.f38490b = obj;
        this.f38491c = obj2;
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
        int i10 = this.f38489a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        TLRPC.User user = null;
        boolean z11 = true;
        int i11 = 0;
        Object obj2 = this.f38491c;
        Object obj3 = this.f38490b;
        switch (i10) {
            case 0:
                ti tiVar = (ti) obj3;
                ((org.telegram.ui.bn) obj2).f46436y5 = (org.telegram.messenger.kj) obj;
                boolean v12 = tiVar.v1(true, 0, 0, tiVar.L2, tiVar.g1());
                ef efVar = tiVar.f39962c2;
                if (efVar != null) {
                    efVar.h(!v12);
                    tiVar.f39962c2 = null;
                    return;
                }
                return;
            case 1:
                ((ki.t3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 2:
                dj djVar = (dj) obj3;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj2;
                Long l10 = (Long) obj;
                djVar.f34360j0 = false;
                if (l10 != null) {
                    user = mpVar.c2(l10);
                }
                djVar.f34359i0 = user;
                if (user != null) {
                    z11 = false;
                }
                djVar.f34361k0 = z11;
                if (user != null) {
                    djVar.T();
                    return;
                }
                return;
            case 3:
                zu zuVar = (zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.g3(new yu(zuVar, 1));
                    return;
                }
                return;
            case 4:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                bt btVar = (bt) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                btVar.run();
                return;
            case 5:
                ox oxVar = (ox) obj3;
                px pxVar = oxVar.f38273a;
                qy qyVar = pxVar.G;
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.f39047d1);
                String[] strArr = qyVar.X0;
                String str = pxVar.f38607w;
                rm rmVar = new rm(oxVar, (String) obj2, (Runnable) obj, 2);
                if (!org.telegram.messenger.bz.F && !org.telegram.messenger.i10.i(qyVar.f39047d1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d02.X(strArr, str, false, rmVar, z10, false, true, false, 25);
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                px pxVar2 = ((ox) obj3).f38273a;
                if (ConnectionsManager.getInstance(pxVar2.G.f39047d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    px.E(pxVar2, runnable, arrayList2, false);
                    return;
                }
            case 7:
                ky kyVar = (ky) obj3;
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
                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(kyVar.f36929x.R.f39047d1).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (n02 != null) {
                            arrayList = n02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        kyVar.f36925n.add(new jx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 8:
                g00 g00Var = (g00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if (g00Var.W1 == null && !(g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    fc I = kc.b0(g2Var).I(2131623990, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750661, g00Var.f35245b2)), org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f35091j = 5000;
                    I.j();
                    return;
                }
                kc b02 = kc.b0(g2Var);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750609, g00Var.f35245b2));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.gd.G(g00Var.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                fc I2 = b02.I(2131624026, W2, G);
                I2.f35091j = 5000;
                I2.j();
                return;
            case 9:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f24226q;
                    int j3 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f24220m) + org.telegram.messenger.g0.f24221n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f24220m) + org.telegram.messenger.g0.f24221n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
                    if ((j3 != 0 || j10 != 0 || j11 != bitmap.getWidth() || j12 != bitmap.getHeight()) && j11 > 0 && j12 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j3, j10, j11, j12);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f14 = 0.04f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f14);
                float f15 = -0.07f;
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    f13 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f13);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f15 = -0.2f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f15);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l11, l12);
                return;
            case 10:
                org.telegram.messenger.mp mpVar2 = (org.telegram.messenger.mp) obj3;
                s60 s60Var = (s60) obj2;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar2.Q4(true);
                    if (T != null) {
                        kc.b0(T).P(2131623982, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131745378, null), new kd(2, T)), true)).k(true);
                    }
                    s60Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    kc.b0(T).I(2131624012, org.telegram.messenger.gd.N0(2131754308, null), org.telegram.messenger.gd.N0(2131754309, null)).j();
                    return;
                } else {
                    return;
                }
            case 11:
                it0.a((it0) obj3, (TL_stories.StoryItem) obj2, (fi.i6) obj);
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
                k1Var.a();
                return;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                g2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                return;
            case 14:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.w10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.f49201a.o();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    bxVar.showDialog(new org.telegram.ui.hh0(activity, !c8.oa.a(), new org.telegram.ui.ru(activity, 0)));
                    return;
                }
                return;
            case 16:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.jz jzVar = ((org.telegram.ui.gz) obj3).f48380e;
                if (!jzVar.getUserConfig().q()) {
                    jzVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) jzVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                jzVar.F = intValue;
                gm0Var.a(intValue, true);
                org.telegram.ui.zy zyVar = jzVar.J;
                if (zyVar != null) {
                    if (!jzVar.getUserConfig().q()) {
                        i7 = -1;
                    } else {
                        i7 = jzVar.F;
                    }
                    zyVar.d(i7, true);
                }
                jzVar.o0(true);
                return;
            case 17:
                org.telegram.ui.p30 p30Var = (org.telegram.ui.p30) obj3;
                org.telegram.ui.tv tvVar = (org.telegram.ui.tv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (tvVar != null) {
                    p30Var.getClass();
                    tvVar.setVisibility(0);
                }
                p30Var.f50816c = bitmap2;
                Paint paint = new Paint(1);
                p30Var.d = paint;
                Bitmap bitmap3 = p30Var.f50816c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                p30Var.f50817e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f12);
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f11);
                p30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 18:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                r90Var.c();
                if (user2 != null) {
                    long j13 = userArr[0].f28641id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f28641id);
                    r90Var.u(new org.telegram.ui.q90(bundle2, user2, userArr, j13), false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = tg0Var.f52392b2;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f28641id)) && tg0Var.e1(user3)) {
                            arrayList5.add(user3);
                            hashSet.add(Long.valueOf(user3.f28641id));
                        }
                    }
                }
                Boolean bool2 = tg0Var.f52403n2;
                if (bool2 != null && bool2.booleanValue()) {
                    ph phVar = new ph(20, tg0Var, hashSet);
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f28538q = str2;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.d31(11, u12, phVar));
                    } else {
                        org.telegram.messenger.g0.g3(new ug.u1(phVar, 7));
                    }
                    tg0Var.f52398i2 = i11;
                    return;
                }
                tg0Var.h1(true, true);
                return;
            case 20:
                org.telegram.ui.tg0 tg0Var2 = (org.telegram.ui.tg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f28641id)) && tg0Var2.e1(user4)) {
                            tg0Var2.f52392b2.add(user4);
                            hashSet2.add(Long.valueOf(user4.f28641id));
                        }
                    }
                }
                tg0Var2.h1(true, true);
                return;
            case 21:
                org.telegram.ui.dh0 dh0Var = (org.telegram.ui.dh0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    dh0Var.L1.setImageDrawable(null);
                    dh0Var.f47136u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131748085, null), new org.telegram.ui.bd0(8, dh0Var, str3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = dh0Var.getContext().getResources().getDrawable(2131232403).mutate();
                    org.telegram.ui.ActionBar.u6.x(dh0Var.L1, mutate, org.telegram.ui.ActionBar.n6.f29786v6, dh0Var.J0, PorterDuff.Mode.SRC_IN);
                    dh0Var.L1.setImageDrawable(mutate);
                    if (user5.contact) {
                        dh0Var.f47136u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131748086, null), new org.telegram.ui.bd0(9, dh0Var, user5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        dh0Var.f47136u1.setText(org.telegram.messenger.gd.N0(2131748084, null));
                    }
                }
                dh0Var.P0(false);
                return;
            case 22:
                ArrayList arrayList6 = (ArrayList) obj3;
                p9[] p9VarArr = (p9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                        String str4 = (String) arrayList6.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i13).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i13).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i13).documents.get(0).longValue();
                                    for (int i14 = 0; i14 < tL_messages_stickerSet.documents.size(); i14++) {
                                        if (tL_messages_stickerSet.documents.get(i14).f28498id == longValue) {
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
                            p9VarArr[i12].m(org.telegram.messenger.fc.b(document), "40_40", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 23:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.ci0) obj2).run();
                return;
            case 24:
                org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) obj3;
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj2;
                Long l14 = (Long) obj;
                zr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                g2Var3.presentFragment(new ProfileActivity(bundle3, null));
                zr0Var.c(false);
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.Z6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().o2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.mo0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.t1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.nb D = hi.nb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.db dbVar = D.f15067d1;
                    if (dbVar != null) {
                        dbVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.yw0 yw0Var = (org.telegram.ui.yw0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.q11.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.bx0.f46655s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                yw0Var.f54439c = imageReceiver;
                yw0Var.f54440e.add(imageReceiver);
                int f16 = org.telegram.ui.mx.f();
                yw0Var.f54439c.X(0);
                org.telegram.ui.ax0 ax0Var = yw0Var.f54439c;
                String str6 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0(yw0Var, 6);
                ax0Var.getClass();
                ax0Var.f22737h1 = new org.telegram.ui.zw0(new Runnable[]{qu0Var});
                ax0Var.r0(org.telegram.messenger.fc.b(k10), str6, null, null, tL_messages_stickerSet2, 0);
                yw0Var.f54439c.Q();
                yw0Var.f54442g[1] = true;
                yw0Var.a();
                return;
            case 28:
                Runnable runnable3 = (Runnable) obj;
                ((fi.e) obj3).a((HashSet) obj2);
                return;
            default:
                org.telegram.ui.sz0 sz0Var = (org.telegram.ui.sz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    sz0Var.getClass();
                    view2.setVisibility(0);
                }
                sz0Var.f52185f = bitmap4;
                Paint paint2 = new Paint(1);
                sz0Var.f52187n = paint2;
                Bitmap bitmap5 = sz0Var.f52185f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                sz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix4, f12);
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix4, f11);
                sz0Var.f52187n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                sz0Var.f52188r = new Matrix();
                return;
        }
    }
}
