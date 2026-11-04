package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.p40;
import org.telegram.ui.ac;
import org.telegram.ui.dl;
import org.telegram.ui.fh;
import org.telegram.ui.fl;
import org.telegram.ui.jx;
import org.telegram.ui.kb;
import org.telegram.ui.mj;
import org.telegram.ui.mw;
import org.telegram.ui.nq;
import org.telegram.ui.pc;
import org.telegram.ui.pw;
import org.telegram.ui.rb;
import org.telegram.ui.sb1;
import org.telegram.ui.to;
import org.telegram.ui.tp;
import org.telegram.ui.ts;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wt;
import org.telegram.ui.xg;
import org.telegram.ui.xt;
import org.telegram.ui.yt;
import org.telegram.ui.zu;
import org.webrtc.OrientationHelper;
public final class w9 extends AnimatorListenerAdapter {
    public final int f30828a;
    public final Object f30829b;

    public w9(Object obj, int i3) {
        this.f30828a = i3;
        this.f30829b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f30828a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f30829b;
                ((y9) ((x9) g1Var.f27516b).f30971b).getTransitionParams().e();
                ((y9) ((x9) g1Var.f27516b).f30971b).getTransitionParams().h = false;
                ((y9) ((x9) g1Var.f27516b).f30971b).getTransitionParams().L1 = 1.0f;
                return;
            case 1:
                org.telegram.ui.h3 h3Var = (org.telegram.ui.h3) this.f30829b;
                if (animator.equals(((kb) h3Var.f45792b).S)) {
                    ((kb) h3Var.f45792b).S = null;
                    return;
                }
                return;
            case 2:
                kb kbVar = (kb) this.f30829b;
                if (animator.equals(kbVar.S)) {
                    kbVar.S = null;
                    return;
                }
                return;
            case 3:
                ((rb) this.f30829b).I.setVisibility(8);
                return;
            case 4:
                pc pcVar = (pc) this.f30829b;
                ac acVar = pcVar.f48528n0;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) pcVar.f48528n0.getParent()).removeView(pcVar.f48528n0);
                    }
                    pcVar.f48528n0 = null;
                }
                pcVar.f48530p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                fh fhVar = (fh) this.f30829b;
                if (fhVar.f45277a) {
                    fhVar.d.setTranslationY(0.0f);
                }
                if (fhVar.f45278b) {
                    fhVar.f45280e.setTranslationY(0.0f);
                }
                if (fhVar.f45281f) {
                    fhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.k9 k9Var = fhVar.f45279c;
                if (k9Var != null) {
                    k9Var.setTranslationY(0.0f);
                }
                fhVar.f45282n.W2[1] = null;
                return;
            case 6:
                mj mjVar = (mj) this.f30829b;
                mjVar.setAnimatedTop(0);
                View view = mjVar.H1;
                if (view != null && view.getVisibility() == 0) {
                    mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + mjVar.U1);
                }
                mjVar.f47684x5.J9 = null;
                return;
            case 7:
                bh.j jVar = (bh.j) this.f30829b;
                p40 p40Var = ((dl) jVar.f3323c).f44733c.R.f51448q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(false);
                    ((dl) jVar.f3323c).f44733c.R.f51448q3.c(true);
                    ((dl) jVar.f3323c).f44733c.R.f51448q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                dl dlVar = (dl) this.f30829b;
                fl flVar = dlVar.f44733c;
                ArrayList arrayList = flVar.R.E6;
                q1 q1Var = dlVar.f44732b;
                arrayList.remove(q1Var);
                View view2 = flVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    flVar.R.A0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30940y0 = false;
                return;
            case 9:
                to toVar = (to) this.f30829b;
                toVar.M = 0.0f;
                toVar.L = 1.0f;
                View view3 = toVar.f49839b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                toVar.U.invalidate();
                xg xgVar = toVar.Z;
                if (xgVar != null) {
                    xgVar.run();
                    toVar.Z = null;
                    return;
                }
                return;
            case 10:
                tp tpVar = (tp) this.f30829b;
                View view4 = tpVar.f49863b;
                view4.setAlpha(1.0f);
                u4.o0.x0(view4);
                ((nq) tpVar.d).f48052c.removeView(view4);
                return;
            case 11:
                org.telegram.ui.Components.voip.r rVar = ((org.telegram.ui.Components.voip.n) this.f30829b).f39492t0;
                if (rVar.f39580y0.getParent() != null) {
                    rVar.f39546a.removeView(rVar.f39580y0);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.f30829b;
                if (f0Var.getParent() != null) {
                    ((ViewGroup) f0Var.getParent()).removeView(f0Var);
                    return;
                }
                return;
            case 13:
                sb1 sb1Var = (sb1) this.f30829b;
                if (!sb1Var.f39445a) {
                    sb1Var.W.f52645w.T = true;
                    sb1Var.W.f52645w.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f30829b;
                x0Var.f39710i = false;
                x0Var.f39713l.setAlpha(35);
                x0Var.f39712k.setAlpha(102);
                x0Var.f39711j.setAlpha(35);
                x0Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.c1 c1Var = ((org.telegram.ui.Components.voip.a1) this.f30829b).f39219c;
                c1Var.P = false;
                c1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) this.f30829b;
                z1Var.O = 0.0f;
                z1Var.P = 0.0f;
                org.telegram.ui.Components.voip.y1 y1Var = z1Var.d;
                y1Var.setScaleX(z1Var.U);
                y1Var.setScaleY(z1Var.U);
                TextureView textureView = z1Var.f39737e;
                if (textureView != null) {
                    textureView.setScaleX(z1Var.V);
                    textureView.setScaleY(z1Var.V);
                }
                z1Var.setTranslationY(0.0f);
                z1Var.setTranslationX(0.0f);
                z1Var.f39731a0 = z1Var.W;
                z1Var.f39735c0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) this.f30829b;
                if (c2Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c2Var.R = f10;
                c2Var.a(c2Var.S, c2Var.T);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.d2) this.f30829b).f39290c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.d2) this.f30829b).f39288a);
                if (((org.telegram.ui.Components.voip.d2) this.f30829b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.d2) this.f30829b).f39288a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.d2) this.f30829b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.d2) this.f30829b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.f30829b;
                j2Var.K = false;
                j2Var.U.f39707e = false;
                if (j2Var.V && (animatorSet = j2Var.R) != null) {
                    animatorSet.cancel();
                    j2Var.R.start();
                }
                j2Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.q2) this.f30829b).f39544e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f30829b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                ts tsVar = (ts) this.f30829b;
                if (animator.equals(tsVar.f49879n[0])) {
                    tsVar.f49879n[0] = null;
                    return;
                }
                return;
            case 23:
                wt wtVar = (wt) this.f30829b;
                yt ytVar = wtVar.f51604n;
                xt[] xtVarArr = ytVar.f52403f;
                ytVar.h = null;
                if (ytVar.f52406s) {
                    xtVarArr[1].setVisibility(8);
                } else {
                    xt xtVar = xtVarArr[0];
                    xtVarArr[0] = xtVarArr[1];
                    xtVarArr[1] = xtVar;
                    xtVar.setVisibility(8);
                    if (ytVar.f52403f[0].f52100f == ytVar.f52402e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ytVar.f52408x = z10;
                    ytVar.f52402e.i(1.0f, ytVar.f52403f[0].f52100f);
                }
                ytVar.f52404n = false;
                wtVar.f51601c = false;
                wtVar.f51600b = false;
                yt.k0(ytVar).setEnabled(true);
                ytVar.f52402e.setEnabled(true);
                return;
            case 24:
                zu zuVar = (zu) this.f30829b;
                uw.u1(zuVar.M, zuVar.L, 0.0f);
                return;
            case 25:
                uw uwVar = (uw) this.f30829b;
                boolean z11 = uwVar.H0;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                uwVar.I0 = f11;
                if (!z11) {
                    uwVar.F0.setVisibility(8);
                }
                View view5 = uwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 26:
                uw uwVar2 = ((mw) this.f30829b).f47801o0;
                uwVar2.f50243h3 = null;
                if (!uwVar2.f50261l3) {
                    tw[] twVarArr = uwVar2.f50230f0;
                    tw twVar = twVarArr[0];
                    tw twVar2 = twVarArr[1];
                    twVarArr[0] = twVar2;
                    twVarArr[1] = twVar;
                    uwVar2.A0.g(1.0f, twVar2.h);
                    uwVar2.f5(false);
                    uwVar2.f50230f0[0].d.getClass();
                    uwVar2.f50230f0[1].d.getClass();
                }
                uwVar2.f50230f0[1].setVisibility(8);
                uw.j1(uwVar2, true);
                uwVar2.i3 = false;
                uwVar2.f50274o3 = false;
                kVar = ((org.telegram.ui.ActionBar.d2) uwVar2).actionBar;
                kVar.setEnabled(true);
                uwVar2.A0.setEnabled(true);
                uwVar2.C3(uwVar2.f50230f0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((pw) this.f30829b).setScrollEnabled(true);
                return;
            case 28:
                jx jxVar = (jx) this.f30829b;
                if (jxVar.f46707w == animator) {
                    jxVar.f46707w = null;
                    return;
                }
                return;
            default:
                i70 i70Var = (i70) this.f30829b;
                FrameLayout frameLayout = i70Var.f34629b;
                gi.n5 n5Var = (gi.n5) i70Var.f34630c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.f7) i70Var.d);
                return;
        }
    }

    public w9(tp tpVar, u4.o0 o0Var) {
        this.f30828a = 10;
        this.f30829b = tpVar;
    }
}
