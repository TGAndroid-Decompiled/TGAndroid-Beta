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
import org.telegram.ui.jh1;
import org.telegram.ui.ng1;
public final class ml0 extends AnimatorListenerAdapter {
    public final int f28547a;
    public final Object f28548b;
    public final Object f28549c;

    public ml0(int i10, Object obj, Object obj2) {
        this.f28547a = i10;
        this.f28549c = obj;
        this.f28548b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28547a) {
            case 12:
                ((ProfileActivity) this.f28549c).E5 = null;
                return;
            case 18:
                ((r0.m0) this.f28548b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f28547a;
        Object obj = this.f28548b;
        Object obj2 = this.f28549c;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj;
                b10Var.setAlpha(1.0f);
                s4.n0.x0(b10Var);
                nl0 nl0Var = (nl0) obj2;
                nl0Var.f28791c.remove(b10Var);
                nl0Var.f28789a.removeView(b10Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.qq qqVar = (org.telegram.ui.qq) obj2;
                ((nl0) qqVar.d).f28793g.remove((AnimatorSet) obj);
                if (((nl0) qqVar.d).f28793g.isEmpty()) {
                    ((nl0) qqVar.d).f28790b.clear();
                    nl0 nl0Var2 = (nl0) qqVar.d;
                    nl0Var2.d = true;
                    nl0Var2.f28789a.invalidate();
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
                jw0 jw0Var = (jw0) gVar.f2652c;
                jw0Var.f27620f0 = 1.0f;
                jw0Var.S.add((fw0) obj);
                ((jw0) gVar.f2652c).f27612a0.setShader(null);
                ((jw0) gVar.f2652c).f27616c0.setShader(null);
                ((jw0) gVar.f2652c).N();
                super.onAnimationEnd(animator);
                return;
            case 4:
                wx0 wx0Var = (wx0) obj2;
                wx0Var.f32230b = 0.0f;
                wx0Var.invalidate();
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
                ((org.telegram.ui.ey) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) obj2;
                s70Var.removeView((v30) obj);
                s70Var.e = null;
                s70Var.f41012a = null;
                s70Var.f41013b = false;
                return;
            case 9:
                ow0 ow0Var = (ow0) obj2;
                ow0Var.setVisibility(8);
                ow0Var.setX(0.0f);
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
                nf0Var.f28749f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = nf0Var.f28752s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = nf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                nf0Var.h = true;
                nf0Var.f28750n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                nf0Var.f28752s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(nf0Var, nf0Var.E, 0.0f, 1.0f));
                nf0Var.f28752s.setDuration(250L);
                nf0Var.f28752s.setInterpolator(new OvershootInterpolator(1.01f));
                nf0Var.f28752s.addListener(new lf0(nf0Var, 0));
                nf0Var.f28752s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33456z2, photoViewer.f33261d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(bs.f25031g);
                photoViewer.A2.addListener(new org.telegram.ui.bc0(this, 7));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.pw0 pw0Var = (org.telegram.ui.pw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = pw0Var.f40216n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != pw0Var.e) {
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
                        org.telegram.ui.pz0 pz0Var = profileActivity.O;
                        if (pz0Var.u0(pz0Var.f30364k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.f30378r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33651l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.bc0(this, 19));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.E5 = null;
                return;
            case 13:
                org.telegram.ui.z21 z21Var = (org.telegram.ui.z21) obj2;
                if (z21Var.h != null) {
                    z21Var.h = null;
                    z21Var.f43523n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    z21Var.e = 1.0f;
                    z21Var.g();
                    z21Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) obj;
                if (lu0Var != null) {
                    lu0Var.f38917a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f33809s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.sy0(this, 12));
                return;
            case 15:
                ((org.telegram.ui.p51) obj).run();
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) obj2;
                org.telegram.ui.o41 o41Var = z51Var.X0;
                if (o41Var != null) {
                    o41Var.dismiss();
                    z51Var.X0 = null;
                    return;
                }
                return;
            case 16:
                ng1 ng1Var = (ng1) obj2;
                ng1Var.removeView((v30) obj);
                ng1Var.e = null;
                ng1Var.f39435a = null;
                ng1Var.f39436b = false;
                UsersSelectActivity usersSelectActivity = ng1Var.f39438f;
                usersSelectActivity.f33943c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f33943c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                jh1 jh1Var = (jh1) obj2;
                jh1Var.f38183e0.setScaleX(1.15f);
                jh1Var.f38183e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jh1Var.f38183e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                jh1Var.f38183e0.setVisibility(8);
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
                rg.a2 a2Var = (rg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f45278r0.b(a2Var.f45285y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.f45286z0 = 1.0f;
                return;
            case 21:
                ((sg.y0) obj2).f46508w = false;
                ((sg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                sg.m1 m1Var = (sg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f46337s0.invalidate();
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
                n9Var.f9525b = null;
                n9Var.f9526c = false;
                ((yg.h) n9Var.f9528n).f50148b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28547a) {
            case 9:
                ((ow0) this.f28548b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f28548b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ml0(Object obj, View view, int i10) {
        this.f28547a = i10;
        this.f28548b = obj;
        this.f28549c = view;
    }

    public ml0(nl0 nl0Var, b10 b10Var, s4.n0 n0Var) {
        this.f28547a = 0;
        this.f28549c = nl0Var;
        this.f28548b = b10Var;
    }
}
