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
public final class u60 extends org.telegram.ui.ActionBar.v2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList f38625z1;
    public Drawable f38626i1;
    public boolean f38627j1;
    public int f38628k1;
    public org.telegram.ui.Cells.v0 l1;
    public q60 f38629m1;
    public TextView n1;
    public TextView f38630o1;
    public ArrayList f38631p1;
    public boolean f38632q1;
    public int f38633r1;
    public int f38634s1;
    public TLRPC.Peer f38635t1;
    public TLRPC.Peer f38636u1;
    public TLRPC.InputPeer f38637v1;
    public boolean f38638w1;
    public boolean f38639x1;
    public s60 f38640y1;

    public static void I0(u60 u60Var) {
        q60 q60Var = u60Var.f38629m1;
        if (u60Var.f38634s1 != 0) {
            if (q60Var.getChildCount() <= 0) {
                int paddingTop = q60Var.getPaddingTop();
                u60Var.f38633r1 = paddingTop;
                q60Var.setTopGlowOffset(paddingTop);
                u60Var.f28624b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = q60Var.getChildAt(0);
            yi0 yi0Var = (yi0) q60Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
                i7 = top;
            }
            if (u60Var.f38633r1 != i7) {
                u60Var.n1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                u60Var.f38630o1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                u60Var.f38633r1 = i7;
                q60Var.setTopGlowOffset(i7);
                u60Var.f28624b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.qr qrVar) {
        int i7 = C1;
        int i10 = cVar.f21765a;
        if (i7 == i10 && B1 == j3 && f38625z1 != null && SystemClock.elapsedRealtime() - A1 < 240000) {
            boolean z9 = true;
            if (f38625z1.size() != 1) {
                z9 = false;
            }
            qrVar.k(z9);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i10).j1(j3);
        u1Var.setOnCancelListener(new n60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new bi.f0(u1Var, j3, cVar, qrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, s60 s60Var) {
        if (context != null) {
            int i10 = C1;
            int i11 = cVar.f21765a;
            if (i10 == i11 && B1 == j3 && f38625z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (f38625z1.size() == 1 && i7 != 0) {
                    s60Var.a(org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) f38625z1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j3, f38625z1, f2Var, i7, peer, s60Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
            u1Var.setOnCancelListener(new n60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new m60(u1Var, cVar, s60Var, j3, context, f2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, s60 s60Var) {
        int i10;
        p60 p60Var;
        int i11;
        boolean z9;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                oq oqVar = new oq(f2Var, arrayList, j3, s60Var);
                if (f2Var.getParentActivity() != null) {
                    f2Var.showDialog(oqVar);
                    return;
                } else {
                    oqVar.show();
                    return;
                }
            }
            return;
        }
        ?? v2Var = new org.telegram.ui.ActionBar.v2(context, false);
        v2Var.f28656v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        v2Var.f38631p1 = arrayList2;
        v2Var.f38640y1 = s60Var;
        v2Var.f38634s1 = i7;
        Drawable h = jg.g.h(context, 2131232728);
        v2Var.f38626i1 = h;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) v2Var.f38631p1.get(i14);
                    if (org.telegram.messenger.ij.B1(peer2) == selfId) {
                        v2Var.f38636u1 = peer2;
                        v2Var.f38635t1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long B12 = org.telegram.messenger.ij.B1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) v2Var.f38631p1.get(i15);
                    if (org.telegram.messenger.ij.B1(peer3) == B12) {
                        v2Var.f38636u1 = peer3;
                        v2Var.f38635t1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                v2Var.f38635t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = v2Var.f38626i1;
            i10 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
            h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            v2Var.f38627j1 = true;
            v2Var.f38628k1 = x02;
            v2Var.f38635t1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        v2Var.O(i10);
        if (v2Var.f38634s1 == 0) {
            ?? o60Var = new o60(v2Var, context);
            o60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(o60Var);
            v2Var.N = nestedScrollView;
            p60Var = o60Var;
        } else {
            p60 p60Var2 = new p60(v2Var, context);
            v2Var.f28624b = p60Var2;
            p60Var2.setWillNotDraw(false);
            ViewGroup viewGroup = v2Var.f28624b;
            int i16 = v2Var.f28654t0;
            viewGroup.setPadding(i16, 0, i16, 0);
            p60Var = p60Var2;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(v2Var.f28621a).M0(Long.valueOf(-j3));
        q60 q60Var = new q60(v2Var, context);
        v2Var.f38629m1 = q60Var;
        v2Var.getContext();
        if (v2Var.f38634s1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        q60Var.setLayoutManager(new v4.b0(i11, false));
        q60Var.setAdapter(new t60(v2Var, context));
        q60Var.setVerticalScrollBarEnabled(false);
        q60Var.setClipToPadding(false);
        q60Var.setEnabled(true);
        q60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.s6.l(q60Var, 21, org.telegram.ui.ActionBar.l6.A5, null);
        q60Var.setOnScrollListener(new r60(v2Var));
        q60Var.setOnItemClickListener(new di.q4(11, v2Var, M0));
        if (i7 != 0) {
            p60Var.addView(q60Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            q60Var.setSelectorDrawableColor(0);
            q60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624327, 120, 120, null);
            imageView.d();
            p60Var.addView(imageView, c8.ha.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        v2Var.n1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27838bh, null);
        } else {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131744903, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131744900, null));
            }
            p60Var.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.id.M0(2131743386, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131743476, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131743368, null));
            }
            p60Var.addView(textView, c8.ha.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(v2Var.getContext());
        v2Var.f38630o1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f27858ch, null);
        } else {
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28123r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = v2Var.f38631p1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B13 = org.telegram.messenger.ij.B1((TLRPC.Peer) v2Var.f38631p1.get(i17));
            if (B13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(v2Var.f28621a).M0(Long.valueOf(-B13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        v2Var.f38630o1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.s6.G(v2Var.f38630o1, org.telegram.ui.ActionBar.l6.f27993k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                sb2.append(org.telegram.messenger.id.M0(2131743458, null));
            } else {
                sb2.append(org.telegram.messenger.id.M0(2131743333, null));
            }
            if (v2Var.f38631p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743443, null));
            } else {
                v2Var.f38629m1.setVisibility(8);
            }
            v2Var.f38630o1.setText(sb2);
            v2Var.f38630o1.setGravity(49);
            p60Var.addView(v2Var.f38630o1, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z9) {
                v2Var.f38630o1.setText(org.telegram.messenger.id.M0(2131743331, null));
            } else {
                v2Var.f38630o1.setText(org.telegram.messenger.id.M0(2131743332, null));
            }
            TextView textView3 = v2Var.f38630o1;
            if (org.telegram.messenger.id.f23157a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            p60Var.addView(v2Var.f38630o1, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            q60 q60Var2 = v2Var.f38629m1;
            if (v2Var.f38631p1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            p60Var.addView(q60Var2, c8.ha.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(v2Var, context, false);
        v2Var.l1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new lk(17, v2Var, s60Var));
        if (v2Var.f38634s1 == 0) {
            p60Var.addView(v0Var, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(v2Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.id.M0(2131743462, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.id.M0(2131743341, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new h0((Object) v2Var, 27));
            p60Var.addView(v0Var2, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            p60Var.addView(v0Var, c8.ha.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        v2Var.M0(M0, false);
        if (f2Var != 0) {
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(v2Var);
                return;
            }
            return;
        }
        v2Var.show();
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.f38637v1;
        if (inputPeer != null) {
            s60 s60Var = this.f38640y1;
            boolean z9 = true;
            if (this.f38631p1.size() <= 1) {
                z9 = false;
            }
            s60Var.a(inputPeer, z9, this.f38638w1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z9) {
        String str;
        org.telegram.ui.Cells.v0 v0Var = this.l1;
        if (this.f38634s1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.id.a0("VoipChannelStartVoiceChat", null, 2131743455, new Object[0]), z9);
                return;
            } else {
                v0Var.a(org.telegram.messenger.id.a0("VoipGroupStartVoiceChat", null, 2131743324, new Object[0]), z9);
                return;
            }
        }
        long B12 = org.telegram.messenger.ij.B1(this.f38635t1);
        if (org.telegram.messenger.m5.E(B12)) {
            v0Var.a(org.telegram.messenger.id.a0("VoipGroupContinueAs", null, 2131743391, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(this.f28621a).a2(Long.valueOf(B12)), true)), z9);
            return;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28621a).M0(Long.valueOf(-B12));
        if (M0 != null) {
            str = M0.title;
        } else {
            str = "";
        }
        v0Var.a(org.telegram.messenger.id.a0("VoipGroupContinueAs", null, 2131743391, str), z9);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
            if (this.f38627j1 && (drawable = this.f38626i1) != null && x02 != this.f38628k1) {
                this.f38628k1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f28624b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
