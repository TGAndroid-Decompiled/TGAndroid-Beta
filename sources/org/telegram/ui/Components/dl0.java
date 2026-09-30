package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.mi1;
import org.telegram.ui.qh1;
public final class dl0 extends AnimatorListenerAdapter {
    public final int f23675a;
    public final Object f23676b;
    public final Object f23677c;

    public dl0(int i10, Object obj, Object obj2) {
        this.f23675a = i10;
        this.f23677c = obj;
        this.f23676b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23675a) {
            case 11:
                ((ProfileActivity) this.f23677c).C5 = null;
                return;
            case 12:
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) this.f23677c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f23676b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, w21Var.e[0], iArr[0]), i0.a.d(floatValue, w21Var.e[1], iArr[1]), i0.a.d(floatValue, w21Var.e[2], iArr[2]), i0.a.d(floatValue, w21Var.e[3], iArr[3])}, 0, w21Var.e, 0, 4);
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
        boolean z10;
        int i10 = this.f23675a;
        Object obj = this.f23676b;
        Object obj2 = this.f23677c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.wq wqVar = (org.telegram.ui.wq) obj2;
                ((el0) wqVar.d).f24008g.remove((AnimatorSet) obj);
                if (((el0) wqVar.d).f24008g.isEmpty()) {
                    ((el0) wqVar.d).f24005b.clear();
                    el0 el0Var = (el0) wqVar.d;
                    el0Var.d = true;
                    el0Var.f24004a.invalidate();
                    return;
                }
                return;
            case 1:
                lp0 lp0Var = (lp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(lp0Var.B);
                } catch (Exception unused) {
                }
                zn0 zn0Var = lp0Var.C;
                if (zn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(zn0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                dw0 dw0Var = (dw0) gVar.f1889c;
                dw0Var.f23755f0 = 1.0f;
                dw0Var.S.add((zv0) obj);
                ((dw0) gVar.f1889c).f23747a0.setShader(null);
                ((dw0) gVar.f1889c).f23751c0.setShader(null);
                ((dw0) gVar.f1889c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                qx0 qx0Var = (qx0) obj2;
                qx0Var.f27744b = 0.0f;
                qx0Var.invalidate();
                ((xm0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.qy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) obj2;
                f80Var.removeView((q30) obj);
                f80Var.e = null;
                f80Var.f33660a = null;
                f80Var.f33661b = false;
                return;
            case 8:
                iw0 iw0Var = (iw0) obj2;
                iw0Var.setVisibility(8);
                iw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                hf0 hf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = hf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hf0Var.f24858f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = hf0Var.f24861s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = hf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                hf0Var.h = true;
                hf0Var.f24859n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                hf0Var.f24861s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(hf0Var, hf0Var.E, 0.0f, 1.0f));
                hf0Var.f24861s.setDuration(250L);
                hf0Var.f24861s.setInterpolator(new OvershootInterpolator(1.01f));
                hf0Var.f24861s.addListener(new ff0(hf0Var, 0));
                hf0Var.f24861s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31486z2, photoViewer.f31292d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(tr.f28637g);
                photoViewer.A2.addListener(new org.telegram.ui.wo0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ax0Var.f32328n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != ax0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.C5 != null) {
                    if (profileActivity.F5) {
                        if (profileActivity.L0) {
                            profileActivity.Q0.setVisibility(8);
                        }
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        profileActivity.T0.setVisibility(8);
                    } else {
                        org.telegram.ui.c01 c01Var = profileActivity.O;
                        if (c01Var.s0(c01Var.f26425k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f26439r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31668j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.wo0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, w21Var.e, 0, 4);
                }
                w21Var.f38964n = null;
                w21Var.f38966s = null;
                pc0 pc0Var = w21Var.h;
                pc0Var.K = 1.0f;
                pc0Var.i();
                w21Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.d41 d41Var = (org.telegram.ui.d41) obj2;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.f32992n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    d41Var.e = 1.0f;
                    d41Var.g();
                    d41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.vu0 vu0Var = (org.telegram.ui.vu0) obj;
                if (vu0Var != null) {
                    vu0Var.f38907a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31836s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vz0(this, 11));
                return;
            case 15:
                ((org.telegram.ui.q61) obj).run();
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) obj2;
                org.telegram.ui.p51 p51Var = a71Var.X0;
                if (p51Var != null) {
                    p51Var.dismiss();
                    a71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                qh1 qh1Var = (qh1) obj2;
                qh1Var.removeView((q30) obj);
                qh1Var.e = null;
                qh1Var.f37024a = null;
                qh1Var.f37025b = false;
                UsersSelectActivity usersSelectActivity = qh1Var.f37027f;
                usersSelectActivity.f31970c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31970c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                mi1 mi1Var = (mi1) obj2;
                mi1Var.f35668e0.setScaleX(1.15f);
                mi1Var.f35668e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mi1Var.f35668e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mi1Var.f35668e0.setVisibility(8);
                return;
            case 18:
                qg.b2 b2Var = (qg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f41688r0.b(b2Var.f41695y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f41696z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f42268a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42935w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42750s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((q30) obj);
                baVar.h.clear();
                baVar.f4424b = null;
                baVar.f4425c = false;
                ((xg.i) baVar.f4427n).f46159b.setAllowDrawCursor(true);
                return;
            default:
                yh.q8 q8Var = (yh.q8) obj2;
                q8Var.f48034b.remove((yh.p8) obj);
                q8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23675a) {
            case 8:
                ((iw0) this.f23676b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public dl0(Object obj, View view, int i10) {
        this.f23675a = i10;
        this.f23676b = obj;
        this.f23677c = view;
    }
}
