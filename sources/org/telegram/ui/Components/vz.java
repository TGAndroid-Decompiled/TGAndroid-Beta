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
public final class vz extends ma {
    public static final int A2 = 0;
    public String S1;
    public int T1;
    public TL_chatlists.chatlist_ChatlistInvite U1;
    public TL_chatlists.TL_chatlists_chatlistUpdates V1;
    public final boolean W1;
    public String X1;
    public ArrayList Y1;
    public boolean Z1;
    public CharSequence f39821a2;
    public ArrayList f39822b2;
    public ArrayList f39823c2;
    public ArrayList d2;
    public ArrayList f39824e2;
    public FrameLayout f39825f2;
    public rz f39826g2;
    public View f39827h2;
    public uz f39828i2;
    public int f39829j2;
    public int f39830k2;
    public int f39831l2;
    public int f39832m2;
    public int f39833n2;
    public int f39834o2;
    public int f39835p2;
    public int f39836q2;
    public int f39837r2;
    public int f39838s2;
    public sz f39839t2;
    public int f39840u2;
    public boolean f39841v2;
    public org.telegram.messenger.c20 f39842w2;
    public int f39843x2;
    public long f39844y2;
    public long f39845z2;

    public vz(org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList) {
        super(f2Var, false);
        org.telegram.messenger.vo voVar;
        TLRPC.Chat M0;
        this.T1 = -1;
        this.X1 = "";
        this.Y1 = new ArrayList();
        this.f39821a2 = "";
        this.f39823c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.f39840u2 = -1;
        this.f39843x2 = -5;
        this.T1 = i7;
        this.W1 = true;
        this.f39822b2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = f2Var.getMessagesController().P0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.vo) arrayList3.get(i10)).f26074a == i7) {
                    voVar = (org.telegram.messenger.vo) arrayList3.get(i10);
                    break;
                }
            }
        }
        voVar = null;
        if (voVar != null) {
            this.X1 = voVar.f26075b;
            this.Y1 = voVar.f26076c;
            this.Z1 = voVar.f26085n;
            for (int i11 = 0; i11 < this.d2.size(); i11++) {
                TLRPC.Peer z12 = f2Var.getMessagesController().z1(((Long) this.d2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.f39822b2.add(z12);
                }
            }
            for (int i12 = 0; i12 < voVar.h.size(); i12++) {
                Long l10 = (Long) voVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.d2.contains(l10)) {
                    TLRPC.Peer z13 = f2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = f2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.f39822b2.add(z13);
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
                if (((org.telegram.messenger.vo) arrayList.get(i10)).f26074a == i7) {
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
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131750788, null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new dm(c20Var));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ax(q8Var, 3));
            f2Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
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
        if (this.W1) {
            return org.telegram.messenger.id.M0(2131750633, null);
        }
        if (this.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.id.M0(2131750636, null);
        }
        ArrayList arrayList = this.f39822b2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.id.M0(2131750635, null);
        }
        return org.telegram.messenger.id.M0(2131750634, null);
    }

    @Override
    public final void U0(st0 st0Var) {
        float f10;
        pj0 pj0Var = this.n1;
        pj0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f39826g2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        pj0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        pj0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void d1(boolean z9) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.id.G(this.d2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z9 && this.f39839t2 != null) {
            str = ", " + ((Object) this.f39839t2.f38109b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f39840u2 >= 0) {
            this.f35905r1.getConnectionsManager().cancelRequest(this.f39840u2, true);
        }
        org.telegram.messenger.c20 c20Var = this.f39842w2;
        if (c20Var != null) {
            c20Var.a(Boolean.valueOf(this.f39841v2));
            this.f39842w2 = null;
        }
    }

    public final void e1(sz szVar, boolean z9) {
        int i7;
        ArrayList arrayList = this.f39822b2;
        ArrayList arrayList2 = this.d2;
        arrayList2.clear();
        arrayList2.addAll(this.f39823c2);
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
        szVar.a(org.telegram.messenger.id.M0(i7, null), new bi.u7(this, szVar, z9, 20));
        d1(true);
        while (true) {
            pj0 pj0Var = this.n1;
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
        ArrayList arrayList = this.f39824e2;
        this.f39821a2 = org.telegram.messenger.g0.K2(this.X1, "✱", "*");
        ArrayList arrayList2 = this.f39822b2;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i7);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z9 = false;
                    } else {
                        boolean z10 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.f2 f2Var = this.f35905r1;
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
                    if (j3 != 0 && !this.W1) {
                        if (z9) {
                            this.f39823c2.add(Long.valueOf(j3));
                        }
                        this.d2.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f39829j2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f39829j2;
            int i11 = i10 + 1;
            this.f39830k2 = i10;
            int i12 = i10 + 2;
            this.f39829j2 = i12;
            this.f39831l2 = i11;
            this.f39832m2 = i12;
            int size = arrayList2.size() + i12;
            this.f39829j2 = size;
            this.f39833n2 = size;
        } else {
            this.f39830k2 = -1;
            this.f39831l2 = -1;
            this.f39832m2 = -1;
            this.f39833n2 = -1;
        }
        int i13 = this.f39829j2;
        this.f39829j2 = i13 + 1;
        this.f39834o2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f39829j2;
            int i15 = i14 + 1;
            this.f39829j2 = i15;
            this.f39835p2 = i14;
            this.f39836q2 = i15;
            int size2 = arrayList.size() + i15;
            this.f39837r2 = size2;
            this.f39829j2 = size2 + 1;
            this.f39838s2 = size2;
        } else {
            this.f39835p2 = -1;
            this.f39836q2 = -1;
            this.f39837r2 = -1;
            this.f39838s2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        wq wqVar = wq.h;
        frameLayout.f37774e = new v5(350L, wqVar);
        float f10 = 0.0f;
        frameLayout.f37776n = 0.0f;
        frameLayout.f37779w = 1.0f;
        frameLayout.D = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.m6.I.q();
        View view = new View(context);
        frameLayout.f37775f = view;
        int i16 = org.telegram.ui.ActionBar.m6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.m6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.m6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f37771a = paint;
        int i17 = org.telegram.ui.ActionBar.m6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        h6 h6Var = new h6(true, true, false);
        frameLayout.f37772b = h6Var;
        h6Var.n(0.3f, 250L, wqVar);
        h6Var.setCallback(frameLayout);
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
        h6Var.t("", true, true);
        h6Var.f34187b = 1;
        h6 h6Var2 = new h6(false, false, true);
        frameLayout.f37773c = h6Var2;
        h6Var2.n(0.3f, 250L, wqVar);
        h6Var2.setCallback(frameLayout);
        h6Var2.w(org.telegram.messenger.g0.L(12.0f));
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, i16, false));
        h6Var2.t("", true, true);
        h6Var2.f34187b = 1;
        frameLayout.setWillNotDraw(false);
        this.f39826g2 = frameLayout;
        frameLayout.setOnClickListener(new g0(this, 15));
        this.f28672b.addView(this.f39826g2, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f39827h2 = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, view2, null);
        this.f28672b.addView(this.f39827h2, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22566p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f39826g2 != null) {
            f10 = 68.0f;
        }
        this.n1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f39825f2 = frameLayout2;
        this.f28672b.addView(frameLayout2, c8.ha.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
        h1(false);
        this.f35902o1.setTitle(O0());
    }

    public final void h1(boolean z9) {
        String M0;
        float f10;
        int i7;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.U1;
        ArrayList arrayList = this.d2;
        int size = arrayList.size();
        rz rzVar = this.f39826g2;
        if (rzVar != null) {
            if (this.W1) {
                if (size > 0) {
                    i10 = 2131750669;
                } else {
                    i10 = 2131750670;
                }
                rzVar.b(org.telegram.messenger.id.M0(i10, null), z9);
            } else {
                ArrayList arrayList2 = this.f39822b2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f39826g2.b(org.telegram.messenger.id.V(null, null, 2131750675, org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(this.X1, this.f39826g2.f37772b.f34185a.getFontMetricsInt(), false, null, 0), this.Y1, this.f39826g2.f37772b.f34185a.getFontMetricsInt(), false)), z9);
                        rz rzVar2 = this.f39826g2;
                        if (this.Z1) {
                            i11 = 26;
                        }
                        rzVar2.f37772b.f34200p = i11;
                    } else {
                        rz rzVar3 = this.f39826g2;
                        if (size > 0) {
                            M0 = org.telegram.messenger.id.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131750671, null);
                        }
                        rzVar3.b(M0, z9);
                    }
                } else {
                    this.f39826g2.b(org.telegram.messenger.id.M0(2131747831, null), z9);
                }
            }
            rz rzVar4 = this.f39826g2;
            h6 h6Var = rzVar4.f37773c;
            if (z9) {
                h6Var.a();
            }
            if (z9 && size != (i7 = rzVar4.f37781y) && size > 0 && i7 > 0) {
                ValueAnimator valueAnimator = rzVar4.f37780x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rzVar4.f37780x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rzVar4.f37780x = ofFloat;
                ofFloat.addUpdateListener(new pz(rzVar4, 1));
                rzVar4.f37780x.addListener(new y5(rzVar4, 28));
                org.telegram.messenger.camera.q.i(2.0f, rzVar4.f37780x);
                rzVar4.f37780x.setDuration(200L);
                rzVar4.f37780x.start();
            }
            rzVar4.f37781y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            rzVar4.d = f10;
            h6Var.t("" + size, z9, true);
            rzVar4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f39826g2.setEnabled(!arrayList.isEmpty());
            }
        }
        uz uzVar = this.f39828i2;
        if (uzVar != null) {
            uzVar.a();
        }
    }

    public final void i1() {
        int i7;
        ArrayList arrayList = this.f39823c2;
        ArrayList arrayList2 = this.f39822b2;
        sz szVar = this.f39839t2;
        if (szVar == null) {
            return;
        }
        boolean z9 = false;
        if (this.W1) {
            szVar.b(org.telegram.messenger.id.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            szVar.b(org.telegram.messenger.id.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.d2.size() >= arrayList2.size() - arrayList.size()) {
                z9 = true;
            }
            sz szVar2 = this.f39839t2;
            if (z9) {
                i7 = 2131751457;
            } else {
                i7 = 2131745670;
            }
            szVar2.a(org.telegram.messenger.id.M0(i7, null), new bi.k1(24, this, z9));
            return;
        }
        this.f39839t2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
            if (this.G0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
