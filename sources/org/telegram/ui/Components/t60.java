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
public final class t60 extends org.telegram.ui.ActionBar.w2 {
    public static ArrayList C1;
    public static long D1;
    public static long E1;
    public static int F1;
    public boolean A1;
    public r60 B1;
    public Drawable l1;
    public boolean f38216m1;
    public int n1;
    public org.telegram.ui.Cells.v0 f38217o1;
    public p60 f38218p1;
    public TextView f38219q1;
    public TextView f38220r1;
    public ArrayList f38221s1;
    public boolean f38222t1;
    public int f38223u1;
    public int f38224v1;
    public TLRPC.Peer f38225w1;
    public TLRPC.Peer f38226x1;
    public TLRPC.InputPeer f38227y1;
    public boolean f38228z1;

    public static void I0(t60 t60Var) {
        p60 p60Var = t60Var.f38218p1;
        if (t60Var.f38224v1 != 0) {
            if (p60Var.getChildCount() <= 0) {
                int paddingTop = p60Var.getPaddingTop();
                t60Var.f38223u1 = paddingTop;
                p60Var.setTopGlowOffset(paddingTop);
                t60Var.f28672b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = p60Var.getChildAt(0);
            xi0 xi0Var = (xi0) p60Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
                i7 = top;
            }
            if (t60Var.f38223u1 != i7) {
                t60Var.f38219q1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                t60Var.f38220r1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                t60Var.f38223u1 = i7;
                p60Var.setTopGlowOffset(i7);
                t60Var.f28672b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.qr qrVar) {
        int i7 = F1;
        int i10 = cVar.f21770a;
        if (i7 == i10 && E1 == j3 && C1 != null && SystemClock.elapsedRealtime() - D1 < 240000) {
            boolean z9 = true;
            if (C1.size() != 1) {
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
            int i10 = F1;
            int i11 = cVar.f21770a;
            if (i10 == i11 && E1 == j3 && C1 != null && SystemClock.elapsedRealtime() - D1 < 300000) {
                if (C1.size() == 1 && i7 != 0) {
                    r60Var.a(org.telegram.messenger.qp.s1(i11).j1(org.telegram.messenger.ij.B1((TLRPC.Peer) C1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j3, C1, f2Var, i7, peer, r60Var);
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
                nq nqVar = new nq(f2Var, arrayList, j3, r60Var);
                if (f2Var.getParentActivity() != null) {
                    f2Var.showDialog(nqVar);
                    return;
                } else {
                    nqVar.show();
                    return;
                }
            }
            return;
        }
        ?? w2Var = new org.telegram.ui.ActionBar.w2(context, false);
        w2Var.f28707v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        w2Var.f38221s1 = arrayList2;
        w2Var.B1 = r60Var;
        w2Var.f38224v1 = i7;
        Drawable h = jg.g.h(context, 2131232728);
        w2Var.l1 = h;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) w2Var.f38221s1.get(i14);
                    if (org.telegram.messenger.ij.B1(peer2) == selfId) {
                        w2Var.f38226x1 = peer2;
                        w2Var.f38225w1 = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long B1 = org.telegram.messenger.ij.B1(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) w2Var.f38221s1.get(i15);
                    if (org.telegram.messenger.ij.B1(peer3) == B1) {
                        w2Var.f38226x1 = peer3;
                        w2Var.f38225w1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                w2Var.f38225w1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = w2Var.l1;
            i10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
            h.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            w2Var.f38216m1 = true;
            w2Var.n1 = x02;
            w2Var.f38225w1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        w2Var.O(i10);
        if (w2Var.f38224v1 == 0) {
            ?? n60Var = new n60(w2Var, context);
            n60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n60Var);
            w2Var.N = nestedScrollView;
            o60Var = n60Var;
        } else {
            o60 o60Var2 = new o60(w2Var, context);
            w2Var.f28672b = o60Var2;
            o60Var2.setWillNotDraw(false);
            ViewGroup viewGroup = w2Var.f28672b;
            int i16 = w2Var.f28705t0;
            viewGroup.setPadding(i16, 0, i16, 0);
            o60Var = o60Var2;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(w2Var.f28669a).M0(Long.valueOf(-j3));
        p60 p60Var = new p60(w2Var, context);
        w2Var.f38218p1 = p60Var;
        w2Var.getContext();
        if (w2Var.f38224v1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        p60Var.setLayoutManager(new v4.b0(i11, false));
        p60Var.setAdapter(new s60(w2Var, context));
        p60Var.setVerticalScrollBarEnabled(false);
        p60Var.setClipToPadding(false);
        p60Var.setEnabled(true);
        p60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.t6.l(p60Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        p60Var.setOnScrollListener(new q60(w2Var));
        p60Var.setOnItemClickListener(new di.q4(11, w2Var, M0));
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
        w2Var.f38219q1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27863bh, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131744903, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131744900, null));
            }
            o60Var.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.id.M0(2131743386, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.id.M0(2131743476, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131743368, null));
            }
            o60Var.addView(textView, c8.ha.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(w2Var.getContext());
        w2Var.f38220r1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f27883ch, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28148r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = w2Var.f38221s1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B12 = org.telegram.messenger.ij.B1((TLRPC.Peer) w2Var.f38221s1.get(i17));
            if (B12 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(w2Var.f28669a).M0(Long.valueOf(-B12));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        w2Var.f38220r1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.t6.G(w2Var.f38220r1, org.telegram.ui.ActionBar.m6.f28018k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                sb2.append(org.telegram.messenger.id.M0(2131743458, null));
            } else {
                sb2.append(org.telegram.messenger.id.M0(2131743333, null));
            }
            if (w2Var.f38221s1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743443, null));
            } else {
                w2Var.f38218p1.setVisibility(8);
            }
            w2Var.f38220r1.setText(sb2);
            w2Var.f38220r1.setGravity(49);
            o60Var.addView(w2Var.f38220r1, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z9) {
                w2Var.f38220r1.setText(org.telegram.messenger.id.M0(2131743331, null));
            } else {
                w2Var.f38220r1.setText(org.telegram.messenger.id.M0(2131743332, null));
            }
            TextView textView3 = w2Var.f38220r1;
            if (org.telegram.messenger.id.f23161a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            o60Var.addView(w2Var.f38220r1, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            p60 p60Var2 = w2Var.f38218p1;
            if (w2Var.f38221s1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            o60Var.addView(p60Var2, c8.ha.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(w2Var, context, false);
        w2Var.f38217o1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new kk(17, w2Var, r60Var));
        if (w2Var.f38224v1 == 0) {
            o60Var.addView(v0Var, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(w2Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.id.M0(2131743462, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.id.M0(2131743341, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new g0((Object) w2Var, 27));
            o60Var.addView(v0Var2, c8.ha.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            o60Var.addView(v0Var, c8.ha.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        w2Var.M0(M0, false);
        if (f2Var != 0) {
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(w2Var);
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
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.f38227y1;
        if (inputPeer != null) {
            r60 r60Var = this.B1;
            boolean z9 = true;
            if (this.f38221s1.size() <= 1) {
                z9 = false;
            }
            r60Var.a(inputPeer, z9, this.f38228z1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z9) {
        String str;
        org.telegram.ui.Cells.v0 v0Var = this.f38217o1;
        if (this.f38224v1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.id.a0("VoipChannelStartVoiceChat", null, 2131743455, new Object[0]), z9);
                return;
            } else {
                v0Var.a(org.telegram.messenger.id.a0("VoipGroupStartVoiceChat", null, 2131743324, new Object[0]), z9);
                return;
            }
        }
        long B1 = org.telegram.messenger.ij.B1(this.f38225w1);
        if (org.telegram.messenger.m5.E(B1)) {
            v0Var.a(org.telegram.messenger.id.a0("VoipGroupContinueAs", null, 2131743391, org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(B1)), true)), z9);
            return;
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-B1));
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
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
            if (this.f38216m1 && (drawable = this.l1) != null && x02 != this.n1) {
                this.n1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f28672b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
