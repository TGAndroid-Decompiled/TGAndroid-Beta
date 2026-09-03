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
public final class us extends AnimatorListenerAdapter {
    public final int f29291a;
    public final Object f29292b;
    public final Object f29293c;
    public final Object d;
    public final Object e;

    public us(f2.l lVar, f2.l1 l1Var, Object obj, Object obj2, int i10) {
        this.f29291a = i10;
        this.e = lVar;
        this.f29293c = l1Var;
        this.f29292b = obj;
        this.d = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29291a) {
            case 5:
                View view = (View) this.f29292b;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).getTransitionParams().h = false;
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
        switch (this.f29291a) {
            case 0:
                ((f2.l1) this.f29293c).f5774a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                xs xsVar = (xs) this.e;
                vs vsVar = (vs) this.f29292b;
                xsVar.d(vsVar.f30043a);
                xsVar.f30708y.remove(vsVar.f30043a);
                xsVar.A();
                xsVar.d(vsVar.f30044b);
                xsVar.f30708y.remove(vsVar.f30044b);
                xsVar.A();
                return;
            case 1:
                ((yu0) this.e).E1 = false;
                View view = (View) this.f29292b;
                if (view.getParent() != null) {
                    ((qt0) this.f29293c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.e;
                TextView[] textViewArr = p2Var.f29828a;
                View view2 = (View) this.f29292b;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleY(1.0f);
                view2.setScaleX(1.0f);
                View view3 = (View) this.f29293c;
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setVisibility(0);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.f29831f = false;
                CharSequence charSequence = p2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        p2Var.e(true);
                    } else {
                        textViewArr[1].setText(p2Var.e);
                        p2Var.a(textViewArr[0], textViewArr[1], new nh.n5(this, 25));
                    }
                    p2Var.e = null;
                    return;
                }
                return;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.f29292b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f29293c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f32010b0.setProgressToExpand(0.0f);
                profileActivity.f32002a.setLayerType(0, null);
                if (profileActivity.M0 != null) {
                    kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.z n10 = kVar.n();
                    ArrayList arrayList = n10.e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.M0 = null;
                }
                runnable2.run();
                if (profileActivity.G1 == 2) {
                    profileActivity.G1 = 1;
                    profileActivity.f32010b0.setForegroundAlpha(1.0f);
                    profileActivity.V.setVisibility(8);
                    profileActivity.f32073k0.setAlpha(1.0f);
                    profileActivity.f32073k0.L();
                    profileActivity.f32073k0.setVisibility(0);
                }
                profileActivity.T4 = null;
                profileActivity.W.invalidate();
                profileActivity.f32029d5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            case 4:
                ((ViewPropertyAnimator) this.f29292b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                tf.a0 a0Var = (tf.a0) this.e;
                f2.l1 l1Var = (f2.l1) this.f29293c;
                a0Var.d(l1Var);
                a0Var.A.remove(l1Var);
                a0Var.G();
                return;
            default:
                f2.l1 l1Var2 = (f2.l1) this.f29293c;
                wh.n nVar = (wh.n) this.e;
                View view5 = (View) this.f29292b;
                if (view5 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.f5771y.remove(l1Var2)) {
                    nVar.u(l1Var2);
                    nVar.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29291a) {
            case 0:
                xs xsVar = (xs) this.e;
                vs vsVar = (vs) this.f29292b;
                f2.l1 l1Var = vsVar.f30043a;
                xsVar.getClass();
                f2.l1 l1Var2 = vsVar.f30044b;
                xsVar.getClass();
                return;
            case 4:
                return;
            case 5:
                ((wh.n) this.e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public us(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f29291a = i10;
        this.e = obj;
        this.f29292b = obj2;
        this.f29293c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
