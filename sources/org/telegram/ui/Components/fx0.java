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
import org.telegram.ui.ci1;
import org.telegram.ui.gh1;
public final class fx0 extends AnimatorListenerAdapter {
    public final int f27033a;
    public final Object f27034b;
    public final Object f27035c;

    public fx0(int i10, Object obj, Object obj2) {
        this.f27033a = i10;
        this.f27035c = obj;
        this.f27034b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27033a) {
            case 8:
                ((ProfileActivity) this.f27035c).f34738z5 = null;
                return;
            case 9:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) this.f27035c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f27034b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, o21Var.f39568e[0], iArr[0]), i0.a.d(floatValue, o21Var.f39568e[1], iArr[1]), i0.a.d(floatValue, o21Var.f39568e[2], iArr[2]), i0.a.d(floatValue, o21Var.f39568e[3], iArr[3])}, 0, o21Var.f39568e, 0, 4);
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
        int i10 = this.f27033a;
        Object obj = this.f27034b;
        Object obj2 = this.f27035c;
        switch (i10) {
            case 0:
                gx0 gx0Var = (gx0) obj2;
                gx0Var.f27311b = 0.0f;
                gx0Var.invalidate();
                ((qm0) obj).invalidate();
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
                c80Var.f35708e = null;
                c80Var.f35705a = null;
                c80Var.f35706b = false;
                return;
            case 5:
                wv0 wv0Var = (wv0) obj2;
                wv0Var.setVisibility(8);
                wv0Var.setX(0.0f);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                af0 af0Var = photoViewer.f34450z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = af0Var.f25250e;
                if (bitmap != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                af0Var.f25251f = z4;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = af0Var.f25254s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = af0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                af0Var.h = true;
                af0Var.f25252n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                af0Var.f25254s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(af0Var, af0Var.B, 0.0f, 1.0f));
                af0Var.f25254s.setDuration(250L);
                af0Var.f25254s.setInterpolator(new OvershootInterpolator(1.01f));
                af0Var.f25254s.addListener(new ye0(af0Var, 0));
                af0Var.f25254s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f34432x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34422w2, photoViewer.f34224a4, 0.0f));
                photoViewer.f34432x2.setDuration(85L);
                photoViewer.f34432x2.setInterpolator(pr.f30184g);
                photoViewer.f34432x2.addListener(new org.telegram.ui.ns0(this, 0));
                photoViewer.f34432x2.start();
                return;
            case 7:
                org.telegram.ui.qw0 qw0Var = (org.telegram.ui.qw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40712n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.R.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i11);
                    if (childAt != qw0Var.f40710e) {
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
                        org.telegram.ui.uz0 uz0Var = profileActivity.L;
                        if (uz0Var.s0(uz0Var.f33980h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.f33993o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34609g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ns0(this, 12));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f34738z5 = null;
                return;
            case 9:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, o21Var.f39568e, 0, 4);
                }
                o21Var.f39570n = null;
                o21Var.f39572s = null;
                fc0 fc0Var = o21Var.h;
                fc0Var.K = 1.0f;
                fc0Var.i();
                o21Var.h.s(1.0f);
                return;
            case 10:
                org.telegram.ui.v31 v31Var = (org.telegram.ui.v31) obj2;
                if (v31Var.h != null) {
                    v31Var.h = null;
                    v31Var.f42115n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    v31Var.f42113e = 1.0f;
                    v31Var.g();
                    v31Var.d(false);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) obj;
                if (lu0Var != null) {
                    lu0Var.f38864a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34800s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xy0(this, 12));
                return;
            case 12:
                ((org.telegram.ui.h61) obj).run();
                org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) obj2;
                org.telegram.ui.g51 g51Var = r61Var.U0;
                if (g51Var != null) {
                    g51Var.dismiss();
                    r61Var.U0 = null;
                    return;
                }
                return;
            case 13:
                gh1 gh1Var = (gh1) obj2;
                gh1Var.removeView((p30) obj);
                gh1Var.f37202e = null;
                gh1Var.f37199a = null;
                gh1Var.f37200b = false;
                UsersSelectActivity usersSelectActivity = gh1Var.f37203f;
                usersSelectActivity.f34932c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.f34932c.setHintVisible(true, true);
                    return;
                }
                return;
            case 14:
                ((Runnable) obj).run();
                ci1 ci1Var = (ci1) obj2;
                ci1Var.f35822b0.setScaleX(1.15f);
                ci1Var.f35822b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ci1Var.f35822b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ci1Var.f35822b0.setVisibility(8);
                return;
            case 15:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((qh.k2) obj2).h.h.setVisibility(8);
                return;
            case 16:
                qh.d3 d3Var = (qh.d3) obj2;
                d3Var.f45199c = null;
                d3Var.f45200e = null;
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
                jVar.f12553b = null;
                jVar.f12554c = false;
                qh.a8 a8Var = (qh.a8) jVar.f12557n;
                a8Var.f44917a.setAllowDrawCursor(true);
                qh.p7 p7Var = a8Var.f44921f;
                if (p7Var != null) {
                    p7Var.run();
                }
                if (a8Var.H) {
                    a8Var.fullScroll(130);
                    a8Var.H = false;
                    return;
                }
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f46479a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                wf.g gVar = (wf.g) obj2;
                gVar.f49544b.clear();
                gVar.f49544b.add((yf.d) obj);
                return;
            case 21:
                super.onAnimationEnd(animator);
                wf.g gVar2 = (wf.g) obj2;
                gVar2.f49547c.clear();
                gVar2.f49547c.add((yf.b) obj);
                return;
            case 22:
                wh.z1 z1Var = (wh.z1) obj2;
                z1Var.B = false;
                z1Var.v.setAlpha(1.0f);
                z1Var.v.f24694w1.setVisibility(0);
                z1Var.f50212x.p(AndroidUtilities.dp(22.0f));
                z1Var.f50212x.setAlpha(255);
                vg.f fVar = z1Var.f50205s;
                fVar.f49286e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24855h0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27033a) {
            case 5:
                ((wv0) this.f27034b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fx0(Object obj, View view, int i10) {
        this.f27033a = i10;
        this.f27034b = obj;
        this.f27035c = view;
    }
}
