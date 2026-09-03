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
import org.telegram.ui.ii1;
import org.telegram.ui.mh1;
public final class ex0 extends AnimatorListenerAdapter {
    public final int f24714a;
    public final Object f24715b;
    public final Object f24716c;

    public ex0(int i10, Object obj, Object obj2) {
        this.f24714a = i10;
        this.f24716c = obj;
        this.f24715b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24714a) {
            case 8:
                ((ProfileActivity) this.f24716c).f32179z5 = null;
                return;
            case 9:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) this.f24716c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f24715b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, u21Var.e[0], iArr[0]), i0.a.d(floatValue, u21Var.e[1], iArr[1]), i0.a.d(floatValue, u21Var.e[2], iArr[2]), i0.a.d(floatValue, u21Var.e[3], iArr[3])}, 0, u21Var.e, 0, 4);
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
        int i10 = this.f24714a;
        Object obj = this.f24715b;
        Object obj2 = this.f24716c;
        switch (i10) {
            case 0:
                fx0 fx0Var = (fx0) obj2;
                fx0Var.f24976b = 0.0f;
                fx0Var.invalidate();
                ((om0) obj).invalidate();
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
                ((org.telegram.ui.qy) obj2).O3 = null;
                return;
            case 4:
                org.telegram.ui.d80 d80Var = (org.telegram.ui.d80) obj2;
                d80Var.removeView((o30) obj);
                d80Var.e = null;
                d80Var.f33368a = null;
                d80Var.f33369b = false;
                return;
            case 5:
                vv0 vv0Var = (vv0) obj2;
                vv0Var.setVisibility(8);
                vv0Var.setX(0.0f);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ze0 ze0Var = photoViewer.f31898z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ze0Var.e;
                if (bitmap != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ze0Var.f31374f = z4;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ze0Var.f31377s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ze0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ze0Var.h = true;
                ze0Var.f31375n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ze0Var.f31377s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ze0Var, ze0Var.B, 0.0f, 1.0f));
                ze0Var.f31377s.setDuration(250L);
                ze0Var.f31377s.setInterpolator(new OvershootInterpolator(1.01f));
                ze0Var.f31377s.addListener(new xe0(ze0Var, 0));
                ze0Var.f31377s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f31880x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31870w2, photoViewer.f31673a4, 0.0f));
                photoViewer.f31880x2.setDuration(85L);
                photoViewer.f31880x2.setInterpolator(mr.f27123g);
                photoViewer.f31880x2.addListener(new org.telegram.ui.ss0(this, 0));
                photoViewer.f31880x2.start();
                return;
            case 7:
                org.telegram.ui.vw0 vw0Var = (org.telegram.ui.vw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f39214n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.R.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i11);
                    if (childAt != vw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f32179z5 != null) {
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
                        org.telegram.ui.zz0 zz0Var = profileActivity.L;
                        if (zz0Var.s0(zz0Var.f31131h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.f31144o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f32050g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ss0(this, 12));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f32179z5 = null;
                return;
            case 9:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, u21Var.e, 0, 4);
                }
                u21Var.f38678n = null;
                u21Var.f38680s = null;
                ec0 ec0Var = u21Var.h;
                ec0Var.K = 1.0f;
                ec0Var.i();
                u21Var.h.s(1.0f);
                return;
            case 10:
                org.telegram.ui.a41 a41Var = (org.telegram.ui.a41) obj2;
                if (a41Var.h != null) {
                    a41Var.h = null;
                    a41Var.f32457n.unlock();
                    ((org.telegram.ui.sx) obj).onTransitionAnimationEnd(true, false);
                    a41Var.e = 1.0f;
                    a41Var.g();
                    a41Var.d(false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.qu0 qu0Var = (org.telegram.ui.qu0) obj;
                if (qu0Var != null) {
                    qu0Var.f37487a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f32238s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.sz0(this, 11));
                return;
            case 12:
                ((org.telegram.ui.m61) obj).run();
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) obj2;
                org.telegram.ui.l51 l51Var = x61Var.U0;
                if (l51Var != null) {
                    l51Var.dismiss();
                    x61Var.U0 = null;
                    return;
                }
                return;
            case 13:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.removeView((o30) obj);
                mh1Var.e = null;
                mh1Var.f36091a = null;
                mh1Var.f36092b = false;
                UsersSelectActivity usersSelectActivity = mh1Var.f36094f;
                usersSelectActivity.f32363c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.f32363c.setHintVisible(true, true);
                    return;
                }
                return;
            case 14:
                ((Runnable) obj).run();
                ii1 ii1Var = (ii1) obj2;
                ii1Var.f34948b0.setScaleX(1.15f);
                ii1Var.f34948b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ii1Var.f34948b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ii1Var.f34948b0.setVisibility(8);
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
                d3Var.f41488c = null;
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
                jVar.removeView((o30) obj);
                jVar.h.clear();
                jVar.f10541b = null;
                jVar.f10542c = false;
                ph.b8 b8Var = (ph.b8) jVar.f10544n;
                b8Var.f41332a.setAllowDrawCursor(true);
                ph.q7 q7Var = b8Var.f41335f;
                if (q7Var != null) {
                    q7Var.run();
                }
                if (b8Var.H) {
                    b8Var.fullScroll(130);
                    b8Var.H = false;
                    return;
                }
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f43177a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                vf.g gVar = (vf.g) obj2;
                gVar.f45785b.clear();
                gVar.f45785b.add((xf.d) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                vf.g gVar2 = (vf.g) obj2;
                gVar2.f45788c.clear();
                gVar2.f45788c.add((xf.b) obj);
                return;
            case 22:
                vh.y1 y1Var = (vh.y1) obj2;
                y1Var.B = false;
                y1Var.v.setAlpha(1.0f);
                y1Var.v.f22827w1.setVisibility(0);
                y1Var.f46404x.p(AndroidUtilities.dp(22.0f));
                y1Var.f46404x.setAlpha(255);
                ug.f fVar = y1Var.f46397s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22980h0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24714a) {
            case 5:
                ((vv0) this.f24715b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ex0(Object obj, View view, int i10) {
        this.f24714a = i10;
        this.f24715b = obj;
        this.f24716c = view;
    }
}
