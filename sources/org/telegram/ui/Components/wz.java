package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wz extends na {
    public static final int f40239x2 = 0;
    public String P1;
    public int Q1;
    public TL_chatlists.chatlist_ChatlistInvite R1;
    public TL_chatlists.TL_chatlists_chatlistUpdates S1;
    public final boolean T1;
    public String U1;
    public ArrayList V1;
    public boolean W1;
    public CharSequence X1;
    public ArrayList Y1;
    public ArrayList Z1;
    public ArrayList f40240a2;
    public ArrayList f40241b2;
    public FrameLayout f40242c2;
    public sz d2;
    public View f40243e2;
    public vz f40244f2;
    public int f40245g2;
    public int f40246h2;
    public int f40247i2;
    public int f40248j2;
    public int f40249k2;
    public int f40250l2;
    public int f40251m2;
    public int f40252n2;
    public int f40253o2;
    public int f40254p2;
    public tz f40255q2;
    public int f40256r2;
    public boolean f40257s2;
    public org.telegram.messenger.c20 f40258t2;
    public int f40259u2;
    public long f40260v2;
    public long f40261w2;

    public wz(org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList) {
        super(f2Var, false);
        org.telegram.messenger.vo voVar;
        TLRPC.Chat M0;
        this.Q1 = -1;
        this.U1 = "";
        this.V1 = new ArrayList();
        this.X1 = "";
        this.Z1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f40240a2 = arrayList2;
        this.f40256r2 = -1;
        this.f40259u2 = -5;
        this.Q1 = i7;
        this.T1 = true;
        this.Y1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = f2Var.getMessagesController().P0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.vo) arrayList3.get(i10)).f26070a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList3.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        if (voVar != null) {
            this.U1 = voVar.f26071b;
            this.V1 = voVar.f26072c;
            this.W1 = voVar.f26081n;
            for (int i11 = 0; i11 < this.f40240a2.size(); i11++) {
                TLRPC.Peer z12 = f2Var.getMessagesController().z1(((Long) this.f40240a2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.Y1.add(z12);
                }
            }
            for (int i12 = 0; i12 < voVar.h.size(); i12++) {
                Long l10 = (Long) voVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f40240a2.contains(l10)) {
                    TLRPC.Peer z13 = f2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = f2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.Y1.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.f2 f2Var, int i7, org.telegram.messenger.c20 c20Var) {
        org.telegram.messenger.vo voVar;
        ArrayList arrayList = f2Var.getMessagesController().P0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.vo) arrayList.get(i10)).f26070a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(i7, f2Var, c20Var, 8);
        if (voVar != null && voVar.f()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getContext());
            String M0 = org.telegram.messenger.id.M0(2131750790, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131750788, null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new em(c20Var));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new bx(q8Var, 3));
            f2Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                return;
            }
            return;
        }
        q8Var.run();
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        return new pz(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.id.M0(2131750633, null);
        }
        if (this.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.id.M0(2131750636, null);
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.id.M0(2131750635, null);
        }
        return org.telegram.messenger.id.M0(2131750634, null);
    }

    @Override
    public final void U0(tt0 tt0Var) {
        float f10;
        qj0 qj0Var = this.f36303k1;
        qj0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.d2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        qj0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        qj0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z9) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.id.G(this.f40240a2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z9 && this.f40255q2 != null) {
            str = ", " + ((Object) this.f40255q2.f38537b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f40256r2 >= 0) {
            this.f36305o1.getConnectionsManager().cancelRequest(this.f40256r2, true);
        }
        org.telegram.messenger.c20 c20Var = this.f40258t2;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(this.f40257s2));
            this.f40258t2 = null;
        }
    }

    public final void e1(tz tzVar, boolean z9) {
        int i7;
        ArrayList arrayList = this.Y1;
        ArrayList arrayList2 = this.f40240a2;
        arrayList2.clear();
        arrayList2.addAll(this.Z1);
        int i10 = 0;
        if (!z9) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        h1(true);
        if (z9) {
            i7 = 2131745670;
        } else {
            i7 = 2131751457;
        }
        tzVar.a(org.telegram.messenger.id.M0(i7, null), new bi.u7(this, tzVar, z9, 20));
        d1(true);
        while (true) {
            qj0 qj0Var = this.f36303k1;
            if (i10 < qj0Var.getChildCount()) {
                View childAt = qj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.h4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void f1() {
        boolean z9;
        long j3;
        boolean r02;
        ArrayList arrayList = this.f40241b2;
        this.X1 = org.telegram.messenger.g0.K2(this.U1, "✱", "*");
        ArrayList arrayList2 = this.Y1;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z9 = false;
                    } else {
                        boolean z10 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.f2 f2Var = this.f36305o1;
                        if (z10) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(f2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(f2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else {
                            z9 = false;
                            j3 = 0;
                        }
                        z9 = !r02;
                    }
                    if (j3 != 0 && !this.T1) {
                        if (z9) {
                            this.Z1.add(Long.valueOf(j3));
                        }
                        this.f40240a2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f40245g2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f40245g2;
            int i11 = i10 + 1;
            this.f40246h2 = i10;
            int i12 = i10 + 2;
            this.f40245g2 = i12;
            this.f40247i2 = i11;
            this.f40248j2 = i12;
            int size = arrayList2.size() + i12;
            this.f40245g2 = size;
            this.f40249k2 = size;
        } else {
            this.f40246h2 = -1;
            this.f40247i2 = -1;
            this.f40248j2 = -1;
            this.f40249k2 = -1;
        }
        int i13 = this.f40245g2;
        this.f40245g2 = i13 + 1;
        this.f40250l2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f40245g2;
            int i15 = i14 + 1;
            this.f40245g2 = i15;
            this.f40251m2 = i14;
            this.f40252n2 = i15;
            int size2 = arrayList.size() + i15;
            this.f40253o2 = size2;
            this.f40245g2 = size2 + 1;
            this.f40254p2 = size2;
        } else {
            this.f40251m2 = -1;
            this.f40252n2 = -1;
            this.f40253o2 = -1;
            this.f40254p2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        xq xqVar = xq.h;
        frameLayout.f38190e = new w5(350L, xqVar);
        float f10 = 0.0f;
        frameLayout.f38192n = 0.0f;
        frameLayout.f38195w = 1.0f;
        frameLayout.D = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.l6.I.q();
        View view = new View(context);
        frameLayout.f38191f = view;
        int i16 = org.telegram.ui.ActionBar.l6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.l6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.l6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f38187a = paint;
        int i17 = org.telegram.ui.ActionBar.l6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, i17, false));
        i6 i6Var = new i6(true, true, false);
        frameLayout.f38188b = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.setCallback(frameLayout);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, i17, false));
        i6Var.t("", true, true);
        i6Var.f34587b = 1;
        i6 i6Var2 = new i6(false, false, true);
        frameLayout.f38189c = i6Var2;
        i6Var2.n(0.3f, 250L, xqVar);
        i6Var2.setCallback(frameLayout);
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, i16, false));
        i6Var2.t("", true, true);
        i6Var2.f34587b = 1;
        frameLayout.setWillNotDraw(false);
        this.d2 = frameLayout;
        frameLayout.setOnClickListener(new h0(this, 15));
        this.f28624b.addView(this.d2, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f40243e2 = view2;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, view2, null);
        this.f28624b.addView(this.f40243e2, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22562p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.d2 != null) {
            f10 = 68.0f;
        }
        this.f36303k1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f40242c2 = frameLayout2;
        this.f28624b.addView(frameLayout2, c8.ha.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
        h1(false);
        this.l1.setTitle(O0());
    }

    public final void h1(boolean z9) {
        String M0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.R1;
        ArrayList arrayList = this.f40240a2;
        int size = arrayList.size();
        sz szVar = this.d2;
        if (szVar != null) {
            if (this.T1) {
                if (size > 0) {
                    i10 = 2131750669;
                } else {
                    i10 = 2131750670;
                }
                szVar.b(org.telegram.messenger.id.M0(i10, null), z9);
            } else {
                ArrayList arrayList2 = this.Y1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.d2.b(org.telegram.messenger.id.V(null, null, 2131750675, org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(this.U1, this.d2.f38188b.f34585a.getFontMetricsInt(), false, null, 0), this.V1, this.d2.f38188b.f34585a.getFontMetricsInt(), false)), z9);
                        sz szVar2 = this.d2;
                        if (this.W1) {
                            i11 = 26;
                        }
                        szVar2.f38188b.f34600p = i11;
                    } else {
                        sz szVar3 = this.d2;
                        if (size > 0) {
                            M0 = org.telegram.messenger.id.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131750671, null);
                        }
                        szVar3.b(M0, z9);
                    }
                } else {
                    this.d2.b(org.telegram.messenger.id.M0(2131747831, null), z9);
                }
            }
            sz szVar4 = this.d2;
            i6 i6Var = szVar4.f38189c;
            if (z9) {
                i6Var.a();
            }
            if (z9 && size != (i7 = szVar4.f38197y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = szVar4.f38196x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    szVar4.f38196x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                szVar4.f38196x = ofFloat;
                ofFloat.addUpdateListener(new qz(szVar4, 1));
                szVar4.f38196x.addListener(new z5(szVar4, 28));
                org.telegram.messenger.camera.q.i(2.0f, szVar4.f38196x);
                szVar4.f38196x.setDuration(200L);
                szVar4.f38196x.start();
            }
            szVar4.f38197y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            szVar4.d = f10;
            i6Var.t("" + size, z9, true);
            szVar4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.d2.setEnabled(!arrayList.isEmpty());
            }
        }
        vz vzVar = this.f40244f2;
        if (vzVar != null) {
            vzVar.a();
        }
    }

    public final void i1() {
        int i7;
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.Y1;
        tz tzVar = this.f40255q2;
        if (tzVar == null) {
            return;
        }
        boolean z9 = false;
        if (this.T1) {
            tzVar.b(org.telegram.messenger.id.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            tzVar.b(org.telegram.messenger.id.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f40240a2.size() >= arrayList2.size() - arrayList.size()) {
                z9 = true;
            }
            tz tzVar2 = this.f40255q2;
            if (z9) {
                i7 = 2131751457;
            } else {
                i7 = 2131745670;
            }
            tzVar2.a(org.telegram.messenger.id.M0(i7, null), new bi.k1(24, this, z9));
            return;
        }
        this.f40255q2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
            if (this.G0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
