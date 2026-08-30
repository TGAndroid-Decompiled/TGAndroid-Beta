package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.eh1;
public final class ex0 extends AnimatorListenerAdapter {
    public final int f24695a;
    public final Object f24696b;
    public final Object f24697c;

    public ex0(int i10, Object obj, Object obj2) {
        this.f24695a = i10;
        this.f24697c = obj;
        this.f24696b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24695a) {
            case 8:
                ((ProfileActivity) this.f24697c).f32205z5 = null;
                return;
            case 9:
                org.telegram.ui.m21 m21Var = (org.telegram.ui.m21) this.f24697c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f24696b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, m21Var.e[0], iArr[0]), i0.a.d(floatValue, m21Var.e[1], iArr[1]), i0.a.d(floatValue, m21Var.e[2], iArr[2]), i0.a.d(floatValue, m21Var.e[3], iArr[3])}, 0, m21Var.e, 0, 4);
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
        boolean z4;
        int i10 = this.f24695a;
        Object obj = this.f24696b;
        Object obj2 = this.f24697c;
        switch (i10) {
            case 0:
                fx0 fx0Var = (fx0) obj2;
                fx0Var.f24970b = 0.0f;
                fx0Var.invalidate();
                ((pm0) obj).invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                return;
            case 2:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                return;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.oy) obj2).O3 = null;
                return;
            case 4:
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) obj2;
                b80Var.removeView((n30) obj);
                b80Var.e = null;
                b80Var.f32839a = null;
                b80Var.f32840b = false;
                return;
            case 5:
                vv0 vv0Var = (vv0) obj2;
                vv0Var.setVisibility(8);
                vv0Var.setX(0.0f);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ye0 ye0Var = photoViewer.f31924z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ye0Var.e;
                if (bitmap != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ye0Var.f31006f = z4;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ye0Var.f31009s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ye0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ye0Var.h = true;
                ye0Var.f31007n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ye0Var.f31009s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ye0Var, ye0Var.B, 0.0f, 1.0f));
                ye0Var.f31009s.setDuration(250L);
                ye0Var.f31009s.setInterpolator(new OvershootInterpolator(1.01f));
                ye0Var.f31009s.addListener(new we0(ye0Var, 0));
                ye0Var.f31009s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f31906x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31896w2, photoViewer.f31699a4, 0.0f));
                photoViewer.f31906x2.setDuration(85L);
                photoViewer.f31906x2.setInterpolator(nr.f27347g);
                photoViewer.f31906x2.addListener(new org.telegram.ui.ls0(this, 0));
                photoViewer.f31906x2.start();
                return;
            case 7:
                org.telegram.ui.ow0 ow0Var = (org.telegram.ui.ow0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ow0Var.f36994n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.R.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i11);
                    if (childAt != ow0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f32205z5 != null) {
                    if (profileActivity.C5) {
                        if (profileActivity.I0) {
                            profileActivity.N0.setVisibility(8);
                        }
                        if (profileActivity.J0) {
                            profileActivity.O0.setVisibility(8);
                        }
                        if (profileActivity.K0) {
                            profileActivity.P0.setVisibility(8);
                        }
                        profileActivity.Q0.setVisibility(8);
                    } else {
                        org.telegram.ui.sz0 sz0Var = profileActivity.L;
                        if (sz0Var.s0(sz0Var.f31120h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.f31133o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f32076g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ls0(this, 12));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f32205z5 = null;
                return;
            case 9:
                org.telegram.ui.m21 m21Var = (org.telegram.ui.m21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, m21Var.e, 0, 4);
                }
                m21Var.f36173n = null;
                m21Var.f36175s = null;
                dc0 dc0Var = m21Var.h;
                dc0Var.K = 1.0f;
                dc0Var.i();
                m21Var.h.s(1.0f);
                return;
            case 10:
                org.telegram.ui.t31 t31Var = (org.telegram.ui.t31) obj2;
                if (t31Var.h != null) {
                    t31Var.h = null;
                    t31Var.f38532n.unlock();
                    ((org.telegram.ui.qx) obj).onTransitionAnimationEnd(true, false);
                    t31Var.e = 1.0f;
                    t31Var.g();
                    t31Var.d(false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) obj;
                if (ju0Var != null) {
                    ju0Var.f35495a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f32264s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vy0(this, 13));
                return;
            case 12:
                ((org.telegram.ui.f61) obj).run();
                org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) obj2;
                org.telegram.ui.e51 e51Var = q61Var.U0;
                if (e51Var != null) {
                    e51Var.dismiss();
                    q61Var.U0 = null;
                    return;
                }
                return;
            case 13:
                eh1 eh1Var = (eh1) obj2;
                eh1Var.removeView((n30) obj);
                eh1Var.e = null;
                eh1Var.f34021a = null;
                eh1Var.f34022b = false;
                UsersSelectActivity usersSelectActivity = eh1Var.f34024f;
                usersSelectActivity.f32389c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.f32389c.setHintVisible(true, true);
                    return;
                }
                return;
            case 14:
                ((Runnable) obj).run();
                ai1 ai1Var = (ai1) obj2;
                ai1Var.f32602b0.setScaleX(1.15f);
                ai1Var.f32602b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ai1Var.f32602b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ai1Var.f32602b0.setVisibility(8);
                return;
            case 15:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((ph.k2) obj2).h.h.setVisibility(8);
                return;
            case 16:
                ph.d3 d3Var = (ph.d3) obj2;
                d3Var.f41438c = null;
                d3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 17:
                ph.n nVar = (ph.n) obj2;
                ((dg.b3) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 18:
                kg.j jVar = (kg.j) obj2;
                jVar.removeView((n30) obj);
                jVar.h.clear();
                jVar.f10431b = null;
                jVar.f10432c = false;
                ph.c8 c8Var = (ph.c8) jVar.f10434n;
                c8Var.f41381a.setAllowDrawCursor(true);
                ph.r7 r7Var = c8Var.f41384f;
                if (r7Var != null) {
                    r7Var.run();
                }
                if (c8Var.H) {
                    c8Var.fullScroll(130);
                    c8Var.H = false;
                    return;
                }
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f43153a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                vf.g gVar = (vf.g) obj2;
                gVar.f45707b.clear();
                gVar.f45707b.add((xf.d) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                vf.g gVar2 = (vf.g) obj2;
                gVar2.f45710c.clear();
                gVar2.f45710c.add((xf.b) obj);
                return;
            case 22:
                vh.y1 y1Var = (vh.y1) obj2;
                y1Var.B = false;
                y1Var.v.setAlpha(1.0f);
                y1Var.v.f22854w1.setVisibility(0);
                y1Var.f46319x.p(AndroidUtilities.dp(22.0f));
                y1Var.f46319x.setAlpha(255);
                ug.f fVar = y1Var.f46312s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f23007h0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24695a) {
            case 5:
                ((vv0) this.f24696b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ex0(Object obj, View view, int i10) {
        this.f24695a = i10;
        this.f24696b = obj;
        this.f24697c = view;
    }
}
