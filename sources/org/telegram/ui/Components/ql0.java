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
import org.telegram.ui.oh1;
import org.telegram.ui.rg1;
public final class ql0 extends AnimatorListenerAdapter {
    public final int f29939a;
    public final Object f29940b;
    public final Object f29941c;

    public ql0(int i10, Object obj, Object obj2) {
        this.f29939a = i10;
        this.f29941c = obj;
        this.f29940b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29939a) {
            case 12:
                ((ProfileActivity) this.f29941c).E5 = null;
                return;
            case 18:
                ((r0.m0) this.f29940b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f29939a;
        Object obj = this.f29940b;
        Object obj2 = this.f29941c;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj;
                b10Var.setAlpha(1.0f);
                s4.n0.x0(b10Var);
                rl0 rl0Var = (rl0) obj2;
                rl0Var.f30223c.remove(b10Var);
                rl0Var.f30221a.removeView(b10Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.qq qqVar = (org.telegram.ui.qq) obj2;
                ((rl0) qqVar.d).f30225g.remove((AnimatorSet) obj);
                if (((rl0) qqVar.d).f30225g.isEmpty()) {
                    ((rl0) qqVar.d).f30222b.clear();
                    rl0 rl0Var2 = (rl0) qqVar.d;
                    rl0Var2.d = true;
                    rl0Var2.f30221a.invalidate();
                    return;
                }
                return;
            case 2:
                wp0 wp0Var = (wp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(wp0Var.B);
                } catch (Exception unused) {
                }
                ko0 ko0Var = wp0Var.C;
                if (ko0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ko0Var);
                    return;
                }
                return;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                ow0 ow0Var = (ow0) gVar.f2655c;
                ow0Var.f29336f0 = 1.0f;
                ow0Var.S.add((kw0) obj);
                ((ow0) gVar.f2655c).f29328a0.setShader(null);
                ((ow0) gVar.f2655c).f29332c0.setShader(null);
                ((ow0) gVar.f2655c).M();
                super.onAnimationEnd(animator);
                return;
            case 4:
                by0 by0Var = (by0) obj2;
                by0Var.f25166b = 0.0f;
                by0Var.invalidate();
                ((kn0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) obj2;
                i3Var.d.setText((String) obj);
                i3Var.d.setTranslationY(0.0f);
                i3Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.i3) obj2).removeView((org.telegram.ui.Components.voip.h3) obj);
                return;
            case 7:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.ey) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.w70 w70Var = (org.telegram.ui.w70) obj2;
                w70Var.removeView((v30) obj);
                w70Var.e = null;
                w70Var.f42950a = null;
                w70Var.f42951b = false;
                return;
            case 9:
                tw0 tw0Var = (tw0) obj2;
                tw0Var.setVisibility(8);
                tw0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                rf0 rf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = rf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rf0Var.f30165f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = rf0Var.f30168s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = rf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                rf0Var.h = true;
                rf0Var.f30166n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                rf0Var.f30168s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rf0Var, rf0Var.E, 0.0f, 1.0f));
                rf0Var.f30168s.setDuration(250L);
                rf0Var.f30168s.setInterpolator(new OvershootInterpolator(1.01f));
                rf0Var.f30168s.addListener(new pf0(rf0Var, 0));
                rf0Var.f30168s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33770z2, photoViewer.f33575d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(bs.f25134g);
                photoViewer.A2.addListener(new org.telegram.ui.v70(this, 8));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.rw0 rw0Var = (org.telegram.ui.rw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = rw0Var.f41263n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != rw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.E5 != null) {
                    if (profileActivity.H5) {
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        if (profileActivity.O0) {
                            profileActivity.T0.setVisibility(8);
                        }
                        profileActivity.U0.setVisibility(8);
                    } else {
                        org.telegram.ui.rz0 rz0Var = profileActivity.O;
                        if (rz0Var.v0(rz0Var.f32687k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f32701r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33965l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.v70(this, 20));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.p5(false);
                profileActivity.E5 = null;
                return;
            case 13:
                org.telegram.ui.b31 b31Var = (org.telegram.ui.b31) obj2;
                if (b31Var.h != null) {
                    b31Var.h = null;
                    b31Var.f35841n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    b31Var.e = 1.0f;
                    b31Var.g();
                    b31Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.mu0 mu0Var = (org.telegram.ui.mu0) obj;
                if (mu0Var != null) {
                    mu0Var.f39692a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34125s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.my0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.r51) obj).run();
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) obj2;
                org.telegram.ui.q41 q41Var = b61Var.X0;
                if (q41Var != null) {
                    q41Var.dismiss();
                    b61Var.X0 = null;
                    return;
                }
                return;
            case 16:
                rg1 rg1Var = (rg1) obj2;
                rg1Var.removeView((v30) obj);
                rg1Var.e = null;
                rg1Var.f41134a = null;
                rg1Var.f41135b = false;
                UsersSelectActivity usersSelectActivity = rg1Var.f41137f;
                usersSelectActivity.f34259c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34259c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                oh1 oh1Var = (oh1) obj2;
                oh1Var.f40174e0.setScaleX(1.15f);
                oh1Var.f40174e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oh1Var.f40174e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                oh1Var.f40174e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f45275a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                rg.c2 c2Var = (rg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.f45725r0.b(c2Var.f45732y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.f45733z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f46953w = false;
                ((sg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46772s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new sg.i1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((v30) obj);
                n9Var.h.clear();
                n9Var.f9535b = null;
                n9Var.f9536c = false;
                ((yg.h) n9Var.f9538n).f50597b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29939a) {
            case 9:
                ((tw0) this.f29940b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f29940b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ql0(Object obj, View view, int i10) {
        this.f29939a = i10;
        this.f29940b = obj;
        this.f29941c = view;
    }

    public ql0(rl0 rl0Var, b10 b10Var, s4.n0 n0Var) {
        this.f29939a = 0;
        this.f29941c = rl0Var;
        this.f29940b = b10Var;
    }
}
