package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kv extends s4.r0 {
    public final int f27975a;
    public final Object f27976b;

    public kv(Object obj, int i10) {
        this.f27975a = i10;
        this.f27976b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        sl0 sl0Var;
        org.telegram.ui.Wallet.n8 n8Var;
        int i11 = this.f27975a;
        sg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f27976b;
        switch (i11) {
            case 3:
                hb0 hb0Var = (hb0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hb0Var.V2 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                hb0Var.W2 = z11;
                return;
            case 5:
                kh0 kh0Var = (kh0) obj;
                eh0 eh0Var = kh0Var.f27853b;
                if (i10 == 0 && kh0.J(kh0Var) + ((kh0Var.E - kh0.I(kh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && eh0Var.canScrollVertically(1)) {
                    eh0Var.getChildAt(0);
                    sl0 sl0Var2 = (sl0) eh0Var.K(0);
                    if (sl0Var2 != null) {
                        View view = sl0Var2.f45912a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            eh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                im0 im0Var = (im0) obj;
                if (i10 == 0) {
                    if (im0Var.f27311t2) {
                        im0Var.f27311t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!im0Var.f27311t2 && im0Var.f27314v1) {
                    im0Var.f27311t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && im0Var.L1 != null) {
                    am0 am0Var = im0Var.f27277c1;
                    if (am0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(am0Var);
                        im0Var.f27277c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        im0Var.K1.k(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    im0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = im0Var.L1;
                    im0Var.h1(view2, 0.0f, 0.0f, false);
                    im0Var.L1 = null;
                    im0Var.k1(null, view2);
                    im0Var.N1 = false;
                }
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                im0Var.I1 = z11;
                if (z11) {
                    im0Var.J1 = true;
                    return;
                }
                return;
            case 8:
                tn0 tn0Var = (tn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(tn0Var.F.getCurrentFocus());
                }
                tn0Var.a();
                return;
            case 12:
                k71 k71Var = (k71) obj;
                ai.u1 u1Var = k71Var.d;
                if (i10 == 0 && k71Var.G && AndroidUtilities.dp(13.0f) + k71.n(k71Var) + k71Var.f27740y < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (sl0Var = (sl0) u1Var.K(0)) != null) {
                    View view3 = sl0Var.f45912a;
                    if (view3.getTop() > 0) {
                        u1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.o5) obj).f34643h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
            case 19:
                sg.t0 t0Var = (sg.t0) obj;
                if (i10 == 1) {
                    t0Var.f46389b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.p1 p1Var2 = (sg.p1) t0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46368a > p1Var.f46368a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.f46389b3 = false;
                        t0Var.v0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var.f46390c3);
                return;
            case 20:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.y0) obj).Y.getEditText());
                    return;
                }
                return;
            case 25:
                zh.c cVar = (zh.c) obj;
                if (i10 == 1) {
                    z11 = true;
                }
                cVar.f51688c0 = z11;
                if (i10 != 0) {
                    cVar.f51684a0 = zh.c.b();
                }
                cVar.invalidate();
                return;
            case 26:
                if (i10 == 0) {
                    ((zh.j0) obj).v = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int N0;
        int i12;
        String str;
        TLRPC.User user;
        String str2;
        pl0 pl0Var;
        org.telegram.ui.Wallet.k5 k5Var;
        float f7;
        switch (this.f27975a) {
            case 0:
                aw awVar = (aw) this.f27976b;
                qv qvVar = awVar.f24714f;
                if (qvVar != null && awVar.h.I1 && qvVar.f29716w) {
                    qvVar.f29716w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 1:
                s00 s00Var = (s00) this.f27976b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 2:
                v00.G((v00) this.f27976b);
                return;
            case 3:
                hb0 hb0Var = (hb0) this.f27976b;
                s4.n0 layoutManager = hb0Var.getLayoutManager();
                ib0 ib0Var = hb0Var.Z2;
                bb0 bb0Var = ib0Var.d;
                if (layoutManager == bb0Var) {
                    N0 = bb0Var.N0();
                } else {
                    N0 = ib0Var.f27185c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    hg.j1 j1Var = ib0Var.f27186f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f11943u0 == 0 && (str = j1Var.f11941s0) != null && str.length() != 0 && (user = j1Var.f11946w0) != null && (str2 = j1Var.f11939r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f11941s0);
                    }
                }
                hb0Var.canScrollVertically(1);
                ib0Var.n(!hb0Var.canScrollVertically(-1));
                ib0Var.b();
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f27976b;
                org.telegram.ui.y8 y8Var = ic0Var.f27197b;
                bc0 bc0Var = ic0Var.f27201f;
                for (int i13 = 0; i13 < bc0Var.getChildCount(); i13++) {
                    View childAt = bc0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                ac0 ac0Var = ic0Var.e;
                if (ac0Var != null) {
                    ac0Var.w();
                    return;
                }
                return;
            case 5:
                kh0 kh0Var = (kh0) this.f27976b;
                if (kh0Var.f27853b.getChildCount() > 0) {
                    kh0.v(kh0Var);
                    return;
                }
                return;
            case 6:
                cl0 cl0Var = (cl0) this.f27976b;
                ai.u1 u1Var = cl0Var.f25236b;
                int[] iArr = cl0Var.f25247f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    cl0.b(cl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    cl0.b(cl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < u1Var.getChildCount() - 1; i15++) {
                    cl0.b(cl0Var, u1Var.getChildAt(i15), 1.0f);
                }
                cl0Var.invalidate();
                return;
            case 7:
                im0 im0Var = (im0) this.f27976b;
                Rect rect = im0Var.E1;
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (im0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = im0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    im0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                im0Var.L0(false);
                if (i11 != 0 && (pl0Var = im0Var.f27279d1) != null) {
                    pl0Var.b();
                }
                tl0 tl0Var = im0Var.S1;
                if (tl0Var != null) {
                    im0Var.e1(tl0Var, 700, false);
                    return;
                }
                return;
            case 8:
            case 20:
            default:
                return;
            case 9:
                xv0.n((xv0) this.f27976b);
                return;
            case 10:
                ((zw0) this.f27976b).X.V();
                return;
            case 11:
                py0.P((py0) this.f27976b);
                return;
            case 12:
                ((k71) this.f27976b).M();
                return;
            case 13:
                ((c91) this.f27976b).invalidate();
                return;
            case 14:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f27976b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (k5Var = o5Var.f34651p0) != null && k5Var.f34420f) {
                    k5Var.d = true;
                }
                o5Var.N0();
                return;
            case 15:
                int[] iArr2 = (int[]) this.f27976b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 16:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f27976b;
                if (r9Var.f32025a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f27976b;
                if (!pVar.f32025a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f42742s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f32025a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f27976b;
                if (f1Var.f32025a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 19:
                sg.t0 t0Var = (sg.t0) this.f27976b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                return;
            case 21:
                ((uh.f) this.f27976b).S();
                return;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.f27976b;
                xh.e eVar = kVar.C;
                if (kVar.f49877x && !kVar.f49876w && b0Var != null) {
                    if (kVar.f49861f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yh.g4 g4Var = (yh.g4) this.f27976b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f50277n.getChildCount()) {
                        if (g4Var.f50277n.getChildAt(i16) instanceof b10) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f50277n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.kk.t(animate.alpha(f7), bs.h, 320L);
                return;
            case 24:
                ((yh.f4) this.f27976b).a0();
                return;
            case 25:
                zh.c cVar = (zh.c) this.f27976b;
                if (i11 != 0) {
                    cVar.f51684a0 = zh.c.b();
                    cVar.invalidate();
                    return;
                }
                return;
            case 26:
                zh.j0 j0Var = (zh.j0) this.f27976b;
                if (!j0Var.v) {
                    j0Var.h.a(j0Var.f(j0Var.c()), true);
                    return;
                }
                return;
        }
    }
}
