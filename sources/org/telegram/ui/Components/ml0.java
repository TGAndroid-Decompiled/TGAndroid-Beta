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
import org.telegram.ui.hh1;
import org.telegram.ui.lg1;
public final class ml0 extends AnimatorListenerAdapter {
    public final int f28560a;
    public final Object f28561b;
    public final Object f28562c;

    public ml0(int i10, Object obj, Object obj2) {
        this.f28560a = i10;
        this.f28562c = obj;
        this.f28561b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28560a) {
            case 12:
                ((ProfileActivity) this.f28562c).E5 = null;
                return;
            case 18:
                ((r0.m0) this.f28561b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f28560a;
        Object obj = this.f28561b;
        Object obj2 = this.f28562c;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj;
                b10Var.setAlpha(1.0f);
                s4.n0.x0(b10Var);
                nl0 nl0Var = (nl0) obj2;
                nl0Var.f28807c.remove(b10Var);
                nl0Var.f28805a.removeView(b10Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.oq oqVar = (org.telegram.ui.oq) obj2;
                ((nl0) oqVar.d).f28809g.remove((AnimatorSet) obj);
                if (((nl0) oqVar.d).f28809g.isEmpty()) {
                    ((nl0) oqVar.d).f28806b.clear();
                    nl0 nl0Var2 = (nl0) oqVar.d;
                    nl0Var2.d = true;
                    nl0Var2.f28805a.invalidate();
                    return;
                }
                return;
            case 2:
                rp0 rp0Var = (rp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(rp0Var.B);
                } catch (Exception unused) {
                }
                go0 go0Var = rp0Var.C;
                if (go0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(go0Var);
                    return;
                }
                return;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                kw0 kw0Var = (kw0) gVar.f2648c;
                kw0Var.f28002f0 = 1.0f;
                kw0Var.S.add((gw0) obj);
                ((kw0) gVar.f2648c).f27994a0.setShader(null);
                ((kw0) gVar.f2648c).f27998c0.setShader(null);
                ((kw0) gVar.f2648c).N();
                super.onAnimationEnd(animator);
                return;
            case 4:
                xx0 xx0Var = (xx0) obj2;
                xx0Var.f32468b = 0.0f;
                xx0Var.invalidate();
                ((gn0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) obj2;
                i3Var.d.setText((String) obj);
                i3Var.d.setTranslationY(0.0f);
                i3Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.i3) obj2).removeView((org.telegram.ui.Components.voip.h3) obj);
                return;
            case 7:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.cy) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.q70 q70Var = (org.telegram.ui.q70) obj2;
                q70Var.removeView((v30) obj);
                q70Var.e = null;
                q70Var.f40488a = null;
                q70Var.f40489b = false;
                return;
            case 9:
                pw0 pw0Var = (pw0) obj2;
                pw0Var.setVisibility(8);
                pw0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                nf0 nf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = nf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf0Var.f28765f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = nf0Var.f28768s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = nf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                nf0Var.h = true;
                nf0Var.f28766n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                nf0Var.f28768s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(nf0Var, nf0Var.E, 0.0f, 1.0f));
                nf0Var.f28768s.setDuration(250L);
                nf0Var.f28768s.setInterpolator(new OvershootInterpolator(1.01f));
                nf0Var.f28768s.addListener(new lf0(nf0Var, 0));
                nf0Var.f28768s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33462z2, photoViewer.f33267d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(bs.f25013g);
                photoViewer.A2.addListener(new org.telegram.ui.zb0(this, 7));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.nw0 nw0Var = (org.telegram.ui.nw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39694n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != nw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.E5 != null) {
                    if (profileActivity.H5) {
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        if (profileActivity.O0) {
                            profileActivity.T0.setVisibility(8);
                        }
                        profileActivity.U0.setVisibility(8);
                    } else {
                        org.telegram.ui.nz0 nz0Var = profileActivity.O;
                        if (nz0Var.u0(nz0Var.f30708k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f30722r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33657l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.zb0(this, 19));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.E5 = null;
                return;
            case 13:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj2;
                if (x21Var.h != null) {
                    x21Var.h = null;
                    x21Var.f42997n.unlock();
                    ((org.telegram.ui.dx) obj).onTransitionAnimationEnd(true, false);
                    x21Var.e = 1.0f;
                    x21Var.g();
                    x21Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) obj;
                if (ju0Var != null) {
                    ju0Var.f38344a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f33817s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.qy0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.n51) obj).run();
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) obj2;
                org.telegram.ui.m41 m41Var = x51Var.X0;
                if (m41Var != null) {
                    m41Var.dismiss();
                    x51Var.X0 = null;
                    return;
                }
                return;
            case 16:
                lg1 lg1Var = (lg1) obj2;
                lg1Var.removeView((v30) obj);
                lg1Var.e = null;
                lg1Var.f38914a = null;
                lg1Var.f38915b = false;
                UsersSelectActivity usersSelectActivity = lg1Var.f38917f;
                usersSelectActivity.f33951c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f33951c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                hh1 hh1Var = (hh1) obj2;
                hh1Var.f37635e0.setScaleX(1.15f);
                hh1Var.f37635e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hh1Var.f37635e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                hh1Var.f37635e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f44851a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                rg.b2 b2Var = (rg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f45289r0.b(b2Var.f45296y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f45297z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f46510w = false;
                ((sg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46339s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new sg.i1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((v30) obj);
                n9Var.h.clear();
                n9Var.f9524b = null;
                n9Var.f9525c = false;
                ((yg.h) n9Var.f9527n).f50149b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28560a) {
            case 9:
                ((pw0) this.f28561b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f28561b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ml0(Object obj, View view, int i10) {
        this.f28560a = i10;
        this.f28561b = obj;
        this.f28562c = view;
    }

    public ml0(nl0 nl0Var, b10 b10Var, s4.n0 n0Var) {
        this.f28560a = 0;
        this.f28562c = nl0Var;
        this.f28561b = b10Var;
    }
}
