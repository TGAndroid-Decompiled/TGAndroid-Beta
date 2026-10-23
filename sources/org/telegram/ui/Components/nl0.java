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
import org.telegram.ui.hh1;
import org.telegram.ui.lg1;
public final class nl0 extends AnimatorListenerAdapter {
    public final int f28845a;
    public final Object f28846b;
    public final Object f28847c;

    public nl0(int i10, Object obj, Object obj2) {
        this.f28845a = i10;
        this.f28847c = obj;
        this.f28846b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28845a) {
            case 12:
                ((ProfileActivity) this.f28847c).E5 = null;
                return;
            case 18:
                ((r0.m0) this.f28846b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f28845a;
        Object obj = this.f28846b;
        Object obj2 = this.f28847c;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj;
                b10Var.setAlpha(1.0f);
                s4.n0.x0(b10Var);
                ol0 ol0Var = (ol0) obj2;
                ol0Var.f29071c.remove(b10Var);
                ol0Var.f29069a.removeView(b10Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.oq oqVar = (org.telegram.ui.oq) obj2;
                ((ol0) oqVar.d).f29073g.remove((AnimatorSet) obj);
                if (((ol0) oqVar.d).f29073g.isEmpty()) {
                    ((ol0) oqVar.d).f29070b.clear();
                    ol0 ol0Var2 = (ol0) oqVar.d;
                    ol0Var2.d = true;
                    ol0Var2.f29069a.invalidate();
                    return;
                }
                return;
            case 2:
                sp0 sp0Var = (sp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(sp0Var.B);
                } catch (Exception unused) {
                }
                ho0 ho0Var = sp0Var.C;
                if (ho0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ho0Var);
                    return;
                }
                return;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                lw0 lw0Var = (lw0) gVar.f2648c;
                lw0Var.f28301f0 = 1.0f;
                lw0Var.S.add((hw0) obj);
                ((lw0) gVar.f2648c).f28293a0.setShader(null);
                ((lw0) gVar.f2648c).f28297c0.setShader(null);
                ((lw0) gVar.f2648c).N();
                super.onAnimationEnd(animator);
                return;
            case 4:
                yx0 yx0Var = (yx0) obj2;
                yx0Var.f32754b = 0.0f;
                yx0Var.invalidate();
                ((hn0) obj).invalidate();
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
                ((org.telegram.ui.cy) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.q70 q70Var = (org.telegram.ui.q70) obj2;
                q70Var.removeView((v30) obj);
                q70Var.e = null;
                q70Var.f40498a = null;
                q70Var.f40499b = false;
                return;
            case 9:
                qw0 qw0Var = (qw0) obj2;
                qw0Var.setVisibility(8);
                qw0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                of0 of0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = of0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of0Var.f29043f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = of0Var.f29046s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = of0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                of0Var.h = true;
                of0Var.f29044n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                of0Var.f29046s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(of0Var, of0Var.E, 0.0f, 1.0f));
                of0Var.f29046s.setDuration(250L);
                of0Var.f29046s.setInterpolator(new OvershootInterpolator(1.01f));
                of0Var.f29046s.addListener(new mf0(of0Var, 0));
                of0Var.f29046s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33473z2, photoViewer.f33278d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(bs.f25026g);
                photoViewer.A2.addListener(new org.telegram.ui.zb0(this, 7));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.nw0 nw0Var = (org.telegram.ui.nw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39704n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != nw0Var.e) {
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
                        org.telegram.ui.nz0 nz0Var = profileActivity.O;
                        if (nz0Var.u0(nz0Var.f31051k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f31065r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33668l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.zb0(this, 19));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.E5 = null;
                return;
            case 13:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj2;
                if (x21Var.h != null) {
                    x21Var.h = null;
                    x21Var.f43007n.unlock();
                    ((org.telegram.ui.dx) obj).onTransitionAnimationEnd(true, false);
                    x21Var.e = 1.0f;
                    x21Var.g();
                    x21Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) obj;
                if (ju0Var != null) {
                    ju0Var.f38355a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f33828s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.qy0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.n51) obj).run();
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) obj2;
                org.telegram.ui.m41 m41Var = x51Var.X0;
                if (m41Var != null) {
                    m41Var.dismiss();
                    x51Var.X0 = null;
                    return;
                }
                return;
            case 16:
                lg1 lg1Var = (lg1) obj2;
                lg1Var.removeView((v30) obj);
                lg1Var.e = null;
                lg1Var.f38925a = null;
                lg1Var.f38926b = false;
                UsersSelectActivity usersSelectActivity = lg1Var.f38928f;
                usersSelectActivity.f33962c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f33962c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                hh1 hh1Var = (hh1) obj2;
                hh1Var.f37646e0.setScaleX(1.15f);
                hh1Var.f37646e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hh1Var.f37646e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                hh1Var.f37646e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f44863a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                rg.b2 b2Var = (rg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f45301r0.b(b2Var.f45308y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f45309z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f46519w = false;
                ((sg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46348s0.invalidate();
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
                n9Var.f9524b = null;
                n9Var.f9525c = false;
                ((yg.h) n9Var.f9527n).f50158b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28845a) {
            case 9:
                ((qw0) this.f28846b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f28846b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public nl0(Object obj, View view, int i10) {
        this.f28845a = i10;
        this.f28846b = obj;
        this.f28847c = view;
    }

    public nl0(ol0 ol0Var, b10 b10Var, s4.n0 n0Var) {
        this.f28845a = 0;
        this.f28847c = ol0Var;
        this.f28846b = b10Var;
    }
}
