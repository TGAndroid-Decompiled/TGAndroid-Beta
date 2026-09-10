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
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.di1;
import org.telegram.ui.zi1;
public final class vv0 extends AnimatorListenerAdapter {
    public final int f28601a;
    public final Object f28602b;
    public final Object f28603c;

    public vv0(int i10, View view, Object obj) {
        this.f28601a = i10;
        this.f28602b = obj;
        this.f28603c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28601a) {
            case 9:
                ((ProfileActivity) this.f28603c).C5 = null;
                return;
            case 10:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) this.f28603c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f28602b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, k31Var.e[0], iArr[0]), i0.a.d(floatValue, k31Var.e[1], iArr[1]), i0.a.d(floatValue, k31Var.e[2], iArr[2]), i0.a.d(floatValue, k31Var.e[3], iArr[3])}, 0, k31Var.e, 0, 4);
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
        int i10 = this.f28601a;
        Object obj = this.f28602b;
        Object obj2 = this.f28603c;
        switch (i10) {
            case 0:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                aw0 aw0Var = (aw0) gVar.f571c;
                aw0Var.f21631f0 = 1.0f;
                aw0Var.S.add((wv0) obj);
                ((aw0) gVar.f571c).f21623a0.setShader(null);
                ((aw0) gVar.f571c).f21627c0.setShader(null);
                ((aw0) gVar.f571c).N();
                super.onAnimationEnd(animator);
                return;
            case 1:
                ox0 ox0Var = (ox0) obj2;
                ox0Var.f25930b = 0.0f;
                ox0Var.invalidate();
                ((sm0) obj).invalidate();
                return;
            case 2:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                return;
            case 3:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                return;
            case 4:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.wy) obj2).R3 = null;
                return;
            case 5:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((w30) obj);
                j80Var.e = null;
                j80Var.f34049a = null;
                j80Var.f34050b = false;
                return;
            case 6:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.setVisibility(8);
                fw0Var.setX(0.0f);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                df0 df0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = df0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                df0Var.f22407f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = df0Var.f22410s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = df0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                df0Var.h = true;
                df0Var.f22408n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                df0Var.f22410s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(df0Var, df0Var.E, 0.0f, 1.0f));
                df0Var.f22410s.setDuration(250L);
                df0Var.f22410s.setInterpolator(new OvershootInterpolator(1.01f));
                df0Var.f22410s.addListener(new bf0(df0Var, 0));
                df0Var.f22410s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f30238z2, photoViewer.f30044d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(wr.f28820g);
                photoViewer.A2.addListener(new org.telegram.ui.Components.voip.v2(this, 21));
                photoViewer.A2.start();
                return;
            case 8:
                org.telegram.ui.lx0 lx0Var = (org.telegram.ui.lx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f34805n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != lx0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 9:
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
                        org.telegram.ui.r01 r01Var = profileActivity.O;
                        if (r01Var.s0(r01Var.f24107k0[0].F)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.O.f24121r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f30420j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.mv0(this, 3));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 10:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, k31Var.e, 0, 4);
                }
                k31Var.f34213n = null;
                k31Var.f34215s = null;
                lc0 lc0Var = k31Var.h;
                lc0Var.K = 1.0f;
                lc0Var.i();
                k31Var.h.s(1.0f);
                return;
            case 11:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) obj2;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.f36224n.unlock();
                    ((org.telegram.ui.xx) obj).onTransitionAnimationEnd(true, false);
                    r41Var.e = 1.0f;
                    r41Var.g();
                    r41Var.d(false);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ev0 ev0Var = (org.telegram.ui.ev0) obj;
                if (ev0Var != null) {
                    ev0Var.f32616a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f30588s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.k01(this, 11));
                return;
            case 13:
                ((org.telegram.ui.b71) obj).run();
                org.telegram.ui.l71 l71Var = (org.telegram.ui.l71) obj2;
                org.telegram.ui.a61 a61Var = l71Var.X0;
                if (a61Var != null) {
                    a61Var.dismiss();
                    l71Var.X0 = null;
                    return;
                }
                return;
            case 14:
                di1 di1Var = (di1) obj2;
                di1Var.removeView((w30) obj);
                di1Var.e = null;
                di1Var.f31920a = null;
                di1Var.f31921b = false;
                UsersSelectActivity usersSelectActivity = di1Var.f31923f;
                usersSelectActivity.f30722c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f30722c.setHintVisible(true, true);
                    return;
                }
                return;
            case 15:
                ((Runnable) obj).run();
                zi1 zi1Var = (zi1) obj2;
                zi1Var.f39367e0.setScaleX(1.15f);
                zi1Var.f39367e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zi1Var.f39367e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                zi1Var.f39367e0.setVisibility(8);
                return;
            case 16:
                pg.a2 a2Var = (pg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f39935r0.b(a2Var.f39942y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f39943z0 = 1.0f;
                return;
            case 17:
                ((qg.a1) obj2).f40666w = false;
                ((qg.p0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 18:
                qg.m1 m1Var = (qg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f40829s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new gg.t1(25, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f41097a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                bi.nb nbVar = (bi.nb) obj2;
                nbVar.removeView((w30) obj);
                nbVar.h.clear();
                nbVar.f3248b = null;
                nbVar.f3249c = false;
                ((wg.h) nbVar.f3251n).f43999b.setAllowDrawCursor(true);
                return;
            case 21:
                xh.t8 t8Var = (xh.t8) obj2;
                t8Var.f46078b.remove((xh.s8) obj);
                t8Var.a1();
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((zh.k) obj2).f48566b0.f48609j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            default:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f30630s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new xh.x(profileStoriesView, 25), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28601a) {
            case 6:
                ((fw0) this.f28602b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vv0(int i10, Object obj, Object obj2) {
        this.f28601a = i10;
        this.f28603c = obj;
        this.f28602b = obj2;
    }
}
