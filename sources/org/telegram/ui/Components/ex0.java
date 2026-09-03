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
    public final int f26690a;
    public final Object f26691b;
    public final Object f26692c;

    public ex0(int i10, Object obj, Object obj2) {
        this.f26690a = i10;
        this.f26692c = obj;
        this.f26691b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26690a) {
            case 8:
                ((ProfileActivity) this.f26692c).f34738z5 = null;
                return;
            case 9:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) this.f26692c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f26691b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, u21Var.f41707e[0], iArr[0]), i0.a.d(floatValue, u21Var.f41707e[1], iArr[1]), i0.a.d(floatValue, u21Var.f41707e[2], iArr[2]), i0.a.d(floatValue, u21Var.f41707e[3], iArr[3])}, 0, u21Var.f41707e, 0, 4);
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
        int i10 = this.f26690a;
        Object obj = this.f26691b;
        Object obj2 = this.f26692c;
        switch (i10) {
            case 0:
                fx0 fx0Var = (fx0) obj2;
                fx0Var.f27022b = 0.0f;
                fx0Var.invalidate();
                ((pm0) obj).invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                return;
            case 2:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                return;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.py) obj2).O3 = null;
                return;
            case 4:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) obj2;
                c80Var.removeView((p30) obj);
                c80Var.f35715e = null;
                c80Var.f35712a = null;
                c80Var.f35713b = false;
                return;
            case 5:
                vv0 vv0Var = (vv0) obj2;
                vv0Var.setVisibility(8);
                vv0Var.setX(0.0f);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                af0 af0Var = photoViewer.f34450z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = af0Var.f25242e;
                if (bitmap != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                af0Var.f25243f = z4;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = af0Var.f25246s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = af0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                af0Var.h = true;
                af0Var.f25244n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                af0Var.f25246s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(af0Var, af0Var.B, 0.0f, 1.0f));
                af0Var.f25246s.setDuration(250L);
                af0Var.f25246s.setInterpolator(new OvershootInterpolator(1.01f));
                af0Var.f25246s.addListener(new ye0(af0Var, 0));
                af0Var.f25246s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f34432x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34422w2, photoViewer.f34224a4, 0.0f));
                photoViewer.f34432x2.setDuration(85L);
                photoViewer.f34432x2.setInterpolator(pr.f30169g);
                photoViewer.f34432x2.addListener(new org.telegram.ui.ss0(this, 0));
                photoViewer.f34432x2.start();
                return;
            case 7:
                org.telegram.ui.vw0 vw0Var = (org.telegram.ui.vw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f42226n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.R.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i11);
                    if (childAt != vw0Var.f42224e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f34738z5 != null) {
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
                        if (zz0Var.s0(zz0Var.f33625h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.f33638o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34609g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ss0(this, 12));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f34738z5 = null;
                return;
            case 9:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, u21Var.f41707e, 0, 4);
                }
                u21Var.f41709n = null;
                u21Var.f41711s = null;
                fc0 fc0Var = u21Var.h;
                fc0Var.K = 1.0f;
                fc0Var.i();
                u21Var.h.s(1.0f);
                return;
            case 10:
                org.telegram.ui.a41 a41Var = (org.telegram.ui.a41) obj2;
                if (a41Var.h != null) {
                    a41Var.h = null;
                    a41Var.f35017n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    a41Var.f35015e = 1.0f;
                    a41Var.g();
                    a41Var.d(false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.qu0 qu0Var = (org.telegram.ui.qu0) obj;
                if (qu0Var != null) {
                    qu0Var.f40678a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34800s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.sz0(this, 11));
                return;
            case 12:
                ((org.telegram.ui.m61) obj).run();
                org.telegram.ui.w61 w61Var = (org.telegram.ui.w61) obj2;
                org.telegram.ui.l51 l51Var = w61Var.U0;
                if (l51Var != null) {
                    l51Var.dismiss();
                    w61Var.U0 = null;
                    return;
                }
                return;
            case 13:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.removeView((p30) obj);
                mh1Var.f38983e = null;
                mh1Var.f38980a = null;
                mh1Var.f38981b = false;
                UsersSelectActivity usersSelectActivity = mh1Var.f38984f;
                usersSelectActivity.f34932c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.f34932c.setHintVisible(true, true);
                    return;
                }
                return;
            case 14:
                ((Runnable) obj).run();
                ii1 ii1Var = (ii1) obj2;
                ii1Var.f37674b0.setScaleX(1.15f);
                ii1Var.f37674b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ii1Var.f37674b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ii1Var.f37674b0.setVisibility(8);
                return;
            case 15:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((qh.j2) obj2).h.h.setVisibility(8);
                return;
            case 16:
                qh.c3 c3Var = (qh.c3) obj2;
                c3Var.f45165c = null;
                c3Var.f45166e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 17:
                qh.n nVar = (qh.n) obj2;
                ((eg.z2) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 18:
                lg.j jVar = (lg.j) obj2;
                jVar.removeView((p30) obj);
                jVar.h.clear();
                jVar.f12555b = null;
                jVar.f12556c = false;
                qh.z7 z7Var = (qh.z7) jVar.f12559n;
                z7Var.f46412a.setAllowDrawCursor(true);
                qh.o7 o7Var = z7Var.f46416f;
                if (o7Var != null) {
                    o7Var.run();
                }
                if (z7Var.H) {
                    z7Var.fullScroll(130);
                    z7Var.H = false;
                    return;
                }
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f46510a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                wf.g gVar = (wf.g) obj2;
                gVar.f49581b.clear();
                gVar.f49581b.add((yf.d) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                wf.g gVar2 = (wf.g) obj2;
                gVar2.f49584c.clear();
                gVar2.f49584c.add((yf.b) obj);
                return;
            case 22:
                wh.z1 z1Var = (wh.z1) obj2;
                z1Var.B = false;
                z1Var.v.setAlpha(1.0f);
                z1Var.v.f24696w1.setVisibility(0);
                z1Var.f50249x.p(AndroidUtilities.dp(22.0f));
                z1Var.f50249x.setAlpha(255);
                vg.f fVar = z1Var.f50242s;
                fVar.f49323e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24857h0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26690a) {
            case 5:
                ((vv0) this.f26691b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ex0(Object obj, View view, int i10) {
        this.f26690a = i10;
        this.f26691b = obj;
        this.f26692c = view;
    }
}
