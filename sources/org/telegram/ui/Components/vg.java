package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class vg implements org.telegram.messenger.q20 {
    public final int f31247a;
    public final Object f31248b;
    public final Object f31249c;

    public vg(int i10, Object obj, Object obj2) {
        this.f31247a = i10;
        this.f31248b = obj;
        this.f31249c = obj2;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f7;
        int[] iArr;
        TLRPC.Document document;
        int i10 = this.f31247a;
        float f10 = -0.04f;
        float f11 = 0.25f;
        int i11 = -1;
        TLRPC.User user = null;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        Object obj2 = this.f31249c;
        Object obj3 = this.f31248b;
        switch (i10) {
            case 0:
                bi biVar = (bi) obj3;
                vh vhVar = (vh) obj2;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = biVar.D3;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(i14).n1(vhVar.f31257c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new ag.k0(26, biVar, vhVar), 66);
                return;
            case 1:
                bi biVar2 = (bi) obj3;
                ((org.telegram.ui.un) obj2).f42459w5 = (org.telegram.messenger.oj) obj;
                boolean t12 = biVar2.t1(true, 0, 0, biVar2.H2, biVar2.e1());
                pe peVar = biVar2.Y1;
                if (peVar != null) {
                    peVar.g(!t12);
                    biVar2.Y1 = null;
                    return;
                }
                return;
            case 2:
                ((xh.i3) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
            case 3:
                mi miVar = (mi) obj3;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj2;
                Long l4 = (Long) obj;
                miVar.f28483i0 = false;
                if (l4 != null) {
                    user = vpVar.Z1(l4);
                }
                miVar.f28482h0 = user;
                if (user == null) {
                    z11 = true;
                }
                miVar.f28484j0 = z11;
                if (user != null) {
                    miVar.R();
                    return;
                }
                return;
            case 4:
                bl blVar = ((yk) obj3).f32752b;
                blVar.f24817u0.d(((al) obj2).f24427c, blVar.f24818v0, true, 0, ((Long) obj).longValue());
                blVar.f30947b.a(true);
                return;
            case 5:
                av avVar = (av) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.i0.g3(new zu(avVar, 1));
                    return;
                }
                return;
            case 6:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                at atVar = (at) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                atVar.run();
                return;
            case 7:
                tx txVar = (tx) obj3;
                ux uxVar = txVar.f30694a;
                vy vyVar = uxVar.F;
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(vyVar.f31865c1);
                String[] strArr = vyVar.W0;
                String str = uxVar.f31075w;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(txVar, (String) obj2, (Runnable) obj);
                if (!org.telegram.messenger.tz.F && !org.telegram.messenger.d20.i(vyVar.f31865c1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                b02.V(strArr, str, false, aVar, z10, false, true, false, 25);
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ux uxVar2 = ((tx) obj3).f30694a;
                if (ConnectionsManager.getInstance(uxVar2.F.f31865c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ux.E(uxVar2, runnable, arrayList2, false);
                    return;
                }
            case 9:
                py pyVar = (py) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(pyVar.f29460x.Q.f31865c1).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pyVar.f29456n.add(new nx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 10:
                j00 j00Var = (j00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (j00Var.S1 == null && !(j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    wb I = cc.a0(k2Var).I(2131623989, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750679, j00Var.X1)), org.telegram.messenger.cd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f32135j = 5000;
                    I.j();
                    return;
                }
                cc a02 = cc.a0(k2Var);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750627, j00Var.X1));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.cd.G(j00Var.Z1.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.cd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                wb I2 = a02.I(2131624024, W2, G);
                I2.f32135j = 5000;
                I2.j();
                return;
            case 11:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.i0.f16026q;
                    int j10 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j11 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.i0.f16020m) + org.telegram.messenger.i0.f16021n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j12 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j10, 0);
                    int j13 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.i0.f16020m) + org.telegram.messenger.i0.f16021n)) * bitmap.getHeight()), bitmap.getHeight() - j11, 0);
                    if ((j10 != 0 || j11 != 0 || j12 != bitmap.getWidth() || j13 != bitmap.getHeight()) && j12 > 0 && j13 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j10, j11, j12, j13);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = 0.04f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f11);
                float f12 = -0.07f;
                if (!org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = -0.07f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f10);
                Bitmap l10 = org.telegram.messenger.i0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = 2.0f;
                } else {
                    f7 = 3.0f;
                }
                colorMatrix2.setSaturation(f7);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f12 = -0.2f;
                }
                org.telegram.messenger.i0.h(colorMatrix2, f12);
                Bitmap l11 = org.telegram.messenger.i0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l10, l11);
                return;
            case 12:
                org.telegram.messenger.vp vpVar2 = (org.telegram.messenger.vp) obj3;
                pq0 pq0Var = (pq0) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    vpVar2.C4(true);
                    if (T != null) {
                        cc.a0(T).P(2131623981, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131745591, null), new wc(2, T)), true)).k(true);
                    }
                    pq0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    cc.a0(T).I(2131624011, org.telegram.messenger.cd.L0(2131754311, null), org.telegram.messenger.cd.L0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 13:
                zt0.a((zt0) obj3, (TL_stories.StoryItem) obj2, (th.y4) obj);
                return;
            case 14:
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l12 = (Long) obj;
                ltVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                k2Var2.presentFragment(new ProfileActivity(bundle, null));
                ltVar.o();
                return;
            case 15:
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) obj3;
                Boolean bool2 = (Boolean) obj;
                gtVar.getClass();
                ((org.telegram.messenger.q20) obj2).a(bool2);
                if (bool2.booleanValue()) {
                    gtVar.f37643a.o();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    ayVar.showDialog(new org.telegram.ui.ji0(activity, !w7.c6.a(), new org.telegram.ui.vv(activity, 0)));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.qn0 qn0Var = (org.telegram.ui.qn0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.i00 i00Var = ((org.telegram.ui.f00) obj3).e;
                if (!i00Var.getUserConfig().q()) {
                    i00Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) i00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                i00Var.E = intValue;
                qn0Var.a(intValue, true);
                org.telegram.ui.yz yzVar = i00Var.I;
                if (yzVar != null) {
                    if (i00Var.getUserConfig().q()) {
                        i11 = i00Var.E;
                    }
                    yzVar.d(i11, true);
                }
                i00Var.n0(true);
                return;
            case 18:
                org.telegram.ui.m40 m40Var = (org.telegram.ui.m40) obj3;
                bi.t0 t0Var = (bi.t0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (t0Var != null) {
                    m40Var.getClass();
                    t0Var.setVisibility(0);
                }
                m40Var.f39470c = bitmap2;
                Paint paint = new Paint(1);
                m40Var.d = paint;
                Bitmap bitmap3 = m40Var.f39470c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                m40Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = 0.05f;
                }
                org.telegram.messenger.i0.i(colorMatrix3, f11);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = -0.02f;
                }
                org.telegram.messenger.i0.h(colorMatrix3, f10);
                m40Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 19:
                org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ua0Var.c();
                if (user2 != null) {
                    long j14 = userArr[0].f19942id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f19942id);
                    ua0Var.u(new org.telegram.ui.ta0(bundle2, user2, userArr, j14), false);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.wh0 wh0Var = (org.telegram.ui.wh0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = wh0Var.X1;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f19942id)) && wh0Var.d1(user3)) {
                            arrayList5.add(user3);
                            hashSet.add(Long.valueOf(user3.f19942id));
                        }
                    }
                }
                Boolean bool3 = wh0Var.f43314j2;
                if (bool3 != null && bool3.booleanValue()) {
                    vg vgVar = new vg(21, wh0Var, hashSet);
                    org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f19839q = str2;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new ag.k0(5, r12, vgVar));
                    } else {
                        org.telegram.messenger.i0.g3(new lg.s(vgVar, 7));
                    }
                    wh0Var.f43309e2 = i12;
                    return;
                }
                wh0Var.g1(true, true);
                return;
            case 21:
                org.telegram.ui.wh0 wh0Var2 = (org.telegram.ui.wh0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f19942id)) && wh0Var2.d1(user4)) {
                            wh0Var2.X1.add(user4);
                            hashSet2.add(Long.valueOf(user4.f19942id));
                        }
                    }
                }
                wh0Var2.g1(true, true);
                return;
            case 22:
                org.telegram.ui.gi0 gi0Var = (org.telegram.ui.gi0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    gi0Var.H1.setImageDrawable(null);
                    gi0Var.f37566q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is not on Telegram. **Invite >**", -1, 0, new org.telegram.ui.uf0(3, gi0Var, str3), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                } else {
                    Drawable mutate = gi0Var.getContext().getResources().getDrawable(2131232397).mutate();
                    org.telegram.ui.ActionBar.a7.y(gi0Var.H1, mutate, org.telegram.ui.ActionBar.t6.f21259v6, gi0Var.I0, PorterDuff.Mode.SRC_IN);
                    gi0Var.H1.setImageDrawable(mutate);
                    if (user5.contact) {
                        gi0Var.f37566q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is already in your contacts. **View >**", -1, 0, new org.telegram.ui.uf0(4, gi0Var, user5), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                    } else {
                        gi0Var.f37566q1.setText("This phone number is on Telegram.");
                    }
                }
                gi0Var.O0(false);
                return;
            case 23:
                ArrayList arrayList6 = (ArrayList) obj3;
                g9[] g9VarArr = (g9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                        String str4 = (String) arrayList6.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i16).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i16).documents.get(0).longValue();
                                    for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                        if (tL_messages_stickerSet.documents.get(i17).f19799id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i17);
                                        }
                                    }
                                } else {
                                    i16++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            g9VarArr[i15].m(org.telegram.messenger.ic.b(document), "40_40", org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.k6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 24:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.hj0) obj2).run();
                return;
            case 25:
                org.telegram.ui.kt0 kt0Var = (org.telegram.ui.kt0) obj3;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l13 = (Long) obj;
                kt0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                k2Var3.presentFragment(new ProfileActivity(bundle3, null));
                kt0Var.c(false);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.R6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().l2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.vp0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    vh.o8 D = vh.o8.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    vh.e8 e8Var = D.f51613c1;
                    if (e8Var != null) {
                        e8Var.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ly0 ly0Var = (org.telegram.ui.ly0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.i31.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a1.g.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.oy0.f40392s;
                    org.telegram.messenger.f8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                ly0Var.f39438c = imageReceiver;
                ly0Var.e.add(imageReceiver);
                int f13 = org.telegram.ui.ly.f();
                ly0Var.f39438c.W(0);
                org.telegram.ui.ny0 ny0Var = ly0Var.f39438c;
                org.telegram.ui.wv0 wv0Var = new org.telegram.ui.wv0(ly0Var, 8);
                ny0Var.getClass();
                ny0Var.f14382g1 = new org.telegram.ui.my0(new Runnable[]{wv0Var});
                ny0Var.q0(org.telegram.messenger.ic.b(k10), f13 + "_" + f13 + "_precache", null, null, tL_messages_stickerSet2, 0);
                ly0Var.f39438c.P();
                ly0Var.f39440g[1] = true;
                ly0Var.a();
                return;
            default:
                Runnable runnable3 = (Runnable) obj;
                ((ag.z0) obj3).a((HashSet) obj2);
                return;
        }
    }
}
