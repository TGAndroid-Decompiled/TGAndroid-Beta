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
public final class cl0 extends AnimatorListenerAdapter {
    public final int f25412a;
    public final Object f25413b;
    public final Object f25414c;

    public cl0(int i10, Object obj, Object obj2) {
        this.f25412a = i10;
        this.f25414c = obj;
        this.f25413b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25412a) {
            case 11:
                ((ProfileActivity) this.f25414c).C5 = null;
                return;
            case 12:
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) this.f25414c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f25413b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, y21Var.f43019e[0], iArr[0]), i0.a.d(floatValue, y21Var.f43019e[1], iArr[1]), i0.a.d(floatValue, y21Var.f43019e[2], iArr[2]), i0.a.d(floatValue, y21Var.f43019e[3], iArr[3])}, 0, y21Var.f43019e, 0, 4);
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
        int i10 = this.f25412a;
        Object obj = this.f25413b;
        Object obj2 = this.f25414c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.yq yqVar = (org.telegram.ui.yq) obj2;
                ((dl0) yqVar.d).f25761g.remove((AnimatorSet) obj);
                if (((dl0) yqVar.d).f25761g.isEmpty()) {
                    ((dl0) yqVar.d).f25757b.clear();
                    dl0 dl0Var = (dl0) yqVar.d;
                    dl0Var.d = true;
                    dl0Var.f25756a.invalidate();
                    return;
                }
                return;
            case 1:
                op0 op0Var = (op0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(op0Var.B);
                } catch (Exception unused) {
                }
                uo0 uo0Var = op0Var.C;
                if (uo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(uo0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                lw0 lw0Var = (lw0) gVar.f2050c;
                lw0Var.f28451f0 = 1.0f;
                lw0Var.S.add((hw0) obj);
                ((lw0) gVar.f2050c).f28442a0.setShader(null);
                ((lw0) gVar.f2050c).f28446c0.setShader(null);
                ((lw0) gVar.f2050c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                yx0 yx0Var = (yx0) obj2;
                yx0Var.f33267b = 0.0f;
                yx0Var.invalidate();
                ((an0) obj).invalidate();
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
                ((org.telegram.ui.uy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((q30) obj);
                j80Var.f37598e = null;
                j80Var.f37595a = null;
                j80Var.f37596b = false;
                return;
            case 8:
                qw0 qw0Var = (qw0) obj2;
                qw0Var.setVisibility(8);
                qw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gf0 gf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = gf0Var.f26852e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gf0Var.f26853f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = gf0Var.f26856s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = gf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                gf0Var.h = true;
                gf0Var.f26854n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                gf0Var.f26856s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gf0Var, gf0Var.E, 0.0f, 1.0f));
                gf0Var.f26856s.setDuration(250L);
                gf0Var.f26856s.setInterpolator(new OvershootInterpolator(1.01f));
                gf0Var.f26856s.addListener(new ef0(gf0Var, 0));
                gf0Var.f26856s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34083z2, photoViewer.f33888d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(tr.f31141g);
                photoViewer.A2.addListener(new org.telegram.ui.ap0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.dx0 dx0Var = (org.telegram.ui.dx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f35855n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != dx0Var.f35853e) {
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
                        org.telegram.ui.e01 e01Var = profileActivity.O;
                        if (e01Var.s0(e01Var.f29776k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f29790r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34272j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.ap0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, y21Var.f43019e, 0, 4);
                }
                y21Var.f43021n = null;
                y21Var.f43023s = null;
                pc0 pc0Var = y21Var.h;
                pc0Var.K = 1.0f;
                pc0Var.i();
                y21Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.f41 f41Var = (org.telegram.ui.f41) obj2;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.f36182n.unlock();
                    ((org.telegram.ui.tx) obj).onTransitionAnimationEnd(true, false);
                    f41Var.f36180e = 1.0f;
                    f41Var.g();
                    f41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.yu0 yu0Var = (org.telegram.ui.yu0) obj;
                if (yu0Var != null) {
                    yu0Var.f43619a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34443s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hz0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.s61) obj).run();
                org.telegram.ui.c71 c71Var = (org.telegram.ui.c71) obj2;
                org.telegram.ui.r51 r51Var = c71Var.X0;
                if (r51Var != null) {
                    r51Var.dismiss();
                    c71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                qh1 qh1Var = (qh1) obj2;
                qh1Var.removeView((q30) obj);
                qh1Var.f39734e = null;
                qh1Var.f39731a = null;
                qh1Var.f39732b = false;
                UsersSelectActivity usersSelectActivity = qh1Var.f39735f;
                usersSelectActivity.f34584c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34584c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                mi1 mi1Var = (mi1) obj2;
                mi1Var.f38615e0.setScaleX(1.15f);
                mi1Var.f38615e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mi1Var.f38615e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mi1Var.f38615e0.setVisibility(8);
                return;
            case 18:
                qg.a2 a2Var = (qg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f44956r0.b(a2Var.f44963y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f44964z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f45636a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.y0) obj2).f46389w = false;
                ((rg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.m1 m1Var = (rg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46202s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.aa aaVar = (ci.aa) obj2;
                aaVar.removeView((q30) obj);
                aaVar.h.clear();
                aaVar.f4709b = null;
                aaVar.f4710c = false;
                ((xg.i) aaVar.f4713n).f49851b.setAllowDrawCursor(true);
                return;
            default:
                yh.r8 r8Var = (yh.r8) obj2;
                r8Var.f51918b.remove((yh.q8) obj);
                r8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25412a) {
            case 8:
                ((qw0) this.f25413b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public cl0(Object obj, View view, int i10) {
        this.f25412a = i10;
        this.f25413b = obj;
        this.f25414c = view;
    }
}
