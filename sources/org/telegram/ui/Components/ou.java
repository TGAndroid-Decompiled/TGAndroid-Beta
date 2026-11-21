package org.telegram.ui.Components;

import android.graphics.Bitmap;
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
public final class ou implements Runnable {
    public final int f38358a;
    public final Object f38359b;
    public final Object f38360c;

    public ou(int i7, Object obj, Object obj2) {
        this.f38358a = i7;
        this.f38360c = obj;
        this.f38359b = obj2;
    }

    @Override
    public final void run() {
        final int i7;
        boolean z10;
        boolean z11;
        int i10;
        a60 a60Var;
        org.telegram.ui.ab abVar;
        di.p6 p6Var;
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        long j10;
        int indexOf;
        int K;
        int i11 = this.f38358a;
        long j11 = 0;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f38359b;
        Object obj2 = this.f38360c;
        switch (i11) {
            case 0:
                org.telegram.messenger.mp.u1(((pu) obj2).f38666a.f30170a).t5((TLRPC.EmojiStatus) obj, null);
                return;
            case 1:
                org.telegram.messenger.mp.u1(((pw) obj2).f38671a.f40099d1).t5((TLRPC.EmojiStatus) obj, null);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                ty tyVar = ((pw) obj2).f38671a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.ri.d0(tyVar.f40099d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.ri.d0(tyVar.f40099d1).U1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                lx lxVar = (lx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                lxVar.f37315x.f35991f = true;
                ty tyVar2 = lxVar.H;
                if (!tyVar2.f40137q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f28458id))) {
                    tyVar2.f40137q1.add(Long.valueOf(tL_messages_stickerSet2.set.f28458id));
                }
                lxVar.a(true);
                return;
            case 4:
                final rx rxVar = (rx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ty tyVar3 = rxVar.f39358a.G;
                if (!Arrays.equals(tyVar3.X0, G0)) {
                    i7 = 0;
                    org.telegram.messenger.ri.d0(tyVar3.f40099d1).O(G0, false);
                } else {
                    i7 = 0;
                }
                tyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.x10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.ri.d0(rxVar2.f39358a.G.f40099d1).d2(true, str, new bi.j(rxVar2, arrayList3, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.f39358a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(tyVar4.f40099d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = tyVar4.f40099d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28458id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28458id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26667t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28458id))) {
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
                                                        arrayList6.add(new mx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28458id));
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
                }, new rh(4, rxVar, str), new org.telegram.messenger.x10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.ri.d0(rxVar2.f39358a.G.f40099d1).d2(true, str, new bi.j(rxVar2, arrayList2, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.f39358a.G;
                                if (org.telegram.messenger.bz.F || org.telegram.messenger.j10.i(tyVar4.f40099d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = tyVar4.f40099d1;
                                    ArrayList u02 = org.telegram.messenger.ri.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28458id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28458id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i12).f26667t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28458id))) {
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
                                                        arrayList6.add(new mx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28458id));
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
                }, new rh(5, rxVar, arrayList), new di.n2(rxVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                sx sxVar = ((rx) obj2).f39358a;
                sxVar.G.W.e(false);
                ArrayList arrayList5 = sxVar.f39721r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sxVar.F = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                sxVar.f();
                return;
            case 6:
                ((xx) obj2).F((String) obj, "", true, false, false);
                return;
            case 7:
                xx xxVar = (xx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ty tyVar4 = xxVar.M;
                org.telegram.messenger.mp.u1(tyVar4.f40099d1).f4(tL_contacts_resolvedPeer.users, false);
                int i12 = tyVar4.f40099d1;
                org.telegram.messenger.mp.u1(i12).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.tr.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xxVar.f42250x;
                xxVar.f42250x = null;
                xxVar.F(str2, "", false, false, false);
                return;
            case 8:
                ez ezVar = (ez) obj2;
                hi.b7 b7Var = (hi.b7) obj;
                ezVar.b();
                ezVar.g(b7Var);
                hz hzVar = ezVar.K;
                hzVar.f36026h1 = b7Var;
                hzVar.j();
                return;
            case 9:
                ((ez) obj2).K.f36021f1 = (gz) obj;
                return;
            case 10:
                ((i00) obj2).f36094v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 11:
                ((rh) obj2).a((org.telegram.ui.ActionBar.g2) obj);
                return;
            case 12:
                x30 x30Var = (x30) obj2;
                Uri uri = (Uri) obj;
                x30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x30Var.f41966a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? g2Var = new org.telegram.ui.ActionBar.g2(bundle);
                        g2Var.f52350e = false;
                        g2Var.f52351f = false;
                        g2Var.f52349c = x30Var;
                        launchActivity.t0(g2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    x30Var.r(false, org.telegram.messenger.ec.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                u40 u40Var = (u40) obj2;
                r40 r40Var = (r40) obj;
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.e20 e20Var = new org.telegram.messenger.e20();
                c50Var.S = e20Var;
                e20Var.f23662a = -1L;
                e20Var.f23664b = -1L;
                e20Var.f23678q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.e20 e20Var2 = c50Var.S;
                e20Var2.f23680s = true;
                e20Var2.f23683w = c50Var.M;
                e20Var2.f23684x = c50Var.N;
                e20Var2.f23685y = c50Var.O;
                e20Var2.f23686z = c50Var.P;
                e20Var2.f23675n = 25;
                e20Var2.h = 360;
                e20Var2.f23672k = 360;
                e20Var2.f23670i = 360;
                e20Var2.f23673l = 360;
                e20Var2.f23676o = u40Var.f40231a.getAbsolutePath();
                org.telegram.messenger.e20 e20Var3 = c50Var.S;
                e20Var3.P = true;
                e20Var3.O = c50Var.f34042j1;
                e20Var3.f23679r = c50Var.f34043k0;
                c50Var.f34042j1 = null;
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, u40Var.f40231a.getAbsolutePath(), 0, true, 0, 0);
                if (r40Var != null) {
                    efVar.f27894x = r40Var.f39060c;
                    efVar.f27895y = r40Var.d;
                }
                p40 p40Var = c50Var.h;
                org.telegram.messenger.e20 e20Var4 = c50Var.S;
                if (r40Var != null && !r40Var.f39058a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (r40Var != null) {
                    i10 = r40Var.f39059b;
                } else {
                    i10 = 0;
                }
                if (r40Var != null) {
                    j11 = r40Var.f39061e;
                }
                p40Var.u(efVar, e20Var4, z11, i10, 0, false, j11);
                return;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                u40 u40Var2 = (u40) ((ik) obj2).f36273b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && u40Var2.B0.size() > 1) {
                    ArrayList arrayList6 = u40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    return;
                }
                u40Var2.B0.add(bitmap);
                return;
            case 15:
                a60 a60Var2 = (a60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        a60Var2.n1.put(Long.valueOf(a60Var2.f33320m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        a60Var2.O1.f();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                u50 u50Var = (u50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (a60Var = u50Var.f40272a.f40684c).f33316e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.f33320m1;
                    org.telegram.ui.lb lbVar = abVar.f45556a;
                    ArrayList arrayList7 = lbVar.f49559p0;
                    int size = arrayList7.size();
                    int i13 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.j10.i(lbVar.getAccountInstance().f23246a).f24817n;
                    if (new org.telegram.messenger.fj(org.telegram.ui.lb.Q0(lbVar), tL_channelAdminLogEvent, lbVar.f49558o0, lbVar.f49557n0, lbVar.f49548f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.f49574z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((l60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor, 5));
                return;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.jo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 19:
                i80 i80Var = (i80) obj2;
                if (i80Var.P0 == ((n80) obj)) {
                    i80Var.performLongClick();
                    i80Var.P0 = null;
                    i80Var.N0.f(true);
                    return;
                }
                return;
            case 20:
                ((n2.o0) obj2).n((q80) obj, false);
                return;
            case 21:
                k90 k90Var = (k90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = k90Var.R) != null) {
                    p6Var.run();
                }
                k90Var.R = null;
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor2, 7));
                return;
            case 23:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.f3017a.remove(runnable);
                return;
            case 24:
                of0 of0Var = (of0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                of0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    of0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        of0Var.a(false);
                        return;
                    }
                    of0Var.d();
                    of0Var.f38185c.f35796g3.O(true);
                    return;
                }
                return;
            case 25:
                tf0 tf0Var = (tf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = tf0Var.f39891a;
                int i14 = tf0Var.f39900s;
                int size3 = arrayList8.size();
                tf0Var.f39900s = size3;
                if (i14 != size3 && tf0Var.Q != null) {
                    tf0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    qf0 qf0Var = (qf0) arrayList9.get(i15);
                    if (qf0Var.f38915o && !qf0Var.f38916p) {
                        arrayList8.add(qf0Var);
                    } else if (tf0.i(qf0Var.f38903a, arrayList8) == null) {
                        tf0 tf0Var2 = qf0Var.f38924y;
                        float f10 = tf0Var2.L;
                        RectF rectF = qf0Var.f38905c;
                        RectF rectF2 = qf0Var.f38907f;
                        q80 q80Var = qf0Var.f38918r;
                        if (q80Var != null) {
                            q80Var.a();
                            qf0Var.f38920t = z15;
                            qf0Var.f38919s = z15;
                        }
                        qf0Var.f38915o = z16;
                        if (rectF.left - 1.0f <= f10) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= tf0Var2.getMeasuredWidth() - f10) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        qf0Var.f38908g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = qf0Var.f38903a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (tf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    qf0Var.f38906e.e(z14, 0.0f);
                                    arrayList8.add(qf0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            qf0Var.f38906e.e(z14, 0.0f);
                            arrayList8.add(qf0Var);
                        }
                        z14 = true;
                        qf0Var.f38906e.e(z14, 0.0f);
                        arrayList8.add(qf0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                tf0Var.invalidate();
                return;
            case 26:
                qf0 qf0Var2 = (qf0) obj;
                sf0 sf0Var = ((tf0) obj2).f39903y;
                int i17 = qf0Var2.f38903a;
                RectF rectF3 = qf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.tt0) sf0Var).f52389b, i17, rectF3.left, rectF3.top);
                return;
            case 27:
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
            case 28:
                wh0 wh0Var = (wh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = wh0Var.f41833r;
                wh0Var.f41832n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    vh0 vh0Var = (vh0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            TLObject tLObject4 = ((vh0) arrayList11.get(i19)).f40830a;
                            if (tLObject4 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject4).f28431id;
                            } else if (tLObject4 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject4).f28580id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject5 = vh0Var.f40830a;
                            if (tLObject5 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject5).f28431id;
                            } else if (tLObject5 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject5).f28580id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (vh0Var.f40832c > 0) {
                                    ((vh0) arrayList11.get(i19)).f40832c = vh0Var.f40832c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(vh0Var);
                        }
                    }
                }
                q0.a aVar = wh0Var.f41836x;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                wh0Var.a();
                return;
            default:
                nm0 nm0Var = (nm0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = nm0Var.L;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (K = nm0Var.K()) < nm0Var.b()) {
                    arrayList12.remove(indexOf);
                    nm0Var.s(K + 1 + indexOf);
                    int size6 = nm0Var.f17504k0.f17755e.size();
                    int size7 = arrayList12.size();
                    if (nm0Var.H0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        nm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
