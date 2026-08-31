package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;
public final class xs extends AnimatorListenerAdapter {
    public final int f33173a;
    public final Object f33174b;
    public final Object f33175c;
    public final Object d;
    public final Object f33176e;

    public xs(f2.l lVar, f2.m1 m1Var, Object obj, Object obj2, int i10) {
        this.f33173a = i10;
        this.f33176e = lVar;
        this.f33175c = m1Var;
        this.f33174b = obj;
        this.d = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33173a) {
            case 5:
                View view = (View) this.f33174b;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).getTransitionParams().h = false;
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
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f33173a) {
            case 0:
                ((f2.m1) this.f33175c).f5875a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                at atVar = (at) this.f33176e;
                ys ysVar = (ys) this.f33174b;
                atVar.d(ysVar.f33567a);
                atVar.f25344y.remove(ysVar.f33567a);
                atVar.A();
                atVar.d(ysVar.f33568b);
                atVar.f25344y.remove(ysVar.f33568b);
                atVar.A();
                return;
            case 1:
                ((zu0) this.f33176e).E1 = false;
                View view = (View) this.f33174b;
                if (view.getParent() != null) {
                    ((rt0) this.f33175c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f33176e;
                TextView[] textViewArr = q2Var.f32291a;
                View view2 = (View) this.f33174b;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleY(1.0f);
                view2.setScaleX(1.0f);
                View view3 = (View) this.f33175c;
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setVisibility(0);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f32295f = false;
                CharSequence charSequence = q2Var.f32294e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.f32294e);
                        q2Var.a(textViewArr[0], textViewArr[1], new oh.t3(this, 24));
                    }
                    q2Var.f32294e = null;
                    return;
                }
                return;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f33176e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f33174b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f33175c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f34568b0.setProgressToExpand(0.0f);
                profileActivity.f34560a.setLayerType(0, null);
                if (profileActivity.M0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.f22475e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.M0 = null;
                }
                runnable2.run();
                if (profileActivity.G1 == 2) {
                    profileActivity.G1 = 1;
                    profileActivity.f34568b0.setForegroundAlpha(1.0f);
                    profileActivity.V.setVisibility(8);
                    profileActivity.f34632k0.setAlpha(1.0f);
                    profileActivity.f34632k0.L();
                    profileActivity.f34632k0.setVisibility(0);
                }
                profileActivity.T4 = null;
                profileActivity.W.invalidate();
                profileActivity.f34587d5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            case 4:
                ((ViewPropertyAnimator) this.f33174b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                uf.a0 a0Var = (uf.a0) this.f33176e;
                f2.m1 m1Var = (f2.m1) this.f33175c;
                a0Var.d(m1Var);
                a0Var.A.remove(m1Var);
                a0Var.G();
                return;
            default:
                f2.m1 m1Var2 = (f2.m1) this.f33175c;
                xh.n nVar = (xh.n) this.f33176e;
                View view5 = (View) this.f33174b;
                if (view5 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f5861y.remove(m1Var2)) {
                    nVar.u(m1Var2);
                    nVar.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33173a) {
            case 0:
                at atVar = (at) this.f33176e;
                ys ysVar = (ys) this.f33174b;
                f2.m1 m1Var = ysVar.f33567a;
                atVar.getClass();
                f2.m1 m1Var2 = ysVar.f33568b;
                atVar.getClass();
                return;
            case 4:
                return;
            case 5:
                ((xh.n) this.f33176e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public xs(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33173a = i10;
        this.f33176e = obj;
        this.f33174b = obj2;
        this.f33175c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
