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
public final class rs extends AnimatorListenerAdapter {
    public final int f32373a;
    public final Object f32374b;
    public final Object f32375c;
    public final Object d;
    public final Object f32376e;

    public rs(f2.l lVar, f2.n1 n1Var, Object obj, Object obj2, int i10) {
        this.f32373a = i10;
        this.f32376e = lVar;
        this.f32375c = n1Var;
        this.f32374b = obj;
        this.d = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32373a) {
            case 5:
                View view = (View) this.f32374b;
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f32373a) {
            case 0:
                ((f2.n1) this.f32375c).f6432a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                us usVar = (us) this.f32376e;
                ss ssVar = (ss) this.f32374b;
                usVar.d(ssVar.f32713a);
                usVar.f33313y.remove(ssVar.f32713a);
                usVar.A();
                usVar.d(ssVar.f32714b);
                usVar.f33313y.remove(ssVar.f32714b);
                usVar.A();
                return;
            case 1:
                ((qu0) this.f32376e).D1 = false;
                View view = (View) this.f32374b;
                if (view.getParent() != null) {
                    ((it0) this.f32375c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f32376e;
                TextView[] textViewArr = r2Var.f33969a;
                View view2 = (View) this.f32374b;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleY(1.0f);
                view2.setScaleX(1.0f);
                View view3 = (View) this.f32375c;
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setVisibility(0);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                r2Var.f33973f = false;
                CharSequence charSequence = r2Var.f33972e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        r2Var.e(true);
                    } else {
                        textViewArr[1].setText(r2Var.f33972e);
                        r2Var.a(textViewArr[0], textViewArr[1], new nh.m6(this, 20));
                    }
                    r2Var.f33972e = null;
                    return;
                }
                return;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.f32376e;
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.f32374b;
                if (lVar2 != null) {
                    lVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f32375c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView == null) {
                    runnable2.run();
                    return;
                }
                profileActivity.f35985a0.setProgressToExpand(0.0f);
                profileActivity.f35984a.setLayerType(0, null);
                if (profileActivity.L0 != null) {
                    lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    org.telegram.ui.ActionBar.a0 n10 = lVar.n();
                    ArrayList arrayList = n10.f22721e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    n10.removeAllViews();
                    profileActivity.L0 = null;
                }
                runnable2.run();
                if (profileActivity.F1 == 2) {
                    profileActivity.F1 = 1;
                    profileActivity.f35985a0.setForegroundAlpha(1.0f);
                    profileActivity.U.setVisibility(8);
                    profileActivity.f36049j0.setAlpha(1.0f);
                    profileActivity.f36049j0.L();
                    profileActivity.f36049j0.setVisibility(0);
                }
                profileActivity.S4 = null;
                profileActivity.V.invalidate();
                profileActivity.f36004c5 = null;
                profileActivity.fragmentView.invalidate();
                return;
            case 4:
                ((ViewPropertyAnimator) this.f32374b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                rf.b0 b0Var = (rf.b0) this.f32376e;
                f2.n1 n1Var = (f2.n1) this.f32375c;
                b0Var.d(n1Var);
                b0Var.A.remove(n1Var);
                b0Var.G();
                return;
            default:
                f2.n1 n1Var2 = (f2.n1) this.f32375c;
                uh.m mVar = (uh.m) this.f32376e;
                View view5 = (View) this.f32374b;
                if (view5 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.f6413y.remove(n1Var2)) {
                    mVar.u(n1Var2);
                    mVar.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32373a) {
            case 0:
                us usVar = (us) this.f32376e;
                ss ssVar = (ss) this.f32374b;
                f2.n1 n1Var = ssVar.f32713a;
                usVar.getClass();
                f2.n1 n1Var2 = ssVar.f32714b;
                usVar.getClass();
                return;
            case 4:
                return;
            case 5:
                ((uh.m) this.f32376e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public rs(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f32373a = i10;
        this.f32376e = obj;
        this.f32374b = obj2;
        this.f32375c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
