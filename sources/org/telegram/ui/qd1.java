package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.RadialProgressView;
public final class qd1 extends AnimatorListenerAdapter {
    public final int f40441a;
    public final boolean f40442b;
    public final Object f40443c;

    public qd1(int i10, Object obj, boolean z4) {
        this.f40441a = i10;
        this.f40443c = obj;
        this.f40442b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40441a) {
            case 1:
                qg1 qg1Var = (qg1) this.f40443c;
                AnimatorSet animatorSet = qg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qg1Var.F = null;
                    return;
                }
                return;
            case 15:
                ((th.n) this.f40443c).f48160w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View m9;
        float f15;
        float f16;
        int i10;
        float f17;
        RadialProgressView radialProgressView;
        float f18;
        boolean z4;
        int i11;
        float f19;
        float f20;
        boolean z10;
        float f21;
        float f22;
        switch (this.f40441a) {
            case 0:
                ud1 ud1Var = (ud1) this.f40443c;
                if (this.f40442b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ud1Var.f41910y = f10;
                return;
            case 1:
                qg1 qg1Var = (qg1) this.f40443c;
                AnimatorSet animatorSet = qg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.f40442b) {
                        qg1Var.f40487e.setVisibility(4);
                        return;
                    } else {
                        qg1Var.f40482b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f40443c;
                mh.m mVar = t1Var.S;
                if (!t1Var.Q) {
                    mVar.setVisibility(8);
                    mVar.setText("");
                }
                if (this.f40442b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                t1Var.R = f11;
                mVar.setAlpha(f11);
                t1Var.invalidate();
                if (t1Var.Q) {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    return;
                }
                mVar.clearFocus();
                AndroidUtilities.hideKeyboard(mVar);
                return;
            case 3:
                m0 m0Var = (m0) this.f40443c;
                mh.m mVar2 = m0Var.V;
                if (!m0Var.T) {
                    mVar2.setVisibility(8);
                }
                if (this.f40442b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                m0Var.U = f12;
                mVar2.setAlpha(f12);
                m0Var.j(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                return;
            case 4:
                ph.p pVar = (ph.p) this.f40443c;
                float f23 = 0.0f;
                boolean z11 = this.f40442b;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                pVar.f44414w = f13;
                org.telegram.ui.Components.l81 l81Var = pVar.f44412r;
                if (z11) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                l81Var.setTranslationY(AndroidUtilities.dp(f14));
                k11 k11Var = pVar.f44411n;
                if (z11) {
                    f23 = 42.0f;
                }
                k11Var.setTranslationY(AndroidUtilities.dp(f23));
                return;
            case 5:
                ph.l lVar = (ph.l) this.f40443c;
                org.telegram.ui.Components.h61 h61Var = lVar.h;
                ph.e eVar = lVar.f44395f;
                ph.g gVar = lVar.v;
                lVar.f44392b = false;
                boolean z12 = this.f40442b;
                if (z12) {
                    int i12 = lVar.f44394e;
                    lVar.d = i12;
                    lVar.T.f44416y = i12;
                    SharedConfig.setStoriesColumnsCount(i12);
                }
                int h = gVar.h();
                if (z12) {
                    h61Var.y1(lVar.d);
                    eVar.a0();
                    if (gVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(eVar);
                    } else {
                        gVar.l();
                    }
                }
                lVar.f44397r.setVisibility(8);
                int i13 = lVar.P;
                if (i13 >= 0) {
                    if (z12 && (m9 = lVar.f44398s.m(i13)) != null) {
                        lVar.Q = m9.getTop();
                    }
                    h61Var.h1(lVar.P, (-eVar.getPaddingTop()) + lVar.Q);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                qh.d dVar = (qh.d) this.f40443c;
                if (this.f40442b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.J = f15;
                dVar.invalidate();
                return;
            case 7:
                qh.k kVar = (qh.k) this.f40443c;
                boolean z13 = this.f40442b;
                if (!z13) {
                    kVar.f45530r.setVisibility(8);
                    org.telegram.ui.Components.zh zhVar = kVar.J;
                    if (zhVar != null) {
                        zhVar.setVisibility(8);
                    }
                }
                if (z13) {
                    kVar.f45517f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z13);
                return;
            case 8:
                qh.u uVar = (qh.u) this.f40443c;
                k3 k3Var = uVar.f46134a;
                boolean z14 = this.f40442b;
                if (z14) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                uVar.d = f16;
                k3Var.invalidate();
                if (z14) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k3Var.setVisibility(i10);
                return;
            case 9:
                if (!this.f40442b) {
                    ((qh.a3) this.f40443c).F.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f40442b) {
                    ((qh.r3) this.f40443c).f45935b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                qh.b5 b5Var = (qh.b5) this.f40443c;
                if (!this.f40442b) {
                    b5Var.W1.setVisibility(8);
                    b5Var.W1.n();
                    return;
                }
                return;
            case 12:
                qh.v7 v7Var = (qh.v7) this.f40443c;
                if (this.f40442b) {
                    v7Var.setVisibility(8);
                }
                v7Var.f46199c = null;
                return;
            case 13:
                qh.ca caVar = (qh.ca) this.f40443c;
                if (!this.f40442b) {
                    caVar.S0.setVisibility(8);
                }
                caVar.f45084c2 = null;
                return;
            case 14:
                sh.p2 p2Var = (sh.p2) this.f40443c;
                if (this.f40442b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                p2Var.K0 = f17;
                p2Var.h();
                return;
            case 15:
                th.n nVar = (th.n) this.f40443c;
                if (nVar.f48160w != null && (radialProgressView = nVar.f48161x) != null) {
                    if (!this.f40442b) {
                        radialProgressView.setVisibility(4);
                        nVar.f48159s.setVisibility(4);
                    }
                    nVar.f48160w = null;
                    return;
                }
                return;
            case 16:
                uf.x0 x0Var = (uf.x0) this.f40443c;
                boolean z15 = this.f40442b;
                if (z15) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                x0Var.f48737e = f18;
                x0Var.invalidate();
                for (int i14 = 0; i14 < 2; i14++) {
                    x0Var.f48736c[i14].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f48737e));
                    TextView textView = x0Var.f48736c[i14];
                    if (i14 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i15 = 8;
                    if (z4 == z15) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = x0Var.f48736c[i14];
                    if (i14 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i14 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f19, f20, x0Var.f48737e));
                    x0Var.d[i14].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f48737e));
                    TextView textView3 = x0Var.d[i14];
                    if (i14 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 == z15) {
                        i15 = 0;
                    }
                    textView3.setVisibility(i15);
                    TextView textView4 = x0Var.d[i14];
                    if (i14 == 0) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (i14 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f21, f22, x0Var.f48737e));
                }
                return;
            default:
                if (this.f40442b) {
                    ((zf.n) this.f40443c).e(false, false, true, false);
                    return;
                }
                return;
        }
    }
}
