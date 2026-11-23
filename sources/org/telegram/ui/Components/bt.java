package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class bt implements Runnable {
    public final int f33812a;
    public final Object f33813b;
    public final Object f33814c;

    public bt(int i7, Object obj, Object obj2) {
        this.f33812a = i7;
        this.f33813b = obj;
        this.f33814c = obj2;
    }

    @Override
    public final void run() {
        final int i7;
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        x50 x50Var;
        org.telegram.ui.ab abVar;
        di.p6 p6Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f33812a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f33814c;
        Object obj2 = this.f33813b;
        switch (i11) {
            case 0:
                ((ct) obj2).setImage((Bitmap) obj);
                return;
            case 1:
                ((EditTextBoldCursor) obj2).f33030p0.draw((Canvas) obj);
                return;
            case 2:
                org.telegram.messenger.mp.u1(((mu) obj2).f37538a.f30223a).t5((TLRPC.EmojiStatus) obj, null);
                return;
            case 3:
                org.telegram.messenger.mp.u1(((mw) obj2).f37561a.f39047d1).t5((TLRPC.EmojiStatus) obj, null);
                return;
            case 4:
                TLObject tLObject = (TLObject) obj;
                qy qyVar = ((mw) obj2).f37561a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ri.d0(qyVar.f39047d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ri.d0(qyVar.f39047d1).U1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 5:
                ix ixVar = (ix) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ixVar.f36189x.f34859f = true;
                qy qyVar2 = ixVar.H;
                if (!qyVar2.f39085q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f28519id))) {
                    qyVar2.f39085q1.add(Long.valueOf(tL_messages_stickerSet2.set.f28519id));
                }
                ixVar.a(true);
                return;
            case 6:
                final ox oxVar = (ox) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                qy qyVar3 = oxVar.f38273a.G;
                if (!Arrays.equals(qyVar3.X0, G0)) {
                    i7 = 0;
                    org.telegram.messenger.ri.d0(qyVar3.f39047d1).O(G0, false);
                } else {
                    i7 = 0;
                }
                qyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.w10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                ox oxVar2 = oxVar;
                                org.telegram.messenger.ri.d0(oxVar2.f38273a.G.f39047d1).d2(true, str, new bi.j(oxVar2, arrayList3, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                qy qyVar4 = oxVar.f38273a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.i10.i(qyVar4.f39047d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = qyVar4.f39047d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28519id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new jx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28519id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26740t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28519id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i12).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (n02 != null) {
                                                            arrayList4 = n02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new jx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28519id));
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
                }, new ph(5, oxVar, str), new org.telegram.messenger.w10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                ox oxVar2 = oxVar;
                                org.telegram.messenger.ri.d0(oxVar2.f38273a.G.f39047d1).d2(true, str, new bi.j(oxVar2, arrayList2, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                qy qyVar4 = oxVar.f38273a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.i10.i(qyVar4.f39047d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = qyVar4.f39047d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28519id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new jx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28519id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26740t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28519id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i12).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (n02 != null) {
                                                            arrayList4 = n02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new jx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28519id));
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
                }, new ph(6, oxVar, arrayList), new di.n2(oxVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                px pxVar = ((ox) obj2).f38273a;
                pxVar.G.W.e(false);
                ArrayList arrayList5 = pxVar.f38605r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pxVar.F = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                pxVar.f();
                return;
            case 8:
                ((ux) obj2).F((String) obj, "", true, false, false);
                return;
            case 9:
                ux uxVar = (ux) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                qy qyVar4 = uxVar.M;
                org.telegram.messenger.mp.u1(qyVar4.f39047d1).f4(tL_contacts_resolvedPeer.users, false);
                int i12 = qyVar4.f39047d1;
                org.telegram.messenger.mp.u1(i12).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.tr.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = uxVar.f40498x;
                uxVar.f40498x = null;
                uxVar.F(str2, "", false, false, false);
                return;
            case 10:
                bz bzVar = (bz) obj2;
                hi.w7 w7Var = (hi.w7) obj;
                bzVar.b();
                bzVar.g(w7Var);
                ez ezVar = bzVar.K;
                ezVar.f34888h1 = w7Var;
                ezVar.j();
                return;
            case 11:
                ((bz) obj2).K.f34883f1 = (dz) obj;
                return;
            case 12:
                ((g00) obj2).f35264v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 13:
                ((ph) obj2).a((org.telegram.ui.ActionBar.g2) obj);
                return;
            case 14:
                u30 u30Var = (u30) obj2;
                Uri uri = (Uri) obj;
                u30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u30Var.f40250a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? g2Var = new org.telegram.ui.ActionBar.g2(bundle);
                        g2Var.f51762e = false;
                        g2Var.f51763f = false;
                        g2Var.f51761c = u30Var;
                        launchActivity.t0(g2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    u30Var.r(false, org.telegram.messenger.ec.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                r40 r40Var = (r40) obj2;
                o40 o40Var = (o40) obj;
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.d20 d20Var = new org.telegram.messenger.d20();
                z40Var.S = d20Var;
                d20Var.f23587a = -1L;
                d20Var.f23589b = -1L;
                d20Var.f23603q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.d20 d20Var2 = z40Var.S;
                d20Var2.f23605s = true;
                d20Var2.f23608w = z40Var.M;
                d20Var2.f23609x = z40Var.N;
                d20Var2.f23610y = z40Var.O;
                d20Var2.f23611z = z40Var.P;
                d20Var2.f23600n = 25;
                d20Var2.h = 360;
                d20Var2.f23597k = 360;
                d20Var2.f23595i = 360;
                d20Var2.f23598l = 360;
                d20Var2.f23601o = r40Var.f39180a.getAbsolutePath();
                org.telegram.messenger.d20 d20Var3 = z40Var.S;
                d20Var3.P = true;
                d20Var3.O = z40Var.f42678j1;
                d20Var3.f23604r = z40Var.f42679k0;
                z40Var.f42678j1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.f39180a.getAbsolutePath(), 0, true, 0, 0);
                if (o40Var != null) {
                    efVar.f27982x = o40Var.f38010c;
                    efVar.f27983y = o40Var.d;
                }
                m40 m40Var = z40Var.h;
                org.telegram.messenger.d20 d20Var4 = z40Var.S;
                if (o40Var != null && !o40Var.f38008a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (o40Var != null) {
                    i10 = o40Var.f38009b;
                } else {
                    i10 = 0;
                }
                if (o40Var != null) {
                    j3 = o40Var.f38011e;
                } else {
                    j3 = 0;
                }
                m40Var.u(efVar, d20Var4, z11, i10, 0, false, j3);
                return;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                r40 r40Var2 = (r40) ((rc) obj2).f39270b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && r40Var2.B0.size() > 1) {
                    ArrayList arrayList6 = r40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    return;
                }
                r40Var2.B0.add(bitmap);
                return;
            case 17:
                x50 x50Var2 = (x50) obj2;
                TLObject tLObject2 = (TLObject) obj;
                x50Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        x50Var2.n1.put(Long.valueOf(x50Var2.f41836m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        x50Var2.O1.f();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                r50 r50Var = (r50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (x50Var = r50Var.f39221a.f39500c).f41832e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.f41836m1;
                    org.telegram.ui.lb lbVar = abVar.f45643a;
                    ArrayList arrayList7 = lbVar.f49698p0;
                    int size = arrayList7.size();
                    int i13 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.i10.i(lbVar.getAccountInstance().f23343a).f24656n;
                    if (new org.telegram.messenger.fj(org.telegram.ui.lb.Q0(lbVar), tL_channelAdminLogEvent, lbVar.f49697o0, lbVar.f49696n0, lbVar.f49687f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.f49713z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((i60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor, 5));
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 21:
                f80 f80Var = (f80) obj2;
                if (f80Var.P0 == ((k80) obj)) {
                    f80Var.performLongClick();
                    f80Var.P0 = null;
                    f80Var.N0.f(true);
                    return;
                }
                return;
            case 22:
                ((n2.p0) obj2).n((n80) obj, false);
                return;
            case 23:
                h90 h90Var = (h90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = h90Var.R) != null) {
                    p6Var.run();
                }
                h90Var.R = null;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor2, 7));
                return;
            case 25:
                l2.c cVar = (l2.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.f19363a.remove(runnable);
                return;
            case 26:
                nf0 nf0Var = (nf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                nf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    nf0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        nf0Var.a(false);
                        return;
                    }
                    nf0Var.d();
                    nf0Var.f37773c.f35323g3.O(true);
                    return;
                }
                return;
            case 27:
                sf0 sf0Var = (sf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = sf0Var.f39591a;
                int i14 = sf0Var.f39600s;
                int size3 = arrayList8.size();
                sf0Var.f39600s = size3;
                if (i14 != size3 && sf0Var.Q != null) {
                    sf0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    pf0 pf0Var = (pf0) arrayList9.get(i15);
                    if (pf0Var.f38473o && !pf0Var.f38474p) {
                        arrayList8.add(pf0Var);
                    } else if (sf0.i(pf0Var.f38461a, arrayList8) == null) {
                        sf0 sf0Var2 = pf0Var.f38482y;
                        float f10 = sf0Var2.L;
                        RectF rectF = pf0Var.f38463c;
                        RectF rectF2 = pf0Var.f38465f;
                        n80 n80Var = pf0Var.f38476r;
                        if (n80Var != null) {
                            n80Var.a();
                            pf0Var.f38478t = z15;
                            pf0Var.f38477s = z15;
                        }
                        pf0Var.f38473o = z16;
                        if (rectF.left - 1.0f <= f10) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= sf0Var2.getMeasuredWidth() - f10) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        pf0Var.f38466g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = pf0Var.f38461a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (sf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    pf0Var.f38464e.e(z14, 0.0f);
                                    arrayList8.add(pf0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            pf0Var.f38464e.e(z14, 0.0f);
                            arrayList8.add(pf0Var);
                        }
                        z14 = true;
                        pf0Var.f38464e.e(z14, 0.0f);
                        arrayList8.add(pf0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                sf0Var.invalidate();
                return;
            case 28:
                pf0 pf0Var2 = (pf0) obj;
                rf0 rf0Var = ((sf0) obj2).f39603y;
                int i17 = pf0Var2.f38461a;
                RectF rectF3 = pf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.st0) rf0Var).f52152b, i17, rectF3.left, rectF3.top);
                return;
            default:
                RLottieNative rLottieNative = (RLottieNative) obj2;
                RLottieNative rLottieNative2 = (RLottieNative) obj;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
        }
    }
}
