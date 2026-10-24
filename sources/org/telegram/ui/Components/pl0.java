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
import org.telegram.ui.nh1;
import org.telegram.ui.qg1;
public final class pl0 extends AnimatorListenerAdapter {
    public final int f29619a;
    public final Object f29620b;
    public final Object f29621c;

    public pl0(int i10, Object obj, Object obj2) {
        this.f29619a = i10;
        this.f29621c = obj;
        this.f29620b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29619a) {
            case 12:
                ((ProfileActivity) this.f29621c).E5 = null;
                return;
            case 18:
                ((r0.m0) this.f29620b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f29619a;
        Object obj = this.f29620b;
        Object obj2 = this.f29621c;
        switch (i10) {
            case 0:
                z00 z00Var = (z00) obj;
                z00Var.setAlpha(1.0f);
                s4.n0.x0(z00Var);
                ql0 ql0Var = (ql0) obj2;
                ql0Var.f29950c.remove(z00Var);
                ql0Var.f29948a.removeView(z00Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.qq qqVar = (org.telegram.ui.qq) obj2;
                ((ql0) qqVar.d).f29952g.remove((AnimatorSet) obj);
                if (((ql0) qqVar.d).f29952g.isEmpty()) {
                    ((ql0) qqVar.d).f29949b.clear();
                    ql0 ql0Var2 = (ql0) qqVar.d;
                    ql0Var2.d = true;
                    ql0Var2.f29948a.invalidate();
                    return;
                }
                return;
            case 2:
                vp0 vp0Var = (vp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(vp0Var.B);
                } catch (Exception unused) {
                }
                jo0 jo0Var = vp0Var.C;
                if (jo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jo0Var);
                    return;
                }
                return;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                nw0 nw0Var = (nw0) gVar.f2655c;
                nw0Var.f29055f0 = 1.0f;
                nw0Var.S.add((jw0) obj);
                ((nw0) gVar.f2655c).f29047a0.setShader(null);
                ((nw0) gVar.f2655c).f29051c0.setShader(null);
                ((nw0) gVar.f2655c).M();
                super.onAnimationEnd(animator);
                return;
            case 4:
                ay0 ay0Var = (ay0) obj2;
                ay0Var.f24837b = 0.0f;
                ay0Var.invalidate();
                ((jn0) obj).invalidate();
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
                w70Var.removeView((t30) obj);
                w70Var.e = null;
                w70Var.f42931a = null;
                w70Var.f42932b = false;
                return;
            case 9:
                sw0 sw0Var = (sw0) obj2;
                sw0Var.setVisibility(8);
                sw0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                qf0 qf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = qf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qf0Var.f29905f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = qf0Var.f29908s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = qf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                qf0Var.h = true;
                qf0Var.f29906n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                qf0Var.f29908s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(qf0Var, qf0Var.E, 0.0f, 1.0f));
                qf0Var.f29908s.setDuration(250L);
                qf0Var.f29908s.setInterpolator(new OvershootInterpolator(1.01f));
                qf0Var.f29908s.addListener(new of0(qf0Var, 0));
                qf0Var.f29908s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33772z2, photoViewer.f33577d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(zr.f33338g);
                photoViewer.A2.addListener(new org.telegram.ui.v70(this, 8));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.qw0 qw0Var = (org.telegram.ui.qw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40941n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != qw0Var.e) {
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
                        org.telegram.ui.qz0 qz0Var = profileActivity.O;
                        if (qz0Var.v0(qz0Var.f32386k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f32400r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33967l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.v70(this, 20));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.p5(false);
                profileActivity.E5 = null;
                return;
            case 13:
                org.telegram.ui.a31 a31Var = (org.telegram.ui.a31) obj2;
                if (a31Var.h != null) {
                    a31Var.h = null;
                    a31Var.f35565n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    a31Var.e = 1.0f;
                    a31Var.g();
                    a31Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) obj;
                if (lu0Var != null) {
                    lu0Var.f39381a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34127s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ly0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.q51) obj).run();
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj2;
                org.telegram.ui.p41 p41Var = a61Var.X0;
                if (p41Var != null) {
                    p41Var.dismiss();
                    a61Var.X0 = null;
                    return;
                }
                return;
            case 16:
                qg1 qg1Var = (qg1) obj2;
                qg1Var.removeView((t30) obj);
                qg1Var.e = null;
                qg1Var.f40822a = null;
                qg1Var.f40823b = false;
                UsersSelectActivity usersSelectActivity = qg1Var.f40825f;
                usersSelectActivity.f34261c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34261c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                nh1 nh1Var = (nh1) obj2;
                nh1Var.f39837e0.setScaleX(1.15f);
                nh1Var.f39837e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nh1Var.f39837e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                nh1Var.f39837e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f45274a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                rg.c2 c2Var = (rg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.f45724r0.b(c2Var.f45731y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.f45732z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f46952w = false;
                ((sg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46771s0.invalidate();
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
                n9Var.removeView((t30) obj);
                n9Var.h.clear();
                n9Var.f9535b = null;
                n9Var.f9536c = false;
                ((yg.h) n9Var.f9538n).f50596b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29619a) {
            case 9:
                ((sw0) this.f29620b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f29620b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pl0(Object obj, View view, int i10) {
        this.f29619a = i10;
        this.f29620b = obj;
        this.f29621c = view;
    }

    public pl0(ql0 ql0Var, z00 z00Var, s4.n0 n0Var) {
        this.f29619a = 0;
        this.f29621c = ql0Var;
        this.f29620b = z00Var;
    }
}
