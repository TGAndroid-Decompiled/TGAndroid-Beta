package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.mh1;
import org.telegram.ui.qg1;
public final class su0 extends AnimatorListenerAdapter {
    public final int f32554a;
    public final Object f32555b;
    public final Object f32556c;

    public su0(int i9, Object obj, Object obj2) {
        this.f32554a = i9;
        this.f32556c = obj;
        this.f32555b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32554a) {
            case 9:
                ((ProfileActivity) this.f32556c).f36089y5 = null;
                return;
            case 10:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) this.f32556c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f32555b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, z11Var.f45003e[0], iArr[0]), i0.a.d(floatValue, z11Var.f45003e[1], iArr[1]), i0.a.d(floatValue, z11Var.f45003e[2], iArr[2]), i0.a.d(floatValue, z11Var.f45003e[3], iArr[3])}, 0, z11Var.f45003e, 0, 4);
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
        int i9 = this.f32554a;
        Object obj = this.f32555b;
        Object obj2 = this.f32556c;
        switch (i9) {
            case 0:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                xu0 xu0Var = (xu0) gVar.f367c;
                xu0Var.f34774b0 = 1.0f;
                xu0Var.O.add((tu0) obj);
                ((xu0) gVar.f367c).T.setShader(null);
                ((xu0) gVar.f367c).V.setShader(null);
                ((xu0) gVar.f367c).N();
                super.onAnimationEnd(animator);
                return;
            case 1:
                lw0 lw0Var = (lw0) obj2;
                lw0Var.f30569b = 0.0f;
                lw0Var.invalidate();
                ((sl0) obj).invalidate();
                return;
            case 2:
                org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) obj2;
                j3Var.d.setText((String) obj);
                j3Var.d.setTranslationY(0.0f);
                j3Var.d.setAlpha(1.0f);
                return;
            case 3:
                ((org.telegram.ui.Components.voip.j3) obj2).removeView((org.telegram.ui.Components.voip.i3) obj);
                return;
            case 4:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.dy) obj2).N3 = null;
                return;
            case 5:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) obj2;
                p70Var.removeView((w20) obj);
                p70Var.f41354e = null;
                p70Var.f41351a = null;
                p70Var.f41352b = false;
                return;
            case 6:
                cv0 cv0Var = (cv0) obj2;
                cv0Var.setVisibility(8);
                cv0Var.setX(0.0f);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                be0 be0Var = photoViewer.f35799y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = be0Var.f27185e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                be0Var.f27186f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = be0Var.f27189s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = be0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                be0Var.h = true;
                be0Var.f27187n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                be0Var.f27189s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(be0Var, be0Var.A, 0.0f, 1.0f));
                be0Var.f27189s.setDuration(250L);
                be0Var.f27189s.setInterpolator(new OvershootInterpolator(1.01f));
                be0Var.f27189s.addListener(new zd0(be0Var, 0));
                be0Var.f27189s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f35781w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f35772v2, photoViewer.Z3, 0.0f));
                photoViewer.f35781w2.setDuration(85L);
                photoViewer.f35781w2.setInterpolator(gr.f28845g);
                photoViewer.f35781w2.addListener(new org.telegram.ui.bc0(this, 7));
                photoViewer.f35781w2.start();
                return;
            case 8:
                org.telegram.ui.fw0 fw0Var = (org.telegram.ui.fw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38361n;
                ((View) obj).setVisibility(8);
                for (int i10 = 0; i10 < premiumPreviewFragment.Q.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i10);
                    if (childAt != fw0Var.f38359e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f36089y5 != null) {
                    if (profileActivity.B5) {
                        if (profileActivity.H0) {
                            profileActivity.M0.setVisibility(8);
                        }
                        if (profileActivity.I0) {
                            profileActivity.N0.setVisibility(8);
                        }
                        if (profileActivity.J0) {
                            profileActivity.O0.setVisibility(8);
                        }
                        profileActivity.P0.setVisibility(8);
                    } else {
                        org.telegram.ui.hz0 hz0Var = profileActivity.K;
                        if (hz0Var.s0(hz0Var.f28137g0[0].B)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.K.f28150n0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.f36095z5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f35961f5, 1.0f));
                        profileActivity.f36095z5.setDuration(100L);
                        profileActivity.f36095z5.addListener(new org.telegram.ui.bc0(this, 19));
                        profileActivity.f36095z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f36089y5 = null;
                return;
            case 10:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, z11Var.f45003e, 0, 4);
                }
                z11Var.f45005n = null;
                z11Var.f45007s = null;
                jb0 jb0Var = z11Var.h;
                jb0Var.K = 1.0f;
                jb0Var.i();
                z11Var.h.s(1.0f);
                return;
            case 11:
                org.telegram.ui.h31 h31Var = (org.telegram.ui.h31) obj2;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.f38666n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    h31Var.f38664e = 1.0f;
                    h31Var.g();
                    h31Var.d(false);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.bu0 bu0Var = (org.telegram.ui.bu0) obj;
                if (bu0Var != null) {
                    bu0Var.f36978a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f36157s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                return;
            case 13:
                ((org.telegram.ui.r51) obj).run();
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) obj2;
                org.telegram.ui.q41 q41Var = b61Var.T0;
                if (q41Var != null) {
                    q41Var.dismiss();
                    b61Var.T0 = null;
                    return;
                }
                return;
            case 14:
                qg1 qg1Var = (qg1) obj2;
                qg1Var.removeView((w20) obj);
                qg1Var.f41798e = null;
                qg1Var.f41795a = null;
                qg1Var.f41796b = false;
                UsersSelectActivity usersSelectActivity = qg1Var.f41799f;
                usersSelectActivity.f36287c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.f36287c.setHintVisible(true, true);
                    return;
                }
                return;
            case 15:
                ((Runnable) obj).run();
                mh1 mh1Var = (mh1) obj2;
                mh1Var.f40429a0.setScaleX(1.15f);
                mh1Var.f40429a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mh1Var.f40429a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mh1Var.f40429a0.setVisibility(8);
                return;
            case 16:
                qf.g gVar2 = (qf.g) obj2;
                gVar2.f46196b.clear();
                gVar2.f46196b.add((sf.d) obj);
                return;
            case 17:
                super.onAnimationEnd(animator);
                qf.g gVar3 = (qf.g) obj2;
                gVar3.f46199c.clear();
                gVar3.f46199c.add((sf.b) obj);
                return;
            case 18:
                qh.x1 x1Var = (qh.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.f26193v1.setVisibility(0);
                x1Var.f46822x.p(AndroidUtilities.dp(22.0f));
                x1Var.f46822x.setAlpha(255);
                pg.f fVar = x1Var.f46815s;
                fVar.f45871e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f46956a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                return;
            case 20:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f26358g0 = null;
                return;
            case 21:
                yf.a2 a2Var = (yf.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f49741n0.b(a2Var.f49748u0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f49749v0 = 1.0f;
                return;
            case 22:
                ((zf.x0) obj2).f50779w = false;
                ((zf.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                zf.k1 k1Var = (zf.k1) obj2;
                k1Var.D0 = false;
                k1Var.C0 = 1.0f;
                k1Var.f50580o0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new zf.h1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32554a) {
            case 6:
                ((cv0) this.f32555b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public su0(Object obj, View view, int i9) {
        this.f32554a = i9;
        this.f32555b = obj;
        this.f32556c = view;
    }
}
