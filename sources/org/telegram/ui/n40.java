package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class n40 extends AnimatorListenerAdapter {

    public final int f40659a;

    public final boolean f40660b;

    public final Object f40661c;

    public n40(int i10, Object obj, boolean z10) {
        this.f40659a = i10;
        this.f40661c = obj;
        this.f40660b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40659a) {
            case 1:
                ((u60) this.f40661c).h = null;
                break;
            case 4:
                aq0 aq0Var = (aq0) this.f40661c;
                if (animator.equals(aq0Var.f36607g0)) {
                    aq0Var.f36607g0 = null;
                }
                break;
            case 10:
                ((x71) this.f40661c).f44310r = null;
                break;
            case 12:
                zf1 zf1Var = (zf1) this.f40661c;
                AnimatorSet animatorSet = zf1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    zf1Var.E = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fd fdVar;
        org.telegram.ui.Cells.w3 w3Var;
        switch (this.f40659a) {
            case 0:
                s50 s50Var = (s50) this.f40661c;
                s50Var.Q2 = null;
                s50Var.K.getSubtitleTextView().setTranslationY(this.f40660b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                u60 u60Var = (u60) this.f40661c;
                if (u60Var.h != null && (fdVar = u60Var.f43137f) != null) {
                    if (this.f40660b) {
                        fdVar.setVisibility(4);
                    } else {
                        u60Var.f43138n.setVisibility(4);
                    }
                    u60Var.h = null;
                    break;
                }
                break;
            case 2:
                ig0 ig0Var = (ig0) this.f40661c;
                if (!this.f40660b) {
                    ig0Var.R.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.H = null;
                    break;
                }
                break;
            case 3:
                if (!this.f40660b) {
                    ((PasscodeActivity) this.f40661c).v.setVisibility(8);
                }
                break;
            case 4:
                aq0 aq0Var = (aq0) this.f40661c;
                if (animator.equals(aq0Var.f36607g0)) {
                    if (!this.f40660b) {
                        aq0Var.V.setVisibility(4);
                        aq0Var.W.setVisibility(4);
                    }
                    aq0Var.f36607g0 = null;
                }
                break;
            case 5:
                ((jv0) this.f40661c).A = this.f40660b ? 1.0f : 0.0f;
                break;
            case 6:
                yz0 yz0Var = (yz0) this.f40661c;
                if (yz0Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = yz0Var.f44979n.Q0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = yz0Var.f44979n;
                    if (profileActivity.J0) {
                        profileActivity.O0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = yz0Var.f44979n;
                    if (profileActivity2.H0) {
                        profileActivity2.M0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = yz0Var.f44979n;
                    if (profileActivity3.I0) {
                        profileActivity3.N0.setVisibility(8);
                    }
                } else {
                    yz0Var.setVisibility(8);
                }
                yz0Var.f44979n.l5(false);
                break;
            case 7:
                d11 d11Var = (d11) this.f40661c;
                if (this.f40660b) {
                    d11Var.f37234c.setVisibility(8);
                } else {
                    d11Var.f37236f.setVisibility(8);
                }
                break;
            case 8:
                c41 c41Var = (c41) this.f40661c;
                c41Var.v = this.f40660b ? 1.0f : 0.0f;
                if (c41Var.O) {
                    c41Var.J.invalidate();
                }
                break;
            case 9:
                w51 w51Var = (w51) this.f40661c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                float f10 = this.f40660b ? 1.0f : 0.0f;
                w51Var.H = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.f28123g.getInterpolation(w51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float fCascade = AndroidUtilities.cascade(w51Var.H, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setAlpha(fCascade);
                }
                w51Var.J = null;
                break;
            case 10:
                x71 x71Var = (x71) this.f40661c;
                if (x71Var.f44310r != null && (w3Var = x71Var.f44311s) != null) {
                    if (!this.f40660b) {
                        w3Var.setVisibility(4);
                    }
                    x71Var.f44310r = null;
                    break;
                }
                break;
            case 11:
                ((dd1) this.f40661c).f37374y = this.f40660b ? 1.0f : 0.0f;
                break;
            case 12:
                zf1 zf1Var = (zf1) this.f40661c;
                AnimatorSet animatorSet2 = zf1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f40660b) {
                        zf1Var.f45168e.setVisibility(4);
                    } else {
                        zf1Var.f45163b.setVisibility(4);
                    }
                    break;
                }
                break;
            case 13:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.f40661c;
                hh.o oVar = r1Var.R;
                if (!r1Var.P) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f11 = this.f40660b ? 1.0f : 0.0f;
                r1Var.Q = f11;
                oVar.setAlpha(f11);
                r1Var.invalidate();
                if (r1Var.P) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                }
                break;
            case 14:
                o0 o0Var = (o0) this.f40661c;
                hh.o oVar2 = o0Var.U;
                if (!o0Var.S) {
                    oVar2.setVisibility(8);
                }
                float f12 = this.f40660b ? 1.0f : 0.0f;
                o0Var.T = f12;
                oVar2.setAlpha(f12);
                o0Var.j(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                break;
            case 15:
                pf.x0 x0Var = (pf.x0) this.f40661c;
                boolean z10 = this.f40660b;
                x0Var.f45965e = z10 ? 1.0f : 0.0f;
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.f45964c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f45965e));
                    x0Var.f45964c[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    x0Var.f45964c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.f45965e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f45965e));
                    x0Var.d[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    x0Var.d[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.f45965e));
                    i11++;
                }
                break;
            case 16:
                if (this.f40660b) {
                    ((uf.n) this.f40661c).e(false, false, true, false);
                }
                break;
            default:
                zf.y1 y1Var = (zf.y1) this.f40661c;
                ((yf.n) y1Var).f49985y.f50116n.d();
                if (this.f40660b) {
                    y1Var.f50788w.accept(Integer.valueOf(y1Var.f50787s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40659a) {
            case 2:
                if (this.f40660b) {
                    ((ig0) this.f40661c).R.setVisibility(0);
                }
                break;
            case 3:
                if (this.f40660b) {
                    ((PasscodeActivity) this.f40661c).v.setVisibility(0);
                }
                break;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                yz0 yz0Var = (yz0) this.f40661c;
                org.telegram.ui.ActionBar.v0 v0Var = yz0Var.f44979n.Q0;
                if (v0Var != null && !this.f40660b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = yz0Var.f44979n;
                if (profileActivity.J0) {
                    profileActivity.O0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = yz0Var.f44979n;
                if (profileActivity2.H0) {
                    profileActivity2.M0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = yz0Var.f44979n;
                if (profileActivity3.I0) {
                    profileActivity3.N0.setVisibility(0);
                }
                yz0Var.setVisibility(0);
                yz0Var.f44979n.l5(false);
                break;
            case 7:
                d11 d11Var = (d11) this.f40661c;
                if (!this.f40660b) {
                    d11Var.f37234c.setAlpha(0.0f);
                    d11Var.f37234c.setVisibility(0);
                } else {
                    d11Var.f37236f.setAlpha(0.0f);
                    d11Var.f37236f.setVisibility(0);
                }
                break;
        }
    }
}
