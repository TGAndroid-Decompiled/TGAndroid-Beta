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
import org.telegram.ui.bi1;
import org.telegram.ui.xi1;
public final class am0 extends AnimatorListenerAdapter {
    public final int f24432a;
    public final Object f24433b;
    public final Object f24434c;

    public am0(int i10, Object obj, Object obj2) {
        this.f24432a = i10;
        this.f24434c = obj;
        this.f24433b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24432a) {
            case 11:
                ((ProfileActivity) this.f24434c).C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.f24434c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f24433b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, g31Var.f37907e[0], iArr[0]), i0.a.d(floatValue, g31Var.f37907e[1], iArr[1]), i0.a.d(floatValue, g31Var.f37907e[2], iArr[2]), i0.a.d(floatValue, g31Var.f37907e[3], iArr[3])}, 0, g31Var.f37907e, 0, 4);
                    return;
                }
                return;
            case 19:
                ((r0.m0) this.f24433b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f24432a;
        Object obj = this.f24433b;
        Object obj2 = this.f24434c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.cr crVar = (org.telegram.ui.cr) obj2;
                ((bm0) crVar.d).f24684g.remove((AnimatorSet) obj);
                if (((bm0) crVar.d).f24684g.isEmpty()) {
                    ((bm0) crVar.d).f24680b.clear();
                    bm0 bm0Var = (bm0) crVar.d;
                    bm0Var.d = true;
                    bm0Var.f24679a.invalidate();
                    return;
                }
                return;
            case 1:
                gq0 gq0Var = (gq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(gq0Var.B);
                } catch (Exception unused) {
                }
                gi0 gi0Var = gq0Var.C;
                if (gi0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(gi0Var);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                yw0 yw0Var = (yw0) gVar.f2126c;
                yw0Var.f33200f0 = 1.0f;
                yw0Var.S.add((uw0) obj);
                ((yw0) gVar.f2126c).f33191a0.setShader(null);
                ((yw0) gVar.f2126c).f33195c0.setShader(null);
                ((yw0) gVar.f2126c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                ly0 ly0Var = (ly0) obj2;
                ly0Var.f28307b = 0.0f;
                ly0Var.invalidate();
                ((un0) obj).invalidate();
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
                ((org.telegram.ui.vy) obj2).Q3 = null;
                return;
            case 7:
                org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) obj2;
                m80Var.removeView((g40) obj);
                m80Var.f39945e = null;
                m80Var.f39942a = null;
                m80Var.f39943b = false;
                return;
            case 8:
                dx0 dx0Var = (dx0) obj2;
                dx0Var.setVisibility(8);
                dx0Var.setX(0.0f);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                zf0 zf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = zf0Var.f33352e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zf0Var.f33353f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = zf0Var.f33356s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = zf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                zf0Var.h = true;
                zf0Var.f33354n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                zf0Var.f33356s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zf0Var, zf0Var.E, 0.0f, 1.0f));
                zf0Var.f33356s.setDuration(250L);
                zf0Var.f33356s.setInterpolator(new OvershootInterpolator(1.01f));
                zf0Var.f33356s.addListener(new xf0(zf0Var, 0));
                zf0Var.f33356s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33932z2, photoViewer.f33737d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(js.f27635g);
                photoViewer.A2.addListener(new org.telegram.ui.gp0(this, 2));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.lx0 lx0Var = (org.telegram.ui.lx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f39869n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != lx0Var.f39867e) {
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
                        org.telegram.ui.m01 m01Var = profileActivity.O;
                        if (m01Var.s0(m01Var.f26933k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f26947r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f34121j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.gp0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, g31Var.f37907e, 0, 4);
                }
                g31Var.f37909n = null;
                g31Var.f37911s = null;
                gd0 gd0Var = g31Var.h;
                gd0Var.K = 1.0f;
                gd0Var.i();
                g31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.n41 n41Var = (org.telegram.ui.n41) obj2;
                if (n41Var.h != null) {
                    n41Var.h = null;
                    n41Var.f40209n.unlock();
                    ((org.telegram.ui.wx) obj).onTransitionAnimationEnd(true, false);
                    n41Var.f40207e = 1.0f;
                    n41Var.g();
                    n41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.gv0 gv0Var = (org.telegram.ui.gv0) obj;
                if (gv0Var != null) {
                    gv0Var.f38147a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f34292s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.pz0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.d71) obj).run();
                org.telegram.ui.n71 n71Var = (org.telegram.ui.n71) obj2;
                org.telegram.ui.c61 c61Var = n71Var.X0;
                if (c61Var != null) {
                    c61Var.dismiss();
                    n71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                bi1 bi1Var = (bi1) obj2;
                bi1Var.removeView((g40) obj);
                bi1Var.f36184e = null;
                bi1Var.f36181a = null;
                bi1Var.f36182b = false;
                UsersSelectActivity usersSelectActivity = bi1Var.f36185f;
                usersSelectActivity.f34433c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34433c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                xi1 xi1Var = (xi1) obj2;
                xi1Var.f43995e0.setScaleX(1.15f);
                xi1Var.f43995e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xi1Var.f43995e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                xi1Var.f43995e0.setVisibility(8);
                return;
            case 18:
                qg.b2 b2Var = (qg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f46138r0.b(b2Var.f46145y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f46146z0 = 1.0f;
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f47028a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                ((rg.y0) obj2).f47750w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                rg.l1 l1Var = (rg.l1) obj2;
                l1Var.H0 = false;
                l1Var.G0 = 1.0f;
                l1Var.f47560s0.invalidate();
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
                baVar.removeView((g40) obj);
                baVar.h.clear();
                baVar.f4795b = null;
                baVar.f4796c = false;
                ((xg.i) baVar.f4799n).f51380b.setAllowDrawCursor(true);
                return;
            default:
                yh.k8 k8Var = (yh.k8) obj2;
                k8Var.f53030b.remove((yh.j8) obj);
                k8Var.c1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24432a) {
            case 8:
                ((dx0) this.f24433b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f24433b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public am0(Object obj, View view, int i10) {
        this.f24432a = i10;
        this.f24433b = obj;
        this.f24434c = view;
    }
}
