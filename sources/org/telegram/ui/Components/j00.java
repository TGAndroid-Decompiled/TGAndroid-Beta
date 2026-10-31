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
public final class j00 extends ha {
    public static final int f27163x2 = 0;
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
    public ArrayList a2;
    public ArrayList f27164b2;
    public FrameLayout f27165c2;
    public f00 f27166d2;
    public View f27167e2;
    public i00 f27168f2;
    public int f27169g2;
    public int f27170h2;
    public int f27171i2;
    public int f27172j2;
    public int f27173k2;
    public int f27174l2;
    public int f27175m2;
    public int f27176n2;
    public int f27177o2;
    public int f27178p2;
    public g00 f27179q2;
    public int f27180r2;
    public boolean f27181s2;
    public org.telegram.messenger.q20 f27182t2;
    public int f27183u2;
    public long f27184v2;
    public long f27185w2;

    public j00(org.telegram.ui.ActionBar.k2 k2Var, int i10, ArrayList arrayList) {
        super(k2Var, false);
        org.telegram.messenger.ap apVar;
        TLRPC.Chat L0;
        this.Q1 = -1;
        this.U1 = "";
        this.V1 = new ArrayList();
        this.X1 = "";
        this.Z1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.a2 = arrayList2;
        this.f27180r2 = -1;
        this.f27183u2 = -5;
        this.Q1 = i10;
        this.T1 = true;
        this.Y1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = k2Var.getMessagesController().P0;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (((org.telegram.messenger.ap) arrayList3.get(i11)).f14645a == i10) {
                    apVar = (org.telegram.messenger.ap) arrayList3.get(i11);
                    break;
                }
            }
        }
        apVar = null;
        if (apVar != null) {
            this.U1 = apVar.f14646b;
            this.V1 = apVar.f14647c;
            this.W1 = apVar.f14655n;
            for (int i12 = 0; i12 < this.a2.size(); i12++) {
                TLRPC.Peer y12 = k2Var.getMessagesController().y1(((Long) this.a2.get(i12)).longValue());
                if ((y12 instanceof TLRPC.TL_peerChat) || (y12 instanceof TLRPC.TL_peerChannel)) {
                    this.Y1.add(y12);
                }
            }
            for (int i13 = 0; i13 < apVar.h.size(); i13++) {
                Long l4 = (Long) apVar.h.get(i13);
                long longValue = l4.longValue();
                if (!this.a2.contains(l4)) {
                    TLRPC.Peer y13 = k2Var.getMessagesController().y1(longValue);
                    if (((y13 instanceof TLRPC.TL_peerChat) || (y13 instanceof TLRPC.TL_peerChannel)) && ((L0 = k2Var.getMessagesController().L0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.w3.r0(L0))) {
                        this.Y1.add(y13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.k2 k2Var, int i10, org.telegram.messenger.q20 q20Var) {
        org.telegram.messenger.ap apVar;
        ArrayList arrayList = k2Var.getMessagesController().P0;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((org.telegram.messenger.ap) arrayList.get(i11)).f14645a == i10) {
                    apVar = (org.telegram.messenger.ap) arrayList.get(i11);
                    break;
                }
            }
        }
        apVar = null;
        ag.o0 o0Var = new ag.o0(i10, k2Var, q20Var, 25);
        if (apVar != null && apVar.f()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getContext());
            String L0 = org.telegram.messenger.cd.L0(2131750791, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131750789, null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new mm(q20Var));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new px(o0Var, 3));
            k2Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                return;
            }
            return;
        }
        o0Var.run();
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        return new c00(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.cd.L0(2131750634, null);
        }
        if (this.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.cd.L0(2131750637, null);
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.cd.L0(2131750636, null);
        }
        return org.telegram.messenger.cd.L0(2131750635, null);
    }

    @Override
    public final void U0(uu0 uu0Var) {
        float f7;
        tk0 tk0Var = this.f26666k1;
        tk0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.i0.L(6.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        if (this.f27166d2 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        tk0Var.setPadding(L, 0, L2, org.telegram.messenger.i0.L(f7));
        tk0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.cd.G(this.a2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z10 && this.f27179q2 != null) {
            str = ", " + ((Object) this.f27179q2.f26205b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.i0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f27180r2 >= 0) {
            this.f26669o1.getConnectionsManager().cancelRequest(this.f27180r2, true);
        }
        org.telegram.messenger.q20 q20Var = this.f27182t2;
        if (q20Var != null) {
            q20Var.a(Boolean.valueOf(this.f27181s2));
            this.f27182t2 = null;
        }
    }

    public final void e1(g00 g00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.Y1;
        ArrayList arrayList2 = this.a2;
        arrayList2.clear();
        arrayList2.addAll(this.Z1);
        int i11 = 0;
        if (!z10) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) arrayList.get(i12));
                if (!arrayList2.contains(Long.valueOf(o10))) {
                    arrayList2.add(Long.valueOf(o10));
                }
            }
        }
        h1(true);
        if (z10) {
            i10 = 2131745687;
        } else {
            i10 = 2131751458;
        }
        g00Var.a(org.telegram.messenger.cd.L0(i10, null), new ag.j0(this, g00Var, z10, 17));
        d1(true);
        while (true) {
            tk0 tk0Var = this.f26666k1;
            if (i11 < tk0Var.getChildCount()) {
                View childAt = tk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.j4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.j4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void f1() {
        boolean z10;
        long j10;
        boolean r02;
        ArrayList arrayList = this.f27164b2;
        this.X1 = org.telegram.messenger.i0.J2(this.U1, "✱", "*");
        ArrayList arrayList2 = this.Y1;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.k2 k2Var = this.f26669o1;
                        if (z11) {
                            j10 = -peer.chat_id;
                            r02 = org.telegram.messenger.w3.r0(k2Var.getMessagesController().L0(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            r02 = org.telegram.messenger.w3.r0(k2Var.getMessagesController().L0(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j10 != 0 && !this.T1) {
                        if (z10) {
                            this.Z1.add(Long.valueOf(j10));
                        }
                        this.a2.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f27169g2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f27169g2;
            int i12 = i11 + 1;
            this.f27170h2 = i11;
            int i13 = i11 + 2;
            this.f27169g2 = i13;
            this.f27171i2 = i12;
            this.f27172j2 = i13;
            int size = arrayList2.size() + i13;
            this.f27169g2 = size;
            this.f27173k2 = size;
        } else {
            this.f27170h2 = -1;
            this.f27171i2 = -1;
            this.f27172j2 = -1;
            this.f27173k2 = -1;
        }
        int i14 = this.f27169g2;
        this.f27169g2 = i14 + 1;
        this.f27174l2 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f27169g2;
            int i16 = i15 + 1;
            this.f27169g2 = i16;
            this.f27175m2 = i15;
            this.f27176n2 = i16;
            int size2 = arrayList.size() + i16;
            this.f27177o2 = size2;
            this.f27169g2 = size2 + 1;
            this.f27178p2 = size2;
        } else {
            this.f27175m2 = -1;
            this.f27176n2 = -1;
            this.f27177o2 = -1;
            this.f27178p2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        gr grVar = gr.h;
        frameLayout.e = new t5(350L, grVar);
        float f7 = 0.0f;
        frameLayout.f25909n = 0.0f;
        frameLayout.f25912w = 1.0f;
        frameLayout.D = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.t6.I.q();
        View view = new View(context);
        frameLayout.f25908f = view;
        int i17 = org.telegram.ui.ActionBar.t6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.j6.b(org.telegram.ui.ActionBar.t6.x0(null, i17, false)), 8.0f));
        frameLayout.addView(view, w7.b6.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f25905a = paint;
        int i18 = org.telegram.ui.ActionBar.t6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
        e6 e6Var = new e6(true, true, false);
        frameLayout.f25906b = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.setCallback(frameLayout);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
        e6Var.t("", true, true);
        e6Var.f25695b = 1;
        e6 e6Var2 = new e6(false, false, true);
        frameLayout.f25907c = e6Var2;
        e6Var2.n(0.3f, 250L, grVar);
        e6Var2.setCallback(frameLayout);
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, i17, false));
        e6Var2.t("", true, true);
        e6Var2.f25695b = 1;
        frameLayout.setWillNotDraw(false);
        this.f27166d2 = frameLayout;
        frameLayout.setOnClickListener(new h0(this, 14));
        this.f21586b.addView(this.f27166d2, w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f27167e2 = view2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, view2, null);
        this.f21586b.addView(this.f27167e2, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.f16025p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.i0.L(6.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        if (this.f27166d2 != null) {
            f7 = 68.0f;
        }
        this.f26666k1.setPadding(L, 0, L2, org.telegram.messenger.i0.L(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f27165c2 = frameLayout2;
        this.f21586b.addView(frameLayout2, w7.b6.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false));
        h1(false);
        this.l1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        String L0;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.R1;
        ArrayList arrayList = this.a2;
        int size = arrayList.size();
        f00 f00Var = this.f27166d2;
        if (f00Var != null) {
            if (this.T1) {
                if (size > 0) {
                    i11 = 2131750670;
                } else {
                    i11 = 2131750671;
                }
                f00Var.b(org.telegram.messenger.cd.L0(i11, null), z10);
            } else {
                ArrayList arrayList2 = this.Y1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f27166d2.b(org.telegram.messenger.cd.V(null, null, 2131750676, org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(this.U1, this.f27166d2.f25906b.f25693a.getFontMetricsInt(), false, null, 0), this.V1, this.f27166d2.f25906b.f25693a.getFontMetricsInt(), false)), z10);
                        f00 f00Var2 = this.f27166d2;
                        if (this.W1) {
                            i12 = 26;
                        }
                        f00Var2.f25906b.f25707p = i12;
                    } else {
                        f00 f00Var3 = this.f27166d2;
                        if (size > 0) {
                            L0 = org.telegram.messenger.cd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            L0 = org.telegram.messenger.cd.L0(2131750672, null);
                        }
                        f00Var3.b(L0, z10);
                    }
                } else {
                    this.f27166d2.b(org.telegram.messenger.cd.L0(2131747847, null), z10);
                }
            }
            f00 f00Var4 = this.f27166d2;
            e6 e6Var = f00Var4.f25907c;
            if (z10) {
                e6Var.a();
            }
            if (z10 && size != (i10 = f00Var4.f25914y) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = f00Var4.f25913x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    f00Var4.f25913x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f00Var4.f25913x = ofFloat;
                ofFloat.addUpdateListener(new d00(f00Var4, 1));
                f00Var4.f25913x.addListener(new w5(f00Var4, 28));
                org.telegram.messenger.z20.j(2.0f, f00Var4.f25913x);
                f00Var4.f25913x.setDuration(200L);
                f00Var4.f25913x.start();
            }
            f00Var4.f25914y = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f00Var4.d = f7;
            e6Var.t("" + size, z10, true);
            f00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f27166d2.setEnabled(!arrayList.isEmpty());
            }
        }
        i00 i00Var = this.f27168f2;
        if (i00Var != null) {
            i00Var.a();
        }
    }

    public final void i1() {
        int i10;
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.Y1;
        g00 g00Var = this.f27179q2;
        if (g00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.T1) {
            g00Var.b(org.telegram.messenger.cd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            g00Var.b(org.telegram.messenger.cd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.a2.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            g00 g00Var2 = this.f27179q2;
            if (z10) {
                i10 = 2131751458;
            } else {
                i10 = 2131745687;
            }
            g00Var2.a(org.telegram.messenger.cd.L0(i10, null), new k2.v(14, this, z10));
            return;
        }
        this.f27179q2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
            if (this.G0 != x02) {
                P(x02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
