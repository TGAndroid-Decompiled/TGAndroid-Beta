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
import org.telegram.ui.ti1;
import org.telegram.ui.xh1;
public final class qk0 extends AnimatorListenerAdapter {
    public final int f27339a;
    public final Object f27340b;
    public final Object f27341c;

    public qk0(int i10, Object obj, Object obj2) {
        this.f27339a = i10;
        this.f27341c = obj;
        this.f27340b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27339a) {
            case 11:
                ((ProfileActivity) this.f27341c).C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.f27341c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f27340b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, g31Var.e[0], iArr[0]), i0.a.d(floatValue, g31Var.e[1], iArr[1]), i0.a.d(floatValue, g31Var.e[2], iArr[2]), i0.a.d(floatValue, g31Var.e[3], iArr[3])}, 0, g31Var.e, 0, 4);
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
        int i10 = this.f27339a;
        Object obj = this.f27340b;
        Object obj2 = this.f27341c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.br brVar = (org.telegram.ui.br) obj2;
                ((rk0) brVar.d).f27640g.remove((AnimatorSet) obj);
                if (((rk0) brVar.d).f27640g.isEmpty()) {
                    ((rk0) brVar.d).f27637b.clear();
                    rk0 rk0Var = (rk0) brVar.d;
                    rk0Var.d = true;
                    rk0Var.f27636a.invalidate();
                    return;
                }
                return;
            case 1:
                wo0 wo0Var = (wo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(wo0Var.B);
                } catch (Exception unused) {
                }
                ny nyVar = wo0Var.C;
                if (nyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nyVar);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                qv0 qv0Var = (qv0) gVar.f1890c;
                qv0Var.f27423f0 = 1.0f;
                qv0Var.S.add((mv0) obj);
                ((qv0) gVar.f1890c).f27415a0.setShader(null);
                ((qv0) gVar.f1890c).f27419c0.setShader(null);
                ((qv0) gVar.f1890c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                ex0 ex0Var = (ex0) obj2;
                ex0Var.f23685b = 0.0f;
                ex0Var.invalidate();
                ((jm0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.wy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) obj2;
                m80Var.removeView((m30) obj);
                m80Var.e = null;
                m80Var.f35706a = null;
                m80Var.f35707b = false;
                return;
            case 8:
                vv0 vv0Var = (vv0) obj2;
                vv0Var.setVisibility(8);
                vv0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ue0 ue0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ue0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ue0Var.f28374f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ue0Var.f28377s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ue0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ue0Var.h = true;
                ue0Var.f28375n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ue0Var.f28377s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ue0Var, ue0Var.E, 0.0f, 1.0f));
                ue0Var.f28377s.setDuration(250L);
                ue0Var.f28377s.setInterpolator(new OvershootInterpolator(1.01f));
                ue0Var.f28377s.addListener(new se0(ue0Var, 0));
                ue0Var.f28377s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31143z2, photoViewer.f30949d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(qr.f27384g);
                photoViewer.A2.addListener(new org.telegram.ui.er0(this, 1));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.lx0 lx0Var = (org.telegram.ui.lx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f35652n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != lx0Var.e) {
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
                        org.telegram.ui.n01 n01Var = profileActivity.O;
                        if (n01Var.s0(n01Var.f30635k0[0].F)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.O.f30649r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31325j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.er0(this, 13));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, g31Var.e, 0, 4);
                }
                g31Var.f33836n = null;
                g31Var.f33838s = null;
                cc0 cc0Var = g31Var.h;
                cc0Var.K = 1.0f;
                cc0Var.i();
                g31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.n41 n41Var = (org.telegram.ui.n41) obj2;
                if (n41Var.h != null) {
                    n41Var.h = null;
                    n41Var.f35942n.unlock();
                    ((org.telegram.ui.xx) obj).onTransitionAnimationEnd(true, false);
                    n41Var.e = 1.0f;
                    n41Var.g();
                    n41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.fv0 fv0Var = (org.telegram.ui.fv0) obj;
                if (fv0Var != null) {
                    fv0Var.f33767a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31493s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g01(this, 11));
                return;
            case 15:
                ((org.telegram.ui.y61) obj).run();
                org.telegram.ui.i71 i71Var = (org.telegram.ui.i71) obj2;
                org.telegram.ui.x51 x51Var = i71Var.X0;
                if (x51Var != null) {
                    x51Var.dismiss();
                    i71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                xh1 xh1Var = (xh1) obj2;
                xh1Var.removeView((m30) obj);
                xh1Var.e = null;
                xh1Var.f39646a = null;
                xh1Var.f39647b = false;
                UsersSelectActivity usersSelectActivity = xh1Var.f39649f;
                usersSelectActivity.f31627c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31627c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ti1 ti1Var = (ti1) obj2;
                ti1Var.f37772e0.setScaleX(1.15f);
                ti1Var.f37772e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ti1Var.f37772e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ti1Var.f37772e0.setVisibility(8);
                return;
            case 18:
                qg.d2 d2Var = (qg.d2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d2Var.f41359r0.b(d2Var.f41366y0, false);
                }
                d2Var.setRotationY(0.0f);
                d2Var.f41367z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f41905a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42570w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42388s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f4608b = null;
                eaVar.f4609c = false;
                ((xg.i) eaVar.f4611n).f45801b.setAllowDrawCursor(true);
                return;
            default:
                yh.s8 s8Var = (yh.s8) obj2;
                s8Var.f47828b.remove((yh.r8) obj);
                s8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27339a) {
            case 8:
                ((vv0) this.f27340b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public qk0(Object obj, View view, int i10) {
        this.f27339a = i10;
        this.f27340b = obj;
        this.f27341c = view;
    }
}
