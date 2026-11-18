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
public final class g70 extends org.telegram.ui.ActionBar.x2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public e70 C1;
    public Drawable f35362m1;
    public boolean n1;
    public int f35363o1;
    public org.telegram.ui.Cells.w0 f35364p1;
    public c70 f35365q1;
    public TextView f35366r1;
    public TextView f35367s1;
    public ArrayList f35368t1;
    public boolean f35369u1;
    public int f35370v1;
    public int f35371w1;
    public TLRPC.Peer f35372x1;
    public TLRPC.Peer f35373y1;
    public TLRPC.InputPeer f35374z1;

    public static void J0(g70 g70Var) {
        c70 c70Var = g70Var.f35365q1;
        if (g70Var.f35371w1 != 0) {
            if (c70Var.getChildCount() <= 0) {
                int paddingTop = c70Var.getPaddingTop();
                g70Var.f35370v1 = paddingTop;
                c70Var.setTopGlowOffset(paddingTop);
                g70Var.f30192b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = c70Var.getChildAt(0);
            kj0 kj0Var = (kj0) c70Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
                i7 = top;
            }
            if (g70Var.f35370v1 != i7) {
                g70Var.f35366r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                g70Var.f35367s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                g70Var.f35370v1 = i7;
                c70Var.setTopGlowOffset(i7);
                g70Var.f30192b.invalidate();
            }
        }
    }

    public static void K0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.lr lrVar) {
        int i7 = G1;
        int i10 = cVar.f23221a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            boolean z10 = true;
            if (D1.size() != 1) {
                z10 = false;
            }
            lrVar.d(z10);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i10).l1(j3);
        u1Var.setOnCancelListener(new z60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(u1Var, j3, cVar, lrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void L0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer, e70 e70Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.f23221a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() == 1 && i7 != 0) {
                    e70Var.a(org.telegram.messenger.mp.u1(i11).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                } else {
                    M0(context, j3, D1, h2Var, i7, peer, e70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i11).l1(j3);
            u1Var.setOnCancelListener(new z60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new ii.c(u1Var, cVar, e70Var, j3, context, h2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void M0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer, e70 e70Var) {
        int i10;
        b70 b70Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                cr crVar = new cr(h2Var, arrayList, j3, e70Var);
                if (h2Var.getParentActivity() != null) {
                    h2Var.showDialog(crVar);
                    return;
                } else {
                    crVar.show();
                    return;
                }
            }
            return;
        }
        ?? x2Var = new org.telegram.ui.ActionBar.x2(context, false);
        x2Var.f30230w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        x2Var.f35368t1 = arrayList2;
        x2Var.C1 = e70Var;
        x2Var.f35371w1 = i7;
        Drawable g10 = i5.c.g(context, 2131232730);
        x2Var.f35362m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) x2Var.f35368t1.get(i14);
                    if (org.telegram.messenger.fj.B1(peer2) == selfId) {
                        x2Var.f35373y1 = peer2;
                        x2Var.f35372x1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long B1 = org.telegram.messenger.fj.B1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) x2Var.f35368t1.get(i15);
                    if (org.telegram.messenger.fj.B1(peer3) == B1) {
                        x2Var.f35373y1 = peer3;
                        x2Var.f35372x1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                x2Var.f35372x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = x2Var.f35362m1;
            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            x2Var.n1 = true;
            x2Var.f35363o1 = x02;
            x2Var.f35372x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        x2Var.P(i10);
        if (x2Var.f35371w1 == 0) {
            ?? a70Var = new a70(x2Var, context);
            a70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(a70Var);
            x2Var.O = nestedScrollView;
            b70Var = a70Var;
        } else {
            b70 b70Var2 = new b70(x2Var, context);
            x2Var.f30192b = b70Var2;
            b70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = x2Var.f30192b;
            int i16 = x2Var.f30227u0;
            viewGroup.setPadding(i16, 0, i16, 0);
            b70Var = b70Var2;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(x2Var.f30189a).O0(Long.valueOf(-j3));
        c70 c70Var = new c70(x2Var, context);
        x2Var.f35365q1 = c70Var;
        x2Var.getContext();
        if (x2Var.f35371w1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c70Var.setLayoutManager(new v4.c0(i11, false));
        c70Var.setAdapter(new f70(x2Var, context));
        c70Var.setVerticalScrollBarEnabled(false);
        c70Var.setClipToPadding(false);
        c70Var.setEnabled(true);
        c70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.u6.l(c70Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        c70Var.setOnScrollListener(new d70(x2Var));
        c70Var.setOnItemClickListener(new fi.g4(11, x2Var, O0));
        if (i7 != 0) {
            b70Var.addView(c70Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            c70Var.setSelectorDrawableColor(0);
            c70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 120, 120, null);
            imageView.d();
            b70Var.addView(imageView, c8.ma.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        x2Var.f35366r1 = textView;
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29425eh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.M0(2131744668, null));
            } else {
                textView.setText(org.telegram.messenger.gd.M0(2131744665, null));
            }
            b70Var.addView(textView, c8.ma.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.gd.M0(2131743149, null));
            } else if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.M0(2131743239, null));
            } else {
                textView.setText(org.telegram.messenger.gd.M0(2131743131, null));
            }
            b70Var.addView(textView, c8.ma.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(x2Var.getContext());
        x2Var.f35367s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29442fh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29654r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = x2Var.f35368t1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B12 = org.telegram.messenger.fj.B1((TLRPC.Peer) x2Var.f35368t1.get(i17));
            if (B12 < 0) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(x2Var.f30189a).O0(Long.valueOf(-B12));
                if (!org.telegram.messenger.v3.T(O02) || O02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        x2Var.f35367s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.G(x2Var.f35367s1, org.telegram.ui.ActionBar.n6.f29524k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                sb2.append(org.telegram.messenger.gd.M0(2131743221, null));
            } else {
                sb2.append(org.telegram.messenger.gd.M0(2131743096, null));
            }
            if (x2Var.f35368t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.gd.M0(2131743206, null));
            } else {
                x2Var.f35365q1.setVisibility(8);
            }
            x2Var.f35367s1.setText(sb2);
            x2Var.f35367s1.setGravity(49);
            b70Var.addView(x2Var.f35367s1, c8.ma.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                x2Var.f35367s1.setText(org.telegram.messenger.gd.M0(2131743094, null));
            } else {
                x2Var.f35367s1.setText(org.telegram.messenger.gd.M0(2131743095, null));
            }
            TextView textView3 = x2Var.f35367s1;
            if (org.telegram.messenger.gd.f24216a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            b70Var.addView(x2Var.f35367s1, c8.ma.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            c70 c70Var2 = x2Var.f35365q1;
            if (x2Var.f35368t1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            b70Var.addView(c70Var2, c8.ma.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x2Var, context, false);
        x2Var.f35364p1 = w0Var;
        ((View) w0Var.d).setOnClickListener(new y7(20, x2Var, e70Var));
        if (x2Var.f35371w1 == 0) {
            b70Var.addView(w0Var, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.w0 w0Var2 = new org.telegram.ui.Cells.w0(x2Var, context, true);
            if (org.telegram.messenger.v3.W(O0)) {
                w0Var2.a(org.telegram.messenger.gd.M0(2131743225, null), false);
            } else {
                w0Var2.a(org.telegram.messenger.gd.M0(2131743104, null), false);
            }
            ((View) w0Var2.d).setOnClickListener(new n0((Object) x2Var, 29));
            b70Var.addView(w0Var2, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            b70Var.addView(w0Var, c8.ma.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        x2Var.N0(O0, false);
        if (h2Var != 0) {
            if (h2Var.getParentActivity() != null) {
                h2Var.showDialog(x2Var);
                return;
            }
            return;
        }
        x2Var.show();
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f35374z1;
        if (inputPeer != null) {
            e70 e70Var = this.C1;
            boolean z10 = true;
            if (this.f35368t1.size() <= 1) {
                z10 = false;
            }
            e70Var.a(inputPeer, z10, this.A1, false);
        }
    }

    public final void N0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.w0 w0Var = this.f35364p1;
        if (this.f35371w1 == 0) {
            if (org.telegram.messenger.v3.W(chat)) {
                w0Var.a(org.telegram.messenger.gd.a0("VoipChannelStartVoiceChat", null, 2131743218, new Object[0]), z10);
                return;
            } else {
                w0Var.a(org.telegram.messenger.gd.a0("VoipGroupStartVoiceChat", null, 2131743087, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.fj.B1(this.f35372x1);
        if (org.telegram.messenger.n5.E(B1)) {
            w0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743154, org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(this.f30189a).c2(Long.valueOf(B1)), true)), z10);
            return;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30189a).O0(Long.valueOf(-B1));
        if (O0 != null) {
            str = O0.title;
        } else {
            str = "";
        }
        w0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743154, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false);
            if (this.n1 && (drawable = this.f35362m1) != null && x02 != this.f35363o1) {
                this.f35363o1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f30192b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
