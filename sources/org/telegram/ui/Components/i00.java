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
public final class i00 extends sa {
    public static final int B2 = 0;
    public long A2;
    public String T1;
    public int U1;
    public TL_chatlists.chatlist_ChatlistInvite V1;
    public TL_chatlists.TL_chatlists_chatlistUpdates W1;
    public final boolean X1;
    public String Y1;
    public ArrayList Z1;
    public boolean f36067a2;
    public CharSequence f36068b2;
    public ArrayList f36069c2;
    public ArrayList d2;
    public ArrayList f36070e2;
    public ArrayList f36071f2;
    public FrameLayout f36072g2;
    public e00 f36073h2;
    public View f36074i2;
    public h00 f36075j2;
    public int f36076k2;
    public int f36077l2;
    public int f36078m2;
    public int f36079n2;
    public int f36080o2;
    public int f36081p2;
    public int f36082q2;
    public int f36083r2;
    public int f36084s2;
    public int f36085t2;
    public f00 f36086u2;
    public int f36087v2;
    public boolean f36088w2;
    public org.telegram.messenger.y10 f36089x2;
    public int f36090y2;
    public long f36091z2;

    public i00(org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList) {
        super(g2Var, false);
        org.telegram.messenger.so soVar;
        TLRPC.Chat O0;
        this.U1 = -1;
        this.Y1 = "";
        this.Z1 = new ArrayList();
        this.f36068b2 = "";
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f36070e2 = arrayList2;
        this.f36087v2 = -1;
        this.f36090y2 = -5;
        this.U1 = i7;
        this.X1 = true;
        this.f36069c2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = g2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList3.get(i10)).f26886a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList3.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        if (soVar != null) {
            this.Y1 = soVar.f26887b;
            this.Z1 = soVar.f26888c;
            this.f36067a2 = soVar.f26897n;
            for (int i11 = 0; i11 < this.f36070e2.size(); i11++) {
                TLRPC.Peer B1 = g2Var.getMessagesController().B1(((Long) this.f36070e2.get(i11)).longValue());
                if ((B1 instanceof TLRPC.TL_peerChat) || (B1 instanceof TLRPC.TL_peerChannel)) {
                    this.f36069c2.add(B1);
                }
            }
            for (int i12 = 0; i12 < soVar.h.size(); i12++) {
                Long l10 = (Long) soVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f36070e2.contains(l10)) {
                    TLRPC.Peer B12 = g2Var.getMessagesController().B1(longValue);
                    if (((B12 instanceof TLRPC.TL_peerChat) || (B12 instanceof TLRPC.TL_peerChannel)) && ((O0 = g2Var.getMessagesController().O0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.v3.r0(O0))) {
                        this.f36069c2.add(B12);
                    }
                }
            }
        }
        g1();
    }

    public static void h1(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.messenger.y10 y10Var) {
        org.telegram.messenger.so soVar;
        ArrayList arrayList = g2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.so) arrayList.get(i10)).f26886a == i7) {
                    soVar = (org.telegram.messenger.so) arrayList.get(i10);
                    break;
                }
            }
        }
        soVar = null;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(i7, g2Var, y10Var, 11);
        if (soVar != null && soVar.e()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext());
            String N0 = org.telegram.messenger.hd.N0(2131750778, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131750776, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new vm(y10Var));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ky(f0Var, 2));
            g2Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                return;
            }
            return;
        }
        f0Var.run();
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new b00(this);
    }

    @Override
    public final CharSequence P0() {
        if (this.X1) {
            return org.telegram.messenger.hd.N0(2131750616, null);
        }
        if (this.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.hd.N0(2131750619, null);
        }
        ArrayList arrayList = this.f36069c2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.hd.N0(2131750618, null);
        }
        return org.telegram.messenger.hd.N0(2131750617, null);
    }

    @Override
    public final void V0(du0 du0Var) {
        float f10;
        ek0 ek0Var = this.f39531o1;
        ek0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f36073h2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        ek0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        ek0Var.setOnItemClickListener(new o(this, 8));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f36087v2 >= 0) {
            this.f39535s1.getConnectionsManager().cancelRequest(this.f36087v2, true);
        }
        org.telegram.messenger.y10 y10Var = this.f36089x2;
        if (y10Var != null) {
            y10Var.a(Boolean.valueOf(this.f36088w2));
            this.f36089x2 = null;
        }
    }

    public final void e1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.hd.G(this.f36070e2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z10 && this.f36086u2 != null) {
            str = ", " + ((Object) this.f36086u2.f35048b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    public final void f1(f00 f00Var, boolean z10) {
        int i7;
        ArrayList arrayList = this.f36069c2;
        ArrayList arrayList2 = this.f36070e2;
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
        f00Var.a(org.telegram.messenger.hd.N0(i7, null), new di.p6(this, f00Var, z10, 20));
        e1(true);
        while (true) {
            ek0 ek0Var = this.f39531o1;
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
        ArrayList arrayList = this.f36071f2;
        this.f36068b2 = org.telegram.messenger.g0.K2(this.Y1, "✱", "*");
        ArrayList arrayList2 = this.f36069c2;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.g2 g2Var = this.f39535s1;
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
                        this.f36070e2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f36076k2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f36076k2;
            int i11 = i10 + 1;
            this.f36077l2 = i10;
            int i12 = i10 + 2;
            this.f36076k2 = i12;
            this.f36078m2 = i11;
            this.f36079n2 = i12;
            int size = arrayList2.size() + i12;
            this.f36076k2 = size;
            this.f36080o2 = size;
        } else {
            this.f36077l2 = -1;
            this.f36078m2 = -1;
            this.f36079n2 = -1;
            this.f36080o2 = -1;
        }
        int i13 = this.f36076k2;
        this.f36076k2 = i13 + 1;
        this.f36081p2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f36076k2;
            int i15 = i14 + 1;
            this.f36076k2 = i15;
            this.f36082q2 = i14;
            this.f36083r2 = i15;
            int size2 = arrayList.size() + i15;
            this.f36084s2 = size2;
            this.f36076k2 = size2 + 1;
            this.f36085t2 = size2;
        } else {
            this.f36082q2 = -1;
            this.f36083r2 = -1;
            this.f36084s2 = -1;
            this.f36085t2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        nr nrVar = nr.h;
        frameLayout.f34626e = new d6(350L, nrVar);
        float f10 = 0.0f;
        frameLayout.f34628n = 0.0f;
        frameLayout.f34631w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = org.telegram.ui.ActionBar.m6.I.q();
        View view = new View(context);
        frameLayout.f34627f = view;
        int i16 = org.telegram.ui.ActionBar.m6.Fi;
        view.setBackground(org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.m6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.ma.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.m6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f34623a = paint;
        int i17 = org.telegram.ui.ActionBar.m6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        n6 n6Var = new n6(true, true, false);
        frameLayout.f34624b = n6Var;
        n6Var.n(0.3f, 250L, nrVar);
        n6Var.setCallback(frameLayout);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        n6Var.t("", true, true);
        n6Var.f37795b = 1;
        n6 n6Var2 = new n6(false, false, true);
        frameLayout.f34625c = n6Var2;
        n6Var2.n(0.3f, 250L, nrVar);
        n6Var2.setCallback(frameLayout);
        n6Var2.w(org.telegram.messenger.g0.L(12.0f));
        n6Var2.x(org.telegram.messenger.g0.o());
        n6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, i16, false));
        n6Var2.t("", true, true);
        n6Var2.f37795b = 1;
        frameLayout.setWillNotDraw(false);
        this.f36073h2 = frameLayout;
        frameLayout.setOnClickListener(new o0(this, 17));
        this.f30176b.addView(this.f36073h2, c8.ma.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f36074i2 = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, view2, null);
        this.f30176b.addView(this.f36074i2, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.f24045p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f36073h2 != null) {
            f10 = 68.0f;
        }
        this.f39531o1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f36072g2 = frameLayout2;
        this.f30176b.addView(frameLayout2, c8.ma.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        P(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
        i1(false);
        this.f39532p1.setTitle(P0());
    }

    public final void i1(boolean z10) {
        String N0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V1;
        ArrayList arrayList = this.f36070e2;
        int size = arrayList.size();
        e00 e00Var = this.f36073h2;
        if (e00Var != null) {
            if (this.X1) {
                if (size > 0) {
                    i10 = 2131750652;
                } else {
                    i10 = 2131750653;
                }
                e00Var.b(org.telegram.messenger.hd.N0(i10, null), z10);
            } else {
                ArrayList arrayList2 = this.f36069c2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f36073h2.b(org.telegram.messenger.hd.V(null, null, 2131750658, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(this.Y1, this.f36073h2.f34624b.f37793a.getFontMetricsInt(), false, null, 0), this.Z1, this.f36073h2.f34624b.f37793a.getFontMetricsInt(), false)), z10);
                        e00 e00Var2 = this.f36073h2;
                        if (this.f36067a2) {
                            i11 = 26;
                        }
                        e00Var2.f34624b.f37809p = i11;
                    } else {
                        e00 e00Var3 = this.f36073h2;
                        if (size > 0) {
                            N0 = org.telegram.messenger.hd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            N0 = org.telegram.messenger.hd.N0(2131750654, null);
                        }
                        e00Var3.b(N0, z10);
                    }
                } else {
                    this.f36073h2.b(org.telegram.messenger.hd.N0(2131747637, null), z10);
                }
            }
            e00 e00Var4 = this.f36073h2;
            n6 n6Var = e00Var4.f34625c;
            if (z10) {
                n6Var.a();
            }
            if (z10 && size != (i7 = e00Var4.f34633y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = e00Var4.f34632x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e00Var4.f34632x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e00Var4.f34632x = ofFloat;
                ofFloat.addUpdateListener(new c00(e00Var4, 1));
                e00Var4.f34632x.addListener(new y(e00Var4, 28));
                org.telegram.ui.Cells.c0.q(2.0f, e00Var4.f34632x);
                e00Var4.f34632x.setDuration(200L);
                e00Var4.f34632x.start();
            }
            e00Var4.f34633y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            e00Var4.d = f10;
            n6Var.t("" + size, z10, true);
            e00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f36073h2.setEnabled(!arrayList.isEmpty());
            }
        }
        h00 h00Var = this.f36075j2;
        if (h00Var != null) {
            h00Var.a();
        }
    }

    public final void j1() {
        int i7;
        ArrayList arrayList = this.d2;
        ArrayList arrayList2 = this.f36069c2;
        f00 f00Var = this.f36086u2;
        if (f00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.X1) {
            f00Var.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            f00Var.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f36070e2.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            f00 f00Var2 = this.f36086u2;
            if (z10) {
                i7 = 2131751445;
            } else {
                i7 = 2131745474;
            }
            f00Var2.a(org.telegram.messenger.hd.N0(i7, null), new ch.k(25, this, z10));
            return;
        }
        this.f36086u2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false);
            if (this.H0 != x02) {
                P(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
