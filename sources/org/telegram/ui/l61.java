package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class l61 extends AnimatorListenerAdapter {
    public final int f35966a;
    public final boolean f35967b;
    public final Object f35968c;

    public l61(int i10, Object obj, boolean z4) {
        this.f35966a = i10;
        this.f35968c = obj;
        this.f35967b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35966a) {
            case 1:
                ((o81) this.f35968c).f36819r = null;
                return;
            case 3:
                og1 og1Var = (og1) this.f35968c;
                AnimatorSet animatorSet = og1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    og1Var.F = null;
                    return;
                }
                return;
            case 15:
                ((sh.n) this.f35968c).f44380w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        org.telegram.ui.Cells.y3 y3Var;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        RadialProgressView radialProgressView;
        float f17;
        boolean z4;
        int i11;
        float f18;
        float f19;
        boolean z10;
        float f20;
        float f21;
        switch (this.f35966a) {
            case 0:
                m61 m61Var = (m61) this.f35968c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m61Var.v;
                if (this.f35967b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                m61Var.I = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.f27347g.getInterpolation(m61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(m61Var.I, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12).setAlpha(cascade);
                }
                m61Var.K = null;
                return;
            case 1:
                o81 o81Var = (o81) this.f35968c;
                if (o81Var.f36819r != null && (y3Var = o81Var.f36820s) != null) {
                    if (!this.f35967b) {
                        y3Var.setVisibility(4);
                    }
                    o81Var.f36819r = null;
                    return;
                }
                return;
            case 2:
                rd1 rd1Var = (rd1) this.f35968c;
                if (this.f35967b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                rd1Var.f37998y = f11;
                return;
            case 3:
                og1 og1Var = (og1) this.f35968c;
                AnimatorSet animatorSet = og1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.f35967b) {
                        og1Var.e.setVisibility(4);
                        return;
                    } else {
                        og1Var.f36895b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.web.s1 s1Var = (org.telegram.ui.web.s1) this.f35968c;
                lh.n nVar = s1Var.S;
                if (!s1Var.Q) {
                    nVar.setVisibility(8);
                    nVar.setText("");
                }
                if (this.f35967b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                s1Var.R = f12;
                nVar.setAlpha(f12);
                s1Var.invalidate();
                if (s1Var.Q) {
                    nVar.requestFocus();
                    AndroidUtilities.showKeyboard(nVar);
                    return;
                }
                nVar.clearFocus();
                AndroidUtilities.hideKeyboard(nVar);
                return;
            case 5:
                m0 m0Var = (m0) this.f35968c;
                lh.n nVar2 = m0Var.V;
                if (!m0Var.T) {
                    nVar2.setVisibility(8);
                }
                if (this.f35967b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                m0Var.U = f13;
                nVar2.setAlpha(f13);
                m0Var.j(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                return;
            case 6:
                ph.d dVar = (ph.d) this.f35968c;
                if (this.f35967b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.J = f14;
                dVar.invalidate();
                return;
            case 7:
                ph.k kVar = (ph.k) this.f35968c;
                boolean z11 = this.f35967b;
                if (!z11) {
                    kVar.f41822r.setVisibility(8);
                    org.telegram.ui.Components.zh zhVar = kVar.J;
                    if (zhVar != null) {
                        zhVar.setVisibility(8);
                    }
                }
                if (z11) {
                    kVar.f41809f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z11);
                return;
            case 8:
                ph.u uVar = (ph.u) this.f35968c;
                k3 k3Var = uVar.f42375a;
                boolean z12 = this.f35967b;
                if (z12) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                uVar.d = f15;
                k3Var.invalidate();
                if (z12) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k3Var.setVisibility(i10);
                return;
            case 9:
                if (!this.f35967b) {
                    ((ph.a3) this.f35968c).F.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f35967b) {
                    ((ph.r3) this.f35968c).f42240b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ph.c5 c5Var = (ph.c5) this.f35968c;
                if (!this.f35967b) {
                    c5Var.W1.setVisibility(8);
                    c5Var.W1.n();
                    return;
                }
                return;
            case 12:
                ph.x7 x7Var = (ph.x7) this.f35968c;
                if (this.f35967b) {
                    x7Var.setVisibility(8);
                }
                x7Var.f42564c = null;
                return;
            case 13:
                ph.da daVar = (ph.da) this.f35968c;
                if (!this.f35967b) {
                    daVar.S0.setVisibility(8);
                }
                daVar.f41482c2 = null;
                return;
            case 14:
                rh.q2 q2Var = (rh.q2) this.f35968c;
                if (this.f35967b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                q2Var.K0 = f16;
                q2Var.h();
                return;
            case 15:
                sh.n nVar3 = (sh.n) this.f35968c;
                if (nVar3.f44380w != null && (radialProgressView = nVar3.f44381x) != null) {
                    if (!this.f35967b) {
                        radialProgressView.setVisibility(4);
                        nVar3.f44379s.setVisibility(4);
                    }
                    nVar3.f44380w = null;
                    return;
                }
                return;
            case 16:
                tf.x0 x0Var = (tf.x0) this.f35968c;
                boolean z13 = this.f35967b;
                if (z13) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                x0Var.e = f17;
                x0Var.invalidate();
                for (int i13 = 0; i13 < 2; i13++) {
                    x0Var.f44878c[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    TextView textView = x0Var.f44878c[i13];
                    if (i13 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i14 = 8;
                    if (z4 == z13) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = x0Var.f44878c[i13];
                    if (i13 == 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    if (i13 == 1) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f18, f19, x0Var.e));
                    x0Var.d[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    TextView textView3 = x0Var.d[i13];
                    if (i13 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 == z13) {
                        i14 = 0;
                    }
                    textView3.setVisibility(i14);
                    TextView textView4 = x0Var.d[i13];
                    if (i13 == 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    if (i13 == 1) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f20, f21, x0Var.e));
                }
                return;
            default:
                if (this.f35967b) {
                    ((yf.n) this.f35968c).e(false, false, true, false);
                    return;
                }
                return;
        }
    }
}
