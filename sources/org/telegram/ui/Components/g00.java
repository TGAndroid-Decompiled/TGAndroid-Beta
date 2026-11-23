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
public final class g00 extends ra {
    public static final int B2 = 0;
    public long A2;
    public String T1;
    public int U1;
    public TL_chatlists.chatlist_ChatlistInvite V1;
    public TL_chatlists.TL_chatlists_chatlistUpdates W1;
    public final boolean X1;
    public String Y1;
    public ArrayList Z1;
    public boolean f35244a2;
    public CharSequence f35245b2;
    public ArrayList f35246c2;
    public ArrayList d2;
    public ArrayList f35247e2;
    public ArrayList f35248f2;
    public FrameLayout f35249g2;
    public c00 f35250h2;
    public View f35251i2;
    public f00 f35252j2;
    public int f35253k2;
    public int f35254l2;
    public int f35255m2;
    public int f35256n2;
    public int f35257o2;
    public int f35258p2;
    public int f35259q2;
    public int f35260r2;
    public int f35261s2;
    public int f35262t2;
    public d00 f35263u2;
    public int f35264v2;
    public boolean f35265w2;
    public org.telegram.messenger.w10 f35266x2;
    public int f35267y2;
    public long f35268z2;

    public g00(org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList) {
        super(g2Var, false);
        org.telegram.messenger.ro roVar;
        TLRPC.Chat O0;
        this.U1 = -1;
        this.Y1 = "";
        this.Z1 = new ArrayList();
        this.f35245b2 = "";
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f35247e2 = arrayList2;
        this.f35264v2 = -1;
        this.f35267y2 = -5;
        this.U1 = i7;
        this.X1 = true;
        this.f35246c2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = g2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.ro) arrayList3.get(i10)).f26773a == i7) {
                    roVar = (org.telegram.messenger.ro) arrayList3.get(i10);
                    break;
                }
            }
        }
        roVar = null;
        if (roVar != null) {
            this.Y1 = roVar.f26774b;
            this.Z1 = roVar.f26775c;
            this.f35244a2 = roVar.f26784n;
            for (int i11 = 0; i11 < this.f35247e2.size(); i11++) {
                TLRPC.Peer B1 = g2Var.getMessagesController().B1(((Long) this.f35247e2.get(i11)).longValue());
                if ((B1 instanceof TLRPC.TL_peerChat) || (B1 instanceof TLRPC.TL_peerChannel)) {
                    this.f35246c2.add(B1);
                }
            }
            for (int i12 = 0; i12 < roVar.h.size(); i12++) {
                Long l10 = (Long) roVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f35247e2.contains(l10)) {
                    TLRPC.Peer B12 = g2Var.getMessagesController().B1(longValue);
                    if (((B12 instanceof TLRPC.TL_peerChat) || (B12 instanceof TLRPC.TL_peerChannel)) && ((O0 = g2Var.getMessagesController().O0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.v3.r0(O0))) {
                        this.f35246c2.add(B12);
                    }
                }
            }
        }
        g1();
    }

    public static void h1(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.messenger.w10 w10Var) {
        org.telegram.messenger.ro roVar;
        ArrayList arrayList = g2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.ro) arrayList.get(i10)).f26773a == i7) {
                    roVar = (org.telegram.messenger.ro) arrayList.get(i10);
                    break;
                }
            }
        }
        roVar = null;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(i7, g2Var, w10Var, 11);
        if (roVar != null && roVar.e()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext());
            String N0 = org.telegram.messenger.gd.N0(2131750778, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131750776, null);
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new tm(w10Var));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new hy(f0Var, 2));
            g2Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                return;
            }
            return;
        }
        f0Var.run();
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new zz(this);
    }

    @Override
    public final CharSequence P0() {
        if (this.X1) {
            return org.telegram.messenger.gd.N0(2131750616, null);
        }
        if (this.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.gd.N0(2131750619, null);
        }
        ArrayList arrayList = this.f35246c2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.gd.N0(2131750618, null);
        }
        return org.telegram.messenger.gd.N0(2131750617, null);
    }

    @Override
    public final void V0(cu0 cu0Var) {
        float f10;
        ek0 ek0Var = this.f39246o1;
        ek0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f35250h2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        ek0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        ek0Var.setOnItemClickListener(new n(this, 8));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f35264v2 >= 0) {
            this.f39250s1.getConnectionsManager().cancelRequest(this.f35264v2, true);
        }
        org.telegram.messenger.w10 w10Var = this.f35266x2;
        if (w10Var != null) {
            w10Var.a(Boolean.valueOf(this.f35265w2));
            this.f35266x2 = null;
        }
    }

    public final void e1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.gd.G(this.f35247e2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z10 && this.f35263u2 != null) {
            str = ", " + ((Object) this.f35263u2.f34180b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    public final void f1(d00 d00Var, boolean z10) {
        int i7;
        ArrayList arrayList = this.f35246c2;
        ArrayList arrayList2 = this.f35247e2;
        arrayList2.clear();
        arrayList2.addAll(this.d2);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(o4))) {
                    arrayList2.add(Long.valueOf(o4));
                }
            }
        }
        i1(true);
        if (z10) {
            i7 = 2131745474;
        } else {
            i7 = 2131751445;
        }
        d00Var.a(org.telegram.messenger.gd.N0(i7, null), new di.p6(this, d00Var, z10, 20));
        e1(true);
        while (true) {
            ek0 ek0Var = this.f39246o1;
            if (i10 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.i4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.i4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void g1() {
        boolean z10;
        long j3;
        boolean r02;
        ArrayList arrayList = this.f35248f2;
        this.f35245b2 = org.telegram.messenger.g0.K2(this.Y1, "✱", "*");
        ArrayList arrayList2 = this.f35246c2;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.g2 g2Var = this.f39250s1;
                        if (z11) {
                            j3 = -peer.chat_id;
                            r02 = org.telegram.messenger.v3.r0(g2Var.getMessagesController().O0(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            r02 = org.telegram.messenger.v3.r0(g2Var.getMessagesController().O0(Long.valueOf(-j3)));
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
                        this.f35247e2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f35253k2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f35253k2;
            int i11 = i10 + 1;
            this.f35254l2 = i10;
            int i12 = i10 + 2;
            this.f35253k2 = i12;
            this.f35255m2 = i11;
            this.f35256n2 = i12;
            int size = arrayList2.size() + i12;
            this.f35253k2 = size;
            this.f35257o2 = size;
        } else {
            this.f35254l2 = -1;
            this.f35255m2 = -1;
            this.f35256n2 = -1;
            this.f35257o2 = -1;
        }
        int i13 = this.f35253k2;
        this.f35253k2 = i13 + 1;
        this.f35258p2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f35253k2;
            int i15 = i14 + 1;
            this.f35253k2 = i15;
            this.f35259q2 = i14;
            this.f35260r2 = i15;
            int size2 = arrayList.size() + i15;
            this.f35261s2 = size2;
            this.f35253k2 = size2 + 1;
            this.f35262t2 = size2;
        } else {
            this.f35259q2 = -1;
            this.f35260r2 = -1;
            this.f35261s2 = -1;
            this.f35262t2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        kr krVar = kr.h;
        frameLayout.f33867e = new c6(350L, krVar);
        float f10 = 0.0f;
        frameLayout.f33869n = 0.0f;
        frameLayout.f33872w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = org.telegram.ui.ActionBar.n6.I.q();
        View view = new View(context);
        frameLayout.f33868f = view;
        int i16 = org.telegram.ui.ActionBar.n6.Fi;
        view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.na.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f33864a = paint;
        int i17 = org.telegram.ui.ActionBar.n6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        m6 m6Var = new m6(true, true, false);
        frameLayout.f33865b = m6Var;
        m6Var.n(0.3f, 250L, krVar);
        m6Var.setCallback(frameLayout);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
        m6Var.t("", true, true);
        m6Var.f37394b = 1;
        m6 m6Var2 = new m6(false, false, true);
        frameLayout.f33866c = m6Var2;
        m6Var2.n(0.3f, 250L, krVar);
        m6Var2.setCallback(frameLayout);
        m6Var2.w(org.telegram.messenger.g0.L(12.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        m6Var2.t("", true, true);
        m6Var2.f37394b = 1;
        frameLayout.setWillNotDraw(false);
        this.f35250h2 = frameLayout;
        frameLayout.setOnClickListener(new n0(this, 17));
        this.f30226b.addView(this.f35250h2, c8.na.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f35251i2 = view2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, view2, null);
        this.f30226b.addView(this.f35251i2, c8.na.d(-1, 1.0f / org.telegram.messenger.g0.f24225p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f35250h2 != null) {
            f10 = 68.0f;
        }
        this.f39246o1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f35249g2 = frameLayout2;
        this.f30226b.addView(frameLayout2, c8.na.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
        i1(false);
        this.f39247p1.setTitle(P0());
    }

    public final void i1(boolean z10) {
        String N0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V1;
        ArrayList arrayList = this.f35247e2;
        int size = arrayList.size();
        c00 c00Var = this.f35250h2;
        if (c00Var != null) {
            if (this.X1) {
                if (size > 0) {
                    i10 = 2131750652;
                } else {
                    i10 = 2131750653;
                }
                c00Var.b(org.telegram.messenger.gd.N0(i10, null), z10);
            } else {
                ArrayList arrayList2 = this.f35246c2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f35250h2.b(org.telegram.messenger.gd.V(null, null, 2131750658, org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(this.Y1, this.f35250h2.f33865b.f37392a.getFontMetricsInt(), false, null, 0), this.Z1, this.f35250h2.f33865b.f37392a.getFontMetricsInt(), false)), z10);
                        c00 c00Var2 = this.f35250h2;
                        if (this.f35244a2) {
                            i11 = 26;
                        }
                        c00Var2.f33865b.f37408p = i11;
                    } else {
                        c00 c00Var3 = this.f35250h2;
                        if (size > 0) {
                            N0 = org.telegram.messenger.gd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            N0 = org.telegram.messenger.gd.N0(2131750654, null);
                        }
                        c00Var3.b(N0, z10);
                    }
                } else {
                    this.f35250h2.b(org.telegram.messenger.gd.N0(2131747637, null), z10);
                }
            }
            c00 c00Var4 = this.f35250h2;
            m6 m6Var = c00Var4.f33866c;
            if (z10) {
                m6Var.a();
            }
            if (z10 && size != (i7 = c00Var4.f33874y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = c00Var4.f33873x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    c00Var4.f33873x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                c00Var4.f33873x = ofFloat;
                ofFloat.addUpdateListener(new a00(c00Var4, 1));
                c00Var4.f33873x.addListener(new x(c00Var4, 28));
                org.telegram.ui.Cells.c0.q(2.0f, c00Var4.f33873x);
                c00Var4.f33873x.setDuration(200L);
                c00Var4.f33873x.start();
            }
            c00Var4.f33874y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c00Var4.d = f10;
            m6Var.t("" + size, z10, true);
            c00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f35250h2.setEnabled(!arrayList.isEmpty());
            }
        }
        f00 f00Var = this.f35252j2;
        if (f00Var != null) {
            f00Var.a();
        }
    }

    public final void j1() {
        int i7;
        ArrayList arrayList = this.d2;
        ArrayList arrayList2 = this.f35246c2;
        d00 d00Var = this.f35263u2;
        if (d00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.X1) {
            d00Var.b(org.telegram.messenger.gd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            d00Var.b(org.telegram.messenger.gd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f35247e2.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            d00 d00Var2 = this.f35263u2;
            if (z10) {
                i7 = 2131751445;
            } else {
                i7 = 2131745474;
            }
            d00Var2.a(org.telegram.messenger.gd.N0(i7, null), new ch.k(25, this, z10));
            return;
        }
        this.f35263u2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
            if (this.H0 != x02) {
                P(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
