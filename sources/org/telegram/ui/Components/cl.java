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
import android.widget.FrameLayout;
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
public final class cl implements Runnable {
    public final int f32763a;
    public final Object f32764b;
    public final Object f32765c;

    public cl(int i3, Object obj, Object obj2) {
        this.f32763a = i3;
        this.f32764b = obj;
        this.f32765c = obj2;
    }

    @Override
    public final void run() {
        float f10;
        boolean z10;
        String str;
        boolean z11;
        Bitmap createBitmap;
        boolean z12;
        long j10;
        i50 i50Var;
        org.telegram.ui.za zaVar;
        int i3 = this.f32763a;
        String str2 = "";
        boolean z13 = true;
        int i10 = 0;
        Object obj = this.f32765c;
        Object obj2 = this.f32764b;
        switch (i3) {
            case 0:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                pl plVar = ((ChatAttachAlertPhotoLayout) obj2).Q;
                if (plVar != null) {
                    plVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 1:
                th thVar = (th) obj;
                int currentItemTop = thVar.getCurrentItemTop();
                int listTopPadding = thVar.getListTopPadding();
                ci.j1 j1Var = ((am) obj2).f31896r;
                if (currentItemTop > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                j1Var.scrollBy(0, listTopPadding);
                return;
            case 2:
                on.a(((mn) obj2).f36213c);
                ((lg.g) obj).run();
                return;
            case 3:
                ((ro) obj2).f37762b.R0((ArrayList) obj);
                return;
            case 4:
                ((so) obj2).f38095b.R0((ArrayList) obj);
                return;
            case 5:
                ((org.telegram.ui.ActionBar.t2) obj2).dismiss();
                sf.c.t((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 6:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = k3Var.getText().toString();
                if (!lq.a(charSequence, "bot") && lq.c(charSequence, treeSet) == null) {
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
            case 7:
                tq tqVar = (tq) obj2;
                tqVar.getClass();
                ((gi.d) obj).setLoading(false);
                tqVar.dismiss();
                return;
            case 8:
                tq tqVar2 = (tq) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    tqVar2.U1 = groupcallstreamrtmpurl.url;
                    tqVar2.V1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tqVar2.V1);
                    tqVar2.W1 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f38578a |= 256;
                    obj3.f38579b = 0;
                    obj3.f38580c = spannableStringBuilder.length();
                    tqVar2.W1.setSpan(new uy0(obj3, 0), 0, tqVar2.W1.length(), 0);
                    tqVar2.X1.O(false);
                    return;
                }
                return;
            case 9:
                ur urVar = (ur) obj2;
                TLObject tLObject2 = (TLObject) obj;
                rr rrVar = urVar.f38851b;
                ArrayList arrayList = urVar.h;
                int i11 = urVar.f38850a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.hp.s1(i11).Y3(popularappbots.users, false);
                    org.telegram.messenger.qr.a0(i11).m1(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    urVar.f38855g = str3;
                    if (str3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    urVar.f38853e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    urVar.f38854f = currentTimeMillis;
                    if (urVar.f38856i) {
                        z11 = false;
                    } else {
                        urVar.f38856i = true;
                        String str4 = urVar.f38855g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12 = a1.g.h(i12, 1, ((TLRPC.User) arrayList.get(i12)).f27150id, arrayList2)) {
                        }
                        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i11);
                        a02.f24934a.c(new ai.z1(urVar, a02, arrayList2, currentTimeMillis, str, 12));
                        z11 = false;
                    }
                    urVar.f38852c = z11;
                    rrVar.run();
                    return;
                }
                urVar.f38855g = null;
                urVar.f38853e = true;
                urVar.f38852c = false;
                rrVar.run();
                return;
            case 10:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new cl(11, (ps) obj2, decodeFile));
                return;
            case 11:
                ((ps) obj2).setImage((Bitmap) obj);
                return;
            case 12:
                ((EditTextBoldCursor) obj2).f31427p0.draw((Canvas) obj);
                return;
            case 13:
                org.telegram.messenger.hp.s1(((au) obj2).f31988a.f28583a).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 14:
                org.telegram.messenger.hp.s1(((aw) obj2).f32000a.f33529d1).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 15:
                TLObject tLObject3 = (TLObject) obj;
                ey eyVar = ((aw) obj2).f32000a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    org.telegram.messenger.li.b0(eyVar.f33529d1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.li.b0(eyVar.f33529d1).P1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 16:
                ww wwVar = (ww) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                wwVar.f40165x.f38128f = true;
                ey eyVar2 = wwVar.H;
                if (!eyVar2.f33568q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f27028id))) {
                    eyVar2.f33568q1.add(Long.valueOf(tL_messages_stickerSet2.set.f27028id));
                }
                wwVar.a(true);
                return;
            case 17:
                final dx dxVar = (dx) obj2;
                final String str5 = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ey eyVar3 = dxVar.f33204a.G;
                if (!Arrays.equals(eyVar3.X0, G0)) {
                    org.telegram.messenger.li.b0(eyVar3.f33529d1).M(G0, false);
                }
                eyVar3.X0 = G0;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                dx dxVar2 = dxVar;
                                org.telegram.messenger.li.b0(dxVar2.f33204a.G.f33529d1).Y1(true, str5, new ai.m(dxVar2, arrayList5, (Runnable) obj4, 10));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                ey eyVar4 = dxVar.f33204a.G;
                                if (org.telegram.messenger.az.F || org.telegram.messenger.h10.i(eyVar4.f33529d1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = eyVar4.f33529d1;
                                    ArrayList s02 = org.telegram.messenger.li.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f27028id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new xw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f27028id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.li.b0(i13).f24051t0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f27028id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i13).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList6 = l02.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new xw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f27028id));
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
                }, new ei(3, dxVar, str5), new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                dx dxVar2 = dxVar;
                                org.telegram.messenger.li.b0(dxVar2.f33204a.G.f33529d1).Y1(true, str5, new ai.m(dxVar2, arrayList4, (Runnable) obj4, 10));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                ey eyVar4 = dxVar.f33204a.G;
                                if (org.telegram.messenger.az.F || org.telegram.messenger.h10.i(eyVar4.f33529d1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = eyVar4.f33529d1;
                                    ArrayList s02 = org.telegram.messenger.li.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f27028id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new xw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f27028id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.li.b0(i13).f24051t0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f27028id))) {
                                                String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title.toLowerCase());
                                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i13).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList6 = l02.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new xw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f27028id));
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
                }, new ei(4, dxVar, arrayList3), new ci.o2(dxVar, str5, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 18:
                ArrayList arrayList6 = (ArrayList) obj;
                ex exVar = ((dx) obj2).f33204a;
                exVar.G.W.e(false);
                ArrayList arrayList7 = exVar.f33495r;
                if (arrayList7.size() < arrayList6.size()) {
                    z13 = false;
                }
                exVar.F = z13;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                exVar.f();
                return;
            case 19:
                ((jx) obj2).F((String) obj, "", true, false, false);
                return;
            case 20:
                jx jxVar = (jx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ey eyVar4 = jxVar.M;
                org.telegram.messenger.hp.s1(eyVar4.f33529d1).Y3(tL_contacts_resolvedPeer.users, false);
                int i13 = eyVar4.f33529d1;
                org.telegram.messenger.hp.s1(i13).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.qr.a0(i13).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = jxVar.f35213x;
                jxVar.f35213x = null;
                jxVar.F(str6, "", false, false, false);
                return;
            case 21:
                py pyVar = (py) obj2;
                gi.e7 e7Var = (gi.e7) obj;
                pyVar.b();
                pyVar.g(e7Var);
                sy syVar = pyVar.K;
                syVar.f38157h1 = e7Var;
                syVar.j();
                return;
            case 22:
                ((py) obj2).K.f38152f1 = (ry) obj;
                return;
            case 23:
                ((rz) obj2).f37863s2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 24:
                ((ei) obj2).a((org.telegram.ui.ActionBar.d2) obj);
                return;
            case 25:
                f30 f30Var = (f30) obj2;
                Uri uri = (Uri) obj;
                f30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) f30Var.f33681a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? d2Var = new org.telegram.ui.ActionBar.d2(bundle);
                        d2Var.f46987e = false;
                        d2Var.f46988f = false;
                        d2Var.f46986c = f30Var;
                        launchActivity.t0(d2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    f30Var.r(false, org.telegram.messenger.zb.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 26:
                c40 c40Var = (c40) obj2;
                z30 z30Var = (z30) obj;
                k40 k40Var = c40Var.I0;
                org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
                k40Var.S = b20Var;
                b20Var.f21708a = -1L;
                b20Var.f21710b = -1L;
                b20Var.f21724q = Math.max(1L, k40Var.Q);
                org.telegram.messenger.b20 b20Var2 = k40Var.S;
                b20Var2.f21726s = true;
                b20Var2.f21729w = k40Var.M;
                b20Var2.f21730x = k40Var.N;
                b20Var2.f21731y = k40Var.O;
                b20Var2.f21732z = k40Var.P;
                b20Var2.f21721n = 25;
                b20Var2.h = 360;
                b20Var2.f21718k = 360;
                b20Var2.f21716i = 360;
                b20Var2.f21719l = 360;
                b20Var2.f21722o = c40Var.f32523a.getAbsolutePath();
                org.telegram.messenger.b20 b20Var3 = k40Var.S;
                b20Var3.P = true;
                b20Var3.O = k40Var.f35285j1;
                b20Var3.f21725r = k40Var.f35286k0;
                k40Var.f35285j1 = null;
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, c40Var.f32523a.getAbsolutePath(), 0, true, 0, 0);
                if (z30Var != null) {
                    yeVar.f25329x = z30Var.f40904c;
                    yeVar.f25330y = z30Var.d;
                }
                x30 x30Var = k40Var.h;
                org.telegram.messenger.b20 b20Var4 = k40Var.S;
                if (z30Var != null && !z30Var.f40902a) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z30Var != null) {
                    i10 = z30Var.f40903b;
                }
                int i14 = i10;
                if (z30Var != null) {
                    j10 = z30Var.f40905e;
                } else {
                    j10 = 0;
                }
                x30Var.u(yeVar, b20Var4, z12, i14, 0, false, j10);
                return;
            case 27:
                Bitmap bitmap = (Bitmap) obj;
                c40 c40Var2 = (c40) ((lt) obj2).f35876b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && c40Var2.B0.size() > 1) {
                    ArrayList arrayList8 = c40Var2.B0;
                    arrayList8.add((Bitmap) k2.p1.h(1, arrayList8));
                    return;
                }
                c40Var2.B0.add(bitmap);
                return;
            case 28:
                i50 i50Var2 = (i50) obj2;
                TLObject tLObject4 = (TLObject) obj;
                i50Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        i50Var2.k1.put(Long.valueOf(i50Var2.f34603j1.admin_id), (TLRPC.User) vector.objects.get(0));
                        i50Var2.L1.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                c50 c50Var = (c50) obj2;
                if (((TLRPC.TL_error) obj) == null && (zaVar = (i50Var = c50Var.f32565a.f32935c).f34600b2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = i50Var.f34603j1;
                    org.telegram.ui.kb kbVar = zaVar.f52592a;
                    ArrayList arrayList9 = kbVar.f46876p0;
                    int size = arrayList9.size();
                    int i15 = kbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.h10.i(kbVar.getAccountInstance().f21919a).f22848n;
                    if (new org.telegram.messenger.zi(org.telegram.ui.kb.Q0(kbVar), tL_channelAdminLogEvent, kbVar.f46875o0, kbVar.f46874n0, kbVar.f46865f, kbVar.U, true).U >= 0) {
                        kbVar.W0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            kbVar.D0.N = true;
                            org.telegram.ui.hb hbVar = kbVar.F;
                            hbVar.o(hbVar.h, size2);
                            org.telegram.ui.kb.P0(kbVar);
                        }
                        kbVar.f46891z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
