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
public final class qk0 extends AnimatorListenerAdapter {
    public final int f27378a;
    public final Object f27379b;
    public final Object f27380c;

    public qk0(int i10, Object obj, Object obj2) {
        this.f27378a = i10;
        this.f27380c = obj;
        this.f27379b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27378a) {
            case 11:
                ((ProfileActivity) this.f27380c).C5 = null;
                return;
            case 12:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) this.f27380c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f27379b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, x21Var.e[0], iArr[0]), i0.a.d(floatValue, x21Var.e[1], iArr[1]), i0.a.d(floatValue, x21Var.e[2], iArr[2]), i0.a.d(floatValue, x21Var.e[3], iArr[3])}, 0, x21Var.e, 0, 4);
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
        int i10 = this.f27378a;
        Object obj = this.f27379b;
        Object obj2 = this.f27380c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.xq xqVar = (org.telegram.ui.xq) obj2;
                ((rk0) xqVar.d).f27661g.remove((AnimatorSet) obj);
                if (((rk0) xqVar.d).f27661g.isEmpty()) {
                    ((rk0) xqVar.d).f27658b.clear();
                    rk0 rk0Var = (rk0) xqVar.d;
                    rk0Var.d = true;
                    rk0Var.f27657a.invalidate();
                    return;
                }
                return;
            case 1:
                vo0 vo0Var = (vo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(vo0Var.B);
                } catch (Exception unused) {
                }
                oy oyVar = vo0Var.C;
                if (oyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oyVar);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                pv0 pv0Var = (pv0) gVar.f1882c;
                pv0Var.f27151f0 = 1.0f;
                pv0Var.S.add((lv0) obj);
                ((pv0) gVar.f1882c).f27143a0.setShader(null);
                ((pv0) gVar.f1882c).f27147c0.setShader(null);
                ((pv0) gVar.f1882c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.f23118b = 0.0f;
                cx0Var.invalidate();
                ((jm0) obj).invalidate();
                return;
            case 4:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                return;
            case 5:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                return;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.ry) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) obj2;
                h80Var.removeView((n30) obj);
                h80Var.e = null;
                h80Var.f33772a = null;
                h80Var.f33773b = false;
                return;
            case 8:
                uv0 uv0Var = (uv0) obj2;
                uv0Var.setVisibility(8);
                uv0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ue0 ue0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ue0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ue0Var.f28470f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ue0Var.f28473s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ue0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ue0Var.h = true;
                ue0Var.f28471n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ue0Var.f28473s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ue0Var, ue0Var.E, 0.0f, 1.0f));
                ue0Var.f28473s.setDuration(250L);
                ue0Var.f28473s.setInterpolator(new OvershootInterpolator(1.01f));
                ue0Var.f28473s.addListener(new se0(ue0Var, 0));
                ue0Var.f28473s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31097z2, photoViewer.f30903d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(rr.f27702g);
                photoViewer.A2.addListener(new org.telegram.ui.wq0(this, 1));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.cx0 cx0Var2 = (org.telegram.ui.cx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var2.f32435n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != cx0Var2.e) {
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
                        if (e01Var.s0(e01Var.f30426k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f30440r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31279j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.wq0(this, 13));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, x21Var.e, 0, 4);
                }
                x21Var.f39173n = null;
                x21Var.f39175s = null;
                bc0 bc0Var = x21Var.h;
                bc0Var.K = 1.0f;
                bc0Var.i();
                x21Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.e41 e41Var = (org.telegram.ui.e41) obj2;
                if (e41Var.h != null) {
                    e41Var.h = null;
                    e41Var.f32798n.unlock();
                    ((org.telegram.ui.sx) obj).onTransitionAnimationEnd(true, false);
                    e41Var.e = 1.0f;
                    e41Var.g();
                    e41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.wu0 wu0Var = (org.telegram.ui.wu0) obj;
                if (wu0Var != null) {
                    wu0Var.f39094a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31447s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xz0(this, 11));
                return;
            case 15:
                ((org.telegram.ui.p61) obj).run();
                org.telegram.ui.z61 z61Var = (org.telegram.ui.z61) obj2;
                org.telegram.ui.o51 o51Var = z61Var.X0;
                if (o51Var != null) {
                    o51Var.dismiss();
                    z61Var.X0 = null;
                    return;
                }
                return;
            case 16:
                qh1 qh1Var = (qh1) obj2;
                qh1Var.removeView((n30) obj);
                qh1Var.e = null;
                qh1Var.f36451a = null;
                qh1Var.f36452b = false;
                UsersSelectActivity usersSelectActivity = qh1Var.f36454f;
                usersSelectActivity.f31581c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31581c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                mi1 mi1Var = (mi1) obj2;
                mi1Var.f35312e0.setScaleX(1.15f);
                mi1Var.f35312e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mi1Var.f35312e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mi1Var.f35312e0.setVisibility(8);
                return;
            case 18:
                qg.d2 d2Var = (qg.d2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d2Var.f41284r0.b(d2Var.f41291y0, false);
                }
                d2Var.setRotationY(0.0f);
                d2Var.f41292z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f41830a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42494w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42312s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((n30) obj);
                baVar.h.clear();
                baVar.f4417b = null;
                baVar.f4418c = false;
                ((xg.i) baVar.f4420n).f45723b.setAllowDrawCursor(true);
                return;
            default:
                yh.q8 q8Var = (yh.q8) obj2;
                q8Var.f47616b.remove((yh.p8) obj);
                q8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27378a) {
            case 8:
                ((uv0) this.f27379b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public qk0(Object obj, View view, int i10) {
        this.f27378a = i10;
        this.f27379b = obj;
        this.f27380c = view;
    }
}
