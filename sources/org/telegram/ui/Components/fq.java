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
public final class fq implements Runnable {
    public final int f33724a;
    public final Object f33725b;
    public final Object f33726c;

    public fq(int i7, Object obj, Object obj2) {
        this.f33724a = i7;
        this.f33725b = obj;
        this.f33726c = obj2;
    }

    @Override
    public final void run() {
        float f10;
        boolean z9;
        String str;
        Bitmap createBitmap;
        boolean z10;
        long j3;
        n50 n50Var;
        org.telegram.ui.bb bbVar;
        bi.u7 u7Var;
        int i7 = this.f33724a;
        String str2 = "";
        boolean z11 = true;
        int i10 = 0;
        Object obj = this.f33726c;
        Object obj2 = this.f33725b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.ActionBar.v2) obj2).dismiss();
                vf.c.t((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 1:
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
            case 2:
                tq tqVar = (tq) obj2;
                tqVar.getClass();
                ((fi.d) obj).setLoading(false);
                tqVar.dismiss();
                return;
            case 3:
                tq tqVar2 = (tq) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    tqVar2.T1 = groupcallstreamrtmpurl.url;
                    tqVar2.U1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tqVar2.U1);
                    tqVar2.V1 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f39836a |= 256;
                    obj3.f39837b = 0;
                    obj3.f39838c = spannableStringBuilder.length();
                    tqVar2.V1.setSpan(new wy0(obj3, 0), 0, tqVar2.V1.length(), 0);
                    tqVar2.W1.O(false);
                    return;
                }
                return;
            case 4:
                ur urVar = (ur) obj2;
                TLObject tLObject2 = (TLObject) obj;
                rr rrVar = urVar.f38781b;
                ArrayList arrayList = urVar.h;
                int i11 = urVar.f38780a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.qp.s1(i11).Y3(popularappbots.users, false);
                    org.telegram.messenger.yr.a0(i11).m1(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    urVar.f38785g = str3;
                    if (str3 == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    urVar.f38783e = z9;
                    long currentTimeMillis = System.currentTimeMillis();
                    urVar.f38784f = currentTimeMillis;
                    if (!urVar.f38786i) {
                        urVar.f38786i = true;
                        String str4 = urVar.f38785g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12 = com.google.android.recaptcha.internal.a.g(i12, 1, ((TLRPC.User) arrayList.get(i12)).f27105id, arrayList2)) {
                        }
                        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i11);
                        a02.f26719a.c(new bi.i0(urVar, a02, arrayList2, currentTimeMillis, str, 11));
                    }
                    urVar.f38782c = false;
                    rrVar.run();
                    return;
                }
                urVar.f38785g = null;
                urVar.f38783e = true;
                urVar.f38782c = false;
                rrVar.run();
                return;
            case 5:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new fq(6, (ps) obj2, decodeFile));
                return;
            case 6:
                ((ps) obj2).setImage((Bitmap) obj);
                return;
            case 7:
                ((EditTextBoldCursor) obj2).f31360o0.draw((Canvas) obj);
                return;
            case 8:
                org.telegram.messenger.qp.s1(((cu) obj2).f32759a.f28621a).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 9:
                org.telegram.messenger.qp.s1(((cw) obj2).f32776a.f34415c1).h5((TLRPC.EmojiStatus) obj, null);
                return;
            case 10:
                TLObject tLObject3 = (TLObject) obj;
                hy hyVar = ((cw) obj2).f32776a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    org.telegram.messenger.ui.b0(hyVar.f34415c1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ui.b0(hyVar.f34415c1).P1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 11:
                yw ywVar = (yw) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ywVar.f40822x.f38813f = true;
                hy hyVar2 = ywVar.G;
                if (!hyVar2.f34453p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f26983id))) {
                    hyVar2.f34453p1.add(Long.valueOf(tL_messages_stickerSet2.set.f26983id));
                }
                ywVar.a(true);
                return;
            case 12:
                final gx gxVar = (gx) obj2;
                final String str5 = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                hy hyVar3 = gxVar.f34069a.F;
                if (!Arrays.equals(hyVar3.W0, G0)) {
                    org.telegram.messenger.ui.b0(hyVar3.f34415c1).M(G0, false);
                }
                hyVar3.W0 = G0;
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
                                gx gxVar2 = gxVar;
                                org.telegram.messenger.ui.b0(gxVar2.f34069a.F.f34415c1).Y1(true, str5, new bi.v3(gxVar2, arrayList5, (Runnable) obj4, 8));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                hy hyVar4 = gxVar.f34069a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(hyVar4.f34415c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = hyVar4.f34415c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f26983id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new zw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f26983id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i13).f25840s0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f26983id))) {
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
                                                        arrayList8.add(new zw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f26983id));
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
                }, new org.telegram.messenger.voip.k(29, gxVar, str5), new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        switch (r4) {
                            case 0:
                                gx gxVar2 = gxVar;
                                org.telegram.messenger.ui.b0(gxVar2.f34069a.F.f34415c1).Y1(true, str5, new bi.v3(gxVar2, arrayList4, (Runnable) obj4, 8));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj4;
                                hy hyVar4 = gxVar.f34069a.F;
                                if (org.telegram.messenger.iz.F || org.telegram.messenger.p10.i(hyVar4.f34415c1).q()) {
                                    String O3 = org.telegram.messenger.g0.O3((str5 + "").toLowerCase());
                                    int i13 = hyVar4.f34415c1;
                                    ArrayList s02 = org.telegram.messenger.ui.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f26983id))) {
                                                String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                                    arrayList8.add(new zw(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f26983id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList9 = org.telegram.messenger.ui.b0(i13).f25840s0[1];
                                    if (arrayList9 != null) {
                                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList9.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f26983id))) {
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
                                                        arrayList8.add(new zw(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f26983id));
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
                }, new fx(0, gxVar, arrayList3), new bi.z2(gxVar, str5, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 13:
                ArrayList arrayList6 = (ArrayList) obj;
                hx hxVar = ((gx) obj2).f34069a;
                hxVar.F.V.e(false);
                ArrayList arrayList7 = hxVar.f34398r;
                if (arrayList7.size() < arrayList6.size()) {
                    z11 = false;
                }
                hxVar.E = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                hxVar.f();
                return;
            case 14:
                ((mx) obj2).F((String) obj, "", true, false, false);
                return;
            case 15:
                mx mxVar = (mx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                hy hyVar4 = mxVar.L;
                org.telegram.messenger.qp.s1(hyVar4.f34415c1).Y3(tL_contacts_resolvedPeer.users, false);
                int i13 = hyVar4.f34415c1;
                org.telegram.messenger.qp.s1(i13).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.yr.a0(i13).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = mxVar.f36166x;
                mxVar.f36166x = null;
                mxVar.F(str6, "", false, false, false);
                return;
            case 16:
                sy syVar = (sy) obj2;
                fi.d7 d7Var = (fi.d7) obj;
                syVar.b();
                syVar.g(d7Var);
                wy wyVar = syVar.J;
                wyVar.f40201h1 = d7Var;
                wyVar.j();
                return;
            case 17:
                ((sy) obj2).J.f40196f1 = (uy) obj;
                return;
            case 18:
                ((wz) obj2).f40256r2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 19:
                ((fx) obj2).a((org.telegram.ui.ActionBar.f2) obj);
                return;
            case 20:
                k30 k30Var = (k30) obj2;
                Uri uri = (Uri) obj;
                k30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) k30Var.f35218a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? f2Var = new org.telegram.ui.ActionBar.f2(bundle);
                        f2Var.f49507e = false;
                        f2Var.f49508f = false;
                        f2Var.f49506c = k30Var;
                        launchActivity.t0(f2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    k30Var.r(false, org.telegram.messenger.gc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 21:
                h40 h40Var = (h40) obj2;
                e40 e40Var = (e40) obj;
                p40 p40Var = h40Var.H0;
                org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                p40Var.R = j20Var;
                j20Var.f23471a = -1L;
                j20Var.f23473b = -1L;
                j20Var.f23487q = Math.max(1L, p40Var.P);
                org.telegram.messenger.j20 j20Var2 = p40Var.R;
                j20Var2.f23489s = true;
                j20Var2.f23492w = p40Var.L;
                j20Var2.f23493x = p40Var.M;
                j20Var2.f23494y = p40Var.N;
                j20Var2.f23495z = p40Var.O;
                j20Var2.f23484n = 25;
                j20Var2.h = 360;
                j20Var2.f23481k = 360;
                j20Var2.f23479i = 360;
                j20Var2.f23482l = 360;
                j20Var2.f23485o = h40Var.f34168a.getAbsolutePath();
                org.telegram.messenger.j20 j20Var3 = p40Var.R;
                j20Var3.P = true;
                j20Var3.O = p40Var.f36902i1;
                j20Var3.f23488r = p40Var.f36903j0;
                p40Var.f36902i1 = null;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, h40Var.f34168a.getAbsolutePath(), 0, true, 0, 0);
                if (e40Var != null) {
                    gfVar.f26864x = e40Var.f33288c;
                    gfVar.f26865y = e40Var.d;
                }
                c40 c40Var = p40Var.h;
                org.telegram.messenger.j20 j20Var4 = p40Var.R;
                if (e40Var != null && !e40Var.f33286a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (e40Var != null) {
                    i10 = e40Var.f33287b;
                }
                int i14 = i10;
                if (e40Var != null) {
                    j3 = e40Var.f33289e;
                } else {
                    j3 = 0;
                }
                c40Var.u(gfVar, j20Var4, z10, i14, 0, false, j3);
                return;
            case 22:
                Bitmap bitmap = (Bitmap) obj;
                h40 h40Var2 = (h40) ((et) obj2).f33493b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && h40Var2.A0.size() > 1) {
                    ArrayList arrayList8 = h40Var2.A0;
                    arrayList8.add((Bitmap) jg.g.i(1, arrayList8));
                    return;
                }
                h40Var2.A0.add(bitmap);
                return;
            case 23:
                n50 n50Var2 = (n50) obj2;
                TLObject tLObject4 = (TLObject) obj;
                n50Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        n50Var2.f36258j1.put(Long.valueOf(n50Var2.f36257i1.admin_id), (TLRPC.User) vector.objects.get(0));
                        n50Var2.K1.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                h50 h50Var = (h50) obj2;
                if (((TLRPC.TL_error) obj) == null && (bbVar = (n50Var = h50Var.f34208a.f34575c).f36254a2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n50Var.f36257i1;
                    org.telegram.ui.mb mbVar = bbVar.f43947a;
                    ArrayList arrayList9 = mbVar.f47824o0;
                    int size = arrayList9.size();
                    int i15 = mbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().f21765a).f24489n;
                    if (new org.telegram.messenger.ij(org.telegram.ui.mb.Q0(mbVar), tL_channelAdminLogEvent, mbVar.f47823n0, mbVar.m0, mbVar.f47814f, mbVar.T, true).U >= 0) {
                        mbVar.W0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            mbVar.C0.N = true;
                            org.telegram.ui.jb jbVar = mbVar.E;
                            jbVar.o(jbVar.h, size2);
                            org.telegram.ui.mb.P0(mbVar);
                        }
                        mbVar.f47839y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((y50) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new bt(editTextBoldCursor, 4));
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                t70 t70Var = (t70) obj2;
                if (t70Var.O0 == ((y70) obj)) {
                    t70Var.performLongClick();
                    t70Var.O0 = null;
                    t70Var.M0.f(true);
                    return;
                }
                return;
            case 28:
                ((n2.n0) obj2).n((b80) obj, false);
                return;
            default:
                v80 v80Var = (v80) obj2;
                if (!((boolean[]) obj)[0] && (u7Var = v80Var.Q) != null) {
                    u7Var.run();
                }
                v80Var.Q = null;
                return;
        }
    }
}
