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
public final class k70 extends org.telegram.ui.ActionBar.z2 {
    public static long A1;
    public static long B1;
    public static int C1;
    public static ArrayList f27655z1;
    public Drawable f27656i1;
    public boolean f27657j1;
    public int f27658k1;
    public org.telegram.ui.Cells.u0 l1;
    public g70 f27659m1;
    public TextView f27660n1;
    public TextView f27661o1;
    public ArrayList f27662p1;
    public boolean f27663q1;
    public int f27664r1;
    public int f27665s1;
    public TLRPC.Peer f27666t1;
    public TLRPC.Peer f27667u1;
    public TLRPC.InputPeer f27668v1;
    public boolean f27669w1;
    public boolean f27670x1;
    public i70 f27671y1;

    public static void I0(k70 k70Var) {
        g70 g70Var = k70Var.f27659m1;
        if (k70Var.f27665s1 != 0) {
            if (g70Var.getChildCount() <= 0) {
                int paddingTop = g70Var.getPaddingTop();
                k70Var.f27664r1 = paddingTop;
                g70Var.setTopGlowOffset(paddingTop);
                k70Var.f21586b.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = g70Var.getChildAt(0);
            ck0 ck0Var = (ck0) g70Var.G(childAt);
            int top = childAt.getTop() - org.telegram.messenger.i0.L(9.0f);
            if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
                i10 = top;
            }
            if (k70Var.f27664r1 != i10) {
                k70Var.f27660n1.setTranslationY(org.telegram.messenger.i0.L(19.0f) + top);
                k70Var.f27661o1.setTranslationY(org.telegram.messenger.i0.L(56.0f) + top);
                k70Var.f27664r1 = i10;
                g70Var.setTopGlowOffset(i10);
                k70Var.f21586b.invalidate();
            }
        }
    }

    public static void J0(Activity activity, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.zr zrVar) {
        int i10 = C1;
        int i11 = cVar.f14863a;
        if (i10 == i11 && B1 == j10 && f27655z1 != null && SystemClock.elapsedRealtime() - A1 < 240000) {
            boolean z10 = true;
            if (f27655z1.size() != 1) {
                z10 = false;
            }
            zrVar.i(z10);
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = org.telegram.messenger.vp.r1(i11).i1(j10);
        x1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i11).sendRequest(getgroupcalljoinas, new c70(x1Var, j10, cVar, zrVar)), 1));
        try {
            x1Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void K0(Context context, long j10, org.telegram.messenger.c cVar, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        if (context != null) {
            int i11 = C1;
            int i12 = cVar.f14863a;
            if (i11 == i12 && B1 == j10 && f27655z1 != null && SystemClock.elapsedRealtime() - A1 < 300000) {
                if (f27655z1.size() == 1 && i10 != 0) {
                    i70Var.a(org.telegram.messenger.vp.r1(i12).i1(org.telegram.messenger.jj.C1((TLRPC.Peer) f27655z1.get(0))), false, false, false);
                    return;
                } else {
                    L0(context, j10, f27655z1, k2Var, i10, peer, i70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = org.telegram.messenger.vp.r1(i12).i1(j10);
            x1Var.setOnCancelListener(new b70(cVar, ConnectionsManager.getInstance(i12).sendRequest(getgroupcalljoinas, new a70(x1Var, cVar, i70Var, j10, context, k2Var, i10, peer)), 0));
            try {
                x1Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void L0(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        int i11;
        f70 f70Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                yq yqVar = new yq(k2Var, arrayList, j10, i70Var);
                if (k2Var.getParentActivity() != null) {
                    k2Var.showDialog(yqVar);
                    return;
                } else {
                    yqVar.show();
                    return;
                }
            }
            return;
        }
        ?? z2Var = new org.telegram.ui.ActionBar.z2(context, false);
        z2Var.f21617v0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        z2Var.f27662p1 = arrayList2;
        z2Var.f27671y1 = i70Var;
        z2Var.f27665s1 = i10;
        Drawable f7 = i0.a.f(context, 2131232725);
        z2Var.f27656i1 = f7;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) z2Var.f27662p1.get(i15);
                    if (org.telegram.messenger.jj.C1(peer2) == selfId) {
                        z2Var.f27667u1 = peer2;
                        z2Var.f27666t1 = peer2;
                        break;
                    }
                    i15++;
                }
            } else if (peer != null) {
                long C12 = org.telegram.messenger.jj.C1(peer);
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) z2Var.f27662p1.get(i16);
                    if (org.telegram.messenger.jj.C1(peer3) == C12) {
                        z2Var.f27667u1 = peer3;
                        z2Var.f27666t1 = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                z2Var.f27666t1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = z2Var.f27656i1;
            i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
            f7.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            z2Var.f27657j1 = true;
            z2Var.f27658k1 = x02;
            z2Var.f27666t1 = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        z2Var.P(i11);
        if (z2Var.f27665s1 == 0) {
            ?? e70Var = new e70(z2Var, context);
            e70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(e70Var);
            z2Var.N = nestedScrollView;
            f70Var = e70Var;
        } else {
            f70 f70Var2 = new f70(z2Var, context);
            z2Var.f21586b = f70Var2;
            f70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = z2Var.f21586b;
            int i17 = z2Var.f21615t0;
            viewGroup.setPadding(i17, 0, i17, 0);
            f70Var = f70Var2;
        }
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(z2Var.f21583a).L0(Long.valueOf(-j10));
        g70 g70Var = new g70(z2Var, context);
        z2Var.f27659m1 = g70Var;
        z2Var.getContext();
        if (z2Var.f27665s1 == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        g70Var.setLayoutManager(new s4.a0(i12, false));
        g70Var.setAdapter(new j70(z2Var, context));
        g70Var.setVerticalScrollBarEnabled(false);
        g70Var.setClipToPadding(false);
        g70Var.setEnabled(true);
        g70Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.a7.m(g70Var, 21, org.telegram.ui.ActionBar.t6.A5, null);
        g70Var.setOnScrollListener(new h70(z2Var));
        g70Var.setOnItemClickListener(new mg.q0(10, z2Var, L0));
        if (i10 != 0) {
            f70Var.addView(g70Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            g70Var.setSelectorDrawableColor(0);
            g70Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624325, 120, 120, null);
            imageView.d();
            f70Var.addView(imageView, w7.b6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        z2Var.f27660n1 = textView;
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20901bh, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (org.telegram.messenger.w3.W(L0)) {
                textView.setText(org.telegram.messenger.cd.L0(2131744921, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131744918, null));
            }
            f70Var.addView(textView, w7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(org.telegram.messenger.cd.L0(2131743412, null));
            } else if (org.telegram.messenger.w3.W(L0)) {
                textView.setText(org.telegram.messenger.cd.L0(2131743502, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131743394, null));
            }
            f70Var.addView(textView, w7.b6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(z2Var.getContext());
        z2Var.f27661o1 = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f20921ch, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21185r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = z2Var.f27662p1.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long C13 = org.telegram.messenger.jj.C1((TLRPC.Peer) z2Var.f27662p1.get(i18));
            if (C13 < 0) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(z2Var.f21583a).L0(Long.valueOf(-C13));
                if (!org.telegram.messenger.w3.T(L02) || L02.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        z2Var.f27661o1.setMovementMethod(new org.telegram.messenger.e0(false));
        org.telegram.ui.ActionBar.a7.H(z2Var.f27661o1, org.telegram.ui.ActionBar.t6.f21057k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                sb2.append(org.telegram.messenger.cd.L0(2131743484, null));
            } else {
                sb2.append(org.telegram.messenger.cd.L0(2131743359, null));
            }
            if (z2Var.f27662p1.size() > 1) {
                sb2.append("\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743469, null));
            } else {
                z2Var.f27659m1.setVisibility(8);
            }
            z2Var.f27661o1.setText(sb2);
            z2Var.f27661o1.setGravity(49);
            f70Var.addView(z2Var.f27661o1, w7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                z2Var.f27661o1.setText(org.telegram.messenger.cd.L0(2131743357, null));
            } else {
                z2Var.f27661o1.setText(org.telegram.messenger.cd.L0(2131743358, null));
            }
            TextView textView3 = z2Var.f27661o1;
            if (org.telegram.messenger.cd.X) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            f70Var.addView(z2Var.f27661o1, w7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            g70 g70Var2 = z2Var.f27659m1;
            if (z2Var.f27662p1.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            f70Var.addView(g70Var2, w7.b6.t(i14, 95, 49, 0, 6, 0, 0));
        }
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(z2Var, context, false);
        z2Var.l1 = u0Var;
        ((View) u0Var.d).setOnClickListener(new sr(10, z2Var, i70Var));
        if (z2Var.f27665s1 == 0) {
            f70Var.addView(u0Var, w7.b6.t(-1, 50, 51, 0, 0, 0, 0));
            org.telegram.ui.Cells.u0 u0Var2 = new org.telegram.ui.Cells.u0(z2Var, context, true);
            if (org.telegram.messenger.w3.W(L0)) {
                u0Var2.a(org.telegram.messenger.cd.L0(2131743488, null), false);
            } else {
                u0Var2.a(org.telegram.messenger.cd.L0(2131743367, null), false);
            }
            ((View) u0Var2.d).setOnClickListener(new h0((Object) z2Var, 27));
            f70Var.addView(u0Var2, w7.b6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            f70Var.addView(u0Var, w7.b6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z2Var.M0(L0, false);
        if (k2Var != 0) {
            if (k2Var.getParentActivity() != null) {
                k2Var.showDialog(z2Var);
                return;
            }
            return;
        }
        z2Var.show();
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f27668v1;
        if (inputPeer != null) {
            i70 i70Var = this.f27671y1;
            boolean z10 = true;
            if (this.f27662p1.size() <= 1) {
                z10 = false;
            }
            i70Var.a(inputPeer, z10, this.f27669w1, false);
        }
    }

    public final void M0(TLRPC.Chat chat, boolean z10) {
        String str;
        org.telegram.ui.Cells.u0 u0Var = this.l1;
        if (this.f27665s1 == 0) {
            if (org.telegram.messenger.w3.W(chat)) {
                u0Var.a(org.telegram.messenger.cd.a0("VoipChannelStartVoiceChat", null, 2131743481, new Object[0]), z10);
                return;
            } else {
                u0Var.a(org.telegram.messenger.cd.a0("VoipGroupStartVoiceChat", null, 2131743350, new Object[0]), z10);
                return;
            }
        }
        long C12 = org.telegram.messenger.jj.C1(this.f27666t1);
        if (org.telegram.messenger.o5.E(C12)) {
            u0Var.a(org.telegram.messenger.cd.a0("VoipGroupContinueAs", null, 2131743417, org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(C12)), true)), z10);
            return;
        }
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-C12));
        if (L0 != null) {
            str = L0.title;
        } else {
            str = "";
        }
        u0Var.a(org.telegram.messenger.cd.a0("VoipGroupContinueAs", null, 2131743417, str), z10);
    }

    @Override
    public final void s0() {
        Drawable drawable;
        super.s0();
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
            if (this.f27657j1 && (drawable = this.f27656i1) != null && x02 != this.f27658k1) {
                this.f27658k1 = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.f21586b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
