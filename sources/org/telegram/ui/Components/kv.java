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
    public final int f27952a;
    public final Object f27953b;

    public kv(Object obj, int i10) {
        this.f27952a = i10;
        this.f27953b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        tl0 tl0Var;
        org.telegram.ui.Wallet.n8 n8Var;
        int i11 = this.f27952a;
        sg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f27953b;
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
                lh0 lh0Var = (lh0) obj;
                fh0 fh0Var = lh0Var.f28163b;
                if (i10 == 0 && lh0.J(lh0Var) + ((lh0Var.E - lh0.I(lh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && fh0Var.canScrollVertically(1)) {
                    fh0Var.getChildAt(0);
                    tl0 tl0Var2 = (tl0) fh0Var.K(0);
                    if (tl0Var2 != null) {
                        View view = tl0Var2.f45917a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            fh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                jm0 jm0Var = (jm0) obj;
                if (i10 == 0) {
                    if (jm0Var.f27591t2) {
                        jm0Var.f27591t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!jm0Var.f27591t2 && jm0Var.f27594v1) {
                    jm0Var.f27591t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && jm0Var.L1 != null) {
                    bm0 bm0Var = jm0Var.f27557c1;
                    if (bm0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(bm0Var);
                        jm0Var.f27557c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        jm0Var.K1.k(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    jm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = jm0Var.L1;
                    jm0Var.h1(view2, 0.0f, 0.0f, false);
                    jm0Var.L1 = null;
                    jm0Var.k1(null, view2);
                    jm0Var.N1 = false;
                }
                s4.r0 r0Var = jm0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                jm0Var.I1 = z11;
                if (z11) {
                    jm0Var.J1 = true;
                    return;
                }
                return;
            case 8:
                un0 un0Var = (un0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(un0Var.F.getCurrentFocus());
                }
                un0Var.a();
                return;
            case 12:
                l71 l71Var = (l71) obj;
                ai.u1 u1Var = l71Var.d;
                if (i10 == 0 && l71Var.G && AndroidUtilities.dp(13.0f) + l71.n(l71Var) + l71Var.f28096y < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (tl0Var = (tl0) u1Var.K(0)) != null) {
                    View view3 = tl0Var.f45917a;
                    if (view3.getTop() > 0) {
                        u1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.o5) obj).f34650h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
            case 19:
                sg.t0 t0Var = (sg.t0) obj;
                if (i10 == 1) {
                    t0Var.f46394b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.p1 p1Var2 = (sg.p1) t0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46373a > p1Var.f46373a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.f46394b3 = false;
                        t0Var.v0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var.f46395c3);
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
                cVar.f51693c0 = z11;
                if (i10 != 0) {
                    cVar.f51689a0 = zh.c.b();
                }
                cVar.invalidate();
                return;
            case 26:
                if (i10 == 0) {
                    ((zh.k0) obj).v = false;
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
        ql0 ql0Var;
        org.telegram.ui.Wallet.k5 k5Var;
        float f7;
        switch (this.f27952a) {
            case 0:
                aw awVar = (aw) this.f27953b;
                qv qvVar = awVar.f24727f;
                if (qvVar != null && awVar.h.I1 && qvVar.f29732w) {
                    qvVar.f29732w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 1:
                s00 s00Var = (s00) this.f27953b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 2:
                v00.G((v00) this.f27953b);
                return;
            case 3:
                hb0 hb0Var = (hb0) this.f27953b;
                s4.n0 layoutManager = hb0Var.getLayoutManager();
                ib0 ib0Var = hb0Var.Z2;
                bb0 bb0Var = ib0Var.d;
                if (layoutManager == bb0Var) {
                    N0 = bb0Var.N0();
                } else {
                    N0 = ib0Var.f27222c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    hg.j1 j1Var = ib0Var.f27223f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f11943u0 == 0 && (str = j1Var.f11941s0) != null && str.length() != 0 && (user = j1Var.f11946w0) != null && (str2 = j1Var.f11939r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f11941s0);
                    }
                }
                hb0Var.canScrollVertically(1);
                ib0Var.n(!hb0Var.canScrollVertically(-1));
                ib0Var.b();
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f27953b;
                org.telegram.ui.y8 y8Var = ic0Var.f27234b;
                bc0 bc0Var = ic0Var.f27238f;
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
                lh0 lh0Var = (lh0) this.f27953b;
                if (lh0Var.f28163b.getChildCount() > 0) {
                    lh0.v(lh0Var);
                    return;
                }
                return;
            case 6:
                dl0 dl0Var = (dl0) this.f27953b;
                ai.u1 u1Var = dl0Var.f25525b;
                int[] iArr = dl0Var.f25536f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    dl0.b(dl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    dl0.b(dl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < u1Var.getChildCount() - 1; i15++) {
                    dl0.b(dl0Var, u1Var.getChildAt(i15), 1.0f);
                }
                dl0Var.invalidate();
                return;
            case 7:
                jm0 jm0Var = (jm0) this.f27953b;
                Rect rect = jm0Var.E1;
                s4.r0 r0Var = jm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (jm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = jm0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    jm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                jm0Var.L0(false);
                if (i11 != 0 && (ql0Var = jm0Var.f27559d1) != null) {
                    ql0Var.b();
                }
                ul0 ul0Var = jm0Var.S1;
                if (ul0Var != null) {
                    jm0Var.e1(ul0Var, 700, false);
                    return;
                }
                return;
            case 8:
            case 20:
            default:
                return;
            case 9:
                yv0.n((yv0) this.f27953b);
                return;
            case 10:
                ((ax0) this.f27953b).X.V();
                return;
            case 11:
                qy0.P((qy0) this.f27953b);
                return;
            case 12:
                ((l71) this.f27953b).M();
                return;
            case 13:
                ((d91) this.f27953b).invalidate();
                return;
            case 14:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f27953b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (k5Var = o5Var.f34658p0) != null && k5Var.f34427f) {
                    k5Var.d = true;
                }
                o5Var.N0();
                return;
            case 15:
                int[] iArr2 = (int[]) this.f27953b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 16:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f27953b;
                if (r9Var.f32356a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f27953b;
                if (!pVar.f32356a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f42748s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f32356a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f27953b;
                if (f1Var.f32356a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 19:
                sg.t0 t0Var = (sg.t0) this.f27953b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                return;
            case 21:
                ((uh.f) this.f27953b).S();
                return;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.f27953b;
                xh.e eVar = kVar.C;
                if (kVar.f49882x && !kVar.f49881w && b0Var != null) {
                    if (kVar.f49866f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yh.g4 g4Var = (yh.g4) this.f27953b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f50282n.getChildCount()) {
                        if (g4Var.f50282n.getChildAt(i16) instanceof b10) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f50282n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.mk.t(animate.alpha(f7), bs.h, 320L);
                return;
            case 24:
                ((yh.f4) this.f27953b).a0();
                return;
            case 25:
                zh.c cVar = (zh.c) this.f27953b;
                if (i11 != 0) {
                    cVar.f51689a0 = zh.c.b();
                    cVar.invalidate();
                    return;
                }
                return;
            case 26:
                zh.k0 k0Var = (zh.k0) this.f27953b;
                if (!k0Var.v) {
                    k0Var.h.a(k0Var.f(k0Var.c()), true);
                    return;
                }
                return;
        }
    }
}
