package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o60 extends org.telegram.ui.ActionBar.t2 {
    public static ArrayList A1;
    public static long B1;
    public static long C1;
    public static int D1;
    public Drawable f36745j1;
    public boolean k1;
    public int f36746l1;
    public org.telegram.ui.Cells.v0 m1;
    public k60 f36747n1;
    public TextView f36748o1;
    public TextView f36749p1;
    public ArrayList f36750q1;
    public boolean f36751r1;
    public int f36752s1;
    public int f36753t1;
    public TLRPC.Peer f36754u1;
    public TLRPC.Peer f36755v1;
    public TLRPC.InputPeer f36756w1;
    public boolean f36757x1;
    public boolean f36758y1;
    public m60 f36759z1;

    public static void I0(o60 o60Var) {
        k60 k60Var = o60Var.f36747n1;
        if (o60Var.f36753t1 != 0) {
            if (k60Var.getChildCount() <= 0) {
                int paddingTop = k60Var.getPaddingTop();
                o60Var.f36752s1 = paddingTop;
                k60Var.setTopGlowOffset(paddingTop);
                o60Var.f28586b.invalidate();
                return;
            }
            int i3 = 0;
            View childAt = k60Var.getChildAt(0);
            bj0 bj0Var = (bj0) k60Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
                i3 = top;
            }
            if (o60Var.f36752s1 != i3) {
                o60Var.f36748o1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                o60Var.f36749p1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                o60Var.f36752s1 = i3;
                k60Var.setTopGlowOffset(i3);
                o60Var.f28586b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.ir irVar) {
        int i3 = D1;
        int i10 = cVar.f21919a;
        if (i3 == i10 && C1 == j10 && A1 != null && SystemClock.elapsedRealtime() - B1 < 240000) {
            boolean z10 = true;
            if (A1.size() != 1) {
                z10 = false;
            }
            irVar.o(z10);
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.hp.s1(i10).j1(j10);
        s1Var.setOnCancelListener(new h60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new ci.a0(s1Var, j10, cVar, irVar)), 1));
        try {
            s1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j10, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer, m60 m60Var) {
        if (context != null) {
            int i10 = D1;
            int i11 = cVar.f21919a;
            if (i10 == i11 && C1 == j10 && A1 != null && SystemClock.elapsedRealtime() - B1 < 300000) {
                if (A1.size() == 1 && i3 != 0) {
                    m60Var.a(org.telegram.messenger.hp.s1(i11).j1(org.telegram.messenger.zi.C1((TLRPC.Peer) A1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j10, A1, d2Var, i3, peer, m60Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.hp.s1(i11).j1(j10);
            s1Var.setOnCancelListener(new h60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new g60(s1Var, cVar, m60Var, j10, context, d2Var, i3, peer)), 0));
            try {
                s1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer, m60 m60Var) {
        int i10;
        j60 j60Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i3 == 0) {
            if (!arrayList.isEmpty()) {
                oq oqVar = new oq(d2Var, arrayList, j10, m60Var);
                if (d2Var.getParentActivity() != null) {
                    d2Var.showDialog(oqVar);
                    return;
                } else {
                    oqVar.show();
                    return;
                }
            }
            return;
        }
        ?? t2Var = new org.telegram.ui.ActionBar.t2(context, false);
        t2Var.f28621w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        t2Var.f36750q1 = arrayList2;
        t2Var.f36759z1 = m60Var;
        t2Var.f36753t1 = i3;
        Drawable g7 = k2.p1.g(context, 2131232726);
        t2Var.f36745j1 = g7;
        if (i3 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) t2Var.f36750q1.get(i14);
                    if (org.telegram.messenger.zi.C1(peer2) == selfId) {
                        t2Var.f36755v1 = peer2;
                        t2Var.f36754u1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.zi.C1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) t2Var.f36750q1.get(i15);
                    if (org.telegram.messenger.zi.C1(peer3) == C12) {
                        t2Var.f36755v1 = peer3;
                        t2Var.f36754u1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                t2Var.f36754u1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = t2Var.f36745j1;
            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
            g7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            t2Var.k1 = true;
            t2Var.f36746l1 = x02;
            t2Var.f36754u1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        t2Var.O(i10);
        if (t2Var.f36753t1 == 0) {
            ?? i60Var = new i60(t2Var, context);
            i60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(i60Var);
            t2Var.O = nestedScrollView;
            j60Var = i60Var;
        } else {
            j60 j60Var2 = new j60(t2Var, context);
            t2Var.f28586b = j60Var2;
            j60Var2.setWillNotDraw(false);
            ViewGroup viewGroup = t2Var.f28586b;
            int i16 = t2Var.f28618u0;
            viewGroup.setPadding(i16, 0, i16, 0);
            j60Var = j60Var2;
        }
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(t2Var.f28583a).M0(Long.valueOf(-j10));
        k60 k60Var = new k60(t2Var, context);
        t2Var.f36747n1 = k60Var;
        t2Var.getContext();
        if (t2Var.f36753t1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        k60Var.setLayoutManager(new u4.b0(i11, false));
        k60Var.setAdapter(new n60(t2Var, context));
        k60Var.setVerticalScrollBarEnabled(false);
        k60Var.setClipToPadding(false);
        k60Var.setEnabled(true);
        k60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(k60Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        k60Var.setOnScrollListener(new l60(t2Var));
        k60Var.setOnItemClickListener(new ei.q4(11, t2Var, M0));
        if (i3 != 0) {
            j60Var.addView(k60Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            k60Var.setSelectorDrawableColor(0);
            k60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i3 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624327, 120, 120, null);
            imageView.d();
            j60Var.addView(imageView, b8.mf.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        t2Var.f36748o1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27853bh, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i3 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.bd.M0(2131744913, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131744910, null));
            }
            j60Var.addView(textView, b8.mf.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i3 == 2) {
                textView.setText(org.telegram.messenger.bd.M0(2131743396, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.bd.M0(2131743486, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131743378, null));
            }
            j60Var.addView(textView, b8.mf.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(t2Var.getContext());
        t2Var.f36749p1 = textView2;
        if (i3 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27870ch, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = t2Var.f36750q1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long C13 = org.telegram.messenger.zi.C1((TLRPC.Peer) t2Var.f36750q1.get(i17));
            if (C13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(t2Var.f28583a).M0(Long.valueOf(-C13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        t2Var.f36749p1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.H(t2Var.f36749p1, org.telegram.ui.ActionBar.k6.f28006k5, null);
        if (i3 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                sb2.append(org.telegram.messenger.bd.M0(2131743468, null));
            } else {
                sb2.append(org.telegram.messenger.bd.M0(2131743343, null));
            }
            if (t2Var.f36750q1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743453, null));
            } else {
                t2Var.f36747n1.setVisibility(8);
            }
            t2Var.f36749p1.setText(sb2);
            t2Var.f36749p1.setGravity(49);
            j60Var.addView(t2Var.f36749p1, b8.mf.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                t2Var.f36749p1.setText(org.telegram.messenger.bd.M0(2131743341, null));
            } else {
                t2Var.f36749p1.setText(org.telegram.messenger.bd.M0(2131743342, null));
            }
            TextView textView3 = t2Var.f36749p1;
            if (org.telegram.messenger.bd.f21784a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            j60Var.addView(t2Var.f36749p1, b8.mf.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i3 == 0) {
            k60 k60Var2 = t2Var.f36747n1;
            if (t2Var.f36750q1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            j60Var.addView(k60Var2, b8.mf.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(t2Var, context, false);
        t2Var.m1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new q2(23, t2Var, m60Var));
        if (t2Var.f36753t1 == 0) {
            j60Var.addView(v0Var, b8.mf.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(t2Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.bd.M0(2131743472, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.bd.M0(2131743351, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new f0((Object) t2Var, 27));
            j60Var.addView(v0Var2, b8.mf.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            j60Var.addView(v0Var, b8.mf.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        t2Var.M0(M0, false);
        if (d2Var != 0) {
            if (d2Var.getParentActivity() != null) {
                d2Var.showDialog(t2Var);
                return;
            }
            return;
        }
        t2Var.show();
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.f36756w1;
        if (inputPeer != null) {
            m60 m60Var = this.f36759z1;
            boolean z10 = true;
            if (this.f36750q1.size() <= 1) {
                z10 = false;
            }
            m60Var.a(inputPeer, z10, this.f36757x1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.v0 v0Var = this.m1;
        if (this.f36753t1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.bd.a0("VoipChannelStartVoiceChat", null, 2131743465, new Object[0]), z10);
                return;
            } else {
                v0Var.a(org.telegram.messenger.bd.a0("VoipGroupStartVoiceChat", null, 2131743334, new Object[0]), z10);
                return;
            }
        }
        long C12 = org.telegram.messenger.zi.C1(this.f36754u1);
        if (org.telegram.messenger.m5.E(C12)) {
            v0Var.a(org.telegram.messenger.bd.a0("VoipGroupContinueAs", null, 2131743401, org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(C12)), true)), z10);
            return;
        }
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-C12));
        if (M0 != null) {
            str = M0.title;
        } else {
            str = "";
        }
        v0Var.a(org.telegram.messenger.bd.a0("VoipGroupContinueAs", null, 2131743401, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
            if (this.k1 && (drawable = this.f36745j1) != null && x02 != this.f36746l1) {
                this.f36746l1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f28586b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
