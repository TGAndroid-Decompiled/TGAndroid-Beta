package org.telegram.ui.Components;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class xb0 extends s4.s0 {
    public final int f32753a;
    public final Object f32754b;

    public xb0(Object obj, int i10) {
        this.f32753a = i10;
        this.f32754b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        int i11 = this.f32753a;
        rg.p1 p1Var = null;
        boolean z10 = false;
        Object obj = this.f32754b;
        switch (i11) {
            case 1:
                ch0 ch0Var = (ch0) obj;
                wg0 wg0Var = ch0Var.f25366b;
                if (i10 == 0 && ch0.G(ch0Var) + ((ch0Var.E - ch0.F(ch0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wg0Var.canScrollVertically(1)) {
                    wg0Var.getChildAt(0);
                    il0 il0Var2 = (il0) wg0Var.K(0);
                    if (il0Var2 != null) {
                        View view = il0Var2.f46523a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            wg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zl0 zl0Var = (zl0) obj;
                if (i10 == 0) {
                    if (zl0Var.f33557v2) {
                        zl0Var.f33557v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zl0Var.f33557v2 && zl0Var.f33560x1) {
                    zl0Var.f33557v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zl0Var.N1 != null) {
                    ql0 ql0Var = zl0Var.f33523e1;
                    if (ql0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ql0Var);
                        zl0Var.f33523e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zl0Var.M1.G(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    zl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = zl0Var.N1;
                    zl0Var.k1(view2, 0.0f, 0.0f, false);
                    zl0Var.N1 = null;
                    zl0Var.n1(null, view2);
                    zl0Var.P1 = false;
                }
                s4.s0 s0Var = zl0Var.f33516a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                zl0Var.K1 = z10;
                if (z10) {
                    zl0Var.L1 = true;
                    return;
                }
                return;
            case 4:
                on0 on0Var = (on0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(on0Var.F.getCurrentFocus());
                }
                on0Var.a();
                return;
            case 9:
                n71 n71Var = (n71) obj;
                ai.w0 w0Var = n71Var.d;
                if (i10 == 0 && n71Var.G && AndroidUtilities.dp(13.0f) + n71.m(n71Var) + n71Var.f28896y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (il0Var = (il0) w0Var.K(0)) != null) {
                    View view3 = il0Var.f46523a;
                    if (view3.getTop() > 0) {
                        w0Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                rg.t0 t0Var = (rg.t0) obj;
                if (i10 == 1) {
                    t0Var.f46261k3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.p1 p1Var2 = (rg.p1) t0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46234a > p1Var.f46234a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.y1(p1Var, true);
                        t0Var.f46261k3 = false;
                        t0Var.w0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.z1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var.f46262l3);
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.z0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        fl0 fl0Var;
        float f7;
        int i12;
        float f10;
        boolean z10;
        boolean z11;
        int dp;
        float f11;
        float y3;
        int measuredHeight;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f32753a) {
            case 0:
                cc0 cc0Var = (cc0) this.f32754b;
                org.telegram.ui.y8 y8Var = cc0Var.f25317b;
                ub0 ub0Var = cc0Var.f25322f;
                for (int i13 = 0; i13 < ub0Var.getChildCount(); i13++) {
                    View childAt = ub0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                tb0 tb0Var = cc0Var.f25321e;
                if (tb0Var != null) {
                    tb0Var.x();
                    return;
                }
                return;
            case 1:
                ch0 ch0Var = (ch0) this.f32754b;
                if (ch0Var.f25366b.getChildCount() > 0) {
                    ch0.t(ch0Var);
                    return;
                }
                return;
            case 2:
                sk0 sk0Var = (sk0) this.f32754b;
                ai.w0 w0Var = sk0Var.f30756b;
                int[] iArr = sk0Var.f30768f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    sk0.b(sk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    sk0.b(sk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < w0Var.getChildCount() - 1; i15++) {
                    sk0.b(sk0Var, w0Var.getChildAt(i15), 1.0f);
                }
                sk0Var.invalidate();
                return;
            case 3:
                zl0 zl0Var = (zl0) this.f32754b;
                Rect rect = zl0Var.G1;
                s4.s0 s0Var = zl0Var.f33516a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (zl0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = zl0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    zl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                zl0Var.M0(false);
                if (i11 != 0 && (fl0Var = zl0Var.f33525f1) != null) {
                    fl0Var.b();
                }
                jl0 jl0Var = zl0Var.U1;
                if (jl0Var != null) {
                    zl0Var.f1(jl0Var, 700, false);
                    return;
                }
                return;
            case 4:
            case 14:
            default:
                return;
            case 5:
                tv0.m((tv0) this.f32754b);
                return;
            case 6:
                aw0 aw0Var = (aw0) this.f32754b;
                if (recyclerView == aw0Var.M0) {
                    aw0Var.X0 += i11;
                }
                if (aw0Var.V0 == null && aw0Var.W0 == 0) {
                    aw0Var.u0();
                    return;
                }
                return;
            case 7:
                ((ax0) this.f32754b).X.V();
                return;
            case 8:
                qy0.M((qy0) this.f32754b);
                return;
            case 9:
                ((n71) this.f32754b).J();
                return;
            case 10:
                ((f91) this.f32754b).invalidate();
                return;
            case 11:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f32754b;
                if (!oVar.f32724a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.v)) {
                        oVar.f42287e.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.f42288f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.f32724a.K1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f32754b;
                if (h1Var.f32724a.K1) {
                    AndroidUtilities.hideKeyboard(h1Var.fragmentView);
                    return;
                }
                return;
            case 13:
                rg.t0 t0Var = (rg.t0) this.f32754b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.y1(null, true);
                }
                t0Var.invalidate();
                return;
            case 15:
                ((th.f) this.f32754b).P();
                return;
            case 16:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                wh.n nVar = (wh.n) this.f32754b;
                wh.e eVar = nVar.C;
                if (nVar.f49154x && !nVar.f49153w && c0Var != null) {
                    if (nVar.f49138f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                xh.i4 i4Var = (xh.i4) this.f32754b;
                int i16 = 0;
                while (true) {
                    if (i16 < i4Var.f50013n.getChildCount()) {
                        if (i4Var.f50013n.getChildAt(i16) instanceof w00) {
                            i4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = i4Var.h.animate();
                if (i4Var.K && i4Var.f50013n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.ok.s(animate.alpha(f7), tr.h, 320L);
                return;
            case 18:
                ((xh.h4) this.f32754b).Y();
                return;
            case 19:
                yh.g gVar = (yh.g) this.f32754b;
                if (gVar.f51297a == 1) {
                    if (gVar.f51304e.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < gVar.f51304e.getChildCount(); i17++) {
                            if (!(gVar.f51304e.getChildAt(i17) instanceof w00)) {
                            }
                        }
                        return;
                    }
                    yh.g.e0(gVar);
                    return;
                }
                return;
            case 20:
                yh.s0 s0Var2 = (yh.s0) this.f32754b;
                ah.i iVar2 = s0Var2.f51944s0;
                View view = s0Var2.f51942q0;
                FrameLayout frameLayout = s0Var2.f51938l0;
                zl0 zl0Var2 = s0Var2.d;
                int childCount = zl0Var2.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt4 = zl0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt4);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f10 = childAt4.getY();
                            } else if (R == 0) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        f10 = 0.0f;
                        z10 = false;
                    }
                }
                f10 = y3 - measuredHeight;
                z10 = true;
                float height = frameLayout.getHeight() + f10;
                if (z10 && height >= 0.0f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (s0Var2.f51949x0 != z11) {
                    s0Var2.f51949x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    animate2.alpha(f11).setDuration(200L).withEndAction(new es0(14, s0Var2, z11)).start();
                }
                if (f10 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                s0Var2.K = dp;
                if (!z10) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f10);
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 31 && iVar2 != null) {
                    iVar2.f(i10, i11);
                    if (i18 >= 31 && iVar2 != null) {
                        s0Var2.O(1);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((yh.x3) this.f32754b).Y.e();
                return;
            case 22:
                yh.x7 x7Var = (yh.x7) this.f32754b;
                le.b bVar = x7Var.V;
                if (!x7Var.f39883c.canScrollVertically(-1)) {
                    kVar = ((org.telegram.ui.ActionBar.n2) x7Var).actionBar;
                    if (!kVar.s()) {
                        z12 = false;
                        bVar.a(z12, true);
                        return;
                    }
                }
                z12 = true;
                bVar.a(z12, true);
                return;
            case 23:
                yh.u7 u7Var = (yh.u7) this.f32754b;
                c71 c71Var = u7Var.f52102a;
                if (c71Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < c71Var.getChildCount(); i19++) {
                        if (!(c71Var.getChildAt(i19) instanceof w00)) {
                        }
                    }
                    return;
                }
                u7Var.h.run();
                return;
            case 24:
                ((zg.t) this.f32754b).c(true);
                return;
        }
    }
}
