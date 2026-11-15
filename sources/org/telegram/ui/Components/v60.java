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
public final class v60 extends org.telegram.ui.ActionBar.u2 {
    public static ArrayList D1;
    public static long E1;
    public static long F1;
    public static int G1;
    public boolean A1;
    public boolean B1;
    public t60 C1;
    public Drawable f40277m1;
    public boolean n1;
    public int f40278o1;
    public org.telegram.ui.Cells.v0 f40279p1;
    public r60 f40280q1;
    public TextView f40281r1;
    public TextView f40282s1;
    public ArrayList f40283t1;
    public boolean f40284u1;
    public int f40285v1;
    public int f40286w1;
    public TLRPC.Peer f40287x1;
    public TLRPC.Peer f40288y1;
    public TLRPC.InputPeer f40289z1;

    public static void I0(v60 v60Var) {
        r60 r60Var = v60Var.f40280q1;
        if (v60Var.f40286w1 != 0) {
            if (r60Var.getChildCount() <= 0) {
                int paddingTop = r60Var.getPaddingTop();
                v60Var.f40285v1 = paddingTop;
                r60Var.setTopGlowOffset(paddingTop);
                v60Var.f29682b.invalidate();
                return;
            }
            int i7 = 0;
            View childAt = r60Var.getChildAt(0);
            cj0 cj0Var = (cj0) r60Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.g0.L(9.0f);
            if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
                i7 = top;
            }
            if (v60Var.f40285v1 != i7) {
                v60Var.f40281r1.setTranslationY(org.telegram.messenger.g0.L(19.0f) + top);
                v60Var.f40282s1.setTranslationY(org.telegram.messenger.g0.L(56.0f) + top);
                v60Var.f40285v1 = i7;
                r60Var.setTopGlowOffset(i7);
                v60Var.f29682b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j3, org.telegram.messenger.c cVar, org.telegram.messenger.nr nrVar) {
        int i7 = G1;
        int i10 = cVar.f22778a;
        if (i7 == i10 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 240000) {
            boolean z10 = true;
            if (D1.size() != 1) {
                z10 = false;
            }
            nrVar.j(z10);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.np.s1(i10).j1(j3);
        t1Var.setOnCancelListener(new o60(cVar, ConnectionsManager.getInstance(i10).sendRequest(getgroupcalljoinas, new di.y(t1Var, j3, cVar, nrVar)), 1));
        try {
            t1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j3, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer, t60 t60Var) {
        if (context != null) {
            int i10 = G1;
            int i11 = cVar.f22778a;
            if (i10 == i11 && F1 == j3 && D1 != null && SystemClock.elapsedRealtime() - E1 < 300000) {
                if (D1.size() == 1 && i7 != 0) {
                    t60Var.a(org.telegram.messenger.np.s1(i11).j1(org.telegram.messenger.gj.B1((TLRPC.Peer) D1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j3, D1, e2Var, i7, peer, t60Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.np.s1(i11).j1(j3);
            t1Var.setOnCancelListener(new o60(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new n60(t1Var, cVar, t60Var, j3, context, e2Var, i7, peer)), 0));
            try {
                t1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Peer peer, t60 t60Var) {
        int i10;
        q60 q60Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i7 == 0) {
            if (!arrayList.isEmpty()) {
                vq vqVar = new vq(e2Var, arrayList, j3, t60Var);
                if (e2Var.getParentActivity() != null) {
                    e2Var.showDialog(vqVar);
                    return;
                } else {
                    vqVar.show();
                    return;
                }
            }
            return;
        }
        ?? u2Var = new org.telegram.ui.ActionBar.u2(context, false);
        u2Var.f29720w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        u2Var.f40283t1 = arrayList2;
        u2Var.C1 = t60Var;
        u2Var.f40286w1 = i7;
        Drawable g10 = i5.c.g(context, 2131232729);
        u2Var.f40277m1 = g10;
        if (i7 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) u2Var.f40283t1.get(i14);
                    if (org.telegram.messenger.gj.B1(peer2) == selfId) {
                        u2Var.f40288y1 = peer2;
                        u2Var.f40287x1 = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) u2Var.f40283t1.get(i15);
                    if (org.telegram.messenger.gj.B1(peer3) == B1) {
                        u2Var.f40288y1 = peer3;
                        u2Var.f40287x1 = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                u2Var.f40287x1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = u2Var.f40277m1;
            i10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
            g10.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            u2Var.n1 = true;
            u2Var.f40278o1 = x02;
            u2Var.f40287x1 = (TLRPC.Peer) arrayList2.get(0);
            i10 = x02;
        }
        u2Var.P(i10);
        if (u2Var.f40286w1 == 0) {
            ?? p60Var = new p60(u2Var, context);
            p60Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(p60Var);
            u2Var.O = nestedScrollView;
            q60Var = p60Var;
        } else {
            q60 q60Var2 = new q60(u2Var, context);
            u2Var.f29682b = q60Var2;
            q60Var2.setWillNotDraw(false);
            ViewGroup viewGroup = u2Var.f29682b;
            int i16 = u2Var.f29717u0;
            viewGroup.setPadding(i16, 0, i16, 0);
            q60Var = q60Var2;
        }
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(u2Var.f29679a).M0(Long.valueOf(-j3));
        r60 r60Var = new r60(u2Var, context);
        u2Var.f40280q1 = r60Var;
        u2Var.getContext();
        if (u2Var.f40286w1 == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        r60Var.setLayoutManager(new v4.b0(i11, false));
        r60Var.setAdapter(new u60(u2Var, context));
        r60Var.setVerticalScrollBarEnabled(false);
        r60Var.setClipToPadding(false);
        r60Var.setEnabled(true);
        r60Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.q6.l(r60Var, 21, org.telegram.ui.ActionBar.j6.A5, null);
        r60Var.setOnScrollListener(new s60(u2Var));
        r60Var.setOnItemClickListener(new fi.i4(11, u2Var, M0));
        if (i7 != 0) {
            q60Var.addView(r60Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            r60Var.setSelectorDrawableColor(0);
            r60Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        }
        if (i7 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 120, 120, null);
            imageView.d();
            q60Var.addView(imageView, c8.ja.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        u2Var.f40281r1 = textView;
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        if (i7 == 2) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28878eh, null);
        } else {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0) {
            if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131744903, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131744900, null));
            }
            q60Var.addView(textView, c8.ja.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i7 == 2) {
                textView.setText(org.telegram.messenger.hd.M0(2131743386, null));
            } else if (org.telegram.messenger.t3.W(M0)) {
                textView.setText(org.telegram.messenger.hd.M0(2131743476, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131743368, null));
            }
            q60Var.addView(textView, c8.ja.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(u2Var.getContext());
        u2Var.f40282s1 = textView2;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28895fh, null);
        } else {
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29107r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = u2Var.f40283t1.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long B12 = org.telegram.messenger.gj.B1((TLRPC.Peer) u2Var.f40283t1.get(i17));
            if (B12 < 0) {
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(u2Var.f29679a).M0(Long.valueOf(-B12));
                if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        u2Var.f40282s1.setMovementMethod(new org.telegram.messenger.c0(false));
        org.telegram.ui.ActionBar.q6.G(u2Var.f40282s1, org.telegram.ui.ActionBar.j6.f28977k5, null);
        if (i7 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                sb2.append(org.telegram.messenger.hd.M0(2131743458, null));
            } else {
                sb2.append(org.telegram.messenger.hd.M0(2131743333, null));
            }
            if (u2Var.f40283t1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743443, null));
            } else {
                u2Var.f40280q1.setVisibility(8);
            }
            u2Var.f40282s1.setText(sb2);
            u2Var.f40282s1.setGravity(49);
            q60Var.addView(u2Var.f40282s1, c8.ja.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                u2Var.f40282s1.setText(org.telegram.messenger.hd.M0(2131743331, null));
            } else {
                u2Var.f40282s1.setText(org.telegram.messenger.hd.M0(2131743332, null));
            }
            TextView textView3 = u2Var.f40282s1;
            if (org.telegram.messenger.hd.f24101a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            q60Var.addView(u2Var.f40282s1, c8.ja.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i7 == 0) {
            r60 r60Var2 = u2Var.f40280q1;
            if (u2Var.f40283t1.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            q60Var.addView(r60Var2, c8.ja.t(i13, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(u2Var, context, false);
        u2Var.f40279p1 = v0Var;
        ((View) v0Var.d).setOnClickListener(new n2(24, u2Var, t60Var));
        if (u2Var.f40286w1 == 0) {
            q60Var.addView(v0Var, c8.ja.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(u2Var, context, true);
            if (org.telegram.messenger.t3.W(M0)) {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743462, null), false);
            } else {
                v0Var2.a(org.telegram.messenger.hd.M0(2131743341, null), false);
            }
            ((View) v0Var2.d).setOnClickListener(new e0((Object) u2Var, 28));
            q60Var.addView(v0Var2, c8.ja.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            q60Var.addView(v0Var, c8.ja.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        u2Var.M0(M0, false);
        if (e2Var != 0) {
            if (e2Var.getParentActivity() != null) {
                e2Var.showDialog(u2Var);
                return;
            }
            return;
        }
        u2Var.show();
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f40289z1;
        if (inputPeer != null) {
            t60 t60Var = this.C1;
            boolean z10 = true;
            if (this.f40283t1.size() <= 1) {
                z10 = false;
            }
            t60Var.a(inputPeer, z10, this.A1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.v0 v0Var = this.f40279p1;
        if (this.f40286w1 == 0) {
            if (org.telegram.messenger.t3.W(chat)) {
                v0Var.a(org.telegram.messenger.hd.a0("VoipChannelStartVoiceChat", null, 2131743455, new Object[0]), z10);
                return;
            } else {
                v0Var.a(org.telegram.messenger.hd.a0("VoipGroupStartVoiceChat", null, 2131743324, new Object[0]), z10);
                return;
            }
        }
        long B1 = org.telegram.messenger.gj.B1(this.f40287x1);
        if (org.telegram.messenger.m5.E(B1)) {
            v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743391, org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(B1)), true)), z10);
            return;
        }
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-B1));
        if (M0 != null) {
            str = M0.title;
        } else {
            str = "";
        }
        v0Var.a(org.telegram.messenger.hd.a0("VoipGroupContinueAs", null, 2131743391, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
            if (this.n1 && (drawable = this.f40277m1) != null && x02 != this.f40278o1) {
                this.f40278o1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f29682b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
