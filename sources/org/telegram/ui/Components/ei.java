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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
public final class ei implements org.telegram.messenger.u10 {
    public final int f33399a;
    public final Object f33400b;
    public final Object f33401c;

    public ei(int i3, Object obj, Object obj2) {
        this.f33399a = i3;
        this.f33400b = obj;
        this.f33401c = obj2;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f10;
        int[] iArr;
        int i3;
        TLRPC.Document document;
        u4.d1 K;
        int i10 = this.f33399a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        TLRPC.User user = null;
        boolean z11 = true;
        int i11 = 0;
        Object obj2 = this.f33401c;
        Object obj3 = this.f33400b;
        switch (i10) {
            case 0:
                ni niVar = (ni) obj3;
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj2;
                Long l10 = (Long) obj;
                niVar.f36553j0 = false;
                if (l10 != null) {
                    user = hpVar.a2(l10);
                }
                niVar.f36552i0 = user;
                if (user != null) {
                    z11 = false;
                }
                niVar.f36554k0 = z11;
                if (user != null) {
                    niVar.S();
                    return;
                }
                return;
            case 1:
                nu nuVar = (nu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new mu(nuVar, 1));
                    return;
                }
                return;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                cl clVar = (cl) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                clVar.run();
                return;
            case 3:
                dx dxVar = (dx) obj3;
                ex exVar = dxVar.f33204a;
                ey eyVar = exVar.G;
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.f33529d1);
                String[] strArr = eyVar.X0;
                String str = exVar.f33497w;
                hr hrVar = new hr(dxVar, (String) obj2, (Runnable) obj, 1);
                if (!org.telegram.messenger.az.F && !org.telegram.messenger.h10.i(eyVar.f33529d1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                b02.V(strArr, str, false, hrVar, z10, false, true, false, 25);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ex exVar2 = ((dx) obj3).f33204a;
                if (ConnectionsManager.getInstance(exVar2.G.f33529d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ex.E(exVar2, runnable, arrayList2, false);
                    return;
                }
            case 5:
                xx xxVar = (xx) obj3;
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
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(xxVar.f40548x.R.f33529d1).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        xxVar.f40544n.add(new xw(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 6:
                rz rzVar = (rz) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (rzVar.T1 == null && !(rzVar.S1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    ac I = fc.a0(d2Var).I(2131623989, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750679, rzVar.Y1)), org.telegram.messenger.bd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f31792j = 5000;
                    I.j();
                    return;
                }
                fc a02 = fc.a0(d2Var);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750627, rzVar.Y1));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.bd.G(rzVar.f37846a2.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.bd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                ac I2 = a02.I(2131624025, X2, G);
                I2.f31792j = 5000;
                I2.j();
                return;
            case 7:
                View view = (View) obj3;
                e eVar = (e) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.g0.f22608q;
                    int j10 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j11 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.g0.f22602m) + org.telegram.messenger.g0.f22603n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j12 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j10, 0);
                    int j13 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.g0.f22602m) + org.telegram.messenger.g0.f22603n)) * bitmap.getHeight()), bitmap.getHeight() - j11, 0);
                    if ((j10 != 0 || j11 != 0 || j12 != bitmap.getWidth() || j13 != bitmap.getHeight()) && j12 > 0 && j13 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j10, j11, j12, j13);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f14 = 0.04f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f14);
                float f15 = -0.07f;
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = -0.07f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f13);
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l11.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f15 = -0.2f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f15);
                Bitmap l12 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l12.setHasAlpha(false);
                bitmap.recycle();
                eVar.a(l11, l12);
                return;
            case 8:
                org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj2;
                op0 op0Var = (op0) obj3;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    hpVar2.F4(true);
                    if (T != null) {
                        fc.a0(T).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745584, null), new bd(2, T)), true)).k(true);
                    }
                    op0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    fc.a0(T).I(2131624011, org.telegram.messenger.bd.M0(2131754311, null), org.telegram.messenger.bd.M0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 9:
                ws0.a((ws0) obj3, (TL_stories.StoryItem) obj2, (ei.s6) obj);
                return;
            case 10:
                n01 n01Var = (n01) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = n01Var.N;
                n01Var.O = 0;
                if (((String) obj2).equals(n01Var.M)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    n01Var.g();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.is isVar = (org.telegram.ui.is) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                Long l13 = (Long) obj;
                isVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                d2Var2.presentFragment(new ProfileActivity(bundle, null));
                isVar.o();
                return;
            case 12:
                org.telegram.ui.es esVar = (org.telegram.ui.es) obj3;
                Boolean bool = (Boolean) obj;
                esVar.getClass();
                ((org.telegram.messenger.u10) obj2).a(bool);
                if (bool.booleanValue()) {
                    esVar.f45025a.o();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uwVar.showDialog(new org.telegram.ui.zg0(activity, !b8.nf.a(), new org.telegram.ui.ou(activity, 0)));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.zl0 zl0Var = (org.telegram.ui.zl0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.ez ezVar = ((org.telegram.ui.bz) obj3).f44167e;
                if (!ezVar.getUserConfig().q()) {
                    ezVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) ezVar, 35, true));
                    return;
                }
                int intValue = num.intValue();
                ezVar.F = intValue;
                zl0Var.a(intValue, true);
                org.telegram.ui.ty tyVar = ezVar.J;
                if (tyVar != null) {
                    if (!ezVar.getUserConfig().q()) {
                        i3 = -1;
                    } else {
                        i3 = ezVar.F;
                    }
                    tyVar.d(i3, true);
                }
                ezVar.o0(true);
                return;
            case 15:
                org.telegram.ui.i30 i30Var = (org.telegram.ui.i30) obj3;
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (r0Var != null) {
                    i30Var.getClass();
                    r0Var.setVisibility(0);
                }
                i30Var.f46046c = bitmap2;
                Paint paint = new Paint(1);
                i30Var.d = paint;
                Bitmap bitmap3 = i30Var.f46046c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                i30Var.f46047e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix3, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix3, f11);
                i30Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 16:
                org.telegram.ui.m90 m90Var = (org.telegram.ui.m90) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                m90Var.c();
                if (user2 != null) {
                    long j14 = userArr[0].f27150id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f27150id);
                    m90Var.u(new org.telegram.ui.l90(bundle2, user2, userArr, j14), false);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.kg0 kg0Var = (org.telegram.ui.kg0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = kg0Var.Y1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f27150id)) && kg0Var.d1(user3)) {
                            arrayList7.add(user3);
                            hashSet.add(Long.valueOf(user3.f27150id));
                        }
                    }
                }
                Boolean bool2 = kg0Var.f46933k2;
                if (bool2 != null && bool2.booleanValue()) {
                    ei eiVar = new ei(18, kg0Var, hashSet);
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f27047q = str2;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.m21(12, s12, eiVar));
                    } else {
                        org.telegram.messenger.g0.h3(new xf.c(eiVar, 3));
                    }
                    kg0Var.f46928f2 = i11;
                    return;
                }
                kg0Var.g1(true, true);
                return;
            case 18:
                org.telegram.ui.kg0 kg0Var2 = (org.telegram.ui.kg0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f27150id)) && kg0Var2.d1(user4)) {
                            kg0Var2.Y1.add(user4);
                            hashSet2.add(Long.valueOf(user4.f27150id));
                        }
                    }
                }
                kg0Var2.g1(true, true);
                return;
            case 19:
                org.telegram.ui.vg0 vg0Var = (org.telegram.ui.vg0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    vg0Var.I1.setImageDrawable(null);
                    vg0Var.f50518r1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131748286, null), new org.telegram.ui.tb0(15, vg0Var, str3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                } else {
                    Drawable mutate = vg0Var.getContext().getResources().getDrawable(2131232398).mutate();
                    org.telegram.ui.ActionBar.r6.y(vg0Var.I1, mutate, org.telegram.ui.ActionBar.k6.f28214v6, vg0Var.J0, PorterDuff.Mode.SRC_IN);
                    vg0Var.I1.setImageDrawable(mutate);
                    if (user5.contact) {
                        vg0Var.f50518r1.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131748287, null), new org.telegram.ui.tb0(16, vg0Var, user5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
                    } else {
                        vg0Var.f50518r1.setText(org.telegram.messenger.bd.M0(2131748285, null));
                    }
                }
                vg0Var.O0(false);
                return;
            case 20:
                ArrayList arrayList8 = (ArrayList) obj3;
                k9[] k9VarArr = (k9[]) obj2;
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
                                        if (tL_messages_stickerSet.documents.get(i14).f27007id == longValue) {
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
                            k9VarArr[i12].m(org.telegram.messenger.ac.b(document), "40_40", org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.i6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 21:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.wh0) obj2).run();
                return;
            case 22:
                org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) obj3;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                Long l14 = (Long) obj;
                pr0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l14.longValue() >= 0) {
                    bundle3.putLong("user_id", l14.longValue());
                } else {
                    bundle3.putLong("chat_id", -l14.longValue());
                }
                d2Var3.presentFragment(new ProfileActivity(bundle3, null));
                pr0Var.c(false);
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.T6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().m2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.co0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 24:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.T6;
                ((org.telegram.ui.ActionBar.s1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gi.va D = gi.va.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a10 = profileActivity2.a();
                    D.O = a10;
                    gi.la laVar = D.f13710d1;
                    if (laVar != null) {
                        laVar.setDialogId(a10);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.pw0 pw0Var = (org.telegram.ui.pw0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.g11.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a1.g.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.sw0.f49630s;
                    org.telegram.messenger.a8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                pw0Var.f48694c = imageReceiver;
                pw0Var.f48695e.add(imageReceiver);
                int f16 = org.telegram.ui.fx.f();
                pw0Var.f48694c.W(0);
                org.telegram.ui.rw0 rw0Var = pw0Var.f48694c;
                String str6 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.pu0 pu0Var = new org.telegram.ui.pu0(pw0Var, 5);
                rw0Var.getClass();
                rw0Var.f21247h1 = new org.telegram.ui.qw0(new Runnable[]{pu0Var});
                rw0Var.q0(org.telegram.messenger.ac.b(k10), str6, null, null, tL_messages_stickerSet2, 0);
                pw0Var.f48694c.P();
                pw0Var.f48697g[1] = true;
                pw0Var.a();
                return;
            case 26:
                Runnable runnable3 = (Runnable) obj;
                ((ei.e) obj3).a((HashSet) obj2);
                return;
            case 27:
                org.telegram.ui.iz0 iz0Var = (org.telegram.ui.iz0) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    iz0Var.getClass();
                    view2.setVisibility(0);
                }
                iz0Var.f46465f = bitmap4;
                Paint paint2 = new Paint(1);
                iz0Var.f46467n = paint2;
                Bitmap bitmap5 = iz0Var.f46465f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                iz0Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix4, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix4, f11);
                iz0Var.f46467n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                iz0Var.f46468r = new Matrix();
                return;
            case 28:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.c31.c0((org.telegram.ui.c31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.az.f21668u0 = false;
                    org.telegram.messenger.az.y();
                    themeActivity.O0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    tj0 tj0Var = themeActivity.f42043b;
                    if (tj0Var != null && tj0Var.H && (K = tj0Var.K(themeActivity.N)) != null) {
                        themeActivity.f42041a.t(K, themeActivity.N);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ei(org.telegram.messenger.hp hpVar, op0 op0Var) {
        this.f33399a = 8;
        this.f33401c = hpVar;
        this.f33400b = op0Var;
    }
}
