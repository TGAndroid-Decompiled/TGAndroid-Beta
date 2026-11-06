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
public final class t60 extends org.telegram.ui.ActionBar.v2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList f38262z1;
    public Drawable f38263i1;
    public boolean f38264j1;
    public int f38265k1;
    public org.telegram.ui.Cells.v0 l1;
    public p60 f38266m1;
    public TextView n1;
    public TextView f38267o1;
    public ArrayList f38268p1;
    public boolean f38269q1;
    public int f38270r1;
    public int f38271s1;
    public TLRPC.Peer f38272t1;
    public TLRPC.Peer f38273u1;
    public TLRPC.InputPeer f38274v1;
    public boolean f38275w1;
    public boolean f38276x1;
    public r60 f38277y1;

    public static void I0(t60 t60Var) {
        p60 p60Var = t60Var.f38266m1;
        if (t60Var.f38271s1 != 0) {
            if (p60Var.getChildCount() <= 0) {
                int paddingTop = p60Var.getPaddingTop();
                t60Var.f38270r1 = paddingTop;
                p60Var.setTopGlowOffset(paddingTop);
                t60Var.f28615b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = p60Var.getChildAt(0);
            xi0 xi0Var = (xi0) p60Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
                i7 = top;
            }
            if (t60Var.f38270r1 != i7) {
                t60Var.n1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                t60Var.f38267o1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                t60Var.f38270r1 = i7;
                p60Var.setTopGlowOffset(i7);
                t60Var.f28615b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.qr qrVar) {
        int i7 = C1;
        int i10 = cVar.f21723a;
        if (i7 == i10 && B1 == j3 && f38262z1 != null && SystemClock.elapsedRealtime() - A1 < 240000) {
            boolean z9 = true;
            if (f38262z1.size() != 1) {
                z9 = false;
            }
            qrVar.k(z9);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i10).j1(j3);
        u1Var.setOnCancelListener(new m60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new bi.f0(u1Var, j3, cVar, qrVar)), 1));
        try {
            u1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, r60 r60Var) {
        if (context != null) {
            int i10 = C1;
            int i11 = cVar.f21723a;
            if (i10 == i11 && B1 == j3 && f38262z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (f38262z1.size() == 1 && i7 != 0) {
                    r60Var.a(org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.C1((TLRPC.Peer) f38262z1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j3, f38262z1, f2Var, i7, peer, r60Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
            u1Var.setOnCancelListener(new m60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new l60(u1Var, cVar, r60Var, j3, context, f2Var, i7, peer)), 0));
            try {
                u1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer, r60 r60Var) {
        int i10;
        o60 o60Var;
        int i11;
        boolean z9;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                oq oqVar = new oq(f2Var, arrayList, j3, r60Var);
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
        v2Var.f28647v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        v2Var.f38268p1 = arrayList2;
        v2Var.f38277y1 = r60Var;
        v2Var.f38271s1 = i7;
        Drawable h = jg.g.h(context, 2131232728);
        v2Var.f38263i1 = h;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) v2Var.f38268p1.get(i14);
                    if (org.telegram.messenger.ij.C1(peer2) == selfId) {
                        v2Var.f38273u1 = peer2;
                        v2Var.f38272t1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.ij.C1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) v2Var.f38268p1.get(i15);
                    if (org.telegram.messenger.ij.C1(peer3) == C12) {
                        v2Var.f38273u1 = peer3;
                        v2Var.f38272t1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                v2Var.f38272t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = v2Var.f38263i1;
            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
            h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            v2Var.f38264j1 = true;
            v2Var.f38265k1 = x02;
            v2Var.f38272t1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        v2Var.O(i10);
        if (v2Var.f38271s1 == 0) {
            ?? n60Var = new n60(v2Var, context);
            n60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n60Var);
            v2Var.N = nestedScrollView;
            o60Var = n60Var;
        } else {
            o60 o60Var2 = new o60(v2Var, context);
            v2Var.f28615b = o60Var2;
            o60Var2.setWillNotDraw(false);
            ViewGroup viewGroup = v2Var.f28615b;
            int i16 = v2Var.f28645t0;
            viewGroup.setPadding(i16, 0, i16, 0);
            o60Var = o60Var2;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(v2Var.f28612a).M0(Long.valueOf(-j3));
        p60 p60Var = new p60(v2Var, context);
        v2Var.f38266m1 = p60Var;
        v2Var.getContext();
        if (v2Var.f38271s1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        p60Var.setLayoutManager(new v4.b0(i11, false));
        p60Var.setAdapter(new s60(v2Var, context));
        p60Var.setVerticalScrollBarEnabled(false);
        p60Var.setClipToPadding(false);
        p60Var.setEnabled(true);
        p60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.r6.m(p60Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        p60Var.setOnScrollListener(new q60(v2Var));
        p60Var.setOnItemClickListener(new di.p4(11, v2Var, M0));
        if (i7 != 0) {
            o60Var.addView(p60Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p60Var.setSelectorDrawableColor(0);
            p60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624327, 120, 120, null);
            imageView.d();
            o60Var.addView(imageView, c8.ha.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        v2Var.n1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27821bh, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131744904, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131744901, null));
            }
            o60Var.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.hd.M0(2131743387, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131743477, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131743369, null));
            }
            o60Var.addView(textView, c8.ha.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(v2Var.getContext());
        v2Var.f38267o1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27841ch, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28106r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = v2Var.f38268p1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long C13 = org.telegram.messenger.ij.C1((TLRPC.Peer) v2Var.f38268p1.get(i17));
            if (C13 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(v2Var.f28612a).M0(Long.valueOf(-C13));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        v2Var.f38267o1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.r6.H(v2Var.f38267o1, org.telegram.ui.ActionBar.k6.f27976k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                sb2.append(org.telegram.messenger.hd.M0(2131743459, null));
            } else {
                sb2.append(org.telegram.messenger.hd.M0(2131743334, null));
            }
            if (v2Var.f38268p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743444, null));
            } else {
                v2Var.f38266m1.setVisibility(8);
            }
            v2Var.f38267o1.setText(sb2);
            v2Var.f38267o1.setGravity(49);
            o60Var.addView(v2Var.f38267o1, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z9) {
                v2Var.f38267o1.setText(org.telegram.messenger.hd.M0(2131743332, null));
            } else {
                v2Var.f38267o1.setText(org.telegram.messenger.hd.M0(2131743333, null));
            }
            TextView textView3 = v2Var.f38267o1;
            if (org.telegram.messenger.hd.f22871a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            o60Var.addView(v2Var.f38267o1, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            p60 p60Var2 = v2Var.f38266m1;
            if (v2Var.f38268p1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            o60Var.addView(p60Var2, c8.ha.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(v2Var, context, false);
        v2Var.l1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new lk(17, v2Var, r60Var));
        if (v2Var.f38271s1 == 0) {
            o60Var.addView(v0Var, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(v2Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743463, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743342, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new h0((Object) v2Var, 27));
            o60Var.addView(v0Var2, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            o60Var.addView(v0Var, c8.ha.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        TLRPC.InputPeer inputPeer = this.f38274v1;
        if (inputPeer != null) {
            r60 r60Var = this.f38277y1;
            boolean z9 = true;
            if (this.f38268p1.size() <= 1) {
                z9 = false;
            }
            r60Var.a(inputPeer, z9, this.f38275w1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z9) {
        String str;
        org.telegram.ui.Cells.v0 v0Var = this.l1;
        if (this.f38271s1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.hd.a0("VoipChannelStartVoiceChat", null, 2131743456, new Object[0]), z9);
                return;
            } else {
                v0Var.a(org.telegram.messenger.hd.a0("VoipGroupStartVoiceChat", null, 2131743325, new Object[0]), z9);
                return;
            }
        }
        long C12 = org.telegram.messenger.ij.C1(this.f38272t1);
        if (org.telegram.messenger.m5.E(C12)) {
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743392, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(this.f28612a).a2(Long.valueOf(C12)), true)), z9);
            return;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28612a).M0(Long.valueOf(-C12));
        if (M0 != null) {
            str = M0.title;
        } else {
            str = "";
        }
        v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743392, str), z9);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false);
            if (this.f38264j1 && (drawable = this.f38263i1) != null && x02 != this.f38265k1) {
                this.f38265k1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f28615b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
