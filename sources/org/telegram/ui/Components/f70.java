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
public final class f70 extends org.telegram.ui.ActionBar.w2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public d70 C1;
    public Drawable f35027m1;
    public boolean n1;
    public int f35028o1;
    public org.telegram.ui.Cells.x0 f35029p1;
    public b70 f35030q1;
    public TextView f35031r1;
    public TextView f35032s1;
    public ArrayList f35033t1;
    public boolean f35034u1;
    public int f35035v1;
    public int f35036w1;
    public TLRPC.Peer f35037x1;
    public TLRPC.Peer f35038y1;
    public TLRPC.InputPeer f35039z1;

    public static void J0(f70 f70Var) {
        b70 b70Var = f70Var.f35030q1;
        if (f70Var.f35036w1 != 0) {
            if (b70Var.getChildCount() <= 0) {
                int paddingTop = b70Var.getPaddingTop();
                f70Var.f35035v1 = paddingTop;
                b70Var.setTopGlowOffset(paddingTop);
                f70Var.f30226b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = b70Var.getChildAt(0);
            mj0 mj0Var = (mj0) b70Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
                i7 = top;
            }
            if (f70Var.f35035v1 != i7) {
                f70Var.f35031r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                f70Var.f35032s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                f70Var.f35035v1 = i7;
                b70Var.setTopGlowOffset(i7);
                f70Var.f30226b.invalidate();
            }
        }
    }

    public static void K0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.lr lrVar) {
        int i7 = G1;
        int i10 = cVar.f23343a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            boolean z10 = true;
            if (D1.size() != 1) {
                z10 = false;
            }
            lrVar.q(z10);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i10).l1(j3);
        t1Var.setOnCancelListener(new y60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(t1Var, j3, cVar, lrVar)), 1));
        try {
            t1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void L0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, d70 d70Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.f23343a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() == 1 && i7 != 0) {
                    d70Var.a(org.telegram.messenger.mp.u1(i11).l1(org.telegram.messenger.fj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                } else {
                    M0(context, j3, D1, g2Var, i7, peer, d70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.mp.u1(i11).l1(j3);
            t1Var.setOnCancelListener(new y60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new ii.c(t1Var, cVar, d70Var, j3, context, g2Var, i7, peer)), 0));
            try {
                t1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void M0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer, d70 d70Var) {
        int i10;
        a70 a70Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                br brVar = new br(g2Var, arrayList, j3, d70Var);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(brVar);
                    return;
                } else {
                    brVar.show();
                    return;
                }
            }
            return;
        }
        ?? w2Var = new org.telegram.ui.ActionBar.w2(context, false);
        w2Var.f30264w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        w2Var.f35033t1 = arrayList2;
        w2Var.C1 = d70Var;
        w2Var.f35036w1 = i7;
        Drawable g10 = i5.c.g(context, 2131232733);
        w2Var.f35027m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) w2Var.f35033t1.get(i14);
                    if (org.telegram.messenger.fj.B1(peer2) == selfId) {
                        w2Var.f35038y1 = peer2;
                        w2Var.f35037x1 = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) w2Var.f35033t1.get(i15);
                    if (org.telegram.messenger.fj.B1(peer3) == B1) {
                        w2Var.f35038y1 = peer3;
                        w2Var.f35037x1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                w2Var.f35037x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = w2Var.f35027m1;
            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            w2Var.n1 = true;
            w2Var.f35028o1 = x02;
            w2Var.f35037x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        w2Var.P(i10);
        if (w2Var.f35036w1 == 0) {
            ?? z60Var = new z60(w2Var, context);
            z60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(z60Var);
            w2Var.O = nestedScrollView;
            a70Var = z60Var;
        } else {
            a70 a70Var2 = new a70(w2Var, context);
            w2Var.f30226b = a70Var2;
            a70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = w2Var.f30226b;
            int i16 = w2Var.f30261u0;
            viewGroup.setPadding(i16, 0, i16, 0);
            a70Var = a70Var2;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(w2Var.f30223a).O0(Long.valueOf(-j3));
        b70 b70Var = new b70(w2Var, context);
        w2Var.f35030q1 = b70Var;
        w2Var.getContext();
        if (w2Var.f35036w1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        b70Var.setLayoutManager(new v4.c0(i11, false));
        b70Var.setAdapter(new e70(w2Var, context));
        b70Var.setVerticalScrollBarEnabled(false);
        b70Var.setClipToPadding(false);
        b70Var.setEnabled(true);
        b70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.u6.l(b70Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        b70Var.setOnScrollListener(new c70(w2Var));
        b70Var.setOnItemClickListener(new fi.g4(11, w2Var, O0));
        if (i7 != 0) {
            a70Var.addView(b70Var, c8.na.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            b70Var.setSelectorDrawableColor(0);
            b70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 120, 120, null);
            imageView.d();
            a70Var.addView(imageView, c8.na.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        w2Var.f35031r1 = textView;
        org.telegram.messenger.m10.p(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29480eh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.N0(2131744662, null));
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131744659, null));
            }
            a70Var.addView(textView, c8.na.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.gd.N0(2131743136, null));
            } else if (org.telegram.messenger.v3.W(O0)) {
                textView.setText(org.telegram.messenger.gd.N0(2131743226, null));
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131743118, null));
            }
            a70Var.addView(textView, c8.na.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(w2Var.getContext());
        w2Var.f35032s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29497fh, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29709r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = w2Var.f35033t1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B12 = org.telegram.messenger.fj.B1((TLRPC.Peer) w2Var.f35033t1.get(i17));
            if (B12 < 0) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(w2Var.f30223a).O0(Long.valueOf(-B12));
                if (!org.telegram.messenger.v3.T(O02) || O02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        w2Var.f35032s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.u6.G(w2Var.f35032s1, org.telegram.ui.ActionBar.n6.f29579k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                sb2.append(org.telegram.messenger.gd.N0(2131743208, null));
            } else {
                sb2.append(org.telegram.messenger.gd.N0(2131743083, null));
            }
            if (w2Var.f35033t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.gd.N0(2131743193, null));
            } else {
                w2Var.f35030q1.setVisibility(8);
            }
            w2Var.f35032s1.setText(sb2);
            w2Var.f35032s1.setGravity(49);
            a70Var.addView(w2Var.f35032s1, c8.na.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                w2Var.f35032s1.setText(org.telegram.messenger.gd.N0(2131743081, null));
            } else {
                w2Var.f35032s1.setText(org.telegram.messenger.gd.N0(2131743082, null));
            }
            TextView textView3 = w2Var.f35032s1;
            if (org.telegram.messenger.gd.f24314a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            a70Var.addView(w2Var.f35032s1, c8.na.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            b70 b70Var2 = w2Var.f35030q1;
            if (w2Var.f35033t1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            a70Var.addView(b70Var2, c8.na.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(w2Var, context, false);
        w2Var.f35029p1 = x0Var;
        ((View) x0Var.d).setOnClickListener(new l8(19, w2Var, d70Var));
        if (w2Var.f35036w1 == 0) {
            a70Var.addView(x0Var, c8.na.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(w2Var, context, true);
            if (org.telegram.messenger.v3.W(O0)) {
                x0Var2.a(org.telegram.messenger.gd.N0(2131743212, null), false);
            } else {
                x0Var2.a(org.telegram.messenger.gd.N0(2131743091, null), false);
            }
            ((View) x0Var2.d).setOnClickListener(new n0((Object) w2Var, 29));
            a70Var.addView(x0Var2, c8.na.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            a70Var.addView(x0Var, c8.na.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
    public final boolean F() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f35039z1;
        if (inputPeer != null) {
            d70 d70Var = this.C1;
            boolean z10 = true;
            if (this.f35033t1.size() <= 1) {
                z10 = false;
            }
            d70Var.a(inputPeer, z10, this.A1, false);
        }
    }

    public final void N0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.x0 x0Var = this.f35029p1;
        if (this.f35036w1 == 0) {
            if (org.telegram.messenger.v3.W(chat)) {
                x0Var.a(org.telegram.messenger.gd.a0("VoipChannelStartVoiceChat", null, 2131743205, new Object[0]), z10);
                return;
            } else {
                x0Var.a(org.telegram.messenger.gd.a0("VoipGroupStartVoiceChat", null, 2131743074, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.fj.B1(this.f35037x1);
        if (org.telegram.messenger.n5.E(B1)) {
            x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743141, org.telegram.messenger.n10.k(org.telegram.messenger.mp.u1(this.f30223a).c2(Long.valueOf(B1)), true)), z10);
            return;
        }
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30223a).O0(Long.valueOf(-B1));
        if (O0 != null) {
            str = O0.title;
        } else {
            str = "";
        }
        x0Var.a(org.telegram.messenger.gd.a0("VoipGroupContinueAs", null, 2131743141, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
            if (this.n1 && (drawable = this.f35027m1) != null && x02 != this.f35028o1) {
                this.f35028o1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f30226b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
