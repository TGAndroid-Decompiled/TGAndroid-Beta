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
import org.telegram.ui.wi1;
import org.telegram.ui.zh1;
public final class ul0 extends AnimatorListenerAdapter {
    public final int f31534a;
    public final Object f31535b;
    public final Object f31536c;

    public ul0(int i10, Object obj, Object obj2) {
        this.f31534a = i10;
        this.f31536c = obj;
        this.f31535b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31534a) {
            case 11:
                ((ProfileActivity) this.f31536c).C5 = null;
                return;
            case 12:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) this.f31536c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f31535b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, e31Var.f37138e[0], iArr[0]), i0.a.d(floatValue, e31Var.f37138e[1], iArr[1]), i0.a.d(floatValue, e31Var.f37138e[2], iArr[2]), i0.a.d(floatValue, e31Var.f37138e[3], iArr[3])}, 0, e31Var.f37138e, 0, 4);
                    return;
                }
                return;
            case 19:
                ((r0.m0) this.f31535b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f31534a;
        Object obj = this.f31535b;
        Object obj2 = this.f31536c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj2;
                ((vl0) zqVar.d).f31821g.remove((AnimatorSet) obj);
                if (((vl0) zqVar.d).f31821g.isEmpty()) {
                    ((vl0) zqVar.d).f31817b.clear();
                    vl0 vl0Var = (vl0) zqVar.d;
                    vl0Var.d = true;
                    vl0Var.f31816a.invalidate();
                    return;
                }
                return;
            case 1:
                aq0 aq0Var = (aq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(aq0Var.B);
                } catch (Exception unused) {
                }
                ci0 ci0Var = aq0Var.C;
                if (ci0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ci0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                sw0 sw0Var = (sw0) gVar.f2128c;
                sw0Var.f30926f0 = 1.0f;
                sw0Var.S.add((ow0) obj);
                ((sw0) gVar.f2128c).f30917a0.setShader(null);
                ((sw0) gVar.f2128c).f30921c0.setShader(null);
                ((sw0) gVar.f2128c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                fy0 fy0Var = (fy0) obj2;
                fy0Var.f26508b = 0.0f;
                fy0Var.invalidate();
                ((on0) obj).invalidate();
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
                ((org.telegram.ui.ty) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((d40) obj);
                k80Var.f39178e = null;
                k80Var.f39175a = null;
                k80Var.f39176b = false;
                return;
            case 8:
                xw0 xw0Var = (xw0) obj2;
                xw0Var.setVisibility(8);
                xw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                vf0 vf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = vf0Var.f31770e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vf0Var.f31771f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = vf0Var.f31774s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = vf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                vf0Var.h = true;
                vf0Var.f31772n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                vf0Var.f31774s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(vf0Var, vf0Var.E, 0.0f, 1.0f));
                vf0Var.f31774s.setDuration(250L);
                vf0Var.f31774s.setInterpolator(new OvershootInterpolator(1.01f));
                vf0Var.f31774s.addListener(new tf0(vf0Var, 0));
                vf0Var.f31774s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34093z2, photoViewer.f33898d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(hs.f27119g);
                photoViewer.A2.addListener(new org.telegram.ui.ep0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f39042n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != jx0Var.f39040e) {
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
                        org.telegram.ui.k01 k01Var = profileActivity.O;
                        if (k01Var.s0(k01Var.f25142k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f25156r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34282j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.ep0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, e31Var.f37138e, 0, 4);
                }
                e31Var.f37140n = null;
                e31Var.f37142s = null;
                cd0 cd0Var = e31Var.h;
                cd0Var.K = 1.0f;
                cd0Var.i();
                e31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.l41 l41Var = (org.telegram.ui.l41) obj2;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.f39430n.unlock();
                    ((org.telegram.ui.ux) obj).onTransitionAnimationEnd(true, false);
                    l41Var.f39428e = 1.0f;
                    l41Var.g();
                    l41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ev0 ev0Var = (org.telegram.ui.ev0) obj;
                if (ev0Var != null) {
                    ev0Var.f37356a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34453s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nz0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.a71) obj).run();
                org.telegram.ui.k71 k71Var = (org.telegram.ui.k71) obj2;
                org.telegram.ui.z51 z51Var = k71Var.X0;
                if (z51Var != null) {
                    z51Var.dismiss();
                    k71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                zh1 zh1Var = (zh1) obj2;
                zh1Var.removeView((d40) obj);
                zh1Var.f44666e = null;
                zh1Var.f44663a = null;
                zh1Var.f44664b = false;
                UsersSelectActivity usersSelectActivity = zh1Var.f44667f;
                usersSelectActivity.f34594c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34594c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                wi1 wi1Var = (wi1) obj2;
                wi1Var.f43638e0.setScaleX(1.15f);
                wi1Var.f43638e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wi1Var.f43638e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                wi1Var.f43638e0.setVisibility(8);
                return;
            case 18:
                qg.b2 b2Var = (qg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f46193r0.b(b2Var.f46200y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f46201z0 = 1.0f;
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f46805a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                ((rg.y0) obj2).f47528w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                rg.l1 l1Var = (rg.l1) obj2;
                l1Var.H0 = false;
                l1Var.G0 = 1.0f;
                l1Var.f47338s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(28, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 23:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((d40) obj);
                baVar.h.clear();
                baVar.f4797b = null;
                baVar.f4798c = false;
                ((xg.i) baVar.f4801n).f51144b.setAllowDrawCursor(true);
                return;
            default:
                yh.k8 k8Var = (yh.k8) obj2;
                k8Var.f52794b.remove((yh.j8) obj);
                k8Var.c1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31534a) {
            case 8:
                ((xw0) this.f31535b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f31535b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ul0(Object obj, View view, int i10) {
        this.f31534a = i10;
        this.f31535b = obj;
        this.f31536c = view;
    }
}
