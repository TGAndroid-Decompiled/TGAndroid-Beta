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
public final class vz extends na {
    public static final int f39767x2 = 0;
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
    public ArrayList f39768a2;
    public ArrayList f39769b2;
    public FrameLayout f39770c2;
    public rz d2;
    public View f39771e2;
    public uz f39772f2;
    public int f39773g2;
    public int f39774h2;
    public int f39775i2;
    public int f39776j2;
    public int f39777k2;
    public int f39778l2;
    public int f39779m2;
    public int f39780n2;
    public int f39781o2;
    public int f39782p2;
    public sz f39783q2;
    public int f39784r2;
    public boolean f39785s2;
    public org.telegram.messenger.c20 f39786t2;
    public int f39787u2;
    public long f39788v2;
    public long f39789w2;

    public vz(org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList) {
        super(f2Var, false);
        org.telegram.messenger.vo voVar;
        TLRPC.Chat M0;
        this.Q1 = -1;
        this.U1 = "";
        this.V1 = new ArrayList();
        this.X1 = "";
        this.Z1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f39768a2 = arrayList2;
        this.f39784r2 = -1;
        this.f39787u2 = -5;
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
                if (((org.telegram.messenger.vo) arrayList3.get(i10)).f26056a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList3.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        if (voVar != null) {
            this.U1 = voVar.f26057b;
            this.V1 = voVar.f26058c;
            this.W1 = voVar.f26067n;
            for (int i11 = 0; i11 < this.f39768a2.size(); i11++) {
                TLRPC.Peer z12 = f2Var.getMessagesController().z1(((Long) this.f39768a2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.Y1.add(z12);
                }
            }
            for (int i12 = 0; i12 < voVar.h.size(); i12++) {
                Long l10 = (Long) voVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f39768a2.contains(l10)) {
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
                if (((org.telegram.messenger.vo) arrayList.get(i10)).f26056a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(i7, f2Var, c20Var, 8);
        if (voVar != null && voVar.f()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getContext());
            String M0 = org.telegram.messenger.hd.M0(2131750791, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131750789, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new em(c20Var));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new ax(q8Var, 3));
            f2Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                return;
            }
            return;
        }
        q8Var.run();
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new oz(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.hd.M0(2131750634, null);
        }
        if (this.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.hd.M0(2131750637, null);
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.hd.M0(2131750636, null);
        }
        return org.telegram.messenger.hd.M0(2131750635, null);
    }

    @Override
    public final void U0(rt0 rt0Var) {
        float f10;
        pj0 pj0Var = this.f36328k1;
        pj0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.d2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        pj0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        pj0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z9) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.hd.G(this.f39768a2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z9 && this.f39783q2 != null) {
            str = ", " + ((Object) this.f39783q2.f38205b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f39784r2 >= 0) {
            this.f36330o1.getConnectionsManager().cancelRequest(this.f39784r2, true);
        }
        org.telegram.messenger.c20 c20Var = this.f39786t2;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(this.f39785s2));
            this.f39786t2 = null;
        }
    }

    public final void e1(sz szVar, boolean z9) {
        int i7;
        ArrayList arrayList = this.Y1;
        ArrayList arrayList2 = this.f39768a2;
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
            i7 = 2131745671;
        } else {
            i7 = 2131751458;
        }
        szVar.a(org.telegram.messenger.hd.M0(i7, null), new bi.u7(this, szVar, z9, 20));
        d1(true);
        while (true) {
            pj0 pj0Var = this.f36328k1;
            if (i10 < pj0Var.getChildCount()) {
                View childAt = pj0Var.getChildAt(i10);
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
        ArrayList arrayList = this.f39769b2;
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
                        org.telegram.ui.ActionBar.f2 f2Var = this.f36330o1;
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
                        this.f39768a2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f39773g2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f39773g2;
            int i11 = i10 + 1;
            this.f39774h2 = i10;
            int i12 = i10 + 2;
            this.f39773g2 = i12;
            this.f39775i2 = i11;
            this.f39776j2 = i12;
            int size = arrayList2.size() + i12;
            this.f39773g2 = size;
            this.f39777k2 = size;
        } else {
            this.f39774h2 = -1;
            this.f39775i2 = -1;
            this.f39776j2 = -1;
            this.f39777k2 = -1;
        }
        int i13 = this.f39773g2;
        this.f39773g2 = i13 + 1;
        this.f39778l2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f39773g2;
            int i15 = i14 + 1;
            this.f39773g2 = i15;
            this.f39779m2 = i14;
            this.f39780n2 = i15;
            int size2 = arrayList.size() + i15;
            this.f39781o2 = size2;
            this.f39773g2 = size2 + 1;
            this.f39782p2 = size2;
        } else {
            this.f39779m2 = -1;
            this.f39780n2 = -1;
            this.f39781o2 = -1;
            this.f39782p2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        xq xqVar = xq.h;
        frameLayout.f37892e = new w5(350L, xqVar);
        float f10 = 0.0f;
        frameLayout.f37894n = 0.0f;
        frameLayout.f37897w = 1.0f;
        frameLayout.D = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.k6.I.q();
        View view = new View(context);
        frameLayout.f37893f = view;
        int i16 = org.telegram.ui.ActionBar.k6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.z5.d(0, org.telegram.ui.ActionBar.z5.b(org.telegram.ui.ActionBar.k6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f37889a = paint;
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        i6 i6Var = new i6(true, true, false);
        frameLayout.f37890b = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.setCallback(frameLayout);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        i6Var.t("", true, true);
        i6Var.f34516b = 1;
        i6 i6Var2 = new i6(false, false, true);
        frameLayout.f37891c = i6Var2;
        i6Var2.n(0.3f, 250L, xqVar);
        i6Var2.setCallback(frameLayout);
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        i6Var2.t("", true, true);
        i6Var2.f34516b = 1;
        frameLayout.setWillNotDraw(false);
        this.d2 = frameLayout;
        frameLayout.setOnClickListener(new h0(this, 15));
        this.f28615b.addView(this.d2, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f39771e2 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, view2, null);
        this.f28615b.addView(this.f39771e2, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22536p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.d2 != null) {
            f10 = 68.0f;
        }
        this.f36328k1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f39770c2 = frameLayout2;
        this.f28615b.addView(frameLayout2, c8.ha.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false));
        h1(false);
        this.l1.setTitle(O0());
    }

    public final void h1(boolean z9) {
        String M0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.R1;
        ArrayList arrayList = this.f39768a2;
        int size = arrayList.size();
        rz rzVar = this.d2;
        if (rzVar != null) {
            if (this.T1) {
                if (size > 0) {
                    i10 = 2131750670;
                } else {
                    i10 = 2131750671;
                }
                rzVar.b(org.telegram.messenger.hd.M0(i10, null), z9);
            } else {
                ArrayList arrayList2 = this.Y1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.d2.b(org.telegram.messenger.hd.V(null, null, 2131750676, org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(this.U1, this.d2.f37890b.f34514a.getFontMetricsInt(), false, null, 0), this.V1, this.d2.f37890b.f34514a.getFontMetricsInt(), false)), z9);
                        rz rzVar2 = this.d2;
                        if (this.W1) {
                            i11 = 26;
                        }
                        rzVar2.f37890b.f34529p = i11;
                    } else {
                        rz rzVar3 = this.d2;
                        if (size > 0) {
                            M0 = org.telegram.messenger.hd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131750672, null);
                        }
                        rzVar3.b(M0, z9);
                    }
                } else {
                    this.d2.b(org.telegram.messenger.hd.M0(2131747830, null), z9);
                }
            }
            rz rzVar4 = this.d2;
            i6 i6Var = rzVar4.f37891c;
            if (z9) {
                i6Var.a();
            }
            if (z9 && size != (i7 = rzVar4.f37899y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = rzVar4.f37898x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rzVar4.f37898x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rzVar4.f37898x = ofFloat;
                ofFloat.addUpdateListener(new pz(rzVar4, 1));
                rzVar4.f37898x.addListener(new z5(rzVar4, 28));
                org.telegram.messenger.camera.q.i(2.0f, rzVar4.f37898x);
                rzVar4.f37898x.setDuration(200L);
                rzVar4.f37898x.start();
            }
            rzVar4.f37899y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            rzVar4.d = f10;
            i6Var.t("" + size, z9, true);
            rzVar4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.d2.setEnabled(!arrayList.isEmpty());
            }
        }
        uz uzVar = this.f39772f2;
        if (uzVar != null) {
            uzVar.a();
        }
    }

    public final void i1() {
        int i7;
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.Y1;
        sz szVar = this.f39783q2;
        if (szVar == null) {
            return;
        }
        boolean z9 = false;
        if (this.T1) {
            szVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            szVar.b(org.telegram.messenger.hd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f39768a2.size() >= arrayList2.size() - arrayList.size()) {
                z9 = true;
            }
            sz szVar2 = this.f39783q2;
            if (z9) {
                i7 = 2131751458;
            } else {
                i7 = 2131745671;
            }
            szVar2.a(org.telegram.messenger.hd.M0(i7, null), new bi.k1(24, this, z9));
            return;
        }
        this.f39783q2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
            if (this.G0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
