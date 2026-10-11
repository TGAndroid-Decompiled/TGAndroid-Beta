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
import org.telegram.ui.ui1;
import org.telegram.ui.yh1;
public final class wl0 extends AnimatorListenerAdapter {
    public final int f32677a;
    public final Object f32678b;
    public final Object f32679c;

    public wl0(int i10, Object obj, Object obj2) {
        this.f32677a = i10;
        this.f32679c = obj;
        this.f32678b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32677a) {
            case 11:
                ((ProfileActivity) this.f32679c).C5 = null;
                return;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) this.f32679c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f32678b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, d31Var.f36885e[0], iArr[0]), i0.a.d(floatValue, d31Var.f36885e[1], iArr[1]), i0.a.d(floatValue, d31Var.f36885e[2], iArr[2]), i0.a.d(floatValue, d31Var.f36885e[3], iArr[3])}, 0, d31Var.f36885e, 0, 4);
                    return;
                }
                return;
            case 19:
                ((r0.m0) this.f32678b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f32677a;
        Object obj = this.f32678b;
        Object obj2 = this.f32679c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj2;
                ((xl0) zqVar.d).f32984g.remove((AnimatorSet) obj);
                if (((xl0) zqVar.d).f32984g.isEmpty()) {
                    ((xl0) zqVar.d).f32980b.clear();
                    xl0 xl0Var = (xl0) zqVar.d;
                    xl0Var.d = true;
                    xl0Var.f32979a.invalidate();
                    return;
                }
                return;
            case 1:
                cq0 cq0Var = (cq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(cq0Var.B);
                } catch (Exception unused) {
                }
                fi0 fi0Var = cq0Var.C;
                if (fi0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(fi0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                uw0 uw0Var = (uw0) gVar.f2128c;
                uw0Var.f31587f0 = 1.0f;
                uw0Var.S.add((qw0) obj);
                ((uw0) gVar.f2128c).f31578a0.setShader(null);
                ((uw0) gVar.f2128c).f31582c0.setShader(null);
                ((uw0) gVar.f2128c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                hy0 hy0Var = (hy0) obj2;
                hy0Var.f27095b = 0.0f;
                hy0Var.invalidate();
                ((qn0) obj).invalidate();
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
                ((org.telegram.ui.sy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((e40) obj);
                j80Var.f38940e = null;
                j80Var.f38937a = null;
                j80Var.f38938b = false;
                return;
            case 8:
                zw0 zw0Var = (zw0) obj2;
                zw0Var.setVisibility(8);
                zw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                xf0 xf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = xf0Var.f32886e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xf0Var.f32887f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = xf0Var.f32890s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = xf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                xf0Var.h = true;
                xf0Var.f32888n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                xf0Var.f32890s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xf0Var, xf0Var.E, 0.0f, 1.0f));
                xf0Var.f32890s.setDuration(250L);
                xf0Var.f32890s.setInterpolator(new OvershootInterpolator(1.01f));
                xf0Var.f32890s.addListener(new vf0(xf0Var, 0));
                xf0Var.f32890s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34121z2, photoViewer.f33926d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(is.f27452g);
                photoViewer.A2.addListener(new org.telegram.ui.dp0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.ix0 ix0Var = (org.telegram.ui.ix0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f38799n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != ix0Var.f38797e) {
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
                        org.telegram.ui.j01 j01Var = profileActivity.O;
                        if (j01Var.s0(j01Var.f25711k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f25725r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34310j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.dp0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, d31Var.f36885e, 0, 4);
                }
                d31Var.f36887n = null;
                d31Var.f36889s = null;
                dd0 dd0Var = d31Var.h;
                dd0Var.K = 1.0f;
                dd0Var.i();
                d31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.k41 k41Var = (org.telegram.ui.k41) obj2;
                if (k41Var.h != null) {
                    k41Var.h = null;
                    k41Var.f39197n.unlock();
                    ((org.telegram.ui.tx) obj).onTransitionAnimationEnd(true, false);
                    k41Var.f39195e = 1.0f;
                    k41Var.g();
                    k41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) obj;
                if (dv0Var != null) {
                    dv0Var.f37113a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34481s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mz0(this, 12));
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
                yh1 yh1Var = (yh1) obj2;
                yh1Var.removeView((e40) obj);
                yh1Var.f44436e = null;
                yh1Var.f44433a = null;
                yh1Var.f44434b = false;
                UsersSelectActivity usersSelectActivity = yh1Var.f44437f;
                usersSelectActivity.f34622c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34622c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ui1 ui1Var = (ui1) obj2;
                ui1Var.f42589e0.setScaleX(1.15f);
                ui1Var.f42589e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ui1Var.f42589e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ui1Var.f42589e0.setVisibility(8);
                return;
            case 18:
                qg.a2 a2Var = (qg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f46258r0.b(a2Var.f46265y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f46266z0 = 1.0f;
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f46895a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                ((rg.y0) obj2).f47618w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                rg.l1 l1Var = (rg.l1) obj2;
                l1Var.H0 = false;
                l1Var.G0 = 1.0f;
                l1Var.f47428s0.invalidate();
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
                baVar.removeView((e40) obj);
                baVar.h.clear();
                baVar.f4796b = null;
                baVar.f4797c = false;
                ((xg.i) baVar.f4800n).f51231b.setAllowDrawCursor(true);
                return;
            default:
                yh.k8 k8Var = (yh.k8) obj2;
                k8Var.f52881b.remove((yh.j8) obj);
                k8Var.c1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32677a) {
            case 8:
                ((zw0) this.f32678b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f32678b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public wl0(Object obj, View view, int i10) {
        this.f32677a = i10;
        this.f32678b = obj;
        this.f32679c = view;
    }
}
