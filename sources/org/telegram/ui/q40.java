package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class q40 extends AnimatorListenerAdapter {
    public final int f42738a;
    public final boolean f42739b;
    public final Object f42740c;

    public q40(int i10, Object obj, boolean z10) {
        this.f42738a = i10;
        this.f42740c = obj;
        this.f42739b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42738a) {
            case 1:
                ((x60) this.f42740c).h = null;
                return;
            case 4:
                rq0 rq0Var = (rq0) this.f42740c;
                if (animator.equals(rq0Var.f43253k0)) {
                    rq0Var.f43253k0 = null;
                    return;
                }
                return;
            case 10:
                ((d81) this.f42740c).f38765n = null;
                return;
            case 12:
                dg1 dg1Var = (dg1) this.f42740c;
                AnimatorSet animatorSet = dg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dg1Var.I = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kd kdVar;
        org.telegram.ui.Cells.d4 d4Var;
        int i10 = this.f42738a;
        float f7 = 1.0f;
        float f10 = 0.0f;
        boolean z10 = this.f42739b;
        Object obj = this.f42740c;
        switch (i10) {
            case 0:
                v50 v50Var = (v50) obj;
                v50Var.U2 = null;
                org.telegram.ui.ActionBar.b6 subtitleTextView = v50Var.O.getSubtitleTextView();
                if (!z10) {
                    f10 = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(f10);
                return;
            case 1:
                x60 x60Var = (x60) obj;
                if (x60Var.h != null && (kdVar = x60Var.f45665f) != null) {
                    if (z10) {
                        kdVar.setVisibility(4);
                    } else {
                        x60Var.f45666n.setVisibility(4);
                    }
                    x60Var.h = null;
                    return;
                }
                return;
            case 2:
                gg0 gg0Var = (gg0) obj;
                if (!z10) {
                    gg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = gg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gg0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                rq0 rq0Var = (rq0) obj;
                if (animator.equals(rq0Var.f43253k0)) {
                    if (!z10) {
                        rq0Var.Z.setVisibility(4);
                        rq0Var.f43240a0.setVisibility(4);
                    }
                    rq0Var.f43253k0 = null;
                    return;
                }
                return;
            case 5:
                xv0 xv0Var = (xv0) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                xv0Var.E = f7;
                return;
            case 6:
                m01 m01Var = (m01) obj;
                if (m01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = m01Var.f41426n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = m01Var.f41426n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = m01Var.f41426n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = m01Var.f41426n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    m01Var.setVisibility(8);
                }
                ProfileActivity profileActivity4 = m01Var.f41426n;
                int i11 = ProfileActivity.R6;
                profileActivity4.x5(false);
                return;
            case 7:
                s11 s11Var = (s11) obj;
                if (z10) {
                    s11Var.f43337c.setVisibility(8);
                    return;
                } else {
                    s11Var.f43338f.setVisibility(8);
                    return;
                }
            case 8:
                c41 c41Var = (c41) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                c41Var.v = f7;
                if (c41Var.S) {
                    c41Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                y51 y51Var = (y51) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y51Var.v;
                if (z10) {
                    f10 = 1.0f;
                }
                y51Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.f27585g.getInterpolation(y51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(y51Var.L, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setAlpha(cascade);
                }
                y51Var.N = null;
                return;
            case 10:
                d81 d81Var = (d81) obj;
                if (d81Var.f38765n != null && (d4Var = d81Var.f38766r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    d81Var.f38765n = null;
                    return;
                }
                return;
            case 11:
                id1 id1Var = (id1) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                id1Var.f40226y = f7;
                return;
            case 12:
                dg1 dg1Var = (dg1) obj;
                AnimatorSet animatorSet2 = dg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        dg1Var.e.setVisibility(4);
                        return;
                    } else {
                        dg1Var.f38864b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                bi.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (!z10) {
                    f7 = 0.0f;
                }
                u1Var.U = f7;
                tVar.setAlpha(f7);
                u1Var.invalidate();
                if (u1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    return;
                }
                tVar.clearFocus();
                AndroidUtilities.hideKeyboard(tVar);
                return;
            case 14:
                l0 l0Var = (l0) obj;
                bi.t tVar2 = l0Var.f45392b0;
                if (!l0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (!z10) {
                    f7 = 0.0f;
                }
                l0Var.f45390a0 = f7;
                tVar2.setAlpha(f7);
                l0Var.j(l0Var.f45390a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f45390a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f45390a0);
                l0Var.invalidate();
                return;
            case 15:
                sg.a2 a2Var = (sg.a2) obj;
                ((rg.n) a2Var).f47468y.f47594n.d();
                if (z10) {
                    a2Var.f48144w.accept(Integer.valueOf(a2Var.f48143s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f26228j0 = false;
                }
                Runnable runnable = limitPreviewView.f26229k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f26229k0.run();
                    return;
                }
                return;
            default:
                tg.p0 p0Var = (tg.p0) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                p0Var.O = f7;
                p0Var.f48978f.invalidate();
                tg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42738a) {
            case 2:
                if (this.f42739b) {
                    ((gg0) this.f42740c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f42739b) {
                    ((PasscodeActivity) this.f42740c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                m01 m01Var = (m01) this.f42740c;
                org.telegram.ui.ActionBar.w0 w0Var = m01Var.f41426n.U0;
                if (w0Var != null && !this.f42739b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = m01Var.f41426n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = m01Var.f41426n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = m01Var.f41426n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                m01Var.setVisibility(0);
                m01Var.f41426n.x5(false);
                return;
            case 7:
                s11 s11Var = (s11) this.f42740c;
                if (this.f42739b) {
                    s11Var.f43338f.setAlpha(0.0f);
                    s11Var.f43338f.setVisibility(0);
                    return;
                }
                s11Var.f43337c.setAlpha(0.0f);
                s11Var.f43337c.setVisibility(0);
                return;
        }
    }
}
