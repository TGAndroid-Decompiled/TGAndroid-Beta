package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class at implements Runnable {
    public final int f24486a;
    public final Object f24487b;
    public final Object f24488c;

    public at(int i10, Object obj, Object obj2) {
        this.f24486a = i10;
        this.f24487b = obj;
        this.f24488c = obj2;
    }

    @Override
    public final void run() {
        final int i10;
        boolean z10;
        boolean z11;
        int i11;
        long j10;
        c60 c60Var;
        org.telegram.ui.gb gbVar;
        ag.j0 j0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12 = this.f24486a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f24488c;
        Object obj2 = this.f24487b;
        switch (i12) {
            case 0:
                ((bt) obj2).setImage((Bitmap) obj);
                return;
            case 1:
                ((EditTextBoldCursor) obj2).f24009o0.draw((Canvas) obj);
                return;
            case 2:
                org.telegram.messenger.wp.r1(((nu) obj2).f28965a.f21584a).e5((TLRPC.EmojiStatus) obj, null);
                return;
            case 3:
                org.telegram.messenger.wp.r1(((pw) obj2).f29559a.f31943c1).e5((TLRPC.EmojiStatus) obj, null);
                return;
            case 4:
                TLObject tLObject = (TLObject) obj;
                vy vyVar = ((pw) obj2).f29559a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.vi.b0(vyVar.f31943c1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.vi.b0(vyVar.f31943c1).P1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 5:
                mx mxVar = (mx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                mxVar.f28602x.f27195f = true;
                vy vyVar2 = mxVar.G;
                if (!vyVar2.f31982p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19821id))) {
                    vyVar2.f31982p1.add(Long.valueOf(tL_messages_stickerSet2.set.f19821id));
                }
                mxVar.a(true);
                return;
            case 6:
                final tx txVar = (tx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.i0.G0();
                vy vyVar3 = txVar.f30727a.F;
                if (!Arrays.equals(vyVar3.W0, G0)) {
                    i10 = 0;
                    org.telegram.messenger.vi.b0(vyVar3.f31943c1).M(G0, false);
                } else {
                    i10 = 0;
                }
                vyVar3.W0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.r20() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i10) {
                            case 0:
                                tx txVar2 = txVar;
                                org.telegram.messenger.vi.b0(txVar2.f30727a.F.f31943c1).Y1(true, str, new kg.d0(txVar2, arrayList3, (Runnable) obj3, 3));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                vy vyVar4 = txVar.f30727a.F;
                                if (org.telegram.messenger.uz.F || org.telegram.messenger.e20.i(vyVar4.f31943c1).q()) {
                                    String N3 = org.telegram.messenger.i0.N3((str + "").toLowerCase());
                                    int i13 = vyVar4.f31943c1;
                                    ArrayList s02 = org.telegram.messenger.vi.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19821id))) {
                                                String N32 = org.telegram.messenger.i0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new nx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19821id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.vi.b0(i13).f18674s0[1];
                                    if (arrayList7 != null) {
                                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19821id))) {
                                                String N33 = org.telegram.messenger.i0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.vi.b0(i13).l0(org.telegram.messenger.vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList4 = l02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new nx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19821id));
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
                }, new vg(7, txVar, str), new org.telegram.messenger.r20() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i10) {
                            case 0:
                                tx txVar2 = txVar;
                                org.telegram.messenger.vi.b0(txVar2.f30727a.F.f31943c1).Y1(true, str, new kg.d0(txVar2, arrayList2, (Runnable) obj3, 3));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                vy vyVar4 = txVar.f30727a.F;
                                if (org.telegram.messenger.uz.F || org.telegram.messenger.e20.i(vyVar4.f31943c1).q()) {
                                    String N3 = org.telegram.messenger.i0.N3((str + "").toLowerCase());
                                    int i13 = vyVar4.f31943c1;
                                    ArrayList s02 = org.telegram.messenger.vi.b0(i13).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (s02 != null) {
                                        for (int i14 = 0; i14 < s02.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19821id))) {
                                                String N32 = org.telegram.messenger.i0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new nx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19821id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.vi.b0(i13).f18674s0[1];
                                    if (arrayList7 != null) {
                                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19821id))) {
                                                String N33 = org.telegram.messenger.i0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.vi.b0(i13).l0(org.telegram.messenger.vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList4 = l02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new nx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19821id));
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
                }, new vg(8, txVar, arrayList), new org.telegram.ui.pa(txVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                ux uxVar = ((tx) obj2).f30727a;
                uxVar.F.V.e(false);
                ArrayList arrayList5 = uxVar.f31103r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uxVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                uxVar.f();
                return;
            case 8:
                ((zx) obj2).F((String) obj, "", true, false, false);
                return;
            case 9:
                zx zxVar = (zx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                vy vyVar4 = zxVar.L;
                org.telegram.messenger.wp.r1(vyVar4.f31943c1).V3(tL_contacts_resolvedPeer.users, false);
                int i13 = vyVar4.f31943c1;
                org.telegram.messenger.wp.r1(i13).P3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.is.a0(i13).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = zxVar.f33252x;
                zxVar.f33252x = null;
                zxVar.F(str2, "", false, false, false);
                return;
            case 10:
                gz gzVar = (gz) obj2;
                vh.m5 m5Var = (vh.m5) obj;
                gzVar.b();
                gzVar.g(m5Var);
                jz jzVar = gzVar.J;
                jzVar.f27627h1 = m5Var;
                jzVar.j();
                return;
            case 11:
                ((gz) obj2).J.f27622f1 = (iz) obj;
                return;
            case 12:
                ((j00) obj2).f27234r2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 13:
                ((vg) obj2).a((org.telegram.ui.ActionBar.k2) obj);
                return;
            case 14:
                b40 b40Var = (b40) obj2;
                Uri uri = (Uri) obj;
                b40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) b40Var.f24618a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? k2Var = new org.telegram.ui.ActionBar.k2(bundle);
                        k2Var.e = false;
                        k2Var.f44029f = false;
                        k2Var.f44028c = b40Var;
                        launchActivity.t0(k2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    b40Var.r(false, org.telegram.messenger.ic.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                x40 x40Var = (x40) obj2;
                u40 u40Var = (u40) obj;
                e50 e50Var = x40Var.H0;
                org.telegram.messenger.y20 y20Var = new org.telegram.messenger.y20();
                e50Var.R = y20Var;
                y20Var.f19526a = -1L;
                y20Var.f19528b = -1L;
                y20Var.f19541q = Math.max(1L, e50Var.P);
                org.telegram.messenger.y20 y20Var2 = e50Var.R;
                y20Var2.f19543s = true;
                y20Var2.f19546w = e50Var.L;
                y20Var2.f19547x = e50Var.M;
                y20Var2.f19548y = e50Var.N;
                y20Var2.f19549z = e50Var.O;
                y20Var2.f19538n = 25;
                y20Var2.h = 360;
                y20Var2.f19535k = 360;
                y20Var2.f19533i = 360;
                y20Var2.f19536l = 360;
                y20Var2.f19539o = x40Var.f32376a.getAbsolutePath();
                org.telegram.messenger.y20 y20Var3 = e50Var.R;
                y20Var3.P = true;
                y20Var3.O = e50Var.f25713i1;
                y20Var3.f19542r = e50Var.f25714j0;
                e50Var.f25713i1 = null;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, x40Var.f32376a.getAbsolutePath(), 0, true, 0, 0);
                if (u40Var != null) {
                    ffVar.f14621x = u40Var.f30858c;
                    ffVar.f14622y = u40Var.d;
                }
                s40 s40Var = e50Var.h;
                org.telegram.messenger.y20 y20Var4 = e50Var.R;
                if (u40Var != null && !u40Var.f30856a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (u40Var != null) {
                    i11 = u40Var.f30857b;
                } else {
                    i11 = 0;
                }
                if (u40Var != null) {
                    j10 = u40Var.e;
                } else {
                    j10 = 0;
                }
                s40Var.u(ffVar, y20Var4, z11, i11, 0, false, j10);
                return;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                x40 x40Var2 = (x40) ((ew) obj2).f25945b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && x40Var2.A0.size() > 1) {
                    ArrayList arrayList6 = x40Var2.A0;
                    arrayList6.add((Bitmap) i0.a.g(1, arrayList6));
                    return;
                }
                x40Var2.A0.add(bitmap);
                return;
            case 17:
                c60 c60Var2 = (c60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                c60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        c60Var2.f25019j1.put(Long.valueOf(c60Var2.f25018i1.admin_id), (TLRPC.User) vector.objects.get(0));
                        c60Var2.K1.f();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                w50 w50Var = (w50) obj2;
                if (((TLRPC.TL_error) obj) == null && (gbVar = (c60Var = w50Var.f32085a.f32426c).a2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = c60Var.f25018i1;
                    org.telegram.ui.sb sbVar = gbVar.f37440a;
                    ArrayList arrayList7 = sbVar.f41319o0;
                    int size = arrayList7.size();
                    int i14 = sbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.e20.i(sbVar.getAccountInstance().f15043a).f15524n;
                    if (new org.telegram.messenger.kj(org.telegram.ui.sb.Q0(sbVar), tL_channelAdminLogEvent, sbVar.f41318n0, sbVar.m0, sbVar.f41309f, sbVar.T, true).U >= 0) {
                        sbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            sbVar.C0.N = true;
                            org.telegram.ui.pb pbVar = sbVar.E;
                            pbVar.o(pbVar.h, size2);
                            org.telegram.ui.sb.P0(sbVar);
                        }
                        sbVar.f41334y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((m60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.g3(new ot(editTextBoldCursor, 4));
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.cp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 21:
                l80 l80Var = (l80) obj2;
                if (l80Var.O0 == ((q80) obj)) {
                    l80Var.performLongClick();
                    l80Var.O0 = null;
                    l80Var.M0.f(true);
                    return;
                }
                return;
            case 22:
                ((ji.a) obj2).n((t80) obj, false);
                return;
            case 23:
                n90 n90Var = (n90) obj2;
                if (!((boolean[]) obj)[0] && (j0Var = n90Var.Q) != null) {
                    j0Var.run();
                }
                n90Var.Q = null;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((oh.c) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.g3(new ot(editTextBoldCursor2, 6));
                return;
            case 25:
                m2.t tVar = (m2.t) obj2;
                Runnable runnable = (Runnable) obj;
                tVar.getClass();
                runnable.run();
                ((HashMap) tVar.f12685b).remove(runnable);
                return;
            case 26:
                cg0 cg0Var = (cg0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                cg0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    cg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        cg0Var.a(false);
                        return;
                    }
                    cg0Var.d();
                    cg0Var.f25108c.f31183f3.O(true);
                    return;
                }
                return;
            case 27:
                hg0 hg0Var = (hg0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = hg0Var.f26788a;
                int i15 = hg0Var.f26795s;
                int size3 = arrayList8.size();
                hg0Var.f26795s = size3;
                if (i15 != size3 && hg0Var.P != null) {
                    hg0Var.g();
                }
                int size4 = arrayList9.size();
                int i16 = 0;
                while (i16 < size4) {
                    eg0 eg0Var = (eg0) arrayList9.get(i16);
                    if (eg0Var.f25823o && !eg0Var.f25824p) {
                        arrayList8.add(eg0Var);
                    } else if (hg0.i(eg0Var.f25812a, arrayList8) == null) {
                        hg0 hg0Var2 = eg0Var.f25832y;
                        float f7 = hg0Var2.K;
                        RectF rectF = eg0Var.f25814c;
                        RectF rectF2 = eg0Var.f25815f;
                        t80 t80Var = eg0Var.f25826r;
                        if (t80Var != null) {
                            t80Var.a();
                            eg0Var.f25828t = z15;
                            eg0Var.f25827s = z15;
                        }
                        eg0Var.f25823o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= hg0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        eg0Var.f25816g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i17 = eg0Var.f25812a;
                            if (i17 != 3 && i17 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (hg0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    eg0Var.e.e(z14, 0.0f);
                                    arrayList8.add(eg0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            eg0Var.e.e(z14, 0.0f);
                            arrayList8.add(eg0Var);
                        }
                        z14 = true;
                        eg0Var.e.e(z14, 0.0f);
                        arrayList8.add(eg0Var);
                    }
                    i16++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                hg0Var.invalidate();
                return;
            case 28:
                eg0 eg0Var2 = (eg0) obj;
                gg0 gg0Var = ((hg0) obj2).f26798y;
                int i18 = eg0Var2.f25812a;
                RectF rectF3 = eg0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.av0) gg0Var).f35843b, i18, rectF3.left, rectF3.top);
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
