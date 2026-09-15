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
import org.telegram.ui.ti1;
import org.telegram.ui.xh1;
public final class pk0 extends AnimatorListenerAdapter {
    public final int f27073a;
    public final Object f27074b;
    public final Object f27075c;

    public pk0(int i10, Object obj, Object obj2) {
        this.f27073a = i10;
        this.f27075c = obj;
        this.f27074b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27073a) {
            case 11:
                ((ProfileActivity) this.f27075c).C5 = null;
                return;
            case 12:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) this.f27075c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.f27074b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, e31Var.e[0], iArr[0]), i0.a.d(floatValue, e31Var.e[1], iArr[1]), i0.a.d(floatValue, e31Var.e[2], iArr[2]), i0.a.d(floatValue, e31Var.e[3], iArr[3])}, 0, e31Var.e, 0, 4);
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
        int i10 = this.f27073a;
        Object obj = this.f27074b;
        Object obj2 = this.f27075c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.br brVar = (org.telegram.ui.br) obj2;
                ((qk0) brVar.d).f27377g.remove((AnimatorSet) obj);
                if (((qk0) brVar.d).f27377g.isEmpty()) {
                    ((qk0) brVar.d).f27374b.clear();
                    qk0 qk0Var = (qk0) brVar.d;
                    qk0Var.d = true;
                    qk0Var.f27373a.invalidate();
                    return;
                }
                return;
            case 1:
                vo0 vo0Var = (vo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(vo0Var.B);
                } catch (Exception unused) {
                }
                ny nyVar = vo0Var.C;
                if (nyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nyVar);
                    return;
                }
                return;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                pv0 pv0Var = (pv0) gVar.f1885c;
                pv0Var.f27167f0 = 1.0f;
                pv0Var.S.add((lv0) obj);
                ((pv0) gVar.f1885c).f27159a0.setShader(null);
                ((pv0) gVar.f1885c).f27163c0.setShader(null);
                ((pv0) gVar.f1885c).N();
                super.onAnimationEnd(animator);
                return;
            case 3:
                dx0 dx0Var = (dx0) obj2;
                dx0Var.f23408b = 0.0f;
                dx0Var.invalidate();
                ((im0) obj).invalidate();
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
                ((org.telegram.ui.uy) obj2).R3 = null;
                return;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((m30) obj);
                k80Var.e = null;
                k80Var.f35053a = null;
                k80Var.f35054b = false;
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
                ue0Var.f28384f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ue0Var.f28387s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ue0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ue0Var.h = true;
                ue0Var.f28385n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ue0Var.f28387s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ue0Var, ue0Var.E, 0.0f, 1.0f));
                ue0Var.f28387s.setDuration(250L);
                ue0Var.f28387s.setInterpolator(new OvershootInterpolator(1.01f));
                ue0Var.f28387s.addListener(new se0(ue0Var, 0));
                ue0Var.f28387s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f31125z2, photoViewer.f30931d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(qr.f27424g);
                photoViewer.A2.addListener(new org.telegram.ui.cr0(this, 1));
                photoViewer.A2.start();
                return;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f34997n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != jx0Var.e) {
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
                        org.telegram.ui.l01 l01Var = profileActivity.O;
                        if (l01Var.s0(l01Var.f30368k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.f30382r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f31308j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.cr0(this, 13));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                return;
            case 12:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, e31Var.e, 0, 4);
                }
                e31Var.f33203n = null;
                e31Var.f33205s = null;
                cc0 cc0Var = e31Var.h;
                cc0Var.K = 1.0f;
                cc0Var.i();
                e31Var.h.s(1.0f);
                return;
            case 13:
                org.telegram.ui.l41 l41Var = (org.telegram.ui.l41) obj2;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.f35332n.unlock();
                    ((org.telegram.ui.vx) obj).onTransitionAnimationEnd(true, false);
                    l41Var.e = 1.0f;
                    l41Var.g();
                    l41Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) obj;
                if (dv0Var != null) {
                    dv0Var.f33134a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f31476s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.e01(this, 11));
                return;
            case 15:
                ((org.telegram.ui.w61) obj).run();
                org.telegram.ui.g71 g71Var = (org.telegram.ui.g71) obj2;
                org.telegram.ui.v51 v51Var = g71Var.X0;
                if (v51Var != null) {
                    v51Var.dismiss();
                    g71Var.X0 = null;
                    return;
                }
                return;
            case 16:
                xh1 xh1Var = (xh1) obj2;
                xh1Var.removeView((m30) obj);
                xh1Var.e = null;
                xh1Var.f39624a = null;
                xh1Var.f39625b = false;
                UsersSelectActivity usersSelectActivity = xh1Var.f39627f;
                usersSelectActivity.f31610c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f31610c.setHintVisible(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ti1 ti1Var = (ti1) obj2;
                ti1Var.f37704e0.setScaleX(1.15f);
                ti1Var.f37704e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ti1Var.f37704e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ti1Var.f37704e0.setVisibility(8);
                return;
            case 18:
                qg.d2 d2Var = (qg.d2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d2Var.f41332r0.b(d2Var.f41339y0, false);
                }
                d2Var.setRotationY(0.0f);
                d2Var.f41340z0 = 1.0f;
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f41878a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ((rg.x0) obj2).f42543w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.f42361s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 22:
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f4603b = null;
                eaVar.f4604c = false;
                ((xg.i) eaVar.f4606n).f45773b.setAllowDrawCursor(true);
                return;
            default:
                yh.s8 s8Var = (yh.s8) obj2;
                s8Var.f47800b.remove((yh.r8) obj);
                s8Var.a1();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27073a) {
            case 8:
                ((uv0) this.f27074b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pk0(Object obj, View view, int i10) {
        this.f27073a = i10;
        this.f27074b = obj;
        this.f27075c = view;
    }
}
