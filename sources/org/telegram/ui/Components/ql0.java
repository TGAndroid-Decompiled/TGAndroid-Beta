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
import org.telegram.ui.cj1;
import org.telegram.ui.gi1;
public final class ql0 extends AnimatorListenerAdapter {
    public final int f28322a;
    public final Object f28323b;
    public final Object f28324c;

    public ql0(int i10, Object obj, Object obj2) {
        this.f28322a = i10;
        this.f28324c = obj;
        this.f28323b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28322a) {
            case 11:
                ((ProfileActivity) this.f28324c).C5 = null;
                return;
            case 12:
                org.telegram.ui.l31 l31Var = (org.telegram.ui.l31) this.f28324c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f28323b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, l31Var.e[0], iArr[0]), i0.a.d(floatValue, l31Var.e[1], iArr[1]), i0.a.d(floatValue, l31Var.e[2], iArr[2]), i0.a.d(floatValue, l31Var.e[3], iArr[3])}, 0, l31Var.e, 0, 4);
                    return;
                }
                return;
            case 18:
                ((r0.m0) this.f28323b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f28322a;
        Object obj = this.f28323b;
        Object obj2 = this.f28324c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.fr frVar = (org.telegram.ui.fr) obj2;
                ((rl0) frVar.d).f28570g.remove((AnimatorSet) obj);
                if (((rl0) frVar.d).f28570g.isEmpty()) {
                    ((rl0) frVar.d).f28567b.clear();
                    rl0 rl0Var = (rl0) frVar.d;
                    rl0Var.d = true;
                    rl0Var.f28566a.invalidate();
                    return;
                }
                return;
            case 1:
                wp0 wp0Var = (wp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(wp0Var.B);
                } catch (Exception unused) {
                }
                g90 g90Var = wp0Var.C;
                if (g90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g90Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                ow0 ow0Var = (ow0) gVar.f1033c;
                ow0Var.f27773f0 = 1.0f;
                ow0Var.S.add((kw0) obj);
                ((ow0) gVar.f1033c).f27765a0.setShader(null);
                ((ow0) gVar.f1033c).f27769c0.setShader(null);
                ((ow0) gVar.f1033c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                by0 by0Var = (by0) obj2;
                by0Var.f23567b = 0.0f;
                by0Var.invalidate();
                ((kn0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) obj2;
                j3Var.d.setText((String) obj);
                j3Var.d.setTranslationY(0.0f);
                j3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.j3) obj2).removeView((org.telegram.ui.Components.voip.i3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.yy) obj2).R3 = null;
                return;
            case 7:
                org.telegram.ui.o80 o80Var = (org.telegram.ui.o80) obj2;
                o80Var.removeView((z30) obj);
                o80Var.e = null;
                o80Var.f38565a = null;
                o80Var.f38566b = false;
                return;
            case 8:
                tw0 tw0Var = (tw0) obj2;
                tw0Var.setVisibility(8);
                tw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                uf0 uf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = uf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uf0Var.f29369f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = uf0Var.f29372s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = uf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                uf0Var.h = true;
                uf0Var.f29370n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                uf0Var.f29372s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(uf0Var, uf0Var.E, 0.0f, 1.0f));
                uf0Var.f29372s.setDuration(250L);
                uf0Var.f29372s.setInterpolator(new OvershootInterpolator(1.01f));
                uf0Var.f29372s.addListener(new sf0(uf0Var, 0));
                uf0Var.f29372s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f32118z2, photoViewer.f31923d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(es.f24466g);
                photoViewer.A2.addListener(new org.telegram.ui.kj0(this, 5));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.px0 px0Var = (org.telegram.ui.px0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = px0Var.f39026n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != px0Var.e) {
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
                        org.telegram.ui.q01 q01Var = profileActivity.O;
                        if (q01Var.t0(q01Var.f31045k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f31059r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f32301j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.kj0(this, 17));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.l31 l31Var = (org.telegram.ui.l31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, l31Var.e, 0, 4);
                }
                l31Var.f37596n = null;
                l31Var.f37598s = null;
                cd0 cd0Var = l31Var.h;
                cd0Var.K = 1.0f;
                cd0Var.i();
                l31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) obj2;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.f39278n.unlock();
                    ((org.telegram.ui.zx) obj).onTransitionAnimationEnd(true, false);
                    r41Var.e = 1.0f;
                    r41Var.g();
                    r41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.jv0 jv0Var = (org.telegram.ui.jv0) obj;
                if (jv0Var != null) {
                    jv0Var.f37145a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f32469s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.tz0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.h71) obj).run();
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) obj2;
                org.telegram.ui.g61 g61Var = r71Var.X0;
                if (g61Var != null) {
                    g61Var.dismiss();
                    r71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                gi1 gi1Var = (gi1) obj2;
                gi1Var.removeView((z30) obj);
                gi1Var.e = null;
                gi1Var.f36226a = null;
                gi1Var.f36227b = false;
                UsersSelectActivity usersSelectActivity = gi1Var.f36229f;
                usersSelectActivity.f32603c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f32603c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                cj1 cj1Var = (cj1) obj2;
                cj1Var.f34687e0.setScaleX(1.15f);
                cj1Var.f34687e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cj1Var.f34687e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                cj1Var.f34687e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f43521a.d(1.0f);
                r0.q0.e((View) obj2, w0Var);
                return;
            case 20:
                rg.c2 c2Var = (rg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.f43975r0.b(c2Var.f43982y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.f43983z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f45441w = false;
                ((sg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f45269s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new sg.i1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 23:
                di.aa aaVar = (di.aa) obj2;
                aaVar.removeView((z30) obj);
                aaVar.h.clear();
                aaVar.f6636b = null;
                aaVar.f6637c = false;
                ((yg.i) aaVar.f6639n).f48767b.setAllowDrawCursor(true);
                return;
            default:
                zh.j8 j8Var = (zh.j8) obj2;
                j8Var.f50734b.remove((zh.i8) obj);
                j8Var.f1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28322a) {
            case 8:
                ((tw0) this.f28323b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f28323b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ql0(Object obj, View view, int i10) {
        this.f28322a = i10;
        this.f28323b = obj;
        this.f28324c = view;
    }
}
