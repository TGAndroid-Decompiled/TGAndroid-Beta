package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public final class sz extends AnimatorListenerAdapter {

    public final int f32598a;

    public final Object f32599b;

    public sz(Object obj, int i10) {
        this.f32598a = i10;
        this.f32599b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32598a) {
            case 11:
                ((cg0) this.f32599b).h = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32598a) {
            case 0:
                yz yzVar = (yz) this.f32599b;
                yzVar.Q = yzVar.V;
                yzVar.U = yzVar.f35071b0;
                yzVar.R = yzVar.W;
                yzVar.S = yzVar.f35069a0;
                yzVar.V = -1;
                yzVar.W = -1;
                yzVar.f35069a0 = -1;
                yzVar.f35071b0 = -1;
                break;
            case 1:
                m00 m00Var = (m00) this.f32599b;
                m00Var.f30505s = 1.0f;
                m00Var.invalidate();
                break;
            case 2:
                b70 b70Var = (b70) this.f32599b;
                z60 z60Var = b70Var.f26996x;
                if (z60Var != null) {
                    z60Var.setProgress(1.0f);
                    b70Var.f26996x.invalidate();
                }
                b70Var.m0 = null;
                break;
            case 3:
                zz zzVar = (zz) this.f32599b;
                ((k70) zzVar.f35413e).A = false;
                TextView[] textViewArr = (TextView[]) zzVar.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 4:
                x70 x70Var = (x70) this.f32599b;
                if (!x70Var.f34532f) {
                    x70Var.f34530c.setVisibility(8);
                }
                break;
            case 5:
                e80 e80Var = (e80) this.f32599b;
                FrameLayout frameLayout = e80Var.f27970b;
                ag.t0 t0Var = (ag.t0) e80Var.f27971c;
                if (t0Var.getParent() != null) {
                    frameLayout.removeView(t0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.y9) e80Var.d);
                break;
            case 6:
                ab0 ab0Var = (ab0) this.f32599b;
                ab0Var.V.h = null;
                ab0Var.e(ab0Var.O, ab0Var.N);
                break;
            case 7:
                NumberTextView numberTextView = (NumberTextView) this.f32599b;
                numberTextView.d = null;
                numberTextView.f26409b.clear();
                break;
            case 8:
                dd0 dd0Var = (dd0) this.f32599b;
                dd0Var.setVisibility(8);
                dd0Var.h();
                dd0Var.L = 0.0f;
                dd0Var.f(0.0f);
                dd0Var.setAlpha(0.0f);
                break;
            case 9:
                AnimatorSet animatorSet = (AnimatorSet) this.f32599b;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                break;
            case 10:
                ue ueVar = (ue) this.f32599b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((lh.w8) ueVar.f33066c).f17016e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((lh.w8) ueVar.f33066c).f17016e = null;
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                hg0 hg0Var = (hg0) this.f32599b;
                hg0Var.f29010f = false;
                hg0Var.B = null;
                break;
            case 13:
                ((wh0) this.f32599b).b();
                break;
            case 14:
                ((gj0) this.f32599b).h.setVisibility(8);
                break;
            case 15:
                zk0 zk0Var = (zk0) this.f32599b;
                View view = zk0Var.Y0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (zk0Var.b1()) {
                    zk0Var.invalidate();
                }
                break;
            case 16:
                vl0 vl0Var = (vl0) this.f32599b;
                if (vl0Var.f33462s != null) {
                    vl0Var.j();
                    vl0Var.f33462s.invalidate();
                    vl0Var.f33448e.invalidate();
                    vl0Var.invalidate();
                    vl0Var.f33462s = null;
                }
                break;
            case 17:
                ((am0) this.f32599b).d = false;
                break;
            case 18:
                ((jn0) this.f32599b).I0.setVisibility(8);
                break;
            case 19:
                go0 go0Var = (go0) this.f32599b;
                if (animator == go0Var.h) {
                    go0Var.h = null;
                }
                break;
            case 20:
                ((rp0) this.f32599b).f32251e = null;
                break;
            case 21:
                zp0 zp0Var = (zp0) this.f32599b;
                if (zp0Var.getParent() != null) {
                    ((ViewGroup) zp0Var.getParent()).removeView(zp0Var);
                }
                break;
            case 22:
                as0 as0Var = (as0) this.f32599b;
                View view2 = as0Var.f26816c;
                view2.setAlpha(1.0f);
                f2.x0.x0(view2);
                as0Var.f26814a.removeView(view2);
                break;
            case 23:
                pu0 pu0Var = (pu0) this.f32599b;
                if (pu0Var.f31666f == animator) {
                    pu0Var.f31666f = null;
                }
                break;
            case 24:
                gw0 gw0Var = (gw0) this.f32599b;
                gw0Var.setCategoriesShownT(((Float) gw0Var.f28847l3.getAnimatedValue()).floatValue());
                gw0Var.f28847l3 = null;
                break;
            case 25:
                ex0 ex0Var = (ex0) this.f32599b;
                ex0Var.f28193x.setVisibility(8);
                ex0Var.B.setImageDrawable(null);
                break;
            case 26:
                int i10 = 0;
                while (true) {
                    lx0[] lx0VarArr = (lx0[]) this.f32599b;
                    if (i10 < lx0VarArr.length) {
                        lx0 lx0Var = lx0VarArr[i10];
                        if (lx0Var != null) {
                            lx0Var.d = false;
                        }
                        i10++;
                    }
                    break;
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((mx0) this.f32599b).D = null;
                break;
            case 28:
                ((px0) this.f32599b).f31681e = false;
                break;
            default:
                ((wz0) this.f32599b).setVisibility(4);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32598a) {
            case 17:
                am0 am0Var = (am0) this.f32599b;
                am0Var.d = true;
                if (am0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) am0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public sz(as0 as0Var, f2.x0 x0Var) {
        this.f32598a = 22;
        this.f32599b = as0Var;
    }

    private final void a(Animator animator) {
    }
}
