package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class dw implements Runnable {
    public final int f34521a;
    public final Object f34522b;
    public final Object f34523c;

    public dw(int i7, Object obj, Object obj2) {
        this.f34521a = i7;
        this.f34522b = obj;
        this.f34523c = obj2;
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
        long j10;
        long j11;
        int indexOf;
        int K;
        int i11 = this.f34521a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f34523c;
        Object obj2 = this.f34522b;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                ry ryVar = ((nw) obj2).f37866a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ri.d0(ryVar.f39345d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ri.d0(ryVar.f39345d1).U1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 1:
                jx jxVar = (jx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jxVar.f36552x.f35175f = true;
                ry ryVar2 = jxVar.H;
                if (!ryVar2.f39383q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f28430id))) {
                    ryVar2.f39383q1.add(Long.valueOf(tL_messages_stickerSet2.set.f28430id));
                }
                jxVar.a(true);
                return;
            case 2:
                final px pxVar = (px) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ry ryVar3 = pxVar.f38591a.G;
                if (!Arrays.equals(ryVar3.X0, G0)) {
                    i7 = 0;
                    org.telegram.messenger.ri.d0(ryVar3.f39345d1).O(G0, false);
                } else {
                    i7 = 0;
                }
                ryVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                px pxVar2 = pxVar;
                                org.telegram.messenger.ri.d0(pxVar2.f38591a.G.f39345d1).d2(true, str, new bi.j(pxVar2, arrayList3, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ry ryVar4 = pxVar.f38591a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(ryVar4.f39345d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = ryVar4.f39345d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28430id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new kx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28430id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26639t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28430id))) {
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
                                                        arrayList6.add(new kx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28430id));
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
                };
                ph phVar = new ph(4, pxVar, str);
                org.telegram.messenger.x10 x10Var2 = new org.telegram.messenger.x10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                px pxVar2 = pxVar;
                                org.telegram.messenger.ri.d0(pxVar2.f38591a.G.f39345d1).d2(true, str, new bi.j(pxVar2, arrayList2, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ry ryVar4 = pxVar.f38591a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(ryVar4.f39345d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = ryVar4.f39345d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28430id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new kx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28430id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26639t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28430id))) {
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
                                                        arrayList6.add(new kx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28430id));
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
                };
                ph phVar2 = new ph(5, pxVar, arrayList);
                di.m2 m2Var = new di.m2(pxVar, str, arrayList, arrayList2, arrayList3, 4);
                org.telegram.messenger.x10[] x10VarArr = new org.telegram.messenger.x10[5];
                x10VarArr[i7] = x10Var;
                x10VarArr[1] = phVar;
                x10VarArr[2] = x10Var2;
                x10VarArr[3] = phVar2;
                x10VarArr[4] = m2Var;
                Utilities.u(i7, x10VarArr);
                return;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                qx qxVar = ((px) obj2).f38591a;
                qxVar.G.W.e(false);
                ArrayList arrayList5 = qxVar.f38929r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qxVar.F = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                qxVar.f();
                return;
            case 4:
                ((vx) obj2).F((String) obj, "", true, false, false);
                return;
            case 5:
                vx vxVar = (vx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ry ryVar4 = vxVar.M;
                org.telegram.messenger.mp.u1(ryVar4.f39345d1).f4(tL_contacts_resolvedPeer.users, false);
                int i12 = ryVar4.f39345d1;
                org.telegram.messenger.mp.u1(i12).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.tr.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = vxVar.f41478x;
                vxVar.f41478x = null;
                vxVar.F(str2, "", false, false, false);
                return;
            case 6:
                cz czVar = (cz) obj2;
                hi.c7 c7Var = (hi.c7) obj;
                czVar.b();
                czVar.g(c7Var);
                fz fzVar = czVar.K;
                fzVar.f35210h1 = c7Var;
                fzVar.j();
                return;
            case 7:
                ((cz) obj2).K.f35205f1 = (ez) obj;
                return;
            case 8:
                ((g00) obj2).f35269v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 9:
                ((ph) obj2).a((org.telegram.ui.ActionBar.h2) obj);
                return;
            case 10:
                u30 u30Var = (u30) obj2;
                Uri uri = (Uri) obj;
                u30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u30Var.f40195a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? h2Var = new org.telegram.ui.ActionBar.h2(bundle);
                        h2Var.f52304e = false;
                        h2Var.f52305f = false;
                        h2Var.f52303c = u30Var;
                        launchActivity.t0(h2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    u30Var.r(false, org.telegram.messenger.ec.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
                r40 r40Var = (r40) obj2;
                o40 o40Var = (o40) obj;
                z40 z40Var = r40Var.I0;
                org.telegram.messenger.e20 e20Var = new org.telegram.messenger.e20();
                z40Var.S = e20Var;
                e20Var.f23634a = -1L;
                e20Var.f23636b = -1L;
                e20Var.f23650q = Math.max(1L, z40Var.Q);
                org.telegram.messenger.e20 e20Var2 = z40Var.S;
                e20Var2.f23652s = true;
                e20Var2.f23655w = z40Var.M;
                e20Var2.f23656x = z40Var.N;
                e20Var2.f23657y = z40Var.O;
                e20Var2.f23658z = z40Var.P;
                e20Var2.f23647n = 25;
                e20Var2.h = 360;
                e20Var2.f23644k = 360;
                e20Var2.f23642i = 360;
                e20Var2.f23645l = 360;
                e20Var2.f23648o = r40Var.f39002a.getAbsolutePath();
                org.telegram.messenger.e20 e20Var3 = z40Var.S;
                e20Var3.P = true;
                e20Var3.O = z40Var.f42783j1;
                e20Var3.f23651r = z40Var.f42784k0;
                z40Var.f42783j1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.f39002a.getAbsolutePath(), 0, true, 0, 0);
                if (o40Var != null) {
                    efVar.f27866x = o40Var.f37956c;
                    efVar.f27867y = o40Var.d;
                }
                m40 m40Var = z40Var.h;
                org.telegram.messenger.e20 e20Var4 = z40Var.S;
                if (o40Var != null && !o40Var.f37954a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (o40Var != null) {
                    i10 = o40Var.f37955b;
                } else {
                    i10 = 0;
                }
                if (o40Var != null) {
                    j3 = o40Var.f37957e;
                } else {
                    j3 = 0;
                }
                m40Var.u(efVar, e20Var4, z11, i10, 0, false, j3);
                return;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                r40 r40Var2 = (r40) ((gk) obj2).f35513b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && r40Var2.B0.size() > 1) {
                    ArrayList arrayList6 = r40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    return;
                }
                r40Var2.B0.add(bitmap);
                return;
            case 13:
                x50 x50Var2 = (x50) obj2;
                TLObject tLObject2 = (TLObject) obj;
                x50Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        x50Var2.n1.put(Long.valueOf(x50Var2.f41894m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        x50Var2.O1.f();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                r50 r50Var = (r50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (x50Var = r50Var.f39042a.f39494c).f41890e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.f41894m1;
                    org.telegram.ui.lb lbVar = abVar.f45517a;
                    ArrayList arrayList7 = lbVar.f49519p0;
                    int size = arrayList7.size();
                    int i13 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.j10.i(lbVar.getAccountInstance().f23218a).f24789n;
                    if (new org.telegram.messenger.fj(org.telegram.ui.lb.Q0(lbVar), tL_channelAdminLogEvent, lbVar.f49518o0, lbVar.f49517n0, lbVar.f49508f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.f49534z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((j60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor, 5));
                return;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.jo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 17:
                g80 g80Var = (g80) obj2;
                if (g80Var.P0 == ((l80) obj)) {
                    g80Var.performLongClick();
                    g80Var.P0 = null;
                    g80Var.N0.f(true);
                    return;
                }
                return;
            case 18:
                ((n2.o0) obj2).n((o80) obj, false);
                return;
            case 19:
                i90 i90Var = (i90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = i90Var.R) != null) {
                    p6Var.run();
                }
                i90Var.R = null;
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new i(editTextBoldCursor2, 7));
                return;
            case 21:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.f3005a.remove(runnable);
                return;
            case 22:
                mf0 mf0Var = (mf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                mf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    mf0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mf0Var.a(false);
                        return;
                    }
                    mf0Var.d();
                    mf0Var.f37453c.f34607g3.O(true);
                    return;
                }
                return;
            case 23:
                rf0 rf0Var = (rf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = rf0Var.f39117a;
                int i14 = rf0Var.f39126s;
                int size3 = arrayList8.size();
                rf0Var.f39126s = size3;
                if (i14 != size3 && rf0Var.Q != null) {
                    rf0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    of0 of0Var = (of0) arrayList9.get(i15);
                    if (of0Var.f38089o && !of0Var.f38090p) {
                        arrayList8.add(of0Var);
                    } else if (rf0.i(of0Var.f38077a, arrayList8) == null) {
                        rf0 rf0Var2 = of0Var.f38098y;
                        float f10 = rf0Var2.L;
                        RectF rectF = of0Var.f38079c;
                        RectF rectF2 = of0Var.f38081f;
                        o80 o80Var = of0Var.f38092r;
                        if (o80Var != null) {
                            o80Var.a();
                            of0Var.f38094t = z15;
                            of0Var.f38093s = z15;
                        }
                        of0Var.f38089o = z16;
                        if (rectF.left - 1.0f <= f10) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= rf0Var2.getMeasuredWidth() - f10) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        of0Var.f38082g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = of0Var.f38077a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (rf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    of0Var.f38080e.e(z14, 0.0f);
                                    arrayList8.add(of0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            of0Var.f38080e.e(z14, 0.0f);
                            arrayList8.add(of0Var);
                        }
                        z14 = true;
                        of0Var.f38080e.e(z14, 0.0f);
                        arrayList8.add(of0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                rf0Var.invalidate();
                return;
            case 24:
                of0 of0Var2 = (of0) obj;
                qf0 qf0Var = ((rf0) obj2).f39129y;
                int i17 = of0Var2.f38077a;
                RectF rectF3 = of0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.tt0) qf0Var).f52351b, i17, rectF3.left, rectF3.top);
                return;
            case 25:
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
            case 26:
                uh0 uh0Var = (uh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = uh0Var.f40360r;
                uh0Var.f40359n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    th0 th0Var = (th0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            TLObject tLObject4 = ((th0) arrayList11.get(i19)).f40004a;
                            if (tLObject4 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject4).f28403id;
                            } else if (tLObject4 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject4).f28552id;
                            } else {
                                j10 = 0;
                            }
                            TLObject tLObject5 = th0Var.f40004a;
                            if (tLObject5 instanceof TLRPC.Chat) {
                                j11 = -((TLRPC.Chat) tLObject5).f28403id;
                            } else if (tLObject5 instanceof TLRPC.User) {
                                j11 = ((TLRPC.User) tLObject5).f28552id;
                            } else {
                                j11 = 0;
                            }
                            if (j10 == j11) {
                                if (th0Var.f40006c > 0) {
                                    ((th0) arrayList11.get(i19)).f40006c = th0Var.f40006c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(th0Var);
                        }
                    }
                }
                q0.a aVar = uh0Var.f40363x;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                uh0Var.a();
                return;
            case 27:
                km0 km0Var = (km0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = km0Var.L;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (K = km0Var.K()) < km0Var.b()) {
                    arrayList12.remove(indexOf);
                    km0Var.s(K + 1 + indexOf);
                    int size6 = km0Var.f17479k0.f17730e.size();
                    int size7 = arrayList12.size();
                    if (km0Var.H0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        km0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((km0) obj2).S();
                lc.b0((org.telegram.ui.cx) obj).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                return;
            default:
                ((wm0) obj2).sendAccessibilityEvent((View) obj, 4);
                return;
        }
    }
}
