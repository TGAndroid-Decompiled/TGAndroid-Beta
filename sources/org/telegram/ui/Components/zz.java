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
public final class zz extends ja {
    public static final int B2 = 0;
    public long A2;
    public String T1;
    public int U1;
    public TL_chatlists.chatlist_ChatlistInvite V1;
    public TL_chatlists.TL_chatlists_chatlistUpdates W1;
    public final boolean X1;
    public String Y1;
    public ArrayList Z1;
    public boolean f42497a2;
    public CharSequence f42498b2;
    public ArrayList f42499c2;
    public ArrayList d2;
    public ArrayList f42500e2;
    public ArrayList f42501f2;
    public FrameLayout f42502g2;
    public vz f42503h2;
    public View f42504i2;
    public yz f42505j2;
    public int f42506k2;
    public int f42507l2;
    public int f42508m2;
    public int f42509n2;
    public int f42510o2;
    public int f42511p2;
    public int f42512q2;
    public int f42513r2;
    public int f42514s2;
    public int f42515t2;
    public wz f42516u2;
    public int f42517v2;
    public boolean f42518w2;
    public org.telegram.messenger.z10 f42519x2;
    public int f42520y2;
    public long f42521z2;

    public zz(org.telegram.ui.ActionBar.e2 e2Var, int i7, ArrayList arrayList) {
        super(e2Var, false);
        org.telegram.messenger.so soVar;
        TLRPC.Chat M0;
        this.U1 = -1;
        this.Y1 = "";
        this.Z1 = new ArrayList();
        this.f42498b2 = "";
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f42500e2 = arrayList2;
        this.f42517v2 = -1;
        this.f42520y2 = -5;
        this.U1 = i7;
        this.X1 = true;
        this.f42499c2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = e2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList3.get(i10)).f26542a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList3.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        if (soVar != null) {
            this.Y1 = soVar.f26543b;
            this.Z1 = soVar.f26544c;
            this.f42497a2 = soVar.f26553n;
            for (int i11 = 0; i11 < this.f42500e2.size(); i11++) {
                TLRPC.Peer z12 = e2Var.getMessagesController().z1(((Long) this.f42500e2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.f42499c2.add(z12);
                }
            }
            for (int i12 = 0; i12 < soVar.h.size(); i12++) {
                Long l10 = (Long) soVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f42500e2.contains(l10)) {
                    TLRPC.Peer z13 = e2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = e2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.f42499c2.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.e2 e2Var, int i7, org.telegram.messenger.z10 z10Var) {
        org.telegram.messenger.so soVar;
        ArrayList arrayList = e2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList.get(i10)).f26542a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(i7, e2Var, z10Var, 11);
        if (soVar != null && soVar.f()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getContext());
            String M0 = org.telegram.messenger.hd.M0(2131750790, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131750788, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new mm(z10Var));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new gx(f0Var, 3));
            e2Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                return;
            }
            return;
        }
        f0Var.run();
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new sz(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.X1) {
            return org.telegram.messenger.hd.M0(2131750633, null);
        }
        if (this.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.hd.M0(2131750636, null);
        }
        ArrayList arrayList = this.f42499c2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.hd.M0(2131750635, null);
        }
        return org.telegram.messenger.hd.M0(2131750634, null);
    }

    @Override
    public final void U0(st0 st0Var) {
        float f10;
        uj0 uj0Var = this.f35936o1;
        uj0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f42503h2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        uj0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        uj0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.hd.G(this.f42500e2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z10 && this.f42516u2 != null) {
            str = ", " + ((Object) this.f42516u2.f41489b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f42517v2 >= 0) {
            this.f35940s1.getConnectionsManager().cancelRequest(this.f42517v2, true);
        }
        org.telegram.messenger.z10 z10Var = this.f42519x2;
        if (z10Var != null) {
            z10Var.a(Boolean.valueOf(this.f42518w2));
            this.f42519x2 = null;
        }
    }

    public final void e1(wz wzVar, boolean z10) {
        int i7;
        ArrayList arrayList = this.f42499c2;
        ArrayList arrayList2 = this.f42500e2;
        arrayList2.clear();
        arrayList2.addAll(this.d2);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        h1(true);
        if (z10) {
            i7 = 2131745670;
        } else {
            i7 = 2131751457;
        }
        wzVar.a(org.telegram.messenger.hd.M0(i7, null), new di.m6(this, wzVar, z10, 20));
        d1(true);
        while (true) {
            uj0 uj0Var = this.f35936o1;
            if (i10 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i10);
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
        boolean z10;
        long j3;
        boolean r02;
        ArrayList arrayList = this.f42501f2;
        this.f42498b2 = org.telegram.messenger.g0.K2(this.Y1, "✱", "*");
        ArrayList arrayList2 = this.f42499c2;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.e2 e2Var = this.f35940s1;
                        if (z11) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(e2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(e2Var.getMessagesController().M0(Long.valueOf(-j3)));
                        } else {
                            z10 = false;
                            j3 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j3 != 0 && !this.X1) {
                        if (z10) {
                            this.d2.add(Long.valueOf(j3));
                        }
                        this.f42500e2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f42506k2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f42506k2;
            int i11 = i10 + 1;
            this.f42507l2 = i10;
            int i12 = i10 + 2;
            this.f42506k2 = i12;
            this.f42508m2 = i11;
            this.f42509n2 = i12;
            int size = arrayList2.size() + i12;
            this.f42506k2 = size;
            this.f42510o2 = size;
        } else {
            this.f42507l2 = -1;
            this.f42508m2 = -1;
            this.f42509n2 = -1;
            this.f42510o2 = -1;
        }
        int i13 = this.f42506k2;
        this.f42506k2 = i13 + 1;
        this.f42511p2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f42506k2;
            int i15 = i14 + 1;
            this.f42506k2 = i15;
            this.f42512q2 = i14;
            this.f42513r2 = i15;
            int size2 = arrayList.size() + i15;
            this.f42514s2 = size2;
            this.f42506k2 = size2 + 1;
            this.f42515t2 = size2;
        } else {
            this.f42512q2 = -1;
            this.f42513r2 = -1;
            this.f42514s2 = -1;
            this.f42515t2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        er erVar = er.h;
        frameLayout.f41197e = new u5(350L, erVar);
        float f10 = 0.0f;
        frameLayout.f41199n = 0.0f;
        frameLayout.f41202w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = org.telegram.ui.ActionBar.j6.I.q();
        View view = new View(context);
        frameLayout.f41198f = view;
        int i16 = org.telegram.ui.ActionBar.j6.Fi;
        view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.ja.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.j6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f41194a = paint;
        int i17 = org.telegram.ui.ActionBar.j6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i17, false));
        g6 g6Var = new g6(true, true, false);
        frameLayout.f41195b = g6Var;
        g6Var.n(0.3f, 250L, erVar);
        g6Var.setCallback(frameLayout);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, i17, false));
        g6Var.t("", true, true);
        g6Var.f34829b = 1;
        g6 g6Var2 = new g6(false, false, true);
        frameLayout.f41196c = g6Var2;
        g6Var2.n(0.3f, 250L, erVar);
        g6Var2.setCallback(frameLayout);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.j6.x0(null, i16, false));
        g6Var2.t("", true, true);
        g6Var2.f34829b = 1;
        frameLayout.setWillNotDraw(false);
        this.f42503h2 = frameLayout;
        frameLayout.setOnClickListener(new e0(this, 16));
        this.f29682b.addView(this.f42503h2, c8.ja.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f42504i2 = view2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, view2, null);
        this.f29682b.addView(this.f42504i2, c8.ja.d(-1, 1.0f / org.telegram.messenger.g0.f23608p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f42503h2 != null) {
            f10 = 68.0f;
        }
        this.f35936o1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f42502g2 = frameLayout2;
        this.f29682b.addView(frameLayout2, c8.ja.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
        h1(false);
        this.f35937p1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        String M0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V1;
        ArrayList arrayList = this.f42500e2;
        int size = arrayList.size();
        vz vzVar = this.f42503h2;
        if (vzVar != null) {
            if (this.X1) {
                if (size > 0) {
                    i10 = 2131750669;
                } else {
                    i10 = 2131750670;
                }
                vzVar.b(org.telegram.messenger.hd.M0(i10, null), z10);
            } else {
                ArrayList arrayList2 = this.f42499c2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f42503h2.b(org.telegram.messenger.hd.V(null, null, 2131750675, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(this.Y1, this.f42503h2.f41195b.f34827a.getFontMetricsInt(), false, null, 0), this.Z1, this.f42503h2.f41195b.f34827a.getFontMetricsInt(), false)), z10);
                        vz vzVar2 = this.f42503h2;
                        if (this.f42497a2) {
                            i11 = 26;
                        }
                        vzVar2.f41195b.f34843p = i11;
                    } else {
                        vz vzVar3 = this.f42503h2;
                        if (size > 0) {
                            M0 = org.telegram.messenger.hd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131750671, null);
                        }
                        vzVar3.b(M0, z10);
                    }
                } else {
                    this.f42503h2.b(org.telegram.messenger.hd.M0(2131747831, null), z10);
                }
            }
            vz vzVar4 = this.f42503h2;
            g6 g6Var = vzVar4.f41196c;
            if (z10) {
                g6Var.a();
            }
            if (z10 && size != (i7 = vzVar4.f41204y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = vzVar4.f41203x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    vzVar4.f41203x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vzVar4.f41203x = ofFloat;
                ofFloat.addUpdateListener(new tz(vzVar4, 1));
                vzVar4.f41203x.addListener(new x5(vzVar4, 28));
                org.telegram.messenger.i20.k(2.0f, vzVar4.f41203x);
                vzVar4.f41203x.setDuration(200L);
                vzVar4.f41203x.start();
            }
            vzVar4.f41204y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            vzVar4.d = f10;
            g6Var.t("" + size, z10, true);
            vzVar4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f42503h2.setEnabled(!arrayList.isEmpty());
            }
        }
        yz yzVar = this.f42505j2;
        if (yzVar != null) {
            yzVar.a();
        }
    }

    public final void i1() {
        int i7;
        ArrayList arrayList = this.d2;
        ArrayList arrayList2 = this.f42499c2;
        wz wzVar = this.f42516u2;
        if (wzVar == null) {
            return;
        }
        boolean z10 = false;
        if (this.X1) {
            wzVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            wzVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f42500e2.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            wz wzVar2 = this.f42516u2;
            if (z10) {
                i7 = 2131751457;
            } else {
                i7 = 2131745670;
            }
            wzVar2.a(org.telegram.messenger.hd.M0(i7, null), new ai.q(25, this, z10));
            return;
        }
        this.f42516u2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
            if (this.H0 != x02) {
                P(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
