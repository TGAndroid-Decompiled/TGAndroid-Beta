package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ro implements Runnable {
    public final int f37717a;
    public final Object f37718b;
    public final Object f37719c;

    public ro(int i7, Object obj, Object obj2) {
        this.f37717a = i7;
        this.f37718b = obj;
        this.f37719c = obj2;
    }

    @Override
    public final void run() {
        float f10;
        boolean z9;
        String str;
        Bitmap createBitmap;
        boolean z10;
        long j3;
        m50 m50Var;
        org.telegram.ui.bb bbVar;
        int i7 = this.f37717a;
        String str2 = "";
        boolean z11 = true;
        int i10 = 0;
        Object obj = this.f37719c;
        Object obj2 = this.f37718b;
        switch (i7) {
            case 0:
                ((so) obj2).f38036b.R0((ArrayList) obj);
                return;
            case 1:
                ((org.telegram.ui.ActionBar.w2) obj2).dismiss();
                vf.c.t((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 2:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = k3Var.getText().toString();
                if (!kq.a(charSequence, "bot") && kq.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                i3Var.setRightText(str2);
                int L = org.telegram.messenger.g0.L(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f10 = 21.0f;
                } else {
                    f10 = 63.0f;
                }
                i3Var.setPadding(0, L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(15.0f));
                return;
            case 3:
                sq sqVar = (sq) obj2;
                sqVar.getClass();
                ((fi.d) obj).setLoading(false);
                sqVar.dismiss();
                return;
            case 4:
                sq sqVar2 = (sq) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    sqVar2.W1 = groupcallstreamrtmpurl.url;
                    sqVar2.X1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sqVar2.X1);
                    sqVar2.Y1 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f38777a |= 256;
                    obj3.f38778b = 0;
                    obj3.f38779c = spannableStringBuilder.length();
                    sqVar2.Y1.setSpan(new vy0(obj3, 0), 0, sqVar2.Y1.length(), 0);
                    sqVar2.Z1.O(false);
                    return;
                }
                return;
            case 5:
                tr trVar = (tr) obj2;
                TLObject tLObject2 = (TLObject) obj;
                qr qrVar = trVar.f38375b;
                ArrayList arrayList = trVar.h;
                int i11 = trVar.f38374a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.qp.s1(i11).Y3(popularappbots.users, false);
                    org.telegram.messenger.yr.a0(i11).m1(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    trVar.f38379g = str3;
                    if (str3 == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    trVar.f38377e = z9;
                    long currentTimeMillis = System.currentTimeMillis();
                    trVar.f38378f = currentTimeMillis;
                    if (!trVar.f38380i) {
                        trVar.f38380i = true;
                        String str4 = trVar.f38379g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12 = com.google.android.recaptcha.internal.a.g(i12, 1, ((TLRPC.User) arrayList.get(i12)).f27109id, arrayList2)) {
                        }
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i11);
                        a02.f26723a.c(new bi.i0(trVar, a02, arrayList2, currentTimeMillis, str, 11));
                    }
                    trVar.f38376c = false;
                    qrVar.run();
                    return;
                }
                trVar.f38379g = null;
                trVar.f38377e = true;
                trVar.f38376c = false;
                qrVar.run();
                return;
            case 6:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new ro(7, (os) obj2, decodeFile));
                return;
            case 7:
                ((os) obj2).setImage((Bitmap) obj);
                return;
            case 8:
                ((EditTextBoldCursor) obj2).f31371o0.draw((Canvas) obj);
                return;
            case 9:
                org.telegram.messenger.qp.s1(((bu) obj2).f32359a.f28669a).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 10:
                org.telegram.messenger.qp.s1(((bw) obj2).f32376a.f34016c1).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 11:
                TLObject tLObject3 = (TLObject) obj;
                gy gyVar = ((bw) obj2).f32376a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    org.telegram.messenger.ui.b0(gyVar.f34016c1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ui.b0(gyVar.f34016c1).P1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 12:
                xw xwVar = (xw) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                xwVar.f40417x.f38407f = true;
                gy gyVar2 = xwVar.G;
                if (!gyVar2.f34054p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f26987id))) {
                    gyVar2.f34054p1.add(Long.valueOf(tL_messages_stickerSet2.set.f26987id));
                }
                xwVar.a(true);
                return;
            case 13:
                final fx fxVar = (fx) obj2;
                final String str5 = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                gy gyVar3 = fxVar.f33663a.F;
                if (!Arrays.equals(gyVar3.W0, G0)) {
                    org.telegram.messenger.ui.b0(gyVar3.f34016c1).M(G0, false);
                }
                gyVar3.W0 = G0;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                fx fxVar2 = fxVar;
                                org.telegram.messenger.ui.b0(fxVar2.f33663a.F.f34016c1).Y1(true, str5, new bi.v3(fxVar2, arrayList5, (Runnable) obj4, 8));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                gy gyVar4 = fxVar.f33663a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(gyVar4.f34016c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = gyVar4.f34016c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f26987id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new yw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f26987id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i13).f25844s0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f26987id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i13).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList6 = l02.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new yw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f26987id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.voip.k(29, fxVar, str5), new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                fx fxVar2 = fxVar;
                                org.telegram.messenger.ui.b0(fxVar2.f33663a.F.f34016c1).Y1(true, str5, new bi.v3(fxVar2, arrayList4, (Runnable) obj4, 8));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                gy gyVar4 = fxVar.f33663a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(gyVar4.f34016c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = gyVar4.f34016c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f26987id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new yw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f26987id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i13).f25844s0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f26987id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i13).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList6 = l02.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new yw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f26987id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new ex(0, fxVar, arrayList3), new bi.z2(fxVar, str5, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 14:
                ArrayList arrayList6 = (ArrayList) obj;
                gx gxVar = ((fx) obj2).f33663a;
                gxVar.F.V.e(false);
                ArrayList arrayList7 = gxVar.f33999r;
                if (arrayList7.size() < arrayList6.size()) {
                    z11 = false;
                }
                gxVar.E = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                gxVar.f();
                return;
            case 15:
                ((lx) obj2).F((String) obj, "", true, false, false);
                return;
            case 16:
                lx lxVar = (lx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                gy gyVar4 = lxVar.L;
                org.telegram.messenger.qp.s1(gyVar4.f34016c1).Y3(tL_contacts_resolvedPeer.users, false);
                int i13 = gyVar4.f34016c1;
                org.telegram.messenger.qp.s1(i13).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.yr.a0(i13).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = lxVar.f35759x;
                lxVar.f35759x = null;
                lxVar.F(str6, "", false, false, false);
                return;
            case 17:
                ry ryVar = (ry) obj2;
                fi.d7 d7Var = (fi.d7) obj;
                ryVar.b();
                ryVar.g(d7Var);
                vy vyVar = ryVar.J;
                vyVar.f39783h1 = d7Var;
                vyVar.j();
                return;
            case 18:
                ((ry) obj2).J.f39778f1 = (ty) obj;
                return;
            case 19:
                ((vz) obj2).f39840u2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 20:
                ((ex) obj2).a((org.telegram.ui.ActionBar.f2) obj);
                return;
            case 21:
                j30 j30Var = (j30) obj2;
                Uri uri = (Uri) obj;
                j30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) j30Var.f34825a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? f2Var = new org.telegram.ui.ActionBar.f2(bundle);
                        f2Var.f49895e = false;
                        f2Var.f49896f = false;
                        f2Var.f49894c = j30Var;
                        launchActivity.t0(f2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    j30Var.r(false, org.telegram.messenger.gc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 22:
                g40 g40Var = (g40) obj2;
                d40 d40Var = (d40) obj;
                o40 o40Var = g40Var.H0;
                org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                o40Var.R = j20Var;
                j20Var.f23475a = -1L;
                j20Var.f23477b = -1L;
                j20Var.f23491q = Math.max(1L, o40Var.P);
                org.telegram.messenger.j20 j20Var2 = o40Var.R;
                j20Var2.f23493s = true;
                j20Var2.f23496w = o40Var.L;
                j20Var2.f23497x = o40Var.M;
                j20Var2.f23498y = o40Var.N;
                j20Var2.f23499z = o40Var.O;
                j20Var2.f23488n = 25;
                j20Var2.h = 360;
                j20Var2.f23485k = 360;
                j20Var2.f23483i = 360;
                j20Var2.f23486l = 360;
                j20Var2.f23489o = g40Var.f33762a.getAbsolutePath();
                org.telegram.messenger.j20 j20Var3 = o40Var.R;
                j20Var3.P = true;
                j20Var3.O = o40Var.f36493i1;
                j20Var3.f23492r = o40Var.f36494j0;
                o40Var.f36493i1 = null;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, g40Var.f33762a.getAbsolutePath(), 0, true, 0, 0);
                if (d40Var != null) {
                    gfVar.f26868x = d40Var.f32883c;
                    gfVar.f26869y = d40Var.d;
                }
                b40 b40Var = o40Var.h;
                org.telegram.messenger.j20 j20Var4 = o40Var.R;
                if (d40Var != null && !d40Var.f32881a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (d40Var != null) {
                    i10 = d40Var.f32882b;
                }
                int i14 = i10;
                if (d40Var != null) {
                    j3 = d40Var.f32884e;
                } else {
                    j3 = 0;
                }
                b40Var.u(gfVar, j20Var4, z10, i14, 0, false, j3);
                return;
            case 23:
                Bitmap bitmap = (Bitmap) obj;
                g40 g40Var2 = (g40) ((dt) obj2).f33073b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && g40Var2.A0.size() > 1) {
                    ArrayList arrayList8 = g40Var2.A0;
                    arrayList8.add((Bitmap) jg.g.i(1, arrayList8));
                    return;
                }
                g40Var2.A0.add(bitmap);
                return;
            case 24:
                m50 m50Var2 = (m50) obj2;
                TLObject tLObject4 = (TLObject) obj;
                m50Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        m50Var2.f35860m1.put(Long.valueOf(m50Var2.l1.admin_id), (TLRPC.User) vector.objects.get(0));
                        m50Var2.N1.f();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                g50 g50Var = (g50) obj2;
                if (((TLRPC.TL_error) obj) == null && (bbVar = (m50Var = g50Var.f33802a.f34183c).d2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = m50Var.l1;
                    org.telegram.ui.mb mbVar = bbVar.f43997a;
                    ArrayList arrayList9 = mbVar.f47891o0;
                    int size = arrayList9.size();
                    int i15 = mbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().f21770a).f24493n;
                    if (new org.telegram.messenger.ij(org.telegram.ui.mb.Q0(mbVar), tL_channelAdminLogEvent, mbVar.f47890n0, mbVar.m0, mbVar.f47881f, mbVar.T, true).U >= 0) {
                        mbVar.W0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            mbVar.C0.N = true;
                            org.telegram.ui.jb jbVar = mbVar.E;
                            jbVar.o(jbVar.h, size2);
                            org.telegram.ui.mb.P0(mbVar);
                        }
                        mbVar.f47906y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((x50) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new at(editTextBoldCursor, 4));
                return;
            case 27:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 28:
                s70 s70Var = (s70) obj2;
                if (s70Var.O0 == ((x70) obj)) {
                    s70Var.performLongClick();
                    s70Var.O0 = null;
                    s70Var.M0.f(true);
                    return;
                }
                return;
            default:
                ((n2.n0) obj2).n((a80) obj, false);
                return;
        }
    }
}
