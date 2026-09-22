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
public final class cl0 extends AnimatorListenerAdapter {
    public final int f23399a;
    public final Object f23400b;
    public final Object f23401c;

    public cl0(int i10, Object obj, Object obj2) {
        this.f23399a = i10;
        this.f23401c = obj;
        this.f23400b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23399a) {
            case 11:
                ((ProfileActivity) this.f23401c).C5 = null;
                return;
            case 12:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) this.f23401c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f23400b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, f31Var.e[0], iArr[0]), i0.a.d(floatValue, f31Var.e[1], iArr[1]), i0.a.d(floatValue, f31Var.e[2], iArr[2]), i0.a.d(floatValue, f31Var.e[3], iArr[3])}, 0, f31Var.e, 0, 4);
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
        int i10 = this.f23399a;
        Object obj = this.f23400b;
        Object obj2 = this.f23401c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj2;
                ((dl0) zqVar.d).f23713g.remove((AnimatorSet) obj);
                if (((dl0) zqVar.d).f23713g.isEmpty()) {
                    ((dl0) zqVar.d).f23710b.clear();
                    dl0 dl0Var = (dl0) zqVar.d;
                    dl0Var.d = true;
                    dl0Var.f23709a.invalidate();
                    return;
                }
                return;
            case 1:
                kp0 kp0Var = (kp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(kp0Var.B);
                } catch (Exception unused) {
                }
                yn0 yn0Var = kp0Var.C;
                if (yn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(yn0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                cw0 cw0Var = (cw0) gVar.f1889c;
                cw0Var.f23466f0 = 1.0f;
                cw0Var.S.add((yv0) obj);
                ((cw0) gVar.f1889c).f23458a0.setShader(null);
                ((cw0) gVar.f1889c).f23462c0.setShader(null);
                ((cw0) gVar.f1889c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                qx0 qx0Var = (qx0) obj2;
                qx0Var.f27688b = 0.0f;
                qx0Var.invalidate();
                ((wm0) obj).invalidate();
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
                ((org.telegram.ui.uy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((m30) obj);
                k80Var.e = null;
                k80Var.f35080a = null;
                k80Var.f35081b = false;
                return;
            case 8:
                hw0 hw0Var = (hw0) obj2;
                hw0Var.setVisibility(8);
                hw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ff0 ff0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ff0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ff0Var.f24219f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ff0Var.f24222s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ff0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ff0Var.h = true;
                ff0Var.f24220n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ff0Var.f24222s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ff0Var, ff0Var.E, 0.0f, 1.0f));
                ff0Var.f24222s.setDuration(250L);
                ff0Var.f24222s.setInterpolator(new OvershootInterpolator(1.01f));
                ff0Var.f24222s.addListener(new df0(ff0Var, 0));
                ff0Var.f24222s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31431z2, photoViewer.f31237d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(qr.f27654g);
                photoViewer.A2.addListener(new org.telegram.ui.gp0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f35026n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != jx0Var.e) {
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
                        org.telegram.ui.l01 l01Var = profileActivity.O;
                        if (l01Var.s0(l01Var.f26210k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f26224r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31613j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.gp0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, f31Var.e, 0, 4);
                }
                f31Var.f33496n = null;
                f31Var.f33498s = null;
                nc0 nc0Var = f31Var.h;
                nc0Var.K = 1.0f;
                nc0Var.i();
                f31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.m41 m41Var = (org.telegram.ui.m41) obj2;
                if (m41Var.h != null) {
                    m41Var.h = null;
                    m41Var.f35622n.unlock();
                    ((org.telegram.ui.vx) obj).onTransitionAnimationEnd(true, false);
                    m41Var.e = 1.0f;
                    m41Var.g();
                    m41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) obj;
                if (dv0Var != null) {
                    dv0Var.f33163a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31781s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.e01(this, 11));
                return;
            case 15:
                ((org.telegram.ui.z61) obj).run();
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) obj2;
                org.telegram.ui.y51 y51Var = j71Var.X0;
                if (y51Var != null) {
                    y51Var.dismiss();
                    j71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                xh1 xh1Var = (xh1) obj2;
                xh1Var.removeView((m30) obj);
                xh1Var.e = null;
                xh1Var.f39611a = null;
                xh1Var.f39612b = false;
                UsersSelectActivity usersSelectActivity = xh1Var.f39614f;
                usersSelectActivity.f31915c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31915c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ti1 ti1Var = (ti1) obj2;
                ti1Var.f37803e0.setScaleX(1.15f);
                ti1Var.f37803e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ti1Var.f37803e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ti1Var.f37803e0.setVisibility(8);
                return;
            case 18:
                qg.b2 b2Var = (qg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f41624r0.b(b2Var.f41631y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f41632z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f42198a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42862w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42680s0.invalidate();
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
                eaVar.f4607b = null;
                eaVar.f4608c = false;
                ((xg.i) eaVar.f4610n).f46092b.setAllowDrawCursor(true);
                return;
            default:
                yh.q8 q8Var = (yh.q8) obj2;
                q8Var.f47990b.remove((yh.p8) obj);
                q8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23399a) {
            case 8:
                ((hw0) this.f23400b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cl0(Object obj, View view, int i10) {
        this.f23399a = i10;
        this.f23400b = obj;
        this.f23401c = view;
    }
}
