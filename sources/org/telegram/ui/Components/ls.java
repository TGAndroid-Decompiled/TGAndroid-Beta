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

public final class ls extends AnimatorListenerAdapter {

    public final int f30457a;

    public final Object f30458b;

    public final Object f30459c;
    public final Object d;

    public final Object f30460e;

    public ls(f2.l lVar, f2.o1 o1Var, Object obj, Object obj2, int i10) {
        this.f30457a = i10;
        this.f30460e = lVar;
        this.f30459c = o1Var;
        this.f30458b = obj;
        this.d = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30457a) {
            case 5:
                View view = (View) this.f30458b;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).getTransitionParams().h = false;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30457a) {
            case 0:
                ((f2.o1) this.f30459c).f5789a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                os osVar = (os) this.f30460e;
                ms msVar = (ms) this.f30458b;
                osVar.d(msVar.f30740a);
                osVar.f31405y.remove(msVar.f30740a);
                osVar.A();
                osVar.d(msVar.f30741b);
                osVar.f31405y.remove(msVar.f30741b);
                osVar.A();
                break;
            case 1:
                ((hu0) this.f30460e).D1 = false;
                View view = (View) this.f30458b;
                if (view.getParent() != null) {
                    ((zs0) this.f30459c).removeView(view);
                    ((Bitmap) this.d).recycle();
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f30460e;
                TextView[] textViewArr = o2Var.f33783a;
                View view2 = (View) this.f30458b;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleY(1.0f);
                view2.setScaleX(1.0f);
                View view3 = (View) this.f30459c;
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setVisibility(0);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                o2Var.f33787f = false;
                CharSequence charSequence = o2Var.f33786e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.f33786e);
                        o2Var.a(textViewArr[0], textViewArr[1], new nh.f0(this, 17));
                    }
                    o2Var.f33786e = null;
                }
                break;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f30460e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f30458b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f30459c;
                if (v0Var != null) {
                    v0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.f35922a0.setProgressToExpand(0.0f);
                    profileActivity.f35921a.setLayerType(0, null);
                    if (profileActivity.L0 != null) {
                        org.telegram.ui.ActionBar.z zVarN = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.n();
                        ArrayList arrayList = zVarN.f23986e;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        zVarN.removeAllViews();
                        profileActivity.L0 = null;
                    }
                    runnable2.run();
                    if (profileActivity.F1 == 2) {
                        profileActivity.F1 = 1;
                        profileActivity.f35922a0.setForegroundAlpha(1.0f);
                        profileActivity.U.setVisibility(8);
                        profileActivity.f35987j0.setAlpha(1.0f);
                        profileActivity.f35987j0.L();
                        profileActivity.f35987j0.setVisibility(0);
                    }
                    profileActivity.S4 = null;
                    profileActivity.V.invalidate();
                    profileActivity.f35941c5 = null;
                    profileActivity.fragmentView.invalidate();
                } else {
                    runnable2.run();
                }
                break;
            case 4:
                ((ViewPropertyAnimator) this.f30458b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                pf.a0 a0Var = (pf.a0) this.f30460e;
                f2.o1 o1Var = (f2.o1) this.f30459c;
                a0Var.d(o1Var);
                a0Var.A.remove(o1Var);
                a0Var.G();
                break;
            default:
                f2.o1 o1Var2 = (f2.o1) this.f30459c;
                sh.m mVar = (sh.m) this.f30460e;
                View view5 = (View) this.f30458b;
                if (view5 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.f5746y.remove(o1Var2)) {
                    mVar.u(o1Var2);
                    mVar.G();
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30457a) {
            case 0:
                os osVar = (os) this.f30460e;
                ms msVar = (ms) this.f30458b;
                f2.o1 o1Var = msVar.f30740a;
                osVar.getClass();
                f2.o1 o1Var2 = msVar.f30741b;
                osVar.getClass();
                break;
            case 4:
                break;
            case 5:
                ((sh.m) this.f30460e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ls(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30457a = i10;
        this.f30460e = obj;
        this.f30458b = obj2;
        this.f30459c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
