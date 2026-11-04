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
public final class rz extends ma {
    public static final int f37845y2 = 0;
    public String Q1;
    public int R1;
    public TL_chatlists.chatlist_ChatlistInvite S1;
    public TL_chatlists.TL_chatlists_chatlistUpdates T1;
    public final boolean U1;
    public String V1;
    public ArrayList W1;
    public boolean X1;
    public CharSequence Y1;
    public ArrayList Z1;
    public ArrayList f37846a2;
    public ArrayList f37847b2;
    public ArrayList c2;
    public FrameLayout f37848d2;
    public nz f37849e2;
    public View f37850f2;
    public qz f37851g2;
    public int f37852h2;
    public int f37853i2;
    public int f37854j2;
    public int f37855k2;
    public int f37856l2;
    public int f37857m2;
    public int f37858n2;
    public int f37859o2;
    public int f37860p2;
    public int f37861q2;
    public oz f37862r2;
    public int f37863s2;
    public boolean f37864t2;
    public org.telegram.messenger.u10 f37865u2;
    public int f37866v2;
    public long f37867w2;
    public long f37868x2;

    public rz(org.telegram.ui.ActionBar.d2 d2Var, int i3, ArrayList arrayList) {
        super(d2Var, false);
        org.telegram.messenger.mo moVar;
        TLRPC.Chat M0;
        this.R1 = -1;
        this.V1 = "";
        this.W1 = new ArrayList();
        this.Y1 = "";
        this.f37846a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f37847b2 = arrayList2;
        this.f37863s2 = -1;
        this.f37866v2 = -5;
        this.R1 = i3;
        this.U1 = true;
        this.Z1 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = d2Var.getMessagesController().Q0;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((org.telegram.messenger.mo) arrayList3.get(i10)).f24237a == i3) {
                    moVar = (org.telegram.messenger.mo) arrayList3.get(i10);
                    break;
                }
            }
        }
        moVar = null;
        if (moVar != null) {
            this.V1 = moVar.f24238b;
            this.W1 = moVar.f24239c;
            this.X1 = moVar.f24248n;
            for (int i11 = 0; i11 < this.f37847b2.size(); i11++) {
                TLRPC.Peer z12 = d2Var.getMessagesController().z1(((Long) this.f37847b2.get(i11)).longValue());
                if ((z12 instanceof TLRPC.TL_peerChat) || (z12 instanceof TLRPC.TL_peerChannel)) {
                    this.Z1.add(z12);
                }
            }
            for (int i12 = 0; i12 < moVar.h.size(); i12++) {
                Long l10 = (Long) moVar.h.get(i12);
                long longValue = l10.longValue();
                if (!this.f37847b2.contains(l10)) {
                    TLRPC.Peer z13 = d2Var.getMessagesController().z1(longValue);
                    if (((z13 instanceof TLRPC.TL_peerChat) || (z13 instanceof TLRPC.TL_peerChannel)) && ((M0 = d2Var.getMessagesController().M0(Long.valueOf(-longValue))) == null || !org.telegram.messenger.t3.r0(M0))) {
                        this.Z1.add(z13);
                    }
                }
            }
        }
        f1();
    }

    public static void g1(org.telegram.ui.ActionBar.d2 d2Var, int i3, org.telegram.messenger.u10 u10Var) {
        org.telegram.messenger.mo moVar;
        ArrayList arrayList = d2Var.getMessagesController().Q0;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((org.telegram.messenger.mo) arrayList.get(i10)).f24237a == i3) {
                    moVar = (org.telegram.messenger.mo) arrayList.get(i10);
                    break;
                }
            }
        }
        moVar = null;
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(i3, d2Var, u10Var, 9);
        if (moVar != null && moVar.f()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getContext());
            String M0 = org.telegram.messenger.bd.M0(2131750791, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131750789, null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new dm(u10Var));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new zw(f4Var, 3));
            d2Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                return;
            }
            return;
        }
        f4Var.run();
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new lz(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.U1) {
            return org.telegram.messenger.bd.M0(2131750634, null);
        }
        if (this.S1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return org.telegram.messenger.bd.M0(2131750637, null);
        }
        ArrayList arrayList = this.Z1;
        if (arrayList != null && !arrayList.isEmpty()) {
            return org.telegram.messenger.bd.M0(2131750636, null);
        }
        return org.telegram.messenger.bd.M0(2131750635, null);
    }

    @Override
    public final void U0(qt0 qt0Var) {
        float f10;
        tj0 tj0Var = this.f36102l1;
        tj0Var.setOverScrollMode(2);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f37849e2 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        tj0Var.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        tj0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void d1(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.bd.G(this.f37847b2.size(), "FilterInviteHeaderChats", new Object[0]));
        if (z10 && this.f37862r2 != null) {
            str = ", " + ((Object) this.f37862r2.f36986b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        org.telegram.messenger.g0.i2(sb2.toString());
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f37863s2 >= 0) {
            this.f36105p1.getConnectionsManager().cancelRequest(this.f37863s2, true);
        }
        org.telegram.messenger.u10 u10Var = this.f37865u2;
        if (u10Var != null) {
            u10Var.a(Boolean.valueOf(this.f37864t2));
            this.f37865u2 = null;
        }
    }

    public final void e1(oz ozVar, boolean z10) {
        int i3;
        ArrayList arrayList = this.Z1;
        ArrayList arrayList2 = this.f37847b2;
        arrayList2.clear();
        arrayList2.addAll(this.f37846a2);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(o10))) {
                    arrayList2.add(Long.valueOf(o10));
                }
            }
        }
        h1(true);
        if (z10) {
            i3 = 2131745680;
        } else {
            i3 = 2131751458;
        }
        ozVar.a(org.telegram.messenger.bd.M0(i3, null), new ci.v6(this, ozVar, z10, 20));
        d1(true);
        while (true) {
            tj0 tj0Var = this.f36102l1;
            if (i10 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i10);
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
        long j10;
        boolean r02;
        ArrayList arrayList = this.c2;
        this.Y1 = org.telegram.messenger.g0.K2(this.V1, "✱", "*");
        ArrayList arrayList2 = this.Z1;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i3);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.d2 d2Var = this.f36105p1;
                        if (z11) {
                            j10 = -peer.chat_id;
                            r02 = org.telegram.messenger.t3.r0(d2Var.getMessagesController().M0(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            r02 = org.telegram.messenger.t3.r0(d2Var.getMessagesController().M0(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !r02;
                    }
                    if (j10 != 0 && !this.U1) {
                        if (z10) {
                            this.f37846a2.add(Long.valueOf(j10));
                        }
                        this.f37847b2.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f37852h2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i10 = this.f37852h2;
            int i11 = i10 + 1;
            this.f37853i2 = i10;
            int i12 = i10 + 2;
            this.f37852h2 = i12;
            this.f37854j2 = i11;
            this.f37855k2 = i12;
            int size = arrayList2.size() + i12;
            this.f37852h2 = size;
            this.f37856l2 = size;
        } else {
            this.f37853i2 = -1;
            this.f37854j2 = -1;
            this.f37855k2 = -1;
            this.f37856l2 = -1;
        }
        int i13 = this.f37852h2;
        this.f37852h2 = i13 + 1;
        this.f37857m2 = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i14 = this.f37852h2;
            int i15 = i14 + 1;
            this.f37852h2 = i15;
            this.f37858n2 = i14;
            this.f37859o2 = i15;
            int size2 = arrayList.size() + i15;
            this.f37860p2 = size2;
            this.f37852h2 = size2 + 1;
            this.f37861q2 = size2;
        } else {
            this.f37858n2 = -1;
            this.f37859o2 = -1;
            this.f37860p2 = -1;
            this.f37861q2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        xq xqVar = xq.h;
        frameLayout.f36655e = new u5(350L, xqVar);
        float f10 = 0.0f;
        frameLayout.f36657n = 0.0f;
        frameLayout.f36660w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = org.telegram.ui.ActionBar.k6.I.q();
        View view = new View(context);
        frameLayout.f36656f = view;
        int i16 = org.telegram.ui.ActionBar.k6.Ci;
        view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.k6.x0(null, i16, false)), 8.0f));
        frameLayout.addView(view, b8.mf.c(-1.0f, -1));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        frameLayout.h = d02;
        frameLayout.setBackground(d02);
        Paint paint = new Paint(1);
        frameLayout.f36652a = paint;
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        g6 g6Var = new g6(true, true, false);
        frameLayout.f36653b = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.setCallback(frameLayout);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        g6Var.t("", true, true);
        g6Var.f33983b = 1;
        g6 g6Var2 = new g6(false, false, true);
        frameLayout.f36654c = g6Var2;
        g6Var2.n(0.3f, 250L, xqVar);
        g6Var2.setCallback(frameLayout);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        g6Var2.t("", true, true);
        g6Var2.f33983b = 1;
        frameLayout.setWillNotDraw(false);
        this.f37849e2 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.f28586b.addView(this.f37849e2, b8.mf.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f37850f2 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, view2, null);
        this.f28586b.addView(this.f37850f2, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.f22607p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (this.f37849e2 != null) {
            f10 = 68.0f;
        }
        this.f36102l1.setPadding(L, 0, L2, org.telegram.messenger.g0.L(f10));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f37848d2 = frameLayout2;
        this.f28586b.addView(frameLayout2, b8.mf.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        O(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
        h1(false);
        this.m1.setTitle(O0());
    }

    public final void h1(boolean z10) {
        String M0;
        float f10;
        int i3;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.S1;
        ArrayList arrayList = this.f37847b2;
        int size = arrayList.size();
        nz nzVar = this.f37849e2;
        if (nzVar != null) {
            if (this.U1) {
                if (size > 0) {
                    i10 = 2131750670;
                } else {
                    i10 = 2131750671;
                }
                nzVar.b(org.telegram.messenger.bd.M0(i10, null), z10);
            } else {
                ArrayList arrayList2 = this.Z1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f37849e2.b(org.telegram.messenger.bd.V(null, null, 2131750676, org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(this.V1, this.f37849e2.f36653b.f33981a.getFontMetricsInt(), false, null, 0), this.W1, this.f37849e2.f36653b.f33981a.getFontMetricsInt(), false)), z10);
                        nz nzVar2 = this.f37849e2;
                        if (this.X1) {
                            i11 = 26;
                        }
                        nzVar2.f36653b.f33996p = i11;
                    } else {
                        nz nzVar3 = this.f37849e2;
                        if (size > 0) {
                            M0 = org.telegram.messenger.bd.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131750672, null);
                        }
                        nzVar3.b(M0, z10);
                    }
                } else {
                    this.f37849e2.b(org.telegram.messenger.bd.M0(2131747839, null), z10);
                }
            }
            nz nzVar4 = this.f37849e2;
            g6 g6Var = nzVar4.f36654c;
            if (z10) {
                g6Var.a();
            }
            if (z10 && size != (i3 = nzVar4.f36662y) && size > 0 && i3 > 0) {
                ValueAnimator valueAnimator = nzVar4.f36661x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nzVar4.f36661x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nzVar4.f36661x = ofFloat;
                ofFloat.addUpdateListener(new mz(nzVar4, 1));
                nzVar4.f36661x.addListener(new x5(nzVar4, 28));
                org.telegram.messenger.camera.q.i(2.0f, nzVar4.f36661x);
                nzVar4.f36661x.setDuration(200L);
                nzVar4.f36661x.start();
            }
            nzVar4.f36662y = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            nzVar4.d = f10;
            g6Var.t("" + size, z10, true);
            nzVar4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f37849e2.setEnabled(!arrayList.isEmpty());
            }
        }
        qz qzVar = this.f37851g2;
        if (qzVar != null) {
            qzVar.a();
        }
    }

    public final void i1() {
        int i3;
        ArrayList arrayList = this.f37846a2;
        ArrayList arrayList2 = this.Z1;
        oz ozVar = this.f37862r2;
        if (ozVar == null) {
            return;
        }
        boolean z10 = false;
        if (this.U1) {
            ozVar.b(org.telegram.messenger.bd.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            ozVar.b(org.telegram.messenger.bd.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f37847b2.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            oz ozVar2 = this.f37862r2;
            if (z10) {
                i3 = 2131751458;
            } else {
                i3 = 2131745680;
            }
            ozVar2.a(org.telegram.messenger.bd.M0(i3, null), new ci.e1(24, this, z10));
            return;
        }
        this.f37862r2.a("", null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
            if (this.H0 != x02) {
                O(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
