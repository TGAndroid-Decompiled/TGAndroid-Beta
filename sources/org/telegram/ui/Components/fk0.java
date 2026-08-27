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
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.lh1;
import org.telegram.ui.pg1;

public final class fk0 extends AnimatorListenerAdapter {

    public final int f28398a;

    public final Object f28399b;

    public final Object f28400c;

    public fk0(int i10, Object obj, Object obj2) {
        this.f28398a = i10;
        this.f28400c = obj;
        this.f28399b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28398a) {
            case 11:
                ((ProfileActivity) this.f28400c).f36092y5 = null;
                break;
            case 12:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) this.f28400c;
                super.onAnimationCancel(animator);
                float fFloatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f28399b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.b.d(fFloatValue, y11Var.f44669e[0], iArr[0]), i0.b.d(fFloatValue, y11Var.f44669e[1], iArr[1]), i0.b.d(fFloatValue, y11Var.f44669e[2], iArr[2]), i0.b.d(fFloatValue, y11Var.f44669e[3], iArr[3])}, 0, y11Var.f44669e, 0, 4);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f28398a;
        Object obj = this.f28399b;
        Object obj2 = this.f28400c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.pq pqVar = (org.telegram.ui.pq) obj2;
                ((gk0) pqVar.d).f28742g.remove((AnimatorSet) obj);
                if (((gk0) pqVar.d).f28742g.isEmpty()) {
                    ((gk0) pqVar.d).f28738b.clear();
                    gk0 gk0Var = (gk0) pqVar.d;
                    gk0Var.d = true;
                    gk0Var.f28737a.invalidate();
                }
                break;
            case 1:
                fo0 fo0Var = (fo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(fo0Var.B);
                    break;
                } catch (Exception unused) {
                }
                lg0 lg0Var = fo0Var.C;
                if (lg0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(lg0Var);
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                zu0 zu0Var = (zu0) gVar.f875c;
                zu0Var.f35369b0 = 1.0f;
                zu0Var.O.add((vu0) obj);
                ((zu0) gVar.f875c).T.setShader(null);
                ((zu0) gVar.f875c).V.setShader(null);
                ((zu0) gVar.f875c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                nw0 nw0Var = (nw0) obj2;
                nw0Var.f31044b = 0.0f;
                nw0Var.invalidate();
                ((vl0) obj).invalidate();
                break;
            case 4:
                org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) obj2;
                j3Var.d.setText((String) obj);
                j3Var.d.setTranslationY(0.0f);
                j3Var.d.setAlpha(1.0f);
                break;
            case 5:
                ((org.telegram.ui.Components.voip.j3) obj2).removeView((org.telegram.ui.Components.voip.i3) obj);
                break;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.gy) obj2).N3 = null;
                break;
            case 7:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) obj2;
                s70Var.removeView((a30) obj);
                s70Var.f42541e = null;
                s70Var.f42538a = null;
                s70Var.f42539b = false;
                break;
            case 8:
                ev0 ev0Var = (ev0) obj2;
                ev0Var.setVisibility(8);
                ev0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ge0 ge0Var = photoViewer.f35802y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ge0Var.f28604e;
                ge0Var.f28605f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ge0Var.f28608s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ge0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ge0Var.h = true;
                ge0Var.f28606n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ge0Var.f28608s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ge0Var, ge0Var.A, 0.0f, 1.0f));
                ge0Var.f28608s.setDuration(250L);
                ge0Var.f28608s.setInterpolator(new OvershootInterpolator(1.01f));
                ge0Var.f28608s.addListener(new ee0(ge0Var, 0));
                ge0Var.f28608s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.f35784w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f35775v2, photoViewer.Z3, 0.0f));
                photoViewer.f35784w2.setDuration(85L);
                photoViewer.f35784w2.setInterpolator(er.f28123g);
                photoViewer.f35784w2.addListener(new org.telegram.ui.f50(this, 9));
                photoViewer.f35784w2.start();
                break;
            case 10:
                org.telegram.ui.fw0 fw0Var = (org.telegram.ui.fw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38219n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.Q.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i11);
                    if (childAt != fw0Var.f38217e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.f36092y5 != null) {
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
                        if (hz0Var.s0(hz0Var.f29122g0[0].B)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.K.f29135n0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.f36098z5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f35964f5, 1.0f));
                        profileActivity.f36098z5.setDuration(100L);
                        profileActivity.f36098z5.addListener(new org.telegram.ui.f50(this, 21));
                        profileActivity.f36098z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.f36092y5 = null;
                break;
            case 12:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, y11Var.f44669e, 0, 4);
                }
                y11Var.f44671n = null;
                y11Var.f44673s = null;
                nb0 nb0Var = y11Var.h;
                nb0Var.K = 1.0f;
                nb0Var.i();
                y11Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.f38301n.unlock();
                    ((org.telegram.ui.ix) obj).onTransitionAnimationEnd(true, false);
                    g31Var.f38299e = 1.0f;
                    g31Var.g();
                    g31Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.cu0 cu0Var = (org.telegram.ui.cu0) obj;
                if (cu0Var != null) {
                    cu0Var.f37153a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f36160s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.q51) obj).run();
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj2;
                org.telegram.ui.p41 p41Var = a61Var.T0;
                if (p41Var != null) {
                    p41Var.dismiss();
                    a61Var.T0 = null;
                }
                break;
            case 16:
                pg1 pg1Var = (pg1) obj2;
                pg1Var.removeView((a30) obj);
                pg1Var.f41352e = null;
                pg1Var.f41349a = null;
                pg1Var.f41350b = false;
                UsersSelectActivity usersSelectActivity = pg1Var.f41353f;
                usersSelectActivity.f36290c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.f36290c.setHintVisible(true, true);
                }
                break;
            case 17:
                ((Runnable) obj).run();
                lh1 lh1Var = (lh1) obj2;
                lh1Var.f40090a0.setScaleX(1.15f);
                lh1Var.f40090a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lh1Var.f40090a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                lh1Var.f40090a0.setVisibility(8);
                break;
            case 18:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.f46646a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 19:
                rf.g gVar2 = (rf.g) obj2;
                gVar2.f46955b.clear();
                gVar2.f46955b.add((tf.d) obj);
                break;
            case 20:
                super.onAnimationEnd(animator);
                rf.g gVar3 = (rf.g) obj2;
                gVar3.f46958c.clear();
                gVar3.f46958c.add((tf.b) obj);
                break;
            case 21:
                rh.x1 x1Var = (rh.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.f26189v1.setVisibility(0);
                x1Var.f47578x.p(AndroidUtilities.dp(22.0f));
                x1Var.f47578x.setAlpha(255);
                qg.g gVar4 = x1Var.f47571s;
                gVar4.f46541e = true;
                gVar4.invalidate();
                ((Runnable) obj).run();
                break;
            case 22:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f26354g0 = null;
                break;
            default:
                zf.b2 b2Var = (zf.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f50348n0.b(b2Var.f50355u0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f50356v0 = 1.0f;
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28398a) {
            case 8:
                ((ev0) this.f28399b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public fk0(Object obj, View view, int i10) {
        this.f28398a = i10;
        this.f28399b = obj;
        this.f28400c = view;
    }
}
