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
public final class vg implements org.telegram.messenger.r20 {
    public final int f31282a;
    public final Object f31283b;
    public final Object f31284c;

    public vg(int i10, Object obj, Object obj2) {
        this.f31282a = i10;
        this.f31283b = obj;
        this.f31284c = obj2;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String G;
        float f7;
        float f10;
        int[] iArr;
        float f11;
        TLRPC.Document document;
        int i10 = this.f31282a;
        float f12 = 0.25f;
        int i11 = -1;
        TLRPC.User user = null;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        Object obj2 = this.f31284c;
        Object obj3 = this.f31283b;
        switch (i10) {
            case 0:
                bi biVar = (bi) obj3;
                vh vhVar = (vh) obj2;
                Boolean bool = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i14 = biVar.D3;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.wp.r1(i14).n1(vhVar.f31306c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i14).sendRequest(tL_messages_toggleBotInAttachMenu, new ag.k0(26, biVar, vhVar), 66);
                return;
            case 1:
                bi biVar2 = (bi) obj3;
                ((org.telegram.ui.un) obj2).f42270w5 = (org.telegram.messenger.pj) obj;
                boolean t12 = biVar2.t1(true, 0, 0, biVar2.H2, biVar2.e1());
                pe peVar = biVar2.Y1;
                if (peVar != null) {
                    peVar.g(!t12);
                    biVar2.Y1 = null;
                    return;
                }
                return;
            case 2:
                ((xh.j3) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
            case 3:
                mi miVar = (mi) obj3;
                org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) obj2;
                Long l4 = (Long) obj;
                miVar.f28487i0 = false;
                if (l4 != null) {
                    user = wpVar.Z1(l4);
                }
                miVar.f28486h0 = user;
                if (user == null) {
                    z11 = true;
                }
                miVar.f28488j0 = z11;
                if (user != null) {
                    miVar.R();
                    return;
                }
                return;
            case 4:
                bl blVar = ((yk) obj3).f32863b;
                blVar.f24872u0.d(((al) obj2).f24438c, blVar.f24873v0, true, 0, ((Long) obj).longValue());
                blVar.f30964b.a(true);
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
                ux uxVar = txVar.f30727a;
                vy vyVar = uxVar.F;
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(vyVar.f31943c1);
                String[] strArr = vyVar.W0;
                String str = uxVar.f31105w;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(txVar, (String) obj2, (Runnable) obj);
                if (!org.telegram.messenger.uz.F && !org.telegram.messenger.e20.i(vyVar.f31943c1).q()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                b02.V(strArr, str, false, aVar, z10, false, true, false, 25);
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ux uxVar2 = ((tx) obj3).f30727a;
                if (ConnectionsManager.getInstance(uxVar2.F.f31943c1).getConnectionState() != 3) {
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
                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.vi.b0(pyVar.f29571x.Q.f31943c1).l0(org.telegram.messenger.vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pyVar.f29567n.add(new nx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 10:
                j00 j00Var = (j00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (j00Var.S1 == null && !(j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    wb I = cc.a0(k2Var).I(2131623989, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750679, j00Var.X1)), org.telegram.messenger.dd.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I.f32201j = 5000;
                    I.j();
                    return;
                }
                cc a02 = cc.a0(k2Var);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750627, j00Var.X1));
                if (arrayList4.size() <= 0) {
                    G = org.telegram.messenger.dd.G(j00Var.Z1.size(), "FolderLinkUpdatedSubtitle", new Object[0]);
                } else {
                    G = org.telegram.messenger.dd.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]);
                }
                wb I2 = a02.I(2131624024, W2, G);
                I2.f32201j = 5000;
                I2.j();
                return;
            case 11:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    Point point = org.telegram.messenger.i0.f16172q;
                    int j10 = Utilities.j((int) ((iArr[0] / point.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int j11 = Utilities.j((int) ((iArr[1] / ((point.y + org.telegram.messenger.i0.f16166m) + org.telegram.messenger.i0.f16167n)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int j12 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap.getWidth()), bitmap.getWidth() - j10, 0);
                    int j13 = Utilities.j((int) ((view.getHeight() / ((point.y + org.telegram.messenger.i0.f16166m) + org.telegram.messenger.i0.f16167n)) * bitmap.getHeight()), bitmap.getHeight() - j11, 0);
                    if ((j10 != 0 || j11 != 0 || j12 != bitmap.getWidth() || j13 != bitmap.getHeight()) && j12 > 0 && j13 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, j10, j11, j12, j13);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f12 = 0.04f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f12);
                float f13 = -0.07f;
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.04f;
                } else {
                    f7 = -0.07f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f7);
                Bitmap l10 = org.telegram.messenger.i0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f13 = -0.2f;
                }
                org.telegram.messenger.i0.h(colorMatrix2, f13);
                Bitmap l11 = org.telegram.messenger.i0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                dVar.a(l10, l11);
                return;
            case 12:
                org.telegram.messenger.wp wpVar2 = (org.telegram.messenger.wp) obj3;
                qq0 qq0Var = (qq0) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    wpVar2.C4(true);
                    if (T != null) {
                        cc.a0(T).P(2131623981, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(2131745591, null), new wc(2, T)), true)).k(true);
                    }
                    qq0Var.a(Boolean.TRUE);
                    return;
                } else if (T != null) {
                    cc.a0(T).I(2131624011, org.telegram.messenger.dd.L0(2131754311, null), org.telegram.messenger.dd.L0(2131754312, null)).j();
                    return;
                } else {
                    return;
                }
            case 13:
                au0.a((au0) obj3, (TL_stories.StoryItem) obj2, (th.y4) obj);
                return;
            case 14:
                u11 u11Var = (u11) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = u11Var.M;
                u11Var.N = 0;
                if (((String) obj2).equals(u11Var.L)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    u11Var.g();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l12 = (Long) obj;
                ktVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                k2Var2.presentFragment(new ProfileActivity(bundle, null));
                ktVar.o();
                return;
            case 16:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) obj3;
                Boolean bool2 = (Boolean) obj;
                ftVar.getClass();
                ((org.telegram.messenger.r20) obj2).a(bool2);
                if (bool2.booleanValue()) {
                    ftVar.f37231a.o();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    zxVar.showDialog(new org.telegram.ui.hi0(activity, !w7.c6.a(), new org.telegram.ui.uv(activity, 0)));
                    return;
                }
                return;
            case 18:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.h00 h00Var = ((org.telegram.ui.e00) obj3).e;
                if (!h00Var.getUserConfig().q()) {
                    h00Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) h00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                h00Var.E = intValue;
                on0Var.a(intValue, true);
                org.telegram.ui.xz xzVar = h00Var.I;
                if (xzVar != null) {
                    if (h00Var.getUserConfig().q()) {
                        i11 = h00Var.E;
                    }
                    xzVar.d(i11, true);
                }
                h00Var.o0(true);
                return;
            case 19:
                org.telegram.ui.l40 l40Var = (org.telegram.ui.l40) obj3;
                bi.t0 t0Var = (bi.t0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (t0Var != null) {
                    l40Var.getClass();
                    t0Var.setVisibility(0);
                }
                l40Var.f39074c = bitmap2;
                Paint paint = new Paint(1);
                l40Var.d = paint;
                Bitmap bitmap3 = l40Var.f39074c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                l40Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f12 = 0.05f;
                }
                org.telegram.messenger.i0.i(colorMatrix3, f12);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.i0.h(colorMatrix3, f11);
                l40Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 20:
                org.telegram.ui.ta0 ta0Var = (org.telegram.ui.ta0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ta0Var.c();
                if (user2 != null) {
                    long j14 = userArr[0].f19943id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user2.f19943id);
                    ta0Var.u(new org.telegram.ui.sa0(bundle2, user2, userArr, j14), false);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.uh0 uh0Var = (org.telegram.ui.uh0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = uh0Var.X1;
                arrayList7.clear();
                if (list != null) {
                    for (TLRPC.User user3 : list) {
                        if (user3 != null && !hashSet.contains(Long.valueOf(user3.f19943id)) && uh0Var.d1(user3)) {
                            arrayList7.add(user3);
                            hashSet.add(Long.valueOf(user3.f19943id));
                        }
                    }
                }
                Boolean bool3 = uh0Var.f41952j2;
                if (bool3 != null && bool3.booleanValue()) {
                    vg vgVar = new vg(22, uh0Var, hashSet);
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f19840q = str2;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new ag.k0(5, r12, vgVar));
                    } else {
                        org.telegram.messenger.i0.g3(new lg.s(vgVar, 7));
                    }
                    uh0Var.f41947e2 = i12;
                    return;
                }
                uh0Var.g1(true, true);
                return;
            case 22:
                org.telegram.ui.uh0 uh0Var2 = (org.telegram.ui.uh0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user4 : list2) {
                        if (user4 != null && !hashSet2.contains(Long.valueOf(user4.f19943id)) && uh0Var2.d1(user4)) {
                            uh0Var2.X1.add(user4);
                            hashSet2.add(Long.valueOf(user4.f19943id));
                        }
                    }
                }
                uh0Var2.g1(true, true);
                return;
            case 23:
                org.telegram.ui.ei0 ei0Var = (org.telegram.ui.ei0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user5 = (TLRPC.User) obj;
                if (user5 == null) {
                    ei0Var.H1.setImageDrawable(null);
                    ei0Var.f36843q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is not on Telegram. **Invite >**", -1, 0, new org.telegram.ui.if0(4, ei0Var, str3), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                } else {
                    Drawable mutate = ei0Var.getContext().getResources().getDrawable(2131232397).mutate();
                    org.telegram.ui.ActionBar.a7.y(ei0Var.H1, mutate, org.telegram.ui.ActionBar.t6.f21260v6, ei0Var.I0, PorterDuff.Mode.SRC_IN);
                    ei0Var.H1.setImageDrawable(mutate);
                    if (user5.contact) {
                        ei0Var.f36843q1.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2("This phone number is already in your contacts. **View >**", -1, 0, new org.telegram.ui.if0(5, ei0Var, user5), null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
                    } else {
                        ei0Var.f36843q1.setText("This phone number is on Telegram.");
                    }
                }
                ei0Var.O0(false);
                return;
            case 24:
                ArrayList arrayList8 = (ArrayList) obj3;
                g9[] g9VarArr = (g9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                        String str4 = (String) arrayList8.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i16).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i16).documents.get(0).longValue();
                                    for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                        if (tL_messages_stickerSet.documents.get(i17).f19800id == longValue) {
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
                            g9VarArr[i15].m(org.telegram.messenger.jc.b(document), "40_40", org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, 40, false, null, false), document), "40_40", org.telegram.messenger.k6.f(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 25:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.fj0) obj2).run();
                return;
            case 26:
                org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) obj3;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj2;
                Long l13 = (Long) obj;
                jt0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle3.putLong("user_id", l13.longValue());
                } else {
                    bundle3.putLong("chat_id", -l13.longValue());
                }
                k2Var3.presentFragment(new ProfileActivity(bundle3, null));
                jt0Var.c(false);
                return;
            case 27:
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
                profileActivity.getMessagesController().l2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.tp0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.S6;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    vh.o8 D = vh.o8.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    vh.e8 e8Var = D.f51628c1;
                    if (e8Var != null) {
                        e8Var.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            default:
                org.telegram.ui.ky0 ky0Var = (org.telegram.ui.ky0) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.g31.k(tL_messages_stickerSet2, str5);
                if (k10 == null) {
                    StringBuilder u10 = a1.g.u("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.ny0.f39984s;
                    org.telegram.messenger.f8.d(u10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver(null);
                ky0Var.f39028c = imageReceiver;
                ky0Var.e.add(imageReceiver);
                int f14 = org.telegram.ui.ky.f();
                ky0Var.f39028c.W(0);
                org.telegram.ui.my0 my0Var = ky0Var.f39028c;
                String str6 = f14 + "_" + f14 + "_precache";
                org.telegram.ui.vv0 vv0Var = new org.telegram.ui.vv0(ky0Var, 8);
                my0Var.getClass();
                my0Var.f14383g1 = new org.telegram.ui.ly0(new Runnable[]{vv0Var});
                my0Var.q0(org.telegram.messenger.jc.b(k10), str6, null, null, tL_messages_stickerSet2, 0);
                ky0Var.f39028c.P();
                ky0Var.f39030g[1] = true;
                ky0Var.a();
                return;
        }
    }
}
