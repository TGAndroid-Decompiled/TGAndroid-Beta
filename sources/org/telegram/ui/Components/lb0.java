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
public final class lb0 extends s4.s0 {
    public final int f28130a;
    public final Object f28131b;

    public lb0(Object obj, int i10) {
        this.f28130a = i10;
        this.f28131b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        int i11 = this.f28130a;
        sg.r1 r1Var = null;
        boolean z10 = false;
        Object obj = this.f28131b;
        switch (i11) {
            case 1:
                pg0 pg0Var = (pg0) obj;
                jg0 jg0Var = pg0Var.f29370b;
                if (i10 == 0 && pg0.I(pg0Var) + ((pg0Var.E - pg0.H(pg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && jg0Var.canScrollVertically(1)) {
                    jg0Var.getChildAt(0);
                    vk0 vk0Var2 = (vk0) jg0Var.K(0);
                    if (vk0Var2 != null) {
                        View view = vk0Var2.f45738a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            jg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ll0 ll0Var = (ll0) obj;
                if (i10 == 0) {
                    if (ll0Var.f28236v2) {
                        ll0Var.f28236v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!ll0Var.f28236v2 && ll0Var.f28239x1) {
                    ll0Var.f28236v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && ll0Var.N1 != null) {
                    dl0 dl0Var = ll0Var.f28202e1;
                    if (dl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dl0Var);
                        ll0Var.f28202e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ll0Var.M1.h(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    ll0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = ll0Var.N1;
                    ll0Var.g1(view2, 0.0f, 0.0f, false);
                    ll0Var.N1 = null;
                    ll0Var.j1(null, view2);
                    ll0Var.P1 = false;
                }
                s4.s0 s0Var = ll0Var.f28195a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                ll0Var.K1 = z10;
                if (z10) {
                    ll0Var.L1 = true;
                    return;
                }
                return;
            case 4:
                vm0 vm0Var = (vm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(vm0Var.F.getCurrentFocus());
                }
                vm0Var.a();
                return;
            case 8:
                o61 o61Var = (o61) obj;
                bi.o0 o0Var = o61Var.d;
                if (i10 == 0 && o61Var.G && AndroidUtilities.dp(13.0f) + o61.m(o61Var) + o61Var.f28984y < AndroidUtilities.statusBarHeight * 2 && o0Var.canScrollVertically(1) && (vk0Var = (vk0) o0Var.K(0)) != null) {
                    View view3 = vk0Var.f45738a;
                    if (view3.getTop() > 0) {
                        o0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                sg.u0 u0Var = (sg.u0) obj;
                if (i10 == 1) {
                    u0Var.f46270d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.r1 r1Var2 = (sg.r1) u0Var.getChildAt(i12);
                        if (r1Var == null || r1Var2.f46246a > r1Var.f46246a) {
                            r1Var = r1Var2;
                        }
                    }
                    if (r1Var != null) {
                        u0Var.v1(r1Var, true);
                        u0Var.f46270d3 = false;
                        u0Var.v0(0, r1Var.getTop() - ((u0Var.getMeasuredHeight() - r1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    u0Var.w1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(u0Var.f46271e3);
                return;
            case 13:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.a1) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        sk0 sk0Var;
        float f7;
        int i12;
        float f10;
        boolean z10;
        boolean z11;
        int dp;
        float f11;
        float y3;
        int measuredHeight;
        switch (this.f28130a) {
            case 0:
                qb0 qb0Var = (qb0) this.f28131b;
                org.telegram.ui.w8 w8Var = qb0Var.f29659b;
                ib0 ib0Var = qb0Var.f29664f;
                for (int i13 = 0; i13 < ib0Var.getChildCount(); i13++) {
                    View childAt = ib0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                hb0 hb0Var = qb0Var.f29663e;
                if (hb0Var != null) {
                    hb0Var.x();
                    return;
                }
                return;
            case 1:
                pg0 pg0Var = (pg0) this.f28131b;
                if (pg0Var.f29370b.getChildCount() > 0) {
                    pg0.t(pg0Var);
                    return;
                }
                return;
            case 2:
                fk0 fk0Var = (fk0) this.f28131b;
                bi.o0 o0Var = fk0Var.f26080b;
                int[] iArr = fk0Var.f26092f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fk0.b(fk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fk0.b(fk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < o0Var.getChildCount() - 1; i15++) {
                    fk0.b(fk0Var, o0Var.getChildAt(i15), 1.0f);
                }
                fk0Var.invalidate();
                return;
            case 3:
                ll0 ll0Var = (ll0) this.f28131b;
                Rect rect = ll0Var.G1;
                s4.s0 s0Var = ll0Var.f28195a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (ll0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = ll0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    ll0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ll0Var.K0(false);
                if (i11 != 0 && (sk0Var = ll0Var.f28204f1) != null) {
                    sk0Var.b();
                }
                wk0 wk0Var = ll0Var.U1;
                if (wk0Var != null) {
                    ll0Var.d1(wk0Var, 700, false);
                    return;
                }
                return;
            case 4:
            case 13:
            default:
                return;
            case 5:
                bv0.m((bv0) this.f28131b);
                return;
            case 6:
                ((dw0) this.f28131b).X.V();
                return;
            case 7:
                ux0.O((ux0) this.f28131b);
                return;
            case 8:
                ((o61) this.f28131b).L();
                return;
            case 9:
                ((h81) this.f28131b).invalidate();
                return;
            case 10:
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.f28131b;
                if (!qVar.f32849a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(qVar.f42215s)) {
                        qVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = qVar.f42211e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (qVar.f32849a.K1) {
                    AndroidUtilities.hideKeyboard(qVar.fragmentView);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.f28131b;
                if (i1Var.f32849a.K1) {
                    AndroidUtilities.hideKeyboard(i1Var.fragmentView);
                    return;
                }
                return;
            case 12:
                sg.u0 u0Var = (sg.u0) this.f28131b;
                if (recyclerView.getScrollState() == 1) {
                    u0Var.v1(null, true);
                }
                u0Var.invalidate();
                return;
            case 14:
                ((uh.f) this.f28131b).R();
                return;
            case 15:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                xh.n nVar = (xh.n) this.f28131b;
                xh.e eVar = nVar.C;
                if (nVar.f49462x && !nVar.f49461w && c0Var != null) {
                    if (nVar.f49446f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yh.g4 g4Var = (yh.g4) this.f28131b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f50297n.getChildCount()) {
                        if (g4Var.f50297n.getChildAt(i16) instanceof t00) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f50297n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.vl.q(animate.alpha(f7), pr.h, 320L);
                return;
            case 17:
                ((yh.f4) this.f28131b).Z();
                return;
            case 18:
                zh.g gVar = (zh.g) this.f28131b;
                if (gVar.f51901a == 1) {
                    if (gVar.f51908e.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < gVar.f51908e.getChildCount(); i17++) {
                            if (!(gVar.f51908e.getChildAt(i17) instanceof t00)) {
                            }
                        }
                        return;
                    }
                    zh.g.e0(gVar);
                    return;
                }
                return;
            case 19:
                zh.s0 s0Var2 = (zh.s0) this.f28131b;
                bh.f fVar = s0Var2.f52547s0;
                View view = s0Var2.f52545q0;
                FrameLayout frameLayout = s0Var2.f52541l0;
                ll0 ll0Var2 = s0Var2.d;
                int childCount = ll0Var2.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt4 = ll0Var2.getChildAt(childCount);
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
                if (s0Var2.f52552x0 != z11) {
                    s0Var2.f52552x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    animate2.alpha(f11).setDuration(200L).withEndAction(new mr0(14, s0Var2, z11)).start();
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
                if (i18 >= 31 && fVar != null) {
                    fVar.f(i10, i11);
                    if (i18 >= 31 && fVar != null) {
                        s0Var2.Q(1);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((zh.w3) this.f28131b).Y.e();
                return;
            case 21:
                zh.s7 s7Var = (zh.s7) this.f28131b;
                d61 d61Var = s7Var.f52591a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < d61Var.getChildCount(); i19++) {
                        if (!(d61Var.getChildAt(i19) instanceof t00)) {
                        }
                    }
                    return;
                }
                s7Var.h.run();
                return;
        }
    }
}
