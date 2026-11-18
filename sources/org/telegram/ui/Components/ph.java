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
public final class ph implements org.telegram.messenger.x10 {
    public final int f38434a;
    public final Object f38435b;
    public final Object f38436c;

    public ph(int i7, Object obj, Object obj2) {
        this.f38434a = i7;
        this.f38435b = obj;
        this.f38436c = obj2;
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
        int i10 = this.f38434a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        TLRPC.User user = null;
        boolean z11 = true;
        int i11 = 0;
        Object obj2 = this.f38436c;
        Object obj3 = this.f38435b;
        switch (i10) {
            case 0:
                ((ki.t3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 1:
                cj cjVar = (cj) obj3;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj2;
                Long l10 = (Long) obj;
                cjVar.f34025j0 = false;
                if (l10 != null) {
                    user = mpVar.c2(l10);
                }
                cjVar.f34024i0 = user;
                if (user != null) {
                    z11 = false;
                }
                cjVar.f34026k0 = z11;
                if (user != null) {
                    cjVar.T();
                    return;
                }
                return;
            case 2:
                zu zuVar = (zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.g3(new yu(zuVar, 1));
                    return;
                }
                return;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                dw dwVar = (dw) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                dwVar.run();
                return;
            case 4:
                px pxVar = (px) obj3;
                qx qxVar = pxVar.f38591a;
                ry ryVar = qxVar.G;
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.f39345d1);
                String[] strArr = ryVar.X0;
                String str = qxVar.f38931w;
                rm rmVar = new rm(pxVar, (String) obj2, (Runnable) obj, 2);
                if (!org.telegram.messenger.bz.F && !org.telegram.messenger.j10.i(ryVar.f39345d1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d02.X(strArr, str, false, rmVar, z10, false, true, false, 25);
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                qx qxVar2 = ((px) obj3).f38591a;
                if (ConnectionsManager.getInstance(qxVar2.G.f39345d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    qx.E(qxVar2, runnable, arrayList2, false);
                    return;
                }
            case 6:
                ly lyVar = (ly) obj3;
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
                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(lyVar.f37268x.R.f39345d1).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (n02 != null) {
                            arrayList = n02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        lyVar.f37264n.add(new kx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 7:
                g00 g00Var = (g00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                if (g00Var.W1 == null && !(g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    gc I = lc.b0(h2Var).I(2131623990, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750662, g00Var.f35250b2)), org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f35461j = 5000;
                    I.j();
                    return;
                }
                lc b02 = lc.b0(h2Var);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750610, g00Var.f35250b2));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.gd.G(g00Var.d2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                gc I2 = b02.I(2131624026, W2, G);
                I2.f35461j = 5000;
                I2.j();
                return;
            case 8:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f24121q;
                    int j3 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j10 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f24115m) + org.telegram.messenger.g0.f24116n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j11 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j3, 0);
                    int j12 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f24115m) + org.telegram.messenger.g0.f24116n)) * bitmap.getHeight()), bitmap.getHeight() - j10, 0);
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
            case 9:
                org.telegram.messenger.mp mpVar2 = (org.telegram.messenger.mp) obj3;
                t60 t60Var = (t60) obj2;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar2.Q4(true);
                    if (T != null) {
                        lc.b0(T).P(2131623982, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131745379, null), new kd(2, T)), true)).k(true);
                    }
                    t60Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    lc.b0(T).I(2131624012, org.telegram.messenger.gd.M0(2131754309, null), org.telegram.messenger.gd.M0(2131754310, null)).j();
                    return;
                } else {
                    return;
                }
            case 10:
                gt0.a((gt0) obj3, (TL_stories.StoryItem) obj2, (fi.i6) obj);
                return;
            case 11:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj3;
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                j1Var.getClass();
                if (t0Var != null) {
                    t0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                j1Var.a();
                return;
            case 12:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj3;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj2;
                Long l13 = (Long) obj;
                nsVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                h2Var2.presentFragment(new ProfileActivity(bundle, null));
                nsVar.o();
                return;
            case 13:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) obj3;
                Boolean bool = (Boolean) obj;
                jsVar.getClass();
                ((org.telegram.messenger.x10) obj2).a(bool);
                if (bool.booleanValue()) {
                    jsVar.f49073a.o();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    cxVar.showDialog(new org.telegram.ui.ih0(activity, !c8.na.a(), new org.telegram.ui.su(activity, 0)));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.im0 im0Var = (org.telegram.ui.im0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.kz kzVar = ((org.telegram.ui.hz) obj3).f48548e;
                if (!kzVar.getUserConfig().q()) {
                    kzVar.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) kzVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                kzVar.F = intValue;
                im0Var.a(intValue, true);
                org.telegram.ui.az azVar = kzVar.J;
                if (azVar != null) {
                    if (!kzVar.getUserConfig().q()) {
                        i7 = -1;
                    } else {
                        i7 = kzVar.F;
                    }
                    azVar.d(i7, true);
                }
                kzVar.o0(true);
                return;
            case 16:
                org.telegram.ui.q30 q30Var = (org.telegram.ui.q30) obj3;
                org.telegram.ui.uv uvVar = (org.telegram.ui.uv) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (uvVar != null) {
                    q30Var.getClass();
                    uvVar.setVisibility(0);
                }
                q30Var.f51076c = bitmap2;
                Paint paint = new Paint(1);
                q30Var.d = paint;
                Bitmap bitmap3 = q30Var.f51076c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                q30Var.f51077e = bitmapShader;
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
                q30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 17:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                r90Var.c();
                if (user2 != null) {
                    long j13 = userArr[0].f28554id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f28554id);
                    r90Var.u(new org.telegram.ui.q90(bundle2, user2, userArr, j13), false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ug0 ug0Var = (org.telegram.ui.ug0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = ug0Var.f52553b2;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f28554id)) && ug0Var.e1(user3)) {
                            arrayList5.add(user3);
                            hashSet.add(Long.valueOf(user3.f28554id));
                        }
                    }
                }
                Boolean bool2 = ug0Var.f52564n2;
                if (bool2 != null && bool2.booleanValue()) {
                    ph phVar = new ph(19, ug0Var, hashSet);
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24773t0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f28451q = str2;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.e31(11, u12, phVar));
                    } else {
                        org.telegram.messenger.g0.g3(new v4.p(phVar, 6));
                    }
                    ug0Var.f52559i2 = i11;
                    return;
                }
                ug0Var.h1(true, true);
                return;
            case 19:
                org.telegram.ui.ug0 ug0Var2 = (org.telegram.ui.ug0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f28554id)) && ug0Var2.e1(user4)) {
                            ug0Var2.f52553b2.add(user4);
                            hashSet2.add(Long.valueOf(user4.f28554id));
                        }
                    }
                }
                ug0Var2.h1(true, true);
                return;
            case 20:
                org.telegram.ui.eh0 eh0Var = (org.telegram.ui.eh0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    eh0Var.L1.setImageDrawable(null);
                    eh0Var.f47269u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131748086, null), new org.telegram.ui.ve0(2, eh0Var, str3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = eh0Var.getContext().getResources().getDrawable(2131232400).mutate();
                    org.telegram.ui.ActionBar.u6.x(eh0Var.L1, mutate, org.telegram.ui.ActionBar.n6.f29731v6, eh0Var.J0, PorterDuff.Mode.SRC_IN);
                    eh0Var.L1.setImageDrawable(mutate);
                    if (user5.contact) {
                        eh0Var.f47269u1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131748087, null), new org.telegram.ui.ve0(3, eh0Var, user5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        eh0Var.f47269u1.setText(org.telegram.messenger.gd.M0(2131748085, null));
                    }
                }
                eh0Var.P0(false);
                return;
            case 21:
                ArrayList arrayList6 = (ArrayList) obj3;
                q9[] q9VarArr = (q9[]) obj2;
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
                                        if (tL_messages_stickerSet.documents.get(i14).f28411id == longValue) {
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
                            q9VarArr[i12].m(org.telegram.messenger.fc.b(document), "40_40", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.j6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 22:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.ei0) obj2).run();
                return;
            case 23:
                org.telegram.ui.as0 as0Var = (org.telegram.ui.as0) obj3;
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) obj2;
                Long l14 = (Long) obj;
                as0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                h2Var3.presentFragment(new ProfileActivity(bundle3, null));
                as0Var.c(false);
                return;
            case 24:
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
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.u1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hi.ta D = hi.ta.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    hi.ja jaVar = D.f15436d1;
                    if (jaVar != null) {
                        jaVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.r11.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a8.p0.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.dx0.f47068s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                ax0Var.f45695c = imageReceiver;
                ax0Var.f45696e.add(imageReceiver);
                int f16 = org.telegram.ui.nx.f();
                ax0Var.f45695c.W(0);
                org.telegram.ui.cx0 cx0Var = ax0Var.f45695c;
                String str6 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.ru0 ru0Var = new org.telegram.ui.ru0(ax0Var, 6);
                cx0Var.getClass();
                cx0Var.f22642h1 = new org.telegram.ui.bx0(new Runnable[]{ru0Var});
                cx0Var.q0(org.telegram.messenger.fc.b(k10), str6, null, null, tL_messages_stickerSet2, 0);
                ax0Var.f45695c.P();
                ax0Var.f45698g[1] = true;
                ax0Var.a();
                return;
            case 27:
                Runnable runnable3 = (Runnable) obj;
                ((fi.e) obj3).a((HashSet) obj2);
                return;
            case 28:
                org.telegram.ui.tz0 tz0Var = (org.telegram.ui.tz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    tz0Var.getClass();
                    view2.setVisibility(0);
                }
                tz0Var.f52391f = bitmap4;
                Paint paint2 = new Paint(1);
                tz0Var.f52393n = paint2;
                Bitmap bitmap5 = tz0Var.f52391f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                tz0Var.h = bitmapShader2;
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
                tz0Var.f52393n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                tz0Var.f52394r = new Matrix();
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.o31.c0((org.telegram.ui.o31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
        }
    }
}
