package org.telegram.ui.Components;

import android.animation.ValueAnimator;
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
public final class al0 extends s4.s0 {
    public final int f21533a;
    public final Object f21534b;

    public al0(Object obj, int i10) {
        this.f21533a = i10;
        this.f21534b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        fl0 fl0Var;
        int i11 = this.f21533a;
        qg.p1 p1Var = null;
        boolean z10 = false;
        Object obj = this.f21534b;
        switch (i11) {
            case 0:
                vl0 vl0Var = (vl0) obj;
                if (i10 == 0) {
                    if (vl0Var.f27999v2) {
                        vl0Var.f27999v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!vl0Var.f27999v2 && vl0Var.f28002x1) {
                    vl0Var.f27999v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && vl0Var.N1 != null) {
                    nl0 nl0Var = vl0Var.f27965e1;
                    if (nl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(nl0Var);
                        vl0Var.f27965e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        vl0Var.M1.B(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    vl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view = vl0Var.N1;
                    vl0Var.g1(view, 0.0f, 0.0f, false);
                    vl0Var.N1 = null;
                    vl0Var.j1(null, view);
                    vl0Var.P1 = false;
                }
                s4.s0 s0Var = vl0Var.f27958a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                vl0Var.K1 = z10;
                if (z10) {
                    vl0Var.L1 = true;
                    return;
                }
                return;
            case 1:
                fn0 fn0Var = (fn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(fn0Var.F.getCurrentFocus());
                }
                fn0Var.a();
                return;
            case 5:
                b71 b71Var = (b71) obj;
                bi.y1 y1Var = b71Var.d;
                if (i10 == 0 && b71Var.G && AndroidUtilities.dp(13.0f) + b71.m(b71Var) + b71Var.f21752y < AndroidUtilities.statusBarHeight * 2 && y1Var.canScrollVertically(1) && (fl0Var = (fl0) y1Var.K(0)) != null) {
                    View view2 = fl0Var.f41610a;
                    if (view2.getTop() > 0) {
                        y1Var.v0(0, view2.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qg.v0 v0Var = (qg.v0) obj;
                if (i10 == 1) {
                    v0Var.f40871d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        qg.p1 p1Var2 = (qg.p1) v0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f40856a > p1Var.f40856a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        v0Var.v1(p1Var, true);
                        v0Var.f40871d3 = false;
                        v0Var.v0(0, p1Var.getTop() - ((v0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    v0Var.w1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(v0Var.f40872e3);
                return;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sg.c1) obj).Y.getEditText());
                    return;
                }
                return;
            case 21:
                zh.z3 z3Var = (zh.z3) obj;
                if (i10 == 0) {
                    z3Var.V = true;
                    z3Var.invalidate();
                }
                if (i10 == 1) {
                    z3Var.V = false;
                    a5.a aVar = z3Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f276c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f276c).cancel();
                        aVar.f276c = null;
                    }
                    AndroidUtilities.hideKeyboard(z3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        cl0 cl0Var;
        float f7;
        int i12;
        float f10;
        boolean z10;
        boolean z11;
        int dp;
        float f11;
        float y3;
        int measuredHeight;
        switch (this.f21533a) {
            case 0:
                vl0 vl0Var = (vl0) this.f21534b;
                Rect rect = vl0Var.G1;
                s4.s0 s0Var = vl0Var.f27958a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (vl0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = vl0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    vl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                vl0Var.K0(false);
                if (i11 != 0 && (cl0Var = vl0Var.f27967f1) != null) {
                    cl0Var.b();
                }
                gl0 gl0Var = vl0Var.U1;
                if (gl0Var != null) {
                    vl0Var.d1(gl0Var, 700, false);
                    return;
                }
                return;
            case 1:
            case 10:
            default:
                return;
            case 2:
                mv0.m((mv0) this.f21534b);
                return;
            case 3:
                ((pw0) this.f21534b).X.V();
                return;
            case 4:
                hy0.O((hy0) this.f21534b);
                return;
            case 5:
                ((b71) this.f21534b).L();
                return;
            case 6:
                ((u81) this.f21534b).invalidate();
                return;
            case 7:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f21534b;
                if (!pVar.f25171a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f38043s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f25171a.K1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f21534b;
                if (h1Var.f25171a.K1) {
                    AndroidUtilities.hideKeyboard(h1Var.fragmentView);
                    return;
                }
                return;
            case 9:
                qg.v0 v0Var = (qg.v0) this.f21534b;
                if (recyclerView.getScrollState() == 1) {
                    v0Var.v1(null, true);
                }
                v0Var.invalidate();
                return;
            case 11:
                ((sh.f) this.f21534b).R();
                return;
            case 12:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                vh.p pVar2 = (vh.p) this.f21534b;
                vh.f fVar = pVar2.C;
                if (pVar2.f43417x && !pVar2.f43416w && c0Var != null) {
                    if (pVar2.f43401f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(fVar);
                        AndroidUtilities.runOnUIThread(fVar);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                wh.h4 h4Var = (wh.h4) this.f21534b;
                int i13 = 0;
                while (true) {
                    if (i13 < h4Var.f44140n.getChildCount()) {
                        if (h4Var.f44140n.getChildAt(i13) instanceof a10) {
                            h4Var.d.g(false);
                        } else {
                            i13++;
                        }
                    }
                }
                ViewPropertyAnimator animate = h4Var.h.animate();
                if (h4Var.K && h4Var.f44140n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.em.q(animate.alpha(f7), wr.h, 320L);
                return;
            case 14:
                ((wh.g4) this.f21534b).Z();
                return;
            case 15:
                xh.h hVar = (xh.h) this.f21534b;
                if (hVar.f45476a == 1) {
                    if (hVar.e.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < hVar.e.getChildCount(); i14++) {
                            if (!(hVar.e.getChildAt(i14) instanceof a10)) {
                            }
                        }
                        return;
                    }
                    xh.h.e0(hVar);
                    return;
                }
                return;
            case 16:
                xh.s0 s0Var2 = (xh.s0) this.f21534b;
                zg.e eVar = s0Var2.f46017s0;
                View view = s0Var2.f46015q0;
                FrameLayout frameLayout = s0Var2.f46011l0;
                vl0 vl0Var2 = s0Var2.d;
                int childCount = vl0Var2.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt = vl0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f10 = childAt.getY();
                            } else if (R == 0) {
                                y3 = childAt.getY();
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
                if (s0Var2.f46022x0 != z11) {
                    s0Var2.f46022x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    animate2.alpha(f11).setDuration(200L).withEndAction(new bs0(13, s0Var2, z11)).start();
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
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i15 >= 31 && eVar != null) {
                        s0Var2.Q(1);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((xh.x3) this.f21534b).Y.e();
                return;
            case 18:
                xh.w7 w7Var = (xh.w7) this.f21534b;
                r61 r61Var = w7Var.f46234a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < r61Var.getChildCount(); i16++) {
                        if (!(r61Var.getChildAt(i16) instanceof a10)) {
                        }
                    }
                    return;
                }
                w7Var.h.run();
                return;
            case 19:
                ((yg.v) this.f21534b).c(true);
                return;
            case 20:
                org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this.f21534b;
                nxVar.invalidate();
                nxVar.c();
                bi.x4 x4Var = nxVar.J;
                if (x4Var != null) {
                    x4Var.e(true);
                    return;
                }
                return;
            case 21:
                zh.z3 z3Var = (zh.z3) this.f21534b;
                z3Var.c();
                z3Var.invalidate();
                return;
        }
    }
}
