package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class p60 extends AnimatorListenerAdapter {
    public final int f41303a;
    public final boolean f41304b;
    public final Object f41305c;

    public p60(int i10, Object obj, boolean z10) {
        this.f41303a = i10;
        this.f41305c = obj;
        this.f41304b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41303a) {
            case 0:
                ((t60) this.f41305c).h = null;
                return;
            case 3:
                zp0 zp0Var = (zp0) this.f41305c;
                if (animator.equals(zp0Var.f45282g0)) {
                    zp0Var.f45282g0 = null;
                    return;
                }
                return;
            case 9:
                ((b81) this.f41305c).f36723r = null;
                return;
            case 11:
                cg1 cg1Var = (cg1) this.f41305c;
                AnimatorSet animatorSet = cg1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cg1Var.E = null;
                    return;
                }
                return;
            case 15:
                ((qh.n) this.f41305c).f46744w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ed edVar;
        float f9;
        float f10;
        float f11;
        org.telegram.ui.Cells.w3 w3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        RadialProgressView radialProgressView;
        float f16;
        boolean z10;
        int i10;
        float f17;
        float f18;
        boolean z11;
        float f19;
        float f20;
        switch (this.f41303a) {
            case 0:
                t60 t60Var = (t60) this.f41305c;
                if (t60Var.h != null && (edVar = t60Var.f42561f) != null) {
                    if (this.f41304b) {
                        edVar.setVisibility(4);
                    } else {
                        t60Var.f42562n.setVisibility(4);
                    }
                    t60Var.h = null;
                    return;
                }
                return;
            case 1:
                fg0 fg0Var = (fg0) this.f41305c;
                if (!this.f41304b) {
                    fg0Var.R.setVisibility(4);
                }
                AnimatorSet animatorSet = fg0Var.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg0Var.H = null;
                    return;
                }
                return;
            case 2:
                if (!this.f41304b) {
                    ((PasscodeActivity) this.f41305c).v.setVisibility(8);
                    return;
                }
                return;
            case 3:
                zp0 zp0Var = (zp0) this.f41305c;
                if (animator.equals(zp0Var.f45282g0)) {
                    if (!this.f41304b) {
                        zp0Var.V.setVisibility(4);
                        zp0Var.W.setVisibility(4);
                    }
                    zp0Var.f45282g0 = null;
                    return;
                }
                return;
            case 4:
                iv0 iv0Var = (iv0) this.f41305c;
                if (this.f41304b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                iv0Var.A = f9;
                return;
            case 5:
                yz0 yz0Var = (yz0) this.f41305c;
                if (yz0Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = yz0Var.f44997n.Q0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = yz0Var.f44997n;
                    if (profileActivity.J0) {
                        profileActivity.O0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = yz0Var.f44997n;
                    if (profileActivity2.H0) {
                        profileActivity2.M0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = yz0Var.f44997n;
                    if (profileActivity3.I0) {
                        profileActivity3.N0.setVisibility(8);
                    }
                } else {
                    yz0Var.setVisibility(8);
                }
                yz0Var.f44997n.l5(false);
                return;
            case 6:
                d11 d11Var = (d11) this.f41305c;
                if (this.f41304b) {
                    d11Var.f37271c.setVisibility(8);
                    return;
                } else {
                    d11Var.f37273f.setVisibility(8);
                    return;
                }
            case 7:
                f41 f41Var = (f41) this.f41305c;
                if (this.f41304b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f41Var.v = f10;
                if (f41Var.O) {
                    f41Var.J.invalidate();
                    return;
                }
                return;
            case 8:
                z51 z51Var = (z51) this.f41305c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z51Var.v;
                if (this.f41304b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                z51Var.H = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.jr.f29801g.getInterpolation(z51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i11 = 0; i11 < itemsCount; i11++) {
                    float cascade = AndroidUtilities.cascade(z51Var.H, i11, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11).setAlpha(cascade);
                }
                z51Var.J = null;
                return;
            case 9:
                b81 b81Var = (b81) this.f41305c;
                if (b81Var.f36723r != null && (w3Var = b81Var.f36724s) != null) {
                    if (!this.f41304b) {
                        w3Var.setVisibility(4);
                    }
                    b81Var.f36723r = null;
                    return;
                }
                return;
            case 10:
                fd1 fd1Var = (fd1) this.f41305c;
                if (this.f41304b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                fd1Var.f38119y = f12;
                return;
            case 11:
                cg1 cg1Var = (cg1) this.f41305c;
                AnimatorSet animatorSet2 = cg1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.f41304b) {
                        cg1Var.f37111e.setVisibility(4);
                        return;
                    } else {
                        cg1Var.f37106b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.f41305c;
                jh.m mVar = r1Var.R;
                if (!r1Var.P) {
                    mVar.setVisibility(8);
                    mVar.setText("");
                }
                if (this.f41304b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                r1Var.Q = f13;
                mVar.setAlpha(f13);
                r1Var.invalidate();
                if (r1Var.P) {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    return;
                }
                mVar.clearFocus();
                AndroidUtilities.hideKeyboard(mVar);
                return;
            case 13:
                o0 o0Var = (o0) this.f41305c;
                jh.m mVar2 = o0Var.U;
                if (!o0Var.S) {
                    mVar2.setVisibility(8);
                }
                if (this.f41304b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                o0Var.T = f14;
                mVar2.setAlpha(f14);
                o0Var.j(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                return;
            case 14:
                ph.p2 p2Var = (ph.p2) this.f41305c;
                if (this.f41304b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                p2Var.J0 = f15;
                p2Var.h();
                return;
            case 15:
                qh.n nVar = (qh.n) this.f41305c;
                if (nVar.f46744w != null && (radialProgressView = nVar.f46745x) != null) {
                    if (!this.f41304b) {
                        radialProgressView.setVisibility(4);
                        nVar.f46743s.setVisibility(4);
                    }
                    nVar.f46744w = null;
                    return;
                }
                return;
            case 16:
                rf.y0 y0Var = (rf.y0) this.f41305c;
                boolean z12 = this.f41304b;
                if (z12) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                y0Var.f47406e = f16;
                y0Var.invalidate();
                for (int i12 = 0; i12 < 2; i12++) {
                    y0Var.f47405c[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.f47406e));
                    TextView textView = y0Var.f47405c[i12];
                    if (i12 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = 8;
                    if (z10 == z12) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    TextView textView2 = y0Var.f47405c[i12];
                    if (i12 == 0) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i12 == 1) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f17, f18, y0Var.f47406e));
                    y0Var.d[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.f47406e));
                    TextView textView3 = y0Var.d[i12];
                    if (i12 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z12) {
                        i13 = 0;
                    }
                    textView3.setVisibility(i13);
                    TextView textView4 = y0Var.d[i12];
                    if (i12 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i12 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f19, f20, y0Var.f47406e));
                }
                return;
            default:
                if (this.f41304b) {
                    ((wf.n) this.f41305c).e(false, false, true, false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41303a) {
            case 1:
                if (this.f41304b) {
                    ((fg0) this.f41305c).R.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f41304b) {
                    ((PasscodeActivity) this.f41305c).v.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                yz0 yz0Var = (yz0) this.f41305c;
                org.telegram.ui.ActionBar.w0 w0Var = yz0Var.f44997n.Q0;
                if (w0Var != null && !this.f41304b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = yz0Var.f44997n;
                if (profileActivity.J0) {
                    profileActivity.O0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = yz0Var.f44997n;
                if (profileActivity2.H0) {
                    profileActivity2.M0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = yz0Var.f44997n;
                if (profileActivity3.I0) {
                    profileActivity3.N0.setVisibility(0);
                }
                yz0Var.setVisibility(0);
                yz0Var.f44997n.l5(false);
                return;
            case 6:
                d11 d11Var = (d11) this.f41305c;
                if (this.f41304b) {
                    d11Var.f37273f.setAlpha(0.0f);
                    d11Var.f37273f.setVisibility(0);
                    return;
                }
                d11Var.f37271c.setAlpha(0.0f);
                d11Var.f37271c.setVisibility(0);
                return;
        }
    }
}
