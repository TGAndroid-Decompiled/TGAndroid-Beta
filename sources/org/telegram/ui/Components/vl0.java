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
import org.telegram.ui.ui1;
import org.telegram.ui.yh1;
public final class vl0 extends AnimatorListenerAdapter {
    public final int f31918a;
    public final Object f31919b;
    public final Object f31920c;

    public vl0(int i10, Object obj, Object obj2) {
        this.f31918a = i10;
        this.f31920c = obj;
        this.f31919b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31918a) {
            case 11:
                ((ProfileActivity) this.f31920c).C5 = null;
                return;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) this.f31920c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f31919b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, d31Var.f36919e[0], iArr[0]), i0.a.d(floatValue, d31Var.f36919e[1], iArr[1]), i0.a.d(floatValue, d31Var.f36919e[2], iArr[2]), i0.a.d(floatValue, d31Var.f36919e[3], iArr[3])}, 0, d31Var.f36919e, 0, 4);
                    return;
                }
                return;
            case 19:
                ((r0.m0) this.f31919b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f31918a;
        Object obj = this.f31919b;
        Object obj2 = this.f31920c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj2;
                ((wl0) zqVar.d).f32734g.remove((AnimatorSet) obj);
                if (((wl0) zqVar.d).f32734g.isEmpty()) {
                    ((wl0) zqVar.d).f32730b.clear();
                    wl0 wl0Var = (wl0) zqVar.d;
                    wl0Var.d = true;
                    wl0Var.f32729a.invalidate();
                    return;
                }
                return;
            case 1:
                bq0 bq0Var = (bq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(bq0Var.B);
                } catch (Exception unused) {
                }
                ei0 ei0Var = bq0Var.C;
                if (ei0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ei0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                tw0 tw0Var = (tw0) gVar.f2128c;
                tw0Var.f31371f0 = 1.0f;
                tw0Var.S.add((pw0) obj);
                ((tw0) gVar.f2128c).f31362a0.setShader(null);
                ((tw0) gVar.f2128c).f31366c0.setShader(null);
                ((tw0) gVar.f2128c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                gy0 gy0Var = (gy0) obj2;
                gy0Var.f26896b = 0.0f;
                gy0Var.invalidate();
                ((pn0) obj).invalidate();
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
                ((org.telegram.ui.sy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((e40) obj);
                j80Var.f38974e = null;
                j80Var.f38971a = null;
                j80Var.f38972b = false;
                return;
            case 8:
                yw0 yw0Var = (yw0) obj2;
                yw0Var.setVisibility(8);
                yw0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                wf0 wf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = wf0Var.f32684e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wf0Var.f32685f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = wf0Var.f32688s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = wf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                wf0Var.h = true;
                wf0Var.f32686n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                wf0Var.f32688s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wf0Var, wf0Var.E, 0.0f, 1.0f));
                wf0Var.f32688s.setDuration(250L);
                wf0Var.f32688s.setInterpolator(new OvershootInterpolator(1.01f));
                wf0Var.f32688s.addListener(new uf0(wf0Var, 0));
                wf0Var.f32688s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f34155z2, photoViewer.f33960d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(is.f27501g);
                photoViewer.A2.addListener(new org.telegram.ui.dp0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.ix0 ix0Var = (org.telegram.ui.ix0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f38833n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != ix0Var.f38831e) {
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
                        org.telegram.ui.j01 j01Var = profileActivity.O;
                        if (j01Var.s0(j01Var.f25512k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f25526r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34344j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.dp0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, d31Var.f36919e, 0, 4);
                }
                d31Var.f36921n = null;
                d31Var.f36923s = null;
                cd0 cd0Var = d31Var.h;
                cd0Var.K = 1.0f;
                cd0Var.i();
                d31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.k41 k41Var = (org.telegram.ui.k41) obj2;
                if (k41Var.h != null) {
                    k41Var.h = null;
                    k41Var.f39231n.unlock();
                    ((org.telegram.ui.tx) obj).onTransitionAnimationEnd(true, false);
                    k41Var.f39229e = 1.0f;
                    k41Var.g();
                    k41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) obj;
                if (dv0Var != null) {
                    dv0Var.f37147a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34515s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mz0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.z61) obj).run();
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) obj2;
                org.telegram.ui.y51 y51Var = j71Var.X0;
                if (y51Var != null) {
                    y51Var.dismiss();
                    j71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                yh1 yh1Var = (yh1) obj2;
                yh1Var.removeView((e40) obj);
                yh1Var.f44470e = null;
                yh1Var.f44467a = null;
                yh1Var.f44468b = false;
                UsersSelectActivity usersSelectActivity = yh1Var.f44471f;
                usersSelectActivity.f34656c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34656c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ui1 ui1Var = (ui1) obj2;
                ui1Var.f42623e0.setScaleX(1.15f);
                ui1Var.f42623e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ui1Var.f42623e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ui1Var.f42623e0.setVisibility(8);
                return;
            case 18:
                qg.a2 a2Var = (qg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f46292r0.b(a2Var.f46299y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f46300z0 = 1.0f;
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f46929a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                ((rg.y0) obj2).f47652w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                rg.l1 l1Var = (rg.l1) obj2;
                l1Var.H0 = false;
                l1Var.G0 = 1.0f;
                l1Var.f47462s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(28, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 23:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((e40) obj);
                baVar.h.clear();
                baVar.f4796b = null;
                baVar.f4797c = false;
                ((xg.i) baVar.f4800n).f51265b.setAllowDrawCursor(true);
                return;
            default:
                yh.k8 k8Var = (yh.k8) obj2;
                k8Var.f52915b.remove((yh.j8) obj);
                k8Var.c1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31918a) {
            case 8:
                ((yw0) this.f31919b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f31919b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vl0(Object obj, View view, int i10) {
        this.f31918a = i10;
        this.f31919b = obj;
        this.f31920c = view;
    }
}
