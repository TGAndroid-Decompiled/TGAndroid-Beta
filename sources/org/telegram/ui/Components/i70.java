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
public final class i70 extends org.telegram.ui.ActionBar.w2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public g70 C1;
    public Drawable f36180m1;
    public boolean n1;
    public int f36181o1;
    public org.telegram.ui.Cells.x0 f36182p1;
    public e70 f36183q1;
    public TextView f36184r1;
    public TextView f36185s1;
    public ArrayList f36186t1;
    public boolean f36187u1;
    public int f36188v1;
    public int f36189w1;
    public TLRPC.Peer f36190x1;
    public TLRPC.Peer f36191y1;
    public TLRPC.InputPeer f36192z1;

    public static void J0(i70 i70Var) {
        e70 e70Var = i70Var.f36183q1;
        if (i70Var.f36189w1 != 0) {
            if (e70Var.getChildCount() <= 0) {
                int paddingTop = e70Var.getPaddingTop();
                i70Var.f36188v1 = paddingTop;
                e70Var.setTopGlowOffset(paddingTop);
                i70Var.f30176b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = e70Var.getChildAt(0);
            mj0 mj0Var = (mj0) e70Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
                i7 = top;
            }
            if (i70Var.f36188v1 != i7) {
                i70Var.f36184r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                i70Var.f36185s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                i70Var.f36188v1 = i7;
                e70Var.setTopGlowOffset(i7);
                i70Var.f30176b.invalidate();
            }
        }
    }

    public static void K0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.mr mrVar) {
        int i7 = G1;
        int i10 = cVar.f23202a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            boolean z10 = true;
            if (D1.size() != 1) {
                z10 = false;
            }
            mrVar.d(z10);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.np.u1(i10).l1(j3);
        t1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(t1Var, j3, cVar, mrVar)), 1));
        try {
            t1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void L0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, g70 g70Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.f23202a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() == 1 && i7 != 0) {
                    g70Var.a(org.telegram.messenger.np.u1(i11).l1(org.telegram.messenger.gj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                } else {
                    M0(context, j3, D1, g2Var, i7, peer, g70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.np.u1(i11).l1(j3);
            t1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new ii.c(t1Var, cVar, g70Var, j3, context, g2Var, i7, peer)), 0));
            try {
                t1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void M0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, g70 g70Var) {
        int i10;
        d70 d70Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                er erVar = new er(g2Var, arrayList, j3, g70Var);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(erVar);
                    return;
                } else {
                    erVar.show();
                    return;
                }
            }
            return;
        }
        ?? w2Var = new org.telegram.ui.ActionBar.w2(context, false);
        w2Var.f30214w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        w2Var.f36186t1 = arrayList2;
        w2Var.C1 = g70Var;
        w2Var.f36189w1 = i7;
        Drawable g10 = i5.c.g(context, 2131232730);
        w2Var.f36180m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) w2Var.f36186t1.get(i14);
                    if (org.telegram.messenger.gj.B1(peer2) == selfId) {
                        w2Var.f36191y1 = peer2;
                        w2Var.f36190x1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long B1 = org.telegram.messenger.gj.B1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) w2Var.f36186t1.get(i15);
                    if (org.telegram.messenger.gj.B1(peer3) == B1) {
                        w2Var.f36191y1 = peer3;
                        w2Var.f36190x1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                w2Var.f36190x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = w2Var.f36180m1;
            i10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            w2Var.n1 = true;
            w2Var.f36181o1 = x02;
            w2Var.f36190x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        w2Var.P(i10);
        if (w2Var.f36189w1 == 0) {
            ?? c70Var = new c70(w2Var, context);
            c70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(c70Var);
            w2Var.O = nestedScrollView;
            d70Var = c70Var;
        } else {
            d70 d70Var2 = new d70(w2Var, context);
            w2Var.f30176b = d70Var2;
            d70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = w2Var.f30176b;
            int i16 = w2Var.f30211u0;
            viewGroup.setPadding(i16, 0, i16, 0);
            d70Var = d70Var2;
        }
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(w2Var.f30173a).O0(Long.valueOf(-j3));
        e70 e70Var = new e70(w2Var, context);
        w2Var.f36183q1 = e70Var;
        w2Var.getContext();
        if (w2Var.f36189w1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        e70Var.setLayoutManager(new v4.c0(i11, false));
        e70Var.setAdapter(new h70(w2Var, context));
        e70Var.setVerticalScrollBarEnabled(false);
        e70Var.setClipToPadding(false);
        e70Var.setEnabled(true);
        e70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.t6.l(e70Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        e70Var.setOnScrollListener(new f70(w2Var));
        e70Var.setOnItemClickListener(new fi.g4(11, w2Var, O0));
        if (i7 != 0) {
            d70Var.addView(e70Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            e70Var.setSelectorDrawableColor(0);
            e70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 120, 120, null);
            imageView.d();
            d70Var.addView(imageView, c8.ma.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        w2Var.f36184r1 = textView;
        org.telegram.messenger.o10.p(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29410eh, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.hd.N0(2131744660, null));
            } else {
                textView.setText(org.telegram.messenger.hd.N0(2131744657, null));
            }
            d70Var.addView(textView, c8.ma.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.hd.N0(2131743141, null));
            } else if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.hd.N0(2131743231, null));
            } else {
                textView.setText(org.telegram.messenger.hd.N0(2131743123, null));
            }
            d70Var.addView(textView, c8.ma.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(w2Var.getContext());
        w2Var.f36185s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29427fh, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29639r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = w2Var.f36186t1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B12 = org.telegram.messenger.gj.B1((TLRPC.Peer) w2Var.f36186t1.get(i17));
            if (B12 < 0) {
                TLRPC.Chat O02 = org.telegram.messenger.np.u1(w2Var.f30173a).O0(Long.valueOf(-B12));
                if (!org.telegram.messenger.v3.T(O02) || O02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        w2Var.f36185s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.t6.G(w2Var.f36185s1, org.telegram.ui.ActionBar.m6.f29509k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                sb2.append(org.telegram.messenger.hd.N0(2131743213, null));
            } else {
                sb2.append(org.telegram.messenger.hd.N0(2131743088, null));
            }
            if (w2Var.f36186t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.hd.N0(2131743198, null));
            } else {
                w2Var.f36183q1.setVisibility(8);
            }
            w2Var.f36185s1.setText(sb2);
            w2Var.f36185s1.setGravity(49);
            d70Var.addView(w2Var.f36185s1, c8.ma.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                w2Var.f36185s1.setText(org.telegram.messenger.hd.N0(2131743086, null));
            } else {
                w2Var.f36185s1.setText(org.telegram.messenger.hd.N0(2131743087, null));
            }
            TextView textView3 = w2Var.f36185s1;
            if (org.telegram.messenger.hd.f24444a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            d70Var.addView(w2Var.f36185s1, c8.ma.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            e70 e70Var2 = w2Var.f36183q1;
            if (w2Var.f36186t1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            d70Var.addView(e70Var2, c8.ma.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(w2Var, context, false);
        w2Var.f36182p1 = x0Var;
        ((View) x0Var.d).setOnClickListener(new m8(19, w2Var, g70Var));
        if (w2Var.f36189w1 == 0) {
            d70Var.addView(x0Var, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(w2Var, context, true);
            if (org.telegram.messenger.v3.W(O0)) {
                x0Var2.a(org.telegram.messenger.hd.N0(2131743217, null), false);
            } else {
                x0Var2.a(org.telegram.messenger.hd.N0(2131743096, null), false);
            }
            ((View) x0Var2.d).setOnClickListener(new o0((Object) w2Var, 29));
            d70Var.addView(x0Var2, c8.ma.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            d70Var.addView(x0Var, c8.ma.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        w2Var.N0(O0, false);
        if (g2Var != 0) {
            if (g2Var.getParentActivity() != null) {
                g2Var.showDialog(w2Var);
                return;
            }
            return;
        }
        w2Var.show();
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f36192z1;
        if (inputPeer != null) {
            g70 g70Var = this.C1;
            boolean z10 = true;
            if (this.f36186t1.size() <= 1) {
                z10 = false;
            }
            g70Var.a(inputPeer, z10, this.A1, false);
        }
    }

    public final void N0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.x0 x0Var = this.f36182p1;
        if (this.f36189w1 == 0) {
            if (org.telegram.messenger.v3.W(chat)) {
                x0Var.a(org.telegram.messenger.hd.a0("VoipChannelStartVoiceChat", null, 2131743210, new Object[0]), z10);
                return;
            } else {
                x0Var.a(org.telegram.messenger.hd.a0("VoipGroupStartVoiceChat", null, 2131743079, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.gj.B1(this.f36190x1);
        if (org.telegram.messenger.n5.E(B1)) {
            x0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743146, org.telegram.messenger.p10.k(org.telegram.messenger.np.u1(this.f30173a).c2(Long.valueOf(B1)), true)), z10);
            return;
        }
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30173a).O0(Long.valueOf(-B1));
        if (O0 != null) {
            str = O0.title;
        } else {
            str = "";
        }
        x0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743146, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false);
            if (this.n1 && (drawable = this.f36180m1) != null && x02 != this.f36181o1) {
                this.f36181o1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f30176b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
