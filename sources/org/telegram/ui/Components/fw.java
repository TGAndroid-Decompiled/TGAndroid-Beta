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
public final class fw implements Runnable {
    public final int f35283a;
    public final Object f35284b;
    public final Object f35285c;

    public fw(int i7, Object obj, Object obj2) {
        this.f35283a = i7;
        this.f35284b = obj;
        this.f35285c = obj2;
    }

    @Override
    public final void run() {
        final int i7;
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        a60 a60Var;
        org.telegram.ui.ab abVar;
        di.p6 p6Var;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        long j11;
        int indexOf;
        int K;
        int i11 = this.f35283a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f35285c;
        Object obj2 = this.f35284b;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                ty tyVar = ((pw) obj2).f38623a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.si.d0(tyVar.f40074d1).N1(tL_messages_stickerSet, true);
                    org.telegram.messenger.si.d0(tyVar.f40074d1).U1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 1:
                lx lxVar = (lx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                lxVar.f37281x.f35939f = true;
                ty tyVar2 = lxVar.H;
                if (!tyVar2.f40112q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f28425id))) {
                    tyVar2.f40112q1.add(Long.valueOf(tL_messages_stickerSet2.set.f28425id));
                }
                lxVar.a(true);
                return;
            case 2:
                final rx rxVar = (rx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ty tyVar3 = rxVar.f39323a.G;
                if (!Arrays.equals(tyVar3.X0, G0)) {
                    i7 = 0;
                    org.telegram.messenger.si.d0(tyVar3.f40074d1).O(G0, false);
                } else {
                    i7 = 0;
                }
                tyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                org.telegram.messenger.y10 y10Var = new org.telegram.messenger.y10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.si.d0(rxVar2.f39323a.G.f40074d1).d2(true, str, new bi.j(rxVar2, arrayList3, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.f39323a.G;
                                if (org.telegram.messenger.cz.F || org.telegram.messenger.k10.i(tyVar4.f40074d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = tyVar4.f40074d1;
                                    ArrayList u02 = org.telegram.messenger.si.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28425id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28425id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.d0(i12).f26817t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28425id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(i12).n0(org.telegram.messenger.si.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28425id));
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
                rh rhVar = new rh(4, rxVar, str);
                org.telegram.messenger.y10 y10Var2 = new org.telegram.messenger.y10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                rx rxVar2 = rxVar;
                                org.telegram.messenger.si.d0(rxVar2.f39323a.G.f40074d1).d2(true, str, new bi.j(rxVar2, arrayList2, (Runnable) obj3, 13));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ty tyVar4 = rxVar.f39323a.G;
                                if (org.telegram.messenger.cz.F || org.telegram.messenger.k10.i(tyVar4.f40074d1).q()) {
                                    String M3 = org.telegram.messenger.g0.M3((str + "").toLowerCase());
                                    int i12 = tyVar4.f40074d1;
                                    ArrayList u02 = org.telegram.messenger.si.d0(i12).u0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (u02 != null) {
                                        for (int i13 = 0; i13 < u02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28425id))) {
                                                String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                                    arrayList6.add(new mx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28425id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.d0(i12).f26817t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28425id))) {
                                                String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title.toLowerCase());
                                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(i12).n0(org.telegram.messenger.si.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28425id));
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
                rh rhVar2 = new rh(5, rxVar, arrayList);
                di.m2 m2Var = new di.m2(rxVar, str, arrayList, arrayList2, arrayList3, 4);
                org.telegram.messenger.y10[] y10VarArr = new org.telegram.messenger.y10[5];
                y10VarArr[i7] = y10Var;
                y10VarArr[1] = rhVar;
                y10VarArr[2] = y10Var2;
                y10VarArr[3] = rhVar2;
                y10VarArr[4] = m2Var;
                Utilities.u(i7, y10VarArr);
                return;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                sx sxVar = ((rx) obj2).f39323a;
                sxVar.G.W.e(false);
                ArrayList arrayList5 = sxVar.f39668r;
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
            case 4:
                ((xx) obj2).F((String) obj, "", true, false, false);
                return;
            case 5:
                xx xxVar = (xx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ty tyVar4 = xxVar.M;
                org.telegram.messenger.np.u1(tyVar4.f40074d1).f4(tL_contacts_resolvedPeer.users, false);
                int i12 = tyVar4.f40074d1;
                org.telegram.messenger.np.u1(i12).Z3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.ur.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xxVar.f42220x;
                xxVar.f42220x = null;
                xxVar.F(str2, "", false, false, false);
                return;
            case 6:
                ez ezVar = (ez) obj2;
                hi.c7 c7Var = (hi.c7) obj;
                ezVar.b();
                ezVar.g(c7Var);
                hz hzVar = ezVar.K;
                hzVar.f35974h1 = c7Var;
                hzVar.j();
                return;
            case 7:
                ((ez) obj2).K.f35969f1 = (gz) obj;
                return;
            case 8:
                ((i00) obj2).f36042v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 9:
                ((rh) obj2).a((org.telegram.ui.ActionBar.g2) obj);
                return;
            case 10:
                x30 x30Var = (x30) obj2;
                Uri uri = (Uri) obj;
                x30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x30Var.f41915a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? g2Var = new org.telegram.ui.ActionBar.g2(bundle);
                        g2Var.f52300e = false;
                        g2Var.f52301f = false;
                        g2Var.f52299c = x30Var;
                        launchActivity.t0(g2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    x30Var.r(false, org.telegram.messenger.fc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
                u40 u40Var = (u40) obj2;
                r40 r40Var = (r40) obj;
                c50 c50Var = u40Var.I0;
                org.telegram.messenger.f20 f20Var = new org.telegram.messenger.f20();
                c50Var.S = f20Var;
                f20Var.f23790a = -1L;
                f20Var.f23792b = -1L;
                f20Var.f23806q = Math.max(1L, c50Var.Q);
                org.telegram.messenger.f20 f20Var2 = c50Var.S;
                f20Var2.f23808s = true;
                f20Var2.f23811w = c50Var.M;
                f20Var2.f23812x = c50Var.N;
                f20Var2.f23813y = c50Var.O;
                f20Var2.f23814z = c50Var.P;
                f20Var2.f23803n = 25;
                f20Var2.h = 360;
                f20Var2.f23800k = 360;
                f20Var2.f23798i = 360;
                f20Var2.f23801l = 360;
                f20Var2.f23804o = u40Var.f40206a.getAbsolutePath();
                org.telegram.messenger.f20 f20Var3 = c50Var.S;
                f20Var3.P = true;
                f20Var3.O = c50Var.f34000j1;
                f20Var3.f23807r = c50Var.f34001k0;
                c50Var.f34000j1 = null;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, u40Var.f40206a.getAbsolutePath(), 0, true, 0, 0);
                if (r40Var != null) {
                    ffVar.f28042x = r40Var.f39024c;
                    ffVar.f28043y = r40Var.d;
                }
                p40 p40Var = c50Var.h;
                org.telegram.messenger.f20 f20Var4 = c50Var.S;
                if (r40Var != null && !r40Var.f39022a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (r40Var != null) {
                    i10 = r40Var.f39023b;
                } else {
                    i10 = 0;
                }
                if (r40Var != null) {
                    j3 = r40Var.f39025e;
                } else {
                    j3 = 0;
                }
                p40Var.u(ffVar, f20Var4, z11, i10, 0, false, j3);
                return;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                u40 u40Var2 = (u40) ((ik) obj2).f36222b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && u40Var2.B0.size() > 1) {
                    ArrayList arrayList6 = u40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    return;
                }
                u40Var2.B0.add(bitmap);
                return;
            case 13:
                a60 a60Var2 = (a60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        a60Var2.n1.put(Long.valueOf(a60Var2.f33299m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        a60Var2.O1.f();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                u50 u50Var = (u50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (a60Var = u50Var.f40247a.f40637c).f33295e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.f33299m1;
                    org.telegram.ui.lb lbVar = abVar.f45527a;
                    ArrayList arrayList7 = lbVar.f49539p0;
                    int size = arrayList7.size();
                    int i13 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.k10.i(lbVar.getAccountInstance().f23166a).f24951n;
                    if (new org.telegram.messenger.gj(org.telegram.ui.lb.Q0(lbVar), tL_channelAdminLogEvent, lbVar.f49538o0, lbVar.f49537n0, lbVar.f49528f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.f49554z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((l60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor, 5));
                return;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.io) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 17:
                i80 i80Var = (i80) obj2;
                if (i80Var.P0 == ((n80) obj)) {
                    i80Var.performLongClick();
                    i80Var.P0 = null;
                    i80Var.N0.f(true);
                    return;
                }
                return;
            case 18:
                ((n2.o0) obj2).n((q80) obj, false);
                return;
            case 19:
                k90 k90Var = (k90) obj2;
                if (!((boolean[]) obj)[0] && (p6Var = k90Var.R) != null) {
                    p6Var.run();
                }
                k90Var.R = null;
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.g3(new j(editTextBoldCursor2, 7));
                return;
            case 21:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.f2975a.remove(runnable);
                return;
            case 22:
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
                    of0Var.f38146c.f35742g3.O(true);
                    return;
                }
                return;
            case 23:
                tf0 tf0Var = (tf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = tf0Var.f39837a;
                int i14 = tf0Var.f39846s;
                int size3 = arrayList8.size();
                tf0Var.f39846s = size3;
                if (i14 != size3 && tf0Var.Q != null) {
                    tf0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    qf0 qf0Var = (qf0) arrayList9.get(i15);
                    if (qf0Var.f38861o && !qf0Var.f38862p) {
                        arrayList8.add(qf0Var);
                    } else if (tf0.i(qf0Var.f38849a, arrayList8) == null) {
                        tf0 tf0Var2 = qf0Var.f38870y;
                        float f10 = tf0Var2.L;
                        RectF rectF = qf0Var.f38851c;
                        RectF rectF2 = qf0Var.f38853f;
                        q80 q80Var = qf0Var.f38864r;
                        if (q80Var != null) {
                            q80Var.a();
                            qf0Var.f38866t = z15;
                            qf0Var.f38865s = z15;
                        }
                        qf0Var.f38861o = z16;
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
                        qf0Var.f38854g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = qf0Var.f38849a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (tf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    qf0Var.f38852e.e(z14, 0.0f);
                                    arrayList8.add(qf0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            qf0Var.f38852e.e(z14, 0.0f);
                            arrayList8.add(qf0Var);
                        }
                        z14 = true;
                        qf0Var.f38852e.e(z14, 0.0f);
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
            case 24:
                qf0 qf0Var2 = (qf0) obj;
                sf0 sf0Var = ((tf0) obj2).f39849y;
                int i17 = qf0Var2.f38849a;
                RectF rectF3 = qf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.ut0) sf0Var).f52631b, i17, rectF3.left, rectF3.top);
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
                wh0 wh0Var = (wh0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = wh0Var.f41801r;
                wh0Var.f41800n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    vh0 vh0Var = (vh0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            TLObject tLObject4 = ((vh0) arrayList11.get(i19)).f40782a;
                            if (tLObject4 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject4).f28398id;
                            } else if (tLObject4 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject4).f28547id;
                            } else {
                                j10 = 0;
                            }
                            TLObject tLObject5 = vh0Var.f40782a;
                            if (tLObject5 instanceof TLRPC.Chat) {
                                j11 = -((TLRPC.Chat) tLObject5).f28398id;
                            } else if (tLObject5 instanceof TLRPC.User) {
                                j11 = ((TLRPC.User) tLObject5).f28547id;
                            } else {
                                j11 = 0;
                            }
                            if (j10 == j11) {
                                if (vh0Var.f40784c > 0) {
                                    ((vh0) arrayList11.get(i19)).f40784c = vh0Var.f40784c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(vh0Var);
                        }
                    }
                }
                q0.a aVar = wh0Var.f41804x;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                wh0Var.a();
                return;
            case 27:
                mm0 mm0Var = (mm0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = mm0Var.L;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (K = mm0Var.K()) < mm0Var.b()) {
                    arrayList12.remove(indexOf);
                    mm0Var.s(K + 1 + indexOf);
                    int size6 = mm0Var.f17473k0.f17724e.size();
                    int size7 = arrayList12.size();
                    if (mm0Var.H0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        mm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((mm0) obj2).S();
                lc.b0((org.telegram.ui.cx) obj).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                return;
            default:
                ((ym0) obj2).sendAccessibilityEvent((View) obj, 4);
                return;
        }
    }
}
