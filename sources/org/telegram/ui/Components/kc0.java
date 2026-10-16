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
public final class kc0 extends s4.r0 {
    public final int f26349a;
    public final Object f26350b;

    public kc0(Object obj, int i10) {
        this.f26349a = i10;
        this.f26350b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        int i11 = this.f26349a;
        sg.p1 p1Var = null;
        boolean z10 = false;
        Object obj = this.f26350b;
        switch (i11) {
            case 1:
                qh0 qh0Var = (qh0) obj;
                kh0 kh0Var = qh0Var.f28286b;
                if (i10 == 0 && qh0.J(qh0Var) + ((qh0Var.E - qh0.I(qh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && kh0Var.canScrollVertically(1)) {
                    kh0Var.getChildAt(0);
                    wl0 wl0Var2 = (wl0) kh0Var.K(0);
                    if (wl0Var2 != null) {
                        View view = wl0Var2.f44838a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            kh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mm0 mm0Var = (mm0) obj;
                if (i10 == 0) {
                    if (mm0Var.f27160t2) {
                        mm0Var.f27160t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!mm0Var.f27160t2 && mm0Var.f27163v1) {
                    mm0Var.f27160t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && mm0Var.L1 != null) {
                    em0 em0Var = mm0Var.f27126c1;
                    if (em0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(em0Var);
                        mm0Var.f27126c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        mm0Var.K1.j1(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.h1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.k1(null, view2);
                    mm0Var.N1 = false;
                }
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                mm0Var.I1 = z10;
                if (z10) {
                    mm0Var.J1 = true;
                    return;
                }
                return;
            case 4:
                xn0 xn0Var = (xn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(xn0Var.F.getCurrentFocus());
                }
                xn0Var.a();
                return;
            case 8:
                r71 r71Var = (r71) obj;
                bi.o0 o0Var = r71Var.d;
                if (i10 == 0 && r71Var.G && AndroidUtilities.dp(13.0f) + r71.n(r71Var) + r71Var.f28466y < AndroidUtilities.statusBarHeight * 2 && o0Var.canScrollVertically(1) && (wl0Var = (wl0) o0Var.K(0)) != null) {
                    View view3 = wl0Var.f44838a;
                    if (view3.getTop() > 0) {
                        o0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                sg.t0 t0Var = (sg.t0) obj;
                if (i10 == 1) {
                    t0Var.f45320b3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.p1 p1Var2 = (sg.p1) t0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f45299a > p1Var.f45299a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.f45320b3 = false;
                        t0Var.v0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var.f45321c3);
                return;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.z0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        tl0 tl0Var;
        org.telegram.ui.Wallet.w4 w4Var;
        float f7;
        int i12;
        boolean z10;
        float f10;
        boolean z11;
        int dp;
        float f11;
        float y3;
        int measuredHeight;
        switch (this.f26349a) {
            case 0:
                pc0 pc0Var = (pc0) this.f26350b;
                org.telegram.ui.z8 z8Var = pc0Var.f27964b;
                hc0 hc0Var = pc0Var.f27968f;
                for (int i13 = 0; i13 < hc0Var.getChildCount(); i13++) {
                    View childAt = hc0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(z8Var.getMeasuredWidth(), z8Var.getBackgroundSizeY());
                    }
                }
                gc0 gc0Var = pc0Var.e;
                if (gc0Var != null) {
                    gc0Var.w();
                    return;
                }
                return;
            case 1:
                qh0 qh0Var = (qh0) this.f26350b;
                if (qh0Var.f28286b.getChildCount() > 0) {
                    qh0.v(qh0Var);
                    return;
                }
                return;
            case 2:
                gl0 gl0Var = (gl0) this.f26350b;
                bi.o0 o0Var = gl0Var.f25009b;
                int[] iArr = gl0Var.f25020f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    gl0.b(gl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    gl0.b(gl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < o0Var.getChildCount() - 1; i15++) {
                    gl0.b(gl0Var, o0Var.getChildAt(i15), 1.0f);
                }
                gl0Var.invalidate();
                return;
            case 3:
                mm0 mm0Var = (mm0) this.f26350b;
                Rect rect = mm0Var.E1;
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (mm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = mm0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    mm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                mm0Var.L0(false);
                if (i11 != 0 && (tl0Var = mm0Var.f27128d1) != null) {
                    tl0Var.b();
                }
                xl0 xl0Var = mm0Var.S1;
                if (xl0Var != null) {
                    mm0Var.e1(xl0Var, 700, false);
                    return;
                }
                return;
            case 4:
            case 16:
            default:
                return;
            case 5:
                bw0.n((bw0) this.f26350b);
                return;
            case 6:
                ((dx0) this.f26350b).X.V();
                return;
            case 7:
                uy0.P((uy0) this.f26350b);
                return;
            case 8:
                ((r71) this.f26350b).M();
                return;
            case 9:
                ((k91) this.f26350b).invalidate();
                return;
            case 10:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f26350b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (w4Var = a5Var.f32651o0) != null && w4Var.f33549f) {
                    w4Var.d = true;
                }
                a5Var.C0();
                return;
            case 11:
                int[] iArr2 = (int[]) this.f26350b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 12:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.f26350b;
                if (s8Var.f24003a.I1) {
                    AndroidUtilities.hideKeyboard(s8Var.M);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f26350b;
                if (!oVar.f24003a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.f41138s)) {
                        oVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.f24003a.I1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f26350b;
                if (h1Var.f24003a.I1) {
                    AndroidUtilities.hideKeyboard(h1Var.fragmentView);
                    return;
                }
                return;
            case 15:
                sg.t0 t0Var = (sg.t0) this.f26350b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                return;
            case 17:
                ((uh.f) this.f26350b).S();
                return;
            case 18:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.l lVar = (xh.l) this.f26350b;
                xh.e eVar = lVar.C;
                if (lVar.f48493x && !lVar.f48492w && b0Var != null) {
                    if (lVar.f48477f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                yh.g4 g4Var = (yh.g4) this.f26350b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f48881n.getChildCount()) {
                        if (g4Var.f48881n.getChildAt(i16) instanceof f10) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f48881n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.sk.t(animate.alpha(f7), es.h, 320L);
                return;
            case 20:
                ((yh.f4) this.f26350b).a0();
                return;
            case 21:
                zh.g gVar = (zh.g) this.f26350b;
                if (gVar.f50542a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < gVar.e.getChildCount(); i17++) {
                            if (!(gVar.e.getChildAt(i17) instanceof f10)) {
                            }
                        }
                        return;
                    }
                    zh.g.e0(gVar);
                    return;
                }
                return;
            case 22:
                zh.r0 r0Var2 = (zh.r0) this.f26350b;
                bh.f fVar = r0Var2.f51051s0;
                View view = r0Var2.f51049q0;
                FrameLayout frameLayout = r0Var2.f51045l0;
                mm0 mm0Var2 = r0Var2.d;
                int childCount = mm0Var2.getChildCount() - 1;
                while (true) {
                    i12 = 0;
                    if (childCount >= 0) {
                        View childAt4 = mm0Var2.getChildAt(childCount);
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
                        z10 = false;
                        f10 = 0.0f;
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
                if (r0Var2.f51056x0 != z11) {
                    r0Var2.f51056x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    ViewPropertyAnimator animate2 = view.animate();
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    animate2.alpha(f11).setDuration(200L).withEndAction(new zr0(18, r0Var2, z11)).start();
                }
                if (f10 <= 0.0f) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.0f);
                }
                r0Var2.K = dp;
                if (!z10) {
                    i12 = 8;
                }
                frameLayout.setVisibility(i12);
                frameLayout.setTranslationY(f10);
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 31 && fVar != null) {
                    fVar.f(i10, i11);
                    if (i18 >= 31 && fVar != null) {
                        r0Var2.R(1);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ((zh.r3) this.f26350b).Y.e();
                return;
            case 24:
                zh.m7 m7Var = (zh.m7) this.f26350b;
                i71 i71Var = m7Var.f50840a;
                if (i71Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < i71Var.getChildCount(); i19++) {
                        if (!(i71Var.getChildAt(i19) instanceof f10)) {
                        }
                    }
                    return;
                }
                m7Var.h.run();
                return;
        }
    }
}
