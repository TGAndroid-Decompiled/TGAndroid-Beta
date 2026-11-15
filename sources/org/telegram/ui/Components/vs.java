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
public final class vs implements Runnable {
    public final int f41141a;
    public final Object f41142b;
    public final Object f41143c;

    public vs(int i7, Object obj, Object obj2) {
        this.f41141a = i7;
        this.f41142b = obj;
        this.f41143c = obj2;
    }

    @Override
    public final void run() {
        final int i7;
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        p50 p50Var;
        org.telegram.ui.ab abVar;
        di.m6 m6Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f41141a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f41143c;
        Object obj2 = this.f41142b;
        switch (i11) {
            case 0:
                ((ws) obj2).setImage((Bitmap) obj);
                return;
            case 1:
                ((EditTextBoldCursor) obj2).f32533p0.draw((Canvas) obj);
                return;
            case 2:
                org.telegram.messenger.np.s1(((hu) obj2).f35345a.f29679a).i5((TLRPC.EmojiStatus) obj, null);
                return;
            case 3:
                org.telegram.messenger.np.s1(((hw) obj2).f35363a.f36941d1).i5((TLRPC.EmojiStatus) obj, null);
                return;
            case 4:
                TLObject tLObject = (TLObject) obj;
                ly lyVar = ((hw) obj2).f35363a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.si.b0(lyVar.f36941d1).I1(tL_messages_stickerSet, true);
                    org.telegram.messenger.si.b0(lyVar.f36941d1).P1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 5:
                dx dxVar = (dx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                dxVar.f34094x.f42434f = true;
                ly lyVar2 = dxVar.H;
                if (!lyVar2.f36979q1.contains(Long.valueOf(tL_messages_stickerSet2.set.f28078id))) {
                    lyVar2.f36979q1.add(Long.valueOf(tL_messages_stickerSet2.set.f28078id));
                }
                dxVar.a(true);
                return;
            case 6:
                final kx kxVar = (kx) obj2;
                final String str = (String) obj;
                String[] G0 = org.telegram.messenger.g0.G0();
                ly lyVar3 = kxVar.f36647a.G;
                if (!Arrays.equals(lyVar3.X0, G0)) {
                    i7 = 0;
                    org.telegram.messenger.si.b0(lyVar3.f36941d1).M(G0, false);
                } else {
                    i7 = 0;
                }
                lyVar3.X0 = G0;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.u(0, new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                kx kxVar2 = kxVar;
                                org.telegram.messenger.si.b0(kxVar2.f36647a.G.f36941d1).Y1(true, str, new bi.j(kxVar2, arrayList3, (Runnable) obj3, 10));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ly lyVar4 = kxVar.f36647a.G;
                                if (org.telegram.messenger.gz.F || org.telegram.messenger.m10.i(lyVar4.f36941d1).q()) {
                                    String N3 = org.telegram.messenger.g0.N3((str + "").toLowerCase());
                                    int i12 = lyVar4.f36941d1;
                                    ArrayList s02 = org.telegram.messenger.si.b0(i12).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (s02 != null) {
                                        for (int i13 = 0; i13 < s02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28078id))) {
                                                String N32 = org.telegram.messenger.g0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new ex(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28078id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.b0(i12).f26501t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28078id))) {
                                                String N33 = org.telegram.messenger.g0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i12).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList4 = l02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ex(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28078id));
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
                }, new gh(4, kxVar, str), new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        switch (i7) {
                            case 0:
                                kx kxVar2 = kxVar;
                                org.telegram.messenger.si.b0(kxVar2.f36647a.G.f36941d1).Y1(true, str, new bi.j(kxVar2, arrayList2, (Runnable) obj3, 10));
                                return;
                            default:
                                Runnable runnable = (Runnable) obj3;
                                ly lyVar4 = kxVar.f36647a.G;
                                if (org.telegram.messenger.gz.F || org.telegram.messenger.m10.i(lyVar4.f36941d1).q()) {
                                    String N3 = org.telegram.messenger.g0.N3((str + "").toLowerCase());
                                    int i12 = lyVar4.f36941d1;
                                    ArrayList s02 = org.telegram.messenger.si.b0(i12).s0(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (s02 != null) {
                                        for (int i13 = 0; i13 < s02.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f28078id))) {
                                                String N32 = org.telegram.messenger.g0.N3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                                    arrayList6.add(new ex(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f28078id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = org.telegram.messenger.si.b0(i12).f26501t0[1];
                                    if (arrayList7 != null) {
                                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28078id))) {
                                                String N33 = org.telegram.messenger.g0.N3(stickerSetCovered.set.title.toLowerCase());
                                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i12).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        if (l02 != null) {
                                                            arrayList4 = l02.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ex(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f28078id));
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
                }, new gh(5, kxVar, arrayList), new di.i2(kxVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                lx lxVar = ((kx) obj2).f36647a;
                lxVar.G.W.e(false);
                ArrayList arrayList5 = lxVar.f36922r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lxVar.F = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                lxVar.f();
                return;
            case 8:
                ((qx) obj2).F((String) obj, "", true, false, false);
                return;
            case 9:
                qx qxVar = (qx) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                ly lyVar4 = qxVar.M;
                org.telegram.messenger.np.s1(lyVar4.f36941d1).Y3(tL_contacts_resolvedPeer.users, false);
                int i12 = lyVar4.f36941d1;
                org.telegram.messenger.np.s1(i12).S3(tL_contacts_resolvedPeer.chats, false);
                org.telegram.messenger.vr.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = qxVar.f38789x;
                qxVar.f38789x = null;
                qxVar.F(str2, "", false, false, false);
                return;
            case 10:
                wy wyVar = (wy) obj2;
                hi.c7 c7Var = (hi.c7) obj;
                wyVar.b();
                wyVar.g(c7Var);
                zy zyVar = wyVar.K;
                zyVar.f42459h1 = c7Var;
                zyVar.j();
                return;
            case 11:
                ((wy) obj2).K.f42454f1 = (yy) obj;
                return;
            case 12:
                ((zz) obj2).f42517v2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 13:
                ((gh) obj2).a((org.telegram.ui.ActionBar.e2) obj);
                return;
            case 14:
                m30 m30Var = (m30) obj2;
                Uri uri = (Uri) obj;
                m30Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) m30Var.f37040a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? e2Var = new org.telegram.ui.ActionBar.e2(bundle);
                        e2Var.f50659e = false;
                        e2Var.f50660f = false;
                        e2Var.f50658c = m30Var;
                        launchActivity.t0(e2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    m30Var.r(false, org.telegram.messenger.fc.K(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 15:
                j40 j40Var = (j40) obj2;
                g40 g40Var = (g40) obj;
                r40 r40Var = j40Var.I0;
                org.telegram.messenger.g20 g20Var = new org.telegram.messenger.g20();
                r40Var.S = g20Var;
                g20Var.f23632a = -1L;
                g20Var.f23634b = -1L;
                g20Var.f23648q = Math.max(1L, r40Var.Q);
                org.telegram.messenger.g20 g20Var2 = r40Var.S;
                g20Var2.f23650s = true;
                g20Var2.f23653w = r40Var.M;
                g20Var2.f23654x = r40Var.N;
                g20Var2.f23655y = r40Var.O;
                g20Var2.f23656z = r40Var.P;
                g20Var2.f23645n = 25;
                g20Var2.h = 360;
                g20Var2.f23642k = 360;
                g20Var2.f23640i = 360;
                g20Var2.f23643l = 360;
                g20Var2.f23646o = j40Var.f35852a.getAbsolutePath();
                org.telegram.messenger.g20 g20Var3 = r40Var.S;
                g20Var3.P = true;
                g20Var3.O = r40Var.f38859j1;
                g20Var3.f23649r = r40Var.f38860k0;
                r40Var.f38859j1 = null;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, j40Var.f35852a.getAbsolutePath(), 0, true, 0, 0);
                if (g40Var != null) {
                    ffVar.f27727x = g40Var.f34793c;
                    ffVar.f27728y = g40Var.d;
                }
                e40 e40Var = r40Var.h;
                org.telegram.messenger.g20 g20Var4 = r40Var.S;
                if (g40Var != null && !g40Var.f34791a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (g40Var != null) {
                    i10 = g40Var.f34792b;
                } else {
                    i10 = 0;
                }
                if (g40Var != null) {
                    j3 = g40Var.f34794e;
                } else {
                    j3 = 0;
                }
                e40Var.u(ffVar, g20Var4, z11, i10, 0, false, j3);
                return;
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                j40 j40Var2 = (j40) ((zj) obj2).f42396b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && j40Var2.B0.size() > 1) {
                    ArrayList arrayList6 = j40Var2.B0;
                    arrayList6.add((Bitmap) i5.c.h(1, arrayList6));
                    return;
                }
                j40Var2.B0.add(bitmap);
                return;
            case 17:
                p50 p50Var2 = (p50) obj2;
                TLObject tLObject2 = (TLObject) obj;
                p50Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        p50Var2.n1.put(Long.valueOf(p50Var2.f38214m1.admin_id), (TLRPC.User) vector.objects.get(0));
                        p50Var2.O1.f();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                j50 j50Var = (j50) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (p50Var = j50Var.f35892a.f36288c).f38210e2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p50Var.f38214m1;
                    org.telegram.ui.lb lbVar = abVar.f44984a;
                    ArrayList arrayList7 = lbVar.f48949p0;
                    int size = arrayList7.size();
                    int i13 = lbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = org.telegram.messenger.m10.i(lbVar.getAccountInstance().f22778a).f24953n;
                    if (new org.telegram.messenger.gj(org.telegram.ui.lb.Q0(lbVar), tL_channelAdminLogEvent, lbVar.f48948o0, lbVar.f48947n0, lbVar.f48938f, lbVar.U, true).U >= 0) {
                        lbVar.W0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size2);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.f48964z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((a60) obj2).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new ht(editTextBoldCursor, 4));
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ho) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 21:
                v70 v70Var = (v70) obj2;
                if (v70Var.P0 == ((a80) obj)) {
                    v70Var.performLongClick();
                    v70Var.P0 = null;
                    v70Var.N0.f(true);
                    return;
                }
                return;
            case 22:
                ((n2.o0) obj2).o((d80) obj, false);
                return;
            case 23:
                x80 x80Var = (x80) obj2;
                if (!((boolean[]) obj)[0] && (m6Var = x80Var.R) != null) {
                    m6Var.run();
                }
                x80Var.R = null;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((zh.b) obj2).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.h3(new ht(editTextBoldCursor2, 6));
                return;
            case 25:
                b9.g0 g0Var = (b9.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                g0Var.f3007a.remove(runnable);
                return;
            case 26:
                cf0 cf0Var = (cf0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                cf0Var.N = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    cf0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        cf0Var.a(false);
                        return;
                    }
                    cf0Var.d();
                    cf0Var.f33546c.f39895g3.O(true);
                    return;
                }
                return;
            case 27:
                hf0 hf0Var = (hf0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = hf0Var.f35234a;
                int i14 = hf0Var.f35243s;
                int size3 = arrayList8.size();
                hf0Var.f35243s = size3;
                if (i14 != size3 && hf0Var.Q != null) {
                    hf0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    ef0 ef0Var = (ef0) arrayList9.get(i15);
                    if (ef0Var.f34298o && !ef0Var.f34299p) {
                        arrayList8.add(ef0Var);
                    } else if (hf0.i(ef0Var.f34286a, arrayList8) == null) {
                        hf0 hf0Var2 = ef0Var.f34307y;
                        float f10 = hf0Var2.L;
                        RectF rectF = ef0Var.f34288c;
                        RectF rectF2 = ef0Var.f34290f;
                        d80 d80Var = ef0Var.f34301r;
                        if (d80Var != null) {
                            d80Var.a();
                            ef0Var.f34303t = z15;
                            ef0Var.f34302s = z15;
                        }
                        ef0Var.f34298o = z16;
                        if (rectF.left - 1.0f <= f10) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= hf0Var2.getMeasuredWidth() - f10) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        ef0Var.f34291g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = ef0Var.f34286a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (hf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    ef0Var.f34289e.e(z14, 0.0f);
                                    arrayList8.add(ef0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ef0Var.f34289e.e(z14, 0.0f);
                            arrayList8.add(ef0Var);
                        }
                        z14 = true;
                        ef0Var.f34289e.e(z14, 0.0f);
                        arrayList8.add(ef0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                hf0Var.invalidate();
                return;
            case 28:
                ef0 ef0Var2 = (ef0) obj;
                gf0 gf0Var = ((hf0) obj2).f35246y;
                int i17 = ef0Var2.f34286a;
                RectF rectF3 = ef0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.qt0) gf0Var).f50792b, i17, rectF3.left, rectF3.top);
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
